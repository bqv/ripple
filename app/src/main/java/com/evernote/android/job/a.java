package com.evernote.android.job;

import java.util.concurrent.TimeUnit;

public abstract class a extends Job {
   private static final com.evernote.android.job.util.d a = new com.evernote.android.job.util.d("DailyJob");
   private static final long b;

   static {
      b = TimeUnit.DAYS.toMillis(1L);
   }
}
