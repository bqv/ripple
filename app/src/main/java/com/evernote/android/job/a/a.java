package com.evernote.android.job.a;

public final class a {
   public static final a a = new a(false, 1.0F);
   private final boolean b;
   private final float c;

   a(boolean var1, float var2) {
      this.b = var1;
      this.c = var2;
   }

   public boolean a() {
      return this.b;
   }

   public boolean b() {
      return this.c < 0.15F && !this.b;
   }
}
