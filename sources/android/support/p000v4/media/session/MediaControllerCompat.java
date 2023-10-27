package android.support.p000v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p000v4.app.C0024b;
import android.support.p000v4.media.MediaMetadataCompat;
import android.support.p000v4.media.session.C0084a;
import android.support.p000v4.media.session.C0087b;
import android.support.p000v4.media.session.C0090c;
import android.support.p000v4.media.session.MediaSessionCompat;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaControllerCompat */
public final class MediaControllerCompat {

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
    static class MediaControllerImplApi21 {

        /* renamed from: a */
        private final List<C0073a> f134a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C0087b f135b;

        /* renamed from: c */
        private HashMap<C0073a, C0072a> f136c;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: a */
            private WeakReference<MediaControllerImplApi21> f137a;

            /* access modifiers changed from: protected */
            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.f137a.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    C0087b unused = mediaControllerImplApi21.f135b = C0087b.C0088a.m297a(C0024b.m11a(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
                    mediaControllerImplApi21.m163a();
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
        private static class C0072a extends C0073a.C0076c {
            C0072a(C0073a aVar) {
                super(aVar);
            }

            /* renamed from: a */
            public void mo196a() {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo197a(Bundle bundle) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo198a(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo199a(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo200a(CharSequence charSequence) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo201a(List<MediaSessionCompat.QueueItem> list) {
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m163a() {
            if (this.f135b != null) {
                synchronized (this.f134a) {
                    for (C0073a next : this.f134a) {
                        C0072a aVar = new C0072a(next);
                        this.f136c.put(next, aVar);
                        next.f139b = true;
                        try {
                            this.f135b.mo283a((C0084a) aVar);
                            next.mo202a();
                        } catch (RemoteException e) {
                            Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                        }
                    }
                    this.f134a.clear();
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$a */
    public static abstract class C0073a implements IBinder.DeathRecipient {

        /* renamed from: a */
        C0074a f138a;

        /* renamed from: b */
        boolean f139b;

        /* renamed from: c */
        private final Object f140c;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a */
        private class C0074a extends Handler {

            /* renamed from: a */
            boolean f141a;

            /* renamed from: b */
            final /* synthetic */ C0073a f142b;

            public void handleMessage(Message message) {
                if (this.f141a) {
                    switch (message.what) {
                        case 1:
                            this.f142b.mo210a((String) message.obj, message.getData());
                            return;
                        case 2:
                            this.f142b.mo208a((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            this.f142b.mo206a((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            this.f142b.mo207a((C0077b) message.obj);
                            return;
                        case 5:
                            this.f142b.mo211a((List<MediaSessionCompat.QueueItem>) (List) message.obj);
                            return;
                        case 6:
                            this.f142b.mo209a((CharSequence) message.obj);
                            return;
                        case 7:
                            this.f142b.mo205a((Bundle) message.obj);
                            return;
                        case 8:
                            this.f142b.mo213b();
                            return;
                        case 9:
                            this.f142b.mo203a(((Integer) message.obj).intValue());
                            return;
                        case 11:
                            this.f142b.mo212a(((Boolean) message.obj).booleanValue());
                            return;
                        case 12:
                            this.f142b.mo214b(((Integer) message.obj).intValue());
                            return;
                        case 13:
                            this.f142b.mo202a();
                            return;
                        default:
                            return;
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$b */
        private static class C0075b implements C0090c.C0091a {

            /* renamed from: a */
            private final WeakReference<C0073a> f143a;

            C0075b(C0073a aVar) {
                this.f143a = new WeakReference<>(aVar);
            }

            /* renamed from: a */
            public void mo216a() {
                C0073a aVar = (C0073a) this.f143a.get();
                if (aVar != null) {
                    aVar.mo213b();
                }
            }

            /* renamed from: a */
            public void mo217a(int i, int i2, int i3, int i4, int i5) {
                C0073a aVar = (C0073a) this.f143a.get();
                if (aVar != null) {
                    aVar.mo207a(new C0077b(i, i2, i3, i4, i5));
                }
            }

            /* renamed from: a */
            public void mo218a(Bundle bundle) {
                C0073a aVar = (C0073a) this.f143a.get();
                if (aVar != null) {
                    aVar.mo205a(bundle);
                }
            }

            /* renamed from: a */
            public void mo219a(CharSequence charSequence) {
                C0073a aVar = (C0073a) this.f143a.get();
                if (aVar != null) {
                    aVar.mo209a(charSequence);
                }
            }

            /* renamed from: a */
            public void mo220a(Object obj) {
                C0073a aVar = (C0073a) this.f143a.get();
                if (aVar != null && !aVar.f139b) {
                    aVar.mo208a(PlaybackStateCompat.m215a(obj));
                }
            }

            /* renamed from: a */
            public void mo221a(String str, Bundle bundle) {
                C0073a aVar = (C0073a) this.f143a.get();
                if (aVar == null) {
                    return;
                }
                if (!aVar.f139b || Build.VERSION.SDK_INT >= 23) {
                    aVar.mo210a(str, bundle);
                }
            }

            /* renamed from: a */
            public void mo222a(List<?> list) {
                C0073a aVar = (C0073a) this.f143a.get();
                if (aVar != null) {
                    aVar.mo211a(MediaSessionCompat.QueueItem.m206a(list));
                }
            }

            /* renamed from: b */
            public void mo223b(Object obj) {
                C0073a aVar = (C0073a) this.f143a.get();
                if (aVar != null) {
                    aVar.mo206a(MediaMetadataCompat.m136a(obj));
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$c */
        private static class C0076c extends C0084a.C0085a {

            /* renamed from: a */
            private final WeakReference<C0073a> f144a;

            C0076c(C0073a aVar) {
                this.f144a = new WeakReference<>(aVar);
            }

            /* renamed from: a */
            public void mo196a() {
                C0073a aVar = (C0073a) this.f144a.get();
                if (aVar != null) {
                    aVar.mo204a(8, (Object) null, (Bundle) null);
                }
            }

            /* renamed from: a */
            public void mo224a(int i) {
                C0073a aVar = (C0073a) this.f144a.get();
                if (aVar != null) {
                    aVar.mo204a(9, Integer.valueOf(i), (Bundle) null);
                }
            }

            /* renamed from: a */
            public void mo197a(Bundle bundle) {
                C0073a aVar = (C0073a) this.f144a.get();
                if (aVar != null) {
                    aVar.mo204a(7, bundle, (Bundle) null);
                }
            }

            /* renamed from: a */
            public void mo198a(MediaMetadataCompat mediaMetadataCompat) {
                C0073a aVar = (C0073a) this.f144a.get();
                if (aVar != null) {
                    aVar.mo204a(3, mediaMetadataCompat, (Bundle) null);
                }
            }

            /* renamed from: a */
            public void mo199a(ParcelableVolumeInfo parcelableVolumeInfo) {
                C0073a aVar = (C0073a) this.f144a.get();
                if (aVar != null) {
                    aVar.mo204a(4, parcelableVolumeInfo != null ? new C0077b(parcelableVolumeInfo.f156a, parcelableVolumeInfo.f157b, parcelableVolumeInfo.f158c, parcelableVolumeInfo.f159d, parcelableVolumeInfo.f160e) : null, (Bundle) null);
                }
            }

            /* renamed from: a */
            public void mo225a(PlaybackStateCompat playbackStateCompat) {
                C0073a aVar = (C0073a) this.f144a.get();
                if (aVar != null) {
                    aVar.mo204a(2, playbackStateCompat, (Bundle) null);
                }
            }

            /* renamed from: a */
            public void mo200a(CharSequence charSequence) {
                C0073a aVar = (C0073a) this.f144a.get();
                if (aVar != null) {
                    aVar.mo204a(6, charSequence, (Bundle) null);
                }
            }

            /* renamed from: a */
            public void mo226a(String str, Bundle bundle) {
                C0073a aVar = (C0073a) this.f144a.get();
                if (aVar != null) {
                    aVar.mo204a(1, str, bundle);
                }
            }

            /* renamed from: a */
            public void mo201a(List<MediaSessionCompat.QueueItem> list) {
                C0073a aVar = (C0073a) this.f144a.get();
                if (aVar != null) {
                    aVar.mo204a(5, list, (Bundle) null);
                }
            }

            /* renamed from: a */
            public void mo227a(boolean z) {
            }

            /* renamed from: b */
            public void mo228b() {
                C0073a aVar = (C0073a) this.f144a.get();
                if (aVar != null) {
                    aVar.mo204a(13, (Object) null, (Bundle) null);
                }
            }

            /* renamed from: b */
            public void mo229b(int i) {
                C0073a aVar = (C0073a) this.f144a.get();
                if (aVar != null) {
                    aVar.mo204a(12, Integer.valueOf(i), (Bundle) null);
                }
            }

            /* renamed from: b */
            public void mo230b(boolean z) {
                C0073a aVar = (C0073a) this.f144a.get();
                if (aVar != null) {
                    aVar.mo204a(11, Boolean.valueOf(z), (Bundle) null);
                }
            }
        }

        public C0073a() {
            this.f140c = Build.VERSION.SDK_INT >= 21 ? C0090c.m347a(new C0075b(this)) : new C0076c(this);
        }

        /* renamed from: a */
        public void mo202a() {
        }

        /* renamed from: a */
        public void mo203a(int i) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo204a(int i, Object obj, Bundle bundle) {
            if (this.f138a != null) {
                Message obtainMessage = this.f138a.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        /* renamed from: a */
        public void mo205a(Bundle bundle) {
        }

        /* renamed from: a */
        public void mo206a(MediaMetadataCompat mediaMetadataCompat) {
        }

        /* renamed from: a */
        public void mo207a(C0077b bVar) {
        }

        /* renamed from: a */
        public void mo208a(PlaybackStateCompat playbackStateCompat) {
        }

        /* renamed from: a */
        public void mo209a(CharSequence charSequence) {
        }

        /* renamed from: a */
        public void mo210a(String str, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo211a(List<MediaSessionCompat.QueueItem> list) {
        }

        /* renamed from: a */
        public void mo212a(boolean z) {
        }

        /* renamed from: b */
        public void mo213b() {
        }

        /* renamed from: b */
        public void mo214b(int i) {
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$b */
    public static final class C0077b {

        /* renamed from: a */
        private final int f145a;

        /* renamed from: b */
        private final int f146b;

        /* renamed from: c */
        private final int f147c;

        /* renamed from: d */
        private final int f148d;

        /* renamed from: e */
        private final int f149e;

        C0077b(int i, int i2, int i3, int i4, int i5) {
            this.f145a = i;
            this.f146b = i2;
            this.f147c = i3;
            this.f148d = i4;
            this.f149e = i5;
        }
    }
}
