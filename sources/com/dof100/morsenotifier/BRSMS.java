package com.dof100.morsenotifier;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Log;
import java.util.Locale;

public class BRSMS extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        SmsMessage smsMessage;
        C0140i.m500a(context, "BRSMS.onReceive");
        Bundle extras = intent.getExtras();
        String str = "";
        String str2 = "";
        String str3 = "nothing";
        if (extras != null) {
            try {
                String string = context.getResources().getString(R.string.MSG_SMS_NEWSMS);
                try {
                    Object[] objArr = (Object[]) extras.get("pdus");
                    if (objArr != null) {
                        String str4 = str2;
                        String str5 = str;
                        int i = 0;
                        while (i < objArr.length) {
                            try {
                                int i2 = i + 1;
                                C0140i.m501a(String.format(Locale.US, "BRSMS.onReceive obj=%d of %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(objArr.length)}));
                                if (Build.VERSION.SDK_INT >= 23) {
                                    smsMessage = SmsMessage.createFromPdu((byte[]) objArr[i], extras.getString("format"));
                                } else {
                                    smsMessage = SmsMessage.createFromPdu((byte[]) objArr[i]);
                                }
                                String displayOriginatingAddress = smsMessage.getDisplayOriginatingAddress();
                                String displayMessageBody = smsMessage.getDisplayMessageBody();
                                if (displayOriginatingAddress != null) {
                                    str4 = displayOriginatingAddress;
                                }
                                if (displayMessageBody != null) {
                                    str5 = displayMessageBody;
                                }
                                i = i2;
                            } catch (Exception e) {
                                e = e;
                                str = str5;
                                str3 = string;
                                str2 = str4;
                                Log.e("BRSMS", "BRSMS: Exception smsReceiver" + e);
                                C0140i.m500a(context, String.format(Locale.US, "BRSMS.onReceive Sending intent to ServiceMain info=%s callerID=%s text=%s", new Object[]{str3, str2, str}));
                                Intent intent2 = new Intent(context, ServiceMain.class);
                                intent2.putExtra(context.getResources().getString(R.string.MSG_WHAT), str3);
                                intent2.putExtra(context.getResources().getString(R.string.MSG_EXTRATEXT1), str2);
                                intent2.putExtra(context.getResources().getString(R.string.MSG_EXTRATEXT2), str);
                                context.startService(intent2);
                            }
                        }
                        str = str5;
                        str2 = str4;
                    } else {
                        C0140i.m500a(context, "BRSMS.onReceive pdusObj=null");
                    }
                    str3 = string;
                } catch (Exception e2) {
                    e = e2;
                    str3 = string;
                    Log.e("BRSMS", "BRSMS: Exception smsReceiver" + e);
                    C0140i.m500a(context, String.format(Locale.US, "BRSMS.onReceive Sending intent to ServiceMain info=%s callerID=%s text=%s", new Object[]{str3, str2, str}));
                    Intent intent22 = new Intent(context, ServiceMain.class);
                    intent22.putExtra(context.getResources().getString(R.string.MSG_WHAT), str3);
                    intent22.putExtra(context.getResources().getString(R.string.MSG_EXTRATEXT1), str2);
                    intent22.putExtra(context.getResources().getString(R.string.MSG_EXTRATEXT2), str);
                    context.startService(intent22);
                }
            } catch (Exception e3) {
                e = e3;
            }
        } else {
            C0140i.m500a(context, "BRSMS.onReceive bundle=null");
        }
        C0140i.m500a(context, String.format(Locale.US, "BRSMS.onReceive Sending intent to ServiceMain info=%s callerID=%s text=%s", new Object[]{str3, str2, str}));
        Intent intent222 = new Intent(context, ServiceMain.class);
        intent222.putExtra(context.getResources().getString(R.string.MSG_WHAT), str3);
        intent222.putExtra(context.getResources().getString(R.string.MSG_EXTRATEXT1), str2);
        intent222.putExtra(context.getResources().getString(R.string.MSG_EXTRATEXT2), str);
        context.startService(intent222);
    }
}
