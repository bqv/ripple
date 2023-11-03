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
  private val context: Context,
  private val appNotificationFilters: MyAppNotificationFilters,
  private val handler: Handler
) : ArrayAdapter<MyAppNotificationFilter>(
  context, R.layout.activity_appfilters_listitem, appNotificationFilters!!.list
), View.OnClickListener {
  private val layoutInflater: LayoutInflater

  init {
    log("MyAppFiltersArrayAdapter.constructor")
    layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
  }

  fun addNew() {
    insert(MyAppNotificationFilter(), appNotificationFilters!!.list.size)
    appNotificationFilters.b(this.context);
    notifyDataSetChanged()
  }

  public override fun getView(position: Int, view: View?, viewGroup: ViewGroup): View {
    log("MyAppFiltersArrayAdapter.getView position=$position  v=$view")
    val filter: MyAppNotificationFilter? = appNotificationFilters!!.list[position]
    var rootView: View = (view ?: layoutInflater.inflate(R.layout.activity_appfilters_listitem, viewGroup, false)).apply {
      setTag(filter)
    }
    rootView.findViewById<TextView>(R.id.tv_info)!!.apply {
      setTag(filter)
      setText(String.format(Locale.US, "%d. %s", position + 1, filter!!.a(context)))
    }
    rootView.findViewById<ImageButton>(R.id.b_edit)!!.apply {
      setTag(filter)
      setOnClickListener(this@MyAppFiltersArrayAdapter)
    }
    rootView.findViewById<ImageButton>(R.id.b_delete)!!.apply {
      setTag(filter)
      setOnClickListener(this@MyAppFiltersArrayAdapter)
    }
    return rootView
  }

  public override fun onClick(view: View) {
    if (view != null) {
      log("MyAppFiltersArrayAdapter.onClick")
      val filter: MyAppNotificationFilter? = view.getTag() as MyAppNotificationFilter?
      if (filter == null) {
        log(context, "MyAppFiltersArrayAdapter.onClick ERROR f=null")
      } else {
        log("MyAppFiltersArrayAdapter.onClick f.package=${filter.a}")
        val index: Int = appNotificationFilters!!.list.indexOf(filter)
        log("MyAppFiltersArrayAdapter.onClick index=$index")
        log(if (view.getId() == R.id.b_delete) {
          "MyAppFiltersArrayAdapter.onClick b_delete"
        } else {
          if (view.getId() != R.id.b_edit) return
          "MyAppFiltersArrayAdapter.onClick b_edit"
        })
        handler.handle(filter, index, view)
      }
    }
  }

  open interface Handler {
    fun handle(filter: MyAppNotificationFilter, index: Int, view: View)
  }
}
