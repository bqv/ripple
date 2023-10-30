package com.evernote.android.job;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class g {
   private static final com.evernote.android.job.util.d a = new com.evernote.android.job.util.d("JobCreatorHolder");
   private final List b = new CopyOnWriteArrayList();

   public g() {
   }

   public c a(String var1) {
      Iterator var2 = this.b.iterator();
      c var3 = null;
      boolean var4 = false;

      while(var2.hasNext()) {
         f var7 = (f)var2.next();
         boolean var5 = true;
         var4 = true;
         c var6 = var7.a(var1);
         var3 = var6;
         if (var6 != null) {
            var4 = var5;
            var3 = var6;
            break;
         }
      }

      if (!var4) {
         a.c("no JobCreator added");
      }

      return var3;
   }

   public void a(f var1) {
      this.b.add(var1);
   }

   public boolean a() {
      return this.b.isEmpty();
   }
}
