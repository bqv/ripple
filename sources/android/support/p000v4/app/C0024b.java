package android.support.p000v4.app;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.app.b */
public final class C0024b {

    /* renamed from: android.support.v4.app.b$a */
    static class C0025a {

        /* renamed from: a */
        private static Method f24a;

        /* renamed from: b */
        private static boolean f25b;

        /* renamed from: a */
        public static IBinder m12a(Bundle bundle, String str) {
            if (!f25b) {
                try {
                    f24a = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    f24a.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e);
                }
                f25b = true;
            }
            if (f24a != null) {
                try {
                    return (IBinder) f24a.invoke(bundle, new Object[]{str});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", e2);
                    f24a = null;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static IBinder m11a(Bundle bundle, String str) {
        return Build.VERSION.SDK_INT >= 18 ? bundle.getBinder(str) : C0025a.m12a(bundle, str);
    }
}
