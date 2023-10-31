package com.dof100.morsenotifier

import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.FloatBuffer
import java.nio.ShortBuffer
import javax.microedition.khronos.opengles.GL10

internal class d(var1: Float, var2: Float, var3: Float, var4: Float) {
  private val a = shortArrayOf(0, 1, 2, 0, 2, 3)
  private val b = FloatArray(12)
  private var c: FloatBuffer? = null
  private var d: ShortBuffer? = null

  init {
    b[0] = var1
    b[1] = var4
    b[2] = 0.0f
    b[3] = var1
    b[4] = var2
    b[5] = 0.0f
    b[6] = var3
    b[7] = var2
    b[8] = 0.0f
    b[9] = var3
    b[10] = var4
    b[11] = 0.0f
    this.a()
  }

  private fun a() {
    var var1 = ByteBuffer.allocateDirect(b.size * 4)
    var1.order(ByteOrder.nativeOrder())
    c = var1.asFloatBuffer().apply {
      put(b)
      position(0)
    }
    var1 = ByteBuffer.allocateDirect(a.size * 2)
    var1.order(ByteOrder.nativeOrder())
    d = var1.asShortBuffer().apply {
      put(a)
      position(0)
    }
  }

  fun a(var1: GL10) {
    var1.glFrontFace(2305)
    var1.glEnable(2884)
    var1.glCullFace(1029)
    var1.glEnableClientState(32884)
    var1.glVertexPointer(3, 5126, 0, c)
    var1.glDrawElements(4, a.size, 5123, d)
    var1.glDisableClientState(32884)
    var1.glDisable(2884)
  }
}
