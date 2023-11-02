package com.dof100.morsenotifier

import com.dof100.morsenotifier.MyLog.log
import java.util.Locale

internal class MyTone(var1: Int, var2: Int) {
  var nSamples: Int
  var mGeneratedSnd = byteArrayOf()
  private val sampleRate: Int

  init {
    var dur = var1
    sampleRate = var2
    nSamples = (dur.toLong() * sampleRate.toLong() / 1000L).toInt()
    log(String.format(Locale.getDefault(), "MyTone constructor Element Dur=%d msec  Sample Rate=%d s/sec NSamples=%d",
        dur, sampleRate, nSamples))
    run init@{
      run label32@{
      var var10001: Boolean
      try {
        mGeneratedSnd = ByteArray(nSamples * 2)
      } catch (var5: Exception) {
        var10001 = false
        return@label32
      }
      dur = 0
      while (true) {
        try {
          if (dur >= nSamples * 2) {
            return@init
          }
          mGeneratedSnd[dur] = 0.toByte()
        } catch (var4: Exception) {
          var10001 = false
          break
        }
        ++dur
      }
      }
      log("MyTone constructor ERROR creating/initializing byte array")
    }
  }

  fun act(var1: Int, var2: Int, var3: Float, var4: Float, var5: Float) {
    var var1 = var1
    var var2 = var2
    var var4 = var4
    var var5 = var5
    val var6 = var1.toLong()
    val var8 = (sampleRate.toLong() * var6 / 1000L).toInt()
    if (var8 <= nSamples - 1) {
      var2 = ((var6 + var2.toLong()) * sampleRate.toLong() / 1000L).toInt()
      var1 = var2
      if (var2 > nSamples - 1) {
        var1 = nSamples - 1
      }
      if (var1 >= var8) {
        var2 = var1 - var8 + 1
        var var9 = (var5.toLong() * sampleRate.toLong() / 1000L).toInt().toDouble()
        var var11 = (var2 / 2).toDouble()
        var var13 = var9
        if (var9 > var11) {
          var13 = var11
        }
        var5 = var3
        if (var3 == 0.0f) {
          var5 = 1.0f
          var4 = 0.0f
        }
        var1 = 0
        while (var1 < var2) {
          var9 = 1.0
          var11 = var1.toDouble()
          if (var11 < var13) {
            var9 = var11 / var13
          } else if (var11 > var2.toDouble() - var13) {
            var9 = (var2 - var1).toDouble() / var13
          }
          val var15 =
            (var9 * var4.toDouble() / 100.0 * Math.sin(var11 * 6.283185307179586 / (sampleRate.toFloat() / var5).toDouble()) * 32767.0).toInt()
              .toShort()
          val var16 = (var8 + var1) * 2
          mGeneratedSnd[var16] = (var15.toInt() and 255).toByte()
          mGeneratedSnd[var16 + 1] = (var15.toInt() and '\uff00'.code ushr 8).toByte()
          ++var1
        }
      }
    }
  }
}
