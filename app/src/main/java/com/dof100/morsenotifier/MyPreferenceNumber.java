package com.dof100.morsenotifier;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.preference.DialogPreference;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.RelativeLayout.LayoutParams;
import java.util.Locale;

public class MyPreferenceNumber extends DialogPreference {
   private static final ColorStateList a;
   private NumberPicker b = null;
   private int c;
   private int d;
   private int e;
   private int f;
   private String g;
   private Boolean h;
   private TextView i;

   static {
      int var0 = Color.rgb(11, 141, 189);
      a = new ColorStateList(new int[][]{{16842910}, {-16842910}}, new int[]{var0, -7829368});
   }

   public MyPreferenceNumber(Context var1, AttributeSet var2) {
      super(var1, var2);
      int var3 = 0;
      this.c = 0;
      this.d = 0;
      this.e = 10;
      this.f = 1;
      this.g = "";
      this.h = true;
      this.i = null;
      this.setPositiveButtonText("Set");
      this.setNegativeButtonText("Cancel");

      for(; var3 < var2.getAttributeCount(); ++var3) {
         String var4 = var2.getAttributeName(var3);
         String var5 = var2.getAttributeValue(var3);
         if (!var4.equalsIgnoreCase("vmin") && !var4.equalsIgnoreCase("valueMin")) {
            if (!var4.equalsIgnoreCase("vmax") && !var4.equalsIgnoreCase("valueMax")) {
               if (!var4.equalsIgnoreCase("vstep") && !var4.equalsIgnoreCase("valueStep")) {
                  if (!var4.equalsIgnoreCase("vunits") && !var4.equalsIgnoreCase("valueUnits")) {
                     if (var4.equalsIgnoreCase("valueShow")) {
                        this.h = var5.toLowerCase().contains("true");
                     }
                  } else {
                     this.g = var5;
                  }
               } else {
                  this.f = Integer.parseInt(var5);
               }
            } else {
               this.e = Integer.parseInt(var5);
            }
         } else {
            this.d = Integer.parseInt(var5);
         }
      }

      boolean var6 = Utils.a(var1, var2, "http://mypreferencenamespace.100dof.com", "enableFree", "true").equalsIgnoreCase("true");
      if (App.a) {
         this.setEnabled(var6);
      }

      var6 = Utils.a(var1, var2, "http://mypreferencenamespace.100dof.com", "enablePro", "true").equalsIgnoreCase("true");
      if (App.b) {
         this.setEnabled(var6);
      }

   }

   private String a() {
      String var1 = Integer.toString(this.c);
      String var2 = var1;
      if (!this.g.isEmpty()) {
         StringBuilder var4;
         if (this.g.equals("%")) {
            var4 = new StringBuilder();
         } else {
            var4 = new StringBuilder();
            var4.append(var1);
            var1 = " ";
         }

         var4.append(var1);
         var4.append(this.g);
         var2 = var4.toString();
      }

      StringBuilder var3 = new StringBuilder();
      var3.append("MyNumberPreference.getValueStr =");
      var3.append(var2);
      MyLog.log(var3.toString());
      return var2;
   }

   protected void a(View var1) {
      StringBuilder var2 = new StringBuilder();
      var2.append("MyNumberPreference ");
      var2.append(this.getKey());
      var2.append(" myCreateView");
      MyLog.log(var2.toString());
      RelativeLayout var7 = (RelativeLayout)((TextView)var1.findViewById(16908304)).getParent();
      if (this.i != null) {
         StringBuilder var3 = new StringBuilder();
         var3.append("MyNumberPreference ");
         var3.append(this.getKey());
         var3.append(" myCreateView mValueTV!=null");
         MyLog.log(var3.toString());
         var7.removeView(this.i);
         this.i = null;
      }

      this.i = new TextView(var1.getContext());
      if (VERSION.SDK_INT < 23) {
         this.i.setTextAppearance(var1.getContext(), 16973894);
      } else {
         this.i.setTextAppearance(16973894);
      }

      this.i.setTextColor(a);
      LayoutParams var5 = new LayoutParams(-1, -2);
      var5.addRule(5, 16908304);
      var5.addRule(3, 16908304);
      this.i.setLayoutParams(var5);
      TextView var6 = this.i;
      byte var4;
      if (this.h) {
         var4 = 0;
      } else {
         var4 = 8;
      }

      var6.setVisibility(var4);
      var7.addView(this.i);
   }

   protected void onBindDialogView(View var1) {
      super.onBindDialogView(var1);
      this.b.setValue((this.c - this.d) / this.f);
   }

   protected void onBindView(View var1) {
      RelativeLayout var2 = (RelativeLayout)((TextView)var1.findViewById(16908304)).getParent();
      this.i = null;

      for(int var3 = 0; var3 < var2.getChildCount(); ++var3) {
         View var4 = var2.getChildAt(var3);
         if (var4 instanceof TextView && var4.getId() != 16908310 && var4.getId() != 16908304) {
            this.i = (TextView)var4;
         }
      }

      if (this.i != null) {
         String var5 = this.a();
         if (!TextUtils.isEmpty(var5)) {
            this.i.setText(var5);
            this.i.setVisibility(0);
         } else {
            this.i.setVisibility(8);
         }
      }

      super.onBindView(var1);
   }

   protected View onCreateDialogView() {
      Context var1 = this.getContext();
      LinearLayout var2 = new LinearLayout(var1);
      var2.setOrientation(0);
      var2.setGravity(17);
      var2.setPadding(6, 6, 6, 6);
      this.b = new NumberPicker(var1);
      this.b.setGravity(17);
      int var3 = (this.e - this.d) / this.f;
      String[] var4 = new String[var3 + 0 + 1];

      for(int var5 = 0; var5 <= var3; ++var5) {
         var4[var5] = Integer.toString(this.d + this.f * var5);
      }

      this.b.setMinValue(0);
      this.b.setMaxValue(var3);
      this.b.setDisplayedValues(var4);
      this.b.setDescendantFocusability(393216);
      var2.addView(this.b);
      if (!this.g.isEmpty()) {
         TextView var6 = new TextView(var1);
         var6.setText(String.format(Locale.US, " %s", this.g));
         var6.setGravity(17);
         var2.addView(var6);
      }

      return var2;
   }

   protected View onCreateView(ViewGroup var1) {
      StringBuilder var2 = new StringBuilder();
      var2.append("MyNumberPreference ");
      var2.append(this.getKey());
      var2.append(" onCreateView");
      MyLog.log(var2.toString());
      View var3 = super.onCreateView(var1);
      this.a(var3);
      return var3;
   }

   protected void onDialogClosed(boolean var1) {
      super.onDialogClosed(var1);
      MyLog.log("MyNumberPreference.onDialogClosed");
      if (var1) {
         this.c = this.d + this.b.getValue() * this.f;
         if (this.callChangeListener(this.c)) {
            this.persistString(Integer.toString(this.c));
         }
      }

      if (this.i != null) {
         this.i.setText(this.a());
      }

      this.notifyChanged();
   }

   protected Object onGetDefaultValue(TypedArray var1, int var2) {
      return var1.getString(var2);
   }

   protected void onSetInitialValue(boolean var1, Object var2) {
      int var3;
      if (var1) {
         var3 = Integer.parseInt(this.getPersistedString("0"));
      } else {
         var3 = Integer.parseInt(var2.toString());
         this.persistString(var2.toString());
      }

      this.c = var3;
   }
}
