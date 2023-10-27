package com.dof100.morsenotifier;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MyPreferenceText extends Preference {

    /* renamed from: a */
    private static final ColorStateList f323a = new ColorStateList(new int[][]{new int[]{16842910}, new int[]{-16842910}}, new int[]{Color.rgb(240, 240, 160), -7829368});

    /* renamed from: b */
    private static final ColorStateList f324b = new ColorStateList(new int[][]{new int[]{16842910}, new int[]{-16842910}}, new int[]{Color.rgb(11, 141, 189), -7829368});

    /* renamed from: c */
    private final Context f325c;

    /* renamed from: d */
    private boolean f326d = true;

    /* renamed from: e */
    private final String f327e;

    /* renamed from: f */
    private final String f328f;

    /* renamed from: g */
    private final String f329g;

    /* renamed from: h */
    private final String f330h;

    /* renamed from: i */
    private Boolean f331i;

    /* renamed from: j */
    private Boolean f332j;

    /* renamed from: k */
    private TextView f333k;

    /* renamed from: l */
    private String f334l;

    public MyPreferenceText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f331i = false;
        this.f332j = true;
        this.f333k = null;
        this.f334l = "";
        this.f325c = context;
        setSelectable(false);
        this.f327e = C0163v.m557a(context, attributeSet, "http://mypreferencenamespace.100dof.com", "buttonIntentClass", "");
        this.f328f = C0163v.m557a(context, attributeSet, "http://mypreferencenamespace.100dof.com", "buttonMsgWhat", "0");
        this.f329g = C0163v.m557a(context, attributeSet, "http://mypreferencenamespace.100dof.com", "buttonMsgExtraText1", "0");
        this.f330h = C0163v.m557a(context, attributeSet, "http://mypreferencenamespace.100dof.com", "buttonMsgExtraText2", "0");
        for (int i = 0; i < attributeSet.getAttributeCount(); i++) {
            String attributeName = attributeSet.getAttributeName(i);
            String attributeValue = attributeSet.getAttributeValue(i);
            if (attributeName.equalsIgnoreCase("valueShow")) {
                this.f332j = Boolean.valueOf(attributeValue.toLowerCase().contains("true"));
            } else if (attributeName.equalsIgnoreCase("titleYellow")) {
                this.f331i = Boolean.valueOf(attributeValue.toLowerCase().contains("true"));
            }
        }
        boolean equalsIgnoreCase = C0163v.m557a(context, attributeSet, "http://mypreferencenamespace.100dof.com", "enableFree", "true").equalsIgnoreCase("true");
        boolean equalsIgnoreCase2 = C0163v.m557a(context, attributeSet, "http://mypreferencenamespace.100dof.com", "enablePro", "true").equalsIgnoreCase("true");
        boolean equalsIgnoreCase3 = C0163v.m557a(context, attributeSet, "http://mypreferencenamespace.100dof.com", "visibleFree", "true").equalsIgnoreCase("true");
        boolean equalsIgnoreCase4 = C0163v.m557a(context, attributeSet, "http://mypreferencenamespace.100dof.com", "visiblePro", "true").equalsIgnoreCase("true");
        if (App.f282a) {
            setEnabled(equalsIgnoreCase);
            this.f326d = equalsIgnoreCase3;
        }
        if (App.f283b) {
            setEnabled(equalsIgnoreCase2);
            this.f326d = equalsIgnoreCase4;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0058 A[Catch:{ Exception -> 0x0098 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006b A[Catch:{ Exception -> 0x0098 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m444a() {
        /*
            r5 = this;
            r0 = 0
            android.content.Intent r1 = new android.content.Intent     // Catch:{ ClassNotFoundException -> 0x0047 }
            android.content.Context r2 = r5.f325c     // Catch:{ ClassNotFoundException -> 0x0047 }
            java.lang.String r3 = r5.f327e     // Catch:{ ClassNotFoundException -> 0x0047 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x0047 }
            r1.<init>(r2, r3)     // Catch:{ ClassNotFoundException -> 0x0047 }
            android.content.Context r0 = r5.f325c     // Catch:{ ClassNotFoundException -> 0x0045 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ ClassNotFoundException -> 0x0045 }
            r2 = 2131492900(0x7f0c0024, float:1.8609265E38)
            java.lang.String r0 = r0.getString(r2)     // Catch:{ ClassNotFoundException -> 0x0045 }
            java.lang.String r2 = r5.f328f     // Catch:{ ClassNotFoundException -> 0x0045 }
            r1.putExtra(r0, r2)     // Catch:{ ClassNotFoundException -> 0x0045 }
            android.content.Context r0 = r5.f325c     // Catch:{ ClassNotFoundException -> 0x0045 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ ClassNotFoundException -> 0x0045 }
            r2 = 2131492875(0x7f0c000b, float:1.8609214E38)
            java.lang.String r0 = r0.getString(r2)     // Catch:{ ClassNotFoundException -> 0x0045 }
            java.lang.String r2 = r5.f329g     // Catch:{ ClassNotFoundException -> 0x0045 }
            r1.putExtra(r0, r2)     // Catch:{ ClassNotFoundException -> 0x0045 }
            android.content.Context r0 = r5.f325c     // Catch:{ ClassNotFoundException -> 0x0045 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ ClassNotFoundException -> 0x0045 }
            r2 = 2131492876(0x7f0c000c, float:1.8609216E38)
            java.lang.String r0 = r0.getString(r2)     // Catch:{ ClassNotFoundException -> 0x0045 }
            java.lang.String r2 = r5.f330h     // Catch:{ ClassNotFoundException -> 0x0045 }
            r1.putExtra(r0, r2)     // Catch:{ ClassNotFoundException -> 0x0045 }
            goto L_0x004e
        L_0x0045:
            r0 = move-exception
            goto L_0x004b
        L_0x0047:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x004b:
            r0.printStackTrace()
        L_0x004e:
            java.lang.String r0 = r5.f327e     // Catch:{ Exception -> 0x0098 }
            java.lang.String r2 = "PLAYSTORE"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0098 }
            if (r0 == 0) goto L_0x006b
            android.content.Context r0 = r5.f325c     // Catch:{ Exception -> 0x0098 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x0098 }
            java.lang.String r2 = "android.intent.action.VIEW"
            java.lang.String r3 = com.dof100.morsenotifier.App.f293l     // Catch:{ Exception -> 0x0098 }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ Exception -> 0x0098 }
            r1.<init>(r2, r3)     // Catch:{ Exception -> 0x0098 }
        L_0x0067:
            r0.startActivity(r1)     // Catch:{ Exception -> 0x0098 }
            return
        L_0x006b:
            java.lang.String r0 = r5.f327e     // Catch:{ Exception -> 0x0098 }
            java.lang.String r2 = "PLAYSTOREPRO"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0098 }
            if (r0 == 0) goto L_0x0085
            android.content.Context r0 = r5.f325c     // Catch:{ Exception -> 0x0098 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x0098 }
            java.lang.String r2 = "android.intent.action.VIEW"
            java.lang.String r3 = com.dof100.morsenotifier.App.f294m     // Catch:{ Exception -> 0x0098 }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ Exception -> 0x0098 }
            r1.<init>(r2, r3)     // Catch:{ Exception -> 0x0098 }
            goto L_0x0067
        L_0x0085:
            java.lang.String r0 = r5.f327e     // Catch:{ Exception -> 0x0098 }
            java.lang.String r2 = "Service"
            boolean r0 = r0.contains(r2)     // Catch:{ Exception -> 0x0098 }
            if (r0 == 0) goto L_0x0095
            android.content.Context r0 = r5.f325c     // Catch:{ Exception -> 0x0098 }
            r0.startService(r1)     // Catch:{ Exception -> 0x0098 }
            return
        L_0x0095:
            android.content.Context r0 = r5.f325c     // Catch:{ Exception -> 0x0098 }
            goto L_0x0067
        L_0x0098:
            r0 = move-exception
            r0.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dof100.morsenotifier.MyPreferenceText.m444a():void");
    }

    /* renamed from: a */
    public void mo429a(String str) {
        this.f334l = str;
        if (this.f333k == null) {
            C0140i.m501a("MyPreferenceText.setValue ERROR  mValueTV == null");
        } else {
            this.f333k.setText(str);
        }
    }

    /* access modifiers changed from: protected */
    public void onBindView(View view) {
        C0140i.m501a("MyPreferenceText.onBindView");
        TextView textView = (TextView) view.findViewById(16908310);
        if (this.f331i.booleanValue() && textView != null) {
            textView.setTextColor(f323a);
        }
        TextView textView2 = (TextView) view.findViewById(16908304);
        if (textView2 != null) {
            RelativeLayout relativeLayout = (RelativeLayout) textView2.getParent();
            this.f333k = new TextView(view.getContext());
            this.f333k.setText("");
            if (Build.VERSION.SDK_INT < 23) {
                this.f333k.setTextAppearance(view.getContext(), 16973894);
            } else {
                this.f333k.setTextAppearance(16973894);
            }
            this.f333k.setTextColor(f324b);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(5, textView2.getId());
            layoutParams.addRule(3, textView2.getId());
            this.f333k.setLayoutParams(layoutParams);
            this.f333k.setVisibility(this.f332j.booleanValue() ? 0 : 8);
            relativeLayout.addView(this.f333k);
        } else {
            this.f333k = null;
        }
        if (!this.f327e.isEmpty()) {
            if (textView != null) {
                textView.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        MyPreferenceText.this.m444a();
                    }
                });
            }
            if (textView2 != null) {
                textView2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        MyPreferenceText.this.m444a();
                    }
                });
            }
            if (this.f333k != null) {
                this.f333k.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        MyPreferenceText.this.m444a();
                    }
                });
            }
        }
        mo429a(this.f334l);
        super.onBindView(view);
    }

    /* access modifiers changed from: protected */
    public View onCreateView(ViewGroup viewGroup) {
        C0140i.m501a("MyPreferenceText.onBindView");
        View onCreateView = super.onCreateView(viewGroup);
        if (this.f326d) {
            return onCreateView;
        }
        View view = new View(viewGroup.getContext());
        view.setVisibility(8);
        TextView textView = new TextView(view.getContext());
        textView.setId(16908304);
        textView.setVisibility(8);
        TextView textView2 = new TextView(view.getContext());
        textView2.setId(16908310);
        textView2.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(view.getContext());
        linearLayout.setId(16908312);
        linearLayout.setVisibility(8);
        return view;
    }
}
