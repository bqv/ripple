.class Lcom/evernote/android/job/v14/PlatformAlarmServiceExact$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/evernote/android/job/v14/PlatformAlarmServiceExact;->onStartCommand(Landroid/content/Intent;II)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Intent;

.field final synthetic b:I

.field final synthetic c:Lcom/evernote/android/job/v14/PlatformAlarmServiceExact;


# direct methods
.method constructor <init>(Lcom/evernote/android/job/v14/PlatformAlarmServiceExact;Landroid/content/Intent;I)V
    .locals 0

    iput-object p1, p0, Lcom/evernote/android/job/v14/PlatformAlarmServiceExact$1;->c:Lcom/evernote/android/job/v14/PlatformAlarmServiceExact;

    iput-object p2, p0, Lcom/evernote/android/job/v14/PlatformAlarmServiceExact$1;->a:Landroid/content/Intent;

    iput p3, p0, Lcom/evernote/android/job/v14/PlatformAlarmServiceExact$1;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/evernote/android/job/v14/PlatformAlarmServiceExact$1;->a:Landroid/content/Intent;

    iget-object v1, p0, Lcom/evernote/android/job/v14/PlatformAlarmServiceExact$1;->c:Lcom/evernote/android/job/v14/PlatformAlarmServiceExact;

    invoke-static {}, Lcom/evernote/android/job/v14/PlatformAlarmServiceExact;->a()Lcom/evernote/android/job/a/d;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/evernote/android/job/v14/PlatformAlarmService;->a(Landroid/content/Intent;Landroid/app/Service;Lcom/evernote/android/job/a/d;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/evernote/android/job/v14/PlatformAlarmServiceExact$1;->a:Landroid/content/Intent;

    invoke-static {v0}, Lcom/evernote/android/job/k$a;->a(Landroid/content/Intent;)Z

    iget-object v0, p0, Lcom/evernote/android/job/v14/PlatformAlarmServiceExact$1;->c:Lcom/evernote/android/job/v14/PlatformAlarmServiceExact;

    iget v1, p0, Lcom/evernote/android/job/v14/PlatformAlarmServiceExact$1;->b:I

    invoke-static {v0, v1}, Lcom/evernote/android/job/v14/PlatformAlarmServiceExact;->a(Lcom/evernote/android/job/v14/PlatformAlarmServiceExact;I)V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/evernote/android/job/v14/PlatformAlarmServiceExact$1;->a:Landroid/content/Intent;

    invoke-static {v1}, Lcom/evernote/android/job/k$a;->a(Landroid/content/Intent;)Z

    iget-object v1, p0, Lcom/evernote/android/job/v14/PlatformAlarmServiceExact$1;->c:Lcom/evernote/android/job/v14/PlatformAlarmServiceExact;

    iget v2, p0, Lcom/evernote/android/job/v14/PlatformAlarmServiceExact$1;->b:I

    invoke-static {v1, v2}, Lcom/evernote/android/job/v14/PlatformAlarmServiceExact;->a(Lcom/evernote/android/job/v14/PlatformAlarmServiceExact;I)V

    throw v0
.end method
