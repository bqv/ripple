package com.dof100.morsenotifier

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Spinner
import com.dof100.morsenotifier.MyLog.log
import com.dof100.morsenotifier.MyLog.toast
import java.util.Locale

class ActivityAppFilter constructor() : Activity() {
  private var a: MyAppFilters? = null
  private var b: MyAppNotificationFilters? = null
  private var c: MyAppNotificationFilter? = null
  private var d: Spinner? = null
  private var e: EditText? = null
  private var f: EditText? = null
  private var g: EditText? = null
  private var h: EditText? = null
  private var i: CheckBox? = null
  private var j: CheckBox? = null
  private var k: CheckBox? = null
  private var l: EditText? = null
  private var m: EditText? = null
  private fun a() {
    log("ActivityAppFilter.filter2view package=${c!!.a}")
    val var2: Int = a!!.a(c!!.a)
    log("ActivityAppFilter.filter2view package idx=$var2")
    d!!.post(object : Runnable {
      public override fun run() {
        if (var2 >= 0) {
          d!!.setSelection(var2)
        }
      }
    })
    e!!.setText(c!!.b)
    f!!.setText(c!!.c)
    g!!.setText(c!!.d)
    h!!.setText(c!!.e)
    i!!.setChecked(c!!.f)
    j!!.setChecked(c!!.g)
    k!!.setChecked(c!!.h)
    l!!.setText(c!!.i)
    m!!.setText(c!!.j)
  }

  private fun b() {
    val var1: Int = d!!.getSelectedItemPosition()
    c!!.a = a!!.mList[var1]!!.a
    log("ActivityAppFilter.view2filter idx=$var1 package=${c!!.a}")
    c!!.b = e!!.getText().toString()
    c!!.c = f!!.getText().toString()
    c!!.d = g!!.getText().toString()
    c!!.e = h!!.getText().toString()
    c!!.f = i!!.isChecked()
    c!!.g = j!!.isChecked()
    c!!.h = k!!.isChecked()
    c!!.i = l!!.getText().toString()
    c!!.j = m!!.getText().toString()
  }

  override fun onCreate(bundle: Bundle?) {
    var var1: Bundle? = bundle
    super.onCreate(var1)
    log("ActivityAppFilter.onCreate")
    this.setContentView(R.layout.activity_appfilter)
    c = null
    b = MyAppNotificationFilters(this)
    a = MyAppFilters(this)
    var1 = getIntent().getExtras()
    var var2: Int
    if (var1 != null) {
      var2 = var1.getInt("FILTERINDEX")
      if (var2 >= 0 && var2 < b!!.list.size) {
        c = b!!.list.get(var2)
        log("ActivityAppFilter.onCreate loaded filter at position = $var2")
      } else {
        val var4: Locale = Locale.US
        val var3: Int = var2 + 1
        toast(this, String.format(var4, "Filter %d not found", var3))
        log(this, String.format(Locale.US, "Filter %d not found", var3) as String?)
        finish()
      }
    } else {
      var2 = 0
    }
    if (c == null) {
      c = MyAppNotificationFilter().also {
        b!!.list.add(it)
      }
      var2 = b!!.list.size - 1
      log("ActivityAppFilter.onCreate created new filter at position = $var2")
    }
    this.setTitle(
      String.format(
        Locale.US,
        "%s %d",
        getResources().getString(R.string.activity_appfilter_filter),
        var2 + 1
      )
    )
    d = findViewById<View>(R.id.sp_AppName) as Spinner?
    d!!.adapter = ArrayAdapter<String?>(this, 17367048, a!!.a().map { it as String? }.toTypedArray()).apply {
      setDropDownViewResource(17367049)
    }
    e = findViewById<View>(R.id.et_criteria_Contains) as EditText?
    f = findViewById<View>(R.id.et_criteria_ContainsNot) as EditText?
    g = findViewById<View>(R.id.et_criteria_category) as EditText?
    h = findViewById<View>(R.id.et_criteria_id) as EditText?
    i = findViewById<View>(R.id.cb_SayTitle) as CheckBox?
    j = findViewById<View>(R.id.cb_SayText) as CheckBox?
    k = findViewById<View>(R.id.cb_SayTicker) as CheckBox?
    l = findViewById<View>(R.id.et_SayBefore) as EditText?
    m = findViewById<View>(R.id.et_SayAfter) as EditText?
    a()
  }

  override fun onDestroy() {
    log("ActivityAppFilter.onDestroy")
    super.onDestroy()
  }

  override fun onPause() {
    log("ActivityAppFilter.onPause")
    b()
    this.b!!.b(this);
    super.onPause()
  }

  override fun onStop() {
    log("ActivityAppFilter.onStop")
    super.onStop()
  }
}
