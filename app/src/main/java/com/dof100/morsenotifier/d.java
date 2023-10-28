package com.dof100.morsenotifier;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import javax.microedition.khronos.opengles.GL10;

class d {
   private final short[] a = new short[]{0, 1, 2, 0, 2, 3};
   private final float[] b = new float[12];
   private FloatBuffer c;
   private ShortBuffer d;

   d(float var1, float var2, float var3, float var4) {
      this.b[0] = var1;
      this.b[1] = var4;
      this.b[2] = 0.0F;
      this.b[3] = var1;
      this.b[4] = var2;
      this.b[5] = 0.0F;
      this.b[6] = var3;
      this.b[7] = var2;
      this.b[8] = 0.0F;
      this.b[9] = var3;
      this.b[10] = var4;
      this.b[11] = 0.0F;
      this.a();
   }

   private void a() {
      ByteBuffer var1 = ByteBuffer.allocateDirect(this.b.length * 4);
      var1.order(ByteOrder.nativeOrder());
      this.c = var1.asFloatBuffer();
      this.c.put(this.b);
      this.c.position(0);
      var1 = ByteBuffer.allocateDirect(this.a.length * 2);
      var1.order(ByteOrder.nativeOrder());
      this.d = var1.asShortBuffer();
      this.d.put(this.a);
      this.d.position(0);
   }

   void a(GL10 var1) {
      var1.glFrontFace(2305);
      var1.glEnable(2884);
      var1.glCullFace(1029);
      var1.glEnableClientState(32884);
      var1.glVertexPointer(3, 5126, 0, this.c);
      var1.glDrawElements(4, this.a.length, 5123, this.d);
      var1.glDisableClientState(32884);
      var1.glDisable(2884);
   }
}
