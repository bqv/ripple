package android.support.p000v4.p004d;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: android.support.v4.d.e */
public class C0057e<K, V> {

    /* renamed from: b */
    static Object[] f86b;

    /* renamed from: c */
    static int f87c;

    /* renamed from: d */
    static Object[] f88d;

    /* renamed from: e */
    static int f89e;

    /* renamed from: f */
    int[] f90f = C0049b.f68a;

    /* renamed from: g */
    Object[] f91g = C0049b.f70c;

    /* renamed from: h */
    int f92h = 0;

    /* renamed from: a */
    private static int m94a(int[] iArr, int i, int i2) {
        try {
            return C0049b.m70a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    private static void m95a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0047a.class) {
                if (f89e < 10) {
                    objArr[0] = f88d;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f88d = objArr;
                    f89e++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0047a.class) {
                if (f87c < 10) {
                    objArr[0] = f86b;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f86b = objArr;
                    f87c++;
                }
            }
        }
    }

    /* renamed from: e */
    private void m96e(int i) {
        if (i == 8) {
            synchronized (C0047a.class) {
                if (f88d != null) {
                    Object[] objArr = f88d;
                    this.f91g = objArr;
                    f88d = (Object[]) objArr[0];
                    this.f90f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f89e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0047a.class) {
                if (f86b != null) {
                    Object[] objArr2 = f86b;
                    this.f91g = objArr2;
                    f86b = (Object[]) objArr2[0];
                    this.f90f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f87c--;
                    return;
                }
            }
        }
        this.f90f = new int[i];
        this.f91g = new Object[(i << 1)];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo125a() {
        int i = this.f92h;
        if (i == 0) {
            return -1;
        }
        int a = m94a(this.f90f, i, 0);
        if (a < 0 || this.f91g[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f90f[i2] == 0) {
            if (this.f91g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f90f[i3] == 0) {
            if (this.f91g[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    /* renamed from: a */
    public int mo126a(Object obj) {
        return obj == null ? mo125a() : mo127a(obj, obj.hashCode());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo127a(Object obj, int i) {
        int i2 = this.f92h;
        if (i2 == 0) {
            return -1;
        }
        int a = m94a(this.f90f, i2, i);
        if (a < 0 || obj.equals(this.f91g[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f90f[i3] == i) {
            if (obj.equals(this.f91g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f90f[i4] == i) {
            if (obj.equals(this.f91g[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    public V mo128a(int i, V v) {
        int i2 = (i << 1) + 1;
        V v2 = this.f91g[i2];
        this.f91g[i2] = v;
        return v2;
    }

    /* renamed from: a */
    public void mo129a(int i) {
        int i2 = this.f92h;
        if (this.f90f.length < i) {
            int[] iArr = this.f90f;
            Object[] objArr = this.f91g;
            m96e(i);
            if (this.f92h > 0) {
                System.arraycopy(iArr, 0, this.f90f, 0, i2);
                System.arraycopy(objArr, 0, this.f91g, 0, i2 << 1);
            }
            m95a(iArr, objArr, i2);
        }
        if (this.f92h != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo130b(Object obj) {
        int i = this.f92h * 2;
        Object[] objArr = this.f91g;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public K mo131b(int i) {
        return this.f91g[i << 1];
    }

    /* renamed from: c */
    public V mo132c(int i) {
        return this.f91g[(i << 1) + 1];
    }

    public void clear() {
        if (this.f92h > 0) {
            int[] iArr = this.f90f;
            Object[] objArr = this.f91g;
            int i = this.f92h;
            this.f90f = C0049b.f68a;
            this.f91g = C0049b.f70c;
            this.f92h = 0;
            m95a(iArr, objArr, i);
        }
        if (this.f92h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return mo126a(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return mo130b(obj) >= 0;
    }

    /* renamed from: d */
    public V mo136d(int i) {
        int i2 = i << 1;
        V v = this.f91g[i2 + 1];
        int i3 = this.f92h;
        int i4 = 0;
        if (i3 <= 1) {
            m95a(this.f90f, this.f91g, i3);
            this.f90f = C0049b.f68a;
            this.f91g = C0049b.f70c;
        } else {
            int i5 = i3 - 1;
            int i6 = 8;
            if (this.f90f.length <= 8 || this.f92h >= this.f90f.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(this.f90f, i7, this.f90f, i, i8);
                    System.arraycopy(this.f91g, i7 << 1, this.f91g, i2, i8 << 1);
                }
                int i9 = i5 << 1;
                this.f91g[i9] = null;
                this.f91g[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                int[] iArr = this.f90f;
                Object[] objArr = this.f91g;
                m96e(i6);
                if (i3 != this.f92h) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f90f, 0, i);
                    System.arraycopy(objArr, 0, this.f91g, 0, i2);
                }
                if (i < i5) {
                    int i10 = i + 1;
                    int i11 = i5 - i;
                    System.arraycopy(iArr, i10, this.f90f, i, i11);
                    System.arraycopy(objArr, i10 << 1, this.f91g, i2, i11 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 != this.f92h) {
            throw new ConcurrentModificationException();
        }
        this.f92h = i4;
        return v;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0057e) {
            C0057e eVar = (C0057e) obj;
            if (size() != eVar.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f92h) {
                try {
                    Object b = mo131b(i);
                    Object c = mo132c(i);
                    Object obj2 = eVar.get(b);
                    if (c == null) {
                        if (obj2 != null || !eVar.containsKey(b)) {
                            return false;
                        }
                    } else if (!c.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f92h) {
                try {
                    Object b2 = mo131b(i2);
                    Object c2 = mo132c(i2);
                    Object obj3 = map.get(b2);
                    if (c2 == null) {
                        if (obj3 != null || !map.containsKey(b2)) {
                            return false;
                        }
                    } else if (!c2.equals(obj3)) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        int a = mo126a(obj);
        if (a >= 0) {
            return this.f91g[(a << 1) + 1];
        }
        return null;
    }

    public int hashCode() {
        int[] iArr = this.f90f;
        Object[] objArr = this.f91g;
        int i = this.f92h;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < i) {
            Object obj = objArr[i3];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i2];
            i2++;
            i3 += 2;
        }
        return i4;
    }

    public boolean isEmpty() {
        return this.f92h <= 0;
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f92h;
        if (k == null) {
            i2 = mo125a();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = mo127a((Object) k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V v2 = this.f91g[i4];
            this.f91g[i4] = v;
            return v2;
        }
        int i5 = i2 ^ -1;
        if (i3 >= this.f90f.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.f90f;
            Object[] objArr = this.f91g;
            m96e(i6);
            if (i3 != this.f92h) {
                throw new ConcurrentModificationException();
            }
            if (this.f90f.length > 0) {
                System.arraycopy(iArr, 0, this.f90f, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f91g, 0, objArr.length);
            }
            m95a(iArr, objArr, i3);
        }
        if (i5 < i3) {
            int i7 = i5 + 1;
            System.arraycopy(this.f90f, i5, this.f90f, i7, i3 - i5);
            System.arraycopy(this.f91g, i5 << 1, this.f91g, i7 << 1, (this.f92h - i5) << 1);
        }
        if (i3 != this.f92h || i5 >= this.f90f.length) {
            throw new ConcurrentModificationException();
        }
        this.f90f[i5] = i;
        int i8 = i5 << 1;
        this.f91g[i8] = k;
        this.f91g[i8 + 1] = v;
        this.f92h++;
        return null;
    }

    public V remove(Object obj) {
        int a = mo126a(obj);
        if (a >= 0) {
            return mo136d(a);
        }
        return null;
    }

    public int size() {
        return this.f92h;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f92h * 28);
        sb.append('{');
        for (int i = 0; i < this.f92h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object b = mo131b(i);
            if (b != this) {
                sb.append(b);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object c = mo132c(i);
            if (c != this) {
                sb.append(c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
