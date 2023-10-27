package android.support.p000v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new Parcelable.Creator<ParcelableVolumeInfo>() {
        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: a */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    };

    /* renamed from: a */
    public int f156a;

    /* renamed from: b */
    public int f157b;

    /* renamed from: c */
    public int f158c;

    /* renamed from: d */
    public int f159d;

    /* renamed from: e */
    public int f160e;

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f156a = parcel.readInt();
        this.f158c = parcel.readInt();
        this.f159d = parcel.readInt();
        this.f160e = parcel.readInt();
        this.f157b = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f156a);
        parcel.writeInt(this.f158c);
        parcel.writeInt(this.f159d);
        parcel.writeInt(this.f160e);
        parcel.writeInt(this.f157b);
    }
}
