package com.evernote.android.job.b;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import com.evernote.android.job.JobProxy;
import com.evernote.android.job.JobRequest;
import com.evernote.android.job.util.g;

@TargetApi(19)
public class a extends com.evernote.android.job.v14.a {
   public a(Context var1) {
      super(var1, "JobProxy19");
   }

   protected void a(JobRequest var1, AlarmManager var2, PendingIntent var3) {
      var2.setWindow(1, System.currentTimeMillis() + JobProxy.a.a(var1), JobProxy.a.b(var1) - JobProxy.a.a(var1), var3);
      this.b.b("Schedule alarm, %s, start %s, end %s", var1, g.a(JobProxy.a.a(var1)), g.a(JobProxy.a.b(var1)));
   }

   protected void c(JobRequest var1, AlarmManager var2, PendingIntent var3) {
      var2.setWindow(1, System.currentTimeMillis() + JobProxy.a.d(var1), JobProxy.a.e(var1) - JobProxy.a.d(var1), var3);
      this.b.b("Scheduled repeating alarm (flex support), %s, start %s, end %s, flex %s", var1, g.a(JobProxy.a.d(var1)), g.a(JobProxy.a.e(var1)), g.a(var1.k()));
   }
}
