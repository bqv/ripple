package com.evernote.android.job;

import com.evernote.android.job.p005a.C0174d;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.evernote.android.job.g */
class C0194g {

    /* renamed from: a */
    private static final C0174d f656a = new C0174d("JobCreatorHolder");

    /* renamed from: b */
    private final List<C0192f> f657b = new CopyOnWriteArrayList();

    /* renamed from: a */
    public C0180c mo623a(String str) {
        C0180c cVar = null;
        boolean z = false;
        for (C0192f a : this.f657b) {
            z = true;
            cVar = a.mo479a(str);
            if (cVar != null) {
                break;
            }
        }
        if (!z) {
            f656a.mo574c("no JobCreator added");
        }
        return cVar;
    }

    /* renamed from: a */
    public void mo624a(C0192f fVar) {
        this.f657b.add(fVar);
    }

    /* renamed from: a */
    public boolean mo625a() {
        return this.f657b.isEmpty();
    }
}
