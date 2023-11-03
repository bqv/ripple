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
  private var mCallEnable: Boolean = true
  private var mCallStream: Int = 4
  private var mCallString1: String? = ""
  private var mCallNum: Int = 0
  private var mCallContactDisplayName: Boolean = false
  private var mCallContactFirstName: Boolean = false
  private var mCallContactLastName: Boolean = false
  private var mCallContactInitials: Boolean = false
  private var mCallContactNickname: Boolean = false
  private var mCallString2: String? = ""
  private var mCallContactNameNone: String? = ""
  private var mCallNumNone: String? = ""
  private var mCallRepeat: Int = 1
  private var mSmsEnable: Boolean = true
  private var mSmsStream: Int = 3
  private var mSmsString1: String? = ""
  private var mSmsNum: Int = 0
  private var mSmsContactDisplayName: Boolean = false
  private var mSmsContactFirstName: Boolean = false
  private var mSmsContactLastName: Boolean = false
  private var mSmsContactInitials: Boolean = false
  private var mSmsContactNickname: Boolean = false
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
  private var mSmsText: Boolean = false
  private var mSmsString2: String? = ""
  private var mSmsContactNameNone: String? = ""
  private var mSmsNumNone: String? = ""
  private var mSmsRepeat: Int = 1
  private var mSystemEnable: Boolean = true
  private var mSystemStream: Int = 3
  private var mSystemPowerConnectedString: String? = ""
  private var mSystemPowerDisconnectedString: String? = ""
  private var mSystemBatteryLowString: String? = ""
  private var mSystemBatteryOkString: String? = ""
  private var mSystemWifiDisconnectedString: String? = ""
  private var mSystemWifiConnectedString: String? = ""
  private var mSystemWifiConnectedSsid: Boolean = false
  private var mChimeEnable: Boolean = false
  private var mChimeStream: Int = 3
  private val mChimeHourEnable: BooleanArray = booleanArrayOf(
    true, true, true, true, true, true, true, true, true, true, true, true,
    true, true, true, true, true, true, true, true, true, true, true, true
  )
  private var mChimeString1: String? = ""
  private var mChimeString2: String? = ""
  private var mChimeTimeHow: Int = 1
  private var mRemindersEnable: Boolean = false
  private var mRemindersStream: Int = 1
  private var mAppsEnable: Boolean = true
  private var mAppsStream: Int = 3
  private var ay: String = ""
  private var az: String = ""
  private var mMorseGeneralDnD: Boolean = true
  private var mMorseGeneralMuteInCalls: Boolean = true
  private var mMorseGeneralInitialDelay: Int = 0
  private var mStopMethod: Int = 1
  private var mVoiceGeneralDnD: Boolean = true
  private var mVoiceGeneralMuteInCalls: Boolean = true
  private var mVoiceGeneralInitialDelay: Int = 0
  private var mMorseWpm: Int = 0
  private var mMorseFarnsworthEnable: Boolean = false
  private var mMorseFarnsworthWpm: Int = 0
  private var mMorsePunctuation: Boolean = false
  private var mLocale: String? = "en_US"
  private var mVoiceSpeed: Int = 100
  private var mVoicePitch: Int = 100
  private var mVoiceVolume: Int = 100
  private var mAudioEnable: Boolean = false
  private var mAudioVibrationEnable: Boolean = false
  private var mAudioFrequency: Int = 800
  private var mAudioVolume: Int = 100
  private var mAudioRamp: Int = 10
  private var mDisplayEnable: Boolean = false
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
    if (mChimeEnable) {
      log(this, "ServiceMain.handleChime")
      val calendar: Calendar = Calendar.getInstance()
      val nowHour: Int = calendar.get(11)
      val nowMinute: Int = calendar.get(12)
      val time: Long = calendar.timeInMillis
      val hour: Int = if (reminderHour <= 0) { calendar.get(11) % 24 } else reminderHour
      if (!isTest && !mChimeHourEnable[hour]) {
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
        when (mChimeTimeHow) {
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
        if (mChimeString1!!.isNotEmpty()) {
          var11 = "$mChimeString1 $message"
        }
        message = var11
        if (mChimeString2!!.isNotEmpty()) {
          message = "$var11 ${mChimeString2}"
        }
        log(this, "ServiceMain.onHandleIntent (MSG_CHIME) hour=$hour  format=$mChimeTimeHow message:$message")
        this.play_message(message!!, a[mChimeStream], 1, isTest)
      }
    }
  }

  private fun unknown2(param1: String?) {
    // $FF: Couldn't be decompiled
  }

  private fun play_voice(message: String, var2: Int, var3: Int, var4: Int, var5: Int, var6: Int) {
    val playerTTS: MyPlayerTTS? = App.getTTS(applicationContext)
    playerTTS!!.playInit(applicationContext, mVoiceGeneralInitialDelay, var3, mLocale, var4, var5, var6, var2, message)
    playerTTS.play(applicationContext)
    playerTTS.playDone(applicationContext)
  }

  private fun play_message(message: String, stream: Int, arepeat2: Int, var4: Int, frequency: Int, var6: Int,
                           enableSound: Boolean, enableVibrate: Boolean, var9: Boolean, var10: Boolean
  ) {
    val playerMorse = MyPlayerMorse(applicationContext, instance)
    val context: Context = applicationContext
    val playPunctuation: Boolean = mMorsePunctuation
    val arepeat1: Int = mMorseGeneralInitialDelay
    playerMorse.playInit(context, enableSound, enableVibrate, playPunctuation, arepeat1, arepeat2,
      var4, if (mMorseFarnsworthEnable) mMorseFarnsworthWpm else var4,
      stream, frequency, var6, mAudioRamp, message)
    if (var9) {
      when (mDisplayHow) {
        1, 2, 3 -> {
          val intent = Intent(this, ActivityDisplayMessage::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            addFlags(Intent.FLAG_ACTIVITY_MULTIPLE_TASK)
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
            putExtra("PARAM_DISPLAY_INITIALDELAY", mMorseGeneralInitialDelay)
            putExtra("PARAM_ENABLEDIALOGSETTINGS", var10 xor true)
            putExtra("PARAM_STOPMETHOD", mStopMethod)
          }
          try {
            this.startActivity(intent)
          } catch (var16: Exception) {
            log(
              this,
              "ServiceMain.play_message ERROR startActivity (ActivityDisplayMessage)"
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
    val speed: Int = Utils.getTagValue(messageLowercased, "s", if (App.morseMode) mMorseWpm else mVoiceSpeed, 1, 200)
    val volume: Int = Utils.getTagValue(messageLowercased, "v", if (App.morseMode) mAudioVolume else mVoiceVolume, 0, 100)
    val frequency: Int = Utils.getTagValue(messageLowercased, "f", mAudioFrequency, 10, 25000)
    val repeat: Int = Utils.getTagValue(messageLowercased, "r", state, 1, 10)
    val pitch: Int = Utils.getTagValue(messageLowercased, "p", mVoicePitch, 30, 300)
    val enableAudio: Boolean = Utils.getTagValue(messageLowercased, "a", mAudioEnable)
    val enableVibration: Boolean = Utils.getTagValue(messageLowercased, "b", mAudioVibrationEnable)
    val enableDisplay: Boolean = Utils.getTagValue(messageLowercased, "d", mDisplayEnable)
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
      toast(this, "${this.getString(R.string.text_announcing)} $message")
    }
    if (enableAudio || enableVibration || enableDisplay) {
      val telephonyManager = this.getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager?
      val var16: Boolean = telephonyManager != null && telephonyManager.callState == 2
      if (App.morseMode && mMorseGeneralMuteInCalls && !isTest && var16) {
        log(this, "ServiceMain.play_message: muted (in call)")
        toast(this, "Morse Notifier: $message")
      } else if (App.voiceMode && mVoiceGeneralMuteInCalls && !isTest && var16) {
        log(this, "ServiceMain.play_message: muted (in call)")
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
        if (App.morseMode && mMorseGeneralDnD && !isTest && flagDnD) {
          log(this, "ServiceMain.play_message: muted (do not disturb) state=$state")
        } else if (App.voiceMode && mVoiceGeneralDnD && !isTest && flagDnD) {
          log(this, "ServiceMain.play_message: muted (do not disturb) state=$state")
        } else {
          if (App.morseMode) {
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
    if (mRemindersEnable) {
      log(this, "ServiceMain.handleReminders")
      val var6: Calendar = Calendar.getInstance()
      val nowHour: Int = var6.get(11)
      val nowMinute: Int = var6.get(12)
      if ((var1 == resources.getString(R.string.MSG_REMINDERS_ONE_TEST))) {
        log(this, "ServiceMain.onHandleIntent (MSG_REMINDERS_TESTONE)")
        this.play_message(message, a[mRemindersStream], 1, isTest)
      } else if ((var1 == resources.getString(R.string.MSG_REMINDERS_ALL_TEST))) {
        log(this, "ServiceMain.onHandleIntent (MSG_REMINDERS_TESTALL)")
        val reminder: MyReminder? = (MyReminders(this)).a()
        if (reminder != null) {
          var1 = reminder.a()
          reminderHour = a[mRemindersStream]
        } else {
          var1 = resources.getString(R.string.text_confirm)
          reminderHour = a[mRemindersStream]
        }
        this.play_message(var1, reminderHour, 1, isTest)
      } else {
        log(this, "ServiceMain.onHandleIntent (MSG_REMINDERS_FIRE)")
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
          this.play_message(message, a[mRemindersStream], 1, isTest)
        }
      }
    }
  }

  private fun handleSMS(var1: String?, var2: String?, isTest: Boolean) {
    var var1: String? = var1
    var var2: String? = var2
    if (mSmsEnable) {
      log(this, "ServiceMain.handleSMS")
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
        val var5: String? = mSmsString1
        val var6 = ""
        if (!mSmsContactDisplayName && !mSmsContactFirstName && !mSmsContactLastName && !mSmsContactInitials) {
          var7 = var5
          if (!mSmsContactNickname) {
            return@label124
          }
        }
        var8 = var6
        if (mSmsContactDisplayName) {
          var8 = var6
          if (az.isNotEmpty()) {
            var8 = "${"".trim { it <= ' ' }} $az"
          }
        }
        var7 = var8
        if (mSmsContactFirstName) {
          var7 = var8
          if (aA.isNotEmpty()) {
            var7 = "${var8!!.trim { it <= ' ' }} $aA"
          }
        }
        var8 = var7
        if (mSmsContactLastName) {
          var8 = var7
          if (aB.isNotEmpty()) {
            var8 = "${var7!!.trim { it <= ' ' }} $aB"
          }
        }
        var7 = var8
        if (mSmsContactInitials) {
          var7 = var8
          if (aC.isNotEmpty()) {
            var7 = "${var8!!.trim { it <= ' ' }} $aC"
          }
        }
        var8 = var7
        if (mSmsContactNickname) {
          var8 = var7
          if (aD.isNotEmpty()) {
            var8 = "${var7!!.trim { it <= ' ' }} $aD"
          }
        }
        var8 = var8!!.trim { it <= ' ' }
        if (var4) {
          var7 = "${var5!!.trim { it <= ' ' }} $var8"
        } else {
          var7 = "${var5!!.trim { it <= ' ' }} $mSmsContactNameNone"
        }
      }
      run label109@{
        run label108@{
          run label107@{
            when (mSmsNum) {
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
          var1 = mSmsNumNone
          var11 = var12
        }
        var11.append(var1)
        var8 = var11.toString()
      }
      var1 = var8
      if (mSmsText) {
        var1 = var8
        if (var2!!.isNotEmpty()) {
          var1 = "${var8!!.trim { it <= ' ' }} $var2"
        }
      }
      var2 = var1
      if (mSmsString2!!.isNotEmpty()) {
        var2 = "${var1!!.trim { it <= ' ' }} $mSmsString2"
      }
      var2 = var2!!.trim { it <= ' ' }
      var1 = var2
      if (var2.isEmpty()) {
        var1 = "sms"
      }
      this.play_message(var1!!, a[mSmsStream], mSmsRepeat, isTest)
    }
  }

  private fun handleCall(var1: String?, isTest: Boolean) {
    var curText: String? = var1
    if (mCallEnable) {
      log(this, "ServiceMain.handleCall")
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
        val var4: String? = mCallString1
        var5 = ""
        if (!mCallContactDisplayName && !mCallContactFirstName && !mCallContactLastName && !mCallContactInitials) {
          var6 = (var4)!!
          if (!mCallContactNickname) {
            return@label118
          }
        }
        var6 = var5!!
        if (mCallContactDisplayName) {
          var6 = var5!!
          if (az.isNotEmpty()) {
            var6 = "${"".trim { it <= ' ' }} $az"
          }
        }
        var5 = var6
        if (mCallContactFirstName) {
          var5 = var6
          if (aA.isNotEmpty()) {
            var5 = "${var6.trim { it <= ' ' }} $aA"
          }
        }
        var6 = var5!!
        if (mCallContactLastName) {
          var6 = var5!!
          if (aB.isNotEmpty()) {
            var6 = "${var5!!.trim { it <= ' ' }} $aB"
          }
        }
        var5 = var6
        if (mCallContactInitials) {
          var5 = var6
          if (aC.isNotEmpty()) {
            var5 = "${var6.trim { it <= ' ' }} $aC"
          }
        }
        var6 = var5!!
        if (mCallContactNickname) {
          var6 = var5!!
          if (aD.isNotEmpty()) {
            var6 = "${var5!!.trim { it <= ' ' }} $aD"
          }
        }
        var5 = var6.trim { it <= ' ' }
        if (var3) {
          var6 = "${var4!!.trim { it <= ' ' }} $var5"
        } else {
          var6 = "${var4!!.trim { it <= ' ' }} $mCallContactNameNone"
        }
      }
      run label103@{
        run label102@{
          run label101@{
            when (mCallNum) {
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
          curText = mCallNumNone
          var9 = var8
        }
        var9.append(curText)
        var5 = var9.toString()
      }
      curText = var5
      if (mCallString2!!.isNotEmpty()) {
        curText = "${var5!!.trim { it <= ' ' }} $mCallString2"
      }
      var6 = curText!!.trim { it <= ' ' }
      curText = var6
      if (var6.isEmpty()) {
        curText = "Call"
      }
      log(this, "ServiceMain.onHandleIntent (MSG_CALL_RINGING) curText = $curText")
      this.play_message(curText!!, a[mCallStream], mCallRepeat, isTest)
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
    if (mSystemEnable) {
      log(this, "ServiceMain.handleSystem")
      val var4: String = ""
      if ((var1 == resources.getString(R.string.MSG_SYSTEM_BOOT))) {
        this.alarm_init()
        var2 = var4
      } else if ((var1 == resources.getString(R.string.MSG_SYSTEM_TEST))) {
        var2 = resources.getString(R.string.test_message)
      } else if ((var1 == resources.getString(R.string.MSG_SYSTEM_POWER_CONNECTED))) {
        var2 = mSystemPowerConnectedString
      } else if ((var1 == resources.getString(R.string.MSG_SYSTEM_POWER_DISCONNECTED))) {
        var2 = mSystemPowerDisconnectedString
      } else if ((var1 == resources.getString(R.string.MSG_SYSTEM_BATTERY_LOW))) {
        var2 = mSystemBatteryLowString
      } else if ((var1 == resources.getString(R.string.MSG_SYSTEM_BATTERY_OK))) {
        var2 = mSystemBatteryOkString
      } else if ((var1 == resources.getString(R.string.MSG_SYSTEM_WF_CONNECTED))) {
        var1 = if (mSystemWifiConnectedSsid) { " $var2" } else { "" }
        var2 = "$mSystemWifiConnectedString$var1"
      } else {
        var2 = var4
        if ((var1 == resources.getString(R.string.MSG_SYSTEM_WF_DISCONNECTED))) {
          var2 = mSystemWifiDisconnectedString
        }
      }
      if (var2!!.isNotEmpty()) {
        this.play_message(var2, a[mSystemStream], 1, isTest)
      }
    }
  }

  private fun handleApps(var1: String?, isTest: Boolean) {
    var var1: String? = var1
    if (mAppsEnable) {
      log(this, "ServiceMain.handleApps")
      if (isTest) {
        var1 = this.getString(R.string.text_confirm)
      }
      if (var1!!.isNotEmpty()) {
        this.play_message(var1, a[mAppsStream], 1, false)
      }
    }
  }

  private fun pref_init() {
    log(this, "ServiceMain.pref_init")
    val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
    mMorseGeneralDnD = Utils.prefGetBoolean(this, sharedPreferences, "pref_morse_general_dnd", null as String?, if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mMorseGeneralMuteInCalls = Utils.prefGetBoolean(this, sharedPreferences, "pref_morse_general_muteincalls", null as String?, if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mMorseGeneralInitialDelay = Utils.prefGetInt(this, sharedPreferences, "pref_morse_general_initialdelay", null as String?, if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mStopMethod = Utils.prefGetInt(this, sharedPreferences, "pref_morse_general_volumedownstop", null as String?, if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mVoiceGeneralDnD = Utils.prefGetBoolean(this, sharedPreferences, "pref_voice_general_dnd", null as String?, if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mVoiceGeneralMuteInCalls = Utils.prefGetBoolean(this, sharedPreferences, "pref_voice_general_muteincalls", null as String?, if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mVoiceGeneralInitialDelay = Utils.prefGetInt(this, sharedPreferences, "pref_voice_general_initialdelay", null as String?, if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mMorseWpm = Utils.prefGetInt(this, sharedPreferences, "pref_morse_wpm", null as String?, if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mMorseFarnsworthEnable = Utils.prefGetBoolean(this, sharedPreferences, "pref_morse_farnsworth_enable", null as String?, if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mMorseFarnsworthWpm = Utils.prefGetInt(this, sharedPreferences, "pref_morse_farnsworth_wpm", null as String?, if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mMorsePunctuation = Utils.prefGetBoolean(this, sharedPreferences, "pref_morse_punctuation", null as String?, if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mLocale = Utils.prefGetString(this, sharedPreferences, "pref_voice_locale", "pref_general_locale", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mVoiceSpeed = Utils.prefGetInt(this, sharedPreferences, "pref_voice_speed", "pref_general_speechrate", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mVoicePitch = Utils.prefGetInt(this, sharedPreferences, "pref_voice_pitch", "pref_general_pitch", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mVoiceVolume = Utils.prefGetInt(this, sharedPreferences, "pref_voice_vol", "pref_general_volume", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mAudioEnable = Utils.prefGetBoolean(this, sharedPreferences, "pref_audio_enable", null as String?, if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mAudioVibrationEnable = Utils.prefGetBoolean(this, sharedPreferences, "pref_audio_vibration_enable", null as String?, if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mAudioFrequency = Utils.prefGetInt(this, sharedPreferences, "pref_audio_freq", null as String?, if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mAudioVolume = Utils.prefGetInt(this, sharedPreferences, "pref_audio_vol", null as String?, if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mAudioRamp = Utils.prefGetInt(this, sharedPreferences, "pref_audio_ramp", null as String?, if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mDisplayEnable = Utils.prefGetBoolean(this, sharedPreferences, "pref_display_enable", null as String?, if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mDisplayHow = Utils.prefGetInt(this, sharedPreferences, "pref_display_how", null as String?, if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mDisplayPos = Utils.prefGetInt(this, sharedPreferences, "pref_display_pos", null as String?, if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mStayOnTop = Utils.prefGetBoolean(this, sharedPreferences, "pref_display_stayontop", null as String?, if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mDisplayText = Utils.prefGetBoolean(this, sharedPreferences, "pref_display_text", null as String?, if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mDisplayFlash = Utils.prefGetBoolean(this, sharedPreferences, "pref_display_flash", null as String?, if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mDisplayColor = Utils.prefGetColor(this, sharedPreferences, "pref_display_color", null as String?, if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mDisplayColorMeHilight = Utils.prefGetColor(this, sharedPreferences, "pref_display_color_me_highlight", null as String?, if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mDisplayColorTextHilight = Utils.prefGetColor(this, sharedPreferences, "pref_display_color_text_highlight", null as String?, if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mCallEnable = Utils.prefGetBoolean(this, sharedPreferences, "pref_call_enable", null as String?, if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mCallStream = Utils.prefGetInt(this, sharedPreferences, "pref_call_stream", "pref_call_e1pro_stream", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mCallString1 = Utils.prefGetString(this, sharedPreferences, "pref_call_string1", "pref_call_e1pro_string1", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mCallNum = Utils.prefGetInt(this, sharedPreferences, "pref_call_num", "pref_call_e1pro_num", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mCallContactDisplayName = Utils.prefGetBoolean(this, sharedPreferences, "pref_call_contactdisplayname", "pref_call_e1pro_contactdisplayname", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mCallContactFirstName = Utils.prefGetBoolean(this, sharedPreferences, "pref_call_contactfirstname", "pref_call_e1pro_contactfirstname", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mCallContactLastName = Utils.prefGetBoolean(this, sharedPreferences, "pref_call_contactlastname", "pref_call_e1pro_contactlastname", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mCallContactInitials = Utils.prefGetBoolean(this, sharedPreferences, "pref_call_contactinitials", "pref_call_e1pro_contactinitials", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mCallContactNickname = Utils.prefGetBoolean(this, sharedPreferences, "pref_call_contactnickname", "pref_call_e1pro_contactnickname", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mCallString2 = Utils.prefGetString(this, sharedPreferences, "pref_call_string2", "pref_call_e1pro_string2", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mCallContactNameNone = Utils.prefGetString(this, sharedPreferences, "pref_call_contactname_none", "pref_call_e1pro_contactname_none", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mCallNumNone = Utils.prefGetString(this, sharedPreferences, "pref_call_num_none", "pref_call_e1pro_num_none", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mCallRepeat = Utils.prefGetInt(this, sharedPreferences, "pref_call_repeat", "pref_call_e1pro_repeat", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mSmsEnable = Utils.prefGetBoolean(this, sharedPreferences, "pref_sms_enable", null as String?, if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mSmsStream = Utils.prefGetInt(this, sharedPreferences, "pref_sms_stream", "pref_sms_e1pro_stream", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mSmsString1 = Utils.prefGetString(this, sharedPreferences, "pref_sms_string1", "pref_sms_e1pro_string1", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mSmsNum = Utils.prefGetInt(this, sharedPreferences, "pref_sms_num", "pref_sms_e1pro_num", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mSmsContactDisplayName = Utils.prefGetBoolean(this, sharedPreferences, "pref_sms_contactdisplayname", "pref_sms_e1pro_contactdisplayname", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mSmsContactFirstName = Utils.prefGetBoolean(this, sharedPreferences, "pref_sms_contactfirstname", "pref_sms_e1pro_contactfirstname", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mSmsContactLastName = Utils.prefGetBoolean(this, sharedPreferences, "pref_sms_contactlastname", "pref_sms_e1pro_contactlastname", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mSmsContactInitials = Utils.prefGetBoolean(this, sharedPreferences, "pref_sms_contactinitials", "pref_sms_e1pro_contactinitials", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mSmsContactNickname = Utils.prefGetBoolean(this, sharedPreferences, "pref_sms_contactnickname", "pref_sms_e1pro_contactnickname", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mSmsText = Utils.prefGetBoolean(this, sharedPreferences, "pref_sms_text", "pref_sms_e1pro_text", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mSmsString2 = Utils.prefGetString(this, sharedPreferences, "pref_sms_string2", "pref_sms_e1pro_string2", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mSmsContactNameNone = Utils.prefGetString(this, sharedPreferences, "pref_sms_contactname_none", "pref_sms_e1pro_contactname_none", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mSmsNumNone = Utils.prefGetString(this, sharedPreferences, "pref_sms_num_none", "pref_sms_e1pro_num_none", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mSmsRepeat = Utils.prefGetInt(this, sharedPreferences, "pref_sms_repeat", "pref_sms_e1pro_repeat", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mSystemEnable = Utils.prefGetBoolean(this, sharedPreferences, "pref_system_enable", null as String?, if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mSystemStream = Utils.prefGetInt(this, sharedPreferences, "pref_system_stream", "pref_system_e1pro_stream", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mSystemPowerConnectedString = Utils.prefGetString(this, sharedPreferences, "pref_system_powerconectedstring", "pref_system_e1pro_powerconectedstring", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mSystemPowerDisconnectedString = Utils.prefGetString(this, sharedPreferences, "pref_system_powerdisconectedstring", "pref_system_e1pro_powerdisconectedstring", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mSystemBatteryLowString = Utils.prefGetString(this, sharedPreferences, "pref_system_batterylowstring", "pref_system_e1pro_batterylowstring", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mSystemBatteryOkString = Utils.prefGetString(this, sharedPreferences, "pref_system_batteryokstring", "pref_system_e1pro_batteryokstring", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mSystemWifiDisconnectedString = Utils.prefGetString(this, sharedPreferences, "pref_system_wifi_disconnectedstring", "pref_system_e1pro_wifi_disconnectedstring", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mSystemWifiConnectedString = Utils.prefGetString(this, sharedPreferences, "pref_system_wifi_connectedstring", "pref_system_e1pro_wifi_connectedstring", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mSystemWifiConnectedSsid = Utils.prefGetBoolean(this, sharedPreferences, "pref_system_wifi_connectedssid", "pref_system_e1pro_wifi_connectedssid", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mAppsEnable = Utils.prefGetBoolean(this, sharedPreferences, "pref_apps_enable", null as String?, if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mAppsStream = Utils.prefGetInt(this, sharedPreferences, "pref_apps_stream", null as String?, if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mChimeEnable = Utils.prefGetBoolean(this, sharedPreferences, "pref_chime_enable", null as String?, if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    for (hour in 0..23) {
      mChimeHourEnable[hour] = Utils.prefGetBoolean(this, sharedPreferences,
        String.format(Locale.US, "pref_chime_hourenable_%02d", hour), null,
        if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    }
    mChimeStream = Utils.prefGetInt(this, sharedPreferences, "pref_chime_stream", "pref_chime_e1pro_stream", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mChimeString1 = Utils.prefGetString(this, sharedPreferences, "pref_chime_string1", "pref_chime_e1pro_string1", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mChimeString2 = Utils.prefGetString(this, sharedPreferences, "pref_chime_string2", "pref_chime_e1pro_string2", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mChimeTimeHow = Utils.prefGetInt(this, sharedPreferences, "pref_chime_timehow", "pref_chime_e1pro_timehow", if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mRemindersEnable = Utils.prefGetBoolean(this, sharedPreferences, "pref_reminders_enable", null as String?, if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
    mRemindersStream = Utils.prefGetInt(this, sharedPreferences, "pref_reminders_stream", null as String?, if (App.morseMode) { "_morsedef" } else { "_voicedef" }, "_def")
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
