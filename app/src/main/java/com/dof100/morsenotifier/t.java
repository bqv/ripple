package com.dof100.morsenotifier;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Bitmap.Config;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.opengl.GLUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;

class t {
   float a;
   private GL10 b;
   private final String[] c;
   private int d;
   private final int[] e = new int[1];
   private FloatBuffer f;
   private FloatBuffer g;

   t(GL10 var1, int var2, float var3) {
      this.b = var1;
      this.d = var2;
      this.a = var3;
      this.c = new String[127];

      for(var2 = 0; var2 <= 31; ++var2) {
         this.c[var2] = " ";
      }

      for(var2 = 32; var2 <= 126; ++var2) {
         this.c[var2] = Character.toString((char)var2);
      }

      this.a();
   }

   private void a() {
      Paint var1 = new Paint();
      var1.setTextSize((float)this.d);
      var1.setAntiAlias(true);
      var1.setARGB(255, 0, 255, 0);
      var1.setTextSize((float)this.d);
      var1.setTextAlign(Align.CENTER);
      var1.setAntiAlias(false);
      var1.setStyle(Style.FILL);
      int var2 = this.d;
      String[] var3 = this.c;
      int var4 = var3.length;

      int var5;
      float var6;
      int var7;
      for(var5 = 0; var5 < var4; var2 = var7) {
         var6 = var1.measureText(var3[var5]);
         var7 = var2;
         if (var6 > (float)var2) {
            var7 = (int)((double)var6 + 0.99D);
         }

         ++var5;
      }

      for(var7 = 1; this.c.length > var7 * var7; ++var7) {
      }

      for(var5 = 1; var5 < var2 * var7; var5 *= 2) {
      }

      Bitmap var20 = Bitmap.createBitmap(var5, var5, Config.ARGB_8888);
      Canvas var8 = new Canvas(var20);
      var20.eraseColor(0);

      int var10;
      int var11;
      float var12;
      float var13;
      for(var4 = 0; var4 < this.c.length; ++var4) {
         String var9 = this.c[var4];
         var10 = var4 / var7;
         var11 = var2 / 2;
         var6 = (float)(var4 % var7 * var2 + var11);
         var12 = (float)(var10 * var2 + var11);
         var13 = (var1.descent() + var1.ascent()) / 2.0F;
         var1.setARGB(255, 255, 255, 255);
         var8.drawText(var9, var6, var12 - var13, var1);
      }

      float var14 = -this.a / 2.0F;
      var13 = -this.a / 2.0F;
      float var15 = this.a / 2.0F;
      float var16 = -this.a / 2.0F;
      float var17 = -this.a / 2.0F;
      var12 = this.a / 2.0F;
      var6 = this.a / 2.0F;
      float var18 = this.a / 2.0F;
      ByteBuffer var19 = ByteBuffer.allocateDirect(48);
      var19.order(ByteOrder.nativeOrder());
      this.f = var19.asFloatBuffer();
      this.f.put(new float[]{var14, var13, 0.0F, var15, var16, 0.0F, var17, var12, 0.0F, var6, var18, 0.0F});
      this.f.position(0);
      float[] var21 = new float[this.c.length * 8];

      for(var4 = 0; var4 < this.c.length; ++var4) {
         var10 = var4 / var7;
         var11 = var4 % var7 * var2;
         var12 = (float)var11;
         var17 = (float)(var11 + var2 - 1);
         var11 = var10 * var2;
         var6 = (float)(var11 + 2);
         var15 = (float)(var11 + var2 + 1);
         var11 = var4 * 8;
         var13 = (float)var5;
         var12 /= var13;
         var21[var11] = var12;
         var15 /= var13;
         var21[var11 + 1] = var15;
         var17 /= var13;
         var21[var11 + 2] = var17;
         var21[var11 + 3] = var15;
         var21[var11 + 4] = var12;
         var6 /= var13;
         var21[var11 + 5] = var6;
         var21[var11 + 6] = var17;
         var21[var11 + 7] = var6;
      }

      var19 = ByteBuffer.allocateDirect(var21.length * 4);
      var19.order(ByteOrder.nativeOrder());
      this.g = var19.asFloatBuffer();
      this.g.put(var21);
      this.g.position(0);
      this.b.glEnable(3553);
      this.b.glGenTextures(1, this.e, 0);
      this.b.glBindTexture(3553, this.e[0]);
      this.b.glTexParameterf(3553, 10241, 9728.0F);
      this.b.glTexParameterf(3553, 10240, 9729.0F);
      this.b.glTexParameterf(3553, 10242, 33071.0F);
      this.b.glTexParameterf(3553, 10243, 33071.0F);
      GLUtils.texImage2D(3553, 0, 6408, var20, 0);
      this.b.glDisable(3553);
   }

   void a(GL10 var1, String var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      int var9 = var2.length();
      float var10 = this.a * 2.0F / 3.0F;
      float var11 = var10 / 2.0F;
      var1.glFrontFace(2305);
      var1.glPushMatrix();
      var1.glTranslatef(var3 + var11, var4, var5);
      var1.glEnable(3553);
      var1.glBlendFunc(1, 771);
      var1.glEnable(3042);
      var1.glEnableClientState(32884);
      var1.glEnableClientState(32888);
      if ((double)var6 > -0.01D && (double)var7 > -0.01D && (double)var8 > -0.01D) {
         var1.glColor4f(var6, var7, var8, 1.0F);
      }

      for(int var12 = 0; var12 < var9; ++var12) {
         char var14;
         label23: {
            char var13 = var2.charAt(var12);
            if (var13 >= 0) {
               var14 = var13;
               if (var13 < this.c.length) {
                  break label23;
               }
            }

            var14 = '?';
         }

         var1.glVertexPointer(3, 5126, 0, this.f.position(0));
         var1.glTexCoordPointer(2, 5126, 0, this.g.position(var14 * 8));
         var1.glBindTexture(3553, this.e[0]);
         var1.glDrawArrays(5, 0, 4);
         var1.glTranslatef(var10, 0.0F, 0.0F);
      }

      var1.glDisableClientState(32884);
      var1.glDisableClientState(32888);
      var1.glDisable(3042);
      var1.glDisable(3553);
      var1.glPopMatrix();
   }

   void b(GL10 var1, String var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      int var9 = var2.length();
      this.a(var1, var2, var3 - this.a * 2.0F / 3.0F * ((float)var9 / 2.0F), var4, var5, var6, var7, var8);
   }
}
