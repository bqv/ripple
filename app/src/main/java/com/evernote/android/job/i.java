package com.evernote.android.job;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class i {
   private static final com.evernote.android.job.util.d a = new com.evernote.android.job.util.d("JobManager");
   @SuppressLint({"StaticFieldLeak"})
   private static volatile i b;
   private final Context c;
   private final g d;
   private final n e;
   private final h f;

   private i(Context var1) {
      this.c = var1;
      this.d = new g();
      this.e = new n(var1);
      this.f = new h();
      if (!com.evernote.android.job.e.d()) {
         JobRescheduleService.a(this.c);
      }

   }

   public static i a() {
      Throwable var10000;
      boolean var10001;
      label151: {
         if (b == null) {
            synchronized(i.class){}

            try {
               if (b == null) {
                  IllegalStateException var13 = new IllegalStateException("You need to call create() at least once to create the singleton");
                  throw var13;
               }
            } catch (Throwable var12) {
               var10000 = var12;
               var10001 = false;
               break label151;
            }

            try {
               ;
            } catch (Throwable var11) {
               var10000 = var11;
               var10001 = false;
               break label151;
            }
         }

         return b;
      }

      while(true) {
         Throwable var0 = var10000;

         try {
            throw var0;
         } catch (Throwable var10) {
            var10000 = var10;
            var10001 = false;
            continue;
         }
      }
   }

   public static i a(Context var0) {
      if (b == null) {
         synchronized(i.class){}

         Throwable var10000;
         boolean var10001;
         label670: {
            label676: {
               try {
                  if (b != null) {
                     break label676;
                  }

                  com.evernote.android.job.a.f.a(var0, "Context cannot be null");
               } catch (Throwable var71) {
                  var10000 = var71;
                  var10001 = false;
                  break label670;
               }

               Context var1 = var0;

               try {
                  if (var0.getApplicationContext() != null) {
                     var1 = var0.getApplicationContext();
                  }
               } catch (Throwable var70) {
                  var10000 = var70;
                  var10001 = false;
                  break label670;
               }

               try {
                  d var74 = com.evernote.android.job.d.c(var1);
                  if (var74 == com.evernote.android.job.d.e && !var74.a(var1)) {
                     j var76 = new j("All APIs are disabled, cannot schedule any job");
                     throw var76;
                  }
               } catch (Throwable var73) {
                  var10000 = var73;
                  var10001 = false;
                  break label670;
               }

               try {
                  i var75 = new i(var1);
                  b = var75;
                  if (!com.evernote.android.job.a.g.b(var1)) {
                     a.c("No wake lock permission");
                  }
               } catch (Throwable var69) {
                  var10000 = var69;
                  var10001 = false;
                  break label670;
               }

               try {
                  if (!com.evernote.android.job.a.g.a(var1)) {
                     a.c("No boot permission");
                  }
               } catch (Throwable var72) {
                  var10000 = var72;
                  var10001 = false;
                  break label670;
               }

               try {
                  b(var1);
               } catch (Throwable var68) {
                  var10000 = var68;
                  var10001 = false;
                  break label670;
               }
            }

            label646:
            try {
               return b;
            } catch (Throwable var67) {
               var10000 = var67;
               var10001 = false;
               break label646;
            }
         }

         while(true) {
            Throwable var77 = var10000;

            try {
               throw var77;
            } catch (Throwable var66) {
               var10000 = var66;
               var10001 = false;
               continue;
            }
         }
      } else {
         return b;
      }
   }

   private void a(JobRequest var1, d var2, boolean var3, boolean var4) {
      JobProxy var5 = this.a(var2);
      if (var3) {
         if (var4) {
            var5.plantPeriodicFlexsupport(var1);
         } else {
            var5.plantPeriodic(var1);
         }
      } else {
         var5.plantOneOff(var1);
      }
   }

   private boolean a(c var1) {
      if (var1 != null && var1.b(true)) {
         a.a("Cancel running %s", var1);
         return true;
      } else {
         return false;
      }
   }

   private static void b(Context var0) {
      String var1 = var0.getPackageName();
      Intent var2 = new Intent("com.evernote.android.job.ADD_JOB_CREATOR");
      var2.setPackage(var1);

      List var6;
      try {
         var6 = var0.getPackageManager().queryBroadcastReceivers(var2, 0);
      } catch (Exception var5) {
         var6 = Collections.emptyList();
      }

      Iterator var7 = var6.iterator();

      while(var7.hasNext()) {
         ActivityInfo var3 = ((ResolveInfo)var7.next()).activityInfo;
         if (var3 != null && !var3.exported && var1.equals(var3.packageName) && !TextUtils.isEmpty(var3.name)) {
            try {
               ((f.a)Class.forName(var3.name).newInstance()).a(var0, b);
            } catch (Exception var4) {
            }
         }
      }

   }

   private boolean b(JobRequest var1) {
      if (var1 != null) {
         a.a("Found pending job %s, canceling", var1);
         this.a(var1.w()).cancel(var1.c());
         this.e().b(var1);
         var1.a(0L);
         return true;
      } else {
         return false;
      }
   }

   private int c(String var1) {
      synchronized(this){}
      int var2 = 0;

      Throwable var10000;
      label459: {
         Iterator var3;
         boolean var10001;
         try {
            var3 = this.a(var1, true, false).iterator();
         } catch (Throwable var45) {
            var10000 = var45;
            var10001 = false;
            break label459;
         }

         label458:
         while(true) {
            label464: {
               try {
                  while(var3.hasNext()) {
                     if (this.b((JobRequest)var3.next())) {
                        break label464;
                     }
                  }
               } catch (Throwable var46) {
                  var10000 = var46;
                  var10001 = false;
                  break;
               }

               Set var47;
               label465: {
                  try {
                     if (TextUtils.isEmpty(var1)) {
                        var47 = this.c();
                        break label465;
                     }
                  } catch (Throwable var44) {
                     var10000 = var44;
                     var10001 = false;
                     break;
                  }

                  try {
                     var47 = this.a(var1);
                  } catch (Throwable var43) {
                     var10000 = var43;
                     var10001 = false;
                     break;
                  }
               }

               Iterator var48;
               try {
                  var48 = var47.iterator();
               } catch (Throwable var42) {
                  var10000 = var42;
                  var10001 = false;
                  break;
               }

               while(true) {
                  boolean var4;
                  try {
                     if (!var48.hasNext()) {
                        return var2;
                     }

                     var4 = this.a((c)var48.next());
                  } catch (Throwable var41) {
                     var10000 = var41;
                     var10001 = false;
                     break label458;
                  }

                  if (var4) {
                     ++var2;
                  }
               }
            }

            ++var2;
         }
      }

      Throwable var49 = var10000;
      throw var49;
   }

   public c a(int var1) {
      return this.f.a(var1);
   }

   JobProxy a(d var1) {
      return var1.b(this.c);
   }

   JobRequest a(int var1, boolean var2) {
      JobRequest var3 = this.e.a(var1);
      JobRequest var4 = var3;
      if (!var2) {
         var4 = var3;
         if (var3 != null) {
            var4 = var3;
            if (var3.z()) {
               var4 = null;
            }
         }
      }

      return var4;
   }

   public Set a(String var1) {
      return this.f.a(var1);
   }

   Set a(String var1, boolean var2, boolean var3) {
      Set var6 = this.e.a(var1, var2);
      if (var3) {
         Iterator var4 = var6.iterator();

         while(var4.hasNext()) {
            JobRequest var5 = (JobRequest)var4.next();
            if (var5.B() && !var5.w().b(this.c).isPlatformJobScheduled(var5)) {
               this.e.b(var5);
               var4.remove();
            }
         }
      }

      return var6;
   }

   public void a(f var1) {
      this.d.a(var1);
   }

   public void a(JobRequest param1) {
      // $FF: Couldn't be decompiled
   }

   public int b(String var1) {
      return this.c(var1);
   }

   public Set b() {
      return this.a((String)null, false, true);
   }

   public boolean b(int var1) {
      boolean var2 = this.b(this.a(var1, true));
      boolean var3 = this.a(this.a(var1));
      JobProxy.a.a(this.c, var1);
      return var2 | var3;
   }

   public Set c() {
      return this.f.a();
   }

   public int d() {
      return this.c((String)null);
   }

   n e() {
      return this.e;
   }

   h f() {
      return this.f;
   }

   g g() {
      return this.d;
   }

   Context h() {
      return this.c;
   }
}
