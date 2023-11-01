package com.dof100.morsenotifier

import android.content.Context
import android.preference.CheckBoxPreference
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.TextView

class MyPreferenceCheckbox constructor(var1: Context, var2: AttributeSet) :
  CheckBoxPreference(var1, var2) {
  init {
    var var3: Boolean =
      Utils.unknown1(var1, var2, "http://mypreferencenamespace.100dof.com", "enableFree", "true")
        .equals("true", ignoreCase = true)
    if (App.Companion.a) {
      this.setEnabled(var3)
    }
    var3 = Utils.unknown1(var1, var2, "http://mypreferencenamespace.100dof.com", "enablePro", "true")
      .equals("true", ignoreCase = true)
    if (App.Companion.b) {
      this.setEnabled(var3)
    }
  }

  override fun onBindView(var1: View) {
    (var1.findViewById<View>(16908304) as TextView).setVisibility(8)
    val var2: View = var1.findViewById(16908289)
    val var3: LinearLayout = (var2.getParent() as LinearLayout).getParent() as LinearLayout
    val var4: ViewGroup.LayoutParams = var3.getLayoutParams()
    var4.height /= 2
    var3.setLayoutParams(var4)
    (var2 as CheckBox).setButtonDrawable(R.drawable.mycheckboxpreference)
    super.onBindView(var1)
  }
}
