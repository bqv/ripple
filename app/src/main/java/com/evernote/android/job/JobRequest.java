package com.evernote.android.job;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;

import com.evernote.android.job.util.BatteryStatus;
import com.evernote.android.job.util.support.PersistableBundleCompat;

import java.util.concurrent.TimeUnit;

public final class JobRequest {
   public static final JobRequest.a a;
   public static final NetworkType b;
   public static final JobRequest.c c;
   public static final long d;
   public static final long e;
   private static final com.evernote.android.job.util.d f;
   private final Builder mBuilder;
   private int h;
   private long mScheduledAt;
   private boolean j;
   private boolean k;
   private long l;

   static {
      a = JobRequest.a.b;
      b = JobRequest.d.a;
      c = new JobRequest.c() {
      };
      d = TimeUnit.MINUTES.toMillis(15L);
      e = TimeUnit.MINUTES.toMillis(5L);
      f = new com.evernote.android.job.util.d("JobRequest");
   }

   private JobRequest(Builder var1) {
      this.mBuilder = var1;
   }

   // $FF: synthetic method
   JobRequest(Builder var1, Object var2) {
      this(var1);
   }

   private static Context H() {
      return JobManager.instance().getContext();
   }

   static long a() {
      return JobConfig.a() ? TimeUnit.MINUTES.toMillis(1L) : d;
   }

   static JobRequest a(Cursor var0) {
      JobRequest var1 = (new Builder(var0)).build();
      var1.h = var0.getInt(var0.getColumnIndex("numFailures"));
      var1.mScheduledAt = var0.getLong(var0.getColumnIndex("scheduledAt"));
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
      com.evernote.android.job.a.f.a(var1.mScheduledAt, "scheduled at can't be negative");
      return var1;
   }

   static long b() {
      return JobConfig.a() ? TimeUnit.SECONDS.toMillis(30L) : e;
   }

   boolean A() {
      return this.k;
   }

   public boolean B() {
      return this.mBuilder.s;
   }

   public Bundle C() {
      return this.mBuilder.mTransientExtras;
   }

   public int schedule() {
      JobManager.instance().a(this);
      return this.getJobId();
   }

   public Builder E() {
      long var1 = this.mScheduledAt;
      JobManager.instance().b(this.getJobId());
      Builder var3 = new Builder(this.mBuilder);
      this.j = false;
      if (!this.i()) {
         var1 = JobConfig.g().a() - var1;
         var3.a(Math.max(1L, this.getStartMs() - var1), Math.max(1L, this.f() - var1));
      }

      return var3;
   }

   ContentValues F() {
      ContentValues var1 = new ContentValues();
      this.mBuilder.a(var1);
      var1.put("numFailures", this.h);
      var1.put("scheduledAt", this.mScheduledAt);
      var1.put("started", this.j);
      var1.put("flexSupport", this.k);
      var1.put("lastRun", this.l);
      return var1;
   }

   JobRequest a(boolean var1, boolean var2) {
      JobRequest var3 = (new Builder(this.mBuilder, var2)).build();
      if (var1) {
         var3.h = this.h + 1;
      }

      try {
         var3.schedule();
         return var3;
      } catch (Exception var5) {
         f.a((Throwable)var5);
         return var3;
      }
   }

   void setScheduledAt(long var1) {
      this.mScheduledAt = var1;
   }

   void a(boolean var1) {
      this.k = var1;
   }

   void b(boolean var1) {
      this.j = var1;
      ContentValues var2 = new ContentValues();
      var2.put("started", this.j);
      JobManager.instance().getJobStorage().a(this, var2);
   }

   void b(boolean var1, boolean var2) {
      ContentValues var3 = new ContentValues();
      if (var1) {
         ++this.h;
         var3.put("numFailures", this.h);
      }

      if (var2) {
         this.l = JobConfig.g().a();
         var3.put("lastRun", this.l);
      }

      JobManager.instance().getJobStorage().a(this, var3);
   }

   public int getJobId() {
      return this.mBuilder.CREATE_ID;
   }

   public String getTag() {
      return this.mBuilder.mTag;
   }

