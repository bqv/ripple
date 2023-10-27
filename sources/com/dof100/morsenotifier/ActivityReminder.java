package com.dof100.morsenotifier;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.ToggleButton;

public class ActivityReminder extends Activity implements View.OnClickListener {

    /* renamed from: a */
    private C0157q f268a = null;

    /* renamed from: b */
    private C0156p f269b = null;

    /* renamed from: c */
    private final ToggleButton[] f270c = {null, null, null, null, null, null, null};

    /* renamed from: d */
    private TimePicker f271d = null;

    /* renamed from: e */
    private EditText f272e = null;

    /* renamed from: f */
    private EditText f273f = null;

    /* renamed from: g */
    private Spinner f274g = null;

    /* renamed from: a */
    private void m419a() {
        C0140i.m501a("ActivityReminder.onActionTest");
        m421c();
        Intent intent = new Intent(this, ServiceMain.class);
        intent.putExtra(getResources().getString(R.string.MSG_WHAT), getResources().getString(R.string.MSG_REMINDERS_ONE_TEST));
        intent.putExtra(getResources().getString(R.string.MSG_EXTRATEXT1), this.f269b.mo510a());
        intent.putExtra(getResources().getString(R.string.MSG_EXTRATEXT2), "0");
        startService(intent);
    }

    /* renamed from: b */
    private void m420b() {
        C0140i.m501a("ActivityReminder.object2view");
        for (int i = 0; i < 7; i++) {
            this.f270c[i].setChecked(this.f269b.f533c[i]);
        }
        if (Build.VERSION.SDK_INT < 23) {
            this.f271d.setCurrentHour(Integer.valueOf(this.f269b.f531a));
            this.f271d.setCurrentMinute(Integer.valueOf(this.f269b.f532b));
        } else {
            this.f271d.setHour(this.f269b.f531a);
            this.f271d.setMinute(this.f269b.f532b);
        }
        this.f272e.setText(this.f269b.f535e);
        this.f273f.setText(this.f269b.f536f);
        this.f274g.setSelection(this.f269b.f534d);
    }

    /* renamed from: c */
    private void m421c() {
        C0156p pVar;
        int minute;
        C0140i.m501a("ActivityReminder.view2object");
        for (int i = 0; i < 7; i++) {
            this.f269b.f533c[i] = this.f270c[i].isChecked();
        }
        if (Build.VERSION.SDK_INT < 23) {
            this.f269b.f531a = this.f271d.getCurrentHour().intValue();
            pVar = this.f269b;
            minute = this.f271d.getCurrentMinute().intValue();
        } else {
            this.f269b.f531a = this.f271d.getHour();
            pVar = this.f269b;
            minute = this.f271d.getMinute();
        }
        pVar.f532b = minute;
        this.f269b.f535e = this.f272e.getText().toString();
        this.f269b.f536f = this.f273f.getText().toString();
        this.f269b.f534d = this.f274g.getSelectedItemPosition();
        this.f268a.mo518b(this);
        C0138g.m493a((Context) this);
    }

    public void onClick(View view) {
        C0140i.m501a("ActivityReminder.onClick");
        if (view != null && view.getId() == R.id.button_test) {
            m419a();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        C0140i.m501a("ActivityReminder.onCreate");
        setContentView(R.layout.activity_reminder);
        ((Button) findViewById(R.id.button_test)).setOnClickListener(this);
        this.f268a = new C0157q(this);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int i2 = extras.getInt("OBJECTINDEX");
            this.f269b = this.f268a.f538a.get(i2);
            C0140i.m501a("ActivityReminder.onCreate loaded entry at position = " + i2);
            i = R.string.title_activity_reminder_edit;
        } else {
            this.f269b = new C0156p();
            this.f268a.f538a.add(this.f269b);
            C0140i.m501a("ActivityReminder.onCreate created new entry at position = " + (this.f268a.f538a.size() - 1));
            i = R.string.title_activity_reminder_new;
        }
        setTitle(i);
        this.f270c[0] = (ToggleButton) findViewById(R.id.tb_dow0);
        this.f270c[1] = (ToggleButton) findViewById(R.id.tb_dow1);
        this.f270c[2] = (ToggleButton) findViewById(R.id.tb_dow2);
        this.f270c[3] = (ToggleButton) findViewById(R.id.tb_dow3);
        this.f270c[4] = (ToggleButton) findViewById(R.id.tb_dow4);
        this.f270c[5] = (ToggleButton) findViewById(R.id.tb_dow5);
        this.f270c[6] = (ToggleButton) findViewById(R.id.tb_dow6);
        this.f271d = (TimePicker) findViewById(R.id.tp_hourmin);
        this.f272e = (EditText) findViewById(R.id.et_SayBefore);
        this.f273f = (EditText) findViewById(R.id.et_SayAfter);
        this.f274g = (Spinner) findViewById(R.id.sp_SayTime);
        this.f271d.setIs24HourView(true);
        m420b();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C0140i.m501a("ActivityReminder.onDestroy");
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        C0140i.m501a("ActivityReminder.onPause");
        m421c();
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        C0140i.m501a("ActivityReminder.onStop");
        super.onStop();
    }
}
