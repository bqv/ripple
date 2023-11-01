package com.dof100.morsenotifier

import javax.microedition.khronos.opengles.GL10

internal class UnknownGl2(var a: Int, var b: Int) {
  private val c: UnknownGL1?

  init {
    val var3: UnknownGL1?
    var3 = when (a) {
      1 -> UnknownGL1(0.0f, -0.25f, 0.5f, 0.25f)
      2 -> UnknownGL1(0.0f, -0.25f, 1.5f, 0.25f)
      else -> null
    }
    c = var3
  }

  fun a(var1: GL10) {
    if (c != null) {
      c.a(var1)
    }
  }
}
