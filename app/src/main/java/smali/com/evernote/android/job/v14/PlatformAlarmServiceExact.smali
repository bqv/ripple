.class public final Lcom/evernote/android/job/v14/PlatformAlarmServiceExact;
.super Landroid/app/Service;


# static fields
.field private static final a:Lcom/evernote/android/job/a/d;


# instance fields
.field private final b:Ljava/lang/Object;

.field private volatile c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private volatile d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/evernote/android/job/a/d;

    const-string v1, "PlatformAlarmServiceExact"

    invoke-direct {v0, v1}, Lcom/evernote/android/job/a/d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/evernote/android/job/v14/PlatformAlarmServiceExact;->a:Lcom/evernote/android/job/a/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/evernote/android/job/v14/PlatformAlarmServiceExact;->b:Ljava/lang/Object;

    return-void
.end method

.method public static a(Landroid/content/Context;ILandroid/os/Bundle;)Landroid/content/Intent;
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/evernote/android/job/v14/PlatformAlarmServiceExact;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "EXTRA_JOB_ID"

    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    if-eqz p2, :cond_0

    const-string p0, "EXTRA_TRANSIENT_EXTRAS"

    invoke-virtual {v0, p0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_0
    return-object v0
.end method

.method static synthetic a()Lcom/evernote/android/job/a/d;
    .locals 1

    sget-object v0, Lcom/evernote/android/job/v14/PlatformAlarmServiceExact;->a:Lcom/evernote/android/job/a/d;

    return-object v0
.end method

.method private a(I)V
    .locals 2

    iget-object v0, p0, Lcom/evernote/android/job/v14/PlatformAlarmServiceExact;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/evernote/android/job/v14/PlatformAlarmServiceExact;->c:Ljava/util/Set;

    if-eqz v1, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    iget p1, p0, Lcom/evernote/android/job/v14/PlatformAlarmServiceExact;->d:I

    invoke-virtual {p0, p1}, Lcom/evernote/android/job/v14/PlatformAlarmServiceExact;->stopSelfResult(I)Z

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method static synthetic a(Lcom/evernote/android/job/v14/PlatformAlarmServiceExact;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/evernote/android/job/v14/PlatformAlarmServiceExact;->a(I)V

    return-void
.end method


# virtual methods
.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onCreate()V
    .locals 1

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/evernote/android/job/v14/PlatformAlarmServiceExact;->c:Ljava/util/Set;

    return-void
.end method

.method public onDestroy()V
    .locals 2

    iget-object v0, p0, Lcom/evernote/android/job/v14/PlatformAlarmServiceExact;->b:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-object v1, p0, Lcom/evernote/android/job/v14/PlatformAlarmServiceExact;->c:Ljava/util/Set;

    const/4 v1, 0x0

    iput v1, p0, Lcom/evernote/android/job/v14/PlatformAlarmServiceExact;->d:I

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 2

    iget-object p2, p0, Lcom/evernote/android/job/v14/PlatformAlarmServiceExact;->b:Ljava/lang/Object;

    monitor-enter p2

    :try_start_0
    iget-object v0, p0, Lcom/evernote/android/job/v14/PlatformAlarmServiceExact;->c:Ljava/util/Set;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iput p3, p0, Lcom/evernote/android/job/v14/PlatformAlarmServiceExact;->d:I

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lcom/evernote/android/job/e;->h()Ljava/util/concurrent/ExecutorService;

    move-result-object p2

    new-instance v0, Lcom/evernote/android/job/v14/PlatformAlarmServiceExact$1;

    invoke-direct {v0, p0, p1, p3}, Lcom/evernote/android/job/v14/PlatformAlarmServiceExact$1;-><init>(Lcom/evernote/android/job/v14/PlatformAlarmServiceExact;Landroid/content/Intent;I)V

    invoke-interface {p2, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    const/4 p1, 0x2

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
