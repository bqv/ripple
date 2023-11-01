package com.dof100.morsenotifier

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build.VERSION
import android.preference.PreferenceManager
import android.telephony.TelephonyManager
import androidx.core.content.edit
import com.dof100.morsenotifier.MyLog.log
import java.util.Locale

class BRCall : BroadcastReceiver() {
  override fun onReceive(context: Context, intent: Intent) {
    log(context, "BRCall.onReceive")
    var var3 = intent.action
    if (var3 != null) {
      var var4 = var3 == "android.intent.action.PHONE_STATE"
      if (var4) {
        val var5 = PreferenceManager.getDefaultSharedPreferences(context)
        val var6 = var5.getString("BRCall_lastState", TelephonyManager.EXTRA_STATE_IDLE)
        var var7 = var5.getLong("BRCall_lastTimeRinging", 0L)
        var3 = intent.getStringExtra("state")
        val var15 = var5.edit()
        var15.putString("BRCall_lastState", var3)
        var15.apply()
        if (TelephonyManager.EXTRA_STATE_IDLE == var3) {
          log(context, "BRCall.onReceive EXTRA_STATE_IDLE. Broadcasting finish")
          App.b(context)
        } else if (TelephonyManager.EXTRA_STATE_OFFHOOK == var3) {
          log(context, "BRCall.onReceive EXTRA_STATE_OFFHOOK. Broadcasting finish")
          App.b(context)
        } else if (TelephonyManager.EXTRA_STATE_RINGING != var3) {
          log(context, "BRCall.onReceive EXTRA_STATE_???????. Broadcasting finish")
          App.b(context)
        } else {
          log(context, "BRCall.onReceive EXTRA_STATE_RINGING lastState  = $var6")
          var4 = intent.hasExtra("incoming_number")
          log(context, "BRCall.onReceive EXTRA_STATE_RINGING hasCallerID  = $var4")
          if (VERSION.SDK_INT >= 28 && !var4) {
            log(
              context,
              "BRCall.onReceive EXTRA_STATE_RINGING Android>=9 without hasCallerID (returning)"
            )
          } else {
            var3 = intent.getStringExtra("incoming_number")
            log(context, "BRCall.onReceive EXTRA_STATE_RINGING callerID   = $var3")
            var var13 = var3
            if (var3 == null) {
              var13 = ""
            }
            var var9 = System.currentTimeMillis()
            var15.putLong("BRCall_lastTimeRinging", var9)
            var15.apply()
            var9 -= var7
            log(context, "BRCall.onReceive EXTRA_STATE_RINGING dt     = $var9")
            var7 = var9
            if (var9 < 0L) {
              var7 = 2501L
              log(context, "BRCall.onReceive EXTRA_STATE_RINGING dt      -> ${2501L}")
            }
            if (var7 < 2500L) {
              log(context, "BRCall.onReceive EXTRA_STATE_RINGING dt      < MINDTBETWEENRINGS (return)")
            } else {
              if (TelephonyManager.EXTRA_STATE_RINGING == var6) {
                log(context, "BRCall.onReceive oldstate=RINGING (ERROR)")
                if (var7 < 5000L) {
                  log(context, "BRCall.onReceive oldstate=RINGING (ERROR), dt<DTRESETRINGS (return)")
                  return
                }
                log(context, "BRCall.onReceive oldstate=RINGING (ERROR), dt>DTRESETRINGS, proceed as normal")
              }
              log(context, String.format(Locale.US,
                  "BRCall.onReceive Sending intent to ServiceMain info=%s text1=%s",
                  context.resources.getString(R.string.MSG_CALL_RINGING), var13))
              val var16 = Intent(context, ServiceMain::class.java)
              var16.putExtra(
                context.resources.getString(R.string.MSG_WHAT),
                context.resources.getString(R.string.MSG_CALL_RINGING)
              )
              var16.putExtra(context.resources.getString(R.string.MSG_EXTRATEXT1), var13)
              context.startService(var16)
            }
          }
        }
      }
    }
  }
}
