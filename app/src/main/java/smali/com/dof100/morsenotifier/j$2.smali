.class Lcom/dof100/morsenotifier/j$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/media/AudioTrack$OnPlaybackPositionUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/dof100/morsenotifier/j;->a([Ljava/lang/Void;)Ljava/lang/Void;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/dof100/morsenotifier/j;


# direct methods
.method constructor <init>(Lcom/dof100/morsenotifier/j;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/dof100/morsenotifier/j$2;->b:Lcom/dof100/morsenotifier/j;

    iput-object p2, p0, Lcom/dof100/morsenotifier/j$2;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMarkerReached(Landroid/media/AudioTrack;)V
    .locals 1

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "MyPlayerMorse.doInBackground onMarkerReached audiotrack=null instance="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/dof100/morsenotifier/j$2;->b:Lcom/dof100/morsenotifier/j;

    invoke-static {v0}, Lcom/dof100/morsenotifier/j;->b(Lcom/dof100/morsenotifier/j;)I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/media/AudioTrack;->stop()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p1, "MyPlayerMorse.doInBackground ERROR IllegalStateException"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "MyPlayerMorse.doInBackground onMarkerReached instance="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/dof100/morsenotifier/j$2;->b:Lcom/dof100/morsenotifier/j;

    invoke-static {v0}, Lcom/dof100/morsenotifier/j;->b(Lcom/dof100/morsenotifier/j;)I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/j$2;->b:Lcom/dof100/morsenotifier/j;

    invoke-static {p1}, Lcom/dof100/morsenotifier/j;->a(Lcom/dof100/morsenotifier/j;)Ljava/util/concurrent/CountDownLatch;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method public onPeriodicNotification(Landroid/media/AudioTrack;)V
    .locals 9

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "MyPlayerMorse.doInBackground onPeriodicNotification audiotrack=null instance="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/dof100/morsenotifier/j$2;->b:Lcom/dof100/morsenotifier/j;

    invoke-static {v0}, Lcom/dof100/morsenotifier/j;->b(Lcom/dof100/morsenotifier/j;)I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/media/AudioTrack;->getState()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p1}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v0

    const/4 v2, 0x3

    if-eq v0, v2, :cond_2

    return-void

    :cond_2
    invoke-virtual {p1}, Landroid/media/AudioTrack;->getPlaybackHeadPosition()I

    move-result v0

    iget-object v3, p0, Lcom/dof100/morsenotifier/j$2;->b:Lcom/dof100/morsenotifier/j;

    invoke-static {v3}, Lcom/dof100/morsenotifier/j;->c(Lcom/dof100/morsenotifier/j;)I

    move-result v3

    div-int/2addr v0, v3

    iget-object v3, p0, Lcom/dof100/morsenotifier/j$2;->b:Lcom/dof100/morsenotifier/j;

    invoke-static {v3}, Lcom/dof100/morsenotifier/j;->d(Lcom/dof100/morsenotifier/j;)I

    move-result v3

    const/16 v4, 0x15

    const/4 v5, 0x0

    if-ge v0, v3, :cond_8

    mul-int/lit8 v3, v0, 0x2

    iget-object v6, p0, Lcom/dof100/morsenotifier/j$2;->b:Lcom/dof100/morsenotifier/j;

    invoke-static {v6}, Lcom/dof100/morsenotifier/j;->e(Lcom/dof100/morsenotifier/j;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-lt v3, v6, :cond_3

    goto/16 :goto_3

    :cond_3
    iget-object v6, p0, Lcom/dof100/morsenotifier/j$2;->b:Lcom/dof100/morsenotifier/j;

    invoke-static {v6}, Lcom/dof100/morsenotifier/j;->e(Lcom/dof100/morsenotifier/j;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v6, -0x7

    if-ne v3, v6, :cond_5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "MyPlayerMorse.doInBackground onPeriodicNotification STOP detected at "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, "...  Muting... instance="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, p0, Lcom/dof100/morsenotifier/j$2;->b:Lcom/dof100/morsenotifier/j;

    invoke-static {v7}, Lcom/dof100/morsenotifier/j;->b(Lcom/dof100/morsenotifier/j;)I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v6, v4, :cond_4

    invoke-virtual {p1, v5}, Landroid/media/AudioTrack;->setVolume(F)I

    goto :goto_0

    :cond_4
    invoke-virtual {p1, v5, v5}, Landroid/media/AudioTrack;->setStereoVolume(FF)I

    :cond_5
    :goto_0
    iget-object p1, p0, Lcom/dof100/morsenotifier/j$2;->a:Landroid/content/Context;

    invoke-static {p1, v0}, Lcom/dof100/morsenotifier/App;->a(Landroid/content/Context;I)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/j$2;->b:Lcom/dof100/morsenotifier/j;

    invoke-static {p1}, Lcom/dof100/morsenotifier/j;->f(Lcom/dof100/morsenotifier/j;)Z

    move-result p1

    if-eqz p1, :cond_a

    iget-object p1, p0, Lcom/dof100/morsenotifier/j$2;->b:Lcom/dof100/morsenotifier/j;

    invoke-static {p1}, Lcom/dof100/morsenotifier/j;->g(Lcom/dof100/morsenotifier/j;)Landroid/os/Vibrator;

    move-result-object p1

    if-eqz p1, :cond_a

    new-array p1, v2, [J

    fill-array-data p1, :array_0

    const/4 v0, -0x1

    if-eq v3, v0, :cond_a

    const/16 v4, 0x1a

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x2

    packed-switch v3, :pswitch_data_0

    aput-wide v6, p1, v5

    aput-wide v6, p1, v1

    iget-object v0, p0, Lcom/dof100/morsenotifier/j$2;->b:Lcom/dof100/morsenotifier/j;

    invoke-static {v0}, Lcom/dof100/morsenotifier/j;->h(Lcom/dof100/morsenotifier/j;)I

    move-result v0

    int-to-long v0, v0

    aput-wide v0, p1, v8

    return-void

    :pswitch_0
    aput-wide v6, p1, v5

    iget-object v3, p0, Lcom/dof100/morsenotifier/j$2;->b:Lcom/dof100/morsenotifier/j;

    invoke-static {v3}, Lcom/dof100/morsenotifier/j;->h(Lcom/dof100/morsenotifier/j;)I

    move-result v3

    mul-int/lit8 v3, v3, 0x3

    int-to-long v2, v3

    aput-wide v2, p1, v1

    iget-object v1, p0, Lcom/dof100/morsenotifier/j$2;->b:Lcom/dof100/morsenotifier/j;

    invoke-static {v1}, Lcom/dof100/morsenotifier/j;->h(Lcom/dof100/morsenotifier/j;)I

    move-result v1

    int-to-long v1, v1

    aput-wide v1, p1, v8

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v1, v4, :cond_6

    iget-object v1, p0, Lcom/dof100/morsenotifier/j$2;->b:Lcom/dof100/morsenotifier/j;

    invoke-static {v1}, Lcom/dof100/morsenotifier/j;->g(Lcom/dof100/morsenotifier/j;)Landroid/os/Vibrator;

    move-result-object v1

    :goto_1
    invoke-static {p1, v0}, Landroid/os/VibrationEffect;->createWaveform([JI)Landroid/os/VibrationEffect;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/os/Vibrator;->vibrate(Landroid/os/VibrationEffect;)V

    return-void

    :cond_6
    iget-object v1, p0, Lcom/dof100/morsenotifier/j$2;->b:Lcom/dof100/morsenotifier/j;

    :goto_2
    invoke-static {v1}, Lcom/dof100/morsenotifier/j;->g(Lcom/dof100/morsenotifier/j;)Landroid/os/Vibrator;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Landroid/os/Vibrator;->vibrate([JI)V

    return-void

    :pswitch_1
    aput-wide v6, p1, v5

    iget-object v2, p0, Lcom/dof100/morsenotifier/j$2;->b:Lcom/dof100/morsenotifier/j;

    invoke-static {v2}, Lcom/dof100/morsenotifier/j;->h(Lcom/dof100/morsenotifier/j;)I

    move-result v2

    int-to-long v2, v2

    aput-wide v2, p1, v1

    iget-object v1, p0, Lcom/dof100/morsenotifier/j$2;->b:Lcom/dof100/morsenotifier/j;

    invoke-static {v1}, Lcom/dof100/morsenotifier/j;->h(Lcom/dof100/morsenotifier/j;)I

    move-result v1

    int-to-long v1, v1

    aput-wide v1, p1, v8

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v1, v4, :cond_7

    iget-object v1, p0, Lcom/dof100/morsenotifier/j$2;->b:Lcom/dof100/morsenotifier/j;

    invoke-static {v1}, Lcom/dof100/morsenotifier/j;->g(Lcom/dof100/morsenotifier/j;)Landroid/os/Vibrator;

    move-result-object v1

    goto :goto_1

    :cond_7
    iget-object v1, p0, Lcom/dof100/morsenotifier/j$2;->b:Lcom/dof100/morsenotifier/j;

    goto :goto_2

    :cond_8
    :goto_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v4, :cond_9

    invoke-virtual {p1, v5}, Landroid/media/AudioTrack;->setVolume(F)I

    goto :goto_4

    :cond_9
    invoke-virtual {p1, v5, v5}, Landroid/media/AudioTrack;->setStereoVolume(FF)I

    :goto_4
    invoke-virtual {p1}, Landroid/media/AudioTrack;->stop()V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "MyPlayerMorse.doInBackground onPeriodicNotification i>=nElements instance="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/dof100/morsenotifier/j$2;->b:Lcom/dof100/morsenotifier/j;

    invoke-static {v0}, Lcom/dof100/morsenotifier/j;->b(Lcom/dof100/morsenotifier/j;)I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/j$2;->b:Lcom/dof100/morsenotifier/j;

    invoke-static {p1}, Lcom/dof100/morsenotifier/j;->a(Lcom/dof100/morsenotifier/j;)Ljava/util/concurrent/CountDownLatch;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string p1, "MyPlayerMorse.doInBackground onPeriodicNotification->Exception"

    goto :goto_5

    :catch_1
    const-string p1, "MyPlayerMorse.doInBackground onPeriodicNotification->IllegalStateException"

    :goto_5
    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/j$2;->b:Lcom/dof100/morsenotifier/j;

    invoke-static {p1}, Lcom/dof100/morsenotifier/j;->a(Lcom/dof100/morsenotifier/j;)Ljava/util/concurrent/CountDownLatch;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    :cond_a
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :array_0
    .array-data 8
        0x0
        0x0
        0x0
    .end array-data
.end method
