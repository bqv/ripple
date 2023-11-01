package com.dof100.morsenotifier

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.TextView
import com.dof100.morsenotifier.MyLog.log

internal class MyRemindersArrayAdapter constructor(var1: Context, var2: MyReminders?, var3: Handler) :
  ArrayAdapter<MyReminder>(var1, R.layout.activity_reminders_listitem, var2!!.a), View.OnClickListener {
  private val context: Context
  private val b: MyReminders?
  private val c: LayoutInflater
  private val d: Handler

  init {
    log("MyRemindersArrayAdapter.constructor")
    context = var1
    b = var2
    d = var3
    c = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
  }

  public override fun getView(var1: Int, var2: View?, var3: ViewGroup): View {
    log("MyRemindersArrayAdapter.getView position=$var1  v=$var2")
    val var5: MyReminder = b!!.a.get(var1) as MyReminder
    var var8: View? = var2
    if (var2 == null) {
      var8 = c.inflate(R.layout.activity_reminders_listitem, var3, false)
    }
    var8!!.setTag(var5)
    val var6: TextView = var8.findViewById<View>(R.id.tv_info) as TextView
    var6.setTag(var5)
    var6.setText(var5.a(context))
    var var7: ImageButton = var8.findViewById<View>(R.id.b_edit) as ImageButton
    var7.setTag(var5)
    var7.setOnClickListener(this)
    var7 = var8.findViewById<View>(R.id.b_delete) as ImageButton
    var7.setTag(var5)
    var7.setOnClickListener(this)
    return (var8)
  }

  public override fun onClick(var1: View) {
    if (var1 != null) {
      log("MyRemindersArrayAdapter.onClick")
      val var2: MyReminder? = var1.getTag() as MyReminder?
      if (var2 == null) {
        log(context, "MyRemindersArrayAdapter.onClick ERROR f=null")
      } else {
        val var3: Int = b!!.a.indexOf(var2)
        log("MyRemindersArrayAdapter.onClick index=$var3")
        val var5: String
        if (var1.getId() == R.id.b_delete) {
          var5 = "MyRemindersArrayAdapter.onClick b_delete"
        } else {
          if (var1.getId() != R.id.b_edit) {
            return
          }
          var5 = "MyRemindersArrayAdapter.onClick b_edit"
        }
        log(var5)
        d.onRowButtonClick(var2, var3, var1)
      }
    }
  }

  open interface Handler {
    fun onRowButtonClick(var1: MyReminder, var2: Int, var3: View)
  }
}
