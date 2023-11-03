package com.dof100.morsenotifier

import android.content.Context
import android.content.SharedPreferences
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import com.dof100.morsenotifier.MyLog.log
import java.util.Locale

class MyAppNotificationFilter constructor() {
  var a: String? = "All non-system apps"
  var b: String? = ""
  var c: String? = ""
  var d: String? = ""
  var e: String? = ""
  var f: Boolean = true
  var g: Boolean = false
  var h: Boolean = false
  var i: String? = ""
  var j: String? = ""

  private fun a() {
    a = "All non-system apps"
    b = ""
    c = ""
    d = ""
    e = ""
    f = true
    g = false
    h = false
    i = ""
    j = ""
  }

  private fun b(context: Context): String? {
    var ret: Byte
    run label47@{
      val var2: String? = a
      val var3: Int = var2.hashCode()
      if (var3 != 1354875300) {
        if (var3 != 1655429668) {
          if (var3 == 1804173745 && (var2 == "All apps")) {
            ret = 0
            return@label47
          }
        } else if ((var2 == "All non-system apps")) {
          ret = 2
          return@label47
        }
      } else if ((var2 == "All system apps")) {
        ret = 1
        return@label47
      }
      ret = -1
    }
    when (ret) {
      0.toByte() -> return "All apps"
      1.toByte() -> return "All system apps"
      2.toByte() -> return "All non-system apps"
      else -> {
        log(String.format("MyAppNotificationFilter.getAppName mPackage=%s", a))
        val packageManager: PackageManager? = context.getPackageManager()
        if (packageManager == null) {
          log("MyAppNotificationFilter.getAppName ERROR PackageManager=null")
          return a
        } else {
          var applicationInfo: ApplicationInfo?
          try {
            applicationInfo = packageManager.getApplicationInfo((a)!!, 0)
          } catch (var4: PackageManager.NameNotFoundException) {
            var4.printStackTrace()
            applicationInfo = null
          }
          if (applicationInfo == null) {
            return "-"
          } else {
            val appname: String? =
              packageManager.getApplicationLabel(applicationInfo) as String?
            if (appname == null) {
              return a
            } else {
              log(
                String.format(
                  "MyAppNotificationFilter.getAppName appname=%s",
                  appname
                )
              )
              return appname
            }
          }
        }
      }
    }
  }

  fun a(var1: Context): String? {
    var var2: String?
    var var9: Byte
    run label43@{
      var2 = a
      val var3: Int = var2.hashCode()
      if (var3 != 1354875300) {
        if (var3 != 1655429668) {
          if (var3 == 1804173745 && (var2 == "All apps")) {
            var9 = 0
            return@label43
          }
        } else if ((var2 == "All non-system apps")) {
          var9 = 2
          return@label43
        }
      } else if ((var2 == "All system apps")) {
        var9 = 1
        return@label43
      }
      var9 = -1
    }
    var var7: String?
    when (var9) {
      0.toByte() -> var7 = "Notifications from all apps"
      1.toByte() -> var7 = "Notifications from all android system apps"
      2.toByte() -> var7 = "Notifications from all non-android system apps"
      else -> {
        var7 = b(var1)
        var7 = "Notifications from ${var7!!.replace(".", ".\u200b")}"
      }
    }
    var var5: String?
    var var10: Array<Any?>
    var var11: StringBuilder
    var var12: Locale?
    run label33@{
      if (!b!!.isEmpty()) {
        val var4 = String.format(Locale.US, "$var7 that contain '%s'", b)
        var2 = var4
        if (!c!!.isEmpty()) {
          var11 = StringBuilder()
          var11.append(var4)
          var12 = Locale.US
          var5 = " and do not contain '%s'"
          var10 = arrayOf(c)
          return@label33
        }
      } else {
        var2 = var7
        if (!c!!.isEmpty()) {
          val var6 = StringBuilder()
          var6.append(var7)
          var12 = Locale.US
          var5 = " that do not contain '%s'"
          var10 = arrayOf(c)
          var11 = var6
          return@label33
        }
      }
      return var2
    }
    var11.append(String.format(var12, (var5)!!, *var10))
    return var11.toString()
  }

