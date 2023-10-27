package android.support.p000v4.p004d;

/* renamed from: android.support.v4.d.f */
public class C0058f<E> implements Cloneable {

    /* renamed from: a */
    private static final Object f93a = new Object();

    /* renamed from: b */
    private boolean f94b;

    /* renamed from: c */
    private int[] f95c;

    /* renamed from: d */
    private Object[] f96d;

    /* renamed from: e */
    private int f97e;

    public C0058f() {
        this(10);
    }

    public C0058f(int i) {
        Object[] objArr;
        this.f94b = false;
        if (i == 0) {
            this.f95c = C0049b.f68a;
            objArr = C0049b.f70c;
        } else {
            int a = C0049b.m69a(i);
            this.f95c = new int[a];
            objArr = new Object[a];
        }
        this.f96d = objArr;
        this.f97e = 0;
    }

    /* renamed from: c */
    private void m106c() {
        int i = this.f97e;
        int[] iArr = this.f95c;
        Object[] objArr = this.f96d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f93a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f94b = false;
        this.f97e = i2;
    }

    /* renamed from: a */
    public int mo145a(int i) {
        if (this.f94b) {
            m106c();
        }
        return this.f95c[i];
    }

    /* renamed from: a */
    public C0058f<E> clone() {
        try {
            C0058f<E> fVar = (C0058f) super.clone();
            try {
                fVar.f95c = (int[]) this.f95c.clone();
                fVar.f96d = (Object[]) this.f96d.clone();
                return fVar;
            } catch (CloneNotSupportedException unused) {
                return fVar;
            }
        } catch (CloneNotSupportedException unused2) {
            return null;
        }
    }

    /* renamed from: b */
    public int mo147b() {
        if (this.f94b) {
            m106c();
        }
        return this.f97e;
    }

    /* renamed from: b */
    public E mo148b(int i) {
        if (this.f94b) {
            m106c();
        }
        return this.f96d[i];
    }

    public String toString() {
        if (mo147b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f97e * 28);
        sb.append('{');
        for (int i = 0; i < this.f97e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo145a(i));
            sb.append('=');
            Object b = mo148b(i);
            if (b != this) {
                sb.append(b);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
