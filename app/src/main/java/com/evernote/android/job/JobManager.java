package com.evernote.android.job;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;

import com.evernote.android.job.util.JobCat;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class JobManager {
   private static final JobCat CAT = new JobCat("JobManager");
   @SuppressLint({"StaticFieldLeak"})
   private static volatile JobManager instance;
   private final Context mContext;
   private final JobCreatorHolder mJobCreatorHolder;
   private final JobStorage mJobStorage;
   private final JobExecutor mJobExecutor;

   private JobManager(Context context) {
      this.mContext = context;
      this.mJobCreatorHolder = new JobCreatorHolder();
      this.mJobStorage = new JobStorage(context);
      this.mJobExecutor = new JobExecutor();
      if (!JobConfig.isSkipJobRescheduled()) {
         JobRescheduleService.startService(this.mContext);
      }
   }

   public static JobManager instance() {
      Throwable var10000;
      boolean var10001;
      label151: {
         if (instance == null) {
            synchronized(JobManager.class){}

            try {
               if (instance == null) {
                  IllegalStateException var13 = new IllegalStateException("You need to call create() at least once to create the singleton");
                  throw var13;
               }
            } catch (Throwable var12) {
               var10000 = var12;
               var10001 = false;
               break label151;
            }

            try {
               ;
            } catch (Throwable var11) {
               var10000 = var11;
               var10001 = false;
               break label151;
            }
         }

         return instance;
      }

      while(true) {
         Throwable var0 = var10000;

         try {
            throw var0;
         } catch (Throwable var10) {
            var10000 = var10;
            var10001 = false;
            continue;
         }
      }
   }

   public static JobManager create(Context context) {
      if (instance == null) {
         synchronized(JobManager.class){}

         Throwable var10000;
         boolean var10001;
         label670: {
            label676: {
               try {
                  if (instance != null) {
                     break label676;
                  }

                  com.evernote.android.job.a.f.a(context, "Context cannot be null");
               } catch (Throwable var71) {
                  var10000 = var71;
                  var10001 = false;
                  break label670;
               }

               Context var1 = context;

               try {
                  if (context.getApplicationContext() != null) {
                     var1 = context.getApplicationContext();
                  }
               } catch (Throwable var70) {
                  var10000 = var70;
                  var10001 = false;
                  break label670;
               }

               try {
                  JobApi var74 = JobApi.c(var1);
                  if (var74 == JobApi.e && !var74.a(var1)) {
                     j var76 = new j("All APIs are disabled, cannot schedule any job");
                     throw var76;
                  }
               } catch (Throwable var73) {
                  var10000 = var73;
                  var10001 = false;
                  break label670;
               }

               try {
                  JobManager var75 = new JobManager(var1);
                  instance = var75;
                  if (!com.evernote.android.job.a.g.b(var1)) {
                     CAT.c("No wake lock permission");
                  }
               } catch (Throwable var69) {
                  var10000 = var69;
                  var10001 = false;
                  break label670;
               }

               try {
                  if (!com.evernote.android.job.a.g.a(var1)) {
                     CAT.c("No boot permission");
                  }
               } catch (Throwable var72) {
                  var10000 = var72;
                  var10001 = false;
                  break label670;
               }

               try {
                  sendAddJobCreatorIntent(var1);
               } catch (Throwable var68) {
                  var10000 = var68;
                  var10001 = false;
                  break label670;
               }
            }

            label646:
            try {
               return instance;
            } catch (Throwable var67) {
               var10000 = var67;
               var10001 = false;
               break label646;
            }
         }

         while(true) {
            Throwable var77 = var10000;

            try {
               throw var77;
            } catch (Throwable var66) {
               var10000 = var66;
               var10001 = false;
               continue;
            }
         }
      } else {
         return instance;
      }
   }

   private void scheduleWithApi(JobRequest request, JobApi jobApi, boolean periodic, boolean flexSupport) {
      JobProxy proxy = this.getJobProxy(jobApi);
      if (periodic) {
         if (flexSupport) {
            proxy.plantPeriodicFlexsupport(request);
         } else {
            proxy.plantPeriodic(request);
         }
      } else {
         proxy.plantOneOff(request);
      }
   }

   private boolean cancelInner(Job job) {
      if (job != null && job.cancel(true)) {
         CAT.i("Cancel running %s", job);
         return true;
      } else {
         return false;
      }
   }

   private static void sendAddJobCreatorIntent(Context context) {
      String var1 = context.getPackageName();
      Intent var2 = new Intent("com.evernote.android.job.ADD_JOB_CREATOR");
      var2.setPackage(var1);

      List var6;
      try {
         var6 = context.getPackageManager().queryBroadcastReceivers(var2, 0);
      } catch (Exception var5) {
         var6 = Collections.emptyList();
      }

      Iterator var7 = var6.iterator();

      while(var7.hasNext()) {
         ActivityInfo var3 = ((ResolveInfo)var7.next()).activityInfo;
         if (var3 != null && !var3.exported && var1.equals(var3.packageName) && !TextUtils.isEmpty(var3.name)) {
            try {
               ((JobCreator.a)Class.forName(var3.name).newInstance()).a(context, instance);
            } catch (Exception var4) {
            }
         }
      }

   }

   private boolean cancelInner(JobRequest request) {
      if (request != null) {
         CAT.i("Found pending job %s, canceling", request);
         this.getJobProxy(request.getJobApi()).cancel(request.getJobId());
         this.getJobStorage().remove(request);
         request.setScheduledAt(0L);
         return true;
      } else {
         return false;
      }
   }

   private synchronized int cancelAllInner(String tag) {
      int canceled = 0;

      Throwable var10000;
      label459: {
         Iterator var3;
         boolean var10001;
         try {
            var3 = this.getAllJobRequests(tag, true, false).iterator();
         } catch (Throwable var45) {
            var10000 = var45;
            var10001 = false;
            break label459;
         }

         label458:
         while(true) {
            label464: {
               try {
                  while(var3.hasNext()) {
                     if (this.cancelInner((JobRequest)var3.next())) {
                        break label464;
                     }
                  }
               } catch (Throwable var46) {
                  var10000 = var46;
                  var10001 = false;
                  break;
               }

               Set var47;
               label465: {
                  try {
                     if (TextUtils.isEmpty(tag)) {
                        var47 = this.c();
                        break label465;
                     }
                  } catch (Throwable var44) {
                     var10000 = var44;
                     var10001 = false;
                     break;
                  }

                  try {
                     var47 = this.getAllJobsForTag(tag);
                  } catch (Throwable var43) {
                     var10000 = var43;
                     var10001 = false;
                     break;
                  }
               }

               Iterator var48;
               try {
                  var48 = var47.iterator();
               } catch (Throwable var42) {
                  var10000 = var42;
                  var10001 = false;
                  break;
               }

               while(true) {
                  boolean var4;
                  try {
                     if (!var48.hasNext()) {
                        return canceled;
                     }

                     var4 = this.cancelInner((Job)var48.next());
                  } catch (Throwable var41) {
                     var10000 = var41;
                     var10001 = false;
                     break label458;
                  }

                  if (var4) {
                     ++canceled;
                  }
               }
            }

            ++canceled;
         }
      }

      Throwable var49 = var10000;
      throw var49;
   }

   public Job getJob(int var1) {
      return this.mJobExecutor.getJob(var1);
   }

   JobProxy getJobProxy(JobApi var1) {
      return var1.b(this.mContext);
   }

   JobRequest getJobRequest(int jobId, boolean includeStarted) {
      JobRequest var3 = this.mJobStorage.a(jobId);
      JobRequest var4 = var3;
      if (!includeStarted) {
         var4 = var3;
         if (var3 != null) {
            var4 = var3;
            if (var3.z()) {
               var4 = null;
            }
         }
      }

      return var4;
   }

   public Set<Job> getAllJobsForTag(String tag) {
      return this.mJobExecutor.getAllJobsForTag(tag);
   }

   Set<JobRequest> getAllJobRequests(String tag, boolean includeStarted, boolean cleanUpTransient) {
      Set var6 = this.mJobStorage.a(tag, includeStarted);
      if (cleanUpTransient) {
         Iterator var4 = var6.iterator();

         while(var4.hasNext()) {
            JobRequest var5 = (JobRequest)var4.next();
            if (var5.B() && !var5.getJobApi().b(this.mContext).isPlatformJobScheduled(var5)) {
               this.mJobStorage.remove(var5);
               var4.remove();
            }
         }
      }

      return var6;
   }

   public void addJobCreator(JobCreator var1) {
      this.mJobCreatorHolder.addJobCreator(var1);
   }

   public void a(JobRequest param1) {
      // $FF: Couldn't be decompiled
   }

   public int b(String var1) {
      return this.cancelAllInner(var1);
   }

   public Set<JobRequest> getAllJobRequests() {
      return this.getAllJobRequests((String)null, false, true);
   }

   public boolean b(int var1) {
      boolean var2 = this.cancelInner(this.getJobRequest(var1, true));
      boolean var3 = this.cancelInner(this.getJob(var1));
      JobProxy.a.a(this.mContext, var1);
      return var2 | var3;
   }

   public Set c() {
      return this.mJobExecutor.a();
   }

   public int cancelAll() {
      return this.cancelAllInner((String)null);
   }

   JobStorage getJobStorage() {
      return this.mJobStorage;
   }

   JobExecutor getJobExecutor() {
      return this.mJobExecutor;
   }

   JobCreatorHolder getJobCreatorHolder() {
      return this.mJobCreatorHolder;
   }

   Context getContext() {
      return this.mContext;
   }
}
