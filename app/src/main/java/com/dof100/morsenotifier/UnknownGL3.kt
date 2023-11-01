package com.dof100.morsenotifier

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Paint.Align
import android.opengl.GLUtils
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.FloatBuffer
import javax.microedition.khronos.opengles.GL10

internal class UnknownGL3(var1: GL10, var2: Int, var3: Float) {
  var a: Float
  private val b: GL10
  private val c: Array<String?>
  private val d: Int
  private val e = IntArray(1)
  private var f: FloatBuffer? = null
  private var g: FloatBuffer? = null

  init {
    var var2 = var2
    b = var1
    d = var2
    a = var3
    c = arrayOfNulls(127)
    var2 = 0
    while (var2 <= 31) {
      c[var2] = " "
      ++var2
    }
    var2 = 32
    while (var2 <= 126) {
      c[var2] = Character.toString(var2.toChar())
      ++var2
    }
    this.a()
  }

  private fun a() {
    val var1 = Paint()
    var1.textSize = d.toFloat()
    var1.isAntiAlias = true
    var1.setARGB(255, 0, 255, 0)
    var1.textSize = d.toFloat()
    var1.textAlign = Align.CENTER
    var1.isAntiAlias = false
    var1.style = Paint.Style.FILL
    var var2 = d
    val var3 = c
    var var4 = var3.size
    var var5: Int
    var var6: Float
    var var7: Int
    var5 = 0
    while (var5 < var4) {
      var6 = var1.measureText(var3[var5])
      var7 = var2
      if (var6 > var2.toFloat()) {
        var7 = (var6.toDouble() + 0.99).toInt()
      }
      ++var5
      var2 = var7
    }
    var7 = 1
    while (c.size > var7 * var7) {
      ++var7
    }
    var5 = 1
    while (var5 < var2 * var7) {
      var5 *= 2
    }
    val var20 = Bitmap.createBitmap(var5, var5, Bitmap.Config.ARGB_8888)
    val var8 = Canvas(var20)
    var20.eraseColor(0)
    var var10: Int
    var var11: Int
    var var12: Float
    var var13: Float
    var4 = 0
    while (var4 < c.size) {
      val var9 = c[var4]
      var10 = var4 / var7
      var11 = var2 / 2
      var6 = (var4 % var7 * var2 + var11).toFloat()
      var12 = (var10 * var2 + var11).toFloat()
      var13 = (var1.descent() + var1.ascent()) / 2.0f
      var1.setARGB(255, 255, 255, 255)
      var8.drawText(var9!!, var6, var12 - var13, var1)
      ++var4
    }
    val var14 = -a / 2.0f
    var13 = -a / 2.0f
    var var15 = a / 2.0f
    val var16 = -a / 2.0f
    var var17 = -a / 2.0f
    var12 = a / 2.0f
    var6 = a / 2.0f
    val var18 = a / 2.0f
    var var19 = ByteBuffer.allocateDirect(48)
    var19.order(ByteOrder.nativeOrder())
    f = var19.asFloatBuffer().apply {
      put(
      floatArrayOf(
        var14,
        var13,
        0.0f,
        var15,
        var16,
        0.0f,
        var17,
        var12,
        0.0f,
        var6,
        var18,
        0.0f
      )
      )
      position(0)
    }
    val var21 = FloatArray(c.size * 8)
    var4 = 0
    while (var4 < c.size) {
      var10 = var4 / var7
      var11 = var4 % var7 * var2
      var12 = var11.toFloat()
      var17 = (var11 + var2 - 1).toFloat()
      var11 = var10 * var2
      var6 = (var11 + 2).toFloat()
      var15 = (var11 + var2 + 1).toFloat()
      var11 = var4 * 8
      var13 = var5.toFloat()
      var12 /= var13
      var21[var11] = var12
      var15 /= var13
      var21[var11 + 1] = var15
      var17 /= var13
      var21[var11 + 2] = var17
      var21[var11 + 3] = var15
      var21[var11 + 4] = var12
      var6 /= var13
      var21[var11 + 5] = var6
      var21[var11 + 6] = var17
      var21[var11 + 7] = var6
      ++var4
    }
    var19 = ByteBuffer.allocateDirect(var21.size * 4)
    var19.order(ByteOrder.nativeOrder())
    g = var19.asFloatBuffer().apply {
      put(var21)
      position(0)
    }
    b.glEnable(3553)
    b.glGenTextures(1, e, 0)
    b.glBindTexture(3553, e[0])
    b.glTexParameterf(3553, 10241, 9728.0f)
    b.glTexParameterf(3553, 10240, 9729.0f)
    b.glTexParameterf(3553, 10242, 33071.0f)
    b.glTexParameterf(3553, 10243, 33071.0f)
    GLUtils.texImage2D(3553, 0, 6408, var20, 0)
    b.glDisable(3553)
  }

  fun a(
    var1: GL10,
    var2: String,
    var3: Float,
    var4: Float,
    var5: Float,
    var6: Float,
    var7: Float,
    var8: Float
  ) {
    val var9 = var2.length
    val var10 = a * 2.0f / 3.0f
    val var11 = var10 / 2.0f
    var1.glFrontFace(2305)
    var1.glPushMatrix()
    var1.glTranslatef(var3 + var11, var4, var5)
    var1.glEnable(3553)
    var1.glBlendFunc(1, 771)
    var1.glEnable(3042)
    var1.glEnableClientState(32884)
    var1.glEnableClientState(32888)
    if (var6.toDouble() > -0.01 && var7.toDouble() > -0.01 && var8.toDouble() > -0.01) {
      var1.glColor4f(var6, var7, var8, 1.0f)
    }
    for (var12 in 0 until var9) {
      var var14: Char = 0 as Char
      run label23@{
        val var13 = var2[var12]
        if (var13.code >= 0) {
          var14 = var13
          if (var13.code < c.size) {
            return@label23
          }
        }
        var14 = '?'
      }
      var1.glVertexPointer(3, 5126, 0, f!!.position(0))
      var1.glTexCoordPointer(2, 5126, 0, g!!.position(var14.code * 8))
      var1.glBindTexture(3553, e[0])
      var1.glDrawArrays(5, 0, 4)
      var1.glTranslatef(var10, 0.0f, 0.0f)
    }
    var1.glDisableClientState(32884)
    var1.glDisableClientState(32888)
    var1.glDisable(3042)
    var1.glDisable(3553)
    var1.glPopMatrix()
  }

  fun b(
    var1: GL10,
    var2: String,
    var3: Float,
    var4: Float,
    var5: Float,
    var6: Float,
    var7: Float,
    var8: Float
  ) {
    val var9 = var2.length
    this.a(
      var1,
      var2,
      var3 - a * 2.0f / 3.0f * (var9.toFloat() / 2.0f),
      var4,
      var5,
      var6,
      var7,
      var8
    )
  }
}
