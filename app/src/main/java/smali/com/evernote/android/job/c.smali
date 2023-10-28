.class public abstract Lcom/evernote/android/job/c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/evernote/android/job/c$a;,
        Lcom/evernote/android/job/c$b;
    }
.end annotation


# static fields
.field private static final a:Lcom/evernote/android/job/a/d;


# instance fields
.field private b:Lcom/evernote/android/job/c$a;

.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private d:Landroid/content/Context;

.field private volatile e:Z

.field private volatile f:Z

.field private volatile g:J

.field private h:Lcom/evernote/android/job/c$b;

.field private final i:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/evernote/android/job/a/d;

    const-string v1, "Job"

    invoke-direct {v0, v1}, Lcom/evernote/android/job/a/d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/evernote/android/job/c;->a:Lcom/evernote/android/job/a/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/evernote/android/job/c;->g:J

    sget-object v0, Lcom/evernote/android/job/c$b;->b:Lcom/evernote/android/job/c$b;

    iput-object v0, p0, Lcom/evernote/android/job/c;->h:Lcom/evernote/android/job/c$b;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/evernote/android/job/c;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method protected abstract a(Lcom/evernote/android/job/c$a;)Lcom/evernote/android/job/c$b;
.end method

.method final a(Lcom/evernote/android/job/m;Landroid/os/Bundle;)Lcom/evernote/android/job/c;
    .locals 2

    new-instance v0, Lcom/evernote/android/job/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/evernote/android/job/c$a;-><init>(Lcom/evernote/android/job/m;Landroid/os/Bundle;Lcom/evernote/android/job/c$1;)V

    iput-object v0, p0, Lcom/evernote/android/job/c;->b:Lcom/evernote/android/job/c$a;

    return-object p0
.end method

.method protected a(I)V
    .locals 0

    return-void
.end method

.method a(Z)Z
    .locals 5

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/evernote/android/job/c;->j()Lcom/evernote/android/job/c$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/evernote/android/job/c$a;->e()Lcom/evernote/android/job/m;

    move-result-object p1

    invoke-virtual {p1}, Lcom/evernote/android/job/m;->l()Z

    move-result p1

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/evernote/android/job/c;->e()Z

    move-result p1

    const/4 v1, 0x0

    if-nez p1, :cond_1

    sget-object p1, Lcom/evernote/android/job/c;->a:Lcom/evernote/android/job/a/d;

    const-string v0, "Job requires charging, reschedule"

    invoke-virtual {p1, v0}, Lcom/evernote/android/job/a/d;->c(Ljava/lang/String;)V

    return v1

    :cond_1
    invoke-virtual {p0}, Lcom/evernote/android/job/c;->f()Z

    move-result p1

    if-nez p1, :cond_2

    sget-object p1, Lcom/evernote/android/job/c;->a:Lcom/evernote/android/job/a/d;

    const-string v0, "Job requires device to be idle, reschedule"

    invoke-virtual {p1, v0}, Lcom/evernote/android/job/a/d;->c(Ljava/lang/String;)V

    return v1

    :cond_2
    invoke-virtual {p0}, Lcom/evernote/android/job/c;->i()Z

    move-result p1

    if-nez p1, :cond_3

    sget-object p1, Lcom/evernote/android/job/c;->a:Lcom/evernote/android/job/a/d;

    const-string v2, "Job requires network to be %s, but was %s"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/evernote/android/job/c;->j()Lcom/evernote/android/job/c$a;

    move-result-object v4

    invoke-virtual {v4}, Lcom/evernote/android/job/c$a;->e()Lcom/evernote/android/job/m;

    move-result-object v4

    invoke-virtual {v4}, Lcom/evernote/android/job/m;->q()Lcom/evernote/android/job/m$d;

    move-result-object v4

    aput-object v4, v3, v1

    invoke-virtual {p0}, Lcom/evernote/android/job/c;->k()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lcom/evernote/android/job/a/c;->c(Landroid/content/Context;)Lcom/evernote/android/job/m$d;

    move-result-object v4

    aput-object v4, v3, v0

    invoke-virtual {p1, v2, v3}, Lcom/evernote/android/job/a/d;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    return v1

    :cond_3
    invoke-virtual {p0}, Lcom/evernote/android/job/c;->g()Z

    move-result p1

    if-nez p1, :cond_4

    sget-object p1, Lcom/evernote/android/job/c;->a:Lcom/evernote/android/job/a/d;

    const-string v0, "Job requires battery not be low, reschedule"

    invoke-virtual {p1, v0}, Lcom/evernote/android/job/a/d;->c(Ljava/lang/String;)V

    return v1

    :cond_4
    invoke-virtual {p0}, Lcom/evernote/android/job/c;->h()Z

    move-result p1

    if-nez p1, :cond_5

    sget-object p1, Lcom/evernote/android/job/c;->a:Lcom/evernote/android/job/a/d;

    const-string v0, "Job requires storage not be low, reschedule"

    invoke-virtual {p1, v0}, Lcom/evernote/android/job/a/d;->c(Ljava/lang/String;)V

    return v1

    :cond_5
    return v0
