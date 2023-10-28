package com.dof100.morsenotifier;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.preference.EditTextPreference;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.RelativeLayout.LayoutParams;

public class MyPreferenceEditText extends EditTextPreference {
   private static final ColorStateList a;
   private String b = "";
   private Boolean c = true;
   private TextView d = null;

   static {
      int[] var0 = new int[]{16842910};
      int[] var1 = new int[]{-16842910};
      int var2 = Color.rgb(11, 141, 189);
      a = new ColorStateList(new int[][]{var0, var1}, new int[]{var2, -7829368});
   }

   public MyPreferenceEditText(Context var1) {
      super(var1);
      StringBuilder var2 = new StringBuilder();
      var2.append("MyEditTextPreference ");
      var2.append(this.getKey());
      var2.append(" Constructor(context) ");
      i.a(var2.toString());
      this.a(var1, (AttributeSet)null);
   }

   public MyPreferenceEditText(Context var1, AttributeSet var2) {
      super(var1, var2);
      StringBuilder var3 = new StringBuilder();
      var3.append("MyEditTextPreference ");
      var3.append(this.getKey());
      var3.append(" Constructor(context, attrs) ");
      i.a(var3.toString());
      this.a(var1, var2);
   }

   public MyPreferenceEditText(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      StringBuilder var4 = new StringBuilder();
      var4.append("MyEditTextPreference ");
      var4.append(this.getKey());
      var4.append(" Constructor(context, attrs, defStyleAttr) ");
      i.a(var4.toString());
      this.a(var1, var2);
   }

   private String a() {
      String var1 = this.getText();
      StringBuilder var2;
      if (var1 == null) {
         var2 = new StringBuilder();
         var2.append("MyEditTextPreference ");
         var2.append(this.getKey());
         var2.append(" getValueStr ret = null");
         i.a(var2.toString());
         return "";
      } else {
         String var4;
         if (!this.b.isEmpty()) {
            if (this.b.equals("%")) {
               var2 = new StringBuilder();
            } else {
               var2 = new StringBuilder();
               var2.append(var1);
               var1 = " ";
            }

            var2.append(var1);
            var2.append(this.b);
            var4 = var2.toString();
         } else {
            var4 = var1;
            if (var1.isEmpty()) {
               var4 = "(none)";
            }
         }

         StringBuilder var3 = new StringBuilder();
         var3.append("MyEditTextPreference ");
         var3.append(this.getKey());
         var3.append(" getValueStr = ");
         var3.append(var4);
         i.a(var3.toString());
         return var4;
      }
   }

   private void a(Context var1, AttributeSet var2) {
      StringBuilder var3 = new StringBuilder();
      var3.append("MyEditTextPreference ");
      var3.append(this.getKey());
      var3.append(" init");
      i.a(var3.toString());
      if (var2 != null) {
         boolean var4 = v.a(var1, var2, "http://mypreferencenamespace.100dof.com", "enableFree", "true").equalsIgnoreCase("true");
         if (App.a) {
            this.setEnabled(var4);
         }

         var4 = v.a(var1, var2, "http://mypreferencenamespace.100dof.com", "enablePro", "true").equalsIgnoreCase("true");
         if (App.b) {
            this.setEnabled(var4);
         }
      }

      for(int var5 = 0; var5 < var2.getAttributeCount(); ++var5) {
         String var7 = var2.getAttributeName(var5);
         String var6 = var2.getAttributeValue(var5);
         if (var7.equalsIgnoreCase("valueUnits")) {
            this.b = var6;
         } else if (var7.equalsIgnoreCase("valueShow")) {
            this.c = var6.toLowerCase().contains("true");
         }
      }

   }

   protected void a(View var1) {
      StringBuilder var2 = new StringBuilder();
      var2.append("MyEditTextPreference ");
      var2.append(this.getKey());
      var2.append(" myCreateView");
      i.a(var2.toString());
      RelativeLayout var7 = (RelativeLayout)((TextView)var1.findViewById(16908304)).getParent();
      if (this.d != null) {
         StringBuilder var3 = new StringBuilder();
         var3.append("MyEditTextPreference ");
         var3.append(this.getKey());
         var3.append(" myCreateView mValueTV!=null");
         i.a(var3.toString());
         var7.removeView(this.d);
         this.d = null;
      }

      this.d = new TextView(var1.getContext());
      if (VERSION.SDK_INT < 23) {
         this.d.setTextAppearance(var1.getContext(), 16973894);
      } else {
         this.d.setTextAppearance(16973894);
      }

      this.d.setTextColor(a);
      LayoutParams var5 = new LayoutParams(-1, -2);
      var5.addRule(5, 16908304);
      var5.addRule(3, 16908304);
      this.d.setLayoutParams(var5);
      TextView var6 = this.d;
      byte var4;
      if (this.c) {
         var4 = 0;
      } else {
         var4 = 8;
      }

      var6.setVisibility(var4);
      var7.addView(this.d);
   }

   protected void onBindView(View var1) {
      StringBuilder var2 = new StringBuilder();
      var2.append("MyEditTextPreference ");
      var2.append(this.getKey());
      var2.append(" onBindView");
      i.a(var2.toString());
      RelativeLayout var3 = (RelativeLayout)((TextView)var1.findViewById(16908304)).getParent();
      this.d = null;

      for(int var4 = 0; var4 < var3.getChildCount(); ++var4) {
         View var5 = var3.getChildAt(var4);
         if (var5 instanceof TextView && var5.getId() != 16908310 && var5.getId() != 16908304) {
            this.d = (TextView)var5;
         }
      }

      if (this.d != null) {
         String var6 = this.a();
         if (!TextUtils.isEmpty(var6)) {
            this.d.setText(var6);
            this.d.setVisibility(0);
         } else {
            this.d.setVisibility(8);
         }
      }

      super.onBindView(var1);
   }

   protected View onCreateView(ViewGroup var1) {
      StringBuilder var2 = new StringBuilder();
      var2.append("MyEditTextPreference ");
      var2.append(this.getKey());
      var2.append(" onCreateView");
      i.a(var2.toString());
      View var3 = super.onCreateView(var1);
      this.a(var3);
      return var3;
   }

   protected void onDialogClosed(boolean var1) {
      super.onDialogClosed(var1);
      StringBuilder var2 = new StringBuilder();
      var2.append("MyEditTextPreference ");
      var2.append(this.getKey());
      var2.append(" onDialogClosed");
      i.a(var2.toString());
      if (this.d != null) {
         this.d.setText(this.a());
      }

   }

   public void setText(String var1) {
      super.setText(var1);
      StringBuilder var2 = new StringBuilder();
      var2.append("MyEditTextPreference ");
      var2.append(this.getKey());
      var2.append(" setText ");
      var2.append(var1);
      i.a(var2.toString());
      if (this.d != null) {
         this.d.setText(this.a());
      }

   }
}
