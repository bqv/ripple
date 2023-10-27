package com.dof100.morsenotifier;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import java.util.Locale;

public class ActivityAppFilter extends Activity {

    /* renamed from: a */
    private C0136f f201a = null;

    /* renamed from: b */
    private C0131b f202b = null;

    /* renamed from: c */
    private C0130a f203c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Spinner f204d = null;

    /* renamed from: e */
    private EditText f205e = null;

    /* renamed from: f */
    private EditText f206f = null;

    /* renamed from: g */
    private EditText f207g = null;

    /* renamed from: h */
    private EditText f208h = null;

    /* renamed from: i */
    private CheckBox f209i = null;

    /* renamed from: j */
    private CheckBox f210j = null;

    /* renamed from: k */
    private CheckBox f211k = null;

    /* renamed from: l */
    private EditText f212l = null;

    /* renamed from: m */
    private EditText f213m = null;

    /* renamed from: a */
    private void m388a() {
        C0140i.m501a("ActivityAppFilter.filter2view package=" + this.f203c.f436a);
        final int a = this.f201a.mo474a(this.f203c.f436a);
        C0140i.m501a("ActivityAppFilter.filter2view package idx=" + a);
        this.f204d.post(new Runnable() {
            public void run() {
                if (a >= 0) {
                    ActivityAppFilter.this.f204d.setSelection(a);
                }
            }
        });
        this.f205e.setText(this.f203c.f437b);
        this.f206f.setText(this.f203c.f438c);
        this.f207g.setText(this.f203c.f439d);
        this.f208h.setText(this.f203c.f440e);
        this.f209i.setChecked(this.f203c.f441f);
        this.f210j.setChecked(this.f203c.f442g);
        this.f211k.setChecked(this.f203c.f443h);
        this.f212l.setText(this.f203c.f444i);
        this.f213m.setText(this.f203c.f445j);
    }

    /* renamed from: b */
    private void m389b() {
        int selectedItemPosition = this.f204d.getSelectedItemPosition();
        this.f203c.f436a = this.f201a.f457a.get(selectedItemPosition).f455a;
        C0140i.m501a("ActivityAppFilter.view2filter idx=" + selectedItemPosition + " package=" + this.f203c.f436a);
        this.f203c.f437b = this.f205e.getText().toString();
        this.f203c.f438c = this.f206f.getText().toString();
        this.f203c.f439d = this.f207g.getText().toString();
        this.f203c.f440e = this.f208h.getText().toString();
        this.f203c.f441f = this.f209i.isChecked();
        this.f203c.f442g = this.f210j.isChecked();
        this.f203c.f443h = this.f211k.isChecked();
        this.f203c.f444i = this.f212l.getText().toString();
        this.f203c.f445j = this.f213m.getText().toString();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        C0140i.m501a("ActivityAppFilter.onCreate");
        setContentView(R.layout.activity_appfilter);
        this.f203c = null;
        this.f202b = new C0131b(this);
        this.f201a = new C0136f(this);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            i = extras.getInt("FILTERINDEX");
            if (i < 0 || i >= this.f202b.f446a.size()) {
                int i2 = i + 1;
                C0140i.m502b(this, String.format(Locale.US, "Filter %d not found", new Object[]{Integer.valueOf(i2)}));
                C0140i.m500a((Context) this, String.format(Locale.US, "Filter %d not found", new Object[]{Integer.valueOf(i2)}));
                finish();
            } else {
                this.f203c = this.f202b.f446a.get(i);
                C0140i.m501a("ActivityAppFilter.onCreate loaded filter at position = " + i);
            }
        } else {
            i = 0;
        }
        if (this.f203c == null) {
            this.f203c = new C0130a();
            this.f202b.f446a.add(this.f203c);
            i = this.f202b.f446a.size() - 1;
            C0140i.m501a("ActivityAppFilter.onCreate created new filter at position = " + i);
        }
        setTitle(String.format(Locale.US, "%s %d", new Object[]{getResources().getString(R.string.activity_appfilter_filter), Integer.valueOf(i + 1)}));
        this.f204d = (Spinner) findViewById(R.id.sp_AppName);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, (String[]) this.f201a.mo475a().toArray(new String[this.f202b.f446a.size()]));
        arrayAdapter.setDropDownViewResource(17367049);
        this.f204d.setAdapter(arrayAdapter);
        this.f205e = (EditText) findViewById(R.id.et_criteria_Contains);
        this.f206f = (EditText) findViewById(R.id.et_criteria_ContainsNot);
        this.f207g = (EditText) findViewById(R.id.et_criteria_category);
        this.f208h = (EditText) findViewById(R.id.et_criteria_id);
        this.f209i = (CheckBox) findViewById(R.id.cb_SayTitle);
        this.f210j = (CheckBox) findViewById(R.id.cb_SayText);
        this.f211k = (CheckBox) findViewById(R.id.cb_SayTicker);
        this.f212l = (EditText) findViewById(R.id.et_SayBefore);
        this.f213m = (EditText) findViewById(R.id.et_SayAfter);
        m388a();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C0140i.m501a("ActivityAppFilter.onDestroy");
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        C0140i.m501a("ActivityAppFilter.onPause");
        m389b();
        this.f202b.mo469b(this);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        C0140i.m501a("ActivityAppFilter.onStop");
        super.onStop();
    }
}
