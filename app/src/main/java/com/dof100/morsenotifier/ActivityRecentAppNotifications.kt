package com.dof100.morsenotifier

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ListView
import com.dof100.morsenotifier.MyLog.log

class ActivityRecentAppNotifications : Activity(), View.OnClickListener,
  MyRecentNotificationsArrayAdapter.Handler {
  private var a: MyRecentAppNotifications? = null
  private var b: MyAppNotificationFilters? = null
  private var c: MyRecentNotificationsArrayAdapter? = null
  public override fun onRowButtonClick(var1: Int, var2: View) {
    log("ActivityRecentAppNotifications.onRowButtonClick")
    if (var2.getId() == R.id.tv_recentnotification_matchingfilternum) {
      log("ActivityAppFilters.onRowButtonClick tv_recentnotification_announcedcriteria")
      val var3: Intent = Intent(this, ActivityAppFilter::class.java)
      var3.putExtra("FILTERINDEX", var1)
      this.startActivityForResult(var3, 1)
    }
  }

  public override fun onClick(var1: View) {
    log("ActivityRecentNotifications.onClick")
    if (var1 != null) {
      if (var1.getId() == R.id.b_recentnotifications_clear) {
        log("ActivityRecentNotifications.onClick b_Clear")
        a!!.clear(this)
        c!!.clear()
        c!!.notifyDataSetChanged()
        App.Companion.d(this)
      } else {
        if (var1.getId() == R.id.b_recentnotifications_criteria) {
          log("ActivityRecentAppNotifications.onClick b_Criteria")
          val var2: Intent = Intent(this, ActivityAppFilters::class.java)
          var2.putExtra(
            getResources().getString(R.string.MSG_WHAT),
            getResources().getString(R.string.MSG_MN_ACTIVITYAPPFILTERS_START)
          )
          var2.putExtra(getResources().getString(R.string.MSG_EXTRATEXT1), "")
          var2.putExtra(getResources().getString(R.string.MSG_EXTRATEXT2), "")
          this.startActivity(var2)
        }
      }
    }
  }

  override fun onCreate(var1: Bundle?) {
    super.onCreate(var1)
    log("ActivityRecentAppNotifications.onCreate")
    b = MyAppNotificationFilters(this)
    log("ActivityRecentAppNotifications.onCreate loadfilters")
    b!!.a(this)
    a = MyRecentAppNotifications(this)
    c = MyRecentNotificationsArrayAdapter(this, a!!.notifications, b, this)
    this.setContentView(R.layout.activity_recent_notifications)
    (findViewById<View>(R.id.lv_recent_notifications) as ListView).setAdapter(
      c
    )
    (findViewById<View>(R.id.b_recentnotifications_clear) as Button).setOnClickListener(this)
    (findViewById<View>(R.id.b_recentnotifications_criteria) as Button).setOnClickListener(this)
  }

  public override fun onResume() {
    super.onResume()
    log("ActivityRecentAppNotifications.onResume loadfilters")
    b!!.a(this)
    c!!.notifyDataSetChanged()
  }
}
