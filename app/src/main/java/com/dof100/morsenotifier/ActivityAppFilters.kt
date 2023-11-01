package com.dof100.morsenotifier

import android.app.Activity
import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.Button
import android.widget.ListView
import com.dof100.morsenotifier.MyLog.log

class ActivityAppFilters constructor() : Activity(), View.OnClickListener,
  MyAppFiltersArrayAdapter.Handler {
  private var a: MyAppNotificationFilters? = null
  private var b: MyAppFiltersArrayAdapter? = null
  private var c: ListView? = null
  public override fun handle(var1: MyAppNotificationFilter, var2: Int, var3: View) {
    log("ActivityAppFilters.onRowButtonClick")
    if (var3.getId() == R.id.b_delete) {
      log("ActivityAppFilters.onRowButtonClick b_delete")
      val var5: AlertDialog.Builder = AlertDialog.Builder(this)
      var5.setTitle(R.string.uninstall_free_title)
      var5.setMessage(R.string.title_activity_advanced)
      var5.setPositiveButton(R.string.action_yes, object : DialogInterface.OnClickListener {
        public override fun onClick(var1x: DialogInterface, var2: Int) {
          b!!.remove(var1)
          //TODO: ActivityAppFilters.this.a.MyAppFilters(ActivityAppFilters.this);
          b!!.notifyDataSetChanged()
          c!!.invalidate()
          var1x.dismiss()
        }
      })
      var5.setNegativeButton(R.string.action_no, object : DialogInterface.OnClickListener {
        public override fun onClick(var1: DialogInterface, var2: Int) {
          var1.dismiss()
        }
      })
      var5.create().show()
    } else {
      if (var3.getId() == R.id.b_edit) {
        log("ActivityAppFilters.onRowButtonClick b_edit")
        val var4: Intent = Intent(this, ActivityAppFilter::class.java)
        var4.putExtra("FILTERINDEX", var2)
        this.startActivityForResult(var4, 1)
      }
    }
  }

  override fun onActivityResult(var1: Int, var2: Int, var3: Intent) {
    log("ActivityAppFilters.onActivityResult")
    if (var1 == 1) {
      if (var2 == -1) {
        log("ActivityAppFilters.onActivityResult OK")
      }
      if (var2 == 0) {
        log("ActivityAppFilters.onActivityResult CANCEL")
      }
      log("ActivityAppFilters.onActivityResult loadFilters")
      a!!.a(this)
      b!!.notifyDataSetChanged()
      c!!.invalidate()
    }
  }

  public override fun onClick(var1: View) {
    log("ActivityAppFilters.onClick")
    if (var1 != null) {
      val var2: Intent
      if (var1.getId() == R.id.b_apps_select_add) {
        log("ActivityAppFilters.onClick b_apps_select_add")
        b!!.a()
        var2 = Intent(this, ActivityAppFilter::class.java)
        var2.putExtra("FILTERINDEX", a!!.list.size - 1)
        this.startActivityForResult(var2, 1)
      } else {
        if (var1.getId() == R.id.b_apps_select_checkrecent) {
          log("ActivityRecentNotifications.onClick b_apps_select_checkrecent")
          var2 = Intent(this, ActivityRecentAppNotifications::class.java)
          var2.putExtra(
            getResources().getString(R.string.MSG_WHAT),
            getResources().getString(R.string.MSG_MN_ACTIVITYRECENTNOTIFICATIONS_START)
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
    log("ActivityAppFilters.onCreate")
    a = MyAppNotificationFilters(this)
    log("ActivityAppFilters.onCreate loadFilters")
    a!!.a(this)
    b = MyAppFiltersArrayAdapter(this, a, this)
    this.setContentView(R.layout.activity_appfilters)
    c = findViewById<ListView>(R.id.lv_apps_select)
    c!!.setAdapter(b)
    c!!.setOnItemClickListener(object : OnItemClickListener {
      public override fun onItemClick(
        var1: AdapterView<*>?,
        var2: View,
        var3: Int,
        var4: Long
      ) {
        log("ActivityAppFilters.onItemClick $var2")
      }
    })
    findViewById<Button>(R.id.b_apps_select_add).setOnClickListener(this)
    findViewById<Button>(R.id.b_apps_select_checkrecent).setOnClickListener(this)
  }
}
