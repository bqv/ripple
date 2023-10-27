package android.support.p000v4.media.session;

import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.p000v4.media.MediaDescriptionCompat;
import android.support.p000v4.media.session.C0094d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
public class MediaSessionCompat {

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new Parcelable.Creator<QueueItem>() {
            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* renamed from: a */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        };

        /* renamed from: a */
        private final MediaDescriptionCompat f150a;

        /* renamed from: b */
        private final long f151b;

        /* renamed from: c */
        private Object f152c;

        QueueItem(Parcel parcel) {
            this.f150a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f151b = parcel.readLong();
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            } else {
                this.f150a = mediaDescriptionCompat;
                this.f151b = j;
                this.f152c = obj;
            }
        }

        /* renamed from: a */
        public static QueueItem m205a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new QueueItem(obj, MediaDescriptionCompat.m123a(C0094d.C0095a.m359a(obj)), C0094d.C0095a.m360b(obj));
        }

        /* renamed from: a */
        public static List<QueueItem> m206a(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object a : list) {
                arrayList.add(m205a((Object) a));
            }
            return arrayList;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f150a + ", Id=" + this.f151b + " }";
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f150a.writeToParcel(parcel, i);
            parcel.writeLong(this.f151b);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new Parcelable.Creator<ResultReceiverWrapper>() {
            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* renamed from: a */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        };

        /* renamed from: a */
        private ResultReceiver f153a;

        ResultReceiverWrapper(Parcel parcel) {
            this.f153a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f153a.writeToParcel(parcel, i);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new Parcelable.Creator<Token>() {
            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                return new Token(Build.VERSION.SDK_INT >= 21 ? parcel.readParcelable((ClassLoader) null) : parcel.readStrongBinder());
            }

            /* renamed from: a */
            public Token[] newArray(int i) {
                return new Token[i];
            }
        };

        /* renamed from: a */
        private final Object f154a;

        /* renamed from: b */
        private final C0087b f155b;

        Token(Object obj) {
            this(obj, (C0087b) null);
        }

        Token(Object obj, C0087b bVar) {
            this.f154a = obj;
            this.f155b = bVar;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            if (this.f154a == null) {
                return token.f154a == null;
            }
            if (token.f154a == null) {
                return false;
            }
            return this.f154a.equals(token.f154a);
        }

        public int hashCode() {
            if (this.f154a == null) {
                return 0;
            }
            return this.f154a.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f154a, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.f154a);
            }
        }
    }
}
