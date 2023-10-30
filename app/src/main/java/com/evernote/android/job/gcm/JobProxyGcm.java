package com.evernote.android.job.gcm;

import android.content.Context;
import com.evernote.android.job.JobProxy;
import com.evernote.android.job.JobProxyIllegalStateException;
import com.evernote.android.job.JobRequest;
import com.evernote.android.job.util.JobCat;
import com.evernote.android.job.util.g;
import com.google.android.gms.gcm.GcmNetworkManager;
import com.google.android.gms.gcm.Task;
import com.google.android.gms.gcm.Task.Builder;

public class JobProxyGcm implements JobProxy {
   private static final JobCat CAT = new JobCat("JobProxyGcm");
   private final Context b;
   private final GcmNetworkManager mGcmNetworkManager;

   public JobProxyGcm(Context var1) {
      this.b = var1;
      this.mGcmNetworkManager = GcmNetworkManager.getInstance(var1);
   }

   private void scheduleTask(Task var1) {
      try {
         this.mGcmNetworkManager.schedule(var1);
      } catch (IllegalArgumentException e) {
         if (e.getMessage() != null && e.getMessage().startsWith("The GcmTaskService class you provided")) {
            throw new JobProxyIllegalStateException(e);
         } else {
            throw e;
         }
      }
   }

   protected int convertNetworkType(JobRequest.NetworkType var1) {
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

   protected Builder prepareBuilder(Builder var1, JobRequest var2) {
      var1.setTag(this.createTag(var2)).setService(PlatformGcmService.class).setUpdateCurrent(true).setRequiredNetwork(this.convertNetworkType(var2.q())).setPersisted(g.a(this.b)).setRequiresCharging(var2.m()).setExtras(var2.C());
      return var1;
   }

   public void cancel(int var1) {
      this.mGcmNetworkManager.cancelTask(this.createTag(var1), PlatformGcmService.class);
   }

   public void plantOneOff(JobRequest var1) {
      long var2 = JobProxy.a.a(var1);
      long var4 = var2 / 1000L;
      long var6 = JobProxy.a.b(var1);
      long var8 = Math.max(var6 / 1000L, var4 + 1L);
      this.scheduleTask((Task)((com.google.android.gms.gcm.OneoffTask.Builder)this.prepareBuilder(new com.google.android.gms.gcm.OneoffTask.Builder(), var1)).setExecutionWindow(var4, var8).build());
      CAT.b("Scheduled OneoffTask, %s, start %s, end %s (from now), reschedule count %d", var1, g.a(var2), g.a(var6), JobProxy.a.g(var1));
   }

   protected String createTag(int var1) {
      return String.valueOf(var1);
   }

   public void plantPeriodic(JobRequest var1) {
      this.scheduleTask((Task)((com.google.android.gms.gcm.PeriodicTask.Builder)this.prepareBuilder(new com.google.android.gms.gcm.PeriodicTask.Builder(), var1)).setPeriod(var1.j() / 1000L).setFlex(var1.k() / 1000L).build());
      CAT.b("Scheduled PeriodicTask, %s, interval %s, flex %s", var1, g.a(var1.j()), g.a(var1.k()));
   }

   public void plantPeriodicFlexsupport(JobRequest var1) {
      CAT.c("plantPeriodicFlexSupport called although flex is supported");
      long var2 = JobProxy.a.d(var1);
      long var4 = JobProxy.a.e(var1);
      this.scheduleTask((Task)((com.google.android.gms.gcm.OneoffTask.Builder)this.prepareBuilder(new com.google.android.gms.gcm.OneoffTask.Builder(), var1)).setExecutionWindow(var2 / 1000L, var4 / 1000L).build());
      CAT.b("Scheduled periodic (flex support), %s, start %s, end %s, flex %s", var1, g.a(var2), g.a(var4), g.a(var1.k()));
   }

   public boolean isPlatformJobScheduled(JobRequest var1) {
      return true;
   }

   protected String createTag(JobRequest var1) {
      return this.createTag(var1.getJobId());
   }
}
