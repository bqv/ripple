package com.evernote.android.job;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import android.util.LruCache;
import com.evernote.android.job.p005a.C0174d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.evernote.android.job.n */
class C0212n {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C0174d f725a = new C0174d("JobStorage");

    /* renamed from: b */
    private final SharedPreferences f726b;

    /* renamed from: c */
    private final C0214a f727c;

    /* renamed from: d */
    private AtomicInteger f728d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Set<String> f729e;

    /* renamed from: f */
    private final C0215b f730f;

    /* renamed from: g */
    private SQLiteDatabase f731g;

    /* renamed from: h */
    private final ReadWriteLock f732h;

    /* renamed from: com.evernote.android.job.n$a */
    private class C0214a extends LruCache<Integer, C0205m> {
        public C0214a() {
            super(30);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C0205m create(Integer num) {
            return C0212n.this.m848a(num.intValue(), true);
        }
    }

    /* renamed from: com.evernote.android.job.n$b */
    private static final class C0215b extends SQLiteOpenHelper {
        private C0215b(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 6, new C0216o());
        }

        /* renamed from: a */
        private void m870a(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("create table jobs (_id integer primary key, tag text not null, startMs integer, endMs integer, backoffMs integer, backoffPolicy text not null, intervalMs integer, requirementsEnforced integer, requiresCharging integer, requiresDeviceIdle integer, exact integer, networkType text not null, extras text, numFailures integer, scheduledAt integer, started integer, flexMs integer, flexSupport integer, lastRun integer, transient integer, requiresBatteryNotLow integer, requiresStorageNotLow integer);");
        }

        /* renamed from: b */
        private void m871b(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("alter table jobs add column isTransient integer;");
        }

        /* renamed from: c */
        private void m872c(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("alter table jobs add column flexMs integer;");
            sQLiteDatabase.execSQL("alter table jobs add column flexSupport integer;");
            ContentValues contentValues = new ContentValues();
            contentValues.put("intervalMs", Long.valueOf(C0205m.f686d));
            sQLiteDatabase.update("jobs", contentValues, "intervalMs>0 AND intervalMs<" + C0205m.f686d, new String[0]);
            sQLiteDatabase.execSQL("update jobs set flexMs = intervalMs;");
        }

        /* renamed from: d */
        private void m873d(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("alter table jobs add column lastRun integer;");
        }

        /* renamed from: e */
        private void m874e(SQLiteDatabase sQLiteDatabase) {
            try {
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.execSQL("create table " + "jobs_new" + " (" + "_id" + " integer primary key, " + "tag" + " text not null, " + "startMs" + " integer, " + "endMs" + " integer, " + "backoffMs" + " integer, " + "backoffPolicy" + " text not null, " + "intervalMs" + " integer, " + "requirementsEnforced" + " integer, " + "requiresCharging" + " integer, " + "requiresDeviceIdle" + " integer, " + "exact" + " integer, " + "networkType" + " text not null, " + "extras" + " text, " + "numFailures" + " integer, " + "scheduledAt" + " integer, " + "started" + " integer, " + "flexMs" + " integer, " + "flexSupport" + " integer, " + "lastRun" + " integer);");
                sQLiteDatabase.execSQL("INSERT INTO " + "jobs_new" + " SELECT " + "_id" + "," + "tag" + "," + "startMs" + "," + "endMs" + "," + "backoffMs" + "," + "backoffPolicy" + "," + "intervalMs" + "," + "requirementsEnforced" + "," + "requiresCharging" + "," + "requiresDeviceIdle" + "," + "exact" + "," + "networkType" + "," + "extras" + "," + "numFailures" + "," + "scheduledAt" + "," + "isTransient" + "," + "flexMs" + "," + "flexSupport" + "," + "lastRun" + " FROM " + "jobs");
                sQLiteDatabase.execSQL("DROP TABLE jobs");
                StringBuilder sb = new StringBuilder();
                sb.append("ALTER TABLE ");
                sb.append("jobs_new");
                sb.append(" RENAME TO ");
                sb.append("jobs");
                sQLiteDatabase.execSQL(sb.toString());
                sQLiteDatabase.execSQL("alter table jobs add column transient integer;");
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }

        /* renamed from: f */
        private void m875f(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("alter table jobs add column requiresBatteryNotLow integer;");
            sQLiteDatabase.execSQL("alter table jobs add column requiresStorageNotLow integer;");
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            m870a(sQLiteDatabase);
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            while (i < i2) {
                switch (i) {
                    case 1:
                        m871b(sQLiteDatabase);
                        break;
                    case 2:
                        m872c(sQLiteDatabase);
                        break;
                    case 3:
                        m873d(sQLiteDatabase);
                        break;
                    case 4:
                        m874e(sQLiteDatabase);
                        break;
                    case 5:
                        m875f(sQLiteDatabase);
                        break;
                    default:
                        throw new IllegalStateException("not implemented");
                }
                i++;
            }
        }
    }

