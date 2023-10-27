package com.dof100.morsenotifier;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: com.dof100.morsenotifier.p */
public class C0156p {

    /* renamed from: a */
    int f531a = 0;

    /* renamed from: b */
    int f532b = 0;

    /* renamed from: c */
    final boolean[] f533c = {true, true, true, true, true, true, true};

    /* renamed from: d */
    int f534d = 1;

    /* renamed from: e */
    String f535e = "";

    /* renamed from: f */
    String f536f = "";

    /* renamed from: g */
    long f537g;

    public C0156p() {
        m538d();
    }

    /* renamed from: d */
    private void m538d() {
        this.f531a = 7;
        this.f532b = 0;
        for (int i = 0; i < 7; i++) {
            this.f533c[i] = true;
        }
        this.f534d = 1;
        this.f535e = "";
        this.f536f = "";
    }

    /* renamed from: a */
    public String mo510a() {
        StringBuilder sb;
        String str;
        String str2;
        Object[] objArr;
        Locale locale;
        String str3 = "";
        if (this.f535e != null && !this.f535e.isEmpty()) {
            str3 = this.f535e;
        }
        if (this.f534d == 1) {
            if (!App.f285d) {
                sb = new StringBuilder();
                sb.append(str3);
                sb.append(" ");
                locale = Locale.US;
                str2 = "%02d%02d";
                objArr = new Object[]{Integer.valueOf(this.f531a), Integer.valueOf(this.f532b)};
            } else if (this.f532b != 0) {
                sb = new StringBuilder();
                sb.append(str3);
                sb.append(" ");
                locale = Locale.US;
                str2 = "%02d %02d";
                objArr = new Object[]{Integer.valueOf(this.f531a), Integer.valueOf(this.f532b)};
            } else {
                sb = new StringBuilder();
                sb.append(str3);
                sb.append(" ");
                str = String.format(Locale.US, "%02d hundred", new Object[]{Integer.valueOf(this.f531a)});
                sb.append(str);
                str3 = sb.toString();
            }
            str = String.format(locale, str2, objArr);
            sb.append(str);
            str3 = sb.toString();
        }
        if (this.f536f == null || this.f536f.isEmpty()) {
            return str3;
        }
        return str3 + " " + this.f536f;
    }

    /* renamed from: a */
    public String mo511a(Context context) {
        String str;
        int i = 0;
        for (int i2 = 0; i2 < 7; i2++) {
            if (this.f533c[i2]) {
                i++;
            }
        }
        String str2 = "";
        if (i == 0) {
            str = "no days set";
        } else if (i == 7) {
            str = "everyday";
        } else if (i != 2 || !this.f533c[0] || !this.f533c[6]) {
            if (this.f533c[0]) {
                str2 = str2 + context.getResources().getString(R.string.activity_reminder_dow0) + ", ";
            }
            if (this.f533c[1]) {
                str2 = str2 + context.getResources().getString(R.string.activity_reminder_dow1) + ", ";
            }
            if (this.f533c[2]) {
                str2 = str2 + context.getResources().getString(R.string.activity_reminder_dow2) + ", ";
            }
            if (this.f533c[3]) {
                str2 = str2 + context.getResources().getString(R.string.activity_reminder_dow3) + ", ";
            }
            if (this.f533c[4]) {
                str2 = str2 + context.getResources().getString(R.string.activity_reminder_dow4) + ", ";
            }
            if (this.f533c[5]) {
                str2 = str2 + context.getResources().getString(R.string.activity_reminder_dow5) + ", ";
            }
            if (this.f533c[6]) {
                str = str2 + context.getResources().getString(R.string.activity_reminder_dow6);
            } else {
                str = str2;
            }
        } else {
            str = "weekends";
        }
        if (str.length() > 3 && str.charAt(str.length() - 2) == ',') {
            str = str.substring(0, str.length() - 2);
        }
        return String.format(Locale.US, "%02d:%02d, %s. %s", new Object[]{Integer.valueOf(this.f531a), Integer.valueOf(this.f532b), str, mo515c()});
    }

    /* renamed from: a */
    public void mo512a(SharedPreferences.Editor editor, int i) {
        C0140i.m501a(String.format(Locale.US, "MyReminder.save - no %d", new Object[]{Integer.valueOf(i)}));
        editor.putInt("reminder_" + i + "_TimeHour", this.f531a);
        editor.putInt("reminder_" + i + "_TimeMin", this.f532b);
        for (int i2 = 0; i2 < 7; i2++) {
            editor.putBoolean("reminder_" + i + "_DoW" + i2, this.f533c[i2]);
        }
        editor.putInt("reminder_" + i + "_SayTime", this.f534d);
        editor.putString("reminder_" + i + "_SayBefore", this.f535e);
        editor.putString("reminder_" + i + "_SayAfter", this.f536f);
    }

