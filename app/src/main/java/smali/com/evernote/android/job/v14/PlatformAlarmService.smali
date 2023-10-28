.class public final Lcom/evernote/android/job/v14/PlatformAlarmService;
.super Landroid/support/v4/app/c;


# static fields
.field private static final j:Lcom/evernote/android/job/a/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/evernote/android/job/a/d;

    const-string v1, "PlatformAlarmService"

    invoke-direct {v0, v1}, Lcom/evernote/android/job/a/d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/evernote/android/job/v14/PlatformAlarmService;->j:Lcom/evernote/android/job/a/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/support/v4/app/c;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;ILandroid/os/Bundle;)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "EXTRA_JOB_ID"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    if-eqz p2, :cond_0

    const-string p1, "EXTRA_TRANSIENT_EXTRAS"

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_0
    const-class p1, Lcom/evernote/android/job/v14/PlatformAlarmService;

    const p2, 0x7ffff1c1

    invoke-static {p0, p1, p2, v0}, Lcom/evernote/android/job/v14/PlatformAlarmService;->a(Landroid/content/Context;Ljava/lang/Class;ILandroid/content/Intent;)V

    return-void
.end method

.method static a(Landroid/content/Intent;Landroid/app/Service;Lcom/evernote/android/job/a/d;)V
    .locals 2

    if-nez p0, :cond_0

    const-string p0, "Delivered intent is null"

    invoke-virtual {p2, p0}, Lcom/evernote/android/job/a/d;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "EXTRA_JOB_ID"

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const-string v1, "EXTRA_TRANSIENT_EXTRAS"

    invoke-virtual {p0, v1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p0

    new-instance v1, Lcom/evernote/android/job/k$a;

    invoke-direct {v1, p1, p2, v0}, Lcom/evernote/android/job/k$a;-><init>(Landroid/app/Service;Lcom/evernote/android/job/a/d;I)V

    const/4 p1, 0x1

    invoke-virtual {v1, p1, p1}, Lcom/evernote/android/job/k$a;->a(ZZ)Lcom/evernote/android/job/m;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {v1, p1, p0}, Lcom/evernote/android/job/k$a;->a(Lcom/evernote/android/job/m;Landroid/os/Bundle;)Lcom/evernote/android/job/c$b;

    :cond_1
    return-void
.end method


# virtual methods
.method protected a(Landroid/content/Intent;)V
    .locals 1

    sget-object v0, Lcom/evernote/android/job/v14/PlatformAlarmService;->j:Lcom/evernote/android/job/a/d;

    invoke-static {p1, p0, v0}, Lcom/evernote/android/job/v14/PlatformAlarmService;->a(Landroid/content/Intent;Landroid/app/Service;Lcom/evernote/android/job/a/d;)V

    return-void
.end method