.end method

.method final b(Landroid/content/Context;)Lcom/evernote/android/job/c;
    .locals 1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/evernote/android/job/c;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/evernote/android/job/c;->d:Landroid/content/Context;

    return-object p0
.end method

.method final b(Z)Z
    .locals 3

    iget-object v0, p0, Lcom/evernote/android/job/c;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lcom/evernote/android/job/c;->m()Z

    move-result v1

    if-nez v1, :cond_1

    iget-boolean v1, p0, Lcom/evernote/android/job/c;->e:Z

    const/4 v2, 0x1

    if-nez v1, :cond_0

    iput-boolean v2, p0, Lcom/evernote/android/job/c;->e:Z

    invoke-virtual {p0}, Lcom/evernote/android/job/c;->c()V

    :cond_0
    iget-boolean v1, p0, Lcom/evernote/android/job/c;->f:Z

    or-int/2addr p1, v1

    iput-boolean p1, p0, Lcom/evernote/android/job/c;->f:Z

    monitor-exit v0

    return v2

    :cond_1
    const/4 p1, 0x0

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method protected c()V
    .locals 0

    return-void
.end method

.method final d()Lcom/evernote/android/job/c$b;
    .locals 3

    :try_start_0
    instance-of v0, p0, Lcom/evernote/android/job/a;

    if-nez v0, :cond_2

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/evernote/android/job/c;->a(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lcom/evernote/android/job/c;->j()Lcom/evernote/android/job/c$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/evernote/android/job/c$a;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/evernote/android/job/c$b;->b:Lcom/evernote/android/job/c$b;

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/evernote/android/job/c$b;->c:Lcom/evernote/android/job/c$b;

    :goto_0
    iput-object v0, p0, Lcom/evernote/android/job/c;->h:Lcom/evernote/android/job/c$b;

    goto :goto_2

    :cond_2
    :goto_1
    invoke-virtual {p0}, Lcom/evernote/android/job/c;->j()Lcom/evernote/android/job/c$a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/evernote/android/job/c;->a(Lcom/evernote/android/job/c$a;)Lcom/evernote/android/job/c$b;

    move-result-object v0

    goto :goto_0

    :goto_2
    iget-object v0, p0, Lcom/evernote/android/job/c;->h:Lcom/evernote/android/job/c$b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/evernote/android/job/c;->g:J

    return-object v0

    :catchall_0
    move-exception v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/evernote/android/job/c;->g:J

    throw v0
.end method

.method protected e()Z
    .locals 1

    invoke-virtual {p0}, Lcom/evernote/android/job/c;->j()Lcom/evernote/android/job/c$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/evernote/android/job/c$a;->e()Lcom/evernote/android/job/m;

    move-result-object v0

    invoke-virtual {v0}, Lcom/evernote/android/job/m;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/evernote/android/job/c;->k()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/evernote/android/job/a/c;->a(Landroid/content/Context;)Lcom/evernote/android/job/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/evernote/android/job/a/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/evernote/android/job/c;

    iget-object v0, p0, Lcom/evernote/android/job/c;->b:Lcom/evernote/android/job/c$a;

    iget-object p1, p1, Lcom/evernote/android/job/c;->b:Lcom/evernote/android/job/c$a;

    invoke-virtual {v0, p1}, Lcom/evernote/android/job/c$a;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method protected f()Z
    .locals 1

    invoke-virtual {p0}, Lcom/evernote/android/job/c;->j()Lcom/evernote/android/job/c$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/evernote/android/job/c$a;->e()Lcom/evernote/android/job/m;

    move-result-object v0

    invoke-virtual {v0}, Lcom/evernote/android/job/m;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/evernote/android/job/c;->k()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/evernote/android/job/a/c;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method protected g()Z
    .locals 1

    invoke-virtual {p0}, Lcom/evernote/android/job/c;->j()Lcom/evernote/android/job/c$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/evernote/android/job/c$a;->e()Lcom/evernote/android/job/m;

    move-result-object v0

    invoke-virtual {v0}, Lcom/evernote/android/job/m;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/evernote/android/job/c;->k()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/evernote/android/job/a/c;->a(Landroid/content/Context;)Lcom/evernote/android/job/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/evernote/android/job/a/a;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method protected h()Z
    .locals 1

    invoke-virtual {p0}, Lcom/evernote/android/job/c;->j()Lcom/evernote/android/job/c$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/evernote/android/job/c$a;->e()Lcom/evernote/android/job/m;

    move-result-object v0

    invoke-virtual {v0}, Lcom/evernote/android/job/m;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/evernote/android/job/a/c;->a()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/evernote/android/job/c;->b:Lcom/evernote/android/job/c$a;

    invoke-virtual {v0}, Lcom/evernote/android/job/c$a;->hashCode()I

    move-result v0

    return v0
.end method

.method protected i()Z
    .locals 4

    invoke-virtual {p0}, Lcom/evernote/android/job/c;->j()Lcom/evernote/android/job/c$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/evernote/android/job/c$a;->e()Lcom/evernote/android/job/m;

    move-result-object v0

    invoke-virtual {v0}, Lcom/evernote/android/job/m;->q()Lcom/evernote/android/job/m$d;

    move-result-object v0

    sget-object v1, Lcom/evernote/android/job/m$d;->a:Lcom/evernote/android/job/m$d;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    invoke-virtual {p0}, Lcom/evernote/android/job/c;->k()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/evernote/android/job/a/c;->c(Landroid/content/Context;)Lcom/evernote/android/job/m$d;

    move-result-object v1

    sget-object v3, Lcom/evernote/android/job/c$1;->a:[I

    invoke-virtual {v0}, Lcom/evernote/android/job/m$d;->ordinal()I

    move-result v0

    aget v0, v3, v0

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "not implemented"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    sget-object v0, Lcom/evernote/android/job/m$d;->b:Lcom/evernote/android/job/m$d;

    if-eq v1, v0, :cond_2

    sget-object v0, Lcom/evernote/android/job/m$d;->d:Lcom/evernote/android/job/m$d;

    if-ne v1, v0, :cond_1

    return v2

    :cond_1
    const/4 v2, 0x0

    :cond_2
    return v2

    :pswitch_1
    sget-object v0, Lcom/evernote/android/job/m$d;->c:Lcom/evernote/android/job/m$d;

    if-ne v1, v0, :cond_3

    return v2

    :cond_3
    const/4 v2, 0x0

    return v2

    :pswitch_2
    sget-object v0, Lcom/evernote/android/job/m$d;->d:Lcom/evernote/android/job/m$d;

    if-eq v1, v0, :cond_5

    sget-object v0, Lcom/evernote/android/job/m$d;->c:Lcom/evernote/android/job/m$d;

    if-eq v1, v0, :cond_5

    sget-object v0, Lcom/evernote/android/job/m$d;->e:Lcom/evernote/android/job/m$d;

    if-ne v1, v0, :cond_4

    return v2

    :cond_4
    const/4 v2, 0x0

    :cond_5
    return v2

    :pswitch_3
    sget-object v0, Lcom/evernote/android/job/m$d;->a:Lcom/evernote/android/job/m$d;

    if-eq v1, v0, :cond_6

    return v2

    :cond_6
    const/4 v2, 0x0

    return v2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected final j()Lcom/evernote/android/job/c$a;
    .locals 1

    iget-object v0, p0, Lcom/evernote/android/job/c;->b:Lcom/evernote/android/job/c$a;

    return-object v0
.end method

.method protected final k()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/evernote/android/job/c;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/evernote/android/job/c;->d:Landroid/content/Context;

    :cond_0
    return-object v0
.end method

.method public final l()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/evernote/android/job/c;->b(Z)Z

    return-void
.end method

.method public final m()Z
    .locals 6

    iget-object v0, p0, Lcom/evernote/android/job/c;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-wide v1, p0, Lcom/evernote/android/job/c;->g:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method final n()J
    .locals 3

    iget-object v0, p0, Lcom/evernote/android/job/c;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-wide v1, p0, Lcom/evernote/android/job/c;->g:J

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method final o()Lcom/evernote/android/job/c$b;
    .locals 1

    iget-object v0, p0, Lcom/evernote/android/job/c;->h:Lcom/evernote/android/job/c$b;

    return-object v0
.end method

.method final p()Z
    .locals 2

    iget-object v0, p0, Lcom/evernote/android/job/c;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/evernote/android/job/c;->f:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "job{id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/evernote/android/job/c;->b:Lcom/evernote/android/job/c$a;

    invoke-virtual {v1}, Lcom/evernote/android/job/c$a;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", finished="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/evernote/android/job/c;->m()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", result="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/evernote/android/job/c;->h:Lcom/evernote/android/job/c$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", canceled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/evernote/android/job/c;->e:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", periodic="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/evernote/android/job/c;->b:Lcom/evernote/android/job/c$a;

    invoke-virtual {v1}, Lcom/evernote/android/job/c$a;->c()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", class="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", tag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/evernote/android/job/c;->b:Lcom/evernote/android/job/c$a;

    invoke-virtual {v1}, Lcom/evernote/android/job/c$a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
