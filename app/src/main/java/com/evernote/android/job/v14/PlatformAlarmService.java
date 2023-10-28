package com.evernote.android.job.v14;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.evernote.android.job.k;
import com.evernote.android.job.m;

public final class PlatformAlarmService extends android.support.v4.app.c {
   private static final com.evernote.android.job.a.d j = new com.evernote.android.job.a.d("PlatformAlarmService");

   public static void a(Context var0, int var1, Bundle var2) {
      Intent var3 = new Intent();
      var3.putExtra("EXTRA_JOB_ID", var1);
      if (var2 != null) {
         var3.putExtra("EXTRA_TRANSIENT_EXTRAS", var2);
      }

      a(var0, PlatformAlarmService.class, 2147480001, var3);
   }

   static void a(Intent var0, Service var1, com.evernote.android.job.a.d var2) {
      if (var0 == null) {
         var2.a("Delivered intent is null");
      } else {
         int var3 = var0.getIntExtra("EXTRA_JOB_ID", -1);
         Bundle var4 = var0.getBundleExtra("EXTRA_TRANSIENT_EXTRAS");
         k.a var5 = new k.a(var1, var2, var3);
         m var6 = var5.a(true, true);
         if (var6 != null) {
            var5.a(var6, var4);
         }

      }
   }

   protected void a(Intent var1) {
      a(var1, this, j);
   }
}
