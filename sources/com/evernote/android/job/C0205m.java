package com.evernote.android.job;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import com.evernote.android.job.p005a.C0174d;
import com.evernote.android.job.p005a.C0176f;
import com.evernote.android.job.p005a.p006a.C0167b;
import java.util.concurrent.TimeUnit;

/* renamed from: com.evernote.android.job.m */
public final class C0205m {

    /* renamed from: a */
    public static final C0208a f683a = C0208a.EXPONENTIAL;

    /* renamed from: b */
    public static final C0211d f684b = C0211d.ANY;

    /* renamed from: c */
    public static final C0210c f685c = new C0210c() {
    };

    /* renamed from: d */
    public static final long f686d = TimeUnit.MINUTES.toMillis(15);

    /* renamed from: e */
    public static final long f687e = TimeUnit.MINUTES.toMillis(5);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C0174d f688f = new C0174d("JobRequest");

    /* renamed from: g */
    private final C0209b f689g;

    /* renamed from: h */
    private int f690h;

    /* renamed from: i */
    private long f691i;

    /* renamed from: j */
    private boolean f692j;

    /* renamed from: k */
    private boolean f693k;

    /* renamed from: l */
    private long f694l;

    /* renamed from: com.evernote.android.job.m$a */
    public enum C0208a {
        LINEAR,
        EXPONENTIAL
    }

    /* renamed from: com.evernote.android.job.m$b */
    public static final class C0209b {

        /* renamed from: a */
        final String f699a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f700b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public long f701c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public long f702d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public long f703e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C0208a f704f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public long f705g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public long f706h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public boolean f707i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public boolean f708j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public boolean f709k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public boolean f710l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public boolean f711m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public boolean f712n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public C0211d f713o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public C0167b f714p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public String f715q;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public boolean f716r;
        /* access modifiers changed from: private */

        /* renamed from: s */
        public boolean f717s;
        /* access modifiers changed from: private */

        /* renamed from: t */
        public Bundle f718t;

        private C0209b(Cursor cursor) {
            this.f718t = Bundle.EMPTY;
            this.f700b = cursor.getInt(cursor.getColumnIndex("_id"));
            this.f699a = cursor.getString(cursor.getColumnIndex("tag"));
            this.f701c = cursor.getLong(cursor.getColumnIndex("startMs"));
            this.f702d = cursor.getLong(cursor.getColumnIndex("endMs"));
            this.f703e = cursor.getLong(cursor.getColumnIndex("backoffMs"));
            try {
                this.f704f = C0208a.valueOf(cursor.getString(cursor.getColumnIndex("backoffPolicy")));
            } catch (Throwable th) {
                C0205m.f688f.mo569a(th);
                this.f704f = C0205m.f683a;
            }
            this.f705g = cursor.getLong(cursor.getColumnIndex("intervalMs"));
            this.f706h = cursor.getLong(cursor.getColumnIndex("flexMs"));
            boolean z = false;
            this.f707i = cursor.getInt(cursor.getColumnIndex("requirementsEnforced")) > 0;
            this.f708j = cursor.getInt(cursor.getColumnIndex("requiresCharging")) > 0;
            this.f709k = cursor.getInt(cursor.getColumnIndex("requiresDeviceIdle")) > 0;
            this.f710l = cursor.getInt(cursor.getColumnIndex("requiresBatteryNotLow")) > 0;
            this.f711m = cursor.getInt(cursor.getColumnIndex("requiresStorageNotLow")) > 0;
            this.f712n = cursor.getInt(cursor.getColumnIndex("exact")) > 0;
            try {
                this.f713o = C0211d.valueOf(cursor.getString(cursor.getColumnIndex("networkType")));
            } catch (Throwable th2) {
                C0205m.f688f.mo569a(th2);
                this.f713o = C0205m.f684b;
            }
            this.f715q = cursor.getString(cursor.getColumnIndex("extras"));
            this.f717s = cursor.getInt(cursor.getColumnIndex("transient")) > 0 ? true : z;
        }

        private C0209b(C0209b bVar) {
            this(bVar, false);
        }

        private C0209b(C0209b bVar, boolean z) {
            this.f718t = Bundle.EMPTY;
            this.f700b = z ? -8765 : bVar.f700b;
            this.f699a = bVar.f699a;
            this.f701c = bVar.f701c;
            this.f702d = bVar.f702d;
            this.f703e = bVar.f703e;
            this.f704f = bVar.f704f;
            this.f705g = bVar.f705g;
            this.f706h = bVar.f706h;
            this.f707i = bVar.f707i;
            this.f708j = bVar.f708j;
            this.f709k = bVar.f709k;
            this.f710l = bVar.f710l;
            this.f711m = bVar.f711m;
            this.f712n = bVar.f712n;
            this.f713o = bVar.f713o;
            this.f714p = bVar.f714p;
            this.f715q = bVar.f715q;
            this.f716r = bVar.f716r;
            this.f717s = bVar.f717s;
            this.f718t = bVar.f718t;
        }

