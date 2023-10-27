package com.dof100.morsenotifier;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;

public class BRSystem extends BroadcastReceiver {
    /* renamed from: a */
    private int m433a(Context context, NetworkInfo networkInfo) {
        int i;
        Context context2 = context;
        int i2 = -2;
        if (networkInfo == null) {
            C0140i.m500a(context2, "BRSystem.wifiStateChanged netinfo=null");
            return -2;
        }
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        int i3 = defaultSharedPreferences.getInt("BRSystem_LastWiFiStatus", -2);
        long j = defaultSharedPreferences.getLong("BRSystem_LastTimeWiFiConnected", 0);
        long j2 = defaultSharedPreferences.getLong("BRSystem_LastTimeWiFiDisconnected", 0);
        if (networkInfo.isConnected()) {
            C0140i.m500a(context2, "BRSystem.wifiStateChanged isConnected");
            long j3 = currentTimeMillis - j;
            if (j3 < 0) {
                j3 = 5001;
            }
            if (i3 == 1) {
                C0140i.m500a(context2, "BRSystem.wifiStateChanged already connected");
                i2 = -3;
            } else {
                if (j3 < 5000) {
                    C0140i.m500a(context2, "BRSystem.wifiStateChanged dt since last connect < MINDT");
                    i2 = -3;
                } else {
                    C0140i.m500a(context2, "BRSystem.wifiStateChanged connected");
                    i2 = 1;
                }
                i3 = 1;
            }
            j = currentTimeMillis;
        } else if (networkInfo.isConnectedOrConnecting()) {
            C0140i.m500a(context2, "BRSystem.onReceive wifiStateChanged isConnectedOrConnecting");
        } else {
            C0140i.m500a(context2, "BRSystem.wifiStateChanged disConnected");
            long j4 = currentTimeMillis - j2;
            if (j4 < 0) {
                j4 = 5001;
            }
            if (i3 == 0) {
                C0140i.m500a(context2, "BRSystem.wifiStateChanged already disconnected");
                i2 = -3;
            } else {
                if (j4 < 5000) {
                    C0140i.m500a(context2, "BRSystem.wifiStateChanged dt since last disconnect < MINDT");
                    i = -3;
                } else {
                    C0140i.m500a(context2, "BRSystem.onReceive wifiStateChanged disconnected");
                    i = 0;
                }
                i3 = 0;
            }
            SharedPreferences.Editor edit = defaultSharedPreferences.edit();
            edit.putInt("BRSystem_LastWiFiStatus", i3);
            edit.putLong("BRSystem_LastTimeWiFiConnected", j);
            edit.putLong("BRSystem_LastTimeWiFiDisconnected", currentTimeMillis);
            edit.apply();
            return i2;
        }
        currentTimeMillis = j2;
        SharedPreferences.Editor edit2 = defaultSharedPreferences.edit();
        edit2.putInt("BRSystem_LastWiFiStatus", i3);
        edit2.putLong("BRSystem_LastTimeWiFiConnected", j);
        edit2.putLong("BRSystem_LastTimeWiFiDisconnected", currentTimeMillis);
        edit2.apply();
        return i2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r11, android.content.Intent r12) {
        /*
            r10 = this;
            java.lang.String r0 = "BRSystem.onReceive"
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r11, (java.lang.String) r0)
            java.lang.String r0 = ""
            java.lang.String r1 = ""
            java.lang.String r2 = r12.getAction()
            if (r2 != 0) goto L_0x0010
            return
        L_0x0010:
            java.lang.String r3 = "android.intent.action.BOOT_COMPLETED"
            boolean r3 = r2.equals(r3)
            r4 = 2131492876(0x7f0c000c, float:1.8609216E38)
            r5 = 2131492900(0x7f0c0024, float:1.8609265E38)
            if (r3 == 0) goto L_0x004a
            android.content.res.Resources r12 = r11.getResources()
            r0 = 2131492894(0x7f0c001e, float:1.8609253E38)
            java.lang.String r12 = r12.getString(r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.dof100.morsenotifier.ServiceMain> r2 = com.dof100.morsenotifier.ServiceMain.class
            r0.<init>(r11, r2)
            android.content.res.Resources r2 = r11.getResources()
            java.lang.String r2 = r2.getString(r5)
            r0.putExtra(r2, r12)
            android.content.res.Resources r12 = r11.getResources()
            java.lang.String r12 = r12.getString(r4)
            r0.putExtra(r12, r1)
            r11.startService(r0)
            return
        L_0x004a:
            r3 = -1
            int r6 = r2.hashCode()
            r7 = 2
            r8 = 0
            r9 = 1
            switch(r6) {
                case -1886648615: goto L_0x007e;
                case -1738947874: goto L_0x0074;
                case -343630553: goto L_0x006a;
                case 498094322: goto L_0x0060;
                case 1019184907: goto L_0x0056;
                default: goto L_0x0055;
            }
        L_0x0055:
            goto L_0x0087
        L_0x0056:
            java.lang.String r6 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0087
            r3 = 0
            goto L_0x0087
        L_0x0060:
            java.lang.String r6 = "android.intent.action.ACTION_BATTERY_OK"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0087
            r3 = 3
            goto L_0x0087
        L_0x006a:
            java.lang.String r6 = "android.net.wifi.STATE_CHANGE"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0087
            r3 = 4
            goto L_0x0087
        L_0x0074:
            java.lang.String r6 = "android.intent.action.ACTION_BATTERY_LOW"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0087
            r3 = 2
            goto L_0x0087
        L_0x007e:
            java.lang.String r6 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0087
            r3 = 1
        L_0x0087:
            switch(r3) {
                case 0: goto L_0x00df;
                case 1: goto L_0x00d7;
                case 2: goto L_0x00cf;
                case 3: goto L_0x00c7;
                case 4: goto L_0x008b;
                default: goto L_0x008a;
            }
        L_0x008a:
            goto L_0x00ea
        L_0x008b:
            java.lang.String r2 = "networkInfo"
            android.os.Parcelable r12 = r12.getParcelableExtra(r2)
            android.net.NetworkInfo r12 = (android.net.NetworkInfo) r12
            int r12 = r10.m433a(r11, r12)
            if (r12 != r9) goto L_0x00bd
            android.content.res.Resources r12 = r11.getResources()
            r0 = 2131492898(0x7f0c0022, float:1.860926E38)
            java.lang.String r0 = r12.getString(r0)
            android.content.Context r12 = r11.getApplicationContext()
            java.lang.String r1 = "wifi"
            java.lang.Object r12 = r12.getSystemService(r1)
            android.net.wifi.WifiManager r12 = (android.net.wifi.WifiManager) r12
            android.net.wifi.WifiInfo r12 = r12.getConnectionInfo()     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r12 = r12.getSSID()     // Catch:{ Exception -> 0x00b9 }
            goto L_0x00bb
        L_0x00b9:
            java.lang.String r12 = ""
        L_0x00bb:
            r1 = r12
            goto L_0x00ea
        L_0x00bd:
            if (r12 != 0) goto L_0x00ea
            android.content.res.Resources r12 = r11.getResources()
            r0 = 2131492899(0x7f0c0023, float:1.8609263E38)
            goto L_0x00e6
        L_0x00c7:
            android.content.res.Resources r12 = r11.getResources()
            r0 = 2131492893(0x7f0c001d, float:1.860925E38)
            goto L_0x00e6
        L_0x00cf:
            android.content.res.Resources r12 = r11.getResources()
            r0 = 2131492892(0x7f0c001c, float:1.8609249E38)
            goto L_0x00e6
        L_0x00d7:
            android.content.res.Resources r12 = r11.getResources()
            r0 = 2131492896(0x7f0c0020, float:1.8609257E38)
            goto L_0x00e6
        L_0x00df:
            android.content.res.Resources r12 = r11.getResources()
            r0 = 2131492895(0x7f0c001f, float:1.8609255E38)
        L_0x00e6:
            java.lang.String r0 = r12.getString(r0)
        L_0x00ea:
            boolean r12 = r0.isEmpty()
            if (r12 != 0) goto L_0x0122
            java.util.Locale r12 = java.util.Locale.US
            java.lang.String r2 = "BRSystem.onReceive Sending intent to ServiceMain info=%s text2=%s"
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r3[r8] = r0
            r3[r9] = r1
            java.lang.String r12 = java.lang.String.format(r12, r2, r3)
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r11, (java.lang.String) r12)
            android.content.Intent r12 = new android.content.Intent
            java.lang.Class<com.dof100.morsenotifier.ServiceMain> r2 = com.dof100.morsenotifier.ServiceMain.class
            r12.<init>(r11, r2)
            android.content.res.Resources r2 = r11.getResources()
            java.lang.String r2 = r2.getString(r5)
            r12.putExtra(r2, r0)
            android.content.res.Resources r0 = r11.getResources()
            java.lang.String r0 = r0.getString(r4)
            r12.putExtra(r0, r1)
            r11.startService(r12)
            return
        L_0x0122:
            java.lang.String r12 = "BRSystem.onReceive Not sending intent"
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r11, (java.lang.String) r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dof100.morsenotifier.BRSystem.onReceive(android.content.Context, android.content.Intent):void");
    }
}
