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
  private var filters: MyAppNotificationFilters? = null
  private var adapter: MyAppFiltersArrayAdapter? = null
  private var listView: ListView? = null

  public override fun handle(var1: MyAppNotificationFilter, index: Int, view: View) {
    log("ActivityAppFilters.onRowButtonClick")
    if (view.getId() == R.id.b_delete) {
      log("ActivityAppFilters.onRowButtonClick b_delete")
      AlertDialog.Builder(this).apply {
        setTitle(R.string.uninstall_free_title)
        setMessage(R.string.title_activity_advanced)
        setPositiveButton(R.string.action_yes, object : DialogInterface.OnClickListener {
          public override fun onClick(dialog: DialogInterface, var2: Int) {
            adapter!!.remove(var1)
            //TODO: ActivityAppFilters.this.filters.MyAppFilters(ActivityAppFilters.this);
            adapter!!.notifyDataSetChanged()
            listView!!.invalidate()
            dialog.dismiss()
          }
        })
        setNegativeButton(R.string.action_no, object : DialogInterface.OnClickListener {
          public override fun onClick(dialog: DialogInterface, var2: Int) {
            dialog.dismiss()
          }
        })
        create().show()
      }
    } else {
      if (view.getId() == R.id.b_edit) {
        log("ActivityAppFilters.onRowButtonClick b_edit")
        this.startActivityForResult(Intent(this, ActivityAppFilter::class.java).apply {
          putExtra("FILTERINDEX", index)
        }, 1)
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

  public override fun onClick(view: View) {
    log("ActivityAppFilters.onClick")
    if (view != null) {
      if (view.getId() == R.id.b_apps_select_add) {
        log("ActivityAppFilters.onClick b_apps_select_add")
        adapter!!.a()
        this.startActivityForResult(Intent(this, ActivityAppFilter::class.java).apply {
          putExtra("FILTERINDEX", filters!!.list.size - 1)
        }, 1)
      } else {
        if (view.getId() == R.id.b_apps_select_checkrecent) {
          log("ActivityRecentNotifications.onClick b_apps_select_checkrecent")
          this.startActivity(Intent(this, ActivityRecentAppNotifications::class.java).apply {
            putExtra(
              getResources().getString(R.string.MSG_WHAT),
              getResources().getString(R.string.MSG_MN_ACTIVITYRECENTNOTIFICATIONS_START)
            )
            putExtra(getResources().getString(R.string.MSG_EXTRATEXT1), "")
            putExtra(getResources().getString(R.string.MSG_EXTRATEXT2), "")
          })
        }
      }
    }
  }

  override fun onCreate(bundle: Bundle?) {
    super.onCreate(bundle)
    log("ActivityAppFilters.onCreate")
    filters = MyAppNotificationFilters(this)
    log("ActivityAppFilters.onCreate loadFilters")
    filters!!.a(this)
    adapter = MyAppFiltersArrayAdapter(this, filters, this)
    this.setContentView(R.layout.activity_appfilters)
    findViewById<ListView>(R.id.lv_apps_select).apply {
      setAdapter(adapter)
      setOnItemClickListener(object : OnItemClickListener {
        public override fun onItemClick(
          var1: AdapterView<*>?, view: View, var3: Int, var4: Long
        ) {
          log("ActivityAppFilters.onItemClick $view")
        }
      })
    }
    findViewById<Button>(R.id.b_apps_select_add).setOnClickListener(this)
    findViewById<Button>(R.id.b_apps_select_checkrecent).setOnClickListener(this)
  }
}
