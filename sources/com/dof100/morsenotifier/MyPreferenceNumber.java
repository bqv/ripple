package com.dof100.morsenotifier;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.preference.DialogPreference;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Locale;

public class MyPreferenceNumber extends DialogPreference {

    /* renamed from: a */
    private static final ColorStateList f314a = new ColorStateList(new int[][]{new int[]{16842910}, new int[]{-16842910}}, new int[]{Color.rgb(11, 141, 189), -7829368});

    /* renamed from: b */
    private NumberPicker f315b = null;

    /* renamed from: c */
    private int f316c;

    /* renamed from: d */
    private int f317d;

    /* renamed from: e */
    private int f318e;

    /* renamed from: f */
    private int f319f;

    /* renamed from: g */
    private String f320g;

    /* renamed from: h */
    private Boolean f321h;

    /* renamed from: i */
    private TextView f322i;

    public MyPreferenceNumber(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f316c = 0;
        this.f317d = 0;
        this.f318e = 10;
        this.f319f = 1;
        this.f320g = "";
        this.f321h = true;
        this.f322i = null;
        setPositiveButtonText("Set");
        setNegativeButtonText("Cancel");
        for (int i = 0; i < attributeSet.getAttributeCount(); i++) {
            String attributeName = attributeSet.getAttributeName(i);
            String attributeValue = attributeSet.getAttributeValue(i);
            if (attributeName.equalsIgnoreCase("vmin") || attributeName.equalsIgnoreCase("valueMin")) {
                this.f317d = Integer.parseInt(attributeValue);
            } else if (attributeName.equalsIgnoreCase("vmax") || attributeName.equalsIgnoreCase("valueMax")) {
                this.f318e = Integer.parseInt(attributeValue);
            } else if (attributeName.equalsIgnoreCase("vstep") || attributeName.equalsIgnoreCase("valueStep")) {
                this.f319f = Integer.parseInt(attributeValue);
            } else if (attributeName.equalsIgnoreCase("vunits") || attributeName.equalsIgnoreCase("valueUnits")) {
                this.f320g = attributeValue;
            } else if (attributeName.equalsIgnoreCase("valueShow")) {
                this.f321h = Boolean.valueOf(attributeValue.toLowerCase().contains("true"));
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

    /* renamed from: a */
    private String m442a() {
        StringBuilder sb;
        String num = Integer.toString(this.f316c);
        if (!this.f320g.isEmpty()) {
            if (this.f320g.equals("%")) {
                sb = new StringBuilder();
            } else {
                sb = new StringBuilder();
                sb.append(num);
                num = " ";
            }
            sb.append(num);
            sb.append(this.f320g);
            num = sb.toString();
        }
        C0140i.m501a("MyNumberPreference.getValueStr =" + num);
        return num;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo421a(View view) {
        C0140i.m501a("MyNumberPreference " + getKey() + " myCreateView");
        RelativeLayout relativeLayout = (RelativeLayout) ((TextView) view.findViewById(16908304)).getParent();
        if (this.f322i != null) {
            C0140i.m501a("MyNumberPreference " + getKey() + " myCreateView mValueTV!=null");
            relativeLayout.removeView(this.f322i);
            this.f322i = null;
        }
        this.f322i = new TextView(view.getContext());
        if (Build.VERSION.SDK_INT < 23) {
            this.f322i.setTextAppearance(view.getContext(), 16973894);
        } else {
            this.f322i.setTextAppearance(16973894);
        }
        this.f322i.setTextColor(f314a);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(5, 16908304);
        layoutParams.addRule(3, 16908304);
        this.f322i.setLayoutParams(layoutParams);
        this.f322i.setVisibility(this.f321h.booleanValue() ? 0 : 8);
        relativeLayout.addView(this.f322i);
    }

    /* access modifiers changed from: protected */
    public void onBindDialogView(View view) {
        super.onBindDialogView(view);
        this.f315b.setValue((this.f316c - this.f317d) / this.f319f);
    }

    /* access modifiers changed from: protected */
    public void onBindView(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) ((TextView) view.findViewById(16908304)).getParent();
        this.f322i = null;
        for (int i = 0; i < relativeLayout.getChildCount(); i++) {
            View childAt = relativeLayout.getChildAt(i);
            if (!(!(childAt instanceof TextView) || childAt.getId() == 16908310 || childAt.getId() == 16908304)) {
                this.f322i = (TextView) childAt;
            }
        }
        if (this.f322i != null) {
            String a = m442a();
            if (!TextUtils.isEmpty(a)) {
                this.f322i.setText(a);
                this.f322i.setVisibility(0);
            } else {
                this.f322i.setVisibility(8);
            }
        }
        super.onBindView(view);
    }

    /* access modifiers changed from: protected */
    public View onCreateDialogView() {
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setPadding(6, 6, 6, 6);
        this.f315b = new NumberPicker(context);
        this.f315b.setGravity(17);
        int i = (this.f318e - this.f317d) / this.f319f;
        String[] strArr = new String[(i + 0 + 1)];
        for (int i2 = 0; i2 <= i; i2++) {
            strArr[i2] = Integer.toString(this.f317d + (this.f319f * i2));
        }
        this.f315b.setMinValue(0);
        this.f315b.setMaxValue(i);
        this.f315b.setDisplayedValues(strArr);
        this.f315b.setDescendantFocusability(393216);
        linearLayout.addView(this.f315b);
        if (!this.f320g.isEmpty()) {
            TextView textView = new TextView(context);
            textView.setText(String.format(Locale.US, " %s", new Object[]{this.f320g}));
            textView.setGravity(17);
            linearLayout.addView(textView);
        }
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    public View onCreateView(ViewGroup viewGroup) {
        C0140i.m501a("MyNumberPreference " + getKey() + " onCreateView");
        View onCreateView = super.onCreateView(viewGroup);
        mo421a(onCreateView);
        return onCreateView;
    }

    /* access modifiers changed from: protected */
    public void onDialogClosed(boolean z) {
        super.onDialogClosed(z);
        C0140i.m501a("MyNumberPreference.onDialogClosed");
        if (z) {
            this.f316c = this.f317d + (this.f315b.getValue() * this.f319f);
            if (callChangeListener(Integer.valueOf(this.f316c))) {
                persistString(Integer.toString(this.f316c));
            }
        }
        if (this.f322i != null) {
            this.f322i.setText(m442a());
        }
        notifyChanged();
    }

    /* access modifiers changed from: protected */
    public Object onGetDefaultValue(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* access modifiers changed from: protected */
    public void onSetInitialValue(boolean z, Object obj) {
        int i;
        if (z) {
            i = Integer.parseInt(getPersistedString("0"));
        } else {
            i = Integer.parseInt(obj.toString());
            persistString(obj.toString());
        }
        this.f316c = i;
    }
}
