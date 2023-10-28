package com.evernote.android.job.b;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import com.evernote.android.job.k;
import com.evernote.android.job.m;
import com.evernote.android.job.a.g;

@TargetApi(19)
public class a extends com.evernote.android.job.v14.a {
   public a(Context var1) {
      super(var1, "JobProxy19");
   }

   protected void a(m var1, AlarmManager var2, PendingIntent var3) {
      var2.setWindow(1, System.currentTimeMillis() + k.a.a(var1), k.a.b(var1) - k.a.a(var1), var3);
      this.b.b("Schedule alarm, %s, start %s, end %s", var1, g.a(k.a.a(var1)), g.a(k.a.b(var1)));
   }

   protected void c(m var1, AlarmManager var2, PendingIntent var3) {
      var2.setWindow(1, System.currentTimeMillis() + k.a.d(var1), k.a.e(var1) - k.a.d(var1), var3);
      this.b.b("Scheduled repeating alarm (flex support), %s, start %s, end %s, flex %s", var1, g.a(k.a.d(var1)), g.a(k.a.e(var1)), g.a(var1.k()));
   }
}
