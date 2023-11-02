package com.dof100.morsenotifier

import android.content.Context
import android.content.Intent
import android.preference.Preference
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import com.dof100.morsenotifier.MyLog.log

class MyPreferenceButton constructor(private val a: Context, var2: AttributeSet) : Preference(
  a, var2
) {
  private val b: String?
  private val c: String?
  private val d: String?
  private val e: String?
  private val f: String?

  init {
    setSelectable(false)
    c = Utils.unknown1(a, var2, "http://mypreferencenamespace.100dof.com", "buttonCaption", "")
    b = Utils.unknown1(a, var2, "http://mypreferencenamespace.100dof.com", "buttonIntentClass", "")
    d = Utils.unknown1(a, var2, "http://mypreferencenamespace.100dof.com", "buttonMsgWhat", "0")
    e = Utils.unknown1(a, var2, "http://mypreferencenamespace.100dof.com", "buttonMsgExtraText1", "0")
    f = Utils.unknown1(a, var2, "http://mypreferencenamespace.100dof.com", "buttonMsgExtraText2", "0")
    val var3: Boolean =
      Utils.unknown1(a, var2, "http://mypreferencenamespace.100dof.com", "enableFree", "true")
        .equals("true", ignoreCase = true)
    val var4: Boolean =
      Utils.unknown1(a, var2, "http://mypreferencenamespace.100dof.com", "enablePro", "true")
        .equals("true", ignoreCase = true)
    if (App.Companion.freeBuild) {
      this.setEnabled(var3)
    }
    if (App.Companion.proBuild) {
      this.setEnabled(var4)
    }
  }

  private fun a() {
    try {
      val var1: Intent = Intent(a, Class.forName(b))
      var1.putExtra(a.getResources().getString(R.string.MSG_WHAT), d)
      var1.putExtra(a.getResources().getString(R.string.MSG_EXTRATEXT1), e)
      var1.putExtra(a.getResources().getString(R.string.MSG_EXTRATEXT2), f)
      if (b!!.contains("ervice")) {
        a.startService(var1)
      } else {
        a.startActivity(var1)
      }
    } catch (var2: ClassNotFoundException) {
      var2.printStackTrace()
    }
  }

  override fun onBindView(var1: View) {
    log("MyPreferenceButton.onBindView")
    val var2: TextView? = var1.findViewById<View>(16908310) as TextView?
    val var3: TextView? = var1.findViewById<View>(16908304) as TextView?
    if (var3 != null && var2 != null) {
      val var4: RelativeLayout = var3.getParent() as RelativeLayout
      var2.setVisibility(8)
      var3.setVisibility(8)
      val var5: Button = Button(var1.getContext())
      var5.setText(c)
      var5.setOnClickListener(object : View.OnClickListener {
        public override fun onClick(var1: View) {
          a()
        }
      })
      val var6: RelativeLayout.LayoutParams = RelativeLayout.LayoutParams(-2, -2)
      var6.addRule(3, var2.getId())
      var6.addRule(5, var2.getId())
      var5.setLayoutParams(var6)
      var5.setId(R.id.myPreferenceButton_button)
      var4.addView(var5)
      val var7: RelativeLayout.LayoutParams = RelativeLayout.LayoutParams(-2, -2)
      var7.addRule(3, var5.getId())
      var7.addRule(5, var5.getId())
      var3.setLayoutParams(var7)
    } else {
      log("MyPreferenceButton.onBindView title or summary = null")
    }
    super.onBindView(var1)
  }
}
