package com.dof100.morsenotifier;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityAbout extends Activity {
   private String a = "";
   private String b = "";
   private String c = "";
   private String d = "";
   private String e = "";

   private void a() {
      this.a = this.getString(this.getApplicationInfo().labelRes);
      String var1 = this.getPackageName();
      PackageManager var2 = this.getPackageManager();

      try {
         PackageInfo var4 = var2.getPackageInfo(var1, 0);
         this.b = var4.versionName;
         this.c = Integer.toString(var4.versionCode);
      } catch (NameNotFoundException var3) {
         var3.printStackTrace();
      }

      this.d = App.l;
      this.e = App.m;
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.a();
      WebViewClient var2 = new WebViewClient() {
         public boolean shouldOverrideUrlLoading(WebView var1, WebResourceRequest var2) {
            Intent var3 = new Intent("android.intent.action.VIEW", var2.getUrl());
            ActivityAbout.this.startActivity(var3);
            return true;
         }

         public boolean shouldOverrideUrlLoading(WebView var1, String var2) {
            Intent var3 = new Intent("android.intent.action.VIEW", Uri.parse(var2));
            ActivityAbout.this.startActivity(var3);
            return true;
         }
      };
      WebView var4 = new WebView(this);
      var4.setWebViewClient(var2);
      var4.setBackgroundColor(Color.parseColor("#000000"));
      this.setContentView(var4);
      StringBuilder var5 = new StringBuilder();
      var5.append("<html><body><center><p style='color:white'>");
      var5.append(this.a);
      var5.append("<p style='color:white'> v. ");
      var5.append(this.b);
      var5.append("(");
      var5.append(this.c);
      var5.append(")<p style='color:white'>Copyright (c)2014-2016, <a style='color:#FFD0D0' href='http://100dof.com'>100dof.com</a></center><p style='color:white'>");
      String var6 = var5.toString();
      StringBuilder var3 = new StringBuilder();
      var3.append(var6);
      var3.append("Acknowledgements: ");
      var6 = var3.toString();
      var3 = new StringBuilder();
      var3.append(var6);
      var3.append("This application was created using the <a style='color:#FFD0D0' href='http://developer.android.com/sdk/index.html'>Android SDK</a> and <a style='color:#FFD0D0' href='http://www.eclipse.org/'>Eclipse</a>. ");
      var6 = var3.toString();
      var3 = new StringBuilder();
      var3.append(var6);
      var3.append("<br>");
      var6 = var3.toString();
      var3 = new StringBuilder();
      var3.append(var6);
      var3.append("<p style='color:white'>Please, don't forget to <a style='color:#FFD0D0' href='");
      var3.append(this.d);
      var3.append("'>rate this app at google play store</a>!");
      String var7 = var3.toString();
      var5 = new StringBuilder();
      var5.append(var7);
      var5.append("<br>");
      var6 = var5.toString();
      var3 = new StringBuilder();
      var3.append(var6);
      var3.append("<p style='color:white'>If you like this app, please also check <a style='color:#FFD0D0' href='");
      var3.append(this.e);
      var3.append("'>the pro version</a> at google play store!");
      var6 = var3.toString();
      var3 = new StringBuilder();
      var3.append(var6);
      var3.append("</body></html>");
      var4.loadData(var3.toString(), "text/html", "utf-8");
   }
}
