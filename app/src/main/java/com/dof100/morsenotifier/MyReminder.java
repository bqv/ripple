package com.dof100.morsenotifier;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.Calendar;
import java.util.Locale;

public class MyReminder {
   int a = 0;
   int b = 0;
   final boolean[] c = new boolean[]{true, true, true, true, true, true, true};
   int d = 1;
   String e = "";
   String f = "";
   long g;

   public MyReminder() {
      this.d();
   }

   private void d() {
      this.a = 7;
      int var1 = 0;

      for(this.b = 0; var1 < 7; ++var1) {
         this.c[var1] = true;
      }

      this.d = 1;
      this.e = "";
      this.f = "";
   }

   public String a() {
      String var1 = "";
      String var2 = var1;
      if (this.e != null) {
         var2 = var1;
         if (!this.e.isEmpty()) {
            var2 = this.e;
         }
      }

      var1 = var2;
      StringBuilder var7;
      if (this.d == 1) {
         label28: {
            StringBuilder var3;
            Locale var4;
            String var5;
            Object[] var6;
            if (App.d) {
               if (this.b == 0) {
                  StringBuilder var8 = new StringBuilder();
                  var8.append(var2);
                  var8.append(" ");
                  var1 = String.format(Locale.US, "%02d hundred", this.a);
                  var7 = var8;
                  break label28;
               }

               var3 = new StringBuilder();
               var3.append(var2);
               var3.append(" ");
               var4 = Locale.US;
               var5 = "%02d %02d";
               var6 = new Object[]{this.a, this.b};
               var7 = var3;
            } else {
               var3 = new StringBuilder();
               var3.append(var2);
               var3.append(" ");
               var4 = Locale.US;
               var5 = "%02d%02d";
               var6 = new Object[]{this.a, this.b};
               var7 = var3;
            }

            var1 = String.format(var4, var5, var6);
         }

         var7.append(var1);
         var1 = var7.toString();
      }

      var2 = var1;
      if (this.f != null) {
         var2 = var1;
         if (!this.f.isEmpty()) {
            var7 = new StringBuilder();
            var7.append(var1);
            var7.append(" ");
            var7.append(this.f);
            var2 = var7.toString();
         }
      }

      return var2;
   }

   public String a(Context var1) {
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = 0; var2 < 7; var3 = var4) {
         var4 = var3;
         if (this.c[var2]) {
            var4 = var3 + 1;
         }

         ++var2;
      }

      String var5 = "";
      String var7;
      if (var3 == 0) {
         var7 = "no days set";
      } else if (var3 == 7) {
         var7 = "everyday";
      } else if (var3 == 2 && this.c[0] && this.c[6]) {
         var7 = "weekends";
      } else {
         StringBuilder var8;
         if (this.c[0]) {
            var8 = new StringBuilder();
            var8.append("");
            var8.append(var1.getResources().getString(2131492934));
            var8.append(", ");
            var5 = var8.toString();
         }

         String var6 = var5;
         StringBuilder var9;
         if (this.c[1]) {
            var9 = new StringBuilder();
            var9.append(var5);
            var9.append(var1.getResources().getString(2131492935));
            var9.append(", ");
            var6 = var9.toString();
         }

         var5 = var6;
         if (this.c[2]) {
            var8 = new StringBuilder();
            var8.append(var6);
            var8.append(var1.getResources().getString(2131492936));
            var8.append(", ");
            var5 = var8.toString();
         }

         var6 = var5;
         if (this.c[3]) {
            var9 = new StringBuilder();
            var9.append(var5);
            var9.append(var1.getResources().getString(2131492937));
            var9.append(", ");
            var6 = var9.toString();
         }

         var5 = var6;
         if (this.c[4]) {
            var8 = new StringBuilder();
            var8.append(var6);
            var8.append(var1.getResources().getString(2131492938));
            var8.append(", ");
            var5 = var8.toString();
         }

         var6 = var5;
         if (this.c[5]) {
            var9 = new StringBuilder();
            var9.append(var5);
            var9.append(var1.getResources().getString(2131492939));
            var9.append(", ");
            var6 = var9.toString();
         }

         if (this.c[6]) {
            var8 = new StringBuilder();
            var8.append(var6);
            var8.append(var1.getResources().getString(2131492940));
            var7 = var8.toString();
         } else {
            var7 = var6;
         }
      }

      var5 = var7;
      if (var7.length() > 3) {
         var5 = var7;
         if (var7.charAt(var7.length() - 2) == ',') {
            var5 = var7.substring(0, var7.length() - 2);
         }
      }

