package com.evernote.android.job.p009d;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.content.Context;
import com.evernote.android.job.C0205m;
import com.evernote.android.job.p008c.C0184a;

@TargetApi(26)
/* renamed from: com.evernote.android.job.d.a */
public class C0188a extends C0184a {

    /* renamed from: com.evernote.android.job.d.a$1 */
    static /* synthetic */ class C01891 {

        /* renamed from: a */
        static final /* synthetic */ int[] f642a = new int[C0205m.C0211d.values().length];

        static {
            try {
                f642a[C0205m.C0211d.METERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public C0188a(Context context) {
        super(context, "JobProxy26");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo609a(C0205m.C0211d dVar) {
        if (C01891.f642a[dVar.ordinal()] != 1) {
            return super.mo609a(dVar);
        }
        return 4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public JobInfo.Builder mo618a(C0205m mVar, JobInfo.Builder builder) {
        return builder.setTransientExtras(mVar.mo664C());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public JobInfo.Builder mo619a(C0205m mVar, boolean z) {
        return super.mo619a(mVar, z).setRequiresBatteryNotLow(mVar.mo687o()).setRequiresStorageNotLow(mVar.mo688p());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo620a(JobInfo jobInfo, C0205m mVar) {
        return jobInfo != null && jobInfo.getId() == mVar.mo673c();
    }
}
