package android.support.p000v4.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: android.support.v4.app.c */
public abstract class C0026c extends Service {

    /* renamed from: h */
    static final Object f26h = new Object();

    /* renamed from: i */
    static final HashMap<ComponentName, C0035h> f27i = new HashMap<>();

    /* renamed from: a */
    C0028b f28a;

    /* renamed from: b */
    C0035h f29b;

    /* renamed from: c */
    C0027a f30c;

    /* renamed from: d */
    boolean f31d = false;

    /* renamed from: e */
    boolean f32e = false;

    /* renamed from: f */
    boolean f33f = false;

    /* renamed from: g */
    final ArrayList<C0030d> f34g;

    /* renamed from: android.support.v4.app.c$a */
    final class C0027a extends AsyncTask<Void, Void, Void> {
        C0027a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                C0031e d = C0026c.this.mo16d();
                if (d == null) {
                    return null;
                }
                C0026c.this.mo11a(d.mo33a());
                d.mo34b();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onCancelled(Void voidR) {
            C0026c.this.mo15c();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            C0026c.this.mo15c();
        }
    }

    /* renamed from: android.support.v4.app.c$b */
    interface C0028b {
        /* renamed from: a */
        IBinder mo27a();

        /* renamed from: b */
        C0031e mo28b();
    }

    /* renamed from: android.support.v4.app.c$c */
    static final class C0029c extends C0035h {

        /* renamed from: a */
        boolean f36a;

        /* renamed from: b */
        boolean f37b;

        /* renamed from: f */
        private final Context f38f;

        /* renamed from: g */
        private final PowerManager.WakeLock f39g;

        /* renamed from: h */
        private final PowerManager.WakeLock f40h;

        C0029c(Context context, ComponentName componentName) {
            super(context, componentName);
            this.f38f = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            this.f39g = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f39g.setReferenceCounted(false);
            this.f40h = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f40h.setReferenceCounted(false);
        }

