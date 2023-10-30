package com.evernote.android.job;

import android.os.Build.VERSION;
import java.util.EnumMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class e {
   private static final EnumMap a;
   private static final com.evernote.android.job.util.d b = new com.evernote.android.job.util.d("JobConfig");
   private static final ExecutorService c = Executors.newCachedThreadPool(new ThreadFactory() {
      private final AtomicInteger a = new AtomicInteger();

      public Thread newThread(Runnable var1) {
         StringBuilder var2 = new StringBuilder();
         var2.append("AndroidJob-");
         var2.append(this.a.incrementAndGet());
         Thread var3 = new Thread(var1, var2.toString());
         if (var3.isDaemon()) {
            var3.setDaemon(false);
         }

         if (var3.getPriority() != 5) {
            var3.setPriority(5);
         }

         return var3;
      }
   });
   private static volatile boolean d;
   private static volatile boolean e;
   private static volatile long f;
   private static volatile boolean g;
   private static volatile int h;
   private static volatile boolean i;
   private static volatile com.evernote.android.job.util.b j;
   private static volatile ExecutorService k;
   private static volatile boolean l;

   static {
      j = com.evernote.android.job.a.b.a;
      k = c;
      a = new EnumMap(d.class);
      d[] var0 = com.evernote.android.job.d.values();
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         d var3 = var0[var2];
         a.put(var3, Boolean.TRUE);
      }

   }

   public static boolean a() {
      return d && VERSION.SDK_INT < 24;
   }

   public static boolean a(d var0) {
      return (Boolean)a.get(var0);
   }

   public static boolean b() {
      return e;
   }

   public static long c() {
      return f;
   }

   static boolean d() {
      return g;
   }

   public static int e() {
      return h;
   }

   public static boolean f() {
      return i;
   }

   public static com.evernote.android.job.util.b g() {
      return j;
   }

   public static ExecutorService h() {
      return k;
   }

   public static boolean i() {
      return l;
   }
}
