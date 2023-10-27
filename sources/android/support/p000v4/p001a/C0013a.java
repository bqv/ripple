package android.support.p000v4.p001a;

import android.content.Context;
import android.os.Process;

/* renamed from: android.support.v4.a.a */
public class C0013a {

    /* renamed from: a */
    private static final Object f1a = new Object();

    /* renamed from: a */
    public static int m0a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }
}
