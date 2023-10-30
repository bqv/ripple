package com.dof100.morsenotifier;

import android.app.ActionBar;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.MenuItem;
import androidx.core.app.NavUtils;
import java.util.List;

public class MyPreferencesActivity extends PreferenceActivity {
   protected boolean isValidFragment(String var1) {
      return true;
   }

   public void onBuildHeaders(List var1) {
      int var2;
      if (App.c) {
         var2 = R.xml.pref_headers_morse;
      } else {
         var2 = R.xml.pref_headers_voice;
      }

      this.loadHeadersFromResource(var2, var1);
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      MyLog.log("MyPreferencesActivity.onCreate ");
      ActionBar var2 = this.getActionBar();
      if (var2 != null) {
         var2.setDisplayHomeAsUpEnabled(true);
      }

   }

   public boolean onOptionsItemSelected(MenuItem var1) {
      if (var1.getItemId() != 16908332) {
         return super.onOptionsItemSelected(var1);
      } else {
         NavUtils.navigateUpFromSameTask(this);
         return true;
      }
   }
}
