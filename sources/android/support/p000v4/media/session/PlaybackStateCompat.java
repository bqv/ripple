package android.support.p000v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p000v4.media.session.C0096e;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new Parcelable.Creator<PlaybackStateCompat>() {
        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: a */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    };

    /* renamed from: a */
    final int f161a;

    /* renamed from: b */
    final long f162b;

    /* renamed from: c */
    final long f163c;

    /* renamed from: d */
    final float f164d;

    /* renamed from: e */
    final long f165e;

    /* renamed from: f */
    final int f166f;

    /* renamed from: g */
    final CharSequence f167g;

    /* renamed from: h */
    final long f168h;

    /* renamed from: i */
    List<CustomAction> f169i;

    /* renamed from: j */
    final long f170j;

    /* renamed from: k */
    final Bundle f171k;

    /* renamed from: l */
    private Object f172l;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Parcelable.Creator<CustomAction>() {
            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: a */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        };

        /* renamed from: a */
        private final String f173a;

        /* renamed from: b */
        private final CharSequence f174b;

        /* renamed from: c */
        private final int f175c;

        /* renamed from: d */
        private final Bundle f176d;

        /* renamed from: e */
        private Object f177e;

        CustomAction(Parcel parcel) {
            this.f173a = parcel.readString();
            this.f174b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f175c = parcel.readInt();
            this.f176d = parcel.readBundle();
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f173a = str;
            this.f174b = charSequence;
            this.f175c = i;
            this.f176d = bundle;
        }

        /* renamed from: a */
        public static CustomAction m218a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            CustomAction customAction = new CustomAction(C0096e.C0097a.m370a(obj), C0096e.C0097a.m371b(obj), C0096e.C0097a.m372c(obj), C0096e.C0097a.m373d(obj));
            customAction.f177e = obj;
            return customAction;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.f174b + ", mIcon=" + this.f175c + ", mExtras=" + this.f176d;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f173a);
            TextUtils.writeToParcel(this.f174b, parcel, i);
            parcel.writeInt(this.f175c);
            parcel.writeBundle(this.f176d);
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f161a = i;
        this.f162b = j;
        this.f163c = j2;
        this.f164d = f;
        this.f165e = j3;
        this.f166f = i2;
        this.f167g = charSequence;
        this.f168h = j4;
        this.f169i = new ArrayList(list);
        this.f170j = j5;
        this.f171k = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f161a = parcel.readInt();
        this.f162b = parcel.readLong();
        this.f164d = parcel.readFloat();
        this.f168h = parcel.readLong();
        this.f163c = parcel.readLong();
        this.f165e = parcel.readLong();
        this.f167g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f169i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f170j = parcel.readLong();
        this.f171k = parcel.readBundle();
        this.f166f = parcel.readInt();
    }

    /* renamed from: a */
    public static PlaybackStateCompat m215a(Object obj) {
        ArrayList arrayList;
        Object obj2 = obj;
        Bundle bundle = null;
        if (obj2 == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        List<Object> h = C0096e.m368h(obj);
        if (h != null) {
            ArrayList arrayList2 = new ArrayList(h.size());
            for (Object a : h) {
                arrayList2.add(CustomAction.m218a(a));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = C0098f.m374a(obj);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C0096e.m361a(obj), C0096e.m362b(obj), C0096e.m363c(obj), C0096e.m364d(obj), C0096e.m365e(obj), 0, C0096e.m366f(obj), C0096e.m367g(obj), arrayList, C0096e.m369i(obj), bundle);
        playbackStateCompat.f172l = obj2;
        return playbackStateCompat;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f161a + ", position=" + this.f162b + ", buffered position=" + this.f163c + ", speed=" + this.f164d + ", updated=" + this.f168h + ", actions=" + this.f165e + ", error code=" + this.f166f + ", error message=" + this.f167g + ", custom actions=" + this.f169i + ", active item id=" + this.f170j + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f161a);
        parcel.writeLong(this.f162b);
        parcel.writeFloat(this.f164d);
        parcel.writeLong(this.f168h);
        parcel.writeLong(this.f163c);
        parcel.writeLong(this.f165e);
        TextUtils.writeToParcel(this.f167g, parcel, i);
        parcel.writeTypedList(this.f169i);
        parcel.writeLong(this.f170j);
        parcel.writeBundle(this.f171k);
        parcel.writeInt(this.f166f);
    }
}
