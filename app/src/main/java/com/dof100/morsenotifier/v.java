package com.dof100.morsenotifier;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.AttributeSet;
import java.util.Locale;

class v {
   public static int a(int var0, int var1, int var2, int var3) {
      int var4 = var2 * 60;
      var2 = Math.abs(var0 * 60 + var1 - var4 - var3);
      int var5 = Math.abs((var0 - 24) * 60 + var1 - var4 - var3);
      var0 = Math.abs((var0 + 24) * 60 + var1 - var4 - var3);
      return Math.min(Math.min(var2, var5), var0);
   }

   public static int a(String var0, String var1, int var2, int var3, int var4) {
      StringBuilder var5 = new StringBuilder();
      var5.append("<");
      var5.append(var1);
      int var6 = var0.indexOf(var5.toString());
      if (var6 < 0) {
         return var2;
      } else {
         int var7 = var0.indexOf(">", var6);
         int var8 = var6 + 2;
         if (var7 <= var8) {
            return var2;
         } else if (var7 >= var6 + 8) {
            return var2;
         } else {
            var0 = var0.substring(var8, var7);

            try {
               var8 = Integer.parseInt(var0);
            } catch (NumberFormatException var9) {
               i.a(String.format(Locale.US, "getTagValue ERROR could not convers %s to int", var0));
               return var2;
            }

            var2 = var8;
            if (var8 < var3) {
               var2 = var3;
            }

            return var2 > var4 ? var4 : var2;
         }
      }
   }

   static String a(Context var0, SharedPreferences var1, String var2, String var3, String var4, String var5) {
      Resources var6 = var0.getResources();
      StringBuilder var7 = new StringBuilder();
      var7.append(var2);
      var7.append(var4);
      int var8 = var6.getIdentifier(var7.toString(), "string", var0.getPackageName());
      if (var8 != 0) {
         return var6.getString(var8);
      } else {
         StringBuilder var9 = new StringBuilder();
         var9.append(var2);
         var9.append(var5);
         var8 = var6.getIdentifier(var9.toString(), "string", var0.getPackageName());
         if (var8 != 0) {
            return var6.getString(var8);
         } else if (var3 != null && !var3.isEmpty()) {
            return var1.getAll().get(var3) instanceof Boolean ? Boolean.toString(var1.getBoolean(var3, Boolean.parseBoolean("0"))) : var1.getString(var3, "0");
         } else {
            i.a(String.format(Locale.US, "prefGetDefaultValue key %s ERROR: default value not found in resources...", var2));
            return "0";
         }
      }
   }

   public static String a(Context var0, AttributeSet var1, String var2, String var3, String var4) {
      Resources var5 = var0.getResources();
      String var7 = var1.getAttributeValue(var2, var3);
      if (var7 == null) {
         return var4;
      } else {
         byte var6;
         if (var7.startsWith("@string/")) {
            var6 = 8;
         } else {
            if (!var7.startsWith("@")) {
               return var7;
            }

            var6 = 1;
         }

         return var5.getString(var5.getIdentifier(var7.substring(var6), "string", var0.getPackageName()));
      }
   }

   public static String a(Context var0, String var1) {
      PackageManager var2 = var0.getPackageManager();
      if (var2 == null) {
         return var1;
      } else {
         ApplicationInfo var4;
         try {
            var4 = var2.getApplicationInfo(var1, 0);
         } catch (NameNotFoundException var3) {
            var3.printStackTrace();
            var4 = null;
         }

         if (var4 == null) {
            return var1;
         } else {
            String var5 = (String)var2.getApplicationLabel(var4);
            return var5 == null ? var1 : var5;
         }
      }
   }

   public static String a(String var0) {
      int var1 = var0.indexOf("<");
      int var2 = var0.indexOf(">");
      int var5;
      boolean var11;
      if (var1 >= 0 && var2 > var1) {
         byte var3 = 0;
         var11 = false;
         var5 = var1;
         var1 = var3;
      } else {
         byte var4 = 0;
         var5 = var1;
         var1 = var4;
         var11 = true;
      }

      while(!var11) {
         String var6 = var0.substring(0, var5);
         var0 = var0.substring(var2 + 1);
         StringBuilder var7 = new StringBuilder();
         var7.append(var6);
         var7.append(var0);
         var6 = var7.toString();
         int var8 = var6.indexOf("<");
         int var10 = var6.indexOf(">");
         if (var8 < 0 || var10 <= var8) {
            var11 = true;
         }

         int var9 = var1 + 1;
         var0 = var6;
         var5 = var8;
         var2 = var10;
         var1 = var9;
         if (var9 > 10) {
            var0 = var6;
            var5 = var8;
            var2 = var10;
            var1 = var9;
            var11 = true;
         }
      }

      return var0;
   }

