package com.dof100.morsenotifier

import android.content.Intent
import android.content.SharedPreferences
import android.content.SharedPreferences.OnSharedPreferenceChangeListener
import android.os.Bundle
import android.preference.CheckBoxPreference
import android.preference.Preference
import android.preference.PreferenceCategory
import android.preference.PreferenceFragment
import android.preference.PreferenceGroup
import android.preference.PreferenceManager
import android.preference.PreferenceScreen
import com.dof100.morsenotifier.MyLog.log
import com.dof100.morsenotifier.MyLog.toast
import java.util.Locale

class MyPreferencesFragment constructor() : PreferenceFragment(), OnSharedPreferenceChangeListener {
  private fun a() {
    if (App.Companion.d) {
      val var1: MyPreferenceList? = findPreference("pref_voice_locale") as MyPreferenceList?
      if (var1 == null) {
        log("MyPreferencesFragment.init_pref_voice_locale ERROR pref_voice_locale=null")
      } else {
        val var2: MyPlayerTTS? = App.Companion.a(getActivity().getApplicationContext())
        if (var2 == null) {
          log("MyPreferencesFragment.init_pref_voice_locale ERROR mPlayerTTS=null")
        } else if (var2.mTTS == null) {
          log("MyPreferencesFragment.init_pref_voice_locale ERROR App.mPlayerTTS.mTTS=null")
        } else if (var2.mTTSStatus == -1) {
          log("MyPreferencesFragment.init_pref_voice_locale ERROR mTTSStatus=ERROR")
        } else {
          val var3: Array<Locale> = Locale.getAvailableLocales()
          val var4: ArrayList<String> = ArrayList<String>()
          val var5: Int = var3.size
          for (var6 in 0 until var5) {
            val var7: Locale = var3.get(var6)
            var var8: String?
            if ((var7.toString() == "en_US_POSIX")) {
              var8 =
                "MyPreferencesFragment.init_pref_voice_locale Locale en_US_POSIX not supported"
            } else {
              val var9: Int = var2.mTTS!!.isLanguageAvailable(var7)
              if (var9 < 1) {
                continue
              }
              var4.add(var7.toString())
              var8 = "MyPreferencesFragment.init_pref_voice_locale Locale: $var7 supported $var9"
            }
            log(var8)
          }
          val var11: Array<String>
          if (var4.size > 0) {
            var11 = var4.toTypedArray() as Array<String>
          } else {
            var11 = arrayOf("(none)")
          }
          var1.setEntries(var11)
          var1.setEntryValues(var11)
          var1.a()
        }
      }
    }
  }

  private fun a(var1: Preference?) {
    if (var1 == null) {
      log("MyPreferencesFragment.checkAllPreferences: p=null")
    } else {
      if (var1 is PreferenceCategory || var1 is PreferenceScreen) {
        val var2: PreferenceGroup = var1 as PreferenceGroup
        for (var3 in var2.getPreferenceCount() - 1 downTo 0) {
          this.a(var2.getPreference(var3))
        }
      }
      this.b(var1)
    }
  }

  private fun b() {
    log("MyPreferencesFragment.check_pref_voice_locale")
  }

  private fun b(var1: Preference?) {
    if (var1 == null) {
      log("MyPreferencesFragment.checkPreference: aP = null")
    } else {
      val var2: String? = var1.getKey()
      if (var2 != null) {
        if (var2.startsWith("pref_voice_locale")) {
          this.b()
        }
        if (var2.startsWith("pref_call_contact")) {
          this.c()
        } else if (var2.startsWith("pref_sms_contact")) {
          this.d()
        } else if (var2.startsWith("pref_reminders_select")) {
          this.c(var1)
        } else if (var2.startsWith("pref_apps_filters")) {
          this.d(var1)
        } else if (var2.startsWith("pref_apps_recentnotifications")) {
          e(var1)
        } else {
          if (var1 is PreferenceCategory || var1 is PreferenceScreen) {
            val var4: String
            if (!(var2 == "pref_morse") && !(var2 == "pref_audio") && !(var2 == "pref_display")) {
              if (!(var2 == "pref_voice") || !App.Companion.c) {
                return
              }
              var4 = "MyPreferencesFragment.checkPreference: remove voice key = "
            } else {
              if (!App.Companion.d) {
                return
              }
              var4 = "MyPreferencesFragment.checkPreference: remove morse key = "
            }
            log("${var4}${var2}")
            var1.setEnabled(false)
          }
        }
      }
    }
  }

