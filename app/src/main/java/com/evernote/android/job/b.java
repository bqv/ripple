package com.evernote.android.job;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.evernote.android.job.gcm.PlatformGcmService;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.Iterator;
import java.util.List;

final class b {
   private static final com.evernote.android.job.a.d a = new com.evernote.android.job.a.d("GcmAvailableHelper");
   private static final boolean b;
   private static int c;
   private static boolean d;

   static {
      boolean var0;
      label13: {
         try {
            Class.forName("com.google.android.gms.gcm.GcmNetworkManager");
         } catch (Throwable var2) {
            var0 = false;
            break label13;
         }

         var0 = true;
      }

      b = var0;
   }

   private static void a(Context var0, boolean var1) {
      boolean var10001;
      com.evernote.android.job.a.d var9;
      String var10;
      label51: {
         PackageManager var2;
         ComponentName var4;
         label52: {
            try {
               var2 = var0.getPackageManager();
               StringBuilder var3 = new StringBuilder();
               var3.append(com.evernote.android.job.gcm.a.class.getPackage().getName());
               var3.append(".PlatformGcmService");
               String var11 = var3.toString();
               var4 = new ComponentName(var0, var11);
               switch(var2.getComponentEnabledSetting(var4)) {
               case 0:
               case 2:
                  break label52;
               case 1:
                  break;
               default:
                  return;
               }
            } catch (Throwable var8) {
               var10001 = false;
               return;
            }

            if (var1) {
               return;
            }

            try {
               var2.setComponentEnabledSetting(var4, 2, 1);
               var9 = a;
            } catch (Throwable var7) {
               var10001 = false;
               return;
            }

            var10 = "GCM service disabled";
            break label51;
         }

         if (!var1) {
            return;
         }

         try {
            var2.setComponentEnabledSetting(var4, 1, 1);
            var9 = a;
         } catch (Throwable var6) {
            var10001 = false;
            return;
         }

         var10 = "GCM service enabled";
      }

      try {
         var9.a(var10);
      } catch (Throwable var5) {
         var10001 = false;
      }
   }

   public static boolean a(Context var0) {
      boolean var1 = false;

      boolean var2;
      int var3;
      label56: {
         label47: {
            boolean var10001;
            try {
               if (!d) {
                  d = true;
                  a(var0, b);
               }
            } catch (Throwable var6) {
               var10001 = false;
               break label47;
            }

            var2 = var1;

            try {
               if (!b) {
                  return var2;
               }
            } catch (Throwable var5) {
               var10001 = false;
               break label47;
            }

            var2 = var1;

            try {
               if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(var0) != 0) {
                  return var2;
               }

               var3 = b(var0);
               break label56;
            } catch (Throwable var4) {
               var10001 = false;
            }
         }

         var2 = var1;
         return var2;
      }

      var2 = var1;
      if (var3 == 0) {
         var2 = true;
      }

      return var2;
   }

   private static boolean a(List var0) {
      if (var0 != null) {
         if (var0.isEmpty()) {
            return false;
         }

         Iterator var1 = var0.iterator();

         while(var1.hasNext()) {
            ResolveInfo var2 = (ResolveInfo)var1.next();
            if (var2.serviceInfo != null && "com.google.android.gms.permission.BIND_NETWORK_TASK_SERVICE".equals(var2.serviceInfo.permission) && var2.serviceInfo.exported) {
               return true;
            }
         }
      }

      return false;
   }

   private static int b(Context var0) {
      if (c < 0) {
         synchronized(d.class){}

         Throwable var10000;
         boolean var10001;
         label315: {
            label321: {
               Intent var1;
               int var2;
               try {
                  if (c >= 0) {
                     break label321;
                  }

                  var1 = new Intent(var0, PlatformGcmService.class);
                  if (!a(var0.getPackageManager().queryIntentServices(var1, 0))) {
                     c = 1;
                     var2 = c;
                     return var2;
                  }
               } catch (Throwable var31) {
                  var10000 = var31;
                  var10001 = false;
                  break label315;
               }

               try {
                  var1 = new Intent("com.google.android.gms.gcm.ACTION_TASK_READY");
                  var1.setPackage(var0.getPackageName());
                  if (!a(var0.getPackageManager().queryIntentServices(var1, 0))) {
                     c = 1;
                     var2 = c;
                     return var2;
                  }
               } catch (Throwable var32) {
                  var10000 = var32;
                  var10001 = false;
                  break label315;
               }

               try {
                  c = 0;
               } catch (Throwable var30) {
                  var10000 = var30;
                  var10001 = false;
                  break label315;
               }
            }

            label301:
            try {
               return c;
            } catch (Throwable var29) {
               var10000 = var29;
               var10001 = false;
               break label301;
            }
         }

         while(true) {
            Throwable var33 = var10000;

            try {
               throw var33;
            } catch (Throwable var28) {
               var10000 = var28;
               var10001 = false;
               continue;
            }
         }
      } else {
         return c;
      }
   }
}
