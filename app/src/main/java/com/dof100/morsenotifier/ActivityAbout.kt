package com.dof100.morsenotifier

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class ActivityAbout constructor() : Activity() {
  private var a: String = ""
  private var b: String = ""
  private var c: String = ""
  private var d: String? = ""
  private var e: String? = ""
  private fun a() {
    a = this.getString(getApplicationInfo().labelRes)
    val var1: String = getPackageName()
    val var2: PackageManager = getPackageManager()
    try {
      val var4: PackageInfo = var2.getPackageInfo(var1, 0)
      b = var4.versionName
      c = Integer.toString(var4.versionCode)
    } catch (var3: PackageManager.NameNotFoundException) {
      var3.printStackTrace()
    }
    d = App.Companion.l
    e = App.Companion.m
  }

  override fun onCreate(var1: Bundle?) {
    super.onCreate(var1)
    a()
    val var2: WebViewClient = object : WebViewClient() {
      public override fun shouldOverrideUrlLoading(
        var1: WebView,
        var2: WebResourceRequest
      ): Boolean {
        val var3: Intent = Intent("android.intent.action.VIEW", var2.getUrl())
        this@ActivityAbout.startActivity(var3)
        return true
      }

      public override fun shouldOverrideUrlLoading(var1: WebView, var2: String): Boolean {
        val var3: Intent = Intent("android.intent.action.VIEW", Uri.parse(var2))
        this@ActivityAbout.startActivity(var3)
        return true
      }
    }
    val var4: WebView = WebView(this)
    var4.setWebViewClient(var2)
    var4.setBackgroundColor(Color.parseColor("#000000"))
    this.setContentView(var4)
    var var6 = "<html><body><center><p style='color:white'>$a<p style='color:white'> v. $b($c)<p style='color:white'>Copyright (c)2014-2016, <a style='color:#FFD0D0' href='http://100dof.com'>100dof.com</a></center><p style='color:white'>"
    var6 = "${var6}Acknowledgements: "
    var6 = "${var6}This application was created using the <a style='color:#FFD0D0' href='http://developer.android.com/sdk/index.html'>Android SDK</a> and <a style='color:#FFD0D0' href='http://www.eclipse.org/'>Eclipse</a>. "
    var6 = "$var6<br>"
    val var7 = "$var6<p style='color:white'>Please, don't forget to <a style='color:#FFD0D0' href='$d'>rate this app at google play store</a>!"
    var6 = "$var7<br>"
    var6 = "$var6<p style='color:white'>If you like this app, please also check <a style='color:#FFD0D0' href='$e'>the pro version</a> at google play store!"
    var4.loadData("$var6</body></html>", "text/html", "utf-8")
  }
}
