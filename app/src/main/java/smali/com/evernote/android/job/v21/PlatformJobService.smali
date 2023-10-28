.class public Lcom/evernote/android/job/v21/PlatformJobService;
.super Landroid/app/job/JobService;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x15
.end annotation


# static fields
.field private static final a:Lcom/evernote/android/job/a/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/evernote/android/job/a/d;

    const-string v1, "PlatformJobService"

    invoke-direct {v0, v1}, Lcom/evernote/android/job/a/d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/evernote/android/job/v21/PlatformJobService;->a:Lcom/evernote/android/job/a/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/job/JobService;-><init>()V

    return-void
.end method

.method private a(Landroid/app/job/JobParameters;)Landroid/os/Bundle;
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1a
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/app/job/JobParameters;->getTransientExtras()Landroid/os/Bundle;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    return-object p1
.end method

.method static synthetic a(Lcom/evernote/android/job/v21/PlatformJobService;Landroid/app/job/JobParameters;)Landroid/os/Bundle;
    .locals 0

    invoke-direct {p0, p1}, Lcom/evernote/android/job/v21/PlatformJobService;->a(Landroid/app/job/JobParameters;)Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method static synthetic a()Lcom/evernote/android/job/a/d;
    .locals 1

    sget-object v0, Lcom/evernote/android/job/v21/PlatformJobService;->a:Lcom/evernote/android/job/a/d;

    return-object v0
.end method


# virtual methods
.method public onStartJob(Landroid/app/job/JobParameters;)Z
    .locals 2

    invoke-static {}, Lcom/evernote/android/job/e;->h()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/evernote/android/job/v21/PlatformJobService$1;

    invoke-direct {v1, p0, p1}, Lcom/evernote/android/job/v21/PlatformJobService$1;-><init>(Lcom/evernote/android/job/v21/PlatformJobService;Landroid/app/job/JobParameters;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    const/4 p1, 0x1

    return p1
.end method

.method public onStopJob(Landroid/app/job/JobParameters;)Z
    .locals 4

    invoke-static {p0}, Lcom/evernote/android/job/i;->a(Landroid/content/Context;)Lcom/evernote/android/job/i;

    move-result-object v0

    invoke-virtual {p1}, Landroid/app/job/JobParameters;->getJobId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/evernote/android/job/i;->a(I)Lcom/evernote/android/job/c;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/evernote/android/job/c;->l()V

    sget-object p1, Lcom/evernote/android/job/v21/PlatformJobService;->a:Lcom/evernote/android/job/a/d;

    const-string v3, "Called onStopJob for %s"

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v0, v1, v2

    invoke-virtual {p1, v3, v1}, Lcom/evernote/android/job/a/d;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return v2

    :cond_0
    sget-object v0, Lcom/evernote/android/job/v21/PlatformJobService;->a:Lcom/evernote/android/job/a/d;

    const-string v3, "Called onStopJob, job %d not found"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/app/job/JobParameters;->getJobId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v1, v2

    invoke-virtual {v0, v3, v1}, Lcom/evernote/android/job/a/d;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return v2
.end method
