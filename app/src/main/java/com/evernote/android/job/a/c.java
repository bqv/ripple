package com.evernote.android.job.a;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.os.Build.VERSION;
import com.evernote.android.job.m;

public final class c {
   @TargetApi(17)
   public static a a(Context var0) {
      Intent var6 = var0.registerReceiver((BroadcastReceiver)null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
      if (var6 == null) {
         return a.a;
      } else {
         int var1 = var6.getIntExtra("level", -1);
         int var2 = var6.getIntExtra("scale", -1);
         float var3 = (float)var1 / (float)var2;
         var2 = var6.getIntExtra("plugged", 0);
         boolean var4 = true;
         boolean var5 = var4;
         if (var2 != 1) {
            var5 = var4;
            if (var2 != 2) {
               if (VERSION.SDK_INT >= 17 && var2 == 4) {
                  var5 = var4;
               } else {
                  var5 = false;
               }
            }
         }

         return new a(var5, var3);
      }
   }

   public static boolean a() {
      return false;
   }

   public static boolean b(Context var0) {
      PowerManager var3 = (PowerManager)var0.getSystemService("power");
      int var1 = VERSION.SDK_INT;
      boolean var2 = true;
      if (var1 >= 23) {
         if (!var3.isDeviceIdleMode()) {
            if (!var3.isInteractive()) {
               return true;
            }

            var2 = false;
         }

         return var2;
      } else {
         return VERSION.SDK_INT >= 20 ? var3.isInteractive() ^ true : var3.isScreenOn() ^ true;
      }
   }

   public static m.d c(Context var0) {
      ConnectivityManager var3 = (ConnectivityManager)var0.getSystemService("connectivity");

      NetworkInfo var1;
      try {
         var1 = var3.getActiveNetworkInfo();
      } catch (Throwable var2) {
         return m.d.a;
      }

      if (var1 != null && var1.isConnectedOrConnecting()) {
         if (!android.support.v4.b.a.a(var3)) {
            return m.d.c;
         } else {
            return var1.isRoaming() ? m.d.b : m.d.d;
         }
      } else {
         return m.d.a;
      }
   }
}
