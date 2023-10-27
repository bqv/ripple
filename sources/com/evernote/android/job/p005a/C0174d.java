package com.evernote.android.job.p005a;

import android.util.Log;

/* renamed from: com.evernote.android.job.a.d */
public class C0174d implements C0175e {

    /* renamed from: c */
    private static volatile C0175e[] f601c = new C0175e[0];

    /* renamed from: d */
    private static volatile boolean f602d = true;

    /* renamed from: a */
    protected final String f603a;

    /* renamed from: b */
    protected final boolean f604b;

    public C0174d(String str) {
        this(str, true);
    }

    public C0174d(String str, boolean z) {
        this.f603a = str;
        this.f604b = z;
    }

    /* renamed from: a */
    public void mo566a(int i, String str, String str2, Throwable th) {
        String str3;
        if (this.f604b) {
            if (f602d) {
                if (th == null) {
                    str3 = "";
                } else {
                    str3 = 10 + Log.getStackTraceString(th);
                }
                Log.println(i, str, str2 + str3);
            }
            C0175e[] eVarArr = f601c;
            if (eVarArr.length > 0) {
                for (C0175e eVar : eVarArr) {
                    if (eVar != null) {
                        eVar.mo566a(i, str, str2, th);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo567a(String str) {
        mo566a(4, this.f603a, str, (Throwable) null);
    }

    /* renamed from: a */
    public void mo568a(String str, Object... objArr) {
        mo566a(4, this.f603a, String.format(str, objArr), (Throwable) null);
    }

    /* renamed from: a */
    public void mo569a(Throwable th) {
        String message = th.getMessage();
        String str = this.f603a;
        if (message == null) {
            message = "empty message";
        }
        mo566a(6, str, message, th);
    }

    /* renamed from: a */
    public void mo570a(Throwable th, String str, Object... objArr) {
        mo566a(5, this.f603a, String.format(str, objArr), th);
    }

    /* renamed from: b */
    public void mo571b(String str) {
        mo566a(3, this.f603a, str, (Throwable) null);
    }

    /* renamed from: b */
    public void mo572b(String str, Object... objArr) {
        mo566a(3, this.f603a, String.format(str, objArr), (Throwable) null);
    }

    /* renamed from: b */
    public void mo573b(Throwable th, String str, Object... objArr) {
        mo566a(6, this.f603a, String.format(str, objArr), th);
    }

    /* renamed from: c */
    public void mo574c(String str) {
        mo566a(5, this.f603a, str, (Throwable) null);
    }

    /* renamed from: c */
    public void mo575c(String str, Object... objArr) {
        mo566a(5, this.f603a, String.format(str, objArr), (Throwable) null);
    }

    /* renamed from: d */
    public void mo576d(String str) {
        mo566a(6, this.f603a, str, (Throwable) null);
    }

    /* renamed from: d */
    public void mo577d(String str, Object... objArr) {
        mo566a(6, this.f603a, String.format(str, objArr), (Throwable) null);
    }
}
