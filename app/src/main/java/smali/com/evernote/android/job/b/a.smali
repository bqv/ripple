.class public Lcom/evernote/android/job/b/a;
.super Lcom/evernote/android/job/v14/a;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x13
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "JobProxy19"

    invoke-direct {p0, p1, v0}, Lcom/evernote/android/job/v14/a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/evernote/android/job/m;Landroid/app/AlarmManager;Landroid/app/PendingIntent;)V
    .locals 11

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {p1}, Lcom/evernote/android/job/k$a;->a(Lcom/evernote/android/job/m;)J

    move-result-wide v2

    add-long v6, v0, v2

    invoke-static {p1}, Lcom/evernote/android/job/k$a;->b(Lcom/evernote/android/job/m;)J

    move-result-wide v0

    invoke-static {p1}, Lcom/evernote/android/job/k$a;->a(Lcom/evernote/android/job/m;)J

    move-result-wide v2

    sub-long v8, v0, v2

    const/4 v5, 0x1

    move-object v4, p2

    move-object v10, p3

    invoke-virtual/range {v4 .. v10}, Landroid/app/AlarmManager;->setWindow(IJJLandroid/app/PendingIntent;)V

    iget-object p2, p0, Lcom/evernote/android/job/b/a;->b:Lcom/evernote/android/job/a/d;

    const-string p3, "Schedule alarm, %s, start %s, end %s"

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {p1}, Lcom/evernote/android/job/k$a;->a(Lcom/evernote/android/job/m;)J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/evernote/android/job/a/g;->a(J)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {p1}, Lcom/evernote/android/job/k$a;->b(Lcom/evernote/android/job/m;)J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/evernote/android/job/a/g;->a(J)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x2

    aput-object p1, v0, v1

    invoke-virtual {p2, p3, v0}, Lcom/evernote/android/job/a/d;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method protected c(Lcom/evernote/android/job/m;Landroid/app/AlarmManager;Landroid/app/PendingIntent;)V
    .locals 11

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {p1}, Lcom/evernote/android/job/k$a;->d(Lcom/evernote/android/job/m;)J

    move-result-wide v2

    add-long v6, v0, v2

    invoke-static {p1}, Lcom/evernote/android/job/k$a;->e(Lcom/evernote/android/job/m;)J

    move-result-wide v0

    invoke-static {p1}, Lcom/evernote/android/job/k$a;->d(Lcom/evernote/android/job/m;)J

    move-result-wide v2

    sub-long v8, v0, v2

    const/4 v5, 0x1

    move-object v4, p2

    move-object v10, p3

    invoke-virtual/range {v4 .. v10}, Landroid/app/AlarmManager;->setWindow(IJJLandroid/app/PendingIntent;)V

    iget-object p2, p0, Lcom/evernote/android/job/b/a;->b:Lcom/evernote/android/job/a/d;

    const-string p3, "Scheduled repeating alarm (flex support), %s, start %s, end %s, flex %s"

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {p1}, Lcom/evernote/android/job/k$a;->d(Lcom/evernote/android/job/m;)J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/evernote/android/job/a/g;->a(J)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {p1}, Lcom/evernote/android/job/k$a;->e(Lcom/evernote/android/job/m;)J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/evernote/android/job/a/g;->a(J)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-virtual {p1}, Lcom/evernote/android/job/m;->k()J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/evernote/android/job/a/g;->a(J)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x3

    aput-object p1, v0, v1

    invoke-virtual {p2, p3, v0}, Lcom/evernote/android/job/a/d;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
