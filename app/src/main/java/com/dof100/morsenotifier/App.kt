package com.dof100.morsenotifier

import android.app.Activity
import android.app.Application
import android.app.UiModeManager
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.preference.PreferenceManager
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.dof100.morsenotifier.MyLog.log
import com.dof100.morsenotifier.MyLog.logClear
import com.evernote.android.job.JobCreator
import com.evernote.android.job.JobManager

class App : Application() {
  override fun onCreate() {
    super.onCreate()
    logClear((this as Context))
    log("App.onCreate")
    n = false
    var var1 = true
    o = true
    a = "MorseNotifierPro".contains("Free")
    b = "MorseNotifierPro".contains("Pro")
    c = "MorseNotifierPro".contains("Morse")
    d = "MorseNotifierPro".contains("Voice")
    run label68@{
      run label72@{
        var var10001: Boolean
        run label65@{
          try {
            if ((this.getSystemService(UI_MODE_SERVICE) as UiModeManager).currentModeType == 4) {
              return@label65
            }
          } catch (var6: Exception) {
            var10001 = false
            return@label72
          }
          var1 = false
        }
        try {
          p = var1
          return@label68
        } catch (var5: Exception) {
          var10001 = false
        }
      }
      p = false
    }
    if (n) {
      log("App.onCreate debug build")
    }
    if (o) {
      log("App.onCreate release build")
    }
    if (c) {
      log("App.onCreate flavor=MorseNotifier")
    }
    if (d) {
      log("App.onCreate flavor=VoiceNotifier")
    }
    if (a) {
      log("App.onCreate flavor=free")
    }
    if (b) {
      log("App.onCreate flavor=pro")
    }
    if (p) {
      log("App.onCreate Running on TV")
    }
    e = this.getString(this.applicationInfo.labelRes)
    val var3 = this.packageName
    val var2 = this.packageManager
    try {
      f = var2.getPackageInfo(var3, 0).versionName
    } catch (var4: PackageManager.NameNotFoundException) {
      var4.printStackTrace()
    }
    g = Build.MANUFACTURER
    h = "xiaomi".equals(g, ignoreCase = true)
    i = "oppo".equals(g, ignoreCase = true)
    j = "vivo".equals(g, ignoreCase = true)
    k = "huawei".equals(g, ignoreCase = true)
    if (n) {
      log("App.onCreate brand=$g")
    }
    l = "market://details?id=${this.packageName}"
    m = l!!.replace(".free", "")
    q = null
    log("App.onCreate Initializing job manager...")
    JobManager.create((this as Context)).addJobCreator(MyChimeJobCreator() as JobCreator)
  }

  companion object {
    var a = false
    var b = false
    var c = false
    var d = false
    var e: String? = null
    var f: String? = null
    var g: String? = null
    var h = false
    var i = false
    var j = false
    var k = false
    var l: String? = null
    var m: String? = null
    private var n = false
    private var o = false
    private var p = false
    private var q: MyPlayerTTS? = null
    fun a(var0: Context?): MyPlayerTTS? {
      if (q == null) {
        q = MyPlayerTTS(var0, 0)
      }
      return q
    }

    fun a(context: Context?, var1: Int) {
      val intent = Intent()
      intent.action = "LBR_ACTION_SETPOS"
      intent.putExtra("LBR_ACTION_DATA_POS", var1)
      LocalBroadcastManager.getInstance(context!!).sendBroadcast(intent)
    }

    fun a(var0: Activity?, var1: String): Boolean {
      val var3 = PreferenceManager.getDefaultSharedPreferences(var0)
      val var2 = "question_asked_$var1"
      return var3.getBoolean(var2, false)
    }

    fun b(var0: Activity?, var1: String) {
      val var2 = PreferenceManager.getDefaultSharedPreferences(var0).edit()
      val var3 = "question_asked_$var1"
      var2.putBoolean(var3, true).apply()
    }

    fun b(var0: Context?) {
      log(var0, "App.broadcastFinish sending LBR_ACTION_FINISH")
      val var1 = Intent()
      var1.action = "LBR_ACTION_FINISH"
      LocalBroadcastManager.getInstance(var0!!).sendBroadcast(var1)
    }

    fun c(var0: Context) {
      log("App.broadcastSettingsChanged sending LBR_ACTION_SETTINGSCHANGED")
      val var1 = Intent()
      var1.action = "LBR_ACTION_SETTINGSCHANGED"
      LocalBroadcastManager.getInstance(var0.applicationContext).sendBroadcast(var1)
    }

    fun d(var0: Context) {
      log("App.broadcastSettingsChanged sending LBR_ACTION_RECENTNOTIFICATIONSCHANGED")
      val var1 = Intent()
      var1.action = "LBR_ACTION_RECENTNOTIFICATIONSCHANGED"
      LocalBroadcastManager.getInstance(var0.applicationContext).sendBroadcast(var1)
    }
  }
}
