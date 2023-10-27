package com.evernote.android.job.v21;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.evernote.android.job.C0205m;
import com.evernote.android.job.p005a.C0174d;
import com.evernote.android.job.v14.PlatformAlarmServiceExact;
import java.util.concurrent.TimeUnit;

@TargetApi(21)
/* renamed from: com.evernote.android.job.v21.b */
final class C0223b {

    /* renamed from: a */
    private static final C0174d f756a = new C0174d("TransientBundleCompat");

    /* renamed from: a */
    public static void m925a(Context context, int i, PendingIntent pendingIntent) {
        if (pendingIntent == null) {
            try {
                pendingIntent = PendingIntent.getService(context, i, PlatformAlarmServiceExact.m888a(context, i, (Bundle) null), 536870912);
                if (pendingIntent == null) {
                    return;
                }
            } catch (Exception e) {
                f756a.mo569a((Throwable) e);
                return;
            }
        }
        ((AlarmManager) context.getSystemService("alarm")).cancel(pendingIntent);
        pendingIntent.cancel();
    }

    /* renamed from: a */
    public static void m926a(Context context, C0205m mVar) {
        PendingIntent service = PendingIntent.getService(context, mVar.mo673c(), PlatformAlarmServiceExact.m888a(context, mVar.mo673c(), mVar.mo664C()), 134217728);
        ((AlarmManager) context.getSystemService("alarm")).setExact(1, System.currentTimeMillis() + TimeUnit.DAYS.toMillis(1000), service);
    }

    /* renamed from: a */
    public static boolean m927a(Context context, int i) {
        return PendingIntent.getService(context, i, PlatformAlarmServiceExact.m888a(context, i, (Bundle) null), 536870912) != null;
    }

    /* renamed from: b */
    public static boolean m928b(Context context, C0205m mVar) {
        PendingIntent service = PendingIntent.getService(context, mVar.mo673c(), PlatformAlarmServiceExact.m888a(context, mVar.mo673c(), (Bundle) null), 536870912);
        if (service == null) {
            return false;
        }
        try {
            f756a.mo568a("Delegating transient job %s to API 14", mVar);
            service.send();
            if (!mVar.mo681i()) {
                m925a(context, mVar.mo673c(), service);
            }
            return true;
        } catch (PendingIntent.CanceledException e) {
            f756a.mo569a((Throwable) e);
            return false;
        }
    }
}
