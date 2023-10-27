package com.dof100.morsenotifier;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Vibrator;
import android.support.p000v4.p001a.C0014b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.dof100.morsenotifier.j */
class C0145j extends AsyncTask<Void, Void, Void> {

    /* renamed from: a */
    private WeakReference<Context> f465a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f466b;

    /* renamed from: c */
    private boolean f467c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f468d = false;

    /* renamed from: e */
    private boolean f469e = false;

    /* renamed from: f */
    private int f470f = 0;

    /* renamed from: g */
    private int f471g = 1;

    /* renamed from: h */
    private int f472h = 0;

    /* renamed from: i */
    private int f473i = 0;

    /* renamed from: j */
    private int f474j = 0;

    /* renamed from: k */
    private int f475k = 0;

    /* renamed from: l */
    private String f476l = "";

    /* renamed from: m */
    private boolean f477m = false;

    /* renamed from: n */
    private int f478n = 3;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f479o = 100;

    /* renamed from: p */
    private int f480p = 0;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f481q = 0;

    /* renamed from: r */
    private int f482r = 0;

    /* renamed from: s */
    private long f483s = 0;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public int f484t = 0;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f485u = false;

    /* renamed from: v */
    private AudioTrack f486v = null;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public Vibrator f487w = null;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final ArrayList<Integer> f488x = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final CountDownLatch f489y = new CountDownLatch(1);

