package com.dof100.morsenotifier;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.preference.PreferenceManager;
import java.util.Locale;

public class BRSystem extends BroadcastReceiver {
   private int a(Context var1, NetworkInfo var2) {
      byte var3 = -2;
      if (var2 == null) {
         MyLog.log(var1, "BRSystem.wifiStateChanged netinfo=null");
         return -2;
      } else {
         long var4 = System.currentTimeMillis();
         SharedPreferences var6 = PreferenceManager.getDefaultSharedPreferences(var1);
         int var7 = var6.getInt("BRSystem_LastWiFiStatus", -2);
         long var8 = var6.getLong("BRSystem_LastTimeWiFiConnected", 0L);
         long var10 = var6.getLong("BRSystem_LastTimeWiFiDisconnected", 0L);
         long var12;
         if (var2.isConnected()) {
            MyLog.log(var1, "BRSystem.wifiStateChanged isConnected");
            var12 = var4 - var8;
            var8 = var12;
            if (var12 < 0L) {
               var8 = 5001L;
            }

            if (var7 == 1) {
               MyLog.log(var1, "BRSystem.wifiStateChanged already connected");
               var3 = -3;
            } else {
               if (var8 < 5000L) {
                  MyLog.log(var1, "BRSystem.wifiStateChanged dt since last connect < MINDT");
                  var3 = -3;
               } else {
                  MyLog.log(var1, "BRSystem.wifiStateChanged connected");
                  var3 = 1;
               }

               var7 = 1;
            }
         } else if (var2.isConnectedOrConnecting()) {
            MyLog.log(var1, "BRSystem.onReceive wifiStateChanged isConnectedOrConnecting");
            var4 = var8;
         } else {
            MyLog.log(var1, "BRSystem.wifiStateChanged disConnected");
            var12 = var4 - var10;
            var10 = var12;
            if (var12 < 0L) {
               var10 = 5001L;
            }

            if (var7 == 0) {
               MyLog.log(var1, "BRSystem.wifiStateChanged already disconnected");
               var3 = -3;
               var10 = var4;
               var4 = var8;
            } else {
               if (var10 < 5000L) {
                  MyLog.log(var1, "BRSystem.wifiStateChanged dt since last disconnect < MINDT");
                  var3 = -3;
               } else {
                  MyLog.log(var1, "BRSystem.onReceive wifiStateChanged disconnected");
                  var3 = 0;
               }

               var7 = 0;
               var10 = var4;
               var4 = var8;
            }
         }

         Editor var14 = var6.edit();
         var14.putInt("BRSystem_LastWiFiStatus", var7);
         var14.putLong("BRSystem_LastTimeWiFiConnected", var4);
         var14.putLong("BRSystem_LastTimeWiFiDisconnected", var10);
         var14.apply();
         return var3;
      }
   }

   public void onReceive(Context var1, Intent var2) {
      MyLog.log(var1, "BRSystem.onReceive");
      String var3 = "";
      String var4 = "";
      String var5 = var2.getAction();
      if (var5 != null) {
         if (var5.equals("android.intent.action.BOOT_COMPLETED")) {
            var3 = var1.getResources().getString(R.string.MSG_SYSTEM_BOOT);
            var2 = new Intent(var1, ServiceMain.class);
            var2.putExtra(var1.getResources().getString(R.string.MSG_WHAT), var3);
            var2.putExtra(var1.getResources().getString(R.string.MSG_EXTRATEXT2), "");
            var1.startService(var2);
         } else {
            byte var6 = -1;
            switch(var5.hashCode()) {
            case -1886648615:
               if (var5.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                  var6 = 1;
               }
               break;
            case -1738947874:
               if (var5.equals("android.intent.action.ACTION_BATTERY_LOW")) {
                  var6 = 2;
               }
               break;
            case -343630553:
               if (var5.equals("android.net.wifi.STATE_CHANGE")) {
                  var6 = 4;
               }
               break;
            case 498094322:
               if (var5.equals("android.intent.action.ACTION_BATTERY_OK")) {
                  var6 = 3;
               }
               break;
            case 1019184907:
               if (var5.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                  var6 = 0;
               }
            }

            String var8;
            label60: {
               Resources var9;
               int var12;
               switch(var6) {
               case 0:
                  var9 = var1.getResources();
                  var12 = R.string.MSG_SYSTEM_POWER_CONNECTED;
                  break;
               case 1:
                  var9 = var1.getResources();
                  var12 = R.string.MSG_SYSTEM_POWER_DISCONNECTED;
                  break;
               case 2:
                  var9 = var1.getResources();
                  var12 = R.string.MSG_SYSTEM_BATTERY_LOW;
                  break;
               case 3:
                  var9 = var1.getResources();
                  var12 = R.string.MSG_SYSTEM_BATTERY_OK;
                  break;
               case 4:
                  var12 = this.a(var1, (NetworkInfo)var2.getParcelableExtra("networkInfo"));
                  if (var12 == 1) {
                     var4 = var1.getResources().getString(R.string.MSG_SYSTEM_WF_CONNECTED);
                     WifiManager var10 = (WifiManager)var1.getApplicationContext().getSystemService("wifi");

                     try {
                        var8 = var10.getConnectionInfo().getSSID();
                     } catch (Exception var7) {
                        var8 = "";
                     }

                     var3 = var8;
                     var8 = var4;
                     break label60;
                  }

                  var8 = var3;
                  var3 = var4;
                  if (var12 != 0) {
                     break label60;
                  }

                  var9 = var1.getResources();
                  var12 = R.string.MSG_SYSTEM_WF_DISCONNECTED;
                  break;
               default:
                  var8 = var3;
                  var3 = var4;
                  break label60;
               }

               var8 = var9.getString(var12);
               var3 = var4;
            }

            if (!var8.isEmpty()) {
               MyLog.log(var1, String.format(Locale.US, "BRSystem.onReceive Sending intent to ServiceMain info=%s text2=%s", var8, var3));
               Intent var11 = new Intent(var1, ServiceMain.class);
               var11.putExtra(var1.getResources().getString(R.string.MSG_WHAT), var8);
               var11.putExtra(var1.getResources().getString(R.string.MSG_EXTRATEXT2), var3);
               var1.startService(var11);
            } else {
               MyLog.log(var1, "BRSystem.onReceive Not sending intent");
            }
         }
      }
   }
}
