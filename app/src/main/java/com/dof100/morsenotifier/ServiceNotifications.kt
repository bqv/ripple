package com.dof100.morsenotifier

import android.annotation.TargetApi
import android.app.Notification
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.SharedPreferences
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import android.os.Build.VERSION
import android.os.Bundle
import android.os.Handler
import android.os.IBinder
import android.preference.PreferenceManager
import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.dof100.morsenotifier.MyLog.log
import java.util.Locale

@TargetApi(21)
class ServiceNotifications constructor() : NotificationListenerService() {
  private var a: Boolean = false
  private var b: Int = 0
  private var c: Boolean = false
  private var d: Boolean = false
  private var e: Boolean = false
  private var f: MyRecentAppNotifications? = null
  private var g: MyAppNotificationFilters? = null
  private val h: BroadcastReceiver = object : BroadcastReceiver() {
    public override fun onReceive(var1: Context, var2: Intent) {
      if (("LBR_ACTION_RECENTNOTIFICATIONSCHANGED" == var2.getAction())) {
        log("ServiceNotifications.BroadcastReceiver got LBR_ACTION_RECENTNOTIFICATIONSCHANGED")
        f!!.load(this@ServiceNotifications)
      }
    }
  }
  private val i: Handler = Handler()
  private val j: Runnable = object : Runnable {
    public override fun run() {
      log("ServiceNotifications.rSendNotification handler")
      if (b()) {
        i.postDelayed(this, 3000L)
      }
    }
  }

  private fun a() {
    log(this, "ServiceNotifications.load_params")
    val var1: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
    var var2: String?
    if (App.Companion.morseMode) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    c = Utils.prefGetBoolean(this, var1, "pref_audio_enable", null as String?, var2, "_def")
    if (App.Companion.morseMode) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    d = Utils.prefGetBoolean(
      this,
      var1,
      "pref_audio_vibration_enable",
      null as String?,
      var2,
      "_def"
    )
    if (App.Companion.morseMode) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    e = Utils.prefGetBoolean(this, var1, "pref_display_enable", null as String?, var2, "_def")
    if (App.Companion.morseMode) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    a = Utils.prefGetBoolean(this, var1, "pref_apps_enable", null as String?, var2, "_def")
    if (App.Companion.morseMode) {
      var2 = "_morsedef"
    } else {
      var2 = "_voicedef"
    }
    b = Utils.prefGetInt(this, var1, "pref_apps_multiple", null as String?, var2, "_def")
    g!!.a(this)
  }

  private fun a(var1: MyRecentAppNotification) {
    log(this, "ServiceNotifications.notificationAnnounceNow Starting service")
    var1.h = 1
    val var2: Intent = Intent(this, ServiceMain::class.java)
    var2.putExtra(
      getResources().getString(R.string.MSG_WHAT),
      getResources().getString(R.string.MSG_APPS_NOTIFY)
    )
    var2.putExtra(getResources().getString(R.string.MSG_EXTRATEXT2), var1.j)
    startService(var2)
  }

