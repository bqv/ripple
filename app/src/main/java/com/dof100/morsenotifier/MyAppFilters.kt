package com.dof100.morsenotifier

import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import com.dof100.morsenotifier.MyLog.log
import java.util.Collections

internal class MyAppFilters constructor(var1: Context) {
  val mList: MutableList<PackagesRepository?> = ArrayList<PackagesRepository?>()

  init {
    val packageManager: PackageManager? = var1.getPackageManager()
    var installedApps: List<ApplicationInfo?> = ArrayList<ApplicationInfo?>()
    if (packageManager != null) {
      installedApps = packageManager.getInstalledApplications(128)
    }
    val iterator: Iterator<ApplicationInfo?> = installedApps.iterator()
    while (iterator.hasNext()) {
      val packagesRepository: PackagesRepository = PackagesRepository(packageManager, iterator.next())
      mList.add(packagesRepository)
    }
    Collections.sort(mList, object : Comparator<PackagesRepository?> {
      public override fun compare(left: PackagesRepository?, right: PackagesRepository?): Int {
        return left!!.b!!.compareTo((right!!.b)!!)
      }
    })
    mList.add(0, PackagesRepository("All apps", "All apps"))
    mList.add(1, PackagesRepository("All system apps", "All system apps"))
    mList.add(2, PackagesRepository("All non-system apps", "All non-system apps"))
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
      0.toByte() -> return 0
      1.toByte() -> return 1
      2.toByte() -> return 2
      else -> {
        log("MyAppFilters.getApplicationInfoIndex")
        var2 = 3
        while (var2 < mList.size) {
          val packagesRepository: PackagesRepository? = mList[var2]
          if (packagesRepository != null && (packagesRepository.a == var1)) {
            return var2
          }
          ++var2
        }
        return -1
      }
    }
  }

  fun a(): ArrayList<String?> {
    val list = ArrayList<String?>()
    val iterator: Iterator<PackagesRepository?> = mList.iterator()
    while (iterator.hasNext()) {
      list.add((iterator.next() as PackagesRepository).b)
    }
    return list
  }
}
