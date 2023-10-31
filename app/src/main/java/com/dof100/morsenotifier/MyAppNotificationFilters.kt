package com.dof100.morsenotifier

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.dof100.morsenotifier.MyLog.log
import java.util.Locale

internal class MyAppNotificationFilters constructor(var1: Context?) {
  var list: ArrayList<MyAppNotificationFilter?>

  init {
    log("MyAppFilters.constructor")
    list = ArrayList()
    log("MyAppNotificationFilters.constructor load")
    a(var1)
  }

  fun a(var1: Context?) {
    val var2: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(var1)
    var var3: Int = 0
    val var4: Int = var2.getInt("app_filters_n", 0)
    log(String.format(Locale.US, "MyAppFilters.load - loading %d entries", var4))
    list.clear()
    while (var3 < var4) {
      val var5: MyAppNotificationFilter = MyAppNotificationFilter()
      var5.a(var2, var3)
      list.add(var5)
      ++var3
    }
  }

  fun b(var1: Context?) {
    val var5: SharedPreferences.Editor =
      PreferenceManager.getDefaultSharedPreferences(var1).edit()
    val var2: Int = list.size
    var5.putInt("app_filters_n", var2)
    val var3: Locale = Locale.US
    var var4: Int = 0
    log(String.format(var3, "MyAppFilters.save - saving %d entries", var2))
    while (var4 < var2) {
      list.get(var4)!!.a(var5, var4)
      ++var4
    }
    var5.apply()
  }

  companion object {
    fun c(var0: Context?): Int {
      return PreferenceManager.getDefaultSharedPreferences(var0).getInt("app_filters_n", 0)
    }
  }
}
