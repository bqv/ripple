package com.dof100.morsenotifier

import android.content.Context
import android.content.Intent
import android.preference.PreferenceManager
import com.dof100.morsenotifier.MyLog.log
import com.evernote.android.job.Job
import com.evernote.android.job.JobManager
import com.evernote.android.job.JobRequest
import com.evernote.android.job.util.support.PersistableBundleCompat
import java.util.Calendar
import java.util.Date
import java.util.Locale
import java.util.concurrent.TimeUnit

internal class MyJob : Job() {
  override fun onRunJob(params: Params): Result {
    log("MyJob.onRunJob")
    val extras = params.extras
    val var2 = extras.getInt("EXTRASHOUR", -1)
    val var3 = extras.getInt("EXTRASMIN", -1)
    val var4 = extras.getInt("EXTRASWHAT", -1)
    val var5 = extras.getString("EXTRASTEXT", "")
    val var6 = this.context
    val var7 = PreferenceManager.getDefaultSharedPreferences(var6)
    var var8 = this.context
    var var14: String
    var14 = if (App.Companion.morseMode) {
      "_morsedef"
    } else {
      "_voicedef"
    }
    val var9 =
      Utils.prefGetBoolean(var8, var7, "pref_chime_enable", null as String?, var14, "_def")
    var8 = this.context
    var14 = if (App.Companion.morseMode) {
      "_morsedef"
    } else {
      "_voicedef"
    }
    val var10 = Utils.prefGetBoolean(
      var8,
      var7,
      "pref_reminders_enable",
      null as String?,
      var14,
      "_def"
    )
    log(String.format(Locale.US, "MyJob.onRunJob  Time: %02d:%02d  What:%d", var2, var3, var4))
    val var15: Intent
    if (var4 == 1 && var9) {
      log("MyJob.onRunJob chime...")
      var15 = Intent(this.context, ServiceMain::class.java)
      var15.putExtra(
        this.context.resources.getString(R.string.MSG_WHAT),
        this.context.resources.getString(R.string.MSG_CHIME_FIRE)
      )
      var15.putExtra(this.context.resources.getString(R.string.MSG_EXTRAINT1), var2)
      var15.putExtra(this.context.resources.getString(R.string.MSG_EXTRAINT2), var3)
      this.context.startService(var15)
    } else if (var4 == 2 && var10) {
      log("MyJob.onRunJob reminder...")
      var15 = Intent(this.context, ServiceMain::class.java)
      var15.putExtra(
        this.context.resources.getString(R.string.MSG_WHAT),
        this.context.resources.getString(R.string.MSG_REMINDERS_FIRE)
      )
      var15.putExtra(this.context.resources.getString(R.string.MSG_EXTRATEXT1), var5)
      var15.putExtra(this.context.resources.getString(R.string.MSG_EXTRAINT1), var2)
      var15.putExtra(this.context.resources.getString(R.string.MSG_EXTRAINT2), var3)
      this.context.startService(var15)
    }
    val result: Result
    result = try {
      Result.SUCCESS
    } finally {
      scheduleNextChime()
      scheduleNextReminder(var6)
    }
    return result
  }

  companion object {
    fun scheduleNextChime() {
      log("MyJob.scheduleNextChime")
      val jobManager = JobManager.instance()
      log("MyJob.scheduleNextChime List of existing Job Requests: ")
      for (jobRequest in jobManager.allJobRequests) {
        val timestamp = Date(jobRequest.scheduledAt)
        log(
          String.format(
            Locale.US,
            " MyJob.scheduleNextChime Job tag=%15s id=%d t=%s start=%d min",
            jobRequest.tag,
            jobRequest.jobId,
            timestamp.toString(),
            jobRequest.startMs / 1000L / 60L
          )
        )
      }
      val var16 = Calendar.getInstance()
      val var3 = var16[11]
      val var4 = var16[12]
      val var5 = var16[13]
      val var6 = 60 - var5
      val var7 = 60 - var4 - 1
      val hour = (var3 + 1) % 24
      val seconds = TimeUnit.SECONDS.toMillis(var6.toLong())
      val minutes = TimeUnit.MINUTES.toMillis(var7.toLong())
      val hours = TimeUnit.HOURS.toMillis(0L)
      log(
        String.format(
          Locale.US,
          "MyJob.scheduleNextChime  time=%02d:%02d:%02d Next chime at %02d:%02d:%02d,  which is %02d:%02d:%02d from now",
          var3,
          var4,
          var5,
          hour,
          0,
          0,
          0,
          var7,
          var6
        )
      )
      val extras = PersistableBundleCompat()
      extras.putInt("EXTRASWHAT", 1)
      extras.putInt("EXTRASHOUR", hour)
      extras.putInt("EXTRASMIN", 0)
      JobRequest.Builder("TAG_CHIME")
        .setExact(seconds + minutes + hours)
        .setUpdateCurrent(true)
        .setExtras(extras)
        .setRequirementsEnforced(false)
        .build()
        .schedule()
    }

    fun scheduleNextReminder(var0: Context?) {
      if (!App.Companion.proBuild) {
        log("MyJob.scheduleNextReminder App!=pro exiting...")
      } else {
        log("MyJob.scheduleNextReminder")
        val jobManager = JobManager.instance()
        log("MyJob.scheduleNextReminder List of existing job requests: ")
        for (jobRequest in jobManager.allJobRequests) {
          val timestamp = Date(jobRequest.scheduledAt)
          log(
            String.format(
              Locale.US,
              " MyJob.scheduleNextReminder Job tag=%15s id=%d t=%s start=%d min",
              jobRequest.tag,
              jobRequest.jobId,
              timestamp.toString(),
              jobRequest.startMs / 1000L / 60L
            )
          )
        }
        val var6 = MyReminders(var0).a()
        if (var6 != null) {
          log(
            String.format(
              Locale.US,
              "MyJob.scheduleNextReminder Next reminder %s",
              var6.c()
            )
          )
          val extras = PersistableBundleCompat()
          extras.putInt("EXTRASWHAT", 2)
          extras.putInt("EXTRASHOUR", var6.a)
          extras.putInt("EXTRASMIN", var6.b)
          extras.putString("EXTRASTEXT", var6.a())
          JobRequest.Builder("TAG_REMINDER")
            .setExact(var6.g)
            .setUpdateCurrent(true)
            .setExtras(extras)
            .setRequirementsEnforced(false)
            .build()
            .schedule()
        }
      }
    }

    fun clearAllJobs() {
      log("MyJob.clearAllJobs")
      val jobManager = JobManager.instance()
      log("MyJob.clearAllJobs List of existing job requests before clear: ")
      for (jobRequest in jobManager.allJobRequests) {
        val timestamp = Date(jobRequest.scheduledAt)
        log(
          String.format(
            Locale.US,
            " MyJob.clearAllJobs Job tag=%15s id=%d t=%s start=%d min",
            jobRequest.tag,
            jobRequest.jobId,
            timestamp.toString(),
            jobRequest.startMs / 1000L / 60L
          )
        )
      }
      jobManager.cancelAll()
      log("MyJob.clearAllJobs List of existing job requests after clear: ")
      for (jobRequest in jobManager.allJobRequests) {
        val timestamp = Date(jobRequest.scheduledAt)
        log(
          String.format(
            Locale.US,
            " MyJob.clearAllJobs Job tag=%15s id=%d t=%s start=%d min",
            jobRequest.tag,
            jobRequest.jobId,
            timestamp.toString(),
            jobRequest.startMs / 1000L / 60L
          )
        )
      }
    }
  }
}
