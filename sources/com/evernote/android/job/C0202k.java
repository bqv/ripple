package com.evernote.android.job;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.evernote.android.job.p005a.C0174d;

/* renamed from: com.evernote.android.job.k */
public interface C0202k {

    /* renamed from: com.evernote.android.job.k$a */
    public static final class C0203a {

        /* renamed from: a */
        private static final Object f678a = new Object();

        /* renamed from: b */
        private final Context f679b;

        /* renamed from: c */
        private final int f680c;

        /* renamed from: d */
        private final C0174d f681d;

        /* renamed from: e */
        private final C0200i f682e;

        public C0203a(Service service, C0174d dVar, int i) {
            this((Context) service, dVar, i);
        }

        C0203a(Context context, C0174d dVar, int i) {
            C0200i iVar;
            this.f679b = context;
            this.f680c = i;
            this.f681d = dVar;
            try {
                iVar = C0200i.m735a(context);
            } catch (C0201j e) {
                this.f681d.mo569a((Throwable) e);
                iVar = null;
            }
            this.f682e = iVar;
        }

        /* renamed from: a */
        private static long m762a(long j, long j2) {
            long j3 = j + j2;
            boolean z = false;
            boolean z2 = (j ^ j2) < 0;
            if ((j ^ j3) >= 0) {
                z = true;
            }
            return m763a(j3, z2 | z);
        }

        /* renamed from: a */
        private static long m763a(long j, boolean z) {
            if (z) {
                return j;
            }
            return Long.MAX_VALUE;
        }

        /* renamed from: a */
        public static long m764a(C0205m mVar) {
            return mVar.mo698y() > 0 ? mVar.mo695v() : mVar.mo675e();
        }

        /* renamed from: a */
        public static long m765a(C0205m mVar, boolean z) {
            long v = mVar.mo698y() > 0 ? mVar.mo695v() : mVar.mo677f();
            return (!z || !mVar.mo684l() || !mVar.mo690r()) ? v : m770b(v, 100);
        }

        /* renamed from: a */
        public static ComponentName m766a(Context context, Intent intent) {
            return C0217p.m879a(context, intent);
        }

        /* renamed from: a */
        static void m767a(Context context, int i) {
            for (C0186d dVar : C0186d.values()) {
                if (dVar.mo614a(context)) {
                    try {
                        dVar.mo615b(context).mo628a(i);
                    } catch (Exception unused) {
                    }
                }
            }
        }

        /* renamed from: a */
        private void m768a(boolean z) {
            if (z) {
                m767a(this.f679b, this.f680c);
            }
        }

        /* renamed from: a */
        public static boolean m769a(Intent intent) {
            return C0217p.m883a(intent);
        }

        /* renamed from: b */
        private static long m770b(long j, long j2) {
            int numberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(j ^ -1) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(j2 ^ -1);
            if (numberOfLeadingZeros > 65) {
                return j * j2;
            }
            boolean z = false;
            long a = m763a(m763a(j * j2, numberOfLeadingZeros >= 64), (j >= 0) | (j2 != Long.MIN_VALUE));
            if (j == 0 || a / j == j2) {
                z = true;
            }
            return m763a(a, z);
        }

        /* renamed from: b */
        public static long m771b(C0205m mVar) {
            return m765a(mVar, false);
        }

        /* renamed from: c */
        public static long m772c(C0205m mVar) {
            return m762a(m764a(mVar), (m771b(mVar) - m764a(mVar)) / 2);
        }

        /* renamed from: d */
        public static long m773d(C0205m mVar) {
            return Math.max(1, mVar.mo682j() - mVar.mo683k());
        }

        /* renamed from: e */
        public static long m774e(C0205m mVar) {
            return mVar.mo682j();
        }

        /* renamed from: f */
        public static long m775f(C0205m mVar) {
            return m762a(m773d(mVar), (m774e(mVar) - m773d(mVar)) / 2);
        }

