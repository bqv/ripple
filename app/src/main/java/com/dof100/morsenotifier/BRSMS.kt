package com.dof100.morsenotifier

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build.VERSION
import android.telephony.SmsMessage
import android.util.Log
import com.dof100.morsenotifier.MyLog.log
import java.util.Locale

class BRSMS : BroadcastReceiver() {
  override fun onReceive(var1: Context, var2: Intent) {
    var var4: String?
    var var5: String?
    var var19: String?
    run label97@{
      var var6: String?
      var var20: Exception?
      run label96@{
        log(var1, "BRSMS.onReceive")
        val var3 = var2.extras
        var4 = ""
        var19 = ""
        var5 = "nothing"
        var var10000: Exception?
        var var10001: Boolean
        if (var3 != null) {
          run label99@{
            try {
              var6 = var1.resources.getString(R.string.MSG_SMS_NEWSMS)
            } catch (var18: Exception) {
              var10000 = var18
              var10001 = false
              return@label99
            }
            run label87@{
              var var10: String
              run label100@{
                val var7: Array<Any>?
                try {
                  var7 = var3["pdus"] as Array<Any>?
                } catch (var16: Exception) {
                  var10000 = var16
                  var10001 = false
                  return@label100
                }
                if (var7 != null) {
                  var19 = ""
                  var4 = ""
                  var var8 = 0
                  while (true) {
                    var var9: Int
                    run label76@{
                      run label103@{
                        val var21: Locale
                        try {
                          if (var8 >= var7.size) {
                            return@label87
                          }
                          var21 = Locale.US
                        } catch (var14: Exception) {
                          var10000 = var14
                          var10001 = false
                          return@label103
                        }
                        var9 = var8 + 1
                        var var22: SmsMessage
                        run label69@{
                          try {
                            log(
                              String.format(
                                var21,
                                "BRSMS.onReceive obj=%d of %d",
                                var9,
                                var7.size
                              )
                            )
                            if (VERSION.SDK_INT >= 23) {
                              var5 = var3.getString("format")
                              var22 = SmsMessage.createFromPdu(
                                var7[var8] as ByteArray, var5
                              )
                              return@label69
                            }
                          } catch (var13: Exception) {
                            var10000 = var13
                            var10001 = false
                            return@label103
                          }
                          try {
                            var22 = SmsMessage.createFromPdu(
                              var7[var8] as ByteArray
                            )
                          } catch (var12: Exception) {
                            var10000 = var12
                            var10001 = false
                            return@label103
                          }
                        }
                        try {
                          var10 = var22.displayOriginatingAddress
                          var5 = var22.displayMessageBody
                          return@label76
                        } catch (var11: Exception) {
                          var10000 = var11
                          var10001 = false
                        }
                      }
                      var20 = var10000
                      var10 = var6!!
                      var6 = var19
                      var19 = var10
                      return@label96
                    }
                    if (var10 != null) {
                      var19 = var10
                    }
                    if (var5 != null) {
                      var4 = var5
                    }
                    var8 = var9
                  }
                }
                try {
                  log(var1, "BRSMS.onReceive pdusObj=null")
                  return@label87
                } catch (var15: Exception) {
                  var10000 = var15
                  var10001 = false
                }
              }
              var20 = var10000
              var10 = var6!!
              var6 = var19
              var19 = var10
              return@label96
            }
            var5 = var6
            return@label97
          }
        } else {
          try {
            log(var1, "BRSMS.onReceive bundle=null")
            return@label97
          } catch (var17: Exception) {
            var10000 = var17
            var10001 = false
          }
        }
        val var24 = var10000
        var6 = var19
        var19 = var5
        var20 = var24
      }
      val var25 = StringBuilder()
      var25.append("BRSMS: Exception smsReceiver")
      var25.append(var20)
      Log.e("BRSMS", var25.toString())
      var5 = var19
      var19 = var6
    }
    log(
      var1,
      String.format(
        Locale.US,
        "BRSMS.onReceive Sending intent to ServiceMain info=%s callerID=%s text=%s",
        var5,
        var19,
        var4
      )
    )
    val var23 = Intent(var1, ServiceMain::class.java)
    var23.putExtra(var1.resources.getString(R.string.MSG_WHAT), var5)
    var23.putExtra(var1.resources.getString(R.string.MSG_EXTRATEXT1), var19)
    var23.putExtra(var1.resources.getString(R.string.MSG_EXTRATEXT2), var4)
    var1.startService(var23)
  }
}
