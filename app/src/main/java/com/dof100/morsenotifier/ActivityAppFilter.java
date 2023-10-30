package com.dof100.morsenotifier;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import java.util.Locale;

public class ActivityAppFilter extends Activity {
   private f a = null;
   private b b = null;
   private a c = null;
   private Spinner d = null;
   private EditText e = null;
   private EditText f = null;
   private EditText g = null;
   private EditText h = null;
   private CheckBox i = null;
   private CheckBox j = null;
   private CheckBox k = null;
   private EditText l = null;
   private EditText m = null;

   private void a() {
      StringBuilder var1 = new StringBuilder();
      var1.append("ActivityAppFilter.filter2view package=");
      var1.append(this.c.a);
      MyLog.log(var1.toString());
      final int var2 = this.a.a(this.c.a);
      var1 = new StringBuilder();
      var1.append("ActivityAppFilter.filter2view package idx=");
      var1.append(var2);
      MyLog.log(var1.toString());
      this.d.post(new Runnable() {
         public void run() {
            if (var2 >= 0) {
               ActivityAppFilter.this.d.setSelection(var2);
            }

         }
      });
      this.e.setText(this.c.b);
      this.f.setText(this.c.c);
      this.g.setText(this.c.d);
      this.h.setText(this.c.e);
      this.i.setChecked(this.c.f);
      this.j.setChecked(this.c.g);
      this.k.setChecked(this.c.h);
      this.l.setText(this.c.i);
      this.m.setText(this.c.j);
   }

   private void b() {
      int var1 = this.d.getSelectedItemPosition();
      this.c.a = ((e)this.a.a.get(var1)).a;
      StringBuilder var2 = new StringBuilder();
      var2.append("ActivityAppFilter.view2filter idx=");
      var2.append(var1);
      var2.append(" package=");
      var2.append(this.c.a);
      MyLog.log(var2.toString());
      this.c.b = this.e.getText().toString();
      this.c.c = this.f.getText().toString();
      this.c.d = this.g.getText().toString();
      this.c.e = this.h.getText().toString();
      this.c.f = this.i.isChecked();
      this.c.g = this.j.isChecked();
      this.c.h = this.k.isChecked();
      this.c.i = this.l.getText().toString();
      this.c.j = this.m.getText().toString();
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      MyLog.log("ActivityAppFilter.onCreate");
      this.setContentView(2131296257);
      this.c = null;
      this.b = new b(this);
      this.a = new f(this);
      var1 = this.getIntent().getExtras();
      int var2;
      StringBuilder var5;
      if (var1 != null) {
         var2 = var1.getInt("FILTERINDEX");
         if (var2 >= 0 && var2 < this.b.a.size()) {
            this.c = (a)this.b.a.get(var2);
            var5 = new StringBuilder();
            var5.append("ActivityAppFilter.onCreate loaded filter at position = ");
            var5.append(var2);
            MyLog.log(var5.toString());
         } else {
            Locale var4 = Locale.US;
            int var3 = var2 + 1;
            MyLog.toast(this, String.format(var4, "Filter %d not found", var3));
            MyLog.log(this, (String)String.format(Locale.US, "Filter %d not found", var3));
            this.finish();
         }
      } else {
         var2 = 0;
      }

      if (this.c == null) {
         this.c = new a();
         this.b.a.add(this.c);
         var2 = this.b.a.size() - 1;
         var5 = new StringBuilder();
         var5.append("ActivityAppFilter.onCreate created new filter at position = ");
         var5.append(var2);
         MyLog.log(var5.toString());
      }

      this.setTitle(String.format(Locale.US, "%s %d", this.getResources().getString(2131492925), var2 + 1));
      this.d = (Spinner)this.findViewById(2131165269);
      ArrayAdapter var6 = new ArrayAdapter(this, 17367048, (String[])this.a.a().toArray(new String[this.b.a.size()]));
      var6.setDropDownViewResource(17367049);
      this.d.setAdapter(var6);
      this.e = (EditText)this.findViewById(2131165233);
      this.f = (EditText)this.findViewById(2131165234);
      this.g = (EditText)this.findViewById(2131165235);
      this.h = (EditText)this.findViewById(2131165236);
      this.i = (CheckBox)this.findViewById(2131165221);
      this.j = (CheckBox)this.findViewById(2131165219);
      this.k = (CheckBox)this.findViewById(2131165220);
      this.l = (EditText)this.findViewById(2131165232);
      this.m = (EditText)this.findViewById(2131165231);
      this.a();
   }

   protected void onDestroy() {
      MyLog.log("ActivityAppFilter.onDestroy");
      super.onDestroy();
   }

   protected void onPause() {
      MyLog.log("ActivityAppFilter.onPause");
      this.b();
      this.b.b(this);
      super.onPause();
   }

   protected void onStop() {
      MyLog.log("ActivityAppFilter.onStop");
      super.onStop();
   }
}
