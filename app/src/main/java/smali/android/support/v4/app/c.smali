.class public abstract Landroid/support/v4/app/c;
.super Landroid/app/Service;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/app/c$a;,
        Landroid/support/v4/app/c$d;,
        Landroid/support/v4/app/c$e;,
        Landroid/support/v4/app/c$g;,
        Landroid/support/v4/app/c$f;,
        Landroid/support/v4/app/c$c;,
        Landroid/support/v4/app/c$b;,
        Landroid/support/v4/app/c$h;
    }
.end annotation


# static fields
.field static final h:Ljava/lang/Object;

.field static final i:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroid/content/ComponentName;",
            "Landroid/support/v4/app/c$h;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field a:Landroid/support/v4/app/c$b;

.field b:Landroid/support/v4/app/c$h;

.field c:Landroid/support/v4/app/c$a;

.field d:Z

.field e:Z

.field f:Z

.field final g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/support/v4/app/c$d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroid/support/v4/app/c;->h:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Landroid/support/v4/app/c;->i:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/app/c;->d:Z

    iput-boolean v0, p0, Landroid/support/v4/app/c;->e:Z

    iput-boolean v0, p0, Landroid/support/v4/app/c;->f:Z

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Landroid/support/v4/app/c;->g:Ljava/util/ArrayList;

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    goto :goto_0

    return-void
.end method

