package com.dof100.morsenotifier

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.dof100.morsenotifier.MyLog.log
import java.util.Locale

class BRMMS : BroadcastReceiver() {
  override fun onReceive(var1: Context, var2: Intent) {
    log(var1, "BRMMS.onReceive")
    var var3 = var2.action
    var var4 = var2.type
    val var5: Boolean
    var5 = try {
      if (var3 != "android.provider.Telephony.WAP_PUSH_RECEIVED") {
        return
      }
      var4 == "application/vnd.wap.mms-message"
    } catch (var49: Exception) {
      return
    }
    if (var5) {
      val var6 = var2.extras
      var3 = ""
      var var50: String?
      if (var6 != null) {
        run label304@{
          var var7: String
          run label303@{
            run label318@{
              try {
                var7 = var1.resources.getString(R.string.MSG_SMS_NEWMMS)
              } catch (var48: Exception) {
                var50 = "nothing"
                return@label318
              }
              var50 = var3
              run label319@{
                var var10001: Boolean
                val var52: ByteArray?
                try {
                  var52 = var6.getByteArray("data")
                } catch (var47: Exception) {
                  var10001 = false
                  return@label319
                }
                var var8: String
                if (var52 != null) {
                  var50 = var3
                  try {
                    var8 = String()
                  } catch (var46: Exception) {
                    var10001 = false
                    return@label319
                  }
                  var50 = var3
                  try {
                    var8 = var52
                  } catch (var45: Exception) {
                    var10001 = false
                    return@label319
                  }
                } else {
                  var8 = ""
                }
                var50 = var3
                val var53: StringBuilder
                try {
                  var53 = StringBuilder()
                } catch (var44: Exception) {
                  var10001 = false
                  return@label319
                }
                var50 = var3
                try {
                  var53.append("BRMMS.onReceive  buffer =")
                } catch (var42: Exception) {
                  var10001 = false
                  return@label319
                }
                var50 = var3
                try {
                  var53.append(var8)
                } catch (var41: Exception) {
                  var10001 = false
                  return@label319
                }
                var50 = var3
                try {
                  log(var1, var53.toString())
                } catch (var40: Exception) {
                  var10001 = false
                  return@label319
                }
                var50 = var3
                var var9: Int
                try {
                  var9 = var8.indexOf("/TYPE")
                } catch (var39: Exception) {
                  var10001 = false
                  return@label319
                }
                var4 = var3
                var var51: StringBuilder
                if (var9 > 0) {
                  val var10 = var9 - 15
                  var4 = var3
                  if (var10 > 0) {
                    var50 = var3
                    try {
                      var8 = var8.substring(var10, var9)
                    } catch (var38: Exception) {
                      var10001 = false
                      return@label319
                    }
                    var50 = var3
                    try {
                      var9 = var8.indexOf("+")
                    } catch (var37: Exception) {
                      var10001 = false
                      return@label319
                    }
                    var4 = var8
                    if (var9 > 0) {
                      var50 = var3
                      try {
                        var4 = var8.substring(var9)
                      } catch (var36: Exception) {
                        var10001 = false
                        return@label319
                      }
                    }
                    var50 = var4
                    try {
                      var51 = StringBuilder()
                    } catch (var35: Exception) {
                      var10001 = false
                      return@label319
                    }
                    var50 = var4
                    try {
                      var51.append("BRMMS.onReceive  param_callerID =")
                    } catch (var33: Exception) {
                      var10001 = false
                      return@label319
                    }
                    var50 = var4
                    try {
                      var51.append(var4)
                    } catch (var32: Exception) {
                      var10001 = false
                      return@label319
                    }
                    var50 = var4
                    try {
                      log(var1, var51.toString())
                    } catch (var31: Exception) {
                      var10001 = false
                      return@label319
                    }
                  }
                }
                var50 = var4
                try {
                  var9 = var6.getInt("transactionId")
                } catch (var30: Exception) {
                  var10001 = false
                  return@label319
                }
                var50 = var4
                try {
                  var51 = StringBuilder()
                } catch (var29: Exception) {
                  var10001 = false
                  return@label319
                }
                var50 = var4
                try {
                  var51.append("BRMMS.onReceive  transactionId =")
                } catch (var27: Exception) {
                  var10001 = false
                  return@label319
                }
                var50 = var4
                try {
                  var51.append(var9)
                } catch (var26: Exception) {
                  var10001 = false
                  return@label319
                }
                var50 = var4
                try {
                  log(var51.toString())
                } catch (var25: Exception) {
                  var10001 = false
                  return@label319
                }
                var50 = var4
                try {
                  var9 = var6.getInt("pduType")
                } catch (var24: Exception) {
                  var10001 = false
                  return@label319
                }
                var50 = var4
                try {
                  var51 = StringBuilder()
                } catch (var23: Exception) {
                  var10001 = false
                  return@label319
                }
                var50 = var4
                try {
                  var51.append("BRMMS.onReceive  pduType =")
                } catch (var21: Exception) {
                  var10001 = false
                  return@label319
                }
                var50 = var4
                try {
                  var51.append(var9)
                } catch (var20: Exception) {
                  var10001 = false
                  return@label319
                }
                var50 = var4
                try {
                  log(var1, var51.toString())
                } catch (var19: Exception) {
                  var10001 = false
                  return@label319
                }
                var50 = var4
                val var55: ByteArray?
                try {
                  var55 = var6.getByteArray("header")
                } catch (var18: Exception) {
                  var10001 = false
                  return@label319
                }
                if (var55 != null) {
                  var50 = var4
                  try {
                    var3 = String()
                  } catch (var17: Exception) {
                    var10001 = false
                    return@label319
                  }
                  var50 = var4
                  try {
                    var3 = var55
                  } catch (var16: Exception) {
                    var10001 = false
                    return@label319
                  }
                } else {
                  var3 = ""
                }
                var50 = var4
                val var56: StringBuilder
                try {
                  var56 = StringBuilder()
                } catch (var15: Exception) {
                  var10001 = false
                  return@label319
                }
                var50 = var4
                try {
                  var56.append("BRMMS.onReceive  header =")
                } catch (var13: Exception) {
                  var10001 = false
                  return@label319
                }
                var50 = var4
                try {
                  var56.append(var3)
                } catch (var12: Exception) {
                  var10001 = false
                  return@label319
                }
                var50 = var4
                var10001 = try {
                  log(var1, var56.toString())
                  return@label303
                } catch (var11: Exception) {
                  false
                }
              }
              var3 = var50
              var50 = var7
            }
            log(var1, "BRMMS.onReceive ERROR: Exception")
            return@label304
          }
          var3 = var4
          var50 = var7
        }
      } else {
        var50 = "nothing"
      }
      log(
        var1,
        String.format(
          Locale.US,
          "BRMMS.onReceive Sending intent to ServiceMain info=%s callerID=%s text=%s",
          var50,
          var3,
          ""
        )
      )
      val var54 = Intent(var1, ServiceMain::class.java)
      var54.putExtra(var1.resources.getString(R.string.MSG_WHAT), var50)
      var54.putExtra(var1.resources.getString(R.string.MSG_EXTRATEXT1), var3)
      var54.putExtra(var1.resources.getString(R.string.MSG_EXTRATEXT2), "")
      var1.startService(var54)
    }
  }
}