  fun a(var1: MyRecentAppNotification?): String {
    var var2: String?
    var var12: Byte
    run label157@{
      var2 = a
      val var3: Int = var2.hashCode()
      if (var3 != 1354875300) {
        if (var3 != 1655429668) {
          if (var3 == 1804173745 && (var2 == "All apps")) {
            var12 = 0
            return@label157
          }
        } else if ((var2 == "All non-system apps")) {
          var12 = 2
          return@label157
        }
      } else if ((var2 == "All system apps")) {
        var12 = 1
        return@label157
      }
      var12 = -1
    }
    var var15: Boolean
    run label148@{
      run label147@{
        when (var12) {
          0.toByte() -> return@label147
          1.toByte() -> if (var1!!.b!!.startsWith("com.android") || (var1.b == "android")) {
            return@label147
          }

          2.toByte() -> if (!var1!!.b!!.startsWith("com.android") && !(var1.b == "android")) {
            return@label147
          }

          else -> if ((a == var1!!.b)) {
            return@label147
          }
        }
        var15 = false
        return@label148
      }
      var15 = true
    }
    if (!var15) {
      return ""
    } else {
      log(
        String.format(
          Locale.US,
          "MyAppNotificationFilter.checkNotification package name OK (%s)",
          var1!!.b
        )
      )
      var2 = "${var1.c}${var1.d}${var1.e}"
      var var4: Array<String>
      var var5: Int
      var var6: Int
      var var7: Boolean
      if (b!!.isEmpty()) {
        log("MyAppNotificationFilter.checkNotification mCriteriaContains OK (empty)")
        var15 = true
      } else {
        var4 = b!!.lowercase(Locale.getDefault()).split(" or ".toRegex())
          .dropLastWhile({ it.isEmpty() }).toTypedArray()
        var5 = var4.size
        var6 = 0
        var7 = false
        while (true) {
          var15 = var7
          if (var6 >= var5) {
            break
          }
          val var8: String = var4.get(var6)
          if (var2!!.contains(var8.trim({ it <= ' ' }))) {
            log(
              String.format(
                Locale.US,
                "MyAppNotificationFilter.checkNotification mCriteriaContains OK (contains %s)",
                var8
              )
            )
            var7 = true
          }
          ++var6
        }
      }
      val var10: String
      if (!var15) {
        var10 = "MyAppNotificationFilter.checkNotification Filter does not match (contains)"
      } else {
        var var14: String?
        if (c!!.isEmpty()) {
          log("MyAppNotificationFilter.checkNotification mFilterContainsnot OK (empty)")
          var7 = var15
        } else {
          val var18: Array<String> =
            c!!.lowercase(Locale.getDefault()).split(" or ".toRegex())
              .dropLastWhile({ it.isEmpty() }).toTypedArray()
          var5 = var18.size
          var6 = 0
          while (true) {
            var7 = var15
            if (var6 >= var5) {
              break
            }
            var14 = var18.get(var6)
            if (var2!!.contains(var14.trim({ it <= ' ' }))) {
              log(
                String.format(
                  Locale.US,
                  "MyAppNotificationFilter.checkNotification mFilterContainsnot found (contasins %s)",
                  var14
                )
              )
              var15 = false
            }
            ++var6
          }
        }
        if (!var7) {
          var10 =
            "MyAppNotificationFilter.checkNotification Filter does not match (contains not)"
        } else {
          if (d!!.isEmpty()) {
            log("MyAppNotificationFilter.checkNotification mCriteriaAdvCategory OK (empty)")
          } else {
            var4 = d!!.lowercase(Locale.getDefault()).split(" or ".toRegex())
              .dropLastWhile({ it.isEmpty() }).toTypedArray()
            var5 = var4.size
            var6 = 0
            var15 = false
            while (true) {
              var7 = var15
              if (var6 >= var5) {
                break
              }
              var2 = var4.get(var6)
              var7 = var15
              if (var1.f != null) {
                var7 = var15
                if ((var1.f!!.lowercase(Locale.getDefault()) == var2!!.trim({ it <= ' ' }))) {
                  log(
                    String.format(
                      Locale.US,
                      "MyAppNotificationFilter.checkNotification mCriteriaAdvCategory found (cat=%s)",
                      var2
                    )
                  )
                  var7 = true
                }
              }
              ++var6
              var15 = var7
            }
          }
          if (!var7) {
            var10 =
              "MyAppNotificationFilter.checkNotification Filter does not match (category)"
          } else {
            var var17: Boolean
            if (e!!.isEmpty()) {
              log("MyAppNotificationFilter.checkNotification mCriteriaAdvID OK (empty)")
              var17 = var7
            } else {
              val var13: Array<String> =
                e!!.lowercase(Locale.getDefault()).split(" or ".toRegex())
                  .dropLastWhile({ it.isEmpty() }).toTypedArray()
              var5 = var13.size
              var var19: Int = 0
              var15 = false
              while (true) {
                var17 = var15
                if (var19 >= var5) {
                  break
                }
                var14 = var13.get(var19)
                run label102@{
                  try {
                    var6 = var14!!.trim({ it <= ' ' }).toInt()
                  } catch (var9: NumberFormatException) {
                    var9.printStackTrace()
                    return@label102
                  }
                  if (var1.g == var6) {
                    log(
                      String.format(
                        Locale.US,
                        "MyAppNotificationFilter.checkNotification mCriteriaAdvID found (id=%d)",
                        var6
                      )
                    )
                    var15 = true
                  }
                }
                ++var19
              }
            }
            if (var17) {
              log("MyAppNotificationFilter.checkNotification Filter matches OK")
              var2 = i
              var14 = var2
              if (f) {
                var14 = "${var2!!.trim({ it <= ' ' })} ${var1.c}"
              }
              var2 = var14
              if (g) {
                var2 = "${var14!!.trim({ it <= ' ' })} ${var1.d}"
              }
              var14 = var2
              if (h) {
                var14 = "${var2!!.trim({ it <= ' ' })} ${var1.e}"
              }
              return var14!!.trim({ it <= ' ' })
            }
            var10 =
              "MyAppNotificationFilter.checkNotification Filter does not match (id)"
          }
        }
      }
      log(var10)
      return ""
    }
  }

