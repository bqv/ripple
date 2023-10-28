package com.dof100.morsenotifier;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningServiceInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

public class ActivityAdvanced extends Activity implements OnClickListener {
   private EditText a = null;
   private TextView b = null;
   private TextView c = null;
   private TextView d = null;
   private TextView e = null;
   private TextView f = null;
   private LinearLayout g = null;
   private TextView h = null;
   private LinearLayout i = null;
   private TextView j = null;
   private LinearLayout k = null;
   private TextView l = null;
   private final Handler m = new Handler();
   private final Runnable n = new Runnable() {
      public void run() {
         ActivityAdvanced.this.a();
         ActivityAdvanced.this.m.postDelayed(this, 3000L);
      }
   };

   private void a() {
      if (android.support.v4.app.a.a(this, "android.permission.READ_PHONE_STATE") == 0) {
         this.b.setText(2131493270);
         this.b.setTextColor(-16711936);
      } else {
         this.b.setText(2131493269);
         this.b.setTextColor(-65536);
      }

      if (VERSION.SDK_INT < 28) {
         this.c.setVisibility(8);
      } else {
         this.c.setVisibility(0);
         if (android.support.v4.app.a.a(this, "android.permission.READ_CALL_LOG") == 0) {
            this.c.setText(2131493266);
            this.c.setTextColor(-16711936);
         } else {
            this.c.setText(2131493265);
            this.c.setTextColor(-65536);
         }
      }

      if (android.support.v4.app.a.a(this, "android.permission.READ_SMS") == 0) {
         this.d.setText(2131493272);
         this.d.setTextColor(-16711936);
      } else {
         this.d.setText(2131493271);
         this.d.setTextColor(-65536);
      }

      if (android.support.v4.app.a.a(this, "android.permission.READ_CONTACTS") == 0) {
         this.e.setText(2131493268);
         this.e.setTextColor(-16711936);
      } else {
         this.e.setText(2131493267);
         this.e.setTextColor(-65536);
      }

      if (App.b) {
         if (a((Activity)this)) {
            this.f.setText(2131493261);
            this.f.setTextColor(-16711936);
         } else {
            this.f.setTextColor(-65536);
            TextView var1;
            int var2;
            if (d(this)) {
               var1 = this.f;
               var2 = 2131493260;
            } else {
               var1 = this.f;
               var2 = 2131493259;
            }

            var1.setText(var2);
         }
      } else {
         this.f.setText(2131493258);
         this.f.setEnabled(false);
         this.f.setTextColor(-7829368);
      }

      if (!App.h && !App.i && !App.j) {
         this.g.setVisibility(8);
      } else {
         this.g.setVisibility(0);
         this.h.setText(this.getResources().getText(2131493255).toString().replace("$BRAND$", App.g).replace("$APPNAME$", App.e));
      }

      if (!App.h && !App.i) {
         this.i.setVisibility(8);
      } else {
         this.i.setVisibility(0);
         this.j.setText(this.getResources().getText(2131493277).toString().replace("$BRAND$", App.g).replace("$APPNAME$", App.e));
      }

      if (App.k) {
         this.k.setVisibility(0);
         this.l.setText(this.getResources().getText(2131493281).toString().replace("$BRAND$", App.g).replace("$APPNAME$", App.e));
      } else {
         this.k.setVisibility(8);
      }
   }

