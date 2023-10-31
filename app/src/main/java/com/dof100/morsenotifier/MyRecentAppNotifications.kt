package com.dof100.morsenotifier

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.dof100.morsenotifier.MyLog.log
import java.util.Objects

internal class MyRecentAppNotifications constructor(var1: Context?) {
  val notifications: ArrayList<MyRecentAppNotification?> = ArrayList()
  private var enabled: Boolean = true

  init {
    log("MyRecentAppNotifications.constructor")
    load(var1)
  }

  private fun arrange() {
    var var1: StringBuilder = StringBuilder()
    var1.append("MyRecentAppNotifications.arrange - in (")
    var1.append(notifications.size)
    var1.append(") entries")
    log(var1.toString())
    if (!enabled) {
      notifications.clear()
    } else {
      val var2: Long = System.currentTimeMillis()
      val var4: MutableIterator<MyRecentAppNotification?> = notifications.iterator()
      while (var4.hasNext()) {
        if (Math.abs(var2 - (var4.next())!!.timestamp) > 86400000L) {
          var4.remove()
        }
      }
      while (notifications.size > 10) {
        notifications.removeAt(0)
      }
    }
    var1 = StringBuilder()
    var1.append("MyRecentAppNotifications.arrange - out (")
    var1.append(notifications.size)
    var1.append(") entries")
    log(var1.toString())
  }

  private fun save(var1: Context) {
    val var2: String = ("MyRecentAppNotifications.save (" +
        notifications.size +
        ") entries")
    log(var2)
    arrange()
    val var4: SharedPreferences.Editor =
      PreferenceManager.getDefaultSharedPreferences(var1).edit()
    var4.putInt("MyRecentAppNotifications_enable", if (enabled) 1 else 0)
    var4.putInt("MyRecentAppNotifications_n", notifications.size)
    var var3: Int = 0
    val var6: Iterator<MyRecentAppNotification?> = notifications.iterator()
    while (var6.hasNext()) {
      (var6.next())!!.save(var4, var3)
      ++var3
    }
    var4.apply()
    val var5: String = ("MyRecentAppNotifications.save saved " +
        notifications.size +
        " entries")
    log(var5)
  }

  fun addNotification(
    context: Context,
    var2: String?,
    var3: Int,
    var4: String?,
    var5: String?,
    var6: String?,
    var7: String?
  ): MyRecentAppNotification? {
    var var2: String? = var2
    log("MyRecentAppNotifications.addNotification")
    val now: Long = System.currentTimeMillis()
    val notifications: Iterator<MyRecentAppNotification?> = notifications.iterator()
    var var11: Boolean = false
    while (true) {
      var notification: MyRecentAppNotification?
      do {
        do {
          do {
            do {
              do {
                do {
                  do {
                    if (!notifications.hasNext()) {
                      notification = null
                      if (!var11) {
                        notification = MyRecentAppNotification()
                        notification.timestamp = now
                        if (var2 == null) {
                          var2 = ""
                        }
                        notification.b = var2
                        notification.c =
                          Objects.requireNonNullElse(var6, "")
                        notification.d =
                          Objects.requireNonNullElse(var7, "")
                        notification.e =
                          Objects.requireNonNullElse(var5, "")
                        notification.f =
                          Objects.requireNonNullElse(var4, "")
                        notification.g = var3
                        notification.h = -2
                        notification.i = -1
                        notification.j = ""
                        this.notifications.add(notification)
                      }
                      save(context)
                      return notification
                    }
                    notification = notifications.next()
                  } while (Math.abs(now - notification!!.timestamp) > 100L)
                } while (!(var2 == notification!!.b))
              } while (var3 != notification!!.g)
            } while (var4 != null && !(var4 == notification!!.f))
          } while (var6 != null && !(var6 == notification!!.c))
        } while (var7 != null && !(var7 == notification!!.d))
      } while (var5 != null && !(var5 == notification!!.e))
      var11 = true
    }
  }

  fun clear(var1: Context) {
    log("MyRecentAppNotifications.clear")
    notifications.clear()
    save(var1)
  }

  fun setEnable(var1: Context, var2: Boolean) {
    val var3: String = "MyRecentAppNotifications.setEnable " +
        var2
    log(var3)
    enabled = var2
    if (!enabled) {
      notifications.clear()
    }
    save(var1)
  }

  fun load(var1: Context?) {
    log("MyRecentAppNotifications.load")
    notifications.clear()
    val var2: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(var1)
    var var3: Int = var2.getInt("MyRecentAppNotifications_enable", 1)
    var var4: Int = 0
    val var5: Boolean
    var5 = var3 == 1
    enabled = var5
    var3 = var2.getInt("MyRecentAppNotifications_n", 1)
    while (var4 < var3) {
      val var6: MyRecentAppNotification = MyRecentAppNotification()
      var6.load(var2, var4)
      notifications.add(var6)
      ++var4
    }
    arrange()
    val var7: String = "MyRecentAppNotifications.load loaded " + notifications.size + " entries"
    log(var7)
  }

  companion object {
    fun n(var0: Context?): Int {
      return PreferenceManager.getDefaultSharedPreferences(var0)
        .getInt("MyRecentAppNotifications_n", 0)
    }
  }
}
