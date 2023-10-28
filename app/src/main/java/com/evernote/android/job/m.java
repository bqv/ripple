package com.evernote.android.job;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

public final class m {
   public static final m.a a;
   public static final m.d b;
   public static final m.c c;
   public static final long d;
   public static final long e;
   private static final com.evernote.android.job.a.d f;
   private final m.b g;
   private int h;
   private long i;
   private boolean j;
   private boolean k;
   private long l;

   static {
      a = m.a.b;
      b = m.d.a;
      c = new m.c() {
      };
      d = TimeUnit.MINUTES.toMillis(15L);
      e = TimeUnit.MINUTES.toMillis(5L);
      f = new com.evernote.android.job.a.d("JobRequest");
   }

   private m(m.b var1) {
      this.g = var1;
   }

   // $FF: synthetic method
   m(m.b var1, Object var2) {
      this(var1);
   }

   private static Context H() {
      return com.evernote.android.job.i.a().h();
   }

   static long a() {
      return com.evernote.android.job.e.a() ? TimeUnit.MINUTES.toMillis(1L) : d;
   }

   static m a(Cursor var0) {
      m var1 = (new m.b(var0)).a();
      var1.h = var0.getInt(var0.getColumnIndex("numFailures"));
      var1.i = var0.getLong(var0.getColumnIndex("scheduledAt"));
      int var2 = var0.getInt(var0.getColumnIndex("started"));
      boolean var3 = false;
      boolean var4;
      if (var2 > 0) {
         var4 = true;
      } else {
         var4 = false;
      }

      var1.j = var4;
      var4 = var3;
      if (var0.getInt(var0.getColumnIndex("flexSupport")) > 0) {
         var4 = true;
      }

      var1.k = var4;
      var1.l = var0.getLong(var0.getColumnIndex("lastRun"));
      com.evernote.android.job.a.f.a(var1.h, "failure count can't be negative");
      com.evernote.android.job.a.f.a(var1.i, "scheduled at can't be negative");
      return var1;
   }

   static long b() {
      return com.evernote.android.job.e.a() ? TimeUnit.SECONDS.toMillis(30L) : e;
   }

   boolean A() {
      return this.k;
   }

   public boolean B() {
      return this.g.s;
   }

   public Bundle C() {
      return this.g.t;
   }

   public int D() {
      com.evernote.android.job.i.a().a(this);
      return this.c();
   }

   public m.b E() {
      long var1 = this.i;
      com.evernote.android.job.i.a().b(this.c());
      m.b var3 = new m.b(this.g);
      this.j = false;
      if (!this.i()) {
         var1 = com.evernote.android.job.e.g().a() - var1;
         var3.a(Math.max(1L, this.e() - var1), Math.max(1L, this.f() - var1));
      }

      return var3;
   }

   ContentValues F() {
      ContentValues var1 = new ContentValues();
      this.g.a(var1);
      var1.put("numFailures", this.h);
      var1.put("scheduledAt", this.i);
      var1.put("started", this.j);
      var1.put("flexSupport", this.k);
      var1.put("lastRun", this.l);
      return var1;
   }

   m a(boolean var1, boolean var2) {
      m var3 = (new m.b(this.g, var2)).a();
      if (var1) {
         var3.h = this.h + 1;
      }

      try {
         var3.D();
         return var3;
      } catch (Exception var5) {
         f.a((Throwable)var5);
         return var3;
      }
   }

   void a(long var1) {
      this.i = var1;
   }

   void a(boolean var1) {
      this.k = var1;
   }

   void b(boolean var1) {
      this.j = var1;
      ContentValues var2 = new ContentValues();
      var2.put("started", this.j);
      com.evernote.android.job.i.a().e().a(this, var2);
   }

   void b(boolean var1, boolean var2) {
      ContentValues var3 = new ContentValues();
      if (var1) {
         ++this.h;
         var3.put("numFailures", this.h);
      }

      if (var2) {
         this.l = com.evernote.android.job.e.g().a();
         var3.put("lastRun", this.l);
      }

      com.evernote.android.job.i.a().e().a(this, var3);
   }

   public int c() {
      return this.g.b;
   }