  private fun c() {
    val var1: CheckBoxPreference? =
      findPreference("pref_call_contactdisplayname") as CheckBoxPreference?
    val var2: CheckBoxPreference? =
      findPreference("pref_call_contactfirstname") as CheckBoxPreference?
    val var3: CheckBoxPreference? =
      findPreference("pref_call_contactlastname") as CheckBoxPreference?
    val var4: CheckBoxPreference? =
      findPreference("pref_call_contactinitials") as CheckBoxPreference?
    val var5: CheckBoxPreference? =
      findPreference("pref_call_contactnickname") as CheckBoxPreference?
    if ((var1 != null) && (var2 != null) && (var3 != null) && (var4 != null) && (var5 != null)) {
      val var6: Boolean
      if (!var1.isChecked() && !var2.isChecked() && !var3.isChecked() && !var4.isChecked() && !var5.isChecked()) {
        var6 = false
      } else {
        var6 = true
      }
      findPreference("pref_call_contactname_none").setEnabled(var6)
    }
  }

  private fun c(var1: Preference) {
    log("MyPreferencesFragment.check_pref_reminders_select")
    val var2: Int =
      PreferenceManager.getDefaultSharedPreferences(getActivity().getApplicationContext())
        .getInt("reminders_n", 0)
    val var3: MyPreferenceText
    val var4: String
    when (var2) {
      0 -> {
        var3 = var1 as MyPreferenceText
        var4 = "No Reminders"
      }

      1 -> {
        var3 = var1 as MyPreferenceText
        var4 = "1 reminder"
      }

      else -> {
        var3 = var1 as MyPreferenceText
        var4 = String.format(Locale.US, "%d reminders", var2)
      }
    }
    var3.setValue(var4)
  }

  private fun d() {
    val var1: CheckBoxPreference? =
      findPreference("pref_sms_contactdisplayname") as CheckBoxPreference?
    val var2: CheckBoxPreference? =
      findPreference("pref_sms_contactfirstname") as CheckBoxPreference?
    val var3: CheckBoxPreference? =
      findPreference("pref_sms_contactlastname") as CheckBoxPreference?
    val var4: CheckBoxPreference? =
      findPreference("pref_sms_contactinitials") as CheckBoxPreference?
    val var5: CheckBoxPreference? =
      findPreference("pref_sms_contactnickname") as CheckBoxPreference?
    if ((var1 != null) && (var2 != null) && (var3 != null) && (var4 != null) && (var5 != null)) {
      val var6: Boolean
      if (!var1.isChecked() && !var2.isChecked() && !var3.isChecked() && !var4.isChecked() && !var5.isChecked()) {
        var6 = false
      } else {
        var6 = true
      }
      findPreference("pref_sms_contactname_none").setEnabled(var6)
    }
  }

  private fun d(var1: Preference) {
    log("MyPreferencesFragment.check_pref_apps_filters")
    var var2: Int = MyAppNotificationFilters.Companion.c(getActivity().getApplicationContext())
    val var3: String
    val var4: MyPreferenceText
    if (var2 > 1) {
      var4 = var1 as MyPreferenceText
      var3 =
        String.format(Locale.US, this.getString(R.string.pref_apps_filters_dfilters), var2)
    } else {
      if (var2 == 1) {
        var4 = var1 as MyPreferenceText
        var2 = R.string.pref_apps_filters_1filter
      } else {
        var4 = var1 as MyPreferenceText
        var2 = R.string.pref_apps_filters_nofilters
      }
      var3 = this.getString(var2)
    }
    var4.setValue(var3)
  }