    /* renamed from: a */
    public void mo513a(SharedPreferences sharedPreferences, int i) {
        m538d();
        this.f531a = sharedPreferences.getInt("reminder_" + i + "_TimeHour", this.f531a);
        this.f532b = sharedPreferences.getInt("reminder_" + i + "_TimeMin", this.f532b);
        for (int i2 = 0; i2 < 7; i2++) {
            boolean[] zArr = this.f533c;
            zArr[i2] = sharedPreferences.getBoolean("reminder_" + i + "_DoW" + i2, this.f533c[i2]);
        }
        this.f534d = sharedPreferences.getInt("reminder_" + i + "_SayTime", this.f534d);
        this.f535e = sharedPreferences.getString("reminder_" + i + "_SayBefore", this.f535e);
        this.f536f = sharedPreferences.getString("reminder_" + i + "_SayAfter", this.f536f);
    }

    /* renamed from: b */
    public void mo514b() {
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 7; i3++) {
            if (this.f533c[i3]) {
                i2++;
            }
        }
        if (i2 == 0) {
            this.f537g = -1;
            return;
        }
        Calendar instance = Calendar.getInstance();
        int i4 = instance.get(7) - 1;
        Calendar instance2 = Calendar.getInstance();
        instance2.set(11, this.f531a);
        instance2.set(12, this.f532b);
        instance2.set(13, 0);
        this.f537g = instance2.getTimeInMillis() - instance.getTimeInMillis();
        do {
            if (!this.f533c[(i4 + i) % 7] || this.f537g <= 0) {
                i++;
                instance2.add(10, 24);
                this.f537g = instance2.getTimeInMillis() - instance.getTimeInMillis();
            } else {
                return;
            }
        } while (i <= 8);
        this.f537g = -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e2  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo515c() {
        /*
            r15 = this;
            r15.mo514b()
            long r0 = r15.f537g
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x000e
            java.lang.String r0 = ""
            return r0
        L_0x000e:
            long r0 = r15.f537g
            double r0 = (double) r0
            r2 = 4678479150791524352(0x40ed4c0000000000, double:60000.0)
            double r0 = r0 + r2
            r4 = 4725570615333879808(0x4194997000000000, double:8.64E7)
            double r0 = r0 / r4
            int r0 = (int) r0
            r1 = 2
            r4 = 0
            if (r0 >= r1) goto L_0x0023
            r0 = 0
        L_0x0023:
            long r5 = r15.f537g
            double r5 = (double) r5
            double r5 = r5 + r2
            double r7 = (double) r0
            r9 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r7 = r7 * r9
            r11 = 4633641066610819072(0x404e000000000000, double:60.0)
            double r7 = r7 * r11
            double r7 = r7 * r11
            r13 = 4627448617123184640(0x4038000000000000, double:24.0)
            double r7 = r7 * r13
            double r5 = r5 - r7
            r13 = 4704985352480227328(0x414b774000000000, double:3600000.0)
            double r5 = r5 / r13
            int r5 = (int) r5
            if (r5 >= r1) goto L_0x0046
            if (r0 != 0) goto L_0x0046
            r5 = 0
        L_0x0046:
            long r13 = r15.f537g
            double r13 = (double) r13
            double r13 = r13 + r2
            double r13 = r13 - r7
            double r6 = (double) r5
            double r6 = r6 * r9
            double r6 = r6 * r11
            double r6 = r6 * r11
            double r13 = r13 - r6
            double r13 = r13 / r2
            int r1 = (int) r13
            java.lang.String r2 = ""
            r3 = 1
            if (r0 <= 0) goto L_0x0079
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r7 = "%d days"
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8[r4] = r0
            java.lang.String r0 = java.lang.String.format(r2, r7, r8)
            r6.append(r0)
            java.lang.String r2 = r6.toString()
        L_0x0079:
            if (r5 <= r3) goto L_0x00b2
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0092
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = ", "
            r0.append(r2)
            java.lang.String r2 = r0.toString()
        L_0x0092:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r6 = "%d hours"
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7[r4] = r5
        L_0x00a6:
            java.lang.String r2 = java.lang.String.format(r2, r6, r7)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            goto L_0x00e0
        L_0x00b2:
            if (r5 != r3) goto L_0x00e0
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x00cb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = ", "
            r0.append(r2)
            java.lang.String r2 = r0.toString()
        L_0x00cb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r6 = "%d hour"
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7[r4] = r5
            goto L_0x00a6
        L_0x00e0:
            if (r1 <= 0) goto L_0x0118
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x00f9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = " and "
            r0.append(r2)
            java.lang.String r2 = r0.toString()
        L_0x00f9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r5 = "%d min"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3[r4] = r1
            java.lang.String r1 = java.lang.String.format(r2, r5, r3)
            r0.append(r1)
            java.lang.String r2 = r0.toString()
        L_0x0118:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Due "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = " from now."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dof100.morsenotifier.C0156p.mo515c():java.lang.String");
    }
}
