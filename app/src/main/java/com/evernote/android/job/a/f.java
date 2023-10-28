package com.evernote.android.job.a;

import android.text.TextUtils;
import java.util.Locale;

public final class f {
   public static int a(int var0, String var1) {
      if (var0 < 0) {
         throw new IllegalArgumentException(var1);
      } else {
         return var0;
      }
   }

   public static long a(long var0, long var2, long var4, String var6) {
      if (var0 < var2) {
         throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", var6, var2, var4));
      } else if (var0 > var4) {
         throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", var6, var2, var4));
      } else {
         return var0;
      }
   }

   public static long a(long var0, String var2) {
      if (var0 < 0L) {
         throw new IllegalArgumentException(var2);
      } else {
         return var0;
      }
   }

   public static CharSequence a(CharSequence var0) {
      if (TextUtils.isEmpty(var0)) {
         throw new IllegalArgumentException();
      } else {
         return var0;
      }
   }

   public static Object a(Object var0) {
      if (var0 == null) {
         throw new NullPointerException();
      } else {
         return var0;
      }
   }

   public static Object a(Object var0, Object var1) {
      if (var0 == null) {
         throw new NullPointerException(String.valueOf(var1));
      } else {
         return var0;
      }
   }

   public static long b(long var0, String var2) {
      if (var0 <= 0L) {
         throw new IllegalArgumentException(var2);
      } else {
         return var0;
      }
   }
}
