package com.dof100.morsenotifier;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.Locale;

class MyAppNotificationFilters {
   public ArrayList<MyAppNotificationFilter> list;

   public MyAppNotificationFilters(Context var1) {
      MyLog.log("MyAppFilters.constructor");
      this.list = new ArrayList<>();
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
      this.list.clear();

      while(var3 < var4) {
         MyAppNotificationFilter var5 = new MyAppNotificationFilter();
         var5.a(var2, var3);
         this.list.add(var5);
         ++var3;
      }

   }

   public void b(Context var1) {
      Editor var5 = PreferenceManager.getDefaultSharedPreferences(var1).edit();
      int var2 = this.list.size();
      var5.putInt("app_filters_n", var2);
      Locale var3 = Locale.US;
      int var4 = 0;
      MyLog.log(String.format(var3, "MyAppFilters.save - saving %d entries", var2));

      while(var4 < var2) {
         ((MyAppNotificationFilter)this.list.get(var4)).a(var5, var4);
         ++var4;
      }

      var5.apply();
   }
}
