package android.support.p000v4.p004d;

/* renamed from: android.support.v4.d.b */
class C0049b {

    /* renamed from: a */
    static final int[] f68a = new int[0];

    /* renamed from: b */
    static final long[] f69b = new long[0];

    /* renamed from: c */
    static final Object[] f70c = new Object[0];

    /* renamed from: a */
    public static int m69a(int i) {
        return m72b(i * 4) / 4;
    }

    /* renamed from: a */
    static int m70a(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return i4 ^ -1;
    }

    /* renamed from: a */
    public static boolean m71a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: b */
    public static int m72b(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
        }
        return i;
    }
}
