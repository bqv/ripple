package android.support.p000v4.media;

import android.media.MediaDescription;
import android.net.Uri;
import android.support.p000v4.media.C0067a;

/* renamed from: android.support.v4.media.b */
class C0069b extends C0067a {

    /* renamed from: android.support.v4.media.b$a */
    static class C0070a extends C0067a.C0068a {
        /* renamed from: b */
        public static void m160b(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    /* renamed from: h */
    public static Uri m159h(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
