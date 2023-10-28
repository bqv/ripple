package com.evernote.android.job;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.SparseArray;
import java.util.concurrent.TimeUnit;

final class p {
   private static final com.evernote.android.job.a.d a = new com.evernote.android.job.a.d("WakeLockUtil");
   private static final SparseArray b = new SparseArray();
   private static int c;

   public static ComponentName a(Context var0, Intent var1) {
      SparseArray var2 = b;
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label449: {
         int var3;
         try {
            var3 = c++;
            if (c <= 0) {
               c = 1;
            }
         } catch (Throwable var60) {
            var10000 = var60;
            var10001 = false;
            break label449;
         }

         ComponentName var63;
         try {
            var1.putExtra("com.evernote.android.job.wakelockid", var3);
            var63 = var0.startService(var1);
         } catch (Throwable var59) {
            var10000 = var59;
            var10001 = false;
            break label449;
         }

         if (var63 == null) {
            label429:
            try {
               return null;
            } catch (Throwable var55) {
               var10000 = var55;
               var10001 = false;
               break label429;
            }
         } else {
            label450: {
               WakeLock var61;
               try {
                  StringBuilder var4 = new StringBuilder();
                  var4.append("wake:");
                  var4.append(var63.flattenToShortString());
                  var61 = a(var0, var4.toString(), TimeUnit.MINUTES.toMillis(3L));
               } catch (Throwable var58) {
                  var10000 = var58;
                  var10001 = false;
                  break label450;
               }

               if (var61 != null) {
                  try {
                     b.put(var3, var61);
                  } catch (Throwable var57) {
                     var10000 = var57;
                     var10001 = false;
                     break label450;
                  }
               }

               label431:
               try {
                  return var63;
               } catch (Throwable var56) {
                  var10000 = var56;
                  var10001 = false;
                  break label431;
               }
            }
         }
      }

      while(true) {
         Throwable var62 = var10000;

         try {
            throw var62;
         } catch (Throwable var54) {
            var10000 = var54;
            var10001 = false;
            continue;
         }
      }
   }

   static WakeLock a(Context var0, String var1, long var2) {
      WakeLock var4 = ((PowerManager)var0.getSystemService("power")).newWakeLock(1, var1);
      var4.setReferenceCounted(false);
      return a(var0, var4, var2) ? var4 : null;
   }

   static void a(WakeLock var0) {
      if (var0 != null) {
         try {
            if (var0.isHeld()) {
               var0.release();
               return;
            }
         } catch (Exception var1) {
            a.a((Throwable)var1);
         }
      }

   }

   static boolean a(Context var0, WakeLock var1, long var2) {
      if (var1 != null && !var1.isHeld() && com.evernote.android.job.a.g.b(var0)) {
         try {
            var1.acquire(var2);
            return true;
         } catch (Exception var4) {
            a.a((Throwable)var4);
         }
      }

      return false;
   }

   public static boolean a(Intent param0) {
      // $FF: Couldn't be decompiled
   }
}
