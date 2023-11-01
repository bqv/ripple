package com.dof100.morsenotifier

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView
import com.dof100.morsenotifier.MyLog.log
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

internal class MyRecentNotificationsArrayAdapter constructor(
  var1: Context,
  var2: ArrayList<*>?,
  private val b: MyAppNotificationFilters?,
  private val handler: Handler
) : ArrayAdapter<Any?>(var1, R.layout.activity_recent_notifications_listitem, (var2)!!),
  View.OnClickListener {
  private val context: Context
  private val c: LayoutInflater

  init {
    log("MyRecentNotificationsArrayAdapter.constructor")
    context = var1
    c = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
  }

  public override fun getView(var1: Int, var2: View?, var3: ViewGroup): View {
    var var1: Int = var1
    log("MyAppFiltersArrayAdapter.getView position=$var1  v=$var2")
    val var5: MyRecentAppNotification? = getItem(var1) as MyRecentAppNotification?
    var var12: MyRecentAppNotification? = var5
    if (var5 == null) {
      var12 = MyRecentAppNotification()
    }
    var12!!.i = -1
    var12.j = ""
    var1 = 0
    while (var1 < b!!.list.size) {
      val var13: String? = b.list.get(var1)!!.a(var12)
      if (!var13!!.isEmpty()) {
        var12.i = var1
        var12.j = var13
        break
      }
      ++var1
    }
    var var14: View? = var2
    if (var2 == null) {
      var14 = c.inflate(R.layout.activity_recent_notifications_listitem, var3, false)
    }
    var14!!.setTag(var12)
    val var6: TextView = var14.findViewById<View>(R.id.tv_recentnotification_time) as TextView
    var6.setTag(var12)
    val var9: SimpleDateFormat = SimpleDateFormat("dd MMM yyyy, hh:mm:ss:ssss", Locale.US)
    val var7: Calendar = Calendar.getInstance()
    var7.setTimeInMillis(var12.timestamp)
    var6.setText(var9.format(var7.getTime()))
    var var8: TextView = var14.findViewById<View>(R.id.tv_recentnotification_app) as TextView
    var8.setTag(var12)
    var8.setText(Utils.a(context, var12.b))
    var8 = var14.findViewById<View>(R.id.tv_recentnotification_package) as TextView
    var8.setTag(var12)
    var8.setText(String.format("(%s)", var12.b))
    var var11: TextView = var14.findViewById<View>(R.id.tv_recentnotification_title) as TextView
    var11.setTag(var12)
    var var10: String?
    if (var12.c != null && !var12.c!!.isEmpty()) {
      var10 = var12.c
    } else {
      var10 = "-"
    }
    var11.setText(var10)
    var11 = var14.findViewById<View>(R.id.tv_recentnotification_text) as TextView
    var11.setTag(var12)
    if (var12.d != null && !var12.d!!.isEmpty()) {
      var10 = var12.d
    } else {
      var10 = "-"
    }
    var11.setText(var10)
    var11 = var14.findViewById<View>(R.id.tv_recentnotification_ticker) as TextView
    var11.setTag(var12)
    if (var12.e != null && !var12.e!!.isEmpty()) {
      var10 = var12.e
    } else {
      var10 = "-"
    }
    var11.setText(var10)
    var11 = var14.findViewById<View>(R.id.tv_recentnotification_category) as TextView
    var11.setTag(var12)
    if (var12.f != null && !var12.f!!.isEmpty()) {
      var10 = var12.f
    } else {
      var10 = "-"
    }
    var var15: Context
    run label74@{
      run label73@{
        var11.setText(var10)
        var8 = var14.findViewById<View>(R.id.tv_recentnotification_id) as TextView
        var8.setTag(var12)
        var8.setText(String.format(Locale.US, "%d", var12.g))
        var11 = var14.findViewById<View>(R.id.tv_recentnotification_announced) as TextView
        var11.setTag(var12)
        when (var12.h) {
          -4 -> {
            var11.setTextColor(Color.YELLOW)
            var15 = context
            var1 = R.string.recentnotifications_announced_multiple
          }

          -3 -> {
            var11.setTextColor(Color.YELLOW)
            var15 = context
            var1 = R.string.recentnotifications_announced_identical
          }

          -2 -> {
            var11.setTextColor(Color.RED)
            var15 = context
            var1 = R.string.recentnotifications_announced_filters
          }

          -1 -> {
            var11.setTextColor(Color.RED)
            var10 = "Not announced (options)"
            return@label73
          }

          0 -> {
            var11.setTextColor(Color.GRAY)
            var15 = context
            var1 = R.string.recentnotifications_announced_waiting
          }

          1 -> {
            var11.setTextColor(Color.GREEN)
            var15 = context
            var1 = R.string.recentnotifications_announced_announced
          }

          else -> return@label74
        }
        var10 = var15.getString(var1)
      }
      var11.setText(var10)
    }
    var11 = var14.findViewById<View>(R.id.tv_recentnotification_matchingfilter) as TextView
    var11.setTag(var12)
    if (var12.i < 0) {
      var11.setTextColor(Color.CYAN)
      var15 = context
      var1 = R.string.recentnotifications_matchingfilter_nofilter
    } else {
      var11.setTextColor(Color.CYAN)
      var15 = context
      var1 = R.string.recentnotifications_matchingfilter_meets
    }
    var11.setText(var15.getString(var1))
    var8 = var14.findViewById<View>(R.id.tv_recentnotification_matchingfilternum) as TextView
    var8.setTag(var12)
    if (var12.i < 0) {
      var8.setText("")
      var8.setOnClickListener(null as View.OnClickListener?)
    } else {
      var8.setTextColor(Color.CYAN)
      var8.setPaintFlags(var8.getPaintFlags() or 8)
      var8.setText(
        String.format(
          Locale.US,
          context.getString(R.string.recentnotifications_matchingfilter_filter),
          var12.i + 1
        )
      )
      var8.setOnClickListener(this)
    }
    var11 = var14.findViewById<View>(R.id.tv_recentnotification_announcement) as TextView
    var11.setTag(var12)
    if (var12.i < 0) {
      var11.setTextColor(Color.RED)
      var10 = ""
    } else {
      var11.setTextColor(Color.CYAN)
      var10 = var12.j
    }
    var11.setText(var10)
    val var16: Button = var14.findViewById<View>(R.id.b_test) as Button
    var16.setTag(var12)
    if (var12.i >= 0) {
      var16.setOnClickListener(this)
      var16.setEnabled(true)
      return (var14)
    } else {
      var16.setOnClickListener(null as View.OnClickListener?)
      var16.setEnabled(false)
      return (var14)
    }
  }

  public override fun onClick(var1: View) {
    if (var1 != null) {
      log("MyRecentNotificationsArrayAdapter.onClick")
      val var2: MyRecentAppNotification? = var1.getTag() as MyRecentAppNotification?
      val var3: String
      if (var2 == null) {
        var3 = "MyRecentNotificationsArrayAdapter.onClick n=null"
      } else if (var2.i < 0) {
        var3 = "MyRecentNotificationsArrayAdapter.onClick tmpfilter<0"
      } else {
        if (var1.getId() != R.id.b_test) {
          if (var1.getId() == R.id.tv_recentnotification_matchingfilternum) {
            log("MyAppFiltersArrayAdapter.onClick tv_recentnotification_announcedcriteria")
            handler.onRowButtonClick(var2.i, var1)
          }
          return
        }
        log("MyRecentNotificationsArrayAdapter.onClick b_test")
        if (!var2.j!!.isEmpty()) {
          val var4: Intent = Intent(context, ServiceMain::class.java)
          var4.putExtra(
            context.getResources().getString(R.string.MSG_WHAT),
            context.getResources().getString(R.string.MSG_APPS_NOTIFY)
          )
          var4.putExtra(context.getResources().getString(R.string.MSG_EXTRATEXT2), var2.j)
          context.startService(var4)
          return
        }
        var3 = "MyRecentNotificationsArrayAdapter.onClick tmpAnnouncement.isEmpty"
      }
      log(var3)
    }
  }

  open interface Handler {
    fun onRowButtonClick(var1: Int, var2: View)
  }
}
