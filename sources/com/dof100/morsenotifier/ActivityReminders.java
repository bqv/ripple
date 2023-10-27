package com.dof100.morsenotifier;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import com.dof100.morsenotifier.C0158r;

public class ActivityReminders extends Activity implements View.OnClickListener, C0158r.C0159a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C0157q f275a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C0158r f276b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ListView f277c;

    /* renamed from: a */
    public void mo395a(final C0156p pVar, int i, View view) {
        C0140i.m501a("ActivityReminders.onRowButtonClick");
        if (view.getId() == R.id.b_delete) {
            C0140i.m501a("ActivityReminders.onRowButtonClick b_delete");
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(R.string.title_confirm);
            builder.setMessage(R.string.text_confirm);
            builder.setPositiveButton(R.string.action_yes, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    ActivityReminders.this.f276b.remove(pVar);
                    ActivityReminders.this.f275a.mo518b(ActivityReminders.this);
                    ActivityReminders.this.f276b.notifyDataSetChanged();
                    C0138g.m493a((Context) ActivityReminders.this);
                    ActivityReminders.this.f277c.invalidate();
                    dialogInterface.dismiss();
                }
            });
            builder.setNegativeButton(R.string.action_no, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
            builder.create().show();
        } else if (view.getId() == R.id.b_edit) {
            C0140i.m501a("ActivityReminders.onRowButtonClick b_edit");
            Intent intent = new Intent(this, ActivityReminder.class);
            intent.putExtra("OBJECTINDEX", i);
            startActivityForResult(intent, 1);
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        C0140i.m501a("ActivityReminders.onActivityResult");
        if (i == 1) {
            if (i2 == -1) {
                C0140i.m501a("ActivityReminders.onActivityResult OK");
            }
            if (i2 == 0) {
                C0140i.m501a("ActivityReminders.onActivityResult CANCEL");
            }
            C0140i.m501a("ActivityReminders.onActivityResult loadFilters");
            this.f275a.mo517a(this);
            this.f276b.notifyDataSetChanged();
            this.f277c.invalidate();
        }
    }

    public void onClick(View view) {
        C0140i.m501a("ActivityReminders.onClick");
        if (view != null && view.getId() == R.id.b_reminders_select_add) {
            C0140i.m501a("ActivityReminders.onClick b_Add");
            startActivityForResult(new Intent(this, ActivityReminder.class), 1);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0140i.m501a("ActivityReminders.onCreate");
        this.f275a = new C0157q(this);
        C0140i.m501a("ActivityReminders.onCreate load");
        this.f275a.mo517a(this);
        this.f276b = new C0158r(this, this.f275a, this);
        setContentView(R.layout.activity_reminders);
        this.f277c = (ListView) findViewById(R.id.lv_reminders_select);
        this.f277c.setAdapter(this.f276b);
        this.f277c.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0140i.m501a("ActivityReminders.onItemClick " + view);
            }
        });
        ((Button) findViewById(R.id.b_reminders_select_add)).setOnClickListener(this);
    }
}
