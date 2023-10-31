package com.dof100.morsenotifier

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Build.VERSION
import android.preference.EditTextPreference
import android.text.TextUtils
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import com.dof100.morsenotifier.MyLog.log
import java.util.Locale

class MyPreferenceEditText : EditTextPreference {
  private var b: String = ""
  private var c: Boolean = true
  private var d: TextView? = null

  constructor(var1: Context) : super(var1) {
    val var2: StringBuilder = StringBuilder()
    var2.append("MyEditTextPreference ")
    var2.append(getKey())
    var2.append(" Constructor(context) ")
    log(var2.toString())
    this.a(var1, null as AttributeSet?)
  }

  constructor(var1: Context, var2: AttributeSet?) : super(var1, var2) {
    val var3: StringBuilder = StringBuilder()
    var3.append("MyEditTextPreference ")
    var3.append(getKey())
    var3.append(" Constructor(context, attrs) ")
    log(var3.toString())
    this.a(var1, var2)
  }

  constructor(var1: Context, var2: AttributeSet?, var3: Int) : super(var1, var2, var3) {
    val var4: StringBuilder = StringBuilder()
    var4.append("MyEditTextPreference ")
    var4.append(getKey())
    var4.append(" Constructor(context, attrs, defStyleAttr) ")
    log(var4.toString())
    this.a(var1, var2)
  }

  private fun a(): String {
    var var1: String? = getText()
    val var2: StringBuilder
    if (var1 == null) {
      var2 = StringBuilder()
      var2.append("MyEditTextPreference ")
      var2.append(getKey())
      var2.append(" getValueStr ret = null")
      log(var2.toString())
      return ""
    } else {
      var var4: String?
      if (!b.isEmpty()) {
        if ((b == "%")) {
          var2 = StringBuilder()
        } else {
          var2 = StringBuilder()
          var2.append(var1)
          var1 = " "
        }
        var2.append(var1)
        var2.append(b)
        var4 = var2.toString()
      } else {
        var4 = var1
        if (var1.isEmpty()) {
          var4 = "(none)"
        }
      }
      val var3: StringBuilder = StringBuilder()
      var3.append("MyEditTextPreference ")
      var3.append(getKey())
      var3.append(" getValueStr = ")
      var3.append(var4)
      log(var3.toString())
      return var4
    }
  }

  private fun a(var1: Context, var2: AttributeSet?) {
    val var3: StringBuilder = StringBuilder()
    var3.append("MyEditTextPreference ")
    var3.append(getKey())
    var3.append(" init")
    log(var3.toString())
    if (var2 != null) {
      var var4: Boolean =
        Utils.a(var1, var2, "http://mypreferencenamespace.100dof.com", "enableFree", "true")
          .equals("true", ignoreCase = true)
      if (App.Companion.a) {
        this.setEnabled(var4)
      }
      var4 =
        Utils.a(var1, var2, "http://mypreferencenamespace.100dof.com", "enablePro", "true")
          .equals("true", ignoreCase = true)
      if (App.Companion.b) {
        this.setEnabled(var4)
      }
    }
    for (var5 in 0 until var2!!.getAttributeCount()) {
      val var7: String = var2.getAttributeName(var5)
      val var6: String = var2.getAttributeValue(var5)
      if (var7.equals("valueUnits", ignoreCase = true)) {
        b = var6
      } else if (var7.equals("valueShow", ignoreCase = true)) {
        c = var6.lowercase(Locale.getDefault()).contains("true")
      }
    }
  }

  protected fun a(var1: View) {
    val var2: StringBuilder = StringBuilder()
    var2.append("MyEditTextPreference ")
    var2.append(getKey())
    var2.append(" myCreateView")
    log(var2.toString())
    val var7: RelativeLayout =
      (var1.findViewById<View>(16908304) as TextView).getParent() as RelativeLayout
    if (d != null) {
      val var3: StringBuilder = StringBuilder()
      var3.append("MyEditTextPreference ")
      var3.append(getKey())
      var3.append(" myCreateView mValueTV!=null")
      log(var3.toString())
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
    val var2: StringBuilder = StringBuilder()
    var2.append("MyEditTextPreference ")
    var2.append(getKey())
    var2.append(" onBindView")
    log(var2.toString())
    val var3: RelativeLayout =
      (var1.findViewById<View>(16908304) as TextView).getParent() as RelativeLayout
    d = null
    for (var4 in 0 until var3.getChildCount()) {
      val var5: View = var3.getChildAt(var4)
      if (var5 is TextView && (var5.getId() != 16908310) && (var5.getId() != 16908304)) {
        d = var5
      }
    }
    if (d != null) {
      val var6: String = this.a()
      if (!TextUtils.isEmpty(var6)) {
        d!!.setText(var6)
        d!!.setVisibility(0)
      } else {
        d!!.setVisibility(8)
      }
    }
    super.onBindView(var1)
  }

  override fun onCreateView(var1: ViewGroup): View {
    val var2: StringBuilder = StringBuilder()
    var2.append("MyEditTextPreference ")
    var2.append(getKey())
    var2.append(" onCreateView")
    log(var2.toString())
    val var3: View = super.onCreateView(var1)
    this.a(var3)
    return var3
  }

  override fun onDialogClosed(var1: Boolean) {
    super.onDialogClosed(var1)
    val var2: StringBuilder = StringBuilder()
    var2.append("MyEditTextPreference ")
    var2.append(getKey())
    var2.append(" onDialogClosed")
    log(var2.toString())
    if (d != null) {
      d!!.setText(this.a())
    }
  }

  public override fun setText(var1: String) {
    super.setText(var1)
    val var2: StringBuilder = StringBuilder()
    var2.append("MyEditTextPreference ")
    var2.append(getKey())
    var2.append(" setText ")
    var2.append(var1)
    log(var2.toString())
    if (d != null) {
      d!!.setText(this.a())
    }
  }

  companion object {
    private val a: ColorStateList?

    init {
      val var0: IntArray = intArrayOf(16842910)
      val var1: IntArray = intArrayOf(-16842910)
      val var2: Int = Color.rgb(11, 141, 189)
      a = ColorStateList(arrayOf(var0, var1), intArrayOf(var2, Color.GRAY))
    }
  }
}
