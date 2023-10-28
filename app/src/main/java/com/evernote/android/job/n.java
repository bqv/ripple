package com.evernote.android.job;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.util.LruCache;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class n {
   private static final com.evernote.android.job.a.d a = new com.evernote.android.job.a.d("JobStorage");
   private final SharedPreferences b;
   private final n.a c;
   private AtomicInteger d;
   private final Set e;
   private final n.b f;
   private SQLiteDatabase g;
   private final ReadWriteLock h;

   public n(Context var1) {
      this(var1, "evernote_jobs.db");
   }

   public n(Context var1, String var2) {
      this.b = var1.getSharedPreferences("evernote_jobs", 0);
      this.h = new ReentrantReadWriteLock();
      this.c = new n.a();
      this.f = new n.b(var1, var2);
      this.e = this.b.getStringSet("FAILED_DELETE_IDS", new HashSet());
      if (!this.e.isEmpty()) {
         this.e();
      }

   }

   private m a(int param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static Set a(n var0) {
      return var0.e;
   }

   private static void a(Cursor var0) {
      if (var0 != null) {
         try {
            var0.close();
         } catch (Exception var1) {
         }
      }

   }

   private static void a(SQLiteDatabase var0) {
      if (var0 != null && com.evernote.android.job.e.i()) {
         try {
            var0.close();
         } catch (Exception var1) {
         }
      }

   }

   private boolean a(m var1, int var2) {
      this.h.writeLock().lock();

      SQLiteDatabase var3;
      label261: {
         SQLiteDatabase var4;
         Throwable var10000;
         label262: {
            Exception var5;
            boolean var10001;
            label263: {
               label254: {
                  try {
                     this.c.remove(var2);
                     var3 = this.b();
                     break label254;
                  } catch (Exception var34) {
                     var5 = var34;
                  } finally {
                     ;
                  }

                  var3 = null;
                  break label263;
               }

               var4 = var3;

               try {
                  try {
                     var3.delete("jobs", "_id=?", new String[]{String.valueOf(var2)});
                     break label261;
                  } catch (Exception var32) {
                     var5 = var32;
                  }
               } catch (Throwable var33) {
                  var10000 = var33;
                  var10001 = false;
                  break label262;
               }
            }

            var4 = var3;

            try {
               a.b(var5, "could not delete %d %s", var2, var1);
            } catch (Throwable var31) {
               var10000 = var31;
               var10001 = false;
               break label262;
            }

            var4 = var3;

            try {
               this.b(var2);
            } catch (Throwable var30) {
               var10000 = var30;
               var10001 = false;
               break label262;
            }

            a(var3);
            this.h.writeLock().unlock();
            return false;
         }

         Throwable var36 = var10000;
         a(var4);
         this.h.writeLock().unlock();
         throw var36;
      }

      a(var3);
      this.h.writeLock().unlock();
      return true;
   }

   // $FF: synthetic method
   static boolean a(n var0, m var1, int var2) {
      return var0.a(var1, var2);
   }

   private void b(int param1) {
      // $FF: Couldn't be decompiled
   }

   private void c(m var1) {
      this.c.put(var1.c(), var1);
   }

   private boolean c(int var1) {
      Set var2 = this.e;
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label150: {
         boolean var3;
         label149: {
            label148: {
               try {
                  if (!this.e.isEmpty() && this.e.contains(String.valueOf(var1))) {
                     break label148;
                  }
               } catch (Throwable var16) {
                  var10000 = var16;
                  var10001 = false;
                  break label150;
               }

               var3 = false;
               break label149;
            }

            var3 = true;
         }

         label139:
         try {
            return var3;
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label139;
         }
      }

      while(true) {
         Throwable var4 = var10000;

         try {
            throw var4;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            continue;
         }
      }
   }

   // $FF: synthetic method
   static com.evernote.android.job.a.d d() {
      return a;
   }

   private void d(m var1) {
      Object var9 = var1.F();

      SQLiteDatabase var2;
      try {
         var2 = this.b();
      } finally {
         ;
      }

      try {
         if (var2.insertWithOnConflict("jobs", (String)null, (ContentValues)var9, 5) < 0L) {
            var9 = new SQLException("Couldn't insert job request into database");
            throw var9;
         }
      } finally {
         a(var2);
         throw var9;
      }

   }

   private void e() {
      (new Thread("CleanupFinishedJobsThread") {
         public void run() {
            // $FF: Couldn't be decompiled
         }
      }).start();
   }

   public int a() {
      synchronized(this){}

      Throwable var10000;
      label210: {
         boolean var10001;
         try {
            if (this.d == null) {
               AtomicInteger var1 = new AtomicInteger(this.c());
               this.d = var1;
            }
         } catch (Throwable var24) {
            var10000 = var24;
            var10001 = false;
            break label210;
         }

         int var2;
         int var3;
         try {
            var2 = this.d.incrementAndGet();
            var3 = com.evernote.android.job.e.e();
         } catch (Throwable var23) {
            var10000 = var23;
            var10001 = false;
            break label210;
         }

         int var4;
         label198: {
            if (var2 >= var3) {
               var4 = var2;
               if (var2 < 2147480000) {
                  break label198;
               }
            }

            try {
               this.d.set(var3);
               var4 = this.d.incrementAndGet();
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label210;
            }
         }

         label192:
         try {
            this.b.edit().putInt("JOB_ID_COUNTER_v2", var4).apply();
            return var4;
         } catch (Throwable var21) {
            var10000 = var21;
            var10001 = false;
            break label192;
         }
      }

      Throwable var25 = var10000;
      throw var25;
   }

   public m a(int var1) {
      this.h.readLock().lock();

      m var2;
      try {
         var2 = (m)this.c.get(var1);
      } finally {
         this.h.readLock().unlock();
      }

      return var2;
   }

   public Set a(String param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   public void a(m var1) {
      this.h.writeLock().lock();

      try {
         this.d(var1);
         this.c(var1);
      } finally {
         this.h.writeLock().unlock();
      }

   }

   public void a(m param1, ContentValues param2) {
      // $FF: Couldn't be decompiled
   }

   SQLiteDatabase b() {
      if (this.g != null) {
         return this.g;
      } else {
         try {
            SQLiteDatabase var1 = this.f.getWritableDatabase();
            return var1;
         } catch (SQLiteCantOpenDatabaseException var2) {
            a.a((Throwable)var2);
            (new o()).a("evernote_jobs.db");
            return this.f.getWritableDatabase();
         }
      }
   }

   public void b(m var1) {
      this.a(var1, var1.c());
   }

   int c() {
      // $FF: Couldn't be decompiled
   }

   private class a extends LruCache {
      public a() {
         super(30);
      }

      protected m a(Integer var1) {
         return n.this.a(var1, true);
      }

      // $FF: synthetic method
      protected Object create(Object var1) {
         return this.a((Integer)var1);
      }
   }

   private static final class b extends SQLiteOpenHelper {
      private b(Context var1, String var2) {
         super(var1, var2, (CursorFactory)null, 6, new o());
      }

      // $FF: synthetic method
      b(Context var1, String var2, Object var3) {
         this(var1, var2);
      }

      private void a(SQLiteDatabase var1) {
         var1.execSQL("create table jobs (_id integer primary key, tag text not null, startMs integer, endMs integer, backoffMs integer, backoffPolicy text not null, intervalMs integer, requirementsEnforced integer, requiresCharging integer, requiresDeviceIdle integer, exact integer, networkType text not null, extras text, numFailures integer, scheduledAt integer, started integer, flexMs integer, flexSupport integer, lastRun integer, transient integer, requiresBatteryNotLow integer, requiresStorageNotLow integer);");
      }

      private void b(SQLiteDatabase var1) {
         var1.execSQL("alter table jobs add column isTransient integer;");
      }

      private void c(SQLiteDatabase var1) {
         var1.execSQL("alter table jobs add column flexMs integer;");
         var1.execSQL("alter table jobs add column flexSupport integer;");
         ContentValues var2 = new ContentValues();
         var2.put("intervalMs", m.d);
         StringBuilder var3 = new StringBuilder();
         var3.append("intervalMs>0 AND intervalMs<");
         var3.append(m.d);
         var1.update("jobs", var2, var3.toString(), new String[0]);
         var1.execSQL("update jobs set flexMs = intervalMs;");
      }

      private void d(SQLiteDatabase var1) {
         var1.execSQL("alter table jobs add column lastRun integer;");
      }

      private void e(SQLiteDatabase var1) {
         try {
            var1.beginTransaction();
            StringBuilder var2 = new StringBuilder();
            var2.append("create table ");
            var2.append("jobs_new");
            var2.append(" (");
            var2.append("_id");
            var2.append(" integer primary key, ");
            var2.append("tag");
            var2.append(" text not null, ");
            var2.append("startMs");
            var2.append(" integer, ");
            var2.append("endMs");
            var2.append(" integer, ");
            var2.append("backoffMs");
            var2.append(" integer, ");
            var2.append("backoffPolicy");
            var2.append(" text not null, ");
            var2.append("intervalMs");
            var2.append(" integer, ");
            var2.append("requirementsEnforced");
            var2.append(" integer, ");
            var2.append("requiresCharging");
            var2.append(" integer, ");
            var2.append("requiresDeviceIdle");
            var2.append(" integer, ");
            var2.append("exact");
            var2.append(" integer, ");
            var2.append("networkType");
            var2.append(" text not null, ");
            var2.append("extras");
            var2.append(" text, ");
            var2.append("numFailures");
            var2.append(" integer, ");
            var2.append("scheduledAt");
            var2.append(" integer, ");
            var2.append("started");
            var2.append(" integer, ");
            var2.append("flexMs");
            var2.append(" integer, ");
            var2.append("flexSupport");
            var2.append(" integer, ");
            var2.append("lastRun");
            var2.append(" integer);");
            var1.execSQL(var2.toString());
            var2 = new StringBuilder();
            var2.append("INSERT INTO ");
            var2.append("jobs_new");
            var2.append(" SELECT ");
            var2.append("_id");
            var2.append(",");
            var2.append("tag");
            var2.append(",");
            var2.append("startMs");
            var2.append(",");
            var2.append("endMs");
            var2.append(",");
            var2.append("backoffMs");
            var2.append(",");
            var2.append("backoffPolicy");
            var2.append(",");
            var2.append("intervalMs");
            var2.append(",");
            var2.append("requirementsEnforced");
            var2.append(",");
            var2.append("requiresCharging");
            var2.append(",");
            var2.append("requiresDeviceIdle");
            var2.append(",");
            var2.append("exact");
            var2.append(",");
            var2.append("networkType");
            var2.append(",");
            var2.append("extras");
            var2.append(",");
            var2.append("numFailures");
            var2.append(",");
            var2.append("scheduledAt");
            var2.append(",");
            var2.append("isTransient");
            var2.append(",");
            var2.append("flexMs");
            var2.append(",");
            var2.append("flexSupport");
            var2.append(",");
            var2.append("lastRun");
            var2.append(" FROM ");
            var2.append("jobs");
            var1.execSQL(var2.toString());
            var1.execSQL("DROP TABLE jobs");
            var2 = new StringBuilder();
            var2.append("ALTER TABLE ");
            var2.append("jobs_new");
            var2.append(" RENAME TO ");
            var2.append("jobs");
            var1.execSQL(var2.toString());
            var1.execSQL("alter table jobs add column transient integer;");
            var1.setTransactionSuccessful();
         } finally {
            var1.endTransaction();
         }

      }

      private void f(SQLiteDatabase var1) {
         var1.execSQL("alter table jobs add column requiresBatteryNotLow integer;");
         var1.execSQL("alter table jobs add column requiresStorageNotLow integer;");
      }

      public void onCreate(SQLiteDatabase var1) {
         this.a(var1);
      }

      public void onUpgrade(SQLiteDatabase var1, int var2, int var3) {
         for(; var2 < var3; ++var2) {
            switch(var2) {
            case 1:
               this.b(var1);
               break;
            case 2:
               this.c(var1);
               break;
            case 3:
               this.d(var1);
               break;
            case 4:
               this.e(var1);
               break;
            case 5:
               this.f(var1);
               break;
            default:
               throw new IllegalStateException("not implemented");
            }
         }

      }
   }
}
