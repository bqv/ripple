package com.dof100.morsenotifier;

import android.app.Activity;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.preference.PreferenceManager;

public class App extends Application {
   public static boolean a;
   public static boolean b;
   public static boolean c;
   public static boolean d;
   public static String e;
   public static String f;
   public static String g;
   public static boolean h;
   public static boolean i;
   public static boolean j;
   public static boolean k;
   public static String l;
   public static String m;
   private static boolean n;
   private static boolean o;
   private static boolean p;
   private static l q;

   public static l a(Context var0) {
      if (q == null) {
         q = new l(var0, 0);
      }

      return q;
   }

   public static void a(Context var0, int var1) {
      Intent var2 = new Intent();
      var2.setAction("LBR_ACTION_SETPOS");
      var2.putExtra("LBR_ACTION_DATA_POS", var1);
      android.support.v4.a.b.a(var0).a(var2);
   }

   public static boolean a(Activity var0, String var1) {
      SharedPreferences var3 = PreferenceManager.getDefaultSharedPreferences(var0);
      StringBuilder var2 = new StringBuilder();
      var2.append("question_asked_");
      var2.append(var1);
      return var3.getBoolean(var2.toString(), false);
   }

   public static void b(Activity var0, String var1) {
      Editor var2 = PreferenceManager.getDefaultSharedPreferences(var0).edit();
      StringBuilder var3 = new StringBuilder();
      var3.append("question_asked_");
      var3.append(var1);
      var2.putBoolean(var3.toString(), true).apply();
   }

   public static void b(Context var0) {
      MyLog.log(var0, "App.broadcastFinish sending LBR_ACTION_FINISH");
      Intent var1 = new Intent();
      var1.setAction("LBR_ACTION_FINISH");
      android.support.v4.a.b.a(var0).a(var1);
   }

   public static void c(Context var0) {
      MyLog.log("App.broadcastSettingsChanged sending LBR_ACTION_SETTINGSCHANGED");
      Intent var1 = new Intent();
      var1.setAction("LBR_ACTION_SETTINGSCHANGED");
      android.support.v4.a.b.a(var0.getApplicationContext()).a(var1);
   }

   public static void d(Context var0) {
      MyLog.log("App.broadcastSettingsChanged sending LBR_ACTION_RECENTNOTIFICATIONSCHANGED");
      Intent var1 = new Intent();
      var1.setAction("LBR_ACTION_RECENTNOTIFICATIONSCHANGED");
      android.support.v4.a.b.a(var0.getApplicationContext()).a(var1);
   }

   public void onCreate() {
      super.onCreate();
      MyLog.logClear((Context)this);
      MyLog.log("App.onCreate");
      n = false;
      boolean var1 = true;
      o = true;
      a = "MorseNotifierPro".contains("Free");
      b = "MorseNotifierPro".contains("Pro");
      c = "MorseNotifierPro".contains("Morse");
      d = "MorseNotifierPro".contains("Voice");

      label68: {
         label72: {
            boolean var10001;
            label65: {
               try {
                  if (((UiModeManager)this.getSystemService("uimode")).getCurrentModeType() == 4) {
                     break label65;
                  }
               } catch (Exception var6) {
                  var10001 = false;
                  break label72;
               }

               var1 = false;
            }

            try {
               p = var1;
               break label68;
            } catch (Exception var5) {
               var10001 = false;
            }
         }

         p = false;
      }

      if (n) {
         MyLog.log("App.onCreate debug build");
      }

      if (o) {
         MyLog.log("App.onCreate release build");
      }

      if (c) {
         MyLog.log("App.onCreate flavor=MorseNotifier");
      }

      if (d) {
         MyLog.log("App.onCreate flavor=VoiceNotifier");
      }

      if (a) {
         MyLog.log("App.onCreate flavor=free");
      }

      if (b) {
         MyLog.log("App.onCreate flavor=pro");
      }

      if (p) {
         MyLog.log("App.onCreate Running on TV");
      }

      e = this.getString(this.getApplicationInfo().labelRes);
      String var3 = this.getPackageName();
      PackageManager var2 = this.getPackageManager();

      try {
         f = var2.getPackageInfo(var3, 0).versionName;
      } catch (NameNotFoundException var4) {
         var4.printStackTrace();
      }

      g = Build.MANUFACTURER;
      h = "xiaomi".equalsIgnoreCase(g);
      i = "oppo".equalsIgnoreCase(g);
      j = "vivo".equalsIgnoreCase(g);
      k = "huawei".equalsIgnoreCase(g);
      StringBuilder var7;
      if (n) {
         var7 = new StringBuilder();
         var7.append("App.onCreate brand=");
         var7.append(g);
         MyLog.log(var7.toString());
      }

      var7 = new StringBuilder();
      var7.append("market://details?id=");
      var7.append(this.getPackageName());
      l = var7.toString();
      m = l.replace(".free", "");
      q = null;
      MyLog.log("App.onCreate Initializing job manager...");
      com.evernote.android.job.i.a((Context)this).a((com.evernote.android.job.f)(new h()));
   }
}
