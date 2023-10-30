package com.dof100.morsenotifier;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.evernote.android.job.Job;
import com.evernote.android.job.JobManager;
import com.evernote.android.job.JobRequest;
import com.evernote.android.job.util.support.PersistableBundleCompat;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

class MyJob extends Job {
   public static void scheduleNextChime() {
      MyLog.log("MyJob.scheduleNextChime");
      JobManager jobManager = JobManager.instance();
      MyLog.log("MyJob.scheduleNextChime List of existing Job Requests: ");
      for (JobRequest jobRequest : jobManager.getAllJobRequests()) {
         Date timestamp = new Date(jobRequest.getScheduledAt());
         MyLog.log(String.format(Locale.US, "   MyJob.scheduleNextChime Job tag=%15s id=%d t=%s start=%d min",
                 jobRequest.getTag(), jobRequest.getJobId(), timestamp.toString(), jobRequest.getStartMs() / 1000L / 60L));
      }

      Calendar var16 = Calendar.getInstance();
      int var3 = var16.get(11);
      int var4 = var16.get(12);
      int var5 = var16.get(13);
      int var6 = 60 - var5;
      int var7 = 60 - var4 - 1;
      int hour = (var3 + 1) % 24;
      long seconds = TimeUnit.SECONDS.toMillis((long)var6);
      long minutes = TimeUnit.MINUTES.toMillis((long)var7);
      long hours = TimeUnit.HOURS.toMillis((long)0);
      MyLog.log(String.format(Locale.US, "MyJob.scheduleNextChime  time=%02d:%02d:%02d   Next chime at %02d:%02d:%02d,  which is %02d:%02d:%02d from now", var3, var4, var5, hour, 0, 0, 0, var7, var6));
      PersistableBundleCompat extras = new PersistableBundleCompat();
      extras.putInt("EXTRASWHAT", 1);
      extras.putInt("EXTRASHOUR", hour);
      extras.putInt("EXTRASMIN", 0);
      new JobRequest.Builder("TAG_CHIME")
              .setExact(seconds + minutes + hours)
              .setUpdateCurrent(true)
              .setExtras(extras)
              .setRequirementsEnforced(false)
              .build()
              .schedule();
   }

   public static void scheduleNextReminder(Context var0) {
      if (!App.b) {
         MyLog.log("MyJob.scheduleNextReminder App!=pro exiting...");
      } else {
         MyLog.log("MyJob.scheduleNextReminder");
         JobManager jobManager = JobManager.instance();
         MyLog.log("MyJob.scheduleNextReminder List of existing job requests: ");

         for (JobRequest jobRequest : jobManager.getAllJobRequests()) {
            Date timestamp = new Date(jobRequest.getScheduledAt());
            MyLog.log(String.format(Locale.US, "   MyJob.scheduleNextReminder Job tag=%15s id=%d t=%s start=%d min",
                    jobRequest.getTag(), jobRequest.getJobId(), timestamp.toString(), jobRequest.getStartMs() / 1000L / 60L));
         }

         MyReminder var6 = (new MyReminders(var0)).a();
         if (var6 != null) {
            MyLog.log(String.format(Locale.US, "MyJob.scheduleNextReminder Next reminder %s", var6.c()));
            PersistableBundleCompat extras = new PersistableBundleCompat();
            extras.putInt("EXTRASWHAT", 2);
            extras.putInt("EXTRASHOUR", var6.a);
            extras.putInt("EXTRASMIN", var6.b);
            extras.putString("EXTRASTEXT", var6.a());
            new JobRequest.Builder("TAG_REMINDER")
                    .setExact(var6.g)
                    .setUpdateCurrent(true)
                    .setExtras(extras)
                    .setRequirementsEnforced(false)
                    .build()
                    .schedule();
         }
      }
   }

   public static void clearAllJobs() {
      MyLog.log("MyJob.clearAllJobs");
      JobManager jobManager = JobManager.instance();
      MyLog.log("MyJob.clearAllJobs List of existing job requests before clear: ");
      for (JobRequest jobRequest : jobManager.getAllJobRequests()) {
         Date timestamp = new Date(jobRequest.getScheduledAt());
         MyLog.log(String.format(Locale.US, "   MyJob.clearAllJobs Job tag=%15s id=%d t=%s start=%d min",
                 jobRequest.getTag(), jobRequest.getJobId(), timestamp.toString(), jobRequest.getStartMs() / 1000L / 60L));
      }

      jobManager.cancelAll();
      MyLog.log("MyJob.clearAllJobs List of existing job requests after clear: ");
      for (JobRequest jobRequest : jobManager.getAllJobRequests()) {
         Date timestamp = new Date(jobRequest.getScheduledAt());
         MyLog.log(String.format(Locale.US, "   MyJob.clearAllJobs Job tag=%15s id=%d t=%s start=%d min",
                 jobRequest.getTag(), jobRequest.getJobId(), timestamp.toString(), jobRequest.getStartMs() / 1000L / 60L));
      }

   }

   protected Result onRunJob(Params params) {
      MyLog.log("MyJob.onRunJob");
      PersistableBundleCompat extras = params.getExtras();
      int var2 = extras.getInt("EXTRASHOUR", -1);
      int var3 = extras.getInt("EXTRASMIN", -1);
      int var4 = extras.getInt("EXTRASWHAT", -1);
      String var5 = extras.getString("EXTRASTEXT", "");
      Context var6 = this.k();
      SharedPreferences var7 = PreferenceManager.getDefaultSharedPreferences(var6);
      Context var8 = this.k();
      String var14;
      if (App.c) {
         var14 = "_morsedef";
      } else {
         var14 = "_voicedef";
      }

      boolean var9 = Utils.prefGetBoolean(var8, var7, "pref_chime_enable", (String)null, var14, "_def");
      var8 = this.k();
      if (App.c) {
         var14 = "_morsedef";
      } else {
         var14 = "_voicedef";
      }

      boolean var10 = Utils.prefGetBoolean(var8, var7, "pref_reminders_enable", (String)null, var14, "_def");
      MyLog.log(String.format(Locale.US, "MyJob.onRunJob  Time: %02d:%02d  What:%d", var2, var3, var4));
      Intent var15;
      if (var4 == 1 && var9) {
         MyLog.log("MyJob.onRunJob chime...");
         var15 = new Intent(this.k(), ServiceMain.class);
         var15.putExtra(this.k().getResources().getString(R.string.MSG_WHAT), this.k().getResources().getString(R.string.MSG_CHIME_FIRE));
         var15.putExtra(this.k().getResources().getString(R.string.MSG_EXTRAINT1), var2);
         var15.putExtra(this.k().getResources().getString(R.string.MSG_EXTRAINT2), var3);
         this.k().startService(var15);
      } else if (var4 == 2 && var10) {
         MyLog.log("MyJob.onRunJob reminder...");
         var15 = new Intent(this.k(), ServiceMain.class);
         var15.putExtra(this.k().getResources().getString(R.string.MSG_WHAT), this.k().getResources().getString(R.string.MSG_REMINDERS_FIRE));
         var15.putExtra(this.k().getResources().getString(R.string.MSG_EXTRATEXT1), var5);
         var15.putExtra(this.k().getResources().getString(R.string.MSG_EXTRAINT1), var2);
         var15.putExtra(this.k().getResources().getString(R.string.MSG_EXTRAINT2), var3);
         this.k().startService(var15);
      }

      Result result;
      try {
         result = Result.SUCCESS;
      } finally {
         scheduleNextChime();
         scheduleNextReminder(var6);
      }

      return result;
   }
}
