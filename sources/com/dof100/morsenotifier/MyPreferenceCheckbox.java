package com.dof100.morsenotifier;

import android.content.Context;
import android.preference.CheckBoxPreference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyPreferenceCheckbox extends CheckBoxPreference {
    public MyPreferenceCheckbox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean equalsIgnoreCase = C0163v.m557a(context, attributeSet, "http://mypreferencenamespace.100dof.com", "enableFree", "true").equalsIgnoreCase("true");
        if (App.f282a) {
            setEnabled(equalsIgnoreCase);
        }
        boolean equalsIgnoreCase2 = C0163v.m557a(context, attributeSet, "http://mypreferencenamespace.100dof.com", "enablePro", "true").equalsIgnoreCase("true");
        if (App.f283b) {
            setEnabled(equalsIgnoreCase2);
        }
    }

    /* access modifiers changed from: protected */
    public void onBindView(View view) {
        ((TextView) view.findViewById(16908304)).setVisibility(8);
        View findViewById = view.findViewById(16908289);
        LinearLayout linearLayout = (LinearLayout) ((LinearLayout) findViewById.getParent()).getParent();
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.height /= 2;
        linearLayout.setLayoutParams(layoutParams);
        ((CheckBox) findViewById).setButtonDrawable(R.drawable.mycheckboxpreference);
        super.onBindView(view);
    }
}
