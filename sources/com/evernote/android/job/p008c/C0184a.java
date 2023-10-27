package com.evernote.android.job.p008c;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.content.Context;
import com.evernote.android.job.C0205m;
import com.evernote.android.job.v21.C0221a;

@TargetApi(24)
/* renamed from: com.evernote.android.job.c.a */
public class C0184a extends C0221a {

    /* renamed from: com.evernote.android.job.c.a$1 */
    static /* synthetic */ class C01851 {

        /* renamed from: a */
        static final /* synthetic */ int[] f629a = new int[C0205m.C0211d.values().length];

        static {
            try {
                f629a[C0205m.C0211d.NOT_ROAMING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public C0184a(Context context) {
        this(context, "JobProxy24");
    }

    public C0184a(Context context, String str) {
        super(context, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo609a(C0205m.C0211d dVar) {
        if (C01851.f629a[dVar.ordinal()] != 1) {
            return super.mo609a(dVar);
        }
        return 3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public JobInfo.Builder mo610b(JobInfo.Builder builder, long j, long j2) {
        return builder.setPeriodic(j, j2);
    }

    /* renamed from: c */
    public void mo611c(C0205m mVar) {
        this.f754b.mo574c("plantPeriodicFlexSupport called although flex is supported");
        super.mo611c(mVar);
    }

    /* renamed from: d */
    public boolean mo612d(C0205m mVar) {
        try {
            return mo620a(mo744a().getPendingJob(mVar.mo673c()), mVar);
        } catch (Exception e) {
            this.f754b.mo569a((Throwable) e);
            return false;
        }
    }
}
