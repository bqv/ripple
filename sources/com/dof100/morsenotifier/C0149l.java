package com.dof100.morsenotifier;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.dof100.morsenotifier.l */
class C0149l implements TextToSpeech.OnInitListener {

    /* renamed from: a */
    public int f497a;

    /* renamed from: b */
    public TextToSpeech f498b;

    /* renamed from: c */
    private int f499c;

    /* renamed from: d */
    private int f500d = 0;

    /* renamed from: e */
    private int f501e = 1;

    /* renamed from: f */
    private int f502f = 0;

    /* renamed from: g */
    private int f503g = -1;

    /* renamed from: h */
    private String f504h = "";

    /* renamed from: i */
    private boolean f505i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public long f506j = 0;

    /* renamed from: k */
    private int f507k;

    /* renamed from: l */
    private long f508l = 0;

    /* renamed from: m */
    private String f509m = "";

    /* renamed from: n */
    private int f510n = 0;

    /* renamed from: o */
    private double f511o = 100.0d;

    /* renamed from: p */
    private final CountDownLatch f512p = new CountDownLatch(1);

    C0149l(Context context, int i) {
        this.f499c = i;
        C0140i.m501a("MyPlayerTTS.constructor instance=" + this.f499c);
        this.f497a = -1;
        this.f507k = -1;
        synchronized (this) {
            this.f498b = new TextToSpeech(context, this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m523a(String str) {
        Locale locale;
        Object[] objArr;
        String str2;
        String format;
        C0140i.m501a("MyPlayerTTS UtteranceProgressListener.onFinish");
        long currentTimeMillis = System.currentTimeMillis() - this.f508l;
        if (!str.equals(this.f509m)) {
            format = String.format(Locale.US, "MyPlayerTTS UtteranceProgressListener.onFinish ERROR %s != %s", new Object[]{str, this.f509m});
        } else {
            if (currentTimeMillis < 0 || currentTimeMillis > 100000) {
                locale = Locale.US;
                str2 = "MyPlayerTTS UtteranceProgressListener.onFinish ERROR dt = %d (out of limits)";
                objArr = new Object[]{Long.valueOf(currentTimeMillis)};
            } else if (this.f510n <= 0) {
                locale = Locale.US;
                str2 = "MyPlayerTTS UtteranceProgressListener.onFinish ERROR mTTSPlayStartLength = %d <=0";
                objArr = new Object[]{Integer.valueOf(this.f510n)};
            } else {
                this.f511o = (this.f511o * 0.5d) + (((double) (currentTimeMillis / ((long) this.f510n))) * 0.5d);
                locale = Locale.US;
                str2 = "MyPlayerTTS UtteranceProgressListener.onFinish mAverageCharDuration adjusted to %f ";
                objArr = new Object[]{Double.valueOf(this.f511o)};
            }
            format = String.format(locale, str2, objArr);
        }
        C0140i.m501a(format);
        this.f512p.countDown();
    }

    /* renamed from: a */
    private void m524a(String str, float f, float f2) {
        Locale locale;
        String str2;
        Object[] objArr;
        this.f507k = -1;
        if (this.f498b == null) {
            C0140i.m501a("MyPlayerTTS.tts_set_locale. mTTS=null");
        } else if (this.f497a != 0) {
            C0140i.m501a("MyPlayerTTS.tts_set_locale. mTTSStatus!=TextToSpeech.SUCCESS");
        } else {
            Locale[] availableLocales = Locale.getAvailableLocales();
            int length = availableLocales.length;
            for (int i = 0; i < length; i++) {
                Locale locale2 = availableLocales[i];
                if (locale2.toString().equalsIgnoreCase(str)) {
                    C0140i.m501a(String.format(Locale.US, "MyPlayerTTS.tts_set_locale Found selected locale[%d/%d]=%s", new Object[]{Integer.valueOf(i), Integer.valueOf(length), locale2.toString()}));
                    if (this.f498b.isLanguageAvailable(locale2) < 1) {
                        locale = Locale.US;
                        str2 = "MyPlayerTTS.tts_set_locale ERROR: Selected locale[%d/%d]=%s not available";
                        objArr = new Object[]{Integer.valueOf(i), Integer.valueOf(length), locale2.toString()};
                    } else {
                        C0140i.m501a(String.format(Locale.US, "MyPlayerTTS.tts_set_locale Selected locale [%d/%d]=%s is available", new Object[]{Integer.valueOf(i), Integer.valueOf(length), locale2.toString()}));
                        if (this.f498b.setLanguage(locale2) < 1) {
                            locale = Locale.US;
                            str2 = "MyPlayerTTS.tts_set_locale ERROR: Selected locale[%d/%d]=%s cannot be set";
                            objArr = new Object[]{Integer.valueOf(i), Integer.valueOf(length), locale2.toString()};
                        } else {
                            C0140i.m501a(String.format(Locale.US, "MyPlayerTTS.tts_set_locale Selected locale[%d/%d]=%s set OK", new Object[]{Integer.valueOf(i), Integer.valueOf(length), locale2.toString()}));
                            this.f507k = 0;
                        }
                    }
                    C0140i.m501a(String.format(locale, str2, objArr));
                }
            }
            this.f498b.setPitch(f);
            this.f498b.setSpeechRate(f2);
        }
    }

    /* renamed from: a */
    public void mo494a(Context context) {
        C0140i.m501a("MyPlayerTTS.playDone instance=" + this.f499c);
        if (!this.f505i) {
            C0140i.m500a(context, "MyPlayerTTS.playDone ERROR mPlayInitOK = false");
            return;
        }
        long length = (long) (((int) (((double) (this.f501e * 2)) * this.f511o * ((double) this.f504h.length()))) + 5000);
        if (length > 30000) {
            length = 30000;
        }
        if (length < 1000) {
            length = 1000;
        }
        C0140i.m501a(String.format(Locale.US, "MyPlayerTTS.playDone Waiting to finish (max %d msec)", new Object[]{Long.valueOf(length)}));
        try {
            this.f512p.await(length, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        C0140i.m501a("MyPlayerTTS.playDone Waiting OK");
        C0140i.m501a("MyPlayerTTS.playDone OUT instance=" + this.f499c);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo495a(Context context, int i, int i2, String str, int i3, int i4, int i5, int i6, String str2) {
        C0140i.m501a(String.format(Locale.US, "MyPlayerTTS.playInit inst=%d arepeat=%d", new Object[]{Integer.valueOf(this.f499c), Integer.valueOf(i2)}));
        this.f500d = i;
        this.f501e = i2;
        this.f502f = i5;
        this.f503g = i6;
        this.f504h = str2;
        this.f505i = false;
        this.f506j = System.currentTimeMillis();
        synchronized (this) {
            try {
                if (this.f498b == null) {
                    C0140i.m500a(context, "MyMorsePlayer.playInit ERROR TextToSpeech=null");
                    return;
                }
                if (this.f501e < 0) {
                    this.f501e = -((this.f501e * 1000) / ((int) (this.f511o * ((double) this.f504h.length()))));
                    this.f501e++;
                    C0140i.m501a(String.format(Locale.US, "MyPlayerTTS.playInit Actual Repeat = %d", new Object[]{Integer.valueOf(this.f501e)}));
                }
                m524a(str, ((float) i4) / 100.0f, ((float) i3) / 100.0f);
                this.f505i = true;
                C0140i.m501a(String.format(Locale.US, "MyPlayerTTS.playInit OUT instance=%d  dt=%d", new Object[]{Integer.valueOf(this.f499c), Long.valueOf(System.currentTimeMillis() - this.f506j)}));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public void mo496b(Context context) {
        C0140i.m500a(context, "MyPlayerTTS.play instance=" + this.f499c + "  text=" + this.f504h);
        synchronized (this) {
            if (this.f498b == null) {
                C0140i.m500a(context, "MyPlayerTTS.play ERROR mTTS=null");
            } else if (!this.f505i) {
                C0140i.m500a(context, "MyPlayerTTS.play ERROR mPlayInitOK = false");
            } else if (this.f497a != 0) {
                C0140i.m500a(context, "MyPlayerTTS.play ERROR TTS not ready");
            } else if (this.f507k != 0) {
                C0140i.m500a(context, "MyPlayerTTS.play ERROR Locale not ready");
            } else {
                if (this.f500d > 0) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f506j;
                    long j = ((long) this.f500d) - currentTimeMillis;
                    C0140i.m500a(context, String.format(Locale.US, "MyPlayerTTS.play Waiting %d-%d=%d msec", new Object[]{Integer.valueOf(this.f500d), Long.valueOf(currentTimeMillis), Long.valueOf(j)}));
                    if (j > 0 && j < 10000) {
                        try {
                            Thread.sleep(j);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    C0140i.m501a("MyPlayerTTS.play Waiting finished");
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                C0140i.m501a(String.format(Locale.US, "MyPlayerTTS.play TTS after initialdelay dt=%d", new Object[]{Long.valueOf(currentTimeMillis2 - this.f506j)}));
                this.f509m = String.format(Locale.US, "id_%d_%d", new Object[]{Integer.valueOf(this.f499c), 0});
                this.f510n = this.f504h.length();
                this.f508l = System.currentTimeMillis();
                if (this.f501e > 10) {
                    this.f501e = 10;
                }
                int i = this.f501e;
                if (i > 10) {
                    i = 10;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    String format = String.format(Locale.US, "id_%d_%d", new Object[]{Integer.valueOf(this.f499c), Integer.valueOf(i2)});
                    if (Build.VERSION.SDK_INT >= 21) {
                        Bundle bundle = new Bundle();
                        bundle.putFloat("volume", ((float) this.f502f) / 100.0f);
                        bundle.putInt("streamType", this.f503g);
                        bundle.putString("utteranceId", format);
                        this.f498b.speak(this.f504h, 1, bundle, format);
                    } else {
                        HashMap hashMap = new HashMap();
                        hashMap.put("volume", Float.toHexString(((float) this.f502f) / 100.0f));
                        hashMap.put("streamType", String.valueOf(this.f503g));
                        hashMap.put("utteranceId", format);
                        this.f498b.speak(this.f504h, 1, hashMap);
                    }
                }
            }
        }
    }

    public void onInit(int i) {
        this.f497a = i;
        synchronized (this) {
            if (this.f498b != null) {
                if (this.f497a != 0) {
                    C0140i.m501a("MyPlayerTTS.constructor.onInit. ERROR mTTSStatus!=SUCESS");
                } else if (Build.VERSION.SDK_INT >= 15) {
                    C0140i.m501a("MyPlayerTTS.onInit Set setOnUtteranceProgressListener");
                    try {
                        this.f498b.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                            public void onDone(String str) {
                                C0140i.m501a("MyPlayerTTS UtteranceProgressListener.onDone");
                                C0149l.this.m523a(str);
                            }

                            public void onError(String str) {
                                C0140i.m501a("MyPlayerTTS UtteranceProgressListener.onError");
                            }

                            public void onStart(String str) {
                                long currentTimeMillis = System.currentTimeMillis();
                                C0140i.m501a(String.format(Locale.US, "MyPlayerTTS UtteranceProgressListener.onStart dt=%d", new Object[]{Long.valueOf(currentTimeMillis - C0149l.this.f506j)}));
                            }
                        });
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    C0140i.m501a("MyPlayerTTS.onInit Set OnUtteranceCompletedListener");
                    this.f498b.setOnUtteranceCompletedListener(new TextToSpeech.OnUtteranceCompletedListener() {
                        public void onUtteranceCompleted(String str) {
                            C0140i.m501a("MyPlayerTTS OnUtteranceCompletedListener.onUtteranceCompleted");
                            C0149l.this.m523a(str);
                        }
                    });
                }
            }
        }
    }
}
