.class public final Lcom/evernote/android/job/JobBootReceiver;
.super Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    :try_start_0
    invoke-static {p1}, Lcom/evernote/android/job/i;->a(Landroid/content/Context;)Lcom/evernote/android/job/i;
    :try_end_0
    .catch Lcom/evernote/android/job/j; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
