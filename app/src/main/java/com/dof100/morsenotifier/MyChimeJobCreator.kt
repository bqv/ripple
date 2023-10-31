package com.dof100.morsenotifier

import com.dof100.morsenotifier.MyLog.log
import com.evernote.android.job.Job
import com.evernote.android.job.JobCreator
import java.util.Locale

internal class MyChimeJobCreator constructor() : JobCreator {
  public override fun create(var1: String): Job? {
    var ret: Byte
    run label24@{ // instanceof
      val var2: Int = var1.hashCode()
      if (var2 != 702277527) {
        if (var2 == 1483317271 && (var1 == "TAG_CHIME")) {
          ret = 0
          return@label24
        }
      } else if ((var1 == "TAG_REMINDER")) {
        ret = 1
        return@label24
      }
      ret = -1
    }
    val job: MyJob
    val locale1: Locale
    val tags: Array<Any>
    val locale2: Locale
    when (ret) {
      0 as Byte -> {
        job = MyJob()
        locale1 = Locale.US
        tags = arrayOf(var1)
        locale2 = locale1
      }

      1 as Byte -> {
        job = MyJob()
        locale1 = Locale.US
        tags = arrayOf(var1)
        locale2 = locale1
      }

      else -> return null
    }
    log(String.format(locale2, "MyChimeJobCreator.create Creating job with tag=%s", *tags))
    return job
  }
}