   public String d() {
      return this.g.a;
   }

   public long e() {
      return this.g.c;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         m var2 = (m)var1;
         return this.g.equals(var2.g);
      } else {
         return false;
      }
   }

   public long f() {
      return this.g.d;
   }

   public m.a g() {
      return this.g.f;
   }

   public long h() {
      return this.g.e;
   }

   public int hashCode() {
      return this.g.hashCode();
   }

   public boolean i() {
      return this.j() > 0L;
   }

   public long j() {
      return this.g.g;
   }

   public long k() {
      return this.g.h;
   }

   public boolean l() {
      return this.g.i;
   }

   public boolean m() {
      return this.g.j;
   }

   public boolean n() {
      return this.g.k;
   }

   public boolean o() {
      return this.g.l;
   }

   public boolean p() {
      return this.g.m;
   }

   public m.d q() {
      return this.g.o;
   }

   public boolean r() {
      return this.m() || this.n() || this.o() || this.p() || this.q() != b;
   }

   public com.evernote.android.job.a.a.b s() {
      if (this.g.p == null && !TextUtils.isEmpty(this.g.q)) {
         this.g.p = com.evernote.android.job.a.a.b.a(this.g.q);
      }

      return this.g.p;
   }

   public boolean t() {
      return this.g.r;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("request{id=");
      var1.append(this.c());
      var1.append(", tag=");
      var1.append(this.d());
      var1.append(", transient=");
      var1.append(this.B());
      var1.append('}');
      return var1.toString();
   }

   public boolean u() {
      return this.g.n;
   }

   long v() {
      boolean var1 = this.i();
      long var2 = 0L;
      if (var1) {
         return 0L;
      } else {
         switch(this.g()) {
         case a:
            var2 = (long)this.h * this.h();
            break;
         case b:
            if (this.h != 0) {
               var2 = (long)((double)this.h() * Math.pow(2.0D, (double)(this.h - 1)));
            }
            break;
         default:
            throw new IllegalStateException("not implemented");
         }

         return Math.min(var2, TimeUnit.HOURS.toMillis(5L));
      }
   }

   com.evernote.android.job.d w() {
      return this.g.n ? com.evernote.android.job.d.e : com.evernote.android.job.d.c(H());
   }

   public long x() {
      return this.i;
   }

   public int y() {
      return this.h;
   }

   boolean z() {
      return this.j;
   }

   public static enum a {
      a,
      b;
   }

   public static final class b {
      final String a;
      private int b;
      private long c;
      private long d;
      private long e;
      private m.a f;
      private long g;
      private long h;
      private boolean i;
      private boolean j;
      private boolean k;
      private boolean l;
      private boolean m;
      private boolean n;
      private m.d o;
      private com.evernote.android.job.a.a.b p;
      private String q;
      private boolean r;
      private boolean s;
      private Bundle t;

      private b(Cursor var1) {
         this.t = Bundle.EMPTY;
         this.b = var1.getInt(var1.getColumnIndex("_id"));
         this.a = var1.getString(var1.getColumnIndex("tag"));
         this.c = var1.getLong(var1.getColumnIndex("startMs"));
         this.d = var1.getLong(var1.getColumnIndex("endMs"));
         this.e = var1.getLong(var1.getColumnIndex("backoffMs"));

         try {
            this.f = m.a.valueOf(var1.getString(var1.getColumnIndex("backoffPolicy")));
         } catch (Throwable var7) {
            m.f.a(var7);
            this.f = m.a;
         }

         this.g = var1.getLong(var1.getColumnIndex("intervalMs"));
         this.h = var1.getLong(var1.getColumnIndex("flexMs"));
         int var3 = var1.getInt(var1.getColumnIndex("requirementsEnforced"));
         boolean var4 = false;
         boolean var5;
         if (var3 > 0) {
            var5 = true;
         } else {
            var5 = false;
         }

         this.i = var5;
         if (var1.getInt(var1.getColumnIndex("requiresCharging")) > 0) {
            var5 = true;
         } else {
            var5 = false;
         }

         this.j = var5;
         if (var1.getInt(var1.getColumnIndex("requiresDeviceIdle")) > 0) {
            var5 = true;
         } else {
            var5 = false;
         }

         this.k = var5;
         if (var1.getInt(var1.getColumnIndex("requiresBatteryNotLow")) > 0) {
            var5 = true;
         } else {
            var5 = false;
         }

         this.l = var5;
         if (var1.getInt(var1.getColumnIndex("requiresStorageNotLow")) > 0) {
            var5 = true;
         } else {
            var5 = false;
         }

         this.m = var5;
         if (var1.getInt(var1.getColumnIndex("exact")) > 0) {
            var5 = true;
         } else {
            var5 = false;
         }

         this.n = var5;

         try {
            this.o = m.d.valueOf(var1.getString(var1.getColumnIndex("networkType")));
         } catch (Throwable var6) {
            m.f.a(var6);
            this.o = m.b;
         }

         this.q = var1.getString(var1.getColumnIndex("extras"));
         var5 = var4;
         if (var1.getInt(var1.getColumnIndex("transient")) > 0) {
            var5 = true;
         }

         this.s = var5;
      }

      // $FF: synthetic method
      b(Cursor var1, Object var2) {
         this(var1);
      }

      private b(m.b var1) {
         this(var1, false);
      }

      // $FF: synthetic method
      b(m.b var1, Object var2) {
         this(var1);
      }

      private b(m.b var1, boolean var2) {
         this.t = Bundle.EMPTY;
         int var3;
         if (var2) {
            var3 = -8765;
         } else {
            var3 = var1.b;
         }

         this.b = var3;
         this.a = var1.a;
         this.c = var1.c;
         this.d = var1.d;
         this.e = var1.e;
         this.f = var1.f;
         this.g = var1.g;
         this.h = var1.h;
         this.i = var1.i;
         this.j = var1.j;
         this.k = var1.k;
         this.l = var1.l;
         this.m = var1.m;
         this.n = var1.n;
         this.o = var1.o;
         this.p = var1.p;
         this.q = var1.q;
         this.r = var1.r;
         this.s = var1.s;
         this.t = var1.t;
      }

      // $FF: synthetic method
      b(m.b var1, boolean var2, Object var3) {
         this(var1, var2);
      }

      public b(String var1) {
         this.t = Bundle.EMPTY;
         this.a = (String)com.evernote.android.job.a.f.a((CharSequence)var1);
         this.b = -8765;
         this.c = -1L;
         this.d = -1L;
         this.e = 30000L;
         this.f = m.a;
         this.o = m.b;
      }

      private void a(ContentValues var1) {
         label14: {
            var1.put("_id", this.b);
            var1.put("tag", this.a);
            var1.put("startMs", this.c);
            var1.put("endMs", this.d);
            var1.put("backoffMs", this.e);
            var1.put("backoffPolicy", this.f.toString());
            var1.put("intervalMs", this.g);
            var1.put("flexMs", this.h);
            var1.put("requirementsEnforced", this.i);
            var1.put("requiresCharging", this.j);
            var1.put("requiresDeviceIdle", this.k);
            var1.put("requiresBatteryNotLow", this.l);
            var1.put("requiresStorageNotLow", this.m);
            var1.put("exact", this.n);
            var1.put("networkType", this.o.toString());
            String var2;
            if (this.p != null) {
               var2 = this.p.a();
            } else {
               if (TextUtils.isEmpty(this.q)) {
                  break label14;
               }

               var2 = this.q;
            }

            var1.put("extras", var2);
         }

         var1.put("transient", this.s);
      }

      public m.b a(long var1) {
         this.n = true;
         long var3 = var1;
         if (var1 > 6148914691236517204L) {
            m.f.a("exactInMs clamped from %d days to %d days", TimeUnit.MILLISECONDS.toDays(var1), TimeUnit.MILLISECONDS.toDays(6148914691236517204L));
            var3 = 6148914691236517204L;
         }

         return this.a(var3, var3);
      }

      public m.b a(long var1, long var3) {
         this.c = com.evernote.android.job.a.f.b(var1, "startInMs must be greater than 0");
         this.d = com.evernote.android.job.a.f.a(var3, var1, Long.MAX_VALUE, "endInMs");
         if (this.c > 6148914691236517204L) {
            m.f.a("startInMs reduced from %d days to %d days", TimeUnit.MILLISECONDS.toDays(this.c), TimeUnit.MILLISECONDS.toDays(6148914691236517204L));
            this.c = 6148914691236517204L;
         }

         if (this.d > 6148914691236517204L) {
            m.f.a("endInMs reduced from %d days to %d days", TimeUnit.MILLISECONDS.toDays(this.d), TimeUnit.MILLISECONDS.toDays(6148914691236517204L));
            this.d = 6148914691236517204L;
         }

         return this;
      }

      public m.b a(com.evernote.android.job.a.a.b var1) {
         if (var1 == null) {
            this.p = null;
            this.q = null;
            return this;
         } else {
            this.p = new com.evernote.android.job.a.a.b(var1);
            return this;
         }
      }

      public m.b a(boolean var1) {
         this.i = var1;
         return this;
      }

      public m a() {
         com.evernote.android.job.a.f.a((CharSequence)this.a);
         com.evernote.android.job.a.f.b(this.e, "backoffMs must be > 0");
         com.evernote.android.job.a.f.a((Object)this.f);
         com.evernote.android.job.a.f.a((Object)this.o);
         if (this.g > 0L) {
            com.evernote.android.job.a.f.a(this.g, m.a(), Long.MAX_VALUE, "intervalMs");
            com.evernote.android.job.a.f.a(this.h, m.b(), this.g, "flexMs");
            if (this.g < m.d || this.h < m.e) {
               m.f.c("AllowSmallerIntervals enabled, this will crash on Android N and later, interval %d (minimum is %d), flex %d (minimum is %d)", this.g, m.d, this.h, m.e);
            }
         }

         if (this.n && this.g > 0L) {
            throw new IllegalArgumentException("Can't call setExact() on a periodic job.");
         } else if (this.n && this.c != this.d) {
            throw new IllegalArgumentException("Can't call setExecutionWindow() for an exact job.");
         } else if (!this.n || !this.i && !this.k && !this.j && m.b.equals(this.o) && !this.l && !this.m) {
            if (this.g > 0L || this.c != -1L && this.d != -1L) {
               if (this.g > 0L && (this.c != -1L || this.d != -1L)) {
                  throw new IllegalArgumentException("Can't call setExecutionWindow() on a periodic job.");
               } else if (this.g > 0L && (this.e != 30000L || !m.a.equals(this.f))) {
                  throw new IllegalArgumentException("A periodic job will not respect any back-off policy, so calling setBackoffCriteria() with setPeriodic() is an error.");
               } else {
                  if (this.g <= 0L && (this.c > 3074457345618258602L || this.d > 3074457345618258602L)) {
                     m.f.c("Attention: your execution window is too large. This could result in undesired behavior, see https://github.com/evernote/android-job/wiki/FAQ");
                  }

                  if (this.g <= 0L && this.c > TimeUnit.DAYS.toMillis(365L)) {
                     m.f.c("Warning: job with tag %s scheduled over a year in the future", this.a);
                  }

                  if (this.b != -8765) {
                     com.evernote.android.job.a.f.a(this.b, "id can't be negative");
                  }

                  m.b var1 = new m.b(this);
                  if (this.b == -8765) {
                     var1.b = com.evernote.android.job.i.a().e().a();
                     com.evernote.android.job.a.f.a(var1.b, "id can't be negative");
                  }

                  return new m(var1);
               }
            } else {
               throw new IllegalArgumentException("You're trying to build a job with no constraints, this is not allowed.");
            }
         } else {
            throw new IllegalArgumentException("Can't require any condition for an exact job.");
         }
      }

      public m.b b(boolean var1) {
         this.r = var1;
         return this;
      }

      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         } else if (var1 != null) {
            if (this.getClass() != var1.getClass()) {
               return false;
            } else {
               m.b var2 = (m.b)var1;
               return this.b == var2.b;
            }
         } else {
            return false;
         }
      }

      public int hashCode() {
         return this.b;
      }
   }

   public interface c {
   }

   public static enum d {
      a,
      b,
      c,
      d,
      e;
   }
}
