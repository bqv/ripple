package com.dof100.morsenotifier

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import androidx.core.content.edit
import com.dof100.morsenotifier.MyLog.log
import java.util.Locale

internal class MyAppNotificationFilters constructor(context: Context?) {
  var list = ArrayList<MyAppNotificationFilter>()

  init {
    log("MyAppNotificationFilters.constructor load")
    a(context)
  }

  fun a(context: Context?) {
    val sharedPrefs = PreferenceManager.getDefaultSharedPreferences(context)
    var i: Int = 0
    val count: Int = sharedPrefs.getInt("app_filters_n", 0)
    log(String.format(Locale.US, "MyAppFilters.load - loading %d entries", count))
    list.clear()
    while (i < count) {
      list.add(MyAppNotificationFilter().also {
        it.a(sharedPrefs, i++)
      })
    }
  }

  fun b(context: Context?) {
    PreferenceManager.getDefaultSharedPreferences(context).edit {
      putInt("app_filters_n", list.size)
      var i: Int = 0
      log(String.format(Locale.US, "MyAppFilters.save - saving %d entries", list.size))
      while (i < list.size) {
        list[i]!!.a(this, i++)
      }
    }
  }

  companion object {
    fun c(var0: Context?): Int {
      return PreferenceManager.getDefaultSharedPreferences(var0).getInt("app_filters_n", 0)
    }
  }
}
