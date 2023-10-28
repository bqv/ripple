.class public Lcom/dof100/morsenotifier/BRSystem;
.super Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method private a(Landroid/content/Context;Landroid/net/NetworkInfo;)I
    .locals 20

    move-object/from16 v0, p1

    const/4 v1, -0x2

    if-nez p2, :cond_0

    const-string v2, "BRSystem.wifiStateChanged netinfo=null"

    invoke-static {v0, v2}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    return v1

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static/range {p1 .. p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v5

    const-string v6, "BRSystem_LastWiFiStatus"

    invoke-interface {v5, v6, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v6

    const-string v7, "BRSystem_LastTimeWiFiConnected"

    const-wide/16 v8, 0x0

    invoke-interface {v5, v7, v8, v9}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v10

    const-string v7, "BRSystem_LastTimeWiFiDisconnected"

    invoke-interface {v5, v7, v8, v9}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v12

    invoke-virtual/range {p2 .. p2}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v7

    const/4 v14, 0x0

    const-wide/16 v15, 0x1388

    const-wide/16 v17, 0x1389

    const/16 v19, -0x3

    if-eqz v7, :cond_4

    const-string v1, "BRSystem.wifiStateChanged isConnected"

    invoke-static {v0, v1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    sub-long v1, v3, v10

    cmp-long v7, v1, v8

    if-gez v7, :cond_1

    move-wide/from16 v1, v17

    :cond_1
    const/4 v7, 0x1

    if-ne v6, v7, :cond_2

    const-string v1, "BRSystem.wifiStateChanged already connected"

    invoke-static {v0, v1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v1, -0x3

    goto :goto_1

    :cond_2
    cmp-long v6, v1, v15

    if-gez v6, :cond_3

    const-string v1, "BRSystem.wifiStateChanged dt since last connect < MINDT"

    invoke-static {v0, v1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v1, -0x3

    :goto_0
    const/4 v6, 0x1

    goto :goto_1

    :cond_3
    const-string v1, "BRSystem.wifiStateChanged connected"

    invoke-static {v0, v1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v1, 0x1

    goto :goto_0

    :goto_1
    move-wide v10, v3

    goto :goto_2

    :cond_4
    invoke-virtual/range {p2 .. p2}, Landroid/net/NetworkInfo;->isConnectedOrConnecting()Z

    move-result v2

    if-eqz v2, :cond_5

    const-string v2, "BRSystem.onReceive wifiStateChanged isConnectedOrConnecting"

    invoke-static {v0, v2}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    :goto_2
    move-wide v3, v12

    goto :goto_4

    :cond_5
    const-string v1, "BRSystem.wifiStateChanged disConnected"

    invoke-static {v0, v1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    sub-long v1, v3, v12

    cmp-long v7, v1, v8

    if-gez v7, :cond_6

    move-wide/from16 v1, v17

    :cond_6
    if-nez v6, :cond_7

    const-string v1, "BRSystem.wifiStateChanged already disconnected"

    invoke-static {v0, v1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v1, -0x3

    goto :goto_4

    :cond_7
    cmp-long v6, v1, v15

    if-gez v6, :cond_8

    const-string v1, "BRSystem.wifiStateChanged dt since last disconnect < MINDT"

    invoke-static {v0, v1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v1, -0x3

    :goto_3
    const/4 v6, 0x0

    goto :goto_4

    :cond_8
    const-string v1, "BRSystem.onReceive wifiStateChanged disconnected"

    invoke-static {v0, v1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v1, 0x0

    goto :goto_3

    :goto_4
    invoke-interface {v5}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v2, "BRSystem_LastWiFiStatus"

    invoke-interface {v0, v2, v6}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    const-string v2, "BRSystem_LastTimeWiFiConnected"

    invoke-interface {v0, v2, v10, v11}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    const-string v2, "BRSystem_LastTimeWiFiDisconnected"

    invoke-interface {v0, v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return v1
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 10

    const-string v0, "BRSystem.onReceive"

    invoke-static {p1, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    const-string v0, ""

    const-string v1, ""

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    const-string v3, "android.intent.action.BOOT_COMPLETED"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const v4, 0x7f0c000c

    const v5, 0x7f0c0024

    if-eqz v3, :cond_1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f0c001e

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Landroid/content/Intent;

    const-class v2, Lcom/dof100/morsenotifier/ServiceMain;

    invoke-direct {v0, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void

    :cond_1
    const/4 v3, -0x1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v6

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v9, 0x1

    sparse-switch v6, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v6, "android.intent.action.ACTION_POWER_CONNECTED"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v3, 0x0

    goto :goto_0

    :sswitch_1
    const-string v6, "android.intent.action.ACTION_BATTERY_OK"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v3, 0x3

    goto :goto_0

    :sswitch_2
    const-string v6, "android.net.wifi.STATE_CHANGE"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v3, 0x4

    goto :goto_0

    :sswitch_3
    const-string v6, "android.intent.action.ACTION_BATTERY_LOW"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v3, 0x2

    goto :goto_0

    :sswitch_4
    const-string v6, "android.intent.action.ACTION_POWER_DISCONNECTED"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v3, 0x1

    :cond_2
    :goto_0
    packed-switch v3, :pswitch_data_0

    goto :goto_3

    :pswitch_0
    const-string v2, "networkInfo"

    invoke-virtual {p2, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Landroid/net/NetworkInfo;

    invoke-direct {p0, p1, p2}, Lcom/dof100/morsenotifier/BRSystem;->a(Landroid/content/Context;Landroid/net/NetworkInfo;)I

    move-result p2

    if-ne p2, v9, :cond_3

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f0c0022

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    const-string v1, "wifi"

    invoke-virtual {p2, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/net/wifi/WifiManager;

    :try_start_0
    invoke-virtual {p2}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object p2

    invoke-virtual {p2}, Landroid/net/wifi/WifiInfo;->getSSID()Ljava/lang/String;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-string p2, ""

    :goto_1
    move-object v1, p2

    goto :goto_3

    :cond_3
    if-nez p2, :cond_4

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f0c0023

    goto :goto_2

    :pswitch_1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f0c001d

    goto :goto_2

    :pswitch_2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f0c001c

    goto :goto_2

    :pswitch_3
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f0c0020

    goto :goto_2

    :pswitch_4
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f0c001f

    :goto_2
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :cond_4
    :goto_3
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_5

    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "BRSystem.onReceive Sending intent to ServiceMain info=%s text2=%s"

    new-array v3, v7, [Ljava/lang/Object;

    aput-object v0, v3, v8

    aput-object v1, v3, v9

    invoke-static {p2, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    new-instance p2, Landroid/content/Intent;

    const-class v2, Lcom/dof100/morsenotifier/ServiceMain;

    invoke-direct {p2, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p1, p2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void

    :cond_5
    const-string p2, "BRSystem.onReceive Not sending intent"

    invoke-static {p1, p2}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7073f927 -> :sswitch_4
        -0x67a63d22 -> :sswitch_3
        -0x147b62d9 -> :sswitch_2
        0x1db050f2 -> :sswitch_1
        0x3cbf870b -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
