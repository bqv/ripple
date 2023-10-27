package com.dof100.morsenotifier;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.preference.EditTextPreference;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MyPreferenceEditText extends EditTextPreference {

    /* renamed from: a */
    private static final ColorStateList f306a = new ColorStateList(new int[][]{new int[]{16842910}, new int[]{-16842910}}, new int[]{Color.rgb(11, 141, 189), -7829368});

    /* renamed from: b */
    private String f307b = "";

    /* renamed from: c */
    private Boolean f308c = true;

    /* renamed from: d */
    private TextView f309d = null;

    public MyPreferenceEditText(Context context) {
        super(context);
        C0140i.m501a("MyEditTextPreference " + getKey() + " Constructor(context) ");
        m437a(context, (AttributeSet) null);
    }

    public MyPreferenceEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0140i.m501a("MyEditTextPreference " + getKey() + " Constructor(context, attrs) ");
        m437a(context, attributeSet);
    }

    public MyPreferenceEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0140i.m501a("MyEditTextPreference " + getKey() + " Constructor(context, attrs, defStyleAttr) ");
        m437a(context, attributeSet);
    }

    /* renamed from: a */
    private String m436a() {
        StringBuilder sb;
        String text = getText();
        if (text == null) {
            C0140i.m501a("MyEditTextPreference " + getKey() + " getValueStr ret = null");
            return "";
        }
        if (!this.f307b.isEmpty()) {
            if (this.f307b.equals("%")) {
                sb = new StringBuilder();
            } else {
                sb = new StringBuilder();
                sb.append(text);
                text = " ";
            }
            sb.append(text);
            sb.append(this.f307b);
            text = sb.toString();
        } else if (text.isEmpty()) {
            text = "(none)";
        }
        C0140i.m501a("MyEditTextPreference " + getKey() + " getValueStr = " + text);
        return text;
    }

    /* renamed from: a */
    private void m437a(Context context, AttributeSet attributeSet) {
        C0140i.m501a("MyEditTextPreference " + getKey() + " init");
        if (attributeSet != null) {
            boolean equalsIgnoreCase = C0163v.m557a(context, attributeSet, "http://mypreferencenamespace.100dof.com", "enableFree", "true").equalsIgnoreCase("true");
            if (App.f282a) {
                setEnabled(equalsIgnoreCase);
            }
            boolean equalsIgnoreCase2 = C0163v.m557a(context, attributeSet, "http://mypreferencenamespace.100dof.com", "enablePro", "true").equalsIgnoreCase("true");
            if (App.f283b) {
                setEnabled(equalsIgnoreCase2);
            }
        }
        for (int i = 0; i < attributeSet.getAttributeCount(); i++) {
            String attributeName = attributeSet.getAttributeName(i);
            String attributeValue = attributeSet.getAttributeValue(i);
            if (attributeName.equalsIgnoreCase("valueUnits")) {
                this.f307b = attributeValue;
            } else if (attributeName.equalsIgnoreCase("valueShow")) {
                this.f308c = Boolean.valueOf(attributeValue.toLowerCase().contains("true"));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo411a(View view) {
        C0140i.m501a("MyEditTextPreference " + getKey() + " myCreateView");
        RelativeLayout relativeLayout = (RelativeLayout) ((TextView) view.findViewById(16908304)).getParent();
        if (this.f309d != null) {
            C0140i.m501a("MyEditTextPreference " + getKey() + " myCreateView mValueTV!=null");
            relativeLayout.removeView(this.f309d);
            this.f309d = null;
        }
        this.f309d = new TextView(view.getContext());
        if (Build.VERSION.SDK_INT < 23) {
            this.f309d.setTextAppearance(view.getContext(), 16973894);
        } else {
            this.f309d.setTextAppearance(16973894);
        }
        this.f309d.setTextColor(f306a);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(5, 16908304);
        layoutParams.addRule(3, 16908304);
        this.f309d.setLayoutParams(layoutParams);
        this.f309d.setVisibility(this.f308c.booleanValue() ? 0 : 8);
        relativeLayout.addView(this.f309d);
    }

    /* access modifiers changed from: protected */
    public void onBindView(View view) {
        C0140i.m501a("MyEditTextPreference " + getKey() + " onBindView");
        RelativeLayout relativeLayout = (RelativeLayout) ((TextView) view.findViewById(16908304)).getParent();
        this.f309d = null;
        for (int i = 0; i < relativeLayout.getChildCount(); i++) {
            View childAt = relativeLayout.getChildAt(i);
            if (!(!(childAt instanceof TextView) || childAt.getId() == 16908310 || childAt.getId() == 16908304)) {
                this.f309d = (TextView) childAt;
            }
        }
        if (this.f309d != null) {
            String a = m436a();
            if (!TextUtils.isEmpty(a)) {
                this.f309d.setText(a);
                this.f309d.setVisibility(0);
            } else {
                this.f309d.setVisibility(8);
            }
        }
        super.onBindView(view);
    }

    /* access modifiers changed from: protected */
    public View onCreateView(ViewGroup viewGroup) {
        C0140i.m501a("MyEditTextPreference " + getKey() + " onCreateView");
        View onCreateView = super.onCreateView(viewGroup);
        mo411a(onCreateView);
        return onCreateView;
    }

    /* access modifiers changed from: protected */
    public void onDialogClosed(boolean z) {
        super.onDialogClosed(z);
        C0140i.m501a("MyEditTextPreference " + getKey() + " onDialogClosed");
        if (this.f309d != null) {
            this.f309d.setText(m436a());
        }
    }

    public void setText(String str) {
        super.setText(str);
        C0140i.m501a("MyEditTextPreference " + getKey() + " setText " + str);
        if (this.f309d != null) {
            this.f309d.setText(m436a());
        }
    }
}
