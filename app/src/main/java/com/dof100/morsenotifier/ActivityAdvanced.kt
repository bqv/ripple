package com.dof100.morsenotifier

import android.app.Activity
import android.app.ActivityManager
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Build.VERSION
import android.os.Bundle
import android.os.Handler
import android.os.Process
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat
import com.dof100.morsenotifier.MyLog.log
import com.dof100.morsenotifier.MyLog.logClear
import com.dof100.morsenotifier.MyLog.logShow
import com.dof100.morsenotifier.MyLog.setEnabled
import com.dof100.morsenotifier.MyLog.toast
import java.util.Locale

class ActivityAdvanced constructor() : Activity(), View.OnClickListener {
  private var a: EditText? = null
  private var b: TextView? = null
  private var c: TextView? = null
  private var d: TextView? = null
  private var e: TextView? = null
  private var f: TextView? = null
  private var g: LinearLayout? = null
  private var h: TextView? = null
  private var i: LinearLayout? = null
  private var j: TextView? = null
  private var k: LinearLayout? = null
  private var l: TextView? = null
  private val m: Handler = Handler()
  private val n: Runnable = object : Runnable {
    public override fun run() {
      this@ActivityAdvanced.a()
      m.postDelayed(this, 3000L)
    }
  }

  private fun a() {
    if (ContextCompat.checkSelfPermission(this, "android.permission.READ_PHONE_STATE") == 0) {
      b!!.setText(R.string.string_advanced_permissions_readsms_granted)
      b!!.setTextColor(Color.GREEN)
    } else {
      b!!.setText(R.string.string_advanced_permissions_readsms_denied)
      b!!.setTextColor(Color.RED)
    }
    if (VERSION.SDK_INT < 28) {
      c!!.setVisibility(8)
    } else {
      c!!.setVisibility(0)
      if (ContextCompat.checkSelfPermission(this, "android.permission.READ_CALL_LOG") == 0) {
        c!!.setText(R.string.string_advanced_permissions_readcontacts_granted)
        c!!.setTextColor(Color.GREEN)
      } else {
        c!!.setText(R.string.string_advanced_permissions_readcontacts_denied)
        c!!.setTextColor(Color.RED)
      }
    }
    if (ContextCompat.checkSelfPermission(this, "android.permission.READ_SMS") == 0) {
      d!!.setText(R.string.string_advanced_permissions_text)
      d!!.setTextColor(Color.GREEN)
    } else {
      d!!.setText(R.string.string_advanced_permissions_settings)
      d!!.setTextColor(Color.RED)
    }
    if (ContextCompat.checkSelfPermission(this, "android.permission.READ_CONTACTS") == 0) {
      e!!.setText(R.string.string_advanced_permissions_readphonestate_granted)
      e!!.setTextColor(Color.GREEN)
    } else {
      e!!.setText(R.string.string_advanced_permissions_readphonestate_denied)
      e!!.setTextColor(Color.RED)
    }
    if (App.Companion.b) {
      if (a(this as Activity)) {
        f!!.setText(R.string.string_advanced_notificationlistener_running)
        f!!.setTextColor(Color.GREEN)
      } else {
        f!!.setTextColor(Color.RED)
        val var1: TextView?
        val var2: Int
        if (d(this)) {
          var1 = f
          var2 = R.string.string_advanced_notificationlistener_notrunning
        } else {
          var1 = f
          var2 = R.string.string_advanced_notificationlistener_notenabled
        }
        var1!!.setText(var2)
      }
    } else {
      f!!.setText(R.string.string_advanced_notificationlistener_disabled)
      f!!.setEnabled(false)
      f!!.setTextColor(Color.GRAY)
    }
    if (!App.Companion.h && !App.Companion.i && !App.Companion.j) {
      g!!.setVisibility(View.GONE)
    } else {
      g!!.setVisibility(View.VISIBLE)
      h!!.setText(
        getResources().getText(R.string.string_advanced_autostart_text).toString()
          .replace("\$BRAND$", (App.Companion.g)!!)
          .replace("\$APPNAME$", (App.Companion.e)!!)
      )
    }
    if (!App.Companion.h && !App.Companion.i) {
      i!!.setVisibility(View.GONE)
    } else {
      i!!.setVisibility(View.VISIBLE)
      j!!.setText(
        getResources().getText(R.string.string_advanced_protectedapps).toString()
          .replace("\$BRAND$", (App.Companion.g)!!)
          .replace("\$APPNAME$", (App.Companion.e)!!)
      )
    }
    if (App.Companion.k) {
      k!!.setVisibility(View.VISIBLE)
      l!!.setText(
        getResources().getText(R.string.string_advanced_service_command).toString()
          .replace("\$BRAND$", (App.Companion.g)!!)
          .replace("\$APPNAME$", (App.Companion.e)!!)
      )
    } else {
      k!!.setVisibility(View.GONE)
    }
  }

