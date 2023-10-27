package com.dof100.morsenotifier;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.dof100.morsenotifier.f */
class C0136f {

    /* renamed from: a */
    public final List<C0135e> f457a = new ArrayList();

    public C0136f(Context context) {
        List arrayList = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        for (ApplicationInfo eVar : packageManager != null ? packageManager.getInstalledApplications(128) : arrayList) {
            this.f457a.add(new C0135e(packageManager, eVar));
        }
        Collections.sort(this.f457a, new Comparator<C0135e>() {
            /* renamed from: a */
            public int compare(C0135e eVar, C0135e eVar2) {
                return eVar.f456b.compareTo(eVar2.f456b);
            }
        });
        this.f457a.add(0, new C0135e("All apps", "All apps"));
        this.f457a.add(1, new C0135e("All system apps", "All system apps"));
        this.f457a.add(2, new C0135e("All non-system apps", "All non-system apps"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo474a(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = r7.hashCode()
            r1 = 1354875300(0x50c1c1a4, float:2.6005545E10)
            r2 = 2
            r3 = 0
            r4 = -1
            r5 = 1
            if (r0 == r1) goto L_0x002c
            r1 = 1655429668(0x62abda24, float:1.585056E21)
            if (r0 == r1) goto L_0x0022
            r1 = 1804173745(0x6b8981b1, float:3.3247058E26)
            if (r0 == r1) goto L_0x0018
            goto L_0x0036
        L_0x0018:
            java.lang.String r0 = "All apps"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0036
            r0 = 0
            goto L_0x0037
        L_0x0022:
            java.lang.String r0 = "All non-system apps"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0036
            r0 = 2
            goto L_0x0037
        L_0x002c:
            java.lang.String r0 = "All system apps"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x0036:
            r0 = -1
        L_0x0037:
            switch(r0) {
                case 0: goto L_0x0043;
                case 1: goto L_0x0042;
                case 2: goto L_0x0041;
                default: goto L_0x003a;
            }
        L_0x003a:
            java.lang.String r0 = "MyAppFilters.getApplicationInfoIndex"
            com.dof100.morsenotifier.C0140i.m501a((java.lang.String) r0)
            r0 = 3
            goto L_0x0044
        L_0x0041:
            return r2
        L_0x0042:
            return r5
        L_0x0043:
            return r3
        L_0x0044:
            java.util.List<com.dof100.morsenotifier.e> r1 = r6.f457a
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x0063
            java.util.List<com.dof100.morsenotifier.e> r1 = r6.f457a
            java.lang.Object r1 = r1.get(r0)
            com.dof100.morsenotifier.e r1 = (com.dof100.morsenotifier.C0135e) r1
            if (r1 != 0) goto L_0x0057
            goto L_0x0060
        L_0x0057:
            java.lang.String r1 = r1.f455a
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0060
            return r0
        L_0x0060:
            int r0 = r0 + 1
            goto L_0x0044
        L_0x0063:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dof100.morsenotifier.C0136f.mo474a(java.lang.String):int");
    }

    /* renamed from: a */
    public ArrayList<String> mo475a() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (C0135e eVar : this.f457a) {
            arrayList.add(eVar.f456b);
        }
        return arrayList;
    }
}