        /* renamed from: g */
        public static int m776g(C0205m mVar) {
            return mVar.mo698y();
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x007a  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x00b0 A[Catch:{ InterruptedException | ExecutionException -> 0x012e, all -> 0x012c }] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x00b5 A[Catch:{ InterruptedException | ExecutionException -> 0x012e, all -> 0x012c }] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00bf A[Catch:{ InterruptedException | ExecutionException -> 0x012e, all -> 0x012c }] */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00ed A[SYNTHETIC, Splitter:B:34:0x00ed] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x013c A[Catch:{ all -> 0x0131 }] */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x014e  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x015f  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x017a  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x018b  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.evernote.android.job.C0180c.C0183b mo659a(com.evernote.android.job.C0205m r11, android.os.Bundle r12) {
            /*
                r10 = this;
                long r0 = java.lang.System.currentTimeMillis()
                long r2 = r11.mo697x()
                long r4 = r0 - r2
                boolean r0 = r11.mo681i()
                r1 = 2
                r2 = 1
                r3 = 0
                if (r0 == 0) goto L_0x0032
                java.util.Locale r0 = java.util.Locale.US
                java.lang.String r6 = "interval %s, flex %s"
                java.lang.Object[] r7 = new java.lang.Object[r1]
                long r8 = r11.mo682j()
                java.lang.String r8 = com.evernote.android.job.p005a.C0177g.m643a((long) r8)
                r7[r3] = r8
                long r8 = r11.mo683k()
                java.lang.String r8 = com.evernote.android.job.p005a.C0177g.m643a((long) r8)
                r7[r2] = r8
            L_0x002d:
                java.lang.String r0 = java.lang.String.format(r0, r6, r7)
                goto L_0x0070
            L_0x0032:
                com.evernote.android.job.d r0 = r11.mo696w()
                boolean r0 = r0.mo613a()
                if (r0 == 0) goto L_0x0057
                java.util.Locale r0 = java.util.Locale.US
                java.lang.String r6 = "start %s, end %s"
                java.lang.Object[] r7 = new java.lang.Object[r1]
                long r8 = m764a((com.evernote.android.job.C0205m) r11)
                java.lang.String r8 = com.evernote.android.job.p005a.C0177g.m643a((long) r8)
                r7[r3] = r8
                long r8 = m771b(r11)
                java.lang.String r8 = com.evernote.android.job.p005a.C0177g.m643a((long) r8)
                r7[r2] = r8
                goto L_0x002d
            L_0x0057:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r6 = "delay "
                r0.append(r6)
                long r6 = m772c(r11)
                java.lang.String r6 = com.evernote.android.job.p005a.C0177g.m643a((long) r6)
                r0.append(r6)
                java.lang.String r0 = r0.toString()
            L_0x0070:
                android.os.Looper r6 = android.os.Looper.myLooper()
                android.os.Looper r7 = android.os.Looper.getMainLooper()
                if (r6 != r7) goto L_0x0081
                com.evernote.android.job.a.d r6 = r10.f681d
                java.lang.String r7 = "Running JobRequest on a main thread, this could cause stutter or ANR in your app."
                r6.mo574c(r7)
            L_0x0081:
                com.evernote.android.job.a.d r6 = r10.f681d
                java.lang.String r7 = "Run job, %s, waited %s, %s"
                r8 = 3
                java.lang.Object[] r8 = new java.lang.Object[r8]
                r8[r3] = r11
                java.lang.String r4 = com.evernote.android.job.p005a.C0177g.m643a((long) r4)
                r8[r2] = r4
                r8[r1] = r0
                r6.mo572b(r7, r8)
                com.evernote.android.job.i r0 = r10.f682e
                com.evernote.android.job.h r0 = r0.mo656f()
                r4 = 0
                com.evernote.android.job.i r5 = r10.f682e     // Catch:{ InterruptedException | ExecutionException -> 0x0134 }
                com.evernote.android.job.g r5 = r5.mo657g()     // Catch:{ InterruptedException | ExecutionException -> 0x0134 }
                java.lang.String r6 = r11.mo674d()     // Catch:{ InterruptedException | ExecutionException -> 0x0134 }
                com.evernote.android.job.c r5 = r5.mo623a((java.lang.String) r6)     // Catch:{ InterruptedException | ExecutionException -> 0x0134 }
                boolean r4 = r11.mo681i()     // Catch:{ InterruptedException | ExecutionException -> 0x012e, all -> 0x012c }
                if (r4 != 0) goto L_0x00b3
                r11.mo671b(r2)     // Catch:{ InterruptedException | ExecutionException -> 0x012e, all -> 0x012c }
            L_0x00b3:
                if (r12 != 0) goto L_0x00b7
                android.os.Bundle r12 = android.os.Bundle.EMPTY     // Catch:{ InterruptedException | ExecutionException -> 0x012e, all -> 0x012c }
            L_0x00b7:
                android.content.Context r4 = r10.f679b     // Catch:{ InterruptedException | ExecutionException -> 0x012e, all -> 0x012c }
                java.util.concurrent.Future r12 = r0.mo636a(r4, r11, r5, r12)     // Catch:{ InterruptedException | ExecutionException -> 0x012e, all -> 0x012c }
                if (r12 != 0) goto L_0x00ed
                com.evernote.android.job.c$b r12 = com.evernote.android.job.C0180c.C0183b.FAILURE     // Catch:{ InterruptedException | ExecutionException -> 0x012e, all -> 0x012c }
                if (r5 != 0) goto L_0x00cd
            L_0x00c3:
                com.evernote.android.job.i r0 = r10.f682e
                com.evernote.android.job.n r0 = r0.mo655e()
                r0.mo714b((com.evernote.android.job.C0205m) r11)
                return r12
            L_0x00cd:
                boolean r0 = r11.mo681i()
                if (r0 != 0) goto L_0x00d4
                goto L_0x00c3
            L_0x00d4:
                boolean r0 = r11.mo662A()
                if (r0 == 0) goto L_0x00ec
                boolean r0 = r5.mo600p()
                if (r0 != 0) goto L_0x00ec
                com.evernote.android.job.i r0 = r10.f682e
                com.evernote.android.job.n r0 = r0.mo655e()
                r0.mo714b((com.evernote.android.job.C0205m) r11)
                r11.mo668a(r3, r3)
            L_0x00ec:
                return r12
            L_0x00ed:
                java.lang.Object r12 = r12.get()     // Catch:{ InterruptedException | ExecutionException -> 0x012e, all -> 0x012c }
                com.evernote.android.job.c$b r12 = (com.evernote.android.job.C0180c.C0183b) r12     // Catch:{ InterruptedException | ExecutionException -> 0x012e, all -> 0x012c }
                com.evernote.android.job.a.d r0 = r10.f681d     // Catch:{ InterruptedException | ExecutionException -> 0x012e, all -> 0x012c }
                java.lang.String r4 = "Finished job, %s %s"
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ InterruptedException | ExecutionException -> 0x012e, all -> 0x012c }
                r1[r3] = r11     // Catch:{ InterruptedException | ExecutionException -> 0x012e, all -> 0x012c }
                r1[r2] = r12     // Catch:{ InterruptedException | ExecutionException -> 0x012e, all -> 0x012c }
                r0.mo572b(r4, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x012e, all -> 0x012c }
                if (r5 != 0) goto L_0x010c
            L_0x0102:
                com.evernote.android.job.i r0 = r10.f682e
                com.evernote.android.job.n r0 = r0.mo655e()
                r0.mo714b((com.evernote.android.job.C0205m) r11)
                return r12
            L_0x010c:
                boolean r0 = r11.mo681i()
                if (r0 != 0) goto L_0x0113
                goto L_0x0102
            L_0x0113:
                boolean r0 = r11.mo662A()
                if (r0 == 0) goto L_0x012b
                boolean r0 = r5.mo600p()
                if (r0 != 0) goto L_0x012b
                com.evernote.android.job.i r0 = r10.f682e
                com.evernote.android.job.n r0 = r0.mo655e()
                r0.mo714b((com.evernote.android.job.C0205m) r11)
                r11.mo668a(r3, r3)
            L_0x012b:
                return r12
            L_0x012c:
                r12 = move-exception
                goto L_0x0178
            L_0x012e:
                r12 = move-exception
                r4 = r5
                goto L_0x0135
            L_0x0131:
                r12 = move-exception
                r5 = r4
                goto L_0x0178
            L_0x0134:
                r12 = move-exception
            L_0x0135:
                com.evernote.android.job.a.d r0 = r10.f681d     // Catch:{ all -> 0x0131 }
                r0.mo569a((java.lang.Throwable) r12)     // Catch:{ all -> 0x0131 }
                if (r4 == 0) goto L_0x014a
                r4.mo596l()     // Catch:{ all -> 0x0131 }
                com.evernote.android.job.a.d r12 = r10.f681d     // Catch:{ all -> 0x0131 }
                java.lang.String r0 = "Canceled %s"
                java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x0131 }
                r1[r3] = r11     // Catch:{ all -> 0x0131 }
                r12.mo577d(r0, r1)     // Catch:{ all -> 0x0131 }
            L_0x014a:
                com.evernote.android.job.c$b r12 = com.evernote.android.job.C0180c.C0183b.FAILURE     // Catch:{ all -> 0x0131 }
                if (r4 != 0) goto L_0x0158
            L_0x014e:
                com.evernote.android.job.i r0 = r10.f682e
                com.evernote.android.job.n r0 = r0.mo655e()
                r0.mo714b((com.evernote.android.job.C0205m) r11)
                return r12
            L_0x0158:
                boolean r0 = r11.mo681i()
                if (r0 != 0) goto L_0x015f
                goto L_0x014e
            L_0x015f:
                boolean r0 = r11.mo662A()
                if (r0 == 0) goto L_0x0177
                boolean r0 = r4.mo600p()
                if (r0 != 0) goto L_0x0177
                com.evernote.android.job.i r0 = r10.f682e
                com.evernote.android.job.n r0 = r0.mo655e()
                r0.mo714b((com.evernote.android.job.C0205m) r11)
                r11.mo668a(r3, r3)
            L_0x0177:
                return r12
            L_0x0178:
                if (r5 != 0) goto L_0x0184
            L_0x017a:
                com.evernote.android.job.i r0 = r10.f682e
                com.evernote.android.job.n r0 = r0.mo655e()
                r0.mo714b((com.evernote.android.job.C0205m) r11)
                goto L_0x01a3
            L_0x0184:
                boolean r0 = r11.mo681i()
                if (r0 != 0) goto L_0x018b
                goto L_0x017a
            L_0x018b:
                boolean r0 = r11.mo662A()
                if (r0 == 0) goto L_0x01a3
                boolean r0 = r5.mo600p()
                if (r0 != 0) goto L_0x01a3
                com.evernote.android.job.i r0 = r10.f682e
                com.evernote.android.job.n r0 = r0.mo655e()
                r0.mo714b((com.evernote.android.job.C0205m) r11)
                r11.mo668a(r3, r3)
            L_0x01a3:
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.C0202k.C0203a.mo659a(com.evernote.android.job.m, android.os.Bundle):com.evernote.android.job.c$b");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e9, code lost:
            return r3;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.evernote.android.job.C0205m mo660a(boolean r17, boolean r18) {
            /*
                r16 = this;
                r1 = r16
                java.lang.Object r2 = f678a
                monitor-enter(r2)
                com.evernote.android.job.i r3 = r1.f682e     // Catch:{ all -> 0x00ea }
                r4 = 0
                if (r3 != 0) goto L_0x000c
                monitor-exit(r2)     // Catch:{ all -> 0x00ea }
                return r4
            L_0x000c:
                com.evernote.android.job.i r3 = r1.f682e     // Catch:{ all -> 0x00ea }
                int r5 = r1.f680c     // Catch:{ all -> 0x00ea }
                r6 = 1
                com.evernote.android.job.m r3 = r3.mo645a(r5, r6)     // Catch:{ all -> 0x00ea }
                com.evernote.android.job.i r5 = r1.f682e     // Catch:{ all -> 0x00ea }
                int r7 = r1.f680c     // Catch:{ all -> 0x00ea }
                com.evernote.android.job.c r5 = r5.mo643a((int) r7)     // Catch:{ all -> 0x00ea }
                r7 = 0
                if (r3 == 0) goto L_0x0028
                boolean r8 = r3.mo681i()     // Catch:{ all -> 0x00ea }
                if (r8 == 0) goto L_0x0028
                r8 = 1
                goto L_0x0029
            L_0x0028:
                r8 = 0
            L_0x0029:
                r9 = 2
                if (r5 == 0) goto L_0x0047
                boolean r10 = r5.mo597m()     // Catch:{ all -> 0x00ea }
                if (r10 != 0) goto L_0x0047
                com.evernote.android.job.a.d r5 = r1.f681d     // Catch:{ all -> 0x00ea }
                java.lang.String r8 = "Job %d is already running, %s"
                java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x00ea }
                int r10 = r1.f680c     // Catch:{ all -> 0x00ea }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x00ea }
                r9[r7] = r10     // Catch:{ all -> 0x00ea }
                r9[r6] = r3     // Catch:{ all -> 0x00ea }
                r5.mo572b(r8, r9)     // Catch:{ all -> 0x00ea }
                monitor-exit(r2)     // Catch:{ all -> 0x00ea }
                return r4
            L_0x0047:
                if (r5 == 0) goto L_0x0063
                if (r8 != 0) goto L_0x0063
                com.evernote.android.job.a.d r5 = r1.f681d     // Catch:{ all -> 0x00ea }
                java.lang.String r8 = "Job %d already finished, %s"
                java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x00ea }
                int r10 = r1.f680c     // Catch:{ all -> 0x00ea }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x00ea }
                r9[r7] = r10     // Catch:{ all -> 0x00ea }
                r9[r6] = r3     // Catch:{ all -> 0x00ea }
                r5.mo572b(r8, r9)     // Catch:{ all -> 0x00ea }
                r16.m768a((boolean) r17)     // Catch:{ all -> 0x00ea }
                monitor-exit(r2)     // Catch:{ all -> 0x00ea }
                return r4
            L_0x0063:
                if (r5 == 0) goto L_0x008b
                long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00ea }
                long r12 = r5.mo598n()     // Catch:{ all -> 0x00ea }
                r5 = 0
                long r14 = r10 - r12
                r10 = 2000(0x7d0, double:9.88E-321)
                int r5 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
                if (r5 >= 0) goto L_0x008b
                com.evernote.android.job.a.d r5 = r1.f681d     // Catch:{ all -> 0x00ea }
                java.lang.String r8 = "Job %d is periodic and just finished, %s"
                java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x00ea }
                int r10 = r1.f680c     // Catch:{ all -> 0x00ea }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x00ea }
                r9[r7] = r10     // Catch:{ all -> 0x00ea }
                r9[r6] = r3     // Catch:{ all -> 0x00ea }
                r5.mo572b(r8, r9)     // Catch:{ all -> 0x00ea }
                monitor-exit(r2)     // Catch:{ all -> 0x00ea }
                return r4
            L_0x008b:
                if (r3 == 0) goto L_0x00a8
                boolean r5 = r3.mo699z()     // Catch:{ all -> 0x00ea }
                if (r5 == 0) goto L_0x00a8
                com.evernote.android.job.a.d r5 = r1.f681d     // Catch:{ all -> 0x00ea }
                java.lang.String r8 = "Request %d already started, %s"
                java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x00ea }
                int r10 = r1.f680c     // Catch:{ all -> 0x00ea }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x00ea }
                r9[r7] = r10     // Catch:{ all -> 0x00ea }
                r9[r6] = r3     // Catch:{ all -> 0x00ea }
                r5.mo572b(r8, r9)     // Catch:{ all -> 0x00ea }
                monitor-exit(r2)     // Catch:{ all -> 0x00ea }
                return r4
            L_0x00a8:
                if (r3 == 0) goto L_0x00cb
                com.evernote.android.job.i r5 = r1.f682e     // Catch:{ all -> 0x00ea }
                com.evernote.android.job.h r5 = r5.mo656f()     // Catch:{ all -> 0x00ea }
                boolean r5 = r5.mo640b(r3)     // Catch:{ all -> 0x00ea }
                if (r5 == 0) goto L_0x00cb
                com.evernote.android.job.a.d r5 = r1.f681d     // Catch:{ all -> 0x00ea }
                java.lang.String r8 = "Request %d is in the queue to start, %s"
                java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x00ea }
                int r10 = r1.f680c     // Catch:{ all -> 0x00ea }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x00ea }
                r9[r7] = r10     // Catch:{ all -> 0x00ea }
                r9[r6] = r3     // Catch:{ all -> 0x00ea }
                r5.mo572b(r8, r9)     // Catch:{ all -> 0x00ea }
                monitor-exit(r2)     // Catch:{ all -> 0x00ea }
                return r4
            L_0x00cb:
                if (r3 != 0) goto L_0x00e3
                com.evernote.android.job.a.d r3 = r1.f681d     // Catch:{ all -> 0x00ea }
                java.lang.String r5 = "Request for ID %d was null"
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x00ea }
                int r8 = r1.f680c     // Catch:{ all -> 0x00ea }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x00ea }
                r6[r7] = r8     // Catch:{ all -> 0x00ea }
                r3.mo572b(r5, r6)     // Catch:{ all -> 0x00ea }
                r16.m768a((boolean) r17)     // Catch:{ all -> 0x00ea }
                monitor-exit(r2)     // Catch:{ all -> 0x00ea }
                return r4
            L_0x00e3:
                if (r18 == 0) goto L_0x00e8
                r1.mo661h(r3)     // Catch:{ all -> 0x00ea }
            L_0x00e8:
                monitor-exit(r2)     // Catch:{ all -> 0x00ea }
                return r3
            L_0x00ea:
                r0 = move-exception
                r3 = r0
                monitor-exit(r2)     // Catch:{ all -> 0x00ea }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.C0202k.C0203a.mo660a(boolean, boolean):com.evernote.android.job.m");
        }

        /* renamed from: h */
        public void mo661h(C0205m mVar) {
            this.f682e.mo656f().mo639a(mVar);
        }
    }

    /* renamed from: a */
    void mo628a(int i);

    /* renamed from: a */
    void mo629a(C0205m mVar);

    /* renamed from: b */
    void mo631b(C0205m mVar);

    /* renamed from: c */
    void mo611c(C0205m mVar);

    /* renamed from: d */
    boolean mo612d(C0205m mVar);
}
