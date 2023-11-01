package com.dof100.morsenotifier

import android.app.IntentService
import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.SharedPreferences
import android.os.Build.VERSION
import android.os.IBinder
import android.preference.PreferenceManager
import android.telephony.TelephonyManager
import androidx.core.content.edit
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.dof100.morsenotifier.MyLog.log
import com.dof100.morsenotifier.MyLog.toast
import java.util.Calendar
import java.util.Locale
import java.util.Random

class ServiceMain : IntentService {
  private var mDisplayFlash: Boolean = false
  private var mDisplayColor: Int = 16777215
  private var mDisplayColorMeHilight: Int = 16776960
  private var mDisplayColorTextHilight: Int = 16776960
  private var E: Boolean = true
  private var F: Int = 4
  private var G: String? = ""
  private var H: Int = 0
  private var I: Boolean = false
  private var J: Boolean = false
  private var K: Boolean = false
  private var L: Boolean = false
  private var M: Boolean = false
  private var N: String? = ""
  private var O: String? = ""
  private var P: String? = ""
  private var Q: Int = 1
  private var R2: Boolean = true
  private var S: Int = 3
  private var T: String? = ""
  private var U: Int = 0
  private var V: Boolean = false
  private var W: Boolean = false
  private var X: Boolean = false
  private var Y: Boolean = false
  private var Z: Boolean = false
  private var aA: String = ""
  private var aB: String = ""
  private var aC: String = ""
  private var aD: String = ""
  private val random: Random = Random()
  private val instance: Int = random.nextInt(10000)
  private val broadcastReceiver: BroadcastReceiver = object : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
      if (("LBR_ACTION_SETTINGSCHANGED" == intent.action)) {
        log("ServiceMain.BroadcastReceiver got LBR_ACTION_SETTINGSCHANGED")
        log("ServiceMain.BroadcastReceiver pref_init")
        pref_init()
        MyJob.scheduleNextChime()
        MyJob.scheduleNextReminder(this@ServiceMain as Context?)
      }
    }
  }
  private var aa: Boolean = false
  private var ab: String? = ""
  private var ac: String? = ""
  private var ad: String? = ""
  private var ae: Int = 1
  private var af: Boolean = true
  private var ag: Int = 3
  private var ah: String? = ""
  private var ai: String? = ""
  private var aj: String? = ""
  private var ak: String? = ""
  private var al: String? = ""
  private var am: String? = ""
  private var an: Boolean = false
  private var ao: Boolean = false
  private var ap: Int = 3
  private val aq: BooleanArray = booleanArrayOf(
    true, true, true, true, true, true, true, true, true, true, true, true,
    true, true, true, true, true, true, true, true, true, true, true, true
  )
  private var ar: String? = ""
  private var d: String? = ""
  private var format: Int = 1
  private var au: Boolean = false
  private var av: Int = 1
  private var aw: Boolean = true
  private var ax: Int = 3
  private var ay: String = ""
  private var az: String = ""
  private var b: Boolean = true
  private var c: Boolean = true
  private var mDisplayInitialDelay: Int = 0
  private var mStopMethod: Int = 1
  private var f: Boolean = true
  private var g: Boolean = true
  private var h: Int = 0
  private var i: Int = 0
  private var j: Boolean = false
  private var k: Int = 0
  private var l: Boolean = false
  private var mLocale: String? = "en_US"
  private var n: Int = 100
  private var o: Int = 100
  private var p: Int = 100
  private var q: Boolean = false
  private var r: Boolean = false
  private var s: Int = 800
  private var t: Int = 100
  private var u: Int = 10
  private var v: Boolean = false
  private var mDisplayHow: Int = 1
  private var mDisplayPos: Int = 0
  private var mStayOnTop: Boolean = false
  private var mDisplayText: Boolean = true

  constructor() : super("com.dof100.morsenotifier.ServiceMain")
  constructor(name: String) : super(name)

  private fun alarm_init() {
    log(this, "ServiceMain.alarm_init")
    MyJob.clearAllJobs()
    MyJob.scheduleNextChime()
    MyJob.scheduleNextReminder(this as Context?)
    if (App.voiceMode) {
      App.getTTS(applicationContext)
    }
  }

  private fun handleChime(pHour: Int, pMinute: Int, isTest: Boolean) {
    var reminderHour: Int = pHour
    var reminderMinute: Int = pMinute
    if (ao) {
      log(this, "ServiceMain.handleChime")
      val calendar: Calendar = Calendar.getInstance()
      val nowHour: Int = calendar.get(11)
      val nowMinute: Int = calendar.get(12)
      val time: Long = calendar.timeInMillis
      val hour: Int = if (reminderHour <= 0) { calendar.get(11) % 24 } else reminderHour
      if (!isTest && !aq[hour]) {
        log(this, String.format(Locale.US,
            "ServiceMain.onHandleIntent (MSG_CHIME) Chime disabled for \"%02d:00\"",
            hour))
      } else {
        if (!isTest) {
          val dif: Int = Utils.unknown5(nowHour, nowMinute, reminderHour, reminderMinute)
          if (dif >= 2) {
            log(this, String.format(Locale.US,
                "ServiceMain.onHandleIntent (MSG_CHIME) ERROR now=%02d:%02d reminder=%02d:%02d  dif=%d",
                nowHour, nowMinute, reminderHour, reminderMinute, dif))
            return
          }
        }
        if (!isTest) {
          val sharedPreferences: SharedPreferences =
            PreferenceManager.getDefaultSharedPreferences(this)
          if (time - sharedPreferences.getLong("chime_lasttime", 0L) < 300000L) {
            log(this, String.format(Locale.US,
                "ServiceMain.onHandleIntent (MSG_CHIME) ERROR Last time was less that 5 min ego. now=%02d:%02d reminder=%02d:%02d",
                nowHour, nowMinute, reminderHour, reminderMinute))
            return
          }
          sharedPreferences.edit { putLong("chime_lasttime", time) }
        }
        var message: String? = ""
        var var11: String?
        when (format) {
          1 -> {
            var11 = String.format(Locale.US, "%02d00", hour)
            message = var11
            if (App.voiceMode) {
              message = Utils.unknown4(var11, ' ')
            }
          }

          2 -> {
            reminderMinute = hour % 12
            reminderHour = reminderMinute
            if (reminderMinute == 0) {
              reminderHour = 12
            }
            message = String.format(Locale.US, "%d", reminderHour)
          }

          3 -> message = String.format(Locale.US, "%d", hour)
        }
        var11 = message
        if (ar!!.isNotEmpty()) {
          var11 = "$ar $message"
        }
        message = var11
        if (d!!.isNotEmpty()) {
          message = "$var11 ${d}"
        }
        log(this, "ServiceMain.onHandleIntent (MSG_CHIME) hour=$hour  format=$format message:$message")
        this.play_message(message!!, a[ap], 1, isTest)
      }
    }
  }

  private fun unknown2(param1: String?) {
    // $FF: Couldn't be decompiled
  }

  private fun play_voice(message: String, var2: Int, var3: Int, var4: Int, var5: Int, var6: Int) {
    val playerTTS: MyPlayerTTS? = App.getTTS(applicationContext)
    playerTTS!!.playInit(applicationContext, h, var3, mLocale, var4, var5, var6, var2, message)
    playerTTS.play(applicationContext)
    playerTTS.playDone(applicationContext)
  }

  private fun play_message(text: String,
    stream: Int, arepeat2: Int, var4: Int, frequency: Int, var6: Int,
    enableSound: Boolean, enableVibrate: Boolean, var9: Boolean, var10: Boolean
  ) {
    val playerMorse = MyPlayerMorse(applicationContext, instance)
    val context: Context = applicationContext
    val playPunctuation: Boolean = l
    val arepeat1: Int = mDisplayInitialDelay
    val var15: Int = if (j) k else var4
    playerMorse.playInit(context, enableSound, enableVibrate, playPunctuation, arepeat1, arepeat2, var4, var15, stream, frequency, var6, u, text)
    if (var9) {
      when (mDisplayHow) {
        1, 2, 3 -> {
          val intent = Intent(this, ActivityDisplayMessage::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            putExtra("PARAM_INSTANCE", instance)
            putExtra("PARAM_LIST", playerMorse.getList())
            putExtra("PARAM_DISPLAY_HOW", mDisplayHow)
            putExtra("PARAM_DISPLAY_POS", mDisplayPos)
            putExtra("PARAM_DISPLAY_STAYONTOP", mStayOnTop)
            putExtra("PARAM_DISPLAY_TEXT", mDisplayText)
            putExtra("PARAM_DISPLAY_FLASH", mDisplayFlash)
            putExtra("PARAM_DISPLAY_COLOR", mDisplayColor)
            putExtra("PARAM_DISPLAY_COLOR_ME_HILIGHT", mDisplayColorMeHilight)
            putExtra("PARAM_DISPLAY_COLOR_TEXT_HILIGHT", mDisplayColorTextHilight)
            putExtra("PARAM_DISPLAY_INITIALDELAY", mDisplayInitialDelay)
            putExtra("PARAM_ENABLEDIALOGSETTINGS", var10 xor true)
            putExtra("PARAM_STOPMETHOD", mStopMethod)
          }
          try {
            this.startActivity(intent)
          } catch (var16: Exception) {
            log(
              this,
              "ServiceMain.play_message ERROR startActivity (ActivityDisplayMessage)" as String?
            )
          }
        }
      }
    }
    playerMorse.execute()
    playerMorse.playDone(applicationContext)
  }

  private fun play_message(message: String, stream: Int, state: Int, isTest: Boolean) {
    var message: String = message
    var state: Int = state
    log(this, "ServiceMain.play_message: $message instance=$instance")
    val messageLowercased: String = message.lowercase(Locale.getDefault())
    val speed: Int = Utils.getTagValue(messageLowercased, "s", if (App.c) i else n, 1, 200)
    val volume: Int = Utils.getTagValue(messageLowercased, "v", if (App.c) t else p, 0, 100)
    val frequency: Int = Utils.getTagValue(messageLowercased, "f", s, 10, 25000)
    val repeat: Int = Utils.getTagValue(messageLowercased, "r", state, 1, 10)
    val pitch: Int = Utils.getTagValue(messageLowercased, "p", o, 30, 300)
    val enableAudio: Boolean = Utils.getTagValue(messageLowercased, "a", q)
    val enableVibration: Boolean = Utils.getTagValue(messageLowercased, "b", r)
    val enableDisplay: Boolean = Utils.getTagValue(messageLowercased, "d", v)
    message = Utils.unknown3(message)!!
    log(String.format(Locale.US,
        "ServiceMain.play_message message=%s stream=%d istest=%b ",
        message, stream, isTest))
    log(String.format(Locale.US,
        "ServiceMain.play_message speed=%d vol=%d freq=%d repeat=%d pitch=%d",
        speed, volume, frequency, repeat, pitch))
    log(String.format(Locale.US,
        "ServiceMain.play_message Audio=%b Vibration=%b Display=%b",
        enableAudio, enableVibration, enableDisplay))
    if (isTest) {
      toast(this, "${this.getString(R.string.title_activity_about)} $message")
    }
    if (enableAudio || enableVibration || enableDisplay) {
      val telephonyManager = this.getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager?
      val var16: Boolean = telephonyManager != null && telephonyManager.callState == 2
      if (App.c && c && !isTest && var16) {
        log(this, "ServiceMain.play_message: muted (in call)" as String?)
        toast(this, "Morse Notifier: $message")
      } else if (App.voiceMode && g && !isTest && var16) {
        log(this, "ServiceMain.play_message: muted (in call)" as String?)
        toast(this, "Voice Notifier: $message")
      } else {
        if (VERSION.SDK_INT >= 23) {
          val notificationManager = this.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager?
          if (notificationManager != null) {
            state = notificationManager.currentInterruptionFilter
            log("ServiceMain.play_message dnd state = $state")
          } else {
            log("ServiceMain.play_message dnd state = (cannot get)")
            state = 1
          }
        } else {
          log("ServiceMain.play_message dnd state = (cannot get) Android ver<6.0")
          state = 1
        }
        var flagDnD = true
        if (state == 1) flagDnD = false
        log("ServiceMain.play_message flagdnd = $flagDnD")
        if (App.c && b && !isTest && flagDnD) {
          log(this, "ServiceMain.play_message: muted (do not disturb) state=$state")
        } else if (App.voiceMode && f && !isTest && flagDnD) {
          log(this, "ServiceMain.play_message: muted (do not disturb) state=$state")
        } else {
          if (App.c) {
            this.play_message(message, stream, repeat, speed, frequency, volume, enableAudio, enableVibration, enableDisplay, isTest)
          } else {
            this.play_voice(message, stream, repeat, speed, pitch, volume)
          }
          log(this, "ServiceMain.play_message OUT instance=$instance")
        }
      }
    }
  }

  private fun handleReminders(var1: String, message: String, var3: Int, reminderMinute: Int, isTest: Boolean) {
    var var1: String = var1
    var reminderHour: Int = var3
    if (au) {
      log(this, "ServiceMain.handleReminders" as String?)
      val var6: Calendar = Calendar.getInstance()
      val nowHour: Int = var6.get(11)
      val nowMinute: Int = var6.get(12)
      if ((var1 == resources.getString(R.string.MSG_REMINDERS_ONE_TEST))) {
        log(this, "ServiceMain.onHandleIntent (MSG_REMINDERS_TESTONE)" as String?)
        this.play_message(message, a[av], 1, isTest)
      } else if ((var1 == resources.getString(R.string.MSG_REMINDERS_ALL_TEST))) {
        log(this, "ServiceMain.onHandleIntent (MSG_REMINDERS_TESTALL)" as String?)
        val reminder: MyReminder? = (MyReminders(this)).a()
        if (reminder != null) {
          var1 = reminder.a()
          reminderHour = a[av]
        } else {
          var1 = resources.getString(R.string.text_confirm)
          reminderHour = a[av]
        }
        this.play_message(var1, reminderHour, 1, isTest)
      } else {
        log(this, "ServiceMain.onHandleIntent (MSG_REMINDERS_FIRE)" as String?)
        val dif: Int = Utils.unknown5(nowHour, nowMinute, reminderHour, reminderMinute)
        if (dif >= 2) {
          log(
            this,
            String.format(
              Locale.US,
              "ServiceMain.onHandleIntent (MSG_REMINDERS) ERROR now=%02d:%02d reminder=%02d:%02d  dif=%d",
              nowHour, nowMinute, reminderHour, reminderMinute, dif
            ) as String?
          )
        } else {
          this.play_message(message, a[av], 1, isTest)
        }
      }
    }
  }

  private fun handleSMS(var1: String?, var2: String?, isTest: Boolean) {
    var var1: String? = var1
    var var2: String? = var2
    if (R2) {
      log(this, "ServiceMain.handleSMS" as String?)
      this.b()
      if (var1!!.isNotEmpty()) {
        this.unknown2(var1)
      }
      val var4: Boolean = ay.isNotEmpty()
      var var7: String?
      var var8: String?
      var var11: StringBuilder
      var var12: StringBuilder
      run label124@{
        val var5: String? = T
        val var6 = ""
        if (!V && !W && !X && !Y) {
          var7 = var5
          if (!Z) {
            return@label124
          }
        }
        var8 = var6
        if (V) {
          var8 = var6
          if (az.isNotEmpty()) {
            var8 = "${"".trim { it <= ' ' }} $az"
          }
        }
        var7 = var8
        if (W) {
          var7 = var8
          if (aA.isNotEmpty()) {
            var7 = "${var8!!.trim { it <= ' ' }} $aA"
          }
        }
        var8 = var7
        if (X) {
          var8 = var7
          if (aB.isNotEmpty()) {
            var8 = "${var7!!.trim { it <= ' ' }} $aB"
          }
        }
        var7 = var8
        if (Y) {
          var7 = var8
          if (aC.isNotEmpty()) {
            var7 = "${var8!!.trim { it <= ' ' }} $aC"
          }
        }
        var8 = var7
        if (Z) {
          var8 = var7
          if (aD.isNotEmpty()) {
            var8 = "${var7!!.trim { it <= ' ' }} $aD"
          }
        }
        var8 = var8!!.trim { it <= ' ' }
        if (var4) {
          var7 = "${var5!!.trim { it <= ' ' }} $var8"
        } else {
          var7 = "${var5!!.trim { it <= ' ' }} $ac"
        }
      }
      run label109@{
        run label108@{
          run label107@{
            when (U) {
              1 -> if (var1!!.length >= 0) {
                return@label107
              }

              2 -> if (var1!!.length >= 0 && !var4) {
                return@label107
              }

              11 -> if (var1!!.length >= 3) {
                return@label108
              }

              12 -> if (var1!!.length >= 3 && !var4) {
                return@label108
              }
            }
            var8 = ""
            return@label109
          }
          var8 = var1
          return@label109
        }
        var8 = var1!!.substring(var1!!.length - 3)
      }
      run label93@{
        if (var8!!.isNotEmpty()) {
          var1 = var8
          if (App.voiceMode) {
            var1 = Utils.unknown4(var8, ' ')
          }
          var12 = StringBuilder()
          var12.append("${var7!!.trim { it <= ' ' }} ")
          var11 = var12
        } else {
          var8 = var7
          if (var1!!.isNotEmpty()) {
            return@label93
          }
          var12 = StringBuilder()
          var12.append("${var7!!.trim { it <= ' ' }} ")
          var1 = ad
          var11 = var12
        }
        var11.append(var1)
        var8 = var11.toString()
      }
      var1 = var8
      if (aa) {
        var1 = var8
        if (var2!!.isNotEmpty()) {
          var1 = "${var8!!.trim { it <= ' ' }} $var2"
        }
      }
      var2 = var1
      if (ab!!.isNotEmpty()) {
        var2 = "${var1!!.trim { it <= ' ' }} $ab"
      }
      var2 = var2!!.trim { it <= ' ' }
      var1 = var2
      if (var2.isEmpty()) {
        var1 = "sms"
      }
      this.play_message(var1!!, a[S], ae, isTest)
    }
  }

  private fun handleCall(var1: String?, isTest: Boolean) {
    var curText: String? = var1
    if (E) {
      log(this, "ServiceMain.handleCall" as String?)
      this.b()
      if (curText!!.isNotEmpty()) {
        this.unknown2(curText)
      }
      val var3: Boolean = ay.isNotEmpty()
      var var5: String?
      var var6: String
      var var8: StringBuilder
      var var9: StringBuilder
      run label118@{
        val var4: String? = G
        var5 = ""
        if (!I && !J && !K && !L) {
          var6 = (var4)!!
          if (!M) {
            return@label118
          }
        }
        var6 = var5!!
        if (I) {
          var6 = var5!!
          if (az.isNotEmpty()) {
            var6 = "${"".trim { it <= ' ' }} $az"
          }
        }
        var5 = var6
        if (J) {
          var5 = var6
          if (aA.isNotEmpty()) {
            var5 = "${var6.trim { it <= ' ' }} $aA"
          }
        }
        var6 = var5!!
        if (K) {
          var6 = var5!!
          if (aB.isNotEmpty()) {
            var6 = "${var5!!.trim { it <= ' ' }} $aB"
          }
        }
        var5 = var6
        if (L) {
          var5 = var6
          if (aC.isNotEmpty()) {
            var5 = "${var6.trim { it <= ' ' }} $aC"
          }
        }
        var6 = var5!!
        if (M) {
          var6 = var5!!
          if (aD.isNotEmpty()) {
            var6 = "${var5!!.trim { it <= ' ' }} $aD"
          }
        }
        var5 = var6.trim { it <= ' ' }
        if (var3) {
          var6 = "${var4!!.trim { it <= ' ' }} $var5"
        } else {
          var6 = "${var4!!.trim { it <= ' ' }} $O"
        }
      }
      run label103@{
        run label102@{
          run label101@{
            when (H) {
              1 -> if (curText!!.length >= 0) {
                return@label101
              }

              2 -> if (curText!!.length >= 0 && !var3) {
                return@label101
              }

              11 -> if (curText!!.length >= 3) {
                return@label102
              }

              12 -> if (curText!!.length >= 3 && !var3) {
                return@label102
              }
            }
            var5 = ""
            return@label103
          }
          var5 = curText
          return@label103
        }
        var5 = curText!!.substring(curText!!.length - 3)
      }
      run label87@{
        if (var5!!.isNotEmpty()) {
          curText = var5
          if (App.voiceMode) {
            curText = Utils.unknown4(var5, ' ')
          }
          var8 = StringBuilder()
          var8.append(var6.trim { it <= ' ' })
          var8.append(" ")
          var9 = var8
        } else {
          var5 = var6
          if (curText!!.isNotEmpty()) {
            return@label87
          }
          var8 = StringBuilder()
          var8.append(var6.trim { it <= ' ' })
          var8.append(" ")
          curText = P
          var9 = var8
        }
        var9.append(curText)
        var5 = var9.toString()
      }
      curText = var5
      if (N!!.isNotEmpty()) {
        curText = "${var5!!.trim { it <= ' ' }} $N"
      }
      var6 = curText!!.trim { it <= ' ' }
      curText = var6
      if (var6.isEmpty()) {
        curText = "Call"
      }
      log(this, "ServiceMain.onHandleIntent (MSG_CALL_RINGING) curText = $curText")
      this.play_message(curText!!, a[F], Q, isTest)
    }
  }

  private fun b() {
    ay = ""
    az = ""
    aA = ""
    aB = ""
    aC = ""
    aD = ""
  }

  private fun handleSystem(var1: String?, var2: String?, isTest: Boolean) {
    var var1: String? = var1
    var var2: String? = var2
    if (af) {
      log(this, "ServiceMain.handleSystem" as String?)
      val var4: String = ""
      if ((var1 == resources.getString(R.string.MSG_SYSTEM_BOOT))) {
        this.alarm_init()
        var2 = var4
      } else if ((var1 == resources.getString(R.string.MSG_SYSTEM_TEST))) {
        var2 = resources.getString(R.string.test_message)
      } else if ((var1 == resources.getString(R.string.MSG_SYSTEM_POWER_CONNECTED))) {
        var2 = ah
      } else if ((var1 == resources.getString(R.string.MSG_SYSTEM_POWER_DISCONNECTED))) {
        var2 = ai
      } else if ((var1 == resources.getString(R.string.MSG_SYSTEM_BATTERY_LOW))) {
        var2 = aj
      } else if ((var1 == resources.getString(R.string.MSG_SYSTEM_BATTERY_OK))) {
        var2 = ak
      } else if ((var1 == resources.getString(R.string.MSG_SYSTEM_WF_CONNECTED))) {
        val var6: StringBuilder = StringBuilder()
        var6.append(am)
        var1 = if (an) {
          val var5: StringBuilder = StringBuilder()
          var5.append(" ")
          var5.append(var2)
          var5.toString()
        } else {
          ""
        }
        var6.append(var1)
        var2 = var6.toString()
      } else {
        var2 = var4
        if ((var1 == resources.getString(R.string.MSG_SYSTEM_WF_DISCONNECTED))) {
          var2 = al
        }
      }
      if (var2!!.isNotEmpty()) {
        this.play_message(var2, a[ag], 1, isTest)
      }
    }
  }

  private fun handleApps(var1: String?, isTest: Boolean) {
    var var1: String? = var1
    if (aw) {
      log(this, "ServiceMain.handleApps" as String?)
      if (isTest) {
        var1 = this.getString(R.string.text_confirm)
      }
      if (var1!!.isNotEmpty()) {
        this.play_message(var1, a[ax], 1, false)
      }
    }
  }

  private fun pref_init() {
    log(this, "ServiceMain.pref_init" as String?)
    val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
    b = Utils.prefGetBoolean(this, sharedPreferences, "pref_morse_general_dnd", null as String?, if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    c = Utils.prefGetBoolean(this, sharedPreferences, "pref_morse_general_muteincalls", null as String?, if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    mDisplayInitialDelay = Utils.prefGetInt(this, sharedPreferences, "pref_morse_general_initialdelay", null as String?, if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    mStopMethod = Utils.prefGetInt(this, sharedPreferences, "pref_morse_general_volumedownstop", null as String?, if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    f = Utils.prefGetBoolean(this, sharedPreferences, "pref_voice_general_dnd", null as String?, if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    g = Utils.prefGetBoolean(this, sharedPreferences, "pref_voice_general_muteincalls", null as String?, if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    h = Utils.prefGetInt(this, sharedPreferences, "pref_voice_general_initialdelay", null as String?, if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    i = Utils.prefGetInt(this, sharedPreferences, "pref_morse_wpm", null as String?, if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    j = Utils.prefGetBoolean(this, sharedPreferences, "pref_morse_farnsworth_enable", null as String?, if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    k = Utils.prefGetInt(this, sharedPreferences, "pref_morse_farnsworth_wpm", null as String?, if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    l = Utils.prefGetBoolean(this, sharedPreferences, "pref_morse_punctuation", null as String?, if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    mLocale = Utils.prefGetString(this, sharedPreferences, "pref_voice_locale", "pref_general_locale", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    n = Utils.prefGetInt(this, sharedPreferences, "pref_voice_speed", "pref_general_speechrate", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    o = Utils.prefGetInt(this, sharedPreferences, "pref_voice_pitch", "pref_general_pitch", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    p = Utils.prefGetInt(this, sharedPreferences, "pref_voice_vol", "pref_general_volume", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    q = Utils.prefGetBoolean(this, sharedPreferences, "pref_audio_enable", null as String?, if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    r = Utils.prefGetBoolean(this, sharedPreferences, "pref_audio_vibration_enable", null as String?, if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    s = Utils.prefGetInt(this, sharedPreferences, "pref_audio_freq", null as String?, if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    t = Utils.prefGetInt(this, sharedPreferences, "pref_audio_vol", null as String?, if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    u = Utils.prefGetInt(this, sharedPreferences, "pref_audio_ramp", null as String?, if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    v = Utils.prefGetBoolean(this, sharedPreferences, "pref_display_enable", null as String?, if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    mDisplayHow = Utils.prefGetInt(this, sharedPreferences, "pref_display_how", null as String?, if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    mDisplayPos = Utils.prefGetInt(this, sharedPreferences, "pref_display_pos", null as String?, if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    mStayOnTop = Utils.prefGetBoolean(this, sharedPreferences, "pref_display_stayontop", null as String?, if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    mDisplayText = Utils.prefGetBoolean(this, sharedPreferences, "pref_display_text", null as String?, if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    mDisplayFlash = Utils.prefGetBoolean(this, sharedPreferences, "pref_display_flash", null as String?, if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    mDisplayColor = Utils.prefGetColor(this, sharedPreferences, "pref_display_color", null as String?, if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    mDisplayColorMeHilight = Utils.prefGetColor(this, sharedPreferences, "pref_display_color_me_highlight", null as String?, if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    mDisplayColorTextHilight = Utils.prefGetColor(this, sharedPreferences, "pref_display_color_text_highlight", null as String?, if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    E = Utils.prefGetBoolean(this, sharedPreferences, "pref_call_enable", null as String?, if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    F = Utils.prefGetInt(this, sharedPreferences, "pref_call_stream", "pref_call_e1pro_stream", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    G = Utils.prefGetString(this, sharedPreferences, "pref_call_string1", "pref_call_e1pro_string1", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    H = Utils.prefGetInt(this, sharedPreferences, "pref_call_num", "pref_call_e1pro_num", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    I = Utils.prefGetBoolean(this, sharedPreferences, "pref_call_contactdisplayname", "pref_call_e1pro_contactdisplayname", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    J = Utils.prefGetBoolean(this, sharedPreferences, "pref_call_contactfirstname", "pref_call_e1pro_contactfirstname", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    K = Utils.prefGetBoolean(this, sharedPreferences, "pref_call_contactlastname", "pref_call_e1pro_contactlastname", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    L = Utils.prefGetBoolean(this, sharedPreferences, "pref_call_contactinitials", "pref_call_e1pro_contactinitials", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    M = Utils.prefGetBoolean(this, sharedPreferences, "pref_call_contactnickname", "pref_call_e1pro_contactnickname", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    N = Utils.prefGetString(this, sharedPreferences, "pref_call_string2", "pref_call_e1pro_string2", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    O = Utils.prefGetString(this, sharedPreferences, "pref_call_contactname_none", "pref_call_e1pro_contactname_none", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    P = Utils.prefGetString(this, sharedPreferences, "pref_call_num_none", "pref_call_e1pro_num_none", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    Q = Utils.prefGetInt(this, sharedPreferences, "pref_call_repeat", "pref_call_e1pro_repeat", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    R2 = Utils.prefGetBoolean(this, sharedPreferences, "pref_sms_enable", null as String?, if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    S = Utils.prefGetInt(this, sharedPreferences, "pref_sms_stream", "pref_sms_e1pro_stream", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    T = Utils.prefGetString(this, sharedPreferences, "pref_sms_string1", "pref_sms_e1pro_string1", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    U = Utils.prefGetInt(this, sharedPreferences, "pref_sms_num", "pref_sms_e1pro_num", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    V = Utils.prefGetBoolean(this, sharedPreferences, "pref_sms_contactdisplayname", "pref_sms_e1pro_contactdisplayname", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    W = Utils.prefGetBoolean(this, sharedPreferences, "pref_sms_contactfirstname", "pref_sms_e1pro_contactfirstname", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    X = Utils.prefGetBoolean(this, sharedPreferences, "pref_sms_contactlastname", "pref_sms_e1pro_contactlastname", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    Y = Utils.prefGetBoolean(this, sharedPreferences, "pref_sms_contactinitials", "pref_sms_e1pro_contactinitials", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    Z = Utils.prefGetBoolean(this, sharedPreferences, "pref_sms_contactnickname", "pref_sms_e1pro_contactnickname", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    aa = Utils.prefGetBoolean(this, sharedPreferences, "pref_sms_text", "pref_sms_e1pro_text", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    ab = Utils.prefGetString(this, sharedPreferences, "pref_sms_string2", "pref_sms_e1pro_string2", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    ac = Utils.prefGetString(this, sharedPreferences, "pref_sms_contactname_none", "pref_sms_e1pro_contactname_none", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    ad = Utils.prefGetString(this, sharedPreferences, "pref_sms_num_none", "pref_sms_e1pro_num_none", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    ae = Utils.prefGetInt(this, sharedPreferences, "pref_sms_repeat", "pref_sms_e1pro_repeat", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    af = Utils.prefGetBoolean(this, sharedPreferences, "pref_system_enable", null as String?, if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    ag = Utils.prefGetInt(this, sharedPreferences, "pref_system_stream", "pref_system_e1pro_stream", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    ah = Utils.prefGetString(this, sharedPreferences, "pref_system_powerconectedstring", "pref_system_e1pro_powerconectedstring", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    ai = Utils.prefGetString(this, sharedPreferences, "pref_system_powerdisconectedstring", "pref_system_e1pro_powerdisconectedstring", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    aj = Utils.prefGetString(this, sharedPreferences, "pref_system_batterylowstring", "pref_system_e1pro_batterylowstring", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    ak = Utils.prefGetString(this, sharedPreferences, "pref_system_batteryokstring", "pref_system_e1pro_batteryokstring", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    al = Utils.prefGetString(this, sharedPreferences, "pref_system_wifi_disconnectedstring", "pref_system_e1pro_wifi_disconnectedstring", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    am = Utils.prefGetString(this, sharedPreferences, "pref_system_wifi_connectedstring", "pref_system_e1pro_wifi_connectedstring", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    an = Utils.prefGetBoolean(this, sharedPreferences, "pref_system_wifi_connectedssid", "pref_system_e1pro_wifi_connectedssid", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    aw = Utils.prefGetBoolean(this, sharedPreferences, "pref_apps_enable", null as String?, if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    ax = Utils.prefGetInt(this, sharedPreferences, "pref_apps_stream", null as String?, if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    ao = Utils.prefGetBoolean(this, sharedPreferences, "pref_chime_enable", null as String?, if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    for (var3 in 0..23) {
      val var4: BooleanArray = aq
      val var5: String = String.format(Locale.US, "pref_chime_hourenable_%02d", var3)
      var4[var3] = Utils.prefGetBoolean(this, sharedPreferences, var5, null as String?, if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    }
    ap = Utils.prefGetInt(this, sharedPreferences, "pref_chime_stream", "pref_chime_e1pro_stream", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    ar = Utils.prefGetString(this, sharedPreferences, "pref_chime_string1", "pref_chime_e1pro_string1", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    d = Utils.prefGetString(this, sharedPreferences, "pref_chime_string2", "pref_chime_e1pro_string2", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    format = Utils.prefGetInt(this, sharedPreferences, "pref_chime_timehow", "pref_chime_e1pro_timehow", if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    au = Utils.prefGetBoolean(this, sharedPreferences, "pref_reminders_enable", null as String?, if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
    av = Utils.prefGetInt(this, sharedPreferences, "pref_reminders_stream", null as String?, if (App.c) { "_morsedef" } else { "_voicedef" }, "_def")
  }

  override fun onBind(intent: Intent): IBinder? {
    log("ServiceMain.onBind")
    return null
  }

  override fun onCreate() {
    super.onCreate()
    log("ServiceMain.OnCreate")
  }

  override fun onDestroy() {
    log("ServiceMain.OnDestroy")
    super.onDestroy()
  }

  override fun onHandleIntent(intent: Intent?) {
    log("-----------------------------------------------------------------------------------------")
    log("ServiceMain.onHandleIntent")
    log("ServiceMain.onCreate registering broadcast receiver")
    val var2 = LocalBroadcastManager.getInstance((this as Context?)!!)
    val var3 = IntentFilter()
    var3.addAction("LBR_ACTION_SETTINGSCHANGED")
    var2.registerReceiver(broadcastReceiver, var3)
    pref_init()
    val what = if (intent != null) {
      intent.getStringExtra(resources.getString(R.string.MSG_WHAT))
    } else {
      ""
    }
    var extraT2 = if (intent != null) {
      intent.getStringExtra(resources.getString(R.string.MSG_EXTRATEXT1))
    } else {
      ""
    }
    val var9 = if (intent != null) {
      intent.getStringExtra(resources.getString(R.string.MSG_EXTRATEXT2))
    } else {
      ""
    }
    val extraI1 = intent?.getIntExtra(resources.getString(R.string.MSG_EXTRAINT1), -1) ?: 0
    val extraI2 = intent?.getIntExtra(resources.getString(R.string.MSG_EXTRAINT2), -1) ?: 0
    var extraT1: String? = extraT2
    if (extraT2 == null) {
      extraT1 = ""
    }
    extraT2 = var9
    if (var9 == null) {
      extraT2 = ""
    }
    log(
      this,
      String.format(
        Locale.US,
        "ServiceMain.onHandleIntent What=%s extraT1=%s extraT2=%s extraI1=%d extraI2=%d",
        what, extraT1, extraT2, extraI1, extraI2
      ) as String?
    )
    val isTest: Boolean = what!!.endsWith("_TEST")
    if (isTest) {
      log("ServiceMain.onHandleIntent isTest=true")
    }
    if ((what == resources.getString(R.string.MSG_MN_TEST))) {
      this.play_message(this.getString(R.string.test_message), 5, 1, true)
    } else if ((what == resources.getString(R.string.MSG_MN_ACTIVITYMAIN))) {
      this.alarm_init()
    } else if ((what == resources.getString(R.string.MSG_MN_STOP))) {
      log("ServiceMain.onHandleIntent MSG_MN_STOP")
    } else if (what.startsWith(resources.getString(R.string.MSG_CALL))) {
      this.handleCall(extraT1, isTest)
    } else if (what.startsWith(resources.getString(R.string.MSG_SMS))) {
      this.handleSMS(extraT1, extraT2, isTest)
    } else if (what.startsWith(resources.getString(R.string.MSG_SYSTEM))) {
      this.handleSystem(what, extraT2, isTest)
    } else if (what.startsWith(resources.getString(R.string.MSG_CHIME))) {
      this.handleChime(extraI1, extraI2, isTest)
    } else if (what.startsWith(resources.getString(R.string.MSG_REMINDERS))) {
      this.handleReminders(what, extraT1!!, extraI1, extraI2, isTest)
    } else if (what.startsWith(resources.getString(R.string.MSG_APPS))) {
      this.handleApps(extraT2, isTest)
    }
    log("ServiceMain.onHandleIntent unregistering local BroadcastReceiver")
    LocalBroadcastManager.getInstance((this as Context?)!!).unregisterReceiver(
      broadcastReceiver
    )
    log(this, "ServiceMain.onHandleIntent OUT")
    log("-----------------------------------------------------------------------------------------")
  }

  companion object {
    private val a: IntArray = intArrayOf(4, 3, 5, 2, 1)
  }
}
