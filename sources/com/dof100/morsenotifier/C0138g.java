package com.dof100.morsenotifier;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.evernote.android.job.C0180c;
import com.evernote.android.job.C0200i;
import com.evernote.android.job.C0205m;
import com.evernote.android.job.p005a.p006a.C0167b;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.dof100.morsenotifier.g */
class C0138g extends C0180c {
    C0138g() {
    }

    /* renamed from: a */
    public static void m492a() {
        C0140i.m501a("MyJob.scheduleNextChime");
        C0200i a = C0200i.m734a();
        C0140i.m501a("MyJob.scheduleNextChime List of existing Job Requests: ");
        for (C0205m next : a.mo651b()) {
            Date date = new Date(next.mo697x());
            C0140i.m501a(String.format(Locale.US, "   MyJob.scheduleNextChime Job tag=%15s id=%d t=%s start=%d min", new Object[]{next.mo674d(), Integer.valueOf(next.mo673c()), date.toString(), Long.valueOf((next.mo675e() / 1000) / 60)}));
        }
        Calendar instance = Calendar.getInstance();
        int i = instance.get(11);
        int i2 = instance.get(12);
        int i3 = instance.get(13);
        int i4 = 60 - i3;
        int i5 = (60 - i2) - 1;
        int i6 = (i + 1) % 24;
        long millis = TimeUnit.SECONDS.toMillis((long) i4) + TimeUnit.MINUTES.toMillis((long) i5) + TimeUnit.HOURS.toMillis((long) 0);
        C0140i.m501a(String.format(Locale.US, "MyJob.scheduleNextChime  time=%02d:%02d:%02d   Next chime at %02d:%02d:%02d,  which is %02d:%02d:%02d from now", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i6), 0, 0, 0, Integer.valueOf(i5), Integer.valueOf(i4)}));
        C0167b bVar = new C0167b();
        bVar.mo558a("EXTRASWHAT", 1);
        bVar.mo558a("EXTRASHOUR", i6);
        bVar.mo558a("EXTRASMIN", 0);
        new C0205m.C0209b("TAG_CHIME").mo700a(millis).mo705b(true).mo702a(bVar).mo703a(false).mo704a().mo665D();
    }

    /* renamed from: a */
    public static void m493a(Context context) {
        if (!App.f283b) {
            C0140i.m501a("MyJob.scheduleNextReminder App!=pro exiting...");
            return;
        }
        C0140i.m501a("MyJob.scheduleNextReminder");
        C0200i a = C0200i.m734a();
        C0140i.m501a("MyJob.scheduleNextReminder List of existing job requests: ");
        for (C0205m next : a.mo651b()) {
            Date date = new Date(next.mo697x());
            C0140i.m501a(String.format(Locale.US, "   MyJob.scheduleNextReminder Job tag=%15s id=%d t=%s start=%d min", new Object[]{next.mo674d(), Integer.valueOf(next.mo673c()), date.toString(), Long.valueOf((next.mo675e() / 1000) / 60)}));
        }
        C0156p a2 = new C0157q(context).mo516a();
        if (a2 != null) {
            C0140i.m501a(String.format(Locale.US, "MyJob.scheduleNextReminder Next reminder %s", new Object[]{a2.mo515c()}));
            C0167b bVar = new C0167b();
            bVar.mo558a("EXTRASWHAT", 2);
            bVar.mo558a("EXTRASHOUR", a2.f531a);
            bVar.mo558a("EXTRASMIN", a2.f532b);
            bVar.mo559a("EXTRASTEXT", a2.mo510a());
            new C0205m.C0209b("TAG_REMINDER").mo700a(a2.f537g).mo705b(true).mo702a(bVar).mo703a(false).mo704a().mo665D();
        }
    }

    /* renamed from: b */
    public static void m494b() {
        C0140i.m501a("MyJob.clearAllJobs");
        C0200i a = C0200i.m734a();
        C0140i.m501a("MyJob.clearAllJobs List of existing job requests before clear: ");
        for (C0205m next : a.mo651b()) {
            Date date = new Date(next.mo697x());
            C0140i.m501a(String.format(Locale.US, "   MyJob.clearAllJobs Job tag=%15s id=%d t=%s start=%d min", new Object[]{next.mo674d(), Integer.valueOf(next.mo673c()), date.toString(), Long.valueOf((next.mo675e() / 1000) / 60)}));
        }
        a.mo654d();
        C0140i.m501a("MyJob.clearAllJobs List of existing job requests after clear: ");
        for (C0205m next2 : a.mo651b()) {
            Date date2 = new Date(next2.mo697x());
            C0140i.m501a(String.format(Locale.US, "   MyJob.clearAllJobs Job tag=%15s id=%d t=%s start=%d min", new Object[]{next2.mo674d(), Integer.valueOf(next2.mo673c()), date2.toString(), Long.valueOf((next2.mo675e() / 1000) / 60)}));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0180c.C0183b mo478a(C0180c.C0182a aVar) {
        C0140i.m501a("MyJob.onRunJob");
        C0167b d = aVar.mo605d();
        int b = d.mo560b("EXTRASHOUR", -1);
        int b2 = d.mo560b("EXTRASMIN", -1);
        int b3 = d.mo560b("EXTRASWHAT", -1);
        String b4 = d.mo561b("EXTRASTEXT", "");
        Context k = mo595k();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(k);
        boolean d2 = C0163v.m565d(mo595k(), defaultSharedPreferences, "pref_chime_enable", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        boolean d3 = C0163v.m565d(mo595k(), defaultSharedPreferences, "pref_reminders_enable", (String) null, App.f284c ? "_morsedef" : "_voicedef", "_def");
        C0140i.m501a(String.format(Locale.US, "MyJob.onRunJob  Time: %02d:%02d  What:%d", new Object[]{Integer.valueOf(b), Integer.valueOf(b2), Integer.valueOf(b3)}));
        if (b3 == 1 && d2) {
            C0140i.m501a("MyJob.onRunJob chime...");
            Intent intent = new Intent(mo595k(), ServiceMain.class);
            intent.putExtra(mo595k().getResources().getString(R.string.MSG_WHAT), mo595k().getResources().getString(R.string.MSG_CHIME_FIRE));
            intent.putExtra(mo595k().getResources().getString(R.string.MSG_EXTRAINT1), b);
            intent.putExtra(mo595k().getResources().getString(R.string.MSG_EXTRAINT2), b2);
            mo595k().startService(intent);
        } else if (b3 == 2 && d3) {
            C0140i.m501a("MyJob.onRunJob reminder...");
            Intent intent2 = new Intent(mo595k(), ServiceMain.class);
            intent2.putExtra(mo595k().getResources().getString(R.string.MSG_WHAT), mo595k().getResources().getString(R.string.MSG_REMINDERS_FIRE));
            intent2.putExtra(mo595k().getResources().getString(R.string.MSG_EXTRATEXT1), b4);
            intent2.putExtra(mo595k().getResources().getString(R.string.MSG_EXTRAINT1), b);
            intent2.putExtra(mo595k().getResources().getString(R.string.MSG_EXTRAINT2), b2);
            mo595k().startService(intent2);
        }
        try {
            return C0180c.C0183b.SUCCESS;
        } finally {
            m492a();
            m493a(k);
        }
    }
}
