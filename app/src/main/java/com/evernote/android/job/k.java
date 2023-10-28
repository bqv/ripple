package com.evernote.android.job;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public interface k {
   void a(int var1);

   void a(m var1);

   void b(m var1);

   void c(m var1);

   boolean d(m var1);

   public static final class a {
      private static final Object a = new Object();
      private final Context b;
      private final int c;
      private final com.evernote.android.job.a.d d;
      private final i e;

      public a(Service var1, com.evernote.android.job.a.d var2, int var3) {
         this((Context)var1, var2, var3);
      }

      a(Context var1, com.evernote.android.job.a.d var2, int var3) {
         this.b = var1;
         this.c = var3;
         this.d = var2;

         i var5;
         try {
            var5 = i.a(var1);
         } catch (j var4) {
            this.d.a((Throwable)var4);
            var5 = null;
         }

         this.e = var5;
      }

      private static long a(long var0, long var2) {
         long var4 = var0 + var2;
         boolean var6 = false;
         boolean var7;
         if ((var0 ^ var2) < 0L) {
            var7 = true;
         } else {
            var7 = false;
         }

         if ((var0 ^ var4) >= 0L) {
            var6 = true;
         }

         return a(var4, var7 | var6);
      }

      private static long a(long var0, boolean var2) {
         return var2 ? var0 : Long.MAX_VALUE;
      }

      public static long a(m var0) {
         return var0.y() > 0 ? var0.v() : var0.e();
      }

      public static long a(m var0, boolean var1) {
         long var2;
         if (var0.y() > 0) {
            var2 = var0.v();
         } else {
            var2 = var0.f();
         }

         long var4 = var2;
         if (var1) {
            var4 = var2;
            if (var0.l()) {
               var4 = var2;
               if (var0.r()) {
                  var4 = b(var2, 100L);
               }
            }
         }

         return var4;
      }

      public static ComponentName a(Context var0, Intent var1) {
         return p.a(var0, var1);
      }

      static void a(Context var0, int var1) {
         d[] var2 = d.values();
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            d var5 = var2[var4];
            if (var5.a(var0)) {
               try {
                  var5.b(var0).a(var1);
               } catch (Exception var6) {
               }
            }
         }

      }

      private void a(boolean var1) {
         if (var1) {
            a(this.b, this.c);
         }

      }

      public static boolean a(Intent var0) {
         return p.a(var0);
      }

      private static long b(long var0, long var2) {
         int var4 = Long.numberOfLeadingZeros(var0) + Long.numberOfLeadingZeros(~var0) + Long.numberOfLeadingZeros(var2) + Long.numberOfLeadingZeros(~var2);
         if (var4 > 65) {
            return var0 * var2;
         } else {
            boolean var5 = false;
            boolean var6;
            if (var4 >= 64) {
               var6 = true;
            } else {
               var6 = false;
            }

            long var7 = a(var0 * var2, var6);
            boolean var10;
            if (var0 >= 0L) {
               var10 = true;
            } else {
               var10 = false;
            }

            boolean var9;
            if (var2 != Long.MIN_VALUE) {
               var9 = true;
            } else {
               var9 = false;
            }

            var7 = a(var7, var10 | var9);
            if (var0 != 0L) {
               var6 = var5;
               if (var7 / var0 != var2) {
                  return a(var7, var6);
               }
            }

            var6 = true;
            return a(var7, var6);
         }
      }

      public static long b(m var0) {
         return a(var0, false);
      }

      public static long c(m var0) {
         return a(a(var0), (b(var0) - a(var0)) / 2L);
      }

      public static long d(m var0) {
         return Math.max(1L, var0.j() - var0.k());
      }

      public static long e(m var0) {
         return var0.j();
      }

      public static long f(m var0) {
         return a(d(var0), (e(var0) - d(var0)) / 2L);
      }

      public static int g(m var0) {
         return var0.y();
      }

      public c.b a(m param1, Bundle param2) {
         // $FF: Couldn't be decompiled
      }

      public m a(boolean var1, boolean var2) {
         Object var3 = a;
         synchronized(var3){}

         Throwable var10000;
         boolean var10001;
         label1438: {
            try {
               if (this.e == null) {
                  return null;
               }
            } catch (Throwable var162) {
               var10000 = var162;
               var10001 = false;
               break label1438;
            }

            m var4;
            c var5;
            try {
               var4 = this.e.a(this.c, true);
               var5 = this.e.a(this.c);
            } catch (Throwable var161) {
               var10000 = var161;
               var10001 = false;
               break label1438;
            }

            boolean var6;
            label1424: {
               label1423: {
                  if (var4 != null) {
                     try {
                        if (var4.i()) {
                           break label1423;
                        }
                     } catch (Throwable var160) {
                        var10000 = var160;
                        var10001 = false;
                        break label1438;
                     }
                  }

                  var6 = false;
                  break label1424;
               }

               var6 = true;
            }

            if (var5 != null) {
               try {
                  if (!var5.m()) {
                     this.d.b("Job %d is already running, %s", this.c, var4);
                     return null;
                  }
               } catch (Throwable var159) {
                  var10000 = var159;
                  var10001 = false;
                  break label1438;
               }
            }

            if (var5 != null && !var6) {
               label1387:
               try {
                  this.d.b("Job %d already finished, %s", this.c, var4);
                  this.a(var1);
                  return null;
               } catch (Throwable var152) {
                  var10000 = var152;
                  var10001 = false;
                  break label1387;
               }
            } else {
               label1439: {
                  if (var5 != null) {
                     try {
                        if (System.currentTimeMillis() - var5.n() < 2000L) {
                           this.d.b("Job %d is periodic and just finished, %s", this.c, var4);
                           return null;
                        }
                     } catch (Throwable var158) {
                        var10000 = var158;
                        var10001 = false;
                        break label1439;
                     }
                  }

                  if (var4 != null) {
                     try {
                        if (var4.z()) {
                           this.d.b("Request %d already started, %s", this.c, var4);
                           return null;
                        }
                     } catch (Throwable var157) {
                        var10000 = var157;
                        var10001 = false;
                        break label1439;
                     }
                  }

                  if (var4 != null) {
                     try {
                        if (this.e.f().b(var4)) {
                           this.d.b("Request %d is in the queue to start, %s", this.c, var4);
                           return null;
                        }
                     } catch (Throwable var156) {
                        var10000 = var156;
                        var10001 = false;
                        break label1439;
                     }
                  }

                  if (var4 == null) {
                     label1389:
                     try {
                        this.d.b("Request for ID %d was null", this.c);
                        this.a(var1);
                        return null;
                     } catch (Throwable var153) {
                        var10000 = var153;
                        var10001 = false;
                        break label1389;
                     }
                  } else {
                     label1395: {
                        if (var2) {
                           try {
                              this.h(var4);
                           } catch (Throwable var155) {
                              var10000 = var155;
                              var10001 = false;
                              break label1395;
                           }
                        }

                        label1391:
                        try {
                           return var4;
                        } catch (Throwable var154) {
                           var10000 = var154;
                           var10001 = false;
                           break label1391;
                        }
                     }
                  }
               }
            }
         }

         while(true) {
            Throwable var163 = var10000;

            try {
               throw var163;
            } catch (Throwable var151) {
               var10000 = var151;
               var10001 = false;
               continue;
            }
         }
      }

      public void h(m var1) {
         this.e.f().a(var1);
      }
   }
}
