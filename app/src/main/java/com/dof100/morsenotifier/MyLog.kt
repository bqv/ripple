package com.dof100.morsenotifier

import android.annotation.TargetApi
import android.app.Activity
import android.app.AlertDialog
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.os.Build.VERSION
import android.os.Handler
import android.os.Looper
import android.view.View
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.io.FileWriter
import java.io.IOException
import java.text.DateFormat
import java.util.Date
import java.util.Locale

internal object MyLog {
  private var enabled = false
  @JvmStatic
  fun logShow(activity: Activity) {
    log("MyLog.logShow")
    val webView = WebView(activity)
    webView.settings.defaultTextEncodingName = "UTF-8"
    webView.settings.loadWithOverviewMode = true
    webView.settings.useWideViewPort = true
    webView.settings.builtInZoomControls = true
    val logFile = File(activity.filesDir, "notif_log.txt")
    var logMessage: StringBuilder
    if (logFile.exists()) {
      logMessage = StringBuilder()
      logMessage.append("MyLog.logShow ")
      logMessage.append(logFile.absolutePath)
      log(logMessage.toString())
      logMessage = StringBuilder()
      logMessage.append("file:///")
      logMessage.append(logFile)
      webView.loadUrl(logMessage.toString())
    } else {
      logMessage = StringBuilder()
      logMessage.append("MyLog.logShow: file not found: ")
      logMessage.append(logFile)
      log(logMessage.toString())
    }
    webView.webViewClient = object : WebViewClient() {
      @TargetApi(24)
      override fun shouldOverrideUrlLoading(
        var1: WebView,
        var2: WebResourceRequest
      ): Boolean {
        val var3 = Intent("android.intent.action.VIEW", Uri.parse(var2.url.toString()))
        activity.startActivity(var3)
        return true
      }

      override fun shouldOverrideUrlLoading(var1: WebView, var2: String): Boolean {
        val var3 = Intent("android.intent.action.VIEW", Uri.parse(var2))
        activity.startActivity(var3)
        return true
      }
    }
    val builder = AlertDialog.Builder(activity)
    builder.setTitle("Log file")
    builder.setView(webView)
    builder.setCancelable(false)
    builder.setPositiveButton("Send") { var112: DialogInterface?, var2x: Int ->
      log("MyLog.logShow: creating email")
      val emailMessage = StringBuilder()
      emailMessage.append("The log file below is about to be sent via email to 100dof.com\n")
      emailMessage.append("for debugging purposes. \n")
      emailMessage.append("Please take a minute to delete any sensitive personal\n")
      emailMessage.append("information before sending it.\n")
      emailMessage.append("\n")
      emailMessage.append(String.format(Locale.US, "OS  : Android %s\n", VERSION.RELEASE))
      emailMessage.append(String.format(Locale.US, "App: %s\n", activity.packageName))
      emailMessage.append("\n")
      emailMessage.append("--- LOG STARTS HERE --- \n")
      run label42@{
        var ioException: IOException
        run label41@{
          val reader: BufferedReader
          var var10001: Boolean
          try {
            val file = FileReader(logFile)
            reader = BufferedReader(file)
          } catch (e: IOException) {
            ioException = e
            var10001 = false
            return@label41
          }
          while (true) {
            var line: String?
            try {
              line = reader.readLine()
            } catch (e: IOException) {
              ioException = e
              var10001 = false
              break
            }
            if (line == null) {
              try {
                reader.close()
                return@label42
              } catch (e: IOException) {
                ioException = e
                var10001 = false
                break
              }
            }
            try {
              emailMessage.append(line)
              emailMessage.append('\n')
            } catch (e: IOException) {
              ioException = e
              var10001 = false
              break
            }
          }
        }
        ioException.printStackTrace()
      }
      log("MyLog.logShow: Creating intent to open email cleint")
      val intent = Intent("android.intent.action.SEND")
      intent.type = "message/rfc822"
      intent.putExtra("android.intent.extra.EMAIL", arrayOf("support@100dof.com"))
      val subject = "Log file: " + activity.applicationInfo.packageName
      intent.putExtra("android.intent.extra.SUBJECT", subject)
      intent.putExtra("android.intent.extra.TEXT", emailMessage.toString())
      try {
        activity.startActivity(Intent.createChooser(intent, "Send email..."))
      } catch (var5: ActivityNotFoundException) {
        log("MyLog.logShow: There are no email clients installed")
        toast(activity, "There are no email clients installed.")
      }
    }
    builder.setNegativeButton("Close") { var1: DialogInterface, var2: Int -> var1.cancel() }
    val dialog = builder.create()
    webView.invalidate()
    webView.visibility = View.GONE
    webView.visibility = View.VISIBLE
    webView.invalidate()
    dialog.show()
  }

  @JvmStatic
  fun logClear(context: Context) {
    log("MyLog.logClear")
    val file = File(context.filesDir, "notif_log.txt")
    try {
      val writer = FileWriter(file, false)
      val locale = Locale.US
      val dateFormat = DateFormat.getDateTimeInstance()
      val timestamp = Date()
      writer.append(
        String.format(
          locale,
          "Log file created on %s\n",
          dateFormat.format(timestamp)
        )
      )
      writer.append(String.format(Locale.US, "Android version: %s\n", VERSION.SDK_INT))
      writer.append(String.format(Locale.US, "App: %s\n", context.packageName))
      writer.flush()
      writer.close()
      log(context, "MyLog.logClear OK")
    } catch (e: IOException) {
      e.printStackTrace()
    }
  }

  @JvmStatic
  fun setEnabled(context: Context?, enable: Boolean) {
    enabled = enable
    log(context, if (enable) "Log Enabled" else "Log Disabled")
  }

  @JvmStatic
  fun log(context: Context?, message: String?) {
    if (enabled && context != null) {
      val file = File(context.filesDir, "notif_log.txt")
      try {
        val writer = FileWriter(file, true)
        val locale = Locale.US
        val dateFormat = DateFormat.getDateTimeInstance()
        val timestamp = Date()
        writer.append(
          String.format(
            locale,
            "%s:%s\r\n",
            dateFormat.format(timestamp),
            message
          )
        )
        writer.flush()
        writer.close()
      } catch (e: IOException) {
        e.printStackTrace()
      }
    }
  }

  @JvmStatic
  fun log(message: String?) {
    log(null as Context?, message)
  }

  @JvmStatic
  fun toast(context: Context?, message: String) {
    Handler(Looper.getMainLooper()).post {
      Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
    log("TOAST: $message")
  }
}
