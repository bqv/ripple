package com.evernote.android.job.a;

import android.os.SystemClock;

public interface b {
   b a = new b() {
      public long a() {
         return System.currentTimeMillis();
      }

      public long b() {
         return SystemClock.elapsedRealtime();
      }
   };

   long a();

   long b();
}
