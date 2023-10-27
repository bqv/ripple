package com.dof100.morsenotifier;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.AttributeSet;
import java.util.Locale;

/* renamed from: com.dof100.morsenotifier.v */
class C0163v {
    /* renamed from: a */
    public static int m554a(int i, int i2, int i3, int i4) {
        int i5 = i3 * 60;
        int abs = Math.abs((((i * 60) + i2) - i5) - i4);
        int abs2 = Math.abs(((((i - 24) * 60) + i2) - i5) - i4);
        return Math.min(Math.min(abs, abs2), Math.abs(((((i + 24) * 60) + i2) - i5) - i4));
    }

    /* renamed from: a */
    public static int m555a(String str, String str2, int i, int i2, int i3) {
        int indexOf;
        int i4;
        int indexOf2 = str.indexOf("<" + str2);
        if (indexOf2 < 0 || (indexOf = str.indexOf(">", indexOf2)) <= (i4 = indexOf2 + 2) || indexOf >= indexOf2 + 8) {
            return i;
        }
        String substring = str.substring(i4, indexOf);
        try {
            int parseInt = Integer.parseInt(substring);
            if (parseInt < i2) {
                parseInt = i2;
            }
            return parseInt > i3 ? i3 : parseInt;
        } catch (NumberFormatException unused) {
            C0140i.m501a(String.format(Locale.US, "getTagValue ERROR could not convers %s to int", new Object[]{substring}));
            return i;
        }
    }

