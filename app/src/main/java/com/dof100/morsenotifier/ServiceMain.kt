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
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.dof100.morsenotifier.MyLog.log
import com.dof100.morsenotifier.MyLog.toast
import java.util.Calendar
import java.util.Locale
import java.util.Random

class ServiceMain : IntentService {
  private var A: Boolean = false
  private var B: Int = 16777215
  private var C: Int = 16776960
  private var D: Int = 16776960
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
  private val aE: Random = Random()
  private val aF: Int
  private val aG: BroadcastReceiver
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
    true,
    true,
    true,
    true,
    true,
    true,
    true,
    true,
    true,
    true,
    true,
    true,
    true,
    true,
    true,
    true,
    true,
    true,
    true,
    true,
    true,
    true,
    true,
    true
  )
  private var ar: String? = ""
  private var `as`: String? = ""
  private var at: Int = 1
  private var au: Boolean = false
  private var av: Int = 1
  private var aw: Boolean = true
  private var ax: Int = 3
  private var ay: String = ""
  private var az: String = ""
  private var b: Boolean = true
  private var c: Boolean = true
  private var d: Int = 0
  private var e: Int = 1
  private var f: Boolean = true
  private var g: Boolean = true
  private var h: Int = 0
  private var i: Int = 0
  private var j: Boolean = false
  private var k: Int = 0
  private var l: Boolean = false
  private var m: String? = "en_US"
  private var n: Int = 100
  private var o: Int = 100
  private var p: Int = 100
  private var q: Boolean = false
  private var r: Boolean = false
  private var s: Int = 800
  private var t: Int = 100
  private var u: Int = 10
  private var v: Boolean = false
  private var w: Int = 1
  private var x: Int = 0
  private var y: Boolean = false
  private var z: Boolean = true

  constructor() : super("com.dof100.morsenotifier.ServiceMain") {
    aF = aE.nextInt(10000)
    aG = object : BroadcastReceiver() {
      public override fun onReceive(var1: Context, var2: Intent) {
        if (("LBR_ACTION_SETTINGSCHANGED" == var2.getAction())) {
          log("ServiceMain.BroadcastReceiver got LBR_ACTION_SETTINGSCHANGED")
          log("ServiceMain.BroadcastReceiver pref_init")
          c()
          MyJob.Companion.scheduleNextChime()
          MyJob.Companion.scheduleNextReminder(this@ServiceMain as Context?)
        }
      }
    }
  }

  constructor(var1: String?) : super(var1) {
    aF = aE.nextInt(10000)
    aG = object : BroadcastReceiver() {
      public override fun onReceive(var1: Context, var2: Intent) {
        if (("LBR_ACTION_SETTINGSCHANGED" == var2.getAction())) {
          log("ServiceMain.BroadcastReceiver got LBR_ACTION_SETTINGSCHANGED")
          log("ServiceMain.BroadcastReceiver pref_init")
          c()
          MyJob.Companion.scheduleNextChime()
          MyJob.Companion.scheduleNextReminder(this@ServiceMain as Context?)
        }
      }
    }
  }

  private fun a() {
    log(this, "ServiceMain.alarm_init" as String?)
    MyJob.Companion.clearAllJobs()
    MyJob.Companion.scheduleNextChime()
    MyJob.Companion.scheduleNextReminder(this as Context?)
    if (App.Companion.d) {
      App.Companion.a(getApplicationContext())
    }
  }

  private fun a(var1: Int, var2: Int, var3: Boolean) {
    var var1: Int = var1
    var var2: Int = var2
    if (ao) {
      log(this, "ServiceMain.handleChime" as String?)
      val var4: Calendar = Calendar.getInstance()
      val var5: Int = var4.get(11)
      val var6: Int = var4.get(12)
      val var7: Long = var4.getTimeInMillis()
      val var9: Int
      if (var1 <= 0) {
        var9 = var4.get(11) % 24
      } else {
        var9 = var1
      }
      if (!var3 && !aq.get(var9)) {
        log(
          this,
          String.format(
            Locale.US,
            "ServiceMain.onHandleIntent (MSG_CHIME) Chime disabled for \"%02d:00\"",
            var9
          ) as String?
        )
      } else {
        if (!var3) {
          val var10: Int = Utils.a(var5, var6, var1, var2)
          if (var10 >= 2) {
            log(
              this,
              String.format(
                Locale.US,
                "ServiceMain.onHandleIntent (MSG_CHIME) ERROR now=%02d:%02d reminder=%02d:%02d  dif=%d",
                var5,
                var6,
                var1,
                var2,
                var10
              ) as String?
            )
            return
          }
        }
        if (!var3) {
          val var12: SharedPreferences =
            PreferenceManager.getDefaultSharedPreferences(this)
          if (var7 - var12.getLong("chime_lasttime", 0L) < 300000L) {
            log(
              this,
              String.format(
                Locale.US,
                "ServiceMain.onHandleIntent (MSG_CHIME) ERROR Last time was less that 5 min ego. now=%02d:%02d reminder=%02d:%02d",
                var5,
                var6,
                var1,
                var2
              ) as String?
            )
            return
          }
          var12.edit().putLong("chime_lasttime", var7).apply()
        }
        var var13: String? = ""
        var var11: String?
        when (at) {
          1 -> {
            var11 = String.format(Locale.US, "%02d00", var9)
            var13 = var11
            if (App.Companion.d) {
              var13 = Utils.a(var11, ' ')
            }
          }

          2 -> {
            var2 = var9 % 12
            var1 = var2
            if (var2 == 0) {
              var1 = 12
            }
            var13 = String.format(Locale.US, "%d", var1)
          }

          3 -> var13 = String.format(Locale.US, "%d", var9)
        }
        var11 = var13
        var var15: StringBuilder
        if (!ar!!.isEmpty()) {
          var15 = StringBuilder()
          var15.append(ar)
          var15.append(" ")
          var15.append(var13)
          var11 = var15.toString()
        }
        var13 = var11
        if (!`as`!!.isEmpty()) {
          val var14: StringBuilder = StringBuilder()
          var14.append(var11)
          var14.append(" ")
          var14.append(`as`)
          var13 = var14.toString()
        }
        var15 = StringBuilder()
        var15.append("ServiceMain.onHandleIntent (MSG_CHIME) hour=")
        var15.append(var9)
        var15.append("  format=")
        var15.append(at)
        var15.append(" message:")
        var15.append(var13)
        log(this, var15.toString() as String?)
        this.a(var13, a.get(ap), 1, var3)
      }
    }
  }

  private fun a(param1: String?) {
    // $FF: Couldn't be decompiled
  }

  private fun a(var1: String?, var2: Int, var3: Int, var4: Int, var5: Int, var6: Int) {
    val var7: MyPlayerTTS? = App.Companion.a(getApplicationContext())
    var7!!.mo495a(getApplicationContext(), h, var3, m, var4, var5, var6, var2, var1)
    var7.mo496b(getApplicationContext())
    var7.mo494a(getApplicationContext())
  }

  private fun a(
    var1: String?,
    var2: Int,
    var3: Int,
    var4: Int,
    var5: Int,
    var6: Int,
    var7: Boolean,
    var8: Boolean,
    var9: Boolean,
    var10: Boolean
  ) {
    val var11: MyPlayerMorse = MyPlayerMorse(getApplicationContext(), aF)
    val var12: Context = getApplicationContext()
    val var13: Boolean = l
    val var14: Int = d
    val var15: Int
    if (j) {
      var15 = k
    } else {
      var15 = var4
    }
    var11.playInit(var12, var7, var8, var13, var14, var3, var4, var15, var2, var5, var6, u, var1!!)
    if (var9) {
      when (w) {
        1, 2, 3 -> {
          val var17: Intent = Intent(this, ActivityDisplayMessage::class.java)
          var17.addFlags(32768)
          var17.addFlags(268435456)
          var17.putExtra("PARAM_INSTANCE", aF)
          var17.putExtra("PARAM_LIST", var11.getList())
          var17.putExtra("PARAM_DISPLAY_HOW", w)
          var17.putExtra("PARAM_DISPLAY_POS", x)
          var17.putExtra("PARAM_DISPLAY_STAYONTOP", y)
          var17.putExtra("PARAM_DISPLAY_TEXT", z)
          var17.putExtra("PARAM_DISPLAY_FLASH", A)
          var17.putExtra("PARAM_DISPLAY_COLOR", B)
          var17.putExtra("PARAM_DISPLAY_COLOR_ME_HILIGHT", C)
          var17.putExtra("PARAM_DISPLAY_COLOR_TEXT_HILIGHT", D)
          var17.putExtra("PARAM_DISPLAY_INITIALDELAY", d)
          var17.putExtra("PARAM_ENABLEDIALOGSETTINGS", var10 xor true)
          var17.putExtra("PARAM_STOPMETHOD", e)
          try {
            this.startActivity(var17)
          } catch (var16: Exception) {
            log(
              this,
              "ServiceMain.play_message ERROR startActivity (ActivityDisplayMessage)" as String?
            )
          }
        }
      }
    }
    var11.execute()
    var11.playDone(getApplicationContext())
  }

  private fun a(var1: String?, var2: Int, var3: Int, var4: Boolean) {
    var var1: String? = var1
    var var3: Int = var3
    var var5: StringBuilder = StringBuilder()
    var5.append("ServiceMain.play_message: ")
    var5.append(var1)
    var5.append(" instance=")
    var5.append(aF)
    log(this, var5.toString() as String?)
    val var17: String = var1!!.lowercase(Locale.getDefault())
    var var6: Int
    if (App.Companion.c) {
      var6 = i
    } else {
      var6 = n
    }
    val var7: Int = Utils.a(var17, "s", var6, 1, 200)
    if (App.Companion.c) {
      var6 = t
    } else {
      var6 = p
    }
    var6 = Utils.a(var17, "v", var6, 0, 100)
    val var8: Int = Utils.a(var17, "f", s, 10, 25000)
    val var9: Int = Utils.a(var17, "r", var3, 1, 10)
    val var10: Int = Utils.a(var17, "p", o, 30, 300)
    val var11: Boolean = Utils.a(var17, "a", q)
    val var12: Boolean = Utils.a(var17, "b", r)
    val var13: Boolean = Utils.a(var17, "d", v)
    var1 = Utils.a(var1)
    log(
      String.format(
        Locale.US,
        "ServiceMain.play_message message=%s stream=%d istest=%b ",
        var1,
        var2,
        var4
      )
    )
    log(
      String.format(
        Locale.US,
        "ServiceMain.play_message speed=%d vol=%d freq=%d repeat=%d pitch=%d",
        var7,
        var6,
        var8,
        var9,
        var10
      )
    )
    log(
      String.format(
        Locale.US,
        "ServiceMain.play_message Audio=%b Vibration=%b Display=%b",
        var11,
        var12,
        var13
      )
    )
    if (var4) {
      var5 = StringBuilder()
      var5.append(this.getString(R.string.title_activity_about))
      var5.append(" ")
      var5.append(var1)
      toast(this, var5.toString())
    }
    if (var11 || var12 || var13) {
      val var18: TelephonyManager? = this.getSystemService("phone") as TelephonyManager?
      val var16: Boolean
      if (var18 != null && var18.getCallState() == 2) {
        var16 = true
      } else {
        var16 = false
      }
      if (App.Companion.c && c && !var4 && var16) {
        log(this, "ServiceMain.play_message: muted (in call)" as String?)
        var5 = StringBuilder()
        var5.append("Morse Notifier: ")
        var5.append(var1)
        toast(this, var5.toString())
      } else if (App.Companion.d && g && !var4 && var16) {
        log(this, "ServiceMain.play_message: muted (in call)" as String?)
        var5 = StringBuilder()
        var5.append("Voice Notifier: ")
        var5.append(var1)
        toast(this, var5.toString())
      } else {
        if (VERSION.SDK_INT >= 23) {
          val var19: NotificationManager? =
            this.getSystemService("notification") as NotificationManager?
          if (var19 != null) {
            var3 = var19.getCurrentInterruptionFilter()
            var5 = StringBuilder()
            var5.append("ServiceMain.play_message dnd state = ")
            var5.append(var3)
            log(var5.toString())
          } else {
            log("ServiceMain.play_message dnd state = (cannot get)")
            var3 = 1
          }
        } else {
          log("ServiceMain.play_message dnd state = (cannot get) Android ver<6.0")
          var3 = 1
        }
        var var14: Boolean = true
        if (var3 == 1) {
          var14 = false
        }
        var5 = StringBuilder()
        var5.append("ServiceMain.play_message flagdnd = ")
        var5.append(var14)
        log(var5.toString())
        val var15: StringBuilder
        if (App.Companion.c && b && !var4 && var14) {
          var15 = StringBuilder()
          var15.append("ServiceMain.play_message: muted (do not disturb) state=")
          var15.append(var3)
          log(this, var15.toString() as String?)
        } else if (App.Companion.d && f && !var4 && var14) {
          var15 = StringBuilder()
          var15.append("ServiceMain.play_message: muted (do not disturb) state=")
          var15.append(var3)
          log(this, var15.toString() as String?)
        } else {
          if (App.Companion.c) {
            this.a(var1, var2, var9, var7, var8, var6, var11, var12, var13, var4)
          } else {
            this.a(var1, var2, var9, var7, var10, var6)
          }
          var15 = StringBuilder()
          var15.append("ServiceMain.play_message OUT instance=")
          var15.append(aF)
          log(this, var15.toString() as String?)
        }
      }
    }
  }

  private fun a(var1: String?, var2: String?, var3: Int, var4: Int, var5: Boolean) {
    var var1: String? = var1
    var var3: Int = var3
    if (au) {
      log(this, "ServiceMain.handleReminders" as String?)
      val var6: Calendar = Calendar.getInstance()
      val var7: Int = var6.get(11)
      val var8: Int = var6.get(12)
      if ((var1 == getResources().getString(R.string.MSG_REMINDERS_ONE_TEST))) {
        log(this, "ServiceMain.onHandleIntent (MSG_REMINDERS_TESTONE)" as String?)
        this.a(var2, a.get(av), 1, var5)
      } else if ((var1 == getResources().getString(R.string.MSG_REMINDERS_ALL_TEST))) {
        log(this, "ServiceMain.onHandleIntent (MSG_REMINDERS_TESTALL)" as String?)
        val var10: MyReminder? = (MyReminders(this)).a()
        if (var10 != null) {
          var1 = var10.a()
          var3 = a.get(av)
        } else {
          var1 = getResources().getString(R.string.text_confirm)
          var3 = a.get(av)
        }
        this.a(var1, var3, 1, var5)
      } else {
        log(this, "ServiceMain.onHandleIntent (MSG_REMINDERS_FIRE)" as String?)
        val var9: Int = Utils.a(var7, var8, var3, var4)
        if (var9 >= 2) {
          log(
            this,
            String.format(
              Locale.US,
              "ServiceMain.onHandleIntent (MSG_REMINDERS) ERROR now=%02d:%02d reminder=%02d:%02d  dif=%d",
              var7, var8, var3, var4, var9
            ) as String?
          )
        } else {
          this.a(var2, a.get(av), 1, var5)
        }
      }
    }
  }

  private fun a(var1: String?, var2: String?, var3: Boolean) {
    var var1: String? = var1
    var var2: String? = var2
    if (R2) {
      log(this, "ServiceMain.handleSMS" as String?)
      this.b()
      if (var1!!.length > 0) {
        this.a(var1)
      }
      val var4: Boolean
      if (ay.length != 0) {
        var4 = true
      } else {
        var4 = false
      }
      var var7: String?
      var var8: String?
      var var11: StringBuilder
      var var12: StringBuilder
      run label124@{
        val var5: String? = T
        val var6: String = ""
        if (!V && !W && !X && !Y) {
          var7 = var5
          if (!Z) {
            return@label124
          }
        }
        var8 = var6
        if (V) {
          var8 = var6
          if (az.length > 0) {
            var11 = StringBuilder()
            var11.append("".trim({ it <= ' ' }))
            var11.append(" ")
            var11.append(az)
            var8 = var11.toString()
          }
        }
        var7 = var8
        if (W) {
          var7 = var8
          if (aA.length > 0) {
            var11 = StringBuilder()
            var11.append(var8!!.trim({ it <= ' ' }))
            var11.append(" ")
            var11.append(aA)
            var7 = var11.toString()
          }
        }
        var8 = var7
        if (X) {
          var8 = var7
          if (aB.length > 0) {
            var12 = StringBuilder()
            var12.append(var7!!.trim({ it <= ' ' }))
            var12.append(" ")
            var12.append(aB)
            var8 = var12.toString()
          }
        }
        var7 = var8
        if (Y) {
          var7 = var8
          if (aC.length > 0) {
            var11 = StringBuilder()
            var11.append(var8!!.trim({ it <= ' ' }))
            var11.append(" ")
            var11.append(aC)
            var7 = var11.toString()
          }
        }
        var8 = var7
        if (Z) {
          var8 = var7
          if (aD.length > 0) {
            var12 = StringBuilder()
            var12.append(var7!!.trim({ it <= ' ' }))
            var12.append(" ")
            var12.append(aD)
            var8 = var12.toString()
          }
        }
        var8 = var8!!.trim({ it <= ' ' })
        if (var4) {
          var11 = StringBuilder()
          var11.append(var5!!.trim({ it <= ' ' }))
          var11.append(" ")
          var11.append(var8)
          var7 = var11.toString()
        } else {
          var11 = StringBuilder()
          var11.append(var5!!.trim({ it <= ' ' }))
          var11.append(" ")
          var11.append(ac)
          var7 = var11.toString()
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
        if (var8!!.length != 0) {
          var1 = var8
          if (App.Companion.d) {
            var1 = Utils.a(var8, ' ')
          }
          var12 = StringBuilder()
          var12.append(var7!!.trim({ it <= ' ' }))
          var12.append(" ")
          var11 = var12
        } else {
          var8 = var7
          if (var1!!.length != 0) {
            return@label93
          }
          var12 = StringBuilder()
          var12.append(var7!!.trim({ it <= ' ' }))
          var12.append(" ")
          var1 = ad
          var11 = var12
        }
        var11.append(var1)
        var8 = var11.toString()
      }
      var1 = var8
      if (aa) {
        var1 = var8
        if (var2!!.length > 0) {
          val var10: StringBuilder = StringBuilder()
          var10.append(var8!!.trim({ it <= ' ' }))
          var10.append(" ")
          var10.append(var2)
          var1 = var10.toString()
        }
      }
      var2 = var1
      if (ab!!.length > 0) {
        val var9: StringBuilder = StringBuilder()
        var9.append(var1!!.trim({ it <= ' ' }))
        var9.append(" ")
        var9.append(ab)
        var2 = var9.toString()
      }
      var2 = var2!!.trim({ it <= ' ' })
      var1 = var2
      if (var2.length == 0) {
        var1 = "sms"
      }
      this.a(var1, a.get(S), ae, var3)
    }
  }

  private fun a(var1: String?, var2: Boolean) {
    var var1: String? = var1
    if (E) {
      log(this, "ServiceMain.handleCall" as String?)
      this.b()
      if (var1!!.length > 0) {
        this.a(var1)
      }
      val var3: Boolean
      if (ay.length != 0) {
        var3 = true
      } else {
        var3 = false
      }
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
          if (az.length > 0) {
            var9 = StringBuilder()
            var9.append("".trim({ it <= ' ' }))
            var9.append(" ")
            var9.append(az)
            var6 = var9.toString()
          }
        }
        var5 = var6
        if (J) {
          var5 = var6
          if (aA.length > 0) {
            var8 = StringBuilder()
            var8.append(var6.trim({ it <= ' ' }))
            var8.append(" ")
            var8.append(aA)
            var5 = var8.toString()
          }
        }
        var6 = var5!!
        if (K) {
          var6 = var5!!
          if (aB.length > 0) {
            var9 = StringBuilder()
            var9.append(var5!!.trim({ it <= ' ' }))
            var9.append(" ")
            var9.append(aB)
            var6 = var9.toString()
          }
        }
        var5 = var6
        if (L) {
          var5 = var6
          if (aC.length > 0) {
            var8 = StringBuilder()
            var8.append(var6.trim({ it <= ' ' }))
            var8.append(" ")
            var8.append(aC)
            var5 = var8.toString()
          }
        }
        var6 = var5!!
        if (M) {
          var6 = var5!!
          if (aD.length > 0) {
            var9 = StringBuilder()
            var9.append(var5!!.trim({ it <= ' ' }))
            var9.append(" ")
            var9.append(aD)
            var6 = var9.toString()
          }
        }
        var5 = var6.trim({ it <= ' ' })
        if (var3) {
          var9 = StringBuilder()
          var9.append(var4!!.trim({ it <= ' ' }))
          var9.append(" ")
          var9.append(var5)
          var6 = var9.toString()
        } else {
          var9 = StringBuilder()
          var9.append(var4!!.trim({ it <= ' ' }))
          var9.append(" ")
          var9.append(O)
          var6 = var9.toString()
        }
      }
      run label103@{
        run label102@{
          run label101@{
            when (H) {
              1 -> if (var1!!.length >= 0) {
                return@label101
              }

              2 -> if (var1!!.length >= 0 && !var3) {
                return@label101
              }

              11 -> if (var1!!.length >= 3) {
                return@label102
              }

              12 -> if (var1!!.length >= 3 && !var3) {
                return@label102
              }
            }
            var5 = ""
            return@label103
          }
          var5 = var1
          return@label103
        }
        var5 = var1!!.substring(var1!!.length - 3)
      }
      run label87@{
        if (var5!!.length != 0) {
          var1 = var5
          if (App.Companion.d) {
            var1 = Utils.a(var5, ' ')
          }
          var8 = StringBuilder()
          var8.append(var6.trim({ it <= ' ' }))
          var8.append(" ")
          var9 = var8
        } else {
          var5 = var6
          if (var1!!.length != 0) {
            return@label87
          }
          var8 = StringBuilder()
          var8.append(var6.trim({ it <= ' ' }))
          var8.append(" ")
          var1 = P
          var9 = var8
        }
        var9.append(var1)
        var5 = var9.toString()
      }
      var1 = var5
      if (N!!.length > 0) {
        val var7: StringBuilder = StringBuilder()
        var7.append(var5!!.trim({ it <= ' ' }))
        var7.append(" ")
        var7.append(N)
        var1 = var7.toString()
      }
      var6 = var1!!.trim({ it <= ' ' })
      var1 = var6
      if (var6.length == 0) {
        var1 = "Call"
      }
      var9 = StringBuilder()
      var9.append("ServiceMain.onHandleIntent (MSG_CALL_RINGING) curText = ")
      var9.append(var1)
      log(this, var9.toString() as String?)
      this.a(var1, a.get(F), Q, var2)
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

  private fun b(var1: String?, var2: String?, var3: Boolean) {
    var var1: String? = var1
    var var2: String? = var2
    if (af) {
      log(this, "ServiceMain.handleSystem" as String?)
      val var4: String = ""
      if ((var1 == getResources().getString(R.string.MSG_SYSTEM_BOOT))) {
        this.a()
        var2 = var4
      } else if ((var1 == getResources().getString(R.string.MSG_SYSTEM_TEST))) {
        var2 = getResources().getString(R.string.test_message)
      } else if ((var1 == getResources().getString(R.string.MSG_SYSTEM_POWER_CONNECTED))) {
        var2 = ah
      } else if ((var1 == getResources().getString(R.string.MSG_SYSTEM_POWER_DISCONNECTED))) {
        var2 = ai
      } else if ((var1 == getResources().getString(R.string.MSG_SYSTEM_BATTERY_LOW))) {
        var2 = aj
      } else if ((var1 == getResources().getString(R.string.MSG_SYSTEM_BATTERY_OK))) {
        var2 = ak
      } else if ((var1 == getResources().getString(R.string.MSG_SYSTEM_WF_CONNECTED))) {
        val var6: StringBuilder = StringBuilder()
        var6.append(am)
        if (an) {
          val var5: StringBuilder = StringBuilder()
          var5.append(" ")
          var5.append(var2)
          var1 = var5.toString()
        } else {
          var1 = ""
        }
        var6.append(var1)
        var2 = var6.toString()
      } else {
        var2 = var4
        if ((var1 == getResources().getString(R.string.MSG_SYSTEM_WF_DISCONNECTED))) {
          var2 = al
        }
      }
      if (!var2!!.isEmpty()) {
        this.a(var2, a.get(ag), 1, var3)
      }
    }
  }

  private fun b(var1: String?, var2: Boolean) {
    var var1: String? = var1
    if (aw) {
      log(this, "ServiceMain.handleApps" as String?)
      if (var2) {
        var1 = this.getString(R.string.text_confirm)
      }
      if (!var1!!.isEmpty()) {
        this.a(var1, a.get(ax), 1, false)
      }
    }
  }

  private fun c() {
    log(this, "ServiceMain.pref_init" as String?)
    val var1: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
    var var2: String?
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    b = Utils.prefGetBoolean(
      this,
      var1,
      "pref_morse_general_dnd",
      null as String?,
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    c = Utils.prefGetBoolean(
      this,
      var1,
      "pref_morse_general_muteincalls",
      null as String?,
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    d = Utils.prefGetInt(
      this,
      var1,
      "pref_morse_general_initialdelay",
      null as String?,
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    e = Utils.prefGetInt(
      this,
      var1,
      "pref_morse_general_volumedownstop",
      null as String?,
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    f = Utils.prefGetBoolean(
      this,
      var1,
      "pref_voice_general_dnd",
      null as String?,
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    g = Utils.prefGetBoolean(
      this,
      var1,
      "pref_voice_general_muteincalls",
      null as String?,
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    h = Utils.prefGetInt(
      this,
      var1,
      "pref_voice_general_initialdelay",
      null as String?,
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    i = Utils.prefGetInt(this, var1, "pref_morse_wpm", null as String?, var2, "_def")
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    j = Utils.prefGetBoolean(
      this,
      var1,
      "pref_morse_farnsworth_enable",
      null as String?,
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    k = Utils.prefGetInt(this, var1, "pref_morse_farnsworth_wpm", null as String?, var2, "_def")
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    l = Utils.prefGetBoolean(
      this,
      var1,
      "pref_morse_punctuation",
      null as String?,
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    m = Utils.prefGetString(
      this,
      var1,
      "pref_voice_locale",
      "pref_general_locale",
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    n = Utils.prefGetInt(
      this,
      var1,
      "pref_voice_speed",
      "pref_general_speechrate",
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    o = Utils.prefGetInt(this, var1, "pref_voice_pitch", "pref_general_pitch", var2, "_def")
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    p = Utils.prefGetInt(this, var1, "pref_voice_vol", "pref_general_volume", var2, "_def")
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    q = Utils.prefGetBoolean(this, var1, "pref_audio_enable", null as String?, var2, "_def")
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    r = Utils.prefGetBoolean(
      this,
      var1,
      "pref_audio_vibration_enable",
      null as String?,
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    s = Utils.prefGetInt(this, var1, "pref_audio_freq", null as String?, var2, "_def")
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    t = Utils.prefGetInt(this, var1, "pref_audio_vol", null as String?, var2, "_def")
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    u = Utils.prefGetInt(this, var1, "pref_audio_ramp", null as String?, var2, "_def")
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    v = Utils.prefGetBoolean(this, var1, "pref_display_enable", null as String?, var2, "_def")
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    w = Utils.prefGetInt(this, var1, "pref_display_how", null as String?, var2, "_def")
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    x = Utils.prefGetInt(this, var1, "pref_display_pos", null as String?, var2, "_def")
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    y = Utils.prefGetBoolean(
      this,
      var1,
      "pref_display_stayontop",
      null as String?,
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    z = Utils.prefGetBoolean(this, var1, "pref_display_text", null as String?, var2, "_def")
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    A = Utils.prefGetBoolean(this, var1, "pref_display_flash", null as String?, var2, "_def")
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    B = Utils.prefGetColor(this, var1, "pref_display_color", null as String?, var2, "_def")
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    C = Utils.prefGetColor(
      this,
      var1,
      "pref_display_color_me_highlight",
      null as String?,
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    D = Utils.prefGetColor(
      this,
      var1,
      "pref_display_color_text_highlight",
      null as String?,
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    E = Utils.prefGetBoolean(this, var1, "pref_call_enable", null as String?, var2, "_def")
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    F = Utils.prefGetInt(this, var1, "pref_call_stream", "pref_call_e1pro_stream", var2, "_def")
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    G = Utils.prefGetString(
      this,
      var1,
      "pref_call_string1",
      "pref_call_e1pro_string1",
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    H = Utils.prefGetInt(this, var1, "pref_call_num", "pref_call_e1pro_num", var2, "_def")
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    I = Utils.prefGetBoolean(
      this,
      var1,
      "pref_call_contactdisplayname",
      "pref_call_e1pro_contactdisplayname",
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    J = Utils.prefGetBoolean(
      this,
      var1,
      "pref_call_contactfirstname",
      "pref_call_e1pro_contactfirstname",
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    K = Utils.prefGetBoolean(
      this,
      var1,
      "pref_call_contactlastname",
      "pref_call_e1pro_contactlastname",
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    L = Utils.prefGetBoolean(
      this,
      var1,
      "pref_call_contactinitials",
      "pref_call_e1pro_contactinitials",
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    M = Utils.prefGetBoolean(
      this,
      var1,
      "pref_call_contactnickname",
      "pref_call_e1pro_contactnickname",
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    N = Utils.prefGetString(
      this,
      var1,
      "pref_call_string2",
      "pref_call_e1pro_string2",
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    O = Utils.prefGetString(
      this,
      var1,
      "pref_call_contactname_none",
      "pref_call_e1pro_contactname_none",
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    P = Utils.prefGetString(
      this,
      var1,
      "pref_call_num_none",
      "pref_call_e1pro_num_none",
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    Q = Utils.prefGetInt(this, var1, "pref_call_repeat", "pref_call_e1pro_repeat", var2, "_def")
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    R2 = Utils.prefGetBoolean(this, var1, "pref_sms_enable", null as String?, var2, "_def")
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    S = Utils.prefGetInt(this, var1, "pref_sms_stream", "pref_sms_e1pro_stream", var2, "_def")
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    T = Utils.prefGetString(
      this,
      var1,
      "pref_sms_string1",
      "pref_sms_e1pro_string1",
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    U = Utils.prefGetInt(this, var1, "pref_sms_num", "pref_sms_e1pro_num", var2, "_def")
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    V = Utils.prefGetBoolean(
      this,
      var1,
      "pref_sms_contactdisplayname",
      "pref_sms_e1pro_contactdisplayname",
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    W = Utils.prefGetBoolean(
      this,
      var1,
      "pref_sms_contactfirstname",
      "pref_sms_e1pro_contactfirstname",
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    X = Utils.prefGetBoolean(
      this,
      var1,
      "pref_sms_contactlastname",
      "pref_sms_e1pro_contactlastname",
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    Y = Utils.prefGetBoolean(
      this,
      var1,
      "pref_sms_contactinitials",
      "pref_sms_e1pro_contactinitials",
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    Z = Utils.prefGetBoolean(
      this,
      var1,
      "pref_sms_contactnickname",
      "pref_sms_e1pro_contactnickname",
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    aa = Utils.prefGetBoolean(this, var1, "pref_sms_text", "pref_sms_e1pro_text", var2, "_def")
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    ab = Utils.prefGetString(
      this,
      var1,
      "pref_sms_string2",
      "pref_sms_e1pro_string2",
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    ac = Utils.prefGetString(
      this,
      var1,
      "pref_sms_contactname_none",
      "pref_sms_e1pro_contactname_none",
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    ad = Utils.prefGetString(
      this,
      var1,
      "pref_sms_num_none",
      "pref_sms_e1pro_num_none",
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    ae = Utils.prefGetInt(this, var1, "pref_sms_repeat", "pref_sms_e1pro_repeat", var2, "_def")
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    af = Utils.prefGetBoolean(this, var1, "pref_system_enable", null as String?, var2, "_def")
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    ag = Utils.prefGetInt(
      this,
      var1,
      "pref_system_stream",
      "pref_system_e1pro_stream",
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    ah = Utils.prefGetString(
      this,
      var1,
      "pref_system_powerconectedstring",
      "pref_system_e1pro_powerconectedstring",
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    ai = Utils.prefGetString(
      this,
      var1,
      "pref_system_powerdisconectedstring",
      "pref_system_e1pro_powerdisconectedstring",
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    aj = Utils.prefGetString(
      this,
      var1,
      "pref_system_batterylowstring",
      "pref_system_e1pro_batterylowstring",
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    ak = Utils.prefGetString(
      this,
      var1,
      "pref_system_batteryokstring",
      "pref_system_e1pro_batteryokstring",
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    al = Utils.prefGetString(
      this,
      var1,
      "pref_system_wifi_disconnectedstring",
      "pref_system_e1pro_wifi_disconnectedstring",
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    am = Utils.prefGetString(
      this,
      var1,
      "pref_system_wifi_connectedstring",
      "pref_system_e1pro_wifi_connectedstring",
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    an = Utils.prefGetBoolean(
      this,
      var1,
      "pref_system_wifi_connectedssid",
      "pref_system_e1pro_wifi_connectedssid",
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    aw = Utils.prefGetBoolean(this, var1, "pref_apps_enable", null as String?, var2, "_def")
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    ax = Utils.prefGetInt(this, var1, "pref_apps_stream", null as String?, var2, "_def")
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    ao = Utils.prefGetBoolean(this, var1, "pref_chime_enable", null as String?, var2, "_def")
    for (var3 in 0..23) {
      val var4: BooleanArray = aq
      val var5: String = String.format(Locale.US, "pref_chime_hourenable_%02d", var3)
      if (App.Companion.c) {
        var2 = "_morsedef"
      } else {
        var2 = "_voicedef"
      }
      var4[var3] = Utils.prefGetBoolean(this, var1, var5, null as String?, var2, "_def")
    }
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    ap = Utils.prefGetInt(
      this,
      var1,
      "pref_chime_stream",
      "pref_chime_e1pro_stream",
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    ar = Utils.prefGetString(
      this,
      var1,
      "pref_chime_string1",
      "pref_chime_e1pro_string1",
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    `as` = Utils.prefGetString(
      this,
      var1,
      "pref_chime_string2",
      "pref_chime_e1pro_string2",
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    at = Utils.prefGetInt(
      this,
      var1,
      "pref_chime_timehow",
      "pref_chime_e1pro_timehow",
      var2,
      "_def"
    )
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    au =
      Utils.prefGetBoolean(this, var1, "pref_reminders_enable", null as String?, var2, "_def")
    if (App.Companion.c) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    av = Utils.prefGetInt(this, var1, "pref_reminders_stream", null as String?, var2, "_def")
  }

  public override fun onBind(var1: Intent): IBinder? {
    log("ServiceMain.onBind")
    return null
  }

  public override fun onCreate() {
    super.onCreate()
    log("ServiceMain.OnCreate")
  }

  public override fun onDestroy() {
    log("ServiceMain.OnDestroy")
    super.onDestroy()
  }

  override fun onHandleIntent(var1: Intent?) {
    log("-----------------------------------------------------------------------------------------")
    log("ServiceMain.onHandleIntent")
    log("ServiceMain.onCreate registering broadcast receiver")
    val var2: LocalBroadcastManager = LocalBroadcastManager.getInstance(
      (this as Context?)!!
    )
    val var3: IntentFilter = IntentFilter()
    var3.addAction("LBR_ACTION_SETTINGSCHANGED")
    var2.registerReceiver(aG, var3)
    c()
    val var4: String?
    if (var1 != null) {
      var4 = var1.getStringExtra(getResources().getString(R.string.MSG_WHAT))
    } else {
      var4 = ""
    }
    var var10: String?
    if (var1 != null) {
      var10 = var1.getStringExtra(getResources().getString(R.string.MSG_EXTRATEXT1))
    } else {
      var10 = ""
    }
    val var9: String?
    if (var1 != null) {
      var9 = var1.getStringExtra(getResources().getString(R.string.MSG_EXTRATEXT2))
    } else {
      var9 = ""
    }
    val var5: Int
    if (var1 != null) {
      var5 = var1.getIntExtra(getResources().getString(R.string.MSG_EXTRAINT1), -1)
    } else {
      var5 = 0
    }
    val var6: Int
    if (var1 != null) {
      var6 = var1.getIntExtra(getResources().getString(R.string.MSG_EXTRAINT2), -1)
    } else {
      var6 = 0
    }
    var var8: String? = var10
    if (var10 == null) {
      var8 = ""
    }
    var10 = var9
    if (var9 == null) {
      var10 = ""
    }
    log(
      this,
      String.format(
        Locale.US,
        "ServiceMain.onHandleIntent What=%s extraT1=%s extraT2=%s extraI1=%d extraI2=%d",
        var4,
        var8,
        var10,
        var5,
        var6
      ) as String?
    )
    val var7: Boolean = var4!!.endsWith("_TEST")
    if (var7) {
      log("ServiceMain.onHandleIntent isTest=true")
    }
    if ((var4 == getResources().getString(R.string.MSG_MN_TEST))) {
      this.a(this.getString(R.string.test_message), 5, 1, true)
    } else if ((var4 == getResources().getString(R.string.MSG_MN_ACTIVITYMAIN))) {
      this.a()
    } else if ((var4 == getResources().getString(R.string.MSG_MN_STOP))) {
      log("ServiceMain.onHandleIntent MSG_MN_STOP")
    } else if (var4.startsWith(getResources().getString(R.string.MSG_CALL))) {
      this.a(var8, var7)
    } else if (var4.startsWith(getResources().getString(R.string.MSG_SMS))) {
      this.a(var8, var10, var7)
    } else if (var4.startsWith(getResources().getString(R.string.MSG_SYSTEM))) {
      this.b(var4, var10, var7)
    } else if (var4.startsWith(getResources().getString(R.string.MSG_CHIME))) {
      this.a(var5, var6, var7)
    } else if (var4.startsWith(getResources().getString(R.string.MSG_REMINDERS))) {
      this.a(var4, var8, var5, var6, var7)
    } else if (var4.startsWith(getResources().getString(R.string.MSG_APPS))) {
      this.b(var10, var7)
    }
    log("ServiceMain.onHandleIntent unregistering local BroadcastReceiver")
    LocalBroadcastManager.getInstance((this as Context?)!!).unregisterReceiver(
      aG
    )
    log(this, "ServiceMain.onHandleIntent OUT" as String?)
    log("-----------------------------------------------------------------------------------------")
  }

  companion object {
    private val a: IntArray = intArrayOf(4, 3, 5, 2, 1)
  }
}
