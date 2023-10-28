package com.dof100.morsenotifier;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

class g extends com.evernote.android.job.c {
   public static void a() {
      com.dof100.morsenotifier.i.a("MyJob.scheduleNextChime");
      com.evernote.android.job.i var0 = com.evernote.android.job.i.a();
      com.dof100.morsenotifier.i.a("MyJob.scheduleNextChime List of existing Job Requests: ");
      Iterator var1 = var0.b().iterator();

      while(var1.hasNext()) {
         com.evernote.android.job.m var15 = (com.evernote.android.job.m)var1.next();
         Date var2 = new Date(var15.x());
         com.dof100.morsenotifier.i.a(String.format(Locale.US, "   MyJob.scheduleNextChime Job tag=%15s id=%d t=%s start=%d min", var15.d(), var15.c(), var2.toString(), var15.e() / 1000L / 60L));
      }

      Calendar var16 = Calendar.getInstance();
      int var3 = var16.get(11);
      int var4 = var16.get(12);
      int var5 = var16.get(13);
      int var6 = 60 - var5;
      int var7 = 60 - var4 - 1;
      int var8 = (var3 + 1) % 24;
      long var9 = TimeUnit.SECONDS.toMillis((long)var6);
      long var11 = TimeUnit.MINUTES.toMillis((long)var7);
      long var13 = TimeUnit.HOURS.toMillis((long)0);
      com.dof100.morsenotifier.i.a(String.format(Locale.US, "MyJob.scheduleNextChime  time=%02d:%02d:%02d   Next chime at %02d:%02d:%02d,  which is %02d:%02d:%02d from now", var3, var4, var5, var8, 0, 0, 0, var7, var6));
      com.evernote.android.job.a.a.b var17 = new com.evernote.android.job.a.a.b();
      var17.a("EXTRASWHAT", 1);
      var17.a("EXTRASHOUR", var8);
      var17.a("EXTRASMIN", 0);
      (new com.evernote.android.job.m.b("TAG_CHIME")).a(var9 + var11 + var13).b(true).a(var17).a(false).a().D();
   }

   public static void a(Context var0) {
      if (!App.b) {
         com.dof100.morsenotifier.i.a("MyJob.scheduleNextReminder App!=pro exiting...");
      } else {
         com.dof100.morsenotifier.i.a("MyJob.scheduleNextReminder");
         com.evernote.android.job.i var1 = com.evernote.android.job.i.a();
         com.dof100.morsenotifier.i.a("MyJob.scheduleNextReminder List of existing job requests: ");
         Iterator var2 = var1.b().iterator();

         while(var2.hasNext()) {
            com.evernote.android.job.m var3 = (com.evernote.android.job.m)var2.next();
            Date var5 = new Date(var3.x());
            com.dof100.morsenotifier.i.a(String.format(Locale.US, "   MyJob.scheduleNextReminder Job tag=%15s id=%d t=%s start=%d min", var3.d(), var3.c(), var5.toString(), var3.e() / 1000L / 60L));
         }

         p var6 = (new q(var0)).a();
         if (var6 != null) {
            com.dof100.morsenotifier.i.a(String.format(Locale.US, "MyJob.scheduleNextReminder Next reminder %s", var6.c()));
            com.evernote.android.job.a.a.b var4 = new com.evernote.android.job.a.a.b();
            var4.a("EXTRASWHAT", 2);
            var4.a("EXTRASHOUR", var6.a);
            var4.a("EXTRASMIN", var6.b);
            var4.a("EXTRASTEXT", var6.a());
            (new com.evernote.android.job.m.b("TAG_REMINDER")).a(var6.g).b(true).a(var4).a(false).a().D();
         }
      }
   }

   public static void b() {
      com.dof100.morsenotifier.i.a("MyJob.clearAllJobs");
      com.evernote.android.job.i var0 = com.evernote.android.job.i.a();
      com.dof100.morsenotifier.i.a("MyJob.clearAllJobs List of existing job requests before clear: ");
      Iterator var1 = var0.b().iterator();

      Date var3;
      while(var1.hasNext()) {
         com.evernote.android.job.m var2 = (com.evernote.android.job.m)var1.next();
         var3 = new Date(var2.x());
         com.dof100.morsenotifier.i.a(String.format(Locale.US, "   MyJob.clearAllJobs Job tag=%15s id=%d t=%s start=%d min", var2.d(), var2.c(), var3.toString(), var2.e() / 1000L / 60L));
      }

      var0.d();
      com.dof100.morsenotifier.i.a("MyJob.clearAllJobs List of existing job requests after clear: ");
      Iterator var5 = var0.b().iterator();

      while(var5.hasNext()) {
         com.evernote.android.job.m var4 = (com.evernote.android.job.m)var5.next();
         var3 = new Date(var4.x());
         com.dof100.morsenotifier.i.a(String.format(Locale.US, "   MyJob.clearAllJobs Job tag=%15s id=%d t=%s start=%d min", var4.d(), var4.c(), var3.toString(), var4.e() / 1000L / 60L));
      }

   }

   protected com.evernote.android.job.c.b a(com.evernote.android.job.c.a var1) {
      com.dof100.morsenotifier.i.a("MyJob.onRunJob");
      com.evernote.android.job.a.a.b var13 = var1.d();
      int var2 = var13.b("EXTRASHOUR", -1);
      int var3 = var13.b("EXTRASMIN", -1);
      int var4 = var13.b("EXTRASWHAT", -1);
      String var5 = var13.b("EXTRASTEXT", "");
      Context var6 = this.k();
      SharedPreferences var7 = PreferenceManager.getDefaultSharedPreferences(var6);
      Context var8 = this.k();
      String var14;
      if (App.c) {
         var14 = "_morsedef";
      } else {
         var14 = "_voicedef";
      }

      boolean var9 = v.d(var8, var7, "pref_chime_enable", (String)null, var14, "_def");
      var8 = this.k();
      if (App.c) {
         var14 = "_morsedef";
      } else {
         var14 = "_voicedef";
      }

      boolean var10 = v.d(var8, var7, "pref_reminders_enable", (String)null, var14, "_def");
      com.dof100.morsenotifier.i.a(String.format(Locale.US, "MyJob.onRunJob  Time: %02d:%02d  What:%d", var2, var3, var4));
      Intent var15;
      if (var4 == 1 && var9) {
         com.dof100.morsenotifier.i.a("MyJob.onRunJob chime...");
         var15 = new Intent(this.k(), ServiceMain.class);
         var15.putExtra(this.k().getResources().getString(2131492900), this.k().getResources().getString(2131492871));
         var15.putExtra(this.k().getResources().getString(2131492873), var2);
         var15.putExtra(this.k().getResources().getString(2131492874), var3);
         this.k().startService(var15);
      } else if (var4 == 2 && var10) {
         com.dof100.morsenotifier.i.a("MyJob.onRunJob reminder...");
         var15 = new Intent(this.k(), ServiceMain.class);
         var15.putExtra(this.k().getResources().getString(2131492900), this.k().getResources().getString(2131492885));
         var15.putExtra(this.k().getResources().getString(2131492875), var5);
         var15.putExtra(this.k().getResources().getString(2131492873), var2);
         var15.putExtra(this.k().getResources().getString(2131492874), var3);
         this.k().startService(var15);
      }

      com.evernote.android.job.c.b var16;
      try {
         var16 = com.evernote.android.job.c.b.a;
      } finally {
         a();
         a(var6);
      }

      return var16;
   }
}
