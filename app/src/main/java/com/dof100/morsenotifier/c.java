package com.dof100.morsenotifier;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.Locale;

class c extends ArrayAdapter implements OnClickListener {
   private final Context a;
   private b b;
   private final LayoutInflater c;
   private final c.a d;

   public c(Context var1, b var2, c.a var3) {
      super(var1, 2131296259, var2.a);
      MyLog.log("MyAppFiltersArrayAdapter.constructor");
      this.a = var1;
      this.b = var2;
      this.d = var3;
      this.c = (LayoutInflater)this.a.getSystemService("layout_inflater");
   }

   public void a() {
      this.insert(new com.dof100.morsenotifier.a(), this.b.a.size());
      this.b.b(this.a);
      this.notifyDataSetChanged();
   }

   public View getView(int var1, View var2, ViewGroup var3) {
      StringBuilder var4 = new StringBuilder();
      var4.append("MyAppFiltersArrayAdapter.getView position=");
      var4.append(var1);
      var4.append("  v=");
      var4.append(var2);
      MyLog.log(var4.toString());
      com.dof100.morsenotifier.a var5 = (com.dof100.morsenotifier.a)this.b.a.get(var1);
      View var8 = var2;
      if (var2 == null) {
         var8 = this.c.inflate(2131296259, var3, false);
      }

      var8.setTag(var5);
      TextView var6 = (TextView)var8.findViewById(2131165293);
      var6.setTag(var5);
      var6.setText(String.format(Locale.US, "%d. %s", var1 + 1, var5.a(this.a)));
      ImageButton var7 = (ImageButton)var8.findViewById(2131165196);
      var7.setTag(var5);
      var7.setOnClickListener(this);
      var7 = (ImageButton)var8.findViewById(2131165195);
      var7.setTag(var5);
      var7.setOnClickListener(this);
      return var8;
   }

   public void onClick(View var1) {
      if (var1 != null) {
         MyLog.log("MyAppFiltersArrayAdapter.onClick");
         com.dof100.morsenotifier.a var2 = (com.dof100.morsenotifier.a)var1.getTag();
         if (var2 == null) {
            MyLog.log(this.a, "MyAppFiltersArrayAdapter.onClick ERROR f=null");
         } else {
            StringBuilder var3 = new StringBuilder();
            var3.append("MyAppFiltersArrayAdapter.onClick f.package=");
            var3.append(var2.a);
            MyLog.log(var3.toString());
            int var4 = this.b.a.indexOf(var2);
            var3 = new StringBuilder();
            var3.append("MyAppFiltersArrayAdapter.onClick index=");
            var3.append(var4);
            MyLog.log(var3.toString());
            String var5;
            if (var1.getId() == 2131165195) {
               var5 = "MyAppFiltersArrayAdapter.onClick b_delete";
            } else {
               if (var1.getId() != 2131165196) {
                  return;
               }

               var5 = "MyAppFiltersArrayAdapter.onClick b_edit";
            }

            MyLog.log(var5);
            this.d.a(var2, var4, var1);
         }
      }
   }

   public interface a {
      void a(com.dof100.morsenotifier.a var1, int var2, View var3);
   }
}
