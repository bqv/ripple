.class public Lcom/dof100/morsenotifier/MyPreferencesFragment;
.super Landroid/preference/PreferenceFragment;

# interfaces
.implements Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/preference/PreferenceFragment;-><init>()V

    return-void
.end method

.method private a()V
    .locals 11

    sget-boolean v0, Lcom/dof100/morsenotifier/App;->d:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "pref_voice_locale"

    invoke-virtual {p0, v0}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Lcom/dof100/morsenotifier/MyPreferenceList;

    if-nez v0, :cond_1

    const-string v0, "MyPreferencesFragment.init_pref_voice_locale ERROR pref_voice_locale=null"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/dof100/morsenotifier/App;->a(Landroid/content/Context;)Lcom/dof100/morsenotifier/l;

    move-result-object v1

    if-nez v1, :cond_2

    const-string v0, "MyPreferencesFragment.init_pref_voice_locale ERROR mPlayerTTS=null"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-void

    :cond_2
    iget-object v2, v1, Lcom/dof100/morsenotifier/l;->b:Landroid/speech/tts/TextToSpeech;

    if-nez v2, :cond_3

    const-string v0, "MyPreferencesFragment.init_pref_voice_locale ERROR App.mPlayerTTS.mTTS=null"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-void

    :cond_3
    iget v2, v1, Lcom/dof100/morsenotifier/l;->a:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_4

    const-string v0, "MyPreferencesFragment.init_pref_voice_locale ERROR mTTSStatus=ERROR"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-void

    :cond_4
    invoke-static {}, Ljava/util/Locale;->getAvailableLocales()[Ljava/util/Locale;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    array-length v4, v2

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    const/4 v7, 0x1

    if-ge v6, v4, :cond_7

    aget-object v8, v2, v6

    invoke-virtual {v8}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v9

    const-string v10, "en_US_POSIX"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    const-string v7, "MyPreferencesFragment.init_pref_voice_locale Locale en_US_POSIX not supported"

    :goto_1
    invoke-static {v7}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    iget-object v9, v1, Lcom/dof100/morsenotifier/l;->b:Landroid/speech/tts/TextToSpeech;

    invoke-virtual {v9, v8}, Landroid/speech/tts/TextToSpeech;->isLanguageAvailable(Ljava/util/Locale;)I

    move-result v9

    if-lt v9, v7, :cond_6

    invoke-virtual {v8}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "MyPreferencesFragment.init_pref_voice_locale Locale: "

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " supported "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    :cond_6
    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_7
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_8

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    invoke-interface {v3, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    goto :goto_3

    :cond_8
    new-array v1, v7, [Ljava/lang/String;

    const-string v2, "(none)"

    aput-object v2, v1, v5

    :goto_3
    invoke-virtual {v0, v1}, Lcom/dof100/morsenotifier/MyPreferenceList;->setEntries([Ljava/lang/CharSequence;)V

    invoke-virtual {v0, v1}, Lcom/dof100/morsenotifier/MyPreferenceList;->setEntryValues([Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lcom/dof100/morsenotifier/MyPreferenceList;->a()V

    return-void
.end method

.method private a(Landroid/preference/Preference;)V
    .locals 3

    if-nez p1, :cond_0

    const-string p1, "MyPreferencesFragment.checkAllPreferences: p=null"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    instance-of v0, p1, Landroid/preference/PreferenceCategory;

    if-nez v0, :cond_1

    instance-of v0, p1, Landroid/preference/PreferenceScreen;

    if-eqz v0, :cond_2

    :cond_1
    move-object v0, p1

    check-cast v0, Landroid/preference/PreferenceGroup;

    invoke-virtual {v0}, Landroid/preference/PreferenceGroup;->getPreferenceCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_2

    invoke-virtual {v0, v1}, Landroid/preference/PreferenceGroup;->getPreference(I)Landroid/preference/Preference;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->a(Landroid/preference/Preference;)V

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_2
    invoke-direct {p0, p1}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->b(Landroid/preference/Preference;)V

    return-void
.end method

.method private b()V
    .locals 1

    const-string v0, "MyPreferencesFragment.check_pref_voice_locale"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-void
.end method

.method private b(Landroid/preference/Preference;)V
    .locals 4

    if-nez p1, :cond_0

    const-string p1, "MyPreferencesFragment.checkPreference: aP = null"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/preference/Preference;->getKey()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    const-string v1, "pref_voice_locale"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-direct {p0}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->b()V

    :cond_2
    const-string v1, "pref_call_contact"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-direct {p0}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->c()V

    return-void

    :cond_3
    const-string v1, "pref_sms_contact"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-direct {p0}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->d()V

    return-void

    :cond_4
    const-string v1, "pref_reminders_select"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-direct {p0, p1}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->c(Landroid/preference/Preference;)V

    return-void

    :cond_5
    const-string v1, "pref_apps_filters"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-direct {p0, p1}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->d(Landroid/preference/Preference;)V

    return-void

    :cond_6
    const-string v1, "pref_apps_recentnotifications"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-direct {p0, p1}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->e(Landroid/preference/Preference;)V

    return-void

    :cond_7
    instance-of v1, p1, Landroid/preference/PreferenceCategory;

    if-nez v1, :cond_8

    instance-of v1, p1, Landroid/preference/PreferenceScreen;

    if-eqz v1, :cond_b

    :cond_8
    const-string v1, "pref_morse"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_a

    const-string v1, "pref_audio"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    const-string v1, "pref_display"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    goto :goto_0

    :cond_9
    const-string v1, "pref_voice"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_b

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MyPreferencesFragment.checkPreference: remove voice key = "

    goto :goto_1

    :cond_a
    :goto_0
    sget-boolean v1, Lcom/dof100/morsenotifier/App;->d:Z

    if-eqz v1, :cond_b

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MyPreferencesFragment.checkPreference: remove morse key = "

    :goto_1
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Landroid/preference/Preference;->setEnabled(Z)V

    :cond_b
    return-void
.end method

.method private c()V
    .locals 5

    const-string v0, "pref_call_contactdisplayname"

    invoke-virtual {p0, v0}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Landroid/preference/CheckBoxPreference;

    const-string v1, "pref_call_contactfirstname"

    invoke-virtual {p0, v1}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v1

    check-cast v1, Landroid/preference/CheckBoxPreference;

    const-string v2, "pref_call_contactlastname"

    invoke-virtual {p0, v2}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v2

    check-cast v2, Landroid/preference/CheckBoxPreference;

    const-string v3, "pref_call_contactinitials"

    invoke-virtual {p0, v3}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v3

    check-cast v3, Landroid/preference/CheckBoxPreference;

    const-string v4, "pref_call_contactnickname"

    invoke-virtual {p0, v4}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v4

    check-cast v4, Landroid/preference/CheckBoxPreference;

    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    if-eqz v2, :cond_2

    if-eqz v3, :cond_2

    if-eqz v4, :cond_2

    invoke-virtual {v0}, Landroid/preference/CheckBoxPreference;->isChecked()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v1}, Landroid/preference/CheckBoxPreference;->isChecked()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v2}, Landroid/preference/CheckBoxPreference;->isChecked()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v3}, Landroid/preference/CheckBoxPreference;->isChecked()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v4}, Landroid/preference/CheckBoxPreference;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    const-string v1, "pref_call_contactname_none"

    invoke-virtual {p0, v1}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/preference/Preference;->setEnabled(Z)V

    :cond_2
    return-void
.end method

.method private c(Landroid/preference/Preference;)V
    .locals 5

    const-string v0, "MyPreferencesFragment.check_pref_reminders_select"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "reminders_n"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lcom/dof100/morsenotifier/MyPreferenceText;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "%d reminders"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v4, v2

    invoke-static {v1, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p1, v0}, Lcom/dof100/morsenotifier/MyPreferenceText;->a(Ljava/lang/String;)V

    return-void

    :pswitch_0
    check-cast p1, Lcom/dof100/morsenotifier/MyPreferenceText;

    const-string v0, "1 reminder"

    goto :goto_0

    :pswitch_1
    check-cast p1, Lcom/dof100/morsenotifier/MyPreferenceText;

    const-string v0, "No Reminders"

    goto :goto_0

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private d()V
    .locals 5

    const-string v0, "pref_sms_contactdisplayname"

    invoke-virtual {p0, v0}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Landroid/preference/CheckBoxPreference;

    const-string v1, "pref_sms_contactfirstname"

    invoke-virtual {p0, v1}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v1

    check-cast v1, Landroid/preference/CheckBoxPreference;

    const-string v2, "pref_sms_contactlastname"

    invoke-virtual {p0, v2}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v2

    check-cast v2, Landroid/preference/CheckBoxPreference;

    const-string v3, "pref_sms_contactinitials"

    invoke-virtual {p0, v3}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v3

    check-cast v3, Landroid/preference/CheckBoxPreference;

    const-string v4, "pref_sms_contactnickname"

    invoke-virtual {p0, v4}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v4

    check-cast v4, Landroid/preference/CheckBoxPreference;

    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    if-eqz v2, :cond_2

    if-eqz v3, :cond_2

    if-eqz v4, :cond_2

    invoke-virtual {v0}, Landroid/preference/CheckBoxPreference;->isChecked()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v1}, Landroid/preference/CheckBoxPreference;->isChecked()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v2}, Landroid/preference/CheckBoxPreference;->isChecked()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v3}, Landroid/preference/CheckBoxPreference;->isChecked()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v4}, Landroid/preference/CheckBoxPreference;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    const-string v1, "pref_sms_contactname_none"

    invoke-virtual {p0, v1}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/preference/Preference;->setEnabled(Z)V

    :cond_2
    return-void
