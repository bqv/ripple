package com.dof100.morsenotifier;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityAbout extends Activity {

    /* renamed from: a */
    private String f181a = "";

    /* renamed from: b */
    private String f182b = "";

    /* renamed from: c */
    private String f183c = "";

    /* renamed from: d */
    private String f184d = "";

    /* renamed from: e */
    private String f185e = "";

    /* renamed from: a */
    private void m375a() {
        this.f181a = getString(getApplicationInfo().labelRes);
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            this.f182b = packageInfo.versionName;
            this.f183c = Integer.toString(packageInfo.versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        this.f184d = App.f293l;
        this.f185e = App.f294m;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m375a();
        C00991 r4 = new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                ActivityAbout.this.startActivity(new Intent("android.intent.action.VIEW", webResourceRequest.getUrl()));
                return true;
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                ActivityAbout.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return true;
            }
        };
        WebView webView = new WebView(this);
        webView.setWebViewClient(r4);
        webView.setBackgroundColor(Color.parseColor("#000000"));
        setContentView(webView);
        webView.loadData(((((((("<html><body><center><p style='color:white'>" + this.f181a + "<p style='color:white'> v. " + this.f182b + "(" + this.f183c + ")<p style='color:white'>Copyright (c)2014-2016, <a style='color:#FFD0D0' href='http://100dof.com'>100dof.com</a></center><p style='color:white'>") + "Acknowledgements: ") + "This application was created using the <a style='color:#FFD0D0' href='http://developer.android.com/sdk/index.html'>Android SDK</a> and <a style='color:#FFD0D0' href='http://www.eclipse.org/'>Eclipse</a>. ") + "<br>") + "<p style='color:white'>Please, don't forget to <a style='color:#FFD0D0' href='" + this.f184d + "'>rate this app at google play store</a>!") + "<br>") + "<p style='color:white'>If you like this app, please also check <a style='color:#FFD0D0' href='" + this.f185e + "'>the pro version</a> at google play store!") + "</body></html>", "text/html", "utf-8");
    }
}
