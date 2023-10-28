package com.evernote.android.job.d;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.content.Context;
import com.evernote.android.job.m;

@TargetApi(26)
public class a extends com.evernote.android.job.c.a {
   public a(Context var1) {
      super(var1, "JobProxy26");
   }

   protected int a(m.d var1) {
      return null.a[var1.ordinal()] != 1 ? super.a(var1) : 4;
   }

   protected Builder a(m var1, Builder var2) {
      return var2.setTransientExtras(var1.C());
   }

   protected Builder a(m var1, boolean var2) {
      return super.a(var1, var2).setRequiresBatteryNotLow(var1.o()).setRequiresStorageNotLow(var1.p());
   }

   protected boolean a(JobInfo var1, m var2) {
      return var1 != null && var1.getId() == var2.c();
   }
}
