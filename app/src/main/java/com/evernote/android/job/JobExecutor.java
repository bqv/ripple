package com.evernote.android.job;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager.WakeLock;
import android.util.LruCache;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class JobExecutor {
   private static final com.evernote.android.job.util.d a = new com.evernote.android.job.util.d("JobExecutor");
   private static final long b;
   private final SparseArray c = new SparseArray();
   private final LruCache d = new LruCache(20);
   private final SparseArray e = new SparseArray();
   private final Set f = new HashSet();

   static {
      b = TimeUnit.MINUTES.toMillis(3L);
   }

   public JobExecutor() {
   }

   public Job getJob(int var1) {
      synchronized(this){}

      Throwable var10000;
      label137: {
         boolean var10001;
         Job var2;
         try {
            var2 = (Job)this.c.get(var1);
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label137;
         }

         if (var2 != null) {
            return var2;
         }

         WeakReference var15;
         try {
            var15 = (WeakReference)this.d.get(var1);
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            break label137;
         }

         if (var15 != null) {
            try {
               var2 = (Job)var15.get();
            } catch (Throwable var12) {
               var10000 = var12;
               var10001 = false;
               break label137;
            }
         } else {
            var2 = null;
         }

         return var2;
      }

      Throwable var16 = var10000;
      throw var16;
   }

   public Set a() {
      synchronized(this){}

      Set var1;
      try {
         var1 = this.getAllJobsForTag((String)null);
      } finally {
         ;
      }

      return var1;
   }

   public Set<Job> getAllJobsForTag(String var1) {
      synchronized(this){}

      Throwable var10000;
      label674: {
         HashSet var2;
         boolean var10001;
         try {
            var2 = new HashSet();
         } catch (Throwable var77) {
            var10000 = var77;
            var10001 = false;
            break label674;
         }

         int var3 = 0;

         Job var4;
         while(true) {
            try {
               if (var3 >= this.c.size()) {
                  break;
               }

               var4 = (Job)this.c.valueAt(var3);
            } catch (Throwable var75) {
               var10000 = var75;
               var10001 = false;
               break label674;
            }

            label661: {
               if (var1 != null) {
                  try {
                     if (!var1.equals(var4.j().b())) {
                        break label661;
                     }
                  } catch (Throwable var76) {
                     var10000 = var76;
                     var10001 = false;
                     break label674;
                  }
               }

               try {
                  var2.add(var4);
               } catch (Throwable var74) {
                  var10000 = var74;
                  var10001 = false;
                  break label674;
               }
            }

            ++var3;
         }

         Iterator var5;
         try {
            var5 = this.d.snapshot().values().iterator();
         } catch (Throwable var73) {
            var10000 = var73;
            var10001 = false;
            break label674;
         }

         while(true) {
            try {
               if (!var5.hasNext()) {
                  return var2;
               }

               var4 = (Job)((WeakReference)var5.next()).get();
            } catch (Throwable var72) {
               var10000 = var72;
               var10001 = false;
               break;
            }

            if (var4 != null) {
               if (var1 != null) {
                  try {
                     if (!var1.equals(var4.j().b())) {
                        continue;
                     }
                  } catch (Throwable var71) {
                     var10000 = var71;
                     var10001 = false;
                     break;
                  }
               }

               try {
                  var2.add(var4);
               } catch (Throwable var70) {
                  var10000 = var70;
                  var10001 = false;
                  break;
               }
            }
         }
      }

      Throwable var78 = var10000;
      throw var78;
   }

   public Future a(Context var1, JobRequest var2, Job var3, Bundle var4) {
      synchronized(this){}

      Throwable var10000;
      label200: {
         boolean var10001;
         try {
            this.f.remove(var2);
         } catch (Throwable var23) {
            var10000 = var23;
            var10001 = false;
            break label200;
         }

         if (var3 == null) {
            label182: {
               try {
                  a.c("JobCreator returned null for tag %s", var2.getTag());
               } catch (Throwable var21) {
                  var10000 = var21;
                  var10001 = false;
                  break label182;
               }

               return null;
            }
         } else {
            label201: {
               try {
                  if (var3.m()) {
                     IllegalStateException var27 = new IllegalStateException(String.format(Locale.ENGLISH, "Job for tag %s was already run, a creator should always create a new Job instance", var2.getTag()));
                     throw var27;
                  }
               } catch (Throwable var24) {
                  var10000 = var24;
                  var10001 = false;
                  break label201;
               }

               Future var26;
               try {
                  var3.b(var1).a(var2, var4);
                  a.a("Executing %s, context %s", var2, var1.getClass().getSimpleName());
                  this.c.put(var2.getJobId(), var3);
                  ExecutorService var25 = JobConfig.h();
                  JobExecutor.a var29 = new JobExecutor.a(var3);
                  var26 = var25.submit(var29);
               } catch (Throwable var22) {
                  var10000 = var22;
                  var10001 = false;
                  break label201;
               }

               return var26;
            }
         }
      }

      Throwable var28 = var10000;
      throw var28;
   }

   @SuppressLint({"UseSparseArrays"})
   void a(LruCache var1) {
      HashMap var2 = new HashMap(var1.snapshot());
      Iterator var3 = var2.keySet().iterator();

      while(true) {
         Integer var4;
         do {
            if (!var3.hasNext()) {
               return;
            }

            var4 = (Integer)var3.next();
         } while(var2.get(var4) != null && ((WeakReference)var2.get(var4)).get() != null);

         var1.remove(var4);
      }
   }

   void a(Job var1) {
      synchronized(this){}

      try {
         int var2 = var1.j().a();
         this.c.remove(var2);
         this.a(this.d);
         this.e.put(var2, var1.o());
         LruCache var3 = this.d;
         WeakReference var4 = new WeakReference(var1);
         var3.put(var2, var4);
      } finally {
         ;
      }

   }

   public void a(JobRequest var1) {
      synchronized(this){}

      try {
         this.f.add(var1);
      } finally {
         ;
      }

   }

   public boolean b(JobRequest var1) {
      synchronized(this){}
      boolean var2;
      if (var1 != null) {
         boolean var4 = false;

         try {
            var4 = true;
            var2 = this.f.contains(var1);
            var4 = false;
         } finally {
            if (var4) {
               ;
            }
         }

         if (var2) {
            var2 = true;
            return var2;
         }
      }

      var2 = false;
      return var2;
   }

   private final class a implements Callable {
      private final Job b;
      private final WakeLock c;

      private a(Job var2) {
         this.b = var2;
         this.c = p.a(this.b.k(), "JobExecutor", JobExecutor.b);
      }

      // $FF: synthetic method
      a(Job var2, Object var3) {
         this(var2);
      }

      private void a(Job var1, Job.Result var2) {
         JobRequest var3 = this.b.j().e();
         boolean var4 = var3.i();
         boolean var5 = false;
         boolean var6 = true;
         JobRequest var7;
         if (!var4 && c.b.c.equals(var2) && !var1.p()) {
            var7 = var3.a(true, true);
            this.b.a(var7.getJobId());
            var4 = var6;
         } else if (var3.i()) {
            var7 = var3;
            var4 = var6;
            if (!c.b.a.equals(var2)) {
               var5 = true;
               var7 = var3;
               var4 = var6;
            }
         } else {
            var4 = false;
            var7 = var3;
         }

         if (!var1.p() && (var5 || var4)) {
            var7.b(var5, var4);
         }

      }

      private Job.Result b() {
         try {
            Job.Result var1 = this.b.d();
            JobExecutor.a.a("Finished %s", this.b);
            this.a(this.b, var1);
            return var1;
         } catch (Throwable var2) {
            JobExecutor.a.b(var2, "Crashed %s", this.b);
            return this.b.o();
         }
      }

      public Job.Result a() {
         Job.Result var1;
         try {
            p.a(this.b.k(), this.c, JobExecutor.b);
            var1 = this.b();
         } finally {
            JobExecutor.this.a(this.b);
            if (this.c == null || !this.c.isHeld()) {
               JobExecutor.a.c("Wake lock was not held after job %s was done. The job took too long to complete. This could have unintended side effects on your app.", this.b);
            }

            p.a(this.c);
         }

         return var1;
      }

      // $FF: synthetic method
      public Object call() {
         return this.a();
      }
   }
}
