.class public Lcom/evernote/android/job/d/a;
.super Lcom/evernote/android/job/c/a;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x1a
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "JobProxy26"

    invoke-direct {p0, p1, v0}, Lcom/evernote/android/job/c/a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/evernote/android/job/m$d;)I
    .locals 2

    sget-object v0, Lcom/evernote/android/job/d/a$1;->a:[I

    invoke-virtual {p1}, Lcom/evernote/android/job/m$d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    invoke-super {p0, p1}, Lcom/evernote/android/job/c/a;->a(Lcom/evernote/android/job/m$d;)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x4

    return p1
.end method

.method protected a(Lcom/evernote/android/job/m;Landroid/app/job/JobInfo$Builder;)Landroid/app/job/JobInfo$Builder;
    .locals 0

    invoke-virtual {p1}, Lcom/evernote/android/job/m;->C()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/app/job/JobInfo$Builder;->setTransientExtras(Landroid/os/Bundle;)Landroid/app/job/JobInfo$Builder;

    move-result-object p1

    return-object p1
.end method

.method protected a(Lcom/evernote/android/job/m;Z)Landroid/app/job/JobInfo$Builder;
    .locals 1

    invoke-super {p0, p1, p2}, Lcom/evernote/android/job/c/a;->a(Lcom/evernote/android/job/m;Z)Landroid/app/job/JobInfo$Builder;

    move-result-object p2

    invoke-virtual {p1}, Lcom/evernote/android/job/m;->o()Z

    move-result v0

    invoke-virtual {p2, v0}, Landroid/app/job/JobInfo$Builder;->setRequiresBatteryNotLow(Z)Landroid/app/job/JobInfo$Builder;

    move-result-object p2

    invoke-virtual {p1}, Lcom/evernote/android/job/m;->p()Z

    move-result p1

    invoke-virtual {p2, p1}, Landroid/app/job/JobInfo$Builder;->setRequiresStorageNotLow(Z)Landroid/app/job/JobInfo$Builder;

    move-result-object p1

    return-object p1
.end method

.method protected a(Landroid/app/job/JobInfo;Lcom/evernote/android/job/m;)Z
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/app/job/JobInfo;->getId()I

    move-result p1

    invoke-virtual {p2}, Lcom/evernote/android/job/m;->c()I

    move-result p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
