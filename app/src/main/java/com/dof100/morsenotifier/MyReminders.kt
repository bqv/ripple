package com.dof100.morsenotifier

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.dof100.morsenotifier.MyLog.log
import java.util.Locale

internal class MyReminders constructor(var1: Context?) {
  var a: ArrayList<*>

  init {
    log("MyReminders.constructor")
    a = ArrayList<Any?>()
    this.a(var1)
  }

  fun a(): MyReminder? {
    var var1: MyReminder? = null
    var var2: Long = Long.MAX_VALUE
    var var7: Long
    var var4: Int = 0
    while (var4 < a.size) {
      val var5: MyReminder = a.get(var4) as MyReminder
      var5.b()
      var var6: MyReminder? = var1
      var7 = var2
      if (var5.g >= 0L) {
        var6 = var1
        var7 = var2
        if (var2 > var5.g) {
          var7 = var5.g
          var6 = var5
        }
      }
      ++var4
      var1 = var6
      var2 = var7
    }
    return var1
  }

  fun a(var1: Context?) {
    val var5: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(var1)
    var var2: Int = 0
    val var3: Int = var5.getInt("reminders_n", 0)
    log(String.format(Locale.US, "MyReminders.load - loading %d entries", var3))
    a.clear()
    while (var2 < var3) {
      val var4: MyReminder = MyReminder()
      var4.a(var5, var2)
      a.add(var4)
      ++var2
    }
  }

  fun b(var1: Context?) {
    val var2: SharedPreferences.Editor =
      PreferenceManager.getDefaultSharedPreferences(var1).edit()
    val var3: Int = a.size
    val var5: Locale = Locale.US
    var var4: Int = 0
    log(String.format(var5, "MyReminders.save - saving %d entries", var3))
    var2.putInt("reminders_n", var3)
    while (var4 < var3) {
      (a.get(var4) as MyReminder).a(var2, var4)
      ++var4
    }
    var2.apply()
  }
}