   static String a(String var0, char var1) {
      if (var0 == null) {
         return "";
      } else if (var0.isEmpty()) {
         return "";
      } else {
         StringBuilder var2 = new StringBuilder();
         var2.append("");
         var2.append(var0.charAt(0));
         String var5 = var2.toString();

         for(int var3 = 1; var3 < var0.length(); ++var3) {
            StringBuilder var4;
            if (Character.isDigit(var0.charAt(var3 - 1)) && Character.isDigit(var0.charAt(var3))) {
               var4 = new StringBuilder();
               var4.append(var5);
               var4.append(var1);
               var2 = var4;
            } else {
               var4 = new StringBuilder();
               var4.append(var5);
               var2 = var4;
            }

            var2.append(var0.charAt(var3));
            var5 = var2.toString();
         }

         return var5;
      }
   }

   public static String a(String var0, String var1, int var2) {
      StringBuilder var3 = new StringBuilder();
      var3.append("<");
      var3.append(var1);
      var3.append(">");
      int var4 = var0.indexOf(var3.toString());
      var3 = new StringBuilder();
      var3.append("</");
      var3.append(var1);
      var3.append(">");
      int var5 = var0.indexOf(var3.toString());
      if (var4 < 0 && var5 < 0) {
         return var0;
      } else {
         label17: {
            StringBuilder var6;
            String var7;
            switch(var2) {
            case 1:
               var6 = new StringBuilder();
               var7 = var0.substring(0, var4);
               break;
            case 2:
               var6 = new StringBuilder();
               var6.append(var0.substring(0, var4));
               var7 = var0.substring(var1.length() + var4 + 2, var5);
               break;
            default:
               var1 = var0;
               break label17;
            }

            var6.append(var7);
            var6.append(var0.substring(var1.length() + var5 + 3));
            var1 = var6.toString();
         }

         i.a(String.format(Locale.US, "Utils.XMLDo Input = %s, p1=%d, p2=%d , res=%s", var0, var4, var5, var1));
         return var1;
      }
   }

   public static boolean a(String var0, String var1, boolean var2) {
      return a(var0, var1, var2, 0, 1) > 0;
   }

   static String b(Context var0, SharedPreferences var1, String var2, String var3, String var4, String var5) {
      String var7;
      if (var1.getString(var2, "IMPOSSIBLE!STRING").equals("IMPOSSIBLE!STRING")) {
         i.a(String.format(Locale.US, "prefGetString       key %s not initialized. Initializing now...", var2));
         Editor var6 = var1.edit();
         var7 = a(var0, var1, var2, var3, var4, var5);
         var6.putString(var2, var7);
         var6.apply();
      } else {
         var7 = "0";
      }

      return var1.getString(var2, var7);
   }

   static int c(Context var0, SharedPreferences var1, String var2, String var3, String var4, String var5) {
      String var7;
      if (var1.getString(var2, "IMPOSSIBLE!STRING").equals("IMPOSSIBLE!STRING")) {
         i.a(String.format(Locale.US, "prefGetInt          key %s not initialized. Initializing now...", var2));
         Editor var6 = var1.edit();
         var7 = a(var0, var1, var2, var3, var4, var5);
         var6.putString(var2, var7);
         var6.apply();
      } else {
         var7 = "0";
      }

      return Integer.parseInt(var1.getString(var2, var7));
   }

   static boolean d(Context var0, SharedPreferences var1, String var2, String var3, String var4, String var5) {
      boolean var7;
      if (!var1.getBoolean(var2, false) && var1.getBoolean(var2, true)) {
         i.a(String.format(Locale.US, "prefGetBoolean      key %s not initialized. Initializing now...", var2));
         Editor var6 = var1.edit();
         var7 = Boolean.parseBoolean(a(var0, var1, var2, var3, var4, var5));
         var6.putBoolean(var2, var7);
         var6.apply();
      } else {
         var7 = false;
      }

      return var1.getBoolean(var2, var7);
   }

   static int e(Context var0, SharedPreferences var1, String var2, String var3, String var4, String var5) {
      String var7;
      if (var1.getString(var2, "IMPOSSIBLE!STRING").equals("IMPOSSIBLE!STRING")) {
         i.a(String.format(Locale.US, "prefGetColor        key %s not initialized. Initializing now...", var2));
         Editor var6 = var1.edit();
         var7 = a(var0, var1, var2, var3, var4, var5);
         var6.putString(var2, var7);
         var6.apply();
      } else {
         var7 = "0xFF000000";
      }

      return Color.parseColor(var1.getString(var2, var7));
   }
}
