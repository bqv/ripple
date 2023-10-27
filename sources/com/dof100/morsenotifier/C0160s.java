package com.dof100.morsenotifier;

import android.opengl.GLES10;
import android.opengl.GLSurfaceView;
import android.opengl.GLU;
import java.util.ArrayList;
import java.util.Locale;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.dof100.morsenotifier.s */
class C0160s implements GLSurfaceView.Renderer {

    /* renamed from: a */
    private int f543a;

    /* renamed from: b */
    private boolean f544b;

    /* renamed from: c */
    private boolean f545c;

    /* renamed from: d */
    private C0161t f546d = null;

    /* renamed from: e */
    private final ArrayList<C0148k> f547e = new ArrayList<>();

    /* renamed from: f */
    private int f548f = -1;

    /* renamed from: g */
    private int f549g = -1;

    /* renamed from: h */
    private int f550h = -1;

    /* renamed from: i */
    private float f551i;

    /* renamed from: j */
    private float f552j;

    /* renamed from: k */
    private float f553k;

    /* renamed from: l */
    private float f554l;

    /* renamed from: m */
    private float f555m;

    /* renamed from: n */
    private float f556n;

    /* renamed from: o */
    private float f557o;

    /* renamed from: p */
    private float f558p;

    /* renamed from: q */
    private float f559q;

    /* renamed from: r */
    private int f560r;

    /* renamed from: s */
    private long f561s;

    /* renamed from: t */
    private float f562t = 1.0f;

    /* renamed from: u */
    private float f563u = 1.0f;

    /* renamed from: v */
    private float f564v = 1.0f;

    /* renamed from: w */
    private float f565w = 1.0f;

    /* renamed from: x */
    private float f566x = 0.0f;

    /* renamed from: y */
    private float f567y = 0.0f;

    /* renamed from: z */
    private float f568z = 0.0f;

