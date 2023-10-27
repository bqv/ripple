package android.support.p000v4.p004d;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: android.support.v4.d.d */
abstract class C0051d<K, V> {

    /* renamed from: b */
    C0051d<K, V>.b f71b;

    /* renamed from: c */
    C0051d<K, V>.c f72c;

    /* renamed from: d */
    C0051d<K, V>.e f73d;

    /* renamed from: android.support.v4.d.d$a */
    final class C0052a<T> implements Iterator<T> {

        /* renamed from: a */
        final int f74a;

        /* renamed from: b */
        int f75b;

        /* renamed from: c */
        int f76c;

        /* renamed from: d */
        boolean f77d = false;

        C0052a(int i) {
            this.f74a = i;
            this.f75b = C0051d.this.mo54a();
        }

        public boolean hasNext() {
            return this.f76c < this.f75b;
        }

        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T a = C0051d.this.mo56a(this.f76c, this.f74a);
            this.f76c++;
            this.f77d = true;
            return a;
        }

        public void remove() {
            if (!this.f77d) {
                throw new IllegalStateException();
            }
            this.f76c--;
            this.f75b--;
            this.f77d = false;
            C0051d.this.mo58a(this.f76c);
        }
    }

    /* renamed from: android.support.v4.d.d$b */
    final class C0053b implements Set<Map.Entry<K, V>> {
        C0053b() {
        }

        /* renamed from: a */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int a = C0051d.this.mo54a();
            for (Map.Entry entry : collection) {
                C0051d.this.mo59a(entry.getKey(), entry.getValue());
            }
            return a != C0051d.this.mo54a();
        }

        public void clear() {
            C0051d.this.mo62c();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int a = C0051d.this.mo55a(entry.getKey());
            if (a < 0) {
                return false;
            }
            return C0049b.m71a(C0051d.this.mo56a(a, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return C0051d.m75a(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int a = C0051d.this.mo54a() - 1; a >= 0; a--) {
                Object a2 = C0051d.this.mo56a(a, 0);
                Object a3 = C0051d.this.mo56a(a, 1);
                i += (a2 == null ? 0 : a2.hashCode()) ^ (a3 == null ? 0 : a3.hashCode());
            }
            return i;
        }

        public boolean isEmpty() {
            return C0051d.this.mo54a() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C0055d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return C0051d.this.mo54a();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: android.support.v4.d.d$c */
    final class C0054c implements Set<K> {
        C0054c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C0051d.this.mo62c();
        }

        public boolean contains(Object obj) {
            return C0051d.this.mo55a(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return C0051d.m74a(C0051d.this.mo61b(), collection);
        }

        public boolean equals(Object obj) {
            return C0051d.m75a(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int a = C0051d.this.mo54a() - 1; a >= 0; a--) {
                Object a2 = C0051d.this.mo56a(a, 0);
                i += a2 == null ? 0 : a2.hashCode();
            }
            return i;
        }

        public boolean isEmpty() {
            return C0051d.this.mo54a() == 0;
        }

        public Iterator<K> iterator() {
            return new C0052a(0);
        }

        public boolean remove(Object obj) {
            int a = C0051d.this.mo55a(obj);
            if (a < 0) {
                return false;
            }
            C0051d.this.mo58a(a);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return C0051d.m76b(C0051d.this.mo61b(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return C0051d.m77c(C0051d.this.mo61b(), collection);
        }

        public int size() {
            return C0051d.this.mo54a();
        }

        public Object[] toArray() {
            return C0051d.this.mo64b(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return C0051d.this.mo63a(tArr, 0);
        }
    }

    /* renamed from: android.support.v4.d.d$d */
    final class C0055d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a */
        int f81a;

        /* renamed from: b */
        int f82b;

        /* renamed from: c */
        boolean f83c = false;

        C0055d() {
            this.f81a = C0051d.this.mo54a() - 1;
            this.f82b = -1;
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f82b++;
            this.f83c = true;
            return this;
        }

        public boolean equals(Object obj) {
            if (!this.f83c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                return C0049b.m71a(entry.getKey(), C0051d.this.mo56a(this.f82b, 0)) && C0049b.m71a(entry.getValue(), C0051d.this.mo56a(this.f82b, 1));
            }
        }

        public K getKey() {
            if (this.f83c) {
                return C0051d.this.mo56a(this.f82b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f83c) {
                return C0051d.this.mo56a(this.f82b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f82b < this.f81a;
        }

        public int hashCode() {
            if (!this.f83c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            int i = 0;
            Object a = C0051d.this.mo56a(this.f82b, 0);
            Object a2 = C0051d.this.mo56a(this.f82b, 1);
            int hashCode = a == null ? 0 : a.hashCode();
            if (a2 != null) {
                i = a2.hashCode();
            }
            return hashCode ^ i;
        }

        public void remove() {
            if (!this.f83c) {
                throw new IllegalStateException();
            }
            C0051d.this.mo58a(this.f82b);
            this.f82b--;
            this.f81a--;
            this.f83c = false;
        }

        public V setValue(V v) {
            if (this.f83c) {
                return C0051d.this.mo57a(this.f82b, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: android.support.v4.d.d$e */
    final class C0056e implements Collection<V> {
        C0056e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C0051d.this.mo62c();
        }

        public boolean contains(Object obj) {
            return C0051d.this.mo60b(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C0051d.this.mo54a() == 0;
        }

        public Iterator<V> iterator() {
            return new C0052a(1);
        }

        public boolean remove(Object obj) {
            int b = C0051d.this.mo60b(obj);
            if (b < 0) {
                return false;
            }
            C0051d.this.mo58a(b);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int a = C0051d.this.mo54a();
            int i = 0;
            boolean z = false;
            while (i < a) {
                if (collection.contains(C0051d.this.mo56a(i, 1))) {
                    C0051d.this.mo58a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int a = C0051d.this.mo54a();
            int i = 0;
            boolean z = false;
            while (i < a) {
                if (!collection.contains(C0051d.this.mo56a(i, 1))) {
                    C0051d.this.mo58a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return C0051d.this.mo54a();
        }

        public Object[] toArray() {
            return C0051d.this.mo64b(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return C0051d.this.mo63a(tArr, 1);
        }
    }

    C0051d() {
    }

    /* renamed from: a */
    public static <K, V> boolean m74a(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static <T> boolean m75a(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static <K, V> boolean m76b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    /* renamed from: c */
    public static <K, V> boolean m77c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo54a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo55a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo56a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract V mo57a(int i, V v);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo58a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo59a(K k, V v);

    /* renamed from: a */
    public <T> T[] mo63a(T[] tArr, int i) {
        int a = mo54a();
        if (tArr.length < a) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), a);
        }
        for (int i2 = 0; i2 < a; i2++) {
            tArr[i2] = mo56a(i2, i);
        }
        if (tArr.length > a) {
            tArr[a] = null;
        }
        return tArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo60b(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Map<K, V> mo61b();

    /* renamed from: b */
    public Object[] mo64b(int i) {
        int a = mo54a();
        Object[] objArr = new Object[a];
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = mo56a(i2, i);
        }
        return objArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo62c();

    /* renamed from: d */
    public Set<Map.Entry<K, V>> mo65d() {
        if (this.f71b == null) {
            this.f71b = new C0053b();
        }
        return this.f71b;
    }

    /* renamed from: e */
    public Set<K> mo66e() {
        if (this.f72c == null) {
            this.f72c = new C0054c();
        }
        return this.f72c;
    }

    /* renamed from: f */
    public Collection<V> mo67f() {
        if (this.f73d == null) {
            this.f73d = new C0056e();
        }
        return this.f73d;
    }
}
