package com.dof100.morsenotifier;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.IBinder;
import android.preference.PreferenceManager;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.support.p000v4.p001a.C0014b;

@TargetApi(21)
public class ServiceNotifications extends NotificationListenerService {

    /* renamed from: a */
    private boolean f424a = false;

    /* renamed from: b */
    private int f425b = 0;

    /* renamed from: c */
    private boolean f426c = false;

    /* renamed from: d */
    private boolean f427d = false;

    /* renamed from: e */
    private boolean f428e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C0153n f429f = null;

    /* renamed from: g */
    private C0131b f430g = null;

    /* renamed from: h */
    private final BroadcastReceiver f431h = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            if ("LBR_ACTION_RECENTNOTIFICATIONSCHANGED".equals(intent.getAction())) {
                C0140i.m501a("ServiceNotifications.BroadcastReceiver got LBR_ACTION_RECENTNOTIFICATIONSCHANGED");
                ServiceNotifications.this.f429f.mo507b(ServiceNotifications.this);
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Handler f432i = new Handler();

    /* renamed from: j */
    private final Runnable f433j = new Runnable() {
        public void run() {
            C0140i.m501a("ServiceNotifications.rSendNotification handler");
            if (ServiceNotifications.this.m473b()) {
                ServiceNotifications.this.f432i.postDelayed(this, 3000);
            }
        }
    };

    /* renamed from: a */
    private void m471a() {
        C0140i.m500a((Context) this, "ServiceNotifications.load_params");
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        this.f426c = C0163v.m565d(this, defaultSharedPreferences, "pref_audio_enable", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f427d = C0163v.m565d(this, defaultSharedPreferences, "pref_audio_vibration_enable", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f428e = C0163v.m565d(this, defaultSharedPreferences, "pref_display_enable", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f424a = C0163v.m565d(this, defaultSharedPreferences, "pref_apps_enable", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f425b = C0163v.m564c(this, defaultSharedPreferences, "pref_apps_multiple", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f430g.mo468a(this);
    }

    /* renamed from: a */
    private void m472a(C0152m mVar) {
        C0140i.m500a((Context) this, "ServiceNotifications.notificationAnnounceNow Starting service");
        mVar.f522h = 1;
        Intent intent = new Intent(this, ServiceMain.class);
        intent.putExtra(getResources().getString(R.string.MSG_WHAT), getResources().getString(R.string.MSG_APPS_NOTIFY));
        intent.putExtra(getResources().getString(R.string.MSG_EXTRATEXT2), mVar.f524j);
        startService(intent);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m473b() {
        /*
            r18 = this;
            r0 = r18
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "ServiceNotifications.notificationAnnounceCheckCandidates Queue length="
            r3.append(r4)
            com.dof100.morsenotifier.n r4 = r0.f429f
            java.util.ArrayList<com.dof100.morsenotifier.m> r4 = r4.f525a
            int r4 = r4.size()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r0, (java.lang.String) r3)
            com.dof100.morsenotifier.n r3 = r0.f429f
            java.util.ArrayList<com.dof100.morsenotifier.m> r3 = r3.f525a
            java.util.Iterator r3 = r3.iterator()
            r5 = -1
        L_0x002b:
            boolean r6 = r3.hasNext()
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L_0x0199
            java.lang.Object r6 = r3.next()
            com.dof100.morsenotifier.m r6 = (com.dof100.morsenotifier.C0152m) r6
            int r5 = r5 + r8
            java.util.Locale r9 = java.util.Locale.US
            java.lang.String r10 = "ServiceNotifications.notificationAnnounceCheckCandidates n%d: checking"
            java.lang.Object[] r11 = new java.lang.Object[r8]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            r11[r7] = r12
            java.lang.String r9 = java.lang.String.format(r9, r10, r11)
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r0, (java.lang.String) r9)
            int r9 = r6.f522h
            if (r9 == 0) goto L_0x0052
            goto L_0x002b
        L_0x0052:
            long r9 = r6.f515a
            long r11 = r1 - r9
            r9 = 3000(0xbb8, double:1.482E-320)
            int r13 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r13 >= 0) goto L_0x005d
            goto L_0x002b
        L_0x005d:
            java.util.Locale r13 = java.util.Locale.US
            java.lang.String r14 = "ServiceNotifications.notificationAnnounceCheckCandidates n%d: waiting expired (dt=%d msec)"
            r15 = 2
            java.lang.Object[] r4 = new java.lang.Object[r15]
            java.lang.Integer r16 = java.lang.Integer.valueOf(r5)
            r4[r7] = r16
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r4[r8] = r11
            java.lang.String r4 = java.lang.String.format(r13, r14, r4)
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r0, (java.lang.String) r4)
            com.dof100.morsenotifier.n r4 = r0.f429f
            java.util.ArrayList<com.dof100.morsenotifier.m> r4 = r4.f525a
            java.util.Iterator r4 = r4.iterator()
            r11 = -1
        L_0x0080:
            boolean r12 = r4.hasNext()
            if (r12 == 0) goto L_0x00c0
            java.lang.Object r12 = r4.next()
            com.dof100.morsenotifier.m r12 = (com.dof100.morsenotifier.C0152m) r12
            int r11 = r11 + r8
            java.lang.String r13 = r12.f516b
            java.lang.String r14 = r6.f516b
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x0098
            goto L_0x0080
        L_0x0098:
            int r13 = r12.f522h
            if (r13 == 0) goto L_0x009d
            goto L_0x0080
        L_0x009d:
            long r12 = r12.f515a
            long r16 = r1 - r12
            int r12 = (r16 > r9 ? 1 : (r16 == r9 ? 0 : -1))
            if (r12 >= 0) goto L_0x0080
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r9 = "ServiceNotifications.notificationAnnounceCheckCandidates n%d: found n%d still waiting "
            java.lang.Object[] r10 = new java.lang.Object[r15]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            r10[r7] = r12
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10[r8] = r11
            java.lang.String r4 = java.lang.String.format(r4, r9, r10)
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r0, (java.lang.String) r4)
            r4 = 1
            goto L_0x00c1
        L_0x00c0:
            r4 = 0
        L_0x00c1:
            if (r4 == 0) goto L_0x00d8
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r6 = "ServiceNotifications.notificationAnnounceCheckCandidates n%d: found other still waiting "
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r8[r7] = r9
            java.lang.String r4 = java.lang.String.format(r4, r6, r8)
        L_0x00d3:
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r0, (java.lang.String) r4)
            goto L_0x002b
        L_0x00d8:
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r9 = "ServiceNotifications.notificationAnnounceCheckCandidates n%d: searching for best notification "
            java.lang.Object[] r10 = new java.lang.Object[r8]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
            r10[r7] = r11
            java.lang.String r4 = java.lang.String.format(r4, r9, r10)
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r0, (java.lang.String) r4)
            r4 = 0
            r9 = 2147483647(0x7fffffff, float:NaN)
            com.dof100.morsenotifier.n r10 = r0.f429f
            java.util.ArrayList<com.dof100.morsenotifier.m> r10 = r10.f525a
            java.util.Iterator r10 = r10.iterator()
            r9 = r4
            r4 = -1
            r11 = 2147483647(0x7fffffff, float:NaN)
        L_0x00fc:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x0188
            java.lang.Object r12 = r10.next()
            com.dof100.morsenotifier.m r12 = (com.dof100.morsenotifier.C0152m) r12
            java.lang.String r13 = "ServiceNotifications.notificationAnnounceCheckCandidates for"
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r0, (java.lang.String) r13)
            int r4 = r4 + r8
            int r13 = r12.f522h
            if (r13 == 0) goto L_0x0113
            goto L_0x00fc
        L_0x0113:
            java.lang.String r13 = r12.f516b
            java.lang.String r14 = r6.f516b
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x011e
            goto L_0x00fc
        L_0x011e:
            r13 = -4
            r12.f522h = r13
            int r13 = r0.f425b
            r14 = 3
            switch(r13) {
                case 1: goto L_0x0169;
                case 2: goto L_0x014c;
                case 3: goto L_0x0128;
                default: goto L_0x0127;
            }
        L_0x0127:
            goto L_0x00fc
        L_0x0128:
            int r9 = r12.f523i
            java.util.Locale r11 = java.util.Locale.US
            java.lang.String r13 = "ServiceNotifications.notificationAnnounceCheckCandidates n%d: last = n%d, filter=%d"
            java.lang.Object[] r14 = new java.lang.Object[r14]
            java.lang.Integer r16 = java.lang.Integer.valueOf(r5)
            r14[r7] = r16
            java.lang.Integer r16 = java.lang.Integer.valueOf(r4)
            r14[r8] = r16
            java.lang.Integer r16 = java.lang.Integer.valueOf(r9)
            r14[r15] = r16
        L_0x0142:
            java.lang.String r11 = java.lang.String.format(r11, r13, r14)
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r0, (java.lang.String) r11)
            r11 = r9
            r9 = r12
            goto L_0x00fc
        L_0x014c:
            if (r9 != 0) goto L_0x00fc
            int r9 = r12.f523i
            java.util.Locale r11 = java.util.Locale.US
            java.lang.String r13 = "ServiceNotifications.notificationAnnounceCheckCandidates n%d: first = n%d, filter=%d"
            java.lang.Object[] r14 = new java.lang.Object[r14]
            java.lang.Integer r16 = java.lang.Integer.valueOf(r5)
            r14[r7] = r16
            java.lang.Integer r16 = java.lang.Integer.valueOf(r4)
            r14[r8] = r16
            java.lang.Integer r16 = java.lang.Integer.valueOf(r9)
            r14[r15] = r16
            goto L_0x0142
        L_0x0169:
            int r13 = r12.f523i
            if (r13 >= r11) goto L_0x00fc
            int r9 = r12.f523i
            java.util.Locale r11 = java.util.Locale.US
            java.lang.String r13 = "ServiceNotifications.notificationAnnounceCheckCandidates n%d: found best match = n%d, filter=%d"
            java.lang.Object[] r14 = new java.lang.Object[r14]
            java.lang.Integer r16 = java.lang.Integer.valueOf(r5)
            r14[r7] = r16
            java.lang.Integer r16 = java.lang.Integer.valueOf(r4)
            r14[r8] = r16
            java.lang.Integer r16 = java.lang.Integer.valueOf(r9)
            r14[r15] = r16
            goto L_0x0142
        L_0x0188:
            if (r9 != 0) goto L_0x018e
            java.lang.String r4 = "ServiceNotifications.notificationAnnounceCheckCandidates ERROR nBest==null"
            goto L_0x00d3
        L_0x018e:
            if (r11 >= 0) goto L_0x0194
            java.lang.String r4 = "ServiceNotifications.notificationAnnounceCheckCandidates ERROR filterBest<0"
            goto L_0x00d3
        L_0x0194:
            r0.m472a((com.dof100.morsenotifier.C0152m) r9)
            goto L_0x002b
        L_0x0199:
            com.dof100.morsenotifier.n r1 = r0.f429f
            java.util.ArrayList<com.dof100.morsenotifier.m> r1 = r1.f525a
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L_0x01a2:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x01ba
            java.lang.Object r3 = r1.next()
            com.dof100.morsenotifier.m r3 = (com.dof100.morsenotifier.C0152m) r3
            java.lang.String r4 = "ServiceNotifications.notificationAnnounceCheckCandidates for 3"
            com.dof100.morsenotifier.C0140i.m501a((java.lang.String) r4)
            int r3 = r3.f522h
            if (r3 != 0) goto L_0x01a2
            int r2 = r2 + 1
            goto L_0x01a2
        L_0x01ba:
            if (r2 <= 0) goto L_0x01d0
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r3 = "ServiceNotifications.notificationAnnounceCheckCandidates Still %d notifications waiting"
            java.lang.Object[] r4 = new java.lang.Object[r8]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r4[r7] = r5
            java.lang.String r1 = java.lang.String.format(r1, r3, r4)
        L_0x01cc:
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r0, (java.lang.String) r1)
            goto L_0x01d3
        L_0x01d0:
            java.lang.String r1 = "ServiceNotifications.notificationAnnounceCheckCandidates No more notifications waiting"
            goto L_0x01cc
        L_0x01d3:
            if (r2 <= 0) goto L_0x01d6
            r7 = 1
        L_0x01d6:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dof100.morsenotifier.ServiceNotifications.m473b():boolean");
    }

    public IBinder onBind(Intent intent) {
        C0140i.m500a((Context) this, "ServiceNotifications.onBind");
        return super.onBind(intent);
    }

    public void onCreate() {
        super.onCreate();
        C0140i.m500a((Context) this, "ServiceNotifications.OnCreate");
        this.f429f = new C0153n(this);
        this.f430g = new C0131b(this);
        m471a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("LBR_ACTION_RECENTNOTIFICATIONSCHANGED");
        C0014b.m1a((Context) this).mo2a(this.f431h, intentFilter);
    }

    public void onDestroy() {
        C0140i.m500a((Context) this, "ServiceNotifications.OnDestroy");
        C0140i.m501a("ServiceMain.OnDestroy unregistering local BroadcastReceiver");
        C0014b.m1a((Context) this).mo1a(this.f431h);
        super.onDestroy();
    }

    public void onInterruptionFilterChanged(int i) {
        C0140i.m500a((Context) this, "ServiceNotifications.onInterruptionFilterChanged");
    }

    public void onListenerConnected() {
        C0140i.m500a((Context) this, "ServiceNotifications.onListenerConnected");
    }

    public void onListenerDisconnected() {
        C0140i.m500a((Context) this, "ServiceNotifications.onListenerDisconnected");
    }

    public void onListenerHintsChanged(int i) {
        C0140i.m500a((Context) this, "ServiceNotifications.onListenerHintsChanged");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b A[SYNTHETIC, Splitter:B:27:0x005b] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x012d  */
    @android.annotation.TargetApi(19)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNotificationPosted(android.service.notification.StatusBarNotification r14) {
        /*
            r13 = this;
            java.lang.String r0 = "ServiceNotifications.onNotificationPosted"
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r13, (java.lang.String) r0)
            java.lang.String r0 = r14.getPackageName()
            android.app.Notification r1 = r14.getNotification()
            java.lang.CharSequence r2 = r1.tickerText
            r3 = 0
            if (r2 == 0) goto L_0x0019
            java.lang.CharSequence r2 = r1.tickerText
            java.lang.String r2 = r2.toString()
            goto L_0x001a
        L_0x0019:
            r2 = r3
        L_0x001a:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 19
            if (r4 < r5) goto L_0x003e
            android.os.Bundle r4 = r1.extras
            if (r4 == 0) goto L_0x0039
            java.lang.String r5 = "android.title"
            java.lang.String r5 = r4.getString(r5)
            java.lang.String r6 = "android.text"
            java.lang.CharSequence r4 = r4.getCharSequence(r6)
            if (r4 == 0) goto L_0x0036
            java.lang.String r3 = r4.toString()
        L_0x0036:
            r4 = r3
            r3 = r5
            goto L_0x003f
        L_0x0039:
            java.lang.String r4 = "ServiceNotifications.onNotificationPosted Extras=null"
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r13, (java.lang.String) r4)
        L_0x003e:
            r4 = r3
        L_0x003f:
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = ""
        L_0x0043:
            r7 = r0
            if (r2 != 0) goto L_0x0048
            java.lang.String r2 = ""
        L_0x0048:
            r10 = r2
            if (r3 != 0) goto L_0x004d
            java.lang.String r3 = ""
        L_0x004d:
            r11 = r3
            if (r4 != 0) goto L_0x0052
            java.lang.String r4 = ""
        L_0x0052:
            r12 = r4
            android.content.pm.PackageManager r0 = r13.getPackageManager()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0078
            android.content.pm.ApplicationInfo r4 = r0.getApplicationInfo(r7, r3)     // Catch:{ NameNotFoundException -> 0x0073 }
            java.util.Locale r5 = java.util.Locale.US     // Catch:{ NameNotFoundException -> 0x0073 }
            java.lang.String r6 = "ServiceNotifications.onNotificationPosted App Name     = %s"
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ NameNotFoundException -> 0x0073 }
            java.lang.CharSequence r0 = r0.getApplicationLabel(r4)     // Catch:{ NameNotFoundException -> 0x0073 }
            r8[r3] = r0     // Catch:{ NameNotFoundException -> 0x0073 }
            java.lang.String r0 = java.lang.String.format(r5, r6, r8)     // Catch:{ NameNotFoundException -> 0x0073 }
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r13, (java.lang.String) r0)     // Catch:{ NameNotFoundException -> 0x0073 }
            goto L_0x0078
        L_0x0073:
            java.lang.String r0 = "ServiceNotifications.onNotificationPosted ERROR NameNotFoundException"
            com.dof100.morsenotifier.C0140i.m501a((java.lang.String) r0)
        L_0x0078:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = "ServiceNotifications.onNotificationPosted Package      = %s"
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r3] = r7
            java.lang.String r0 = java.lang.String.format(r0, r4, r5)
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r13, (java.lang.String) r0)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = "ServiceNotifications.onNotificationPosted Ticker       = %s"
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r3] = r10
            java.lang.String r0 = java.lang.String.format(r0, r4, r5)
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r13, (java.lang.String) r0)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = "ServiceNotifications.onNotificationPosted Title        = %s"
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r3] = r11
            java.lang.String r0 = java.lang.String.format(r0, r4, r5)
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r13, (java.lang.String) r0)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = "ServiceNotifications.onNotificationPosted Text         = %s"
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r3] = r12
            java.lang.String r0 = java.lang.String.format(r0, r4, r5)
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r13, (java.lang.String) r0)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = "ServiceNotifications.onNotificationPosted isClearable  = %s"
            java.lang.Object[] r5 = new java.lang.Object[r2]
            boolean r6 = r14.isClearable()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r5[r3] = r6
            java.lang.String r0 = java.lang.String.format(r0, r4, r5)
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r13, (java.lang.String) r0)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = "ServiceNotifications.onNotificationPosted isOngoing    = %s"
            java.lang.Object[] r5 = new java.lang.Object[r2]
            boolean r6 = r14.isOngoing()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r5[r3] = r6
            java.lang.String r0 = java.lang.String.format(r0, r4, r5)
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r13, (java.lang.String) r0)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = "ServiceNotifications.onNotificationPosted flags        = %d"
            java.lang.Object[] r5 = new java.lang.Object[r2]
            int r6 = r1.flags
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r3] = r6
            java.lang.String r0 = java.lang.String.format(r0, r4, r5)
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r13, (java.lang.String) r0)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = "ServiceNotifications.onNotificationPosted when         = %d"
            java.lang.Object[] r5 = new java.lang.Object[r2]
            long r8 = r1.when
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            r5[r3] = r6
            java.lang.String r0 = java.lang.String.format(r0, r4, r5)
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r13, (java.lang.String) r0)
            java.lang.String r0 = ""
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 21
            if (r4 < r5) goto L_0x0116
            java.lang.String r0 = r1.category
        L_0x0116:
            r9 = r0
            com.dof100.morsenotifier.n r5 = r13.f429f
            android.content.Context r6 = r13.getApplicationContext()
            int r8 = r14.getId()
            com.dof100.morsenotifier.m r14 = r5.mo504a(r6, r7, r8, r9, r10, r11, r12)
            if (r14 != 0) goto L_0x012d
            java.lang.String r14 = "ServiceNotifications.onNotificationPosted duplicate notification found"
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r13, (java.lang.String) r14)
            return
        L_0x012d:
            r13.m471a()
            boolean r0 = r13.f424a
            r1 = -1
            if (r0 != 0) goto L_0x0138
            r14.f522h = r1
            return
        L_0x0138:
            boolean r0 = r13.f426c
            if (r0 != 0) goto L_0x0147
            boolean r0 = r13.f428e
            if (r0 != 0) goto L_0x0147
            boolean r0 = r13.f427d
            if (r0 != 0) goto L_0x0147
            r14.f522h = r1
            return
        L_0x0147:
            r0 = -2
            r14.f522h = r0
            r0 = 0
        L_0x014b:
            com.dof100.morsenotifier.b r1 = r13.f430g
            java.util.ArrayList<com.dof100.morsenotifier.a> r1 = r1.f446a
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x01b8
            java.lang.String r1 = "ServiceNotifications.onNotificationPosted for 1"
            com.dof100.morsenotifier.C0140i.m501a((java.lang.String) r1)
            com.dof100.morsenotifier.b r1 = r13.f430g
            java.util.ArrayList<com.dof100.morsenotifier.a> r1 = r1.f446a
            java.lang.Object r1 = r1.get(r0)
            com.dof100.morsenotifier.a r1 = (com.dof100.morsenotifier.C0130a) r1
            java.lang.String r1 = r1.mo465a((com.dof100.morsenotifier.C0152m) r14)
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto L_0x01b5
            r14.f523i = r0
            r14.f524j = r1
            int r1 = r13.f425b
            if (r1 != 0) goto L_0x018f
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r4 = "ServiceNotifications.onNotificationPosted match with filter %d. Announcing right now"
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5[r3] = r0
            java.lang.String r0 = java.lang.String.format(r1, r4, r5)
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r13, (java.lang.String) r0)
            r14.f522h = r2
            r13.m472a((com.dof100.morsenotifier.C0152m) r14)
            return
        L_0x018f:
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r4 = "ServiceNotifications.onNotificationPosted match with filter %d. Adding to queue for announcement"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r3] = r0
            java.lang.String r0 = java.lang.String.format(r1, r4, r2)
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r13, (java.lang.String) r0)
            r14.f522h = r3
            android.os.Handler r14 = r13.f432i
            java.lang.Runnable r0 = r13.f433j
            r14.removeCallbacks(r0)
            android.os.Handler r14 = r13.f432i
            java.lang.Runnable r0 = r13.f433j
            r1 = 3000(0xbb8, double:1.482E-320)
            r14.postDelayed(r0, r1)
            return
        L_0x01b5:
            int r0 = r0 + 1
            goto L_0x014b
        L_0x01b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dof100.morsenotifier.ServiceNotifications.onNotificationPosted(android.service.notification.StatusBarNotification):void");
    }

    public void onNotificationRankingUpdate(NotificationListenerService.RankingMap rankingMap) {
        C0140i.m500a((Context) this, "ServiceNotifications.onNotificationRankingUpdate");
    }

    public void onNotificationRemoved(StatusBarNotification statusBarNotification) {
        C0140i.m500a((Context) this, "ServiceNotifications.onNotificationRemoved");
    }
}
