package android.support.p000v4.media.session;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.media.session.c */
class C0090c {

    /* renamed from: android.support.v4.media.session.c$a */
    public interface C0091a {
        /* renamed from: a */
        void mo216a();

        /* renamed from: a */
        void mo217a(int i, int i2, int i3, int i4, int i5);

        /* renamed from: a */
        void mo218a(Bundle bundle);

        /* renamed from: a */
        void mo219a(CharSequence charSequence);

        /* renamed from: a */
        void mo220a(Object obj);

        /* renamed from: a */
        void mo221a(String str, Bundle bundle);

        /* renamed from: a */
        void mo222a(List<?> list);

        /* renamed from: b */
        void mo223b(Object obj);
    }

    /* renamed from: android.support.v4.media.session.c$b */
    static class C0092b<T extends C0091a> extends MediaController.Callback {

        /* renamed from: a */
        protected final T f180a;

        public C0092b(T t) {
            this.f180a = t;
        }

        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            this.f180a.mo217a(playbackInfo.getPlaybackType(), C0093c.m358b(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        public void onExtrasChanged(Bundle bundle) {
            this.f180a.mo218a(bundle);
        }

        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f180a.mo223b(mediaMetadata);
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f180a.mo220a((Object) playbackState);
        }

        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            this.f180a.mo222a((List<?>) list);
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
            this.f180a.mo219a(charSequence);
        }

        public void onSessionDestroyed() {
            this.f180a.mo216a();
        }

        public void onSessionEvent(String str, Bundle bundle) {
            this.f180a.mo221a(str, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.c$c */
    public static class C0093c {
        /* renamed from: a */
        private static int m356a(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            switch (audioAttributes.getUsage()) {
                case 1:
                case 11:
                case 12:
                case 14:
                    return 3;
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                case 13:
                    return 1;
                default:
                    return 3;
            }
        }

        /* renamed from: a */
        public static AudioAttributes m357a(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getAudioAttributes();
        }

        /* renamed from: b */
        public static int m358b(Object obj) {
            return m356a(m357a(obj));
        }
    }

    /* renamed from: a */
    public static Object m347a(C0091a aVar) {
        return new C0092b(aVar);
    }
}
