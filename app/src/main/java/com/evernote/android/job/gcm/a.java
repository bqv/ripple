package com.evernote.android.job.gcm;

import android.content.Context;
import com.evernote.android.job.k;
import com.evernote.android.job.l;
import com.evernote.android.job.m;
import com.evernote.android.job.a.d;
import com.evernote.android.job.a.g;
import com.google.android.gms.gcm.GcmNetworkManager;
import com.google.android.gms.gcm.Task;
import com.google.android.gms.gcm.Task.Builder;

public class a implements k {
   private static final d a = new d("JobProxyGcm");
   private final Context b;
   private final GcmNetworkManager c;

   public a(Context var1) {
      this.b = var1;
      this.c = GcmNetworkManager.getInstance(var1);
   }

   private void a(Task var1) {
      try {
         this.c.schedule(var1);
      } catch (IllegalArgumentException var2) {
         if (var2.getMessage() != null && var2.getMessage().startsWith("The GcmTaskService class you provided")) {
            throw new l(var2);
         } else {
            throw var2;
         }
      }
   }

   protected int a(m.d var1) {
      switch(var1) {
      case a:
         return 2;
      case b:
         return 0;
      case c:
      case d:
         return 1;
      default:
         throw new IllegalStateException("not implemented");
      }
   }

   protected Builder a(Builder var1, m var2) {
      var1.setTag(this.e(var2)).setService(PlatformGcmService.class).setUpdateCurrent(true).setRequiredNetwork(this.a(var2.q())).setPersisted(g.a(this.b)).setRequiresCharging(var2.m()).setExtras(var2.C());
      return var1;
   }

   public void a(int var1) {
      this.c.cancelTask(this.b(var1), PlatformGcmService.class);
   }

   public void a(m var1) {
      long var2 = k.a.a(var1);
      long var4 = var2 / 1000L;
      long var6 = k.a.b(var1);
      long var8 = Math.max(var6 / 1000L, var4 + 1L);
      this.a((Task)((com.google.android.gms.gcm.OneoffTask.Builder)this.a(new com.google.android.gms.gcm.OneoffTask.Builder(), var1)).setExecutionWindow(var4, var8).build());
      a.b("Scheduled OneoffTask, %s, start %s, end %s (from now), reschedule count %d", var1, g.a(var2), g.a(var6), k.a.g(var1));
   }

   protected String b(int var1) {
      return String.valueOf(var1);
   }

   public void b(m var1) {
      this.a((Task)((com.google.android.gms.gcm.PeriodicTask.Builder)this.a(new com.google.android.gms.gcm.PeriodicTask.Builder(), var1)).setPeriod(var1.j() / 1000L).setFlex(var1.k() / 1000L).build());
      a.b("Scheduled PeriodicTask, %s, interval %s, flex %s", var1, g.a(var1.j()), g.a(var1.k()));
   }

   public void c(m var1) {
      a.c("plantPeriodicFlexSupport called although flex is supported");
      long var2 = k.a.d(var1);
      long var4 = k.a.e(var1);
      this.a((Task)((com.google.android.gms.gcm.OneoffTask.Builder)this.a(new com.google.android.gms.gcm.OneoffTask.Builder(), var1)).setExecutionWindow(var2 / 1000L, var4 / 1000L).build());
      a.b("Scheduled periodic (flex support), %s, start %s, end %s, flex %s", var1, g.a(var2), g.a(var4), g.a(var1.k()));
   }

   public boolean d(m var1) {
      return true;
   }

   protected String e(m var1) {
      return this.b(var1.c());
   }
}
