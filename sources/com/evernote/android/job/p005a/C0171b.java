package com.evernote.android.job.p005a;

import android.os.SystemClock;

/* renamed from: com.evernote.android.job.a.b */
public interface C0171b {

    /* renamed from: a */
    public static final C0171b f600a = new C0171b() {
        /* renamed from: a */
        public long mo564a() {
            return System.currentTimeMillis();
        }

        /* renamed from: b */
        public long mo565b() {
            return SystemClock.elapsedRealtime();
        }
    };

    /* renamed from: a */
    long mo564a();

    /* renamed from: b */
    long mo565b();
}
