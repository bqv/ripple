package com.evernote.android.job.p007b;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import com.evernote.android.job.C0202k;
import com.evernote.android.job.C0205m;
import com.evernote.android.job.p005a.C0177g;
import com.evernote.android.job.v14.C0219a;

@TargetApi(19)
/* renamed from: com.evernote.android.job.b.a */
public class C0179a extends C0219a {
    public C0179a(Context context) {
        super(context, "JobProxy19");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo578a(C0205m mVar, AlarmManager alarmManager, PendingIntent pendingIntent) {
        alarmManager.setWindow(1, System.currentTimeMillis() + C0202k.C0203a.m764a(mVar), C0202k.C0203a.m771b(mVar) - C0202k.C0203a.m764a(mVar), pendingIntent);
        this.f748b.mo572b("Schedule alarm, %s, start %s, end %s", mVar, C0177g.m643a(C0202k.C0203a.m764a(mVar)), C0177g.m643a(C0202k.C0203a.m771b(mVar)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo579c(C0205m mVar, AlarmManager alarmManager, PendingIntent pendingIntent) {
        alarmManager.setWindow(1, System.currentTimeMillis() + C0202k.C0203a.m773d(mVar), C0202k.C0203a.m774e(mVar) - C0202k.C0203a.m773d(mVar), pendingIntent);
        this.f748b.mo572b("Scheduled repeating alarm (flex support), %s, start %s, end %s, flex %s", mVar, C0177g.m643a(C0202k.C0203a.m773d(mVar)), C0177g.m643a(C0202k.C0203a.m774e(mVar)), C0177g.m643a(mVar.mo683k()));
    }
}