   public static void a(Context var0) {
      if (App.h || App.i || App.j) {
         Intent var1;
         boolean var10001;
         label86: {
            ComponentName var2;
            label91: {
               try {
                  var1 = new Intent();
                  if (App.h) {
                     var2 = new ComponentName("com.miui.securitycenter", "com.miui.permcenter.autostart.AutoStartManagementActivity");
                     break label91;
                  }
               } catch (Exception var9) {
                  var10001 = false;
                  return;
               }

               try {
                  if (App.i) {
                     var2 = new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.startup.StartupAppListActivity");
                     break label91;
                  }
               } catch (Exception var8) {
                  var10001 = false;
                  return;
               }

               try {
                  if (!App.j) {
                     break label86;
                  }

                  var2 = new ComponentName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.BgStartUpManagerActivity");
                  var1.setComponent(var2);
                  if (var0.getPackageManager().queryIntentActivities(var1, 65536).size() != 0) {
                     break label86;
                  }

                  var2 = new ComponentName("com.iqoo.secure", "com.iqoo.secure.MainGuideActivity.");
               } catch (Exception var7) {
                  var10001 = false;
                  return;
               }
            }

            try {
               var1.setComponent(var2);
            } catch (Exception var6) {
               var10001 = false;
               return;
            }
         }

         Intent var10;
         label89: {
            label54: {
               try {
                  if (var0.getPackageManager().queryIntentActivities(var1, 65536).size() <= 0) {
                     break label54;
                  }
               } catch (Exception var5) {
                  var10001 = false;
                  return;
               }

               var10 = var1;
               break label89;
            }

            try {
               var10 = new Intent("android.settings.SETTINGS");
            } catch (Exception var4) {
               var10001 = false;
               return;
            }
         }

         try {
            var0.startActivity(var10);
         } catch (Exception var3) {
            var10001 = false;
         }
      }
   }

   public static boolean a(Activity var0) {
      boolean var1 = Boolean.valueOf(var0.getResources().getBoolean(2130903041));
      boolean var2 = false;
      if (!var1) {
         com.dof100.morsenotifier.i.a("ActivityMain.isCollectorRunning. Notifications are disabled");
         return false;
      } else {
         ComponentName var3 = new ComponentName(var0, ServiceNotifications.class);
         int var4 = Process.myPid();
         ActivityManager var7 = (ActivityManager)var0.getSystemService("activity");

         List var8;
         try {
            var8 = var7.getRunningServices(Integer.MAX_VALUE);
         } catch (Exception var6) {
            var8 = null;
         }

         if (var8 == null) {
            com.dof100.morsenotifier.i.a("ActivityMain.isCollectorRunning. getRunningServices returned NULL");
            return true;
         } else {
            Iterator var5 = var8.iterator();

            while(var5.hasNext()) {
               RunningServiceInfo var9 = (RunningServiceInfo)var5.next();
               if (var9.service.equals(var3) && var9.pid == var4) {
                  var2 = true;
               }
            }

            return var2;
         }
      }
   }

   private void b() {
      String var1;
      StringBuilder var2;
      boolean var4;
      label88: {
         var1 = this.a.getText().toString().toLowerCase().trim();
         var2 = new StringBuilder();
         var2.append("ActivityMain.onActionOK command=");
         var2.append(var1);
         com.dof100.morsenotifier.i.a(var2.toString());
         boolean var3 = var1.startsWith("recent notifications on");
         var4 = true;
         String var5;
         if (var3) {
            (new n(this)).a(this, true);
            App.d(this);
            var5 = "Recent notifications enabled.";
         } else if (var1.startsWith("recent notifications off")) {
            (new n(this)).a(this, false);
            App.d(this);
            var5 = "Recent notifications disabled.";
         } else if (var1.startsWith("recent notifications clear")) {
            (new n(this)).a(this);
            App.d(this);
            var5 = "Recent notifications cleared.";
         } else {
            label93: {
               if (var1.contains("log")) {
                  com.dof100.morsenotifier.i.a("ActivityMain.onActionOK command contains log");
                  if (var1.contains("cl") || var1.contains("del") || var1.contains("cl") || var1.contains("del")) {
                     com.dof100.morsenotifier.i.a((Context)this);
                     var5 = "Log file cleared.";
                     break label93;
                  }

                  if (var1.contains("sh") || var1.contains("display") || var1.contains("view")) {
                     com.dof100.morsenotifier.i.a((Activity)this);
                     break label88;
                  }

                  if (var1.contains("on") || var1.contains("en")) {
                     com.dof100.morsenotifier.i.a(this, (Boolean)true);
                     com.dof100.morsenotifier.i.a("Log file enabled");
                     com.dof100.morsenotifier.i.a((Context)this);
                     var5 = "Log file enabled";
                     break label93;
                  }

                  if (var1.contains("off") || var1.contains("dis")) {
                     com.dof100.morsenotifier.i.a("Log file disabled");
                     com.dof100.morsenotifier.i.a(this, (Boolean)false);
                     var5 = "Log file disabled";
                     break label93;
                  }
               } else if (var1.startsWith("play ")) {
                  Intent var6 = new Intent(this, ServiceMain.class);
                  var6.putExtra(this.getResources().getString(2131492900), this.getResources().getString(2131492865));
                  var6.putExtra(this.getResources().getString(2131492876), var1.substring(5));
                  this.startService(var6);
                  break label88;
               }

               var4 = false;
               break label88;
            }
         }

         com.dof100.morsenotifier.i.b(this, var5);
      }

      if (!var4) {
         var2 = new StringBuilder();
         var2.append("Unknown service command: ");
         var2.append(var1);
         com.dof100.morsenotifier.i.b(this, var2.toString());
      }

   }

