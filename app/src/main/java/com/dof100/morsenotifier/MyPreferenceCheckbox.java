package com.dof100.morsenotifier;

import android.content.Context;
import android.preference.CheckBoxPreference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyPreferenceCheckbox extends CheckBoxPreference {
   public MyPreferenceCheckbox(Context var1, AttributeSet var2) {
      super(var1, var2);
      boolean var3 = Utils.a(var1, var2, "http://mypreferencenamespace.100dof.com", "enableFree", "true").equalsIgnoreCase("true");
      if (App.a) {
         this.setEnabled(var3);
      }

      var3 = Utils.a(var1, var2, "http://mypreferencenamespace.100dof.com", "enablePro", "true").equalsIgnoreCase("true");
      if (App.b) {
         this.setEnabled(var3);
      }

   }

   protected void onBindView(View var1) {
      ((TextView)var1.findViewById(16908304)).setVisibility(8);
      View var2 = var1.findViewById(16908289);
      LinearLayout var3 = (LinearLayout)((LinearLayout)var2.getParent()).getParent();
      LayoutParams var4 = var3.getLayoutParams();
      var4.height /= 2;
      var3.setLayoutParams(var4);
      ((CheckBox)var2).setButtonDrawable(2131099665);
      super.onBindView(var1);
   }
}
