package com.dof100.morsenotifier;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
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

public class MyPreferencesFragment extends PreferenceFragment implements OnSharedPreferenceChangeListener {
   private void a() {
      if (App.d) {
         MyPreferenceList var1 = (MyPreferenceList)this.findPreference("pref_voice_locale");
         if (var1 == null) {
            MyLog.log("MyPreferencesFragment.init_pref_voice_locale ERROR pref_voice_locale=null");
         } else {
            C0149l var2 = App.a(this.getActivity().getApplicationContext());
            if (var2 == null) {
               MyLog.log("MyPreferencesFragment.init_pref_voice_locale ERROR mPlayerTTS=null");
            } else if (var2.b == null) {
               MyLog.log("MyPreferencesFragment.init_pref_voice_locale ERROR App.mPlayerTTS.mTTS=null");
            } else if (var2.a == -1) {
               MyLog.log("MyPreferencesFragment.init_pref_voice_locale ERROR mTTSStatus=ERROR");
            } else {
               Locale[] var3 = Locale.getAvailableLocales();
               ArrayList var4 = new ArrayList();
               int var5 = var3.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  Locale var7 = var3[var6];
                  String var8;
                  if (var7.toString().equals("en_US_POSIX")) {
                     var8 = "MyPreferencesFragment.init_pref_voice_locale Locale en_US_POSIX not supported";
                  } else {
                     int var9 = var2.b.isLanguageAvailable(var7);
                     if (var9 < 1) {
                        continue;
                     }

                     var4.add(var7.toString());
                     StringBuilder var10 = new StringBuilder();
                     var10.append("MyPreferencesFragment.init_pref_voice_locale Locale: ");
                     var10.append(var7.toString());
                     var10.append(" supported ");
                     var10.append(var9);
                     var8 = var10.toString();
                  }

                  MyLog.log(var8);
               }

               String[] var11;
               if (var4.size() > 0) {
                  var11 = (String[])var4.toArray(new String[var4.size()]);
               } else {
                  var11 = new String[]{"(none)"};
               }

               var1.setEntries(var11);
               var1.setEntryValues(var11);
               var1.a();
            }
         }
      }
   }

   private void a(Preference var1) {
      if (var1 == null) {
         MyLog.log("MyPreferencesFragment.checkAllPreferences: p=null");
      } else {
         if (var1 instanceof PreferenceCategory || var1 instanceof PreferenceScreen) {
            PreferenceGroup var2 = (PreferenceGroup)var1;

            for(int var3 = var2.getPreferenceCount() - 1; var3 >= 0; --var3) {
               this.a(var2.getPreference(var3));
            }
         }

         this.b(var1);
      }
   }

   private void b() {
      MyLog.log("MyPreferencesFragment.check_pref_voice_locale");
   }

   private void b(Preference var1) {
      if (var1 == null) {
         MyLog.log("MyPreferencesFragment.checkPreference: aP = null");
      } else {
         String var2 = var1.getKey();
         if (var2 != null) {
            if (var2.startsWith("pref_voice_locale")) {
               this.b();
            }

            if (var2.startsWith("pref_call_contact")) {
               this.c();
            } else if (var2.startsWith("pref_sms_contact")) {
               this.d();
            } else if (var2.startsWith("pref_reminders_select")) {
               this.c(var1);
            } else if (var2.startsWith("pref_apps_filters")) {
               this.d(var1);
            } else if (var2.startsWith("pref_apps_recentnotifications")) {
               this.e(var1);
            } else {
               if (var1 instanceof PreferenceCategory || var1 instanceof PreferenceScreen) {
                  StringBuilder var3;
                  String var4;
                  if (!var2.equals("pref_morse") && !var2.equals("pref_audio") && !var2.equals("pref_display")) {
                     if (!var2.equals("pref_voice") || !App.c) {
                        return;
                     }

                     var3 = new StringBuilder();
                     var4 = "MyPreferencesFragment.checkPreference: remove voice key = ";
                  } else {
                     if (!App.d) {
                        return;
                     }

                     var3 = new StringBuilder();
                     var4 = "MyPreferencesFragment.checkPreference: remove morse key = ";
                  }

                  var3.append(var4);
                  var3.append(var2);
                  MyLog.log(var3.toString());
                  var1.setEnabled(false);
               }

            }
         }
      }
   }

   private void c() {
      CheckBoxPreference var1 = (CheckBoxPreference)this.findPreference("pref_call_contactdisplayname");
      CheckBoxPreference var2 = (CheckBoxPreference)this.findPreference("pref_call_contactfirstname");
      CheckBoxPreference var3 = (CheckBoxPreference)this.findPreference("pref_call_contactlastname");
      CheckBoxPreference var4 = (CheckBoxPreference)this.findPreference("pref_call_contactinitials");
      CheckBoxPreference var5 = (CheckBoxPreference)this.findPreference("pref_call_contactnickname");
      if (var1 != null && var2 != null && var3 != null && var4 != null && var5 != null) {
         boolean var6;
         if (!var1.isChecked() && !var2.isChecked() && !var3.isChecked() && !var4.isChecked() && !var5.isChecked()) {
            var6 = false;
         } else {
            var6 = true;
         }

         this.findPreference("pref_call_contactname_none").setEnabled(var6);
      }

   }

   private void c(Preference var1) {
      MyLog.log("MyPreferencesFragment.check_pref_reminders_select");
      int var2 = PreferenceManager.getDefaultSharedPreferences(this.getActivity().getApplicationContext()).getInt("reminders_n", 0);
      MyPreferenceText var3;
      String var4;
      switch(var2) {
      case 0:
         var3 = (MyPreferenceText)var1;
         var4 = "No Reminders";
         break;
      case 1:
         var3 = (MyPreferenceText)var1;
         var4 = "1 reminder";
         break;
      default:
         var3 = (MyPreferenceText)var1;
         var4 = String.format(Locale.US, "%d reminders", var2);
      }

      var3.a(var4);
   }

   private void d() {
      CheckBoxPreference var1 = (CheckBoxPreference)this.findPreference("pref_sms_contactdisplayname");
      CheckBoxPreference var2 = (CheckBoxPreference)this.findPreference("pref_sms_contactfirstname");
      CheckBoxPreference var3 = (CheckBoxPreference)this.findPreference("pref_sms_contactlastname");
      CheckBoxPreference var4 = (CheckBoxPreference)this.findPreference("pref_sms_contactinitials");
      CheckBoxPreference var5 = (CheckBoxPreference)this.findPreference("pref_sms_contactnickname");
      if (var1 != null && var2 != null && var3 != null && var4 != null && var5 != null) {
         boolean var6;
         if (!var1.isChecked() && !var2.isChecked() && !var3.isChecked() && !var4.isChecked() && !var5.isChecked()) {
            var6 = false;
         } else {
            var6 = true;
         }

         this.findPreference("pref_sms_contactname_none").setEnabled(var6);
      }

   }

   private void d(Preference var1) {
      MyLog.log("MyPreferencesFragment.check_pref_apps_filters");
      int var2 = MyAppNotificationFilters.c(this.getActivity().getApplicationContext());
      String var3;
      MyPreferenceText var4;
      if (var2 > 1) {
         var4 = (MyPreferenceText)var1;
         var3 = String.format(Locale.US, this.getString(2131492959), var2);
      } else {
         if (var2 == 1) {
            var4 = (MyPreferenceText)var1;
            var2 = 2131492958;
         } else {
            var4 = (MyPreferenceText)var1;
            var2 = 2131492960;
         }

         var3 = this.getString(var2);
      }

      var4.a(var3);
   }

   private void e(Preference var1) {
      MyLog.log("MyPreferencesFragment.check_pref_apps_recentnotifications");
      int var2 = MyRecentAppNotifications.n(this.getActivity().getApplicationContext());
      MyPreferenceText var3;
      String var4;
      if (var2 > 1) {
         var3 = (MyPreferenceText)var1;
         var4 = String.format(Locale.US, "%d recent notifications", var2);
      } else if (var2 == 1) {
         var3 = (MyPreferenceText)var1;
         var4 = "1 recent notification";
      } else {
         var3 = (MyPreferenceText)var1;
         var4 = "No recent notifications";
      }

      var3.a(var4);
   }

   public void onActivityCreated(Bundle var1) {
      MyLog.log("MyPreferencesFragment.onActivityCreated");
      super.onActivityCreated(var1);
   }

   public void onActivityResult(int var1, int var2, Intent var3) {
      if (var1 == 203) {
         if (var2 == 1) {
            MyLog.log("MyPreferencesFragment.onActivityResult CHECK_VOICE_DATA_PASS");
            return;
         }

         MyLog.log("MyPreferencesFragment.onActivityResult CHECK_VOICE_DATA_PASS failed! No voice data!");

         try {
            var3 = new Intent();
            var3.setAction("android.speech.tts.engine.INSTALL_TTS_DATA");
            this.startActivity(var3);
            return;
         } catch (Exception var4) {
            MyLog.log("MyPreferencesFragment.onActivityResult startActivity(ACTION_INSTALL_TTS_DATA) failed!");
            MyLog.toast(this.getActivity(), "No voice data. This function is not available in your device!");
         }
      }

   }

   public void onCreate(Bundle var1) {
      MyLog.log("MyPreferencesFragment.onCreate");
      super.onCreate(var1);
      MyPreferencesActivity var5 = (MyPreferencesActivity)this.getActivity();
      Bundle var2 = this.getArguments();
      if (var2 != null) {
         String var3 = var2.getString("prefxmlres");
         String var7 = var5.getPackageName();
         this.addPreferencesFromResource(var5.getResources().getIdentifier(var3, "xml", var7));
      }

      if (App.d) {
         try {
            Intent var6 = new Intent("android.speech.tts.engine.CHECK_TTS_DATA");
            this.startActivityForResult(var6, 203);
            this.a();
            return;
         } catch (Exception var4) {
            MyLog.log("MyPreferencesFragment.onCreate ERROR in starting CHECK_TTS_DATA");
         }
      }

   }

   public void onDestroy() {
      MyLog.log("MyPreferencesFragment.onDestroy");
      App.c(this.getActivity().getApplicationContext());
      super.onDestroy();
   }

   public void onPause() {
      MyLog.log("MyPreferencesFragment.onPause");
      this.getPreferenceManager().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
      super.onPause();
   }

   public void onResume() {
      MyLog.log("MyPreferencesFragment.onResume");
      this.getPreferenceManager().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
      this.a(this.getPreferenceScreen());
      super.onResume();
   }

   public void onSharedPreferenceChanged(SharedPreferences var1, String var2) {
      Preference var3 = this.findPreference(var2);
      if (var3 == null) {
         StringBuilder var4 = new StringBuilder();
         var4.append("MyPreferencesFragment.onSharedPreferenceChanged: p=null key=");
         var4.append(var2);
         MyLog.log(var4.toString());
      } else {
         this.b(var3);
      }
   }

   public void onStart() {
      MyLog.log("MyPreferencesFragment.onDestroy");
      super.onStart();
   }
}
