package com.dof100.morsenotifier

import android.content.Context
import android.os.Build.VERSION
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.speech.tts.TextToSpeech.OnInitListener
import android.speech.tts.TextToSpeech.OnUtteranceCompletedListener
import android.speech.tts.UtteranceProgressListener
import com.dof100.morsenotifier.MyLog.log
import java.util.Locale
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit

/* renamed from: com.dof100.morsenotifier.C0149l */
class MyPlayerTTS(
  context: Context?, /* renamed from: c */
  private val instance: Int
) : OnInitListener {
  /* renamed from: a */
  var mTTSStatus: Int

  /* renamed from: b */
  var mTTS: TextToSpeech? = null

  /* renamed from: d */
  private var f500d = 0

  /* renamed from: e */
  private var f501e = 1

  /* renamed from: f */
  private var f502f = 0

  /* renamed from: g */
  private var f503g = -1

  /* renamed from: h */
  private var f504h: String? = ""

  /* renamed from: i */
  private var mPlayInitOK = false

  /* access modifiers changed from: private */ /* renamed from: j */
  var f506j: Long = 0

  /* renamed from: k */
  private var mLocale: Int

  /* renamed from: l */
  private var f508l: Long = 0

  /* renamed from: m */
  private var f509m = ""

  /* renamed from: n */
  private var f510n = 0

  /* renamed from: o */
  private var f511o = 100.0

  /* renamed from: p */
  private val f512p = CountDownLatch(1)

  init {
    log("MyPlayerTTS.constructor instance=" + instance)
    mTTSStatus = -1
    mLocale = -1
    synchronized(this) { mTTS = TextToSpeech(context, this) }
  }

  /* access modifiers changed from: private */ /* renamed from: a */
  fun m523a(str: String) {
    val locale: Locale
    val objArr: Array<Any>
    val str2: String
    val format: String
    log("MyPlayerTTS UtteranceProgressListener.onFinish")
    val currentTimeMillis = System.currentTimeMillis() - f508l
    if (str != f509m) {
      format = String.format(
        Locale.US,
        "MyPlayerTTS UtteranceProgressListener.onFinish ERROR %s != %s",
        str,
        f509m
      )
    } else {
      if (currentTimeMillis < 0 || currentTimeMillis > 100000) {
        locale = Locale.US
        str2 =
          "MyPlayerTTS UtteranceProgressListener.onFinish ERROR dt = %d (out of limits)"
        objArr = arrayOf(currentTimeMillis)
      } else if (f510n <= 0) {
        locale = Locale.US
        str2 =
          "MyPlayerTTS UtteranceProgressListener.onFinish ERROR mTTSPlayStartLength = %d <=0"
        objArr = arrayOf(f510n)
      } else {
        f511o = f511o * 0.5 + (currentTimeMillis / f510n.toLong()).toDouble() * 0.5
        locale = Locale.US
        str2 =
          "MyPlayerTTS UtteranceProgressListener.onFinish mAverageCharDuration adjusted to %f "
        objArr = arrayOf(f511o)
      }
      format = String.format(locale, str2, *objArr)
    }
    log(format)
    f512p.countDown()
  }

  /* renamed from: a */
  private fun tts_set_locale(str: String?, f: Float, f2: Float) {
    var locale: Locale?
    var formatString: String?
    var objArr: Array<Any>?
    mLocale = -1
    if (mTTS == null) {
      log("MyPlayerTTS.tts_set_locale. mTTS=null")
    } else if (mTTSStatus != 0) {
      log("MyPlayerTTS.tts_set_locale. mTTSStatus!=TextToSpeech.SUCCESS")
    } else {
      val availableLocales = Locale.getAvailableLocales()
      val length = availableLocales.size
      for (i in 0 until length) {
        val locale2 = availableLocales[i]
        if (locale2.toString().equals(str, ignoreCase = true)) {
          log(
            String.format(
              Locale.US,
              "MyPlayerTTS.tts_set_locale Found selected locale[%d/%d]=%s",
              i,
              length,
              locale2.toString()
            )
          )
          if (mTTS!!.isLanguageAvailable(locale2) < 1) {
            locale = Locale.US
            formatString =
              "MyPlayerTTS.tts_set_locale ERROR: Selected locale[%d/%d]=%s not available"
            objArr = arrayOf(i, length, locale2.toString())
          } else {
            log(
              String.format(
                Locale.US,
                "MyPlayerTTS.tts_set_locale Selected locale [%d/%d]=%s is available",
                i,
                length,
                locale2.toString()
              )
            )
            if (mTTS!!.setLanguage(locale2) < 1) {
              locale = Locale.US
              formatString =
                "MyPlayerTTS.tts_set_locale ERROR: Selected locale[%d/%d]=%s cannot be set"
              objArr = arrayOf(i, length, locale2.toString())
            } else {
              log(
                String.format(
                  Locale.US,
                  "MyPlayerTTS.tts_set_locale Selected locale[%d/%d]=%s set OK",
                  i,
                  length,
                  locale2.toString()
                )
              )
              mLocale = 0
              locale = null
              formatString = null
              objArr = null
            }
          }
          log(String.format(locale, formatString!!, *objArr!!))
        }
      }
      mTTS!!.setPitch(f)
      mTTS!!.setSpeechRate(f2)
    }
  }

  /* renamed from: a */
  fun mo494a(context: Context?) {
    log("MyPlayerTTS.playDone instance=" + instance)
    if (!mPlayInitOK) {
      log(context, "MyPlayerTTS.playDone ERROR mPlayInitOK = false")
      return
    }
    var length =
      (((f501e * 2).toDouble() * f511o * f504h!!.length.toDouble()).toInt() + 5000).toLong()
    if (length > 30000) {
      length = 30000
    }
    if (length < 1000) {
      length = 1000
    }
    log(
      String.format(
        Locale.US,
        "MyPlayerTTS.playDone Waiting to finish (max %d msec)",
        length
      )
    )
    try {
      f512p.await(length, TimeUnit.MILLISECONDS)
    } catch (e: InterruptedException) {
      e.printStackTrace()
    }
    log("MyPlayerTTS.playDone Waiting OK")
    log("MyPlayerTTS.playDone OUT instance=" + instance)
  }

  /* JADX INFO: finally extract failed */ /* renamed from: a */
  fun mo495a(
    context: Context?,
    i: Int,
    i2: Int,
    str: String?,
    i3: Int,
    i4: Int,
    i5: Int,
    i6: Int,
    str2: String?
  ) {
    log(String.format(Locale.US, "MyPlayerTTS.playInit inst=%d arepeat=%d", instance, i2))
    f500d = i
    f501e = i2
    f502f = i5
    f503g = i6
    f504h = str2
    mPlayInitOK = false
    f506j = System.currentTimeMillis()
    synchronized(this) {
      try {
        if (mTTS == null) {
          log(context, "MyMorsePlayer.playInit ERROR TextToSpeech=null")
          return
        }
        if (f501e < 0) {
          f501e = -((f501e * 1000) / ((f511o * (f504h!!.length.toDouble())).toInt()))
          f501e++
          log(String.format(Locale.US, "MyPlayerTTS.playInit Actual Repeat = %d", f501e))
        }
        tts_set_locale(str, (i4.toFloat()) / 100.0f, (i3.toFloat()) / 100.0f)
        mPlayInitOK = true
        log(
          String.format(
            Locale.US,
            "MyPlayerTTS.playInit OUT instance=%d  dt=%d",
            instance,
            System.currentTimeMillis() - f506j
          )
        )
      } catch (th: Throwable) {
        throw th
      }
    }
  }

  /* renamed from: b */
  fun mo496b(context: Context?) {
    log(context, "MyPlayerTTS.play instance=" + instance + "  text=" + f504h)
    synchronized(this) {
      if (mTTS == null) {
        log(context, "MyPlayerTTS.play ERROR mTTS=null")
      } else if (!mPlayInitOK) {
        log(context, "MyPlayerTTS.play ERROR mPlayInitOK = false")
      } else if (mTTSStatus != 0) {
        log(context, "MyPlayerTTS.play ERROR TTS not ready")
      } else if (mLocale != 0) {
        log(context, "MyPlayerTTS.play ERROR Locale not ready")
      } else {
        if (f500d > 0) {
          val currentTimeMillis = System.currentTimeMillis() - f506j
          val j = (f500d.toLong()) - currentTimeMillis
          log(
            context,
            String.format(
              Locale.US,
              "MyPlayerTTS.play Waiting %d-%d=%d msec",
              f500d,
              currentTimeMillis,
              j
            )
          )
          if (j > 0 && j < 10000) {
            try {
              Thread.sleep(j)
            } catch (e: InterruptedException) {
              e.printStackTrace()
            }
          }
          log("MyPlayerTTS.play Waiting finished")
        }
        val currentTimeMillis2 = System.currentTimeMillis()
        log(
          String.format(
            Locale.US,
            "MyPlayerTTS.play TTS after initialdelay dt=%d",
            currentTimeMillis2 - f506j
          )
        )
        f509m = String.format(Locale.US, "id_%d_%d", instance, 0)
        f510n = f504h!!.length
        f508l = System.currentTimeMillis()
        if (f501e > 10) {
          f501e = 10
        }
        var i = f501e
        if (i > 10) {
          i = 10
        }
        for (i2 in 0 until i) {
          val format = String.format(Locale.US, "id_%d_%d", instance, i2)
          if (VERSION.SDK_INT >= 21) {
            val bundle = Bundle()
            bundle.putFloat("volume", (f502f.toFloat()) / 100.0f)
            bundle.putInt("streamType", f503g)
            bundle.putString("utteranceId", format)
            mTTS!!.speak(f504h, 1, bundle, format)
          } else {
            val hashMap = HashMap<String, String>()
            hashMap["volume"] = java.lang.Float.toHexString((f502f.toFloat()) / 100.0f)
            hashMap["streamType"] = f503g.toString()
            hashMap["utteranceId"] = format
            mTTS!!.speak(f504h, 1, hashMap)
          }
        }
      }
    }
  }

  override fun onInit(i: Int) {
    mTTSStatus = i
    synchronized(this) {
      if (mTTS != null) {
        if (mTTSStatus != 0) {
          log("MyPlayerTTS.constructor.onInit. ERROR mTTSStatus!=SUCESS")
        } else if (VERSION.SDK_INT >= 15) {
          log("MyPlayerTTS.onInit Set setOnUtteranceProgressListener")
          try {
            mTTS!!.setOnUtteranceProgressListener(object : UtteranceProgressListener() {
              override fun onDone(str: String) {
                log("MyPlayerTTS UtteranceProgressListener.onDone")
                m523a(str)
              }

              override fun onError(str: String) {
                log("MyPlayerTTS UtteranceProgressListener.onError")
              }

              override fun onStart(str: String) {
                val currentTimeMillis = System.currentTimeMillis()
                log(
                  String.format(
                    Locale.US,
                    "MyPlayerTTS UtteranceProgressListener.onStart dt=%d",
                    currentTimeMillis - f506j
                  )
                )
              }
            })
          } catch (e: Exception) {
            e.printStackTrace()
          }
        } else {
          log("MyPlayerTTS.onInit Set OnUtteranceCompletedListener")
          mTTS!!.setOnUtteranceCompletedListener(OnUtteranceCompletedListener { str ->
            log("MyPlayerTTS OnUtteranceCompletedListener.onUtteranceCompleted")
            m523a(str)
          })
        }
      }
    }
  }
}
