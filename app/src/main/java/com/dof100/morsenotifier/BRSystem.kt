package com.dof100.morsenotifier

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.res.Resources
import android.net.NetworkInfo
import android.net.wifi.WifiManager
import android.os.Parcelable
import android.preference.PreferenceManager
import com.dof100.morsenotifier.MyLog.log
import java.util.Locale

class BRSystem : BroadcastReceiver() {
  private fun a(var1: Context, var2: NetworkInfo?): Int {
    var var3: Byte = -2
    return if (var2 == null) {
      log(var1, "BRSystem.wifiStateChanged netinfo=null")
      -2
    } else {
      var var4 = System.currentTimeMillis()
      val var6 = PreferenceManager.getDefaultSharedPreferences(var1)
      var var7 = var6.getInt("BRSystem_LastWiFiStatus", -2)
      var var8 = var6.getLong("BRSystem_LastTimeWiFiConnected", 0L)
      var var10 = var6.getLong("BRSystem_LastTimeWiFiDisconnected", 0L)
      val var12: Long
      if (var2.isConnected) {
        log(var1, "BRSystem.wifiStateChanged isConnected")
        var12 = var4 - var8
        var8 = var12
        if (var12 < 0L) {
          var8 = 5001L
        }
        if (var7 == 1) {
          log(var1, "BRSystem.wifiStateChanged already connected")
          var3 = -3
        } else {
          var3 = if (var8 < 5000L) {
            log(var1, "BRSystem.wifiStateChanged dt since last connect < MINDT")
            -3
          } else {
            log(var1, "BRSystem.wifiStateChanged connected")
            1
          }
          var7 = 1
        }
      } else if (var2.isConnectedOrConnecting) {
        log(var1, "BRSystem.onReceive wifiStateChanged isConnectedOrConnecting")
        var4 = var8
      } else {
        log(var1, "BRSystem.wifiStateChanged disConnected")
        var12 = var4 - var10
        var10 = var12
        if (var12 < 0L) {
          var10 = 5001L
        }
        if (var7 == 0) {
          log(var1, "BRSystem.wifiStateChanged already disconnected")
          var3 = -3
          var10 = var4
          var4 = var8
        } else {
          var3 = if (var10 < 5000L) {
            log(var1, "BRSystem.wifiStateChanged dt since last disconnect < MINDT")
            -3
          } else {
            log(var1, "BRSystem.onReceive wifiStateChanged disconnected")
            0
          }
          var7 = 0
          var10 = var4
          var4 = var8
        }
      }
      val var14 = var6.edit()
      var14.putInt("BRSystem_LastWiFiStatus", var7)
      var14.putLong("BRSystem_LastTimeWiFiConnected", var4)
      var14.putLong("BRSystem_LastTimeWiFiDisconnected", var10)
      var14.apply()
      var3.toInt()
    }
  }

  override fun onReceive(var1: Context, var2: Intent) {
    var var2 = var2
    log(var1, "BRSystem.onReceive")
    var var3 = ""
    var var4 = ""
    val var5 = var2.action
    if (var5 != null) {
      if (var5 == "android.intent.action.BOOT_COMPLETED") {
        var3 = var1.resources.getString(R.string.MSG_SYSTEM_BOOT)
        var2 = Intent(var1, ServiceMain::class.java)
        var2.putExtra(var1.resources.getString(R.string.MSG_WHAT), var3)
        var2.putExtra(var1.resources.getString(R.string.MSG_EXTRATEXT2), "")
        var1.startService(var2)
      } else {
        var var6: Byte = -1
        when (var5.hashCode()) {
          -1886648615 -> if (var5 == "android.intent.action.ACTION_POWER_DISCONNECTED") {
            var6 = 1
          }

          -1738947874 -> if (var5 == "android.intent.action.ACTION_BATTERY_LOW") {
            var6 = 2
          }

          -343630553 -> if (var5 == "android.net.wifi.STATE_CHANGE") {
            var6 = 4
          }

          498094322 -> if (var5 == "android.intent.action.ACTION_BATTERY_OK") {
            var6 = 3
          }

          1019184907 -> if (var5 == "android.intent.action.ACTION_POWER_CONNECTED") {
            var6 = 0
          }
        }
        var var8: String
        run label60@{
          val var9: Resources
          var var12: Int
          when (var6) {
            0 as Byte -> {
              var9 = var1.resources
              var12 = R.string.MSG_SYSTEM_POWER_CONNECTED
            }

            1 as Byte -> {
              var9 = var1.resources
              var12 = R.string.MSG_SYSTEM_POWER_DISCONNECTED
            }

            2 as Byte -> {
              var9 = var1.resources
              var12 = R.string.MSG_SYSTEM_BATTERY_LOW
            }

            3 as Byte -> {
              var9 = var1.resources
              var12 = R.string.MSG_SYSTEM_BATTERY_OK
            }

            4 as Byte -> {
              var12 = a(
                var1,
                var2.getParcelableExtra<Parcelable>("networkInfo") as NetworkInfo?
              )
              if (var12 == 1) {
                var4 = var1.resources.getString(R.string.MSG_SYSTEM_WF_CONNECTED)
                val var10 =
                  var1.applicationContext.getSystemService("wifi") as WifiManager
                var8 = try {
                  var10.connectionInfo.ssid
                } catch (var7: Exception) {
                  ""
                }
                var3 = var8
                var8 = var4
                return@label60
              }
              var8 = var3
              var3 = var4
              if (var12 != 0) {
                return@label60
              }
              var9 = var1.resources
              var12 = R.string.MSG_SYSTEM_WF_DISCONNECTED
            }

            else -> {
              var8 = var3
              var3 = var4
              return@label60
            }
          }
          var8 = var9.getString(var12)
          var3 = var4
        }
        if (!var8.isEmpty()) {
          log(
            var1,
            String.format(
              Locale.US,
              "BRSystem.onReceive Sending intent to ServiceMain info=%s text2=%s",
              var8,
              var3
            )
          )
          val var11 = Intent(var1, ServiceMain::class.java)
          var11.putExtra(var1.resources.getString(R.string.MSG_WHAT), var8)
          var11.putExtra(var1.resources.getString(R.string.MSG_EXTRATEXT2), var3)
          var1.startService(var11)
        } else {
          log(var1, "BRSystem.onReceive Not sending intent")
        }
      }
    }
  }
}
