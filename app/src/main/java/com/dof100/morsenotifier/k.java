package com.dof100.morsenotifier;

import javax.microedition.khronos.opengles.GL10;

class k {
   int a;
   int b;
   private d c;

   k(int var1, int var2) {
      this.a = var1;
      this.b = var2;
      d var3;
      switch(this.a) {
      case 1:
         var3 = new d(0.0F, -0.25F, 0.5F, 0.25F);
         break;
      case 2:
         var3 = new d(0.0F, -0.25F, 1.5F, 0.25F);
         break;
      default:
         var3 = null;
      }

      this.c = var3;
   }

   void a(GL10 var1) {
      if (this.c != null) {
         this.c.a(var1);
      }

   }
}
