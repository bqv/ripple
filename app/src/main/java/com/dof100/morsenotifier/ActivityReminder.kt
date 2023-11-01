package com.dof100.morsenotifier

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Build.VERSION
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TimePicker
import android.widget.ToggleButton
import com.dof100.morsenotifier.MyLog.log

class ActivityReminder constructor() : Activity(), View.OnClickListener {
  private var a: MyReminders? = null
  private var b: MyReminder? = null
  private val c: Array<ToggleButton?> = arrayOf(null, null, null, null, null, null, null)
  private var d: TimePicker? = null
  private var e: EditText? = null
  private var f: EditText? = null
  private var g: Spinner? = null
  private fun a() {
    log("ActivityReminder.onActionTest")
    c()
    val var1: Intent = Intent(this, ServiceMain::class.java)
    var1.putExtra(
      getResources().getString(R.string.MSG_WHAT),
      getResources().getString(R.string.MSG_REMINDERS_ONE_TEST)
    )
    var1.putExtra(getResources().getString(R.string.MSG_EXTRATEXT1), b!!.a())
    var1.putExtra(getResources().getString(R.string.MSG_EXTRATEXT2), "0")
    startService(var1)
  }

  private fun b() {
    log("ActivityReminder.object2view")
    for (var1 in 0..6) {
      c.get(var1)!!.setChecked(b!!.c.get(var1))
    }
    if (VERSION.SDK_INT < 23) {
      d!!.setCurrentHour(b!!.a)
      d!!.setCurrentMinute(b!!.b)
    } else {
      d!!.setHour(b!!.a)
      d!!.setMinute(b!!.b)
    }
    e!!.setText(b!!.e)
    f!!.setText(b!!.f)
    g!!.setSelection(b!!.d)
  }

  private fun c() {
    log("ActivityReminder.view2object")
    var var1: Int
    var1 = 0
    while (var1 < 7) {
      b!!.c[var1] = c.get(var1)!!.isChecked()
      ++var1
    }
    val var2: MyReminder?
    if (VERSION.SDK_INT < 23) {
      b!!.a = d!!.getCurrentHour()
      var2 = b
      var1 = d!!.getCurrentMinute()
    } else {
      b!!.a = d!!.getHour()
      var2 = b
      var1 = d!!.getMinute()
    }
    var2!!.b = var1
    b!!.e = e!!.getText().toString()
    b!!.f = f!!.getText().toString()
    b!!.d = g!!.getSelectedItemPosition()
    a!!.b(this)
    MyJob.Companion.scheduleNextReminder(this as Context?)
  }

  public override fun onClick(var1: View) {
    log("ActivityReminder.onClick")
    if (var1 != null) {
      if (var1.getId() == R.id.button_test) {
        a()
      }
    }
  }

  override fun onCreate(var1: Bundle?) {
    var var1: Bundle? = var1
    super.onCreate(var1)
    log("ActivityReminder.onCreate")
    this.setContentView(R.layout.activity_reminder)
    findViewById<Button>(R.id.button_test).setOnClickListener(this)
    a = MyReminders(this)
    var1 = getIntent().getExtras()
    var var2: Int
    if (var1 != null) {
      var2 = var1.getInt("OBJECTINDEX")
      b = a!!.a.get(var2) as MyReminder?
      log("ActivityReminder.onCreate loaded entry at position = $var2")
      var2 = R.string.title_activity_reminders
    } else {
      b = MyReminder().also {
        a!!.a.add(it)
      }
      var2 = a!!.a.size
      log("ActivityReminder.onCreate created new entry at position = ${var2 - 1}")
      var2 = R.string.title_activity_settings
    }
    this.setTitle(var2)
    c[0] = findViewById<ToggleButton>(R.id.tb_dow0)
    c[1] = findViewById<ToggleButton>(R.id.tb_dow1)
    c[2] = findViewById<ToggleButton>(R.id.tb_dow2)
    c[3] = findViewById<ToggleButton>(R.id.tb_dow3)
    c[4] = findViewById<ToggleButton>(R.id.tb_dow4)
    c[5] = findViewById<ToggleButton>(R.id.tb_dow5)
    c[6] = findViewById<ToggleButton>(R.id.tb_dow6)
    d = findViewById<TimePicker>(R.id.tp_hourmin)
    e = findViewById<EditText>(R.id.et_SayBefore)
    f = findViewById<EditText>(R.id.et_SayAfter)
    g = findViewById<Spinner>(R.id.sp_SayTime)
    d!!.setIs24HourView(true)
    b()
  }

  override fun onDestroy() {
    log("ActivityReminder.onDestroy")
    super.onDestroy()
  }

  override fun onPause() {
    log("ActivityReminder.onPause")
    c()
    super.onPause()
  }

  override fun onStop() {
    log("ActivityReminder.onStop")
    super.onStop()
  }
}
