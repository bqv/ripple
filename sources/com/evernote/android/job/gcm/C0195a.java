package com.evernote.android.job.gcm;

import android.content.Context;
import com.evernote.android.job.C0202k;
import com.evernote.android.job.C0204l;
import com.evernote.android.job.C0205m;
import com.evernote.android.job.p005a.C0174d;
import com.evernote.android.job.p005a.C0177g;
import com.google.android.gms.gcm.GcmNetworkManager;
import com.google.android.gms.gcm.OneoffTask;
import com.google.android.gms.gcm.PeriodicTask;
import com.google.android.gms.gcm.Task;

/* renamed from: com.evernote.android.job.gcm.a */
public class C0195a implements C0202k {

    /* renamed from: a */
    private static final C0174d f659a = new C0174d("JobProxyGcm");

    /* renamed from: b */
    private final Context f660b;

    /* renamed from: c */
    private final GcmNetworkManager f661c;

    public C0195a(Context context) {
        this.f660b = context;
        this.f661c = GcmNetworkManager.getInstance(context);
    }

    /* renamed from: a */
    private void m711a(Task task) {
        try {
            this.f661c.schedule(task);
        } catch (IllegalArgumentException e) {
            if (e.getMessage() == null || !e.getMessage().startsWith("The GcmTaskService class you provided")) {
                throw e;
            }
            throw new C0204l((Throwable) e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo626a(C0205m.C0211d dVar) {
        switch (dVar) {
            case ANY:
                return 2;
            case CONNECTED:
                return 0;
            case UNMETERED:
            case NOT_ROAMING:
                return 1;
            default:
                throw new IllegalStateException("not implemented");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T extends Task.Builder> T mo627a(T t, C0205m mVar) {
        t.setTag(mo632e(mVar)).setService(PlatformGcmService.class).setUpdateCurrent(true).setRequiredNetwork(mo626a(mVar.mo689q())).setPersisted(C0177g.m644a(this.f660b)).setRequiresCharging(mVar.mo685m()).setExtras(mVar.mo664C());
        return t;
    }

    /* renamed from: a */
    public void mo628a(int i) {
        this.f661c.cancelTask(mo630b(i), PlatformGcmService.class);
    }

    /* renamed from: a */
    public void mo629a(C0205m mVar) {
        long a = C0202k.C0203a.m764a(mVar);
        long j = a / 1000;
        long b = C0202k.C0203a.m771b(mVar);
        m711a((Task) mo627a(new OneoffTask.Builder(), mVar).setExecutionWindow(j, Math.max(b / 1000, j + 1)).build());
        f659a.mo572b("Scheduled OneoffTask, %s, start %s, end %s (from now), reschedule count %d", mVar, C0177g.m643a(a), C0177g.m643a(b), Integer.valueOf(C0202k.C0203a.m776g(mVar)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo630b(int i) {
        return String.valueOf(i);
    }

    /* renamed from: b */
    public void mo631b(C0205m mVar) {
        m711a((Task) mo627a(new PeriodicTask.Builder(), mVar).setPeriod(mVar.mo682j() / 1000).setFlex(mVar.mo683k() / 1000).build());
        f659a.mo572b("Scheduled PeriodicTask, %s, interval %s, flex %s", mVar, C0177g.m643a(mVar.mo682j()), C0177g.m643a(mVar.mo683k()));
    }

    /* renamed from: c */
    public void mo611c(C0205m mVar) {
        f659a.mo574c("plantPeriodicFlexSupport called although flex is supported");
        long d = C0202k.C0203a.m773d(mVar);
        long e = C0202k.C0203a.m774e(mVar);
        m711a((Task) mo627a(new OneoffTask.Builder(), mVar).setExecutionWindow(d / 1000, e / 1000).build());
        f659a.mo572b("Scheduled periodic (flex support), %s, start %s, end %s, flex %s", mVar, C0177g.m643a(d), C0177g.m643a(e), C0177g.m643a(mVar.mo683k()));
    }

    /* renamed from: d */
    public boolean mo612d(C0205m mVar) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo632e(C0205m mVar) {
        return mo630b(mVar.mo673c());
    }
}
