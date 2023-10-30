package com.evernote.android.job;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public final class JobRescheduleService extends android.support.v4.app.c {
   static CountDownLatch j;
   private static final com.evernote.android.job.util.d k = new com.evernote.android.job.util.d("JobRescheduleService", false);

   static void a(Context var0) {
      try {
         Intent var1 = new Intent();
         a(var0, JobRescheduleService.class, 2147480000, var1);
         CountDownLatch var3 = new CountDownLatch(1);
         j = var3;
      } catch (Exception var2) {
         k.a((Throwable)var2);
      }
   }

   int a(i var1, Collection var2) {
      Iterator var8 = var2.iterator();
      int var3 = 0;
      boolean var4 = false;

      while(true) {
         JobRequest var5;
         boolean var6;
         do {
            if (!var8.hasNext()) {
               return var3;
            }

            var5 = (JobRequest)var8.next();
            if (var5.z()) {
               if (var1.a(var5.c()) == null) {
                  var6 = true;
               } else {
                  var6 = false;
               }
            } else {
               var6 = var1.a(var5.w()).isPlatformJobScheduled(var5) ^ true;
            }
         } while(!var6);

         label34: {
            try {
               var5.E().a().D();
            } catch (Exception var7) {
               var6 = var4;
               if (!var4) {
                  k.a((Throwable)var7);
                  var6 = true;
               }
               break label34;
            }

            var6 = var4;
         }

         ++var3;
         var4 = var6;
      }
   }

   protected void a(Intent var1) {
      try {
         k.b("Reschedule service started");
         SystemClock.sleep(com.evernote.android.job.e.c());

         i var8;
         try {
            var8 = com.evernote.android.job.i.a((Context)this);
         } catch (j var6) {
            return;
         }

         Set var2 = var8.a((String)null, true, true);
         int var3 = this.a(var8, var2);
         k.b("Reschedule %d jobs of %d jobs", var3, var2.size());
      } finally {
         if (j != null) {
            j.countDown();
         }

      }
   }
}
