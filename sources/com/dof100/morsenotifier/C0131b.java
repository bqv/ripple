package com.dof100.morsenotifier;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.dof100.morsenotifier.b */
class C0131b {

    /* renamed from: a */
    public ArrayList<C0130a> f446a = new ArrayList<>();

    public C0131b(Context context) {
        C0140i.m501a("MyAppFilters.constructor");
        C0140i.m501a("MyAppNotificationFilters.constructor load");
        mo468a(context);
    }

    /* renamed from: c */
    public static int m482c(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt("app_filters_n", 0);
    }

    /* renamed from: a */
    public void mo468a(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        int i = defaultSharedPreferences.getInt("app_filters_n", 0);
        C0140i.m501a(String.format(Locale.US, "MyAppFilters.load - loading %d entries", new Object[]{Integer.valueOf(i)}));
        this.f446a.clear();
        for (int i2 = 0; i2 < i; i2++) {
            C0130a aVar = new C0130a();
            aVar.mo467a(defaultSharedPreferences, i2);
            this.f446a.add(aVar);
        }
    }

    /* renamed from: b */
    public void mo469b(Context context) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        int size = this.f446a.size();
        edit.putInt("app_filters_n", size);
        C0140i.m501a(String.format(Locale.US, "MyAppFilters.save - saving %d entries", new Object[]{Integer.valueOf(size)}));
        for (int i = 0; i < size; i++) {
            this.f446a.get(i).mo466a(edit, i);
        }
        edit.apply();
    }
}
