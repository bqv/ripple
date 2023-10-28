package com.evernote.android.job.c;

import android.annotation.TargetApi;
import android.app.job.JobInfo.Builder;
import android.content.Context;
import com.evernote.android.job.m;

@TargetApi(24)
public class a extends com.evernote.android.job.v21.a {
   public a(Context var1) {
      this(var1, "JobProxy24");
   }

   public a(Context var1, String var2) {
      super(var1, var2);
   }

   protected int a(m.d var1) {
      return null.a[var1.ordinal()] != 1 ? super.a(var1) : 3;
   }

   protected Builder b(Builder var1, long var2, long var4) {
      return var1.setPeriodic(var2, var4);
   }

   public void c(m var1) {
      this.b.c("plantPeriodicFlexSupport called although flex is supported");
      super.c(var1);
   }

   public boolean d(m var1) {
      try {
         boolean var2 = this.a(this.a().getPendingJob(var1.c()), var1);
         return var2;
      } catch (Exception var3) {
         this.b.a((Throwable)var3);
         return false;
      }
   }
}
