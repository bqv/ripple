package com.dof100.morsenotifier

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.Button
import android.widget.LinearLayout
import com.dof100.morsenotifier.MyLog.log
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.Locale

class ActivityHTML : Activity(), View.OnClickListener {
  private var a: Button? = null
  override fun onClick(var1: View) {
    log("ActivityDisplayMessage.onClick")
    if (var1 != null) {
      if (var1 == a) {
        finish()
      }
    }
  }

  override fun onCreate(var1: Bundle?) {
    super.onCreate(var1)
    val var2 = this.intent
    var var3: String?
    var var4: String?
    var var15: String?
    var var16: String?
    run label91@{
      run label95@{
        run label89@{
          run label88@{
            try {
              var3 = var2.extras!!.getString("TITLE")
            } catch (var14: Exception) {
              var3 = null
              return@label88
            }
            try {
              var4 = var2.extras!!.getString("FILENAME")
              return@label89
            } catch (var13: Exception) {
            }
          }
          var4 = null
          var15 = null
          return@label95
        }
        try {
          var15 = var2.extras!!.getString("VERTICALALIGN")
        } catch (var12: Exception) {
          var15 = null
          return@label95
        }
        try {
          var16 = var2.extras!!.getString("BUTTONOKCAPTION")
          return@label91
        } catch (var11: Exception) {
        }
      }
      var16 = null
    }
    var var5 = var3
    if (var3 == null) {
      var5 = ""
    }
    var var6 = var4
    if (var4 == null) {
      var6 = ""
    }
    var3 = var15
    if (var15 == null) {
      var3 = "top"
    }
    this.title = var5
    val var21 = LinearLayout(this)
    var21.layoutParams = LinearLayout.LayoutParams(-1, -1)
    var21.orientation = LinearLayout.VERTICAL
    val var22 = WebView(this)
    var var17 = LinearLayout.LayoutParams(-1, 0)
    var17.weight = 1.0f
    var22.layoutParams = var17
    var22.setBackgroundColor(Color.parseColor("#000000"))
    var21.addView(var22)
    if (var16 != null) {
      a = Button(this)
      a!!.setText(R.string.action_ok)
      var17 = LinearLayout.LayoutParams(-2, -2)
      a!!.layoutParams = var17
      var17.gravity = 17
      var21.addView(a)
      a!!.setOnClickListener(this)
    }
    if (var6!!.lowercase(Locale.getDefault()).endsWith(".html")) {
      var var18 = ""
      run label65@{
        var var10000: IOException
        run label64@{
          var var10001: Boolean
          val var19: BufferedReader
          try {
            val var7 = this.assets.open(var6!!)
            val var23 = InputStreamReader(var7, "UTF-8")
            var19 = BufferedReader(var23)
          } catch (var10: IOException) {
            var10000 = var10
            var10001 = false
            return@label64
          }
          while (true) {
            try {
              var6 = var19.readLine()
            } catch (var9: IOException) {
              var10000 = var9
              var10001 = false
              break
            }
            if (var6 == null) {
              return@label65
            }
            try {
              var18 = var6!!
            } catch (var8: IOException) {
              var10000 = var8
              var10001 = false
              break
            }
          }
        }
        val var20 = var10000
        var20.printStackTrace()
      }
      var15 = var18.replace("[APPNAME]", App.e!!).replace("[APPVERSION]", App.f!!)
        .replace("[VERTICALALIGN]", var3!!).replace("[APPPLAYSTORE]", App.l!!)
        .replace("[APPPLAYSTOREPRO]", App.m!!)
      var15 = if (App.b) {
        Utils.XMLDo(Utils.XMLDo(var15!!, "FREE", 1), "PRO", 2)
      } else {
        Utils.XMLDo(Utils.XMLDo(var15!!, "FREE", 2), "PRO", 1)
      }
      var22.loadDataWithBaseURL("", var15!!, "text/html", "UTF-8", "")
    }
    this.setContentView(var21)
  }
}
