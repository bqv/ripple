package com.dof100.morsenotifier;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build.VERSION;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.RelativeLayout.LayoutParams;

public class MyPreferenceText extends Preference {
   private static final ColorStateList a;
   private static final ColorStateList b;
   private final Context c;
   private boolean d = true;
   private final String e;
   private final String f;
   private final String g;
   private final String h;
   private Boolean i;
   private Boolean j;
   private TextView k;
   private String l;

   static {
      int[] var0 = new int[]{16842910};
      int[] var1 = new int[]{-16842910};
      int var2 = Color.rgb(240, 240, 160);
      a = new ColorStateList(new int[][]{var0, var1}, new int[]{var2, -7829368});
      var2 = Color.rgb(11, 141, 189);
      b = new ColorStateList(new int[][]{{16842910}, {-16842910}}, new int[]{var2, -7829368});
   }

   public MyPreferenceText(Context var1, AttributeSet var2) {
      super(var1, var2);
      int var3 = 0;
      this.i = false;
      this.j = true;
      this.k = null;
      this.l = "";
      this.c = var1;
      this.setSelectable(false);
      this.e = Utils.a(var1, var2, "http://mypreferencenamespace.100dof.com", "buttonIntentClass", "");
      this.f = Utils.a(var1, var2, "http://mypreferencenamespace.100dof.com", "buttonMsgWhat", "0");
      this.g = Utils.a(var1, var2, "http://mypreferencenamespace.100dof.com", "buttonMsgExtraText1", "0");

      for(this.h = Utils.a(var1, var2, "http://mypreferencenamespace.100dof.com", "buttonMsgExtraText2", "0"); var3 < var2.getAttributeCount(); ++var3) {
         String var4 = var2.getAttributeName(var3);
         String var5 = var2.getAttributeValue(var3);
         if (var4.equalsIgnoreCase("valueShow")) {
            this.j = var5.toLowerCase().contains("true");
         } else if (var4.equalsIgnoreCase("titleYellow")) {
            this.i = var5.toLowerCase().contains("true");
         }
      }

      boolean var6 = Utils.a(var1, var2, "http://mypreferencenamespace.100dof.com", "enableFree", "true").equalsIgnoreCase("true");
      boolean var7 = Utils.a(var1, var2, "http://mypreferencenamespace.100dof.com", "enablePro", "true").equalsIgnoreCase("true");
      boolean var8 = Utils.a(var1, var2, "http://mypreferencenamespace.100dof.com", "visibleFree", "true").equalsIgnoreCase("true");
      boolean var9 = Utils.a(var1, var2, "http://mypreferencenamespace.100dof.com", "visiblePro", "true").equalsIgnoreCase("true");
      if (App.a) {
         this.setEnabled(var6);
         this.d = var8;
      }

      if (App.b) {
         this.setEnabled(var7);
         this.d = var9;
      }

   }

   private void a() {
      Intent var1;
      label67: {
         ClassNotFoundException var2;
         label66: {
            try {
               var1 = new Intent(this.c, Class.forName(this.e));
            } catch (ClassNotFoundException var9) {
               var2 = var9;
               var1 = null;
               break label66;
            }

            try {
               var1.putExtra(this.c.getResources().getString(2131492900), this.f);
               var1.putExtra(this.c.getResources().getString(2131492875), this.g);
               var1.putExtra(this.c.getResources().getString(2131492876), this.h);
               break label67;
            } catch (ClassNotFoundException var8) {
               var2 = var8;
            }
         }

         var2.printStackTrace();
      }

      Exception var10000;
      label59: {
         Context var10;
         boolean var10001;
         label71: {
            try {
               if (this.e.equals("PLAYSTORE")) {
                  var10 = this.c;
                  var1 = new Intent("android.intent.action.VIEW", Uri.parse(App.l));
                  break label71;
               }
            } catch (Exception var5) {
               var10000 = var5;
               var10001 = false;
               break label59;
            }

            try {
               if (this.e.equals("PLAYSTOREPRO")) {
                  var10 = this.c;
                  var1 = new Intent("android.intent.action.VIEW", Uri.parse(App.m));
                  break label71;
               }
            } catch (Exception var7) {
               var10000 = var7;
               var10001 = false;
               break label59;
            }

            try {
               if (this.e.contains("Service")) {
                  this.c.startService(var1);
                  return;
               }
            } catch (Exception var6) {
               var10000 = var6;
               var10001 = false;
               break label59;
            }

            try {
               var10 = this.c;
            } catch (Exception var4) {
               var10000 = var4;
               var10001 = false;
               break label59;
            }
         }

         try {
            var10.startActivity(var1);
            return;
         } catch (Exception var3) {
            var10000 = var3;
            var10001 = false;
         }
      }

      Exception var11 = var10000;
      var11.printStackTrace();
   }

   public void a(String var1) {
      this.l = var1;
      if (this.k == null) {
         MyLog.log("MyPreferenceText.setValue ERROR  mValueTV == null");
      } else {
         this.k.setText(var1);
      }
   }

   protected void onBindView(View var1) {
      MyLog.log("MyPreferenceText.onBindView");
      TextView var2 = (TextView)var1.findViewById(16908310);
      if (this.i && var2 != null) {
         var2.setTextColor(a);
      }

      TextView var3 = (TextView)var1.findViewById(16908304);
      if (var3 != null) {
         RelativeLayout var4 = (RelativeLayout)var3.getParent();
         this.k = new TextView(var1.getContext());
         this.k.setText("");
         if (VERSION.SDK_INT < 23) {
            this.k.setTextAppearance(var1.getContext(), 16973894);
         } else {
            this.k.setTextAppearance(16973894);
         }

         this.k.setTextColor(b);
         LayoutParams var5 = new LayoutParams(-1, -2);
         var5.addRule(5, var3.getId());
         var5.addRule(3, var3.getId());
         this.k.setLayoutParams(var5);
         TextView var7 = this.k;
         byte var6;
         if (this.j) {
            var6 = 0;
         } else {
            var6 = 8;
         }

         var7.setVisibility(var6);
         var4.addView(this.k);
      } else {
         this.k = null;
      }

      if (!this.e.isEmpty()) {
         if (var2 != null) {
            var2.setOnClickListener(new OnClickListener() {
               public void onClick(View var1) {
                  MyPreferenceText.this.a();
               }
            });
         }

         if (var3 != null) {
            var3.setOnClickListener(new OnClickListener() {
               public void onClick(View var1) {
                  MyPreferenceText.this.a();
               }
            });
         }

         if (this.k != null) {
            this.k.setOnClickListener(new OnClickListener() {
               public void onClick(View var1) {
                  MyPreferenceText.this.a();
               }
            });
         }
      }

      this.a(this.l);
      super.onBindView(var1);
   }

   protected View onCreateView(ViewGroup var1) {
      MyLog.log("MyPreferenceText.onBindView");
      View var2 = super.onCreateView(var1);
      if (!this.d) {
         var2 = new View(var1.getContext());
         var2.setVisibility(8);
         TextView var3 = new TextView(var2.getContext());
         var3.setId(16908304);
         var3.setVisibility(8);
         var3 = new TextView(var2.getContext());
         var3.setId(16908310);
         var3.setVisibility(8);
         LinearLayout var4 = new LinearLayout(var2.getContext());
         var4.setId(16908312);
         var4.setVisibility(8);
      }

      return var2;
   }
}
