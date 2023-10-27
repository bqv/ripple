package com.dof100.morsenotifier;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceFragment;
import android.preference.PreferenceGroup;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Locale;

public class MyPreferencesFragment extends PreferenceFragment implements SharedPreferences.OnSharedPreferenceChangeListener {
    /* renamed from: a */
    private void m447a() {
        String str;
        if (App.f285d) {
            MyPreferenceList myPreferenceList = (MyPreferenceList) findPreference("pref_voice_locale");
            if (myPreferenceList == null) {
                C0140i.m501a("MyPreferencesFragment.init_pref_voice_locale ERROR pref_voice_locale=null");
                return;
            }
            C0149l a = App.m426a(getActivity().getApplicationContext());
            if (a == null) {
                C0140i.m501a("MyPreferencesFragment.init_pref_voice_locale ERROR mPlayerTTS=null");
            } else if (a.f498b == null) {
                C0140i.m501a("MyPreferencesFragment.init_pref_voice_locale ERROR App.mPlayerTTS.mTTS=null");
            } else if (a.f497a == -1) {
                C0140i.m501a("MyPreferencesFragment.init_pref_voice_locale ERROR mTTSStatus=ERROR");
            } else {
                Locale[] availableLocales = Locale.getAvailableLocales();
                ArrayList arrayList = new ArrayList();
                for (Locale locale : availableLocales) {
                    if (locale.toString().equals("en_US_POSIX")) {
                        str = "MyPreferencesFragment.init_pref_voice_locale Locale en_US_POSIX not supported";
                    } else {
                        int isLanguageAvailable = a.f498b.isLanguageAvailable(locale);
                        if (isLanguageAvailable >= 1) {
                            arrayList.add(locale.toString());
                            str = "MyPreferencesFragment.init_pref_voice_locale Locale: " + locale.toString() + " supported " + isLanguageAvailable;
                        }
                    }
                    C0140i.m501a(str);
                }
                String[] strArr = arrayList.size() > 0 ? (String[]) arrayList.toArray(new String[arrayList.size()]) : new String[]{"(none)"};
                myPreferenceList.setEntries(strArr);
                myPreferenceList.setEntryValues(strArr);
                myPreferenceList.mo416a();
            }
        }
    }

    /* renamed from: a */
    private void m448a(Preference preference) {
        if (preference == null) {
            C0140i.m501a("MyPreferencesFragment.checkAllPreferences: p=null");
            return;
        }
        if ((preference instanceof PreferenceCategory) || (preference instanceof PreferenceScreen)) {
            PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
            for (int preferenceCount = preferenceGroup.getPreferenceCount() - 1; preferenceCount >= 0; preferenceCount--) {
                m448a(preferenceGroup.getPreference(preferenceCount));
            }
        }
        m450b(preference);
    }

    /* renamed from: b */
    private void m449b() {
        C0140i.m501a("MyPreferencesFragment.check_pref_voice_locale");
    }

    /* renamed from: b */
    private void m450b(Preference preference) {
        String str;
        StringBuilder sb;
        if (preference == null) {
            C0140i.m501a("MyPreferencesFragment.checkPreference: aP = null");
            return;
        }
        String key = preference.getKey();
        if (key != null) {
            if (key.startsWith("pref_voice_locale")) {
                m449b();
            }
            if (key.startsWith("pref_call_contact")) {
                m451c();
            } else if (key.startsWith("pref_sms_contact")) {
                m453d();
            } else if (key.startsWith("pref_reminders_select")) {
                m452c(preference);
            } else if (key.startsWith("pref_apps_filters")) {
                m454d(preference);
            } else if (key.startsWith("pref_apps_recentnotifications")) {
                m455e(preference);
            } else if ((preference instanceof PreferenceCategory) || (preference instanceof PreferenceScreen)) {
                if (key.equals("pref_morse") || key.equals("pref_audio") || key.equals("pref_display")) {
                    if (App.f285d) {
                        sb = new StringBuilder();
                        str = "MyPreferencesFragment.checkPreference: remove morse key = ";
                    } else {
                        return;
                    }
                } else if (key.equals("pref_voice") && App.f284c) {
                    sb = new StringBuilder();
                    str = "MyPreferencesFragment.checkPreference: remove voice key = ";
                } else {
                    return;
                }
                sb.append(str);
                sb.append(key);
                C0140i.m501a(sb.toString());
                preference.setEnabled(false);
            }
        }
    }

