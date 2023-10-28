package com.dof100.morsenotifier;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.preference.ListPreference;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.RelativeLayout.LayoutParams;

public class MyPreferenceList extends ListPreference {
   private static final ColorStateList a;
   private String b = "";
   private Boolean c = true;
   private TextView d = null;

   static {
      int var0 = Color.rgb(11, 141, 189);
      a = new ColorStateList(new int[][]{{16842910}, {-16842910}}, new int[]{var0, -7829368});
   }

   public MyPreferenceList(Context var1, AttributeSet var2) {
      super(var1, var2);

      for(int var3 = 0; var3 < var2.getAttributeCount(); ++var3) {
         String var4 = var2.getAttributeName(var3);
         String var5 = var2.getAttributeValue(var3);
         if (var4.equalsIgnoreCase("valueUnits")) {
            this.b = var5;
         } else if (var4.equalsIgnoreCase("valueShow")) {
            this.c = var5.toLowerCase().contains("true");
         }
      }

      boolean var6 = v.a(var1, var2, "http://mypreferencenamespace.100dof.com", "enableFree", "true").equalsIgnoreCase("true");
      if (App.a) {
         this.setEnabled(var6);
      }

      var6 = v.a(var1, var2, "http://mypreferencenamespace.100dof.com", "enablePro", "true").equalsIgnoreCase("true");
      if (App.b) {
         this.setEnabled(var6);
      }

   }

   private String b() {
      if (this.getEntry() == null) {
         i.a("MyListPreference.getValueStr cs=null");
         return "";
      } else {
         String var1 = this.getEntry().toString();
         if (!this.b.isEmpty()) {
            StringBuilder var2;
            if (this.b.equals("%")) {
               var2 = new StringBuilder();
            } else {
               var2 = new StringBuilder();
               var2.append(var1);
               var1 = " ";
            }

            var2.append(var1);
            var2.append(this.b);
            return var2.toString();
         } else {
            return var1;
         }
      }
   }

   public void a() {
      if (this.d != null) {
         this.d.setText(this.b());
      }

   }

   protected void a(View var1) {
      StringBuilder var2 = new StringBuilder();
      var2.append("MyPreferenceList ");
      var2.append(this.getKey());
      var2.append(" myCreateView");
      i.a(var2.toString());
      RelativeLayout var7 = (RelativeLayout)((TextView)var1.findViewById(16908304)).getParent();
      if (this.d != null) {
         StringBuilder var3 = new StringBuilder();
         var3.append("MyPreferenceList ");
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
      i.a("MyPreferenceList.onBindView");
      RelativeLayout var2 = (RelativeLayout)((TextView)var1.findViewById(16908304)).getParent();
      this.d = null;

      for(int var3 = 0; var3 < var2.getChildCount(); ++var3) {
         View var4 = var2.getChildAt(var3);
         if (var4 instanceof TextView && var4.getId() != 16908310 && var4.getId() != 16908304) {
            this.d = (TextView)var4;
         }
      }

      if (this.d != null) {
         String var5 = this.b();
         if (!TextUtils.isEmpty(var5)) {
            this.d.setText(var5);
            this.d.setVisibility(0);
         } else {
            this.d.setVisibility(8);
         }
      }

      super.onBindView(var1);
   }

   protected View onCreateView(ViewGroup var1) {
      StringBuilder var2 = new StringBuilder();
      var2.append("MyPreferenceList ");
      var2.append(this.getKey());
      var2.append(" onCreateView");
      i.a(var2.toString());
      View var3 = super.onCreateView(var1);
      this.a(var3);
      return var3;
   }

   protected void onDialogClosed(boolean var1) {
      super.onDialogClosed(var1);
      if (this.d != null) {
         this.d.setText(this.b());
      }

   }
}
