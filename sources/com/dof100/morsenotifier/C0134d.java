package com.dof100.morsenotifier;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.dof100.morsenotifier.d */
class C0134d {

    /* renamed from: a */
    private final short[] f451a = {0, 1, 2, 0, 2, 3};

    /* renamed from: b */
    private final float[] f452b = new float[12];

    /* renamed from: c */
    private FloatBuffer f453c;

    /* renamed from: d */
    private ShortBuffer f454d;

    C0134d(float f, float f2, float f3, float f4) {
        this.f452b[0] = f;
        this.f452b[1] = f4;
        this.f452b[2] = 0.0f;
        this.f452b[3] = f;
        this.f452b[4] = f2;
        this.f452b[5] = 0.0f;
        this.f452b[6] = f3;
        this.f452b[7] = f2;
        this.f452b[8] = 0.0f;
        this.f452b[9] = f3;
        this.f452b[10] = f4;
        this.f452b[11] = 0.0f;
        m487a();
    }

    /* renamed from: a */
    private void m487a() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f452b.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f453c = allocateDirect.asFloatBuffer();
        this.f453c.put(this.f452b);
        this.f453c.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(this.f451a.length * 2);
        allocateDirect2.order(ByteOrder.nativeOrder());
        this.f454d = allocateDirect2.asShortBuffer();
        this.f454d.put(this.f451a);
        this.f454d.position(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo473a(GL10 gl10) {
        gl10.glFrontFace(2305);
        gl10.glEnable(2884);
        gl10.glCullFace(1029);
        gl10.glEnableClientState(32884);
        gl10.glVertexPointer(3, 5126, 0, this.f453c);
        gl10.glDrawElements(4, this.f451a.length, 5123, this.f454d);
        gl10.glDisableClientState(32884);
        gl10.glDisable(2884);
    }
}
