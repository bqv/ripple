package com.dof100.morsenotifier;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.Locale;

class b {
   public ArrayList a;

   public b(Context var1) {
      MyLog.log("MyAppFilters.constructor");
      this.a = new ArrayList();
      MyLog.log("MyAppNotificationFilters.constructor load");
      this.a(var1);
   }

   public static int c(Context var0) {
      return PreferenceManager.getDefaultSharedPreferences(var0).getInt("app_filters_n", 0);
   }

   public void a(Context var1) {
      SharedPreferences var2 = PreferenceManager.getDefaultSharedPreferences(var1);
      int var3 = 0;
      int var4 = var2.getInt("app_filters_n", 0);
      MyLog.log(String.format(Locale.US, "MyAppFilters.load - loading %d entries", var4));
      this.a.clear();

      while(var3 < var4) {
         a var5 = new a();
         var5.a(var2, var3);
         this.a.add(var5);
         ++var3;
      }

   }

   public void b(Context var1) {
      Editor var5 = PreferenceManager.getDefaultSharedPreferences(var1).edit();
      int var2 = this.a.size();
      var5.putInt("app_filters_n", var2);
      Locale var3 = Locale.US;
      int var4 = 0;
      MyLog.log(String.format(var3, "MyAppFilters.save - saving %d entries", var2));

      while(var4 < var2) {
         ((a)this.a.get(var4)).a(var5, var4);
         ++var4;
      }

      var5.apply();
   }
}
