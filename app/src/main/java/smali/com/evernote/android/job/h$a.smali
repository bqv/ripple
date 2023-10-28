.class final Lcom/evernote/android/job/h$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/evernote/android/job/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lcom/evernote/android/job/c$b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/evernote/android/job/h;

.field private final b:Lcom/evernote/android/job/c;

.field private final c:Landroid/os/PowerManager$WakeLock;


# direct methods
.method private constructor <init>(Lcom/evernote/android/job/h;Lcom/evernote/android/job/c;)V
    .locals 2

    iput-object p1, p0, Lcom/evernote/android/job/h$a;->a:Lcom/evernote/android/job/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/evernote/android/job/h$a;->b:Lcom/evernote/android/job/c;

    iget-object p1, p0, Lcom/evernote/android/job/h$a;->b:Lcom/evernote/android/job/c;

    invoke-virtual {p1}, Lcom/evernote/android/job/c;->k()Landroid/content/Context;

    move-result-object p1

    const-string p2, "JobExecutor"

    invoke-static {}, Lcom/evernote/android/job/h;->b()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Lcom/evernote/android/job/p;->a(Landroid/content/Context;Ljava/lang/String;J)Landroid/os/PowerManager$WakeLock;

    move-result-object p1

    iput-object p1, p0, Lcom/evernote/android/job/h$a;->c:Landroid/os/PowerManager$WakeLock;

    return-void
.end method

