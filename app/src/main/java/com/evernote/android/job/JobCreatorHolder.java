package com.evernote.android.job;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class JobCreatorHolder {
   private static final com.evernote.android.job.util.d a = new com.evernote.android.job.util.d("JobCreatorHolder");
   private final List mJobCreators = new CopyOnWriteArrayList();

   public JobCreatorHolder() {
   }

   public Job a(String var1) {
      Iterator var2 = this.mJobCreators.iterator();
      Job var3 = null;
      boolean var4 = false;

      while(var2.hasNext()) {
         JobCreator var7 = (JobCreator)var2.next();
         boolean var5 = true;
         var4 = true;
         Job var6 = var7.create(var1);
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

   public void addJobCreator(JobCreator var1) {
      this.mJobCreators.add(var1);
   }

   public boolean a() {
      return this.mJobCreators.isEmpty();
   }
}
