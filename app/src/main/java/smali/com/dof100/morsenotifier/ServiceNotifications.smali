.class public Lcom/dof100/morsenotifier/ServiceNotifications;
.super Landroid/service/notification/NotificationListenerService;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x15
.end annotation


# instance fields
.field private a:Z

.field private b:I

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:Lcom/dof100/morsenotifier/n;

.field private g:Lcom/dof100/morsenotifier/b;

.field private final h:Landroid/content/BroadcastReceiver;

.field private final i:Landroid/os/Handler;

.field private final j:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/service/notification/NotificationListenerService;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceNotifications;->a:Z

    iput v0, p0, Lcom/dof100/morsenotifier/ServiceNotifications;->b:I

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceNotifications;->c:Z

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceNotifications;->d:Z

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceNotifications;->e:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/dof100/morsenotifier/ServiceNotifications;->f:Lcom/dof100/morsenotifier/n;

    iput-object v0, p0, Lcom/dof100/morsenotifier/ServiceNotifications;->g:Lcom/dof100/morsenotifier/b;

    new-instance v0, Lcom/dof100/morsenotifier/ServiceNotifications$1;

    invoke-direct {v0, p0}, Lcom/dof100/morsenotifier/ServiceNotifications$1;-><init>(Lcom/dof100/morsenotifier/ServiceNotifications;)V

    iput-object v0, p0, Lcom/dof100/morsenotifier/ServiceNotifications;->h:Landroid/content/BroadcastReceiver;

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/dof100/morsenotifier/ServiceNotifications;->i:Landroid/os/Handler;

    new-instance v0, Lcom/dof100/morsenotifier/ServiceNotifications$2;

    invoke-direct {v0, p0}, Lcom/dof100/morsenotifier/ServiceNotifications$2;-><init>(Lcom/dof100/morsenotifier/ServiceNotifications;)V

    iput-object v0, p0, Lcom/dof100/morsenotifier/ServiceNotifications;->j:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic a(Lcom/dof100/morsenotifier/ServiceNotifications;)Lcom/dof100/morsenotifier/n;
    .locals 0

    iget-object p0, p0, Lcom/dof100/morsenotifier/ServiceNotifications;->f:Lcom/dof100/morsenotifier/n;

    return-object p0
.end method

