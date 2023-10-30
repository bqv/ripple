package com.evernote.android.job;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;

import com.evernote.android.job.gcm.JobProxyGcm;
import com.evernote.android.job.v14.PlatformAlarmReceiver;
import com.evernote.android.job.v14.PlatformAlarmService;
import com.evernote.android.job.v14.PlatformAlarmServiceExact;
import com.evernote.android.job.v21.PlatformJobService;
import java.util.Iterator;
import java.util.List;

public enum d {
   a(true, false, true),
   b(true, false, false),
   c(true, true, false),
   d(true, true, true),
   e(false, true, true),
   f(true, false, true);

   private volatile JobProxy g;
   private final boolean h;
   private final boolean i;
   private final boolean j;

   private d(boolean var3, boolean var4, boolean var5) {
      this.h = var3;
      this.i = var4;
      this.j = var5;
   }

   private boolean a(Context var1, Class var2) {
      boolean var3 = false;

      boolean var5;
      boolean var6;
      label39: {
         label32: {
            boolean var10001;
            List var9;
            try {
               Intent var4 = new Intent(var1, var2);
               var9 = var1.getPackageManager().queryIntentServices(var4, 0);
            } catch (Exception var8) {
               var10001 = false;
               break label32;
            }

            var5 = var3;
            if (var9 == null) {
               return var5;
            }

            try {
               var6 = var9.isEmpty();
               break label39;
            } catch (Exception var7) {
               var10001 = false;
            }
         }

         var5 = var3;
         return var5;
      }

      var5 = var3;
      if (!var6) {
         var5 = true;
      }

      return var5;
   }

   private static boolean a(Context var0, Class var1, String var2) {
      boolean var10001;
      List var9;
      try {
         Intent var3 = new Intent(var0, var1);
         var9 = var0.getPackageManager().queryIntentServices(var3, 0);
      } catch (Exception var7) {
         var10001 = false;
         return false;
      }

      if (var9 != null) {
         try {
            if (var9.isEmpty()) {
               return false;
            }
         } catch (Exception var8) {
            var10001 = false;
            return false;
         }

         Iterator var11;
         try {
            var11 = var9.iterator();
         } catch (Exception var6) {
            var10001 = false;
            return false;
         }

         while(true) {
            boolean var4;
            try {
               ResolveInfo var10;
               do {
                  if (!var11.hasNext()) {
                     return false;
                  }

                  var10 = (ResolveInfo)var11.next();
               } while(var10.serviceInfo == null);

               var4 = var2.equals(var10.serviceInfo.permission);
            } catch (Exception var5) {
               var10001 = false;
               break;
            }

            if (var4) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean b(Context var1, Class var2) {
      boolean var3 = false;

      boolean var5;
      boolean var6;
      label39: {
         label32: {
            boolean var10001;
            List var9;
            try {
               Intent var4 = new Intent(var1, var2);
               var9 = var1.getPackageManager().queryBroadcastReceivers(var4, 0);
            } catch (Exception var8) {
               var10001 = false;
               break label32;
            }

            var5 = var3;
            if (var9 == null) {
               return var5;
            }

            try {
               var6 = var9.isEmpty();
               break label39;
            } catch (Exception var7) {
               var10001 = false;
            }
         }

         var5 = var3;
         return var5;
      }

      var5 = var3;
      if (!var6) {
         var5 = true;
      }

      return var5;
   }

   public static d c(Context var0) {
      if (a.a(var0) && com.evernote.android.job.e.a(a)) {
         return a;
      } else if (b.a(var0) && com.evernote.android.job.e.a(b)) {
         return b;
      } else if (c.a(var0) && com.evernote.android.job.e.a(c)) {
         return c;
      } else if (f.a(var0) && com.evernote.android.job.e.a(f)) {
         return f;
      } else if (d.a(var0) && com.evernote.android.job.e.a(d)) {
         return d;
      } else if (com.evernote.android.job.e.a(e)) {
         return e;
      } else {
         throw new IllegalStateException("All supported APIs are disabled");
      }
   }

   private JobProxy d(Context var1) {
      switch(this) {
      case a:
         return new com.evernote.android.job.d.a(var1);
      case b:
         return new com.evernote.android.job.c.a(var1);
      case c:
         return new com.evernote.android.job.v21.a(var1);
      case d:
         return new com.evernote.android.job.b.a(var1);
      case e:
         return new com.evernote.android.job.v14.a(var1);
      case f:
         return new JobProxyGcm(var1);
      default:
         throw new IllegalStateException("not implemented");
      }
   }

   boolean a() {
      return this.h;
   }

   public boolean a(Context var1) {
      int var2 = null.a[this.ordinal()];
      boolean var3 = true;
      switch(var2) {
      case 1:
         if (VERSION.SDK_INT >= 26 && this.a(var1, PlatformJobService.class)) {
            return true;
         }

         return false;
      case 2:
         if (VERSION.SDK_INT >= 24 && a(var1, PlatformJobService.class, "android.permission.BIND_JOB_SERVICE")) {
            return true;
         }

         return false;
      case 3:
         if (VERSION.SDK_INT >= 21 && a(var1, PlatformJobService.class, "android.permission.BIND_JOB_SERVICE")) {
            return true;
         }

         return false;
      case 4:
         if (VERSION.SDK_INT >= 19 && this.a(var1, PlatformAlarmService.class) && this.b(var1, PlatformAlarmReceiver.class)) {
            return true;
         }

         return false;
      case 5:
         if (!com.evernote.android.job.e.b()) {
            if (this.a(var1, PlatformAlarmService.class) && this.a(var1, PlatformAlarmServiceExact.class) && this.b(var1, PlatformAlarmReceiver.class)) {
               return true;
            }

            var3 = false;
         }

         return var3;
      case 6:
         return com.evernote.android.job.b.a(var1);
      default:
         throw new IllegalStateException("not implemented");
      }
   }

   JobProxy b(Context var1) {
      synchronized(this){}

      JobProxy var4;
      try {
         if (this.g == null) {
            this.g = this.d(var1);
         }

         var4 = this.g;
      } finally {
         ;
      }

      return var4;
   }

   boolean b() {
      return this.i;
   }

   public void c() {
      synchronized(this){}

      try {
         this.g = null;
      } finally {
         ;
      }

   }
}