  private fun b() {
    var var1: String
    var var2: StringBuilder
    var var4: Boolean
    run label88@{
      var1 = a!!.getText().toString().lowercase(Locale.getDefault()).trim({ it <= ' ' })
      var2 = StringBuilder()
      var2.append("ActivityMain.onActionOK command=")
      var2.append(var1)
      log(var2.toString())
      val var3: Boolean = var1.startsWith("recent notifications on")
      var4 = true
      var var5: String?
      if (var3) {
        (MyRecentAppNotifications(this)).setEnable(this, true)
        App.Companion.d(this)
        var5 = "Recent notifications enabled."
      } else if (var1.startsWith("recent notifications off")) {
        (MyRecentAppNotifications(this)).setEnable(this, false)
        App.Companion.d(this)
        var5 = "Recent notifications disabled."
      } else if (var1.startsWith("recent notifications clear")) {
        (MyRecentAppNotifications(this)).clear(this)
        App.Companion.d(this)
        var5 = "Recent notifications cleared."
      } else {
        run label93@{
          if (var1.contains("log")) {
            log("ActivityMain.onActionOK command contains log")
            if (var1.contains("cl") || var1.contains("del") || var1.contains("cl") || var1.contains(
                "del"
              )
            ) {
              logClear((this as Context?)!!)
              var5 = "Log file cleared."
              return@label93
            }
            if (var1.contains("sh") || var1.contains("display") || var1.contains("view")) {
              logShow((this as Activity?)!!)
              return@label88
            }
            if (var1.contains("on") || var1.contains("en")) {
              setEnabled(this, (true as Boolean?)!!)
              log("Log file enabled")
              logClear((this as Context?)!!)
              var5 = "Log file enabled"
              return@label93
            }
            if (var1.contains("off") || var1.contains("dis")) {
              log("Log file disabled")
              setEnabled(this, (false as Boolean?)!!)
              var5 = "Log file disabled"
              return@label93
            }
          } else if (var1.startsWith("play ")) {
            val var6: Intent = Intent(this, ServiceMain::class.java)
            var6.putExtra(
              getResources().getString(R.string.MSG_WHAT),
              getResources().getString(R.string.MSG_APPS_NOTIFY)
            )
            var6.putExtra(
              getResources().getString(R.string.MSG_EXTRATEXT2),
              var1.substring(5)
            )
            startService(var6)
            return@label88
          }
          var4 = false
          return@label88
        }
      }
      toast(this, (var5)!!)
    }
    if (!var4) {
      var2 = StringBuilder()
      var2.append("Unknown service command: ")
      var2.append(var1)
      toast(this, var2.toString())
    }
  }

  public override fun onClick(var1: View) {
    if (var1 != null) {
      when (var1.getId()) {
        R.id.button_advanced_autostart_settings -> {
          a(this as Context)
          return
        }

        R.id.button_advanced_powersave_settings -> {
          b(this as Context)
          return
        }

        R.id.button_advanced_protectedapps_settings -> {
          c(this)
          return
        }

        R.id.button_instructions, R.id.button_rate, R.id.button_service_command -> return
        R.id.button_ok -> {
          this.b()
          return
        }

        R.id.button_service_notificationlistener_settings -> {
          f(this)
          return
        }

        R.id.button_service_permissions_settings -> e(this)
        else -> return
      }
    }
  }

