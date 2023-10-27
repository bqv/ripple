package com.dof100.morsenotifier;

import android.content.Context;
import android.content.Intent;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MyPreferenceButton extends Preference {

    /* renamed from: a */
    private final Context f299a;

    /* renamed from: b */
    private final String f300b;

    /* renamed from: c */
    private final String f301c;

    /* renamed from: d */
    private final String f302d;

    /* renamed from: e */
    private final String f303e;

    /* renamed from: f */
    private final String f304f;

    public MyPreferenceButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f299a = context;
        setSelectable(false);
        this.f301c = C0163v.m557a(context, attributeSet, "http://mypreferencenamespace.100dof.com", "buttonCaption", "");
        this.f300b = C0163v.m557a(context, attributeSet, "http://mypreferencenamespace.100dof.com", "buttonIntentClass", "");
        this.f302d = C0163v.m557a(context, attributeSet, "http://mypreferencenamespace.100dof.com", "buttonMsgWhat", "0");
        this.f303e = C0163v.m557a(context, attributeSet, "http://mypreferencenamespace.100dof.com", "buttonMsgExtraText1", "0");
        this.f304f = C0163v.m557a(context, attributeSet, "http://mypreferencenamespace.100dof.com", "buttonMsgExtraText2", "0");
        boolean equalsIgnoreCase = C0163v.m557a(context, attributeSet, "http://mypreferencenamespace.100dof.com", "enableFree", "true").equalsIgnoreCase("true");
        boolean equalsIgnoreCase2 = C0163v.m557a(context, attributeSet, "http://mypreferencenamespace.100dof.com", "enablePro", "true").equalsIgnoreCase("true");
        if (App.f282a) {
            setEnabled(equalsIgnoreCase);
        }
        if (App.f283b) {
            setEnabled(equalsIgnoreCase2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m434a() {
        try {
            Intent intent = new Intent(this.f299a, Class.forName(this.f300b));
            intent.putExtra(this.f299a.getResources().getString(R.string.MSG_WHAT), this.f302d);
            intent.putExtra(this.f299a.getResources().getString(R.string.MSG_EXTRATEXT1), this.f303e);
            intent.putExtra(this.f299a.getResources().getString(R.string.MSG_EXTRATEXT2), this.f304f);
            if (this.f300b.contains("ervice")) {
                this.f299a.startService(intent);
            } else {
                this.f299a.startActivity(intent);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onBindView(View view) {
        C0140i.m501a("MyPreferenceButton.onBindView");
        TextView textView = (TextView) view.findViewById(16908310);
        TextView textView2 = (TextView) view.findViewById(16908304);
        if (textView2 == null || textView == null) {
            C0140i.m501a("MyPreferenceButton.onBindView title or summary = null");
        } else {
            textView.setVisibility(8);
            textView2.setVisibility(8);
            Button button = new Button(view.getContext());
            button.setText(this.f301c);
            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    MyPreferenceButton.this.m434a();
                }
            });
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(3, textView.getId());
            layoutParams.addRule(5, textView.getId());
            button.setLayoutParams(layoutParams);
            button.setId(R.id.myPreferenceButton_button);
            ((RelativeLayout) textView2.getParent()).addView(button);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(3, button.getId());
            layoutParams2.addRule(5, button.getId());
            textView2.setLayoutParams(layoutParams2);
        }
        super.onBindView(view);
    }
}