   public long getStartMs() {
      return this.mBuilder.mStartMs;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         JobRequest var2 = (JobRequest)var1;
         return this.mBuilder.equals(var2.mBuilder);
      } else {
         return false;
      }
   }

   public long f() {
      return this.mBuilder.mEndMs;
   }

   public JobRequest.a g() {
      return this.mBuilder.f;
   }

   public long h() {
      return this.mBuilder.e;
   }

   public int hashCode() {
      return this.mBuilder.hashCode();
   }

   public boolean i() {
      return this.j() > 0L;
   }

   public long j() {
      return this.mBuilder.g;
   }

   public long k() {
      return this.mBuilder.h;
   }

   public boolean l() {
      return this.mBuilder.mRequirementsEnforced;
   }

   public boolean m() {
      return this.mBuilder.j;
   }

   public boolean n() {
      return this.mBuilder.k;
   }

   public boolean o() {
      return this.mBuilder.l;
   }

   public boolean p() {
      return this.mBuilder.m;
   }

   public NetworkType q() {
      return this.mBuilder.o;
   }

   public boolean r() {
      return this.m() || this.n() || this.o() || this.p() || this.q() != b;
   }

   public BatteryStatus.b s() {
      if (this.mBuilder.p == null && !TextUtils.isEmpty(this.mBuilder.q)) {
         this.mBuilder.p = Job.Params.b.a(this.mBuilder.q);
      }

      return this.mBuilder.p;
   }

   public boolean t() {
      return this.mBuilder.mUpdateCurrent;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("request{id=");
      var1.append(this.getJobId());
      var1.append(", tag=");
      var1.append(this.getTag());
      var1.append(", transient=");
      var1.append(this.B());
      var1.append('}');
      return var1.toString();
   }

   public boolean u() {
      return this.mBuilder.n;
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

   JobApi getJobApi() {
      return this.mBuilder.n ? JobApi.e : JobApi.c(H());
   }

   public long getScheduledAt() {
      return this.mScheduledAt;
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

   public static final class Builder {
      final String mTag;
      private int CREATE_ID;
      private long mStartMs;
      private long mEndMs;
      private long e;
      private JobRequest.a f;
      private long g;
      private long h;
      private boolean mRequirementsEnforced;
      private boolean j;
      private boolean k;
      private boolean l;
      private boolean m;
      private boolean n;
      private NetworkType o;
      private PersistableBundleCompat p;
      private String q;
      private boolean mUpdateCurrent;
      private boolean s;
      private Bundle mTransientExtras;

      private Builder(Cursor var1) {
         this.mTransientExtras = Bundle.EMPTY;
         this.CREATE_ID = var1.getInt(var1.getColumnIndex("_id"));
         this.mTag = var1.getString(var1.getColumnIndex("tag"));
         this.mStartMs = var1.getLong(var1.getColumnIndex("startMs"));
         this.mEndMs = var1.getLong(var1.getColumnIndex("endMs"));
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

         this.mRequirementsEnforced = var5;
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
      Builder(Cursor var1, Object var2) {
         this(var1);
      }

      private Builder(Builder var1) {
         this(var1, false);
      }

      // $FF: synthetic method
      Builder(Builder var1, Object var2) {
         this(var1);
      }

      private Builder(Builder var1, boolean var2) {
         this.mTransientExtras = Bundle.EMPTY;
         int var3;
         if (var2) {
            var3 = -8765;
         } else {
            var3 = var1.CREATE_ID;
         }

         this.CREATE_ID = var3;
         this.mTag = var1.mTag;
         this.mStartMs = var1.mStartMs;
         this.mEndMs = var1.mEndMs;
         this.e = var1.e;
         this.f = var1.f;
         this.g = var1.g;
         this.h = var1.h;
         this.mRequirementsEnforced = var1.mRequirementsEnforced;
         this.j = var1.j;
         this.k = var1.k;
         this.l = var1.l;
         this.m = var1.m;
         this.n = var1.n;
         this.o = var1.o;
         this.p = var1.p;
         this.q = var1.q;
         this.mUpdateCurrent = var1.mUpdateCurrent;
         this.s = var1.s;
         this.mTransientExtras = var1.mTransientExtras;
      }

      // $FF: synthetic method
      Builder(Builder var1, boolean var2, Object var3) {
         this(var1, var2);
      }

      public Builder(String tag) {
         this.mTransientExtras = Bundle.EMPTY;
         this.mTag = (String)com.evernote.android.job.a.f.a((CharSequence)tag);
         this.CREATE_ID = -8765;
         this.mStartMs = -1L;
         this.mEndMs = -1L;
         this.e = 30000L;
         this.f = m.a;
         this.o = m.b;
      }

      private void a(ContentValues var1) {
         label14: {
            var1.put("_id", this.CREATE_ID);
            var1.put("tag", this.mTag);
            var1.put("startMs", this.mStartMs);
            var1.put("endMs", this.mEndMs);
            var1.put("backoffMs", this.e);
            var1.put("backoffPolicy", this.f.toString());
            var1.put("intervalMs", this.g);
            var1.put("flexMs", this.h);
            var1.put("requirementsEnforced", this.mRequirementsEnforced);
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

      public Builder setExact(long exactInMs) {
         this.n = true;
         long var3 = exactInMs;
         if (exactInMs > 6148914691236517204L) {
            m.f.a("exactInMs clamped from %d days to %d days", TimeUnit.MILLISECONDS.toDays(exactInMs), TimeUnit.MILLISECONDS.toDays(6148914691236517204L));
            var3 = 6148914691236517204L;
         }

         return this.a(var3, var3);
      }

      public Builder a(long var1, long var3) {
         this.mStartMs = com.evernote.android.job.a.f.b(var1, "startInMs must be greater than 0");
         this.mEndMs = com.evernote.android.job.a.f.a(var3, var1, Long.MAX_VALUE, "endInMs");
         if (this.mStartMs > 6148914691236517204L) {
            m.f.a("startInMs reduced from %d days to %d days", TimeUnit.MILLISECONDS.toDays(this.mStartMs), TimeUnit.MILLISECONDS.toDays(6148914691236517204L));
            this.mStartMs = 6148914691236517204L;
         }

         if (this.mEndMs > 6148914691236517204L) {
            m.f.a("endInMs reduced from %d days to %d days", TimeUnit.MILLISECONDS.toDays(this.mEndMs), TimeUnit.MILLISECONDS.toDays(6148914691236517204L));
            this.mEndMs = 6148914691236517204L;
         }

         return this;
      }

      public Builder setExtras(PersistableBundleCompat var1) {
         if (var1 == null) {
            this.p = null;
            this.q = null;
            return this;
         } else {
            this.p = new PersistableBundleCompat(var1);
            return this;
         }
      }

      public Builder setRequirementsEnforced(boolean var1) {
         this.mRequirementsEnforced = var1;
         return this;
      }

      public JobRequest build() {
         com.evernote.android.job.a.f.a((CharSequence)this.mTag);
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
         } else if (this.n && this.mStartMs != this.mEndMs) {
            throw new IllegalArgumentException("Can't call setExecutionWindow() for an exact job.");
         } else if (!this.n || !this.mRequirementsEnforced && !this.k && !this.j && m.b.equals(this.o) && !this.l && !this.m) {
            if (this.g > 0L || this.mStartMs != -1L && this.mEndMs != -1L) {
               if (this.g > 0L && (this.mStartMs != -1L || this.mEndMs != -1L)) {
                  throw new IllegalArgumentException("Can't call setExecutionWindow() on a periodic job.");
               } else if (this.g > 0L && (this.e != 30000L || !m.a.equals(this.f))) {
                  throw new IllegalArgumentException("A periodic job will not respect any back-off policy, so calling setBackoffCriteria() with setPeriodic() is an error.");
               } else {
                  if (this.g <= 0L && (this.mStartMs > 3074457345618258602L || this.mEndMs > 3074457345618258602L)) {
                     m.f.c("Attention: your execution window is too large. This could result in undesired behavior, see https://github.com/evernote/android-job/wiki/FAQ");
                  }

                  if (this.g <= 0L && this.mStartMs > TimeUnit.DAYS.toMillis(365L)) {
                     m.f.c("Warning: job with tag %s scheduled over a year in the future", this.mTag);
                  }

                  if (this.CREATE_ID != -8765) {
                     com.evernote.android.job.a.f.a(this.CREATE_ID, "id can't be negative");
                  }

                  Builder var1 = new Builder(this);
                  if (this.CREATE_ID == -8765) {
                     var1.CREATE_ID = JobManager.instance().getJobStorage().a();
                     com.evernote.android.job.a.f.a(var1.CREATE_ID, "id can't be negative");
                  }

                  return new JobRequest(var1);
               }
            } else {
               throw new IllegalArgumentException("You're trying to build a job with no constraints, this is not allowed.");
            }
         } else {
            throw new IllegalArgumentException("Can't require any condition for an exact job.");
         }
      }

      public Builder setUpdateCurrent(boolean var1) {
         this.mUpdateCurrent = var1;
         return this;
      }

      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         } else if (var1 != null) {
            if (this.getClass() != var1.getClass()) {
               return false;
            } else {
               Builder var2 = (Builder)var1;
               return this.CREATE_ID == var2.CREATE_ID;
            }
         } else {
            return false;
         }
      }

      public int hashCode() {
         return this.CREATE_ID;
      }
   }

   public interface c {
   }

   public static enum NetworkType {
      a,
      b,
      c,
      d,
      e;
   }
}
