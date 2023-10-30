package com.dof100.morsenotifier;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class f {
   public final List a = new ArrayList();

   public f(Context var1) {
      ArrayList var2 = new ArrayList();
      PackageManager var3 = var1.getPackageManager();
      Object var4 = var2;
      if (var3 != null) {
         var4 = var3.getInstalledApplications(128);
      }

      Iterator var5 = ((List)var4).iterator();

      while(var5.hasNext()) {
         e var6 = new e(var3, (ApplicationInfo)var5.next());
         this.a.add(var6);
      }

      Collections.sort(this.a, new Comparator() {
         public int a(e var1, e var2) {
            return var1.b.compareTo(var2.b);
         }

         // $FF: synthetic method
         public int compare(Object var1, Object var2) {
            return this.a((e)var1, (e)var2);
         }
      });
      this.a.add(0, new e("All apps", "All apps"));
      this.a.add(1, new e("All system apps", "All system apps"));
      this.a.add(2, new e("All non-system apps", "All non-system apps"));
   }

   public int a(String var1) {
      int var2;
      byte var4;
      label42: {
         var2 = var1.hashCode();
         if (var2 != 1354875300) {
            if (var2 != 1655429668) {
               if (var2 == 1804173745 && var1.equals("All apps")) {
                  var4 = 0;
                  break label42;
               }
            } else if (var1.equals("All non-system apps")) {
               var4 = 2;
               break label42;
            }
         } else if (var1.equals("All system apps")) {
            var4 = 1;
            break label42;
         }

         var4 = -1;
      }

      switch(var4) {
      case 0:
         return 0;
      case 1:
         return 1;
      case 2:
         return 2;
      default:
         MyLog.log("MyAppFilters.getApplicationInfoIndex");

         for(var2 = 3; var2 < this.a.size(); ++var2) {
            e var3 = (e)this.a.get(var2);
            if (var3 != null && var3.a.equals(var1)) {
               return var2;
            }
         }

         return -1;
      }
   }

   public ArrayList a() {
      ArrayList var1 = new ArrayList();
      Iterator var2 = this.a.iterator();

      while(var2.hasNext()) {
         var1.add(((e)var2.next()).b);
      }

      return var1;
   }
}