    public C0212n(Context context) {
        this(context, "evernote_jobs.db");
    }

    public C0212n(Context context, String str) {
        this.f726b = context.getSharedPreferences("evernote_jobs", 0);
        this.f732h = new ReentrantReadWriteLock();
        this.f727c = new C0214a();
        this.f730f = new C0215b(context, str);
        this.f729e = this.f726b.getStringSet("FAILED_DELETE_IDS", new HashSet());
        if (!this.f729e.isEmpty()) {
            m860e();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C0205m m848a(int i, boolean z) {
        SQLiteDatabase sQLiteDatabase;
        Exception e;
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursor;
        Cursor cursor2 = null;
        if (m857c(i)) {
            return null;
        }
        String str = "_id=?";
        if (!z) {
            try {
                str = str + " AND started<=0";
            } catch (Exception e2) {
                e = e2;
                cursor = null;
                sQLiteDatabase2 = null;
                try {
                    f725a.mo573b(e, "could not load id %d", Integer.valueOf(i));
                    m851a(cursor);
                    m852a(sQLiteDatabase2);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    cursor2 = cursor;
                    sQLiteDatabase = sQLiteDatabase2;
                    m851a(cursor2);
                    m852a(sQLiteDatabase);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase = null;
                m851a(cursor2);
                m852a(sQLiteDatabase);
                throw th;
            }
        }
        String str2 = str;
        sQLiteDatabase = mo713b();
        try {
            cursor = sQLiteDatabase.query("jobs", (String[]) null, str2, new String[]{String.valueOf(i)}, (String) null, (String) null, (String) null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        C0205m a = C0205m.m783a(cursor);
                        m851a(cursor);
                        m852a(sQLiteDatabase);
                        return a;
                    }
                } catch (Exception e3) {
                    Exception exc = e3;
                    sQLiteDatabase2 = sQLiteDatabase;
                    e = exc;
                    f725a.mo573b(e, "could not load id %d", Integer.valueOf(i));
                    m851a(cursor);
                    m852a(sQLiteDatabase2);
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    cursor2 = cursor;
                    m851a(cursor2);
                    m852a(sQLiteDatabase);
                    throw th;
                }
            }
            m851a(cursor);
            m852a(sQLiteDatabase);
            return null;
        } catch (Exception e4) {
            sQLiteDatabase2 = sQLiteDatabase;
            e = e4;
            cursor = null;
            f725a.mo573b(e, "could not load id %d", Integer.valueOf(i));
            m851a(cursor);
            m852a(sQLiteDatabase2);
            return null;
        } catch (Throwable th4) {
            th = th4;
            m851a(cursor2);
            m852a(sQLiteDatabase);
            throw th;
        }
    }

    /* renamed from: a */
    private static void m851a(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m852a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null && C0190e.m705i()) {
            try {
                sQLiteDatabase.close();
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m853a(C0205m mVar, int i) {
        SQLiteDatabase sQLiteDatabase;
        Exception e;
        this.f732h.writeLock().lock();
        try {
            this.f727c.remove(Integer.valueOf(i));
            sQLiteDatabase = mo713b();
            try {
                sQLiteDatabase.delete("jobs", "_id=?", new String[]{String.valueOf(i)});
                m852a(sQLiteDatabase);
                this.f732h.writeLock().unlock();
                return true;
            } catch (Exception e2) {
                e = e2;
                try {
                    f725a.mo573b(e, "could not delete %d %s", Integer.valueOf(i), mVar);
                    m855b(i);
                    m852a(sQLiteDatabase);
                    this.f732h.writeLock().unlock();
                    return false;
                } catch (Throwable th) {
                    th = th;
                    m852a(sQLiteDatabase);
                    this.f732h.writeLock().unlock();
                    throw th;
                }
            }
        } catch (Exception e3) {
            Exception exc = e3;
            sQLiteDatabase = null;
            e = exc;
            f725a.mo573b(e, "could not delete %d %s", Integer.valueOf(i), mVar);
            m855b(i);
            m852a(sQLiteDatabase);
            this.f732h.writeLock().unlock();
            return false;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = null;
            m852a(sQLiteDatabase);
            this.f732h.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: b */
    private void m855b(int i) {
        synchronized (this.f729e) {
            this.f729e.add(String.valueOf(i));
            this.f726b.edit().putStringSet("FAILED_DELETE_IDS", this.f729e).apply();
        }
    }

    /* renamed from: c */
    private void m856c(C0205m mVar) {
        this.f727c.put(Integer.valueOf(mVar.mo673c()), mVar);
    }

    /* renamed from: c */
    private boolean m857c(int i) {
        boolean z;
        synchronized (this.f729e) {
            z = !this.f729e.isEmpty() && this.f729e.contains(String.valueOf(i));
        }
        return z;
    }

    /* renamed from: d */
    private void m859d(C0205m mVar) {
        SQLiteDatabase sQLiteDatabase;
        ContentValues F = mVar.mo667F();
        try {
            sQLiteDatabase = mo713b();
            try {
                if (sQLiteDatabase.insertWithOnConflict("jobs", (String) null, F, 5) < 0) {
                    throw new SQLException("Couldn't insert job request into database");
                }
                m852a(sQLiteDatabase);
            } catch (Throwable th) {
                th = th;
                m852a(sQLiteDatabase);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = null;
            m852a(sQLiteDatabase);
            throw th;
        }
    }

    /* renamed from: e */
    private void m860e() {
        new Thread("CleanupFinishedJobsThread") {
            public void run() {
                HashSet hashSet;
                int i;
                synchronized (C0212n.this.f729e) {
                    hashSet = new HashSet(C0212n.this.f729e);
                }
                Iterator it = hashSet.iterator();
                while (true) {
                    i = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    try {
                        int parseInt = Integer.parseInt((String) it.next());
                        if (C0212n.this.m853a((C0205m) null, parseInt)) {
                            it.remove();
                            C0212n.f725a.mo568a("Deleted job %d which failed to delete earlier", Integer.valueOf(parseInt));
                        } else {
                            C0212n.f725a.mo577d("Couldn't delete job %d which failed to delete earlier", Integer.valueOf(parseInt));
                        }
                    } catch (NumberFormatException unused) {
                        it.remove();
                    }
                }
                synchronized (C0212n.this.f729e) {
                    C0212n.this.f729e.clear();
                    if (hashSet.size() > 50) {
                        Iterator it2 = hashSet.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            String str = (String) it2.next();
                            int i2 = i + 1;
                            if (i > 50) {
                                break;
                            }
                            C0212n.this.f729e.add(str);
                            i = i2;
                        }
                    } else {
                        C0212n.this.f729e.addAll(hashSet);
                    }
                }
            }
        }.start();
    }

    /* renamed from: a */
    public synchronized int mo708a() {
        int incrementAndGet;
        if (this.f728d == null) {
            this.f728d = new AtomicInteger(mo715c());
        }
        incrementAndGet = this.f728d.incrementAndGet();
        int e = C0190e.m701e();
        if (incrementAndGet < e || incrementAndGet >= 2147480000) {
            this.f728d.set(e);
            incrementAndGet = this.f728d.incrementAndGet();
        }
        this.f726b.edit().putInt("JOB_ID_COUNTER_v2", incrementAndGet).apply();
        return incrementAndGet;
    }

    /* renamed from: a */
    public C0205m mo709a(int i) {
        this.f732h.readLock().lock();
        try {
            return (C0205m) this.f727c.get(Integer.valueOf(i));
        } finally {
            this.f732h.readLock().unlock();
        }
    }

    /* renamed from: a */
    public Set<C0205m> mo710a(String str, boolean z) {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        Exception e;
        String[] strArr;
        String str2;
        HashSet hashSet = new HashSet();
        this.f732h.readLock().lock();
        try {
            if (TextUtils.isEmpty(str)) {
                str2 = z ? null : "ifnull(started, 0)<=0";
                strArr = null;
            } else {
                str2 = (z ? "" : "ifnull(started, 0)<=0 AND ") + "tag=?";
                strArr = new String[]{str};
            }
            sQLiteDatabase = mo713b();
            try {
                cursor = sQLiteDatabase.query("jobs", (String[]) null, str2, strArr, (String) null, (String) null, (String) null);
                try {
                    HashMap hashMap = new HashMap(this.f727c.snapshot());
                    while (cursor != null && cursor.moveToNext()) {
                        Integer valueOf = Integer.valueOf(cursor.getInt(cursor.getColumnIndex("_id")));
                        if (!m857c(valueOf.intValue())) {
                            hashSet.add(hashMap.containsKey(valueOf) ? hashMap.get(valueOf) : C0205m.m783a(cursor));
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    try {
                        f725a.mo573b(e, "could not load all jobs", new Object[0]);
                        m851a(cursor);
                        m852a(sQLiteDatabase);
                        this.f732h.readLock().unlock();
                        return hashSet;
                    } catch (Throwable th) {
                        th = th;
                        m851a(cursor);
                        m852a(sQLiteDatabase);
                        this.f732h.readLock().unlock();
                        throw th;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                cursor = null;
                f725a.mo573b(e, "could not load all jobs", new Object[0]);
                m851a(cursor);
                m852a(sQLiteDatabase);
                this.f732h.readLock().unlock();
                return hashSet;
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
                m851a(cursor);
                m852a(sQLiteDatabase);
                this.f732h.readLock().unlock();
                throw th;
            }
        } catch (Exception e4) {
            cursor = null;
            e = e4;
            sQLiteDatabase = null;
            f725a.mo573b(e, "could not load all jobs", new Object[0]);
            m851a(cursor);
            m852a(sQLiteDatabase);
            this.f732h.readLock().unlock();
            return hashSet;
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase = null;
            cursor = null;
            m851a(cursor);
            m852a(sQLiteDatabase);
            this.f732h.readLock().unlock();
            throw th;
        }
        m851a(cursor);
        m852a(sQLiteDatabase);
        this.f732h.readLock().unlock();
        return hashSet;
    }

    /* renamed from: a */
    public void mo711a(C0205m mVar) {
        this.f732h.writeLock().lock();
        try {
            m859d(mVar);
            m856c(mVar);
        } finally {
            this.f732h.writeLock().unlock();
        }
    }

    /* renamed from: a */
    public void mo712a(C0205m mVar, ContentValues contentValues) {
        this.f732h.writeLock().lock();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            m856c(mVar);
            SQLiteDatabase b = mo713b();
            try {
                b.update("jobs", contentValues, "_id=?", new String[]{String.valueOf(mVar.mo673c())});
                m852a(b);
            } catch (Exception e) {
                e = e;
                sQLiteDatabase = b;
                try {
                    f725a.mo573b(e, "could not update %s", mVar);
                    m852a(sQLiteDatabase);
                    this.f732h.writeLock().unlock();
                } catch (Throwable th) {
                    th = th;
                    m852a(sQLiteDatabase);
                    this.f732h.writeLock().unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase = b;
                m852a(sQLiteDatabase);
                this.f732h.writeLock().unlock();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            f725a.mo573b(e, "could not update %s", mVar);
            m852a(sQLiteDatabase);
            this.f732h.writeLock().unlock();
        }
        this.f732h.writeLock().unlock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public SQLiteDatabase mo713b() {
        if (this.f731g != null) {
            return this.f731g;
        }
        try {
            return this.f730f.getWritableDatabase();
        } catch (SQLiteCantOpenDatabaseException e) {
            f725a.mo569a((Throwable) e);
            new C0216o().mo723a("evernote_jobs.db");
            return this.f730f.getWritableDatabase();
        }
    }

    /* renamed from: b */
    public void mo714b(C0205m mVar) {
        m853a(mVar, mVar.mo673c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo715c() {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        int i;
        Exception e;
        try {
            sQLiteDatabase = mo713b();
            try {
                cursor = sQLiteDatabase.rawQuery("SELECT MAX(_id) FROM jobs", (String[]) null);
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            i = cursor.getInt(0);
                            m851a(cursor);
                            m852a(sQLiteDatabase);
                            return Math.max(C0190e.m701e(), Math.max(i, this.f726b.getInt("JOB_ID_COUNTER_v2", 0)));
                        }
                    } catch (Exception e2) {
                        e = e2;
                        try {
                            f725a.mo569a((Throwable) e);
                            m851a(cursor);
                            m852a(sQLiteDatabase);
                            i = 0;
                            return Math.max(C0190e.m701e(), Math.max(i, this.f726b.getInt("JOB_ID_COUNTER_v2", 0)));
                        } catch (Throwable th) {
                            th = th;
                            m851a(cursor);
                            m852a(sQLiteDatabase);
                            throw th;
                        }
                    }
                }
                i = 0;
                m851a(cursor);
                m852a(sQLiteDatabase);
            } catch (Exception e3) {
                Exception exc = e3;
                cursor = null;
                e = exc;
                f725a.mo569a((Throwable) e);
                m851a(cursor);
                m852a(sQLiteDatabase);
                i = 0;
                return Math.max(C0190e.m701e(), Math.max(i, this.f726b.getInt("JOB_ID_COUNTER_v2", 0)));
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
                m851a(cursor);
                m852a(sQLiteDatabase);
                throw th;
            }
        } catch (Exception e4) {
            cursor = null;
            e = e4;
            sQLiteDatabase = null;
            f725a.mo569a((Throwable) e);
            m851a(cursor);
            m852a(sQLiteDatabase);
            i = 0;
            return Math.max(C0190e.m701e(), Math.max(i, this.f726b.getInt("JOB_ID_COUNTER_v2", 0)));
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase = null;
            cursor = null;
            m851a(cursor);
            m852a(sQLiteDatabase);
            throw th;
        }
        return Math.max(C0190e.m701e(), Math.max(i, this.f726b.getInt("JOB_ID_COUNTER_v2", 0)));
    }
}
