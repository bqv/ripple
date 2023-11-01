package com.dof100.morsenotifier

import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.FloatBuffer
import java.nio.ShortBuffer
import javax.microedition.khronos.opengles.GL10

internal class UnknownGL2(var mode: Int, var unused: Int) {
  private val renderer: UnknownGL1? = when (mode) {
    1 -> UnknownGL1(0.0f, -0.25f, 0.5f, 0.25f)
    2 -> UnknownGL1(0.0f, -0.25f, 1.5f, 0.25f)
    else -> null
  }

  fun perform(arg: GL10) {
    renderer?.perform(arg)
  }

  private class UnknownGL1(var1: Float, var2: Float, var3: Float, var4: Float) {
    private val a = shortArrayOf(0, 1, 2, 0, 2, 3)
    private val b = floatArrayOf(var1, var4, 0.0f, var1, var2, 0.0f, var3, var2, 0.0f, var3, var4, 0.0f)
    private var c: FloatBuffer? = null
    private var d: ShortBuffer? = null

    init {
      var buffer = ByteBuffer.allocateDirect(b.size * 4)
      buffer.order(ByteOrder.nativeOrder())
      c = buffer.asFloatBuffer().apply {
        put(b)
        position(0)
      }
      buffer = ByteBuffer.allocateDirect(a.size * 2)
      buffer.order(ByteOrder.nativeOrder())
      d = buffer.asShortBuffer().apply {
        put(a)
        position(0)
      }
    }

    fun perform(arg: GL10) {
      with (arg) {
        glFrontFace(2305)
        glEnable(2884)
        glCullFace(1029)
        glEnableClientState(32884)
        glVertexPointer(3, 5126, 0, c)
        glDrawElements(4, a.size, 5123, d)
        glDisableClientState(32884)
        glDisable(2884)
      }
    }
  }
}
