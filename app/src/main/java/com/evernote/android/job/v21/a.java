package com.evernote.android.job.v21;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.app.job.JobInfo.Builder;
import android.content.ComponentName;
import android.content.Context;
import com.evernote.android.job.JobProxy;
import com.evernote.android.job.JobProxyIllegalStateException;
import com.evernote.android.job.JobRequest;
import com.evernote.android.job.util.JobCat;
import com.evernote.android.job.util.g;
import java.util.Iterator;
import java.util.List;

@TargetApi(21)
public class a implements JobProxy {
   protected final Context a;
   protected final JobCat b;

   public a(Context var1) {
      this(var1, "JobProxy21");
   }

   protected a(Context var1, String var2) {
      this.a = var1;
      this.b = new JobCat(var2);
   }

   protected static String b(int var0) {
      return var0 == 1 ? "success" : "failure";
   }

   protected final int a(JobInfo var1) {
      JobScheduler var2 = this.a();
      if (var2 == null) {
         throw new JobProxyIllegalStateException("JobScheduler is null");
      } else {
         try {
            int var3 = var2.schedule(var1);
            return var3;
         } catch (IllegalArgumentException var4) {
            this.b.a((Throwable)var4);
            String var6 = var4.getMessage();
            if (var6 != null && var6.contains("RECEIVE_BOOT_COMPLETED")) {
               return -123;
            } else if (var6 != null && var6.contains("No such service ComponentInfo")) {
               throw new JobProxyIllegalStateException(var4);
            } else {
               throw var4;
            }
         } catch (NullPointerException var5) {
            this.b.a((Throwable)var5);
            throw new JobProxyIllegalStateException(var5);
         }
      }
   }

   protected int a(JobRequest.NetworkType var1) {
      switch(var1) {
      case a:
         return 0;
      case b:
         return 1;
      case c:
      case d:
         return 2;
      case e:
         return 1;
      default:
         throw new IllegalStateException("not implemented");
      }
   }

   protected Builder a(Builder var1, long var2, long var4) {
      return var1.setMinimumLatency(var2).setOverrideDeadline(var4);
   }

   protected Builder a(JobRequest var1, Builder var2) {
      if (var1.B()) {
         com.evernote.android.job.v21.b.a(this.a, var1);
      }

      return var2;
   }

   protected Builder a(JobRequest var1, boolean var2) {
      Builder var3 = (new Builder(var1.c(), new ComponentName(this.a, PlatformJobService.class))).setRequiresCharging(var1.m()).setRequiresDeviceIdle(var1.n()).setRequiredNetworkType(this.a(var1.q()));
      if (var2 && !var1.B() && g.a(this.a)) {
         var2 = true;
      } else {
         var2 = false;
      }

      return this.a(var1, var3.setPersisted(var2));
   }

   protected final JobScheduler a() {
      return (JobScheduler)this.a.getSystemService("jobscheduler");
   }

   public void cancel(int var1) {
      try {
         this.a().cancel(var1);
      } catch (Exception var3) {
         this.b.a((Throwable)var3);
      }

      com.evernote.android.job.v21.b.a(this.a, var1, (PendingIntent)null);
   }

   public void plantOneOff(JobRequest var1) {
      long var2 = JobProxy.a.a(var1);
      long var4 = JobProxy.a.a(var1, true);
      int var6 = this.a(this.a(this.a(var1, true), var2, var4).build());
      int var7 = var6;
      if (var6 == -123) {
         var7 = this.a(this.a(this.a(var1, false), var2, var4).build());
      }

      this.b.b("Schedule one-off jobInfo %s, %s, start %s, end %s (from now), reschedule count %d", b(var7), var1, g.a(var2), g.a(JobProxy.a.a(var1, false)), JobProxy.a.g(var1));
   }

   protected boolean a(JobInfo var1, JobRequest var2) {
      boolean var3 = true;
      boolean var4;
      if (var1 != null && var1.getId() == var2.c()) {
         var4 = true;
      } else {
         var4 = false;
      }

      if (!var4) {
         return false;
      } else {
         if (var2.B()) {
            if (com.evernote.android.job.v21.b.a(this.a, var2.c())) {
               return true;
            }

            var3 = false;
         }

         return var3;
      }
   }

   protected Builder b(Builder var1, long var2, long var4) {
      return var1.setPeriodic(var2);
   }

   public void plantPeriodic(JobRequest var1) {
      long var2 = var1.j();
      long var4 = var1.k();
      int var6 = this.a(this.b(this.a(var1, true), var2, var4).build());
      int var7 = var6;
      if (var6 == -123) {
         var7 = this.a(this.b(this.a(var1, false), var2, var4).build());
      }

      this.b.b("Schedule periodic jobInfo %s, %s, interval %s, flex %s", b(var7), var1, g.a(var2), g.a(var4));
   }

   public void plantPeriodicFlexsupport(JobRequest var1) {
      long var2 = JobProxy.a.d(var1);
      long var4 = JobProxy.a.e(var1);
      int var6 = this.a(this.a(this.a(var1, true), var2, var4).build());
      int var7 = var6;
      if (var6 == -123) {
         var7 = this.a(this.a(this.a(var1, false), var2, var4).build());
      }

      this.b.b("Schedule periodic (flex support) jobInfo %s, %s, start %s, end %s, flex %s", b(var7), var1, g.a(var2), g.a(var4), g.a(var1.k()));
   }

   public boolean isPlatformJobScheduled(JobRequest var1) {
      List var2;
      try {
         var2 = this.a().getAllPendingJobs();
      } catch (Exception var3) {
         this.b.a((Throwable)var3);
         return false;
      }

      if (var2 != null) {
         if (var2.isEmpty()) {
            return false;
         }

         Iterator var4 = var2.iterator();

         while(var4.hasNext()) {
            if (this.a((JobInfo)var4.next(), var1)) {
               return true;
            }
         }
      }

      return false;
   }
}
