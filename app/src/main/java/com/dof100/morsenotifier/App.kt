package com.dof100.morsenotifier

import android.app.Activity
import android.app.Application
import android.app.UiModeManager
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.content.res.Configuration.UI_MODE_TYPE_TELEVISION
import android.os.Build
import android.preference.PreferenceManager
import androidx.core.content.edit
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.dof100.morsenotifier.MyLog.log
import com.dof100.morsenotifier.MyLog.logClear
import com.evernote.android.job.JobManager

class App : Application() {
  override fun onCreate() {
    super.onCreate()
    logClear(this as Context)
    log("App.onCreate")
    debugBuild = false
    releaseBuild = true
    freeBuild = "MorseNotifierPro".contains("Free")
    proBuild = "MorseNotifierPro".contains("Pro")
    morseMode = "MorseNotifierPro".contains("Morse")
    voiceMode = "MorseNotifierPro".contains("Voice")
    tvMode = try {
      (this.getSystemService(UI_MODE_SERVICE) as UiModeManager).currentModeType == UI_MODE_TYPE_TELEVISION
    } catch (e: Exception) {
      false
    }
    if (debugBuild) { log("App.onCreate debug build") }
    if (releaseBuild) { log("App.onCreate release build") }
    if (morseMode) { log("App.onCreate flavor=MorseNotifier") }
    if (voiceMode) { log("App.onCreate flavor=VoiceNotifier") }
    if (freeBuild) { log("App.onCreate flavor=free") }
    if (proBuild) { log("App.onCreate flavor=pro") }
    if (tvMode) { log("App.onCreate Running on TV") }
    labelRes = this.getString(this.applicationInfo.labelRes)
    val packageName = this.packageName
    val packageManager = this.packageManager
    try {
      versionName = packageManager.getPackageInfo(packageName, 0).versionName
    } catch (e: PackageManager.NameNotFoundException) {
      e.printStackTrace()
    }
    brand = Build.MANUFACTURER
    isXiaomi = "xiaomi".equals(brand, ignoreCase = true)
    isOppo = "oppo".equals(brand, ignoreCase = true)
    isVivo = "vivo".equals(brand, ignoreCase = true)
    isHuawei = "huawei".equals(brand, ignoreCase = true)
    if (debugBuild) { log("App.onCreate brand=$brand") }
    marketUrlFree = "market://details?id=${this.packageName}"
    marketUrlPro = marketUrlFree!!.replace(".free", "")
    playerTTS = null
    log("App.onCreate Initializing job manager...")
    JobManager.create((this as Context)).addJobCreator(MyChimeJobCreator())
  }

  companion object {
    var freeBuild = false
    var proBuild = false
    var morseMode = false
    var voiceMode = false
    var labelRes: String? = null
    var versionName: String? = null
    var brand: String? = null
    var isXiaomi = false
    var isOppo = false
    var isVivo = false
    var isHuawei = false
    var marketUrlFree: String? = null
    var marketUrlPro: String? = null
    private var debugBuild = false
    private var releaseBuild = false
    private var tvMode = false
    private var playerTTS: MyPlayerTTS? = null

    fun getTTS(context: Context?): MyPlayerTTS? {
      if (playerTTS == null) {
        playerTTS = MyPlayerTTS(context, 0)
      }
      return playerTTS
    }

    fun broadcastSetPos(context: Context?, pos: Int) {
      LocalBroadcastManager.getInstance(context!!).sendBroadcast(Intent().apply {
        action = "LBR_ACTION_SETPOS"
        putExtra("LBR_ACTION_DATA_POS", pos)
      })
    }

    fun getQuestionAsked(context: Activity?, question: String): Boolean {
      return PreferenceManager.getDefaultSharedPreferences(context).run {
        getBoolean("question_asked_$question", false)
      }
    }

    fun setQuestionAsked(context: Activity?, question: String) {
      PreferenceManager.getDefaultSharedPreferences(context).edit {
        putBoolean("question_asked_$question", true)
      }
    }

    fun broadcastFinish(context: Context?) {
      log(context, "App.broadcastFinish sending LBR_ACTION_FINISH")
      LocalBroadcastManager.getInstance(context!!).sendBroadcast(Intent().apply { action = "LBR_ACTION_FINISH" })
    }

    fun broadcastSettingsChanged(var0: Context) {
      log("App.broadcastSettingsChanged sending LBR_ACTION_SETTINGSCHANGED")
      LocalBroadcastManager.getInstance(var0.applicationContext).sendBroadcast(Intent().apply { action = "LBR_ACTION_SETTINGSCHANGED" })
    }

    fun broadcastRecentNotificationsChanged(var0: Context) {
      log("App.broadcastSettingsChanged sending LBR_ACTION_RECENTNOTIFICATIONSCHANGED")
      LocalBroadcastManager.getInstance(var0.applicationContext).sendBroadcast(Intent().apply { action = "LBR_ACTION_RECENTNOTIFICATIONSCHANGED" })
    }
  }
}
