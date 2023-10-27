package com.dof100.morsenotifier;

import android.content.BroadcastReceiver;

public class BRVolume extends BroadcastReceiver {
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c9, code lost:
        if ((r13 - r17) < 2000) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d1, code lost:
        if ((r13 - r15) < 2000) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d3, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d5, code lost:
        if (r1 != false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d8, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d9, code lost:
        r12 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00db, code lost:
        if (r1 == false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00dd, code lost:
        r12 = r12 + " DOWN";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ee, code lost:
        if (r7 == false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f0, code lost:
        r12 = r12 + " UP  ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0101, code lost:
        if (r10 == false) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0103, code lost:
        r12 = r12 + " OK";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011a, code lost:
        if ((r13 - r3) <= 500) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011c, code lost:
        r5.putLong("BRVolume_LastTimeBroadcast", r13);
        r12 = r12 + " Broadcasting Finish";
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0134, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0135, code lost:
        r5.apply();
        com.dof100.morsenotifier.C0140i.m500a(r6, java.lang.String.format(java.util.Locale.US, "BRVolume.onReceive StreamType=%02d Vol:%02d old = %02d %02d %02d %02d %02d %02d %02d %02d %02d %02d (pref=%d) %s", new java.lang.Object[]{java.lang.Integer.valueOf(r8), java.lang.Integer.valueOf(r9), java.lang.Integer.valueOf(r2[0]), java.lang.Integer.valueOf(r2[1]), java.lang.Integer.valueOf(r2[2]), java.lang.Integer.valueOf(r2[3]), java.lang.Integer.valueOf(r2[4]), java.lang.Integer.valueOf(r2[5]), java.lang.Integer.valueOf(r2[6]), java.lang.Integer.valueOf(r2[7]), java.lang.Integer.valueOf(r2[8]), java.lang.Integer.valueOf(r2[9]), java.lang.Integer.valueOf(r0), r12}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01be, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01c0, code lost:
        com.dof100.morsenotifier.App.m430b(r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r24, android.content.Intent r25) {
        /*
            r23 = this;
            r6 = r24
            r0 = r25
            java.lang.String r1 = r25.getAction()
            java.lang.String r2 = "android.media.VOLUME_CHANGED_ACTION"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x01de }
            if (r1 != 0) goto L_0x0011
            return
        L_0x0011:
            java.lang.String r1 = "android.media.EXTRA_VOLUME_STREAM_TYPE"
            r7 = -1
            int r8 = r0.getIntExtra(r1, r7)
            java.lang.String r1 = "android.media.EXTRA_VOLUME_STREAM_VALUE"
            int r9 = r0.getIntExtra(r1, r7)
            r10 = 2
            if (r8 != r10) goto L_0x0027
            java.lang.String r0 = "BRVolume.onReceive ring volume (maybe samsung, ignoring)"
        L_0x0023:
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r6, (java.lang.String) r0)
            return
        L_0x0027:
            r11 = 0
            if (r8 < 0) goto L_0x01c4
            r13 = 9
            if (r8 > r13) goto L_0x01c4
            if (r9 != r7) goto L_0x0032
            goto L_0x01c4
        L_0x0032:
            android.content.SharedPreferences r14 = android.preference.PreferenceManager.getDefaultSharedPreferences(r24)
            java.lang.String r2 = "pref_morse_volumedownstop"
            r3 = 0
            boolean r0 = com.dof100.morsenotifier.App.f284c
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = "_morsedef"
        L_0x003f:
            r4 = r0
            goto L_0x0044
        L_0x0041:
            java.lang.String r0 = "_voicedef"
            goto L_0x003f
        L_0x0044:
            java.lang.String r5 = "_def"
            r0 = r6
            r1 = r14
            int r0 = com.dof100.morsenotifier.C0163v.m564c(r0, r1, r2, r3, r4, r5)
            r1 = 10
            int[] r2 = new int[r1]
            r2 = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1} // fill-array
            r3 = 0
        L_0x0054:
            if (r3 >= r1) goto L_0x0070
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "BRVolume_LastVol"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            int r4 = r14.getInt(r4, r7)
            r2[r3] = r4
            int r3 = r3 + 1
            goto L_0x0054
        L_0x0070:
            java.lang.String r3 = "BRVolume_LastTimeVolUp"
            r4 = 0
            long r15 = r14.getLong(r3, r4)
            java.lang.String r3 = "BRVolume_LastTimeVolDown"
            long r17 = r14.getLong(r3, r4)
            java.lang.String r3 = "BRVolume_LastTimeBroadcast"
            long r3 = r14.getLong(r3, r4)
            android.content.SharedPreferences$Editor r5 = r14.edit()
            long r13 = java.lang.System.currentTimeMillis()
            r1 = r2[r8]
            if (r1 == r7) goto L_0x00a7
            r1 = r2[r8]
            if (r1 >= r9) goto L_0x009c
            java.lang.String r1 = "BRVolume_LastTimeVolUp"
            r5.putLong(r1, r13)
            r1 = 0
            r7 = 1
            goto L_0x00a9
        L_0x009c:
            r1 = r2[r8]
            if (r1 <= r9) goto L_0x00a7
            java.lang.String r1 = "BRVolume_LastTimeVolDown"
            r5.putLong(r1, r13)
            r1 = 1
            goto L_0x00a8
        L_0x00a7:
            r1 = 0
        L_0x00a8:
            r7 = 0
        L_0x00a9:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "BRVolume_LastVol"
            r10.append(r12)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            r5.putInt(r10, r9)
            switch(r0) {
                case 1: goto L_0x00d8;
                case 2: goto L_0x00d5;
                case 3: goto L_0x00d3;
                case 4: goto L_0x00c1;
                default: goto L_0x00c0;
            }
        L_0x00c0:
            goto L_0x00d8
        L_0x00c1:
            r19 = 2000(0x7d0, double:9.88E-321)
            if (r7 == 0) goto L_0x00cb
            long r21 = r13 - r17
            int r10 = (r21 > r19 ? 1 : (r21 == r19 ? 0 : -1))
            if (r10 < 0) goto L_0x00d3
        L_0x00cb:
            if (r1 == 0) goto L_0x00d8
            long r17 = r13 - r15
            int r10 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r10 >= 0) goto L_0x00d8
        L_0x00d3:
            r10 = 1
            goto L_0x00d9
        L_0x00d5:
            if (r1 == 0) goto L_0x00d8
            goto L_0x00d3
        L_0x00d8:
            r10 = 0
        L_0x00d9:
            java.lang.String r12 = ""
            if (r1 == 0) goto L_0x00ee
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            java.lang.String r12 = " DOWN"
            r1.append(r12)
            java.lang.String r12 = r1.toString()
        L_0x00ee:
            if (r7 == 0) goto L_0x0101
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            java.lang.String r7 = " UP  "
            r1.append(r7)
            java.lang.String r12 = r1.toString()
        L_0x0101:
            if (r10 == 0) goto L_0x0134
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            java.lang.String r7 = " OK"
            r1.append(r7)
            java.lang.String r12 = r1.toString()
            long r15 = r13 - r3
            r3 = 500(0x1f4, double:2.47E-321)
            int r1 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0134
            java.lang.String r1 = "BRVolume_LastTimeBroadcast"
            r5.putLong(r1, r13)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            java.lang.String r3 = " Broadcasting Finish"
            r1.append(r3)
            java.lang.String r12 = r1.toString()
            r1 = 1
            goto L_0x0135
        L_0x0134:
            r1 = 0
        L_0x0135:
            r5.apply()
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r4 = "BRVolume.onReceive StreamType=%02d Vol:%02d old = %02d %02d %02d %02d %02d %02d %02d %02d %02d %02d (pref=%d) %s"
            r5 = 14
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r5[r11] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r8 = 1
            r5[r8] = r7
            r7 = r2[r11]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9 = 2
            r5[r9] = r7
            r7 = r2[r8]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 3
            r5[r8] = r7
            r7 = r2[r9]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9 = 4
            r5[r9] = r7
            r7 = r2[r8]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 5
            r5[r8] = r7
            r7 = r2[r9]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9 = 6
            r5[r9] = r7
            r7 = r2[r8]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 7
            r5[r8] = r7
            r7 = r2[r9]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9 = 8
            r5[r9] = r7
            r7 = r2[r8]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 9
            r5[r8] = r7
            r7 = r2[r9]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9 = 10
            r5[r9] = r7
            r7 = 11
            r2 = r2[r8]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5[r7] = r2
            r2 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5[r2] = r0
            r0 = 13
            r5[r0] = r12
            java.lang.String r0 = java.lang.String.format(r3, r4, r5)
            com.dof100.morsenotifier.C0140i.m500a((android.content.Context) r6, (java.lang.String) r0)
            if (r1 == 0) goto L_0x01c3
            com.dof100.morsenotifier.App.m430b(r24)
        L_0x01c3:
            return
        L_0x01c4:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = "BRVolume.onReceive ERROR Stream type =%d  Volume: %d"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r2[r11] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r4 = 1
            r2[r4] = r3
            java.lang.String r0 = java.lang.String.format(r0, r1, r2)
            goto L_0x0023
        L_0x01de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dof100.morsenotifier.BRVolume.onReceive(android.content.Context, android.content.Intent):void");
    }
}
