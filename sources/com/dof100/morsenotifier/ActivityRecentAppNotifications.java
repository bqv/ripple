package com.dof100.morsenotifier;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import com.dof100.morsenotifier.C0154o;

public class ActivityRecentAppNotifications extends Activity implements View.OnClickListener, C0154o.C0155a {

    /* renamed from: a */
    private C0153n f265a = null;

    /* renamed from: b */
    private C0131b f266b;

    /* renamed from: c */
    private C0154o f267c;

    /* renamed from: a */
    public void mo386a(int i, View view) {
        C0140i.m501a("ActivityRecentAppNotifications.onRowButtonClick");
        if (view.getId() == R.id.tv_recentnotification_matchingfilternum) {
            C0140i.m501a("ActivityAppFilters.onRowButtonClick tv_recentnotification_announcedcriteria");
            Intent intent = new Intent(this, ActivityAppFilter.class);
            intent.putExtra("FILTERINDEX", i);
            startActivityForResult(intent, 1);
        }
    }

    public void onClick(View view) {
        C0140i.m501a("ActivityRecentNotifications.onClick");
        if (view != null) {
            if (view.getId() == R.id.b_recentnotifications_clear) {
                C0140i.m501a("ActivityRecentNotifications.onClick b_Clear");
                this.f265a.mo505a(this);
                this.f267c.clear();
                this.f267c.notifyDataSetChanged();
                App.m432d(this);
            } else if (view.getId() == R.id.b_recentnotifications_criteria) {
                C0140i.m501a("ActivityRecentAppNotifications.onClick b_Criteria");
                Intent intent = new Intent(this, ActivityAppFilters.class);
                intent.putExtra(getResources().getString(R.string.MSG_WHAT), getResources().getString(R.string.MSG_MN_ACTIVITYAPPFILTERS_START));
                intent.putExtra(getResources().getString(R.string.MSG_EXTRATEXT1), "");
                intent.putExtra(getResources().getString(R.string.MSG_EXTRATEXT2), "");
                startActivity(intent);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0140i.m501a("ActivityRecentAppNotifications.onCreate");
        this.f266b = new C0131b(this);
        C0140i.m501a("ActivityRecentAppNotifications.onCreate loadfilters");
        this.f266b.mo468a(this);
        this.f265a = new C0153n(this);
        this.f267c = new C0154o(this, this.f265a.f525a, this.f266b, this);
        setContentView(R.layout.activity_recent_notifications);
        ((ListView) findViewById(R.id.lv_recent_notifications)).setAdapter(this.f267c);
        ((Button) findViewById(R.id.b_recentnotifications_clear)).setOnClickListener(this);
        ((Button) findViewById(R.id.b_recentnotifications_criteria)).setOnClickListener(this);
    }

    public void onResume() {
        super.onResume();
        C0140i.m501a("ActivityRecentAppNotifications.onResume loadfilters");
        this.f266b.mo468a(this);
        this.f267c.notifyDataSetChanged();
    }
}
