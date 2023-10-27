package com.dof100.morsenotifier;

import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.dof100.morsenotifier.k */
class C0148k {

    /* renamed from: a */
    int f494a;

    /* renamed from: b */
    int f495b;

    /* renamed from: c */
    private C0134d f496c;

    C0148k(int i, int i2) {
        C0134d dVar;
        this.f494a = i;
        this.f495b = i2;
        switch (this.f494a) {
            case 1:
                dVar = new C0134d(0.0f, -0.25f, 0.5f, 0.25f);
                break;
            case 2:
                dVar = new C0134d(0.0f, -0.25f, 1.5f, 0.25f);
                break;
            default:
                dVar = null;
                break;
        }
        this.f496c = dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo493a(GL10 gl10) {
        if (this.f496c != null) {
            this.f496c.mo473a(gl10);
        }
    }
}
