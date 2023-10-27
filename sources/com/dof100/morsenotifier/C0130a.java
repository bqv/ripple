package com.dof100.morsenotifier;

import android.content.SharedPreferences;
import java.util.Locale;

/* renamed from: com.dof100.morsenotifier.a */
class C0130a {

    /* renamed from: a */
    String f436a = "All non-system apps";

    /* renamed from: b */
    String f437b = "";

    /* renamed from: c */
    String f438c = "";

    /* renamed from: d */
    String f439d = "";

    /* renamed from: e */
    String f440e = "";

    /* renamed from: f */
    boolean f441f = true;

    /* renamed from: g */
    boolean f442g = false;

    /* renamed from: h */
    boolean f443h = false;

    /* renamed from: i */
    String f444i = "";

    /* renamed from: j */
    String f445j = "";

    public C0130a() {
        m476a();
    }

    /* renamed from: a */
    private void m476a() {
        this.f436a = "All non-system apps";
        this.f437b = "";
        this.f438c = "";
        this.f439d = "";
        this.f440e = "";
        this.f441f = true;
        this.f442g = false;
        this.f443h = false;
        this.f444i = "";
        this.f445j = "";
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m477b(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.f436a
            int r1 = r0.hashCode()
            r2 = 1354875300(0x50c1c1a4, float:2.6005545E10)
            r3 = 1
            r4 = 0
            if (r1 == r2) goto L_0x002c
            r2 = 1655429668(0x62abda24, float:1.585056E21)
            if (r1 == r2) goto L_0x0022
            r2 = 1804173745(0x6b8981b1, float:3.3247058E26)
            if (r1 == r2) goto L_0x0018
            goto L_0x0036
        L_0x0018:
            java.lang.String r1 = "All apps"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 0
            goto L_0x0037
        L_0x0022:
            java.lang.String r1 = "All non-system apps"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 2
            goto L_0x0037
        L_0x002c:
            java.lang.String r1 = "All system apps"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x0036:
            r0 = -1
        L_0x0037:
            switch(r0) {
                case 0: goto L_0x005d;
                case 1: goto L_0x005a;
                case 2: goto L_0x0057;
                default: goto L_0x003a;
            }
        L_0x003a:
            java.lang.String r0 = "MyAppNotificationFilter.getAppName mPackage=%s"
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = r5.f436a
            r1[r4] = r2
            java.lang.String r0 = java.lang.String.format(r0, r1)
            com.dof100.morsenotifier.C0140i.m501a((java.lang.String) r0)
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            if (r6 != 0) goto L_0x0060
            java.lang.String r6 = "MyAppNotificationFilter.getAppName ERROR PackageManager=null"
            com.dof100.morsenotifier.C0140i.m501a((java.lang.String) r6)
            java.lang.String r6 = r5.f436a
            return r6
        L_0x0057:
            java.lang.String r6 = "All non-system apps"
            return r6
        L_0x005a:
            java.lang.String r6 = "All system apps"
            return r6
        L_0x005d:
            java.lang.String r6 = "All apps"
            return r6
        L_0x0060:
            java.lang.String r0 = r5.f436a     // Catch:{ NameNotFoundException -> 0x0067 }
            android.content.pm.ApplicationInfo r0 = r6.getApplicationInfo(r0, r4)     // Catch:{ NameNotFoundException -> 0x0067 }
            goto L_0x006c
        L_0x0067:
            r0 = move-exception
            r0.printStackTrace()
            r0 = 0
        L_0x006c:
            if (r0 != 0) goto L_0x0071
            java.lang.String r6 = "-"
            return r6
        L_0x0071:
            java.lang.CharSequence r6 = r6.getApplicationLabel(r0)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L_0x007c
            java.lang.String r6 = r5.f436a
            return r6
        L_0x007c:
            java.lang.String r0 = "MyAppNotificationFilter.getAppName appname=%s"
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r4] = r6
            java.lang.String r0 = java.lang.String.format(r0, r1)
            com.dof100.morsenotifier.C0140i.m501a((java.lang.String) r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dof100.morsenotifier.C0130a.m477b(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ab  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo464a(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = r6.f436a
            int r1 = r0.hashCode()
            r2 = 1354875300(0x50c1c1a4, float:2.6005545E10)
            r3 = 1
            r4 = 0
            if (r1 == r2) goto L_0x002c
            r2 = 1655429668(0x62abda24, float:1.585056E21)
            if (r1 == r2) goto L_0x0022
            r2 = 1804173745(0x6b8981b1, float:3.3247058E26)
            if (r1 == r2) goto L_0x0018
            goto L_0x0036
        L_0x0018:
            java.lang.String r1 = "All apps"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 0
            goto L_0x0037
        L_0x0022:
            java.lang.String r1 = "All non-system apps"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 2
            goto L_0x0037
        L_0x002c:
            java.lang.String r1 = "All system apps"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x0036:
            r0 = -1
        L_0x0037:
            switch(r0) {
                case 0: goto L_0x005e;
                case 1: goto L_0x005b;
                case 2: goto L_0x0058;
                default: goto L_0x003a;
            }
        L_0x003a:
            java.lang.String r7 = r6.m477b(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Notifications from "
            r0.append(r1)
            java.lang.String r1 = "."
            java.lang.String r2 = ".​"
            java.lang.String r7 = r7.replace(r1, r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            goto L_0x0060
        L_0x0058:
            java.lang.String r7 = "Notifications from all non-android system apps"
            goto L_0x0060
        L_0x005b:
            java.lang.String r7 = "Notifications from all android system apps"
            goto L_0x0060
        L_0x005e:
            java.lang.String r7 = "Notifications from all apps"
        L_0x0060:
            java.lang.String r0 = r6.f437b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00ab
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r1 = " that contain '%s'"
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r5 = r6.f437b
            r2[r4] = r5
            java.lang.String r7 = java.lang.String.format(r7, r1, r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = r6.f438c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00c6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r1 = " and do not contain '%s'"
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r3 = r6.f438c
            r2[r4] = r3
        L_0x009f:
            java.lang.String r7 = java.lang.String.format(r7, r1, r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            return r7
        L_0x00ab:
            java.lang.String r0 = r6.f438c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00c6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r1 = " that do not contain '%s'"
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r3 = r6.f438c
            r2[r4] = r3
            goto L_0x009f
        L_0x00c6:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dof100.morsenotifier.C0130a.mo464a(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (r10.f436a.equals(r11.f516b) != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        if (r11.f516b.equals("android") == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006c, code lost:
        if (r11.f516b.equals("android") == false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0070, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        if (r0 != false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        return "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0076, code lost:
        com.dof100.morsenotifier.C0140i.m501a(java.lang.String.format(java.util.Locale.US, "MyAppNotificationFilter.checkNotification package name OK (%s)", new java.lang.Object[]{r11.f516b}));
        r0 = r11.f517c + r11.f518d + r11.f519e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a5, code lost:
        if (r10.f437b.isEmpty() == false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a7, code lost:
        com.dof100.morsenotifier.C0140i.m501a("MyAppNotificationFilter.checkNotification mCriteriaContains OK (empty)");
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ae, code lost:
        r1 = r10.f437b.toLowerCase().split(" or ");
        r2 = r1.length;
        r5 = 0;
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bd, code lost:
        if (r5 >= r2) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bf, code lost:
        r7 = r1[r5];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c9, code lost:
        if (r0.contains(r7.trim()) == false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cb, code lost:
        com.dof100.morsenotifier.C0140i.m501a(java.lang.String.format(java.util.Locale.US, "MyAppNotificationFilter.checkNotification mCriteriaContains OK (contains %s)", new java.lang.Object[]{r7}));
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00db, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00de, code lost:
        if (r6 != false) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e0, code lost:
        r11 = "MyAppNotificationFilter.checkNotification Filter does not match (contains)";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e2, code lost:
        com.dof100.morsenotifier.C0140i.m501a(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e7, code lost:
        return "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ee, code lost:
        if (r10.f438c.isEmpty() == false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f0, code lost:
        com.dof100.morsenotifier.C0140i.m501a("MyAppNotificationFilter.checkNotification mFilterContainsnot OK (empty)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f6, code lost:
        r1 = r10.f438c.toLowerCase().split(" or ");
        r2 = r1.length;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0104, code lost:
        if (r5 >= r2) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0106, code lost:
        r7 = r1[r5];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0110, code lost:
        if (r0.contains(r7.trim()) == false) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0112, code lost:
        com.dof100.morsenotifier.C0140i.m501a(java.lang.String.format(java.util.Locale.US, "MyAppNotificationFilter.checkNotification mFilterContainsnot found (contasins %s)", new java.lang.Object[]{r7}));
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0122, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0125, code lost:
        if (r6 != false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0127, code lost:
        r11 = "MyAppNotificationFilter.checkNotification Filter does not match (contains not)";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0130, code lost:
        if (r10.f439d.isEmpty() == false) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0132, code lost:
        com.dof100.morsenotifier.C0140i.m501a("MyAppNotificationFilter.checkNotification mCriteriaAdvCategory OK (empty)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0138, code lost:
        r0 = r10.f439d.toLowerCase().split(" or ");
        r1 = r0.length;
        r2 = 0;
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0147, code lost:
        if (r2 >= r1) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0149, code lost:
        r5 = r0[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x014d, code lost:
        if (r11.f520f == null) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015d, code lost:
        if (r11.f520f.toLowerCase().equals(r5.trim()) == false) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x015f, code lost:
        com.dof100.morsenotifier.C0140i.m501a(java.lang.String.format(java.util.Locale.US, "MyAppNotificationFilter.checkNotification mCriteriaAdvCategory found (cat=%s)", new java.lang.Object[]{r5}));
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x016f, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0172, code lost:
        if (r6 != false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0174, code lost:
        r11 = "MyAppNotificationFilter.checkNotification Filter does not match (category)";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x017e, code lost:
        if (r10.f440e.isEmpty() == false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0180, code lost:
        com.dof100.morsenotifier.C0140i.m501a("MyAppNotificationFilter.checkNotification mCriteriaAdvID OK (empty)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0186, code lost:
        r0 = r10.f440e.toLowerCase().split(" or ");
        r1 = r0.length;
        r2 = 0;
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0195, code lost:
        if (r2 >= r1) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r5 = java.lang.Integer.parseInt(r0[r2].trim());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01a3, code lost:
        if (r11.f521g != r5) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a5, code lost:
        com.dof100.morsenotifier.C0140i.m501a(java.lang.String.format(java.util.Locale.US, "MyAppNotificationFilter.checkNotification mCriteriaAdvID found (id=%d)", new java.lang.Object[]{java.lang.Integer.valueOf(r5)}));
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ba, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01bb, code lost:
        r5.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01c1, code lost:
        if (r6 != false) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c3, code lost:
        r11 = "MyAppNotificationFilter.checkNotification Filter does not match (id)";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01c7, code lost:
        com.dof100.morsenotifier.C0140i.m501a("MyAppNotificationFilter.checkNotification Filter matches OK");
        r0 = r10.f444i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01d0, code lost:
        if (r10.f441f == false) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01d2, code lost:
        r0 = r0.trim() + " " + r11.f517c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ee, code lost:
        if (r10.f442g == false) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01f0, code lost:
        r0 = r0.trim() + " " + r11.f518d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x020c, code lost:
        if (r10.f443h == false) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x020e, code lost:
        r0 = r0.trim() + " " + r11.f519e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x022c, code lost:
        return r0.trim();
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo465a(com.dof100.morsenotifier.C0152m r11) {
        /*
            r10 = this;
            java.lang.String r0 = r10.f436a
            int r1 = r0.hashCode()
            r2 = 1354875300(0x50c1c1a4, float:2.6005545E10)
            r3 = 0
            r4 = 1
            if (r1 == r2) goto L_0x002c
            r2 = 1655429668(0x62abda24, float:1.585056E21)
            if (r1 == r2) goto L_0x0022
            r2 = 1804173745(0x6b8981b1, float:3.3247058E26)
            if (r1 == r2) goto L_0x0018
            goto L_0x0036
        L_0x0018:
            java.lang.String r1 = "All apps"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 0
            goto L_0x0037
        L_0x0022:
            java.lang.String r1 = "All non-system apps"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 2
            goto L_0x0037
        L_0x002c:
            java.lang.String r1 = "All system apps"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x0036:
            r0 = -1
        L_0x0037:
            switch(r0) {
                case 0: goto L_0x006e;
                case 1: goto L_0x005a;
                case 2: goto L_0x0045;
                default: goto L_0x003a;
            }
        L_0x003a:
            java.lang.String r0 = r10.f436a
            java.lang.String r1 = r11.f516b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0070
            goto L_0x006e
        L_0x0045:
            java.lang.String r0 = r11.f516b
            java.lang.String r1 = "com.android"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L_0x0070
            java.lang.String r0 = r11.f516b
            java.lang.String r1 = "android"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0070
            goto L_0x006e
        L_0x005a:
            java.lang.String r0 = r11.f516b
            java.lang.String r1 = "com.android"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L_0x006e
            java.lang.String r0 = r11.f516b
            java.lang.String r1 = "android"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0070
        L_0x006e:
            r0 = 1
            goto L_0x0071
        L_0x0070:
            r0 = 0
        L_0x0071:
            if (r0 != 0) goto L_0x0076
            java.lang.String r11 = ""
            return r11
        L_0x0076:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = "MyAppNotificationFilter.checkNotification package name OK (%s)"
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r5 = r11.f516b
            r2[r3] = r5
            java.lang.String r0 = java.lang.String.format(r0, r1, r2)
            com.dof100.morsenotifier.C0140i.m501a((java.lang.String) r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r11.f517c
            r0.append(r1)
            java.lang.String r1 = r11.f518d
            r0.append(r1)
            java.lang.String r1 = r11.f519e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r10.f437b
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00ae
            java.lang.String r1 = "MyAppNotificationFilter.checkNotification mCriteriaContains OK (empty)"
            com.dof100.morsenotifier.C0140i.m501a((java.lang.String) r1)
            r6 = 1
            goto L_0x00de
        L_0x00ae:
            java.lang.String r1 = r10.f437b
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r2 = " or "
            java.lang.String[] r1 = r1.split(r2)
            int r2 = r1.length
            r5 = 0
            r6 = 0
        L_0x00bd:
            if (r5 >= r2) goto L_0x00de
            r7 = r1[r5]
            java.lang.String r8 = r7.trim()
            boolean r8 = r0.contains(r8)
            if (r8 == 0) goto L_0x00db
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r8 = "MyAppNotificationFilter.checkNotification mCriteriaContains OK (contains %s)"
            java.lang.Object[] r9 = new java.lang.Object[r4]
            r9[r3] = r7
            java.lang.String r6 = java.lang.String.format(r6, r8, r9)
            com.dof100.morsenotifier.C0140i.m501a((java.lang.String) r6)
            r6 = 1
        L_0x00db:
            int r5 = r5 + 1
            goto L_0x00bd
        L_0x00de:
            if (r6 != 0) goto L_0x00e8
            java.lang.String r11 = "MyAppNotificationFilter.checkNotification Filter does not match (contains)"
        L_0x00e2:
            com.dof100.morsenotifier.C0140i.m501a((java.lang.String) r11)
            java.lang.String r11 = ""
            return r11
        L_0x00e8:
            java.lang.String r1 = r10.f438c
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00f6
            java.lang.String r0 = "MyAppNotificationFilter.checkNotification mFilterContainsnot OK (empty)"
            com.dof100.morsenotifier.C0140i.m501a((java.lang.String) r0)
            goto L_0x0125
        L_0x00f6:
            java.lang.String r1 = r10.f438c
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r2 = " or "
            java.lang.String[] r1 = r1.split(r2)
            int r2 = r1.length
            r5 = 0
        L_0x0104:
            if (r5 >= r2) goto L_0x0125
            r7 = r1[r5]
            java.lang.String r8 = r7.trim()
            boolean r8 = r0.contains(r8)
            if (r8 == 0) goto L_0x0122
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r8 = "MyAppNotificationFilter.checkNotification mFilterContainsnot found (contasins %s)"
            java.lang.Object[] r9 = new java.lang.Object[r4]
            r9[r3] = r7
            java.lang.String r6 = java.lang.String.format(r6, r8, r9)
            com.dof100.morsenotifier.C0140i.m501a((java.lang.String) r6)
            r6 = 0
        L_0x0122:
            int r5 = r5 + 1
            goto L_0x0104
        L_0x0125:
            if (r6 != 0) goto L_0x012a
            java.lang.String r11 = "MyAppNotificationFilter.checkNotification Filter does not match (contains not)"
            goto L_0x00e2
        L_0x012a:
            java.lang.String r0 = r10.f439d
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0138
            java.lang.String r0 = "MyAppNotificationFilter.checkNotification mCriteriaAdvCategory OK (empty)"
            com.dof100.morsenotifier.C0140i.m501a((java.lang.String) r0)
            goto L_0x0172
        L_0x0138:
            java.lang.String r0 = r10.f439d
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = " or "
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 0
            r6 = 0
        L_0x0147:
            if (r2 >= r1) goto L_0x0172
            r5 = r0[r2]
            java.lang.String r7 = r11.f520f
            if (r7 == 0) goto L_0x016f
            java.lang.String r7 = r11.f520f
            java.lang.String r7 = r7.toLowerCase()
            java.lang.String r8 = r5.trim()
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x016f
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r7 = "MyAppNotificationFilter.checkNotification mCriteriaAdvCategory found (cat=%s)"
            java.lang.Object[] r8 = new java.lang.Object[r4]
            r8[r3] = r5
            java.lang.String r5 = java.lang.String.format(r6, r7, r8)
            com.dof100.morsenotifier.C0140i.m501a((java.lang.String) r5)
            r6 = 1
        L_0x016f:
            int r2 = r2 + 1
            goto L_0x0147
        L_0x0172:
            if (r6 != 0) goto L_0x0178
            java.lang.String r11 = "MyAppNotificationFilter.checkNotification Filter does not match (category)"
            goto L_0x00e2
        L_0x0178:
            java.lang.String r0 = r10.f440e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0186
            java.lang.String r0 = "MyAppNotificationFilter.checkNotification mCriteriaAdvID OK (empty)"
            com.dof100.morsenotifier.C0140i.m501a((java.lang.String) r0)
            goto L_0x01c1
        L_0x0186:
            java.lang.String r0 = r10.f440e
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = " or "
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 0
            r6 = 0
        L_0x0195:
            if (r2 >= r1) goto L_0x01c1
            r5 = r0[r2]
            java.lang.String r5 = r5.trim()     // Catch:{ NumberFormatException -> 0x01ba }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x01ba }
            int r7 = r11.f521g
            if (r7 != r5) goto L_0x01be
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r7 = "MyAppNotificationFilter.checkNotification mCriteriaAdvID found (id=%d)"
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8[r3] = r5
            java.lang.String r5 = java.lang.String.format(r6, r7, r8)
            com.dof100.morsenotifier.C0140i.m501a((java.lang.String) r5)
            r6 = 1
            goto L_0x01be
        L_0x01ba:
            r5 = move-exception
            r5.printStackTrace()
        L_0x01be:
            int r2 = r2 + 1
            goto L_0x0195
        L_0x01c1:
            if (r6 != 0) goto L_0x01c7
            java.lang.String r11 = "MyAppNotificationFilter.checkNotification Filter does not match (id)"
            goto L_0x00e2
        L_0x01c7:
            java.lang.String r0 = "MyAppNotificationFilter.checkNotification Filter matches OK"
            com.dof100.morsenotifier.C0140i.m501a((java.lang.String) r0)
            java.lang.String r0 = r10.f444i
            boolean r1 = r10.f441f
            if (r1 == 0) goto L_0x01ec
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r0.trim()
            r1.append(r0)
            java.lang.String r0 = " "
            r1.append(r0)
            java.lang.String r0 = r11.f517c
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x01ec:
            boolean r1 = r10.f442g
            if (r1 == 0) goto L_0x020a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r0.trim()
            r1.append(r0)
            java.lang.String r0 = " "
            r1.append(r0)
            java.lang.String r0 = r11.f518d
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x020a:
            boolean r1 = r10.f443h
            if (r1 == 0) goto L_0x0228
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r0.trim()
            r1.append(r0)
            java.lang.String r0 = " "
            r1.append(r0)
            java.lang.String r11 = r11.f519e
            r1.append(r11)
            java.lang.String r0 = r1.toString()
        L_0x0228:
            java.lang.String r11 = r0.trim()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dof100.morsenotifier.C0130a.mo465a(com.dof100.morsenotifier.m):java.lang.String");
    }

    /* renamed from: a */
    public void mo466a(SharedPreferences.Editor editor, int i) {
        C0140i.m501a(String.format(Locale.US, "MyAppNotificationFilter.save - filter no %d, package    =%s", new Object[]{Integer.valueOf(i), this.f436a}));
        editor.putString("app_filter_" + i + "_Package", this.f436a);
        editor.putString("app_filter_" + i + "_CriteriaContains", this.f437b);
        editor.putString("app_filter_" + i + "_CriteriaContainsNot", this.f438c);
        editor.putString("app_filter_" + i + "_CriteriaCategory", this.f439d);
        editor.putString("app_filter_" + i + "_CriteriaID", this.f440e);
        editor.putBoolean("app_filter_" + i + "_SayTitle", this.f441f);
        editor.putBoolean("app_filter_" + i + "_SayText", this.f442g);
        editor.putBoolean("app_filter_" + i + "_SayTicker", this.f443h);
        editor.putString("app_filter_" + i + "_mSayBefore", this.f444i);
        editor.putString("app_filter_" + i + "_SayAfter", this.f445j);
        C0140i.m501a(String.format(Locale.US, "MyAppNotificationFilter.save %d", new Object[]{Integer.valueOf(i)}));
        C0140i.m501a(String.format(Locale.US, "MyAppNotificationFilter.save package    =%s", new Object[]{this.f436a}));
        C0140i.m501a(String.format(Locale.US, "MyAppNotificationFilter.save contains   =%s contains not=%s", new Object[]{this.f437b, this.f438c}));
        C0140i.m501a(String.format(Locale.US, "MyAppNotificationFilter.save Say title  =%b text =%b ticker=%b", new Object[]{Boolean.valueOf(this.f441f), Boolean.valueOf(this.f442g), Boolean.valueOf(this.f443h)}));
        C0140i.m501a(String.format(Locale.US, "MyAppNotificationFilter.save Say before =%s after=%s", new Object[]{this.f444i, this.f445j}));
    }

    /* renamed from: a */
    public void mo467a(SharedPreferences sharedPreferences, int i) {
        m476a();
        this.f436a = sharedPreferences.getString("app_filter_" + i + "_Package", "All non-system apps");
        this.f437b = sharedPreferences.getString("app_filter_" + i + "_CriteriaContains", this.f437b);
        this.f438c = sharedPreferences.getString("app_filter_" + i + "_CriteriaContainsNot", this.f438c);
        this.f439d = sharedPreferences.getString("app_filter_" + i + "_CriteriaCategory", this.f439d);
        this.f440e = sharedPreferences.getString("app_filter_" + i + "_CriteriaID", this.f440e);
        this.f441f = sharedPreferences.getBoolean("app_filter_" + i + "_SayTitle", this.f441f);
        this.f442g = sharedPreferences.getBoolean("app_filter_" + i + "_SayText", this.f442g);
        this.f443h = sharedPreferences.getBoolean("app_filter_" + i + "_SayTicker", this.f443h);
        this.f444i = sharedPreferences.getString("app_filter_" + i + "_mSayBefore", this.f444i);
        this.f445j = sharedPreferences.getString("app_filter_" + i + "_SayAfter", this.f445j);
        C0140i.m501a(String.format(Locale.US, "MyAppNotificationFilter.load - filter no %d, package    =%s", new Object[]{Integer.valueOf(i), this.f436a}));
    }
}
