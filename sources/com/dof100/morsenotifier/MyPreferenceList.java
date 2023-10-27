package com.dof100.morsenotifier;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.preference.ListPreference;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MyPreferenceList extends ListPreference {

    /* renamed from: a */
    private static final ColorStateList f310a = new ColorStateList(new int[][]{new int[]{16842910}, new int[]{-16842910}}, new int[]{Color.rgb(11, 141, 189), -7829368});

    /* renamed from: b */
    private String f311b = "";

    /* renamed from: c */
    private Boolean f312c = true;

    /* renamed from: d */
    private TextView f313d = null;

    public MyPreferenceList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        for (int i = 0; i < attributeSet.getAttributeCount(); i++) {
            String attributeName = attributeSet.getAttributeName(i);
            String attributeValue = attributeSet.getAttributeValue(i);
            if (attributeName.equalsIgnoreCase("valueUnits")) {
                this.f311b = attributeValue;
            } else if (attributeName.equalsIgnoreCase("valueShow")) {
                this.f312c = Boolean.valueOf(attributeValue.toLowerCase().contains("true"));
            }
        }
        boolean equalsIgnoreCase = C0163v.m557a(context, attributeSet, "http://mypreferencenamespace.100dof.com", "enableFree", "true").equalsIgnoreCase("true");
        if (App.f282a) {
            setEnabled(equalsIgnoreCase);
        }
        boolean equalsIgnoreCase2 = C0163v.m557a(context, attributeSet, "http://mypreferencenamespace.100dof.com", "enablePro", "true").equalsIgnoreCase("true");
        if (App.f283b) {
            setEnabled(equalsIgnoreCase2);
        }
    }

    /* renamed from: b */
    private String m439b() {
        StringBuilder sb;
        if (getEntry() == null) {
            C0140i.m501a("MyListPreference.getValueStr cs=null");
            return "";
        }
        String charSequence = getEntry().toString();
        if (this.f311b.isEmpty()) {
            return charSequence;
        }
        if (this.f311b.equals("%")) {
            sb = new StringBuilder();
        } else {
            sb = new StringBuilder();
            sb.append(charSequence);
            charSequence = " ";
        }
        sb.append(charSequence);
        sb.append(this.f311b);
        return sb.toString();
    }

    /* renamed from: a */
    public void mo416a() {
        if (this.f313d != null) {
            this.f313d.setText(m439b());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo417a(View view) {
        C0140i.m501a("MyPreferenceList " + getKey() + " myCreateView");
        RelativeLayout relativeLayout = (RelativeLayout) ((TextView) view.findViewById(16908304)).getParent();
        if (this.f313d != null) {
            C0140i.m501a("MyPreferenceList " + getKey() + " myCreateView mValueTV!=null");
            relativeLayout.removeView(this.f313d);
            this.f313d = null;
        }
        this.f313d = new TextView(view.getContext());
        if (Build.VERSION.SDK_INT < 23) {
            this.f313d.setTextAppearance(view.getContext(), 16973894);
        } else {
            this.f313d.setTextAppearance(16973894);
        }
        this.f313d.setTextColor(f310a);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(5, 16908304);
        layoutParams.addRule(3, 16908304);
        this.f313d.setLayoutParams(layoutParams);
        this.f313d.setVisibility(this.f312c.booleanValue() ? 0 : 8);
        relativeLayout.addView(this.f313d);
    }

    /* access modifiers changed from: protected */
    public void onBindView(View view) {
        C0140i.m501a("MyPreferenceList.onBindView");
        RelativeLayout relativeLayout = (RelativeLayout) ((TextView) view.findViewById(16908304)).getParent();
        this.f313d = null;
        for (int i = 0; i < relativeLayout.getChildCount(); i++) {
            View childAt = relativeLayout.getChildAt(i);
            if (!(!(childAt instanceof TextView) || childAt.getId() == 16908310 || childAt.getId() == 16908304)) {
                this.f313d = (TextView) childAt;
            }
        }
        if (this.f313d != null) {
            String b = m439b();
            if (!TextUtils.isEmpty(b)) {
                this.f313d.setText(b);
                this.f313d.setVisibility(0);
            } else {
                this.f313d.setVisibility(8);
            }
        }
        super.onBindView(view);
    }

    /* access modifiers changed from: protected */
    public View onCreateView(ViewGroup viewGroup) {
        C0140i.m501a("MyPreferenceList " + getKey() + " onCreateView");
        View onCreateView = super.onCreateView(viewGroup);
        mo417a(onCreateView);
        return onCreateView;
    }

    /* access modifiers changed from: protected */
    public void onDialogClosed(boolean z) {
        super.onDialogClosed(z);
        if (this.f313d != null) {
            this.f313d.setText(m439b());
        }
    }
}
