package com.evernote.android.job.v14;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.evernote.android.job.JobProxy;

public class PlatformAlarmReceiver extends BroadcastReceiver {
   static Intent a(Context var0, int var1, boolean var2, Bundle var3) {
      Intent var4 = (new Intent(var0, PlatformAlarmReceiver.class)).putExtra("EXTRA_JOB_ID", var1).putExtra("EXTRA_JOB_EXACT", var2);
      if (var3 != null) {
         var4.putExtra("EXTRA_TRANSIENT_EXTRAS", var3);
      }

      return var4;
   }

   public void onReceive(Context var1, Intent var2) {
      if (var2 != null && var2.hasExtra("EXTRA_JOB_ID") && var2.hasExtra("EXTRA_JOB_EXACT")) {
         int var3 = var2.getIntExtra("EXTRA_JOB_ID", -1);
         Bundle var4 = var2.getBundleExtra("EXTRA_TRANSIENT_EXTRAS");
         if (var2.getBooleanExtra("EXTRA_JOB_EXACT", false)) {
            JobProxy.a.a(var1, PlatformAlarmServiceExact.a(var1, var3, var4));
            return;
         }

         PlatformAlarmService.a(var1, var3, var4);
      }

   }
}
