package com.dof100.morsenotifier

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build.VERSION
import android.os.Bundle
import android.os.Handler
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.dof100.morsenotifier.MyLog.log
import com.dof100.morsenotifier.MyLog.toast

class ActivityMain constructor() : Activity(), View.OnClickListener {
  private val a: Handler = Handler()
  private val b: Runnable = object : Runnable {
    public override fun run() {
      checkPermissions()
      h()
      i()
    }
  }

  private fun a() {
    log("ActivityMain.onActionSettings")
    val var1: Intent = Intent(this, MyPreferencesActivity::class.java)
    log("ActivityMain.onActionSettings before startActivityForResult")
    this.startActivityForResult(var1, 1)
  }

  private fun a(var1: String): Boolean {
    val var2: PackageManager = getPackageManager()
    try {
      var2.getPackageInfo(var1, 1)
      val var3: Boolean = var2.getApplicationInfo(var1, 0).enabled
      return var3
    } catch (var4: PackageManager.NameNotFoundException) {
      var4.printStackTrace()
      return false
    }
  }

  private fun b() {
    log("onActionAbout")
    val var1: Intent = Intent(this, ActivityHTML::class.java)
    var1.putExtra("TITLE", "About")
    var1.putExtra("FILENAME", "about.html")
    var1.putExtra("VERTICALALIGN", "top")
    var1.putExtra("BUTTONOKCAPTION", "OK")
    this.startActivity(var1)
  }

  private fun c() {
    log("onActionRate")
    val var2 = "market://details?id=${getPackageName()}"
    try {
      val var4: Intent = Intent("android.intent.action.VIEW", Uri.parse(var2))
      this.startActivity(var4)
    } catch (var3: Exception) {
      var3.printStackTrace()
    }
  }

  private fun d() {
    log("onActionTest")
    val var1: Intent = Intent(this, ServiceMain::class.java)
    var1.putExtra(
      getResources().getString(R.string.MSG_WHAT),
      getResources().getString(R.string.MSG_MN_TEST)
    )
    var1.putExtra(getResources().getString(R.string.MSG_EXTRATEXT1), "0")
    var1.putExtra(getResources().getString(R.string.MSG_EXTRATEXT2), "0")
    startService(var1)
  }

  private fun e() {
    log("onActionTips")
    val var1: String
    if (App.Companion.morseMode) {
      var1 = "http://www.100dof.com/software/morsenotifier/manual_morse_notifier.pdf"
    } else {
      var1 = "http://www.100dof.com/software/voicenotifier/manual_voice_notifier.pdf"
    }
    val var2: Uri = Uri.parse(var1)
    val var4: Intent = Intent("android.intent.action.VIEW")
    var4.setDataAndType(var2, "application/pdf")
    try {
      this.startActivity(var4)
    } catch (var3: Exception) {
      val var5: AlertDialog.Builder
      if (VERSION.SDK_INT >= 21) {
        var5 = AlertDialog.Builder(this, 16974374)
      } else {
        var5 = AlertDialog.Builder(this)
      }
      var5.setTitle("Open pdf failed")
        .setMessage("You will need a pdf viewer to open the user guide. Would you like to find one in Google Play?")
        .setPositiveButton(17039379, object : DialogInterface.OnClickListener {
          public override fun onClick(var1: DialogInterface, var2: Int) {
            val var4: Intent =
              (Intent("android.intent.action.VIEW")).setData(Uri.parse("market://search?q=pdf"))
            try {
              this@ActivityMain.startActivity(var4)
            } catch (var3: Exception) {
              toast(this@ActivityMain, "Could not open Google Play")
            }
          }
        }).setNegativeButton(17039369, object : DialogInterface.OnClickListener {
        public override fun onClick(var1: DialogInterface, var2: Int) {}
      }).setIcon(17301543).show()
    }
  }

  private fun f() {
    log("onActionServiceCommand")
    this.startActivity(Intent(this, ActivityAdvanced::class.java))
  }

