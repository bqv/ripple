package com.dof100.morsenotifier;

import com.evernote.android.job.Job;
import com.evernote.android.job.JobCreator;

import java.util.Locale;

class MyChimeJobCreator implements JobCreator {
   public Job create(String var1) {
      byte ret;
      label24: { // instanceof
         int var2 = var1.hashCode();
         if (var2 != 702277527) {
            if (var2 == 1483317271 && var1.equals("TAG_CHIME")) {
               ret = 0;
               break label24;
            }
         } else if (var1.equals("TAG_REMINDER")) {
            ret = 1;
            break label24;
         }

         ret = -1;
      }

      MyJob job;
      Locale locale1;
      Object[] tags;
      Locale locale2;
      switch(ret) {
      case 0:
         job = new MyJob();
         locale1 = Locale.US;
         tags = new Object[]{var1};
         locale2 = locale1;
         break;
      case 1:
         job = new MyJob();
         locale1 = Locale.US;
         tags = new Object[]{var1};
         locale2 = locale1;
         break;
      default:
         return null;
      }

      MyLog.log(String.format(locale2, "MyChimeJobCreator.create Creating job with tag=%s", tags));
      return job;
   }
}
