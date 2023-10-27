package com.evernote.android.job;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.evernote.android.job.gcm.C0195a;
import com.evernote.android.job.p007b.C0179a;
import com.evernote.android.job.p008c.C0184a;
import com.evernote.android.job.p009d.C0188a;
import com.evernote.android.job.v14.C0219a;
import com.evernote.android.job.v14.PlatformAlarmReceiver;
import com.evernote.android.job.v14.PlatformAlarmService;
import com.evernote.android.job.v14.PlatformAlarmServiceExact;
import com.evernote.android.job.v21.C0221a;
import com.evernote.android.job.v21.PlatformJobService;
import java.util.List;

/* renamed from: com.evernote.android.job.d */
public enum C0186d {
    V_26(true, false, true),
    V_24(true, false, false),
    V_21(true, true, false),
    V_19(true, true, true),
    V_14(false, true, true),
    GCM(true, false, true);
    

    /* renamed from: g */
    private volatile C0202k f637g;

    /* renamed from: h */
    private final boolean f638h;

    /* renamed from: i */
    private final boolean f639i;

    /* renamed from: j */
    private final boolean f640j;

    private C0186d(boolean z, boolean z2, boolean z3) {
        this.f638h = z;
        this.f639i = z2;
        this.f640j = z3;
    }

    /* renamed from: a */
    private boolean m682a(Context context, Class<? extends Service> cls) {
        try {
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent(context, cls), 0);
            return queryIntentServices != null && !queryIntentServices.isEmpty();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m683a(Context context, Class<? extends Service> cls, String str) {
        try {
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent(context, cls), 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                return false;
            }
            for (ResolveInfo next : queryIntentServices) {
                if (next.serviceInfo != null && str.equals(next.serviceInfo.permission)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private boolean m684b(Context context, Class<? extends BroadcastReceiver> cls) {
        try {
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(new Intent(context, cls), 0);
            return queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static C0186d m685c(Context context) {
        if (V_26.mo614a(context) && C0190e.m697a(V_26)) {
            return V_26;
        }
        if (V_24.mo614a(context) && C0190e.m697a(V_24)) {
            return V_24;
        }
        if (V_21.mo614a(context) && C0190e.m697a(V_21)) {
            return V_21;
        }
        if (GCM.mo614a(context) && C0190e.m697a(GCM)) {
            return GCM;
        }
        if (V_19.mo614a(context) && C0190e.m697a(V_19)) {
            return V_19;
        }
        if (C0190e.m697a(V_14)) {
            return V_14;
        }
        throw new IllegalStateException("All supported APIs are disabled");
    }

    /* renamed from: d */
    private C0202k m686d(Context context) {
        switch (this) {
            case V_26:
                return new C0188a(context);
            case V_24:
                return new C0184a(context);
            case V_21:
                return new C0221a(context);
            case V_19:
                return new C0179a(context);
            case V_14:
                return new C0219a(context);
            case GCM:
                return new C0195a(context);
            default:
                throw new IllegalStateException("not implemented");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo613a() {
        return this.f638h;
    }

    /* renamed from: a */
    public boolean mo614a(Context context) {
        switch (this) {
            case V_26:
                return Build.VERSION.SDK_INT >= 26 && m682a(context, PlatformJobService.class);
            case V_24:
                return Build.VERSION.SDK_INT >= 24 && m683a(context, PlatformJobService.class, "android.permission.BIND_JOB_SERVICE");
            case V_21:
                return Build.VERSION.SDK_INT >= 21 && m683a(context, PlatformJobService.class, "android.permission.BIND_JOB_SERVICE");
            case V_19:
                return Build.VERSION.SDK_INT >= 19 && m682a(context, PlatformAlarmService.class) && m684b(context, PlatformAlarmReceiver.class);
            case V_14:
                if (!C0190e.m698b()) {
                    return m682a(context, PlatformAlarmService.class) && m682a(context, PlatformAlarmServiceExact.class) && m684b(context, PlatformAlarmReceiver.class);
                }
                return true;
            case GCM:
                return C0178b.m648a(context);
            default:
                throw new IllegalStateException("not implemented");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized C0202k mo615b(Context context) {
        if (this.f637g == null) {
            this.f637g = m686d(context);
        }
        return this.f637g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo616b() {
        return this.f639i;
    }

    /* renamed from: c */
    public synchronized void mo617c() {
        this.f637g = null;
    }
}
