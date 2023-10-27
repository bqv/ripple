package com.evernote.android.job.p005a.p006a;

import com.evernote.android.job.p005a.C0174d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.evernote.android.job.a.a.b */
public final class C0167b {

    /* renamed from: a */
    private static final C0174d f598a = new C0174d("PersistableBundleCompat");

    /* renamed from: b */
    private final Map<String, Object> f599b;

    public C0167b() {
        this((Map<String, Object>) new HashMap());
    }

    public C0167b(C0167b bVar) {
        this((Map<String, Object>) new HashMap(bVar.f599b));
    }

    private C0167b(Map<String, Object> map) {
        this.f599b = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0033 A[SYNTHETIC, Splitter:B:21:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0044 A[SYNTHETIC, Splitter:B:29:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x004a A[SYNTHETIC, Splitter:B:34:0x004a] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0027=Splitter:B:18:0x0027, B:26:0x0038=Splitter:B:26:0x0038} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.evernote.android.job.p005a.p006a.C0167b m580a(java.lang.String r3) {
        /*
            r0 = 0
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ IOException | XmlPullParserException -> 0x0037, VerifyError -> 0x0026 }
            java.lang.String r2 = "UTF-8"
            byte[] r3 = r3.getBytes(r2)     // Catch:{ IOException | XmlPullParserException -> 0x0037, VerifyError -> 0x0026 }
            r1.<init>(r3)     // Catch:{ IOException | XmlPullParserException -> 0x0037, VerifyError -> 0x0026 }
            java.util.HashMap r3 = com.evernote.android.job.p005a.p006a.C0168c.m589a(r1)     // Catch:{ IOException | XmlPullParserException -> 0x0021, VerifyError -> 0x001e, all -> 0x001b }
            com.evernote.android.job.a.a.b r0 = new com.evernote.android.job.a.a.b     // Catch:{ IOException | XmlPullParserException -> 0x0021, VerifyError -> 0x001e, all -> 0x001b }
            r0.<init>((java.util.Map<java.lang.String, java.lang.Object>) r3)     // Catch:{ IOException | XmlPullParserException -> 0x0021, VerifyError -> 0x001e, all -> 0x001b }
            if (r1 == 0) goto L_0x001a
            r1.close()     // Catch:{ IOException -> 0x001a }
        L_0x001a:
            return r0
        L_0x001b:
            r3 = move-exception
            r0 = r1
            goto L_0x0048
        L_0x001e:
            r3 = move-exception
            r0 = r1
            goto L_0x0027
        L_0x0021:
            r3 = move-exception
            r0 = r1
            goto L_0x0038
        L_0x0024:
            r3 = move-exception
            goto L_0x0048
        L_0x0026:
            r3 = move-exception
        L_0x0027:
            com.evernote.android.job.a.d r1 = f598a     // Catch:{ all -> 0x0024 }
            r1.mo569a((java.lang.Throwable) r3)     // Catch:{ all -> 0x0024 }
            com.evernote.android.job.a.a.b r3 = new com.evernote.android.job.a.a.b     // Catch:{ all -> 0x0024 }
            r3.<init>()     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0036
            r0.close()     // Catch:{ IOException -> 0x0036 }
        L_0x0036:
            return r3
        L_0x0037:
            r3 = move-exception
        L_0x0038:
            com.evernote.android.job.a.d r1 = f598a     // Catch:{ all -> 0x0024 }
            r1.mo569a((java.lang.Throwable) r3)     // Catch:{ all -> 0x0024 }
            com.evernote.android.job.a.a.b r3 = new com.evernote.android.job.a.a.b     // Catch:{ all -> 0x0024 }
            r3.<init>()     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0047
            r0.close()     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            return r3
        L_0x0048:
            if (r0 == 0) goto L_0x004d
            r0.close()     // Catch:{ IOException -> 0x004d }
        L_0x004d:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.p005a.p006a.C0167b.m580a(java.lang.String):com.evernote.android.job.a.a.b");
    }

    /* renamed from: a */
    public String mo557a() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C0168c.m595a((Map) this.f599b, (OutputStream) byteArrayOutputStream);
            String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused) {
            }
            return byteArrayOutputStream2;
        } catch (IOException | XmlPullParserException e) {
            f598a.mo569a(e);
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused2) {
            }
            return "";
        } catch (Error e2) {
            f598a.mo569a((Throwable) e2);
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused3) {
            }
            return "";
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }

    /* renamed from: a */
    public void mo558a(String str, int i) {
        this.f599b.put(str, Integer.valueOf(i));
    }

    /* renamed from: a */
    public void mo559a(String str, String str2) {
        this.f599b.put(str, str2);
    }

    /* renamed from: b */
    public int mo560b(String str, int i) {
        Object obj = this.f599b.get(str);
        return obj instanceof Integer ? ((Integer) obj).intValue() : i;
    }

    /* renamed from: b */
    public String mo561b(String str, String str2) {
        Object obj = this.f599b.get(str);
        return obj instanceof String ? (String) obj : str2;
    }
}
