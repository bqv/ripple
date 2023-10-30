package com.evernote.android.job.util;

import android.util.Log;

public class JobCat implements JobLogger {
   private static final JobLogger[] loggers = new JobLogger[0];
   private static volatile boolean logcatEnabled;
   protected final String mTag;
   protected final boolean mEnabled;

   public JobCat(String tag) {
      this(tag, true);
   }

   public JobCat(String tag, boolean enabled) {
      this.mTag = tag;
      this.mEnabled = enabled;
   }

   public void log(int priority, String tag, String message, Throwable throwable) {
      if (!this.mEnabled) {
         return;
      }

      if (logcatEnabled) {
         String stacktrace = throwable == null ? "" : '\n' + Log.getStackTraceString(throwable);
         Log.println(priority, tag, message + stacktrace);
      }

      JobLogger[] printers = loggers;
      for (JobLogger logger : printers) {
         if (logger != null) {
            logger.log(priority, tag, message, throwable);
         }
      }

   }

   public void i(String message) {
      this.log(Log.INFO, this.mTag, message, (Throwable)null);
   }

   public void i(String message, Object... args) {
      this.log(Log.INFO, this.mTag, String.format(message, args), (Throwable)null);
   }

   public void e(Throwable t) {
      String message = t.getMessage();
      this.log(Log.ERROR, this.mTag, message == null ? "empty message" : message, t);
   }

   public void w(Throwable t, String message, Object... args) {
      this.log(Log.WARN, this.mTag, String.format(message, args), t);
   }

   public void d(String message) {
      this.log(Log.DEBUG, this.mTag, message, (Throwable)null);
   }

   public void d(String message, Object... args) {
      this.log(Log.DEBUG, this.mTag, String.format(message, args), (Throwable)null);
   }

   public void e(Throwable t, String message, Object... args) {
      this.log(Log.ERROR, this.mTag, String.format(message, args), t);
   }

   public void w(String message) {
      this.log(Log.WARN, this.mTag, message, (Throwable)null);
   }

   public void w(String message, Object... args) {
      this.log(Log.WARN, this.mTag, String.format(message, args), (Throwable)null);
   }

   public void e(String message) {
      this.log(Log.ERROR, this.mTag, message, (Throwable)null);
   }

   public void e(String message, Object... args) {
      this.log(Log.ERROR, this.mTag, String.format(message, args), (Throwable)null);
   }
}
