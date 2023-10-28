.class public Lcom/evernote/android/job/v21/a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/evernote/android/job/k;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x15
.end annotation


# instance fields
.field protected final a:Landroid/content/Context;

.field protected final b:Lcom/evernote/android/job/a/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "JobProxy21"

    invoke-direct {p0, p1, v0}, Lcom/evernote/android/job/v21/a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/evernote/android/job/v21/a;->a:Landroid/content/Context;

    new-instance p1, Lcom/evernote/android/job/a/d;

    invoke-direct {p1, p2}, Lcom/evernote/android/job/a/d;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/evernote/android/job/v21/a;->b:Lcom/evernote/android/job/a/d;

    return-void
.end method

.method protected static b(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    const-string p0, "success"

    return-object p0

    :cond_0
    const-string p0, "failure"

    return-object p0
.end method


# virtual methods
.method protected final a(Landroid/app/job/JobInfo;)I
    .locals 2

    invoke-virtual {p0}, Lcom/evernote/android/job/v21/a;->a()Landroid/app/job/JobScheduler;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance p1, Lcom/evernote/android/job/l;

    const-string v0, "JobScheduler is null"

    invoke-direct {p1, v0}, Lcom/evernote/android/job/l;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    :try_start_0
    invoke-virtual {v0, p1}, Landroid/app/job/JobScheduler;->schedule(Landroid/app/job/JobInfo;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    iget-object v0, p0, Lcom/evernote/android/job/v21/a;->b:Lcom/evernote/android/job/a/d;

    invoke-virtual {v0, p1}, Lcom/evernote/android/job/a/d;->a(Ljava/lang/Throwable;)V

    new-instance v0, Lcom/evernote/android/job/l;

    invoke-direct {v0, p1}, Lcom/evernote/android/job/l;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p1

    iget-object v0, p0, Lcom/evernote/android/job/v21/a;->b:Lcom/evernote/android/job/a/d;

    invoke-virtual {v0, p1}, Lcom/evernote/android/job/a/d;->a(Ljava/lang/Throwable;)V

    invoke-virtual {p1}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "RECEIVE_BOOT_COMPLETED"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 p1, -0x7b

    return p1

    :cond_1
    if-eqz v0, :cond_2

    const-string v1, "No such service ComponentInfo"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lcom/evernote/android/job/l;

    invoke-direct {v0, p1}, Lcom/evernote/android/job/l;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_2
    throw p1
.end method

.method protected a(Lcom/evernote/android/job/m$d;)I
    .locals 2

    sget-object v0, Lcom/evernote/android/job/v21/a$1;->a:[I

    invoke-virtual {p1}, Lcom/evernote/android/job/m$d;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x2

    const/4 v1, 0x1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "not implemented"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    return v1

    :pswitch_1
    return v0

    :pswitch_2
    return v1

    :pswitch_3
    const/4 p1, 0x0

    return p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected a(Landroid/app/job/JobInfo$Builder;JJ)Landroid/app/job/JobInfo$Builder;
    .locals 0

    invoke-virtual {p1, p2, p3}, Landroid/app/job/JobInfo$Builder;->setMinimumLatency(J)Landroid/app/job/JobInfo$Builder;

    move-result-object p1

    invoke-virtual {p1, p4, p5}, Landroid/app/job/JobInfo$Builder;->setOverrideDeadline(J)Landroid/app/job/JobInfo$Builder;

    move-result-object p1

    return-object p1
.end method

.method protected a(Lcom/evernote/android/job/m;Landroid/app/job/JobInfo$Builder;)Landroid/app/job/JobInfo$Builder;
    .locals 1

    invoke-virtual {p1}, Lcom/evernote/android/job/m;->B()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/evernote/android/job/v21/a;->a:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/evernote/android/job/v21/b;->a(Landroid/content/Context;Lcom/evernote/android/job/m;)V

    :cond_0
    return-object p2
.end method

.method protected a(Lcom/evernote/android/job/m;Z)Landroid/app/job/JobInfo$Builder;
    .locals 5

    new-instance v0, Landroid/app/job/JobInfo$Builder;

    invoke-virtual {p1}, Lcom/evernote/android/job/m;->c()I

    move-result v1

    new-instance v2, Landroid/content/ComponentName;

    iget-object v3, p0, Lcom/evernote/android/job/v21/a;->a:Landroid/content/Context;

    const-class v4, Lcom/evernote/android/job/v21/PlatformJobService;

    invoke-direct {v2, v3, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-direct {v0, v1, v2}, Landroid/app/job/JobInfo$Builder;-><init>(ILandroid/content/ComponentName;)V

    invoke-virtual {p1}, Lcom/evernote/android/job/m;->m()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/app/job/JobInfo$Builder;->setRequiresCharging(Z)Landroid/app/job/JobInfo$Builder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/evernote/android/job/m;->n()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/app/job/JobInfo$Builder;->setRequiresDeviceIdle(Z)Landroid/app/job/JobInfo$Builder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/evernote/android/job/m;->q()Lcom/evernote/android/job/m$d;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/evernote/android/job/v21/a;->a(Lcom/evernote/android/job/m$d;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/app/job/JobInfo$Builder;->setRequiredNetworkType(I)Landroid/app/job/JobInfo$Builder;

    move-result-object v0

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lcom/evernote/android/job/m;->B()Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/evernote/android/job/v21/a;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/evernote/android/job/a/g;->a(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {v0, p2}, Landroid/app/job/JobInfo$Builder;->setPersisted(Z)Landroid/app/job/JobInfo$Builder;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/evernote/android/job/v21/a;->a(Lcom/evernote/android/job/m;Landroid/app/job/JobInfo$Builder;)Landroid/app/job/JobInfo$Builder;

    move-result-object p1

    return-object p1
.end method

.method protected final a()Landroid/app/job/JobScheduler;
    .locals 2

    iget-object v0, p0, Lcom/evernote/android/job/v21/a;->a:Landroid/content/Context;

    const-string v1, "jobscheduler"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/job/JobScheduler;

    return-object v0
.end method

.method public a(I)V
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/evernote/android/job/v21/a;->a()Landroid/app/job/JobScheduler;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/app/job/JobScheduler;->cancel(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/evernote/android/job/v21/a;->b:Lcom/evernote/android/job/a/d;

    invoke-virtual {v1, v0}, Lcom/evernote/android/job/a/d;->a(Ljava/lang/Throwable;)V

    :goto_0
    iget-object v0, p0, Lcom/evernote/android/job/v21/a;->a:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lcom/evernote/android/job/v21/b;->a(Landroid/content/Context;ILandroid/app/PendingIntent;)V

    return-void
.end method

.method public a(Lcom/evernote/android/job/m;)V
    .locals 12

    invoke-static {p1}, Lcom/evernote/android/job/k$a;->a(Lcom/evernote/android/job/m;)J

    move-result-wide v6

    const/4 v8, 0x1

    invoke-static {p1, v8}, Lcom/evernote/android/job/k$a;->a(Lcom/evernote/android/job/m;Z)J

    move-result-wide v9

    invoke-virtual {p0, p1, v8}, Lcom/evernote/android/job/v21/a;->a(Lcom/evernote/android/job/m;Z)Landroid/app/job/JobInfo$Builder;

    move-result-object v1

    move-object v0, p0

    move-wide v2, v6

    move-wide v4, v9

    invoke-virtual/range {v0 .. v5}, Lcom/evernote/android/job/v21/a;->a(Landroid/app/job/JobInfo$Builder;JJ)Landroid/app/job/JobInfo$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/job/JobInfo$Builder;->build()Landroid/app/job/JobInfo;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/evernote/android/job/v21/a;->a(Landroid/app/job/JobInfo;)I

    move-result v0

    const/4 v11, 0x0

    const/16 v1, -0x7b

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, p1, v11}, Lcom/evernote/android/job/v21/a;->a(Lcom/evernote/android/job/m;Z)Landroid/app/job/JobInfo$Builder;

    move-result-object v1

    move-object v0, p0

    move-wide v2, v6

    move-wide v4, v9

    invoke-virtual/range {v0 .. v5}, Lcom/evernote/android/job/v21/a;->a(Landroid/app/job/JobInfo$Builder;JJ)Landroid/app/job/JobInfo$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/job/JobInfo$Builder;->build()Landroid/app/job/JobInfo;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/evernote/android/job/v21/a;->a(Landroid/app/job/JobInfo;)I

    move-result v0

    :cond_0
    iget-object v1, p0, Lcom/evernote/android/job/v21/a;->b:Lcom/evernote/android/job/a/d;

    const-string v2, "Schedule one-off jobInfo %s, %s, start %s, end %s (from now), reschedule count %d"

    const/4 v3, 0x5

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0}, Lcom/evernote/android/job/v21/a;->b(I)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v11

    aput-object p1, v3, v8

    const/4 v0, 0x2

    invoke-static {v6, v7}, Lcom/evernote/android/job/a/g;->a(J)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v0

    const/4 v0, 0x3

    invoke-static {p1, v11}, Lcom/evernote/android/job/k$a;->a(Lcom/evernote/android/job/m;Z)J

    move-result-wide v4

    invoke-static {v4, v5}, Lcom/evernote/android/job/a/g;->a(J)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v0

    const/4 v0, 0x4

    invoke-static {p1}, Lcom/evernote/android/job/k$a;->g(Lcom/evernote/android/job/m;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v3, v0

    invoke-virtual {v1, v2, v3}, Lcom/evernote/android/job/a/d;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method protected a(Landroid/app/job/JobInfo;Lcom/evernote/android/job/m;)Z
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/app/job/JobInfo;->getId()I

    move-result p1

    invoke-virtual {p2}, Lcom/evernote/android/job/m;->c()I

    move-result v2

    if-ne p1, v2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p2}, Lcom/evernote/android/job/m;->B()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/evernote/android/job/v21/a;->a:Landroid/content/Context;

    invoke-virtual {p2}, Lcom/evernote/android/job/m;->c()I

    move-result p2

    invoke-static {p1, p2}, Lcom/evernote/android/job/v21/b;->a(Landroid/content/Context;I)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    const/4 v0, 0x0

    :cond_3
    return v0
.end method

.method protected b(Landroid/app/job/JobInfo$Builder;JJ)Landroid/app/job/JobInfo$Builder;
    .locals 0

    invoke-virtual {p1, p2, p3}, Landroid/app/job/JobInfo$Builder;->setPeriodic(J)Landroid/app/job/JobInfo$Builder;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/evernote/android/job/m;)V
    .locals 12

    invoke-virtual {p1}, Lcom/evernote/android/job/m;->j()J

    move-result-wide v6

    invoke-virtual {p1}, Lcom/evernote/android/job/m;->k()J

    move-result-wide v8

    const/4 v10, 0x1

    invoke-virtual {p0, p1, v10}, Lcom/evernote/android/job/v21/a;->a(Lcom/evernote/android/job/m;Z)Landroid/app/job/JobInfo$Builder;

    move-result-object v1

    move-object v0, p0

    move-wide v2, v6

    move-wide v4, v8

    invoke-virtual/range {v0 .. v5}, Lcom/evernote/android/job/v21/a;->b(Landroid/app/job/JobInfo$Builder;JJ)Landroid/app/job/JobInfo$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/job/JobInfo$Builder;->build()Landroid/app/job/JobInfo;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/evernote/android/job/v21/a;->a(Landroid/app/job/JobInfo;)I

    move-result v0

    const/4 v11, 0x0

    const/16 v1, -0x7b

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, p1, v11}, Lcom/evernote/android/job/v21/a;->a(Lcom/evernote/android/job/m;Z)Landroid/app/job/JobInfo$Builder;

    move-result-object v1

    move-object v0, p0

    move-wide v2, v6

    move-wide v4, v8

    invoke-virtual/range {v0 .. v5}, Lcom/evernote/android/job/v21/a;->b(Landroid/app/job/JobInfo$Builder;JJ)Landroid/app/job/JobInfo$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/job/JobInfo$Builder;->build()Landroid/app/job/JobInfo;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/evernote/android/job/v21/a;->a(Landroid/app/job/JobInfo;)I

    move-result v0

    :cond_0
    iget-object v1, p0, Lcom/evernote/android/job/v21/a;->b:Lcom/evernote/android/job/a/d;

    const-string v2, "Schedule periodic jobInfo %s, %s, interval %s, flex %s"

    const/4 v3, 0x4

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0}, Lcom/evernote/android/job/v21/a;->b(I)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v11

    aput-object p1, v3, v10

    const/4 p1, 0x2

    invoke-static {v6, v7}, Lcom/evernote/android/job/a/g;->a(J)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, p1

    const/4 p1, 0x3

    invoke-static {v8, v9}, Lcom/evernote/android/job/a/g;->a(J)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, p1

    invoke-virtual {v1, v2, v3}, Lcom/evernote/android/job/a/d;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public c(Lcom/evernote/android/job/m;)V
    .locals 12

    invoke-static {p1}, Lcom/evernote/android/job/k$a;->d(Lcom/evernote/android/job/m;)J

    move-result-wide v6

    invoke-static {p1}, Lcom/evernote/android/job/k$a;->e(Lcom/evernote/android/job/m;)J

    move-result-wide v8

    const/4 v10, 0x1

    invoke-virtual {p0, p1, v10}, Lcom/evernote/android/job/v21/a;->a(Lcom/evernote/android/job/m;Z)Landroid/app/job/JobInfo$Builder;

    move-result-object v1

    move-object v0, p0

    move-wide v2, v6

    move-wide v4, v8

    invoke-virtual/range {v0 .. v5}, Lcom/evernote/android/job/v21/a;->a(Landroid/app/job/JobInfo$Builder;JJ)Landroid/app/job/JobInfo$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/job/JobInfo$Builder;->build()Landroid/app/job/JobInfo;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/evernote/android/job/v21/a;->a(Landroid/app/job/JobInfo;)I

    move-result v0

    const/4 v11, 0x0

    const/16 v1, -0x7b

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, p1, v11}, Lcom/evernote/android/job/v21/a;->a(Lcom/evernote/android/job/m;Z)Landroid/app/job/JobInfo$Builder;

    move-result-object v1

    move-object v0, p0

    move-wide v2, v6

    move-wide v4, v8

    invoke-virtual/range {v0 .. v5}, Lcom/evernote/android/job/v21/a;->a(Landroid/app/job/JobInfo$Builder;JJ)Landroid/app/job/JobInfo$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/job/JobInfo$Builder;->build()Landroid/app/job/JobInfo;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/evernote/android/job/v21/a;->a(Landroid/app/job/JobInfo;)I

    move-result v0

    :cond_0
    iget-object v1, p0, Lcom/evernote/android/job/v21/a;->b:Lcom/evernote/android/job/a/d;

    const-string v2, "Schedule periodic (flex support) jobInfo %s, %s, start %s, end %s, flex %s"

    const/4 v3, 0x5

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0}, Lcom/evernote/android/job/v21/a;->b(I)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v11

    aput-object p1, v3, v10

    const/4 v0, 0x2

    invoke-static {v6, v7}, Lcom/evernote/android/job/a/g;->a(J)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v0

    const/4 v0, 0x3

    invoke-static {v8, v9}, Lcom/evernote/android/job/a/g;->a(J)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v0

    const/4 v0, 0x4

    invoke-virtual {p1}, Lcom/evernote/android/job/m;->k()J

    move-result-wide v4

    invoke-static {v4, v5}, Lcom/evernote/android/job/a/g;->a(J)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v3, v0

    invoke-virtual {v1, v2, v3}, Lcom/evernote/android/job/a/d;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public d(Lcom/evernote/android/job/m;)Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Lcom/evernote/android/job/v21/a;->a()Landroid/app/job/JobScheduler;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/job/JobScheduler;->getAllPendingJobs()Ljava/util/List;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    return v0

    :cond_0
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/job/JobInfo;

    invoke-virtual {p0, v2, p1}, Lcom/evernote/android/job/v21/a;->a(Landroid/app/job/JobInfo;Lcom/evernote/android/job/m;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_2
    return v0

    :catch_0
    move-exception p1

    iget-object v1, p0, Lcom/evernote/android/job/v21/a;->b:Lcom/evernote/android/job/a/d;

    invoke-virtual {v1, p1}, Lcom/evernote/android/job/a/d;->a(Ljava/lang/Throwable;)V

    return v0
.end method
