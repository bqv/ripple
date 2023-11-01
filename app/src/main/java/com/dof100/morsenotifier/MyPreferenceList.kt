package com.dof100.morsenotifier

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Build.VERSION
import android.preference.ListPreference
import android.text.TextUtils
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import com.dof100.morsenotifier.MyLog.log
import java.util.Locale

class MyPreferenceList constructor(var1: Context, var2: AttributeSet) : ListPreference(var1, var2) {
  private var b: String = ""
  private var c: Boolean = true
  private var d: TextView? = null

  init {
    for (var3 in 0 until var2.getAttributeCount()) {
      val var4: String = var2.getAttributeName(var3)
      val var5: String = var2.getAttributeValue(var3)
      if (var4.equals("valueUnits", ignoreCase = true)) {
        b = var5
      } else if (var4.equals("valueShow", ignoreCase = true)) {
        c = var5.lowercase(Locale.getDefault()).contains("true")
      }
    }
    var var6: Boolean =
      Utils.unknown1(var1, var2, "http://mypreferencenamespace.100dof.com", "enableFree", "true")
        .equals("true", ignoreCase = true)
    if (App.Companion.a) {
      this.setEnabled(var6)
    }
    var6 = Utils.unknown1(var1, var2, "http://mypreferencenamespace.100dof.com", "enablePro", "true")
      .equals("true", ignoreCase = true)
    if (App.Companion.b) {
      this.setEnabled(var6)
    }
  }

  private fun b(): String {
    if (getEntry() == null) {
      log("MyListPreference.getValueStr cs=null")
      return ""
    } else {
      var var1: String = getEntry().toString()
      if (!b.isEmpty()) {
        val var2 = StringBuilder()
        if (!(b == "%")) {
          var2.append(var1)
          var1 = " "
        }
        var2.append(var1)
        var2.append(b)
        return var2.toString()
      } else {
        return var1
      }
    }
  }

  fun a() {
    if (d != null) {
      d!!.setText(b())
    }
  }

  protected fun a(var1: View) {
    log("MyPreferenceList ${getKey()} myCreateView")
    val var7: RelativeLayout =
      (var1.findViewById<View>(16908304) as TextView).getParent() as RelativeLayout
    if (d != null) {
      log("MyPreferenceList ${getKey()} myCreateView mValueTV!=null")
      var7.removeView(d)
      d = null
    }
    d = TextView(var1.getContext())
    if (VERSION.SDK_INT < 23) {
      d!!.setTextAppearance(var1.getContext(), 16973894)
    } else {
      d!!.setTextAppearance(16973894)
    }
    d!!.setTextColor(a)
    val var5: RelativeLayout.LayoutParams = RelativeLayout.LayoutParams(-1, -2)
    var5.addRule(5, 16908304)
    var5.addRule(3, 16908304)
    d!!.setLayoutParams(var5)
    val var6: TextView? = d
    val var4: Byte
    if (c) {
      var4 = 0
    } else {
      var4 = 8
    }
    var6!!.setVisibility(var4.toInt())
    var7.addView(d)
  }

  override fun onBindView(var1: View) {
    log("MyPreferenceList.onBindView")
    val var2: RelativeLayout =
      (var1.findViewById<View>(16908304) as TextView).getParent() as RelativeLayout
    d = null
    for (var3 in 0 until var2.getChildCount()) {
      val var4: View = var2.getChildAt(var3)
      if (var4 is TextView && (var4.getId() != 16908310) && (var4.getId() != 16908304)) {
        d = var4
      }
    }
    if (d != null) {
      val var5: String = b()
      if (!TextUtils.isEmpty(var5)) {
        d!!.setText(var5)
        d!!.setVisibility(0)
      } else {
        d!!.setVisibility(8)
      }
    }
    super.onBindView(var1)
  }

  override fun onCreateView(var1: ViewGroup): View {
    log("MyPreferenceList ${getKey()} onCreateView")
    val var3: View = super.onCreateView(var1)
    this.a(var3)
    return var3
  }

  override fun onDialogClosed(var1: Boolean) {
    super.onDialogClosed(var1)
    if (d != null) {
      d!!.setText(b())
    }
  }

  companion object {
    private val a: ColorStateList?

    init {
      val var0: Int = Color.rgb(11, 141, 189)
      a = ColorStateList(
        arrayOf(intArrayOf(16842910), intArrayOf(-16842910)),
        intArrayOf(var0, Color.GRAY)
      )
    }
  }
}
