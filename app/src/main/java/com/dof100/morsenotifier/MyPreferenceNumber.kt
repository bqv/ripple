package com.dof100.morsenotifier

import android.content.Context
import android.content.res.ColorStateList
import android.content.res.TypedArray
import android.graphics.Color
import android.os.Build.VERSION
import android.preference.DialogPreference
import android.text.TextUtils
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.NumberPicker
import android.widget.RelativeLayout
import android.widget.TextView
import com.dof100.morsenotifier.MyLog.log
import java.util.Locale

class MyPreferenceNumber constructor(var1: Context, var2: AttributeSet) :
  DialogPreference(var1, var2) {
  private var b: NumberPicker? = null
  private var c: Int
  private var d: Int
  private var e: Int
  private var f: Int
  private var g: String
  private var h: Boolean
  private var i: TextView?

  init {
    var var3: Int = 0
    c = 0
    d = 0
    e = 10
    f = 1
    g = ""
    h = true
    i = null
    this.setPositiveButtonText("Set")
    this.setNegativeButtonText("Cancel")
    while (var3 < var2.getAttributeCount()) {
      val var4: String = var2.getAttributeName(var3)
      val var5: String = var2.getAttributeValue(var3)
      if (!var4.equals("vmin", ignoreCase = true) && !var4.equals(
          "valueMin",
          ignoreCase = true
        )
      ) {
        if (!var4.equals("vmax", ignoreCase = true) && !var4.equals(
            "valueMax",
            ignoreCase = true
          )
        ) {
          if (!var4.equals("vstep", ignoreCase = true) && !var4.equals(
              "valueStep",
              ignoreCase = true
            )
          ) {
            if (!var4.equals("vunits", ignoreCase = true) && !var4.equals(
                "valueUnits",
                ignoreCase = true
              )
            ) {
              if (var4.equals("valueShow", ignoreCase = true)) {
                h = var5.lowercase(Locale.getDefault()).contains("true")
              }
            } else {
              g = var5
            }
          } else {
            f = var5.toInt()
          }
        } else {
          e = var5.toInt()
        }
      } else {
        d = var5.toInt()
      }
      ++var3
    }
    var var6: Boolean =
      Utils.a(var1, var2, "http://mypreferencenamespace.100dof.com", "enableFree", "true")
        .equals("true", ignoreCase = true)
    if (App.Companion.a) {
      this.setEnabled(var6)
    }
    var6 = Utils.a(var1, var2, "http://mypreferencenamespace.100dof.com", "enablePro", "true")
      .equals("true", ignoreCase = true)
    if (App.Companion.b) {
      this.setEnabled(var6)
    }
  }

  private fun a(): String? {
    var var1: String? = Integer.toString(c)
    var var2: String? = var1
    if (!g.isEmpty()) {
      val var4: StringBuilder
      if ((g == "%")) {
        var4 = StringBuilder()
      } else {
        var4 = StringBuilder()
        var4.append(var1)
        var1 = " "
      }
      var4.append(var1)
      var4.append(g)
      var2 = var4.toString()
    }
    val var3: StringBuilder = StringBuilder()
    var3.append("MyNumberPreference.getValueStr =")
    var3.append(var2)
    log(var3.toString())
    return var2
  }

  protected fun a(var1: View) {
    val var2: StringBuilder = StringBuilder()
    var2.append("MyNumberPreference ")
    var2.append(getKey())
    var2.append(" myCreateView")
    log(var2.toString())
    val var7: RelativeLayout =
      (var1.findViewById<View>(16908304) as TextView).getParent() as RelativeLayout
    if (i != null) {
      val var3: StringBuilder = StringBuilder()
      var3.append("MyNumberPreference ")
      var3.append(getKey())
      var3.append(" myCreateView mValueTV!=null")
      log(var3.toString())
      var7.removeView(i)
      i = null
    }
    i = TextView(var1.getContext())
    if (VERSION.SDK_INT < 23) {
      i!!.setTextAppearance(var1.getContext(), 16973894)
    } else {
      i!!.setTextAppearance(16973894)
    }
    i!!.setTextColor(a)
    val var5: RelativeLayout.LayoutParams = RelativeLayout.LayoutParams(-1, -2)
    var5.addRule(5, 16908304)
    var5.addRule(3, 16908304)
    i!!.setLayoutParams(var5)
    val var6: TextView? = i
    val var4: Byte
    if (h) {
      var4 = 0
    } else {
      var4 = 8
    }
    var6!!.setVisibility(var4.toInt())
    var7.addView(i)
  }

  override fun onBindDialogView(var1: View) {
    super.onBindDialogView(var1)
    b!!.setValue((c - d) / f)
  }

  override fun onBindView(var1: View) {
    val var2: RelativeLayout =
      (var1.findViewById<View>(16908304) as TextView).getParent() as RelativeLayout
    i = null
    for (var3 in 0 until var2.getChildCount()) {
      val var4: View = var2.getChildAt(var3)
      if (var4 is TextView && (var4.getId() != 16908310) && (var4.getId() != 16908304)) {
        i = var4
      }
    }
    if (i != null) {
      val var5: String? = this.a()
      if (!TextUtils.isEmpty(var5)) {
        i!!.setText(var5)
        i!!.setVisibility(0)
      } else {
        i!!.setVisibility(8)
      }
    }
    super.onBindView(var1)
  }

  override fun onCreateDialogView(): View {
    val var1: Context = getContext()
    val var2: LinearLayout = LinearLayout(var1)
    var2.setOrientation(0)
    var2.setGravity(17)
    var2.setPadding(6, 6, 6, 6)
    b = NumberPicker(var1)
    b!!.setGravity(17)
    val var3: Int = (e - d) / f
    val var4: Array<String?> = arrayOfNulls(var3 + 0 + 1)
    for (var5 in 0..var3) {
      var4[var5] = Integer.toString(d + f * var5)
    }
    b!!.setMinValue(0)
    b!!.setMaxValue(var3)
    b!!.setDisplayedValues(var4)
    b!!.setDescendantFocusability(393216)
    var2.addView(b)
    if (!g.isEmpty()) {
      val var6: TextView = TextView(var1)
      var6.setText(String.format(Locale.US, " %s", g))
      var6.setGravity(17)
      var2.addView(var6)
    }
    return var2
  }

  override fun onCreateView(var1: ViewGroup): View {
    val var2: StringBuilder = StringBuilder()
    var2.append("MyNumberPreference ")
    var2.append(getKey())
    var2.append(" onCreateView")
    log(var2.toString())
    val var3: View = super.onCreateView(var1)
    this.a(var3)
    return var3
  }

  override fun onDialogClosed(var1: Boolean) {
    super.onDialogClosed(var1)
    log("MyNumberPreference.onDialogClosed")
    if (var1) {
      c = d + b!!.getValue() * f
      if (callChangeListener(c)) {
        persistString(Integer.toString(c))
      }
    }
    if (i != null) {
      i!!.setText(this.a())
    }
    notifyChanged()
  }

  override fun onGetDefaultValue(var1: TypedArray, var2: Int): Any {
    return (var1.getString(var2))!!
  }

  override fun onSetInitialValue(var1: Boolean, var2: Any) {
    val var3: Int
    if (var1) {
      var3 = getPersistedString("0").toInt()
    } else {
      var3 = var2.toString().toInt()
      persistString(var2.toString())
    }
    c = var3
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
