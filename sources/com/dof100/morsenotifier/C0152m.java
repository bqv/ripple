package com.dof100.morsenotifier;

import android.content.SharedPreferences;
import java.util.Locale;

/* renamed from: com.dof100.morsenotifier.m */
public class C0152m {

    /* renamed from: a */
    long f515a = -1;

    /* renamed from: b */
    String f516b = "";

    /* renamed from: c */
    String f517c = "";

    /* renamed from: d */
    String f518d = "";

    /* renamed from: e */
    String f519e = "";

    /* renamed from: f */
    String f520f = "";

    /* renamed from: g */
    int f521g = -1;

    /* renamed from: h */
    int f522h = -1;

    /* renamed from: i */
    int f523i = -1;

    /* renamed from: j */
    String f524j = "";

    /* renamed from: a */
    public void mo502a(SharedPreferences.Editor editor, int i) {
        C0140i.m501a(String.format(Locale.US, "MyRecentAppNotification_.save - notif no %d, package    =%s", new Object[]{Integer.valueOf(i), this.f516b}));
        editor.putLong("MyRecentAppNotification_" + i + "_mDateTime", this.f515a);
        editor.putString("MyRecentAppNotification_" + i + "_mPackage", this.f516b);
        editor.putString("MyRecentAppNotification_" + i + "_mTitle", this.f517c);
        editor.putString("MyRecentAppNotification_" + i + "_mText", this.f518d);
        editor.putString("MyRecentAppNotification_" + i + "_mTicker", this.f519e);
        editor.putString("MyRecentAppNotification_" + i + "_mCategory", this.f520f);
        editor.putInt("MyRecentAppNotification_" + i + "_mID", this.f521g);
        editor.putInt("MyRecentAppNotification_" + i + "_mAnnounced", this.f522h);
        editor.putInt("MyRecentAppNotification_" + i + "_tmpFilter", this.f523i);
        editor.putString("MyRecentAppNotification_" + i + "_tmpAnnouncement", this.f524j);
    }

    /* renamed from: a */
    public void mo503a(SharedPreferences sharedPreferences, int i) {
        this.f515a = sharedPreferences.getLong("MyRecentAppNotification_" + i + "_mDateTime", 0);
        this.f516b = sharedPreferences.getString("MyRecentAppNotification_" + i + "_mPackage", "");
        this.f517c = sharedPreferences.getString("MyRecentAppNotification_" + i + "_mTitle", "");
        this.f518d = sharedPreferences.getString("MyRecentAppNotification_" + i + "_mText", "");
        this.f519e = sharedPreferences.getString("MyRecentAppNotification_" + i + "_mTicker", "");
        this.f520f = sharedPreferences.getString("MyRecentAppNotification_" + i + "_mCategory", "");
        this.f521g = sharedPreferences.getInt("MyRecentAppNotification_" + i + "_mID", -1);
        this.f522h = sharedPreferences.getInt("MyRecentAppNotification_" + i + "_mAnnounced", -1);
        this.f523i = sharedPreferences.getInt("MyRecentAppNotification_" + i + "_tmpFilter", -1);
        this.f524j = sharedPreferences.getString("MyRecentAppNotification_" + i + "_tmpAnnouncement", "");
        C0140i.m501a(String.format(Locale.US, "MyRecentAppNotification.load - notif no %d, package    =%s", new Object[]{Integer.valueOf(i), this.f516b}));
    }
}
