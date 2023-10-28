package com.dof100.morsenotifier;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Build.VERSION;
import android.telephony.SmsMessage;
import android.util.Log;
import java.util.Locale;

public class BRSMS extends BroadcastReceiver {
   public void onReceive(Context var1, Intent var2) {
      String var4;
      String var5;
      String var19;
      label97: {
         String var6;
         Exception var20;
         label96: {
            i.a(var1, "BRSMS.onReceive");
            Bundle var3 = var2.getExtras();
            var4 = "";
            var19 = "";
            var5 = "nothing";
            Exception var10000;
            boolean var10001;
            if (var3 != null) {
               label99: {
                  try {
                     var6 = var1.getResources().getString(2131492889);
                  } catch (Exception var18) {
                     var10000 = var18;
                     var10001 = false;
                     break label99;
                  }

                  label87: {
                     String var10;
                     label100: {
                        Object[] var7;
                        try {
                           var7 = (Object[])var3.get("pdus");
                        } catch (Exception var16) {
                           var10000 = var16;
                           var10001 = false;
                           break label100;
                        }

                        if (var7 != null) {
                           var19 = "";
                           var4 = "";
                           int var8 = 0;

                           while(true) {
                              int var9;
                              label76: {
                                 label103: {
                                    Locale var21;
                                    try {
                                       if (var8 >= var7.length) {
                                          break label87;
                                       }

                                       var21 = Locale.US;
                                    } catch (Exception var14) {
                                       var10000 = var14;
                                       var10001 = false;
                                       break label103;
                                    }

                                    var9 = var8 + 1;

                                    SmsMessage var22;
                                    label69: {
                                       try {
                                          i.a(String.format(var21, "BRSMS.onReceive obj=%d of %d", var9, var7.length));
                                          if (VERSION.SDK_INT >= 23) {
                                             var5 = var3.getString("format");
                                             var22 = SmsMessage.createFromPdu((byte[])var7[var8], var5);
                                             break label69;
                                          }
                                       } catch (Exception var13) {
                                          var10000 = var13;
                                          var10001 = false;
                                          break label103;
                                       }

                                       try {
                                          var22 = SmsMessage.createFromPdu((byte[])var7[var8]);
                                       } catch (Exception var12) {
                                          var10000 = var12;
                                          var10001 = false;
                                          break label103;
                                       }
                                    }

                                    try {
                                       var10 = var22.getDisplayOriginatingAddress();
                                       var5 = var22.getDisplayMessageBody();
                                       break label76;
                                    } catch (Exception var11) {
                                       var10000 = var11;
                                       var10001 = false;
                                    }
                                 }

                                 var20 = var10000;
                                 var10 = var6;
                                 var6 = var19;
                                 var19 = var10;
                                 break label96;
                              }

                              if (var10 != null) {
                                 var19 = var10;
                              }

                              if (var5 != null) {
                                 var4 = var5;
                              }

                              var8 = var9;
                           }
                        }

                        try {
                           i.a(var1, "BRSMS.onReceive pdusObj=null");
                           break label87;
                        } catch (Exception var15) {
                           var10000 = var15;
                           var10001 = false;
                        }
                     }

                     var20 = var10000;
                     var10 = var6;
                     var6 = var19;
                     var19 = var10;
                     break label96;
                  }

                  var5 = var6;
                  break label97;
               }
            } else {
               try {
                  i.a(var1, "BRSMS.onReceive bundle=null");
                  break label97;
               } catch (Exception var17) {
                  var10000 = var17;
                  var10001 = false;
               }
            }

            Exception var24 = var10000;
            var6 = var19;
            var19 = var5;
            var20 = var24;
         }

         StringBuilder var25 = new StringBuilder();
         var25.append("BRSMS: Exception smsReceiver");
         var25.append(var20);
         Log.e("BRSMS", var25.toString());
         var5 = var19;
         var19 = var6;
      }

      i.a(var1, String.format(Locale.US, "BRSMS.onReceive Sending intent to ServiceMain info=%s callerID=%s text=%s", var5, var19, var4));
      Intent var23 = new Intent(var1, ServiceMain.class);
      var23.putExtra(var1.getResources().getString(2131492900), var5);
      var23.putExtra(var1.getResources().getString(2131492875), var19);
      var23.putExtra(var1.getResources().getString(2131492876), var4);
      var1.startService(var23);
   }
}
