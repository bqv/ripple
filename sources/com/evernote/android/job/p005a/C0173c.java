package com.evernote.android.job.p005a;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.support.p000v4.p002b.C0039a;
import com.evernote.android.job.C0205m;

/* renamed from: com.evernote.android.job.a.c */
public final class C0173c {
    @TargetApi(17)
    /* renamed from: a */
    public static C0165a m619a(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return C0165a.f583a;
        }
        float intExtra = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
        int intExtra2 = registerReceiver.getIntExtra("plugged", 0);
        boolean z = true;
        if (!(intExtra2 == 1 || intExtra2 == 2 || (Build.VERSION.SDK_INT >= 17 && intExtra2 == 4))) {
            z = false;
        }
        return new C0165a(z, intExtra);
    }

    /* renamed from: a */
    public static boolean m620a() {
        return false;
    }

    /* renamed from: b */
    public static boolean m621b(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        return Build.VERSION.SDK_INT >= 23 ? powerManager.isDeviceIdleMode() || !powerManager.isInteractive() : Build.VERSION.SDK_INT >= 20 ? !powerManager.isInteractive() : !powerManager.isScreenOn();
    }

    /* renamed from: c */
    public static C0205m.C0211d m622c(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) ? C0205m.C0211d.ANY : !C0039a.m51a(connectivityManager) ? C0205m.C0211d.UNMETERED : activeNetworkInfo.isRoaming() ? C0205m.C0211d.CONNECTED : C0205m.C0211d.NOT_ROAMING;
        } catch (Throwable unused) {
            return C0205m.C0211d.ANY;
        }
    }
}