  fun a(var1: SharedPreferences.Editor, var2: Int) {
    log(
      String.format(
        Locale.US,
        "MyAppNotificationFilter.save - filter no %d, package  =%s",
        var2, a
      )
    )
    var1.putString("app_filter_${var2}_Package", a)
    var1.putString("app_filter_${var2}_CriteriaContains", b)
    var1.putString("app_filter_${var2}_CriteriaContainsNot", c)
    var1.putString("app_filter_${var2}_CriteriaCategory", d)
    var1.putString("app_filter_${var2}_CriteriaID", e)
    var1.putBoolean("app_filter_${var2}_SayTitle", f)
    var1.putBoolean("app_filter_${var2}_SayText", g)
    var1.putBoolean("app_filter_${var2}_SayTicker", h)
    var1.putString("app_filter_${var2}_mSayBefore", i)
    var1.putString("app_filter_${var2}_SayAfter", j)
    log(String.format(Locale.US, "MyAppNotificationFilter.save %d", var2))
    log(String.format(Locale.US, "MyAppNotificationFilter.save package    =%s", a))
    log(
      String.format(
        Locale.US,
        "MyAppNotificationFilter.save contains   =%s contains not=%s",
        b, c
      )
    )
    log(
      String.format(
        Locale.US,
        "MyAppNotificationFilter.save Say title  =%b text =%b ticker=%b",
        f, g, h
      )
    )
    log(String.format(Locale.US, "MyAppNotificationFilter.save Say before =%s after=%s", i, j))
  }

  fun a(var1: SharedPreferences, var2: Int) {
    this.a();
    a = var1.getString("app_filter_${var2}_Package", "All non-system apps")
    b = var1.getString("app_filter_${var2}_CriteriaContains", b)
    c = var1.getString("app_filter_${var2}_CriteriaContainsNot", c)
    d = var1.getString("app_filter_${var2}_CriteriaCategory", d)
    e = var1.getString("app_filter_${var2}_CriteriaID", e)
    f = var1.getBoolean("app_filter_${var2}_SayTitle", f)
    g = var1.getBoolean("app_filter_${var2}_SayText", g)
    h = var1.getBoolean("app_filter_${var2}_SayTicker", h)
    i = var1.getString("app_filter_${var2}_mSayBefore", i)
    j = var1.getString("app_filter_${var2}_SayAfter", j)
    log(
      String.format(
        Locale.US,
        "MyAppNotificationFilter.load - filter no %d, package  =%s",
        var2,
        a
      )
    )
  }
}
