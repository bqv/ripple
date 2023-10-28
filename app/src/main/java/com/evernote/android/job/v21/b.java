package com.evernote.android.job.v21;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.evernote.android.job.m;
import com.evernote.android.job.a.d;
import com.evernote.android.job.v14.PlatformAlarmServiceExact;
import java.util.concurrent.TimeUnit;

@TargetApi(21)
final class b {
   private static final d a = new d("TransientBundleCompat");

   public static void a(Context var0, int var1, PendingIntent var2) {
      Exception var10000;
      label24: {
         PendingIntent var3 = var2;
         boolean var10001;
         if (var2 == null) {
            try {
               var2 = PendingIntent.getService(var0, var1, PlatformAlarmServiceExact.a(var0, var1, (Bundle)null), 536870912);
            } catch (Exception var5) {
               var10000 = var5;
               var10001 = false;
               break label24;
            }

            var3 = var2;
            if (var2 == null) {
               return;
            }
         }

         try {
            ((AlarmManager)var0.getSystemService("alarm")).cancel(var3);
            var3.cancel();
            return;
         } catch (Exception var4) {
            var10000 = var4;
            var10001 = false;
         }
      }

      Exception var6 = var10000;
      a.a((Throwable)var6);
   }

   public static void a(Context var0, m var1) {
      Intent var2 = PlatformAlarmServiceExact.a(var0, var1.c(), var1.C());
      PendingIntent var7 = PendingIntent.getService(var0, var1.c(), var2, 134217728);
      long var3 = System.currentTimeMillis();
      long var5 = TimeUnit.DAYS.toMillis(1000L);
      ((AlarmManager)var0.getSystemService("alarm")).setExact(1, var3 + var5, var7);
   }

   public static boolean a(Context var0, int var1) {
      return PendingIntent.getService(var0, var1, PlatformAlarmServiceExact.a(var0, var1, (Bundle)null), 536870912) != null;
   }

   public static boolean b(Context var0, m var1) {
      Intent var2 = PlatformAlarmServiceExact.a(var0, var1.c(), (Bundle)null);
      PendingIntent var4 = PendingIntent.getService(var0, var1.c(), var2, 536870912);
      if (var4 == null) {
         return false;
      } else {
         try {
            a.a("Delegating transient job %s to API 14", var1);
            var4.send();
         } catch (CanceledException var3) {
            a.a((Throwable)var3);
            return false;
         }

         if (!var1.i()) {
            a(var0, var1.c(), var4);
         }

         return true;
      }
   }
}
