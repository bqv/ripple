package com.dof100.morsenotifier;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/* renamed from: com.dof100.morsenotifier.e */
class C0135e {

    /* renamed from: a */
    final String f455a;

    /* renamed from: b */
    String f456b;

    public C0135e(PackageManager packageManager, ApplicationInfo applicationInfo) {
        String str;
        if (applicationInfo == null) {
            this.f455a = "";
            this.f456b = "";
            return;
        }
        this.f455a = applicationInfo.packageName;
        if (packageManager != null) {
            try {
                str = (String) packageManager.getApplicationLabel(applicationInfo);
            } catch (Exception unused) {
                this.f456b = " (" + applicationInfo.packageName + ")";
                return;
            }
        } else {
            str = "";
        }
        this.f456b = str;
        if (this.f456b.startsWith("com.android.")) {
            this.f456b = this.f456b.substring(12, 13).toUpperCase() + this.f456b.substring(13);
        }
        this.f456b += " (" + applicationInfo.packageName + ")";
    }

    public C0135e(String str, String str2) {
        this.f455a = str;
        this.f456b = str2;
    }
}
