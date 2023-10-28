.class public Lcom/evernote/android/job/c/a;
.super Lcom/evernote/android/job/v21/a;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x18
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "JobProxy24"

    invoke-direct {p0, p1, v0}, Lcom/evernote/android/job/c/a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/evernote/android/job/v21/a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/evernote/android/job/m$d;)I
    .locals 2

    sget-object v0, Lcom/evernote/android/job/c/a$1;->a:[I

    invoke-virtual {p1}, Lcom/evernote/android/job/m$d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    invoke-super {p0, p1}, Lcom/evernote/android/job/v21/a;->a(Lcom/evernote/android/job/m$d;)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x3

    return p1
.end method

.method protected b(Landroid/app/job/JobInfo$Builder;JJ)Landroid/app/job/JobInfo$Builder;
    .locals 0

    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/app/job/JobInfo$Builder;->setPeriodic(JJ)Landroid/app/job/JobInfo$Builder;

    move-result-object p1

    return-object p1
.end method

.method public c(Lcom/evernote/android/job/m;)V
    .locals 2

    iget-object v0, p0, Lcom/evernote/android/job/c/a;->b:Lcom/evernote/android/job/a/d;

    const-string v1, "plantPeriodicFlexSupport called although flex is supported"

    invoke-virtual {v0, v1}, Lcom/evernote/android/job/a/d;->c(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/evernote/android/job/v21/a;->c(Lcom/evernote/android/job/m;)V

    return-void
.end method

.method public d(Lcom/evernote/android/job/m;)Z
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/evernote/android/job/c/a;->a()Landroid/app/job/JobScheduler;

    move-result-object v0

    invoke-virtual {p1}, Lcom/evernote/android/job/m;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/app/job/JobScheduler;->getPendingJob(I)Landroid/app/job/JobInfo;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/evernote/android/job/c/a;->a(Landroid/app/job/JobInfo;Lcom/evernote/android/job/m;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    iget-object v0, p0, Lcom/evernote/android/job/c/a;->b:Lcom/evernote/android/job/a/d;

    invoke-virtual {v0, p1}, Lcom/evernote/android/job/a/d;->a(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return p1
.end method
