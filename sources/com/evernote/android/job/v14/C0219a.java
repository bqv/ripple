package com.evernote.android.job.v14;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.evernote.android.job.C0190e;
import com.evernote.android.job.C0202k;
import com.evernote.android.job.C0205m;
import com.evernote.android.job.p005a.C0174d;
import com.evernote.android.job.p005a.C0177g;

/* renamed from: com.evernote.android.job.v14.a */
public class C0219a implements C0202k {

    /* renamed from: a */
    protected final Context f747a;

    /* renamed from: b */
    protected final C0174d f748b;

    /* renamed from: c */
    private AlarmManager f749c;

    public C0219a(Context context) {
        this(context, "JobProxy14");
    }

    protected C0219a(Context context, String str) {
        this.f747a = context;
        this.f748b = new C0174d(str);
    }

    /* renamed from: f */
    private void m892f(C0205m mVar) {
        this.f748b.mo572b("Scheduled alarm, %s, delay %s (from now), exact %b, reschedule count %d", mVar, C0177g.m643a(C0202k.C0203a.m772c(mVar)), Boolean.valueOf(mVar.mo694u()), Integer.valueOf(C0202k.C0203a.m776g(mVar)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo731a(boolean z) {
        return z ? C0190e.m702f() ? 0 : 2 : C0190e.m702f() ? 1 : 3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AlarmManager mo732a() {
        if (this.f749c == null) {
            this.f749c = (AlarmManager) this.f747a.getSystemService("alarm");
        }
        if (this.f749c == null) {
            this.f748b.mo576d("AlarmManager is null");
        }
        return this.f749c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public PendingIntent mo733a(int i, boolean z, Bundle bundle, int i2) {
        try {
            return PendingIntent.getBroadcast(this.f747a, i, PlatformAlarmReceiver.m884a(this.f747a, i, z, bundle), i2);
        } catch (Exception e) {
            this.f748b.mo569a((Throwable) e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public PendingIntent mo734a(C0205m mVar, int i) {
        return mo733a(mVar.mo673c(), mVar.mo694u(), mVar.mo664C(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public PendingIntent mo735a(C0205m mVar, boolean z) {
        return mo734a(mVar, mo736b(z));
    }

    /* renamed from: a */
    public void mo628a(int i) {
        AlarmManager a = mo732a();
        if (a != null) {
            try {
                a.cancel(mo733a(i, false, (Bundle) null, mo736b(true)));
                a.cancel(mo733a(i, false, (Bundle) null, mo736b(false)));
            } catch (Exception e) {
                this.f748b.mo569a((Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public void mo629a(C0205m mVar) {
        PendingIntent a = mo735a(mVar, false);
        AlarmManager a2 = mo732a();
        if (a2 != null) {
            try {
                if (!mVar.mo694u()) {
                    mo578a(mVar, a2, a);
                } else if (mVar.mo675e() != 1 || mVar.mo698y() > 0) {
                    mo737b(mVar, a2, a);
                } else {
                    PlatformAlarmService.m885a(this.f747a, mVar.mo673c(), mVar.mo664C());
                }
            } catch (Exception e) {
                this.f748b.mo569a((Throwable) e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo578a(C0205m mVar, AlarmManager alarmManager, PendingIntent pendingIntent) {
        alarmManager.set(mo731a(false), mo738e(mVar), pendingIntent);
        m892f(mVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo736b(boolean z) {
        return !z ? 1207959552 : 134217728;
    }

    /* renamed from: b */
    public void mo631b(C0205m mVar) {
        PendingIntent a = mo735a(mVar, true);
        AlarmManager a2 = mo732a();
        if (a2 != null) {
            a2.setRepeating(mo731a(true), mo738e(mVar), mVar.mo682j(), a);
        }
        this.f748b.mo572b("Scheduled repeating alarm, %s, interval %s", mVar, C0177g.m643a(mVar.mo682j()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo737b(C0205m mVar, AlarmManager alarmManager, PendingIntent pendingIntent) {
        long e = mo738e(mVar);
        if (Build.VERSION.SDK_INT >= 23) {
            alarmManager.setExactAndAllowWhileIdle(mo731a(true), e, pendingIntent);
        } else if (Build.VERSION.SDK_INT >= 19) {
            alarmManager.setExact(mo731a(true), e, pendingIntent);
        } else {
            alarmManager.set(mo731a(true), e, pendingIntent);
        }
        m892f(mVar);
    }

    /* renamed from: c */
    public void mo611c(C0205m mVar) {
        PendingIntent a = mo735a(mVar, false);
        AlarmManager a2 = mo732a();
        if (a2 != null) {
            try {
                mo579c(mVar, a2, a);
            } catch (Exception e) {
                this.f748b.mo569a((Throwable) e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo579c(C0205m mVar, AlarmManager alarmManager, PendingIntent pendingIntent) {
        alarmManager.set(1, C0190e.m703g().mo564a() + C0202k.C0203a.m775f(mVar), pendingIntent);
        this.f748b.mo572b("Scheduled repeating alarm (flex support), %s, interval %s, flex %s", mVar, C0177g.m643a(mVar.mo682j()), C0177g.m643a(mVar.mo683k()));
    }

    /* renamed from: d */
    public boolean mo612d(C0205m mVar) {
        return mo734a(mVar, 536870912) != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public long mo738e(C0205m mVar) {
        return (C0190e.m702f() ? C0190e.m703g().mo564a() : C0190e.m703g().mo565b()) + C0202k.C0203a.m772c(mVar);
    }
}