.method private a()V
    .locals 7

    const-string v0, "ServiceNotifications.load_params"

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v3, "pref_audio_enable"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_0

    const-string v1, "_morsedef"

    :goto_0
    move-object v5, v1

    goto :goto_1

    :cond_0
    const-string v1, "_voicedef"

    goto :goto_0

    :goto_1
    const-string v6, "_def"

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceNotifications;->c:Z

    const-string v3, "pref_audio_vibration_enable"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_1

    const-string v1, "_morsedef"

    :goto_2
    move-object v5, v1

    goto :goto_3

    :cond_1
    const-string v1, "_voicedef"

    goto :goto_2

    :goto_3
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceNotifications;->d:Z

    const-string v3, "pref_display_enable"

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_2

    const-string v1, "_morsedef"

    :goto_4
    move-object v5, v1

    goto :goto_5

    :cond_2
    const-string v1, "_voicedef"

    goto :goto_4

    :goto_5
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceNotifications;->e:Z

    const-string v3, "pref_apps_enable"

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_3

    const-string v1, "_morsedef"

    :goto_6
    move-object v5, v1

    goto :goto_7

    :cond_3
    const-string v1, "_voicedef"

    goto :goto_6

    :goto_7
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceNotifications;->a:Z

    const-string v3, "pref_apps_multiple"

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_4

    const-string v1, "_morsedef"

    :goto_8
    move-object v5, v1

    goto :goto_9

    :cond_4
    const-string v1, "_voicedef"

    goto :goto_8

    :goto_9
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->c(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/dof100/morsenotifier/ServiceNotifications;->b:I

    iget-object v0, p0, Lcom/dof100/morsenotifier/ServiceNotifications;->g:Lcom/dof100/morsenotifier/b;

    invoke-virtual {v0, p0}, Lcom/dof100/morsenotifier/b;->a(Landroid/content/Context;)V

    return-void
.end method

.method private a(Lcom/dof100/morsenotifier/m;)V
    .locals 4

    const-string v0, "ServiceNotifications.notificationAnnounceNow Starting service"

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput v0, p1, Lcom/dof100/morsenotifier/m;->h:I

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/dof100/morsenotifier/ServiceMain;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ServiceNotifications;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c0024

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ServiceNotifications;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0c0001

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ServiceNotifications;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c000c

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object p1, p1, Lcom/dof100/morsenotifier/m;->j:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/dof100/morsenotifier/ServiceNotifications;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void
.end method

.method private b()Z
    .locals 18

    move-object/from16 v0, p0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ServiceNotifications.notificationAnnounceCheckCandidates Queue length="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lcom/dof100/morsenotifier/ServiceNotifications;->f:Lcom/dof100/morsenotifier/n;

    iget-object v4, v4, Lcom/dof100/morsenotifier/n;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    iget-object v3, v0, Lcom/dof100/morsenotifier/ServiceNotifications;->f:Lcom/dof100/morsenotifier/n;

    iget-object v3, v3, Lcom/dof100/morsenotifier/n;->a:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v5, -0x1

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v6, :cond_d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/dof100/morsenotifier/m;

    add-int/2addr v5, v8

    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v10, "ServiceNotifications.notificationAnnounceCheckCandidates n%d: checking"

    new-array v11, v8, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    aput-object v12, v11, v7

    invoke-static {v9, v10, v11}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v0, v9}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    iget v9, v6, Lcom/dof100/morsenotifier/m;->h:I

    if-eqz v9, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v9, v6, Lcom/dof100/morsenotifier/m;->a:J

    sub-long v11, v1, v9

    const-wide/16 v9, 0xbb8

    cmp-long v13, v11, v9

    if-gez v13, :cond_1

    goto :goto_0

    :cond_1
    sget-object v13, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v14, "ServiceNotifications.notificationAnnounceCheckCandidates n%d: waiting expired (dt=%d msec)"

    const/4 v15, 0x2

    new-array v4, v15, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    aput-object v16, v4, v7

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    aput-object v11, v4, v8

    invoke-static {v13, v14, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    iget-object v4, v0, Lcom/dof100/morsenotifier/ServiceNotifications;->f:Lcom/dof100/morsenotifier/n;

    iget-object v4, v4, Lcom/dof100/morsenotifier/n;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v11, -0x1

    :cond_2
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/dof100/morsenotifier/m;

    add-int/2addr v11, v8

    iget-object v13, v12, Lcom/dof100/morsenotifier/m;->b:Ljava/lang/String;

    iget-object v14, v6, Lcom/dof100/morsenotifier/m;->b:Ljava/lang/String;

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_3

    goto :goto_1

    :cond_3
    iget v13, v12, Lcom/dof100/morsenotifier/m;->h:I

    if-eqz v13, :cond_4

    goto :goto_1

    :cond_4
    iget-wide v12, v12, Lcom/dof100/morsenotifier/m;->a:J

    sub-long v16, v1, v12

    cmp-long v12, v16, v9

    if-gez v12, :cond_2

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v9, "ServiceNotifications.notificationAnnounceCheckCandidates n%d: found n%d still waiting "

    new-array v10, v15, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    aput-object v12, v10, v7

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    aput-object v11, v10, v8

    invoke-static {v4, v9, v10}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v4, 0x1

    goto :goto_2

    :cond_5
    const/4 v4, 0x0

    :goto_2
    if-eqz v4, :cond_6

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "ServiceNotifications.notificationAnnounceCheckCandidates n%d: found other still waiting "

    new-array v8, v8, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v8, v7

    invoke-static {v4, v6, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    :goto_3
    invoke-static {v0, v4}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_6
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v9, "ServiceNotifications.notificationAnnounceCheckCandidates n%d: searching for best notification "

    new-array v10, v8, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    aput-object v11, v10, v7

    invoke-static {v4, v9, v10}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v4, 0x0

    const v9, 0x7fffffff

    iget-object v10, v0, Lcom/dof100/morsenotifier/ServiceNotifications;->f:Lcom/dof100/morsenotifier/n;

    iget-object v10, v10, Lcom/dof100/morsenotifier/n;->a:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    move-object v9, v4

    const/4 v4, -0x1

    const v11, 0x7fffffff

    :cond_7
    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_a

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/dof100/morsenotifier/m;

    const-string v13, "ServiceNotifications.notificationAnnounceCheckCandidates for"

    invoke-static {v0, v13}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    add-int/2addr v4, v8

    iget v13, v12, Lcom/dof100/morsenotifier/m;->h:I

    if-eqz v13, :cond_8

    goto :goto_4

    :cond_8
    iget-object v13, v12, Lcom/dof100/morsenotifier/m;->b:Ljava/lang/String;

    iget-object v14, v6, Lcom/dof100/morsenotifier/m;->b:Ljava/lang/String;

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_9

    goto :goto_4

    :cond_9
    const/4 v13, -0x4

    iput v13, v12, Lcom/dof100/morsenotifier/m;->h:I

    iget v13, v0, Lcom/dof100/morsenotifier/ServiceNotifications;->b:I

    const/4 v14, 0x3

    packed-switch v13, :pswitch_data_0

    goto :goto_4

    :pswitch_0
    iget v9, v12, Lcom/dof100/morsenotifier/m;->i:I

    sget-object v11, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v13, "ServiceNotifications.notificationAnnounceCheckCandidates n%d: last = n%d, filter=%d"

    new-array v14, v14, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    aput-object v16, v14, v7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    aput-object v16, v14, v8

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    aput-object v16, v14, v15

    :goto_5
    invoke-static {v11, v13, v14}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v0, v11}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    move v11, v9

    move-object v9, v12

    goto :goto_4

    :pswitch_1
    if-nez v9, :cond_7

    iget v9, v12, Lcom/dof100/morsenotifier/m;->i:I

    sget-object v11, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v13, "ServiceNotifications.notificationAnnounceCheckCandidates n%d: first = n%d, filter=%d"

    new-array v14, v14, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    aput-object v16, v14, v7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    aput-object v16, v14, v8

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    aput-object v16, v14, v15

    goto :goto_5

    :pswitch_2
    iget v13, v12, Lcom/dof100/morsenotifier/m;->i:I

    if-ge v13, v11, :cond_7

    iget v9, v12, Lcom/dof100/morsenotifier/m;->i:I

    sget-object v11, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v13, "ServiceNotifications.notificationAnnounceCheckCandidates n%d: found best match = n%d, filter=%d"

    new-array v14, v14, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    aput-object v16, v14, v7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    aput-object v16, v14, v8

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    aput-object v16, v14, v15

    goto :goto_5

    :cond_a
    if-nez v9, :cond_b

    const-string v4, "ServiceNotifications.notificationAnnounceCheckCandidates ERROR nBest==null"

    goto/16 :goto_3

    :cond_b
    if-gez v11, :cond_c

    const-string v4, "ServiceNotifications.notificationAnnounceCheckCandidates ERROR filterBest<0"

    goto/16 :goto_3

    :cond_c
    invoke-direct {v0, v9}, Lcom/dof100/morsenotifier/ServiceNotifications;->a(Lcom/dof100/morsenotifier/m;)V

    goto/16 :goto_0

    :cond_d
    iget-object v1, v0, Lcom/dof100/morsenotifier/ServiceNotifications;->f:Lcom/dof100/morsenotifier/n;

    iget-object v1, v1, Lcom/dof100/morsenotifier/n;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :cond_e
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/dof100/morsenotifier/m;

    const-string v4, "ServiceNotifications.notificationAnnounceCheckCandidates for 3"

    invoke-static {v4}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget v3, v3, Lcom/dof100/morsenotifier/m;->h:I

    if-nez v3, :cond_e

    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_f
    if-lez v2, :cond_10

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "ServiceNotifications.notificationAnnounceCheckCandidates Still %d notifications waiting"

    new-array v4, v8, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v7

    invoke-static {v1, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    :goto_7
    invoke-static {v0, v1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_8

    :cond_10
    const-string v1, "ServiceNotifications.notificationAnnounceCheckCandidates No more notifications waiting"

    goto :goto_7

    :goto_8
    if-lez v2, :cond_11

    const/4 v7, 0x1

    :cond_11
    return v7

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic b(Lcom/dof100/morsenotifier/ServiceNotifications;)Z
    .locals 0

    invoke-direct {p0}, Lcom/dof100/morsenotifier/ServiceNotifications;->b()Z

    move-result p0

    return p0
.end method

.method static synthetic c(Lcom/dof100/morsenotifier/ServiceNotifications;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/dof100/morsenotifier/ServiceNotifications;->i:Landroid/os/Handler;

    return-object p0
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    const-string v0, "ServiceNotifications.onBind"

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/service/notification/NotificationListenerService;->onBind(Landroid/content/Intent;)Landroid/os/IBinder;

    move-result-object p1

    return-object p1
.end method

.method public onCreate()V
    .locals 3

    invoke-super {p0}, Landroid/service/notification/NotificationListenerService;->onCreate()V

    const-string v0, "ServiceNotifications.OnCreate"

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Lcom/dof100/morsenotifier/n;

    invoke-direct {v0, p0}, Lcom/dof100/morsenotifier/n;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/dof100/morsenotifier/ServiceNotifications;->f:Lcom/dof100/morsenotifier/n;

    new-instance v0, Lcom/dof100/morsenotifier/b;

    invoke-direct {v0, p0}, Lcom/dof100/morsenotifier/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/dof100/morsenotifier/ServiceNotifications;->g:Lcom/dof100/morsenotifier/b;

    invoke-direct {p0}, Lcom/dof100/morsenotifier/ServiceNotifications;->a()V

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "LBR_ACTION_RECENTNOTIFICATIONSCHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    invoke-static {p0}, Landroid/support/v4/a/b;->a(Landroid/content/Context;)Landroid/support/v4/a/b;

    move-result-object v1

    iget-object v2, p0, Lcom/dof100/morsenotifier/ServiceNotifications;->h:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/support/v4/a/b;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    const-string v0, "ServiceNotifications.OnDestroy"

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    const-string v0, "ServiceMain.OnDestroy unregistering local BroadcastReceiver"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-static {p0}, Landroid/support/v4/a/b;->a(Landroid/content/Context;)Landroid/support/v4/a/b;

    move-result-object v0

    iget-object v1, p0, Lcom/dof100/morsenotifier/ServiceNotifications;->h:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/a/b;->a(Landroid/content/BroadcastReceiver;)V

    invoke-super {p0}, Landroid/service/notification/NotificationListenerService;->onDestroy()V

    return-void
.end method

.method public onInterruptionFilterChanged(I)V
    .locals 0

    const-string p1, "ServiceNotifications.onInterruptionFilterChanged"

    invoke-static {p0, p1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public onListenerConnected()V
    .locals 1

    const-string v0, "ServiceNotifications.onListenerConnected"

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public onListenerDisconnected()V
    .locals 1

    const-string v0, "ServiceNotifications.onListenerDisconnected"

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public onListenerHintsChanged(I)V
    .locals 0

    const-string p1, "ServiceNotifications.onListenerHintsChanged"

    invoke-static {p0, p1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public onNotificationPosted(Landroid/service/notification/StatusBarNotification;)V
    .locals 13
    .annotation build Landroid/annotation/TargetApi;
        value = 0x13
    .end annotation

    const-string v0, "ServiceNotifications.onNotificationPosted"

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/service/notification/StatusBarNotification;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object v1

    iget-object v2, v1, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    iget-object v2, v1, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x13

    if-lt v4, v5, :cond_3

    iget-object v4, v1, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    if-eqz v4, :cond_2

    const-string v5, "android.title"

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "android.text"

    invoke-virtual {v4, v6}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_1
    move-object v4, v3

    move-object v3, v5

    goto :goto_1

    :cond_2
    const-string v4, "ServiceNotifications.onNotificationPosted Extras=null"

    invoke-static {p0, v4}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    :cond_3
    move-object v4, v3

    :goto_1
    if-nez v0, :cond_4

    const-string v0, ""

    :cond_4
    move-object v7, v0

    if-nez v2, :cond_5

    const-string v2, ""

    :cond_5
    move-object v10, v2

    if-nez v3, :cond_6

    const-string v3, ""

    :cond_6
    move-object v11, v3

    if-nez v4, :cond_7

    const-string v4, ""

    :cond_7
    move-object v12, v4

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ServiceNotifications;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_8

    :try_start_0
    invoke-virtual {v0, v7, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v4

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "ServiceNotifications.onNotificationPosted App Name     = %s"

    new-array v8, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v4}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v0

    aput-object v0, v8, v3

    invoke-static {v5, v6, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    const-string v0, "ServiceNotifications.onNotificationPosted ERROR NameNotFoundException"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    :cond_8
    :goto_2
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "ServiceNotifications.onNotificationPosted Package      = %s"

    new-array v5, v2, [Ljava/lang/Object;

    aput-object v7, v5, v3

    invoke-static {v0, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "ServiceNotifications.onNotificationPosted Ticker       = %s"

    new-array v5, v2, [Ljava/lang/Object;

    aput-object v10, v5, v3

    invoke-static {v0, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "ServiceNotifications.onNotificationPosted Title        = %s"

    new-array v5, v2, [Ljava/lang/Object;

    aput-object v11, v5, v3

    invoke-static {v0, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "ServiceNotifications.onNotificationPosted Text         = %s"

    new-array v5, v2, [Ljava/lang/Object;

    aput-object v12, v5, v3

    invoke-static {v0, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "ServiceNotifications.onNotificationPosted isClearable  = %s"

    new-array v5, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/service/notification/StatusBarNotification;->isClearable()Z

    move-result v6

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    aput-object v6, v5, v3

    invoke-static {v0, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "ServiceNotifications.onNotificationPosted isOngoing    = %s"

    new-array v5, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/service/notification/StatusBarNotification;->isOngoing()Z

    move-result v6

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    aput-object v6, v5, v3

    invoke-static {v0, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "ServiceNotifications.onNotificationPosted flags        = %d"

    new-array v5, v2, [Ljava/lang/Object;

    iget v6, v1, Landroid/app/Notification;->flags:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v3

    invoke-static {v0, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "ServiceNotifications.onNotificationPosted when         = %d"

    new-array v5, v2, [Ljava/lang/Object;

    iget-wide v8, v1, Landroid/app/Notification;->when:J

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v5, v3

    invoke-static {v0, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    const-string v0, ""

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x15

    if-lt v4, v5, :cond_9

    iget-object v0, v1, Landroid/app/Notification;->category:Ljava/lang/String;

    :cond_9
    move-object v9, v0

    iget-object v5, p0, Lcom/dof100/morsenotifier/ServiceNotifications;->f:Lcom/dof100/morsenotifier/n;

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ServiceNotifications;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {p1}, Landroid/service/notification/StatusBarNotification;->getId()I

    move-result v8

    invoke-virtual/range {v5 .. v12}, Lcom/dof100/morsenotifier/n;->a(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/dof100/morsenotifier/m;

    move-result-object p1

    if-nez p1, :cond_a

    const-string p1, "ServiceNotifications.onNotificationPosted duplicate notification found"

    invoke-static {p0, p1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_a
    invoke-direct {p0}, Lcom/dof100/morsenotifier/ServiceNotifications;->a()V

    iget-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceNotifications;->a:Z

    const/4 v1, -0x1

    if-nez v0, :cond_b

    iput v1, p1, Lcom/dof100/morsenotifier/m;->h:I

    return-void

    :cond_b
    iget-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceNotifications;->c:Z

    if-nez v0, :cond_c

    iget-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceNotifications;->e:Z

    if-nez v0, :cond_c

    iget-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceNotifications;->d:Z

    if-nez v0, :cond_c

    iput v1, p1, Lcom/dof100/morsenotifier/m;->h:I

    return-void

    :cond_c
    const/4 v0, -0x2

    iput v0, p1, Lcom/dof100/morsenotifier/m;->h:I

    const/4 v0, 0x0

    :goto_3
    iget-object v1, p0, Lcom/dof100/morsenotifier/ServiceNotifications;->g:Lcom/dof100/morsenotifier/b;

    iget-object v1, v1, Lcom/dof100/morsenotifier/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_f

    const-string v1, "ServiceNotifications.onNotificationPosted for 1"

    invoke-static {v1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/dof100/morsenotifier/ServiceNotifications;->g:Lcom/dof100/morsenotifier/b;

    iget-object v1, v1, Lcom/dof100/morsenotifier/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/dof100/morsenotifier/a;

    invoke-virtual {v1, p1}, Lcom/dof100/morsenotifier/a;->a(Lcom/dof100/morsenotifier/m;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_e

    iput v0, p1, Lcom/dof100/morsenotifier/m;->i:I

    iput-object v1, p1, Lcom/dof100/morsenotifier/m;->j:Ljava/lang/String;

    iget v1, p0, Lcom/dof100/morsenotifier/ServiceNotifications;->b:I

    if-nez v1, :cond_d

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "ServiceNotifications.onNotificationPosted match with filter %d. Announcing right now"

    new-array v5, v2, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v5, v3

    invoke-static {v1, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    iput v2, p1, Lcom/dof100/morsenotifier/m;->h:I

    invoke-direct {p0, p1}, Lcom/dof100/morsenotifier/ServiceNotifications;->a(Lcom/dof100/morsenotifier/m;)V

    return-void

    :cond_d
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "ServiceNotifications.onNotificationPosted match with filter %d. Adding to queue for announcement"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v2, v3

    invoke-static {v1, v4, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    iput v3, p1, Lcom/dof100/morsenotifier/m;->h:I

    iget-object p1, p0, Lcom/dof100/morsenotifier/ServiceNotifications;->i:Landroid/os/Handler;

    iget-object v0, p0, Lcom/dof100/morsenotifier/ServiceNotifications;->j:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/ServiceNotifications;->i:Landroid/os/Handler;

    iget-object v0, p0, Lcom/dof100/morsenotifier/ServiceNotifications;->j:Ljava/lang/Runnable;

    const-wide/16 v1, 0xbb8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_e
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_f
    return-void
.end method

.method public onNotificationRankingUpdate(Landroid/service/notification/NotificationListenerService$RankingMap;)V
    .locals 0

    const-string p1, "ServiceNotifications.onNotificationRankingUpdate"

    invoke-static {p0, p1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public onNotificationRemoved(Landroid/service/notification/StatusBarNotification;)V
    .locals 0

    const-string p1, "ServiceNotifications.onNotificationRemoved"

    invoke-static {p0, p1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method
