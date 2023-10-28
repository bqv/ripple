package com.dof100.morsenotifier;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

class e {
   final String a;
   String b;

   public e(PackageManager var1, ApplicationInfo var2) {
      if (var2 == null) {
         this.a = "";
         this.b = "";
      } else {
         StringBuilder var7;
         label40: {
            this.a = var2.packageName;
            boolean var10001;
            String var6;
            if (var1 != null) {
               try {
                  var6 = (String)var1.getApplicationLabel(var2);
               } catch (Exception var5) {
                  var10001 = false;
                  break label40;
               }
            } else {
               var6 = "";
            }

            try {
               this.b = var6;
               if (this.b.startsWith("com.android.")) {
                  var7 = new StringBuilder();
                  var7.append(this.b.substring(12, 13).toUpperCase());
                  var7.append(this.b.substring(13));
                  this.b = var7.toString();
               }
            } catch (Exception var4) {
               var10001 = false;
               break label40;
            }

            try {
               var7 = new StringBuilder();
               var7.append(this.b);
               var7.append(" (");
               var7.append(var2.packageName);
               var7.append(")");
               this.b = var7.toString();
               return;
            } catch (Exception var3) {
               var10001 = false;
            }
         }

         var7 = new StringBuilder();
         var7.append(" (");
         var7.append(var2.packageName);
         var7.append(")");
         this.b = var7.toString();
      }
   }

   public e(String var1, String var2) {
      this.a = var1;
      this.b = var2;
   }
}
