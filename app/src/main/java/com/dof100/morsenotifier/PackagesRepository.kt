package com.dof100.morsenotifier

import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import java.util.Locale

internal class PackagesRepository constructor(var a: String = "", var b: String? = "") {
  constructor(packageManager: PackageManager?, applicationInfo: ApplicationInfo?) : this() {
    if (applicationInfo == null) return

    run label40@{
      a = applicationInfo.packageName
      val appLabel: String
      if (packageManager != null) {
        try {
          appLabel = packageManager.getApplicationLabel(applicationInfo) as String
        } catch (_: Exception) {
          return@label40
        }
      } else {
        appLabel = ""
      }
      try {
        b = appLabel
        if (b!!.startsWith("com.android.")) {
          b = "${b!!.substring(12, 13).uppercase(Locale.getDefault())}${b!!.substring(13)}"
        }
      } catch (_: Exception) {
        return@label40
      }
      try {
        b = "$b (${applicationInfo.packageName})"
        return
      } catch (_: Exception) {
      }
    }
    b = " (${applicationInfo.packageName})"
  }
}
