package com.evernote.android.job.v14;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Build.VERSION;
import com.evernote.android.job.JobConfig;
import com.evernote.android.job.JobProxy;
import com.evernote.android.job.JobRequest;
import com.evernote.android.job.util.JobCat;
import com.evernote.android.job.util.g;

public class a implements JobProxy {
   protected final Context a;
   protected final JobCat b;
   private AlarmManager c;

   public a(Context var1) {
      this(var1, "JobProxy14");
   }

   protected a(Context var1, String var2) {
      this.a = var1;
      this.b = new JobCat(var2);
   }

   private void f(JobRequest var1) {
      this.b.b("Scheduled alarm, %s, delay %s (from now), exact %b, reschedule count %d", var1, g.a(JobProxy.a.c(var1)), var1.u(), JobProxy.a.g(var1));
   }

   protected int a(boolean var1) {
      if (var1) {
         return JobConfig.f() ? 0 : 2;
      } else {
         return JobConfig.f() ? 1 : 3;
      }
   }

   protected AlarmManager a() {
      if (this.c == null) {
         this.c = (AlarmManager)this.a.getSystemService("alarm");
      }

      if (this.c == null) {
         this.b.JobCat("AlarmManager is null");
      }

      return this.c;
   }

   protected PendingIntent a(int var1, boolean var2, Bundle var3, int var4) {
      Intent var6 = PlatformAlarmReceiver.a(this.a, var1, var2, var3);

      try {
         PendingIntent var7 = PendingIntent.getBroadcast(this.a, var1, var6, var4);
         return var7;
      } catch (Exception var5) {
         this.b.a((Throwable)var5);
         return null;
      }
   }

   protected PendingIntent a(JobRequest var1, int var2) {
      return this.a(var1.getJobId(), var1.u(), var1.C(), var2);
   }

   protected PendingIntent a(JobRequest var1, boolean var2) {
      return this.a(var1, this.b(var2));
   }

   public void cancel(int var1) {
      AlarmManager var2 = this.a();
      if (var2 != null) {
         try {
            var2.cancel(this.a(var1, false, (Bundle)null, this.b(true)));
            var2.cancel(this.a(var1, false, (Bundle)null, this.b(false)));
            return;
         } catch (Exception var3) {
            this.b.a((Throwable)var3);
         }
      }

   }

   public void plantOneOff(JobRequest var1) {
      PendingIntent var2 = this.a(var1, false);
      AlarmManager var3 = this.a();
      if (var3 != null) {
         try {
            if (var1.u()) {
               if (var1.getStartMs() == 1L && var1.y() <= 0) {
                  PlatformAlarmService.a(this.a, var1.getJobId(), var1.C());
               } else {
                  this.b(var1, var3, var2);
               }
            } else {
               this.a(var1, var3, var2);
            }
         } catch (Exception var4) {
            this.b.a((Throwable)var4);
         }
      }
   }

   protected void a(JobRequest var1, AlarmManager var2, PendingIntent var3) {
      var2.set(this.a(false), this.e(var1), var3);
      this.f(var1);
   }

   protected int b(boolean var1) {
      return !var1 ? 1207959552 : 134217728;
   }

   public void plantPeriodic(JobRequest var1) {
      PendingIntent var2 = this.a(var1, true);
      AlarmManager var3 = this.a();
      if (var3 != null) {
         var3.setRepeating(this.a(true), this.e(var1), var1.j(), var2);
      }

      this.b.b("Scheduled repeating alarm, %s, interval %s", var1, g.a(var1.j()));
   }

   protected void b(JobRequest var1, AlarmManager var2, PendingIntent var3) {
      long var4 = this.e(var1);
      if (VERSION.SDK_INT >= 23) {
         var2.setExactAndAllowWhileIdle(this.a(true), var4, var3);
      } else if (VERSION.SDK_INT >= 19) {
         var2.setExact(this.a(true), var4, var3);
      } else {
         var2.set(this.a(true), var4, var3);
      }

      this.f(var1);
   }

   public void plantPeriodicFlexsupport(JobRequest var1) {
      PendingIntent var2 = this.a(var1, false);
      AlarmManager var3 = this.a();
      if (var3 != null) {
         try {
            this.c(var1, var3, var2);
         } catch (Exception var4) {
            this.b.a((Throwable)var4);
         }
      }
   }

   protected void c(JobRequest var1, AlarmManager var2, PendingIntent var3) {
      var2.set(1, JobConfig.g().a() + JobProxy.a.f(var1), var3);
      this.b.b("Scheduled repeating alarm (flex support), %s, interval %s, flex %s", var1, g.a(var1.j()), g.a(var1.k()));
   }

   public boolean isPlatformJobScheduled(JobRequest var1) {
      return this.a(var1, 536870912) != null;
   }

   protected long e(JobRequest var1) {
      long var2;
      if (JobConfig.f()) {
         var2 = JobConfig.g().a();
      } else {
         var2 = JobConfig.g().b();
      }

      return var2 + JobProxy.a.c(var1);
   }
}
