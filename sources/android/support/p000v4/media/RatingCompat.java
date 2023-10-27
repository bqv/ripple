package android.support.p000v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new Parcelable.Creator<RatingCompat>() {
        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: a */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    };

    /* renamed from: a */
    private final int f132a;

    /* renamed from: b */
    private final float f133b;

    RatingCompat(int i, float f) {
        this.f132a = i;
        this.f133b = f;
    }

    public int describeContents() {
        return this.f132a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f132a);
        sb.append(" rating=");
        sb.append(this.f133b < 0.0f ? "unrated" : String.valueOf(this.f133b));
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f132a);
        parcel.writeFloat(this.f133b);
    }
}
