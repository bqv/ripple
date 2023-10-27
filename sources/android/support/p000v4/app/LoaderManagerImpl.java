package android.support.p000v4.app;

import android.arch.lifecycle.C0004e;
import android.arch.lifecycle.C0010i;
import android.arch.lifecycle.C0011j;
import android.support.p000v4.p004d.C0050c;
import android.support.p000v4.p004d.C0058f;

/* renamed from: android.support.v4.app.LoaderManagerImpl */
class LoaderManagerImpl extends C0036d {

    /* renamed from: a */
    static boolean f16a = false;

    /* renamed from: b */
    private final C0004e f17b;

    /* renamed from: android.support.v4.app.LoaderManagerImpl$LoaderViewModel */
    static class LoaderViewModel extends C0010i {

        /* renamed from: a */
        private static final C0011j.C0012a f18a = new C0011j.C0012a() {
        };

        /* renamed from: b */
        private C0058f<Object> f19b = new C0058f<>();

        LoaderViewModel() {
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0050c.m73a(this.f17b, sb);
        sb.append("}}");
        return sb.toString();
    }
}
