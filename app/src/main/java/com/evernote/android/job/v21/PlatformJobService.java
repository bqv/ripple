package com.evernote.android.job.v21;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.os.Bundle;
import android.os.Build.VERSION;
import com.evernote.android.job.Job;
import com.evernote.android.job.JobConfig;
import com.evernote.android.job.JobManager;
import com.evernote.android.job.JobProxy;
import com.evernote.android.job.JobRequest;
import com.evernote.android.job.util.JobCat;

@TargetApi(21)
public class PlatformJobService extends JobService {
   private static final JobCat a = new JobCat("PlatformJobService");

   @TargetApi(26)
   private Bundle a(JobParameters var1) {
      return VERSION.SDK_INT >= 26 ? var1.getTransientExtras() : Bundle.EMPTY;
   }

   public boolean onStartJob(final JobParameters var1) {
      JobConfig.h().execute(new Runnable() {
         public void run() {
            label577: {
               Throwable var10000;
               label579: {
                  JobProxy.a var2;
                  JobRequest var3;
                  boolean var10001;
                  try {
                     int var1x = var1.getJobId();
                     var2 = new JobProxy.a(PlatformJobService.this, PlatformJobService.a, var1x);
                     var3 = var2.a(true, false);
                  } catch (Throwable var61) {
                     var10000 = var61;
                     var10001 = false;
                     break label579;
                  }

                  if (var3 == null) {
                     break label577;
                  }

                  JobCat var4;
                  Object[] var5;
                  String var62;
                  label580: {
                     label581: {
                        label582: {
                           try {
                              if (!var3.B()) {
                                 break label581;
                              }

                              if (!b.b(PlatformJobService.this, var3)) {
                                 break label582;
                              }

                              if (VERSION.SDK_INT < 26) {
                                 break label577;
                              }

                              var4 = PlatformJobService.a;
                           } catch (Throwable var60) {
                              var10000 = var60;
                              var10001 = false;
                              break label579;
                           }

                           var62 = "PendingIntent for transient bundle is not null although running on O, using compat mode, request %s";

                           try {
                              var5 = new Object[1];
                           } catch (Throwable var58) {
                              var10000 = var58;
                              var10001 = false;
                              break label579;
                           }

                           var5[0] = var3;
                           break label580;
                        }

                        try {
                           if (VERSION.SDK_INT >= 26) {
                              break label581;
                           }

                           var4 = PlatformJobService.a;
                        } catch (Throwable var59) {
                           var10000 = var59;
                           var10001 = false;
                           break label579;
                        }

                        var62 = "PendingIntent for transient job %s expired";

                        try {
                           var5 = new Object[1];
                        } catch (Throwable var57) {
                           var10000 = var57;
                           var10001 = false;
                           break label579;
                        }

                        var5[0] = var3;
                        break label580;
                     }

                     try {
                        var2.h(var3);
                        var2.a(var3, PlatformJobService.this.a(var1));
                     } catch (Throwable var55) {
                        var10000 = var55;
                        var10001 = false;
                        break label579;
                     }

                     PlatformJobService.this.jobFinished(var1, false);
                     return;
                  }

                  label549:
                  try {
                     var4.b(var62, var5);
                     break label577;
                  } catch (Throwable var56) {
                     var10000 = var56;
                     var10001 = false;
                     break label549;
                  }
               }

               Throwable var63 = var10000;
               PlatformJobService.this.jobFinished(var1, false);
               throw var63;
            }

            PlatformJobService.this.jobFinished(var1, false);
         }
      });
      return true;
   }

   public boolean onStopJob(JobParameters var1) {
      Job var2 = JobManager.create((Context)this).getJob(var1.getJobId());
      if (var2 != null) {
         var2.l();
         a.b("Called onStopJob for %s", var2);
         return false;
      } else {
         a.b("Called onStopJob, job %d not found", var1.getJobId());
         return false;
      }
   }
}
