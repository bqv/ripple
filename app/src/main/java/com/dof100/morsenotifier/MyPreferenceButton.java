package com.dof100.morsenotifier;

import android.content.Context;
import android.content.Intent;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.RelativeLayout.LayoutParams;

public class MyPreferenceButton extends Preference {
   private final Context a;
   private final String b;
   private final String c;
   private final String d;
   private final String e;
   private final String f;

   public MyPreferenceButton(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.a = var1;
      this.setSelectable(false);
      this.c = Utils.a(var1, var2, "http://mypreferencenamespace.100dof.com", "buttonCaption", "");
      this.b = Utils.a(var1, var2, "http://mypreferencenamespace.100dof.com", "buttonIntentClass", "");
      this.d = Utils.a(var1, var2, "http://mypreferencenamespace.100dof.com", "buttonMsgWhat", "0");
      this.e = Utils.a(var1, var2, "http://mypreferencenamespace.100dof.com", "buttonMsgExtraText1", "0");
      this.f = Utils.a(var1, var2, "http://mypreferencenamespace.100dof.com", "buttonMsgExtraText2", "0");
      boolean var3 = Utils.a(var1, var2, "http://mypreferencenamespace.100dof.com", "enableFree", "true").equalsIgnoreCase("true");
      boolean var4 = Utils.a(var1, var2, "http://mypreferencenamespace.100dof.com", "enablePro", "true").equalsIgnoreCase("true");
      if (App.a) {
         this.setEnabled(var3);
      }

      if (App.b) {
         this.setEnabled(var4);
      }

   }

   private void a() {
      try {
         Intent var1 = new Intent(this.a, Class.forName(this.b));
         var1.putExtra(this.a.getResources().getString(R.string.MSG_WHAT), this.d);
         var1.putExtra(this.a.getResources().getString(R.string.MSG_EXTRATEXT1), this.e);
         var1.putExtra(this.a.getResources().getString(R.string.MSG_EXTRATEXT2), this.f);
         if (this.b.contains("ervice")) {
            this.a.startService(var1);
         } else {
            this.a.startActivity(var1);
         }
      } catch (ClassNotFoundException var2) {
         var2.printStackTrace();
      }
   }

   protected void onBindView(View var1) {
      MyLog.log("MyPreferenceButton.onBindView");
      TextView var2 = (TextView)var1.findViewById(16908310);
      TextView var3 = (TextView)var1.findViewById(16908304);
      if (var3 != null && var2 != null) {
         RelativeLayout var4 = (RelativeLayout)var3.getParent();
         var2.setVisibility(8);
         var3.setVisibility(8);
         Button var5 = new Button(var1.getContext());
         var5.setText(this.c);
         var5.setOnClickListener(new OnClickListener() {
            public void onClick(View var1) {
               MyPreferenceButton.this.a();
            }
         });
         LayoutParams var6 = new LayoutParams(-2, -2);
         var6.addRule(3, var2.getId());
         var6.addRule(5, var2.getId());
         var5.setLayoutParams(var6);
         var5.setId(R.id.myPreferenceButton_button);
         var4.addView(var5);
         LayoutParams var7 = new LayoutParams(-2, -2);
         var7.addRule(3, var5.getId());
         var7.addRule(5, var5.getId());
         var3.setLayoutParams(var7);
      } else {
         MyLog.log("MyPreferenceButton.onBindView title or summary = null");
      }

      super.onBindView(var1);
   }
}