    /* renamed from: z */
    private final BroadcastReceiver f490z = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            if ("LBR_ACTION_FINISH".equals(intent.getAction())) {
                C0140i.m500a(context, "MyPlayerMorse.BroadcastReceiver  got ACTION_FINISH ");
                boolean unused = C0145j.this.f485u = true;
                C0145j.this.f489y.countDown();
            }
        }
    };

    C0145j(Context context, int i) {
        this.f465a = new WeakReference<>(context);
        this.f466b = i;
        C0140i.m500a(context, "MyPlayerMorse constructor instance=" + i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x022e, code lost:
        m505a(-2, -1);
        m505a(2, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0234, code lost:
        m505a(-1, -1);
        m505a(-1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0266, code lost:
        m505a(-2, -1);
        m505a(1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0283, code lost:
        m505a(-2, -1);
        m505a(1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x028e, code lost:
        m505a(-2, -1);
        m505a(2, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0294, code lost:
        m505a(-1, -1);
        m505a(-1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02a5, code lost:
        m505a(-2, -1);
        m505a(1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02ab, code lost:
        m505a(-2, -1);
        m505a(2, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02b1, code lost:
        m505a(-1, -1);
        m505a(-1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02b7, code lost:
        m505a(-2, -1);
        m505a(2, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02bd, code lost:
        m505a(-1, -1);
        m505a(-1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02ce, code lost:
        m505a(-2, -1);
        m505a(1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02de, code lost:
        m505a(-1, -1);
        m505a(-1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02e4, code lost:
        m505a(-2, -1);
        m505a(2, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02ea, code lost:
        m505a(-1, -1);
        m505a(-1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02f0, code lost:
        m505a(-2, -1);
        m505a(2, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02f6, code lost:
        m505a(-1, -1);
        m505a(-1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0300, code lost:
        m505a(-2, -1);
        m505a(2, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0306, code lost:
        m505a(-1, -1);
        m505a(-1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x030c, code lost:
        m505a(-2, -1);
        m505a(1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0312, code lost:
        m505a(-2, -1);
        m505a(1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x031c, code lost:
        m505a(-2, -1);
        m505a(2, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0322, code lost:
        m505a(-1, -1);
        m505a(-1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0328, code lost:
        m505a(-2, -1);
        m505a(1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x032e, code lost:
        m505a(-2, -1);
        m505a(1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0334, code lost:
        m505a(-2, -1);
        m505a(2, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x033a, code lost:
        m505a(-1, -1);
        m505a(-1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0340, code lost:
        m505a(-2, -1);
        m505a(1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0356, code lost:
        m505a(-2, -1);
        m505a(2, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x035c, code lost:
        m505a(-1, -1);
        m505a(-1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0362, code lost:
        m505a(-2, -1);
        m505a(1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0368, code lost:
        m505a(-2, -1);
        m505a(2, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x036e, code lost:
        m505a(-1, -1);
        m505a(-1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0374, code lost:
        m505a(-2, -1);
        m505a(2, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x037a, code lost:
        m505a(-1, -1);
        m505a(-1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0380, code lost:
        if (r8 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0384, code lost:
        if (r0 >= r6.f478n) goto L_0x038c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0386, code lost:
        m505a(-3, -3);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008e, code lost:
        m505a(1, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b8, code lost:
        m505a(-2, -1);
        m505a(2, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00be, code lost:
        m505a(-1, -1);
        m505a(-1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c4, code lost:
        m505a(-2, -1);
        m505a(1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ca, code lost:
        m505a(-2, -1);
        m505a(1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d2, code lost:
        m505a(2, (int) r7);
        m505a(-1, -1);
        m505a(-1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e2, code lost:
        m505a(1, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e6, code lost:
        m505a(1, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ea, code lost:
        m505a(2, (int) r7);
        m505a(-1, -1);
        m505a(-1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f3, code lost:
        m505a(-2, -1);
        m505a(1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fb, code lost:
        m505a(1, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0100, code lost:
        m505a(2, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0105, code lost:
        m505a(2, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010a, code lost:
        m505a(2, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010e, code lost:
        m505a(1, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011b, code lost:
        m505a(2, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0120, code lost:
        m505a(1, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0125, code lost:
        m505a(1, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012a, code lost:
        m505a(2, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x012f, code lost:
        m505a(1, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0134, code lost:
        m505a(2, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0139, code lost:
        m505a(2, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x013e, code lost:
        m505a(2, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0143, code lost:
        m505a(1, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0148, code lost:
        m505a(2, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0152, code lost:
        m505a(1, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0157, code lost:
        m505a(1, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015c, code lost:
        m505a(2, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0161, code lost:
        m505a(1, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0166, code lost:
        m505a(1, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x016b, code lost:
        m505a(2, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x016f, code lost:
        m505a(2, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0174, code lost:
        m505a(2, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0179, code lost:
        m505a(1, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0187, code lost:
        m505a(-1, -1);
        m505a(-1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01c8, code lost:
        m505a(-2, -1);
        m505a(2, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ce, code lost:
        m505a(-1, -1);
        m505a(-1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01d4, code lost:
        m505a(-2, -1);
        m505a(2, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01da, code lost:
        m505a(-1, -1);
        m505a(-1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01e5, code lost:
        m505a(-1, -1);
        m505a(-1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01fa, code lost:
        m505a(-2, -1);
        m505a(1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0222, code lost:
        m505a(-2, -1);
        m505a(2, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0228, code lost:
        m505a(-1, -1);
        m505a(-1, -1);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m504a(char r7, boolean r8) {
        /*
            r6 = this;
            boolean r0 = r6.f469e
            if (r0 != 0) goto L_0x0016
            r0 = 33
            if (r7 < r0) goto L_0x000c
            r0 = 47
            if (r7 <= r0) goto L_0x0014
        L_0x000c:
            r0 = 58
            if (r7 < r0) goto L_0x0016
            r0 = 64
            if (r7 > r0) goto L_0x0016
        L_0x0014:
            r7 = 32
        L_0x0016:
            r0 = 0
            r1 = -3
            r2 = 2
            r3 = 1
            r4 = -2
            r5 = -1
            switch(r7) {
                case 33: goto L_0x0347;
                case 34: goto L_0x0319;
                default: goto L_0x001f;
            }
        L_0x001f:
            switch(r7) {
                case 38: goto L_0x02fd;
                case 39: goto L_0x02d5;
                case 40: goto L_0x02c5;
                case 41: goto L_0x029c;
                default: goto L_0x0022;
            }
        L_0x0022:
            switch(r7) {
                case 43: goto L_0x028b;
                case 44: goto L_0x026e;
                case 45: goto L_0x0257;
                case 46: goto L_0x0241;
                case 47: goto L_0x023c;
                case 48: goto L_0x0219;
                case 49: goto L_0x0215;
                case 50: goto L_0x020b;
                case 51: goto L_0x0206;
                case 52: goto L_0x0202;
                case 53: goto L_0x01f7;
                case 54: goto L_0x01ed;
                case 55: goto L_0x01e2;
                case 56: goto L_0x01bf;
                case 57: goto L_0x01ba;
                case 58: goto L_0x01aa;
                case 59: goto L_0x0199;
                default: goto L_0x0025;
            }
        L_0x0025:
            switch(r7) {
                case 63: goto L_0x018f;
                case 64: goto L_0x017e;
                default: goto L_0x0028;
            }
        L_0x0028:
            switch(r7) {
                case 97: goto L_0x0179;
                case 98: goto L_0x0174;
                case 99: goto L_0x016f;
                case 100: goto L_0x016b;
                case 101: goto L_0x0166;
                case 102: goto L_0x0161;
                case 103: goto L_0x015c;
                case 104: goto L_0x0157;
                case 105: goto L_0x0152;
                case 106: goto L_0x014d;
                case 107: goto L_0x0148;
                case 108: goto L_0x0143;
                case 109: goto L_0x013e;
                case 110: goto L_0x0139;
                case 111: goto L_0x0134;
                case 112: goto L_0x012f;
                case 113: goto L_0x012a;
                case 114: goto L_0x0125;
                case 115: goto L_0x0120;
                case 116: goto L_0x011b;
                case 117: goto L_0x0117;
                case 118: goto L_0x0113;
                case 119: goto L_0x010e;
                case 120: goto L_0x010a;
                case 121: goto L_0x0105;
                case 122: goto L_0x0100;
                default: goto L_0x002b;
            }
        L_0x002b:
            switch(r7) {
                case 228: goto L_0x00fb;
                case 229: goto L_0x008e;
                case 230: goto L_0x00fb;
                case 231: goto L_0x00ea;
                case 232: goto L_0x00e6;
                case 233: goto L_0x00e2;
                default: goto L_0x002e;
            }
        L_0x002e:
            switch(r7) {
                case 240: goto L_0x00dd;
                case 241: goto L_0x00d2;
                default: goto L_0x0031;
            }
        L_0x0031:
            switch(r7) {
                case 940: goto L_0x0179;
                case 941: goto L_0x0166;
                case 942: goto L_0x0157;
                case 943: goto L_0x0152;
                default: goto L_0x0034;
            }
        L_0x0034:
            switch(r7) {
                case 945: goto L_0x0179;
                case 946: goto L_0x0174;
                case 947: goto L_0x015c;
                case 948: goto L_0x016b;
                case 949: goto L_0x0166;
                case 950: goto L_0x0100;
                case 951: goto L_0x0157;
                case 952: goto L_0x016f;
                case 953: goto L_0x0152;
                case 954: goto L_0x0148;
                case 955: goto L_0x0143;
                case 956: goto L_0x013e;
                case 957: goto L_0x0139;
                default: goto L_0x0037;
            }
        L_0x0037:
            switch(r7) {
                case 959: goto L_0x0134;
                case 960: goto L_0x012f;
                case 961: goto L_0x0125;
                case 962: goto L_0x0120;
                case 963: goto L_0x0120;
                case 964: goto L_0x011b;
                case 965: goto L_0x0105;
                case 966: goto L_0x0161;
                case 967: goto L_0x010a;
                case 968: goto L_0x012a;
                case 969: goto L_0x010e;
                default: goto L_0x003a;
            }
        L_0x003a:
            switch(r7) {
                case 972: goto L_0x0134;
                case 973: goto L_0x0105;
                case 974: goto L_0x010e;
                default: goto L_0x003d;
            }
        L_0x003d:
            switch(r7) {
                case 36: goto L_0x00a9;
                case 61: goto L_0x009e;
                case 95: goto L_0x0099;
                case 124: goto L_0x0093;
                case 224: goto L_0x008e;
                case 243: goto L_0x0089;
                case 246: goto L_0x0089;
                case 248: goto L_0x0089;
                case 252: goto L_0x0084;
                case 254: goto L_0x007f;
                case 261: goto L_0x00fb;
                case 263: goto L_0x00ea;
                case 265: goto L_0x00ea;
                case 273: goto L_0x00e2;
                case 281: goto L_0x00e2;
                case 285: goto L_0x007a;
                case 293: goto L_0x0075;
                case 309: goto L_0x0070;
                case 322: goto L_0x00e6;
                case 324: goto L_0x00d2;
                case 347: goto L_0x005f;
                case 349: goto L_0x005a;
                case 353: goto L_0x0075;
                case 365: goto L_0x0084;
                case 378: goto L_0x004f;
                case 380: goto L_0x0045;
                default: goto L_0x0040;
            }
        L_0x0040:
            r6.m505a((int) r1, (int) r1)
            goto L_0x0380
        L_0x0045:
            r6.m505a((int) r2, (int) r7)
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
            goto L_0x00b8
        L_0x004f:
            r6.m505a((int) r2, (int) r7)
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
            goto L_0x031c
        L_0x005a:
            r6.m505a((int) r3, (int) r7)
            goto L_0x0328
        L_0x005f:
            r6.m505a((int) r3, (int) r7)
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r3, (int) r5)
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r3, (int) r5)
            goto L_0x0300
        L_0x0070:
            r6.m505a((int) r3, (int) r7)
            goto L_0x02e4
        L_0x0075:
            r6.m505a((int) r2, (int) r7)
            goto L_0x0228
        L_0x007a:
            r6.m505a((int) r2, (int) r7)
            goto L_0x0187
        L_0x007f:
            r6.m505a((int) r3, (int) r7)
            goto L_0x01c8
        L_0x0084:
            r6.m505a((int) r3, (int) r7)
            goto L_0x0362
        L_0x0089:
            r6.m505a((int) r2, (int) r7)
            goto L_0x02ea
        L_0x008e:
            r6.m505a((int) r3, (int) r7)
            goto L_0x02ab
        L_0x0093:
            r6.m505a((int) r4, (int) r5)
            r8 = 0
            goto L_0x0380
        L_0x0099:
            r6.m505a((int) r3, (int) r7)
            goto L_0x02a5
        L_0x009e:
            r6.m505a((int) r2, (int) r7)
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
            goto L_0x0266
        L_0x00a9:
            r6.m505a((int) r3, (int) r7)
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r3, (int) r5)
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r3, (int) r5)
        L_0x00b8:
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r2, (int) r5)
        L_0x00be:
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
        L_0x00c4:
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r3, (int) r5)
        L_0x00ca:
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r3, (int) r5)
            goto L_0x0374
        L_0x00d2:
            r6.m505a((int) r2, (int) r7)
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
            goto L_0x0356
        L_0x00dd:
            r6.m505a((int) r3, (int) r7)
            goto L_0x02ce
        L_0x00e2:
            r6.m505a((int) r3, (int) r7)
            goto L_0x00f3
        L_0x00e6:
            r6.m505a((int) r3, (int) r7)
            goto L_0x00b8
        L_0x00ea:
            r6.m505a((int) r2, (int) r7)
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
        L_0x00f3:
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r3, (int) r5)
            goto L_0x01d4
        L_0x00fb:
            r6.m505a((int) r3, (int) r7)
            goto L_0x02b7
        L_0x0100:
            r6.m505a((int) r2, (int) r7)
            goto L_0x01ce
        L_0x0105:
            r6.m505a((int) r2, (int) r7)
            goto L_0x035c
        L_0x010a:
            r6.m505a((int) r2, (int) r7)
            goto L_0x00be
        L_0x010e:
            r6.m505a((int) r3, (int) r7)
            goto L_0x0368
        L_0x0113:
            r6.m505a((int) r3, (int) r7)
            goto L_0x00c4
        L_0x0117:
            r6.m505a((int) r3, (int) r7)
            goto L_0x00ca
        L_0x011b:
            r6.m505a((int) r2, (int) r7)
            goto L_0x037a
        L_0x0120:
            r6.m505a((int) r3, (int) r7)
            goto L_0x0312
        L_0x0125:
            r6.m505a((int) r3, (int) r7)
            goto L_0x0334
        L_0x012a:
            r6.m505a((int) r2, (int) r7)
            goto L_0x02b1
        L_0x012f:
            r6.m505a((int) r3, (int) r7)
            goto L_0x02f0
        L_0x0134:
            r6.m505a((int) r2, (int) r7)
            goto L_0x0234
        L_0x0139:
            r6.m505a((int) r2, (int) r7)
            goto L_0x033a
        L_0x013e:
            r6.m505a((int) r2, (int) r7)
            goto L_0x036e
        L_0x0143:
            r6.m505a((int) r3, (int) r7)
            goto L_0x01d4
        L_0x0148:
            r6.m505a((int) r2, (int) r7)
            goto L_0x02bd
        L_0x014d:
            r6.m505a((int) r3, (int) r7)
            goto L_0x022e
        L_0x0152:
            r6.m505a((int) r3, (int) r7)
            goto L_0x0340
        L_0x0157:
            r6.m505a((int) r3, (int) r7)
            goto L_0x030c
        L_0x015c:
            r6.m505a((int) r2, (int) r7)
            goto L_0x02f6
        L_0x0161:
            r6.m505a((int) r3, (int) r7)
            goto L_0x032e
        L_0x0166:
            r6.m505a((int) r3, (int) r7)
            goto L_0x0380
        L_0x016b:
            r6.m505a((int) r2, (int) r7)
            goto L_0x01da
        L_0x016f:
            r6.m505a((int) r2, (int) r7)
            goto L_0x0294
        L_0x0174:
            r6.m505a((int) r2, (int) r7)
            goto L_0x0306
        L_0x0179:
            r6.m505a((int) r3, (int) r7)
            goto L_0x0374
        L_0x017e:
            r6.m505a((int) r3, (int) r7)
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r2, (int) r5)
        L_0x0187:
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
            goto L_0x028e
        L_0x018f:
            r6.m505a((int) r3, (int) r7)
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r3, (int) r5)
            goto L_0x01c8
        L_0x0199:
            r6.m505a((int) r2, (int) r7)
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r3, (int) r5)
            goto L_0x028e
        L_0x01aa:
            r6.m505a((int) r2, (int) r7)
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r2, (int) r5)
            goto L_0x01e5
        L_0x01ba:
            r6.m505a((int) r2, (int) r7)
            goto L_0x02de
        L_0x01bf:
            r6.m505a((int) r2, (int) r7)
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
        L_0x01c8:
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r2, (int) r5)
        L_0x01ce:
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
        L_0x01d4:
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r2, (int) r5)
        L_0x01da:
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
            goto L_0x0312
        L_0x01e2:
            r6.m505a((int) r2, (int) r7)
        L_0x01e5:
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
            goto L_0x0300
        L_0x01ed:
            r6.m505a((int) r2, (int) r7)
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
            goto L_0x01fa
        L_0x01f7:
            r6.m505a((int) r3, (int) r7)
        L_0x01fa:
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r3, (int) r5)
            goto L_0x030c
        L_0x0202:
            r6.m505a((int) r3, (int) r7)
            goto L_0x0266
        L_0x0206:
            r6.m505a((int) r3, (int) r7)
            goto L_0x0283
        L_0x020b:
            r6.m505a((int) r3, (int) r7)
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r3, (int) r5)
            goto L_0x022e
        L_0x0215:
            r6.m505a((int) r3, (int) r7)
            goto L_0x0222
        L_0x0219:
            r6.m505a((int) r2, (int) r7)
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
        L_0x0222:
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r2, (int) r5)
        L_0x0228:
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
        L_0x022e:
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r2, (int) r5)
        L_0x0234:
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
            goto L_0x0368
        L_0x023c:
            r6.m505a((int) r2, (int) r7)
            goto L_0x0322
        L_0x0241:
            r6.m505a((int) r3, (int) r7)
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r2, (int) r5)
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r3, (int) r5)
            goto L_0x02b7
        L_0x0257:
            r6.m505a((int) r2, (int) r7)
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r3, (int) r5)
        L_0x0266:
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r3, (int) r5)
            goto L_0x00c4
        L_0x026e:
            r6.m505a((int) r2, (int) r7)
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r2, (int) r5)
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
        L_0x0283:
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r3, (int) r5)
            goto L_0x0362
        L_0x028b:
            r6.m505a((int) r3, (int) r7)
        L_0x028e:
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r2, (int) r5)
        L_0x0294:
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
            goto L_0x032e
        L_0x029c:
            r6.m505a((int) r2, (int) r7)
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
        L_0x02a5:
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r3, (int) r5)
        L_0x02ab:
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r2, (int) r5)
        L_0x02b1:
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
        L_0x02b7:
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r2, (int) r5)
        L_0x02bd:
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
            goto L_0x00ca
        L_0x02c5:
            r6.m505a((int) r2, (int) r7)
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
        L_0x02ce:
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r3, (int) r5)
            goto L_0x02f0
        L_0x02d5:
            r6.m505a((int) r3, (int) r7)
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r2, (int) r5)
        L_0x02de:
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
        L_0x02e4:
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r2, (int) r5)
        L_0x02ea:
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
        L_0x02f0:
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r2, (int) r5)
        L_0x02f6:
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
            goto L_0x0334
        L_0x02fd:
            r6.m505a((int) r3, (int) r7)
        L_0x0300:
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r2, (int) r5)
        L_0x0306:
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
        L_0x030c:
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r3, (int) r5)
        L_0x0312:
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r3, (int) r5)
            goto L_0x0340
        L_0x0319:
            r6.m505a((int) r3, (int) r7)
        L_0x031c:
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r2, (int) r5)
        L_0x0322:
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
        L_0x0328:
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r3, (int) r5)
        L_0x032e:
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r3, (int) r5)
        L_0x0334:
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r2, (int) r5)
        L_0x033a:
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
        L_0x0340:
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r3, (int) r5)
            goto L_0x0380
        L_0x0347:
            r6.m505a((int) r2, (int) r7)
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r3, (int) r5)
        L_0x0356:
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r2, (int) r5)
        L_0x035c:
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
        L_0x0362:
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r3, (int) r5)
        L_0x0368:
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r2, (int) r5)
        L_0x036e:
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
        L_0x0374:
            r6.m505a((int) r4, (int) r5)
            r6.m505a((int) r2, (int) r5)
        L_0x037a:
            r6.m505a((int) r5, (int) r5)
            r6.m505a((int) r5, (int) r5)
        L_0x0380:
            if (r8 == 0) goto L_0x038c
        L_0x0382:
            int r7 = r6.f478n
            if (r0 >= r7) goto L_0x038c
            r6.m505a((int) r1, (int) r1)
            int r0 = r0 + 1
            goto L_0x0382
        L_0x038c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dof100.morsenotifier.C0145j.m504a(char, boolean):void");
    }

    /* renamed from: a */
    private void m505a(int i, int i2) {
        this.f488x.add(Integer.valueOf(i));
        this.f488x.add(Integer.valueOf(i2));
    }

    /* renamed from: b */
    private void m508b() {
        if (this.f486v != null) {
            try {
                if (Build.VERSION.SDK_INT >= 21) {
                    this.f486v.setVolume(0.0f);
                } else {
                    this.f486v.setStereoVolume(0.0f, 0.0f);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    private void m510c() {
        C0140i.m501a("MyPlayerMorse.seqCreate ");
        this.f488x.clear();
        m505a(-6, -3);
        C0140i.m501a(String.format(Locale.US, "MyPlayerMorse.seqCreate repeat=%d text=%s", new Object[]{Integer.valueOf(this.f471g), this.f476l}));
        boolean z = false;
        int i = 0;
        while (!z) {
            String lowerCase = this.f476l.toLowerCase(Locale.US);
            int length = lowerCase.length();
            int i2 = 0;
            while (i2 < length) {
                char charAt = lowerCase.charAt(i2);
                i2++;
                m504a(charAt, i2 >= length || lowerCase.charAt(i2) != '|');
            }
            i++;
            int size = (this.f479o * this.f488x.size()) / 2;
            C0140i.m501a(String.format(Locale.US, "MyPlayerMorse.seqCreate   iter=%d   mList.size=%d   Dur=%d msec", new Object[]{Integer.valueOf(i), Integer.valueOf(this.f488x.size()), Integer.valueOf(size)}));
            if (this.f471g <= 0 ? size > (-this.f471g) * 1000 : i >= this.f471g) {
                z = true;
            }
            if (i > 100) {
                C0140i.m501a("MyPlayerMorse.seqCreate  ERROR niters>100");
                z = true;
            }
            if (!z) {
                m505a(-3, -3);
                m505a(-3, -3);
                m505a(-3, -3);
                m505a(-3, -3);
                m505a(-3, -3);
                m505a(-3, -3);
                m505a(-3, -3);
                m505a(-3, -3);
                m505a(-3, -3);
                m505a(-3, -3);
                m505a(-3, -3);
                m505a(-3, -3);
                m505a(-3, -3);
                m505a(-3, -3);
                m505a(-3, -3);
            }
        }
        C0140i.m501a("MyPlayerMorse.seqCreate after message mList.size=" + this.f488x.size() + "   Nelements=" + this.f481q);
        m505a(-7, -3);
        m505a(-7, -3);
        m505a(-7, -3);
        m505a(-7, -3);
        m505a(-7, -3);
        m505a(-8, -3);
        C0140i.m501a("MyPlayerMorse.seqCreate after mDelayAfter mList.size=" + this.f488x.size());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Void doInBackground(Void... voidArr) {
        int i;
        if (this.f465a == null) {
            C0140i.m501a("MyMorsePlayer.doInBackground ERROR wr_context=null instance=" + this.f466b);
            this.f489y.countDown();
            return null;
        }
        final Context context = (Context) this.f465a.get();
        if (context == null) {
            C0140i.m501a("MyMorsePlayer.doInBackground ERROR tmpContext=null instance=" + this.f466b);
            this.f489y.countDown();
            return null;
        } else if (this.f481q <= 0) {
            C0140i.m501a("MyMorsePlayer.doInBackground Exiting...  mNElements=" + this.f481q);
            this.f489y.countDown();
            return null;
        } else {
            C0140i.m501a("MyPlayerMorse.doInBackground. Creating tone instance=" + this.f466b);
            try {
                C0162u uVar = new C0162u(this.f481q * this.f479o, this.f480p);
                for (int i2 = 0; i2 < this.f481q; i2++) {
                    int intValue = this.f488x.get(i2 * 2).intValue();
                    if (intValue == 1) {
                        uVar.mo527a(i2 * this.f479o, this.f479o, (float) this.f473i, (float) this.f474j, ((float) (this.f475k * this.f479o)) / 100.0f);
                    } else if (intValue == 2) {
                        uVar.mo527a(i2 * this.f479o, this.f479o * 3, (float) this.f473i, (float) this.f474j, ((float) (this.f475k * this.f479o)) / 100.0f);
                    }
                }
                C0140i.m501a("MyPlayerMorse.doInBackground registering broadcast receiver instance=" + this.f466b);
                C0014b a = C0014b.m1a(context);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("LBR_ACTION_FINISH");
                a.mo2a(this.f490z, intentFilter);
                this.f484t = uVar.f576a / this.f481q;
                C0140i.m501a("MyPlayerMorse.doInBackground AudioTrack play nElements=" + this.f481q);
                C0140i.m501a("MyPlayerMorse.doInBackground AudioTrack play nSamples=" + uVar.f576a);
                C0140i.m501a("MyPlayerMorse.doInBackground AudioTrack play nSamplesDur=" + this.f484t);
                if (uVar.f576a <= 0) {
                    C0140i.m501a("MyMorsePlayer.doInBackground Exiting...  tmpTone.mNSamples=" + uVar.f576a);
                    this.f489y.countDown();
                    return null;
                } else if (uVar.f577b.length <= 0) {
                    C0140i.m501a("MyMorsePlayer.doInBackground Exiting...  tmpTone.mGeneratedSnd.length=" + uVar.f577b.length);
                    this.f489y.countDown();
                    return null;
                } else {
                    C0140i.m501a("MyPlayerMorse.doInBackground. Creating audiotrack. Buffersize=" + this.f482r);
                    try {
                        i = AudioTrack.getMinBufferSize(this.f480p, 4, 2);
                    } catch (Exception unused) {
                        C0140i.m501a("MyPlayerMorse.doInBackground. ERROR getMinBufferSize");
                        i = this.f480p * 4;
                    }
                    try {
                        if (Build.VERSION.SDK_INT >= 26) {
                            this.f486v = new AudioTrack.Builder().setAudioAttributes(new AudioAttributes.Builder().setLegacyStreamType(this.f472h).build()).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(this.f480p).setChannelMask(4).build()).setBufferSizeInBytes(i).setTransferMode(1).build();
                        } else {
                            AudioTrack audioTrack = r12;
                            AudioTrack audioTrack2 = new AudioTrack(this.f472h, this.f480p, 4, 2, i, 1);
                            this.f486v = audioTrack;
                        }
                        if (!this.f467c) {
                            C0140i.m501a("MyPlayerMorse doInBackground mEnableSound=false. Muting...");
                            m508b();
                        }
                        C0140i.m501a("MyPlayerMorse.doInBackground. Audiotrack created. checking mAudioTrack state =" + this.f486v.getState());
                        int i3 = 0;
                        while (this.f486v.getState() != 1) {
                            i3++;
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            C0140i.m501a("MyPlayerMorse.doInBackground. Audiotrack created. mAudioTrack.getstate=" + this.f486v.getState());
                            if (i3 >= 20) {
                                C0140i.m501a("MyPlayerMorse.doInBackground ERROR mAudioTrack.state!=STATE_INITIALIZED after 20 tries. Stopping... instance=" + this.f466b);
                                this.f489y.countDown();
                                return null;
                            }
                        }
                        if (this.f485u) {
                            C0140i.m501a("MyPlayerMorse.doInBackground commandstop=true... instance=" + this.f466b);
                            this.f489y.countDown();
                            return null;
                        } else if (this.f489y.getCount() != 1) {
                            C0140i.m501a("MyPlayerMorse.doInBackground mDoneLatch.getCount() != 1 instance=" + this.f466b);
                            return null;
                        } else {
                            if (this.f470f > 0) {
                                long currentTimeMillis = System.currentTimeMillis() - this.f483s;
                                long j = ((long) this.f470f) - currentTimeMillis;
                                C0140i.m501a(String.format(Locale.US, "MyPlayerMorse.doInBackground Waiting %d-%d=%d msec", new Object[]{Integer.valueOf(this.f470f), Long.valueOf(currentTimeMillis), Long.valueOf(j)}));
                                if (j > 0 && j < 10000) {
                                    try {
                                        Thread.sleep(j);
                                    } catch (InterruptedException unused2) {
                                        C0140i.m501a("MyPlayerMorse.doInBackground ERROR sleep in delay before instance=" + this.f466b);
                                    }
                                }
                                C0140i.m501a("MyPlayerMorse.doInBackground Waiting finished instance=" + this.f466b);
                            }
                            C0140i.m501a("MyPlayerMorse.doInBackground Start Playing instance=" + this.f466b);
                            C0140i.m501a("MyPlayerMorse.doInBackground AudioTrack play nElements=" + this.f481q);
                            C0140i.m501a("MyPlayerMorse.doInBackground AudioTrack play nSamples=" + uVar.f576a);
                            C0140i.m501a("MyPlayerMorse.doInBackground AudioTrack play nSamplesDur=" + this.f484t);
                            try {
                                this.f486v.play();
                                C0140i.m501a("MyPlayerMorse.doInBackground Setting notifications instance=" + this.f466b);
                                try {
                                    this.f486v.setNotificationMarkerPosition(uVar.f576a - 1);
                                    this.f486v.setPositionNotificationPeriod(this.f484t);
                                    this.f486v.setPlaybackPositionUpdateListener(new AudioTrack.OnPlaybackPositionUpdateListener() {
                                        public void onMarkerReached(AudioTrack audioTrack) {
                                            if (audioTrack == null) {
                                                C0140i.m501a("MyPlayerMorse.doInBackground onMarkerReached audiotrack=null instance=" + C0145j.this.f466b);
                                                return;
                                            }
                                            try {
                                                audioTrack.stop();
                                            } catch (IllegalStateException unused) {
                                                C0140i.m501a("MyPlayerMorse.doInBackground ERROR IllegalStateException");
                                            }
                                            C0140i.m501a("MyPlayerMorse.doInBackground onMarkerReached instance=" + C0145j.this.f466b);
                                            C0145j.this.f489y.countDown();
                                        }

                                        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e7, code lost:
                                            r1.vibrate(android.os.VibrationEffect.createWaveform(r10, -1));
                                         */
                                        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ee, code lost:
                                            return;
                                         */
                                        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f1, code lost:
                                            com.dof100.morsenotifier.C0145j.m514g(r1).vibrate(r10, -1);
                                         */
                                        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f8, code lost:
                                            return;
                                         */
                                        /* Code decompiled incorrectly, please refer to instructions dump. */
                                        public void onPeriodicNotification(android.media.AudioTrack r10) {
                                            /*
                                                r9 = this;
                                                if (r10 != 0) goto L_0x001d
                                                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                                                r10.<init>()
                                                java.lang.String r0 = "MyPlayerMorse.doInBackground onPeriodicNotification audiotrack=null instance="
                                                r10.append(r0)
                                                com.dof100.morsenotifier.j r0 = com.dof100.morsenotifier.C0145j.this
                                                int r0 = r0.f466b
                                                r10.append(r0)
                                                java.lang.String r10 = r10.toString()
                                                com.dof100.morsenotifier.C0140i.m501a((java.lang.String) r10)
                                                return
                                            L_0x001d:
                                                int r0 = r10.getState()     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                r1 = 1
                                                if (r0 == r1) goto L_0x0025
                                                return
                                            L_0x0025:
                                                int r0 = r10.getPlayState()     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                r2 = 3
                                                if (r0 == r2) goto L_0x002d
                                                return
                                            L_0x002d:
                                                int r0 = r10.getPlaybackHeadPosition()     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                com.dof100.morsenotifier.j r3 = com.dof100.morsenotifier.C0145j.this     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                int r3 = r3.f484t     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                int r0 = r0 / r3
                                                com.dof100.morsenotifier.j r3 = com.dof100.morsenotifier.C0145j.this     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                int r3 = r3.f481q     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                r4 = 21
                                                r5 = 0
                                                if (r0 >= r3) goto L_0x011b
                                                int r3 = r0 * 2
                                                com.dof100.morsenotifier.j r6 = com.dof100.morsenotifier.C0145j.this     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                java.util.ArrayList r6 = r6.f488x     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                int r6 = r6.size()     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                if (r3 < r6) goto L_0x0053
                                                goto L_0x011b
                                            L_0x0053:
                                                com.dof100.morsenotifier.j r6 = com.dof100.morsenotifier.C0145j.this     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                java.util.ArrayList r6 = r6.f488x     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                java.lang.Object r3 = r6.get(r3)     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                int r3 = r3.intValue()     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                r6 = -7
                                                if (r3 != r6) goto L_0x0093
                                                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                r6.<init>()     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                java.lang.String r7 = "MyPlayerMorse.doInBackground onPeriodicNotification STOP detected at "
                                                r6.append(r7)     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                r6.append(r0)     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                java.lang.String r7 = "...  Muting... instance="
                                                r6.append(r7)     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                com.dof100.morsenotifier.j r7 = com.dof100.morsenotifier.C0145j.this     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                int r7 = r7.f466b     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                r6.append(r7)     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                java.lang.String r6 = r6.toString()     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                com.dof100.morsenotifier.C0140i.m501a((java.lang.String) r6)     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                if (r6 < r4) goto L_0x0090
                                                r10.setVolume(r5)     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                goto L_0x0093
                                            L_0x0090:
                                                r10.setStereoVolume(r5, r5)     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                            L_0x0093:
                                                android.content.Context r10 = r2     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                com.dof100.morsenotifier.App.m427a((android.content.Context) r10, (int) r0)     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                com.dof100.morsenotifier.j r10 = com.dof100.morsenotifier.C0145j.this     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                boolean r10 = r10.f468d     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                if (r10 == 0) goto L_0x015e
                                                com.dof100.morsenotifier.j r10 = com.dof100.morsenotifier.C0145j.this     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                android.os.Vibrator r10 = r10.f487w     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                if (r10 == 0) goto L_0x015e
                                                long[] r10 = new long[r2]     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                r10 = {0, 0, 0} // fill-array     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                r0 = -1
                                                if (r3 == r0) goto L_0x015e
                                                r4 = 26
                                                r5 = 0
                                                r6 = 0
                                                r8 = 2
                                                switch(r3) {
                                                    case 1: goto L_0x00f9;
                                                    case 2: goto L_0x00c7;
                                                    default: goto L_0x00b9;
                                                }     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                            L_0x00b9:
                                                r10[r5] = r6     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                r10[r1] = r6     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                com.dof100.morsenotifier.j r0 = com.dof100.morsenotifier.C0145j.this     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                int r0 = r0.f479o     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                long r0 = (long) r0     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                r10[r8] = r0     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                return
                                            L_0x00c7:
                                                r10[r5] = r6     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                com.dof100.morsenotifier.j r3 = com.dof100.morsenotifier.C0145j.this     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                int r3 = r3.f479o     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                int r3 = r3 * 3
                                                long r2 = (long) r3     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                r10[r1] = r2     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                com.dof100.morsenotifier.j r1 = com.dof100.morsenotifier.C0145j.this     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                int r1 = r1.f479o     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                long r1 = (long) r1     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                r10[r8] = r1     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                if (r1 < r4) goto L_0x00ef
                                                com.dof100.morsenotifier.j r1 = com.dof100.morsenotifier.C0145j.this     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                android.os.Vibrator r1 = r1.f487w     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                            L_0x00e7:
                                                android.os.VibrationEffect r10 = android.os.VibrationEffect.createWaveform(r10, r0)     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                r1.vibrate(r10)     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                return
                                            L_0x00ef:
                                                com.dof100.morsenotifier.j r1 = com.dof100.morsenotifier.C0145j.this     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                            L_0x00f1:
                                                android.os.Vibrator r1 = r1.f487w     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                r1.vibrate(r10, r0)     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                return
                                            L_0x00f9:
                                                r10[r5] = r6     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                com.dof100.morsenotifier.j r2 = com.dof100.morsenotifier.C0145j.this     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                int r2 = r2.f479o     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                long r2 = (long) r2     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                r10[r1] = r2     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                com.dof100.morsenotifier.j r1 = com.dof100.morsenotifier.C0145j.this     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                int r1 = r1.f479o     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                long r1 = (long) r1     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                r10[r8] = r1     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                if (r1 < r4) goto L_0x0118
                                                com.dof100.morsenotifier.j r1 = com.dof100.morsenotifier.C0145j.this     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                android.os.Vibrator r1 = r1.f487w     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                goto L_0x00e7
                                            L_0x0118:
                                                com.dof100.morsenotifier.j r1 = com.dof100.morsenotifier.C0145j.this     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                goto L_0x00f1
                                            L_0x011b:
                                                int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                if (r0 < r4) goto L_0x0123
                                                r10.setVolume(r5)     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                goto L_0x0126
                                            L_0x0123:
                                                r10.setStereoVolume(r5, r5)     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                            L_0x0126:
                                                r10.stop()     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                r10.<init>()     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                java.lang.String r0 = "MyPlayerMorse.doInBackground onPeriodicNotification i>=nElements instance="
                                                r10.append(r0)     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                com.dof100.morsenotifier.j r0 = com.dof100.morsenotifier.C0145j.this     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                int r0 = r0.f466b     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                r10.append(r0)     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                java.lang.String r10 = r10.toString()     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                com.dof100.morsenotifier.C0140i.m501a((java.lang.String) r10)     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                com.dof100.morsenotifier.j r10 = com.dof100.morsenotifier.C0145j.this     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                java.util.concurrent.CountDownLatch r10 = r10.f489y     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                r10.countDown()     // Catch:{ IllegalStateException -> 0x0150, Exception -> 0x014d }
                                                return
                                            L_0x014d:
                                                java.lang.String r10 = "MyPlayerMorse.doInBackground onPeriodicNotification->Exception"
                                                goto L_0x0152
                                            L_0x0150:
                                                java.lang.String r10 = "MyPlayerMorse.doInBackground onPeriodicNotification->IllegalStateException"
                                            L_0x0152:
                                                com.dof100.morsenotifier.C0140i.m501a((java.lang.String) r10)
                                                com.dof100.morsenotifier.j r10 = com.dof100.morsenotifier.C0145j.this
                                                java.util.concurrent.CountDownLatch r10 = r10.f489y
                                                r10.countDown()
                                            L_0x015e:
                                                return
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.dof100.morsenotifier.C0145j.C01472.onPeriodicNotification(android.media.AudioTrack):void");
                                        }
                                    });
                                    C0140i.m501a("MyPlayerMorse.doInBackground mAudioTrack.write");
                                    try {
                                        this.f486v.write(uVar.f577b, 0, uVar.f577b.length);
                                        return null;
                                    } catch (Exception unused3) {
                                        C0140i.m501a("MyPlayerMorse.doInBackground ERROR mAudioTrack.write");
                                        this.f489y.countDown();
                                        return null;
                                    }
                                } catch (IllegalStateException unused4) {
                                    C0140i.m501a("MyPlayerMorse.doInBackground AudioTrack.setPlaybackPositionUpdateListener->IllegalStateException");
                                    this.f489y.countDown();
                                    return null;
                                } catch (Exception unused5) {
                                    C0140i.m501a("MyPlayerMorse.doInBackground AudioTrack.setPlaybackPositionUpdateListener->Exception");
                                    this.f489y.countDown();
                                    return null;
                                }
                            } catch (IllegalStateException unused6) {
                                C0140i.m501a("MyPlayerMorse.doInBackground AudioTrack.Play->IllegalStateException");
                                this.f489y.countDown();
                                return null;
                            } catch (Exception unused7) {
                                C0140i.m501a("MyPlayerMorse.doInBackground AudioTrack.Play->Exception");
                                this.f489y.countDown();
                                return null;
                            }
                        }
                    } catch (IllegalArgumentException unused8) {
                        C0140i.m501a(String.format(Locale.US, "MyPlayerMorse.doInBackground. ERROR Creating audiotrack. IllegalArgumentException mstream=%d sr=%d channels=%d encoding=%d length=%d", new Object[]{Integer.valueOf(this.f472h), Integer.valueOf(this.f480p), 4, 2, Integer.valueOf(uVar.f577b.length)}));
                        this.f489y.countDown();
                        return null;
                    } catch (Exception unused9) {
                        C0140i.m501a(String.format(Locale.US, "MyPlayerMorse.doInBackground. ERROR Creating audiotrack. Exception mstream=%d sr=%d channels=%d encoding=%d length=%d", new Object[]{Integer.valueOf(this.f472h), Integer.valueOf(this.f480p), 4, 2, Integer.valueOf(uVar.f577b.length)}));
                        this.f489y.countDown();
                        return null;
                    }
                }
            } catch (Exception unused10) {
                C0140i.m501a("MyPlayerMorse.doInBackground ERROR Creating tone");
                this.f489y.countDown();
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<Integer> mo486a() {
        return this.f488x;
    }

    /* renamed from: a */
    public void mo487a(Context context) {
        String str;
        C0140i.m500a(context, "MyPlayerMorse.playDone instance=" + this.f466b);
        if (!this.f477m) {
            str = "MyPlayerMorse.playDone ERROR mPlayInitOK = false";
        } else {
            long j = (long) ((this.f479o * this.f481q) + 5000);
            if (j < 1000) {
                j = 1000;
            }
            if (j > 120000) {
                j = 120000;
            }
            C0140i.m500a(context, String.format(Locale.US, "MyPlayerMorse.playDone Waiting to finish (max %d msec)", new Object[]{Long.valueOf(j)}));
            try {
                this.f489y.await(j, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                C0140i.m500a(context, "MyPlayerMorse.playDone ERROR ");
            }
            C0140i.m500a(context, "MyPlayerMorse.playDone Waiting OK");
            try {
                C0140i.m500a(context, "MyPlayerMorse.playDone unregistering broadcast receiver  instance=" + this.f466b);
                C0014b.m1a(context).mo1a(this.f490z);
            } catch (Exception e) {
                e.printStackTrace();
            }
            C0140i.m500a(context, "MyPlayerMorse.playDone broadcasting finish  instance=" + this.f466b);
            if (!this.f485u) {
                App.m430b(context);
            }
            C0140i.m500a(context, "MyPlayerMorse.playDone deleting audiotrack  instance=" + this.f466b);
            if (this.f486v != null) {
                try {
                    m508b();
                    this.f486v.stop();
                    this.f486v.release();
                    this.f486v = null;
                } catch (IllegalStateException unused2) {
                } catch (Throwable th) {
                    this.f486v = null;
                    throw th;
                }
                this.f486v = null;
            }
            C0140i.m500a(context, "MyPlayerMorse.playDone deleting context reference  instance=" + this.f466b);
            if (this.f465a != null) {
                this.f465a.clear();
                this.f465a = null;
            }
            str = "MyPlayerMorse.playDone OUT instance=" + this.f466b;
        }
        C0140i.m500a(context, str);
    }

    /* renamed from: a */
    public void mo488a(Context context, boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str) {
        Context context2 = context;
        C0140i.m501a(String.format(Locale.US, "MyPlayerMorse.playInit inst=%d arepeat=%d", new Object[]{Integer.valueOf(this.f466b), Integer.valueOf(i2)}));
        this.f467c = z;
        this.f468d = z2;
        this.f469e = z3;
        this.f470f = i;
        this.f471g = i2;
        this.f472h = i5;
        if (!(this.f472h == 4 || this.f472h == 3 || this.f472h == 5 || this.f472h == 2 || this.f472h == 1)) {
            this.f472h = 3;
        }
        this.f473i = i6;
        if (this.f473i < 100) {
            this.f473i = 100;
        }
        if (this.f473i > 20000) {
            this.f473i = 20000;
        }
        this.f474j = i7;
        if (this.f474j < 1) {
            this.f474j = 1;
        }
        if (this.f474j > 100) {
            this.f474j = 100;
        }
        this.f475k = i8;
        if (this.f475k > 49) {
            this.f475k = 49;
        }
        if (this.f475k < 0) {
            this.f475k = 0;
        }
        this.f476l = str;
        this.f477m = false;
        this.f479o = 60000 / (i3 * 50);
        if (this.f479o < 30) {
            this.f479o = 30;
        }
        if (this.f479o > 1200) {
            this.f479o = 1200;
        }
        this.f480p = AudioTrack.getNativeOutputSampleRate(this.f472h);
        if (this.f480p <= 0) {
            this.f480p = 8000;
        }
        int i9 = 60000 / (i4 * 50);
        if (i9 < 30) {
            i9 = 30;
        }
        if (i9 > 1200) {
            i9 = 1200;
        }
        this.f478n = (i9 * 3) / this.f479o;
        this.f483s = System.currentTimeMillis();
        C0140i.m500a(context2, "MyPlayerMorse.playInit text=" + this.f476l);
        C0140i.m500a(context2, "MyPlayerMorse.playInit pref_call_freq=" + this.f473i);
        C0140i.m500a(context2, "MyPlayerMorse.playInit samplerate=" + this.f480p);
        C0140i.m500a(context2, "MyPlayerMorse.playInit mdur=" + this.f479o);
        C0140i.m500a(context2, "MyPlayerMorse.playInit mSpacesAfterChar=" + this.f478n);
        C0140i.m500a(context2, "MyPlayerMorse.playInit Creating sequence");
        m510c();
        this.f481q = this.f488x.size() / 2;
        this.f482r = ((this.f480p * this.f479o) * this.f481q) / 1000;
        C0140i.m500a(context2, "MyPlayerMorse.playInit nelements " + this.f481q);
        if (this.f468d) {
            C0140i.m500a(context2, "MyPlayerMorse.playInit Initializing vibration");
            this.f487w = (Vibrator) context2.getSystemService("vibrator");
        }
        this.f477m = true;
        C0140i.m500a(context2, "MyPlayerMorse.playInit OUT instance=" + this.f466b);
    }
}
