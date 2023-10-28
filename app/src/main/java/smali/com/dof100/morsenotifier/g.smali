.class Lcom/dof100/morsenotifier/g;
.super Lcom/evernote/android/job/c;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/evernote/android/job/c;-><init>()V

    return-void
.end method

.method public static a()V
    .locals 17

    const-string v0, "MyJob.scheduleNextChime"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-static {}, Lcom/evernote/android/job/i;->a()Lcom/evernote/android/job/i;

    move-result-object v0

    const-string v1, "MyJob.scheduleNextChime List of existing Job Requests: "

    invoke-static {v1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/evernote/android/job/i;->b()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/evernote/android/job/m;

    new-instance v7, Ljava/util/Date;

    invoke-virtual {v1}, Lcom/evernote/android/job/m;->x()J

    move-result-wide v8

    invoke-direct {v7, v8, v9}, Ljava/util/Date;-><init>(J)V

    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v9, "   MyJob.scheduleNextChime Job tag=%15s id=%d t=%s start=%d min"

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/evernote/android/job/m;->d()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v4, v6

    invoke-virtual {v1}, Lcom/evernote/android/job/m;->c()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-virtual {v7}, Ljava/util/Date;->toString()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v3

    invoke-virtual {v1}, Lcom/evernote/android/job/m;->e()J

    move-result-wide v5

    const-wide/16 v10, 0x3e8

    div-long/2addr v5, v10

    const-wide/16 v10, 0x3c

    div-long/2addr v5, v10

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    aput-object v1, v4, v2

    invoke-static {v8, v9, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    const/16 v7, 0xc

    invoke-virtual {v0, v7}, Ljava/util/Calendar;->get(I)I

    move-result v7

    const/16 v8, 0xd

    invoke-virtual {v0, v8}, Ljava/util/Calendar;->get(I)I

    move-result v0

    rsub-int/lit8 v8, v0, 0x3c

    rsub-int/lit8 v9, v7, 0x3c

    sub-int/2addr v9, v5

    add-int/lit8 v10, v1, 0x1

    rem-int/lit8 v10, v10, 0x18

    sget-object v11, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    int-to-long v12, v8

    invoke-virtual {v11, v12, v13}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v11

    sget-object v13, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    int-to-long v14, v9

    invoke-virtual {v13, v14, v15}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v13

    add-long v15, v11, v13

    sget-object v11, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    int-to-long v12, v6

    invoke-virtual {v11, v12, v13}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v11

    add-long v13, v15, v11

    sget-object v11, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v12, "MyJob.scheduleNextChime  time=%02d:%02d:%02d   Next chime at %02d:%02d:%02d,  which is %02d:%02d:%02d from now"

    const/16 v15, 0x9

    new-array v15, v15, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v15, v6

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v15, v5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v15, v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v15, v2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v15, v4

    const/4 v0, 0x5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v15, v0

    const/4 v0, 0x6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v15, v0

    const/4 v0, 0x7

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v15, v0

    const/16 v0, 0x8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v15, v0

    invoke-static {v11, v12, v15}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    new-instance v0, Lcom/evernote/android/job/a/a/b;

    invoke-direct {v0}, Lcom/evernote/android/job/a/a/b;-><init>()V

    const-string v1, "EXTRASWHAT"

    invoke-virtual {v0, v1, v5}, Lcom/evernote/android/job/a/a/b;->a(Ljava/lang/String;I)V

    const-string v1, "EXTRASHOUR"

    invoke-virtual {v0, v1, v10}, Lcom/evernote/android/job/a/a/b;->a(Ljava/lang/String;I)V

    const-string v1, "EXTRASMIN"

    invoke-virtual {v0, v1, v6}, Lcom/evernote/android/job/a/a/b;->a(Ljava/lang/String;I)V

    new-instance v1, Lcom/evernote/android/job/m$b;

    const-string v2, "TAG_CHIME"

    invoke-direct {v1, v2}, Lcom/evernote/android/job/m$b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v13, v14}, Lcom/evernote/android/job/m$b;->a(J)Lcom/evernote/android/job/m$b;

    move-result-object v1

    invoke-virtual {v1, v5}, Lcom/evernote/android/job/m$b;->b(Z)Lcom/evernote/android/job/m$b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/evernote/android/job/m$b;->a(Lcom/evernote/android/job/a/a/b;)Lcom/evernote/android/job/m$b;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/evernote/android/job/m$b;->a(Z)Lcom/evernote/android/job/m$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/evernote/android/job/m$b;->a()Lcom/evernote/android/job/m;

    move-result-object v0

    invoke-virtual {v0}, Lcom/evernote/android/job/m;->D()I

    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 11

    sget-boolean v0, Lcom/dof100/morsenotifier/App;->b:Z

    if-nez v0, :cond_0

    const-string p0, "MyJob.scheduleNextReminder App!=pro exiting..."

    invoke-static {p0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "MyJob.scheduleNextReminder"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-static {}, Lcom/evernote/android/job/i;->a()Lcom/evernote/android/job/i;

    move-result-object v0

    const-string v1, "MyJob.scheduleNextReminder List of existing job requests: "

    invoke-static {v1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/evernote/android/job/i;->b()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/evernote/android/job/m;

    new-instance v5, Ljava/util/Date;

    invoke-virtual {v1}, Lcom/evernote/android/job/m;->x()J

    move-result-wide v6

    invoke-direct {v5, v6, v7}, Ljava/util/Date;-><init>(J)V

    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v7, "   MyJob.scheduleNextReminder Job tag=%15s id=%d t=%s start=%d min"

    const/4 v8, 0x4

    new-array v8, v8, [Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/evernote/android/job/m;->d()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v8, v4

    invoke-virtual {v1}, Lcom/evernote/android/job/m;->c()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v8, v3

    invoke-virtual {v5}, Ljava/util/Date;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v8, v2

    const/4 v2, 0x3

    invoke-virtual {v1}, Lcom/evernote/android/job/m;->e()J

    move-result-wide v3

    const-wide/16 v9, 0x3e8

    div-long/2addr v3, v9

    const-wide/16 v9, 0x3c

    div-long/2addr v3, v9

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    aput-object v1, v8, v2

    invoke-static {v6, v7, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/dof100/morsenotifier/q;

    invoke-direct {v0, p0}, Lcom/dof100/morsenotifier/q;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/dof100/morsenotifier/q;->a()Lcom/dof100/morsenotifier/p;

    move-result-object p0

    if-nez p0, :cond_2

    return-void

    :cond_2
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "MyJob.scheduleNextReminder Next reminder %s"

    new-array v5, v3, [Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/p;->c()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v4

    invoke-static {v0, v1, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    new-instance v0, Lcom/evernote/android/job/a/a/b;

    invoke-direct {v0}, Lcom/evernote/android/job/a/a/b;-><init>()V

    const-string v1, "EXTRASWHAT"

    invoke-virtual {v0, v1, v2}, Lcom/evernote/android/job/a/a/b;->a(Ljava/lang/String;I)V

    const-string v1, "EXTRASHOUR"

    iget v2, p0, Lcom/dof100/morsenotifier/p;->a:I

    invoke-virtual {v0, v1, v2}, Lcom/evernote/android/job/a/a/b;->a(Ljava/lang/String;I)V

    const-string v1, "EXTRASMIN"

    iget v2, p0, Lcom/dof100/morsenotifier/p;->b:I

    invoke-virtual {v0, v1, v2}, Lcom/evernote/android/job/a/a/b;->a(Ljava/lang/String;I)V

    const-string v1, "EXTRASTEXT"

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/p;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/evernote/android/job/a/a/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lcom/evernote/android/job/m$b;

    const-string v2, "TAG_REMINDER"

    invoke-direct {v1, v2}, Lcom/evernote/android/job/m$b;-><init>(Ljava/lang/String;)V

    iget-wide v5, p0, Lcom/dof100/morsenotifier/p;->g:J

    invoke-virtual {v1, v5, v6}, Lcom/evernote/android/job/m$b;->a(J)Lcom/evernote/android/job/m$b;

    move-result-object p0

    invoke-virtual {p0, v3}, Lcom/evernote/android/job/m$b;->b(Z)Lcom/evernote/android/job/m$b;

    move-result-object p0

    invoke-virtual {p0, v0}, Lcom/evernote/android/job/m$b;->a(Lcom/evernote/android/job/a/a/b;)Lcom/evernote/android/job/m$b;

    move-result-object p0

    invoke-virtual {p0, v4}, Lcom/evernote/android/job/m$b;->a(Z)Lcom/evernote/android/job/m$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/evernote/android/job/m$b;->a()Lcom/evernote/android/job/m;

    move-result-object p0

    invoke-virtual {p0}, Lcom/evernote/android/job/m;->D()I

    return-void
.end method

.method public static b()V
    .locals 16

    const-string v0, "MyJob.clearAllJobs"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-static {}, Lcom/evernote/android/job/i;->a()Lcom/evernote/android/job/i;

    move-result-object v0

    const-string v1, "MyJob.clearAllJobs List of existing job requests before clear: "

    invoke-static {v1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/evernote/android/job/i;->b()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-wide/16 v3, 0x3c

    const-wide/16 v5, 0x3e8

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x4

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/evernote/android/job/m;

    new-instance v12, Ljava/util/Date;

    invoke-virtual {v2}, Lcom/evernote/android/job/m;->x()J

    move-result-wide v13

    invoke-direct {v12, v13, v14}, Ljava/util/Date;-><init>(J)V

    sget-object v13, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v14, "   MyJob.clearAllJobs Job tag=%15s id=%d t=%s start=%d min"

    new-array v11, v11, [Ljava/lang/Object;

    invoke-virtual {v2}, Lcom/evernote/android/job/m;->d()Ljava/lang/String;

    move-result-object v15

    aput-object v15, v11, v10

    invoke-virtual {v2}, Lcom/evernote/android/job/m;->c()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v11, v9

    invoke-virtual {v12}, Ljava/util/Date;->toString()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v11, v8

    invoke-virtual {v2}, Lcom/evernote/android/job/m;->e()J

    move-result-wide v8

    div-long/2addr v8, v5

    div-long/2addr v8, v3

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v11, v7

    invoke-static {v13, v14, v11}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/evernote/android/job/i;->d()I

    const-string v1, "MyJob.clearAllJobs List of existing job requests after clear: "

    invoke-static {v1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/evernote/android/job/i;->b()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/evernote/android/job/m;

    new-instance v2, Ljava/util/Date;

    invoke-virtual {v1}, Lcom/evernote/android/job/m;->x()J

    move-result-wide v12

    invoke-direct {v2, v12, v13}, Ljava/util/Date;-><init>(J)V

    sget-object v12, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v13, "   MyJob.clearAllJobs Job tag=%15s id=%d t=%s start=%d min"

    new-array v14, v11, [Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/evernote/android/job/m;->d()Ljava/lang/String;

    move-result-object v15

    aput-object v15, v14, v10

    invoke-virtual {v1}, Lcom/evernote/android/job/m;->c()I

    move-result v15

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    aput-object v15, v14, v9

    invoke-virtual {v2}, Ljava/util/Date;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v14, v8

    invoke-virtual {v1}, Lcom/evernote/android/job/m;->e()J

    move-result-wide v1

    div-long/2addr v1, v5

    div-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    aput-object v1, v14, v7

    invoke-static {v12, v13, v14}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    return-void
.end method


# virtual methods
.method protected a(Lcom/evernote/android/job/c$a;)Lcom/evernote/android/job/c$b;
    .locals 12

    const-string v0, "MyJob.onRunJob"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/evernote/android/job/c$a;->d()Lcom/evernote/android/job/a/a/b;

    move-result-object p1

    const-string v0, "EXTRASHOUR"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Lcom/evernote/android/job/a/a/b;->b(Ljava/lang/String;I)I

    move-result v0

    const-string v2, "EXTRASMIN"

    invoke-virtual {p1, v2, v1}, Lcom/evernote/android/job/a/a/b;->b(Ljava/lang/String;I)I

    move-result v2

    const-string v3, "EXTRASWHAT"

    invoke-virtual {p1, v3, v1}, Lcom/evernote/android/job/a/a/b;->b(Ljava/lang/String;I)I

    move-result v1

    const-string v3, "EXTRASTEXT"

    const-string v4, ""

    invoke-virtual {p1, v3, v4}, Lcom/evernote/android/job/a/a/b;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/g;->k()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v10

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/g;->k()Landroid/content/Context;

    move-result-object v4

    const-string v6, "pref_chime_enable"

    sget-boolean v5, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v5, :cond_0

    const-string v5, "_morsedef"

    :goto_0
    move-object v8, v5

    goto :goto_1

    :cond_0
    const-string v5, "_voicedef"

    goto :goto_0

    :goto_1
    const-string v9, "_def"

    const/4 v7, 0x0

    move-object v5, v10

    invoke-static/range {v4 .. v9}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v11

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/g;->k()Landroid/content/Context;

    move-result-object v4

    const-string v6, "pref_reminders_enable"

    sget-boolean v5, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v5, :cond_1

    const-string v5, "_morsedef"

    :goto_2
    move-object v8, v5

    goto :goto_3

    :cond_1
    const-string v5, "_voicedef"

    goto :goto_2

    :goto_3
    const-string v9, "_def"

    move-object v5, v10

    invoke-static/range {v4 .. v9}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "MyJob.onRunJob  Time: %02d:%02d  What:%d"

    const/4 v7, 0x3

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v7, v8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/4 v9, 0x1

    aput-object v8, v7, v9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/4 v10, 0x2

    aput-object v8, v7, v10

    invoke-static {v5, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const v5, 0x7f0c000a

    const v6, 0x7f0c0009

    const v7, 0x7f0c0024

    if-ne v1, v9, :cond_2

    if-eqz v11, :cond_2

    const-string p1, "MyJob.onRunJob chime..."

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/g;->k()Landroid/content/Context;

    move-result-object v1

    const-class v4, Lcom/dof100/morsenotifier/ServiceMain;

    invoke-direct {p1, v1, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/g;->k()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/g;->k()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v7, 0x7f0c0007

    invoke-virtual {v4, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/g;->k()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/g;->k()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/g;->k()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_4

    :cond_2
    if-ne v1, v10, :cond_3

    if-eqz v4, :cond_3

    const-string v1, "MyJob.onRunJob reminder..."

    invoke-static {v1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    new-instance v1, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/g;->k()Landroid/content/Context;

    move-result-object v4

    const-class v8, Lcom/dof100/morsenotifier/ServiceMain;

    invoke-direct {v1, v4, v8}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/g;->k()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/g;->k()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f0c0015

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v4, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/g;->k()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v7, 0x7f0c000b

    invoke-virtual {v4, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/g;->k()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/g;->k()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/g;->k()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :cond_3
    :goto_4
    :try_start_0
    sget-object p1, Lcom/evernote/android/job/c$b;->a:Lcom/evernote/android/job/c$b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lcom/dof100/morsenotifier/g;->a()V

    invoke-static {v3}, Lcom/dof100/morsenotifier/g;->a(Landroid/content/Context;)V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-static {}, Lcom/dof100/morsenotifier/g;->a()V

    invoke-static {v3}, Lcom/dof100/morsenotifier/g;->a(Landroid/content/Context;)V

    throw p1
.end method
