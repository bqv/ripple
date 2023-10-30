package com.dof100.morsenotifier;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.Locale;

public class BRMMS extends BroadcastReceiver {
   public void onReceive(Context var1, Intent var2) {
      MyLog.log(var1, "BRMMS.onReceive");
      String var3 = var2.getAction();
      String var4 = var2.getType();

      boolean var5;
      try {
         if (!var3.equals("android.provider.Telephony.WAP_PUSH_RECEIVED")) {
            return;
         }

         var5 = var4.equals("application/vnd.wap.mms-message");
      } catch (Exception var49) {
         return;
      }

      if (var5) {
         Bundle var6 = var2.getExtras();
         var3 = "";
         String var50;
         if (var6 != null) {
            label304: {
               String var7;
               label303: {
                  label318: {
                     try {
                        var7 = var1.getResources().getString(R.string.MSG_SMS_NEWMMS);
                     } catch (Exception var48) {
                        var50 = "nothing";
                        break label318;
                     }

                     var50 = var3;

                     label319: {
                        boolean var10001;
                        byte[] var52;
                        try {
                           var52 = var6.getByteArray("data");
                        } catch (Exception var47) {
                           var10001 = false;
                           break label319;
                        }

                        String var8;
                        if (var52 != null) {
                           var50 = var3;

                           try {
                              var8 = new String();
                           } catch (Exception var46) {
                              var10001 = false;
                              break label319;
                           }

                           var50 = var3;

                           try {
                              var8 = new String(var52);
                           } catch (Exception var45) {
                              var10001 = false;
                              break label319;
                           }
                        } else {
                           var8 = "";
                        }

                        var50 = var3;

                        StringBuilder var53;
                        try {
                           var53 = new StringBuilder();
                        } catch (Exception var44) {
                           var10001 = false;
                           break label319;
                        }

                        var50 = var3;

                        try {
                           var53.append("BRMMS.onReceive  buffer =");
                        } catch (Exception var42) {
                           var10001 = false;
                           break label319;
                        }

                        var50 = var3;

                        try {
                           var53.append(var8);
                        } catch (Exception var41) {
                           var10001 = false;
                           break label319;
                        }

                        var50 = var3;

                        try {
                           MyLog.log(var1, var53.toString());
                        } catch (Exception var40) {
                           var10001 = false;
                           break label319;
                        }

                        var50 = var3;

                        int var9;
                        try {
                           var9 = var8.indexOf("/TYPE");
                        } catch (Exception var39) {
                           var10001 = false;
                           break label319;
                        }

                        var4 = var3;
                        StringBuilder var51;
                        if (var9 > 0) {
                           int var10 = var9 - 15;
                           var4 = var3;
                           if (var10 > 0) {
                              var50 = var3;

                              try {
                                 var8 = var8.substring(var10, var9);
                              } catch (Exception var38) {
                                 var10001 = false;
                                 break label319;
                              }

                              var50 = var3;

                              try {
                                 var9 = var8.indexOf("+");
                              } catch (Exception var37) {
                                 var10001 = false;
                                 break label319;
                              }

                              var4 = var8;
                              if (var9 > 0) {
                                 var50 = var3;

                                 try {
                                    var4 = var8.substring(var9);
                                 } catch (Exception var36) {
                                    var10001 = false;
                                    break label319;
                                 }
                              }

                              var50 = var4;

                              try {
                                 var51 = new StringBuilder();
                              } catch (Exception var35) {
                                 var10001 = false;
                                 break label319;
                              }

                              var50 = var4;

                              try {
                                 var51.append("BRMMS.onReceive  param_callerID =");
                              } catch (Exception var33) {
                                 var10001 = false;
                                 break label319;
                              }

                              var50 = var4;

                              try {
                                 var51.append(var4);
                              } catch (Exception var32) {
                                 var10001 = false;
                                 break label319;
                              }

                              var50 = var4;

                              try {
                                 MyLog.log(var1, var51.toString());
                              } catch (Exception var31) {
                                 var10001 = false;
                                 break label319;
                              }
                           }
                        }

                        var50 = var4;

                        try {
                           var9 = var6.getInt("transactionId");
                        } catch (Exception var30) {
                           var10001 = false;
                           break label319;
                        }

                        var50 = var4;

                        try {
                           var51 = new StringBuilder();
                        } catch (Exception var29) {
                           var10001 = false;
                           break label319;
                        }

                        var50 = var4;

                        try {
                           var51.append("BRMMS.onReceive  transactionId =");
                        } catch (Exception var27) {
                           var10001 = false;
                           break label319;
                        }

                        var50 = var4;

                        try {
                           var51.append(var9);
                        } catch (Exception var26) {
                           var10001 = false;
                           break label319;
                        }

                        var50 = var4;

                        try {
                           MyLog.log(var51.toString());
                        } catch (Exception var25) {
                           var10001 = false;
                           break label319;
                        }

                        var50 = var4;

                        try {
                           var9 = var6.getInt("pduType");
                        } catch (Exception var24) {
                           var10001 = false;
                           break label319;
                        }

                        var50 = var4;

                        try {
                           var51 = new StringBuilder();
                        } catch (Exception var23) {
                           var10001 = false;
                           break label319;
                        }

                        var50 = var4;

                        try {
                           var51.append("BRMMS.onReceive  pduType =");
                        } catch (Exception var21) {
                           var10001 = false;
                           break label319;
                        }

                        var50 = var4;

                        try {
                           var51.append(var9);
                        } catch (Exception var20) {
                           var10001 = false;
                           break label319;
                        }

                        var50 = var4;

                        try {
                           MyLog.log(var1, var51.toString());
                        } catch (Exception var19) {
                           var10001 = false;
                           break label319;
                        }

                        var50 = var4;

                        byte[] var55;
                        try {
                           var55 = var6.getByteArray("header");
                        } catch (Exception var18) {
                           var10001 = false;
                           break label319;
                        }

                        if (var55 != null) {
                           var50 = var4;

                           try {
                              var3 = new String();
                           } catch (Exception var17) {
                              var10001 = false;
                              break label319;
                           }

                           var50 = var4;

                           try {
                              var3 = new String(var55);
                           } catch (Exception var16) {
                              var10001 = false;
                              break label319;
                           }
                        } else {
                           var3 = "";
                        }

                        var50 = var4;

                        StringBuilder var56;
                        try {
                           var56 = new StringBuilder();
                        } catch (Exception var15) {
                           var10001 = false;
                           break label319;
                        }

                        var50 = var4;

                        try {
                           var56.append("BRMMS.onReceive  header =");
                        } catch (Exception var13) {
                           var10001 = false;
                           break label319;
                        }

                        var50 = var4;

                        try {
                           var56.append(var3);
                        } catch (Exception var12) {
                           var10001 = false;
                           break label319;
                        }

                        var50 = var4;

                        try {
                           MyLog.log(var1, var56.toString());
                           break label303;
                        } catch (Exception var11) {
                           var10001 = false;
                        }
                     }

                     var3 = var50;
                     var50 = var7;
                  }

                  MyLog.log(var1, "BRMMS.onReceive ERROR: Exception");
                  break label304;
               }

               var3 = var4;
               var50 = var7;
            }
         } else {
            var50 = "nothing";
         }

         MyLog.log(var1, String.format(Locale.US, "BRMMS.onReceive Sending intent to ServiceMain info=%s callerID=%s text=%s", var50, var3, ""));
         Intent var54 = new Intent(var1, ServiceMain.class);
         var54.putExtra(var1.getResources().getString(R.string.MSG_WHAT), var50);
         var54.putExtra(var1.getResources().getString(R.string.MSG_EXTRATEXT1), var3);
         var54.putExtra(var1.getResources().getString(R.string.MSG_EXTRATEXT2), "");
         var1.startService(var54);
      }
   }
}
