package com.evernote.android.job;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.evernote.android.job.C0192f;
import com.evernote.android.job.C0202k;
import com.evernote.android.job.p005a.C0174d;
import com.evernote.android.job.p005a.C0176f;
import com.evernote.android.job.p005a.C0177g;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.evernote.android.job.i */
public final class C0200i {

    /* renamed from: a */
    private static final C0174d f672a = new C0174d("JobManager");
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    private static volatile C0200i f673b;

    /* renamed from: c */
    private final Context f674c;

    /* renamed from: d */
    private final C0194g f675d = new C0194g();

    /* renamed from: e */
    private final C0212n f676e;

    /* renamed from: f */
    private final C0197h f677f;

    private C0200i(Context context) {
        this.f674c = context;
        this.f676e = new C0212n(context);
        this.f677f = new C0197h();
        if (!C0190e.m700d()) {
            JobRescheduleService.m567a(this.f674c);
        }
    }

    /* renamed from: a */
    public static C0200i m734a() {
        if (f673b == null) {
            synchronized (C0200i.class) {
                if (f673b == null) {
                    throw new IllegalStateException("You need to call create() at least once to create the singleton");
                }
            }
        }
        return f673b;
    }

    /* renamed from: a */
    public static C0200i m735a(Context context) {
        if (f673b == null) {
            synchronized (C0200i.class) {
                if (f673b == null) {
                    C0176f.m641a(context, (Object) "Context cannot be null");
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    C0186d c = C0186d.m685c(context);
                    if (c != C0186d.V_14 || c.mo614a(context)) {
                        f673b = new C0200i(context);
                        if (!C0177g.m646b(context)) {
                            f672a.mo574c("No wake lock permission");
                        }
                        if (!C0177g.m644a(context)) {
                            f672a.mo574c("No boot permission");
                        }
                        m738b(context);
                    } else {
                        throw new C0201j("All APIs are disabled, cannot schedule any job");
                    }
                }
            }
        }
        return f673b;
    }

    /* renamed from: a */
    private void m736a(C0205m mVar, C0186d dVar, boolean z, boolean z2) {
        C0202k a = mo644a(dVar);
        if (!z) {
            a.mo629a(mVar);
        } else if (z2) {
            a.mo611c(mVar);
        } else {
            a.mo631b(mVar);
        }
    }

    /* renamed from: a */
    private boolean m737a(C0180c cVar) {
        if (cVar == null || !cVar.mo584b(true)) {
            return false;
        }
        f672a.mo568a("Cancel running %s", cVar);
        return true;
    }