  private fun checkPermissions() {
    log("ActivityMain.checkPermissions")
    if ((ContextCompat.checkSelfPermission(
        this,
        "android.permission.READ_PHONE_STATE"
      ) == 0) && (ContextCompat.checkSelfPermission(
        this,
        "android.permission.READ_SMS"
      ) == 0) && (ContextCompat.checkSelfPermission(
        this,
        "android.permission.READ_CONTACTS"
      ) == 0) && (ContextCompat.checkSelfPermission(
        this,
        "android.permission.READ_CALL_LOG"
      ) == 0)
    ) {
      log("ActivityMain.checkPermissions all permissions granted")
    } else if (App.Companion.getQuestionAsked(this, "PERMISSIONS")) {
      log("ActivityMain.checkPermissions question_AlreadyAsked")
      toast(this, "Permissions needed!")
    } else {
      App.Companion.setQuestionAsked(this, "PERMISSIONS")
      ActivityCompat.requestPermissions(
        this,
        arrayOf(
          "android.permission.READ_PHONE_STATE",
          "android.permission.READ_SMS",
          "android.permission.READ_CONTACTS",
          "android.permission.READ_CALL_LOG"
        ),
        100
      )
    }
  }

  private fun h() {
    log("ActivityMain.checkNotificationAccess")
    if (!java.lang.Boolean.valueOf(getResources().getBoolean(R.bool.enableFeaturesAPI18))) {
      log("ActivityMain.checkNotificationAccess api18=false")
    } else if (App.Companion.freeBuild) {
      log("ActivityMain.checkNotificationAccess Free version")
    } else if (ActivityAdvanced.Companion.a(this as Activity)) {
      log("ActivityMain.checkNotificationAccess collector is running")
    } else if (App.Companion.getQuestionAsked(this, "NOTIFICATIONACCESS")) {
      log("ActivityMain.checkNotificationAccess question_AlreadyAsked")
      toast(this, "No notification access!")
    } else {
      App.Companion.setQuestionAsked(this, "NOTIFICATIONACCESS")
      (AlertDialog.Builder(this)).setTitle(R.string.string_advanced_notificationlistener)
        .setMessage(
          getResources().getText(R.string.string_notify_protectedapps_text).toString()
            .replace("\$BRAND$", (App.Companion.brand)!!)
            .replace("\$APPNAME$", (App.Companion.labelRes)!!)
        ).setPositiveButton(17039379, object : DialogInterface.OnClickListener {
        public override fun onClick(var1: DialogInterface, var2: Int) {
          var var2: Int = var2
          log("ActivityMain.checkNotificationAccess: collector is not running. Opening settings...")
          var2 = VERSION.SDK_INT
          this@ActivityMain.startActivity(Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"))
        }
      }).setNegativeButton(17039369, object : DialogInterface.OnClickListener {
        public override fun onClick(var1: DialogInterface, var2: Int) {}
      }).setIcon(17301543).show()
    }
  }

  private fun i() {
    run label48@{
      if (App.Companion.isXiaomi || App.Companion.isOppo || App.Companion.isVivo) {
        if (App.Companion.getQuestionAsked(this, "AUTOSTART")) {
          return@label48
        }
        App.Companion.setQuestionAsked(this, "AUTOSTART")
        (AlertDialog.Builder(this)).setTitle(R.string.string_advanced_autostart).setMessage(
          getResources().getText(R.string.string_notify_powersave_text).toString()
            .replace("\$BRAND$", (App.Companion.brand)!!)
            .replace("\$APPNAME$", (App.Companion.labelRes)!!)
        ).setPositiveButton(17039370, object : DialogInterface.OnClickListener {
          public override fun onClick(var1: DialogInterface, var2: Int) {
            ActivityAdvanced.Companion.a(this@ActivityMain as Context)
          }
        }).setNegativeButton(17039369, object : DialogInterface.OnClickListener {
          public override fun onClick(var1: DialogInterface, var2: Int) {}
        }).setIcon(17301543).show()
      }
      if (App.Companion.isXiaomi || App.Companion.isOppo) {
        if (App.Companion.getQuestionAsked(this, "POWERSAVE")) {
          return@label48
        }
        App.Companion.setQuestionAsked(this, "POWERSAVE")
        (AlertDialog.Builder(this)).setTitle(R.string.string_advanced_powersave_text)
          .setMessage(
            getResources().getText(R.string.string_reminder).toString()
              .replace("\$BRAND$", (App.Companion.brand)!!)
              .replace("\$APPNAME$", (App.Companion.labelRes)!!)
          ).setPositiveButton(17039370, object : DialogInterface.OnClickListener {
          public override fun onClick(var1: DialogInterface, var2: Int) {
            ActivityAdvanced.Companion.b(this@ActivityMain as Context)
          }
        }).setNegativeButton(17039369, object : DialogInterface.OnClickListener {
          public override fun onClick(var1: DialogInterface, var2: Int) {}
        }).setIcon(17301543).show()
      }
      if (!App.Companion.isHuawei) {
        return@i
      }
      if (!App.Companion.getQuestionAsked(this, "PROTECTEDAPPS")) {
        App.Companion.setQuestionAsked(this, "PROTECTEDAPPS")
        (AlertDialog.Builder(this)).setTitle(R.string.string_advanced_protectedapps_text)
          .setMessage(
            getResources().getText(R.string.string_stop).toString()
              .replace("\$BRAND$", (App.Companion.brand)!!)
              .replace("\$APPNAME$", (App.Companion.labelRes)!!)
          ).setPositiveButton(17039370, object : DialogInterface.OnClickListener {
          public override fun onClick(var1: DialogInterface, var2: Int) {
            ActivityAdvanced.Companion.c(this@ActivityMain)
          }
        }).setNegativeButton(17039369, object : DialogInterface.OnClickListener {
          public override fun onClick(var1: DialogInterface, var2: Int) {}
        }).setIcon(17301543).show()
        return@i
      }
    }
    log("ActivityMain.checkAutostart question_AlreadyAsked")
  }

  override fun onActivityResult(var1: Int, var2: Int, var3: Intent?) {
    log("ActivityMain.onActivityResult")
    if (var1 == 1) {
      App.Companion.broadcastSettingsChanged(getApplicationContext())
    }
  }

  public override fun onClick(var1: View) {
    if (var1 != null) {
      when (var1.getId()) {
        R.id.button_about -> {
          b()
          return
        }

        R.id.button_instructions -> {
          e()
          return
        }

        R.id.button_rate -> {
          c()
          return
        }

        R.id.button_service_command -> {
          f()
          return
        }

        R.id.button_settings -> {
          this.a()
          return
        }

        R.id.button_test -> {
          d()
          return
        }

        else -> {}
      }
    }
  }

  override fun onCreate(var1: Bundle?) {
    super.onCreate(var1)
    this.setContentView(R.layout.activity_main)
    (findViewById<View>(R.id.button_settings) as Button).setOnClickListener(this)
    (findViewById<View>(R.id.button_about) as Button).setOnClickListener(this)
    (findViewById<View>(R.id.button_rate) as Button).setOnClickListener(this)
    (findViewById<View>(R.id.button_test) as Button).setOnClickListener(this)
    (findViewById<View>(R.id.button_instructions) as Button).setOnClickListener(this)
    (findViewById<View>(R.id.button_service_command) as Button).setOnClickListener(this)
    val var4: Intent = Intent(this, ServiceMain::class.java)
    var4.putExtra(
      getResources().getString(R.string.MSG_WHAT),
      getResources().getString(R.string.MSG_MN_ACTIVITYMAIN)
    )
    startService(var4)
    log("ActivityMain.oncreate")
    if (("MorseNotifierPro" == "pro")) {
      log("ActivityMain.oncreate ispro")
      var var2: Boolean = false
      var var3: Boolean = var2
      if (App.Companion.morseMode) {
        var3 = var2
        if (this.a("com.dof100.morsenotifier.free")) {
          var3 = true
        }
      }
      var2 = var3
      if (App.Companion.voiceMode) {
        var2 = var3
        if (this.a("com.dof100.voicenotifier.free")) {
          var2 = true
        }
      }
      if (var2) {
        (AlertDialog.Builder(this)).setTitle(2131493323).setMessage(2131493322)
          .setPositiveButton(17039370, object : DialogInterface.OnClickListener {
            public override fun onClick(var1: DialogInterface, var2: Int) {}
          }).setIcon(17301543).show()
        return
      }
    } else {
      log("ActivityMain.oncreate isfree")
    }
  }

  public override fun onCreateOptionsMenu(var1: Menu): Boolean {
    getMenuInflater().inflate(R.menu.activity_main, var1)
    return super.onCreateOptionsMenu(var1)
  }

  public override fun onOptionsItemSelected(var1: MenuItem): Boolean {
    if (var1.getItemId() == R.id.action_settings) {
      this.a()
      return true
    } else {
      return super.onOptionsItemSelected(var1)
    }
  }

  override fun onPause() {
    a.removeCallbacks(b)
    super.onPause()
  }

  public override fun onRequestPermissionsResult(var1: Int, var2: Array<String>, var3: IntArray) {
    log("ActivityMain.onRequestPermissionsResult")
  }

  override fun onResume() {
    super.onResume()
    a.postDelayed(b, 2000L)
  }
}
