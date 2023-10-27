package com.dof100.morsenotifier;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import com.dof100.morsenotifier.C0132c;

public class ActivityAppFilters extends Activity implements View.OnClickListener, C0132c.C0133a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C0131b f216a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C0132c f217b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ListView f218c;

    /* renamed from: a */
    public void mo347a(final C0130a aVar, int i, View view) {
        C0140i.m501a("ActivityAppFilters.onRowButtonClick");
        if (view.getId() == R.id.b_delete) {
            C0140i.m501a("ActivityAppFilters.onRowButtonClick b_delete");
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(R.string.title_confirm);
            builder.setMessage(R.string.text_confirm);
            builder.setPositiveButton(R.string.action_yes, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    ActivityAppFilters.this.f217b.remove(aVar);
                    ActivityAppFilters.this.f216a.mo469b(ActivityAppFilters.this);
                    ActivityAppFilters.this.f217b.notifyDataSetChanged();
                    ActivityAppFilters.this.f218c.invalidate();
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
            C0140i.m501a("ActivityAppFilters.onRowButtonClick b_edit");
            Intent intent = new Intent(this, ActivityAppFilter.class);
            intent.putExtra("FILTERINDEX", i);
            startActivityForResult(intent, 1);
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        C0140i.m501a("ActivityAppFilters.onActivityResult");
        if (i == 1) {
            if (i2 == -1) {
                C0140i.m501a("ActivityAppFilters.onActivityResult OK");
            }
            if (i2 == 0) {
                C0140i.m501a("ActivityAppFilters.onActivityResult CANCEL");
            }
            C0140i.m501a("ActivityAppFilters.onActivityResult loadFilters");
            this.f216a.mo468a(this);
            this.f217b.notifyDataSetChanged();
            this.f218c.invalidate();
        }
    }

    public void onClick(View view) {
        C0140i.m501a("ActivityAppFilters.onClick");
        if (view != null) {
            if (view.getId() == R.id.b_apps_select_add) {
                C0140i.m501a("ActivityAppFilters.onClick b_apps_select_add");
                this.f217b.mo470a();
                Intent intent = new Intent(this, ActivityAppFilter.class);
                intent.putExtra("FILTERINDEX", this.f216a.f446a.size() - 1);
                startActivityForResult(intent, 1);
            } else if (view.getId() == R.id.b_apps_select_checkrecent) {
                C0140i.m501a("ActivityRecentNotifications.onClick b_apps_select_checkrecent");
                Intent intent2 = new Intent(this, ActivityRecentAppNotifications.class);
                intent2.putExtra(getResources().getString(R.string.MSG_WHAT), getResources().getString(R.string.MSG_MN_ACTIVITYRECENTNOTIFICATIONS_START));
                intent2.putExtra(getResources().getString(R.string.MSG_EXTRATEXT1), "");
                intent2.putExtra(getResources().getString(R.string.MSG_EXTRATEXT2), "");
                startActivity(intent2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0140i.m501a("ActivityAppFilters.onCreate");
        this.f216a = new C0131b(this);
        C0140i.m501a("ActivityAppFilters.onCreate loadFilters");
        this.f216a.mo468a(this);
        this.f217b = new C0132c(this, this.f216a, this);
        setContentView(R.layout.activity_appfilters);
        this.f218c = (ListView) findViewById(R.id.lv_apps_select);
        this.f218c.setAdapter(this.f217b);
        this.f218c.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0140i.m501a("ActivityAppFilters.onItemClick " + view);
            }
        });
        ((Button) findViewById(R.id.b_apps_select_add)).setOnClickListener(this);
        ((Button) findViewById(R.id.b_apps_select_checkrecent)).setOnClickListener(this);
    }
}