.end method

.method private d(Landroid/preference/Preference;)V
    .locals 5

    const-string v0, "MyPreferencesFragment.check_pref_apps_filters"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/dof100/morsenotifier/b;->c(Landroid/content/Context;)I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    check-cast p1, Lcom/dof100/morsenotifier/MyPreferenceText;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const v3, 0x7f0c005f

    invoke-virtual {p0, v3}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v1, v4

    invoke-static {v2, v3, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p1, v0}, Lcom/dof100/morsenotifier/MyPreferenceText;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    if-ne v0, v1, :cond_1

    check-cast p1, Lcom/dof100/morsenotifier/MyPreferenceText;

    const v0, 0x7f0c005e

    :goto_1
    invoke-virtual {p0, v0}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/dof100/morsenotifier/MyPreferenceText;

    const v0, 0x7f0c0060

    goto :goto_1

    return-void
.end method

.method private e(Landroid/preference/Preference;)V
    .locals 5

    const-string v0, "MyPreferencesFragment.check_pref_apps_recentnotifications"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/dof100/morsenotifier/n;->c(Landroid/content/Context;)I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    check-cast p1, Lcom/dof100/morsenotifier/MyPreferenceText;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "%d recent notifications"

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v1, v4

    invoke-static {v2, v3, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p1, v0}, Lcom/dof100/morsenotifier/MyPreferenceText;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    if-ne v0, v1, :cond_1

    check-cast p1, Lcom/dof100/morsenotifier/MyPreferenceText;

    const-string v0, "1 recent notification"

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/dof100/morsenotifier/MyPreferenceText;

    const-string v0, "No recent notifications"

    goto :goto_0

    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "MyPreferencesFragment.onActivityCreated"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/preference/PreferenceFragment;->onActivityCreated(Landroid/os/Bundle;)V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    const/16 p3, 0xcb

    if-ne p1, p3, :cond_1

    const/4 p1, 0x1

    if-ne p2, p1, :cond_0

    const-string p1, "MyPreferencesFragment.onActivityResult CHECK_VOICE_DATA_PASS"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    const-string p1, "MyPreferencesFragment.onActivityResult CHECK_VOICE_DATA_PASS failed! No voice data!"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    :try_start_0
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    const-string p2, "android.speech.tts.engine.INSTALL_TTS_DATA"

    invoke-virtual {p1, p2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string p1, "MyPreferencesFragment.onActivityResult startActivity(ACTION_INSTALL_TTS_DATA) failed!"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    const-string p2, "No voice data. This function is not available in your device!"

    invoke-static {p1, p2}, Lcom/dof100/morsenotifier/i;->b(Landroid/content/Context;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    const-string v0, "MyPreferencesFragment.onCreate"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/preference/PreferenceFragment;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    check-cast p1, Lcom/dof100/morsenotifier/MyPreferencesActivity;

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "prefxmlres"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/dof100/morsenotifier/MyPreferencesActivity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/dof100/morsenotifier/MyPreferencesActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const-string v2, "xml"

    invoke-virtual {p1, v0, v2, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->addPreferencesFromResource(I)V

    :cond_0
    sget-boolean p1, Lcom/dof100/morsenotifier/App;->d:Z

    if-eqz p1, :cond_1

    :try_start_0
    new-instance p1, Landroid/content/Intent;

    const-string v0, "android.speech.tts.engine.CHECK_TTS_DATA"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/16 v0, 0xcb

    invoke-virtual {p0, p1, v0}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->startActivityForResult(Landroid/content/Intent;I)V

    invoke-direct {p0}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string p1, "MyPreferencesFragment.onCreate ERROR in starting CHECK_TTS_DATA"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public onDestroy()V
    .locals 1

    const-string v0, "MyPreferencesFragment.onDestroy"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/dof100/morsenotifier/App;->c(Landroid/content/Context;)V

    invoke-super {p0}, Landroid/preference/PreferenceFragment;->onDestroy()V

    return-void
.end method

.method public onPause()V
    .locals 1

    const-string v0, "MyPreferencesFragment.onPause"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->getPreferenceManager()Landroid/preference/PreferenceManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/preference/PreferenceManager;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0, p0}, Landroid/content/SharedPreferences;->unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    invoke-super {p0}, Landroid/preference/PreferenceFragment;->onPause()V

    return-void
.end method

.method public onResume()V
    .locals 1

    const-string v0, "MyPreferencesFragment.onResume"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->getPreferenceManager()Landroid/preference/PreferenceManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/preference/PreferenceManager;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0, p0}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->getPreferenceScreen()Landroid/preference/PreferenceScreen;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->a(Landroid/preference/Preference;)V

    invoke-super {p0}, Landroid/preference/PreferenceFragment;->onResume()V

    return-void
.end method

.method public onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0, p2}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object p1

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "MyPreferencesFragment.onSharedPreferenceChanged: p=null key="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-direct {p0, p1}, Lcom/dof100/morsenotifier/MyPreferencesFragment;->b(Landroid/preference/Preference;)V

    return-void
.end method

.method public onStart()V
    .locals 1

    const-string v0, "MyPreferencesFragment.onDestroy"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/preference/PreferenceFragment;->onStart()V

    return-void
.end method
