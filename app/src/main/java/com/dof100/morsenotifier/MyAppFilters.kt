package com.dof100.morsenotifier

import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import com.dof100.morsenotifier.MyLog.log
import java.util.Collections

internal class MyAppFilters constructor(var1: Context) {
  val a: MutableList<Any?> = ArrayList<Any?>()

  init {
    val var2: ArrayList<Any?> = ArrayList<Any?>()
    val var3: PackageManager? = var1.getPackageManager()
    var var4: Any = var2
    if (var3 != null) {
      var4 = var3.getInstalledApplications(128)
    }
    val var5: Iterator<Any?> = (var4 as List<Any?>).iterator()
    while (var5.hasNext()) {
      val var6: e = e(var3, var5.next() as ApplicationInfo?)
      a.add(var6)
    }
    Collections.sort(a, object : Comparator<Any?> {
      fun a(var1: e?, var2: e?): Int {
        return var1!!.b!!.compareTo((var2!!.b)!!)
      }

      // $FF: synthetic method
      public override fun compare(var1: Any?, var2: Any?): Int {
        return this.a(var1 as e?, var2 as e?)
      }
    })
    a.add(0, e("All apps", "All apps"))
    a.add(1, e("All system apps", "All system apps"))
    a.add(2, e("All non-system apps", "All non-system apps"))
  }

  fun a(var1: String?): Int {
    var var2: Int
    var var4: Byte
    run label42@{
      var2 = var1.hashCode()
      if (var2 != 1354875300) {
        if (var2 != 1655429668) {
          if (var2 == 1804173745 && (var1 == "All apps")) {
            var4 = 0
            return@label42
          }
        } else if ((var1 == "All non-system apps")) {
          var4 = 2
          return@label42
        }
      } else if ((var1 == "All system apps")) {
        var4 = 1
        return@label42
      }
      var4 = -1
    }
    when (var4) {
      0 as Byte -> return 0
      1 as Byte -> return 1
      2 as Byte -> return 2
      else -> {
        log("MyAppFilters.getApplicationInfoIndex")
        var2 = 3
        while (var2 < a.size) {
          val var3: e? = a.get(var2) as e?
          if (var3 != null && (var3.a == var1)) {
            return var2
          }
          ++var2
        }
        return -1
      }
    }
  }

  fun a(): ArrayList<Any?> {
    val var1: ArrayList<Any?> = ArrayList<Any?>()
    val var2: Iterator<Any?> = a.iterator()
    while (var2.hasNext()) {
      var1.add((var2.next() as e).b)
    }
    return var1
  }
}
