package com.dof100.morsenotifier;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.preference.PreferenceManager;
import android.telephony.TelephonyManager;
import java.util.Locale;

public class BRCall extends BroadcastReceiver {
   public void onReceive(Context var1, Intent var2) {
      MyLog.log(var1, "BRCall.onReceive");
      String var3 = var2.getAction();
      if (var3 != null) {
         boolean var4;
         try {
            var4 = var3.equals("android.intent.action.PHONE_STATE");
         } catch (Exception var11) {
            return;
         }

         if (var4) {
            SharedPreferences var5 = PreferenceManager.getDefaultSharedPreferences(var1);
            String var6 = var5.getString("BRCall_lastState", TelephonyManager.EXTRA_STATE_IDLE);
            long var7 = var5.getLong("BRCall_lastTimeRinging", 0L);
            var3 = var2.getStringExtra("state");
            Editor var15 = var5.edit();
            var15.putString("BRCall_lastState", var3);
            var15.apply();
            if (TelephonyManager.EXTRA_STATE_IDLE.equals(var3)) {
               MyLog.log(var1, "BRCall.onReceive EXTRA_STATE_IDLE. Broadcasting finish");
               App.b(var1);
            } else if (TelephonyManager.EXTRA_STATE_OFFHOOK.equals(var3)) {
               MyLog.log(var1, "BRCall.onReceive EXTRA_STATE_OFFHOOK. Broadcasting finish");
               App.b(var1);
            } else if (!TelephonyManager.EXTRA_STATE_RINGING.equals(var3)) {
               MyLog.log(var1, "BRCall.onReceive EXTRA_STATE_???????. Broadcasting finish");
               App.b(var1);
            } else {
               StringBuilder var14 = new StringBuilder();
               var14.append("BRCall.onReceive EXTRA_STATE_RINGING lastState    = ");
               var14.append(var6);
               MyLog.log(var1, var14.toString());
               var4 = var2.hasExtra("incoming_number");
               var14 = new StringBuilder();
               var14.append("BRCall.onReceive EXTRA_STATE_RINGING hasCallerID  = ");
               var14.append(var4);
               MyLog.log(var1, var14.toString());
               if (VERSION.SDK_INT >= 28 && !var4) {
                  MyLog.log(var1, "BRCall.onReceive EXTRA_STATE_RINGING Android>=9 without hasCallerID (returning)");
               } else {
                  var3 = var2.getStringExtra("incoming_number");
                  StringBuilder var12 = new StringBuilder();
                  var12.append("BRCall.onReceive EXTRA_STATE_RINGING callerID     = ");
                  var12.append(var3);
                  MyLog.log(var1, var12.toString());
                  String var13 = var3;
                  if (var3 == null) {
                     var13 = "";
                  }

                  long var9 = System.currentTimeMillis();
                  var15.putLong("BRCall_lastTimeRinging", var9);
                  var15.apply();
                  var9 -= var7;
                  var14 = new StringBuilder();
                  var14.append("BRCall.onReceive EXTRA_STATE_RINGING dt           = ");
                  var14.append(var9);
                  MyLog.log(var1, var14.toString());
                  var7 = var9;
                  if (var9 < 0L) {
                     var7 = 2501L;
                     var14 = new StringBuilder();
                     var14.append("BRCall.onReceive EXTRA_STATE_RINGING dt          -> ");
                     var14.append(2501L);
                     MyLog.log(var1, var14.toString());
                  }

                  if (var7 < 2500L) {
                     MyLog.log(var1, "BRCall.onReceive EXTRA_STATE_RINGING dt          < MINDTBETWEENRINGS (return)");
                  } else {
                     if (TelephonyManager.EXTRA_STATE_RINGING.equals(var6)) {
                        MyLog.log(var1, "BRCall.onReceive oldstate=RINGING (ERROR)");
                        if (var7 < 5000L) {
                           MyLog.log(var1, "BRCall.onReceive oldstate=RINGING (ERROR), dt<DTRESETRINGS (return)");
                           return;
                        }

                        MyLog.log(var1, "BRCall.onReceive oldstate=RINGING (ERROR), dt>DTRESETRINGS, proceed as normal");
                     }

                     MyLog.log(var1, String.format(Locale.US, "BRCall.onReceive Sending intent to ServiceMain info=%s text1=%s", var1.getResources().getString(2131492868), var13));
                     Intent var16 = new Intent(var1, ServiceMain.class);
                     var16.putExtra(var1.getResources().getString(2131492900), var1.getResources().getString(2131492868));
                     var16.putExtra(var1.getResources().getString(2131492875), var13);
                     var1.startService(var16);
                  }
               }
            }
         }
      }
   }
}
