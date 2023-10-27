package com.evernote.android.job.v14;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.evernote.android.job.C0202k;

public class PlatformAlarmReceiver extends BroadcastReceiver {
    /* renamed from: a */
    static Intent m884a(Context context, int i, boolean z, Bundle bundle) {
        Intent putExtra = new Intent(context, PlatformAlarmReceiver.class).putExtra("EXTRA_JOB_ID", i).putExtra("EXTRA_JOB_EXACT", z);
        if (bundle != null) {
            putExtra.putExtra("EXTRA_TRANSIENT_EXTRAS", bundle);
        }
        return putExtra;
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null && intent.hasExtra("EXTRA_JOB_ID") && intent.hasExtra("EXTRA_JOB_EXACT")) {
            int intExtra = intent.getIntExtra("EXTRA_JOB_ID", -1);
            Bundle bundleExtra = intent.getBundleExtra("EXTRA_TRANSIENT_EXTRAS");
            if (intent.getBooleanExtra("EXTRA_JOB_EXACT", false)) {
                C0202k.C0203a.m766a(context, PlatformAlarmServiceExact.m888a(context, intExtra, bundleExtra));
            } else {
                PlatformAlarmService.m885a(context, intExtra, bundleExtra);
            }
        }
    }
}
