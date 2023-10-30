package com.dof100.morsenotifier;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

class MyRemindersArrayAdapter extends ArrayAdapter implements OnClickListener {
   private final Context a;
   private MyReminders b;
   private final LayoutInflater c;
   private final MyRemindersArrayAdapter.a d;

   public MyRemindersArrayAdapter(Context var1, MyReminders var2, MyRemindersArrayAdapter.a var3) {
      super(var1, 2131296266, var2.a);
      MyLog.log("MyRemindersArrayAdapter.constructor");
      this.a = var1;
      this.b = var2;
      this.d = var3;
      this.c = (LayoutInflater)this.a.getSystemService("layout_inflater");
   }

   public View getView(int var1, View var2, ViewGroup var3) {
      StringBuilder var4 = new StringBuilder();
      var4.append("MyRemindersArrayAdapter.getView position=");
      var4.append(var1);
      var4.append("  v=");
      var4.append(var2);
      MyLog.log(var4.toString());
      MyReminder var5 = (MyReminder)this.b.a.get(var1);
      View var8 = var2;
      if (var2 == null) {
         var8 = this.c.inflate(2131296266, var3, false);
      }

      var8.setTag(var5);
      TextView var6 = (TextView)var8.findViewById(2131165293);
      var6.setTag(var5);
      var6.setText(var5.a(this.a));
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
         MyLog.log("MyRemindersArrayAdapter.onClick");
         MyReminder var2 = (MyReminder)var1.getTag();
         if (var2 == null) {
            MyLog.log(this.a, "MyRemindersArrayAdapter.onClick ERROR f=null");
         } else {
            int var3 = this.b.a.indexOf(var2);
            StringBuilder var4 = new StringBuilder();
            var4.append("MyRemindersArrayAdapter.onClick index=");
            var4.append(var3);
            MyLog.log(var4.toString());
            String var5;
            if (var1.getId() == 2131165195) {
               var5 = "MyRemindersArrayAdapter.onClick b_delete";
            } else {
               if (var1.getId() != 2131165196) {
                  return;
               }

               var5 = "MyRemindersArrayAdapter.onClick b_edit";
            }

            MyLog.log(var5);
            this.d.a(var2, var3, var1);
         }
      }
   }

   public interface a {
      void a(MyReminder var1, int var2, View var3);
   }
}