  override fun onCreate(var1: Bundle?) {
    super.onCreate(var1)
    log("ActivityService.oncreate")
    this.setContentView(R.layout.activity_advanced)
    a = findViewById<View>(R.id.editText_command) as EditText?
    b = findViewById<View>(R.id.tv_service_permissions_readsms) as TextView?
    c = findViewById<View>(R.id.tv_service_permissions_readcontacts) as TextView?
    d = findViewById<View>(R.id.tv_service_permissions_readcalllog) as TextView?
    e = findViewById<View>(R.id.tv_service_permissions_readphonestate) as TextView?
    g = findViewById<View>(R.id.ll_advanced_autostart) as LinearLayout?
    h = findViewById<View>(R.id.tv_advanced_autostart_text) as TextView?
    i = findViewById<View>(R.id.ll_advanced_powersave) as LinearLayout?
    j = findViewById<View>(R.id.tv_advanced_powersave_text) as TextView?
    k = findViewById<View>(R.id.ll_advanced_protectedapps) as LinearLayout?
    l = findViewById<View>(R.id.tv_advanced_protectedapps_text) as TextView?
    val var2: TextView =
      findViewById<View>(R.id.tv_service_notificationlistener_title) as TextView
    val var3: TextView =
      findViewById<View>(R.id.tv_service_notificationlistener_text) as TextView
    val var4: Button =
      findViewById<View>(R.id.button_service_notificationlistener_settings) as Button
    f = findViewById<View>(R.id.tv_service_notificationlistener_status) as TextView?
    val var5: TextView =
      findViewById<View>(R.id.tv_service_notificationlistener_notepro) as TextView
    val var6: TextView =
      findViewById<View>(R.id.tv_service_notificationlistener_notereboot) as TextView
    val var11: TextView =
      findViewById<View>(R.id.tv_service_notificationlistener_note18) as TextView
    (findViewById<View>(R.id.button_ok) as Button).setOnClickListener(this)
    (findViewById<View>(R.id.button_service_permissions_settings) as Button).setOnClickListener(
      this
    )
    var4.setOnClickListener(this)
    (findViewById<View>(R.id.button_advanced_autostart_settings) as Button).setOnClickListener(
      this
    )
    (findViewById<View>(R.id.button_advanced_powersave_settings) as Button).setOnClickListener(
      this
    )
    (findViewById<View>(R.id.button_advanced_protectedapps_settings) as Button).setOnClickListener(
      this
    )
    val var7: Boolean
    if (VERSION.SDK_INT >= 18 && App.Companion.b) {
      var7 = true
    } else {
      var7 = false
    }
    var2.setEnabled(var7)
    var3.setEnabled(var7)
    var4.setEnabled(var7)
    f!!.setEnabled(var7)
    var5.setEnabled(var7)
    var6.setEnabled(var7)
    var11.setEnabled(var7)
    val var8: Boolean = App.Companion.a
    val var9: Byte = 8
    var var10: Byte
    if (var8) {
      var10 = 0
    } else {
      var10 = 8
    }
    var5.setVisibility(var10.toInt())
    if (VERSION.SDK_INT < 18) {
      var10 = 0
    } else {
      var10 = 8
    }
    var11.setVisibility(var10.toInt())
    var10 = var9
    if (var7) {
      var10 = 0
    }
    var6.setVisibility(var10.toInt())
    this.a()
    m.postDelayed(n, 3000L)
  }

  override fun onDestroy() {
    m.removeCallbacks(n)
    super.onDestroy()
  }

