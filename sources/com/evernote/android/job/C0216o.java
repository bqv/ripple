package com.evernote.android.job;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.evernote.android.job.p005a.C0174d;
import java.io.File;

/* renamed from: com.evernote.android.job.o */
final class C0216o implements DatabaseErrorHandler {

    /* renamed from: a */
    private static final C0174d f735a = new C0174d("DatabaseErrorHandler");

    C0216o() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo721a(Context context, File file) {
        context.deleteDatabase(file.getName());
    }

    /* access modifiers changed from: package-private */
    @TargetApi(16)
    /* renamed from: a */
    public void mo722a(File file) {
        SQLiteDatabase.deleteDatabase(file);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo723a(String str) {
        if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
            C0174d dVar = f735a;
            dVar.mo576d("deleting the database file: " + str);
            try {
                File file = new File(str);
                if (Build.VERSION.SDK_INT >= 16) {
                    mo722a(file);
                } else {
                    mo721a(C0200i.m734a().mo658h(), file);
                }
            } catch (Exception e) {
                C0174d dVar2 = f735a;
                dVar2.mo570a(e, "delete failed: " + e.getMessage(), new Object[0]);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        if (r0 != null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        r4 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        if (r4.hasNext() != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        mo723a((java.lang.String) r4.next().second);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        mo723a(r4.getPath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0031 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f A[ExcHandler: all (r1v2 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
      PHI: (r0v9 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r0v2 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v3 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v3 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:5:0x0029, B:9:0x0031, B:10:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x0029] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCorruption(android.database.sqlite.SQLiteDatabase r4) {
        /*
            r3 = this;
            com.evernote.android.job.a.d r0 = f735a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Corruption reported by sqlite on database: "
            r1.append(r2)
            java.lang.String r2 = r4.getPath()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.mo576d(r1)
            boolean r0 = r4.isOpen()
            if (r0 != 0) goto L_0x0028
            java.lang.String r4 = r4.getPath()
            r3.mo723a((java.lang.String) r4)
            return
        L_0x0028:
            r0 = 0
            java.util.List r1 = r4.getAttachedDbs()     // Catch:{ SQLiteException -> 0x0031, all -> 0x002f }
            r0 = r1
            goto L_0x0031
        L_0x002f:
            r1 = move-exception
            goto L_0x0035
        L_0x0031:
            r4.close()     // Catch:{ SQLiteException -> 0x0057, all -> 0x002f }
            goto L_0x0057
        L_0x0035:
            if (r0 == 0) goto L_0x004f
            java.util.Iterator r4 = r0.iterator()
        L_0x003b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0056
            java.lang.Object r0 = r4.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            r3.mo723a((java.lang.String) r0)
            goto L_0x003b
        L_0x004f:
            java.lang.String r4 = r4.getPath()
            r3.mo723a((java.lang.String) r4)
        L_0x0056:
            throw r1
        L_0x0057:
            if (r0 == 0) goto L_0x0071
            java.util.Iterator r4 = r0.iterator()
        L_0x005d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0078
            java.lang.Object r0 = r4.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            r3.mo723a((java.lang.String) r0)
            goto L_0x005d
        L_0x0071:
            java.lang.String r4 = r4.getPath()
            r3.mo723a((java.lang.String) r4)
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.C0216o.onCorruption(android.database.sqlite.SQLiteDatabase):void");
    }
}
