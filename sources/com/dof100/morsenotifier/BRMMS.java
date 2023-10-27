package com.dof100.morsenotifier;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.Locale;

public class BRMMS extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String str;
        int i;
        C0140i.m500a(context, "BRMMS.onReceive");
        String action = intent.getAction();
        String type = intent.getType();
        try {
            if (action.equals("android.provider.Telephony.WAP_PUSH_RECEIVED") && type.equals("application/vnd.wap.mms-message")) {
                Bundle extras = intent.getExtras();
                String str2 = "";
                if (extras != null) {
                    try {
                        str = context.getResources().getString(R.string.MSG_SMS_NEWMMS);
                        try {
                            byte[] byteArray = extras.getByteArray("data");
                            String str3 = byteArray != null ? new String(byteArray) : "";
                            C0140i.m500a(context, "BRMMS.onReceive  buffer =" + str3);
                            int indexOf = str3.indexOf("/TYPE");
                            if (indexOf > 0 && indexOf - 15 > 0) {
                                String substring = str3.substring(i, indexOf);
                                int indexOf2 = substring.indexOf("+");
                                if (indexOf2 > 0) {
                                    substring = substring.substring(indexOf2);
                                }
                                str2 = substring;
                                C0140i.m500a(context, "BRMMS.onReceive  param_callerID =" + str2);
                            }
                            int i2 = extras.getInt("transactionId");
                            C0140i.m501a("BRMMS.onReceive  transactionId =" + i2);
                            int i3 = extras.getInt("pduType");
                            C0140i.m500a(context, "BRMMS.onReceive  pduType =" + i3);
                            byte[] byteArray2 = extras.getByteArray("header");
                            String str4 = byteArray2 != null ? new String(byteArray2) : "";
                            C0140i.m500a(context, "BRMMS.onReceive  header =" + str4);
                        } catch (Exception unused) {
                            C0140i.m500a(context, "BRMMS.onReceive ERROR: Exception");
                            C0140i.m500a(context, String.format(Locale.US, "BRMMS.onReceive Sending intent to ServiceMain info=%s callerID=%s text=%s", new Object[]{str, str2, ""}));
                            Intent intent2 = new Intent(context, ServiceMain.class);
                            intent2.putExtra(context.getResources().getString(R.string.MSG_WHAT), str);
                            intent2.putExtra(context.getResources().getString(R.string.MSG_EXTRATEXT1), str2);
                            intent2.putExtra(context.getResources().getString(R.string.MSG_EXTRATEXT2), "");
                            context.startService(intent2);
                        }
                    } catch (Exception unused2) {
                        str = "nothing";
                        C0140i.m500a(context, "BRMMS.onReceive ERROR: Exception");
                        C0140i.m500a(context, String.format(Locale.US, "BRMMS.onReceive Sending intent to ServiceMain info=%s callerID=%s text=%s", new Object[]{str, str2, ""}));
                        Intent intent22 = new Intent(context, ServiceMain.class);
                        intent22.putExtra(context.getResources().getString(R.string.MSG_WHAT), str);
                        intent22.putExtra(context.getResources().getString(R.string.MSG_EXTRATEXT1), str2);
                        intent22.putExtra(context.getResources().getString(R.string.MSG_EXTRATEXT2), "");
                        context.startService(intent22);
                    }
                } else {
                    str = "nothing";
                }
                C0140i.m500a(context, String.format(Locale.US, "BRMMS.onReceive Sending intent to ServiceMain info=%s callerID=%s text=%s", new Object[]{str, str2, ""}));
                Intent intent222 = new Intent(context, ServiceMain.class);
                intent222.putExtra(context.getResources().getString(R.string.MSG_WHAT), str);
                intent222.putExtra(context.getResources().getString(R.string.MSG_EXTRATEXT1), str2);
                intent222.putExtra(context.getResources().getString(R.string.MSG_EXTRATEXT2), "");
                context.startService(intent222);
            }
        } catch (Exception unused3) {
        }
    }
}
