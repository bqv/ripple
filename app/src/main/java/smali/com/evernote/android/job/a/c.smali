.class public final Lcom/evernote/android/job/a/c;
.super Ljava/lang/Object;


# direct methods
.method public static a(Landroid/content/Context;)Lcom/evernote/android/job/a/a;
    .locals 5
    .annotation build Landroid/annotation/TargetApi;
        value = 0x11
    .end annotation

    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object p0

    if-nez p0, :cond_0

    sget-object p0, Lcom/evernote/android/job/a/a;->a:Lcom/evernote/android/job/a/a;

    return-object p0

    :cond_0
    const-string v0, "level"

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const-string v2, "scale"

    invoke-virtual {p0, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    int-to-float v0, v0

    int-to-float v1, v1

    div-float/2addr v0, v1

    const-string v1, "plugged"

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p0

    const/4 v1, 0x1

    if-eq p0, v1, :cond_2

    const/4 v3, 0x2

    if-eq p0, v3, :cond_2

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x11

    if-lt v3, v4, :cond_1

    const/4 v3, 0x4

    if-ne p0, v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_0
    new-instance p0, Lcom/evernote/android/job/a/a;

    invoke-direct {p0, v1, v0}, Lcom/evernote/android/job/a/a;-><init>(ZF)V

    return-object p0
.end method

.method public static a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 3

    const-string v0, "power"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/os/PowerManager;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x1

    const/16 v2, 0x17

    if-lt v0, v2, :cond_2

    invoke-virtual {p0}, Landroid/os/PowerManager;->isDeviceIdleMode()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/os/PowerManager;->isInteractive()Z

    move-result p0

    if-nez p0, :cond_0

    return v1

    :cond_0
    const/4 v1, 0x0

    :cond_1
    return v1

    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x14

    if-lt v0, v2, :cond_3

    invoke-virtual {p0}, Landroid/os/PowerManager;->isInteractive()Z

    move-result p0

    xor-int/2addr p0, v1

    return p0

    :cond_3
    invoke-virtual {p0}, Landroid/os/PowerManager;->isScreenOn()Z

    move-result p0

    xor-int/2addr p0, v1

    return p0
.end method

.method public static c(Landroid/content/Context;)Lcom/evernote/android/job/m$d;
    .locals 2

    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/net/ConnectivityManager;

    :try_start_0
    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnectedOrConnecting()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Landroid/support/v4/b/a;->a(Landroid/net/ConnectivityManager;)Z

    move-result p0

    if-nez p0, :cond_1

    sget-object p0, Lcom/evernote/android/job/m$d;->c:Lcom/evernote/android/job/m$d;

    return-object p0

    :cond_1
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isRoaming()Z

    move-result p0

    if-eqz p0, :cond_2

    sget-object p0, Lcom/evernote/android/job/m$d;->b:Lcom/evernote/android/job/m$d;

    return-object p0

    :cond_2
    sget-object p0, Lcom/evernote/android/job/m$d;->d:Lcom/evernote/android/job/m$d;

    return-object p0

    :cond_3
    :goto_0
    sget-object p0, Lcom/evernote/android/job/m$d;->a:Lcom/evernote/android/job/m$d;

    return-object p0

    :catch_0
    sget-object p0, Lcom/evernote/android/job/m$d;->a:Lcom/evernote/android/job/m$d;

    return-object p0
.end method
