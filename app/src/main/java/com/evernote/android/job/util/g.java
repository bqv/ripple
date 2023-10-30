package com.evernote.android.job.util;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public final class g {
   private static final ThreadLocal a = new ThreadLocal();
   private static final long b;
   private static final JobCat c;

   static {
      b = TimeUnit.DAYS.toMillis(1L);
      c = new JobCat("JobUtil");
   }

   public static String a(long var0) {
      SimpleDateFormat var2 = (SimpleDateFormat)a.get();
      SimpleDateFormat var3 = var2;
      if (var2 == null) {
         var3 = new SimpleDateFormat("HH:mm:ss", Locale.US);
         a.set(var3);
      }

      var3.setTimeZone(TimeZone.getTimeZone("GMT"));
      String var4 = var3.format(new Date(var0));
      var0 /= b;
      StringBuilder var6;
      if (var0 == 1L) {
         var6 = new StringBuilder();
         var6.append(var4);
         var6.append(" (+1 day)");
         return var6.toString();
      } else {
         String var5 = var4;
         if (var0 > 1L) {
            var6 = new StringBuilder();
            var6.append(var4);
            var6.append(" (+");
            var6.append(var0);
            var6.append(" days)");
            var5 = var6.toString();
         }

         return var5;
      }
   }

   public static boolean a(Context var0) {
      return a(var0, "android.permission.RECEIVE_BOOT_COMPLETED", 0);
   }

   private static boolean a(Context var0, String var1, int var2) {
      boolean var3 = false;
      boolean var4 = false;

      int var5;
      try {
         var5 = var0.getPackageManager().checkPermission(var1, var0.getPackageName());
      } catch (Exception var7) {
         c.e((Throwable)var7);
         var4 = var3;
         if (var2 < 1) {
            var4 = var3;
            if (a(var0.getApplicationContext(), var1, var2 + 1)) {
               var4 = true;
            }
         }

         return var4;
      }

      if (var5 == 0) {
         var4 = true;
      }

      return var4;
   }

   public static boolean b(Context var0) {
      return a(var0, "android.permission.WAKE_LOCK", 0);
   }
}
