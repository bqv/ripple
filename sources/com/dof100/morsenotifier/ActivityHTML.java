package com.dof100.morsenotifier;

import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class ActivityHTML extends Activity implements View.OnClickListener {

    /* renamed from: a */
    private Button f247a;

    public void onClick(View view) {
        C0140i.m501a("ActivityDisplayMessage.onClick");
        if (view != null && view.equals(this.f247a)) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            super.onCreate(r12)
            android.content.Intent r12 = r11.getIntent()
            r0 = 0
            android.os.Bundle r1 = r12.getExtras()     // Catch:{ Exception -> 0x0035 }
            java.lang.String r2 = "TITLE"
            java.lang.String r1 = r1.getString(r2)     // Catch:{ Exception -> 0x0035 }
            android.os.Bundle r2 = r12.getExtras()     // Catch:{ Exception -> 0x0033 }
            java.lang.String r3 = "FILENAME"
            java.lang.String r2 = r2.getString(r3)     // Catch:{ Exception -> 0x0033 }
            android.os.Bundle r3 = r12.getExtras()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r4 = "VERTICALALIGN"
            java.lang.String r3 = r3.getString(r4)     // Catch:{ Exception -> 0x0031 }
            android.os.Bundle r12 = r12.getExtras()     // Catch:{ Exception -> 0x0038 }
            java.lang.String r4 = "BUTTONOKCAPTION"
            java.lang.String r12 = r12.getString(r4)     // Catch:{ Exception -> 0x0038 }
            goto L_0x0039
        L_0x0031:
            r3 = r0
            goto L_0x0038
        L_0x0033:
            r2 = r0
            goto L_0x0037
        L_0x0035:
            r1 = r0
            r2 = r1
        L_0x0037:
            r3 = r2
        L_0x0038:
            r12 = r0
        L_0x0039:
            if (r1 != 0) goto L_0x003d
            java.lang.String r1 = ""
        L_0x003d:
            if (r2 != 0) goto L_0x0041
            java.lang.String r2 = ""
        L_0x0041:
            if (r3 != 0) goto L_0x0045
            java.lang.String r3 = "top"
        L_0x0045:
            r11.setTitle(r1)
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r11)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r4 = -1
            r1.<init>(r4, r4)
            r0.setLayoutParams(r1)
            r1 = 1
            r0.setOrientation(r1)
            android.webkit.WebView r5 = new android.webkit.WebView
            r5.<init>(r11)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r7 = 0
            r6.<init>(r4, r7)
            r4 = 1065353216(0x3f800000, float:1.0)
            r6.weight = r4
            r5.setLayoutParams(r6)
            java.lang.String r4 = "#000000"
            int r4 = android.graphics.Color.parseColor(r4)
            r5.setBackgroundColor(r4)
            r0.addView(r5)
            if (r12 == 0) goto L_0x00a2
            android.widget.Button r12 = new android.widget.Button
            r12.<init>(r11)
            r11.f247a = r12
            android.widget.Button r12 = r11.f247a
            r4 = 2131492912(0x7f0c0030, float:1.860929E38)
            r12.setText(r4)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r4 = -2
            r12.<init>(r4, r4)
            android.widget.Button r4 = r11.f247a
            r4.setLayoutParams(r12)
            r4 = 17
            r12.gravity = r4
            android.widget.Button r12 = r11.f247a
            r0.addView(r12)
            android.widget.Button r12 = r11.f247a
            r12.setOnClickListener(r11)
        L_0x00a2:
            java.lang.String r12 = r2.toLowerCase()
            java.lang.String r4 = ".html"
            boolean r12 = r12.endsWith(r4)
            if (r12 == 0) goto L_0x012a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            android.content.res.AssetManager r4 = r11.getAssets()     // Catch:{ IOException -> 0x00d1 }
            java.io.InputStream r2 = r4.open(r2)     // Catch:{ IOException -> 0x00d1 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x00d1 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x00d1 }
            java.lang.String r7 = "UTF-8"
            r6.<init>(r2, r7)     // Catch:{ IOException -> 0x00d1 }
            r4.<init>(r6)     // Catch:{ IOException -> 0x00d1 }
        L_0x00c7:
            java.lang.String r2 = r4.readLine()     // Catch:{ IOException -> 0x00d1 }
            if (r2 == 0) goto L_0x00d5
            r12.append(r2)     // Catch:{ IOException -> 0x00d1 }
            goto L_0x00c7
        L_0x00d1:
            r2 = move-exception
            r2.printStackTrace()
        L_0x00d5:
            java.lang.String r12 = r12.toString()
            java.lang.String r2 = "[APPNAME]"
            java.lang.String r4 = com.dof100.morsenotifier.App.f286e
            java.lang.String r12 = r12.replace(r2, r4)
            java.lang.String r2 = "[APPVERSION]"
            java.lang.String r4 = com.dof100.morsenotifier.App.f287f
            java.lang.String r12 = r12.replace(r2, r4)
            java.lang.String r2 = "[VERTICALALIGN]"
            java.lang.String r12 = r12.replace(r2, r3)
            java.lang.String r2 = "[APPPLAYSTORE]"
            java.lang.String r3 = com.dof100.morsenotifier.App.f293l
            java.lang.String r12 = r12.replace(r2, r3)
            java.lang.String r2 = "[APPPLAYSTOREPRO]"
            java.lang.String r3 = com.dof100.morsenotifier.App.f294m
            java.lang.String r12 = r12.replace(r2, r3)
            boolean r2 = com.dof100.morsenotifier.App.f283b
            r3 = 2
            if (r2 == 0) goto L_0x0112
            java.lang.String r2 = "FREE"
            java.lang.String r12 = com.dof100.morsenotifier.C0163v.m561a((java.lang.String) r12, (java.lang.String) r2, (int) r1)
            java.lang.String r1 = "PRO"
            java.lang.String r12 = com.dof100.morsenotifier.C0163v.m561a((java.lang.String) r12, (java.lang.String) r1, (int) r3)
        L_0x0110:
            r7 = r12
            goto L_0x011f
        L_0x0112:
            java.lang.String r2 = "FREE"
            java.lang.String r12 = com.dof100.morsenotifier.C0163v.m561a((java.lang.String) r12, (java.lang.String) r2, (int) r3)
            java.lang.String r2 = "PRO"
            java.lang.String r12 = com.dof100.morsenotifier.C0163v.m561a((java.lang.String) r12, (java.lang.String) r2, (int) r1)
            goto L_0x0110
        L_0x011f:
            java.lang.String r6 = ""
            java.lang.String r8 = "text/html"
            java.lang.String r9 = "UTF-8"
            java.lang.String r10 = ""
            r5.loadDataWithBaseURL(r6, r7, r8, r9, r10)
        L_0x012a:
            r11.setContentView(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dof100.morsenotifier.ActivityHTML.onCreate(android.os.Bundle):void");
    }
}
