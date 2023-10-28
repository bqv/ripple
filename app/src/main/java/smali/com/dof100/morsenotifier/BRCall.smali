.class public Lcom/dof100/morsenotifier/BRCall;
.super Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 11

    const-string v0, "BRCall.onReceive"

    invoke-static {p1, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    const-string v1, "android.intent.action.PHONE_STATE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "BRCall_lastState"

    sget-object v2, Landroid/telephony/TelephonyManager;->EXTRA_STATE_IDLE:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "BRCall_lastTimeRinging"

    const-wide/16 v3, 0x0

    invoke-interface {v0, v2, v3, v4}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v5

    const-string v2, "state"

    invoke-virtual {p2, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v7, "BRCall_lastState"

    invoke-interface {v0, v7, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    sget-object v7, Landroid/telephony/TelephonyManager;->EXTRA_STATE_IDLE:Ljava/lang/String;

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const-string p2, "BRCall.onReceive EXTRA_STATE_IDLE. Broadcasting finish"

    invoke-static {p1, p2}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/dof100/morsenotifier/App;->b(Landroid/content/Context;)V

    return-void

    :cond_2
    sget-object v7, Landroid/telephony/TelephonyManager;->EXTRA_STATE_OFFHOOK:Ljava/lang/String;

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const-string p2, "BRCall.onReceive EXTRA_STATE_OFFHOOK. Broadcasting finish"

    invoke-static {p1, p2}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/dof100/morsenotifier/App;->b(Landroid/content/Context;)V

    return-void

    :cond_3
    sget-object v7, Landroid/telephony/TelephonyManager;->EXTRA_STATE_RINGING:Ljava/lang/String;

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    const-string p2, "BRCall.onReceive EXTRA_STATE_???????. Broadcasting finish"

    invoke-static {p1, p2}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/dof100/morsenotifier/App;->b(Landroid/content/Context;)V

    return-void

    :cond_4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "BRCall.onReceive EXTRA_STATE_RINGING lastState    = "

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    const-string v2, "incoming_number"

    invoke-virtual {p2, v2}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v2

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "BRCall.onReceive EXTRA_STATE_RINGING hasCallerID  = "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {p1, v7}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x1c

    if-lt v7, v8, :cond_5

    if-nez v2, :cond_5

    const-string p2, "BRCall.onReceive EXTRA_STATE_RINGING Android>=9 without hasCallerID (returning)"

    invoke-static {p1, p2}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_5
    const-string v2, "incoming_number"

    invoke-virtual {p2, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "BRCall.onReceive EXTRA_STATE_RINGING callerID     = "

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    if-nez p2, :cond_6

    const-string p2, ""

    :cond_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    const-string v2, "BRCall_lastTimeRinging"

    invoke-interface {v0, v2, v7, v8}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    sub-long v9, v7, v5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "BRCall.onReceive EXTRA_STATE_RINGING dt           = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    cmp-long v0, v9, v3

    if-gez v0, :cond_7

    const-wide/16 v9, 0x9c5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "BRCall.onReceive EXTRA_STATE_RINGING dt          -> "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    :cond_7
    const-wide/16 v2, 0x9c4

    cmp-long v0, v9, v2

    if-gez v0, :cond_8

    const-string p2, "BRCall.onReceive EXTRA_STATE_RINGING dt          < MINDTBETWEENRINGS (return)"

    invoke-static {p1, p2}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_8
    sget-object v0, Landroid/telephony/TelephonyManager;->EXTRA_STATE_RINGING:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    const-string v0, "BRCall.onReceive oldstate=RINGING (ERROR)"

    invoke-static {p1, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    const-wide/16 v0, 0x1388

    cmp-long v2, v9, v0

    if-gez v2, :cond_9

    const-string p2, "BRCall.onReceive oldstate=RINGING (ERROR), dt<DTRESETRINGS (return)"

    invoke-static {p1, p2}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_9
    const-string v0, "BRCall.onReceive oldstate=RINGING (ERROR), dt>DTRESETRINGS, proceed as normal"

    invoke-static {p1, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    :cond_a
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "BRCall.onReceive Sending intent to ServiceMain info=%s text1=%s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0c0004

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/dof100/morsenotifier/ServiceMain;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c0024

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c000b

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :catch_0
    return-void
.end method
