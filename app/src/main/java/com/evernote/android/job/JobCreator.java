package com.evernote.android.job;

import android.content.BroadcastReceiver;
import android.content.Context;

public interface JobCreator {
   Job create(String var1);

   public abstract static class a extends BroadcastReceiver {
      protected abstract void a(Context var1, JobManager var2);
   }
}