  private fun e(var1: Preference) {
    log("MyPreferencesFragment.check_pref_apps_recentnotifications")
    val var2: Int = MyRecentAppNotifications.Companion.n(getActivity().getApplicationContext())
    val var3: MyPreferenceText
    val var4: String
    if (var2 > 1) {
      var3 = var1 as MyPreferenceText
      var4 = String.format(Locale.US, "%d recent notifications", var2)
    } else if (var2 == 1) {
      var3 = var1 as MyPreferenceText
      var4 = "1 recent notification"
    } else {
      var3 = var1 as MyPreferenceText
      var4 = "No recent notifications"
    }
    var3.setValue(var4)
  }

  public override fun onActivityCreated(var1: Bundle?) {
    log("MyPreferencesFragment.onActivityCreated")
    super.onActivityCreated(var1)
  }

  public override fun onActivityResult(var1: Int, var2: Int, var3: Intent) {
    var var3: Intent = var3
    if (var1 == 203) {
      if (var2 == 1) {
        log("MyPreferencesFragment.onActivityResult CHECK_VOICE_DATA_PASS")
        return
      }
      log("MyPreferencesFragment.onActivityResult CHECK_VOICE_DATA_PASS failed! No voice data!")
      try {
        var3 = Intent()
        var3.setAction("android.speech.tts.engine.INSTALL_TTS_DATA")
        this.startActivity(var3)
        return
      } catch (var4: Exception) {
        log("MyPreferencesFragment.onActivityResult startActivity(ACTION_INSTALL_TTS_DATA) failed!")
        toast(
          getActivity(),
          "No voice data. This function is not available in your device!"
        )
      }
    }
  }

  public override fun onCreate(var1: Bundle?) {
    log("MyPreferencesFragment.onCreate")
    super.onCreate(var1)
    val var5: MyPreferencesActivity = getActivity() as MyPreferencesActivity
    val var2: Bundle? = getArguments()
    if (var2 != null) {
      val var3: String? = var2.getString("prefxmlres")
      val var7: String = var5.getPackageName()
      addPreferencesFromResource(var5.getResources().getIdentifier(var3, "xml", var7))
    }
    if (App.Companion.d) {
      try {
        val var6: Intent = Intent("android.speech.tts.engine.CHECK_TTS_DATA")
        this.startActivityForResult(var6, 203)
        this.a()
        return
      } catch (var4: Exception) {
        log("MyPreferencesFragment.onCreate ERROR in starting CHECK_TTS_DATA")
      }
    }
  }

  public override fun onDestroy() {
    log("MyPreferencesFragment.onDestroy")
    App.Companion.c(getActivity().getApplicationContext())
    super.onDestroy()
  }

  public override fun onPause() {
    log("MyPreferencesFragment.onPause")
    getPreferenceManager().getSharedPreferences()
      .unregisterOnSharedPreferenceChangeListener(this)
    super.onPause()
  }

  public override fun onResume() {
    log("MyPreferencesFragment.onResume")
    getPreferenceManager().getSharedPreferences().registerOnSharedPreferenceChangeListener(this)
    this.a(getPreferenceScreen())
    super.onResume()
  }

  public override fun onSharedPreferenceChanged(var1: SharedPreferences, var2: String?) {
    val var3: Preference? = findPreference(var2)
    if (var3 == null) {
      log("MyPreferencesFragment.onSharedPreferenceChanged: p=null key=$var2")
    } else {
      this.b(var3)
    }
  }

  public override fun onStart() {
    log("MyPreferencesFragment.onDestroy")
    super.onStart()
  }
}
