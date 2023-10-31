package com.dof100.morsenotifier

import android.content.Context
import android.content.SharedPreferences
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import android.graphics.Color
import android.util.AttributeSet
import com.dof100.morsenotifier.MyLog.log
import java.util.Locale

internal object Utils {
  fun a(var0: Int, var1: Int, var2: Int, var3: Int): Int {
    var var0 = var0
    var var2 = var2
    val var4 = var2 * 60
    var2 = Math.abs(var0 * 60 + var1 - var4 - var3)
    val var5 = Math.abs((var0 - 24) * 60 + var1 - var4 - var3)
    var0 = Math.abs((var0 + 24) * 60 + var1 - var4 - var3)
    return Math.min(Math.min(var2, var5), var0)
  }

  fun a(var0: String, var1: String?, var2: Int, var3: Int, var4: Int): Int {
    var var0 = var0
    var var2 = var2
    val var5 = StringBuilder()
    var5.append("<")
    var5.append(var1)
    val var6 = var0.indexOf(var5.toString())
    return if (var6 < 0) {
      var2
    } else {
      val var7 = var0.indexOf(">", var6)
      var var8 = var6 + 2
      if (var7 <= var8) {
        var2
      } else if (var7 >= var6 + 8) {
        var2
      } else {
        var0 = var0.substring(var8, var7)
        var8 = try {
          var0.toInt()
        } catch (var9: NumberFormatException) {
          log(
            String.format(
              Locale.US,
              "getTagValue ERROR could not convers %s to int",
              var0
            )
          )
          return var2
        }
        var2 = var8
        if (var8 < var3) {
          var2 = var3
        }
        if (var2 > var4) var4 else var2
      }
    }
  }

  fun a(
    var0: Context,
    var1: SharedPreferences,
    var2: String?,
    var3: String?,
    var4: String?,
    var5: String?
  ): String {
    val var6 = var0.resources
    val var7 = StringBuilder()
    var7.append(var2)
    var7.append(var4)
    var var8 = var6.getIdentifier(var7.toString(), "string", var0.packageName)
    return if (var8 != 0) {
      var6.getString(var8)
    } else {
      val var9 = StringBuilder()
      var9.append(var2)
      var9.append(var5)
      var8 = var6.getIdentifier(var9.toString(), "string", var0.packageName)
      if (var8 != 0) {
        var6.getString(var8)
      } else if (var3 != null && !var3.isEmpty()) {
        if (var1.all[var3] is Boolean) java.lang.Boolean.toString(
          var1.getBoolean(
            var3,
            java.lang.Boolean.parseBoolean("0")
          )
        ) else var1.getString(var3, "0")!!
      } else {
        log(
          String.format(
            Locale.US,
            "prefGetDefaultValue key %s ERROR: default value not found in resources...",
            var2
          )
        )
        "0"
      }
    }
  }

  fun a(var0: Context, var1: AttributeSet, var2: String?, var3: String?, var4: String): String {
    val var5 = var0.resources
    val var7 = var1.getAttributeValue(var2, var3)
    return if (var7 == null) {
      var4
    } else {
      val var6: Byte
      var6 = if (var7.startsWith("@string/")) {
        8
      } else {
        if (!var7.startsWith("@")) {
          return var7
        }
        1
      }
      var5.getString(
        var5.getIdentifier(
          var7.substring(var6.toInt()),
          "string",
          var0.packageName
        )
      )
    }
  }

  fun a(var0: Context, var1: String?): String? {
    val var2 = var0.packageManager
    return if (var2 == null) {
      var1
    } else {
      val var4: ApplicationInfo?
      var4 = try {
        var2.getApplicationInfo(var1!!, 0)
      } catch (var3: PackageManager.NameNotFoundException) {
        var3.printStackTrace()
        null
      }
      if (var4 == null) {
        var1
      } else {
        val var5 = var2.getApplicationLabel(var4) as String
        var5 ?: var1
      }
    }
  }

  fun a(var0: String?): String? {
    var var0 = var0
    var var1 = var0!!.indexOf("<")
    var var2 = var0.indexOf(">")
    var var5: Int
    var var11: Boolean
    if (var1 >= 0 && var2 > var1) {
      val var3: Byte = 0
      var11 = false
      var5 = var1
      var1 = var3.toInt()
    } else {
      val var4: Byte = 0
      var5 = var1
      var1 = var4.toInt()
      var11 = true
    }
    while (!var11) {
      var var6 = var0!!.substring(0, var5)
      var0 = var0.substring(var2 + 1)
      val var7 = StringBuilder()
      var7.append(var6)
      var7.append(var0)
      var6 = var7.toString()
      val var8 = var6.indexOf("<")
      val var10 = var6.indexOf(">")
      if (var8 < 0 || var10 <= var8) {
        var11 = true
      }
      val var9 = var1 + 1
      var0 = var6
      var5 = var8
      var2 = var10
      var1 = var9
      if (var9 > 10) {
        var0 = var6
        var5 = var8
        var2 = var10
        var1 = var9
        var11 = true
      }
    }
    return var0
  }

