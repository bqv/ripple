package com.dof100.morsenotifier

import android.content.Context
import android.content.SharedPreferences
import com.dof100.morsenotifier.MyLog.log
import java.util.Calendar
import java.util.Locale

class MyReminder {
  var a = 0
  var b = 0
  val c = booleanArrayOf(true, true, true, true, true, true, true)
  var d = 1
  var e: String? = ""
  var f: String? = ""
  var g: Long = 0

  init {
    d()
  }

  private fun d() {
    a = 7
    var var1 = 0
    b = 0
    while (var1 < 7) {
      c[var1] = true
      ++var1
    }
    d = 1
    e = ""
    f = ""
  }

  fun a(): String? {
    var var1: String? = ""
    var var2 = var1
    if (e != null) {
      var2 = var1
      if (!e!!.isEmpty()) {
        var2 = e
      }
    }
    var1 = var2
    var var7: StringBuilder
    if (d == 1) {
      run label28@{
        val var3: StringBuilder
        val var4: Locale
        val var5: String
        val var6: Array<Any>
        if (App.Companion.d) {
          if (b == 0) {
            val var8 = StringBuilder()
            var8.append(var2)
            var8.append(" ")
            var1 = String.format(Locale.US, "%02d hundred", a)
            var7 = var8
            return@label28
          }
          var3 = StringBuilder()
          var3.append(var2)
          var3.append(" ")
          var4 = Locale.US
          var5 = "%02d %02d"
          var6 = arrayOf(a, b)
          var7 = var3
        } else {
          var3 = StringBuilder()
          var3.append(var2)
          var3.append(" ")
          var4 = Locale.US
          var5 = "%02d%02d"
          var6 = arrayOf(a, b)
          var7 = var3
        }
        var1 = String.format(var4, var5, *var6)
      }
      var7.append(var1)
      var1 = var7.toString()
    }
    var2 = var1
    if (f != null) {
      var2 = var1
      if (!f!!.isEmpty()) {
        var7 = StringBuilder()
        var7.append(var1)
        var7.append(" ")
        var7.append(f)
        var2 = var7.toString()
      }
    }
    return var2
  }

  fun a(var1: Context): String {
    var var2 = 0
    var var3: Int
    var var4: Int
    var3 = 0
    while (var2 < 7) {
      var4 = var3
      if (c[var2]) {
        var4 = var3 + 1
      }
      ++var2
      var3 = var4
    }
    var var5 = ""
    val var7: String
    if (var3 == 0) {
      var7 = "no days set"
    } else if (var3 == 7) {
      var7 = "everyday"
    } else if (var3 == 2 && c[0] && c[6]) {
      var7 = "weekends"
    } else {
      var var8: StringBuilder
      if (c[0]) {
        var8 = StringBuilder()
        var8.append("")
        var8.append(var1.resources.getString(R.string.activity_reminder_dow0))
        var8.append(", ")
        var5 = var8.toString()
      }
      var var6 = var5
      var var9: StringBuilder
      if (c[1]) {
        var9 = StringBuilder()
        var9.append(var5)
        var9.append(var1.resources.getString(R.string.activity_reminder_dow1))
        var9.append(", ")
        var6 = var9.toString()
      }
      var5 = var6
      if (c[2]) {
        var8 = StringBuilder()
        var8.append(var6)
        var8.append(var1.resources.getString(R.string.activity_reminder_dow2))
        var8.append(", ")
        var5 = var8.toString()
      }
      var6 = var5
      if (c[3]) {
        var9 = StringBuilder()
        var9.append(var5)
        var9.append(var1.resources.getString(R.string.activity_reminder_dow3))
        var9.append(", ")
        var6 = var9.toString()
      }
      var5 = var6
      if (c[4]) {
        var8 = StringBuilder()
        var8.append(var6)
        var8.append(var1.resources.getString(R.string.activity_reminder_dow4))
        var8.append(", ")
        var5 = var8.toString()
      }
      var6 = var5
      if (c[5]) {
        var9 = StringBuilder()
        var9.append(var5)
        var9.append(var1.resources.getString(R.string.activity_reminder_dow5))
        var9.append(", ")
        var6 = var9.toString()
      }
      if (c[6]) {
        var8 = StringBuilder()
        var8.append(var6)
        var8.append(var1.resources.getString(R.string.activity_reminder_dow6))
        var7 = var8.toString()
      } else {
        var7 = var6
      }
    }
    var5 = var7
    if (var7.length > 3) {
      var5 = var7
      if (var7[var7.length - 2] == ',') {
        var5 = var7.substring(0, var7.length - 2)
      }
    }
    return String.format(Locale.US, "%02d:%02d, %s. %s", a, b, var5, c())
  }

  fun a(var1: SharedPreferences.Editor, var2: Int) {
    val var3 = Locale.US
    var var4 = 0
    log(String.format(var3, "MyReminder.save - no %d", var2))
    var var5 = StringBuilder()
    var5.append("reminder_")
    var5.append(var2)
    var5.append("_TimeHour")
    var1.putInt(var5.toString(), a)
    var5 = StringBuilder()
    var5.append("reminder_")
    var5.append(var2)
    var5.append("_TimeMin")
    var1.putInt(var5.toString(), b)
    while (var4 < 7) {
      var5 = StringBuilder()
      var5.append("reminder_")
      var5.append(var2)
      var5.append("_DoW")
      var5.append(var4)
      var1.putBoolean(var5.toString(), c[var4])
      ++var4
    }
    var5 = StringBuilder()
    var5.append("reminder_")
    var5.append(var2)
    var5.append("_SayTime")
    var1.putInt(var5.toString(), d)
    var5 = StringBuilder()
    var5.append("reminder_")
    var5.append(var2)
    var5.append("_SayBefore")
    var1.putString(var5.toString(), e)
    var5 = StringBuilder()
    var5.append("reminder_")
    var5.append(var2)
    var5.append("_SayAfter")
    var1.putString(var5.toString(), f)
  }