        /* renamed from: a */
        public void mo29a() {
            synchronized (this) {
                this.f36a = false;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo30a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f51c);
            if (this.f38f.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.f36a) {
                        this.f36a = true;
                        if (!this.f37b) {
                            this.f39g.acquire(60000);
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo31b() {
            synchronized (this) {
                if (!this.f37b) {
                    this.f37b = true;
                    this.f40h.acquire(600000);
                    this.f39g.release();
                }
            }
        }

        /* renamed from: c */
        public void mo32c() {
            synchronized (this) {
                if (this.f37b) {
                    if (this.f36a) {
                        this.f39g.acquire(60000);
                    }
                    this.f37b = false;
                    this.f40h.release();
                }
            }
        }
    }

    /* renamed from: android.support.v4.app.c$d */
    final class C0030d implements C0031e {

        /* renamed from: a */
        final Intent f41a;

        /* renamed from: b */
        final int f42b;

        C0030d(Intent intent, int i) {
            this.f41a = intent;
            this.f42b = i;
        }

        /* renamed from: a */
        public Intent mo33a() {
            return this.f41a;
        }

        /* renamed from: b */
        public void mo34b() {
            C0026c.this.stopSelf(this.f42b);
        }
    }

    /* renamed from: android.support.v4.app.c$e */
    interface C0031e {
        /* renamed from: a */
        Intent mo33a();

        /* renamed from: b */
        void mo34b();
    }

    /* renamed from: android.support.v4.app.c$f */
    static final class C0032f extends JobServiceEngine implements C0028b {

        /* renamed from: a */
        final C0026c f44a;

        /* renamed from: b */
        final Object f45b = new Object();

        /* renamed from: c */
        JobParameters f46c;

        /* renamed from: android.support.v4.app.c$f$a */
        final class C0033a implements C0031e {

            /* renamed from: a */
            final JobWorkItem f47a;

            C0033a(JobWorkItem jobWorkItem) {
                this.f47a = jobWorkItem;
            }

            /* renamed from: a */
            public Intent mo33a() {
                return this.f47a.getIntent();
            }

            /* renamed from: b */
            public void mo34b() {
                synchronized (C0032f.this.f45b) {
                    if (C0032f.this.f46c != null) {
                        C0032f.this.f46c.completeWork(this.f47a);
                    }
                }
            }
        }

        C0032f(C0026c cVar) {
            super(cVar);
            this.f44a = cVar;
        }

        /* renamed from: a */
        public IBinder mo27a() {
            return getBinder();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
            r1.getIntent().setExtrasClassLoader(r3.f44a.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
            return new android.support.p000v4.app.C0026c.C0032f.C0033a(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r1 == null) goto L_0x0026;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.support.p000v4.app.C0026c.C0031e mo28b() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.f45b
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r3.f46c     // Catch:{ all -> 0x0027 }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                return r2
            L_0x000a:
                android.app.job.JobParameters r1 = r3.f46c     // Catch:{ all -> 0x0027 }
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ all -> 0x0027 }
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                if (r1 == 0) goto L_0x0026
                android.content.Intent r0 = r1.getIntent()
                android.support.v4.app.c r2 = r3.f44a
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                android.support.v4.app.c$f$a r0 = new android.support.v4.app.c$f$a
                r0.<init>(r1)
                return r0
            L_0x0026:
                return r2
            L_0x0027:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p000v4.app.C0026c.C0032f.mo28b():android.support.v4.app.c$e");
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f46c = jobParameters;
            this.f44a.mo12a(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean b = this.f44a.mo14b();
            synchronized (this.f45b) {
                this.f46c = null;
            }
            return b;
        }
    }

    /* renamed from: android.support.v4.app.c$g */
    static final class C0034g extends C0035h {

        /* renamed from: a */
        private final JobInfo f49a;

        /* renamed from: b */
        private final JobScheduler f50b;

        C0034g(Context context, ComponentName componentName, int i) {
            super(context, componentName);
            mo37a(i);
            this.f49a = new JobInfo.Builder(i, this.f51c).setOverrideDeadline(0).build();
            this.f50b = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo30a(Intent intent) {
            this.f50b.enqueue(this.f49a, new JobWorkItem(intent));
        }
    }

    /* renamed from: android.support.v4.app.c$h */
    static abstract class C0035h {

        /* renamed from: c */
        final ComponentName f51c;

        /* renamed from: d */
        boolean f52d;

        /* renamed from: e */
        int f53e;

        C0035h(Context context, ComponentName componentName) {
            this.f51c = componentName;
        }

        /* renamed from: a */
        public void mo29a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37a(int i) {
            if (!this.f52d) {
                this.f52d = true;
                this.f53e = i;
            } else if (this.f53e != i) {
                throw new IllegalArgumentException("Given job ID " + i + " is different than previous " + this.f53e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo30a(Intent intent);

        /* renamed from: b */
        public void mo31b() {
        }

        /* renamed from: c */
        public void mo32c() {
        }
    }

    public C0026c() {
        this.f34g = Build.VERSION.SDK_INT >= 26 ? null : new ArrayList<>();
    }

    /* renamed from: a */
    static C0035h m13a(Context context, ComponentName componentName, boolean z, int i) {
        C0035h hVar;
        C0035h hVar2 = f27i.get(componentName);
        if (hVar2 != null) {
            return hVar2;
        }
        if (Build.VERSION.SDK_INT < 26) {
            hVar = new C0029c(context, componentName);
        } else if (!z) {
            throw new IllegalArgumentException("Can't be here without a job id");
        } else {
            hVar = new C0034g(context, componentName, i);
        }
        C0035h hVar3 = hVar;
        f27i.put(componentName, hVar3);
        return hVar3;
    }

    /* renamed from: a */
    public static void m14a(Context context, ComponentName componentName, int i, Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (f26h) {
            C0035h a = m13a(context, componentName, true, i);
            a.mo37a(i);
            a.mo30a(intent);
        }
    }

    /* renamed from: a */
    public static void m15a(Context context, Class cls, int i, Intent intent) {
        m14a(context, new ComponentName(context, cls), i, intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo11a(Intent intent);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12a(boolean z) {
        if (this.f30c == null) {
            this.f30c = new C0027a();
            if (this.f29b != null && z) {
                this.f29b.mo31b();
            }
            this.f30c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* renamed from: a */
    public boolean mo13a() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo14b() {
        if (this.f30c != null) {
            this.f30c.cancel(this.f31d);
        }
        this.f32e = true;
        return mo13a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo15c() {
        if (this.f34g != null) {
            synchronized (this.f34g) {
                this.f30c = null;
                if (this.f34g != null && this.f34g.size() > 0) {
                    mo12a(false);
                } else if (!this.f33f) {
                    this.f29b.mo32c();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0031e mo16d() {
        if (this.f28a != null) {
            return this.f28a.mo28b();
        }
        synchronized (this.f34g) {
            if (this.f34g.size() <= 0) {
                return null;
            }
            C0031e remove = this.f34g.remove(0);
            return remove;
        }
    }

    public IBinder onBind(Intent intent) {
        if (this.f28a != null) {
            return this.f28a.mo27a();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f28a = new C0032f(this);
            this.f29b = null;
            return;
        }
        this.f28a = null;
        this.f29b = m13a((Context) this, new ComponentName(this, getClass()), false, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f34g != null) {
            synchronized (this.f34g) {
                this.f33f = true;
                this.f29b.mo32c();
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.f34g == null) {
            return 2;
        }
        this.f29b.mo29a();
        synchronized (this.f34g) {
            ArrayList<C0030d> arrayList = this.f34g;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C0030d(intent, i2));
            mo12a(true);
        }
        return 3;
    }
}
