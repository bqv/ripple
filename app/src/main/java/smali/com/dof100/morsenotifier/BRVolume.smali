.class public Lcom/dof100/morsenotifier/BRVolume;
.super Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 23

    move-object/from16 v6, p1

    move-object/from16 v0, p2

    invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    :try_start_0
    const-string v2, "android.media.VOLUME_CHANGED_ACTION"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v1, :cond_0

    return-void

    :cond_0
    const-string v1, "android.media.EXTRA_VOLUME_STREAM_TYPE"

    const/4 v7, -0x1

    invoke-virtual {v0, v1, v7}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v8

    const-string v1, "android.media.EXTRA_VOLUME_STREAM_VALUE"

    invoke-virtual {v0, v1, v7}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v9

    const/4 v10, 0x2

    if-ne v8, v10, :cond_1

    const-string v0, "BRVolume.onReceive ring volume (maybe samsung, ignoring)"

    :goto_0
    invoke-static {v6, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_1
    const/4 v11, 0x0

    if-ltz v8, :cond_e

    const/16 v13, 0x9

    if-gt v8, v13, :cond_e

    if-ne v9, v7, :cond_2

    goto/16 :goto_a

    :cond_2
    invoke-static/range {p1 .. p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v14

    const-string v2, "pref_morse_volumedownstop"

    const/4 v3, 0x0

    sget-boolean v0, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v0, :cond_3

    const-string v0, "_morsedef"

    :goto_1
    move-object v4, v0

    goto :goto_2

    :cond_3
    const-string v0, "_voicedef"

    goto :goto_1

    :goto_2
    const-string v5, "_def"

    move-object v0, v6

    move-object v1, v14

    invoke-static/range {v0 .. v5}, Lcom/dof100/morsenotifier/v;->c(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0xa

    new-array v2, v1, [I

    fill-array-data v2, :array_0

    const/4 v3, 0x0

    :goto_3
    if-ge v3, v1, :cond_4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "BRVolume_LastVol"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v14, v4, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v4

    aput v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_4
    const-string v3, "BRVolume_LastTimeVolUp"

    const-wide/16 v4, 0x0

    invoke-interface {v14, v3, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v15

    const-string v3, "BRVolume_LastTimeVolDown"

    invoke-interface {v14, v3, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v17

    const-string v3, "BRVolume_LastTimeBroadcast"

    invoke-interface {v14, v3, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    invoke-interface {v14}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    aget v1, v2, v8

    if-eq v1, v7, :cond_6

    aget v1, v2, v8

    if-ge v1, v9, :cond_5

    const-string v1, "BRVolume_LastTimeVolUp"

    invoke-interface {v5, v1, v13, v14}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    const/4 v1, 0x0

    const/4 v7, 0x1

    goto :goto_5

    :cond_5
    aget v1, v2, v8

    if-le v1, v9, :cond_6

    const-string v1, "BRVolume_LastTimeVolDown"

    invoke-interface {v5, v1, v13, v14}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    const/4 v1, 0x1

    goto :goto_4

    :cond_6
    const/4 v1, 0x0

    :goto_4
    const/4 v7, 0x0

    :goto_5
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "BRVolume_LastVol"

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v5, v10, v9}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    packed-switch v0, :pswitch_data_0

    goto :goto_7

    :pswitch_0
    const-wide/16 v19, 0x7d0

    if-eqz v7, :cond_7

    sub-long v21, v13, v17

    cmp-long v10, v21, v19

    if-ltz v10, :cond_8

    :cond_7
    if-eqz v1, :cond_9

    sub-long v17, v13, v15

    cmp-long v10, v17, v19

    if-gez v10, :cond_9

    :cond_8
    :goto_6
    :pswitch_1
    const/4 v10, 0x1

    goto :goto_8

    :pswitch_2
    if-eqz v1, :cond_9

    goto :goto_6

    :cond_9
    :goto_7
    :pswitch_3
    const/4 v10, 0x0

    :goto_8
    const-string v12, ""

    if-eqz v1, :cond_a

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, " DOWN"

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    :cond_a
    if-eqz v7, :cond_b

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " UP  "

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    :cond_b
    if-eqz v10, :cond_c

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " OK"

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    sub-long v15, v13, v3

    const-wide/16 v3, 0x1f4

    cmp-long v1, v15, v3

    if-lez v1, :cond_c

    const-string v1, "BRVolume_LastTimeBroadcast"

    invoke-interface {v5, v1, v13, v14}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " Broadcasting Finish"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    const/4 v1, 0x1

    goto :goto_9

    :cond_c
    const/4 v1, 0x0

    :goto_9
    invoke-interface {v5}, Landroid/content/SharedPreferences$Editor;->apply()V

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "BRVolume.onReceive StreamType=%02d Vol:%02d old = %02d %02d %02d %02d %02d %02d %02d %02d %02d %02d (pref=%d) %s"

    const/16 v5, 0xe

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v5, v11

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, 0x1

    aput-object v7, v5, v8

    aget v7, v2, v11

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v9, 0x2

    aput-object v7, v5, v9

    aget v7, v2, v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, 0x3

    aput-object v7, v5, v8

    aget v7, v2, v9

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v9, 0x4

    aput-object v7, v5, v9

    aget v7, v2, v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, 0x5

    aput-object v7, v5, v8

    aget v7, v2, v9

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v9, 0x6

    aput-object v7, v5, v9

    aget v7, v2, v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, 0x7

    aput-object v7, v5, v8

    aget v7, v2, v9

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/16 v9, 0x8

    aput-object v7, v5, v9

    aget v7, v2, v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/16 v8, 0x9

    aput-object v7, v5, v8

    aget v7, v2, v9

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/16 v9, 0xa

    aput-object v7, v5, v9

    const/16 v7, 0xb

    aget v2, v2, v8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v5, v7

    const/16 v2, 0xc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v5, v2

    const/16 v0, 0xd

    aput-object v12, v5, v0

    invoke-static {v3, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    if-eqz v1, :cond_d

    invoke-static/range {p1 .. p1}, Lcom/dof100/morsenotifier/App;->b(Landroid/content/Context;)V

    :cond_d
    return-void

    :cond_e
    :goto_a
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "BRVolume.onReceive ERROR Stream type =%d  Volume: %d"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v11

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :catch_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :array_0
    .array-data 4
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
    .end array-data
.end method
