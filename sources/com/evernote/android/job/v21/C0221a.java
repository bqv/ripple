package com.evernote.android.job.v21;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.evernote.android.job.C0202k;
import com.evernote.android.job.C0204l;
import com.evernote.android.job.C0205m;
import com.evernote.android.job.p005a.C0174d;
import com.evernote.android.job.p005a.C0177g;
import java.util.List;

@TargetApi(21)
/* renamed from: com.evernote.android.job.v21.a */
public class C0221a implements C0202k {

    /* renamed from: a */
    protected final Context f753a;

    /* renamed from: b */
    protected final C0174d f754b;

    public C0221a(Context context) {
        this(context, "JobProxy21");
    }

    protected C0221a(Context context, String str) {
        this.f753a = context;
        this.f754b = new C0174d(str);
    }

    /* renamed from: b */
    protected static String m911b(int i) {
        return i == 1 ? "success" : "failure";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo742a(JobInfo jobInfo) {
        JobScheduler a = mo744a();
        if (a == null) {
            throw new C0204l("JobScheduler is null");
        }
        try {
            return a.schedule(jobInfo);
        } catch (IllegalArgumentException e) {
            this.f754b.mo569a((Throwable) e);
            String message = e.getMessage();
            if (message != null && message.contains("RECEIVE_BOOT_COMPLETED")) {
                return -123;
            }
            if (message == null || !message.contains("No such service ComponentInfo")) {
                throw e;
            }
            throw new C0204l((Throwable) e);
        } catch (NullPointerException e2) {
            this.f754b.mo569a((Throwable) e2);
            throw new C0204l((Throwable) e2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo609a(C0205m.C0211d dVar) {
        switch (dVar) {
            case ANY:
                return 0;
            case CONNECTED:
                return 1;
            case UNMETERED:
            case NOT_ROAMING:
                return 2;
            case METERED:
                return 1;
            default:
                throw new IllegalStateException("not implemented");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public JobInfo.Builder mo743a(JobInfo.Builder builder, long j, long j2) {
        return builder.setMinimumLatency(j).setOverrideDeadline(j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public JobInfo.Builder mo618a(C0205m mVar, JobInfo.Builder builder) {
        if (mVar.mo663B()) {
            C0223b.m926a(this.f753a, mVar);
        }
        return builder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public JobInfo.Builder mo619a(C0205m mVar, boolean z) {
        return mo618a(mVar, new JobInfo.Builder(mVar.mo673c(), new ComponentName(this.f753a, PlatformJobService.class)).setRequiresCharging(mVar.mo685m()).setRequiresDeviceIdle(mVar.mo686n()).setRequiredNetworkType(mo609a(mVar.mo689q())).setPersisted(z && !mVar.mo663B() && C0177g.m644a(this.f753a)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final JobScheduler mo744a() {
        return (JobScheduler) this.f753a.getSystemService("jobscheduler");
    }

    /* renamed from: a */
    public void mo628a(int i) {
        try {
            mo744a().cancel(i);
        } catch (Exception e) {
            this.f754b.mo569a((Throwable) e);
        }
        C0223b.m925a(this.f753a, i, (PendingIntent) null);
    }

    /* renamed from: a */
    public void mo629a(C0205m mVar) {
        long a = C0202k.C0203a.m764a(mVar);
        long a2 = C0202k.C0203a.m765a(mVar, true);
        int a3 = mo742a(mo743a(mo619a(mVar, true), a, a2).build());
        if (a3 == -123) {
            a3 = mo742a(mo743a(mo619a(mVar, false), a, a2).build());
        }
        this.f754b.mo572b("Schedule one-off jobInfo %s, %s, start %s, end %s (from now), reschedule count %d", m911b(a3), mVar, C0177g.m643a(a), C0177g.m643a(C0202k.C0203a.m765a(mVar, false)), Integer.valueOf(C0202k.C0203a.m776g(mVar)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo620a(JobInfo jobInfo, C0205m mVar) {
        if (!(jobInfo != null && jobInfo.getId() == mVar.mo673c())) {
            return false;
        }
        return !mVar.mo663B() || C0223b.m927a(this.f753a, mVar.mo673c());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public JobInfo.Builder mo610b(JobInfo.Builder builder, long j, long j2) {
        return builder.setPeriodic(j);
    }

    /* renamed from: b */
    public void mo631b(C0205m mVar) {
        long j = mVar.mo682j();
        long k = mVar.mo683k();
        int a = mo742a(mo610b(mo619a(mVar, true), j, k).build());
        if (a == -123) {
            a = mo742a(mo610b(mo619a(mVar, false), j, k).build());
        }
        this.f754b.mo572b("Schedule periodic jobInfo %s, %s, interval %s, flex %s", m911b(a), mVar, C0177g.m643a(j), C0177g.m643a(k));
    }

    /* renamed from: c */
    public void mo611c(C0205m mVar) {
        long d = C0202k.C0203a.m773d(mVar);
        long e = C0202k.C0203a.m774e(mVar);
        int a = mo742a(mo743a(mo619a(mVar, true), d, e).build());
        if (a == -123) {
            a = mo742a(mo743a(mo619a(mVar, false), d, e).build());
        }
        this.f754b.mo572b("Schedule periodic (flex support) jobInfo %s, %s, start %s, end %s, flex %s", m911b(a), mVar, C0177g.m643a(d), C0177g.m643a(e), C0177g.m643a(mVar.mo683k()));
    }

    /* renamed from: d */
    public boolean mo612d(C0205m mVar) {
        try {
            List<JobInfo> allPendingJobs = mo744a().getAllPendingJobs();
            if (allPendingJobs == null || allPendingJobs.isEmpty()) {
                return false;
            }
            for (JobInfo a : allPendingJobs) {
                if (mo620a(a, mVar)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            this.f754b.mo569a((Throwable) e);
            return false;
        }
    }
}