    /* renamed from: b */
    private static void m738b(Context context) {
        List<ResolveInfo> list;
        String packageName = context.getPackageName();
        Intent intent = new Intent("com.evernote.android.job.ADD_JOB_CREATOR");
        intent.setPackage(packageName);
        try {
            list = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        } catch (Exception unused) {
            list = Collections.emptyList();
        }
        for (ResolveInfo resolveInfo : list) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo != null && !activityInfo.exported && packageName.equals(activityInfo.packageName) && !TextUtils.isEmpty(activityInfo.name)) {
                try {
                    ((C0192f.C0193a) Class.forName(activityInfo.name).newInstance()).mo622a(context, f673b);
                } catch (Exception unused2) {
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m739b(C0205m mVar) {
        if (mVar == null) {
            return false;
        }
        f672a.mo568a("Found pending job %s, canceling", mVar);
        mo644a(mVar.mo696w()).mo628a(mVar.mo673c());
        mo655e().mo714b(mVar);
        mVar.mo669a(0);
        return true;
    }

    /* renamed from: c */
    private synchronized int m740c(String str) {
        int i;
        i = 0;
        for (C0205m b : mo647a(str, true, false)) {
            if (m739b(b)) {
                i++;
            }
        }
        for (C0180c a : TextUtils.isEmpty(str) ? mo653c() : mo646a(str)) {
            if (m737a(a)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public C0180c mo643a(int i) {
        return this.f677f.mo633a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0202k mo644a(C0186d dVar) {
        return dVar.mo615b(this.f674c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0205m mo645a(int i, boolean z) {
        C0205m a = this.f676e.mo709a(i);
        if (z || a == null || !a.mo699z()) {
            return a;
        }
        return null;
    }

    /* renamed from: a */
    public Set<C0180c> mo646a(String str) {
        return this.f677f.mo635a(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Set<C0205m> mo647a(String str, boolean z, boolean z2) {
        Set<C0205m> a = this.f676e.mo710a(str, z);
        if (z2) {
            Iterator<C0205m> it = a.iterator();
            while (it.hasNext()) {
                C0205m next = it.next();
                if (next.mo663B() && !next.mo696w().mo615b(this.f674c).mo612d(next)) {
                    this.f676e.mo714b(next);
                    it.remove();
                }
            }
        }
        return a;
    }

    /* renamed from: a */
    public void mo648a(C0192f fVar) {
        this.f675d.mo624a(fVar);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0070 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo649a(com.evernote.android.job.C0205m r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.evernote.android.job.g r0 = r7.f675d     // Catch:{ all -> 0x00a3 }
            boolean r0 = r0.mo625a()     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x0010
            com.evernote.android.job.a.d r0 = f672a     // Catch:{ all -> 0x00a3 }
            java.lang.String r1 = "you haven't registered a JobCreator with addJobCreator(), it's likely that your job never will be executed"
            r0.mo574c(r1)     // Catch:{ all -> 0x00a3 }
        L_0x0010:
            long r0 = r8.mo697x()     // Catch:{ all -> 0x00a3 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x001c
            monitor-exit(r7)
            return
        L_0x001c:
            boolean r0 = r8.mo692t()     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = r8.mo674d()     // Catch:{ all -> 0x00a3 }
            r7.mo650b((java.lang.String) r0)     // Catch:{ all -> 0x00a3 }
        L_0x0029:
            android.content.Context r0 = r7.f674c     // Catch:{ all -> 0x00a3 }
            int r1 = r8.mo673c()     // Catch:{ all -> 0x00a3 }
            com.evernote.android.job.C0202k.C0203a.m767a((android.content.Context) r0, (int) r1)     // Catch:{ all -> 0x00a3 }
            com.evernote.android.job.d r0 = r8.mo696w()     // Catch:{ all -> 0x00a3 }
            boolean r1 = r8.mo681i()     // Catch:{ all -> 0x00a3 }
            if (r1 == 0) goto L_0x0050
            boolean r2 = r0.mo616b()     // Catch:{ all -> 0x00a3 }
            if (r2 == 0) goto L_0x0050
            long r2 = r8.mo683k()     // Catch:{ all -> 0x00a3 }
            long r4 = r8.mo682j()     // Catch:{ all -> 0x00a3 }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0050
            r2 = 1
            goto L_0x0051
        L_0x0050:
            r2 = 0
        L_0x0051:
            com.evernote.android.job.a.b r3 = com.evernote.android.job.C0190e.m703g()     // Catch:{ all -> 0x00a3 }
            long r3 = r3.mo564a()     // Catch:{ all -> 0x00a3 }
            r8.mo669a((long) r3)     // Catch:{ all -> 0x00a3 }
            r8.mo670a((boolean) r2)     // Catch:{ all -> 0x00a3 }
            com.evernote.android.job.n r3 = r7.f676e     // Catch:{ all -> 0x00a3 }
            r3.mo711a((com.evernote.android.job.C0205m) r8)     // Catch:{ all -> 0x00a3 }
            r7.m736a(r8, r0, r1, r2)     // Catch:{ l -> 0x0070, Exception -> 0x0069 }
            monitor-exit(r7)
            return
        L_0x0069:
            r0 = move-exception
            com.evernote.android.job.n r1 = r7.f676e     // Catch:{ all -> 0x00a3 }
            r1.mo714b((com.evernote.android.job.C0205m) r8)     // Catch:{ all -> 0x00a3 }
            throw r0     // Catch:{ all -> 0x00a3 }
        L_0x0070:
            r0.mo617c()     // Catch:{ Exception -> 0x0078 }
            r7.m736a(r8, r0, r1, r2)     // Catch:{ Exception -> 0x0078 }
            monitor-exit(r7)
            return
        L_0x0078:
            r3 = move-exception
            com.evernote.android.job.d r4 = com.evernote.android.job.C0186d.V_14     // Catch:{ all -> 0x00a3 }
            if (r0 == r4) goto L_0x009d
            com.evernote.android.job.d r4 = com.evernote.android.job.C0186d.V_19     // Catch:{ all -> 0x00a3 }
            if (r0 != r4) goto L_0x0082
            goto L_0x009d
        L_0x0082:
            com.evernote.android.job.d r0 = com.evernote.android.job.C0186d.V_19     // Catch:{ all -> 0x00a3 }
            android.content.Context r3 = r7.f674c     // Catch:{ all -> 0x00a3 }
            boolean r0 = r0.mo614a(r3)     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x008f
            com.evernote.android.job.d r0 = com.evernote.android.job.C0186d.V_19     // Catch:{ all -> 0x00a3 }
            goto L_0x0091
        L_0x008f:
            com.evernote.android.job.d r0 = com.evernote.android.job.C0186d.V_14     // Catch:{ all -> 0x00a3 }
        L_0x0091:
            r7.m736a(r8, r0, r1, r2)     // Catch:{ Exception -> 0x0096 }
            monitor-exit(r7)
            return
        L_0x0096:
            r0 = move-exception
            com.evernote.android.job.n r1 = r7.f676e     // Catch:{ all -> 0x00a3 }
            r1.mo714b((com.evernote.android.job.C0205m) r8)     // Catch:{ all -> 0x00a3 }
            throw r0     // Catch:{ all -> 0x00a3 }
        L_0x009d:
            com.evernote.android.job.n r0 = r7.f676e     // Catch:{ all -> 0x00a3 }
            r0.mo714b((com.evernote.android.job.C0205m) r8)     // Catch:{ all -> 0x00a3 }
            throw r3     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.C0200i.mo649a(com.evernote.android.job.m):void");
    }

    /* renamed from: b */
    public int mo650b(String str) {
        return m740c(str);
    }

    /* renamed from: b */
    public Set<C0205m> mo651b() {
        return mo647a((String) null, false, true);
    }

    /* renamed from: b */
    public boolean mo652b(int i) {
        boolean b = m739b(mo645a(i, true)) | m737a(mo643a(i));
        C0202k.C0203a.m767a(this.f674c, i);
        return b;
    }

    /* renamed from: c */
    public Set<C0180c> mo653c() {
        return this.f677f.mo634a();
    }

    /* renamed from: d */
    public int mo654d() {
        return m740c((String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C0212n mo655e() {
        return this.f676e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C0197h mo656f() {
        return this.f677f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C0194g mo657g() {
        return this.f675d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Context mo658h() {
        return this.f674c;
    }
}