  fun a(var0: String?, var1: Char): String {
    return if (var0 == null) {
      ""
    } else if (var0.isEmpty()) {
      ""
    } else {
      var var2 = StringBuilder()
      var2.append("")
      var2.append(var0[0])
      var var5 = var2.toString()
      for (var3 in 1 until var0.length) {
        var var4: StringBuilder
        if (Character.isDigit(var0[var3 - 1]) && Character.isDigit(var0[var3])) {
          var4 = StringBuilder()
          var4.append(var5)
          var4.append(var1)
          var2 = var4
        } else {
          var4 = StringBuilder()
          var4.append(var5)
          var2 = var4
        }
        var2.append(var0[var3])
        var5 = var2.toString()
      }
      var5
    }
  }

  fun XMLDo(var0: String, var1: String, var2: Int): String {
    var var1 = var1
    var var3 = StringBuilder()
    var3.append("<")
    var3.append(var1)
    var3.append(">")
    val var4 = var0.indexOf(var3.toString())
    var3 = StringBuilder()
    var3.append("</")
    var3.append(var1)
    var3.append(">")
    val var5 = var0.indexOf(var3.toString())
    return if (var4 < 0 && var5 < 0) {
      var0
    } else {
      run label17@{
        val var6: StringBuilder
        val var7: String
        when (var2) {
          1 -> {
            var6 = StringBuilder()
            var7 = var0.substring(0, var4)
          }

          2 -> {
            var6 = StringBuilder()
            var6.append(var0.substring(0, var4))
            var7 = var0.substring(var1.length + var4 + 2, var5)
          }

          else -> {
            var1 = var0
            return@label17
          }
        }
        var6.append(var7)
        var6.append(var0.substring(var1.length + var5 + 3))
        var1 = var6.toString()
      }
      log(
        String.format(
          Locale.US,
          "Utils.XMLDo Input = %s, p1=%d, p2=%d , res=%s",
          var0,
          var4,
          var5,
          var1
        )
      )
      var1
    }
  }

  fun a(var0: String, var1: String?, var2: Boolean): Boolean {
    return a(var0, var1, if (var2) 1 else 0, 0, 1) > 0
  }

  fun prefGetString(
    var0: Context,
    var1: SharedPreferences,
    var2: String?,
    var3: String?,
    var4: String?,
    var5: String?
  ): String? {
    val var7: String
    if (var1.getString(var2, "IMPOSSIBLE!STRING") == "IMPOSSIBLE!STRING") {
      log(
        String.format(
          Locale.US,
          "prefGetString     key %s not initialized. Initializing now...",
          var2
        )
      )
      val var6 = var1.edit()
      var7 = a(var0, var1, var2, var3, var4, var5)
      var6.putString(var2, var7)
      var6.apply()
    } else {
      var7 = "0"
    }
    return var1.getString(var2, var7)
  }

  fun prefGetInt(
    var0: Context,
    var1: SharedPreferences,
    var2: String?,
    var3: String?,
    var4: String?,
    var5: String?
  ): Int {
    val var7: String
    if (var1.getString(var2, "IMPOSSIBLE!STRING") == "IMPOSSIBLE!STRING") {
      log(
        String.format(
          Locale.US,
          "prefGetInt      key %s not initialized. Initializing now...",
          var2
        )
      )
      val var6 = var1.edit()
      var7 = a(var0, var1, var2, var3, var4, var5)
      var6.putString(var2, var7)
      var6.apply()
    } else {
      var7 = "0"
    }
    return var1.getString(var2, var7)!!.toInt()
  }

  fun prefGetBoolean(
    var0: Context,
    var1: SharedPreferences,
    var2: String?,
    var3: String?,
    var4: String?,
    var5: String?
  ): Boolean {
    val var7: Boolean
    if (!var1.getBoolean(var2, false) && var1.getBoolean(var2, true)) {
      log(
        String.format(
          Locale.US,
          "prefGetBoolean    key %s not initialized. Initializing now...",
          var2
        )
      )
      val var6 = var1.edit()
      var7 = java.lang.Boolean.parseBoolean(a(var0, var1, var2, var3, var4, var5))
      var6.putBoolean(var2, var7)
      var6.apply()
    } else {
      var7 = false
    }
    return var1.getBoolean(var2, var7)
  }

  fun prefGetColor(
    var0: Context,
    var1: SharedPreferences,
    var2: String?,
    var3: String?,
    var4: String?,
    var5: String?
  ): Int {
    val var7: String
    if (var1.getString(var2, "IMPOSSIBLE!STRING") == "IMPOSSIBLE!STRING") {
      log(
        String.format(
          Locale.US,
          "prefGetColor    key %s not initialized. Initializing now...",
          var2
        )
      )
      val var6 = var1.edit()
      var7 = a(var0, var1, var2, var3, var4, var5)
      var6.putString(var2, var7)
      var6.apply()
    } else {
      var7 = "0xFF000000"
    }
    return Color.parseColor(var1.getString(var2, var7))
  }
}
