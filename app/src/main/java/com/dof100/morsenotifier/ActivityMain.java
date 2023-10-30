package com.dof100.morsenotifier;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Build.VERSION;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class ActivityMain extends Activity implements OnClickListener {
   private final Handler a = new Handler();
   private final Runnable b = new Runnable() {
      public void run() {
         ActivityMain.this.g();
         ActivityMain.this.h();
         ActivityMain.this.i();
      }
   };

   private void a() {
      MyLog.log("ActivityMain.onActionSettings");
      Intent var1 = new Intent(this, MyPreferencesActivity.class);
      MyLog.log("ActivityMain.onActionSettings before startActivityForResult");
      this.startActivityForResult(var1, 1);
   }

   private boolean a(String var1) {
      PackageManager var2 = this.getPackageManager();

      try {
         var2.getPackageInfo(var1, 1);
         boolean var3 = var2.getApplicationInfo(var1, 0).enabled;
         return var3;
      } catch (NameNotFoundException var4) {
         var4.printStackTrace();
         return false;
      }
   }

   private void b() {
      MyLog.log("onActionAbout");
      Intent var1 = new Intent(this, ActivityHTML.class);
      var1.putExtra("TITLE", "About");
      var1.putExtra("FILENAME", "about.html");
      var1.putExtra("VERTICALALIGN", "top");
      var1.putExtra("BUTTONOKCAPTION", "OK");
      this.startActivity(var1);
   }

   private void c() {
      MyLog.log("onActionRate");
      StringBuilder var1 = new StringBuilder();
      var1.append("market://details?id=");
      var1.append(this.getPackageName());
      String var2 = var1.toString();

      try {
         Intent var4 = new Intent("android.intent.action.VIEW", Uri.parse(var2));
         this.startActivity(var4);
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   private void d() {
      MyLog.log("onActionTest");
      Intent var1 = new Intent(this, ServiceMain.class);
      var1.putExtra(this.getResources().getString(2131492900), this.getResources().getString(2131492882));
      var1.putExtra(this.getResources().getString(2131492875), "0");
      var1.putExtra(this.getResources().getString(2131492876), "0");
      this.startService(var1);
   }

   private void e() {
      MyLog.log("onActionTips");
      String var1;
      if (App.c) {
         var1 = "http://www.100dof.com/software/morsenotifier/manual_morse_notifier.pdf";
      } else {
         var1 = "http://www.100dof.com/software/voicenotifier/manual_voice_notifier.pdf";
      }

      Uri var2 = Uri.parse(var1);
      Intent var4 = new Intent("android.intent.action.VIEW");
      var4.setDataAndType(var2, "application/pdf");

      try {
         this.startActivity(var4);
      } catch (Exception var3) {
         Builder var5;
         if (VERSION.SDK_INT >= 21) {
            var5 = new Builder(this, 16974374);
         } else {
            var5 = new Builder(this);
         }

         var5.setTitle("Open pdf failed").setMessage("You will need a pdf viewer to open the user guide. Would you like to find one in Google Play?").setPositiveButton(17039379, new android.content.DialogInterface.OnClickListener() {
            public void onClick(DialogInterface var1, int var2) {
               Intent var4 = (new Intent("android.intent.action.VIEW")).setData(Uri.parse("market://search?q=pdf"));

               try {
                  ActivityMain.this.startActivity(var4);
               } catch (Exception var3) {
                  MyLog.toast(ActivityMain.this, "Could not open Google Play");
               }
            }
         }).setNegativeButton(17039369, new android.content.DialogInterface.OnClickListener() {
            public void onClick(DialogInterface var1, int var2) {
            }
         }).setIcon(17301543).show();
      }
   }

   private void f() {
      MyLog.log("onActionServiceCommand");
      this.startActivity(new Intent(this, ActivityAdvanced.class));
   }

   private void g() {
      MyLog.log("ActivityMain.checkPermissions");
      if (ContextCompat.checkSelfPermission(this, "android.permission.READ_PHONE_STATE") == 0 && ContextCompat.checkSelfPermission(this, "android.permission.READ_SMS") == 0 && ContextCompat.checkSelfPermission(this, "android.permission.READ_CONTACTS") == 0 && ContextCompat.checkSelfPermission(this, "android.permission.READ_CALL_LOG") == 0) {
         MyLog.log("ActivityMain.checkPermissions all permissions granted");
      } else if (App.a(this, "PERMISSIONS")) {
         MyLog.log("ActivityMain.checkPermissions question_AlreadyAsked");
         MyLog.toast(this, "Permissions needed!");
      } else {
         App.b(this, "PERMISSIONS");
         ActivityCompat.requestPermissions(this, new String[]{"android.permission.READ_PHONE_STATE", "android.permission.READ_SMS", "android.permission.READ_CONTACTS", "android.permission.READ_CALL_LOG"}, 100);
      }
   }

   private void h() {
      MyLog.log("ActivityMain.checkNotificationAccess");
      if (!Boolean.valueOf(this.getResources().getBoolean(2130903041))) {
         MyLog.log("ActivityMain.checkNotificationAccess api18=false");
      } else if (App.a) {
         MyLog.log("ActivityMain.checkNotificationAccess Free version");
      } else if (ActivityAdvanced.a((Activity)this)) {
         MyLog.log("ActivityMain.checkNotificationAccess collector is running");
      } else if (App.a(this, "NOTIFICATIONACCESS")) {
         MyLog.log("ActivityMain.checkNotificationAccess question_AlreadyAsked");
         MyLog.toast(this, "No notification access!");
      } else {
         App.b(this, "NOTIFICATIONACCESS");
         (new Builder(this)).setTitle(2131493257).setMessage(this.getResources().getText(2131493300).toString().replace("$BRAND$", App.g).replace("$APPNAME$", App.e)).setPositiveButton(17039379, new android.content.DialogInterface.OnClickListener() {
            public void onClick(DialogInterface var1, int var2) {
               MyLog.log("ActivityMain.checkNotificationAccess: collector is not running. Opening settings...");
               var2 = VERSION.SDK_INT;
               ActivityMain.this.startActivity(new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"));
            }
         }).setNegativeButton(17039369, new android.content.DialogInterface.OnClickListener() {
            public void onClick(DialogInterface var1, int var2) {
            }
         }).setIcon(17301543).show();
      }
   }

   private void i() {
      label48: {
         if (App.h || App.i || App.j) {
            if (App.a(this, "AUTOSTART")) {
               break label48;
            }

            App.b(this, "AUTOSTART");
            (new Builder(this)).setTitle(2131493253).setMessage(this.getResources().getText(2131493299).toString().replace("$BRAND$", App.g).replace("$APPNAME$", App.e)).setPositiveButton(17039370, new android.content.DialogInterface.OnClickListener() {
               public void onClick(DialogInterface var1, int var2) {
                  ActivityAdvanced.a((Context)ActivityMain.this);
               }
            }).setNegativeButton(17039369, new android.content.DialogInterface.OnClickListener() {
               public void onClick(DialogInterface var1, int var2) {
               }
            }).setIcon(17301543).show();
         }

         if (App.h || App.i) {
            if (App.a(this, "POWERSAVE")) {
               break label48;
            }

            App.b(this, "POWERSAVE");
            (new Builder(this)).setTitle(2131493275).setMessage(this.getResources().getText(2131493301).toString().replace("$BRAND$", App.g).replace("$APPNAME$", App.e)).setPositiveButton(17039370, new android.content.DialogInterface.OnClickListener() {
               public void onClick(DialogInterface var1, int var2) {
                  ActivityAdvanced.b((Context)ActivityMain.this);
               }
            }).setNegativeButton(17039369, new android.content.DialogInterface.OnClickListener() {
               public void onClick(DialogInterface var1, int var2) {
               }
            }).setIcon(17301543).show();
         }

         if (!App.k) {
            return;
         }

         if (!App.a(this, "PROTECTEDAPPS")) {
            App.b(this, "PROTECTEDAPPS");
            (new Builder(this)).setTitle(2131493279).setMessage(this.getResources().getText(2131493302).toString().replace("$BRAND$", App.g).replace("$APPNAME$", App.e)).setPositiveButton(17039370, new android.content.DialogInterface.OnClickListener() {
               public void onClick(DialogInterface var1, int var2) {
                  ActivityAdvanced.c(ActivityMain.this);
               }
            }).setNegativeButton(17039369, new android.content.DialogInterface.OnClickListener() {
               public void onClick(DialogInterface var1, int var2) {
               }
            }).setIcon(17301543).show();
            return;
         }
      }

      MyLog.log("ActivityMain.checkAutostart question_AlreadyAsked");
   }

   protected void onActivityResult(int var1, int var2, Intent var3) {
      MyLog.log("ActivityMain.onActivityResult");
      if (var1 == 1) {
         App.c(this.getApplicationContext());
      }

   }

   public void onClick(View var1) {
      if (var1 != null) {
         switch(var1.getId()) {
         case 2131165206:
            this.b();
            return;
         case 2131165210:
            this.e();
            return;
         case 2131165212:
            this.c();
            return;
         case 2131165213:
            this.f();
            return;
         case 2131165216:
            this.a();
            return;
         case 2131165217:
            this.d();
            return;
         default:
         }
      }
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.setContentView(2131296261);
      ((Button)this.findViewById(2131165216)).setOnClickListener(this);
      ((Button)this.findViewById(2131165206)).setOnClickListener(this);
      ((Button)this.findViewById(2131165212)).setOnClickListener(this);
      ((Button)this.findViewById(2131165217)).setOnClickListener(this);
      ((Button)this.findViewById(2131165210)).setOnClickListener(this);
      ((Button)this.findViewById(2131165213)).setOnClickListener(this);
      Intent var4 = new Intent(this, ServiceMain.class);
      var4.putExtra(this.getResources().getString(2131492900), this.getResources().getString(2131492878));
      this.startService(var4);
      MyLog.log("ActivityMain.oncreate");
      if ("MorseNotifierPro".equals("pro")) {
         MyLog.log("ActivityMain.oncreate ispro");
         boolean var2 = false;
         boolean var3 = var2;
         if (App.c) {
            var3 = var2;
            if (this.a("com.dof100.morsenotifier.free")) {
               var3 = true;
            }
         }

         var2 = var3;
         if (App.d) {
            var2 = var3;
            if (this.a("com.dof100.voicenotifier.free")) {
               var2 = true;
            }
         }

         if (var2) {
            (new Builder(this)).setTitle(2131493323).setMessage(2131493322).setPositiveButton(17039370, new android.content.DialogInterface.OnClickListener() {
               public void onClick(DialogInterface var1, int var2) {
               }
            }).setIcon(17301543).show();
            return;
         }
      } else {
         MyLog.log("ActivityMain.oncreate isfree");
      }

   }

   public boolean onCreateOptionsMenu(Menu var1) {
      this.getMenuInflater().inflate(2131361792, var1);
      return super.onCreateOptionsMenu(var1);
   }

   public boolean onOptionsItemSelected(MenuItem var1) {
      if (var1.getItemId() == 2131165188) {
         this.a();
         return true;
      } else {
         return super.onOptionsItemSelected(var1);
      }
   }

   protected void onPause() {
      this.a.removeCallbacks(this.b);
      super.onPause();
   }

   public void onRequestPermissionsResult(int var1, String[] var2, int[] var3) {
      MyLog.log("ActivityMain.onRequestPermissionsResult");
   }

   protected void onResume() {
      super.onResume();
      this.a.postDelayed(this.b, 2000L);
   }
}
