package android.support.p000v4.app;

import android.content.ComponentName;
import android.content.Context;
import android.provider.Settings;
import java.util.HashSet;
import java.util.Set;

/* renamed from: android.support.v4.app.f */
public final class C0038f {

    /* renamed from: a */
    private static final Object f54a = new Object();

    /* renamed from: b */
    private static String f55b;

    /* renamed from: c */
    private static Set<String> f56c = new HashSet();

    /* renamed from: d */
    private static final Object f57d = new Object();

    /* renamed from: a */
    public static Set<String> m50a(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f54a) {
            if (string != null) {
                try {
                    if (!string.equals(f55b)) {
                        String[] split = string.split(":");
                        HashSet hashSet = new HashSet(split.length);
                        for (String unflattenFromString : split) {
                            ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                            if (unflattenFromString2 != null) {
                                hashSet.add(unflattenFromString2.getPackageName());
                            }
                        }
                        f56c = hashSet;
                        f55b = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            set = f56c;
        }
        return set;
    }
}
