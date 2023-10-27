package com.dof100.morsenotifier;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
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

/* renamed from: com.dof100.morsenotifier.i */
class C0140i {

    /* renamed from: a */
    private static boolean f459a = false;

    /* renamed from: a */
    public static void m497a(final Activity activity) {
        m501a("MyLog.logShow");
        WebView webView = new WebView(activity);
        webView.getSettings().setDefaultTextEncodingName("UTF-8");
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setBuiltInZoomControls(true);
        final File file = new File(activity.getFilesDir(), "notif_log.txt");
        if (file.exists()) {
            m501a("MyLog.logShow " + file.getAbsolutePath());
            webView.loadUrl("file:///" + file);
        } else {
            m501a("MyLog.logShow: file not found: " + file);
        }
        webView.setWebViewClient(new WebViewClient() {
            @TargetApi(24)
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(webResourceRequest.getUrl().toString())));
                return true;
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return true;
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle("Log file");
        builder.setView(webView);
        builder.setCancelable(false);
        builder.setPositiveButton("Send", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                C0140i.m501a("MyLog.logShow: creating email");
                StringBuilder sb = new StringBuilder();
                sb.append("The log file below is about to be sent via email to 100dof.com\n");
                sb.append("for debugging purposes. \n");
                sb.append("Please take a minute to delete any sensitive personal\n");
                sb.append("information before sending it.\n");
                sb.append("\n");
                sb.append(String.format(Locale.US, "OS  : Android %s\n", new Object[]{Build.VERSION.RELEASE}));
                sb.append(String.format(Locale.US, "App: %s\n", new Object[]{activity.getPackageName()}));
                sb.append("\n");
                sb.append("--- LOG STARTS HERE --- \n");
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                        sb.append(10);
                    }
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                C0140i.m501a("MyLog.logShow: Creating intent to open email cleint");
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("message/rfc822");
                intent.putExtra("android.intent.extra.EMAIL", new String[]{"support@100dof.com"});
                intent.putExtra("android.intent.extra.SUBJECT", "Log file: " + activity.getApplicationInfo().packageName);
                intent.putExtra("android.intent.extra.TEXT", sb.toString());
                try {
                    activity.startActivity(Intent.createChooser(intent, "Send email..."));
                } catch (ActivityNotFoundException unused) {
                    C0140i.m501a("MyLog.logShow: There are no email clients installed");
                    C0140i.m502b(activity, "There are no email clients installed.");
                }
            }
        });
        builder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog create = builder.create();
        webView.invalidate();
        webView.setVisibility(8);
        webView.setVisibility(0);
        webView.invalidate();
        create.show();
    }

    /* renamed from: a */
    public static void m498a(Context context) {
        m501a("MyLog.logClear");
        try {
            FileWriter fileWriter = new FileWriter(new File(context.getFilesDir(), "notif_log.txt"), false);
            fileWriter.append(String.format(Locale.US, "Log file created on %s\n", new Object[]{DateFormat.getDateTimeInstance().format(new Date())}));
            fileWriter.append(String.format(Locale.US, "Android version: %s\n", new Object[]{Integer.valueOf(Build.VERSION.SDK_INT)}));
            fileWriter.append(String.format(Locale.US, "App: %s\n", new Object[]{context.getPackageName()}));
            fileWriter.flush();
            fileWriter.close();
            m500a(context, "MyLog.logClear OK");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m499a(Context context, Boolean bool) {
        f459a = bool.booleanValue();
        m500a(context, bool.booleanValue() ? "Log Enabled" : "Log Disabled");
    }

    /* renamed from: a */
    public static void m500a(Context context, String str) {
        if (f459a && context != null) {
            try {
                FileWriter fileWriter = new FileWriter(new File(context.getFilesDir(), "notif_log.txt"), true);
                fileWriter.append(String.format(Locale.US, "%s:%s\r\n", new Object[]{DateFormat.getDateTimeInstance().format(new Date()), str}));
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m501a(String str) {
        m500a((Context) null, str);
    }

    /* renamed from: b */
    public static void m502b(final Context context, final String str) {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public void run() {
                Toast.makeText(context, str, 1).show();
            }
        });
        m501a("TOAST: " + str);
    }
}
