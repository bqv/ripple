package com.evernote.android.job;

import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

public abstract class c {
   private static final com.evernote.android.job.util.d a = new com.evernote.android.job.util.d("Job");
   private c.a b;
   private WeakReference c;
   private Context d;
   private volatile boolean e;
   private volatile boolean f;
   private volatile long g = -1L;
   private c.b h;
   private final Object i;

   public c() {
      this.h = c.b.b;
      this.i = new Object();
   }

   protected abstract c.b a(c.a var1);

   final c a(JobRequest var1, Bundle var2) {
      this.b = new c.a(var1, var2);
      return this;
   }

   protected void a(int var1) {
   }

   boolean a(boolean var1) {
      if (var1 && !this.j().e().l()) {
         return true;
      } else if (!this.e()) {
         a.c("Job requires charging, reschedule");
         return false;
      } else if (!this.f()) {
         a.c("Job requires device to be idle, reschedule");
         return false;
      } else if (!this.i()) {
         a.c("Job requires network to be %s, but was %s", this.j().e().q(), com.evernote.android.job.a.c.c(this.k()));
         return false;
      } else if (!this.g()) {
         a.c("Job requires battery not be low, reschedule");
         return false;
      } else if (!this.h()) {
         a.c("Job requires storage not be low, reschedule");
         return false;
      } else {
         return true;
      }
   }

   final c b(Context var1) {
      this.c = new WeakReference(var1);
      this.d = var1.getApplicationContext();
      return this;
   }

   final boolean b(boolean var1) {
      Object var2 = this.i;
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label208: {
         label207: {
            try {
               if (!this.m()) {
                  if (!this.e) {
                     this.e = true;
                     this.c();
                  }
                  break label207;
               }
            } catch (Throwable var23) {
               var10000 = var23;
               var10001 = false;
               break label208;
            }

            try {
               return false;
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label208;
            }
         }

         label198:
         try {
            this.f |= var1;
            return true;
         } catch (Throwable var21) {
            var10000 = var21;
            var10001 = false;
            break label198;
         }
      }

      while(true) {
         Throwable var3 = var10000;

         try {
            throw var3;
         } catch (Throwable var20) {
            var10000 = var20;
            var10001 = false;
            continue;
         }
      }
   }

   protected void c() {
   }

   final c.b d() {
      c.b var1;
      label406: {
         Throwable var10000;
         label408: {
            boolean var10001;
            label409: {
               label411: {
                  label401:
                  try {
                     if (!(this instanceof com.evernote.android.job.a) && !this.a(true)) {
                        break label401;
                     }
                     break label411;
                  } catch (Throwable var43) {
                     var10000 = var43;
                     var10001 = false;
                     break label408;
                  }

                  try {
                     if (this.j().c()) {
                        var1 = c.b.b;
                        break label409;
                     }
                  } catch (Throwable var42) {
                     var10000 = var42;
                     var10001 = false;
                     break label408;
                  }

                  try {
                     var1 = c.b.c;
                     break label409;
                  } catch (Throwable var41) {
                     var10000 = var41;
                     var10001 = false;
                     break label408;
                  }
               }

               try {
                  var1 = this.a(this.j());
               } catch (Throwable var40) {
                  var10000 = var40;
                  var10001 = false;
                  break label408;
               }
            }

            try {
               this.h = var1;
            } catch (Throwable var39) {
               var10000 = var39;
               var10001 = false;
               break label408;
            }

            label379:
            try {
               var1 = this.h;
               break label406;
            } catch (Throwable var38) {
               var10000 = var38;
               var10001 = false;
               break label379;
            }
         }

         Throwable var44 = var10000;
         this.g = System.currentTimeMillis();
         throw var44;
      }

      this.g = System.currentTimeMillis();
      return var1;
   }

