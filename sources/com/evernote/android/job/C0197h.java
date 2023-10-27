package com.evernote.android.job;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.LruCache;
import android.util.SparseArray;
import com.evernote.android.job.C0180c;
import com.evernote.android.job.p005a.C0174d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.evernote.android.job.h */
class C0197h {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C0174d f663a = new C0174d("JobExecutor");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final long f664b = TimeUnit.MINUTES.toMillis(3);

    /* renamed from: c */
    private final SparseArray<C0180c> f665c = new SparseArray<>();

    /* renamed from: d */
    private final LruCache<Integer, WeakReference<C0180c>> f666d = new LruCache<>(20);

    /* renamed from: e */
    private final SparseArray<C0180c.C0183b> f667e = new SparseArray<>();

    /* renamed from: f */
    private final Set<C0205m> f668f = new HashSet();

    /* renamed from: com.evernote.android.job.h$a */
    private final class C0199a implements Callable<C0180c.C0183b> {

        /* renamed from: b */
        private final C0180c f670b;

        /* renamed from: c */
        private final PowerManager.WakeLock f671c;

        private C0199a(C0180c cVar) {
            this.f670b = cVar;
            this.f671c = C0217p.m880a(this.f670b.mo595k(), "JobExecutor", C0197h.f664b);
        }

        /* renamed from: a */
        private void m731a(C0180c cVar, C0180c.C0183b bVar) {
            C0205m e = this.f670b.mo594j().mo606e();
            boolean z = false;
            boolean z2 = true;
            if (!e.mo681i() && C0180c.C0183b.RESCHEDULE.equals(bVar) && !cVar.mo600p()) {
                e = e.mo668a(true, true);
                this.f670b.mo581a(e.mo673c());
            } else if (!e.mo681i()) {
                z2 = false;
            } else if (!C0180c.C0183b.SUCCESS.equals(bVar)) {
                z = true;
            }
            if (cVar.mo600p()) {
                return;
            }
            if (z || z2) {
                e.mo672b(z, z2);
            }
        }

        /* renamed from: b */
        private C0180c.C0183b m732b() {
            try {
                C0180c.C0183b d = this.f670b.mo586d();
                C0197h.f663a.mo568a("Finished %s", this.f670b);
                m731a(this.f670b, d);
                return d;
            } catch (Throwable th) {
                C0197h.f663a.mo573b(th, "Crashed %s", this.f670b);
                return this.f670b.mo599o();
            }
        }

        /* renamed from: a */
        public C0180c.C0183b call() {
            String str;
            try {
                C0217p.m882a(this.f670b.mo595k(), this.f671c, C0197h.f664b);
                return m732b();
            } finally {
                C0197h.this.mo638a(this.f670b);
                if (this.f671c == null || !this.f671c.isHeld()) {
                    str = "Wake lock was not held after job %s was done. The job took too long to complete. This could have unintended side effects on your app.";
                    C0197h.f663a.mo575c(str, this.f670b);
                }
                C0217p.m881a(this.f671c);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        return r2 != null ? (com.evernote.android.job.C0180c) r2.get() : null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.evernote.android.job.C0180c mo633a(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            android.util.SparseArray<com.evernote.android.job.c> r0 = r1.f665c     // Catch:{ all -> 0x0025 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0025 }
            com.evernote.android.job.c r0 = (com.evernote.android.job.C0180c) r0     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r1)
            return r0
        L_0x000d:
            android.util.LruCache<java.lang.Integer, java.lang.ref.WeakReference<com.evernote.android.job.c>> r0 = r1.f666d     // Catch:{ all -> 0x0025 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0025 }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x0025 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0025 }
            if (r2 == 0) goto L_0x0022
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0025 }
            com.evernote.android.job.c r2 = (com.evernote.android.job.C0180c) r2     // Catch:{ all -> 0x0025 }
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            monitor-exit(r1)
            return r2
        L_0x0025:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.C0197h.mo633a(int):com.evernote.android.job.c");
    }

    /* renamed from: a */
    public synchronized Set<C0180c> mo634a() {
        return mo635a((String) null);
    }

    /* renamed from: a */
    public synchronized Set<C0180c> mo635a(String str) {
        HashSet hashSet;
        hashSet = new HashSet();
        for (int i = 0; i < this.f665c.size(); i++) {
            C0180c valueAt = this.f665c.valueAt(i);
            if (str == null || str.equals(valueAt.mo594j().mo603b())) {
                hashSet.add(valueAt);
            }
        }
        for (WeakReference<C0180c> weakReference : this.f666d.snapshot().values()) {
            C0180c cVar = (C0180c) weakReference.get();
            if (cVar != null) {
                if (str == null || str.equals(cVar.mo594j().mo603b())) {
                    hashSet.add(cVar);
                }
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public synchronized Future<C0180c.C0183b> mo636a(Context context, C0205m mVar, C0180c cVar, Bundle bundle) {
        this.f668f.remove(mVar);
        if (cVar == null) {
            f663a.mo575c("JobCreator returned null for tag %s", mVar.mo674d());
            return null;
        } else if (cVar.mo597m()) {
            throw new IllegalStateException(String.format(Locale.ENGLISH, "Job for tag %s was already run, a creator should always create a new Job instance", new Object[]{mVar.mo674d()}));
        } else {
            cVar.mo583b(context).mo580a(mVar, bundle);
            f663a.mo568a("Executing %s, context %s", mVar, context.getClass().getSimpleName());
            this.f665c.put(mVar.mo673c(), cVar);
            return C0190e.m704h().submit(new C0199a(cVar));
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"UseSparseArrays"})
    /* renamed from: a */
    public void mo637a(LruCache<Integer, WeakReference<C0180c>> lruCache) {
        HashMap hashMap = new HashMap(lruCache.snapshot());
        for (Integer num : hashMap.keySet()) {
            if (hashMap.get(num) == null || ((WeakReference) hashMap.get(num)).get() == null) {
                lruCache.remove(num);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo638a(C0180c cVar) {
        int a = cVar.mo594j().mo602a();
        this.f665c.remove(a);
        mo637a(this.f666d);
        this.f667e.put(a, cVar.mo599o());
        this.f666d.put(Integer.valueOf(a), new WeakReference(cVar));
    }

    /* renamed from: a */
    public synchronized void mo639a(C0205m mVar) {
        this.f668f.add(mVar);
    }

    /* renamed from: b */
    public synchronized boolean mo640b(C0205m mVar) {
        boolean z;
        if (mVar != null) {
            if (this.f668f.contains(mVar)) {
                z = true;
            }
        }
        z = false;
        return z;
    }
}
