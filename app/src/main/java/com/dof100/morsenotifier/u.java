package com.dof100.morsenotifier;

import java.util.Locale;

class u {
   public int a;
   byte[] b;
   private int c;

   u(int var1, int var2) {
      this.c = var2;
      this.a = (int)((long)var1 * (long)this.c / 1000L);
      i.a(String.format(Locale.getDefault(), "MyTone constructor Element Dur=%d msec  Sample Rate=%d s/sec   NSamples=%d", var1, this.c, this.a));

      label32: {
         boolean var10001;
         try {
            this.b = new byte[this.a * 2];
         } catch (Exception var5) {
            var10001 = false;
            break label32;
         }

         var1 = 0;

         while(true) {
            try {
               if (var1 >= this.a * 2) {
                  return;
               }

               this.b[var1] = (byte)0;
            } catch (Exception var4) {
               var10001 = false;
               break;
            }

            ++var1;
         }
      }

      i.a("MyTone constructor ERROR creating/initializing byte array");
   }

   void a(int var1, int var2, float var3, float var4, float var5) {
      long var6 = (long)var1;
      int var8 = (int)((long)this.c * var6 / 1000L);
      if (var8 <= this.a - 1) {
         var2 = (int)((var6 + (long)var2) * (long)this.c / 1000L);
         var1 = var2;
         if (var2 > this.a - 1) {
            var1 = this.a - 1;
         }

         if (var1 >= var8) {
            var2 = var1 - var8 + 1;
            double var9 = (double)((int)((long)var5 * (long)this.c / 1000L));
            double var11 = (double)(var2 / 2);
            double var13 = var9;
            if (var9 > var11) {
               var13 = var11;
            }

            var5 = var3;
            if (var3 == 0.0F) {
               var5 = 1.0F;
               var4 = 0.0F;
            }

            for(var1 = 0; var1 < var2; ++var1) {
               var9 = 1.0D;
               var11 = (double)var1;
               if (var11 < var13) {
                  var9 = var11 / var13;
               } else if (var11 > (double)var2 - var13) {
                  var9 = (double)(var2 - var1) / var13;
               }

               short var15 = (short)((int)(var9 * (double)var4 / 100.0D * Math.sin(var11 * 6.283185307179586D / (double)((float)this.c / var5)) * 32767.0D));
               int var16 = (var8 + var1) * 2;
               this.b[var16] = (byte)((byte)(var15 & 255));
               this.b[var16 + 1] = (byte)((byte)((var15 & '\uff00') >>> 8));
            }

         }
      }
   }
}
