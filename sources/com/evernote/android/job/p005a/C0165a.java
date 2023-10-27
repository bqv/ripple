package com.evernote.android.job.p005a;

/* renamed from: com.evernote.android.job.a.a */
public final class C0165a {

    /* renamed from: a */
    public static final C0165a f583a = new C0165a(false, 1.0f);

    /* renamed from: b */
    private final boolean f584b;

    /* renamed from: c */
    private final float f585c;

    C0165a(boolean z, float f) {
        this.f584b = z;
        this.f585c = f;
    }

    /* renamed from: a */
    public boolean mo530a() {
        return this.f584b;
    }

    /* renamed from: b */
    public boolean mo531b() {
        return this.f585c < 0.15f && !this.f584b;
    }
}
