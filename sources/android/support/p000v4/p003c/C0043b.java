package android.support.p000v4.p003c;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p000v4.p003c.C0040a;

/* renamed from: android.support.v4.c.b */
public class C0043b implements Parcelable {
    public static final Parcelable.Creator<C0043b> CREATOR = new Parcelable.Creator<C0043b>() {
        /* renamed from: a */
        public C0043b createFromParcel(Parcel parcel) {
            return new C0043b(parcel);
        }

        /* renamed from: a */
        public C0043b[] newArray(int i) {
            return new C0043b[i];
        }
    };

    /* renamed from: a */
    final boolean f59a = false;

    /* renamed from: b */
    final Handler f60b = null;

    /* renamed from: c */
    C0040a f61c;

    /* renamed from: android.support.v4.c.b$a */
    class C0045a extends C0040a.C0041a {
        C0045a() {
        }

        /* renamed from: a */
        public void mo38a(int i, Bundle bundle) {
            if (C0043b.this.f60b != null) {
                C0043b.this.f60b.post(new C0046b(i, bundle));
            } else {
                C0043b.this.mo42a(i, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.c.b$b */
    class C0046b implements Runnable {

        /* renamed from: a */
        final int f63a;

        /* renamed from: b */
        final Bundle f64b;

        C0046b(int i, Bundle bundle) {
            this.f63a = i;
            this.f64b = bundle;
        }

        public void run() {
            C0043b.this.mo42a(this.f63a, this.f64b);
        }
    }

    C0043b(Parcel parcel) {
        this.f61c = C0040a.C0041a.m53a(parcel.readStrongBinder());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo42a(int i, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f61c == null) {
                this.f61c = new C0045a();
            }
            parcel.writeStrongBinder(this.f61c.asBinder());
        }
    }
}