   public static void b(Context var0) {
      if (App.h || App.i) {
         Intent var1;
         boolean var10001;
         label67: {
            String var3;
            String var10;
            label60: {
               label68: {
                  try {
                     var1 = new Intent();
                     ComponentName var2 = new ComponentName("com.miui.securitycenter", "com.miui.permcenter.autostart.AutoStartManagementActivity");
                     var1.setComponent(var2);
                     if (App.h) {
                        break label68;
                     }
                  } catch (Exception var9) {
                     var10001 = false;
                     return;
                  }

                  try {
                     if (!App.i) {
                        break label67;
                     }
                  } catch (Exception var8) {
                     var10001 = false;
                     return;
                  }

                  var10 = "com.coloros.oppoguardelf";
                  var3 = "com.coloros.powermanager.fuelgaue.PowerConsumptionActivity";
                  break label60;
               }

               var10 = "com.miui.powerkeeper";
               var3 = "com.miui.powerkeeper.ui.HiddenAppsContainerManagementActivity";
            }

            try {
               var1.setClassName(var10, var3);
            } catch (Exception var7) {
               var10001 = false;
               return;
            }
         }

         Intent var11;
         label69: {
            label45: {
               try {
                  if (var0.getPackageManager().queryIntentActivities(var1, 65536).size() <= 0) {
                     break label45;
                  }
               } catch (Exception var6) {
                  var10001 = false;
                  return;
               }

               var11 = var1;
               break label69;
            }

            try {
               var11 = new Intent("android.settings.SETTINGS");
            } catch (Exception var5) {
               var10001 = false;
               return;
            }
         }

         try {
            var0.startActivity(var11);
         } catch (Exception var4) {
            var10001 = false;
         }
      }
   }

   public static void c(Context var0) {
      if (App.k) {
         Intent var1;
         boolean var10001;
         label34: {
            try {
               var1 = new Intent();
               ComponentName var2 = new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.optimize.process.ProtectActivity");
               var1.setComponent(var2);
               if (var0.getPackageManager().queryIntentActivities(var1, 65536).size() > 0) {
                  break label34;
               }
            } catch (Exception var5) {
               var10001 = false;
               return;
            }

            try {
               var1 = new Intent("android.settings.SETTINGS");
            } catch (Exception var4) {
               var10001 = false;
               return;
            }
         }

         try {
            var0.startActivity(var1);
         } catch (Exception var3) {
            var10001 = false;
         }
      }
   }

   private static boolean d(Context var0) {
      return android.support.v4.app.f.a(var0).contains(var0.getPackageName());
   }

   private static void e(Context var0) {
      try {
         Intent var1 = new Intent();
         var1.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
         var1.setData(Uri.fromParts("package", var0.getPackageName(), (String)null));
         var0.startActivity(var1);
      } catch (Exception var2) {
      }

   }

