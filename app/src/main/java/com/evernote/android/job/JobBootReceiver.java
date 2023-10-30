package com.evernote.android.job;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class JobBootReceiver extends BroadcastReceiver {
   public void onReceive(Context var1, Intent var2) {
      try {
         JobManager.create(var1);
      } catch (j var3) {
      }

   }
}