  private fun b(): Boolean {
    val var1: Long = System.currentTimeMillis()
    log(this, "ServiceNotifications.notificationAnnounceCheckCandidates Queue length=${f!!.notifications.size}")
    val var4: Iterator<*> = f!!.notifications.iterator()
    var var5: Int = -1
    while (true) {
      label104@ while (true) {
        val var6: Boolean = var4.hasNext()
        var var7: Boolean = false
        var var12: MyRecentAppNotification
        var var18: Iterator<*>
        var var19: String?
        if (!var6) {
          var18 = f!!.notifications.iterator()
          var5 = 0
          while (var18.hasNext()) {
            var12 = var18.next() as MyRecentAppNotification
            log("ServiceNotifications.notificationAnnounceCheckCandidates for 3")
            if (var12.h == 0) {
              ++var5
            }
          }
          if (var5 > 0) {
            var19 = String.format(
              Locale.US,
              "ServiceNotifications.notificationAnnounceCheckCandidates Still %d notifications waiting",
              var5
            )
          } else {
            var19 =
              "ServiceNotifications.notificationAnnounceCheckCandidates No more notifications waiting"
          }
          log(this, var19 as String?)
          if (var5 > 0) {
            var7 = true
          }
          return var7
        }
        val var8: MyRecentAppNotification = var4.next() as MyRecentAppNotification
        val var9: Int = var5 + 1
        log(
          this,
          String.format(
            Locale.US,
            "ServiceNotifications.notificationAnnounceCheckCandidates n%d: checking",
            var9
          ) as String?
        )
        if (var8.h != 0) {
          var5 = var9
        } else {
          val var10: Long = var1 - var8.timestamp
          if (var10 < 3000L) {
            var5 = var9
          } else {
            log(
              this,
              String.format(
                Locale.US,
                "ServiceNotifications.notificationAnnounceCheckCandidates n%d: waiting expired (dt=%d msec)",
                var9,
                var10
              ) as String?
            )
            var18 = f!!.notifications.iterator()
            var5 = -1
            var var13: Int
            var var22: Boolean
            while (true) {
              if (var18.hasNext()) {
                var12 = var18.next() as MyRecentAppNotification
                var13 = var5 + 1
                if (!(var12.b == var8.b)) {
                  var5 = var13
                  continue
                }
                if (var12.h != 0) {
                  var5 = var13
                  continue
                }
                var5 = var13
                if (var1 - var12.timestamp >= 3000L) {
                  continue
                }
                log(
                  this,
                  String.format(
                    Locale.US,
                    "ServiceNotifications.notificationAnnounceCheckCandidates n%d: found n%d still waiting ",
                    var9,
                    var13
                  ) as String?
                )
                var22 = true
                break
              }
              var22 = false
              break
            }
            if (var22) {
              var19 = String.format(
                Locale.US,
                "ServiceNotifications.notificationAnnounceCheckCandidates n%d: found other still waiting ",
                var9
              )
            } else {
              log(
                this,
                String.format(
                  Locale.US,
                  "ServiceNotifications.notificationAnnounceCheckCandidates n%d: searching for best notification ",
                  var9
                ) as String?
              )
              val var14: Iterator<*> = f!!.notifications.iterator()
              var var20: MyRecentAppNotification? = null
              var13 = -1
              var5 = Int.MAX_VALUE
              while (true) {
                while (var14.hasNext()) {
                  val var15: MyRecentAppNotification =
                    var14.next() as MyRecentAppNotification
                  log(
                    this,
                    "ServiceNotifications.notificationAnnounceCheckCandidates for"
                  )
                  val var16: Int = var13 + 1
                  if (var15.h != 0) {
                    var13 = var16
                  } else if (!(var15.b == var8.b)) {
                    var13 = var16
                  } else {
                    var15.h = -4
                    var var17: Array<Any>
                    var var21: Locale?
                    var var23: String?
                    when (b) {
                      1 -> {
                        var13 = var16
                        if (var15.i >= var5) {
                          continue
                        }
                        var5 = var15.i
                        var21 = Locale.US
                        var23 =
                          "ServiceNotifications.notificationAnnounceCheckCandidates n%d: found best match = n%d, filter=%d"
                        var17 = arrayOf(var9, var16, var5)
                      }

                      2 -> {
                        var13 = var16
                        if (var20 != null) {
                          continue
                        }
                        var5 = var15.i
                        var21 = Locale.US
                        var23 =
                          "ServiceNotifications.notificationAnnounceCheckCandidates n%d: first = n%d, filter=%d"
                        var17 = arrayOf(var9, var16, var5)
                      }

                      3 -> {
                        var5 = var15.i
                        var21 = Locale.US
                        var23 =
                          "ServiceNotifications.notificationAnnounceCheckCandidates n%d: last = n%d, filter=%d"
                        var17 = arrayOf(var9, var16, var5)
                      }

                      else -> {
                        var13 = var16
                        continue
                      }
                    }
                    log(this, String.format(var21, var23, *var17) as String?)
                    var20 = var15
                    var13 = var16
                  }
                }
                if (var20 == null) {
                  var19 =
                    "ServiceNotifications.notificationAnnounceCheckCandidates ERROR nBest==null"
                } else {
                  if (var5 >= 0) {
                    this.a(var20)
                    var5 = var9
                    continue@label104
                  }
                  var19 =
                    "ServiceNotifications.notificationAnnounceCheckCandidates ERROR filterBest<0"
                }
                break
              }
            }
            log(this, var19)
            var5 = var9
          }
        }
      }
    }
  }

  public override fun onBind(var1: Intent): IBinder? {
    log(this, "ServiceNotifications.onBind")
    return super.onBind(var1)
  }

  public override fun onCreate() {
    super.onCreate()
    log(this, "ServiceNotifications.OnCreate")
    f = MyRecentAppNotifications(this)
    g = MyAppNotificationFilters(this)
    this.a()
    val var1: IntentFilter = IntentFilter()
    var1.addAction("LBR_ACTION_RECENTNOTIFICATIONSCHANGED")
    LocalBroadcastManager.getInstance((this as Context?)!!).registerReceiver(
      h, var1
    )
  }

  public override fun onDestroy() {
    log(this, "ServiceNotifications.OnDestroy")
    log("ServiceMain.OnDestroy unregistering local BroadcastReceiver")
    LocalBroadcastManager.getInstance((this as Context?)!!).unregisterReceiver(
      h
    )
    super.onDestroy()
  }

  public override fun onInterruptionFilterChanged(var1: Int) {
    log(this, "ServiceNotifications.onInterruptionFilterChanged")
  }

  public override fun onListenerConnected() {
    log(this, "ServiceNotifications.onListenerConnected")
  }

  public override fun onListenerDisconnected() {
    log(this, "ServiceNotifications.onListenerDisconnected")
  }

