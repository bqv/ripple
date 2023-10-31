package com.dof100.morsenotifier;

import androidx.core.app.NotificationManagerCompat;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningServiceInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
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

import androidx.core.content.ContextCompat;

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
      if (ContextCompat.checkSelfPermission(this, "android.permission.READ_PHONE_STATE") == 0) {
         this.b.setText(R.string.string_advanced_permissions_readsms_granted);
         this.b.setTextColor(Color.GREEN);
      } else {
         this.b.setText(R.string.string_advanced_permissions_readsms_denied);
         this.b.setTextColor(Color.RED);
      }

      if (VERSION.SDK_INT < 28) {
         this.c.setVisibility(8);
      } else {
         this.c.setVisibility(0);
         if (ContextCompat.checkSelfPermission(this, "android.permission.READ_CALL_LOG") == 0) {
            this.c.setText(R.string.string_advanced_permissions_readcontacts_granted);
            this.c.setTextColor(Color.GREEN);
         } else {
            this.c.setText(R.string.string_advanced_permissions_readcontacts_denied);
            this.c.setTextColor(Color.RED);
         }
      }

      if (ContextCompat.checkSelfPermission(this, "android.permission.READ_SMS") == 0) {
         this.d.setText(R.string.string_advanced_permissions_text);
         this.d.setTextColor(Color.GREEN);
      } else {
         this.d.setText(R.string.string_advanced_permissions_settings);
         this.d.setTextColor(Color.RED);
      }

      if (ContextCompat.checkSelfPermission(this, "android.permission.READ_CONTACTS") == 0) {
         this.e.setText(R.string.string_advanced_permissions_readphonestate_granted);
         this.e.setTextColor(Color.GREEN);
      } else {
         this.e.setText(R.string.string_advanced_permissions_readphonestate_denied);
         this.e.setTextColor(Color.RED);
      }

      if (App.b) {
         if (a((Activity)this)) {
            this.f.setText(R.string.string_advanced_notificationlistener_running);
            this.f.setTextColor(Color.GREEN);
         } else {
            this.f.setTextColor(Color.RED);
            TextView var1;
            int var2;
            if (d(this)) {
               var1 = this.f;
               var2 = R.string.string_advanced_notificationlistener_notrunning;
            } else {
               var1 = this.f;
               var2 = R.string.string_advanced_notificationlistener_notenabled;
            }

            var1.setText(var2);
         }
      } else {
         this.f.setText(R.string.string_advanced_notificationlistener_disabled);
         this.f.setEnabled(false);
         this.f.setTextColor(Color.GRAY);
      }

      if (!App.h && !App.i && !App.j) {
         this.g.setVisibility(View.GONE);
      } else {
         this.g.setVisibility(View.VISIBLE);
         this.h.setText(this.getResources().getText(R.string.string_advanced_autostart_text).toString().replace("$BRAND$", App.g).replace("$APPNAME$", App.e));
      }

      if (!App.h && !App.i) {
         this.i.setVisibility(View.GONE);
      } else {
         this.i.setVisibility(View.VISIBLE);
         this.j.setText(this.getResources().getText(R.string.string_advanced_protectedapps).toString().replace("$BRAND$", App.g).replace("$APPNAME$", App.e));
      }

      if (App.k) {
         this.k.setVisibility(View.VISIBLE);
         this.l.setText(this.getResources().getText(R.string.string_advanced_service_command).toString().replace("$BRAND$", App.g).replace("$APPNAME$", App.e));
      } else {
         this.k.setVisibility(View.GONE);
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
      boolean var1 = Boolean.valueOf(var0.getResources().getBoolean(R.bool.enableFeaturesAPI18));
      boolean var2 = false;
      if (!var1) {
         MyLog.log("ActivityMain.isCollectorRunning. Notifications are disabled");
         return false;
      } else {
         ComponentName var3 = new ComponentName(var0, ServiceNotifications.class);
         int var4 = Process.myPid();
         ActivityManager var7 = (ActivityManager)var0.getSystemService(Context.ACTIVITY_SERVICE);

         List var8;
         try {
            var8 = var7.getRunningServices(Integer.MAX_VALUE);
         } catch (Exception var6) {
            var8 = null;
         }

         if (var8 == null) {
            MyLog.log("ActivityMain.isCollectorRunning. getRunningServices returned NULL");
            return true;
         } else {

            for (Object o : var8) {
               RunningServiceInfo var9 = (RunningServiceInfo) o;
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
         MyLog.log(var2.toString());
         boolean var3 = var1.startsWith("recent notifications on");
         var4 = true;
         String var5;
         if (var3) {
            (new MyRecentAppNotifications(this)).setEnable(this, true);
            App.d(this);
            var5 = "Recent notifications enabled.";
         } else if (var1.startsWith("recent notifications off")) {
            (new MyRecentAppNotifications(this)).setEnable(this, false);
            App.d(this);
            var5 = "Recent notifications disabled.";
         } else if (var1.startsWith("recent notifications clear")) {
            (new MyRecentAppNotifications(this)).clear(this);
            App.d(this);
            var5 = "Recent notifications cleared.";
         } else {
            label93: {
               if (var1.contains("log")) {
                  MyLog.log("ActivityMain.onActionOK command contains log");
                  if (var1.contains("cl") || var1.contains("del") || var1.contains("cl") || var1.contains("del")) {
                     MyLog.logClear((Context)this);
                     var5 = "Log file cleared.";
                     break label93;
                  }

                  if (var1.contains("sh") || var1.contains("display") || var1.contains("view")) {
                     MyLog.logShow((Activity)this);
                     break label88;
                  }

                  if (var1.contains("on") || var1.contains("en")) {
                     MyLog.setEnabled(this, (Boolean)true);
                     MyLog.log("Log file enabled");
                     MyLog.logClear((Context)this);
                     var5 = "Log file enabled";
                     break label93;
                  }

                  if (var1.contains("off") || var1.contains("dis")) {
                     MyLog.log("Log file disabled");
                     MyLog.setEnabled(this, (Boolean)false);
                     var5 = "Log file disabled";
                     break label93;
                  }
               } else if (var1.startsWith("play ")) {
                  Intent var6 = new Intent(this, ServiceMain.class);
                  var6.putExtra(this.getResources().getString(R.string.MSG_WHAT), this.getResources().getString(R.string.MSG_APPS_NOTIFY));
                  var6.putExtra(this.getResources().getString(R.string.MSG_EXTRATEXT2), var1.substring(5));
                  this.startService(var6);
                  break label88;
               }

               var4 = false;
               break label88;
            }
         }

         MyLog.toast(this, var5);
      }

      if (!var4) {
         var2 = new StringBuilder();
         var2.append("Unknown service command: ");
         var2.append(var1);
         MyLog.toast(this, var2.toString());
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

   private static boolean d(Context context) {
      return NotificationManagerCompat.getEnabledListenerPackages(context).contains(context.getPackageName());
   }

   private static void e(Context var0) {
      try {
         Intent intent = new Intent();
         intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
         intent.setData(Uri.fromParts("package", var0.getPackageName(), (String)null));
         var0.startActivity(intent);
      } catch (Exception var2) {
      }

   }

   private static void f(Context var0) {
      if (App.a) {
         MyLog.toast(var0, "App notifications are only available in the pro version");
      } else if (VERSION.SDK_INT < 18) {
         MyLog.log(var0, "ActivityMain.onActionNotificationListenerSettings ERROR Android version<4.3");
      } else {
         String var1;
         if (VERSION.SDK_INT >= 22) {
            var1 = "ActivityMain.onActionNotificationListenerSettings Android version>=5.1";
         } else {
            var1 = "ActivityMain.onActionNotificationListenerSettings 4.3<Android version<5.1";
         }

         MyLog.log(var1);

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
         case R.id.button_advanced_autostart_settings:
            a((Context)this);
            return;
         case R.id.button_advanced_powersave_settings:
            b((Context)this);
            return;
         case R.id.button_advanced_protectedapps_settings:
            c(this);
            return;
         case R.id.button_instructions:
         case R.id.button_rate:
         case R.id.button_service_command:
         default:
            return;
         case R.id.button_ok:
            this.b();
            return;
         case R.id.button_service_notificationlistener_settings:
            f(this);
            return;
         case R.id.button_service_permissions_settings:
            e(this);
         }
      }
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      MyLog.log("ActivityService.oncreate");
      this.setContentView(R.layout.activity_advanced);
      this.a = (EditText)this.findViewById(R.id.editText_command);
      this.b = (TextView)this.findViewById(R.id.tv_service_permissions_readsms);
      this.c = (TextView)this.findViewById(R.id.tv_service_permissions_readcontacts);
      this.d = (TextView)this.findViewById(R.id.tv_service_permissions_readcalllog);
      this.e = (TextView)this.findViewById(R.id.tv_service_permissions_readphonestate);
      this.g = (LinearLayout)this.findViewById(R.id.ll_advanced_autostart);
      this.h = (TextView)this.findViewById(R.id.tv_advanced_autostart_text);
      this.i = (LinearLayout)this.findViewById(R.id.ll_advanced_powersave);
      this.j = (TextView)this.findViewById(R.id.tv_advanced_powersave_text);
      this.k = (LinearLayout)this.findViewById(R.id.ll_advanced_protectedapps);
      this.l = (TextView)this.findViewById(R.id.tv_advanced_protectedapps_text);
      TextView var2 = (TextView)this.findViewById(R.id.tv_service_notificationlistener_title);
      TextView var3 = (TextView)this.findViewById(R.id.tv_service_notificationlistener_text);
      Button var4 = (Button)this.findViewById(R.id.button_service_notificationlistener_settings);
      this.f = (TextView)this.findViewById(R.id.tv_service_notificationlistener_status);
      TextView var5 = (TextView)this.findViewById(R.id.tv_service_notificationlistener_notepro);
      TextView var6 = (TextView)this.findViewById(R.id.tv_service_notificationlistener_notereboot);
      TextView var11 = (TextView)this.findViewById(R.id.tv_service_notificationlistener_note18);
      ((Button)this.findViewById(R.id.button_ok)).setOnClickListener(this);
      ((Button)this.findViewById(R.id.button_service_permissions_settings)).setOnClickListener(this);
      var4.setOnClickListener(this);
      ((Button)this.findViewById(R.id.button_advanced_autostart_settings)).setOnClickListener(this);
      ((Button)this.findViewById(R.id.button_advanced_powersave_settings)).setOnClickListener(this);
      ((Button)this.findViewById(R.id.button_advanced_protectedapps_settings)).setOnClickListener(this);
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
