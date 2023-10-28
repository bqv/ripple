package com.dof100.morsenotifier;

import java.util.Locale;

class h implements com.evernote.android.job.f {
   public com.evernote.android.job.c a(String var1) {
      byte var7;
      label24: {
         int var2 = var1.hashCode();
         if (var2 != 702277527) {
            if (var2 == 1483317271 && var1.equals("TAG_CHIME")) {
               var7 = 0;
               break label24;
            }
         } else if (var1.equals("TAG_REMINDER")) {
            var7 = 1;
            break label24;
         }

         var7 = -1;
      }

      g var3;
      Locale var4;
      Object[] var5;
      Locale var6;
      switch(var7) {
      case 0:
         var3 = new g();
         var4 = Locale.US;
         var5 = new Object[]{var1};
         var6 = var4;
         break;
      case 1:
         var3 = new g();
         var4 = Locale.US;
         var5 = new Object[]{var1};
         var6 = var4;
         break;
      default:
         return null;
      }

      i.a(String.format(var6, "MyChimeJobCreator.create Creating job with tag=%s", var5));
      return var3;
   }
}
