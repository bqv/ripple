package com.dof100.morsenotifier

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build.VERSION
import android.preference.PreferenceManager
import android.telephony.TelephonyManager
import com.dof100.morsenotifier.MyLog.log
import java.util.Locale

class BRCall : BroadcastReceiver() {
  override fun onReceive(var1: Context, var2: Intent) {
    log(var1, "BRCall.onReceive")
    var var3 = var2.action
    if (var3 != null) {
      var var4: Boolean
      var4 = try {
        var3 == "android.intent.action.PHONE_STATE"
      } catch (var11: Exception) {
        return
      }
      if (var4) {
        val var5 = PreferenceManager.getDefaultSharedPreferences(var1)
        val var6 = var5.getString("BRCall_lastState", TelephonyManager.EXTRA_STATE_IDLE)
        var var7 = var5.getLong("BRCall_lastTimeRinging", 0L)
        var3 = var2.getStringExtra("state")
        val var15 = var5.edit()
        var15.putString("BRCall_lastState", var3)
        var15.apply()
        if (TelephonyManager.EXTRA_STATE_IDLE == var3) {
          log(var1, "BRCall.onReceive EXTRA_STATE_IDLE. Broadcasting finish")
          App.Companion.b(var1)
        } else if (TelephonyManager.EXTRA_STATE_OFFHOOK == var3) {
          log(var1, "BRCall.onReceive EXTRA_STATE_OFFHOOK. Broadcasting finish")
          App.Companion.b(var1)
        } else if (TelephonyManager.EXTRA_STATE_RINGING != var3) {
          log(var1, "BRCall.onReceive EXTRA_STATE_???????. Broadcasting finish")
          App.Companion.b(var1)
        } else {
          var var14 = StringBuilder()
          var14.append("BRCall.onReceive EXTRA_STATE_RINGING lastState  = ")
          var14.append(var6)
          log(var1, var14.toString())
          var4 = var2.hasExtra("incoming_number")
          var14 = StringBuilder()
          var14.append("BRCall.onReceive EXTRA_STATE_RINGING hasCallerID  = ")
          var14.append(var4)
          log(var1, var14.toString())
          if (VERSION.SDK_INT >= 28 && !var4) {
            log(
              var1,
              "BRCall.onReceive EXTRA_STATE_RINGING Android>=9 without hasCallerID (returning)"
            )
          } else {
            var3 = var2.getStringExtra("incoming_number")
            val var12 = StringBuilder()
            var12.append("BRCall.onReceive EXTRA_STATE_RINGING callerID   = ")
            var12.append(var3)
            log(var1, var12.toString())
            var var13 = var3
            if (var3 == null) {
              var13 = ""
            }
            var var9 = System.currentTimeMillis()
            var15.putLong("BRCall_lastTimeRinging", var9)
            var15.apply()
            var9 -= var7
            var14 = StringBuilder()
            var14.append("BRCall.onReceive EXTRA_STATE_RINGING dt     = ")
            var14.append(var9)
            log(var1, var14.toString())
            var7 = var9
            if (var9 < 0L) {
              var7 = 2501L
              var14 = StringBuilder()
              var14.append("BRCall.onReceive EXTRA_STATE_RINGING dt      -> ")
              var14.append(2501L)
              log(var1, var14.toString())
            }
            if (var7 < 2500L) {
              log(
                var1,
                "BRCall.onReceive EXTRA_STATE_RINGING dt      < MINDTBETWEENRINGS (return)"
              )
            } else {
              if (TelephonyManager.EXTRA_STATE_RINGING == var6) {
                log(var1, "BRCall.onReceive oldstate=RINGING (ERROR)")
                if (var7 < 5000L) {
                  log(
                    var1,
                    "BRCall.onReceive oldstate=RINGING (ERROR), dt<DTRESETRINGS (return)"
                  )
                  return
                }
                log(
                  var1,
                  "BRCall.onReceive oldstate=RINGING (ERROR), dt>DTRESETRINGS, proceed as normal"
                )
              }
              log(
                var1,
                String.format(
                  Locale.US,
                  "BRCall.onReceive Sending intent to ServiceMain info=%s text1=%s",
                  var1.resources.getString(R.string.MSG_CALL_RINGING),
                  var13
                )
              )
              val var16 = Intent(var1, ServiceMain::class.java)
              var16.putExtra(
                var1.resources.getString(R.string.MSG_WHAT),
                var1.resources.getString(R.string.MSG_CALL_RINGING)
              )
              var16.putExtra(var1.resources.getString(R.string.MSG_EXTRATEXT1), var13)
              var1.startService(var16)
            }
          }
        }
      }
    }
  }
}
