package com.dof100.morsenotifier;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.telephony.TelephonyManager;
import java.util.Locale;

public class BRCall extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            try {
                if (action.equals("android.intent.action.PHONE_STATE")) {
                    String stringExtra = intent.getStringExtra("state");
                    long currentTimeMillis = System.currentTimeMillis();
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                    String string = defaultSharedPreferences.getString("BRCall_lastState", TelephonyManager.EXTRA_STATE_IDLE);
                    long j = defaultSharedPreferences.getLong("BRCall_lastTimeRinging", 0);
                    SharedPreferences.Editor edit = defaultSharedPreferences.edit();
                    edit.putString("BRCall_lastState", stringExtra);
                    if (TelephonyManager.EXTRA_STATE_RINGING.equals(stringExtra)) {
                        edit.putLong("BRCall_lastTimeRinging", currentTimeMillis);
                    }
                    edit.apply();
                    C0140i.m500a(context, "BRCall.onReceive state =" + string + " -> " + stringExtra);
                    if (TelephonyManager.EXTRA_STATE_RINGING.equals(stringExtra)) {
                        String string2 = context.getResources().getString(R.string.MSG_CALL_RINGING);
                        long j2 = currentTimeMillis - j;
                        if (j2 < 0) {
                            j2 = 3001;
                        }
                        C0140i.m500a(context, "BRCall.onReceive state=EXTRA_STATE_RINGING dt=" + j2);
                        if (j2 < 3000) {
                            C0140i.m500a(context, "BRCall.onReceive dt<MINDT");
                            return;
                        }
                        if (TelephonyManager.EXTRA_STATE_RINGING.equals(string)) {
                            C0140i.m500a(context, "BRCall.onReceive oldstate=RINGING (ERROR)");
                            if (j2 >= 30000) {
                                C0140i.m500a(context, "BRCall.onReceive oldstate=RINGING (ERROR), dt>DTRESETRINGS, proceed as normal");
                            } else {
                                return;
                            }
                        }
                        String stringExtra2 = intent.getStringExtra("incoming_number");
                        if (stringExtra2 == null) {
                            stringExtra2 = "";
                        }
                        C0140i.m500a(context, String.format(Locale.US, "BRCall.onReceive Sending intent to ServiceMain info=%s text1=%s", new Object[]{string2, stringExtra2}));
                        Intent intent2 = new Intent(context, ServiceMain.class);
                        intent2.putExtra(context.getResources().getString(R.string.MSG_WHAT), string2);
                        intent2.putExtra(context.getResources().getString(R.string.MSG_EXTRATEXT1), stringExtra2);
                        context.startService(intent2);
                        return;
                    }
                    C0140i.m500a(context, TelephonyManager.EXTRA_STATE_IDLE.equals(stringExtra) ? "BRCall.onReceive state=EXTRA_STATE_IDLE. Broadcasting finish" : TelephonyManager.EXTRA_STATE_OFFHOOK.equals(stringExtra) ? "BRCall.onReceive state=EXTRA_STATE_OFFHOOK. Broadcasting finish" : "BRCall.onReceive state=unknown (ERROR?). Broadcasting finish");
                    App.m430b(context);
                }
            } catch (Exception unused) {
            }
        }
    }
}