.method static a(Landroid/content/Context;Landroid/content/ComponentName;ZI)Landroid/support/v4/app/c$h;
    .locals 2

    sget-object v0, Landroid/support/v4/app/c;->i:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/c$h;

    if-nez v0, :cond_2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    if-nez p2, :cond_0

    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Can\'t be here without a job id"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_0
    new-instance p2, Landroid/support/v4/app/c$g;

    invoke-direct {p2, p0, p1, p3}, Landroid/support/v4/app/c$g;-><init>(Landroid/content/Context;Landroid/content/ComponentName;I)V

    goto :goto_0

    :cond_1
    new-instance p2, Landroid/support/v4/app/c$c;

    invoke-direct {p2, p0, p1}, Landroid/support/v4/app/c$c;-><init>(Landroid/content/Context;Landroid/content/ComponentName;)V

    :goto_0
    move-object v0, p2

    sget-object p0, Landroid/support/v4/app/c;->i:Ljava/util/HashMap;

    invoke-virtual {p0, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-object v0
.end method

.method public static a(Landroid/content/Context;Landroid/content/ComponentName;ILandroid/content/Intent;)V
    .locals 2

    if-nez p3, :cond_0

    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "work must not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_0
    sget-object v0, Landroid/support/v4/app/c;->h:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    invoke-static {p0, p1, v1, p2}, Landroid/support/v4/app/c;->a(Landroid/content/Context;Landroid/content/ComponentName;ZI)Landroid/support/v4/app/c$h;

    move-result-object p0

    invoke-virtual {p0, p2}, Landroid/support/v4/app/c$h;->a(I)V

    invoke-virtual {p0, p3}, Landroid/support/v4/app/c$h;->a(Landroid/content/Intent;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/Class;ILandroid/content/Intent;)V
    .locals 1

    new-instance v0, Landroid/content/ComponentName;

    invoke-direct {v0, p0, p1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-static {p0, v0, p2, p3}, Landroid/support/v4/app/c;->a(Landroid/content/Context;Landroid/content/ComponentName;ILandroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method protected abstract a(Landroid/content/Intent;)V
.end method

.method a(Z)V
    .locals 2

    iget-object v0, p0, Landroid/support/v4/app/c;->c:Landroid/support/v4/app/c$a;

    if-nez v0, :cond_1

    new-instance v0, Landroid/support/v4/app/c$a;

    invoke-direct {v0, p0}, Landroid/support/v4/app/c$a;-><init>(Landroid/support/v4/app/c;)V

    iput-object v0, p0, Landroid/support/v4/app/c;->c:Landroid/support/v4/app/c$a;

    iget-object v0, p0, Landroid/support/v4/app/c;->b:Landroid/support/v4/app/c$h;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroid/support/v4/app/c;->b:Landroid/support/v4/app/c$h;

    invoke-virtual {p1}, Landroid/support/v4/app/c$h;->b()V

    :cond_0
    iget-object p1, p0, Landroid/support/v4/app/c;->c:Landroid/support/v4/app/c$a;

    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {p1, v0, v1}, Landroid/support/v4/app/c$a;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_1
    return-void
.end method

.method public a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method b()Z
    .locals 2

    iget-object v0, p0, Landroid/support/v4/app/c;->c:Landroid/support/v4/app/c$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/app/c;->c:Landroid/support/v4/app/c$a;

    iget-boolean v1, p0, Landroid/support/v4/app/c;->d:Z

    invoke-virtual {v0, v1}, Landroid/support/v4/app/c$a;->cancel(Z)Z

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/app/c;->e:Z

    invoke-virtual {p0}, Landroid/support/v4/app/c;->a()Z

    move-result v0

    return v0
.end method

.method c()V
    .locals 2

    iget-object v0, p0, Landroid/support/v4/app/c;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroid/support/v4/app/c;->g:Ljava/util/ArrayList;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-object v1, p0, Landroid/support/v4/app/c;->c:Landroid/support/v4/app/c$a;

    iget-object v1, p0, Landroid/support/v4/app/c;->g:Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v4/app/c;->g:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Landroid/support/v4/app/c;->a(Z)V

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Landroid/support/v4/app/c;->f:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Landroid/support/v4/app/c;->b:Landroid/support/v4/app/c$h;

    invoke-virtual {v1}, Landroid/support/v4/app/c$h;->c()V

    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_2
    return-void
.end method

.method d()Landroid/support/v4/app/c$e;
    .locals 3

    iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/c$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/c$b;

    invoke-interface {v0}, Landroid/support/v4/app/c$b;->b()Landroid/support/v4/app/c$e;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/c;->g:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroid/support/v4/app/c;->g:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_1

    iget-object v1, p0, Landroid/support/v4/app/c;->g:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/app/c$e;

    monitor-exit v0

    return-object v1

    :cond_1
    const/4 v1, 0x0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    iget-object p1, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/c$b;

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/c$b;

    invoke-interface {p1}, Landroid/support/v4/app/c$b;->a()Landroid/os/IBinder;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public onCreate()V
    .locals 3

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x1a

    if-lt v0, v2, :cond_0

    new-instance v0, Landroid/support/v4/app/c$f;

    invoke-direct {v0, p0}, Landroid/support/v4/app/c$f;-><init>(Landroid/support/v4/app/c;)V

    iput-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/c$b;

    iput-object v1, p0, Landroid/support/v4/app/c;->b:Landroid/support/v4/app/c$h;

    return-void

    :cond_0
    iput-object v1, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/c$b;

    new-instance v0, Landroid/content/ComponentName;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-static {p0, v0, v1, v1}, Landroid/support/v4/app/c;->a(Landroid/content/Context;Landroid/content/ComponentName;ZI)Landroid/support/v4/app/c$h;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/app/c;->b:Landroid/support/v4/app/c$h;

    return-void
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    iget-object v0, p0, Landroid/support/v4/app/c;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/app/c;->g:Ljava/util/ArrayList;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Landroid/support/v4/app/c;->f:Z

    iget-object v1, p0, Landroid/support/v4/app/c;->b:Landroid/support/v4/app/c$h;

    invoke-virtual {v1}, Landroid/support/v4/app/c$h;->c()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_0
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 2

    iget-object p2, p0, Landroid/support/v4/app/c;->g:Ljava/util/ArrayList;

    if-eqz p2, :cond_1

    iget-object p2, p0, Landroid/support/v4/app/c;->b:Landroid/support/v4/app/c$h;

    invoke-virtual {p2}, Landroid/support/v4/app/c$h;->a()V

    iget-object p2, p0, Landroid/support/v4/app/c;->g:Ljava/util/ArrayList;

    monitor-enter p2

    :try_start_0
    iget-object v0, p0, Landroid/support/v4/app/c;->g:Ljava/util/ArrayList;

    new-instance v1, Landroid/support/v4/app/c$d;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    :goto_0
    invoke-direct {v1, p0, p1, p3}, Landroid/support/v4/app/c$d;-><init>(Landroid/support/v4/app/c;Landroid/content/Intent;I)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/support/v4/app/c;->a(Z)V

    monitor-exit p2

    const/4 p1, 0x3

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    const/4 p1, 0x2

    return p1
.end method
