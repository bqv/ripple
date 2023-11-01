package com.dof100.morsenotifier

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.preference.PreferenceManager
import androidx.core.content.edit
import com.dof100.morsenotifier.MyLog.log
import java.util.Locale

class BRVolume : BroadcastReceiver() {
  override fun onReceive(var1: Context, var2: Intent) {
    var var3 = var2.action
    val var4: Boolean = try {
      var3 == "android.media.VOLUME_CHANGED_ACTION"
    } catch (var21: Exception) {
      return
    }
    if (var4) {
      val var5 = var2.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1)
      val var6 = var2.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", -1)
      var var22: String?
      if (var5 == 2) {
        var22 = "BRVolume.onReceive ring volume (maybe samsung, ignoring)"
      } else {
        if (var5 in 0..9 && var6 != -1) {
          val var23 = PreferenceManager.getDefaultSharedPreferences(var1)
          var22 = if (App.c) { "_morsedef" } else { "_voicedef" }
          val var7 = Utils.prefGetInt(var1, var23, "pref_morse_volumedownstop", null as String?, var22, "_def")
          val var8 = intArrayOf(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1)
          for (var9 in 0..9) {
            var8[var9] = var23.getInt("BRVolume_LastVol$var9", -1)
          }
          var var10: Long
          var var12: Long
          var var14: Long
          var var16: SharedPreferences.Editor
          var var17: Long
          var var19: Boolean
          var var26: Boolean
          run label94@{
            run label93@{
              var10 = var23.getLong("BRVolume_LastTimeVolUp", 0L)
              var12 = var23.getLong("BRVolume_LastTimeVolDown", 0L)
              var14 = var23.getLong("BRVolume_LastTimeBroadcast", 0L)
              var16 = var23.edit()
              var17 = System.currentTimeMillis()
              if (var8[var5] != -1) {
                if (var8[var5] < var6) {
                  var16.putLong("BRVolume_LastTimeVolUp", var17)
                  var26 = false
                  var19 = true
                  return@label94
                }
                if (var8[var5] > var6) {
                  var16.putLong("BRVolume_LastTimeVolDown", var17)
                  var26 = true
                  return@label93
                }
              }
              var26 = false
            }
            var19 = false
          }
          var var20: Boolean
          run label85@{
            run label84@{
              var16.putInt("BRVolume_LastVol$var5", var6)
              when (var7) {
                1 -> {}
                2 -> if (var26) {
                  return@label84
                }

                3 -> return@label84
                4 -> if (var19 && var17 - var12 < 2000L || var26 && var17 - var10 < 2000L) {
                  return@label84
                }

                else -> {}
              }
              var20 = false
              return@label85
            }
            var20 = true
          }
          var3 = ""
          if (var26) {
            var3 = " DOWN"
          }
          var22 = var3
          if (var19) {
            var22 = "$var3 UP  "
          }
          run label66@{
            var3 = var22
            if (var20) {
              var22 = "$var22 OK"
              var3 = var22
              if (var17 - var14 > 500L) {
                var16.putLong("BRVolume_LastTimeBroadcast", var17)
                var3 = "$var22 Broadcasting Finish"
                var26 = true
                return@label66
              }
            }
            var26 = false
          }
          var16.apply()
          log(var1, String.format( Locale.US,
              "BRVolume.onReceive StreamType=%02d Vol:%02d old = %02d %02d %02d %02d %02d %02d %02d %02d %02d %02d (pref=%d) %s",
              var5, var6,
              var8[0], var8[1], var8[2], var8[3], var8[4], var8[5], var8[6], var8[7], var8[8], var8[9],
              var7, var3))
          if (var26) {
            App.b(var1)
          }
          return@onReceive
        }
        var22 = String.format(Locale.US, "BRVolume.onReceive ERROR Stream type =%d  Volume: %d",
          var5, var6
        )
      }
      log(var1, var22)
    }
  }
}
