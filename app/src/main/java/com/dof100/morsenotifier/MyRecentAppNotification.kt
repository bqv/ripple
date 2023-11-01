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
        var2, b
      )
    )
    var1.putLong("MyRecentAppNotification_${var2}_mDateTime", timestamp)
    var1.putString("MyRecentAppNotification_${var2}_mPackage", b)
    var1.putString("MyRecentAppNotification_${var2}_mTitle", c)
    var1.putString("MyRecentAppNotification_${var2}_mText", d)
    var1.putString("MyRecentAppNotification_${var2}_mTicker", e)
    var1.putString("MyRecentAppNotification_${var2}_mCategory", f)
    var1.putInt("MyRecentAppNotification_${var2}_mID", g)
    var1.putInt("MyRecentAppNotification_${var2}_mAnnounced", h)
    var1.putInt("MyRecentAppNotification_${var2}_tmpFilter", i)
    var1.putString("MyRecentAppNotification_${var2}_tmpAnnouncement", j)
  }

  fun load(var1: SharedPreferences, var2: Int) {
    timestamp = var1.getLong("MyRecentAppNotification_${var2}_mDateTime", 0L)
    b = var1.getString("MyRecentAppNotification_${var2}_mPackage", "")
    c = var1.getString("MyRecentAppNotification_${var2}_mTitle", "")
    d = var1.getString("MyRecentAppNotification_${var2}_mText", "")
    e = var1.getString("MyRecentAppNotification_${var2}_mTicker", "")
    f = var1.getString("MyRecentAppNotification_${var2}_mCategory", "")
    g = var1.getInt("MyRecentAppNotification_${var2}_mID", -1)
    h = var1.getInt("MyRecentAppNotification_${var2}_mAnnounced", -1)
    i = var1.getInt("MyRecentAppNotification_${var2}_tmpFilter", -1)
    j = var1.getString("MyRecentAppNotification_${var2}_tmpAnnouncement", "")
    log(
      String.format(
        Locale.US,
        "MyRecentAppNotification.load - notif no %d, package  =%s",
        var2, b
      )
    )
  }
}