    C0160s(ArrayList<Integer> arrayList, int i, boolean z, boolean z2, int i2, int i3, int i4, int i5) {
        C0140i.m501a("MyMorseRenderer constructor");
        this.f543a = i;
        this.f544b = z;
        this.f545c = z2;
        this.f551i = ((float) ((i2 >> 16) & 255)) / 255.0f;
        this.f552j = ((float) ((i2 >> 8) & 255)) / 255.0f;
        this.f553k = ((float) (i2 & 255)) / 255.0f;
        this.f554l = ((float) ((i3 >> 16) & 255)) / 255.0f;
        this.f555m = ((float) ((i3 >> 8) & 255)) / 255.0f;
        this.f556n = ((float) (i3 & 255)) / 255.0f;
        this.f557o = ((float) ((i4 >> 16) & 255)) / 255.0f;
        this.f558p = ((float) ((i4 >> 8) & 255)) / 255.0f;
        this.f559q = ((float) (i4 & 255)) / 255.0f;
        this.f560r = i5;
        this.f561s = System.currentTimeMillis();
        this.f547e.clear();
        for (int i6 = 0; i6 < arrayList.size(); i6 += 2) {
            this.f547e.add(new C0148k(arrayList.get(i6).intValue(), arrayList.get(i6 + 1).intValue()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo521a(int i) {
        this.f548f = i;
        if (this.f548f < 0 || this.f548f >= this.f547e.size()) {
            this.f549g = -1;
        } else {
            C0148k kVar = this.f547e.get(i);
            if (kVar.f494a >= 0) {
                this.f549g = this.f548f;
            } else if (kVar.f494a != -1) {
                this.f549g = -1;
            }
            if (kVar.f495b >= 0) {
                this.f550h = this.f548f;
                return;
            } else if (kVar.f495b == -1) {
                return;
            }
        }
        this.f550h = -1;
    }

    public void onDrawFrame(GL10 gl10) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        int i;
        int i2;
        int i3;
        int i4;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        GL10 gl102 = gl10;
        C0148k kVar = null;
        if (!this.f544b) {
            this.f546d = null;
        } else if (this.f546d == null) {
            this.f546d = new C0161t(gl102, 48, 1.0f);
        }
        Boolean bool = false;
        if (this.f545c) {
            if (this.f548f >= 0) {
                kVar = this.f547e.get(this.f548f);
            }
            if (kVar != null && (kVar.f494a == 2 || kVar.f494a == 1 || kVar.f494a == -1)) {
                bool = true;
            }
        }
        if (bool.booleanValue()) {
            f13 = 1.0f - this.f562t;
            f10 = 1.0f - this.f563u;
            f12 = 1.0f - this.f564v;
            float f20 = 1.0f - this.f551i;
            f8 = 1.0f - this.f552j;
            gl102.glClearColor(1.0f - this.f562t, 1.0f - this.f563u, 1.0f - this.f564v, 1.0f);
            f3 = 1.0f - this.f554l;
            f2 = 1.0f - this.f555m;
            f = 1.0f - this.f556n;
            f6 = 1.0f - this.f557o;
            f5 = 1.0f - this.f558p;
            f4 = 1.0f - this.f559q;
            f7 = f20;
            f11 = 1.0f;
            f9 = 1.0f - this.f553k;
        } else {
            float f21 = this.f551i;
            float f22 = this.f552j;
            float f23 = this.f553k;
            float f24 = this.f554l;
            float f25 = this.f555m;
            float f26 = this.f556n;
            float f27 = this.f557o;
            float f28 = this.f558p;
            float f29 = this.f559q;
            f13 = this.f562t;
            f10 = this.f563u;
            f12 = this.f564v;
            f11 = this.f565w;
            f7 = f21;
            f8 = f22;
            f9 = f23;
            f3 = f24;
            f2 = f25;
            f = f26;
            f6 = f27;
            f5 = f28;
            f4 = f29;
        }
        gl102.glClearColor(f13, f10, f12, f11);
        gl102.glClear(16640);
        gl102.glMatrixMode(5888);
        gl10.glLoadIdentity();
        float f30 = 0.0f;
        GLU.gluLookAt(gl102, 0.0f, 0.0f, 25.0f, 0.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f);
        gl102.glDisable(2896);
        gl102.glFrontFace(2305);
        gl102.glColor4f(1.0f, 1.0f, 0.0f, 1.0f);
        long currentTimeMillis = System.currentTimeMillis() - this.f561s;
        if (currentTimeMillis < ((long) this.f560r)) {
            GLES10.glTranslatef(this.f566x - ((this.f566x * ((float) currentTimeMillis)) / ((float) this.f560r)), 0.0f, 0.0f);
        }
        GLES10.glTranslatef(((float) (-this.f548f)) * 0.5f, 0.0f, 0.0f);
        int i5 = -1;
        int i6 = -1;
        int i7 = 0;
        while (i7 < this.f547e.size()) {
            gl102.glColor4f(1.0f, f30, f30, 1.0f);
            C0148k kVar2 = this.f547e.get(i7);
            if (kVar2.f494a >= 0) {
                i2 = i7;
                i = -1;
            } else {
                i = -1;
                i2 = kVar2.f494a != -1 ? -1 : i6;
            }
            int i8 = kVar2.f495b >= 0 ? i7 : kVar2.f495b != i ? -1 : i5;
            if (this.f546d == null || kVar2.f495b < 0) {
                i3 = i8;
                i4 = i2;
            } else {
                if (i8 == this.f550h) {
                    f19 = f6;
                    f18 = f5;
                    f17 = f4;
                } else {
                    f18 = f8;
                    f17 = f18;
                    f19 = f7;
                }
                i3 = i8;
                i4 = i2;
                this.f546d.mo526b(gl102, String.valueOf((char) kVar2.f495b), 0.25f, (this.f546d.f569a / 2.0f) + 0.5f, 0.0f, f19, f18, f17);
            }
            if (kVar2.f494a >= 0) {
                if (i4 == this.f549g) {
                    f16 = f3;
                    f15 = f2;
                    f14 = f;
                } else {
                    f14 = f9;
                    f15 = f8;
                    f16 = f7;
                }
                gl102.glColor4f(f16, f15, f14, 1.0f);
                kVar2.mo493a(gl102);
            }
            GLES10.glTranslatef(0.5f, 0.0f, 0.0f);
            i7++;
            i6 = i4;
            i5 = i3;
            f30 = 0.0f;
        }
        gl10.glFlush();
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        C0140i.m501a(String.format(Locale.US, "MyMorseRenderer.onSurfaceChanged width=%d  height=%d ", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        if (i2 == 0) {
            i2 = 1;
        }
        float f = ((float) i) / ((float) i2);
        if (i2 > i) {
            this.f566x = 4.0f;
            this.f567y = this.f566x / f;
        } else {
            this.f567y = 4.0f;
            this.f566x = this.f567y * f;
        }
        this.f568z = 4.0f;
        float degrees = (float) (Math.toDegrees(Math.atan2((double) this.f567y, (double) (this.f568z + 25.0f))) * 2.0d);
        C0140i.m501a(String.format(Locale.US, "MyMorseRenderer.onSurfaceChanged width,height = %d,%d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        C0140i.m501a("MyMorseRenderer.onSurfaceChanged aspect=" + f);
        gl10.glViewport(0, 0, i, i2);
        gl10.glMatrixMode(5889);
        gl10.glLoadIdentity();
        GLU.gluPerspective(gl10, degrees, f, 0.1f, (this.f568z + 25.0f) * 2.0f);
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        C0140i.m501a("MyMorseRenderer.onSurfacecreated");
        if (this.f543a == 1) {
            this.f562t = 0.0f;
            this.f563u = 0.0f;
            this.f564v = 0.0f;
            this.f565w = 1.0f;
        } else {
            this.f562t = 0.0f;
            this.f563u = 0.0f;
            this.f564v = 0.0f;
            this.f565w = 0.0f;
        }
        gl10.glClearDepthf(1.0f);
        gl10.glEnable(2929);
        gl10.glDepthFunc(515);
        gl10.glHint(3152, 4354);
        gl10.glShadeModel(7425);
        gl10.glDisable(3024);
        this.f546d = null;
    }
}
