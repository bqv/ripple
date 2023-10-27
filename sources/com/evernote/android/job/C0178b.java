package com.evernote.android.job;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.evernote.android.job.gcm.C0195a;
import com.evernote.android.job.gcm.PlatformGcmService;
import com.evernote.android.job.p005a.C0174d;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.List;

/* renamed from: com.evernote.android.job.b */
final class C0178b {

    /* renamed from: a */
    private static final C0174d f608a = new C0174d("GcmAvailableHelper");

    /* renamed from: b */
    private static final boolean f609b;

    /* renamed from: c */
    private static int f610c = -1;

    /* renamed from: d */
    private static boolean f611d;

    static {
        boolean z;
        try {
            Class.forName("com.google.android.gms.gcm.GcmNetworkManager");
            z = true;
        } catch (Throwable unused) {
            z = f609b;
        }
        f609b = z;
    }

    /* renamed from: a */
    private static void m647a(Context context, boolean z) {
        C0174d dVar;
        String str;
        try {
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, C0195a.class.getPackage().getName() + ".PlatformGcmService");
            switch (packageManager.getComponentEnabledSetting(componentName)) {
                case 0:
                case 2:
                    if (z) {
                        packageManager.setComponentEnabledSetting(componentName, 1, 1);
                        dVar = f608a;
                        str = "GCM service enabled";
                        break;
                    } else {
                        return;
                    }
                case 1:
                    if (!z) {
                        packageManager.setComponentEnabledSetting(componentName, 2, 1);
                        dVar = f608a;
                        str = "GCM service disabled";
                        break;
                    } else {
                        return;
                    }
                default:
                    return;
            }
            dVar.mo567a(str);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static boolean m648a(Context context) {
        try {
            if (!f611d) {
                f611d = true;
                m647a(context, f609b);
            }
            if (f609b && GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0 && m650b(context) == 0) {
                return true;
            }
            return f609b;
        } catch (Throwable unused) {
            return f609b;
        }
    }

    /* renamed from: a */
    private static boolean m649a(List<ResolveInfo> list) {
        if (list == null || list.isEmpty()) {
            return f609b;
        }
        for (ResolveInfo next : list) {
            if (next.serviceInfo != null && "com.google.android.gms.permission.BIND_NETWORK_TASK_SERVICE".equals(next.serviceInfo.permission) && next.serviceInfo.exported) {
                return true;
            }
        }
        return f609b;
    }

    /* renamed from: b */
    private static int m650b(Context context) {
        if (f610c < 0) {
            synchronized (C0186d.class) {
                if (f610c < 0) {
                    if (!m649a(context.getPackageManager().queryIntentServices(new Intent(context, PlatformGcmService.class), 0))) {
                        f610c = 1;
                        int i = f610c;
                        return i;
                    }
                    Intent intent = new Intent("com.google.android.gms.gcm.ACTION_TASK_READY");
                    intent.setPackage(context.getPackageName());
                    if (!m649a(context.getPackageManager().queryIntentServices(intent, 0))) {
                        f610c = 1;
                        int i2 = f610c;
                        return i2;
                    }
                    f610c = 0;
                }
            }
        }
        return f610c;
    }
}
