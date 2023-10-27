package com.dof100.morsenotifier;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.dof100.morsenotifier.q */
class C0157q {

    /* renamed from: a */
    public ArrayList<C0156p> f538a = new ArrayList<>();

    public C0157q(Context context) {
        C0140i.m501a("MyReminders.constructor");
        mo517a(context);
    }

    /* renamed from: a */
    public C0156p mo516a() {
        C0156p pVar = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < this.f538a.size(); i++) {
            C0156p pVar2 = this.f538a.get(i);
            pVar2.mo514b();
            if (pVar2.f537g >= 0 && j > pVar2.f537g) {
                j = pVar2.f537g;
                pVar = pVar2;
            }
        }
        return pVar;
    }

    /* renamed from: a */
    public void mo517a(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        int i = defaultSharedPreferences.getInt("reminders_n", 0);
        C0140i.m501a(String.format(Locale.US, "MyReminders.load - loading %d entries", new Object[]{Integer.valueOf(i)}));
        this.f538a.clear();
        for (int i2 = 0; i2 < i; i2++) {
            C0156p pVar = new C0156p();
            pVar.mo513a(defaultSharedPreferences, i2);
            this.f538a.add(pVar);
        }
    }

    /* renamed from: b */
    public void mo518b(Context context) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        int size = this.f538a.size();
        C0140i.m501a(String.format(Locale.US, "MyReminders.save - saving %d entries", new Object[]{Integer.valueOf(size)}));
        edit.putInt("reminders_n", size);
        for (int i = 0; i < size; i++) {
            this.f538a.get(i).mo512a(edit, i);
        }
        edit.apply();
    }
}
