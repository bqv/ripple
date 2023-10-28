package com.evernote.android.job.a;

import android.util.Log;

public class d implements e {
   private static volatile e[] c = new e[0];
   private static volatile boolean d;
   protected final String a;
   protected final boolean b;

   public d(String var1) {
      this(var1, true);
   }

   public d(String var1, boolean var2) {
      this.a = var1;
      this.b = var2;
   }

   public void a(int var1, String var2, String var3, Throwable var4) {
      if (this.b) {
         if (d) {
            String var5;
            if (var4 == null) {
               var5 = "";
            } else {
               StringBuilder var9 = new StringBuilder();
               var9.append('\n');
               var9.append(Log.getStackTraceString(var4));
               var5 = var9.toString();
            }

            StringBuilder var6 = new StringBuilder();
            var6.append(var3);
            var6.append(var5);
            Log.println(var1, var2, var6.toString());
         }

         e[] var10 = c;
         if (var10.length > 0) {
            int var7 = var10.length;

            for(int var8 = 0; var8 < var7; ++var8) {
               e var11 = var10[var8];
               if (var11 != null) {
                  var11.a(var1, var2, var3, var4);
               }
            }
         }

      }
   }

   public void a(String var1) {
      this.a(4, this.a, var1, (Throwable)null);
   }

   public void a(String var1, Object... var2) {
      this.a(4, this.a, String.format(var1, var2), (Throwable)null);
   }

   public void a(Throwable var1) {
      String var2 = var1.getMessage();
      String var3 = this.a;
      String var4 = var2;
      if (var2 == null) {
         var4 = "empty message";
      }

      this.a(6, var3, var4, var1);
   }

   public void a(Throwable var1, String var2, Object... var3) {
      this.a(5, this.a, String.format(var2, var3), var1);
   }

   public void b(String var1) {
      this.a(3, this.a, var1, (Throwable)null);
   }

   public void b(String var1, Object... var2) {
      this.a(3, this.a, String.format(var1, var2), (Throwable)null);
   }

   public void b(Throwable var1, String var2, Object... var3) {
      this.a(6, this.a, String.format(var2, var3), var1);
   }

   public void c(String var1) {
      this.a(5, this.a, var1, (Throwable)null);
   }

   public void c(String var1, Object... var2) {
      this.a(5, this.a, String.format(var1, var2), (Throwable)null);
   }

   public void d(String var1) {
      this.a(6, this.a, var1, (Throwable)null);
   }

   public void d(String var1, Object... var2) {
      this.a(6, this.a, String.format(var1, var2), (Throwable)null);
   }
}
