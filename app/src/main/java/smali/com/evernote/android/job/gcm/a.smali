.class public Lcom/evernote/android/job/gcm/a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/evernote/android/job/k;


# static fields
.field private static final a:Lcom/evernote/android/job/a/d;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/android/gms/gcm/GcmNetworkManager;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/evernote/android/job/a/d;

    const-string v1, "JobProxyGcm"

    invoke-direct {v0, v1}, Lcom/evernote/android/job/a/d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/evernote/android/job/gcm/a;->a:Lcom/evernote/android/job/a/d;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/evernote/android/job/gcm/a;->b:Landroid/content/Context;

    invoke-static {p1}, Lcom/google/android/gms/gcm/GcmNetworkManager;->getInstance(Landroid/content/Context;)Lcom/google/android/gms/gcm/GcmNetworkManager;

    move-result-object p1

    iput-object p1, p0, Lcom/evernote/android/job/gcm/a;->c:Lcom/google/android/gms/gcm/GcmNetworkManager;

    return-void
.end method

.method private a(Lcom/google/android/gms/gcm/Task;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/evernote/android/job/gcm/a;->c:Lcom/google/android/gms/gcm/GcmNetworkManager;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/gcm/GcmNetworkManager;->schedule(Lcom/google/android/gms/gcm/Task;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "The GcmTaskService class you provided"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/evernote/android/job/l;

    invoke-direct {v0, p1}, Lcom/evernote/android/job/l;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    throw p1
.end method


# virtual methods
.method protected a(Lcom/evernote/android/job/m$d;)I
    .locals 1

    sget-object v0, Lcom/evernote/android/job/gcm/a$1;->a:[I

    invoke-virtual {p1}, Lcom/evernote/android/job/m$d;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "not implemented"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    return v0

    :pswitch_1
    const/4 p1, 0x0

    return p1

    :pswitch_2
    const/4 p1, 0x2

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method protected a(Lcom/google/android/gms/gcm/Task$Builder;Lcom/evernote/android/job/m;)Lcom/google/android/gms/gcm/Task$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/android/gms/gcm/Task$Builder;",
            ">(TT;",
            "Lcom/evernote/android/job/m;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lcom/evernote/android/job/gcm/a;->e(Lcom/evernote/android/job/m;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/gcm/Task$Builder;->setTag(Ljava/lang/String;)Lcom/google/android/gms/gcm/Task$Builder;

    move-result-object v0

    const-class v1, Lcom/evernote/android/job/gcm/PlatformGcmService;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/gcm/Task$Builder;->setService(Ljava/lang/Class;)Lcom/google/android/gms/gcm/Task$Builder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/gcm/Task$Builder;->setUpdateCurrent(Z)Lcom/google/android/gms/gcm/Task$Builder;

    move-result-object v0

    invoke-virtual {p2}, Lcom/evernote/android/job/m;->q()Lcom/evernote/android/job/m$d;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/evernote/android/job/gcm/a;->a(Lcom/evernote/android/job/m$d;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/gcm/Task$Builder;->setRequiredNetwork(I)Lcom/google/android/gms/gcm/Task$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/evernote/android/job/gcm/a;->b:Landroid/content/Context;

    invoke-static {v1}, Lcom/evernote/android/job/a/g;->a(Landroid/content/Context;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/gcm/Task$Builder;->setPersisted(Z)Lcom/google/android/gms/gcm/Task$Builder;

    move-result-object v0

    invoke-virtual {p2}, Lcom/evernote/android/job/m;->m()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/gcm/Task$Builder;->setRequiresCharging(Z)Lcom/google/android/gms/gcm/Task$Builder;

    move-result-object v0

    invoke-virtual {p2}, Lcom/evernote/android/job/m;->C()Landroid/os/Bundle;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/google/android/gms/gcm/Task$Builder;->setExtras(Landroid/os/Bundle;)Lcom/google/android/gms/gcm/Task$Builder;

    return-object p1
.end method

.method public a(I)V
    .locals 2

    iget-object v0, p0, Lcom/evernote/android/job/gcm/a;->c:Lcom/google/android/gms/gcm/GcmNetworkManager;

    invoke-virtual {p0, p1}, Lcom/evernote/android/job/gcm/a;->b(I)Ljava/lang/String;

    move-result-object p1

    const-class v1, Lcom/evernote/android/job/gcm/PlatformGcmService;

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/gcm/GcmNetworkManager;->cancelTask(Ljava/lang/String;Ljava/lang/Class;)V

    return-void
.end method

.method public a(Lcom/evernote/android/job/m;)V
    .locals 12

    invoke-static {p1}, Lcom/evernote/android/job/k$a;->a(Lcom/evernote/android/job/m;)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long v4, v0, v2

    invoke-static {p1}, Lcom/evernote/android/job/k$a;->b(Lcom/evernote/android/job/m;)J

    move-result-wide v6

    div-long v2, v6, v2

    const-wide/16 v8, 0x1

    add-long v10, v4, v8

    invoke-static {v2, v3, v10, v11}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    new-instance v8, Lcom/google/android/gms/gcm/OneoffTask$Builder;

    invoke-direct {v8}, Lcom/google/android/gms/gcm/OneoffTask$Builder;-><init>()V

    invoke-virtual {p0, v8, p1}, Lcom/evernote/android/job/gcm/a;->a(Lcom/google/android/gms/gcm/Task$Builder;Lcom/evernote/android/job/m;)Lcom/google/android/gms/gcm/Task$Builder;

    move-result-object v8

    check-cast v8, Lcom/google/android/gms/gcm/OneoffTask$Builder;

    invoke-virtual {v8, v4, v5, v2, v3}, Lcom/google/android/gms/gcm/OneoffTask$Builder;->setExecutionWindow(JJ)Lcom/google/android/gms/gcm/OneoffTask$Builder;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/gcm/OneoffTask$Builder;->build()Lcom/google/android/gms/gcm/OneoffTask;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/evernote/android/job/gcm/a;->a(Lcom/google/android/gms/gcm/Task;)V

    sget-object v2, Lcom/evernote/android/job/gcm/a;->a:Lcom/evernote/android/job/a/d;

    const-string v3, "Scheduled OneoffTask, %s, start %s, end %s (from now), reschedule count %d"

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    invoke-static {v0, v1}, Lcom/evernote/android/job/a/g;->a(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v4, v1

    invoke-static {v6, v7}, Lcom/evernote/android/job/a/g;->a(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v4, v1

    invoke-static {p1}, Lcom/evernote/android/job/k$a;->g(Lcom/evernote/android/job/m;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x3

    aput-object p1, v4, v0

    invoke-virtual {v2, v3, v4}, Lcom/evernote/android/job/a/d;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method protected b(I)Ljava/lang/String;
    .locals 0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/evernote/android/job/m;)V
    .locals 5

    new-instance v0, Lcom/google/android/gms/gcm/PeriodicTask$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/gcm/PeriodicTask$Builder;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/evernote/android/job/gcm/a;->a(Lcom/google/android/gms/gcm/Task$Builder;Lcom/evernote/android/job/m;)Lcom/google/android/gms/gcm/Task$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/gcm/PeriodicTask$Builder;

    invoke-virtual {p1}, Lcom/evernote/android/job/m;->j()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/gcm/PeriodicTask$Builder;->setPeriod(J)Lcom/google/android/gms/gcm/PeriodicTask$Builder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/evernote/android/job/m;->k()J

    move-result-wide v1

    div-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/gcm/PeriodicTask$Builder;->setFlex(J)Lcom/google/android/gms/gcm/PeriodicTask$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/gcm/PeriodicTask$Builder;->build()Lcom/google/android/gms/gcm/PeriodicTask;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/evernote/android/job/gcm/a;->a(Lcom/google/android/gms/gcm/Task;)V

    sget-object v0, Lcom/evernote/android/job/gcm/a;->a:Lcom/evernote/android/job/a/d;

    const-string v1, "Scheduled PeriodicTask, %s, interval %s, flex %s"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {p1}, Lcom/evernote/android/job/m;->j()J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/evernote/android/job/a/g;->a(J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {p1}, Lcom/evernote/android/job/m;->k()J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/evernote/android/job/a/g;->a(J)Ljava/lang/String;

    move-result-object p1

    const/4 v3, 0x2

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/evernote/android/job/a/d;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public c(Lcom/evernote/android/job/m;)V
    .locals 9

    sget-object v0, Lcom/evernote/android/job/gcm/a;->a:Lcom/evernote/android/job/a/d;

    const-string v1, "plantPeriodicFlexSupport called although flex is supported"

    invoke-virtual {v0, v1}, Lcom/evernote/android/job/a/d;->c(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/evernote/android/job/k$a;->d(Lcom/evernote/android/job/m;)J

    move-result-wide v0

    invoke-static {p1}, Lcom/evernote/android/job/k$a;->e(Lcom/evernote/android/job/m;)J

    move-result-wide v2

    new-instance v4, Lcom/google/android/gms/gcm/OneoffTask$Builder;

    invoke-direct {v4}, Lcom/google/android/gms/gcm/OneoffTask$Builder;-><init>()V

    invoke-virtual {p0, v4, p1}, Lcom/evernote/android/job/gcm/a;->a(Lcom/google/android/gms/gcm/Task$Builder;Lcom/evernote/android/job/m;)Lcom/google/android/gms/gcm/Task$Builder;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/gcm/OneoffTask$Builder;

    const-wide/16 v5, 0x3e8

    div-long v7, v0, v5

    div-long v5, v2, v5

    invoke-virtual {v4, v7, v8, v5, v6}, Lcom/google/android/gms/gcm/OneoffTask$Builder;->setExecutionWindow(JJ)Lcom/google/android/gms/gcm/OneoffTask$Builder;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/gcm/OneoffTask$Builder;->build()Lcom/google/android/gms/gcm/OneoffTask;

    move-result-object v4

    invoke-direct {p0, v4}, Lcom/evernote/android/job/gcm/a;->a(Lcom/google/android/gms/gcm/Task;)V

    sget-object v4, Lcom/evernote/android/job/gcm/a;->a:Lcom/evernote/android/job/a/d;

    const-string v5, "Scheduled periodic (flex support), %s, start %s, end %s, flex %s"

    const/4 v6, 0x4

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object p1, v6, v7

    invoke-static {v0, v1}, Lcom/evernote/android/job/a/g;->a(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v6, v1

    invoke-static {v2, v3}, Lcom/evernote/android/job/a/g;->a(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v6, v1

    invoke-virtual {p1}, Lcom/evernote/android/job/m;->k()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/evernote/android/job/a/g;->a(J)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x3

    aput-object p1, v6, v0

    invoke-virtual {v4, v5, v6}, Lcom/evernote/android/job/a/d;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public d(Lcom/evernote/android/job/m;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method protected e(Lcom/evernote/android/job/m;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Lcom/evernote/android/job/m;->c()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/evernote/android/job/gcm/a;->b(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
