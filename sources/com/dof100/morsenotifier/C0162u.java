package com.dof100.morsenotifier;

import java.util.Locale;

/* renamed from: com.dof100.morsenotifier.u */
class C0162u {

    /* renamed from: a */
    public int f576a;

    /* renamed from: b */
    byte[] f577b;

    /* renamed from: c */
    private int f578c;

    C0162u(int i, int i2) {
        this.f578c = i2;
        this.f576a = (int) ((((long) i) * ((long) this.f578c)) / 1000);
        C0140i.m501a(String.format(Locale.getDefault(), "MyTone constructor Element Dur=%d msec  Sample Rate=%d s/sec   NSamples=%d", new Object[]{Integer.valueOf(i), Integer.valueOf(this.f578c), Integer.valueOf(this.f576a)}));
        try {
            this.f577b = new byte[(this.f576a * 2)];
            for (int i3 = 0; i3 < this.f576a * 2; i3++) {
                this.f577b[i3] = 0;
            }
        } catch (Exception unused) {
            C0140i.m501a("MyTone constructor ERROR creating/initializing byte array");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo527a(int i, int i2, float f, float f2, float f3) {
        long j = (long) i;
        int i3 = (int) ((((long) this.f578c) * j) / 1000);
        if (i3 <= this.f576a - 1) {
            int i4 = (int) (((j + ((long) i2)) * ((long) this.f578c)) / 1000);
            if (i4 > this.f576a - 1) {
                i4 = this.f576a - 1;
            }
            if (i4 >= i3) {
                int i5 = (i4 - i3) + 1;
                double d = (double) ((int) ((((long) f3) * ((long) this.f578c)) / 1000));
                double d2 = (double) (i5 / 2);
                if (d > d2) {
                    d = d2;
                }
                if (f == 0.0f) {
                    f = 1.0f;
                    f2 = 0.0f;
                }
                for (int i6 = 0; i6 < i5; i6++) {
                    double d3 = 1.0d;
                    double d4 = (double) i6;
                    if (d4 < d) {
                        d3 = d4 / d;
                    } else if (d4 > ((double) i5) - d) {
                        d3 = ((double) (i5 - i6)) / d;
                    }
                    short sin = (short) ((int) (((d3 * ((double) f2)) / 100.0d) * Math.sin((d4 * 6.283185307179586d) / ((double) (((float) this.f578c) / f))) * 32767.0d));
                    int i7 = (i3 + i6) * 2;
                    this.f577b[i7] = (byte) (sin & 255);
                    this.f577b[i7 + 1] = (byte) ((sin & 65280) >>> 8);
                }
            }
        }
    }
}
