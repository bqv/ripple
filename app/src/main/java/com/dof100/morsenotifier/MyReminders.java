package com.dof100.morsenotifier;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.Locale;

class MyReminders {
   public ArrayList a;

   public MyReminders(Context var1) {
      MyLog.log("MyReminders.constructor");
      this.a = new ArrayList();
      this.a(var1);
   }

   public MyReminder a() {
      MyReminder var1 = null;
      long var2 = Long.MAX_VALUE;

      long var7;
      for(int var4 = 0; var4 < this.a.size(); var2 = var7) {
         MyReminder var5 = (MyReminder)this.a.get(var4);
         var5.b();
         MyReminder var6 = var1;
         var7 = var2;
         if (var5.g >= 0L) {
            var6 = var1;
            var7 = var2;
            if (var2 > var5.g) {
               var7 = var5.g;
               var6 = var5;
            }
         }

         ++var4;
         var1 = var6;
      }

      return var1;
   }

   public void a(Context var1) {
      SharedPreferences var5 = PreferenceManager.getDefaultSharedPreferences(var1);
      int var2 = 0;
      int var3 = var5.getInt("reminders_n", 0);
      MyLog.log(String.format(Locale.US, "MyReminders.load - loading %d entries", var3));
      this.a.clear();

      while(var2 < var3) {
         MyReminder var4 = new MyReminder();
         var4.a(var5, var2);
         this.a.add(var4);
         ++var2;
      }

   }

   public void b(Context var1) {
      Editor var2 = PreferenceManager.getDefaultSharedPreferences(var1).edit();
      int var3 = this.a.size();
      Locale var5 = Locale.US;
      int var4 = 0;
      MyLog.log(String.format(var5, "MyReminders.save - saving %d entries", var3));
      var2.putInt("reminders_n", var3);

      while(var4 < var3) {
         ((MyReminder)this.a.get(var4)).a(var2, var4);
         ++var4;
      }

      var2.apply();
   }
}
