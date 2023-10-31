package com.dof100.morsenotifier

import android.content.SharedPreferences
import com.dof100.morsenotifier.MyLog.log
import java.util.Locale

class MyRecentAppNotification constructor() {
  var timestamp: Long = -1L
  var b: String? = ""
  var c: String? = ""
  var d: String? = ""
  var e: String? = ""
  var f: String? = ""
  var g: Int = -1
  var h: Int = -1
  var i: Int = -1
  var j: String? = ""
  fun save(var1: SharedPreferences.Editor, var2: Int) {
    log(
      String.format(
        Locale.US,
        "MyRecentAppNotification_.save - notif no %d, package  =%s",
        var2,
        b
      )
    )
    var var3: StringBuilder = StringBuilder()
    var3.append("MyRecentAppNotification_")
    var3.append(var2)
    var3.append("_mDateTime")
    var1.putLong(var3.toString(), timestamp)
    var3 = StringBuilder()
    var3.append("MyRecentAppNotification_")
    var3.append(var2)
    var3.append("_mPackage")
    var1.putString(var3.toString(), b)
    var3 = StringBuilder()
    var3.append("MyRecentAppNotification_")
    var3.append(var2)
    var3.append("_mTitle")
    var1.putString(var3.toString(), c)
    var3 = StringBuilder()
    var3.append("MyRecentAppNotification_")
    var3.append(var2)
    var3.append("_mText")
    var1.putString(var3.toString(), d)
    var3 = StringBuilder()
    var3.append("MyRecentAppNotification_")
    var3.append(var2)
    var3.append("_mTicker")
    var1.putString(var3.toString(), e)
    var3 = StringBuilder()
    var3.append("MyRecentAppNotification_")
    var3.append(var2)
    var3.append("_mCategory")
    var1.putString(var3.toString(), f)
    var3 = StringBuilder()
    var3.append("MyRecentAppNotification_")
    var3.append(var2)
    var3.append("_mID")
    var1.putInt(var3.toString(), g)
    var3 = StringBuilder()
    var3.append("MyRecentAppNotification_")
    var3.append(var2)
    var3.append("_mAnnounced")
    var1.putInt(var3.toString(), h)
    var3 = StringBuilder()
    var3.append("MyRecentAppNotification_")
    var3.append(var2)
    var3.append("_tmpFilter")
    var1.putInt(var3.toString(), i)
    var3 = StringBuilder()
    var3.append("MyRecentAppNotification_")
    var3.append(var2)
    var3.append("_tmpAnnouncement")
    var1.putString(var3.toString(), j)
  }

  fun load(var1: SharedPreferences, var2: Int) {
    var var3: StringBuilder = StringBuilder()
    var3.append("MyRecentAppNotification_")
    var3.append(var2)
    var3.append("_mDateTime")
    timestamp = var1.getLong(var3.toString(), 0L)
    var3 = StringBuilder()
    var3.append("MyRecentAppNotification_")
    var3.append(var2)
    var3.append("_mPackage")
    b = var1.getString(var3.toString(), "")
    var3 = StringBuilder()
    var3.append("MyRecentAppNotification_")
    var3.append(var2)
    var3.append("_mTitle")
    c = var1.getString(var3.toString(), "")
    var3 = StringBuilder()
    var3.append("MyRecentAppNotification_")
    var3.append(var2)
    var3.append("_mText")
    d = var1.getString(var3.toString(), "")
    var3 = StringBuilder()
    var3.append("MyRecentAppNotification_")
    var3.append(var2)
    var3.append("_mTicker")
    e = var1.getString(var3.toString(), "")
    var3 = StringBuilder()
    var3.append("MyRecentAppNotification_")
    var3.append(var2)
    var3.append("_mCategory")
    f = var1.getString(var3.toString(), "")
    var3 = StringBuilder()
    var3.append("MyRecentAppNotification_")
    var3.append(var2)
    var3.append("_mID")
    g = var1.getInt(var3.toString(), -1)
    var3 = StringBuilder()
    var3.append("MyRecentAppNotification_")
    var3.append(var2)
    var3.append("_mAnnounced")
    h = var1.getInt(var3.toString(), -1)
    var3 = StringBuilder()
    var3.append("MyRecentAppNotification_")
    var3.append(var2)
    var3.append("_tmpFilter")
    i = var1.getInt(var3.toString(), -1)
    var3 = StringBuilder()
    var3.append("MyRecentAppNotification_")
    var3.append(var2)
    var3.append("_tmpAnnouncement")
    j = var1.getString(var3.toString(), "")
    log(
      String.format(
        Locale.US,
        "MyRecentAppNotification.load - notif no %d, package  =%s",
        var2,
        b
      )
    )
  }
}
