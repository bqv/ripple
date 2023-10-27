package com.evernote.android.job.v14;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p000v4.app.C0026c;
import com.evernote.android.job.C0202k;
import com.evernote.android.job.C0205m;
import com.evernote.android.job.p005a.C0174d;

public final class PlatformAlarmService extends C0026c {

    /* renamed from: j */
    private static final C0174d f739j = new C0174d("PlatformAlarmService");

    /* renamed from: a */
    public static void m885a(Context context, int i, Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtra("EXTRA_JOB_ID", i);
        if (bundle != null) {
            intent.putExtra("EXTRA_TRANSIENT_EXTRAS", bundle);
        }
        m15a(context, PlatformAlarmService.class, 2147480001, intent);
    }

    /* renamed from: a */
    static void m886a(Intent intent, Service service, C0174d dVar) {
        if (intent == null) {
            dVar.mo567a("Delivered intent is null");
            return;
        }
        int intExtra = intent.getIntExtra("EXTRA_JOB_ID", -1);
        Bundle bundleExtra = intent.getBundleExtra("EXTRA_TRANSIENT_EXTRAS");
        C0202k.C0203a aVar = new C0202k.C0203a(service, dVar, intExtra);
        C0205m a = aVar.mo660a(true, true);
        if (a != null) {
            aVar.mo659a(a, bundleExtra);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11a(Intent intent) {
        m886a(intent, (Service) this, f739j);
    }
}
