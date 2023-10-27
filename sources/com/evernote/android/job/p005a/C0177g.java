package com.evernote.android.job.p005a;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: com.evernote.android.job.a.g */
public final class C0177g {

    /* renamed from: a */
    private static final ThreadLocal<SimpleDateFormat> f605a = new ThreadLocal<>();

    /* renamed from: b */
    private static final long f606b = TimeUnit.DAYS.toMillis(1);

    /* renamed from: c */
    private static final C0174d f607c = new C0174d("JobUtil");

    /* renamed from: a */
    public static String m643a(long j) {
        SimpleDateFormat simpleDateFormat = f605a.get();
        if (simpleDateFormat == null) {
            simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.US);
            f605a.set(simpleDateFormat);
        }
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String format = simpleDateFormat.format(new Date(j));
        long j2 = j / f606b;
        if (j2 == 1) {
            return format + " (+1 day)";
        } else if (j2 <= 1) {
            return format;
        } else {
            return format + " (+" + j2 + " days)";
        }
    }

    /* renamed from: a */
    public static boolean m644a(Context context) {
        return m645a(context, "android.permission.RECEIVE_BOOT_COMPLETED", 0);
    }

    /* renamed from: a */
    private static boolean m645a(Context context, String str, int i) {
        try {
            return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
        } catch (Exception e) {
            f607c.mo569a((Throwable) e);
            return i < 1 && m645a(context.getApplicationContext(), str, i + 1);
        }
    }

    /* renamed from: b */
    public static boolean m646b(Context context) {
        return m645a(context, "android.permission.WAKE_LOCK", 0);
    }
}