.method synthetic constructor <init>(Lcom/evernote/android/job/h;Lcom/evernote/android/job/c;Lcom/evernote/android/job/h$1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/evernote/android/job/h$a;-><init>(Lcom/evernote/android/job/h;Lcom/evernote/android/job/c;)V

    return-void
.end method

.method private a(Lcom/evernote/android/job/c;Lcom/evernote/android/job/c$b;)V
    .locals 4

    iget-object v0, p0, Lcom/evernote/android/job/h$a;->b:Lcom/evernote/android/job/c;

    invoke-virtual {v0}, Lcom/evernote/android/job/c;->j()Lcom/evernote/android/job/c$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/evernote/android/job/c$a;->e()Lcom/evernote/android/job/m;

    move-result-object v0

    invoke-virtual {v0}, Lcom/evernote/android/job/m;->i()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_0

    sget-object v1, Lcom/evernote/android/job/c$b;->c:Lcom/evernote/android/job/c$b;

    invoke-virtual {v1, p2}, Lcom/evernote/android/job/c$b;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/evernote/android/job/c;->p()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0, v3, v3}, Lcom/evernote/android/job/m;->a(ZZ)Lcom/evernote/android/job/m;

    move-result-object v0

    iget-object p2, p0, Lcom/evernote/android/job/h$a;->b:Lcom/evernote/android/job/c;

    invoke-virtual {v0}, Lcom/evernote/android/job/m;->c()I

    move-result v1

    invoke-virtual {p2, v1}, Lcom/evernote/android/job/c;->a(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/evernote/android/job/m;->i()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lcom/evernote/android/job/c$b;->a:Lcom/evernote/android/job/c$b;

    invoke-virtual {v1, p2}, Lcom/evernote/android/job/c$b;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :cond_2
    :goto_0
    invoke-virtual {p1}, Lcom/evernote/android/job/c;->p()Z

    move-result p1

    if-nez p1, :cond_4

    if-nez v2, :cond_3

    if-eqz v3, :cond_4

    :cond_3
    invoke-virtual {v0, v2, v3}, Lcom/evernote/android/job/m;->b(ZZ)V

    :cond_4
    return-void
.end method

.method private b()Lcom/evernote/android/job/c$b;
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x1

    :try_start_0
    iget-object v2, p0, Lcom/evernote/android/job/h$a;->b:Lcom/evernote/android/job/c;

    invoke-virtual {v2}, Lcom/evernote/android/job/c;->d()Lcom/evernote/android/job/c$b;

    move-result-object v2

    invoke-static {}, Lcom/evernote/android/job/h;->c()Lcom/evernote/android/job/a/d;

    move-result-object v3

    const-string v4, "Finished %s"

    new-array v5, v1, [Ljava/lang/Object;

    iget-object v6, p0, Lcom/evernote/android/job/h$a;->b:Lcom/evernote/android/job/c;

    aput-object v6, v5, v0

    invoke-virtual {v3, v4, v5}, Lcom/evernote/android/job/a/d;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v3, p0, Lcom/evernote/android/job/h$a;->b:Lcom/evernote/android/job/c;

    invoke-direct {p0, v3, v2}, Lcom/evernote/android/job/h$a;->a(Lcom/evernote/android/job/c;Lcom/evernote/android/job/c$b;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    move-exception v2

    invoke-static {}, Lcom/evernote/android/job/h;->c()Lcom/evernote/android/job/a/d;

    move-result-object v3

    const-string v4, "Crashed %s"

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/evernote/android/job/h$a;->b:Lcom/evernote/android/job/c;

    aput-object v5, v1, v0

    invoke-virtual {v3, v2, v4, v1}, Lcom/evernote/android/job/a/d;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/evernote/android/job/h$a;->b:Lcom/evernote/android/job/c;

    invoke-virtual {v0}, Lcom/evernote/android/job/c;->o()Lcom/evernote/android/job/c$b;

    move-result-object v2

    return-object v2
.end method


# virtual methods
.method public a()Lcom/evernote/android/job/c$b;
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x1

    :try_start_0
    iget-object v2, p0, Lcom/evernote/android/job/h$a;->b:Lcom/evernote/android/job/c;

    invoke-virtual {v2}, Lcom/evernote/android/job/c;->k()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/evernote/android/job/h$a;->c:Landroid/os/PowerManager$WakeLock;

    invoke-static {}, Lcom/evernote/android/job/h;->b()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lcom/evernote/android/job/p;->a(Landroid/content/Context;Landroid/os/PowerManager$WakeLock;J)Z

    invoke-direct {p0}, Lcom/evernote/android/job/h$a;->b()Lcom/evernote/android/job/c$b;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v3, p0, Lcom/evernote/android/job/h$a;->a:Lcom/evernote/android/job/h;

    iget-object v4, p0, Lcom/evernote/android/job/h$a;->b:Lcom/evernote/android/job/c;

    invoke-virtual {v3, v4}, Lcom/evernote/android/job/h;->a(Lcom/evernote/android/job/c;)V

    iget-object v3, p0, Lcom/evernote/android/job/h$a;->c:Landroid/os/PowerManager$WakeLock;

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/evernote/android/job/h$a;->c:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v3}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v3

    if-nez v3, :cond_1

    :cond_0
    invoke-static {}, Lcom/evernote/android/job/h;->c()Lcom/evernote/android/job/a/d;

    move-result-object v3

    const-string v4, "Wake lock was not held after job %s was done. The job took too long to complete. This could have unintended side effects on your app."

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/evernote/android/job/h$a;->b:Lcom/evernote/android/job/c;

    aput-object v5, v1, v0

    invoke-virtual {v3, v4, v1}, Lcom/evernote/android/job/a/d;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    iget-object v0, p0, Lcom/evernote/android/job/h$a;->c:Landroid/os/PowerManager$WakeLock;

    invoke-static {v0}, Lcom/evernote/android/job/p;->a(Landroid/os/PowerManager$WakeLock;)V

    return-object v2

    :catchall_0
    move-exception v2

    iget-object v3, p0, Lcom/evernote/android/job/h$a;->a:Lcom/evernote/android/job/h;

    iget-object v4, p0, Lcom/evernote/android/job/h$a;->b:Lcom/evernote/android/job/c;

    invoke-virtual {v3, v4}, Lcom/evernote/android/job/h;->a(Lcom/evernote/android/job/c;)V

    iget-object v3, p0, Lcom/evernote/android/job/h$a;->c:Landroid/os/PowerManager$WakeLock;

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/evernote/android/job/h$a;->c:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v3}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v3

    if-nez v3, :cond_3

    :cond_2
    invoke-static {}, Lcom/evernote/android/job/h;->c()Lcom/evernote/android/job/a/d;

    move-result-object v3

    const-string v4, "Wake lock was not held after job %s was done. The job took too long to complete. This could have unintended side effects on your app."

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/evernote/android/job/h$a;->b:Lcom/evernote/android/job/c;

    aput-object v5, v1, v0

    invoke-virtual {v3, v4, v1}, Lcom/evernote/android/job/a/d;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    iget-object v0, p0, Lcom/evernote/android/job/h$a;->c:Landroid/os/PowerManager$WakeLock;

    invoke-static {v0}, Lcom/evernote/android/job/p;->a(Landroid/os/PowerManager$WakeLock;)V

    throw v2
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/evernote/android/job/h$a;->a()Lcom/evernote/android/job/c$b;

    move-result-object v0

    return-object v0
.end method
