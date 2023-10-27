package com.dof100.morsenotifier;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.p000v4.app.C0019a;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ActivityMain extends Activity implements View.OnClickListener {

    /* renamed from: a */
    private final Handler f248a = new Handler();

    /* renamed from: b */
    private final Runnable f249b = new Runnable() {
        public void run() {
            ActivityMain.this.m415g();
            ActivityMain.this.m416h();
            ActivityMain.this.m417i();
        }
    };

    /* renamed from: a */
    private void m405a() {
        C0140i.m501a("ActivityMain.onActionSettings");
        Intent intent = new Intent(this, MyPreferencesActivity.class);
        C0140i.m501a("ActivityMain.onActionSettings before startActivityForResult");
        startActivityForResult(intent, 1);
    }

    /* renamed from: a */
    private boolean m407a(String str) {
        PackageManager packageManager = getPackageManager();
        try {
            packageManager.getPackageInfo(str, 1);
            return packageManager.getApplicationInfo(str, 0).enabled;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    private void m408b() {
        C0140i.m501a("onActionAbout");
        Intent intent = new Intent(this, ActivityHTML.class);
        intent.putExtra("TITLE", "About");
        intent.putExtra("FILENAME", "about.html");
        intent.putExtra("VERTICALALIGN", "top");
        intent.putExtra("BUTTONOKCAPTION", "OK");
        startActivity(intent);
    }

    /* renamed from: c */
    private void m410c() {
        C0140i.m501a("onActionRate");
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + getPackageName())));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    private void m412d() {
        C0140i.m501a("onActionTest");
        Intent intent = new Intent(this, ServiceMain.class);
        intent.putExtra(getResources().getString(R.string.MSG_WHAT), getResources().getString(R.string.MSG_MN_TEST));
        intent.putExtra(getResources().getString(R.string.MSG_EXTRATEXT1), "0");
        intent.putExtra(getResources().getString(R.string.MSG_EXTRATEXT2), "0");
        startService(intent);
    }

    /* renamed from: e */
    private void m413e() {
        C0140i.m501a("onActionTips");
        Uri parse = Uri.parse(App.f284c ? "http://www.100dof.com/software/morsenotifier/manual_morse_notifier.pdf" : "http://www.100dof.com/software/voicenotifier/manual_voice_notifier.pdf");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(parse, "application/pdf");
        try {
            startActivity(intent);
        } catch (Exception unused) {
            (Build.VERSION.SDK_INT >= 21 ? new AlertDialog.Builder(this, 16974374) : new AlertDialog.Builder(this)).setTitle("Open pdf failed").setMessage("You will need a pdf viewer to open the user guide. Would you like to find one in Google Play?").setPositiveButton(17039379, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    try {
                        ActivityMain.this.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse("market://search?q=pdf")));
                    } catch (Exception unused) {
                        C0140i.m502b(ActivityMain.this, "Could not open Google Play");
                    }
                }
            }).setNegativeButton(17039369, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            }).setIcon(17301543).show();
        }
    }

    /* renamed from: f */
    private void m414f() {
        C0140i.m501a("onActionServiceCommand");
        startActivity(new Intent(this, ActivityAdvanced.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m415g() {
        C0140i.m501a("ActivityMain.checkPermissions");
        if (C0019a.m0a(this, "android.permission.READ_PHONE_STATE") == 0 && C0019a.m0a(this, "android.permission.READ_SMS") == 0 && C0019a.m0a(this, "android.permission.READ_CONTACTS") == 0) {
            C0140i.m501a("ActivityMain.checkPermissions all permissions granted");
        } else if (App.m428a((Activity) this, "PERMISSIONS")) {
            C0140i.m501a("ActivityMain.checkPermissions question_AlreadyAsked");
            C0140i.m502b(this, "Permissions needed!");
        } else {
            App.m429b(this, "PERMISSIONS");
            C0019a.m7a(this, new String[]{"android.permission.READ_PHONE_STATE", "android.permission.READ_SMS", "android.permission.READ_CONTACTS"}, 100);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m416h() {
        C0140i.m501a("ActivityMain.checkNotificationAccess");
        if (!Boolean.valueOf(getResources().getBoolean(R.bool.enableFeaturesAPI18)).booleanValue()) {
            C0140i.m501a("ActivityMain.checkNotificationAccess api18=false");
        } else if (App.f282a) {
            C0140i.m501a("ActivityMain.checkNotificationAccess Free version");
        } else if (ActivityAdvanced.m379a((Activity) this)) {
            C0140i.m501a("ActivityMain.checkNotificationAccess collector is running");
        } else if (App.m428a((Activity) this, "NOTIFICATIONACCESS")) {
            C0140i.m501a("ActivityMain.checkNotificationAccess question_AlreadyAsked");
            C0140i.m502b(this, "No notification access!");
        } else {
            App.m429b(this, "NOTIFICATIONACCESS");
            new AlertDialog.Builder(this).setTitle(R.string.string_advanced_notificationlistener).setMessage(getResources().getText(R.string.string_notify_notificationlistener).toString().replace("$BRAND$", App.f288g).replace("$APPNAME$", App.f286e)).setPositiveButton(17039379, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    C0140i.m501a("ActivityMain.checkNotificationAccess: collector is not running. Opening settings...");
                    int i2 = Build.VERSION.SDK_INT;
                    ActivityMain.this.startActivity(new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"));
                }
            }).setNegativeButton(17039369, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            }).setIcon(17301543).show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m417i() {
        if (App.f289h || App.f290i || App.f291j) {
            if (!App.m428a((Activity) this, "AUTOSTART")) {
                App.m429b(this, "AUTOSTART");
                new AlertDialog.Builder(this).setTitle(R.string.string_advanced_autostart).setMessage(getResources().getText(R.string.string_notify_autostart_text).toString().replace("$BRAND$", App.f288g).replace("$APPNAME$", App.f286e)).setPositiveButton(17039370, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ActivityAdvanced.m377a(this);
                    }
                }).setNegativeButton(17039369, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).setIcon(17301543).show();
            }
            C0140i.m501a("ActivityMain.checkAutostart question_AlreadyAsked");
        }
        if (App.f289h || App.f290i) {
            if (!App.m428a((Activity) this, "POWERSAVE")) {
                App.m429b(this, "POWERSAVE");
                new AlertDialog.Builder(this).setTitle(R.string.string_advanced_powersave).setMessage(getResources().getText(R.string.string_notify_powersave_text).toString().replace("$BRAND$", App.f288g).replace("$APPNAME$", App.f286e)).setPositiveButton(17039370, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ActivityAdvanced.m382b(this);
                    }
                }).setNegativeButton(17039369, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).setIcon(17301543).show();
            }
            C0140i.m501a("ActivityMain.checkAutostart question_AlreadyAsked");
        }
        if (App.f292k) {
            if (!App.m428a((Activity) this, "PROTECTEDAPPS")) {
                App.m429b(this, "PROTECTEDAPPS");
                new AlertDialog.Builder(this).setTitle(R.string.string_advanced_protectedapps).setMessage(getResources().getText(R.string.string_notify_protectedapps_text).toString().replace("$BRAND$", App.f288g).replace("$APPNAME$", App.f286e)).setPositiveButton(17039370, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ActivityAdvanced.m383c(this);
                    }
                }).setNegativeButton(17039369, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).setIcon(17301543).show();
                return;
            }
            C0140i.m501a("ActivityMain.checkAutostart question_AlreadyAsked");
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        C0140i.m501a("ActivityMain.onActivityResult");
        if (i == 1) {
            App.m431c(getApplicationContext());
        }
    }

    public void onClick(View view) {
        if (view != null) {
            switch (view.getId()) {
                case R.id.button_about /*2131165206*/:
                    m408b();
                    return;
                case R.id.button_instructions /*2131165210*/:
                    m413e();
                    return;
                case R.id.button_rate /*2131165212*/:
                    m410c();
                    return;
                case R.id.button_service_command /*2131165213*/:
                    m414f();
                    return;
                case R.id.button_settings /*2131165216*/:
                    m405a();
                    return;
                case R.id.button_test /*2131165217*/:
                    m412d();
                    return;
                default:
                    return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        ((Button) findViewById(R.id.button_settings)).setOnClickListener(this);
        ((Button) findViewById(R.id.button_about)).setOnClickListener(this);
        ((Button) findViewById(R.id.button_rate)).setOnClickListener(this);
        ((Button) findViewById(R.id.button_test)).setOnClickListener(this);
        ((Button) findViewById(R.id.button_instructions)).setOnClickListener(this);
        ((Button) findViewById(R.id.button_service_command)).setOnClickListener(this);
        Intent intent = new Intent(this, ServiceMain.class);
        intent.putExtra(getResources().getString(R.string.MSG_WHAT), getResources().getString(R.string.MSG_MN_ACTIVITYMAIN));
        startService(intent);
        C0140i.m501a("ActivityMain.oncreate");
        if ("MorseNotifierPro".equals("pro")) {
            C0140i.m501a("ActivityMain.oncreate ispro");
            boolean z = false;
            if (App.f284c && m407a("com.dof100.morsenotifier.free")) {
                z = true;
            }
            if (App.f285d && m407a("com.dof100.voicenotifier.free")) {
                z = true;
            }
            if (z) {
                new AlertDialog.Builder(this).setTitle(R.string.uninstall_free_title).setMessage(R.string.uninstall_free_text).setPositiveButton(17039370, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).setIcon(17301543).show();
                return;
            }
            return;
        }
        C0140i.m501a("ActivityMain.oncreate isfree");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_settings) {
            return super.onOptionsItemSelected(menuItem);
        }
        m405a();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        this.f248a.removeCallbacks(this.f249b);
        super.onPause();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C0140i.m501a("ActivityMain.onRequestPermissionsResult");
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f248a.postDelayed(this.f249b, 2000);
    }
}