   protected boolean e() {
      return !this.j().e().m() || com.evernote.android.job.a.c.a(this.k()).a();
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         c var2 = (c)var1;
         return this.b.equals(var2.b);
      } else {
         return false;
      }
   }

   protected boolean f() {
      return !this.j().e().n() || com.evernote.android.job.a.c.b(this.k());
   }

   protected boolean g() {
      return !this.j().e().o() || !com.evernote.android.job.a.c.a(this.k()).b();
   }

   protected boolean h() {
      return !this.j().e().p() || !com.evernote.android.job.a.c.a();
   }

   public int hashCode() {
      return this.b.hashCode();
   }

   protected boolean i() {
      JobRequest.NetworkType var1 = this.j().e().q();
      JobRequest.NetworkType var2 = JobRequest.d.a;
      boolean var3 = true;
      boolean var4 = true;
      if (var1 == var2) {
         return true;
      } else {
         var2 = com.evernote.android.job.a.c.c(this.k());
         switch(var1) {
         case b:
            if (var2 != JobRequest.d.a) {
               return true;
            }

            return false;
         case d:
            var4 = var3;
            if (var2 != JobRequest.d.d) {
               var4 = var3;
               if (var2 != JobRequest.d.c) {
                  if (var2 == JobRequest.d.e) {
                     return true;
                  }

                  var4 = false;
               }
            }

            return var4;
         case c:
            if (var2 == JobRequest.d.c) {
               return true;
            }

            return false;
         case e:
            if (var2 != JobRequest.d.b) {
               if (var2 == JobRequest.d.d) {
                  return true;
               }

               var4 = false;
            }

            return var4;
         default:
            throw new IllegalStateException("not implemented");
         }
      }
   }

   protected final c.a j() {
      return this.b;
   }

   protected final Context k() {
      Context var1 = (Context)this.c.get();
      Context var2 = var1;
      if (var1 == null) {
         var2 = this.d;
      }

      return var2;
   }

   public final void l() {
      this.b(false);
   }

   public final boolean m() {
      Object var1 = this.i;
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label134: {
         boolean var2;
         label133: {
            label132: {
               try {
                  if (this.g > 0L) {
                     break label132;
                  }
               } catch (Throwable var15) {
                  var10000 = var15;
                  var10001 = false;
                  break label134;
               }

               var2 = false;
               break label133;
            }

            var2 = true;
         }

         label126:
         try {
            return var2;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label126;
         }
      }

      while(true) {
         Throwable var3 = var10000;

         try {
            throw var3;
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            continue;
         }
      }
   }

   final long n() {
      // $FF: Couldn't be decompiled
   }

   final c.b o() {
      return this.h;
   }

   final boolean p() {
      // $FF: Couldn't be decompiled
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("job{id=");
      var1.append(this.b.a());
      var1.append(", finished=");
      var1.append(this.m());
      var1.append(", result=");
      var1.append(this.h);
      var1.append(", canceled=");
      var1.append(this.e);
      var1.append(", periodic=");
      var1.append(this.b.c());
      var1.append(", class=");
      var1.append(this.getClass().getSimpleName());
      var1.append(", tag=");
      var1.append(this.b.b());
      var1.append('}');
      return var1.toString();
   }

   public static final class a {
      private final JobRequest a;
      private com.evernote.android.job.util.a.b b;
      private Bundle c;

      private a(JobRequest var1, Bundle var2) {
         this.a = var1;
         this.c = var2;
      }

      // $FF: synthetic method
      a(JobRequest var1, Bundle var2, Object var3) {
         this(var1, var2);
      }

      public int a() {
         return this.a.c();
      }

      public String b() {
         return this.a.d();
      }

      public boolean c() {
         return this.a.i();
      }

      public com.evernote.android.job.util.a.b d() {
         if (this.b == null) {
            this.b = this.a.s();
            if (this.b == null) {
               this.b = new com.evernote.android.job.util.a.b();
            }
         }

         return this.b;
      }

      JobRequest e() {
         return this.a;
      }

      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         } else if (var1 != null && this.getClass() == var1.getClass()) {
            c.a var2 = (c.a)var1;
            return this.a.equals(var2.a);
         } else {
            return false;
         }
      }

      public int hashCode() {
         return this.a.hashCode();
      }
   }

   public static enum b {
      a,
      b,
      c;
   }
}
