package com.dof100.morsenotifier;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.dof100.morsenotifier.t */
class C0161t {

    /* renamed from: a */
    float f569a;

    /* renamed from: b */
    private GL10 f570b;

    /* renamed from: c */
    private final String[] f571c;

    /* renamed from: d */
    private int f572d;

    /* renamed from: e */
    private final int[] f573e = new int[1];

    /* renamed from: f */
    private FloatBuffer f574f;

    /* renamed from: g */
    private FloatBuffer f575g;

    C0161t(GL10 gl10, int i, float f) {
        this.f570b = gl10;
        this.f572d = i;
        this.f569a = f;
        this.f571c = new String[127];
        for (int i2 = 0; i2 <= 31; i2++) {
            this.f571c[i2] = " ";
        }
        for (int i3 = 32; i3 <= 126; i3++) {
            this.f571c[i3] = Character.toString((char) i3);
        }
        m550a();
    }

    /* renamed from: a */
    private void m550a() {
        Paint paint = new Paint();
        paint.setTextSize((float) this.f572d);
        int i = 1;
        paint.setAntiAlias(true);
        paint.setARGB(255, 0, 255, 0);
        paint.setTextSize((float) this.f572d);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setAntiAlias(false);
        paint.setStyle(Paint.Style.FILL);
        int i2 = this.f572d;
        int i3 = i2;
        for (String measureText : this.f571c) {
            float measureText2 = paint.measureText(measureText);
            if (measureText2 > ((float) i3)) {
                i3 = (int) (((double) measureText2) + 0.99d);
            }
        }
        int i4 = 1;
        while (this.f571c.length > i4 * i4) {
            i4++;
        }
        int i5 = 1;
        while (i5 < i3 * i4) {
            i5 *= 2;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i5, i5, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        createBitmap.eraseColor(0);
        for (int i6 = 0; i6 < this.f571c.length; i6++) {
            int i7 = i3 / 2;
            paint.setARGB(255, 255, 255, 255);
            canvas.drawText(this.f571c[i6], (float) (((i6 % i4) * i3) + i7), ((float) (((i6 / i4) * i3) + i7)) - ((paint.descent() + paint.ascent()) / 2.0f), paint);
        }
        float[] fArr = {(-this.f569a) / 2.0f, (-this.f569a) / 2.0f, 0.0f, this.f569a / 2.0f, (-this.f569a) / 2.0f, 0.0f, (-this.f569a) / 2.0f, this.f569a / 2.0f, 0.0f, this.f569a / 2.0f, this.f569a / 2.0f, 0.0f};
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(48);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f574f = allocateDirect.asFloatBuffer();
        this.f574f.put(fArr);
        this.f574f.position(0);
        float[] fArr2 = new float[(this.f571c.length * 8)];
        int i8 = 0;
        while (i8 < this.f571c.length) {
            int i9 = (i8 % i4) * i3;
            int i10 = (i8 / i4) * i3;
            int i11 = i8 * 8;
            float f = (float) i5;
            float f2 = ((float) i9) / f;
            fArr2[i11] = f2;
            float f3 = ((float) ((i10 + i3) + i)) / f;
            fArr2[i11 + 1] = f3;
            float f4 = ((float) ((i9 + i3) - i)) / f;
            fArr2[i11 + 2] = f4;
            fArr2[i11 + 3] = f3;
            fArr2[i11 + 4] = f2;
            float f5 = ((float) (i10 + 2)) / f;
            fArr2[i11 + 5] = f5;
            fArr2[i11 + 6] = f4;
            fArr2[i11 + 7] = f5;
            i8++;
            i = 1;
        }
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(fArr2.length * 4);
        allocateDirect2.order(ByteOrder.nativeOrder());
        this.f575g = allocateDirect2.asFloatBuffer();
        this.f575g.put(fArr2);
        this.f575g.position(0);
        this.f570b.glEnable(3553);
        this.f570b.glGenTextures(1, this.f573e, 0);
        this.f570b.glBindTexture(3553, this.f573e[0]);
        this.f570b.glTexParameterf(3553, 10241, 9728.0f);
        this.f570b.glTexParameterf(3553, 10240, 9729.0f);
        this.f570b.glTexParameterf(3553, 10242, 33071.0f);
        this.f570b.glTexParameterf(3553, 10243, 33071.0f);
        GLUtils.texImage2D(3553, 0, 6408, createBitmap, 0);
        this.f570b.glDisable(3553);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo525a(GL10 gl10, String str, float f, float f2, float f3, float f4, float f5, float f6) {
        GL10 gl102 = gl10;
        float f7 = f4;
        float f8 = f5;
        float f9 = f6;
        int length = str.length();
        float f10 = (this.f569a * 2.0f) / 3.0f;
        gl102.glFrontFace(2305);
        gl10.glPushMatrix();
        gl102.glTranslatef(f + (f10 / 2.0f), f2, f3);
        gl102.glEnable(3553);
        gl102.glBlendFunc(1, 771);
        gl102.glEnable(3042);
        gl102.glEnableClientState(32884);
        gl102.glEnableClientState(32888);
        if (((double) f7) > -0.01d && ((double) f8) > -0.01d && ((double) f9) > -0.01d) {
            gl102.glColor4f(f7, f8, f9, 1.0f);
        }
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt < 0 || charAt >= this.f571c.length) {
                charAt = '?';
            }
            gl102.glVertexPointer(3, 5126, 0, this.f574f.position(0));
            gl102.glTexCoordPointer(2, 5126, 0, this.f575g.position(charAt * 8));
            gl102.glBindTexture(3553, this.f573e[0]);
            gl102.glDrawArrays(5, 0, 4);
            gl102.glTranslatef(f10, 0.0f, 0.0f);
        }
        gl102.glDisableClientState(32884);
        gl102.glDisableClientState(32888);
        gl102.glDisable(3042);
        gl102.glDisable(3553);
        gl10.glPopMatrix();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo526b(GL10 gl10, String str, float f, float f2, float f3, float f4, float f5, float f6) {
        mo525a(gl10, str, f - (((this.f569a * 2.0f) / 3.0f) * (((float) str.length()) / 2.0f)), f2, f3, f4, f5, f6);
    }
}
