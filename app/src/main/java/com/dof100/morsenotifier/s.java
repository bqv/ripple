package com.dof100.morsenotifier;

import android.opengl.GLES10;
import android.opengl.GLU;
import android.opengl.GLSurfaceView.Renderer;
import java.util.ArrayList;
import java.util.Locale;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

class s implements Renderer {
   private int a;
   private boolean b;
   private boolean c;
   private t d = null;
   private final ArrayList e = new ArrayList();
   private int f = -1;
   private int g = -1;
   private int h = -1;
   private float i;
   private float j;
   private float k;
   private float l;
   private float m;
   private float n;
   private float o;
   private float p;
   private float q;
   private int r;
   private long s;
   private float t = 1.0F;
   private float u = 1.0F;
   private float v = 1.0F;
   private float w = 1.0F;
   private float x = 0.0F;
   private float y = 0.0F;
   private float z = 0.0F;

   s(ArrayList var1, int var2, boolean var3, boolean var4, int var5, int var6, int var7, int var8) {
      MyLog.log("MyMorseRenderer constructor");
      this.a = var2;
      this.b = var3;
      this.c = var4;
      this.i = (float)(var5 >> 16 & 255) / 255.0F;
      this.j = (float)(var5 >> 8 & 255) / 255.0F;
      this.k = (float)(var5 & 255) / 255.0F;
      this.l = (float)(var6 >> 16 & 255) / 255.0F;
      this.m = (float)(var6 >> 8 & 255) / 255.0F;
      this.n = (float)(var6 & 255) / 255.0F;
      this.o = (float)(var7 >> 16 & 255) / 255.0F;
      this.p = (float)(var7 >> 8 & 255) / 255.0F;
      this.q = (float)(var7 & 255) / 255.0F;
      this.r = var8;
      this.s = System.currentTimeMillis();
      this.e.clear();

      for(var2 = 0; var2 < var1.size(); var2 += 2) {
         var5 = (Integer)var1.get(var2);
         var6 = (Integer)var1.get(var2 + 1);
         this.e.add(new k(var5, var6));
      }

   }

   void a(int var1) {
      this.f = var1;
      if (this.f >= 0 && this.f < this.e.size()) {
         k var2 = (k)this.e.get(var1);
         if (var2.a >= 0) {
            this.g = this.f;
         } else if (var2.a != -1) {
            this.g = -1;
         }

         if (var2.b >= 0) {
            this.h = this.f;
            return;
         }

         if (var2.b == -1) {
            return;
         }
      } else {
         this.g = -1;
      }

      this.h = -1;
   }