    /* renamed from: a */
    static String m556a(Context context, SharedPreferences sharedPreferences, String str, String str2, String str3, String str4) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str + str3, "string", context.getPackageName());
        if (identifier != 0) {
            return resources.getString(identifier);
        }
        int identifier2 = resources.getIdentifier(str + str4, "string", context.getPackageName());
        if (identifier2 != 0) {
            return resources.getString(identifier2);
        }
        if (str2 != null && !str2.isEmpty()) {
            return sharedPreferences.getAll().get(str2) instanceof Boolean ? Boolean.toString(sharedPreferences.getBoolean(str2, Boolean.parseBoolean("0"))) : sharedPreferences.getString(str2, "0");
        }
        C0140i.m501a(String.format(Locale.US, "prefGetDefaultValue key %s ERROR: default value not found in resources...", new Object[]{str}));
        return "0";
    }

    /* renamed from: a */
    public static String m557a(Context context, AttributeSet attributeSet, String str, String str2, String str3) {
        int i;
        Resources resources = context.getResources();
        String attributeValue = attributeSet.getAttributeValue(str, str2);
        if (attributeValue == null) {
            return str3;
        }
        if (attributeValue.startsWith("@string/")) {
            i = 8;
        } else if (!attributeValue.startsWith("@")) {
            return attributeValue;
        } else {
            i = 1;
        }
        return resources.getString(resources.getIdentifier(attributeValue.substring(i), "string", context.getPackageName()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        r1 = (java.lang.String) r1.getApplicationLabel(r0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m558a(android.content.Context r1, java.lang.String r2) {
        /*
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            if (r1 != 0) goto L_0x0007
            return r2
        L_0x0007:
            r0 = 0
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x000d }
            goto L_0x0012
        L_0x000d:
            r0 = move-exception
            r0.printStackTrace()
            r0 = 0
        L_0x0012:
            if (r0 != 0) goto L_0x0015
            return r2
        L_0x0015:
            java.lang.CharSequence r1 = r1.getApplicationLabel(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dof100.morsenotifier.C0163v.m558a(android.content.Context, java.lang.String):java.lang.String");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* renamed from: a */
    public static java.lang.String m559a(java.lang.String r7) {
        /*
            java.lang.String r0 = "<"
            int r0 = r7.indexOf(r0)
            java.lang.String r1 = ">"
            int r1 = r7.indexOf(r1)
            r2 = 0
            r3 = 1
            if (r0 < 0) goto L_0x0019
            if (r1 > r0) goto L_0x0013
            goto L_0x0019
        L_0x0013:
            r4 = r1
            r5 = 0
            r1 = r0
            r0 = r7
            r7 = 0
            goto L_0x001e
        L_0x0019:
            r4 = r1
            r5 = 0
            r1 = r0
            r0 = r7
        L_0x001d:
            r7 = 1
        L_0x001e:
            if (r7 != 0) goto L_0x004f
            java.lang.String r1 = r0.substring(r2, r1)
            int r4 = r4 + r3
            java.lang.String r0 = r0.substring(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r1 = "<"
            int r1 = r0.indexOf(r1)
            java.lang.String r4 = ">"
            int r4 = r0.indexOf(r4)
            if (r1 < 0) goto L_0x0048
            if (r4 > r1) goto L_0x0049
        L_0x0048:
            r7 = 1
        L_0x0049:
            int r5 = r5 + r3
            r6 = 10
            if (r5 <= r6) goto L_0x001e
            goto L_0x001d
        L_0x004f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dof100.morsenotifier.C0163v.m559a(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    static String m560a(String str, char c) {
        StringBuilder sb;
        if (str == null || str.isEmpty()) {
            return "";
        }
        String str2 = "" + str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i - 1)) || !Character.isDigit(str.charAt(i))) {
                sb = new StringBuilder();
                sb.append(str2);
            } else {
                sb = new StringBuilder();
                sb.append(str2);
                sb.append(c);
            }
            sb.append(str.charAt(i));
            str2 = sb.toString();
        }
        return str2;
    }

    /* renamed from: a */
    public static String m561a(String str, String str2, int i) {
        String str3;
        StringBuilder sb;
        String str4;
        int indexOf = str.indexOf("<" + str2 + ">");
        int indexOf2 = str.indexOf("</" + str2 + ">");
        if (indexOf < 0 && indexOf2 < 0) {
            return str;
        }
        switch (i) {
            case 1:
                sb = new StringBuilder();
                str4 = str.substring(0, indexOf);
                break;
            case 2:
                sb = new StringBuilder();
                sb.append(str.substring(0, indexOf));
                str4 = str.substring(str2.length() + indexOf + 2, indexOf2);
                break;
            default:
                str3 = str;
                break;
        }
        sb.append(str4);
        sb.append(str.substring(str2.length() + indexOf2 + 3));
        str3 = sb.toString();
        C0140i.m501a(String.format(Locale.US, "Utils.XMLDo Input = %s, p1=%d, p2=%d , res=%s", new Object[]{str, Integer.valueOf(indexOf), Integer.valueOf(indexOf2), str3}));
        return str3;
    }

    /* renamed from: a */
    public static boolean m562a(String str, String str2, boolean z) {
        return m555a(str, str2, z ? 1 : 0, 0, 1) > 0;
    }

    /* renamed from: b */
    static String m563b(Context context, SharedPreferences sharedPreferences, String str, String str2, String str3, String str4) {
        String str5;
        if (sharedPreferences.getString(str, "IMPOSSIBLE!STRING").equals("IMPOSSIBLE!STRING")) {
            C0140i.m501a(String.format(Locale.US, "prefGetString       key %s not initialized. Initializing now...", new Object[]{str}));
            SharedPreferences.Editor edit = sharedPreferences.edit();
            str5 = m556a(context, sharedPreferences, str, str2, str3, str4);
            edit.putString(str, str5);
            edit.apply();
        } else {
            str5 = "0";
        }
        return sharedPreferences.getString(str, str5);
    }

    /* renamed from: c */
    static int m564c(Context context, SharedPreferences sharedPreferences, String str, String str2, String str3, String str4) {
        String str5;
        if (sharedPreferences.getString(str, "IMPOSSIBLE!STRING").equals("IMPOSSIBLE!STRING")) {
            C0140i.m501a(String.format(Locale.US, "prefGetInt          key %s not initialized. Initializing now...", new Object[]{str}));
            SharedPreferences.Editor edit = sharedPreferences.edit();
            str5 = m556a(context, sharedPreferences, str, str2, str3, str4);
            edit.putString(str, str5);
            edit.apply();
        } else {
            str5 = "0";
        }
        return Integer.parseInt(sharedPreferences.getString(str, str5));
    }

    /* renamed from: d */
    static boolean m565d(Context context, SharedPreferences sharedPreferences, String str, String str2, String str3, String str4) {
        boolean z;
        if (sharedPreferences.getBoolean(str, false) || !sharedPreferences.getBoolean(str, true)) {
            z = false;
        } else {
            C0140i.m501a(String.format(Locale.US, "prefGetBoolean      key %s not initialized. Initializing now...", new Object[]{str}));
            SharedPreferences.Editor edit = sharedPreferences.edit();
            z = Boolean.parseBoolean(m556a(context, sharedPreferences, str, str2, str3, str4));
            edit.putBoolean(str, z);
            edit.apply();
        }
        return sharedPreferences.getBoolean(str, z);
    }

    /* renamed from: e */
    static int m566e(Context context, SharedPreferences sharedPreferences, String str, String str2, String str3, String str4) {
        String str5;
        if (sharedPreferences.getString(str, "IMPOSSIBLE!STRING").equals("IMPOSSIBLE!STRING")) {
            C0140i.m501a(String.format(Locale.US, "prefGetColor        key %s not initialized. Initializing now...", new Object[]{str}));
            SharedPreferences.Editor edit = sharedPreferences.edit();
            str5 = m556a(context, sharedPreferences, str, str2, str3, str4);
            edit.putString(str, str5);
            edit.apply();
        } else {
            str5 = "0xFF000000";
        }
        return Color.parseColor(sharedPreferences.getString(str, str5));
    }
}
