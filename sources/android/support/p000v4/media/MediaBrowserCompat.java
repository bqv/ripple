package android.support.p000v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p000v4.p003c.C0043b;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.MediaBrowserCompat */
public final class MediaBrowserCompat {

    /* renamed from: a */
    static final boolean f98a = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
    private static class CustomActionResultReceiver extends C0043b {

        /* renamed from: d */
        private final String f99d;

        /* renamed from: e */
        private final Bundle f100e;

        /* renamed from: f */
        private final C0060a f101f;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo42a(int i, Bundle bundle) {
            if (this.f101f != null) {
                switch (i) {
                    case -1:
                        this.f101f.mo160c(this.f99d, this.f100e, bundle);
                        return;
                    case 0:
                        this.f101f.mo159b(this.f99d, this.f100e, bundle);
                        return;
                    case 1:
                        this.f101f.mo158a(this.f99d, this.f100e, bundle);
                        return;
                    default:
                        Log.w("MediaBrowserCompat", "Unknown result code: " + i + " (extras=" + this.f100e + ", resultData=" + bundle + ")");
                        return;
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
    private static class ItemReceiver extends C0043b {

        /* renamed from: d */
        private final String f102d;

        /* renamed from: e */
        private final C0061b f103e;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo42a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            }
            if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
                this.f103e.mo162a(this.f102d);
                return;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                this.f103e.mo161a((MediaItem) parcelable);
            } else {
                this.f103e.mo162a(this.f102d);
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>() {
            /* renamed from: a */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            /* renamed from: a */
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        };

        /* renamed from: a */
        private final int f104a;

        /* renamed from: b */
        private final MediaDescriptionCompat f105b;

        MediaItem(Parcel parcel) {
            this.f104a = parcel.readInt();
            this.f105b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaItem{" + "mFlags=" + this.f104a + ", mDescription=" + this.f105b + '}';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f104a);
            this.f105b.writeToParcel(parcel, i);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
    private static class SearchResultReceiver extends C0043b {

        /* renamed from: d */
        private final String f106d;

        /* renamed from: e */
        private final Bundle f107e;

        /* renamed from: f */
        private final C0062c f108f;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo42a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            }
            if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
                this.f108f.mo163a(this.f106d, this.f107e);
                return;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            ArrayList arrayList = null;
            if (parcelableArray != null) {
                arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
            }
            this.f108f.mo164a(this.f106d, this.f107e, arrayList);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$a */
    public static abstract class C0060a {
        /* renamed from: a */
        public void mo158a(String str, Bundle bundle, Bundle bundle2) {
        }

        /* renamed from: b */
        public void mo159b(String str, Bundle bundle, Bundle bundle2) {
        }

        /* renamed from: c */
        public void mo160c(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$b */
    public static abstract class C0061b {
        /* renamed from: a */
        public void mo161a(MediaItem mediaItem) {
        }

        /* renamed from: a */
        public void mo162a(String str) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$c */
    public static abstract class C0062c {
        /* renamed from: a */
        public void mo163a(String str, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo164a(String str, Bundle bundle, List<MediaItem> list) {
        }
    }
}
