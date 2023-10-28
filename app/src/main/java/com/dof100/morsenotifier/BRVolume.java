package com.dof100.morsenotifier;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import java.util.Locale;

public class BRVolume extends BroadcastReceiver {
   public void onReceive(Context var1, Intent var2) {
      String var3 = var2.getAction();

      boolean var4;
      try {
         var4 = var3.equals("android.media.VOLUME_CHANGED_ACTION");
      } catch (Exception var21) {
         return;
      }

      if (var4) {
         int var5 = var2.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1);
         int var6 = var2.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", -1);
         String var22;
         if (var5 == 2) {
            var22 = "BRVolume.onReceive ring volume (maybe samsung, ignoring)";
         } else {
            if (var5 >= 0 && var5 <= 9 && var6 != -1) {
               SharedPreferences var23 = PreferenceManager.getDefaultSharedPreferences(var1);
               if (App.c) {
                  var22 = "_morsedef";
               } else {
                  var22 = "_voicedef";
               }

               int var7 = v.c(var1, var23, "pref_morse_volumedownstop", (String)null, var22, "_def");
               int[] var8 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

               StringBuilder var24;
               for(int var9 = 0; var9 < 10; ++var9) {
                  var24 = new StringBuilder();
                  var24.append("BRVolume_LastVol");
                  var24.append(var9);
                  var8[var9] = var23.getInt(var24.toString(), -1);
               }

               long var10;
               long var12;
               long var14;
               Editor var16;
               long var17;
               boolean var19;
               boolean var26;
               label94: {
                  label93: {
                     var10 = var23.getLong("BRVolume_LastTimeVolUp", 0L);
                     var12 = var23.getLong("BRVolume_LastTimeVolDown", 0L);
                     var14 = var23.getLong("BRVolume_LastTimeBroadcast", 0L);
                     var16 = var23.edit();
                     var17 = System.currentTimeMillis();
                     if (var8[var5] != -1) {
                        if (var8[var5] < var6) {
                           var16.putLong("BRVolume_LastTimeVolUp", var17);
                           var26 = false;
                           var19 = true;
                           break label94;
                        }

                        if (var8[var5] > var6) {
                           var16.putLong("BRVolume_LastTimeVolDown", var17);
                           var26 = true;
                           break label93;
                        }
                     }

                     var26 = false;
                  }

                  var19 = false;
               }

               boolean var20;
               label85: {
                  label84: {
                     var24 = new StringBuilder();
                     var24.append("BRVolume_LastVol");
                     var24.append(var5);
                     var16.putInt(var24.toString(), var6);
                     switch(var7) {
                     case 1:
                     default:
                        break;
                     case 2:
                        if (var26) {
                           break label84;
                        }
                        break;
                     case 3:
                        break label84;
                     case 4:
                        if (var19 && var17 - var12 < 2000L || var26 && var17 - var10 < 2000L) {
                           break label84;
                        }
                     }

                     var20 = false;
                     break label85;
                  }

                  var20 = true;
               }

               var3 = "";
               if (var26) {
                  var24 = new StringBuilder();
                  var24.append("");
                  var24.append(" DOWN");
                  var3 = var24.toString();
               }

               var22 = var3;
               if (var19) {
                  var24 = new StringBuilder();
                  var24.append(var3);
                  var24.append(" UP  ");
                  var22 = var24.toString();
               }

               label66: {
                  var3 = var22;
                  if (var20) {
                     StringBuilder var25 = new StringBuilder();
                     var25.append(var22);
                     var25.append(" OK");
                     var22 = var25.toString();
                     var3 = var22;
                     if (var17 - var14 > 500L) {
                        var16.putLong("BRVolume_LastTimeBroadcast", var17);
                        var25 = new StringBuilder();
                        var25.append(var22);
                        var25.append(" Broadcasting Finish");
                        var3 = var25.toString();
                        var26 = true;
                        break label66;
                     }
                  }

                  var26 = false;
               }

               var16.apply();
               i.a(var1, String.format(Locale.US, "BRVolume.onReceive StreamType=%02d Vol:%02d old = %02d %02d %02d %02d %02d %02d %02d %02d %02d %02d (pref=%d) %s", var5, var6, var8[0], var8[1], var8[2], var8[3], var8[4], var8[5], var8[6], var8[7], var8[8], var8[9], var7, var3));
               if (var26) {
                  App.b(var1);
               }

               return;
            }

            var22 = String.format(Locale.US, "BRVolume.onReceive ERROR Stream type =%d  Volume: %d", var5, var6);
         }

         i.a(var1, var22);
      }
   }
}
