package com.evernote.android.job;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import com.evernote.android.job.p005a.C0174d;
import com.evernote.android.job.p005a.C0177g;

/* renamed from: com.evernote.android.job.p */
final class C0217p {

    /* renamed from: a */
    private static final C0174d f736a = new C0174d("WakeLockUtil");

    /* renamed from: b */
    private static final SparseArray<PowerManager.WakeLock> f737b = new SparseArray<>();

    /* renamed from: c */
    private static int f738c = 1;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        return r7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.ComponentName m879a(android.content.Context r6, android.content.Intent r7) {
        /*
            android.util.SparseArray<android.os.PowerManager$WakeLock> r0 = f737b
            monitor-enter(r0)
            int r1 = f738c     // Catch:{ all -> 0x0049 }
            int r2 = f738c     // Catch:{ all -> 0x0049 }
            r3 = 1
            int r2 = r2 + r3
            f738c = r2     // Catch:{ all -> 0x0049 }
            int r2 = f738c     // Catch:{ all -> 0x0049 }
            if (r2 > 0) goto L_0x0011
            f738c = r3     // Catch:{ all -> 0x0049 }
        L_0x0011:
            java.lang.String r2 = "com.evernote.android.job.wakelockid"
            r7.putExtra(r2, r1)     // Catch:{ all -> 0x0049 }
            android.content.ComponentName r7 = r6.startService(r7)     // Catch:{ all -> 0x0049 }
            if (r7 != 0) goto L_0x001f
            r6 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return r6
        L_0x001f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
            r2.<init>()     // Catch:{ all -> 0x0049 }
            java.lang.String r3 = "wake:"
            r2.append(r3)     // Catch:{ all -> 0x0049 }
            java.lang.String r3 = r7.flattenToShortString()     // Catch:{ all -> 0x0049 }
            r2.append(r3)     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0049 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MINUTES     // Catch:{ all -> 0x0049 }
            r4 = 3
            long r3 = r3.toMillis(r4)     // Catch:{ all -> 0x0049 }
            android.os.PowerManager$WakeLock r6 = m880a((android.content.Context) r6, (java.lang.String) r2, (long) r3)     // Catch:{ all -> 0x0049 }
            if (r6 == 0) goto L_0x0047
            android.util.SparseArray<android.os.PowerManager$WakeLock> r2 = f737b     // Catch:{ all -> 0x0049 }
            r2.put(r1, r6)     // Catch:{ all -> 0x0049 }
        L_0x0047:
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return r7
        L_0x0049:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.C0217p.m879a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    /* renamed from: a */
    static PowerManager.WakeLock m880a(Context context, String str, long j) {
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, str);
        newWakeLock.setReferenceCounted(false);
        if (m882a(context, newWakeLock, j)) {
            return newWakeLock;
        }
        return null;
    }

    /* renamed from: a */
    static void m881a(PowerManager.WakeLock wakeLock) {
        if (wakeLock != null) {
            try {
                if (wakeLock.isHeld()) {
                    wakeLock.release();
                }
            } catch (Exception e) {
                f736a.mo569a((Throwable) e);
            }
        }
    }

    /* renamed from: a */
    static boolean m882a(Context context, PowerManager.WakeLock wakeLock, long j) {
        if (wakeLock == null || wakeLock.isHeld() || !C0177g.m646b(context)) {
            return false;
        }
        try {
            wakeLock.acquire(j);
            return true;
        } catch (Exception e) {
            f736a.mo569a((Throwable) e);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m883a(Intent intent) {
        int intExtra;
        if (intent == null || (intExtra = intent.getIntExtra("com.evernote.android.job.wakelockid", 0)) == 0) {
            return false;
        }
        synchronized (f737b) {
            m881a(f737b.get(intExtra));
            f737b.remove(intExtra);
        }
        return true;
    }
}
