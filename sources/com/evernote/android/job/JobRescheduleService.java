package com.evernote.android.job;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.support.p000v4.app.C0026c;
import com.evernote.android.job.p005a.C0174d;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public final class JobRescheduleService extends C0026c {

    /* renamed from: j */
    static CountDownLatch f579j;

    /* renamed from: k */
    private static final C0174d f580k = new C0174d("JobRescheduleService", false);

    /* renamed from: a */
    static void m567a(Context context) {
        try {
            m15a(context, JobRescheduleService.class, 2147480000, new Intent());
            f579j = new CountDownLatch(1);
        } catch (Exception e) {
            f580k.mo569a((Throwable) e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo529a(C0200i iVar, Collection<C0205m> collection) {
        int i = 0;
        boolean z = false;
        for (C0205m next : collection) {
            if (next.mo699z() ? iVar.mo643a(next.mo673c()) == null : !iVar.mo644a(next.mo696w()).mo612d(next)) {
                try {
                    next.mo666E().mo704a().mo665D();
                } catch (Exception e) {
                    if (!z) {
                        f580k.mo569a((Throwable) e);
                        z = true;
                    }
                }
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11a(Intent intent) {
        try {
            f580k.mo571b("Reschedule service started");
            SystemClock.sleep(C0190e.m699c());
            try {
                C0200i a = C0200i.m735a((Context) this);
                Set<C0205m> a2 = a.mo647a((String) null, true, true);
                int a3 = mo529a(a, a2);
                f580k.mo572b("Reschedule %d jobs of %d jobs", Integer.valueOf(a3), Integer.valueOf(a2.size()));
            } catch (C0201j unused) {
                if (f579j != null) {
                    f579j.countDown();
                }
            }
        } finally {
            if (f579j != null) {
                f579j.countDown();
            }
        }
    }
}
