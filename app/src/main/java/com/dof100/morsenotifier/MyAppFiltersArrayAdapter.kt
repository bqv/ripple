package com.dof100.morsenotifier

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.TextView
import com.dof100.morsenotifier.MyLog.log
import java.util.Locale

internal class MyAppFiltersArrayAdapter constructor(
  context: Context,
  var2: MyAppNotificationFilters?,
  var3: Handler
) : ArrayAdapter<MyAppNotificationFilter?>(
  context,
  R.layout.activity_appfilters_listitem,
  var2!!.list
), View.OnClickListener {
  private val context: Context
  private val appNotificationFilters: MyAppNotificationFilters?
  private val layoutInflater: LayoutInflater
  private val d: Handler

  init {
    log("MyAppFiltersArrayAdapter.constructor")
    this.context = context
    appNotificationFilters = var2
    d = var3
    layoutInflater =
      this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
  }

  fun a() {
    insert(MyAppNotificationFilter(), appNotificationFilters!!.list.size)
    //TODO: this.appNotificationFilters.MyAppFilters(this.context);
    notifyDataSetChanged()
  }

  public override fun getView(var1: Int, var2: View?, var3: ViewGroup): View {
    log("MyAppFiltersArrayAdapter.getView position=" + var1 + "  v=" + var2)
    val var5: MyAppNotificationFilter? = appNotificationFilters!!.list.get(var1)
    var var8: View? = var2
    if (var2 == null) {
      var8 = layoutInflater.inflate(R.layout.activity_appfilters_listitem, var3, false)
    }
    var8!!.setTag(var5)
    val var6: TextView = var8.findViewById<View>(R.id.tv_info) as TextView
    var6.setTag(var5)
    var6.setText(String.format(Locale.US, "%d. %s", var1 + 1, var5!!.a(context)))
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
      log("MyAppFiltersArrayAdapter.onClick")
      val var2: MyAppNotificationFilter? = var1.getTag() as MyAppNotificationFilter?
      if (var2 == null) {
        log(context, "MyAppFiltersArrayAdapter.onClick ERROR f=null")
      } else {
        log("MyAppFiltersArrayAdapter.onClick f.package=${var2.a}")
        val var4: Int = appNotificationFilters!!.list.indexOf(var2)
        log("MyAppFiltersArrayAdapter.onClick index=$var4")
        val var5: String
        if (var1.getId() == R.id.b_delete) {
          var5 = "MyAppFiltersArrayAdapter.onClick b_delete"
        } else {
          if (var1.getId() != R.id.b_edit) {
            return
          }
          var5 = "MyAppFiltersArrayAdapter.onClick b_edit"
        }
        log(var5)
        d.handle(var2, var4, var1)
      }
    }
  }

  open interface Handler {
    fun handle(var1: MyAppNotificationFilter, var2: Int, var3: View)
  }
}
