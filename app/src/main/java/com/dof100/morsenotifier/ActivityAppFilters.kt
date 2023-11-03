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

class ActivityAppFilters constructor() : Activity(), MyAppFiltersArrayAdapter.Handler {
  private var filters: MyAppNotificationFilters? = null
  private var adapter: MyAppFiltersArrayAdapter? = null
  private var listView: ListView? = null

  public override fun handle(filter: MyAppNotificationFilter, index: Int, view: View) {
    log("ActivityAppFilters.onRowButtonClick")
    if (view.getId() == R.id.b_delete) {
      log("ActivityAppFilters.onRowButtonClick b_delete")
      AlertDialog.Builder(this).apply {
        setTitle(R.string.uninstall_free_title)
        setMessage(R.string.title_activity_advanced)
        setPositiveButton(R.string.action_yes) { dialog: DialogInterface, _: Int ->
          adapter!!.remove(filter)
          filters!!.b(this@ActivityAppFilters);
          adapter!!.notifyDataSetChanged()
          listView!!.invalidate()
          dialog.dismiss()
        }
        setNegativeButton(R.string.action_no) { dialog: DialogInterface, _: Int ->
          dialog.dismiss()
        }
      }.create().show()
    } else if (view.getId() == R.id.b_edit) {
      log("ActivityAppFilters.onRowButtonClick b_edit")
      Intent(this, ActivityAppFilter::class.java).apply {
        putExtra("FILTERINDEX", index)
        startActivityForResult(this, 1)
      }
    }
  }

  override fun onActivityResult(code: Int, result: Int, intent: Intent?) {
    log("ActivityAppFilters.onActivityResult")
    if (code == 1) {
      if (result == -1) {
        log("ActivityAppFilters.onActivityResult OK")
      }
      if (result == 0) {
        log("ActivityAppFilters.onActivityResult CANCEL")
      }
      log("ActivityAppFilters.onActivityResult loadFilters")
      filters!!.a(this)
      adapter!!.notifyDataSetChanged()
      listView!!.invalidate()
    }
  }

  override fun onCreate(bundle: Bundle?) {
    super.onCreate(bundle)
    log("ActivityAppFilters.onCreate")
    filters = MyAppNotificationFilters(this).also {
      log("ActivityAppFilters.onCreate loadFilters")
      it.a(this)
    }
    adapter = MyAppFiltersArrayAdapter(this, filters, this)
    this.setContentView(R.layout.activity_appfilters)
    listView = findViewById<ListView>(R.id.lv_apps_select).apply {
      setAdapter(adapter)
      setOnItemClickListener { _: AdapterView<*>?, view: View, _: Int, _: Long ->
        log("ActivityAppFilters.onItemClick $view")
      }
    }
    findViewById<Button>(R.id.b_apps_select_add).setOnClickListener {
      log("ActivityAppFilters.onClick b_apps_select_add")
      adapter!!.a()
      Intent(this, ActivityAppFilter::class.java).apply {
        putExtra("FILTERINDEX", filters!!.list.size - 1)
        startActivityForResult(this, 1)
      }
    }
    findViewById<Button>(R.id.b_apps_select_checkrecent).setOnClickListener {
      log("ActivityRecentNotifications.onClick b_apps_select_checkrecent")
      Intent(this, ActivityRecentAppNotifications::class.java).apply {
        putExtra(
          getResources().getString(R.string.MSG_WHAT),
          getResources().getString(R.string.MSG_MN_ACTIVITYRECENTNOTIFICATIONS_START)
        )
        putExtra(getResources().getString(R.string.MSG_EXTRATEXT1), "")
        putExtra(getResources().getString(R.string.MSG_EXTRATEXT2), "")
      }
    }
  }
}