    /* renamed from: c */
    private void m451c() {
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) findPreference("pref_call_contactdisplayname");
        CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) findPreference("pref_call_contactfirstname");
        CheckBoxPreference checkBoxPreference3 = (CheckBoxPreference) findPreference("pref_call_contactlastname");
        CheckBoxPreference checkBoxPreference4 = (CheckBoxPreference) findPreference("pref_call_contactinitials");
        CheckBoxPreference checkBoxPreference5 = (CheckBoxPreference) findPreference("pref_call_contactnickname");
        if (checkBoxPreference != null && checkBoxPreference2 != null && checkBoxPreference3 != null && checkBoxPreference4 != null && checkBoxPreference5 != null) {
            findPreference("pref_call_contactname_none").setEnabled(checkBoxPreference.isChecked() || checkBoxPreference2.isChecked() || checkBoxPreference3.isChecked() || checkBoxPreference4.isChecked() || checkBoxPreference5.isChecked());
        }
    }

    /* renamed from: c */
    private void m452c(Preference preference) {
        MyPreferenceText myPreferenceText;
        String str;
        C0140i.m501a("MyPreferencesFragment.check_pref_reminders_select");
        int i = PreferenceManager.getDefaultSharedPreferences(getActivity().getApplicationContext()).getInt("reminders_n", 0);
        switch (i) {
            case 0:
                myPreferenceText = (MyPreferenceText) preference;
                str = "No Reminders";
                break;
            case 1:
                myPreferenceText = (MyPreferenceText) preference;
                str = "1 reminder";
                break;
            default:
                myPreferenceText = (MyPreferenceText) preference;
                str = String.format(Locale.US, "%d reminders", new Object[]{Integer.valueOf(i)});
                break;
        }
        myPreferenceText.mo429a(str);
    }

    /* renamed from: d */
    private void m453d() {
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) findPreference("pref_sms_contactdisplayname");
        CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) findPreference("pref_sms_contactfirstname");
        CheckBoxPreference checkBoxPreference3 = (CheckBoxPreference) findPreference("pref_sms_contactlastname");
        CheckBoxPreference checkBoxPreference4 = (CheckBoxPreference) findPreference("pref_sms_contactinitials");
        CheckBoxPreference checkBoxPreference5 = (CheckBoxPreference) findPreference("pref_sms_contactnickname");
        if (checkBoxPreference != null && checkBoxPreference2 != null && checkBoxPreference3 != null && checkBoxPreference4 != null && checkBoxPreference5 != null) {
            findPreference("pref_sms_contactname_none").setEnabled(checkBoxPreference.isChecked() || checkBoxPreference2.isChecked() || checkBoxPreference3.isChecked() || checkBoxPreference4.isChecked() || checkBoxPreference5.isChecked());
        }
    }

    /* renamed from: d */
    private void m454d(Preference preference) {
        MyPreferenceText myPreferenceText;
        int i;
        String string;
        C0140i.m501a("MyPreferencesFragment.check_pref_apps_filters");
        int c = C0131b.m482c(getActivity().getApplicationContext());
        if (c > 1) {
            myPreferenceText = (MyPreferenceText) preference;
            string = String.format(Locale.US, getString(R.string.pref_apps_filters_dfilters), new Object[]{Integer.valueOf(c)});
        } else {
            if (c == 1) {
                myPreferenceText = (MyPreferenceText) preference;
                i = R.string.pref_apps_filters_1filter;
            } else {
                myPreferenceText = (MyPreferenceText) preference;
                i = R.string.pref_apps_filters_nofilters;
            }
            string = getString(i);
        }
        myPreferenceText.mo429a(string);
    }

    /* renamed from: e */
    private void m455e(Preference preference) {
        MyPreferenceText myPreferenceText;
        String str;
        C0140i.m501a("MyPreferencesFragment.check_pref_apps_recentnotifications");
        int c = C0153n.m531c(getActivity().getApplicationContext());
        if (c > 1) {
            myPreferenceText = (MyPreferenceText) preference;
            str = String.format(Locale.US, "%d recent notifications", new Object[]{Integer.valueOf(c)});
        } else if (c == 1) {
            myPreferenceText = (MyPreferenceText) preference;
            str = "1 recent notification";
        } else {
            myPreferenceText = (MyPreferenceText) preference;
            str = "No recent notifications";
        }
        myPreferenceText.mo429a(str);
    }

    public void onActivityCreated(Bundle bundle) {
        C0140i.m501a("MyPreferencesFragment.onActivityCreated");
        super.onActivityCreated(bundle);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 203) {
            return;
        }
        if (i2 == 1) {
            C0140i.m501a("MyPreferencesFragment.onActivityResult CHECK_VOICE_DATA_PASS");
            return;
        }
        C0140i.m501a("MyPreferencesFragment.onActivityResult CHECK_VOICE_DATA_PASS failed! No voice data!");
        try {
            Intent intent2 = new Intent();
            intent2.setAction("android.speech.tts.engine.INSTALL_TTS_DATA");
            startActivity(intent2);
        } catch (Exception unused) {
            C0140i.m501a("MyPreferencesFragment.onActivityResult startActivity(ACTION_INSTALL_TTS_DATA) failed!");
            C0140i.m502b(getActivity(), "No voice data. This function is not available in your device!");
        }
    }

    public void onCreate(Bundle bundle) {
        C0140i.m501a("MyPreferencesFragment.onCreate");
        super.onCreate(bundle);
        MyPreferencesActivity myPreferencesActivity = (MyPreferencesActivity) getActivity();
        Bundle arguments = getArguments();
        if (arguments != null) {
            addPreferencesFromResource(myPreferencesActivity.getResources().getIdentifier(arguments.getString("prefxmlres"), "xml", myPreferencesActivity.getPackageName()));
        }
        if (App.f285d) {
            try {
                startActivityForResult(new Intent("android.speech.tts.engine.CHECK_TTS_DATA"), 203);
                m447a();
            } catch (Exception unused) {
                C0140i.m501a("MyPreferencesFragment.onCreate ERROR in starting CHECK_TTS_DATA");
            }
        }
    }

    public void onDestroy() {
        C0140i.m501a("MyPreferencesFragment.onDestroy");
        App.m431c(getActivity().getApplicationContext());
        super.onDestroy();
    }

    public void onPause() {
        C0140i.m501a("MyPreferencesFragment.onPause");
        getPreferenceManager().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
        super.onPause();
    }

    public void onResume() {
        C0140i.m501a("MyPreferencesFragment.onResume");
        getPreferenceManager().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
        m448a(getPreferenceScreen());
        super.onResume();
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        Preference findPreference = findPreference(str);
        if (findPreference == null) {
            C0140i.m501a("MyPreferencesFragment.onSharedPreferenceChanged: p=null key=" + str);
            return;
        }
        m450b(findPreference);
    }

    public void onStart() {
        C0140i.m501a("MyPreferencesFragment.onDestroy");
        super.onStart();
    }
}
