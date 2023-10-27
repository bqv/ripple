package com.evernote.android.job.v14;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.evernote.android.job.C0190e;
import com.evernote.android.job.C0202k;
import com.evernote.android.job.p005a.C0174d;
import java.util.HashSet;
import java.util.Set;

public final class PlatformAlarmServiceExact extends Service {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C0174d f740a = new C0174d("PlatformAlarmServiceExact");

    /* renamed from: b */
    private final Object f741b = new Object();

    /* renamed from: c */
    private volatile Set<Integer> f742c;

    /* renamed from: d */
    private volatile int f743d;

    /* renamed from: a */
    public static Intent m888a(Context context, int i, Bundle bundle) {
        Intent intent = new Intent(context, PlatformAlarmServiceExact.class);
        intent.putExtra("EXTRA_JOB_ID", i);
        if (bundle != null) {
            intent.putExtra("EXTRA_TRANSIENT_EXTRAS", bundle);
        }
        return intent;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m890a(int i) {
        synchronized (this.f741b) {
            Set<Integer> set = this.f742c;
            if (set != null) {
                set.remove(Integer.valueOf(i));
                if (set.isEmpty()) {
                    stopSelfResult(this.f743d);
                }
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.f742c = new HashSet();
    }

    public void onDestroy() {
        synchronized (this.f741b) {
            this.f742c = null;
            this.f743d = 0;
        }
    }

    public int onStartCommand(final Intent intent, int i, final int i2) {
        synchronized (this.f741b) {
            this.f742c.add(Integer.valueOf(i2));
            this.f743d = i2;
        }
        C0190e.m704h().execute(new Runnable() {
            public void run() {
                try {
                    PlatformAlarmService.m886a(intent, (Service) PlatformAlarmServiceExact.this, PlatformAlarmServiceExact.f740a);
                } finally {
                    C0202k.C0203a.m769a(intent);
                    PlatformAlarmServiceExact.this.m890a(i2);
                }
            }
        });
        return 2;
    }
}
