package com.dof100.morsenotifier;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.dof100.morsenotifier.n */
class C0153n {

    /* renamed from: a */
    public final ArrayList<C0152m> f525a = new ArrayList<>();

    /* renamed from: b */
    private boolean f526b = true;

    public C0153n(Context context) {
        C0140i.m501a("MyRecentAppNotifications.constructor");
        mo507b(context);
    }

    /* renamed from: a */
    private void m530a() {
        C0140i.m501a("MyRecentAppNotifications.arrange - in (" + this.f525a.size() + ") entries");
        if (!this.f526b) {
            this.f525a.clear();
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            Iterator<C0152m> it = this.f525a.iterator();
            while (it.hasNext()) {
                if (Math.abs(currentTimeMillis - it.next().f515a) > 86400000) {
                    it.remove();
                }
            }
            while (this.f525a.size() > 10) {
                this.f525a.remove(0);
            }
        }
        C0140i.m501a("MyRecentAppNotifications.arrange - out (" + this.f525a.size() + ") entries");
    }

    /* renamed from: c */
    public static int m531c(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("MyRecentAppNotifications_n", 0);
    }

    /* renamed from: d */
    private void m532d(Context context) {
        C0140i.m501a("MyRecentAppNotifications.save (" + this.f525a.size() + ") entries");
        m530a();
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putInt("MyRecentAppNotifications_enable", this.f526b ? 1 : 0);
        edit.putInt("MyRecentAppNotifications_n", this.f525a.size());
        int i = 0;
        Iterator<C0152m> it = this.f525a.iterator();
        while (it.hasNext()) {
            it.next().mo502a(edit, i);
            i++;
        }
        edit.apply();
        C0140i.m501a("MyRecentAppNotifications.save saved " + this.f525a.size() + " entries");
    }

    /* renamed from: a */
    public C0152m mo504a(Context context, String str, int i, String str2, String str3, String str4, String str5) {
        String str6 = str;
        int i2 = i;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        C0140i.m501a("MyRecentAppNotifications.addNotification");
        long currentTimeMillis = System.currentTimeMillis();
        Iterator<C0152m> it = this.f525a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C0152m next = it.next();
            if (Math.abs(currentTimeMillis - next.f515a) <= 100 && str6.equals(next.f516b) && i2 == next.f521g) {
                if ((str7 == null || str7.equals(next.f520f)) && ((str9 == null || str9.equals(next.f517c)) && ((str10 == null || str10.equals(next.f518d)) && (str8 == null || str8.equals(next.f519e))))) {
                    z = true;
                }
            }
        }
        C0152m mVar = null;
        if (!z) {
            mVar = new C0152m();
            mVar.f515a = currentTimeMillis;
            if (str6 == null) {
                str6 = "";
            }
            mVar.f516b = str6;
            if (str9 != null) {
                mVar.f517c = str9;
            } else {
                mVar.f517c = "";
            }
            if (str10 != null) {
                mVar.f518d = str10;
            } else {
                mVar.f518d = "";
            }
            if (str8 != null) {
                mVar.f519e = str8;
            } else {
                mVar.f519e = "";
            }
            if (str7 != null) {
                mVar.f520f = str7;
            } else {
                mVar.f520f = "";
            }
            mVar.f521g = i2;
            mVar.f522h = -2;
            mVar.f523i = -1;
            mVar.f524j = "";
            this.f525a.add(mVar);
        }
        m532d(context);
        return mVar;
    }

    /* renamed from: a */
    public void mo505a(Context context) {
        C0140i.m501a("MyRecentAppNotifications.clear");
        this.f525a.clear();
        m532d(context);
    }

    /* renamed from: a */
    public void mo506a(Context context, boolean z) {
        C0140i.m501a("MyRecentAppNotifications.setEnable " + z);
        this.f526b = z;
        if (!this.f526b) {
            this.f525a.clear();
        }
        m532d(context);
    }

    /* renamed from: b */
    public void mo507b(Context context) {
        C0140i.m501a("MyRecentAppNotifications.load");
        this.f525a.clear();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        this.f526b = defaultSharedPreferences.getInt("MyRecentAppNotifications_enable", 1) == 1;
        int i = defaultSharedPreferences.getInt("MyRecentAppNotifications_n", 1);
        for (int i2 = 0; i2 < i; i2++) {
            C0152m mVar = new C0152m();
            mVar.mo503a(defaultSharedPreferences, i2);
            this.f525a.add(mVar);
        }
        m530a();
        C0140i.m501a("MyRecentAppNotifications.load loaded " + this.f525a.size() + " entries");
    }
}
