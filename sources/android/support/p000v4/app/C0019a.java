package android.support.p000v4.app;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.p000v4.p001a.C0013a;

/* renamed from: android.support.v4.app.a */
public class C0019a extends C0013a {

    /* renamed from: a */
    private static C0022b f20a;

    /* renamed from: android.support.v4.app.a$a */
    public interface C0021a {
        /* renamed from: a */
        void mo8a(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: android.support.v4.app.a$b */
    public interface C0022b {
        /* renamed from: a */
        boolean mo9a(Activity activity, String[] strArr, int i);
    }

    /* renamed from: android.support.v4.app.a$c */
    public interface C0023c {
        /* renamed from: a */
        void mo10a(int i);
    }

    /* renamed from: a */
    public static void m7a(final Activity activity, final String[] strArr, final int i) {
        if (f20a != null && f20a.mo9a(activity, strArr, i)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof C0023c) {
                ((C0023c) activity).mo10a(i);
            }
            activity.requestPermissions(strArr, i);
        } else if (activity instanceof C0021a) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    int[] iArr = new int[strArr.length];
                    PackageManager packageManager = activity.getPackageManager();
                    String packageName = activity.getPackageName();
                    int length = strArr.length;
                    for (int i = 0; i < length; i++) {
                        iArr[i] = packageManager.checkPermission(strArr[i], packageName);
                    }
                    ((C0021a) activity).mo8a(i, strArr, iArr);
                }
            });
        }
    }
}