  companion object {
    fun a(var0: Context) {
      if (App.Companion.h || App.Companion.i || App.Companion.j) {
        var var1: Intent
        var var10001: Boolean
        run label86@{
          var var2: ComponentName?
          run label91@{
            try {
              var1 = Intent()
              if (App.Companion.h) {
                var2 = ComponentName(
                  "com.miui.securitycenter",
                  "com.miui.permcenter.autostart.AutoStartManagementActivity"
                )
                return@label91
              }
            } catch (var9: Exception) {
              var10001 = false
              return@a
            }
            try {
              if (App.Companion.i) {
                var2 = ComponentName(
                  "com.coloros.safecenter",
                  "com.coloros.safecenter.permission.startup.StartupAppListActivity"
                )
                return@label91
              }
            } catch (var8: Exception) {
              var10001 = false
              return@a
            }
            try {
              if (!App.Companion.j) {
                return@label86
              }
              var2 = ComponentName(
                "com.vivo.permissionmanager",
                "com.vivo.permissionmanager.activity.BgStartUpManagerActivity"
              )
              var1.setComponent(var2)
              if (var0.getPackageManager()
                  .queryIntentActivities(var1, 65536).size != 0
              ) {
                return@label86
              }
              var2 = ComponentName(
                "com.iqoo.secure",
                "com.iqoo.secure.MainGuideActivity."
              )
            } catch (var7: Exception) {
              var10001 = false
              return@a
            }
          }
          try {
            var1.setComponent(var2)
          } catch (var6: Exception) {
            var10001 = false
            return@a
          }
        }
        var var10: Intent?
        run label89@{
          run label54@{
            try {
              if (var0.getPackageManager()
                  .queryIntentActivities(var1, 65536).size <= 0
              ) {
                return@label54
              }
            } catch (var5: Exception) {
              var10001 = false
              return@a
            }
            var10 = var1
            return@label89
          }
          try {
            var10 = Intent("android.settings.SETTINGS")
          } catch (var4: Exception) {
            var10001 = false
            return@a
          }
        }
        try {
          var0.startActivity(var10)
        } catch (var3: Exception) {
          var10001 = false
        }
      }
    }

    fun a(var0: Activity): Boolean {
      val var1: Boolean = java.lang.Boolean.valueOf(
        var0.getResources().getBoolean(R.bool.enableFeaturesAPI18)
      )
      var var2: Boolean = false
      if (!var1) {
        log("ActivityMain.isCollectorRunning. Notifications are disabled")
        return false
      } else {
        val var3: ComponentName = ComponentName(var0, ServiceNotifications::class.java)
        val var4: Int = Process.myPid()
        val var7: ActivityManager =
          var0.getSystemService(ACTIVITY_SERVICE) as ActivityManager
        var var8: List<ActivityManager.RunningServiceInfo>?
        try {
          var8 = var7.getRunningServices(Int.MAX_VALUE)
        } catch (var6: Exception) {
          var8 = null
        }
        if (var8 == null) {
          log("ActivityMain.isCollectorRunning. getRunningServices returned NULL")
          return true
        } else {
          for (o: ActivityManager.RunningServiceInfo in var8) {
            if ((o.service == var3) && o.pid == var4) {
              var2 = true
            }
          }
          return var2
        }
      }
    }

    fun b(var0: Context) {
      if (App.Companion.h || App.Companion.i) {
        var var1: Intent
        var var10001: Boolean
        run label67@{
          var var3: String?
          var var10: String?
          run label60@{
            run label68@{
              try {
                var1 = Intent()
                val var2: ComponentName = ComponentName(
                  "com.miui.securitycenter",
                  "com.miui.permcenter.autostart.AutoStartManagementActivity"
                )
                var1.setComponent(var2)
                if (App.Companion.h) {
                  return@label68
                }
              } catch (var9: Exception) {
                var10001 = false
                return@b
              }
              try {
                if (!App.Companion.i) {
                  return@label67
                }
              } catch (var8: Exception) {
                var10001 = false
                return@b
              }
              var10 = "com.coloros.oppoguardelf"
              var3 = "com.coloros.powermanager.fuelgaue.PowerConsumptionActivity"
              return@label60
            }
            var10 = "com.miui.powerkeeper"
            var3 = "com.miui.powerkeeper.ui.HiddenAppsContainerManagementActivity"
          }
          try {
            var1.setClassName((var10)!!, (var3)!!)
          } catch (var7: Exception) {
            var10001 = false
            return@b
          }
        }
        var var11: Intent?
        run label69@{
          run label45@{
            try {
              if (var0.getPackageManager()
                  .queryIntentActivities(var1, 65536).size <= 0
              ) {
                return@label45
              }
            } catch (var6: Exception) {
              var10001 = false
              return@b
            }
            var11 = var1
            return@label69
          }
          try {
            var11 = Intent("android.settings.SETTINGS")
          } catch (var5: Exception) {
            var10001 = false
            return@b
          }
        }
        try {
          var0.startActivity(var11)
        } catch (var4: Exception) {
          var10001 = false
        }
      }
    }

    fun c(var0: Context) {
      if (App.Companion.k) {
        var var1: Intent
        var var10001: Boolean
        run label34@{
          try {
            var1 = Intent()
            val var2: ComponentName = ComponentName(
              "com.huawei.systemmanager",
              "com.huawei.systemmanager.optimize.process.ProtectActivity"
            )
            var1.setComponent(var2)
            if (var0.getPackageManager().queryIntentActivities(var1, 65536).size > 0) {
              return@label34
            }
          } catch (var5: Exception) {
            var10001 = false
            return@c
          }
          try {
            var1 = Intent("android.settings.SETTINGS")
          } catch (var4: Exception) {
            var10001 = false
            return@c
          }
        }
        try {
          var0.startActivity(var1)
        } catch (var3: Exception) {
          var10001 = false
        }
      }
    }

    private fun d(context: Context): Boolean {
      return NotificationManagerCompat.getEnabledListenerPackages(context)
        .contains(context.getPackageName())
    }

    private fun e(var0: Context) {
      try {
        val intent: Intent = Intent()
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS")
        intent.setData(Uri.fromParts("package", var0.getPackageName(), null as String?))
        var0.startActivity(intent)
      } catch (var2: Exception) {
      }
    }

    private fun f(var0: Context) {
      if (App.Companion.a) {
        toast(var0, "App notifications are only available in the pro version")
      } else if (VERSION.SDK_INT < 18) {
        log(
          var0,
          "ActivityMain.onActionNotificationListenerSettings ERROR Android version<4.3"
        )
      } else {
        val var1: String
        if (VERSION.SDK_INT >= 22) {
          var1 = "ActivityMain.onActionNotificationListenerSettings Android version>=5.1"
        } else {
          var1 =
            "ActivityMain.onActionNotificationListenerSettings 4.3<Android version<5.1"
        }
        log(var1)
        try {
          val var3: Intent =
            Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS")
          var0.startActivity(var3)
        } catch (var2: Exception) {
        }
      }
    }
  }
}