   private static void f(Context var0) {
      if (App.a) {
         com.dof100.morsenotifier.i.b(var0, "App notifications are only available in the pro version");
      } else if (VERSION.SDK_INT < 18) {
         com.dof100.morsenotifier.i.a(var0, "ActivityMain.onActionNotificationListenerSettings ERROR Android version<4.3");
      } else {
         String var1;
         if (VERSION.SDK_INT >= 22) {
            var1 = "ActivityMain.onActionNotificationListenerSettings Android version>=5.1";
         } else {
            var1 = "ActivityMain.onActionNotificationListenerSettings 4.3<Android version<5.1";
         }

         com.dof100.morsenotifier.i.a(var1);

         try {
            Intent var3 = new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
            var0.startActivity(var3);
         } catch (Exception var2) {
         }

      }
   }

   public void onClick(View var1) {
      if (var1 != null) {
         switch(var1.getId()) {
         case 2131165207:
            a((Context)this);
            return;
         case 2131165208:
            b((Context)this);
            return;
         case 2131165209:
            c(this);
            return;
         case 2131165210:
         case 2131165212:
         case 2131165213:
         default:
            return;
         case 2131165211:
            this.b();
            return;
         case 2131165214:
            f(this);
            return;
         case 2131165215:
            e(this);
         }
      }
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      com.dof100.morsenotifier.i.a("ActivityService.oncreate");
      this.setContentView(2131296256);
      this.a = (EditText)this.findViewById(2131165228);
      this.b = (TextView)this.findViewById(2131165314);
      this.c = (TextView)this.findViewById(2131165312);
      this.d = (TextView)this.findViewById(2131165315);
      this.e = (TextView)this.findViewById(2131165313);
      this.g = (LinearLayout)this.findViewById(2131165249);
      this.h = (TextView)this.findViewById(2131165287);
      this.i = (LinearLayout)this.findViewById(2131165250);
      this.j = (TextView)this.findViewById(2131165289);
      this.k = (LinearLayout)this.findViewById(2131165251);
      this.l = (TextView)this.findViewById(2131165291);
      TextView var2 = (TextView)this.findViewById(2131165311);
      TextView var3 = (TextView)this.findViewById(2131165310);
      Button var4 = (Button)this.findViewById(2131165214);
      this.f = (TextView)this.findViewById(2131165309);
      TextView var5 = (TextView)this.findViewById(2131165307);
      TextView var6 = (TextView)this.findViewById(2131165308);
      TextView var11 = (TextView)this.findViewById(2131165306);
      ((Button)this.findViewById(2131165211)).setOnClickListener(this);
      ((Button)this.findViewById(2131165215)).setOnClickListener(this);
      var4.setOnClickListener(this);
      ((Button)this.findViewById(2131165207)).setOnClickListener(this);
      ((Button)this.findViewById(2131165208)).setOnClickListener(this);
      ((Button)this.findViewById(2131165209)).setOnClickListener(this);
      boolean var7;
      if (VERSION.SDK_INT >= 18 && App.b) {
         var7 = true;
      } else {
         var7 = false;
      }

      var2.setEnabled(var7);
      var3.setEnabled(var7);
      var4.setEnabled(var7);
      this.f.setEnabled(var7);
      var5.setEnabled(var7);
      var6.setEnabled(var7);
      var11.setEnabled(var7);
      boolean var8 = App.a;
      byte var9 = 8;
      byte var10;
      if (var8) {
         var10 = 0;
      } else {
         var10 = 8;
      }

      var5.setVisibility(var10);
      if (VERSION.SDK_INT < 18) {
         var10 = 0;
      } else {
         var10 = 8;
      }

      var11.setVisibility(var10);
      var10 = var9;
      if (var7) {
         var10 = 0;
      }

      var6.setVisibility(var10);
      this.a();
      this.m.postDelayed(this.n, 3000L);
   }

   protected void onDestroy() {
      this.m.removeCallbacks(this.n);
      super.onDestroy();
   }
}
