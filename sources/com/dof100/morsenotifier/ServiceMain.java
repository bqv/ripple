package com.dof100.morsenotifier;

import android.app.IntentService;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.IBinder;
import android.preference.PreferenceManager;
import android.support.p000v4.p001a.C0014b;
import android.telephony.TelephonyManager;
import java.util.Calendar;
import java.util.Locale;
import java.util.Random;

public class ServiceMain extends IntentService {

    /* renamed from: a */
    private static final int[] f338a = {4, 3, 5, 2, 1};

    /* renamed from: A */
    private boolean f339A = false;

    /* renamed from: B */
    private int f340B = 16777215;

    /* renamed from: C */
    private int f341C = 16776960;

    /* renamed from: D */
    private int f342D = 16776960;

    /* renamed from: E */
    private boolean f343E = true;

    /* renamed from: F */
    private int f344F = 4;

    /* renamed from: G */
    private String f345G = "";

    /* renamed from: H */
    private int f346H = 0;

    /* renamed from: I */
    private boolean f347I = false;

    /* renamed from: J */
    private boolean f348J = false;

    /* renamed from: K */
    private boolean f349K = false;

    /* renamed from: L */
    private boolean f350L = false;

    /* renamed from: M */
    private boolean f351M = false;

    /* renamed from: N */
    private String f352N = "";

    /* renamed from: O */
    private String f353O = "";

    /* renamed from: P */
    private String f354P = "";

    /* renamed from: Q */
    private int f355Q = 1;

    /* renamed from: R */
    private boolean f356R = true;

    /* renamed from: S */
    private int f357S = 3;

    /* renamed from: T */
    private String f358T = "";

    /* renamed from: U */
    private int f359U = 0;

    /* renamed from: V */
    private boolean f360V = false;

    /* renamed from: W */
    private boolean f361W = false;

    /* renamed from: X */
    private boolean f362X = false;

    /* renamed from: Y */
    private boolean f363Y = false;

    /* renamed from: Z */
    private boolean f364Z = false;

    /* renamed from: aA */
    private String f365aA = "";

    /* renamed from: aB */
    private String f366aB = "";

    /* renamed from: aC */
    private String f367aC = "";

    /* renamed from: aD */
    private String f368aD = "";

    /* renamed from: aE */
    private final Random f369aE = new Random();

    /* renamed from: aF */
    private final int f370aF = this.f369aE.nextInt(10000);

