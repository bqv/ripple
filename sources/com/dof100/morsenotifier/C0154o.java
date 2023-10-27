package com.dof100.morsenotifier;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import java.util.ArrayList;

/* renamed from: com.dof100.morsenotifier.o */
class C0154o extends ArrayAdapter<C0152m> implements View.OnClickListener {

    /* renamed from: a */
    private final Context f527a;

    /* renamed from: b */
    private final C0131b f528b;

    /* renamed from: c */
    private final LayoutInflater f529c = ((LayoutInflater) this.f527a.getSystemService("layout_inflater"));

    /* renamed from: d */
    private final C0155a f530d;

    /* renamed from: com.dof100.morsenotifier.o$a */
    public interface C0155a {
        /* renamed from: a */
        void mo386a(int i, View view);
    }

    public C0154o(Context context, ArrayList<C0152m> arrayList, C0131b bVar, C0155a aVar) {
        super(context, R.layout.activity_recent_notifications_listitem, arrayList);
        this.f528b = bVar;
        this.f530d = aVar;
        C0140i.m501a("MyRecentNotificationsArrayAdapter.constructor");
        this.f527a = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0264  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r10, android.view.View r11, android.view.ViewGroup r12) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "MyAppFiltersArrayAdapter.getView position="
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = "  v="
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.dof100.morsenotifier.C0140i.m501a((java.lang.String) r0)
            java.lang.Object r10 = r9.getItem(r10)
            com.dof100.morsenotifier.m r10 = (com.dof100.morsenotifier.C0152m) r10
            if (r10 != 0) goto L_0x0029
            com.dof100.morsenotifier.m r10 = new com.dof100.morsenotifier.m
            r10.<init>()
        L_0x0029:
            r0 = -1
            r10.f523i = r0
            java.lang.String r0 = ""
            r10.f524j = r0
            r0 = 0
            r1 = 0
        L_0x0032:
            com.dof100.morsenotifier.b r2 = r9.f528b
            java.util.ArrayList<com.dof100.morsenotifier.a> r2 = r2.f446a
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x0058
            com.dof100.morsenotifier.b r2 = r9.f528b
            java.util.ArrayList<com.dof100.morsenotifier.a> r2 = r2.f446a
            java.lang.Object r2 = r2.get(r1)
            com.dof100.morsenotifier.a r2 = (com.dof100.morsenotifier.C0130a) r2
            java.lang.String r2 = r2.mo465a((com.dof100.morsenotifier.C0152m) r10)
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x0055
            r10.f523i = r1
            r10.f524j = r2
            goto L_0x0058
        L_0x0055:
            int r1 = r1 + 1
            goto L_0x0032
        L_0x0058:
            if (r11 != 0) goto L_0x0063
            android.view.LayoutInflater r11 = r9.f529c
            r1 = 2131296263(0x7f090007, float:1.8210438E38)
            android.view.View r11 = r11.inflate(r1, r12, r0)
        L_0x0063:
            r11.setTag(r10)
            r12 = 2131165304(0x7f070078, float:1.7944821E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r12.setTag(r10)
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r2 = "dd MMM yyyy, hh:mm:ss:ssss"
            java.util.Locale r3 = java.util.Locale.US
            r1.<init>(r2, r3)
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            long r3 = r10.f515a
            r2.setTimeInMillis(r3)
            java.util.Date r2 = r2.getTime()
            java.lang.String r1 = r1.format(r2)
            r12.setText(r1)
            r12 = 2131165296(0x7f070070, float:1.7944805E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r12.setTag(r10)
            android.content.Context r1 = r9.f527a
            java.lang.String r2 = r10.f516b
            java.lang.String r1 = com.dof100.morsenotifier.C0163v.m558a((android.content.Context) r1, (java.lang.String) r2)
            r12.setText(r1)
            r12 = 2131165301(0x7f070075, float:1.7944815E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r12.setTag(r10)
            java.lang.String r1 = "(%s)"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = r10.f516b
            r3[r0] = r4
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r12.setText(r1)
            r12 = 2131165305(0x7f070079, float:1.7944823E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r12.setTag(r10)
            java.lang.String r1 = r10.f517c
            if (r1 == 0) goto L_0x00de
            java.lang.String r1 = r10.f517c
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00db
            goto L_0x00de
        L_0x00db:
            java.lang.String r1 = r10.f517c
            goto L_0x00e0
        L_0x00de:
            java.lang.String r1 = "-"
        L_0x00e0:
            r12.setText(r1)
            r12 = 2131165302(0x7f070076, float:1.7944817E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r12.setTag(r10)
            java.lang.String r1 = r10.f518d
            if (r1 == 0) goto L_0x00ff
            java.lang.String r1 = r10.f518d
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00fc
            goto L_0x00ff
        L_0x00fc:
            java.lang.String r1 = r10.f518d
            goto L_0x0101
        L_0x00ff:
            java.lang.String r1 = "-"
        L_0x0101:
            r12.setText(r1)
            r12 = 2131165303(0x7f070077, float:1.794482E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r12.setTag(r10)
            java.lang.String r1 = r10.f519e
            if (r1 == 0) goto L_0x0120
            java.lang.String r1 = r10.f519e
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x011d
            goto L_0x0120
        L_0x011d:
            java.lang.String r1 = r10.f519e
            goto L_0x0122
        L_0x0120:
            java.lang.String r1 = "-"
        L_0x0122:
            r12.setText(r1)
            r12 = 2131165297(0x7f070071, float:1.7944807E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r12.setTag(r10)
            java.lang.String r1 = r10.f520f
            if (r1 == 0) goto L_0x0141
            java.lang.String r1 = r10.f520f
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x013e
            goto L_0x0141
        L_0x013e:
            java.lang.String r1 = r10.f520f
            goto L_0x0143
        L_0x0141:
            java.lang.String r1 = "-"
        L_0x0143:
            r12.setText(r1)
            r12 = 2131165298(0x7f070072, float:1.794481E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r12.setTag(r10)
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r3 = "%d"
            java.lang.Object[] r4 = new java.lang.Object[r2]
            int r5 = r10.f521g
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r0] = r5
            java.lang.String r1 = java.lang.String.format(r1, r3, r4)
            r12.setText(r1)
            r12 = 2131165294(0x7f07006e, float:1.7944801E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r12.setTag(r10)
            int r1 = r10.f522h
            r3 = -256(0xffffffffffffff00, float:NaN)
            r4 = -65536(0xffffffffffff0000, float:NaN)
            switch(r1) {
                case -4: goto L_0x01ad;
                case -3: goto L_0x01a4;
                case -2: goto L_0x019b;
                case -1: goto L_0x0195;
                case 0: goto L_0x0189;
                case 1: goto L_0x017d;
                default: goto L_0x017c;
            }
        L_0x017c:
            goto L_0x01bc
        L_0x017d:
            r1 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r12.setTextColor(r1)
            android.content.Context r1 = r9.f527a
            r3 = 2131493244(0x7f0c017c, float:1.8609963E38)
            goto L_0x01b5
        L_0x0189:
            r1 = -7829368(0xffffffffff888888, float:NaN)
            r12.setTextColor(r1)
            android.content.Context r1 = r9.f527a
            r3 = 2131493248(0x7f0c0180, float:1.860997E38)
            goto L_0x01b5
        L_0x0195:
            r12.setTextColor(r4)
            java.lang.String r1 = "Not announced (options)"
            goto L_0x01b9
        L_0x019b:
            r12.setTextColor(r4)
            android.content.Context r1 = r9.f527a
            r3 = 2131493245(0x7f0c017d, float:1.8609965E38)
            goto L_0x01b5
        L_0x01a4:
            r12.setTextColor(r3)
            android.content.Context r1 = r9.f527a
            r3 = 2131493246(0x7f0c017e, float:1.8609967E38)
            goto L_0x01b5
        L_0x01ad:
            r12.setTextColor(r3)
            android.content.Context r1 = r9.f527a
            r3 = 2131493247(0x7f0c017f, float:1.8609969E38)
        L_0x01b5:
            java.lang.String r1 = r1.getString(r3)
        L_0x01b9:
            r12.setText(r1)
        L_0x01bc:
            r12 = 2131165299(0x7f070073, float:1.7944811E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r12.setTag(r10)
            int r1 = r10.f523i
            r3 = -16711681(0xffffffffff00ffff, float:-1.714704E38)
            if (r1 >= 0) goto L_0x01df
            r12.setTextColor(r3)
            android.content.Context r1 = r9.f527a
            r5 = 2131493251(0x7f0c0183, float:1.8609977E38)
        L_0x01d7:
            java.lang.String r1 = r1.getString(r5)
            r12.setText(r1)
            goto L_0x01e8
        L_0x01df:
            r12.setTextColor(r3)
            android.content.Context r1 = r9.f527a
            r5 = 2131493250(0x7f0c0182, float:1.8609975E38)
            goto L_0x01d7
        L_0x01e8:
            r12 = 2131165300(0x7f070074, float:1.7944813E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r12.setTag(r10)
            int r1 = r10.f523i
            r5 = 0
            if (r1 >= 0) goto L_0x0202
            java.lang.String r1 = ""
            r12.setText(r1)
            r12.setOnClickListener(r5)
            goto L_0x022e
        L_0x0202:
            r12.setTextColor(r3)
            int r1 = r12.getPaintFlags()
            r1 = r1 | 8
            r12.setPaintFlags(r1)
            java.util.Locale r1 = java.util.Locale.US
            android.content.Context r6 = r9.f527a
            r7 = 2131493249(0x7f0c0181, float:1.8609973E38)
            java.lang.String r6 = r6.getString(r7)
            java.lang.Object[] r7 = new java.lang.Object[r2]
            int r8 = r10.f523i
            int r8 = r8 + r2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r0] = r8
            java.lang.String r1 = java.lang.String.format(r1, r6, r7)
            r12.setText(r1)
            r12.setOnClickListener(r9)
        L_0x022e:
            r12 = 2131165295(0x7f07006f, float:1.7944803E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r12.setTag(r10)
            int r1 = r10.f523i
            if (r1 >= 0) goto L_0x0247
            r12.setTextColor(r4)
            java.lang.String r1 = ""
        L_0x0243:
            r12.setText(r1)
            goto L_0x024d
        L_0x0247:
            r12.setTextColor(r3)
            java.lang.String r1 = r10.f524j
            goto L_0x0243
        L_0x024d:
            r12 = 2131165200(0x7f070010, float:1.794461E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.Button r12 = (android.widget.Button) r12
            r12.setTag(r10)
            int r10 = r10.f523i
            if (r10 < 0) goto L_0x0264
            r12.setOnClickListener(r9)
            r12.setEnabled(r2)
            return r11
        L_0x0264:
            r12.setOnClickListener(r5)
            r12.setEnabled(r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dof100.morsenotifier.C0154o.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public void onClick(View view) {
        String str;
        if (view != null) {
            C0140i.m501a("MyRecentNotificationsArrayAdapter.onClick");
            C0152m mVar = (C0152m) view.getTag();
            if (mVar == null) {
                str = "MyRecentNotificationsArrayAdapter.onClick n=null";
            } else if (mVar.f523i < 0) {
                str = "MyRecentNotificationsArrayAdapter.onClick tmpfilter<0";
            } else if (view.getId() == R.id.b_test) {
                C0140i.m501a("MyRecentNotificationsArrayAdapter.onClick b_test");
                if (mVar.f524j.isEmpty()) {
                    str = "MyRecentNotificationsArrayAdapter.onClick tmpAnnouncement.isEmpty";
                } else {
                    Intent intent = new Intent(this.f527a, ServiceMain.class);
                    intent.putExtra(this.f527a.getResources().getString(R.string.MSG_WHAT), this.f527a.getResources().getString(R.string.MSG_APPS_NOTIFY));
                    intent.putExtra(this.f527a.getResources().getString(R.string.MSG_EXTRATEXT2), mVar.f524j);
                    this.f527a.startService(intent);
                    return;
                }
            } else if (view.getId() == R.id.tv_recentnotification_matchingfilternum) {
                C0140i.m501a("MyAppFiltersArrayAdapter.onClick tv_recentnotification_announcedcriteria");
                this.f530d.mo386a(mVar.f523i, view);
                return;
            } else {
                return;
            }
            C0140i.m501a(str);
        }
    }
}
