package com.dof100.morsenotifier

import android.opengl.GLES10
import android.opengl.GLSurfaceView
import android.opengl.GLU
import com.dof100.morsenotifier.MyLog.log
import java.util.Locale
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10
import kotlin.math.atan2

internal class MyMorseRenderer constructor(pList: ArrayList<Int>?, pDisplayHow: Int, pDisplayText: Boolean,
                                           pDisplayFlash: Boolean, pDisplayColor: Int, pDisplayColorMeHilight: Int,
                                           pDisplayColorTextHilight: Int, pDisplayInitialDelay: Int
) : GLSurfaceView.Renderer {
  private val mDisplayHow: Int
  private val mDisplayText: Boolean
  private val mDisplayFlash: Boolean
  private var d: UnknownGL3? = null
  private val glList: ArrayList<UnknownGL2> = ArrayList()
  private var f: Int = -1
  private var g: Int = -1
  private var h: Int = -1
  private val i: Float
  private val j: Float
  private val k: Float
  private val l: Float
  private val m: Float
  private val n: Float
  private val o: Float
  private val p: Float
  private val q: Float
  private val mDisplayInitialDelay: Int
  private val timestamp: Long
  private var t: Float = 1.0f
  private var u: Float = 1.0f
  private var v: Float = 1.0f
  private var w: Float = 1.0f
  private var x: Float = 0.0f
  private var y: Float = 0.0f
  private var z: Float = 0.0f

  init {
    var displayHow: Int = pDisplayHow
    var displayColor: Int = pDisplayColor
    var displayColorMeHilight: Int = pDisplayColorMeHilight
    log("MyMorseRenderer constructor")
    mDisplayHow = displayHow
    mDisplayText = pDisplayText
    mDisplayFlash = pDisplayFlash
    i = ((displayColor shr 16) and 255).toFloat() / 255.0f
    j = ((displayColor shr 8) and 255).toFloat() / 255.0f
    k = (displayColor and 255).toFloat() / 255.0f
    l = ((displayColorMeHilight shr 16) and 255).toFloat() / 255.0f
    m = ((displayColorMeHilight shr 8) and 255).toFloat() / 255.0f
    n = (displayColorMeHilight and 255).toFloat() / 255.0f
    o = ((pDisplayColorTextHilight shr 16) and 255).toFloat() / 255.0f
    p = ((pDisplayColorTextHilight shr 8) and 255).toFloat() / 255.0f
    q = (pDisplayColorTextHilight and 255).toFloat() / 255.0f
    mDisplayInitialDelay = pDisplayInitialDelay
    timestamp = System.currentTimeMillis()
    glList.clear()
    displayHow = 0
    while (displayHow < pList!!.size) {
      displayColor = pList[displayHow]
      displayColorMeHilight = pList[displayHow + 1]
      glList.add(UnknownGL2(displayColor, displayColorMeHilight))
      displayHow += 2
    }
  }

  fun a(var1: Int) {
    f = var1
    if (f >= 0 && f < glList.size) {
      val var2: UnknownGL2 = glList[var1]
      if (var2.mode >= 0) {
        g = f
      } else if (var2.mode != -1) {
        g = -1
      }
      if (var2.unused >= 0) {
        h = f
        return
      }
      if (var2.unused == -1) {
        return
      }
    } else {
      g = -1
    }
    h = -1
  }

  override fun onDrawFrame(var1: GL10) {
    val var2: Boolean = mDisplayText
    var var3: UnknownGL2? = null
    if (var2) {
      if (d == null) {
        d = UnknownGL3(var1, 48, 1.0f)
      }
    } else {
      d = null
    }
    val var4 = false
    var var5: Boolean = var4
    if (mDisplayFlash) {
      if (f >= 0) {
        var3 = glList[f]
      }
      var5 = var4
      if (var3 != null) {
        run label74@{
          if (var3.mode != 2 && var3.mode != 1) {
            var5 = var4
            if (var3.mode != -1) {
              return@label74
            }
          }
          var5 = true
        }
      }
    }
    var var6: Float
    var var7: Float
    var var8: Float
    var var9: Float
    var var10: Float
    var var11: Float
    var var12: Float
    var var13: Float
    var var14: Float
    var var15: Float
    var var16: Float
    var var17: Float
    var var18: Float
    if (var5) {
      var6 = i
      var7 = j
      var8 = k
      var9 = l
      var10 = m
      var11 = n
      var12 = o
      var13 = p
      var14 = q
      var15 = 1.0f - t
      var16 = 1.0f - u
      var17 = 1.0f - v
      var18 = t
      val var19: Float = u
      var7 = 1.0f - var7
      var1.glClearColor(1.0f - var18, 1.0f - var19, 1.0f - v, 1.0f)
      var9 = 1.0f - var9
      var10 = 1.0f - var10
      var11 = 1.0f - var11
      var12 = 1.0f - var12
      var13 = 1.0f - var13
      var14 = 1.0f - var14
      var6 = 1.0f - var6
      var18 = 1.0f
      var8 = 1.0f - var8
    } else {
      var6 = i
      var7 = j
      var8 = k
      var9 = l
      var10 = m
      var11 = n
      var12 = o
      var13 = p
      var14 = q
      var15 = t
      var16 = u
      var17 = v
      var18 = w
    }
    var1.glClearColor(var15, var16, var17, var18)
    var1.glClear(16640)
    var1.glMatrixMode(5888)
    var1.glLoadIdentity()
    GLU.gluLookAt(var1, 0.0f, 0.0f, 25.0f, 0.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f)
    var1.glDisable(2896)
    var1.glFrontFace(2305)
    var1.glColor4f(1.0f, 1.0f, 0.0f, 1.0f)
    val elapsed: Long = System.currentTimeMillis() - timestamp
    if (elapsed < mDisplayInitialDelay.toLong()) {
      GLES10.glTranslatef(x - x * elapsed.toFloat() / mDisplayInitialDelay.toFloat(), 0.0f, 0.0f)
    }
    GLES10.glTranslatef((-f).toFloat() * 0.5f, 0.0f, 0.0f)
    var var22: Int = -1
    var var23: Int = -1
    for (var24 in glList.indices) {
      var1.glColor4f(1.0f, 0.0f, 0.0f, 1.0f)
      val var25: UnknownGL2 = glList[var24]
      if (var25.mode >= 0) {
        var23 = var24
      } else if (var25.mode != -1) {
        var23 = -1
      }
      if (var25.unused >= 0) {
        var22 = var24
      } else if (var25.unused != -1) {
        var22 = -1
      }
      if (d != null && var25.unused >= 0) {
        if (var22 == h) {
          var15 = var12
          var18 = var13
          var17 = var14
        } else {
          var17 = var7
          var15 = var6
          var18 = var7
        }
        d!!.b(
          var1,
          (var25.unused.toChar()).toString(),
          0.25f,
          d!!.a / 2.0f + 0.5f,
          0.0f,
          var15,
          var18,
          var17
        )
      }
      if (var25.mode >= 0) {
        if (var23 == g) {
          var15 = var9
          var17 = var10
          var16 = var11
        } else {
          var16 = var8
          var17 = var7
          var15 = var6
        }
        var1.glColor4f(var15, var17, var16, 1.0f)
        var25.perform(var1)
      }
      GLES10.glTranslatef(0.5f, 0.0f, 0.0f)
    }
    var1.glFlush()
  }

  override fun onSurfaceChanged(var1: GL10, width: Int, height: Int) {
    log(String.format(Locale.US, "MyMorseRenderer.onSurfaceChanged width=%d  height=%d ", width, height))
    var height: Int = height
    if (height == 0) {
      height = 1
    }
    val aspect: Float = width.toFloat() / height.toFloat()
    if (height > width) {
      x = 4.0f
      y = x / aspect
    } else {
      y = 4.0f
      x = y * aspect
    }
    z = 4.0f
    val var6: Float = (Math.toDegrees(atan2(y.toDouble(), (z + 25.0f).toDouble())) * 2.0).toFloat()
    log(String.format(Locale.US, "MyMorseRenderer.onSurfaceChanged width,height = %d,%d", width, height)
    )
    log("MyMorseRenderer.onSurfaceChanged aspect=$aspect")
    var1.glViewport(0, 0, width, height)
    var1.glMatrixMode(5889)
    var1.glLoadIdentity()
    GLU.gluPerspective(var1, var6, aspect, 0.1f, (z + 25.0f) * 2.0f)
  }

  override fun onSurfaceCreated(var1: GL10, var2: EGLConfig) {
    log("MyMorseRenderer.onSurfacecreated")
    if (mDisplayHow == 1) {
      t = 0.0f
      u = 0.0f
      v = 0.0f
      w = 1.0f
    } else {
      t = 0.0f
      u = 0.0f
      v = 0.0f
      w = 0.0f
    }
    var1.glClearDepthf(1.0f)
    var1.glEnable(2929)
    var1.glDepthFunc(515)
    var1.glHint(3152, 4354)
    var1.glShadeModel(7425)
    var1.glDisable(3024)
    d = null
  }
}