   public void onDrawFrame(GL10 var1) {
      boolean var2 = this.b;
      k var3 = null;
      if (var2) {
         if (this.d == null) {
            this.d = new t(var1, 48, 1.0F);
         }
      } else {
         this.d = null;
      }

      Boolean var4 = false;
      Boolean var5 = var4;
      if (this.c) {
         if (this.f >= 0) {
            var3 = (k)this.e.get(this.f);
         }

         var5 = var4;
         if (var3 != null) {
            label74: {
               if (var3.a != 2 && var3.a != 1) {
                  var5 = var4;
                  if (var3.a != -1) {
                     break label74;
                  }
               }

               var5 = true;
            }
         }
      }

      float var6;
      float var7;
      float var8;
      float var9;
      float var10;
      float var11;
      float var12;
      float var13;
      float var14;
      float var15;
      float var16;
      float var17;
      float var18;
      if (var5) {
         var6 = this.i;
         var7 = this.j;
         var8 = this.k;
         var9 = this.l;
         var10 = this.m;
         var11 = this.n;
         var12 = this.o;
         var13 = this.p;
         var14 = this.q;
         var15 = 1.0F - this.t;
         var16 = 1.0F - this.u;
         var17 = 1.0F - this.v;
         var18 = this.t;
         float var19 = this.u;
         var7 = 1.0F - var7;
         var1.glClearColor(1.0F - var18, 1.0F - var19, 1.0F - this.v, 1.0F);
         var9 = 1.0F - var9;
         var10 = 1.0F - var10;
         var11 = 1.0F - var11;
         var12 = 1.0F - var12;
         var13 = 1.0F - var13;
         var14 = 1.0F - var14;
         var6 = 1.0F - var6;
         var18 = 1.0F;
         var8 = 1.0F - var8;
      } else {
         var6 = this.i;
         var7 = this.j;
         var8 = this.k;
         var9 = this.l;
         var10 = this.m;
         var11 = this.n;
         var12 = this.o;
         var13 = this.p;
         var14 = this.q;
         var15 = this.t;
         var16 = this.u;
         var17 = this.v;
         var18 = this.w;
      }

      var1.glClearColor(var15, var16, var17, var18);
      var1.glClear(16640);
      var1.glMatrixMode(5888);
      var1.glLoadIdentity();
      GLU.gluLookAt(var1, 0.0F, 0.0F, 25.0F, 0.0F, 0.0F, 4.0F, 0.0F, 1.0F, 0.0F);
      var1.glDisable(2896);
      var1.glFrontFace(2305);
      var1.glColor4f(1.0F, 1.0F, 0.0F, 1.0F);
      long var20 = System.currentTimeMillis() - this.s;
      if (var20 < (long)this.r) {
         GLES10.glTranslatef(this.x - this.x * (float)var20 / (float)this.r, 0.0F, 0.0F);
      }

      GLES10.glTranslatef((float)(-this.f) * 0.5F, 0.0F, 0.0F);
      int var22 = -1;
      int var23 = -1;

      for(int var24 = 0; var24 < this.e.size(); ++var24) {
         var1.glColor4f(1.0F, 0.0F, 0.0F, 1.0F);
         k var25 = (k)this.e.get(var24);
         if (var25.a >= 0) {
            var23 = var24;
         } else if (var25.a != -1) {
            var23 = -1;
         }

         if (var25.b >= 0) {
            var22 = var24;
         } else if (var25.b != -1) {
            var22 = -1;
         }

         if (this.d != null && var25.b >= 0) {
            if (var22 == this.h) {
               var15 = var12;
               var18 = var13;
               var17 = var14;
            } else {
               var17 = var7;
               var15 = var6;
               var18 = var7;
            }

            this.d.b(var1, String.valueOf((char)var25.b), 0.25F, this.d.a / 2.0F + 0.5F, 0.0F, var15, var18, var17);
         }

         if (var25.a >= 0) {
            if (var23 == this.g) {
               var15 = var9;
               var17 = var10;
               var16 = var11;
            } else {
               var16 = var8;
               var17 = var7;
               var15 = var6;
            }

            var1.glColor4f(var15, var17, var16, 1.0F);
            var25.a(var1);
         }

         GLES10.glTranslatef(0.5F, 0.0F, 0.0F);
      }

      var1.glFlush();
   }

   public void onSurfaceChanged(GL10 var1, int var2, int var3) {
      MyLog.log(String.format(Locale.US, "MyMorseRenderer.onSurfaceChanged width=%d  height=%d ", var2, var3));
      int var4 = var3;
      if (var3 == 0) {
         var4 = 1;
      }

      float var5 = (float)var2 / (float)var4;
      if (var4 > var2) {
         this.x = 4.0F;
         this.y = this.x / var5;
      } else {
         this.y = 4.0F;
         this.x = this.y * var5;
      }

      this.z = 4.0F;
      float var6 = (float)(Math.toDegrees(Math.atan2((double)this.y, (double)(this.z + 25.0F))) * 2.0D);
      MyLog.log(String.format(Locale.US, "MyMorseRenderer.onSurfaceChanged width,height = %d,%d", var2, var4));
      StringBuilder var7 = new StringBuilder();
      var7.append("MyMorseRenderer.onSurfaceChanged aspect=");
      var7.append(var5);
      MyLog.log(var7.toString());
      var1.glViewport(0, 0, var2, var4);
      var1.glMatrixMode(5889);
      var1.glLoadIdentity();
      GLU.gluPerspective(var1, var6, var5, 0.1F, (this.z + 25.0F) * 2.0F);
   }

   public void onSurfaceCreated(GL10 var1, EGLConfig var2) {
      MyLog.log("MyMorseRenderer.onSurfacecreated");
      if (this.a == 1) {
         this.t = 0.0F;
         this.u = 0.0F;
         this.v = 0.0F;
         this.w = 1.0F;
      } else {
         this.t = 0.0F;
         this.u = 0.0F;
         this.v = 0.0F;
         this.w = 0.0F;
      }

      var1.glClearDepthf(1.0F);
      var1.glEnable(2929);
      var1.glDepthFunc(515);
      var1.glHint(3152, 4354);
      var1.glShadeModel(7425);
      var1.glDisable(3024);
      this.d = null;
   }
}
