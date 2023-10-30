package com.dof100.morsenotifier;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Build.VERSION;
import android.view.View;
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

class MyLog {
   private static boolean enabled;

   public static void logShow(final Activity activity) {
      log("MyLog.logShow");
      WebView webView = new WebView(activity);
      webView.getSettings().setDefaultTextEncodingName("UTF-8");
      webView.getSettings().setLoadWithOverviewMode(true);
      webView.getSettings().setUseWideViewPort(true);
      webView.getSettings().setBuiltInZoomControls(true);
      final File logFile = new File(activity.getFilesDir(), "notif_log.txt");
      StringBuilder logMessage;
      if (logFile.exists()) {
         logMessage = new StringBuilder();
         logMessage.append("MyLog.logShow ");
         logMessage.append(logFile.getAbsolutePath());
         log(logMessage.toString());
         logMessage = new StringBuilder();
         logMessage.append("file:///");
         logMessage.append(logFile);
         webView.loadUrl(logMessage.toString());
      } else {
         logMessage = new StringBuilder();
         logMessage.append("MyLog.logShow: file not found: ");
         logMessage.append(logFile);
         log(logMessage.toString());
      }

      webView.setWebViewClient(new WebViewClient() {
         @TargetApi(24)
         public boolean shouldOverrideUrlLoading(WebView var1, WebResourceRequest var2) {
            Intent var3 = new Intent("android.intent.action.VIEW", Uri.parse(var2.getUrl().toString()));
            activity.startActivity(var3);
            return true;
         }

         public boolean shouldOverrideUrlLoading(WebView var1, String var2) {
            Intent var3 = new Intent("android.intent.action.VIEW", Uri.parse(var2));
            activity.startActivity(var3);
            return true;
         }
      });
      AlertDialog.Builder builder = new AlertDialog.Builder(activity);
      builder.setTitle("Log file");
      builder.setView(webView);
      builder.setCancelable(false);
      builder.setPositiveButton("Send", (var112, var2x) -> {
         MyLog.log("MyLog.logShow: creating email");
         StringBuilder emailMessage = new StringBuilder();
         emailMessage.append("The log file below is about to be sent via email to 100dof.com\n");
         emailMessage.append("for debugging purposes. \n");
         emailMessage.append("Please take a minute to delete any sensitive personal\n");
         emailMessage.append("information before sending it.\n");
         emailMessage.append("\n");
         emailMessage.append(String.format(Locale.US, "OS  : Android %s\n", VERSION.RELEASE));
         emailMessage.append(String.format(Locale.US, "App: %s\n", activity.getPackageName()));
         emailMessage.append("\n");
         emailMessage.append("--- LOG STARTS HERE --- \n");

         label42: {
            IOException ioException;
            label41: {
               BufferedReader reader;
               boolean var10001;
               try {
                  FileReader file = new FileReader(logFile);
                  reader = new BufferedReader(file);
               } catch (IOException e) {
                  ioException = e;
                  var10001 = false;
                  break label41;
               }

               while(true) {
                  String line;
                  try {
                     line = reader.readLine();
                  } catch (IOException e) {
                     ioException = e;
                     var10001 = false;
                     break;
                  }

                  if (line == null) {
                     try {
                        reader.close();
                        break label42;
                     } catch (IOException e) {
                        ioException = e;
                        var10001 = false;
                        break;
                     }
                  }

                  try {
                     emailMessage.append(line);
                     emailMessage.append('\n');
                  } catch (IOException e) {
                     ioException = e;
                     var10001 = false;
                     break;
                  }
               }
            }

            ioException.printStackTrace();
         }

         MyLog.log("MyLog.logShow: Creating intent to open email cleint");
         Intent intent = new Intent("android.intent.action.SEND");
         intent.setType("message/rfc822");
         intent.putExtra("android.intent.extra.EMAIL", new String[]{"support@100dof.com"});
         String subject = "Log file: " + activity.getApplicationInfo().packageName;
         intent.putExtra("android.intent.extra.SUBJECT", subject);
         intent.putExtra("android.intent.extra.TEXT", emailMessage.toString());

         try {
            activity.startActivity(Intent.createChooser(intent, "Send email..."));
         } catch (ActivityNotFoundException var5) {
            MyLog.log("MyLog.logShow: There are no email clients installed");
            MyLog.toast(activity, "There are no email clients installed.");
         }
      });
      builder.setNegativeButton("Close", (var1, var2) -> var1.cancel());
      AlertDialog dialog = builder.create();
      webView.invalidate();
      webView.setVisibility(View.GONE);
      webView.setVisibility(View.VISIBLE);
      webView.invalidate();
      dialog.show();
   }

   public static void logClear(Context context) {
      log("MyLog.logClear");
      File file = new File(context.getFilesDir(), "notif_log.txt");

      try {
         FileWriter writer = new FileWriter(file, false);
         Locale locale = Locale.US;
         DateFormat dateFormat = DateFormat.getDateTimeInstance();
         Date timestamp = new Date();
         writer.append(String.format(locale, "Log file created on %s\n", dateFormat.format(timestamp)));
         writer.append(String.format(Locale.US, "Android version: %s\n", VERSION.SDK_INT));
         writer.append(String.format(Locale.US, "App: %s\n", context.getPackageName()));
         writer.flush();
         writer.close();
         log(context, "MyLog.logClear OK");
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public static void setEnabled(Context context, Boolean enable) {
      enabled = enable;
      log(context, enable ? "Log Enabled" : "Log Disabled");
   }

   public static void log(Context context, String message) {
      if (enabled && context != null) {
         File file = new File(context.getFilesDir(), "notif_log.txt");

         try {
            FileWriter writer = new FileWriter(file, true);
            Locale locale = Locale.US;
            DateFormat dateFormat = DateFormat.getDateTimeInstance();
            Date timestamp = new Date();
            writer.append(String.format(locale, "%s:%s\r\n", dateFormat.format(timestamp), message));
            writer.flush();
            writer.close();
         } catch (IOException e) {
            e.printStackTrace();
         }
      }

   }

   public static void log(String message) {
      log((Context)null, (String)message);
   }

   public static void toast(final Context context, final String message) {
      new Handler(Looper.getMainLooper()).post(() -> Toast.makeText(context, message, Toast.LENGTH_LONG).show());
      log("TOAST: " + message);
   }
}