  fun a(var1: SharedPreferences, var2: Int) {
    d()
    var var3 = StringBuilder()
    var3.append("reminder_")
    var3.append(var2)
    var3.append("_TimeHour")
    a = var1.getInt(var3.toString(), a)
    var3 = StringBuilder()
    var3.append("reminder_")
    var3.append(var2)
    var3.append("_TimeMin")
    b = var1.getInt(var3.toString(), b)
    for (var4 in 0..6) {
      val var5 = c
      var3 = StringBuilder()
      var3.append("reminder_")
      var3.append(var2)
      var3.append("_DoW")
      var3.append(var4)
      var5[var4] = var1.getBoolean(var3.toString(), c[var4])
    }
    var3 = StringBuilder()
    var3.append("reminder_")
    var3.append(var2)
    var3.append("_SayTime")
    d = var1.getInt(var3.toString(), d)
    var3 = StringBuilder()
    var3.append("reminder_")
    var3.append(var2)
    var3.append("_SayBefore")
    e = var1.getString(var3.toString(), e)
    var3 = StringBuilder()
    var3.append("reminder_")
    var3.append(var2)
    var3.append("_SayAfter")
    f = var1.getString(var3.toString(), f)
  }

  fun b() {
    val var1: Byte = 0
    var var2 = 0
    var var3: Int
    var var4: Int
    var3 = 0
    while (var2 < 7) {
      var4 = var3
      if (c[var2]) {
        var4 = var3 + 1
      }
      ++var2
      var3 = var4
    }
    if (var3 == 0) {
      g = -1L
    } else {
      val var5 = Calendar.getInstance()
      var2 = var5[7]
      val var6 = Calendar.getInstance()
      var6[11] = a
      var6[12] = b
      var6[13] = 0
      g = var6.timeInMillis - var5.timeInMillis
      var3 = var1.toInt()
      do {
        if (c[(var2 - 1 + var3) % 7] && g > 0L) {
          return
        }
        var4 = var3 + 1
        var6.add(10, 24)
        g = var6.timeInMillis - var5.timeInMillis
        var3 = var4
      } while (var4 <= 8)
      g = -1L
    }
  }

  fun c(): String {
    b()
    return if (g < 0L) {
      ""
    } else {
      var var1 = ((g.toDouble() + 60000.0) / 8.64E7).toInt()
      var var2 = var1
      if (var1 < 2) {
        var2 = 0
      }
      val var3 = g.toDouble()
      val var5 = var2.toDouble() * 1000.0 * 60.0 * 60.0 * 24.0
      var var7 = ((var3 + 60000.0 - var5) / 3600000.0).toInt()
      var1 = var7
      if (var7 < 2) {
        var1 = var7
        if (var2 == 0) {
          var1 = 0
        }
      }
      var7 =
        ((g.toDouble() + 60000.0 - var5 - var1.toDouble() * 1000.0 * 60.0 * 60.0) / 60000.0).toInt()
      var var8 = ""
      var var13: StringBuilder
      if (var2 > 0) {
        var13 = StringBuilder()
        var13.append("")
        var13.append(String.format(Locale.US, "%d days", var2))
        var8 = var13.toString()
      }
      var var9: String
      var var14: StringBuilder
      run label42@{
        val var10: StringBuilder
        val var11: Locale
        val var12: String
        val var15: Array<Any>
        if (var1 > 1) {
          var9 = var8
          if (!var8.isEmpty()) {
            var14 = StringBuilder()
            var14.append(var8)
            var14.append(", ")
            var9 = var14.toString()
          }
          var10 = StringBuilder()
          var10.append(var9)
          var11 = Locale.US
          var12 = "%d hours"
          var15 = arrayOf(var1)
          var14 = var10
        } else {
          var9 = var8
          if (var1 != 1) {
            return@label42
          }
          var9 = var8
          if (!var8.isEmpty()) {
            var14 = StringBuilder()
            var14.append(var8)
            var14.append(", ")
            var9 = var14.toString()
          }
          var10 = StringBuilder()
          var10.append(var9)
          var11 = Locale.US
          var12 = "%d hour"
          var15 = arrayOf(var1)
          var14 = var10
        }
        var14.append(String.format(var11, var12, *var15))
        var9 = var14.toString()
      }
      var8 = var9
      if (var7 > 0) {
        var8 = var9
        if (!var9.isEmpty()) {
          var13 = StringBuilder()
          var13.append(var9)
          var13.append(" and ")
          var8 = var13.toString()
        }
        var14 = StringBuilder()
        var14.append(var8)
        var14.append(String.format(Locale.US, "%d min", var7))
        var8 = var14.toString()
      }
      var14 = StringBuilder()
      var14.append("Due ")
      var14.append(var8)
      var14.append(" from now.")
      var14.toString()
    }
  }
}