      return String.format(Locale.US, "%02d:%02d, %s. %s", this.a, this.b, var5, this.c());
   }

   public void a(Editor var1, int var2) {
      Locale var3 = Locale.US;
      int var4 = 0;
      MyLog.log(String.format(var3, "MyReminder.save - no %d", var2));
      StringBuilder var5 = new StringBuilder();
      var5.append("reminder_");
      var5.append(var2);
      var5.append("_TimeHour");
      var1.putInt(var5.toString(), this.a);
      var5 = new StringBuilder();
      var5.append("reminder_");
      var5.append(var2);
      var5.append("_TimeMin");
      var1.putInt(var5.toString(), this.b);

      while(var4 < 7) {
         var5 = new StringBuilder();
         var5.append("reminder_");
         var5.append(var2);
         var5.append("_DoW");
         var5.append(var4);
         var1.putBoolean(var5.toString(), this.c[var4]);
         ++var4;
      }

      var5 = new StringBuilder();
      var5.append("reminder_");
      var5.append(var2);
      var5.append("_SayTime");
      var1.putInt(var5.toString(), this.d);
      var5 = new StringBuilder();
      var5.append("reminder_");
      var5.append(var2);
      var5.append("_SayBefore");
      var1.putString(var5.toString(), this.e);
      var5 = new StringBuilder();
      var5.append("reminder_");
      var5.append(var2);
      var5.append("_SayAfter");
      var1.putString(var5.toString(), this.f);
   }

   public void a(SharedPreferences var1, int var2) {
      this.d();
      StringBuilder var3 = new StringBuilder();
      var3.append("reminder_");
      var3.append(var2);
      var3.append("_TimeHour");
      this.a = var1.getInt(var3.toString(), this.a);
      var3 = new StringBuilder();
      var3.append("reminder_");
      var3.append(var2);
      var3.append("_TimeMin");
      this.b = var1.getInt(var3.toString(), this.b);

      for(int var4 = 0; var4 < 7; ++var4) {
         boolean[] var5 = this.c;
         var3 = new StringBuilder();
         var3.append("reminder_");
         var3.append(var2);
         var3.append("_DoW");
         var3.append(var4);
         var5[var4] = var1.getBoolean(var3.toString(), this.c[var4]);
      }

      var3 = new StringBuilder();
      var3.append("reminder_");
      var3.append(var2);
      var3.append("_SayTime");
      this.d = var1.getInt(var3.toString(), this.d);
      var3 = new StringBuilder();
      var3.append("reminder_");
      var3.append(var2);
      var3.append("_SayBefore");
      this.e = var1.getString(var3.toString(), this.e);
      var3 = new StringBuilder();
      var3.append("reminder_");
      var3.append(var2);
      var3.append("_SayAfter");
      this.f = var1.getString(var3.toString(), this.f);
   }

   public void b() {
      byte var1 = 0;
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = 0; var2 < 7; var3 = var4) {
         var4 = var3;
         if (this.c[var2]) {
            var4 = var3 + 1;
         }

         ++var2;
      }

      if (var3 == 0) {
         this.g = -1L;
      } else {
         Calendar var5 = Calendar.getInstance();
         var2 = var5.get(7);
         Calendar var6 = Calendar.getInstance();
         var6.set(11, this.a);
         var6.set(12, this.b);
         var6.set(13, 0);
         this.g = var6.getTimeInMillis() - var5.getTimeInMillis();
         var3 = var1;

         do {
            if (this.c[(var2 - 1 + var3) % 7] && this.g > 0L) {
               return;
            }

            var4 = var3 + 1;
            var6.add(10, 24);
            this.g = var6.getTimeInMillis() - var5.getTimeInMillis();
            var3 = var4;
         } while(var4 <= 8);

         this.g = -1L;
      }
   }

   public String c() {
      this.b();
      if (this.g < 0L) {
         return "";
      } else {
         int var1 = (int)(((double)this.g + 60000.0D) / 8.64E7D);
         int var2 = var1;
         if (var1 < 2) {
            var2 = 0;
         }

         double var3 = (double)this.g;
         double var5 = (double)var2 * 1000.0D * 60.0D * 60.0D * 24.0D;
         int var7 = (int)((var3 + 60000.0D - var5) / 3600000.0D);
         var1 = var7;
         if (var7 < 2) {
            var1 = var7;
            if (var2 == 0) {
               var1 = 0;
            }
         }

         var7 = (int)(((double)this.g + 60000.0D - var5 - (double)var1 * 1000.0D * 60.0D * 60.0D) / 60000.0D);
         String var8 = "";
         StringBuilder var13;
         if (var2 > 0) {
            var13 = new StringBuilder();
            var13.append("");
            var13.append(String.format(Locale.US, "%d days", var2));
            var8 = var13.toString();
         }

         String var9;
         StringBuilder var14;
         label42: {
            StringBuilder var10;
            Locale var11;
            String var12;
            Object[] var15;
            if (var1 > 1) {
               var9 = var8;
               if (!var8.isEmpty()) {
                  var14 = new StringBuilder();
                  var14.append(var8);
                  var14.append(", ");
                  var9 = var14.toString();
               }

               var10 = new StringBuilder();
               var10.append(var9);
               var11 = Locale.US;
               var12 = "%d hours";
               var15 = new Object[]{var1};
               var14 = var10;
            } else {
               var9 = var8;
               if (var1 != 1) {
                  break label42;
               }

               var9 = var8;
               if (!var8.isEmpty()) {
                  var14 = new StringBuilder();
                  var14.append(var8);
                  var14.append(", ");
                  var9 = var14.toString();
               }

               var10 = new StringBuilder();
               var10.append(var9);
               var11 = Locale.US;
               var12 = "%d hour";
               var15 = new Object[]{var1};
               var14 = var10;
            }

            var14.append(String.format(var11, var12, var15));
            var9 = var14.toString();
         }

         var8 = var9;
         if (var7 > 0) {
            var8 = var9;
            if (!var9.isEmpty()) {
               var13 = new StringBuilder();
               var13.append(var9);
               var13.append(" and ");
               var8 = var13.toString();
            }

            var14 = new StringBuilder();
            var14.append(var8);
            var14.append(String.format(Locale.US, "%d min", var7));
            var8 = var14.toString();
         }

         var14 = new StringBuilder();
         var14.append("Due ");
         var14.append(var8);
         var14.append(" from now.");
         return var14.toString();
      }
   }
}