        public C0209b(String str) {
            this.f718t = Bundle.EMPTY;
            this.f699a = (String) C0176f.m639a(str);
            this.f700b = -8765;
            this.f701c = -1;
            this.f702d = -1;
            this.f703e = 30000;
            this.f704f = C0205m.f683a;
            this.f713o = C0205m.f684b;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m822a(ContentValues contentValues) {
            String str;
            String str2;
            contentValues.put("_id", Integer.valueOf(this.f700b));
            contentValues.put("tag", this.f699a);
            contentValues.put("startMs", Long.valueOf(this.f701c));
            contentValues.put("endMs", Long.valueOf(this.f702d));
            contentValues.put("backoffMs", Long.valueOf(this.f703e));
            contentValues.put("backoffPolicy", this.f704f.toString());
            contentValues.put("intervalMs", Long.valueOf(this.f705g));
            contentValues.put("flexMs", Long.valueOf(this.f706h));
            contentValues.put("requirementsEnforced", Boolean.valueOf(this.f707i));
            contentValues.put("requiresCharging", Boolean.valueOf(this.f708j));
            contentValues.put("requiresDeviceIdle", Boolean.valueOf(this.f709k));
            contentValues.put("requiresBatteryNotLow", Boolean.valueOf(this.f710l));
            contentValues.put("requiresStorageNotLow", Boolean.valueOf(this.f711m));
            contentValues.put("exact", Boolean.valueOf(this.f712n));
            contentValues.put("networkType", this.f713o.toString());
            if (this.f714p != null) {
                str = "extras";
                str2 = this.f714p.mo557a();
            } else {
                if (!TextUtils.isEmpty(this.f715q)) {
                    str = "extras";
                    str2 = this.f715q;
                }
                contentValues.put("transient", Boolean.valueOf(this.f717s));
            }
            contentValues.put(str, str2);
            contentValues.put("transient", Boolean.valueOf(this.f717s));
        }

        /* renamed from: a */
        public C0209b mo700a(long j) {
            this.f712n = true;
            if (j > 6148914691236517204L) {
                C0205m.f688f.mo568a("exactInMs clamped from %d days to %d days", Long.valueOf(TimeUnit.MILLISECONDS.toDays(j)), Long.valueOf(TimeUnit.MILLISECONDS.toDays(6148914691236517204L)));
                j = 6148914691236517204L;
            }
            return mo701a(j, j);
        }

        /* renamed from: a */
        public C0209b mo701a(long j, long j2) {
            this.f701c = C0176f.m642b(j, "startInMs must be greater than 0");
            this.f702d = C0176f.m637a(j2, j, Long.MAX_VALUE, "endInMs");
            if (this.f701c > 6148914691236517204L) {
                C0205m.f688f.mo568a("startInMs reduced from %d days to %d days", Long.valueOf(TimeUnit.MILLISECONDS.toDays(this.f701c)), Long.valueOf(TimeUnit.MILLISECONDS.toDays(6148914691236517204L)));
                this.f701c = 6148914691236517204L;
            }
            if (this.f702d > 6148914691236517204L) {
                C0205m.f688f.mo568a("endInMs reduced from %d days to %d days", Long.valueOf(TimeUnit.MILLISECONDS.toDays(this.f702d)), Long.valueOf(TimeUnit.MILLISECONDS.toDays(6148914691236517204L)));
                this.f702d = 6148914691236517204L;
            }
            return this;
        }

        /* renamed from: a */
        public C0209b mo702a(C0167b bVar) {
            if (bVar == null) {
                this.f714p = null;
                this.f715q = null;
                return this;
            }
            this.f714p = new C0167b(bVar);
            return this;
        }

        /* renamed from: a */
        public C0209b mo703a(boolean z) {
            this.f707i = z;
            return this;
        }

        /* renamed from: a */
        public C0205m mo704a() {
            C0176f.m639a(this.f699a);
            C0176f.m642b(this.f703e, "backoffMs must be > 0");
            C0176f.m640a(this.f704f);
            C0176f.m640a(this.f713o);
            if (this.f705g > 0) {
                C0176f.m637a(this.f705g, C0205m.m782a(), Long.MAX_VALUE, "intervalMs");
                C0176f.m637a(this.f706h, C0205m.m784b(), this.f705g, "flexMs");
                if (this.f705g < C0205m.f686d || this.f706h < C0205m.f687e) {
                    C0205m.f688f.mo575c("AllowSmallerIntervals enabled, this will crash on Android N and later, interval %d (minimum is %d), flex %d (minimum is %d)", Long.valueOf(this.f705g), Long.valueOf(C0205m.f686d), Long.valueOf(this.f706h), Long.valueOf(C0205m.f687e));
                }
            }
            if (this.f712n && this.f705g > 0) {
                throw new IllegalArgumentException("Can't call setExact() on a periodic job.");
            } else if (this.f712n && this.f701c != this.f702d) {
                throw new IllegalArgumentException("Can't call setExecutionWindow() for an exact job.");
            } else if (this.f712n && (this.f707i || this.f709k || this.f708j || !C0205m.f684b.equals(this.f713o) || this.f710l || this.f711m)) {
                throw new IllegalArgumentException("Can't require any condition for an exact job.");
            } else if (this.f705g <= 0 && (this.f701c == -1 || this.f702d == -1)) {
                throw new IllegalArgumentException("You're trying to build a job with no constraints, this is not allowed.");
            } else if (this.f705g > 0 && (this.f701c != -1 || this.f702d != -1)) {
                throw new IllegalArgumentException("Can't call setExecutionWindow() on a periodic job.");
            } else if (this.f705g <= 0 || (this.f703e == 30000 && C0205m.f683a.equals(this.f704f))) {
                if (this.f705g <= 0 && (this.f701c > 3074457345618258602L || this.f702d > 3074457345618258602L)) {
                    C0205m.f688f.mo574c("Attention: your execution window is too large. This could result in undesired behavior, see https://github.com/evernote/android-job/wiki/FAQ");
                }
                if (this.f705g <= 0 && this.f701c > TimeUnit.DAYS.toMillis(365)) {
                    C0205m.f688f.mo575c("Warning: job with tag %s scheduled over a year in the future", this.f699a);
                }
                if (this.f700b != -8765) {
                    C0176f.m636a(this.f700b, "id can't be negative");
                }
                C0209b bVar = new C0209b(this);
                if (this.f700b == -8765) {
                    bVar.f700b = C0200i.m734a().mo655e().mo708a();
                    C0176f.m636a(bVar.f700b, "id can't be negative");
                }
                return new C0205m(bVar);
            } else {
                throw new IllegalArgumentException("A periodic job will not respect any back-off policy, so calling setBackoffCriteria() with setPeriodic() is an error.");
            }
        }

        /* renamed from: b */
        public C0209b mo705b(boolean z) {
            this.f716r = z;
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f700b == ((C0209b) obj).f700b;
        }

        public int hashCode() {
            return this.f700b;
        }
    }

