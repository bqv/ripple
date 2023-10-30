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

/* renamed from: com.dof100.morsenotifier.C0149l */
class MyPlayerTTS implements TextToSpeech.OnInitListener {

    /* renamed from: a */
    public int mTTSStatus;

    /* renamed from: b */
    public TextToSpeech mTTS;

    /* renamed from: c */
    private final int instance;

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
    private boolean mPlayInitOK = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public long f506j = 0;

    /* renamed from: k */
    private int mLocale;

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

    MyPlayerTTS(Context context, int instance) {
        this.instance = instance;
        MyLog.log("MyPlayerTTS.constructor instance=" + this.instance);
        this.mTTSStatus = -1;
        this.mLocale = -1;
        synchronized (this) {
            this.mTTS = new TextToSpeech(context, this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m523a(String str) {
        Locale locale;
        Object[] objArr;
        String str2;
        String format;
        MyLog.log("MyPlayerTTS UtteranceProgressListener.onFinish");
        long currentTimeMillis = System.currentTimeMillis() - this.f508l;
        if (!str.equals(this.f509m)) {
            format = String.format(Locale.US, "MyPlayerTTS UtteranceProgressListener.onFinish ERROR %s != %s", str, this.f509m);
        } else {
            if (currentTimeMillis < 0 || currentTimeMillis > 100000) {
                locale = Locale.US;
                str2 = "MyPlayerTTS UtteranceProgressListener.onFinish ERROR dt = %d (out of limits)";
                objArr = new Object[]{currentTimeMillis};
            } else if (this.f510n <= 0) {
                locale = Locale.US;
                str2 = "MyPlayerTTS UtteranceProgressListener.onFinish ERROR mTTSPlayStartLength = %d <=0";
                objArr = new Object[]{this.f510n};
            } else {
                this.f511o = (this.f511o * 0.5d) + (((double) (currentTimeMillis / ((long) this.f510n))) * 0.5d);
                locale = Locale.US;
                str2 = "MyPlayerTTS UtteranceProgressListener.onFinish mAverageCharDuration adjusted to %f ";
                objArr = new Object[]{this.f511o};
            }
            format = String.format(locale, str2, objArr);
        }
        MyLog.log(format);
        this.f512p.countDown();
    }

    /* renamed from: a */
    private void tts_set_locale(String str, float f, float f2) {
        Locale locale;
        String formatString;
        Object[] objArr;
        this.mLocale = -1;
        if (this.mTTS == null) {
            MyLog.log("MyPlayerTTS.tts_set_locale. mTTS=null");
        } else if (this.mTTSStatus != 0) {
            MyLog.log("MyPlayerTTS.tts_set_locale. mTTSStatus!=TextToSpeech.SUCCESS");
        } else {
            Locale[] availableLocales = Locale.getAvailableLocales();
            int length = availableLocales.length;
            for (int i = 0; i < length; i++) {
                Locale locale2 = availableLocales[i];
                if (locale2.toString().equalsIgnoreCase(str)) {
                    MyLog.log(String.format(Locale.US, "MyPlayerTTS.tts_set_locale Found selected locale[%d/%d]=%s", i, length, locale2.toString()));
                    if (this.mTTS.isLanguageAvailable(locale2) < 1) {
                        locale = Locale.US;
                        formatString = "MyPlayerTTS.tts_set_locale ERROR: Selected locale[%d/%d]=%s not available";
                        objArr = new Object[]{i, length, locale2.toString()};
                    } else {
                        MyLog.log(String.format(Locale.US, "MyPlayerTTS.tts_set_locale Selected locale [%d/%d]=%s is available", i, length, locale2.toString()));
                        if (this.mTTS.setLanguage(locale2) < 1) {
                            locale = Locale.US;
                            formatString = "MyPlayerTTS.tts_set_locale ERROR: Selected locale[%d/%d]=%s cannot be set";
                            objArr = new Object[]{i, length, locale2.toString()};
                        } else {
                            MyLog.log(String.format(Locale.US, "MyPlayerTTS.tts_set_locale Selected locale[%d/%d]=%s set OK", i, length, locale2.toString()));
                            this.mLocale = 0;

                            locale = null;
                            formatString = null;
                            objArr = null;
                        }
                    }
                    MyLog.log(String.format(locale, formatString, objArr));
                }
            }
            this.mTTS.setPitch(f);
            this.mTTS.setSpeechRate(f2);
        }
    }

    /* renamed from: a */
    public void mo494a(Context context) {
        MyLog.log("MyPlayerTTS.playDone instance=" + this.instance);
        if (!this.mPlayInitOK) {
            MyLog.log(context, "MyPlayerTTS.playDone ERROR mPlayInitOK = false");
            return;
        }
        long length = (long) (((int) (((double) (this.f501e * 2)) * this.f511o * ((double) this.f504h.length()))) + 5000);
        if (length > 30000) {
            length = 30000;
        }
        if (length < 1000) {
            length = 1000;
        }
        MyLog.log(String.format(Locale.US, "MyPlayerTTS.playDone Waiting to finish (max %d msec)", length));
        try {
            this.f512p.await(length, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MyLog.log("MyPlayerTTS.playDone Waiting OK");
        MyLog.log("MyPlayerTTS.playDone OUT instance=" + this.instance);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo495a(Context context, int i, int i2, String str, int i3, int i4, int i5, int i6, String str2) {
        MyLog.log(String.format(Locale.US, "MyPlayerTTS.playInit inst=%d arepeat=%d", this.instance, i2));
        this.f500d = i;
        this.f501e = i2;
        this.f502f = i5;
        this.f503g = i6;
        this.f504h = str2;
        this.mPlayInitOK = false;
        this.f506j = System.currentTimeMillis();
        synchronized (this) {
            try {
                if (this.mTTS == null) {
                    MyLog.log(context, "MyMorsePlayer.playInit ERROR TextToSpeech=null");
                    return;
                }
                if (this.f501e < 0) {
                    this.f501e = -((this.f501e * 1000) / ((int) (this.f511o * ((double) this.f504h.length()))));
                    this.f501e++;
                    MyLog.log(String.format(Locale.US, "MyPlayerTTS.playInit Actual Repeat = %d", this.f501e));
                }
                tts_set_locale(str, ((float) i4) / 100.0f, ((float) i3) / 100.0f);
                this.mPlayInitOK = true;
                MyLog.log(String.format(Locale.US, "MyPlayerTTS.playInit OUT instance=%d  dt=%d", this.instance, System.currentTimeMillis() - this.f506j));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public void mo496b(Context context) {
        MyLog.log(context, "MyPlayerTTS.play instance=" + this.instance + "  text=" + this.f504h);
        synchronized (this) {
            if (this.mTTS == null) {
                MyLog.log(context, "MyPlayerTTS.play ERROR mTTS=null");
            } else if (!this.mPlayInitOK) {
                MyLog.log(context, "MyPlayerTTS.play ERROR mPlayInitOK = false");
            } else if (this.mTTSStatus != 0) {
                MyLog.log(context, "MyPlayerTTS.play ERROR TTS not ready");
            } else if (this.mLocale != 0) {
                MyLog.log(context, "MyPlayerTTS.play ERROR Locale not ready");
            } else {
                if (this.f500d > 0) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f506j;
                    long j = ((long) this.f500d) - currentTimeMillis;
                    MyLog.log(context, String.format(Locale.US, "MyPlayerTTS.play Waiting %d-%d=%d msec", this.f500d, currentTimeMillis, j));
                    if (j > 0 && j < 10000) {
                        try {
                            Thread.sleep(j);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    MyLog.log("MyPlayerTTS.play Waiting finished");
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                MyLog.log(String.format(Locale.US, "MyPlayerTTS.play TTS after initialdelay dt=%d", currentTimeMillis2 - this.f506j));
                this.f509m = String.format(Locale.US, "id_%d_%d", this.instance, 0);
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
                    String format = String.format(Locale.US, "id_%d_%d", this.instance, i2);
                    if (Build.VERSION.SDK_INT >= 21) {
                        Bundle bundle = new Bundle();
                        bundle.putFloat("volume", ((float) this.f502f) / 100.0f);
                        bundle.putInt("streamType", this.f503g);
                        bundle.putString("utteranceId", format);
                        this.mTTS.speak(this.f504h, 1, bundle, format);
                    } else {
                        HashMap<String, String> hashMap = new HashMap<>();
                        hashMap.put("volume", Float.toHexString(((float) this.f502f) / 100.0f));
                        hashMap.put("streamType", String.valueOf(this.f503g));
                        hashMap.put("utteranceId", format);
                        this.mTTS.speak(this.f504h, 1, hashMap);
                    }
                }
            }
        }
    }

    public void onInit(int i) {
        this.mTTSStatus = i;
        synchronized (this) {
            if (this.mTTS != null) {
                if (this.mTTSStatus != 0) {
                    MyLog.log("MyPlayerTTS.constructor.onInit. ERROR mTTSStatus!=SUCESS");
                } else if (Build.VERSION.SDK_INT >= 15) {
                    MyLog.log("MyPlayerTTS.onInit Set setOnUtteranceProgressListener");
                    try {
                        this.mTTS.setOnUtteranceProgressListener(new UtteranceProgressListener() {
                            public void onDone(String str) {
                                MyLog.log("MyPlayerTTS UtteranceProgressListener.onDone");
                                MyPlayerTTS.this.m523a(str);
                            }

                            public void onError(String str) {
                                MyLog.log("MyPlayerTTS UtteranceProgressListener.onError");
                            }

                            public void onStart(String str) {
                                long currentTimeMillis = System.currentTimeMillis();
                                MyLog.log(String.format(Locale.US, "MyPlayerTTS UtteranceProgressListener.onStart dt=%d", currentTimeMillis - MyPlayerTTS.this.f506j));
                            }
                        });
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    MyLog.log("MyPlayerTTS.onInit Set OnUtteranceCompletedListener");
                    this.mTTS.setOnUtteranceCompletedListener(new TextToSpeech.OnUtteranceCompletedListener() {
                        public void onUtteranceCompleted(String str) {
                            MyLog.log("MyPlayerTTS OnUtteranceCompletedListener.onUtteranceCompleted");
                            MyPlayerTTS.this.m523a(str);
                        }
                    });
                }
            }
        }
    }
}
