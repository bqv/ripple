package com.evernote.android.job;

import android.os.Build;
import com.evernote.android.job.p005a.C0171b;
import com.evernote.android.job.p005a.C0174d;
import java.util.EnumMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.evernote.android.job.e */
public final class C0190e {

    /* renamed from: a */
    private static final EnumMap<C0186d, Boolean> f643a = new EnumMap<>(C0186d.class);

    /* renamed from: b */
    private static final C0174d f644b = new C0174d("JobConfig");

    /* renamed from: c */
    private static final ExecutorService f645c = Executors.newCachedThreadPool(new ThreadFactory() {

        /* renamed from: a */
        private final AtomicInteger f655a = new AtomicInteger();

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AndroidJob-" + this.f655a.incrementAndGet());
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    });

    /* renamed from: d */
    private static volatile boolean f646d = false;

    /* renamed from: e */
    private static volatile boolean f647e = false;

    /* renamed from: f */
    private static volatile long f648f = 3000;

    /* renamed from: g */
    private static volatile boolean f649g = false;

    /* renamed from: h */
    private static volatile int f650h = 0;

    /* renamed from: i */
    private static volatile boolean f651i = false;

    /* renamed from: j */
    private static volatile C0171b f652j = C0171b.f600a;

    /* renamed from: k */
    private static volatile ExecutorService f653k = f645c;

    /* renamed from: l */
    private static volatile boolean f654l = false;

    static {
        for (C0186d put : C0186d.values()) {
            f643a.put(put, Boolean.TRUE);
        }
    }

    /* renamed from: a */
    public static boolean m696a() {
        return f646d && Build.VERSION.SDK_INT < 24;
    }

    /* renamed from: a */
    public static boolean m697a(C0186d dVar) {
        return f643a.get(dVar).booleanValue();
    }

    /* renamed from: b */
    public static boolean m698b() {
        return f647e;
    }

    /* renamed from: c */
    public static long m699c() {
        return f648f;
    }

    /* renamed from: d */
    static boolean m700d() {
        return f649g;
    }

    /* renamed from: e */
    public static int m701e() {
        return f650h;
    }

    /* renamed from: f */
    public static boolean m702f() {
        return f651i;
    }

    /* renamed from: g */
    public static C0171b m703g() {
        return f652j;
    }

    /* renamed from: h */
    public static ExecutorService m704h() {
        return f653k;
    }

    /* renamed from: i */
    public static boolean m705i() {
        return f654l;
    }
}
