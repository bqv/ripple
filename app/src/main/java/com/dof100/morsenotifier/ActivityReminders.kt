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

class ActivityReminders constructor() : Activity(), View.OnClickListener,
  MyRemindersArrayAdapter.a {
  private var a: MyReminders? = null
  private var b: MyRemindersArrayAdapter? = null
  private var c: ListView? = null
  public override fun a(var1: MyReminder, var2: Int, var3: View) {
    log("ActivityReminders.onRowButtonClick")
    if (var3.getId() == R.id.b_delete) {
      log("ActivityReminders.onRowButtonClick b_delete")
      val var5: AlertDialog.Builder = AlertDialog.Builder(this)
      var5.setTitle(R.string.uninstall_free_title)
      var5.setMessage(R.string.title_activity_advanced)
      var5.setPositiveButton(R.string.action_yes, object : DialogInterface.OnClickListener {
        public override fun onClick(var1x: DialogInterface, var2: Int) {
          b!!.remove(var1)
          a!!.b(this@ActivityReminders)
          b!!.notifyDataSetChanged()
          MyJob.Companion.scheduleNextReminder(this@ActivityReminders as Context?)
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
        log("ActivityReminders.onRowButtonClick b_edit")
        val var4: Intent = Intent(this, ActivityReminder::class.java)
        var4.putExtra("OBJECTINDEX", var2)
        this.startActivityForResult(var4, 1)
      }
    }
  }

  override fun onActivityResult(var1: Int, var2: Int, var3: Intent) {
    log("ActivityReminders.onActivityResult")
    if (var1 == 1) {
      if (var2 == -1) {
        log("ActivityReminders.onActivityResult OK")
      }
      if (var2 == 0) {
        log("ActivityReminders.onActivityResult CANCEL")
      }
      log("ActivityReminders.onActivityResult loadFilters")
      a!!.a(this)
      b!!.notifyDataSetChanged()
      c!!.invalidate()
    }
  }

  public override fun onClick(var1: View) {
    log("ActivityReminders.onClick")
    if (var1 != null) {
      if (var1.getId() == R.id.b_reminders_select_add) {
        log("ActivityReminders.onClick b_Add")
        this.startActivityForResult(Intent(this, ActivityReminder::class.java), 1)
      }
    }
  }

  override fun onCreate(var1: Bundle?) {
    super.onCreate(var1)
    log("ActivityReminders.onCreate")
    a = MyReminders(this)
    log("ActivityReminders.onCreate load")
    a!!.a(this)
    b = MyRemindersArrayAdapter(this, a, this)
    this.setContentView(R.layout.activity_reminders)
    c = findViewById<View>(R.id.lv_reminders_select) as ListView?
    c!!.setAdapter(b)
    c!!.setOnItemClickListener(object : OnItemClickListener {
      public override fun onItemClick(
        var1: AdapterView<*>?,
        var2: View,
        var3: Int,
        var4: Long
      ) {
        val var6: StringBuilder = StringBuilder()
        var6.append("ActivityReminders.onItemClick ")
        var6.append(var2)
        log(var6.toString())
      }
    })
    (findViewById<View>(R.id.b_reminders_select_add) as Button).setOnClickListener(this)
  }
}
