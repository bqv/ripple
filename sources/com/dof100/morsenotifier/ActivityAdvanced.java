package com.dof100.morsenotifier;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.support.p000v4.app.C0019a;
import android.support.p000v4.app.C0038f;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;

public class ActivityAdvanced extends Activity implements View.OnClickListener {

    /* renamed from: a */
    private EditText f187a = null;

    /* renamed from: b */
    private TextView f188b = null;

    /* renamed from: c */
    private TextView f189c = null;

    /* renamed from: d */
    private TextView f190d = null;

    /* renamed from: e */
    private TextView f191e = null;

    /* renamed from: f */
    private LinearLayout f192f = null;

    /* renamed from: g */
    private TextView f193g = null;

    /* renamed from: h */
    private LinearLayout f194h = null;

    /* renamed from: i */
    private TextView f195i = null;

    /* renamed from: j */
    private LinearLayout f196j = null;

    /* renamed from: k */
    private TextView f197k = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Handler f198l = new Handler();

    /* renamed from: m */
    private final Runnable f199m = new Runnable() {
        public void run() {
            ActivityAdvanced.this.m376a();
            ActivityAdvanced.this.f198l.postDelayed(this, 3000);
        }
    };

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m376a() {
        TextView textView;
        int i;
        if (C0019a.m0a(this, "android.permission.READ_PHONE_STATE") == 0) {
            this.f188b.setText(R.string.string_advanced_permissions_readphonestate_granted);
            this.f188b.setTextColor(-16711936);
        } else {
            this.f188b.setText(R.string.string_advanced_permissions_readphonestate_denied);
            this.f188b.setTextColor(-65536);
        }
        if (C0019a.m0a(this, "android.permission.READ_SMS") == 0) {
            this.f189c.setText(R.string.string_advanced_permissions_readsms_granted);
            this.f189c.setTextColor(-16711936);
        } else {
            this.f189c.setText(R.string.string_advanced_permissions_readsms_denied);
            this.f189c.setTextColor(-65536);
        }
        if (C0019a.m0a(this, "android.permission.READ_CONTACTS") == 0) {
            this.f190d.setText(R.string.string_advanced_permissions_readcontacts_granted);
            this.f190d.setTextColor(-16711936);
        } else {
            this.f190d.setText(R.string.string_advanced_permissions_readcontacts_denied);
            this.f190d.setTextColor(-65536);
        }
        if (!App.f283b) {
            this.f191e.setText(R.string.string_advanced_notificationlistener_disabled);
            this.f191e.setEnabled(false);
            this.f191e.setTextColor(-7829368);
        } else if (m379a((Activity) this)) {
            this.f191e.setText(R.string.string_advanced_notificationlistener_running);
            this.f191e.setTextColor(-16711936);
        } else {
            this.f191e.setTextColor(-65536);
            if (m384d(this)) {
                textView = this.f191e;
                i = R.string.string_advanced_notificationlistener_notrunning;
            } else {
                textView = this.f191e;
                i = R.string.string_advanced_notificationlistener_notenabled;
            }
            textView.setText(i);
        }
        if (App.f289h || App.f290i || App.f291j) {
            this.f192f.setVisibility(0);
            this.f193g.setText(getResources().getText(R.string.string_advanced_autostart_text).toString().replace("$BRAND$", App.f288g).replace("$APPNAME$", App.f286e));
        } else {
            this.f192f.setVisibility(8);
        }
        if (App.f289h || App.f290i) {
            this.f194h.setVisibility(0);
            this.f195i.setText(getResources().getText(R.string.string_advanced_powersave_text).toString().replace("$BRAND$", App.f288g).replace("$APPNAME$", App.f286e));
        } else {
            this.f194h.setVisibility(8);
        }
        if (App.f292k) {
            this.f196j.setVisibility(0);
            this.f197k.setText(getResources().getText(R.string.string_advanced_protectedapps_text).toString().replace("$BRAND$", App.f288g).replace("$APPNAME$", App.f286e));
            return;
        }
        this.f196j.setVisibility(8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006d A[Catch:{ Exception -> 0x0075 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m377a(android.content.Context r5) {
        /*
            boolean r0 = com.dof100.morsenotifier.App.f289h
            if (r0 != 0) goto L_0x000d
            boolean r0 = com.dof100.morsenotifier.App.f290i
            if (r0 != 0) goto L_0x000d
            boolean r0 = com.dof100.morsenotifier.App.f291j
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0075 }
            r0.<init>()     // Catch:{ Exception -> 0x0075 }
            boolean r1 = com.dof100.morsenotifier.App.f289h     // Catch:{ Exception -> 0x0075 }
            r2 = 65536(0x10000, float:9.18355E-41)
            if (r1 == 0) goto L_0x0025
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch:{ Exception -> 0x0075 }
            java.lang.String r3 = "com.miui.securitycenter"
            java.lang.String r4 = "com.miui.permcenter.autostart.AutoStartManagementActivity"
            r1.<init>(r3, r4)     // Catch:{ Exception -> 0x0075 }
        L_0x0021:
            r0.setComponent(r1)     // Catch:{ Exception -> 0x0075 }
            goto L_0x005b
        L_0x0025:
            boolean r1 = com.dof100.morsenotifier.App.f290i     // Catch:{ Exception -> 0x0075 }
            if (r1 == 0) goto L_0x0033
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch:{ Exception -> 0x0075 }
            java.lang.String r3 = "com.coloros.safecenter"
            java.lang.String r4 = "com.coloros.safecenter.permission.startup.StartupAppListActivity"
            r1.<init>(r3, r4)     // Catch:{ Exception -> 0x0075 }
            goto L_0x0021
        L_0x0033:
            boolean r1 = com.dof100.morsenotifier.App.f291j     // Catch:{ Exception -> 0x0075 }
            if (r1 == 0) goto L_0x005b
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch:{ Exception -> 0x0075 }
            java.lang.String r3 = "com.vivo.permissionmanager"
            java.lang.String r4 = "com.vivo.permissionmanager.activity.BgStartUpManagerActivity"
            r1.<init>(r3, r4)     // Catch:{ Exception -> 0x0075 }
            r0.setComponent(r1)     // Catch:{ Exception -> 0x0075 }
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch:{ Exception -> 0x0075 }
            java.util.List r1 = r1.queryIntentActivities(r0, r2)     // Catch:{ Exception -> 0x0075 }
            int r1 = r1.size()     // Catch:{ Exception -> 0x0075 }
            if (r1 != 0) goto L_0x005b
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch:{ Exception -> 0x0075 }
            java.lang.String r3 = "com.iqoo.secure"
            java.lang.String r4 = "com.iqoo.secure.MainGuideActivity."
            r1.<init>(r3, r4)     // Catch:{ Exception -> 0x0075 }
            goto L_0x0021
        L_0x005b:
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch:{ Exception -> 0x0075 }
            java.util.List r1 = r1.queryIntentActivities(r0, r2)     // Catch:{ Exception -> 0x0075 }
            int r1 = r1.size()     // Catch:{ Exception -> 0x0075 }
            if (r1 <= 0) goto L_0x006d
        L_0x0069:
            r5.startActivity(r0)     // Catch:{ Exception -> 0x0075 }
            return
        L_0x006d:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0075 }
            java.lang.String r1 = "android.settings.SETTINGS"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0075 }
            goto L_0x0069
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dof100.morsenotifier.ActivityAdvanced.m377a(android.content.Context):void");
    }

    /* renamed from: a */
    public static boolean m379a(Activity activity) {
        List<ActivityManager.RunningServiceInfo> list;
        boolean z = false;
        if (!Boolean.valueOf(activity.getResources().getBoolean(R.bool.enableFeaturesAPI18)).booleanValue()) {
            C0140i.m501a("ActivityMain.isCollectorRunning. Notifications are disabled");
            return false;
        }
        ComponentName componentName = new ComponentName(activity, ServiceNotifications.class);
        int myPid = Process.myPid();
        try {
            list = ((ActivityManager) activity.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE);
        } catch (Exception unused) {
            list = null;
        }
        if (list == null) {
            C0140i.m501a("ActivityMain.isCollectorRunning. getRunningServices returned NULL");
            return true;
        }
        for (ActivityManager.RunningServiceInfo next : list) {
            if (next.service.equals(componentName) && next.pid == myPid) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m381b() {
        /*
            r6 = this;
            android.widget.EditText r0 = r6.f187a
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r0 = r0.trim()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ActivityMain.onActionOK command="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.dof100.morsenotifier.C0140i.m501a((java.lang.String) r1)
            java.lang.String r1 = "recent notifications on"
            boolean r1 = r0.startsWith(r1)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0042
            com.dof100.morsenotifier.n r1 = new com.dof100.morsenotifier.n
            r1.<init>(r6)
            r1.mo506a(r6, r3)
            com.dof100.morsenotifier.App.m432d(r6)
            java.lang.String r1 = "Recent notifications enabled."
        L_0x003d:
            com.dof100.morsenotifier.C0140i.m502b(r6, r1)
            goto L_0x0146
        L_0x0042:
            java.lang.String r1 = "recent notifications off"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L_0x0058
            com.dof100.morsenotifier.n r1 = new com.dof100.morsenotifier.n
            r1.<init>(r6)
            r1.mo506a(r6, r2)
            com.dof100.morsenotifier.App.m432d(r6)
            java.lang.String r1 = "Recent notifications disabled."
            goto L_0x003d
        L_0x0058:
            java.lang.String r1 = "recent notifications clear"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L_0x006e
            com.dof100.morsenotifier.n r1 = new com.dof100.morsenotifier.n
            r1.<init>(r6)
            r1.mo505a(r6)
            com.dof100.morsenotifier.App.m432d(r6)
            java.lang.String r1 = "Recent notifications cleared."
            goto L_0x003d
        L_0x006e:
            java.lang.String r1 = "log"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L_0x0106
            java.lang.String r1 = "ActivityMain.onActionOK command contains log"
            com.dof100.morsenotifier.C0140i.m501a((java.lang.String) r1)
            java.lang.String r1 = "cl"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x00ff
            java.lang.String r1 = "del"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L_0x008d
            goto L_0x00ff
        L_0x008d:
            java.lang.String r1 = "cl"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x00ff
            java.lang.String r1 = "del"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L_0x009e
            goto L_0x00ff
        L_0x009e:
            java.lang.String r1 = "sh"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x00fb
            java.lang.String r1 = "display"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x00fb
            java.lang.String r1 = "view"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L_0x00b7
            goto L_0x00fb
        L_0x00b7:
            java.lang.String r1 = "on"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x00e8
            java.lang.String r1 = "en"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L_0x00c8
            goto L_0x00e8
        L_0x00c8:
            java.lang.String r1 = "off"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x00d8
            java.lang.String r1 = "dis"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L_0x0145
        L_0x00d8:
            java.lang.String r1 = "Log file disabled"
            com.dof100.morsenotifier.C0140i.m501a((java.lang.String) r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            com.dof100.morsenotifier.C0140i.m499a((android.content.Context) r6, (java.lang.Boolean) r1)
            java.lang.String r1 = "Log file disabled"
            goto L_0x003d
        L_0x00e8:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            com.dof100.morsenotifier.C0140i.m499a((android.content.Context) r6, (java.lang.Boolean) r1)
            java.lang.String r1 = "Log file enabled"
            com.dof100.morsenotifier.C0140i.m501a((java.lang.String) r1)
            com.dof100.morsenotifier.C0140i.m498a((android.content.Context) r6)
            java.lang.String r1 = "Log file enabled"
            goto L_0x003d
        L_0x00fb:
            com.dof100.morsenotifier.C0140i.m497a((android.app.Activity) r6)
            goto L_0x0146
        L_0x00ff:
            com.dof100.morsenotifier.C0140i.m498a((android.content.Context) r6)
            java.lang.String r1 = "Log file cleared."
            goto L_0x003d
        L_0x0106:
            java.lang.String r1 = "play "
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L_0x0145
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.dof100.morsenotifier.ServiceMain> r2 = com.dof100.morsenotifier.ServiceMain.class
            r1.<init>(r6, r2)
            android.content.res.Resources r2 = r6.getResources()
            r4 = 2131492900(0x7f0c0024, float:1.8609265E38)
            java.lang.String r2 = r2.getString(r4)
            android.content.res.Resources r4 = r6.getResources()
            r5 = 2131492865(0x7f0c0001, float:1.8609194E38)
            java.lang.String r4 = r4.getString(r5)
            r1.putExtra(r2, r4)
            android.content.res.Resources r2 = r6.getResources()
            r4 = 2131492876(0x7f0c000c, float:1.8609216E38)
            java.lang.String r2 = r2.getString(r4)
            r4 = 5
            java.lang.String r4 = r0.substring(r4)
            r1.putExtra(r2, r4)
            r6.startService(r1)
            goto L_0x0146
        L_0x0145:
            r3 = 0
        L_0x0146:
            if (r3 != 0) goto L_0x015c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown service command: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.dof100.morsenotifier.C0140i.m502b(r6, r0)
        L_0x015c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dof100.morsenotifier.ActivityAdvanced.m381b():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043 A[Catch:{ Exception -> 0x004b }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m382b(android.content.Context r4) {
        /*
            boolean r0 = com.dof100.morsenotifier.App.f289h
            if (r0 != 0) goto L_0x0009
            boolean r0 = com.dof100.morsenotifier.App.f290i
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x004b }
            r0.<init>()     // Catch:{ Exception -> 0x004b }
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch:{ Exception -> 0x004b }
            java.lang.String r2 = "com.miui.securitycenter"
            java.lang.String r3 = "com.miui.permcenter.autostart.AutoStartManagementActivity"
            r1.<init>(r2, r3)     // Catch:{ Exception -> 0x004b }
            r0.setComponent(r1)     // Catch:{ Exception -> 0x004b }
            boolean r1 = com.dof100.morsenotifier.App.f289h     // Catch:{ Exception -> 0x004b }
            if (r1 == 0) goto L_0x0026
            java.lang.String r1 = "com.miui.powerkeeper"
            java.lang.String r2 = "com.miui.powerkeeper.ui.HiddenAppsContainerManagementActivity"
        L_0x0022:
            r0.setClassName(r1, r2)     // Catch:{ Exception -> 0x004b }
            goto L_0x002f
        L_0x0026:
            boolean r1 = com.dof100.morsenotifier.App.f290i     // Catch:{ Exception -> 0x004b }
            if (r1 == 0) goto L_0x002f
            java.lang.String r1 = "com.coloros.oppoguardelf"
            java.lang.String r2 = "com.coloros.powermanager.fuelgaue.PowerConsumptionActivity"
            goto L_0x0022
        L_0x002f:
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ Exception -> 0x004b }
            r2 = 65536(0x10000, float:9.18355E-41)
            java.util.List r1 = r1.queryIntentActivities(r0, r2)     // Catch:{ Exception -> 0x004b }
            int r1 = r1.size()     // Catch:{ Exception -> 0x004b }
            if (r1 <= 0) goto L_0x0043
        L_0x003f:
            r4.startActivity(r0)     // Catch:{ Exception -> 0x004b }
            return
        L_0x0043:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x004b }
            java.lang.String r1 = "android.settings.SETTINGS"
            r0.<init>(r1)     // Catch:{ Exception -> 0x004b }
            goto L_0x003f
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dof100.morsenotifier.ActivityAdvanced.m382b(android.content.Context):void");
    }

    /* renamed from: c */
    public static void m383c(Context context) {
        if (App.f292k) {
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.optimize.process.ProtectActivity"));
                if (context.getPackageManager().queryIntentActivities(intent, 65536).size() <= 0) {
                    intent = new Intent("android.settings.SETTINGS");
                }
                context.startActivity(intent);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    private static boolean m384d(Context context) {
        return C0038f.m50a(context).contains(context.getPackageName());
    }

    /* renamed from: e */
    private static void m385e(Context context) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", context.getPackageName(), (String) null));
            context.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    private static void m386f(Context context) {
        String str;
        String str2;
        if (App.f282a) {
            C0140i.m502b(context, "App notifications are only available in the pro version");
        } else if (Build.VERSION.SDK_INT < 18) {
            C0140i.m500a(context, "ActivityMain.onActionNotificationListenerSettings ERROR Android version<4.3");
        } else {
            if (Build.VERSION.SDK_INT >= 22) {
                str = "android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS";
                str2 = "ActivityMain.onActionNotificationListenerSettings Android version>=5.1";
            } else {
                str = "android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS";
                str2 = "ActivityMain.onActionNotificationListenerSettings 4.3<Android version<5.1";
            }
            C0140i.m501a(str2);
            try {
                context.startActivity(new Intent(str));
            } catch (Exception unused) {
            }
        }
    }

    public void onClick(View view) {
        if (view != null) {
            switch (view.getId()) {
                case R.id.button_advanced_autostart_settings /*2131165207*/:
                    m377a((Context) this);
                    return;
                case R.id.button_advanced_powersave_settings /*2131165208*/:
                    m382b((Context) this);
                    return;
                case R.id.button_advanced_protectedapps_settings /*2131165209*/:
                    m383c(this);
                    return;
                case R.id.button_ok /*2131165211*/:
                    m381b();
                    return;
                case R.id.button_service_notificationlistener_settings /*2131165214*/:
                    m386f(this);
                    return;
                case R.id.button_service_permissions_settings /*2131165215*/:
                    m385e(this);
                    return;
                default:
                    return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0140i.m501a("ActivityService.oncreate");
        setContentView(R.layout.activity_advanced);
        this.f187a = (EditText) findViewById(R.id.editText_command);
        this.f188b = (TextView) findViewById(R.id.tv_service_permissions_readphonestate);
        this.f189c = (TextView) findViewById(R.id.tv_service_permissions_readsms);
        this.f190d = (TextView) findViewById(R.id.tv_service_permissions_readcontacts);
        this.f192f = (LinearLayout) findViewById(R.id.ll_advanced_autostart);
        this.f193g = (TextView) findViewById(R.id.tv_advanced_autostart_text);
        this.f194h = (LinearLayout) findViewById(R.id.ll_advanced_powersave);
        this.f195i = (TextView) findViewById(R.id.tv_advanced_powersave_text);
        this.f196j = (LinearLayout) findViewById(R.id.ll_advanced_protectedapps);
        this.f197k = (TextView) findViewById(R.id.tv_advanced_protectedapps_text);
        TextView textView = (TextView) findViewById(R.id.tv_service_notificationlistener_title);
        TextView textView2 = (TextView) findViewById(R.id.tv_service_notificationlistener_text);
        Button button = (Button) findViewById(R.id.button_service_notificationlistener_settings);
        this.f191e = (TextView) findViewById(R.id.tv_service_notificationlistener_status);
        TextView textView3 = (TextView) findViewById(R.id.tv_service_notificationlistener_notepro);
        TextView textView4 = (TextView) findViewById(R.id.tv_service_notificationlistener_notereboot);
        TextView textView5 = (TextView) findViewById(R.id.tv_service_notificationlistener_note18);
        ((Button) findViewById(R.id.button_ok)).setOnClickListener(this);
        ((Button) findViewById(R.id.button_service_permissions_settings)).setOnClickListener(this);
        button.setOnClickListener(this);
        ((Button) findViewById(R.id.button_advanced_autostart_settings)).setOnClickListener(this);
        ((Button) findViewById(R.id.button_advanced_powersave_settings)).setOnClickListener(this);
        ((Button) findViewById(R.id.button_advanced_protectedapps_settings)).setOnClickListener(this);
        boolean z = Build.VERSION.SDK_INT >= 18 && App.f283b;
        textView.setEnabled(z);
        textView2.setEnabled(z);
        button.setEnabled(z);
        this.f191e.setEnabled(z);
        textView3.setEnabled(z);
        textView4.setEnabled(z);
        textView5.setEnabled(z);
        int i = 8;
        textView3.setVisibility(App.f282a ? 0 : 8);
        textView5.setVisibility(Build.VERSION.SDK_INT < 18 ? 0 : 8);
        if (z) {
            i = 0;
        }
        textView4.setVisibility(i);
        m376a();
        this.f198l.postDelayed(this.f199m, 3000);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f198l.removeCallbacks(this.f199m);
        super.onDestroy();
    }
}
