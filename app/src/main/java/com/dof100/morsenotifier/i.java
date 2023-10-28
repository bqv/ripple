package com.dof100.morsenotifier;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Build.VERSION;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

class i {
   private static boolean a;

   public static void a(final Activity var0) {
      a("MyLog.logShow");
      WebView var1 = new WebView(var0);
      var1.getSettings().setDefaultTextEncodingName("UTF-8");
      var1.getSettings().setLoadWithOverviewMode(true);
      var1.getSettings().setUseWideViewPort(true);
      var1.getSettings().setBuiltInZoomControls(true);
      final File var2 = new File(var0.getFilesDir(), "notif_log.txt");
      StringBuilder var3;
      if (var2.exists()) {
         var3 = new StringBuilder();
         var3.append("MyLog.logShow ");
         var3.append(var2.getAbsolutePath());
         a(var3.toString());
         var3 = new StringBuilder();
         var3.append("file:///");
         var3.append(var2);
         var1.loadUrl(var3.toString());
      } else {
         var3 = new StringBuilder();
         var3.append("MyLog.logShow: file not found: ");
         var3.append(var2);
         a(var3.toString());
      }

      var1.setWebViewClient(new WebViewClient() {
         @TargetApi(24)
         public boolean shouldOverrideUrlLoading(WebView var1, WebResourceRequest var2) {
            Intent var3 = new Intent("android.intent.action.VIEW", Uri.parse(var2.getUrl().toString()));
            var0.startActivity(var3);
            return true;
         }

         public boolean shouldOverrideUrlLoading(WebView var1, String var2) {
            Intent var3 = new Intent("android.intent.action.VIEW", Uri.parse(var2));
            var0.startActivity(var3);
            return true;
         }
      });
      Builder var5 = new Builder(var0);
      var5.setTitle("Log file");
      var5.setView(var1);
      var5.setCancelable(false);
      var5.setPositiveButton("Send", new OnClickListener() {
         public void onClick(DialogInterface var1, int var2x) {
            i.a("MyLog.logShow: creating email");
            StringBuilder var10 = new StringBuilder();
            var10.append("The log file below is about to be sent via email to 100dof.com\n");
            var10.append("for debugging purposes. \n");
            var10.append("Please take a minute to delete any sensitive personal\n");
            var10.append("information before sending it.\n");
            var10.append("\n");
            var10.append(String.format(Locale.US, "OS  : Android %s\n", VERSION.RELEASE));
            var10.append(String.format(Locale.US, "App: %s\n", var0.getPackageName()));
            var10.append("\n");
            var10.append("--- LOG STARTS HERE --- \n");

            label42: {
               IOException var10000;
               label41: {
                  BufferedReader var3;
                  boolean var10001;
                  try {
                     FileReader var4 = new FileReader(var2);
                     var3 = new BufferedReader(var4);
                  } catch (IOException var9) {
                     var10000 = var9;
                     var10001 = false;
                     break label41;
                  }

                  while(true) {
                     String var13;
                     try {
                        var13 = var3.readLine();
                     } catch (IOException var7) {
                        var10000 = var7;
                        var10001 = false;
                        break;
                     }

                     if (var13 == null) {
                        try {
                           var3.close();
                           break label42;
                        } catch (IOException var6) {
                           var10000 = var6;
                           var10001 = false;
                           break;
                        }
                     }

                     try {
                        var10.append(var13);
                        var10.append('\n');
                     } catch (IOException var8) {
                        var10000 = var8;
                        var10001 = false;
                        break;
                     }
                  }
               }

               IOException var11 = var10000;
               var11.printStackTrace();
            }

            i.a("MyLog.logShow: Creating intent to open email cleint");
            Intent var12 = new Intent("android.intent.action.SEND");
            var12.setType("message/rfc822");
            var12.putExtra("android.intent.extra.EMAIL", new String[]{"support@100dof.com"});
            StringBuilder var14 = new StringBuilder();
            var14.append("Log file: ");
            var14.append(var0.getApplicationInfo().packageName);
            var12.putExtra("android.intent.extra.SUBJECT", var14.toString());
            var12.putExtra("android.intent.extra.TEXT", var10.toString());

            try {
               var0.startActivity(Intent.createChooser(var12, "Send email..."));
            } catch (ActivityNotFoundException var5) {
               i.a("MyLog.logShow: There are no email clients installed");
               i.b(var0, "There are no email clients installed.");
            }
         }
      });
      var5.setNegativeButton("Close", new OnClickListener() {
         public void onClick(DialogInterface var1, int var2) {
            var1.cancel();
         }
      });
      AlertDialog var4 = var5.create();
      var1.invalidate();
      var1.setVisibility(8);
      var1.setVisibility(0);
      var1.invalidate();
      var4.show();
   }

   public static void a(Context var0) {
      a("MyLog.logClear");
      File var1 = new File(var0.getFilesDir(), "notif_log.txt");

      try {
         FileWriter var2 = new FileWriter(var1, false);
         Locale var3 = Locale.US;
         DateFormat var6 = DateFormat.getDateTimeInstance();
         Date var4 = new Date();
         var2.append(String.format(var3, "Log file created on %s\n", var6.format(var4)));
         var2.append(String.format(Locale.US, "Android version: %s\n", VERSION.SDK_INT));
         var2.append(String.format(Locale.US, "App: %s\n", var0.getPackageName()));
         var2.flush();
         var2.close();
         a(var0, "MyLog.logClear OK");
      } catch (IOException var5) {
         var5.printStackTrace();
      }
   }

   public static void a(Context var0, Boolean var1) {
      a = var1;
      String var2;
      if (var1) {
         var2 = "Log Enabled";
      } else {
         var2 = "Log Disabled";
      }

      a(var0, var2);
   }

   public static void a(Context var0, String var1) {
      if (a && var0 != null) {
         File var2 = new File(var0.getFilesDir(), "notif_log.txt");

         try {
            FileWriter var6 = new FileWriter(var2, true);
            Locale var7 = Locale.US;
            DateFormat var3 = DateFormat.getDateTimeInstance();
            Date var4 = new Date();
            var6.append(String.format(var7, "%s:%s\r\n", var3.format(var4), var1));
            var6.flush();
            var6.close();
            return;
         } catch (IOException var5) {
            var5.printStackTrace();
         }
      }

   }

   public static void a(String var0) {
      a((Context)null, (String)var0);
   }

   public static void b(final Context var0, final String var1) {
      (new Handler(Looper.getMainLooper())).post(new Runnable() {
         public void run() {
            Toast.makeText(var0, var1, 1).show();
         }
      });
      StringBuilder var2 = new StringBuilder();
      var2.append("TOAST: ");
      var2.append(var1);
      a(var2.toString());
   }
}
