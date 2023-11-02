package com.dof100.morsenotifier

import android.app.ActionBar
import android.os.Bundle
import android.preference.PreferenceActivity
import android.view.MenuItem
import androidx.core.app.NavUtils
import com.dof100.morsenotifier.MyLog.log

class MyPreferencesActivity constructor() : PreferenceActivity() {
  override fun isValidFragment(var1: String): Boolean {
    return true
  }

  public override fun onBuildHeaders(var1: List<Header>?) {
    val var2: Int
    if (App.Companion.morseMode) {
      var2 = R.xml.pref_headers_morse
    } else {
      var2 = R.xml.pref_headers_voice
    }
    loadHeadersFromResource(var2, var1)
  }

  override fun onCreate(var1: Bundle?) {
    super.onCreate(var1)
    log("MyPreferencesActivity.onCreate ")
    val var2: ActionBar? = getActionBar()
    if (var2 != null) {
      var2.setDisplayHomeAsUpEnabled(true)
    }
  }

  public override fun onOptionsItemSelected(var1: MenuItem): Boolean {
    if (var1.getItemId() != 16908332) {
      return super.onOptionsItemSelected(var1)
    } else {
      NavUtils.navigateUpFromSameTask(this)
      return true
    }
  }
}
