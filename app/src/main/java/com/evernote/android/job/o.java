package com.evernote.android.job;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build.VERSION;
import java.io.File;

final class o implements DatabaseErrorHandler {
   private static final com.evernote.android.job.util.d a = new com.evernote.android.job.util.d("DatabaseErrorHandler");

   void a(Context var1, File var2) {
      var1.deleteDatabase(var2.getName());
   }

   @TargetApi(16)
   void a(File var1) {
      SQLiteDatabase.deleteDatabase(var1);
   }

   void a(String var1) {
      if (!var1.equalsIgnoreCase(":memory:")) {
         if (var1.trim().length() == 0) {
            return;
         }

         com.evernote.android.job.util.d var2 = a;
         StringBuilder var3 = new StringBuilder();
         var3.append("deleting the database file: ");
         var3.append(var1);
         var2.d(var3.toString());

         try {
            File var6 = new File(var1);
            if (VERSION.SDK_INT >= 16) {
               this.a(var6);
               return;
            }

            this.a(JobManager.instance().getContext(), var6);
            return;
         } catch (Exception var4) {
            com.evernote.android.job.util.d var5 = a;
            var3 = new StringBuilder();
            var3.append("delete failed: ");
            var3.append(var4.getMessage());
            var5.a(var4, var3.toString());
         }
      }

   }

   public void onCorruption(SQLiteDatabase param1) {
      // $FF: Couldn't be decompiled
   }
}
