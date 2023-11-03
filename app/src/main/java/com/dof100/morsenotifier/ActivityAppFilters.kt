package com.dof100.morsenotifier

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.Button
import android.widget.ListView
import com.dof100.morsenotifier.MyLog.log

class ActivityAppFilters : Activity() {
  private val filters: MyAppNotificationFilters by lazy {
    MyAppNotificationFilters(this).also {
      log("ActivityAppFilters.onCreate loadFilters")
      it.a(this)
    }
  }
  private lateinit var listView: ListView

  private val arrayHandler: MyAppFiltersArrayAdapter.Handler =
    object : MyAppFiltersArrayAdapter.Handler {
      override fun handle(filter: MyAppNotificationFilter, index: Int, view: View) {
        log("ActivityAppFilters.onRowButtonClick")
        if (view.id == R.id.b_delete) {
          log("ActivityAppFilters.onRowButtonClick b_delete")
          AlertDialog.Builder(this@ActivityAppFilters).apply {
            setTitle(R.string.uninstall_free_title)
            setMessage(R.string.title_activity_advanced)
            setPositiveButton(R.string.action_yes) { dialog: DialogInterface, _: Int ->
              adapter.remove(filter)
              filters.b(this@ActivityAppFilters)
              adapter.notifyDataSetChanged()
              listView.invalidate()
              dialog.dismiss()
            }
            setNegativeButton(R.string.action_no) { dialog: DialogInterface, _: Int ->
              dialog.dismiss()
            }
          }.create().show()
        } else if (view.id == R.id.b_edit) {
          log("ActivityAppFilters.onRowButtonClick b_edit")
          Intent(this@ActivityAppFilters, ActivityAppFilter::class.java).apply {
            putExtra("FILTERINDEX", index)
            startActivityForResult(this, 1)
          }
        }
      }
    }
  private val adapter: MyAppFiltersArrayAdapter by lazy {
    MyAppFiltersArrayAdapter(this, filters, arrayHandler)
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
      filters.a(this)
      adapter.notifyDataSetChanged()
      listView.invalidate()
    }
  }

  override fun onCreate(bundle: Bundle?) {
    super.onCreate(bundle)
    log("ActivityAppFilters.onCreate")
    this.setContentView(R.layout.activity_appfilters)
    listView = findViewById<ListView>(R.id.lv_apps_select).apply {
      this.adapter = this@ActivityAppFilters.adapter
      log("ActivityAppFilters.adapter count ${this@ActivityAppFilters.adapter.count}")
      setOnItemClickListener { _: AdapterView<*>?, view: View, _: Int, _: Long ->
        log("ActivityAppFilters.onItemClick $view")
      }
    }
    findViewById<Button>(R.id.b_apps_select_add).setOnClickListener {
      log("ActivityAppFilters.onClick b_apps_select_add")
      adapter.addNew()
      Intent(this, ActivityAppFilter::class.java).apply {
        putExtra("FILTERINDEX", filters.list.size - 1)
        startActivityForResult(this, 1)
      }
    }
    findViewById<Button>(R.id.b_apps_select_checkrecent).setOnClickListener {
      log("ActivityRecentNotifications.onClick b_apps_select_checkrecent")
      Intent(this, ActivityRecentAppNotifications::class.java).apply {
        putExtra(
          resources.getString(R.string.MSG_WHAT),
          resources.getString(R.string.MSG_MN_ACTIVITYRECENTNOTIFICATIONS_START)
        )
        putExtra(resources.getString(R.string.MSG_EXTRATEXT1), "")
        putExtra(resources.getString(R.string.MSG_EXTRATEXT2), "")
      }
    }
  }
}