  public override fun onListenerHintsChanged(var1: Int) {
    log(this, "ServiceNotifications.onListenerHintsChanged")
  }

  @TargetApi(19)
  public override fun onNotificationPosted(var1: StatusBarNotification) {
    log(this, "ServiceNotifications.onNotificationPosted")
    var var2: String? = var1.getPackageName()
    val var3: Notification = var1.getNotification()
    val var4: CharSequence? = var3.tickerText
    var var5: String? = null
    var var6: String? = null
    var var12: String?
    if (var4 != null) {
      var12 = var3.tickerText.toString()
    } else {
      var12 = null
    }
    run label81@{
      if (VERSION.SDK_INT >= 19) {
        val var7: Bundle? = var3.extras
        if (var7 != null) {
          var5 = var7.getString("android.title")
          val var14: CharSequence? = var7.getCharSequence("android.text")
          if (var14 != null) {
            var6 = var14.toString()
          }
          return@label81
        }
        log(this, "ServiceNotifications.onNotificationPosted Extras=null")
      }
      var6 = null
    }
    var var16: String? = var2
    if (var2 == null) {
      var16 = ""
    }
    var2 = var12
    if (var12 == null) {
      var2 = ""
    }
    var12 = var5
    if (var5 == null) {
      var12 = ""
    }
    var5 = var6
    if (var6 == null) {
      var5 = ""
    }
    val var15: PackageManager? = getPackageManager()
    if (var15 != null) {
      try {
        val var8: ApplicationInfo = var15.getApplicationInfo((var16)!!, 0)
        log(
          this,
          String.format(
            Locale.US,
            "ServiceNotifications.onNotificationPosted App Name   = %s",
            var15.getApplicationLabel(var8)
          ) as String?
        )
      } catch (var10: PackageManager.NameNotFoundException) {
        log("ServiceNotifications.onNotificationPosted ERROR NameNotFoundException")
      }
    }
    log(
      this,
      String.format(
        Locale.US,
        "ServiceNotifications.onNotificationPosted Package    = %s",
        var16
      ) as String?
    )
    log(
      this,
      String.format(
        Locale.US,
        "ServiceNotifications.onNotificationPosted Ticker   = %s",
        var2
      ) as String?
    )
    log(
      this,
      String.format(
        Locale.US,
        "ServiceNotifications.onNotificationPosted Title    = %s",
        var12
      ) as String?
    )
    log(
      this,
      String.format(
        Locale.US,
        "ServiceNotifications.onNotificationPosted Text     = %s",
        var5
      ) as String?
    )
    log(
      this,
      String.format(
        Locale.US,
        "ServiceNotifications.onNotificationPosted isClearable  = %s",
        var1.isClearable()
      ) as String?
    )
    log(
      this,
      String.format(
        Locale.US,
        "ServiceNotifications.onNotificationPosted isOngoing  = %s",
        var1.isOngoing()
      ) as String?
    )
    log(
      this,
      String.format(
        Locale.US,
        "ServiceNotifications.onNotificationPosted flags    = %d",
        var3.flags
      ) as String?
    )
    log(
      this,
      String.format(
        Locale.US,
        "ServiceNotifications.onNotificationPosted when     = %d",
        var3.`when`
      ) as String?
    )
    var6 = ""
    if (VERSION.SDK_INT >= 21) {
      var6 = var3.category
    }
    val var13: MyRecentAppNotification? = f!!.addNotification(
      getApplicationContext(),
      var16,
      var1.getId(),
      var6,
      var2,
      var12,
      var5
    )
    if (var13 == null) {
      log(
        this,
        "ServiceNotifications.onNotificationPosted duplicate notification found"
      )
    } else {
      this.a()
      if (!a) {
        var13.h = -1
      } else if (!c && !e && !d) {
        var13.h = -1
      } else {
        var13.h = -2
        for (var9 in g!!.list.indices) {
          log("ServiceNotifications.onNotificationPosted for 1")
          val var11: String? = g!!.list.get(var9)!!.a(var13)
          if (!var11!!.isEmpty()) {
            var13.i = var9
            var13.j = var11
            if (b == 0) {
              log(
                this,
                String.format(
                  Locale.US,
                  "ServiceNotifications.onNotificationPosted match with filter %d. Announcing right now",
                  var9
                ) as String?
              )
              var13.h = 1
              this.a(var13)
              return
            }
            log(
              this,
              String.format(
                Locale.US,
                "ServiceNotifications.onNotificationPosted match with filter %d. Adding to queue for announcement",
                var9
              ) as String?
            )
            var13.h = 0
            i.removeCallbacks(j)
            i.postDelayed(j, 3000L)
            return
          }
        }
      }
    }
  }

  public override fun onNotificationRankingUpdate(var1: RankingMap) {
    log(this, "ServiceNotifications.onNotificationRankingUpdate")
  }

  public override fun onNotificationRemoved(var1: StatusBarNotification) {
    log(this, "ServiceNotifications.onNotificationRemoved")
  }
}
