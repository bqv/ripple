package com.dof100.morsenotifier;

import android.app.ActionBar;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.support.p000v4.app.C0037e;
import android.view.MenuItem;
import java.util.List;

public class MyPreferencesActivity extends PreferenceActivity {
    /* access modifiers changed from: protected */
    public boolean isValidFragment(String str) {
        return true;
    }

    public void onBuildHeaders(List<PreferenceActivity.Header> list) {
        loadHeadersFromResource(App.f284c ? R.xml.pref_headers_morse : R.xml.pref_headers_voice, list);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0140i.m501a("MyPreferencesActivity.onCreate ");
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        C0037e.m46a(this);
        return true;
    }
}
