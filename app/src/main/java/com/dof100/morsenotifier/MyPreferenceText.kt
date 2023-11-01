package com.dof100.morsenotifier

import android.content.Context
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.net.Uri
import android.os.Build.VERSION
import android.preference.Preference
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import com.dof100.morsenotifier.MyLog.log
import java.util.Locale

class MyPreferenceText(var1: Context, var2: AttributeSet) : Preference(var1, var2) {
  private val c: Context
  private var d = true
  private val e: String
  private val f: String
  private val g: String
  private var h: String? = null
  private var i: Boolean
  private var j: Boolean
  private var k: TextView?
  private var l: String

  init {
    var var3 = 0
    i = false
    j = true
    k = null
    l = ""
    c = var1
    this.isSelectable = false
    e = Utils.a(var1, var2, "http://mypreferencenamespace.100dof.com", "buttonIntentClass", "")
    f = Utils.a(var1, var2, "http://mypreferencenamespace.100dof.com", "buttonMsgWhat", "0")
    g = Utils.a(
      var1,
      var2,
      "http://mypreferencenamespace.100dof.com",
      "buttonMsgExtraText1",
      "0"
    )
    h = Utils.a(
      var1,
      var2,
      "http://mypreferencenamespace.100dof.com",
      "buttonMsgExtraText2",
      "0"
    )
    while (var3 < var2.attributeCount) {
      val var4 = var2.getAttributeName(var3)
      val var5 = var2.getAttributeValue(var3)
      if (var4.equals("valueShow", ignoreCase = true)) {
        j = var5.lowercase(Locale.getDefault()).contains("true")
      } else if (var4.equals("titleYellow", ignoreCase = true)) {
        i = var5.lowercase(Locale.getDefault()).contains("true")
      }
      ++var3
    }
    val var6 =
      Utils.a(var1, var2, "http://mypreferencenamespace.100dof.com", "enableFree", "true")
        .equals("true", ignoreCase = true)
    val var7 =
      Utils.a(var1, var2, "http://mypreferencenamespace.100dof.com", "enablePro", "true")
        .equals("true", ignoreCase = true)
    val var8 =
      Utils.a(var1, var2, "http://mypreferencenamespace.100dof.com", "visibleFree", "true")
        .equals("true", ignoreCase = true)
    val var9 =
      Utils.a(var1, var2, "http://mypreferencenamespace.100dof.com", "visiblePro", "true")
        .equals("true", ignoreCase = true)
    if (App.a) {
      this.isEnabled = var6
      d = var8
    }
    if (App.b) {
      this.isEnabled = var7
      d = var9
    }
  }

  private fun a() {
    var intent: Intent?
    run label67@{
      var var2: ClassNotFoundException
      run label66@{
        try {
          intent = Intent(c, Class.forName(e))
        } catch (var9: ClassNotFoundException) {
          var2 = var9
          intent = null
          return@label66
        }
        var2 = try {
          intent!!.putExtra(c.resources.getString(R.string.MSG_WHAT), f)
          intent!!.putExtra(c.resources.getString(R.string.MSG_EXTRATEXT1), g)
          intent!!.putExtra(c.resources.getString(R.string.MSG_EXTRATEXT2), h)
          return@label67
        } catch (var8: ClassNotFoundException) {
          var8
        }
      }
      var2.printStackTrace()
    }
    var var10000: Exception
    run label59@{
      var context: Context
      var var10001: Boolean
      run label71@{
        try {
          if (e == "PLAYSTORE") {
            context = c
            intent = Intent("android.intent.action.VIEW", Uri.parse(App.l))
            return@label71
          }
        } catch (var5: Exception) {
          var10000 = var5
          var10001 = false
          return@label59
        }
        try {
          if (e == "PLAYSTOREPRO") {
            context = c
            intent = Intent("android.intent.action.VIEW", Uri.parse(App.m))
            return@label71
          }
        } catch (var7: Exception) {
          var10000 = var7
          var10001 = false
          return@label59
        }
        try {
          if (e.contains("Service")) {
            c.startService(intent)
            return@a
          }
        } catch (var6: Exception) {
          var10000 = var6
          var10001 = false
          return@label59
        }
        try {
          context = c
        } catch (var4: Exception) {
          var10000 = var4
          var10001 = false
          return@label59
        }
      }
      try {
        context.startActivity(intent)
        return@a
      } catch (e: Exception) {
        var10000 = e
        var10001 = false
      }
    }
    var10000.printStackTrace()
  }

  fun setValue(var1: String) {
    l = var1
    if (k == null) {
      log("MyPreferenceText.setValue ERROR  mValueTV == null")
    } else {
      k!!.text = var1
    }
  }

  override fun onBindView(var1: View) {
    log("MyPreferenceText.onBindView")
    val var2 = var1.findViewById<TextView>(16908310)
    if (i && var2 != null) {
      var2.setTextColor(a)
    }
    val var3 = var1.findViewById<TextView>(16908304)
    if (var3 != null) {
      val var4 = var3.parent as RelativeLayout
      k = TextView(var1.context)
      k!!.text = ""
      if (VERSION.SDK_INT < 23) {
        k!!.setTextAppearance(var1.context, 16973894)
      } else {
        k!!.setTextAppearance(16973894)
      }
      k!!.setTextColor(b)
      val var5 = RelativeLayout.LayoutParams(-1, -2)
      var5.addRule(5, var3.id)
      var5.addRule(3, var3.id)
      k!!.layoutParams = var5
      val var7 = k
      var7!!.visibility = if (j) View.VISIBLE else View.GONE
      var4.addView(k)
    } else {
      k = null
    }
    if (!e.isEmpty()) {
      var2?.setOnClickListener { this@MyPreferenceText.a() }
      var3?.setOnClickListener { this@MyPreferenceText.a() }
      if (k != null) {
        k!!.setOnClickListener { this@MyPreferenceText.a() }
      }
    }
    this.setValue(l)
    super.onBindView(var1)
  }

  override fun onCreateView(var1: ViewGroup): View {
    log("MyPreferenceText.onBindView")
    var var2 = super.onCreateView(var1)
    if (!d) {
      var2 = View(var1.context)
      var2.visibility = View.GONE
      var var3 = TextView(var2.context)
      var3.id = 16908304
      var3.visibility = View.GONE
      var3 = TextView(var2.context)
      var3.id = 16908310
      var3.visibility = View.GONE
      val var4 = LinearLayout(var2.context)
      var4.id = 16908312
      var4.visibility = View.GONE
    }
    return var2
  }

  companion object {
    private val a: ColorStateList
    private val b: ColorStateList

    init {
      val var0 = intArrayOf(16842910)
      val var1 = intArrayOf(-16842910)
      var var2 = Color.rgb(240, 240, 160)
      a = ColorStateList(arrayOf(var0, var1), intArrayOf(var2, -7829368))
      var2 = Color.rgb(11, 141, 189)
      b = ColorStateList(
        arrayOf(intArrayOf(16842910), intArrayOf(-16842910)),
        intArrayOf(var2, -7829368)
      )
    }
  }
}
