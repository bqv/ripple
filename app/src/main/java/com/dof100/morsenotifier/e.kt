package com.dof100.morsenotifier

import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import java.util.Locale

internal class e {
  var a: String = ""
  var b: String? = null

  constructor(var1: PackageManager?, var2: ApplicationInfo?) {
    if (var2 == null) {
      a = ""
      b = ""
    } else {
      var var7: StringBuilder
      run label40@{
        a = var2.packageName
        var var10001: Boolean
        val var6: String
        if (var1 != null) {
          try {
            var6 = var1.getApplicationLabel(var2) as String
          } catch (var5: Exception) {
            var10001 = false
            return@label40
          }
        } else {
          var6 = ""
        }
        try {
          b = var6
          if (b!!.startsWith("com.android.")) {
            var7 = StringBuilder()
            var7.append(b!!.substring(12, 13).uppercase(Locale.getDefault()))
            var7.append(b!!.substring(13))
            b = var7.toString()
          }
        } catch (var4: Exception) {
          var10001 = false
          return@label40
        }
        try {
          var7 = StringBuilder()
          var7.append(b)
          var7.append(" (")
          var7.append(var2.packageName)
          var7.append(")")
          b = var7.toString()
          return
        } catch (var3: Exception) {
          var10001 = false
        }
      }
      var7 = StringBuilder()
      var7.append(" (")
      var7.append(var2.packageName)
      var7.append(")")
      b = var7.toString()
    }
  }

  constructor(var1: String, var2: String?) {
    a = var1
    b = var2
  }
}
