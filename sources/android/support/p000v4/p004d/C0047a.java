package android.support.p000v4.p004d;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: android.support.v4.d.a */
public class C0047a<K, V> extends C0057e<K, V> implements Map<K, V> {

    /* renamed from: a */
    C0051d<K, V> f66a;

    /* renamed from: b */
    private C0051d<K, V> m59b() {
        if (this.f66a == null) {
            this.f66a = new C0051d<K, V>() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public int mo54a() {
                    return C0047a.this.f92h;
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public int mo55a(Object obj) {
                    return C0047a.this.mo126a(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public Object mo56a(int i, int i2) {
                    return C0047a.this.f91g[(i << 1) + i2];
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public V mo57a(int i, V v) {
                    return C0047a.this.mo128a(i, v);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo58a(int i) {
                    C0047a.this.mo136d(i);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo59a(K k, V v) {
                    C0047a.this.put(k, v);
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public int mo60b(Object obj) {
                    return C0047a.this.mo130b(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public Map<K, V> mo61b() {
                    return C0047a.this;
                }

                /* access modifiers changed from: protected */
                /* renamed from: c */
                public void mo62c() {
                    C0047a.this.clear();
                }
            };
        }
        return this.f66a;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return m59b().mo65d();
    }

    public Set<K> keySet() {
        return m59b().mo66e();
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo129a(this.f92h + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public Collection<V> values() {
        return m59b().mo67f();
    }
}