    /* renamed from: aG */
    private final BroadcastReceiver f371aG = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            if ("LBR_ACTION_SETTINGSCHANGED".equals(intent.getAction())) {
                C0140i.m501a("ServiceMain.BroadcastReceiver got LBR_ACTION_SETTINGSCHANGED");
                C0140i.m501a("ServiceMain.BroadcastReceiver pref_init");
                ServiceMain.this.m469c();
                C0138g.m492a();
                C0138g.m493a((Context) ServiceMain.this);
            }
        }
    };

    /* renamed from: aa */
    private boolean f372aa = false;

    /* renamed from: ab */
    private String f373ab = "";

    /* renamed from: ac */
    private String f374ac = "";

    /* renamed from: ad */
    private String f375ad = "";

    /* renamed from: ae */
    private int f376ae = 1;

    /* renamed from: af */
    private boolean f377af = true;

    /* renamed from: ag */
    private int f378ag = 3;

    /* renamed from: ah */
    private String f379ah = "";

    /* renamed from: ai */
    private String f380ai = "";

    /* renamed from: aj */
    private String f381aj = "";

    /* renamed from: ak */
    private String f382ak = "";

    /* renamed from: al */
    private String f383al = "";

    /* renamed from: am */
    private String f384am = "";

    /* renamed from: an */
    private boolean f385an = false;

    /* renamed from: ao */
    private boolean f386ao = false;

    /* renamed from: ap */
    private int f387ap = 3;

    /* renamed from: aq */
    private final boolean[] f388aq = {true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true};

    /* renamed from: ar */
    private String f389ar = "";

    /* renamed from: as */
    private String f390as = "";

    /* renamed from: at */
    private int f391at = 1;

    /* renamed from: au */
    private boolean f392au = false;

    /* renamed from: av */
    private int f393av = 1;

    /* renamed from: aw */
    private boolean f394aw = true;

    /* renamed from: ax */
    private int f395ax = 3;

    /* renamed from: ay */
    private String f396ay = "";

    /* renamed from: az */
    private String f397az = "";

    /* renamed from: b */
    private boolean f398b = true;

    /* renamed from: c */
    private boolean f399c = true;

    /* renamed from: d */
    private int f400d = 0;

    /* renamed from: e */
    private int f401e = 1;

    /* renamed from: f */
    private boolean f402f = true;

    /* renamed from: g */
    private boolean f403g = true;

    /* renamed from: h */
    private int f404h = 0;

    /* renamed from: i */
    private int f405i = 0;

    /* renamed from: j */
    private boolean f406j = false;

    /* renamed from: k */
    private int f407k = 0;

    /* renamed from: l */
    private boolean f408l = false;

    /* renamed from: m */
    private String f409m = "en_US";

    /* renamed from: n */
    private int f410n = 100;

    /* renamed from: o */
    private int f411o = 100;

    /* renamed from: p */
    private int f412p = 100;

    /* renamed from: q */
    private boolean f413q = false;

    /* renamed from: r */
    private boolean f414r = false;

    /* renamed from: s */
    private int f415s = 800;

    /* renamed from: t */
    private int f416t = 100;

    /* renamed from: u */
    private int f417u = 10;

    /* renamed from: v */
    private boolean f418v = false;

    /* renamed from: w */
    private int f419w = 1;

    /* renamed from: x */
    private int f420x = 0;

    /* renamed from: y */
    private boolean f421y = false;

    /* renamed from: z */
    private boolean f422z = true;

    public ServiceMain() {
        super("com.dof100.morsenotifier.ServiceMain");
    }

    public ServiceMain(String str) {
        super(str);
    }

    /* renamed from: a */
    private void m456a() {
        C0140i.m500a((Context) this, "ServiceMain.alarm_init");
        C0138g.m494b();
        C0138g.m492a();
        C0138g.m493a((Context) this);
        if (App.f285d) {
            App.m426a(getApplicationContext());
        }
    }

    /* renamed from: a */
    private void m457a(int i, int i2, boolean z) {
        int i3 = i;
        boolean z2 = z;
        if (this.f386ao) {
            C0140i.m500a((Context) this, "ServiceMain.handleChime");
            Calendar instance = Calendar.getInstance();
            int i4 = instance.get(11);
            int i5 = instance.get(12);
            long timeInMillis = instance.getTimeInMillis();
            int i6 = i3 <= 0 ? instance.get(11) % 24 : i3;
            if (z2 || this.f388aq[i6]) {
                if (!z2) {
                    int a = C0163v.m554a(i4, i5, i3, i2);
                    if (a >= 2) {
                        C0140i.m500a((Context) this, String.format(Locale.US, "ServiceMain.onHandleIntent (MSG_CHIME) ERROR now=%02d:%02d reminder=%02d:%02d  dif=%d", new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(a)}));
                        return;
                    }
                } else {
                    int i7 = i2;
                }
                if (!z2) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
                    if (timeInMillis - defaultSharedPreferences.getLong("chime_lasttime", 0) < 300000) {
                        C0140i.m500a((Context) this, String.format(Locale.US, "ServiceMain.onHandleIntent (MSG_CHIME) ERROR Last time was less that 5 min ego. now=%02d:%02d reminder=%02d:%02d", new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i), Integer.valueOf(i2)}));
                        return;
                    }
                    defaultSharedPreferences.edit().putLong("chime_lasttime", timeInMillis).apply();
                }
                String str = "";
                switch (this.f391at) {
                    case 1:
                        str = String.format(Locale.US, "%02d00", new Object[]{Integer.valueOf(i6)});
                        if (App.f285d) {
                            str = C0163v.m560a(str, ' ');
                            break;
                        }
                        break;
                    case 2:
                        int i8 = i6 % 12;
                        if (i8 == 0) {
                            i8 = 12;
                        }
                        str = String.format(Locale.US, "%d", new Object[]{Integer.valueOf(i8)});
                        break;
                    case 3:
                        str = String.format(Locale.US, "%d", new Object[]{Integer.valueOf(i6)});
                        break;
                }
                if (!this.f389ar.isEmpty()) {
                    str = this.f389ar + " " + str;
                }
                if (!this.f390as.isEmpty()) {
                    str = str + " " + this.f390as;
                }
                C0140i.m500a((Context) this, "ServiceMain.onHandleIntent (MSG_CHIME) hour=" + i6 + "  format=" + this.f391at + " message:" + str);
                m462a(str, f338a[this.f387ap], 1, z2);
                return;
            }
            C0140i.m500a((Context) this, String.format(Locale.US, "ServiceMain.onHandleIntent (MSG_CHIME) Chime disabled for \"%02d:00\"", new Object[]{Integer.valueOf(i6)}));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x022c, code lost:
        if (r11.f368aD.length() == 0) goto L_0x022e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m459a(java.lang.String r12) {
        /*
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ServiceMain.contactInfoRetrieve Number="
            r0.append(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r11, (java.lang.String) r0)
            r11.m466b()
            if (r12 != 0) goto L_0x001a
            return
        L_0x001a:
            int r0 = r12.length()
            if (r0 != 0) goto L_0x0021
            return
        L_0x0021:
            r0 = 2
            r1 = 0
            r2 = 0
            r3 = 1
            android.content.ContentResolver r10 = r11.getContentResolver()     // Catch:{ Exception -> 0x0048 }
            android.net.Uri r4 = android.provider.ContactsContract.PhoneLookup.CONTENT_FILTER_URI     // Catch:{ Exception -> 0x0046 }
            java.lang.String r12 = android.net.Uri.encode(r12)     // Catch:{ Exception -> 0x0046 }
            android.net.Uri r5 = android.net.Uri.withAppendedPath(r4, r12)     // Catch:{ Exception -> 0x0046 }
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ Exception -> 0x0046 }
            java.lang.String r12 = "display_name"
            r6[r2] = r12     // Catch:{ Exception -> 0x0046 }
            java.lang.String r12 = "_id"
            r6[r3] = r12     // Catch:{ Exception -> 0x0046 }
            r7 = 0
            r8 = 0
            r9 = 0
            r4 = r10
            android.database.Cursor r12 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0046 }
            goto L_0x004e
        L_0x0046:
            r12 = move-exception
            goto L_0x004a
        L_0x0048:
            r12 = move-exception
            r10 = r1
        L_0x004a:
            r12.printStackTrace()
            r12 = r1
        L_0x004e:
            if (r12 != 0) goto L_0x0056
            java.lang.String r12 = "ServiceMain.contactInfoRetrieve c1=null"
        L_0x0052:
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r11, (java.lang.String) r12)
            return
        L_0x0056:
            java.lang.String r4 = "contactInfoRetrieve c1 try"
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r11, (java.lang.String) r4)     // Catch:{ Exception -> 0x00e9 }
            boolean r4 = r12.moveToFirst()     // Catch:{ Exception -> 0x00e9 }
        L_0x005f:
            if (r4 == 0) goto L_0x00ee
            java.lang.String r4 = "contactInfoRetrieve c1.while inside"
            com.dof100.morsenotifier.C0140i.m501a((java.lang.String) r4)     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r4 = "_id"
            int r4 = r12.getColumnIndex(r4)     // Catch:{ Exception -> 0x00e9 }
            if (r4 < 0) goto L_0x008d
            java.lang.String r4 = r12.getString(r4)     // Catch:{ Exception -> 0x00e9 }
            if (r4 == 0) goto L_0x0076
            r11.f396ay = r4     // Catch:{ Exception -> 0x00e9 }
        L_0x0076:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e9 }
            r4.<init>()     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r5 = "ServiceMain.contactInfoRetrieve found curContactID = "
            r4.append(r5)     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r5 = r11.f396ay     // Catch:{ Exception -> 0x00e9 }
            r4.append(r5)     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00e9 }
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r11, (java.lang.String) r4)     // Catch:{ Exception -> 0x00e9 }
            goto L_0x00a1
        L_0x008d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e9 }
            r5.<init>()     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r6 = "contactInfoRetrieve curContactID not found c1.getColumnIndex(_ID) = "
            r5.append(r6)     // Catch:{ Exception -> 0x00e9 }
            r5.append(r4)     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x00e9 }
            com.dof100.morsenotifier.C0140i.m501a((java.lang.String) r4)     // Catch:{ Exception -> 0x00e9 }
        L_0x00a1:
            java.lang.String r4 = "display_name"
            int r4 = r12.getColumnIndex(r4)     // Catch:{ Exception -> 0x00e9 }
            if (r4 < 0) goto L_0x00cc
            java.lang.String r4 = r12.getString(r4)     // Catch:{ Exception -> 0x00e9 }
            if (r4 == 0) goto L_0x00b5
            java.lang.String r4 = r4.trim()     // Catch:{ Exception -> 0x00e9 }
            r11.f397az = r4     // Catch:{ Exception -> 0x00e9 }
        L_0x00b5:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e9 }
            r4.<init>()     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r5 = "ServiceMain.contactInfoRetrieve found curContactDisplayName = "
            r4.append(r5)     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r5 = r11.f397az     // Catch:{ Exception -> 0x00e9 }
            r4.append(r5)     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00e9 }
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r11, (java.lang.String) r4)     // Catch:{ Exception -> 0x00e9 }
            goto L_0x00e0
        L_0x00cc:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e9 }
            r5.<init>()     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r6 = "contactInfoRetrieve c1.indexDisplayName="
            r5.append(r6)     // Catch:{ Exception -> 0x00e9 }
            r5.append(r4)     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x00e9 }
            com.dof100.morsenotifier.C0140i.m501a((java.lang.String) r4)     // Catch:{ Exception -> 0x00e9 }
        L_0x00e0:
            boolean r4 = r12.moveToNext()     // Catch:{ Exception -> 0x00e9 }
            goto L_0x005f
        L_0x00e6:
            r0 = move-exception
            goto L_0x02f5
        L_0x00e9:
            java.lang.String r4 = "ServiceMain.contactInfoRetrieve. c1 Exception"
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r11, (java.lang.String) r4)     // Catch:{ all -> 0x00e6 }
        L_0x00ee:
            r12.close()
            java.lang.String r12 = r11.f396ay
            int r12 = r12.length()
            if (r12 != 0) goto L_0x00fd
            java.lang.String r12 = "ServiceMain.contactInfoRetrieve curContactID.length() == 0"
            goto L_0x0052
        L_0x00fd:
            java.lang.String r12 = "ServiceMain.contactInfoRetrieve. Now looking for FirstName, LastName"
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r11, (java.lang.String) r12)
            android.net.Uri r5 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ Exception -> 0x0119 }
            java.lang.String r7 = "mimetype = ? AND contact_id = ?"
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ Exception -> 0x0119 }
            java.lang.String r12 = "vnd.android.cursor.item/name"
            r8[r2] = r12     // Catch:{ Exception -> 0x0119 }
            java.lang.String r12 = r11.f396ay     // Catch:{ Exception -> 0x0119 }
            r8[r3] = r12     // Catch:{ Exception -> 0x0119 }
            java.lang.String r9 = "data2"
            r6 = 0
            r4 = r10
            android.database.Cursor r12 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0119 }
            goto L_0x011e
        L_0x0119:
            r12 = move-exception
            r12.printStackTrace()
            r12 = r1
        L_0x011e:
            if (r12 == 0) goto L_0x0188
            boolean r4 = r12.moveToFirst()     // Catch:{ Exception -> 0x017e }
        L_0x0124:
            if (r4 == 0) goto L_0x0178
            java.lang.String r4 = "contactRetrieve c2.while"
            com.dof100.morsenotifier.C0140i.m501a((java.lang.String) r4)     // Catch:{ Exception -> 0x017e }
            java.lang.String r4 = "data2"
            int r4 = r12.getColumnIndex(r4)     // Catch:{ Exception -> 0x017e }
            java.lang.String r4 = r12.getString(r4)     // Catch:{ Exception -> 0x017e }
            if (r4 == 0) goto L_0x0139
            r11.f365aA = r4     // Catch:{ Exception -> 0x017e }
        L_0x0139:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017e }
            r4.<init>()     // Catch:{ Exception -> 0x017e }
            java.lang.String r5 = "ServiceMain.contactInfoRetrieve. First name = "
            r4.append(r5)     // Catch:{ Exception -> 0x017e }
            java.lang.String r5 = r11.f365aA     // Catch:{ Exception -> 0x017e }
            r4.append(r5)     // Catch:{ Exception -> 0x017e }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x017e }
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r11, (java.lang.String) r4)     // Catch:{ Exception -> 0x017e }
            java.lang.String r4 = "data3"
            int r4 = r12.getColumnIndex(r4)     // Catch:{ Exception -> 0x017e }
            java.lang.String r4 = r12.getString(r4)     // Catch:{ Exception -> 0x017e }
            if (r4 == 0) goto L_0x015d
            r11.f366aB = r4     // Catch:{ Exception -> 0x017e }
        L_0x015d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017e }
            r4.<init>()     // Catch:{ Exception -> 0x017e }
            java.lang.String r5 = "ServiceMain.contactInfoRetrieve. Last name = "
            r4.append(r5)     // Catch:{ Exception -> 0x017e }
            java.lang.String r5 = r11.f366aB     // Catch:{ Exception -> 0x017e }
            r4.append(r5)     // Catch:{ Exception -> 0x017e }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x017e }
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r11, (java.lang.String) r4)     // Catch:{ Exception -> 0x017e }
            boolean r4 = r12.moveToNext()     // Catch:{ Exception -> 0x017e }
            goto L_0x0124
        L_0x0178:
            r12.close()
            goto L_0x0188
        L_0x017c:
            r0 = move-exception
            goto L_0x0184
        L_0x017e:
            java.lang.String r4 = "ServiceMain.contactInfoRetrieve. c2 Exception"
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r11, (java.lang.String) r4)     // Catch:{ all -> 0x017c }
            goto L_0x0178
        L_0x0184:
            r12.close()
            throw r0
        L_0x0188:
            java.lang.String r12 = "ServiceMain.contactInfoRetrieve. Now looking for NickName, Initials"
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r11, (java.lang.String) r12)
            android.net.Uri r5 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ Exception -> 0x01a3 }
            java.lang.String r7 = "mimetype = ? AND contact_id = ?"
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ Exception -> 0x01a3 }
            java.lang.String r12 = "vnd.android.cursor.item/nickname"
            r8[r2] = r12     // Catch:{ Exception -> 0x01a3 }
            java.lang.String r12 = r11.f396ay     // Catch:{ Exception -> 0x01a3 }
            r8[r3] = r12     // Catch:{ Exception -> 0x01a3 }
            r6 = 0
            r9 = 0
            r4 = r10
            android.database.Cursor r12 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x01a3 }
            goto L_0x01a8
        L_0x01a3:
            r12 = move-exception
            r12.printStackTrace()
            r12 = r1
        L_0x01a8:
            if (r12 == 0) goto L_0x0266
            boolean r0 = r12.moveToFirst()     // Catch:{ Exception -> 0x025c }
        L_0x01ae:
            if (r0 == 0) goto L_0x0256
            java.lang.String r0 = "contactRetrieve c3.while"
            com.dof100.morsenotifier.C0140i.m501a((java.lang.String) r0)     // Catch:{ Exception -> 0x025c }
            java.lang.String r0 = "data1"
            int r0 = r12.getColumnIndex(r0)     // Catch:{ Exception -> 0x025c }
            java.lang.String r1 = "data2"
            int r1 = r12.getColumnIndex(r1)     // Catch:{ Exception -> 0x025c }
            java.lang.String r4 = r12.getString(r0)     // Catch:{ Exception -> 0x025c }
            java.lang.String r5 = r12.getString(r1)     // Catch:{ Exception -> 0x025c }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
            r6.<init>()     // Catch:{ Exception -> 0x025c }
            java.lang.String r7 = "contactRetrieve tmpNickname  indexName="
            r6.append(r7)     // Catch:{ Exception -> 0x025c }
            r6.append(r0)     // Catch:{ Exception -> 0x025c }
            java.lang.String r0 = "  indexType="
            r6.append(r0)     // Catch:{ Exception -> 0x025c }
            r6.append(r1)     // Catch:{ Exception -> 0x025c }
            java.lang.String r0 = r6.toString()     // Catch:{ Exception -> 0x025c }
            com.dof100.morsenotifier.C0140i.m501a((java.lang.String) r0)     // Catch:{ Exception -> 0x025c }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
            r0.<init>()     // Catch:{ Exception -> 0x025c }
            java.lang.String r1 = "contactRetrieve tmpNickname  Name="
            r0.append(r1)     // Catch:{ Exception -> 0x025c }
            r0.append(r4)     // Catch:{ Exception -> 0x025c }
            java.lang.String r1 = "  Type="
            r0.append(r1)     // Catch:{ Exception -> 0x025c }
            r0.append(r5)     // Catch:{ Exception -> 0x025c }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x025c }
            com.dof100.morsenotifier.C0140i.m501a((java.lang.String) r0)     // Catch:{ Exception -> 0x025c }
            if (r4 != 0) goto L_0x0205
            java.lang.String r4 = ""
        L_0x0205:
            if (r5 != 0) goto L_0x0209
            java.lang.String r5 = "1"
        L_0x0209:
            int r0 = r4.length()     // Catch:{ Exception -> 0x025c }
            if (r0 <= 0) goto L_0x0250
            int r0 = r5.length()     // Catch:{ Exception -> 0x025c }
            if (r0 <= 0) goto L_0x0250
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ NumberFormatException -> 0x021e }
            int r0 = r0.intValue()     // Catch:{ NumberFormatException -> 0x021e }
            goto L_0x021f
        L_0x021e:
            r0 = 1
        L_0x021f:
            switch(r0) {
                case 1: goto L_0x022e;
                case 2: goto L_0x0231;
                case 3: goto L_0x023a;
                case 4: goto L_0x0226;
                case 5: goto L_0x0223;
                default: goto L_0x0222;
            }
        L_0x0222:
            goto L_0x023a
        L_0x0223:
            r11.f367aC = r4     // Catch:{ Exception -> 0x025c }
            goto L_0x023a
        L_0x0226:
            java.lang.String r0 = r11.f368aD     // Catch:{ Exception -> 0x025c }
            int r0 = r0.length()     // Catch:{ Exception -> 0x025c }
            if (r0 != 0) goto L_0x023a
        L_0x022e:
            r11.f368aD = r4     // Catch:{ Exception -> 0x025c }
            goto L_0x023a
        L_0x0231:
            java.lang.String r0 = r11.f368aD     // Catch:{ Exception -> 0x025c }
            int r0 = r0.length()     // Catch:{ Exception -> 0x025c }
            if (r0 != 0) goto L_0x023a
            goto L_0x022e
        L_0x023a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
            r0.<init>()     // Catch:{ Exception -> 0x025c }
            java.lang.String r1 = "ServiceMain.contactInfoRetrieve. curContactNickname = "
            r0.append(r1)     // Catch:{ Exception -> 0x025c }
            java.lang.String r1 = r11.f368aD     // Catch:{ Exception -> 0x025c }
            r0.append(r1)     // Catch:{ Exception -> 0x025c }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x025c }
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r11, (java.lang.String) r0)     // Catch:{ Exception -> 0x025c }
        L_0x0250:
            boolean r0 = r12.moveToNext()     // Catch:{ Exception -> 0x025c }
            goto L_0x01ae
        L_0x0256:
            r12.close()
            goto L_0x0266
        L_0x025a:
            r0 = move-exception
            goto L_0x0262
        L_0x025c:
            java.lang.String r0 = "ServiceMain.contactInfoRetrieve. c3 Exception"
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r11, (java.lang.String) r0)     // Catch:{ all -> 0x025a }
            goto L_0x0256
        L_0x0262:
            r12.close()
            throw r0
        L_0x0266:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "contactRetrieve curContactNickname="
            r12.append(r0)
            java.lang.String r0 = r11.f368aD
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r11, (java.lang.String) r12)
            java.lang.String r12 = r11.f367aC
            int r12 = r12.length()
            if (r12 != 0) goto L_0x02c4
            java.lang.String r12 = "contactRetrieve Computing initials from firstname,lastname"
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r11, (java.lang.String) r12)
            java.lang.String r12 = r11.f365aA
            int r12 = r12.length()
            if (r12 <= 0) goto L_0x029e
            java.lang.String r12 = "contactRetrieve curContactFirstNameOK"
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r11, (java.lang.String) r12)
            java.lang.String r12 = r11.f365aA
            java.lang.String r12 = r12.substring(r2, r3)
            r11.f367aC = r12
        L_0x029e:
            java.lang.String r12 = r11.f366aB
            int r12 = r12.length()
            if (r12 <= 0) goto L_0x02c4
            java.lang.String r12 = "contactRetrieve curContactLastNameOK"
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r11, (java.lang.String) r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = r11.f367aC
            r12.append(r0)
            java.lang.String r0 = r11.f366aB
            java.lang.String r0 = r0.substring(r2, r3)
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.f367aC = r12
        L_0x02c4:
            java.lang.String r12 = r11.f367aC
            java.lang.String r12 = r12.toUpperCase()
            r11.f367aC = r12
            java.lang.String r12 = r11.f367aC
            java.lang.String r0 = "."
            java.lang.String r1 = ""
            java.lang.String r12 = r12.replace(r0, r1)
            java.lang.String r12 = r12.trim()
            java.lang.String r12 = r12.toUpperCase()
            r11.f367aC = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "ServiceMain.contactInfoRetrieve. curContactInitials = "
            r12.append(r0)
            java.lang.String r0 = r11.f367aC
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            goto L_0x0052
        L_0x02f5:
            r12.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dof100.morsenotifier.ServiceMain.m459a(java.lang.String):void");
    }

    /* renamed from: a */
    private void m460a(String str, int i, int i2, int i3, int i4, int i5) {
        C0149l a = App.m426a(getApplicationContext());
        a.mo495a(getApplicationContext(), this.f404h, i2, this.f409m, i3, i4, i5, i, str);
        a.mo496b(getApplicationContext());
        a.mo494a(getApplicationContext());
    }

    /* renamed from: a */
    private void m461a(String str, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4) {
        C0145j jVar = new C0145j(getApplicationContext(), this.f370aF);
        jVar.mo488a(getApplicationContext(), z, z2, this.f408l, this.f400d, i2, i3, this.f406j ? this.f407k : i3, i, i4, i5, this.f417u, str);
        if (z3) {
            switch (this.f419w) {
                case 1:
                case 2:
                case 3:
                    Intent intent = new Intent(this, ActivityDisplayMessage.class);
                    intent.addFlags(32768);
                    intent.addFlags(268435456);
                    intent.putExtra("PARAM_INSTANCE", this.f370aF);
                    intent.putExtra("PARAM_LIST", jVar.mo486a());
                    intent.putExtra("PARAM_DISPLAY_HOW", this.f419w);
                    intent.putExtra("PARAM_DISPLAY_POS", this.f420x);
                    intent.putExtra("PARAM_DISPLAY_STAYONTOP", this.f421y);
                    intent.putExtra("PARAM_DISPLAY_TEXT", this.f422z);
                    intent.putExtra("PARAM_DISPLAY_FLASH", this.f339A);
                    intent.putExtra("PARAM_DISPLAY_COLOR", this.f340B);
                    intent.putExtra("PARAM_DISPLAY_COLOR_ME_HILIGHT", this.f341C);
                    intent.putExtra("PARAM_DISPLAY_COLOR_TEXT_HILIGHT", this.f342D);
                    intent.putExtra("PARAM_DISPLAY_INITIALDELAY", this.f400d);
                    intent.putExtra("PARAM_ENABLEDIALOGSETTINGS", !z4);
                    intent.putExtra("PARAM_STOPMETHOD", this.f401e);
                    try {
                        startActivity(intent);
                        break;
                    } catch (Exception unused) {
                        C0140i.m500a((Context) this, "ServiceMain.play_message ERROR startActivity (ActivityDisplayMessage)");
                        break;
                    }
            }
        }
        jVar.execute(new Void[0]);
        jVar.mo487a(getApplicationContext());
    }

    /* renamed from: a */
    private void m462a(String str, int i, int i2, boolean z) {
        boolean z2;
        boolean z3;
        C0140i.m500a((Context) this, "ServiceMain.play_message: " + str + " instance=" + this.f370aF);
        String lowerCase = str.toLowerCase();
        int a = C0163v.m555a(lowerCase, "s", App.f284c ? this.f405i : this.f410n, 1, 200);
        int a2 = C0163v.m555a(lowerCase, "v", App.f284c ? this.f416t : this.f412p, 0, 100);
        int a3 = C0163v.m555a(lowerCase, "f", this.f415s, 10, 25000);
        int a4 = C0163v.m555a(lowerCase, "r", i2, 1, 10);
        int a5 = C0163v.m555a(lowerCase, "p", this.f411o, 30, 300);
        boolean a6 = C0163v.m562a(lowerCase, "a", this.f413q);
        boolean a7 = C0163v.m562a(lowerCase, "b", this.f414r);
        boolean a8 = C0163v.m562a(lowerCase, "d", this.f418v);
        String a9 = C0163v.m559a(str);
        C0140i.m501a(String.format(Locale.US, "ServiceMain.play_message message=%s stream=%d istest=%b ", new Object[]{a9, Integer.valueOf(i), Boolean.valueOf(z)}));
        C0140i.m501a(String.format(Locale.US, "ServiceMain.play_message speed=%d vol=%d freq=%d repeat=%d pitch=%d", new Object[]{Integer.valueOf(a), Integer.valueOf(a2), Integer.valueOf(a3), Integer.valueOf(a4), Integer.valueOf(a5)}));
        C0140i.m501a(String.format(Locale.US, "ServiceMain.play_message Audio=%b Vibration=%b Display=%b", new Object[]{Boolean.valueOf(a6), Boolean.valueOf(a7), Boolean.valueOf(a8)}));
        if (z) {
            C0140i.m502b(this, getString(R.string.text_announcing) + " " + a9);
        }
        if (a6 || a7 || a8) {
            TelephonyManager telephonyManager = (TelephonyManager) getSystemService("phone");
            boolean z4 = telephonyManager != null && telephonyManager.getCallState() == 2;
            if (App.f284c && this.f399c && !z && z4) {
                C0140i.m500a((Context) this, "ServiceMain.play_message: muted (in call)");
                C0140i.m502b(this, "Morse Notifier: " + a9);
            } else if (!App.f285d || !this.f403g || z || !z4) {
                if (Build.VERSION.SDK_INT >= 23) {
                    NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
                    if (notificationManager != null) {
                        int currentInterruptionFilter = notificationManager.getCurrentInterruptionFilter();
                        C0140i.m501a("ServiceMain.play_message dnd state = " + currentInterruptionFilter);
                        z2 = currentInterruptionFilter;
                    } else {
                        C0140i.m501a("ServiceMain.play_message dnd state = (cannot get)");
                        z2 = true;
                    }
                    z3 = true;
                } else {
                    C0140i.m501a("ServiceMain.play_message dnd state = (cannot get) Android ver<6.0");
                    z3 = true;
                    z2 = true;
                }
                if (z2 == z3) {
                    z3 = false;
                }
                C0140i.m501a("ServiceMain.play_message flagdnd = " + z3);
                if (App.f284c && this.f398b && !z && z3) {
                    C0140i.m500a((Context) this, "ServiceMain.play_message: muted (do not disturb) state=" + z2);
                } else if (!App.f285d || !this.f402f || z || !z3) {
                    if (App.f284c) {
                        m461a(a9, i, a4, a, a3, a2, a6, a7, a8, z);
                    } else {
                        m460a(a9, i, a4, a, a5, a2);
                    }
                    C0140i.m500a((Context) this, "ServiceMain.play_message OUT instance=" + this.f370aF);
                } else {
                    C0140i.m500a((Context) this, "ServiceMain.play_message: muted (do not disturb) state=" + (z2 ? 1 : 0));
                }
            } else {
                C0140i.m500a((Context) this, "ServiceMain.play_message: muted (in call)");
                C0140i.m502b(this, "Voice Notifier: " + a9);
            }
        }
    }

    /* renamed from: a */
    private void m463a(String str, String str2, int i, int i2, boolean z) {
        String string;
        int i3;
        if (this.f392au) {
            C0140i.m500a((Context) this, "ServiceMain.handleReminders");
            Calendar instance = Calendar.getInstance();
            int i4 = instance.get(11);
            int i5 = instance.get(12);
            if (str.equals(getResources().getString(R.string.MSG_REMINDERS_ONE_TEST))) {
                C0140i.m500a((Context) this, "ServiceMain.onHandleIntent (MSG_REMINDERS_TESTONE)");
                m462a(str2, f338a[this.f393av], 1, z);
            } else if (str.equals(getResources().getString(R.string.MSG_REMINDERS_ALL_TEST))) {
                C0140i.m500a((Context) this, "ServiceMain.onHandleIntent (MSG_REMINDERS_TESTALL)");
                C0156p a = new C0157q(this).mo516a();
                if (a != null) {
                    string = a.mo510a();
                    i3 = f338a[this.f393av];
                } else {
                    string = getResources().getString(R.string.test_message);
                    i3 = f338a[this.f393av];
                }
                m462a(string, i3, 1, z);
            } else {
                C0140i.m500a((Context) this, "ServiceMain.onHandleIntent (MSG_REMINDERS_FIRE)");
                int a2 = C0163v.m554a(i4, i5, i, i2);
                if (a2 >= 2) {
                    C0140i.m500a((Context) this, String.format(Locale.US, "ServiceMain.onHandleIntent (MSG_REMINDERS) ERROR now=%02d:%02d reminder=%02d:%02d  dif=%d", new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(a2)}));
                    return;
                }
                m462a(str2, f338a[this.f393av], 1, z);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x013f, code lost:
        if (r0 == false) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0146, code lost:
        if (r6.length() >= 3) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0148, code lost:
        r0 = r6.substring(r6.length() - 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0158, code lost:
        if (r0 == false) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x015f, code lost:
        if (r6.length() >= 0) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0161, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0163, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0168, code lost:
        if (r0.length() == 0) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x016c, code lost:
        if (com.dof100.morsenotifier.App.f285d == false) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x016e, code lost:
        r0 = com.dof100.morsenotifier.C0163v.m560a(r0, ' ');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0174, code lost:
        r6 = new java.lang.StringBuilder();
        r6.append(r1.trim());
        r6.append(" ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0185, code lost:
        r6.append(r0);
        r1 = r6.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0191, code lost:
        if (r6.length() != 0) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0193, code lost:
        r6 = new java.lang.StringBuilder();
        r6.append(r1.trim());
        r6.append(" ");
        r0 = r5.f375ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01a9, code lost:
        if (r5.f372aa == false) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01af, code lost:
        if (r7.length() <= 0) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01b1, code lost:
        r1 = r1.trim() + " " + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01cf, code lost:
        if (r5.f373ab.length() <= 0) goto L_0x01eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01d1, code lost:
        r1 = r1.trim() + " " + r5.f373ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01eb, code lost:
        r6 = r1.trim();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01f3, code lost:
        if (r6.length() != 0) goto L_0x01f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01f5, code lost:
        r6 = "sms";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01f7, code lost:
        m462a(r6, f338a[r5.f357S], r5.f376ae, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0202, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m464a(java.lang.String r6, java.lang.String r7, boolean r8) {
        /*
            r5 = this;
            boolean r0 = r5.f356R
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.String r0 = "ServiceMain.handleSMS"
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r5, (java.lang.String) r0)
            r5.m466b()
            int r0 = r6.length()
            if (r0 <= 0) goto L_0x0016
            r5.m459a((java.lang.String) r6)
        L_0x0016:
            java.lang.String r0 = r5.f396ay
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            java.lang.String r1 = r5.f358T
            java.lang.String r2 = ""
            boolean r3 = r5.f360V
            if (r3 != 0) goto L_0x0039
            boolean r3 = r5.f361W
            if (r3 != 0) goto L_0x0039
            boolean r3 = r5.f362X
            if (r3 != 0) goto L_0x0039
            boolean r3 = r5.f363Y
            if (r3 != 0) goto L_0x0039
            boolean r3 = r5.f364Z
            if (r3 == 0) goto L_0x0130
        L_0x0039:
            boolean r3 = r5.f360V
            if (r3 == 0) goto L_0x005f
            java.lang.String r3 = r5.f397az
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x005f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = r2.trim()
            r3.append(r2)
            java.lang.String r2 = " "
            r3.append(r2)
            java.lang.String r2 = r5.f397az
            r3.append(r2)
            java.lang.String r2 = r3.toString()
        L_0x005f:
            boolean r3 = r5.f361W
            if (r3 == 0) goto L_0x0085
            java.lang.String r3 = r5.f365aA
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x0085
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = r2.trim()
            r3.append(r2)
            java.lang.String r2 = " "
            r3.append(r2)
            java.lang.String r2 = r5.f365aA
            r3.append(r2)
            java.lang.String r2 = r3.toString()
        L_0x0085:
            boolean r3 = r5.f362X
            if (r3 == 0) goto L_0x00ab
            java.lang.String r3 = r5.f366aB
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x00ab
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = r2.trim()
            r3.append(r2)
            java.lang.String r2 = " "
            r3.append(r2)
            java.lang.String r2 = r5.f366aB
            r3.append(r2)
            java.lang.String r2 = r3.toString()
        L_0x00ab:
            boolean r3 = r5.f363Y
            if (r3 == 0) goto L_0x00d1
            java.lang.String r3 = r5.f367aC
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x00d1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = r2.trim()
            r3.append(r2)
            java.lang.String r2 = " "
            r3.append(r2)
            java.lang.String r2 = r5.f367aC
            r3.append(r2)
            java.lang.String r2 = r3.toString()
        L_0x00d1:
            boolean r3 = r5.f364Z
            if (r3 == 0) goto L_0x00f7
            java.lang.String r3 = r5.f368aD
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x00f7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = r2.trim()
            r3.append(r2)
            java.lang.String r2 = " "
            r3.append(r2)
            java.lang.String r2 = r5.f368aD
            r3.append(r2)
            java.lang.String r2 = r3.toString()
        L_0x00f7:
            java.lang.String r2 = r2.trim()
            if (r0 == 0) goto L_0x0116
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = r1.trim()
            r3.append(r1)
            java.lang.String r1 = " "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            goto L_0x0130
        L_0x0116:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = r1.trim()
            r2.append(r1)
            java.lang.String r1 = " "
            r2.append(r1)
            java.lang.String r1 = r5.f374ac
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L_0x0130:
            java.lang.String r2 = ""
            int r3 = r5.f359U
            r4 = 3
            switch(r3) {
                case 1: goto L_0x015b;
                case 2: goto L_0x0152;
                case 11: goto L_0x0142;
                case 12: goto L_0x0139;
                default: goto L_0x0138;
            }
        L_0x0138:
            goto L_0x0163
        L_0x0139:
            int r3 = r6.length()
            if (r3 < r4) goto L_0x0163
            if (r0 != 0) goto L_0x0163
            goto L_0x0148
        L_0x0142:
            int r0 = r6.length()
            if (r0 < r4) goto L_0x0163
        L_0x0148:
            int r0 = r6.length()
            int r0 = r0 - r4
            java.lang.String r0 = r6.substring(r0)
            goto L_0x0164
        L_0x0152:
            int r3 = r6.length()
            if (r3 < 0) goto L_0x0163
            if (r0 != 0) goto L_0x0163
            goto L_0x0161
        L_0x015b:
            int r0 = r6.length()
            if (r0 < 0) goto L_0x0163
        L_0x0161:
            r0 = r6
            goto L_0x0164
        L_0x0163:
            r0 = r2
        L_0x0164:
            int r2 = r0.length()
            if (r2 == 0) goto L_0x018d
            boolean r6 = com.dof100.morsenotifier.App.f285d
            if (r6 == 0) goto L_0x0174
            r6 = 32
            java.lang.String r0 = com.dof100.morsenotifier.C0163v.m560a((java.lang.String) r0, (char) r6)
        L_0x0174:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = r1.trim()
            r6.append(r1)
            java.lang.String r1 = " "
            r6.append(r1)
        L_0x0185:
            r6.append(r0)
            java.lang.String r1 = r6.toString()
            goto L_0x01a7
        L_0x018d:
            int r6 = r6.length()
            if (r6 != 0) goto L_0x01a7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = r1.trim()
            r6.append(r0)
            java.lang.String r0 = " "
            r6.append(r0)
            java.lang.String r0 = r5.f375ad
            goto L_0x0185
        L_0x01a7:
            boolean r6 = r5.f372aa
            if (r6 == 0) goto L_0x01c9
            int r6 = r7.length()
            if (r6 <= 0) goto L_0x01c9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = r1.trim()
            r6.append(r0)
            java.lang.String r0 = " "
            r6.append(r0)
            r6.append(r7)
            java.lang.String r1 = r6.toString()
        L_0x01c9:
            java.lang.String r6 = r5.f373ab
            int r6 = r6.length()
            if (r6 <= 0) goto L_0x01eb
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r1.trim()
            r6.append(r7)
            java.lang.String r7 = " "
            r6.append(r7)
            java.lang.String r7 = r5.f373ab
            r6.append(r7)
            java.lang.String r1 = r6.toString()
        L_0x01eb:
            java.lang.String r6 = r1.trim()
            int r7 = r6.length()
            if (r7 != 0) goto L_0x01f7
            java.lang.String r6 = "sms"
        L_0x01f7:
            int[] r7 = f338a
            int r0 = r5.f357S
            r7 = r7[r0]
            int r0 = r5.f376ae
            r5.m462a(r6, r7, r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dof100.morsenotifier.ServiceMain.m464a(java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x013f, code lost:
        if (r0 == false) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0146, code lost:
        if (r6.length() >= 3) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0148, code lost:
        r0 = r6.substring(r6.length() - 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0158, code lost:
        if (r0 == false) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x015f, code lost:
        if (r6.length() >= 0) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0161, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0163, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0168, code lost:
        if (r0.length() == 0) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x016c, code lost:
        if (com.dof100.morsenotifier.App.f285d == false) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x016e, code lost:
        r0 = com.dof100.morsenotifier.C0163v.m560a(r0, ' ');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0174, code lost:
        r6 = new java.lang.StringBuilder();
        r6.append(r1.trim());
        r6.append(" ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0185, code lost:
        r6.append(r0);
        r1 = r6.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0191, code lost:
        if (r6.length() != 0) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0193, code lost:
        r6 = new java.lang.StringBuilder();
        r6.append(r1.trim());
        r6.append(" ");
        r0 = r5.f354P;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ad, code lost:
        if (r5.f352N.length() <= 0) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01af, code lost:
        r1 = r1.trim() + " " + r5.f352N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01c9, code lost:
        r6 = r1.trim();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01d1, code lost:
        if (r6.length() != 0) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d3, code lost:
        r6 = "Call";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01d5, code lost:
        com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r5, "ServiceMain.onHandleIntent (MSG_CALL_RINGING) curText = " + r6);
        m462a(r6, f338a[r5.f344F], r5.f355Q, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f4, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m465a(java.lang.String r6, boolean r7) {
        /*
            r5 = this;
            boolean r0 = r5.f343E
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.String r0 = "ServiceMain.handleCall"
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r5, (java.lang.String) r0)
            r5.m466b()
            int r0 = r6.length()
            if (r0 <= 0) goto L_0x0016
            r5.m459a((java.lang.String) r6)
        L_0x0016:
            java.lang.String r0 = r5.f396ay
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            java.lang.String r1 = r5.f345G
            java.lang.String r2 = ""
            boolean r3 = r5.f347I
            if (r3 != 0) goto L_0x0039
            boolean r3 = r5.f348J
            if (r3 != 0) goto L_0x0039
            boolean r3 = r5.f349K
            if (r3 != 0) goto L_0x0039
            boolean r3 = r5.f350L
            if (r3 != 0) goto L_0x0039
            boolean r3 = r5.f351M
            if (r3 == 0) goto L_0x0130
        L_0x0039:
            boolean r3 = r5.f347I
            if (r3 == 0) goto L_0x005f
            java.lang.String r3 = r5.f397az
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x005f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = r2.trim()
            r3.append(r2)
            java.lang.String r2 = " "
            r3.append(r2)
            java.lang.String r2 = r5.f397az
            r3.append(r2)
            java.lang.String r2 = r3.toString()
        L_0x005f:
            boolean r3 = r5.f348J
            if (r3 == 0) goto L_0x0085
            java.lang.String r3 = r5.f365aA
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x0085
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = r2.trim()
            r3.append(r2)
            java.lang.String r2 = " "
            r3.append(r2)
            java.lang.String r2 = r5.f365aA
            r3.append(r2)
            java.lang.String r2 = r3.toString()
        L_0x0085:
            boolean r3 = r5.f349K
            if (r3 == 0) goto L_0x00ab
            java.lang.String r3 = r5.f366aB
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x00ab
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = r2.trim()
            r3.append(r2)
            java.lang.String r2 = " "
            r3.append(r2)
            java.lang.String r2 = r5.f366aB
            r3.append(r2)
            java.lang.String r2 = r3.toString()
        L_0x00ab:
            boolean r3 = r5.f350L
            if (r3 == 0) goto L_0x00d1
            java.lang.String r3 = r5.f367aC
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x00d1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = r2.trim()
            r3.append(r2)
            java.lang.String r2 = " "
            r3.append(r2)
            java.lang.String r2 = r5.f367aC
            r3.append(r2)
            java.lang.String r2 = r3.toString()
        L_0x00d1:
            boolean r3 = r5.f351M
            if (r3 == 0) goto L_0x00f7
            java.lang.String r3 = r5.f368aD
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x00f7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = r2.trim()
            r3.append(r2)
            java.lang.String r2 = " "
            r3.append(r2)
            java.lang.String r2 = r5.f368aD
            r3.append(r2)
            java.lang.String r2 = r3.toString()
        L_0x00f7:
            java.lang.String r2 = r2.trim()
            if (r0 == 0) goto L_0x0116
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = r1.trim()
            r3.append(r1)
            java.lang.String r1 = " "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            goto L_0x0130
        L_0x0116:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = r1.trim()
            r2.append(r1)
            java.lang.String r1 = " "
            r2.append(r1)
            java.lang.String r1 = r5.f353O
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L_0x0130:
            java.lang.String r2 = ""
            int r3 = r5.f346H
            r4 = 3
            switch(r3) {
                case 1: goto L_0x015b;
                case 2: goto L_0x0152;
                case 11: goto L_0x0142;
                case 12: goto L_0x0139;
                default: goto L_0x0138;
            }
        L_0x0138:
            goto L_0x0163
        L_0x0139:
            int r3 = r6.length()
            if (r3 < r4) goto L_0x0163
            if (r0 != 0) goto L_0x0163
            goto L_0x0148
        L_0x0142:
            int r0 = r6.length()
            if (r0 < r4) goto L_0x0163
        L_0x0148:
            int r0 = r6.length()
            int r0 = r0 - r4
            java.lang.String r0 = r6.substring(r0)
            goto L_0x0164
        L_0x0152:
            int r3 = r6.length()
            if (r3 < 0) goto L_0x0163
            if (r0 != 0) goto L_0x0163
            goto L_0x0161
        L_0x015b:
            int r0 = r6.length()
            if (r0 < 0) goto L_0x0163
        L_0x0161:
            r0 = r6
            goto L_0x0164
        L_0x0163:
            r0 = r2
        L_0x0164:
            int r2 = r0.length()
            if (r2 == 0) goto L_0x018d
            boolean r6 = com.dof100.morsenotifier.App.f285d
            if (r6 == 0) goto L_0x0174
            r6 = 32
            java.lang.String r0 = com.dof100.morsenotifier.C0163v.m560a((java.lang.String) r0, (char) r6)
        L_0x0174:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = r1.trim()
            r6.append(r1)
            java.lang.String r1 = " "
            r6.append(r1)
        L_0x0185:
            r6.append(r0)
            java.lang.String r1 = r6.toString()
            goto L_0x01a7
        L_0x018d:
            int r6 = r6.length()
            if (r6 != 0) goto L_0x01a7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = r1.trim()
            r6.append(r0)
            java.lang.String r0 = " "
            r6.append(r0)
            java.lang.String r0 = r5.f354P
            goto L_0x0185
        L_0x01a7:
            java.lang.String r6 = r5.f352N
            int r6 = r6.length()
            if (r6 <= 0) goto L_0x01c9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = r1.trim()
            r6.append(r0)
            java.lang.String r0 = " "
            r6.append(r0)
            java.lang.String r0 = r5.f352N
            r6.append(r0)
            java.lang.String r1 = r6.toString()
        L_0x01c9:
            java.lang.String r6 = r1.trim()
            int r0 = r6.length()
            if (r0 != 0) goto L_0x01d5
            java.lang.String r6 = "Call"
        L_0x01d5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ServiceMain.onHandleIntent (MSG_CALL_RINGING) curText = "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r5, (java.lang.String) r0)
            int[] r0 = f338a
            int r1 = r5.f344F
            r0 = r0[r1]
            int r1 = r5.f355Q
            r5.m462a(r6, r0, r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dof100.morsenotifier.ServiceMain.m465a(java.lang.String, boolean):void");
    }

    /* renamed from: b */
    private void m466b() {
        this.f396ay = "";
        this.f397az = "";
        this.f365aA = "";
        this.f366aB = "";
        this.f367aC = "";
        this.f368aD = "";
    }

    /* renamed from: b */
    private void m467b(String str, String str2, boolean z) {
        String str3;
        if (this.f377af) {
            C0140i.m500a((Context) this, "ServiceMain.handleSystem");
            String str4 = "";
            if (str.equals(getResources().getString(R.string.MSG_SYSTEM_BOOT))) {
                m456a();
            } else if (str.equals(getResources().getString(R.string.MSG_SYSTEM_TEST))) {
                str4 = getResources().getString(R.string.test_message);
            } else if (str.equals(getResources().getString(R.string.MSG_SYSTEM_POWER_CONNECTED))) {
                str4 = this.f379ah;
            } else if (str.equals(getResources().getString(R.string.MSG_SYSTEM_POWER_DISCONNECTED))) {
                str4 = this.f380ai;
            } else if (str.equals(getResources().getString(R.string.MSG_SYSTEM_BATTERY_LOW))) {
                str4 = this.f381aj;
            } else if (str.equals(getResources().getString(R.string.MSG_SYSTEM_BATTERY_OK))) {
                str4 = this.f382ak;
            } else if (str.equals(getResources().getString(R.string.MSG_SYSTEM_WF_CONNECTED))) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f384am);
                if (this.f385an) {
                    str3 = " " + str2;
                } else {
                    str3 = "";
                }
                sb.append(str3);
                str4 = sb.toString();
            } else if (str.equals(getResources().getString(R.string.MSG_SYSTEM_WF_DISCONNECTED))) {
                str4 = this.f383al;
            }
            if (!str4.isEmpty()) {
                m462a(str4, f338a[this.f378ag], 1, z);
            }
        }
    }

    /* renamed from: b */
    private void m468b(String str, boolean z) {
        if (this.f394aw) {
            C0140i.m500a((Context) this, "ServiceMain.handleApps");
            if (z) {
                str = getString(R.string.test_message);
            }
            if (!str.isEmpty()) {
                m462a(str, f338a[this.f395ax], 1, false);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m469c() {
        C0140i.m500a((Context) this, "ServiceMain.pref_init");
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        this.f398b = C0163v.m565d(this, defaultSharedPreferences, "pref_morse_general_dnd", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f399c = C0163v.m565d(this, defaultSharedPreferences, "pref_morse_general_muteincalls", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f400d = C0163v.m564c(this, defaultSharedPreferences, "pref_morse_general_initialdelay", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f401e = C0163v.m564c(this, defaultSharedPreferences, "pref_morse_general_volumedownstop", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f402f = C0163v.m565d(this, defaultSharedPreferences, "pref_voice_general_dnd", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f403g = C0163v.m565d(this, defaultSharedPreferences, "pref_voice_general_muteincalls", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f404h = C0163v.m564c(this, defaultSharedPreferences, "pref_voice_general_initialdelay", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f405i = C0163v.m564c(this, defaultSharedPreferences, "pref_morse_wpm", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f406j = C0163v.m565d(this, defaultSharedPreferences, "pref_morse_farnsworth_enable", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f407k = C0163v.m564c(this, defaultSharedPreferences, "pref_morse_farnsworth_wpm", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f408l = C0163v.m565d(this, defaultSharedPreferences, "pref_morse_punctuation", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f409m = C0163v.m563b(this, defaultSharedPreferences, "pref_voice_locale", "pref_general_locale", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f410n = C0163v.m564c(this, defaultSharedPreferences, "pref_voice_speed", "pref_general_speechrate", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f411o = C0163v.m564c(this, defaultSharedPreferences, "pref_voice_pitch", "pref_general_pitch", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f412p = C0163v.m564c(this, defaultSharedPreferences, "pref_voice_vol", "pref_general_volume", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f413q = C0163v.m565d(this, defaultSharedPreferences, "pref_audio_enable", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f414r = C0163v.m565d(this, defaultSharedPreferences, "pref_audio_vibration_enable", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f415s = C0163v.m564c(this, defaultSharedPreferences, "pref_audio_freq", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f416t = C0163v.m564c(this, defaultSharedPreferences, "pref_audio_vol", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f417u = C0163v.m564c(this, defaultSharedPreferences, "pref_audio_ramp", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f418v = C0163v.m565d(this, defaultSharedPreferences, "pref_display_enable", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f419w = C0163v.m564c(this, defaultSharedPreferences, "pref_display_how", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f420x = C0163v.m564c(this, defaultSharedPreferences, "pref_display_pos", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f421y = C0163v.m565d(this, defaultSharedPreferences, "pref_display_stayontop", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f422z = C0163v.m565d(this, defaultSharedPreferences, "pref_display_text", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f339A = C0163v.m565d(this, defaultSharedPreferences, "pref_display_flash", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f340B = C0163v.m566e(this, defaultSharedPreferences, "pref_display_color", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f341C = C0163v.m566e(this, defaultSharedPreferences, "pref_display_color_me_highlight", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f342D = C0163v.m566e(this, defaultSharedPreferences, "pref_display_color_text_highlight", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f343E = C0163v.m565d(this, defaultSharedPreferences, "pref_call_enable", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f344F = C0163v.m564c(this, defaultSharedPreferences, "pref_call_stream", "pref_call_e1pro_stream", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f345G = C0163v.m563b(this, defaultSharedPreferences, "pref_call_string1", "pref_call_e1pro_string1", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f346H = C0163v.m564c(this, defaultSharedPreferences, "pref_call_num", "pref_call_e1pro_num", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f347I = C0163v.m565d(this, defaultSharedPreferences, "pref_call_contactdisplayname", "pref_call_e1pro_contactdisplayname", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f348J = C0163v.m565d(this, defaultSharedPreferences, "pref_call_contactfirstname", "pref_call_e1pro_contactfirstname", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f349K = C0163v.m565d(this, defaultSharedPreferences, "pref_call_contactlastname", "pref_call_e1pro_contactlastname", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f350L = C0163v.m565d(this, defaultSharedPreferences, "pref_call_contactinitials", "pref_call_e1pro_contactinitials", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f351M = C0163v.m565d(this, defaultSharedPreferences, "pref_call_contactnickname", "pref_call_e1pro_contactnickname", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f352N = C0163v.m563b(this, defaultSharedPreferences, "pref_call_string2", "pref_call_e1pro_string2", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f353O = C0163v.m563b(this, defaultSharedPreferences, "pref_call_contactname_none", "pref_call_e1pro_contactname_none", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f354P = C0163v.m563b(this, defaultSharedPreferences, "pref_call_num_none", "pref_call_e1pro_num_none", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f355Q = C0163v.m564c(this, defaultSharedPreferences, "pref_call_repeat", "pref_call_e1pro_repeat", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f356R = C0163v.m565d(this, defaultSharedPreferences, "pref_sms_enable", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f357S = C0163v.m564c(this, defaultSharedPreferences, "pref_sms_stream", "pref_sms_e1pro_stream", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f358T = C0163v.m563b(this, defaultSharedPreferences, "pref_sms_string1", "pref_sms_e1pro_string1", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f359U = C0163v.m564c(this, defaultSharedPreferences, "pref_sms_num", "pref_sms_e1pro_num", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f360V = C0163v.m565d(this, defaultSharedPreferences, "pref_sms_contactdisplayname", "pref_sms_e1pro_contactdisplayname", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f361W = C0163v.m565d(this, defaultSharedPreferences, "pref_sms_contactfirstname", "pref_sms_e1pro_contactfirstname", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f362X = C0163v.m565d(this, defaultSharedPreferences, "pref_sms_contactlastname", "pref_sms_e1pro_contactlastname", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f363Y = C0163v.m565d(this, defaultSharedPreferences, "pref_sms_contactinitials", "pref_sms_e1pro_contactinitials", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f364Z = C0163v.m565d(this, defaultSharedPreferences, "pref_sms_contactnickname", "pref_sms_e1pro_contactnickname", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f372aa = C0163v.m565d(this, defaultSharedPreferences, "pref_sms_text", "pref_sms_e1pro_text", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f373ab = C0163v.m563b(this, defaultSharedPreferences, "pref_sms_string2", "pref_sms_e1pro_string2", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f374ac = C0163v.m563b(this, defaultSharedPreferences, "pref_sms_contactname_none", "pref_sms_e1pro_contactname_none", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f375ad = C0163v.m563b(this, defaultSharedPreferences, "pref_sms_num_none", "pref_sms_e1pro_num_none", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f376ae = C0163v.m564c(this, defaultSharedPreferences, "pref_sms_repeat", "pref_sms_e1pro_repeat", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f377af = C0163v.m565d(this, defaultSharedPreferences, "pref_system_enable", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f378ag = C0163v.m564c(this, defaultSharedPreferences, "pref_system_stream", "pref_system_e1pro_stream", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f379ah = C0163v.m563b(this, defaultSharedPreferences, "pref_system_powerconectedstring", "pref_system_e1pro_powerconectedstring", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f380ai = C0163v.m563b(this, defaultSharedPreferences, "pref_system_powerdisconectedstring", "pref_system_e1pro_powerdisconectedstring", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f381aj = C0163v.m563b(this, defaultSharedPreferences, "pref_system_batterylowstring", "pref_system_e1pro_batterylowstring", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f382ak = C0163v.m563b(this, defaultSharedPreferences, "pref_system_batteryokstring", "pref_system_e1pro_batteryokstring", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f383al = C0163v.m563b(this, defaultSharedPreferences, "pref_system_wifi_disconnectedstring", "pref_system_e1pro_wifi_disconnectedstring", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f384am = C0163v.m563b(this, defaultSharedPreferences, "pref_system_wifi_connectedstring", "pref_system_e1pro_wifi_connectedstring", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f385an = C0163v.m565d(this, defaultSharedPreferences, "pref_system_wifi_connectedssid", "pref_system_e1pro_wifi_connectedssid", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f394aw = C0163v.m565d(this, defaultSharedPreferences, "pref_apps_enable", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f395ax = C0163v.m564c(this, defaultSharedPreferences, "pref_apps_stream", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f386ao = C0163v.m565d(this, defaultSharedPreferences, "pref_chime_enable", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        for (int i = 0; i < 24; i++) {
            this.f388aq[i] = C0163v.m565d(this, defaultSharedPreferences, String.format(Locale.US, "pref_chime_hourenable_%02d", new Object[]{Integer.valueOf(i)}), (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        }
        this.f387ap = C0163v.m564c(this, defaultSharedPreferences, "pref_chime_stream", "pref_chime_e1pro_stream", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f389ar = C0163v.m563b(this, defaultSharedPreferences, "pref_chime_string1", "pref_chime_e1pro_string1", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f390as = C0163v.m563b(this, defaultSharedPreferences, "pref_chime_string2", "pref_chime_e1pro_string2", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f391at = C0163v.m564c(this, defaultSharedPreferences, "pref_chime_timehow", "pref_chime_e1pro_timehow", App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f392au = C0163v.m565d(this, defaultSharedPreferences, "pref_reminders_enable", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        this.f393av = C0163v.m564c(this, defaultSharedPreferences, "pref_reminders_stream", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
    }

    public IBinder onBind(Intent intent) {
        C0140i.m501a("ServiceMain.onBind");
        return null;
    }

    public void onCreate() {
        super.onCreate();
        C0140i.m501a("ServiceMain.OnCreate");
    }

    public void onDestroy() {
        C0140i.m501a("ServiceMain.OnDestroy");
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        C0140i.m501a("-----------------------------------------------------------------------------------------");
        C0140i.m501a("ServiceMain.onHandleIntent");
        C0140i.m501a("ServiceMain.onCreate registering broadcast receiver");
        C0014b a = C0014b.m1a((Context) this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("LBR_ACTION_SETTINGSCHANGED");
        a.mo2a(this.f371aG, intentFilter);
        m469c();
        String stringExtra = intent != null ? intent.getStringExtra(getResources().getString(R.string.MSG_WHAT)) : "";
        String stringExtra2 = intent != null ? intent.getStringExtra(getResources().getString(R.string.MSG_EXTRATEXT1)) : "";
        String stringExtra3 = intent != null ? intent.getStringExtra(getResources().getString(R.string.MSG_EXTRATEXT2)) : "";
        int intExtra = intent != null ? intent.getIntExtra(getResources().getString(R.string.MSG_EXTRAINT1), -1) : 0;
        int intExtra2 = intent != null ? intent.getIntExtra(getResources().getString(R.string.MSG_EXTRAINT2), -1) : 0;
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        String str = stringExtra2;
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        C0140i.m500a((Context) this, String.format(Locale.US, "ServiceMain.onHandleIntent What=%s extraT1=%s extraT2=%s extraI1=%d extraI2=%d", new Object[]{stringExtra, str, stringExtra3, Integer.valueOf(intExtra), Integer.valueOf(intExtra2)}));
        boolean endsWith = stringExtra.endsWith("_TEST");
        if (endsWith) {
            C0140i.m501a("ServiceMain.onHandleIntent isTest=true");
        }
        if (stringExtra.equals(getResources().getString(R.string.MSG_MN_TEST))) {
            m462a(getString(R.string.test_message), 5, 1, true);
        } else if (stringExtra.equals(getResources().getString(R.string.MSG_MN_ACTIVITYMAIN))) {
            m456a();
        } else if (stringExtra.equals(getResources().getString(R.string.MSG_MN_STOP))) {
            C0140i.m501a("ServiceMain.onHandleIntent MSG_MN_STOP");
        } else if (stringExtra.startsWith(getResources().getString(R.string.MSG_CALL))) {
            m465a(str, endsWith);
        } else if (stringExtra.startsWith(getResources().getString(R.string.MSG_SMS))) {
            m464a(str, stringExtra3, endsWith);
        } else if (stringExtra.startsWith(getResources().getString(R.string.MSG_SYSTEM))) {
            m467b(stringExtra, stringExtra3, endsWith);
        } else if (stringExtra.startsWith(getResources().getString(R.string.MSG_CHIME))) {
            m457a(intExtra, intExtra2, endsWith);
        } else if (stringExtra.startsWith(getResources().getString(R.string.MSG_REMINDERS))) {
            m463a(stringExtra, str, intExtra, intExtra2, endsWith);
        } else if (stringExtra.startsWith(getResources().getString(R.string.MSG_APPS))) {
            m468b(stringExtra3, endsWith);
        }
        C0140i.m501a("ServiceMain.onHandleIntent unregistering local BroadcastReceiver");
        C0014b.m1a((Context) this).mo1a(this.f371aG);
        C0140i.m500a((Context) this, "ServiceMain.onHandleIntent OUT");
        C0140i.m501a("-----------------------------------------------------------------------------------------");
    }
}
