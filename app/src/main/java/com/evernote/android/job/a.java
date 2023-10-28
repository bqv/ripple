package com.evernote.android.job;

import java.util.concurrent.TimeUnit;

public abstract class a extends c {
   private static final com.evernote.android.job.a.d a = new com.evernote.android.job.a.d("DailyJob");
   private static final long b;

   static {
      b = TimeUnit.DAYS.toMillis(1L);
   }
}
