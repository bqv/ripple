package com.dof100.morsenotifier;

import android.app.Activity;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.preference.PreferenceManager;
import android.support.p000v4.p001a.C0014b;
import com.evernote.android.job.C0192f;
import com.evernote.android.job.C0200i;

public class App extends Application {

    /* renamed from: a */
    public static boolean f282a = false;

    /* renamed from: b */
    public static boolean f283b = true;

    /* renamed from: c */
    public static boolean f284c = true;

    /* renamed from: d */
    public static boolean f285d = false;

    /* renamed from: e */
    public static String f286e = "";

    /* renamed from: f */
    public static String f287f = "";

    /* renamed from: g */
    public static String f288g = "";

    /* renamed from: h */
    public static boolean f289h = false;

    /* renamed from: i */
    public static boolean f290i = false;

    /* renamed from: j */
    public static boolean f291j = false;

    /* renamed from: k */
    public static boolean f292k = false;

    /* renamed from: l */
    public static String f293l = "";

    /* renamed from: m */
    public static String f294m = "";

    /* renamed from: n */
    private static boolean f295n = true;

    /* renamed from: o */
    private static boolean f296o = false;

    /* renamed from: p */
    private static boolean f297p = false;

    /* renamed from: q */
    private static C0149l f298q;

    /* renamed from: a */
    public static C0149l m426a(Context context) {
        if (f298q == null) {
            f298q = new C0149l(context, 0);
        }
        return f298q;
    }

    /* renamed from: a */
    public static void m427a(Context context, int i) {
        Intent intent = new Intent();
        intent.setAction("LBR_ACTION_SETPOS");
        intent.putExtra("LBR_ACTION_DATA_POS", i);
        C0014b.m1a(context).mo3a(intent);
    }

    /* renamed from: a */
    public static boolean m428a(Activity activity, String str) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(activity);
        return defaultSharedPreferences.getBoolean("question_asked_" + str, false);
    }

    /* renamed from: b */
    public static void m429b(Activity activity, String str) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(activity).edit();
        edit.putBoolean("question_asked_" + str, true).apply();
    }

    /* renamed from: b */
    public static void m430b(Context context) {
        C0140i.m500a(context, "App.broadcastFinish sending LBR_ACTION_FINISH");
        Intent intent = new Intent();
        intent.setAction("LBR_ACTION_FINISH");
        C0014b.m1a(context).mo3a(intent);
    }

    /* renamed from: c */
    public static void m431c(Context context) {
        C0140i.m501a("App.broadcastSettingsChanged sending LBR_ACTION_SETTINGSCHANGED");
        Intent intent = new Intent();
        intent.setAction("LBR_ACTION_SETTINGSCHANGED");
        C0014b.m1a(context.getApplicationContext()).mo3a(intent);
    }

    /* renamed from: d */
    public static void m432d(Context context) {
        C0140i.m501a("App.broadcastSettingsChanged sending LBR_ACTION_RECENTNOTIFICATIONSCHANGED");
        Intent intent = new Intent();
        intent.setAction("LBR_ACTION_RECENTNOTIFICATIONSCHANGED");
        C0014b.m1a(context.getApplicationContext()).mo3a(intent);
    }

    public void onCreate() {
        super.onCreate();
        C0140i.m498a((Context) this);
        C0140i.m501a("App.onCreate");
        f295n = false;
        boolean z = true;
        f296o = true;
        f282a = "MorseNotifierPro".contains("Free");
        f283b = "MorseNotifierPro".contains("Pro");
        f284c = "MorseNotifierPro".contains("Morse");
        f285d = "MorseNotifierPro".contains("Voice");
        try {
            if (((UiModeManager) getSystemService("uimode")).getCurrentModeType() != 4) {
                z = false;
            }
            f297p = z;
        } catch (Exception unused) {
            f297p = false;
        }
        if (f295n) {
            C0140i.m501a("App.onCreate debug build");
        }
        if (f296o) {
            C0140i.m501a("App.onCreate release build");
        }
        if (f284c) {
            C0140i.m501a("App.onCreate flavor=MorseNotifier");
        }
        if (f285d) {
            C0140i.m501a("App.onCreate flavor=VoiceNotifier");
        }
        if (f282a) {
            C0140i.m501a("App.onCreate flavor=free");
        }
        if (f283b) {
            C0140i.m501a("App.onCreate flavor=pro");
        }
        if (f297p) {
            C0140i.m501a("App.onCreate Running on TV");
        }
        f286e = getString(getApplicationInfo().labelRes);
        try {
            f287f = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        f288g = Build.MANUFACTURER;
        f289h = "xiaomi".equalsIgnoreCase(f288g);
        f290i = "oppo".equalsIgnoreCase(f288g);
        f291j = "vivo".equalsIgnoreCase(f288g);
        f292k = "huawei".equalsIgnoreCase(f288g);
        if (f295n) {
            C0140i.m501a("App.onCreate brand=" + f288g);
        }
        f293l = "market://details?id=" + getPackageName();
        f294m = f293l.replace(".free", "");
        f298q = null;
        C0140i.m501a("App.onCreate Initializing job manager...");
        C0200i.m735a((Context) this).mo648a((C0192f) new C0139h());
    }
}
