package android.support.p000v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p000v4.media.C0067a;
import android.support.p000v4.media.C0069b;
import android.text.TextUtils;

/* renamed from: android.support.v4.media.MediaDescriptionCompat */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator<MediaDescriptionCompat>() {
        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return Build.VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.m123a(C0067a.m141a(parcel));
        }

        /* renamed from: a */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    };

    /* renamed from: a */
    private final String f109a;

    /* renamed from: b */
    private final CharSequence f110b;

    /* renamed from: c */
    private final CharSequence f111c;

    /* renamed from: d */
    private final CharSequence f112d;

    /* renamed from: e */
    private final Bitmap f113e;

    /* renamed from: f */
    private final Uri f114f;

    /* renamed from: g */
    private final Bundle f115g;

    /* renamed from: h */
    private final Uri f116h;

    /* renamed from: i */
    private Object f117i;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    public static final class C0064a {

        /* renamed from: a */
        private String f118a;

        /* renamed from: b */
        private CharSequence f119b;

        /* renamed from: c */
        private CharSequence f120c;

        /* renamed from: d */
        private CharSequence f121d;

        /* renamed from: e */
        private Bitmap f122e;

        /* renamed from: f */
        private Uri f123f;

        /* renamed from: g */
        private Bundle f124g;

        /* renamed from: h */
        private Uri f125h;

        /* renamed from: a */
        public C0064a mo173a(Bitmap bitmap) {
            this.f122e = bitmap;
            return this;
        }

        /* renamed from: a */
        public C0064a mo174a(Uri uri) {
            this.f123f = uri;
            return this;
        }

        /* renamed from: a */
        public C0064a mo175a(Bundle bundle) {
            this.f124g = bundle;
            return this;
        }

        /* renamed from: a */
        public C0064a mo176a(CharSequence charSequence) {
            this.f119b = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0064a mo177a(String str) {
            this.f118a = str;
            return this;
        }

        /* renamed from: a */
        public MediaDescriptionCompat mo178a() {
            return new MediaDescriptionCompat(this.f118a, this.f119b, this.f120c, this.f121d, this.f122e, this.f123f, this.f124g, this.f125h);
        }

        /* renamed from: b */
        public C0064a mo179b(Uri uri) {
            this.f125h = uri;
            return this;
        }

        /* renamed from: b */
        public C0064a mo180b(CharSequence charSequence) {
            this.f120c = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0064a mo181c(CharSequence charSequence) {
            this.f121d = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f109a = parcel.readString();
        this.f110b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f111c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f112d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f113e = (Bitmap) parcel.readParcelable((ClassLoader) null);
        this.f114f = (Uri) parcel.readParcelable((ClassLoader) null);
        this.f115g = parcel.readBundle();
        this.f116h = (Uri) parcel.readParcelable((ClassLoader) null);
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f109a = str;
        this.f110b = charSequence;
        this.f111c = charSequence2;
        this.f112d = charSequence3;
        this.f113e = bitmap;
        this.f114f = uri;
        this.f115g = bundle;
        this.f116h = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p000v4.media.MediaDescriptionCompat m123a(java.lang.Object r6) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x0081
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x0081
            android.support.v4.media.MediaDescriptionCompat$a r1 = new android.support.v4.media.MediaDescriptionCompat$a
            r1.<init>()
            java.lang.String r2 = android.support.p000v4.media.C0067a.m142a((java.lang.Object) r6)
            r1.mo177a((java.lang.String) r2)
            java.lang.CharSequence r2 = android.support.p000v4.media.C0067a.m144b(r6)
            r1.mo176a((java.lang.CharSequence) r2)
            java.lang.CharSequence r2 = android.support.p000v4.media.C0067a.m145c(r6)
            r1.mo180b((java.lang.CharSequence) r2)
            java.lang.CharSequence r2 = android.support.p000v4.media.C0067a.m146d(r6)
            r1.mo181c(r2)
            android.graphics.Bitmap r2 = android.support.p000v4.media.C0067a.m147e(r6)
            r1.mo173a((android.graphics.Bitmap) r2)
            android.net.Uri r2 = android.support.p000v4.media.C0067a.m148f(r6)
            r1.mo174a((android.net.Uri) r2)
            android.os.Bundle r2 = android.support.p000v4.media.C0067a.m149g(r6)
            if (r2 != 0) goto L_0x0040
            r3 = r0
            goto L_0x0048
        L_0x0040:
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            android.os.Parcelable r3 = r2.getParcelable(r3)
            android.net.Uri r3 = (android.net.Uri) r3
        L_0x0048:
            if (r3 == 0) goto L_0x0064
            java.lang.String r4 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r4 = r2.containsKey(r4)
            if (r4 == 0) goto L_0x005a
            int r4 = r2.size()
            r5 = 2
            if (r4 != r5) goto L_0x005a
            goto L_0x0065
        L_0x005a:
            java.lang.String r0 = "android.support.v4.media.description.MEDIA_URI"
            r2.remove(r0)
            java.lang.String r0 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            r2.remove(r0)
        L_0x0064:
            r0 = r2
        L_0x0065:
            r1.mo175a((android.os.Bundle) r0)
            if (r3 == 0) goto L_0x006e
            r1.mo179b((android.net.Uri) r3)
            goto L_0x007b
        L_0x006e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 < r2) goto L_0x007b
            android.net.Uri r0 = android.support.p000v4.media.C0069b.m159h(r6)
            r1.mo179b((android.net.Uri) r0)
        L_0x007b:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.mo178a()
            r0.f117i = r6
        L_0x0081:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p000v4.media.MediaDescriptionCompat.m123a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    /* renamed from: a */
    public Object mo165a() {
        if (this.f117i != null || Build.VERSION.SDK_INT < 21) {
            return this.f117i;
        }
        Object a = C0067a.C0068a.m150a();
        C0067a.C0068a.m156a(a, this.f109a);
        C0067a.C0068a.m155a(a, this.f110b);
        C0067a.C0068a.m157b(a, this.f111c);
        C0067a.C0068a.m158c(a, this.f112d);
        C0067a.C0068a.m152a(a, this.f113e);
        C0067a.C0068a.m153a(a, this.f114f);
        Bundle bundle = this.f115g;
        if (Build.VERSION.SDK_INT < 23 && this.f116h != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f116h);
        }
        C0067a.C0068a.m154a(a, bundle);
        if (Build.VERSION.SDK_INT >= 23) {
            C0069b.C0070a.m160b(a, this.f116h);
        }
        this.f117i = C0067a.C0068a.m151a(a);
        return this.f117i;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f110b + ", " + this.f111c + ", " + this.f112d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.f109a);
            TextUtils.writeToParcel(this.f110b, parcel, i);
            TextUtils.writeToParcel(this.f111c, parcel, i);
            TextUtils.writeToParcel(this.f112d, parcel, i);
            parcel.writeParcelable(this.f113e, i);
            parcel.writeParcelable(this.f114f, i);
            parcel.writeBundle(this.f115g);
            parcel.writeParcelable(this.f116h, i);
            return;
        }
        C0067a.m143a(mo165a(), parcel, i);
    }
}
