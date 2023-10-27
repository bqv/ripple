package com.evernote.android.job;

import android.content.Context;
import android.os.Bundle;
import com.evernote.android.job.C0205m;
import com.evernote.android.job.p005a.C0173c;
import com.evernote.android.job.p005a.C0174d;
import com.evernote.android.job.p005a.p006a.C0167b;
import java.lang.ref.WeakReference;

/* renamed from: com.evernote.android.job.c */
public abstract class C0180c {

    /* renamed from: a */
    private static final C0174d f612a = new C0174d("Job");

    /* renamed from: b */
    private C0182a f613b;

    /* renamed from: c */
    private WeakReference<Context> f614c;

    /* renamed from: d */
    private Context f615d;

    /* renamed from: e */
    private volatile boolean f616e;

    /* renamed from: f */
    private volatile boolean f617f;

    /* renamed from: g */
    private volatile long f618g = -1;

    /* renamed from: h */
    private C0183b f619h = C0183b.FAILURE;

    /* renamed from: i */
    private final Object f620i = new Object();

    /* renamed from: com.evernote.android.job.c$a */
    public static final class C0182a {

        /* renamed from: a */
        private final C0205m f622a;

        /* renamed from: b */
        private C0167b f623b;

        /* renamed from: c */
        private Bundle f624c;

        private C0182a(C0205m mVar, Bundle bundle) {
            this.f622a = mVar;
            this.f624c = bundle;
        }

        /* renamed from: a */
        public int mo602a() {
            return this.f622a.mo673c();
        }

        /* renamed from: b */
        public String mo603b() {
            return this.f622a.mo674d();
        }

        /* renamed from: c */
        public boolean mo604c() {
            return this.f622a.mo681i();
        }

        /* renamed from: d */
        public C0167b mo605d() {
            if (this.f623b == null) {
                this.f623b = this.f622a.mo691s();
                if (this.f623b == null) {
                    this.f623b = new C0167b();
                }
            }
            return this.f623b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C0205m mo606e() {
            return this.f622a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f622a.equals(((C0182a) obj).f622a);
        }

        public int hashCode() {
            return this.f622a.hashCode();
        }
    }

    /* renamed from: com.evernote.android.job.c$b */
    public enum C0183b {
        SUCCESS,
        FAILURE,
        RESCHEDULE
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C0183b mo478a(C0182a aVar);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0180c mo580a(C0205m mVar, Bundle bundle) {
        this.f613b = new C0182a(mVar, bundle);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo581a(int i) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo582a(boolean z) {
        if (z && !mo594j().mo606e().mo684l()) {
            return true;
        }
        if (!mo587e()) {
            f612a.mo574c("Job requires charging, reschedule");
            return false;
        } else if (!mo589f()) {
            f612a.mo574c("Job requires device to be idle, reschedule");
            return false;
        } else if (!mo593i()) {
            f612a.mo575c("Job requires network to be %s, but was %s", mo594j().mo606e().mo689q(), C0173c.m622c(mo595k()));
            return false;
        } else if (!mo590g()) {
            f612a.mo574c("Job requires battery not be low, reschedule");
            return false;
        } else if (mo591h()) {
            return true;
        } else {
            f612a.mo574c("Job requires storage not be low, reschedule");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C0180c mo583b(Context context) {
        this.f614c = new WeakReference<>(context);
        this.f615d = context.getApplicationContext();
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo584b(boolean z) {
        synchronized (this.f620i) {
            if (mo597m()) {
                return false;
            }
            if (!this.f616e) {
                this.f616e = true;
                mo585c();
            }
            this.f617f = z | this.f617f;
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo585c() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C0183b mo586d() {
        C0183b a;
        try {
            if (!(this instanceof C0164a)) {
                if (!mo582a(true)) {
                    a = mo594j().mo604c() ? C0183b.FAILURE : C0183b.RESCHEDULE;
                    this.f619h = a;
                    return this.f619h;
                }
            }
            a = mo478a(mo594j());
            this.f619h = a;
            return this.f619h;
        } finally {
            this.f618g = System.currentTimeMillis();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo587e() {
        return !mo594j().mo606e().mo685m() || C0173c.m619a(mo595k()).mo530a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f613b.equals(((C0180c) obj).f613b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo589f() {
        return !mo594j().mo606e().mo686n() || C0173c.m621b(mo595k());
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo590g() {
        return !mo594j().mo606e().mo687o() || !C0173c.m619a(mo595k()).mo531b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo591h() {
        return !mo594j().mo606e().mo688p() || !C0173c.m620a();
    }

    public int hashCode() {
        return this.f613b.hashCode();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public boolean mo593i() {
        C0205m.C0211d q = mo594j().mo606e().mo689q();
        if (q == C0205m.C0211d.ANY) {
            return true;
        }
        C0205m.C0211d c = C0173c.m622c(mo595k());
        switch (q) {
            case CONNECTED:
                return c != C0205m.C0211d.ANY;
            case NOT_ROAMING:
                return c == C0205m.C0211d.NOT_ROAMING || c == C0205m.C0211d.UNMETERED || c == C0205m.C0211d.METERED;
            case UNMETERED:
                return c == C0205m.C0211d.UNMETERED;
            case METERED:
                return c == C0205m.C0211d.CONNECTED || c == C0205m.C0211d.NOT_ROAMING;
            default:
                throw new IllegalStateException("not implemented");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final C0182a mo594j() {
        return this.f613b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final Context mo595k() {
        Context context = (Context) this.f614c.get();
        return context == null ? this.f615d : context;
    }

    /* renamed from: l */
    public final void mo596l() {
        mo584b(false);
    }

    /* renamed from: m */
    public final boolean mo597m() {
        boolean z;
        synchronized (this.f620i) {
            z = this.f618g > 0;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final long mo598n() {
        long j;
        synchronized (this.f620i) {
            j = this.f618g;
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final C0183b mo599o() {
        return this.f619h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final boolean mo600p() {
        boolean z;
        synchronized (this.f620i) {
            z = this.f617f;
        }
        return z;
    }

    public String toString() {
        return "job{id=" + this.f613b.mo602a() + ", finished=" + mo597m() + ", result=" + this.f619h + ", canceled=" + this.f616e + ", periodic=" + this.f613b.mo604c() + ", class=" + getClass().getSimpleName() + ", tag=" + this.f613b.mo603b() + '}';
    }
}