    /* renamed from: com.evernote.android.job.m$c */
    public interface C0210c {
    }

    /* renamed from: com.evernote.android.job.m$d */
    public enum C0211d {
        ANY,
        CONNECTED,
        UNMETERED,
        NOT_ROAMING,
        METERED
    }

    private C0205m(C0209b bVar) {
        this.f689g = bVar;
    }

    /* renamed from: H */
    private static Context m781H() {
        return C0200i.m734a().mo658h();
    }

    /* renamed from: a */
    static long m782a() {
        return C0190e.m696a() ? TimeUnit.MINUTES.toMillis(1) : f686d;
    }

    /* renamed from: a */
    static C0205m m783a(Cursor cursor) {
        C0205m a = new C0209b(cursor).mo704a();
        a.f690h = cursor.getInt(cursor.getColumnIndex("numFailures"));
        a.f691i = cursor.getLong(cursor.getColumnIndex("scheduledAt"));
        boolean z = false;
        a.f692j = cursor.getInt(cursor.getColumnIndex("started")) > 0;
        if (cursor.getInt(cursor.getColumnIndex("flexSupport")) > 0) {
            z = true;
        }
        a.f693k = z;
        a.f694l = cursor.getLong(cursor.getColumnIndex("lastRun"));
        C0176f.m636a(a.f690h, "failure count can't be negative");
        C0176f.m638a(a.f691i, "scheduled at can't be negative");
        return a;
    }

