.class public Lcom/evernote/android/job/v14/PlatformAlarmReceiver;
.super Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method static a(Landroid/content/Context;IZLandroid/os/Bundle;)Landroid/content/Intent;
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/evernote/android/job/v14/PlatformAlarmReceiver;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "EXTRA_JOB_ID"

    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object p0

    const-string p1, "EXTRA_JOB_EXACT"

    invoke-virtual {p0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object p0

    if-eqz p3, :cond_0

    const-string p1, "EXTRA_TRANSIENT_EXTRAS"

    invoke-virtual {p0, p1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_0
    return-object p0
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    if-eqz p2, :cond_1

    const-string v0, "EXTRA_JOB_ID"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "EXTRA_JOB_EXACT"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "EXTRA_JOB_ID"

    const/4 v1, -0x1

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const-string v1, "EXTRA_TRANSIENT_EXTRAS"

    invoke-virtual {p2, v1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "EXTRA_JOB_EXACT"

    const/4 v3, 0x0

    invoke-virtual {p2, v2, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-static {p1, v0, v1}, Lcom/evernote/android/job/v14/PlatformAlarmServiceExact;->a(Landroid/content/Context;ILandroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/evernote/android/job/k$a;->a(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void

    :cond_0
    invoke-static {p1, v0, v1}, Lcom/evernote/android/job/v14/PlatformAlarmService;->a(Landroid/content/Context;ILandroid/os/Bundle;)V

    :cond_1
    return-void
.end method