    /* renamed from: b */
    static long m784b() {
        return C0190e.m696a() ? TimeUnit.SECONDS.toMillis(30) : f687e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo662A() {
        return this.f693k;
    }

    /* renamed from: B */
    public boolean mo663B() {
        return this.f689g.f717s;
    }

    /* renamed from: C */
    public Bundle mo664C() {
        return this.f689g.f718t;
    }

    /* renamed from: D */
    public int mo665D() {
        C0200i.m734a().mo649a(this);
        return mo673c();
    }

    /* renamed from: E */
    public C0209b mo666E() {
        long j = this.f691i;
        C0200i.m734a().mo652b(mo673c());
        C0209b bVar = new C0209b(this.f689g);
        this.f692j = false;
        if (!mo681i()) {
            long a = C0190e.m703g().mo564a() - j;
            bVar.mo701a(Math.max(1, mo675e() - a), Math.max(1, mo677f() - a));
        }
        return bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public ContentValues mo667F() {
        ContentValues contentValues = new ContentValues();
        this.f689g.m822a(contentValues);
        contentValues.put("numFailures", Integer.valueOf(this.f690h));
        contentValues.put("scheduledAt", Long.valueOf(this.f691i));
        contentValues.put("started", Boolean.valueOf(this.f692j));
        contentValues.put("flexSupport", Boolean.valueOf(this.f693k));
        contentValues.put("lastRun", Long.valueOf(this.f694l));
        return contentValues;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0205m mo668a(boolean z, boolean z2) {
        C0205m a = new C0209b(this.f689g, z2).mo704a();
        if (z) {
            a.f690h = this.f690h + 1;
        }
        try {
            a.mo665D();
            return a;
        } catch (Exception e) {
            f688f.mo569a((Throwable) e);
            return a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo669a(long j) {
        this.f691i = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo670a(boolean z) {
        this.f693k = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo671b(boolean z) {
        this.f692j = z;
        ContentValues contentValues = new ContentValues();
        contentValues.put("started", Boolean.valueOf(this.f692j));
        C0200i.m734a().mo655e().mo712a(this, contentValues);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo672b(boolean z, boolean z2) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            this.f690h++;
            contentValues.put("numFailures", Integer.valueOf(this.f690h));
        }
        if (z2) {
            this.f694l = C0190e.m703g().mo564a();
            contentValues.put("lastRun", Long.valueOf(this.f694l));
        }
        C0200i.m734a().mo655e().mo712a(this, contentValues);
    }

    /* renamed from: c */
    public int mo673c() {
        return this.f689g.f700b;
    }

    /* renamed from: d */
    public String mo674d() {
        return this.f689g.f699a;
    }

    /* renamed from: e */
    public long mo675e() {
        return this.f689g.f701c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f689g.equals(((C0205m) obj).f689g);
    }

    /* renamed from: f */
    public long mo677f() {
        return this.f689g.f702d;
    }

    /* renamed from: g */
    public C0208a mo678g() {
        return this.f689g.f704f;
    }

    /* renamed from: h */
    public long mo679h() {
        return this.f689g.f703e;
    }

    public int hashCode() {
        return this.f689g.hashCode();
    }

    /* renamed from: i */
    public boolean mo681i() {
        return mo682j() > 0;
    }

    /* renamed from: j */
    public long mo682j() {
        return this.f689g.f705g;
    }

    /* renamed from: k */
    public long mo683k() {
        return this.f689g.f706h;
    }

    /* renamed from: l */
    public boolean mo684l() {
        return this.f689g.f707i;
    }

    /* renamed from: m */
    public boolean mo685m() {
        return this.f689g.f708j;
    }

    /* renamed from: n */
    public boolean mo686n() {
        return this.f689g.f709k;
    }

    /* renamed from: o */
    public boolean mo687o() {
        return this.f689g.f710l;
    }

    /* renamed from: p */
    public boolean mo688p() {
        return this.f689g.f711m;
    }

    /* renamed from: q */
    public C0211d mo689q() {
        return this.f689g.f713o;
    }

    /* renamed from: r */
    public boolean mo690r() {
        return mo685m() || mo686n() || mo687o() || mo688p() || mo689q() != f684b;
    }

    /* renamed from: s */
    public C0167b mo691s() {
        if (this.f689g.f714p == null && !TextUtils.isEmpty(this.f689g.f715q)) {
            C0167b unused = this.f689g.f714p = C0167b.m580a(this.f689g.f715q);
        }
        return this.f689g.f714p;
    }

    /* renamed from: t */
    public boolean mo692t() {
        return this.f689g.f716r;
    }

    public String toString() {
        return "request{id=" + mo673c() + ", tag=" + mo674d() + ", transient=" + mo663B() + '}';
    }

    /* renamed from: u */
    public boolean mo694u() {
        return this.f689g.f712n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public long mo695v() {
        long j = 0;
        if (mo681i()) {
            return 0;
        }
        switch (mo678g()) {
            case LINEAR:
                j = ((long) this.f690h) * mo679h();
                break;
            case EXPONENTIAL:
                if (this.f690h != 0) {
                    j = (long) (((double) mo679h()) * Math.pow(2.0d, (double) (this.f690h - 1)));
                    break;
                }
                break;
            default:
                throw new IllegalStateException("not implemented");
        }
        return Math.min(j, TimeUnit.HOURS.toMillis(5));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public C0186d mo696w() {
        return this.f689g.f712n ? C0186d.V_14 : C0186d.m685c(m781H());
    }

    /* renamed from: x */
    public long mo697x() {
        return this.f691i;
    }

    /* renamed from: y */
    public int mo698y() {
        return this.f690h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean mo699z() {
        return this.f692j;
    }
}
