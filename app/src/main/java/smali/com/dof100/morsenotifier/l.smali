.class Lcom/dof100/morsenotifier/l;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/speech/tts/TextToSpeech$OnInitListener;


# instance fields
.field public a:I

.field public b:Landroid/speech/tts/TextToSpeech;

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:Ljava/lang/String;

.field private i:Z

.field private j:J

.field private k:I

.field private l:J

.field private m:Ljava/lang/String;

.field private n:I

.field private o:D

.field private final p:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method constructor <init>(Landroid/content/Context;I)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/dof100/morsenotifier/l;->d:I

    const/4 v1, 0x1

    iput v1, p0, Lcom/dof100/morsenotifier/l;->e:I

    iput v0, p0, Lcom/dof100/morsenotifier/l;->f:I

    const/4 v2, -0x1

    iput v2, p0, Lcom/dof100/morsenotifier/l;->g:I

    const-string v3, ""

    iput-object v3, p0, Lcom/dof100/morsenotifier/l;->h:Ljava/lang/String;

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/l;->i:Z

    const-wide/16 v3, 0x0

    iput-wide v3, p0, Lcom/dof100/morsenotifier/l;->j:J

    iput-wide v3, p0, Lcom/dof100/morsenotifier/l;->l:J

    const-string v3, ""

    iput-object v3, p0, Lcom/dof100/morsenotifier/l;->m:Ljava/lang/String;

    iput v0, p0, Lcom/dof100/morsenotifier/l;->n:I

    const-wide/high16 v3, 0x4059000000000000L    # 100.0

    iput-wide v3, p0, Lcom/dof100/morsenotifier/l;->o:D

    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Lcom/dof100/morsenotifier/l;->p:Ljava/util/concurrent/CountDownLatch;

    iput p2, p0, Lcom/dof100/morsenotifier/l;->c:I

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "MyPlayerTTS.constructor instance="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/dof100/morsenotifier/l;->c:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iput v2, p0, Lcom/dof100/morsenotifier/l;->a:I

    iput v2, p0, Lcom/dof100/morsenotifier/l;->k:I

    monitor-enter p0

    :try_start_0
    new-instance p2, Landroid/speech/tts/TextToSpeech;

    invoke-direct {p2, p1, p0}, Landroid/speech/tts/TextToSpeech;-><init>(Landroid/content/Context;Landroid/speech/tts/TextToSpeech$OnInitListener;)V

    iput-object p2, p0, Lcom/dof100/morsenotifier/l;->b:Landroid/speech/tts/TextToSpeech;

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method static synthetic a(Lcom/dof100/morsenotifier/l;)J
    .locals 2

    iget-wide v0, p0, Lcom/dof100/morsenotifier/l;->j:J

    return-wide v0
.end method

.method static synthetic a(Lcom/dof100/morsenotifier/l;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/dof100/morsenotifier/l;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 12

    const-string v0, "MyPlayerTTS UtteranceProgressListener.onFinish"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/dof100/morsenotifier/l;->l:J

    sub-long v4, v0, v2

    iget-object v0, p0, Lcom/dof100/morsenotifier/l;->m:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "MyPlayerTTS UtteranceProgressListener.onFinish ERROR %s != %s"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p1, v4, v2

    iget-object p1, p0, Lcom/dof100/morsenotifier/l;->m:Ljava/lang/String;

    aput-object p1, v4, v1

    invoke-static {v0, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    goto :goto_3

    :cond_0
    const-wide/16 v6, 0x0

    cmp-long p1, v4, v6

    if-ltz p1, :cond_3

    const-wide/32 v6, 0x186a0

    cmp-long p1, v4, v6

    if-lez p1, :cond_1

    goto :goto_1

    :cond_1
    iget p1, p0, Lcom/dof100/morsenotifier/l;->n:I

    if-gtz p1, :cond_2

    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v0, "MyPlayerTTS UtteranceProgressListener.onFinish ERROR mTTSPlayStartLength = %d <=0"

    new-array v1, v1, [Ljava/lang/Object;

    iget v3, p0, Lcom/dof100/morsenotifier/l;->n:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    goto :goto_2

    :cond_2
    iget-wide v6, p0, Lcom/dof100/morsenotifier/l;->o:D

    const-wide/high16 v8, 0x3fe0000000000000L    # 0.5

    mul-double v6, v6, v8

    iget p1, p0, Lcom/dof100/morsenotifier/l;->n:I

    int-to-long v10, p1

    div-long/2addr v4, v10

    long-to-double v3, v4

    mul-double v3, v3, v8

    add-double/2addr v6, v3

    iput-wide v6, p0, Lcom/dof100/morsenotifier/l;->o:D

    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v0, "MyPlayerTTS UtteranceProgressListener.onFinish mAverageCharDuration adjusted to %f "

    new-array v1, v1, [Ljava/lang/Object;

    iget-wide v3, p0, Lcom/dof100/morsenotifier/l;->o:D

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    aput-object v3, v1, v2

    goto :goto_2

    :cond_3
    :goto_1
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v0, "MyPlayerTTS UtteranceProgressListener.onFinish ERROR dt = %d (out of limits)"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v1, v2

    :goto_2
    invoke-static {p1, v0, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :goto_3
    iget-object p1, p0, Lcom/dof100/morsenotifier/l;->p:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method private a(Ljava/lang/String;FF)V
    .locals 12

    const/4 v0, -0x1

    iput v0, p0, Lcom/dof100/morsenotifier/l;->k:I

    iget-object v0, p0, Lcom/dof100/morsenotifier/l;->b:Landroid/speech/tts/TextToSpeech;

    if-nez v0, :cond_0

    const-string p1, "MyPlayerTTS.tts_set_locale. mTTS=null"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    iget v0, p0, Lcom/dof100/morsenotifier/l;->a:I

    if-eqz v0, :cond_1

    const-string p1, "MyPlayerTTS.tts_set_locale. mTTSStatus!=TextToSpeech.SUCCESS"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-static {}, Ljava/util/Locale;->getAvailableLocales()[Ljava/util/Locale;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_5

    aget-object v4, v0, v3

    invoke-virtual {v4}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_2

    goto/16 :goto_2

    :cond_2
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "MyPlayerTTS.tts_set_locale Found selected locale[%d/%d]=%s"

    const/4 v7, 0x3

    new-array v8, v7, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v8, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const/4 v10, 0x1

    aput-object v9, v8, v10

    invoke-virtual {v4}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v9

    const/4 v11, 0x2

    aput-object v9, v8, v11

    invoke-static {v5, v6, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v5, p0, Lcom/dof100/morsenotifier/l;->b:Landroid/speech/tts/TextToSpeech;

    invoke-virtual {v5, v4}, Landroid/speech/tts/TextToSpeech;->isLanguageAvailable(Ljava/util/Locale;)I

    move-result v5

    if-ge v5, v10, :cond_3

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "MyPlayerTTS.tts_set_locale ERROR: Selected locale[%d/%d]=%s not available"

    new-array v7, v7, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v7, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v7, v10

    invoke-virtual {v4}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v7, v11

    :goto_1
    invoke-static {v5, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "MyPlayerTTS.tts_set_locale Selected locale [%d/%d]=%s is available"

    new-array v8, v7, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v8, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v8, v10

    invoke-virtual {v4}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v8, v11

    invoke-static {v5, v6, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v5, p0, Lcom/dof100/morsenotifier/l;->b:Landroid/speech/tts/TextToSpeech;

    invoke-virtual {v5, v4}, Landroid/speech/tts/TextToSpeech;->setLanguage(Ljava/util/Locale;)I

    move-result v5

    if-ge v5, v10, :cond_4

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "MyPlayerTTS.tts_set_locale ERROR: Selected locale[%d/%d]=%s cannot be set"

    new-array v7, v7, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v7, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v7, v10

    invoke-virtual {v4}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v7, v11

    goto :goto_1

    :cond_4
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "MyPlayerTTS.tts_set_locale Selected locale[%d/%d]=%s set OK"

    new-array v7, v7, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v7, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v7, v10

    invoke-virtual {v4}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v7, v11

    invoke-static {v5, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iput v2, p0, Lcom/dof100/morsenotifier/l;->k:I

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_5
    iget-object p1, p0, Lcom/dof100/morsenotifier/l;->b:Landroid/speech/tts/TextToSpeech;

    invoke-virtual {p1, p2}, Landroid/speech/tts/TextToSpeech;->setPitch(F)I

    iget-object p1, p0, Lcom/dof100/morsenotifier/l;->b:Landroid/speech/tts/TextToSpeech;

    invoke-virtual {p1, p3}, Landroid/speech/tts/TextToSpeech;->setSpeechRate(F)I

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MyPlayerTTS.playDone instance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/dof100/morsenotifier/l;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/dof100/morsenotifier/l;->i:Z

    if-nez v0, :cond_0

    const-string v0, "MyPlayerTTS.playDone ERROR mPlayInitOK = false"

    invoke-static {p1, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_0
    iget p1, p0, Lcom/dof100/morsenotifier/l;->e:I

    mul-int/lit8 p1, p1, 0x2

    int-to-double v0, p1

    iget-wide v2, p0, Lcom/dof100/morsenotifier/l;->o:D

    iget-object p1, p0, Lcom/dof100/morsenotifier/l;->h:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    int-to-double v4, p1

    mul-double v2, v2, v4

    mul-double v0, v0, v2

    double-to-int p1, v0

    add-int/lit16 p1, p1, 0x1388

    int-to-long v0, p1

    const-wide/16 v2, 0x7530

    cmp-long p1, v0, v2

    if-lez p1, :cond_1

    move-wide v0, v2

    :cond_1
    const-wide/16 v2, 0x3e8

    cmp-long p1, v0, v2

    if-gez p1, :cond_2

    move-wide v0, v2

    :cond_2
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "MyPlayerTTS.playDone Waiting to finish (max %d msec)"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {p1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    :try_start_0
    iget-object p1, p0, Lcom/dof100/morsenotifier/l;->p:Ljava/util/concurrent/CountDownLatch;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/InterruptedException;->printStackTrace()V

    :goto_0
    const-string p1, "MyPlayerTTS.playDone Waiting OK"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "MyPlayerTTS.playDone OUT instance="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/dof100/morsenotifier/l;->c:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-void
.end method

.method public a(Landroid/content/Context;IILjava/lang/String;IIIILjava/lang/String;)V
    .locals 13

    move-object v1, p0

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "MyPlayerTTS.playInit inst=%d arepeat=%d"

    const/4 v4, 0x2

    new-array v5, v4, [Ljava/lang/Object;

    iget v6, v1, Lcom/dof100/morsenotifier/l;->c:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v7, 0x0

    aput-object v6, v5, v7

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v8, 0x1

    aput-object v6, v5, v8

    invoke-static {v2, v3, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    move v2, p2

    iput v2, v1, Lcom/dof100/morsenotifier/l;->d:I

    move/from16 v2, p3

    iput v2, v1, Lcom/dof100/morsenotifier/l;->e:I

    move/from16 v2, p7

    iput v2, v1, Lcom/dof100/morsenotifier/l;->f:I

    move/from16 v2, p8

    iput v2, v1, Lcom/dof100/morsenotifier/l;->g:I

    move-object/from16 v2, p9

    iput-object v2, v1, Lcom/dof100/morsenotifier/l;->h:Ljava/lang/String;

    iput-boolean v7, v1, Lcom/dof100/morsenotifier/l;->i:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v1, Lcom/dof100/morsenotifier/l;->j:J

    monitor-enter p0

    :try_start_0
    iget-object v2, v1, Lcom/dof100/morsenotifier/l;->b:Landroid/speech/tts/TextToSpeech;

    if-nez v2, :cond_0

    const-string v2, "MyMorsePlayer.playInit ERROR TextToSpeech=null"

    move-object v3, p1

    invoke-static {v3, v2}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    monitor-exit p0

    return-void

    :cond_0
    iget v2, v1, Lcom/dof100/morsenotifier/l;->e:I

    if-gez v2, :cond_1

    iget-wide v2, v1, Lcom/dof100/morsenotifier/l;->o:D

    iget-object v5, v1, Lcom/dof100/morsenotifier/l;->h:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    int-to-double v5, v5

    mul-double v2, v2, v5

    double-to-int v2, v2

    iget v3, v1, Lcom/dof100/morsenotifier/l;->e:I

    mul-int/lit16 v3, v3, 0x3e8

    div-int/2addr v3, v2

    neg-int v2, v3

    iput v2, v1, Lcom/dof100/morsenotifier/l;->e:I

    iget v2, v1, Lcom/dof100/morsenotifier/l;->e:I

    add-int/2addr v2, v8

    iput v2, v1, Lcom/dof100/morsenotifier/l;->e:I

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "MyPlayerTTS.playInit Actual Repeat = %d"

    new-array v5, v8, [Ljava/lang/Object;

    iget v6, v1, Lcom/dof100/morsenotifier/l;->e:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v7

    invoke-static {v2, v3, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    :cond_1
    move/from16 v2, p6

    int-to-float v2, v2

    const/high16 v3, 0x42c80000    # 100.0f

    div-float/2addr v2, v3

    move/from16 v5, p5

    int-to-float v5, v5

    div-float/2addr v5, v3

    move-object/from16 v3, p4

    invoke-direct {v1, v3, v2, v5}, Lcom/dof100/morsenotifier/l;->a(Ljava/lang/String;FF)V

    iput-boolean v8, v1, Lcom/dof100/morsenotifier/l;->i:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "MyPlayerTTS.playInit OUT instance=%d  dt=%d"

    new-array v4, v4, [Ljava/lang/Object;

    iget v9, v1, Lcom/dof100/morsenotifier/l;->c:I

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v4, v7

    iget-wide v9, v1, Lcom/dof100/morsenotifier/l;->j:J

    const/4 v7, 0x0

    sub-long v11, v2, v9

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v4, v8

    invoke-static {v5, v6, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2
.end method

.method public b(Landroid/content/Context;)V
    .locals 11

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MyPlayerTTS.play instance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/dof100/morsenotifier/l;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "  text="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/dof100/morsenotifier/l;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/dof100/morsenotifier/l;->b:Landroid/speech/tts/TextToSpeech;

    if-nez v0, :cond_0

    const-string v0, "MyPlayerTTS.play ERROR mTTS=null"

    invoke-static {p1, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    monitor-exit p0

    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/dof100/morsenotifier/l;->i:Z

    if-nez v0, :cond_1

    const-string v0, "MyPlayerTTS.play ERROR mPlayInitOK = false"

    invoke-static {p1, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    monitor-exit p0

    return-void

    :cond_1
    iget v0, p0, Lcom/dof100/morsenotifier/l;->a:I

    if-eqz v0, :cond_2

    const-string v0, "MyPlayerTTS.play ERROR TTS not ready"

    invoke-static {p1, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    monitor-exit p0

    return-void

    :cond_2
    iget v0, p0, Lcom/dof100/morsenotifier/l;->k:I

    if-eqz v0, :cond_3

    const-string v0, "MyPlayerTTS.play ERROR Locale not ready"

    invoke-static {p1, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    monitor-exit p0

    return-void

    :cond_3
    iget v0, p0, Lcom/dof100/morsenotifier/l;->d:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lez v0, :cond_5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/dof100/morsenotifier/l;->j:J

    const/4 v0, 0x0

    sub-long v8, v4, v6

    iget v0, p0, Lcom/dof100/morsenotifier/l;->d:I

    int-to-long v4, v0

    sub-long v6, v4, v8

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "MyPlayerTTS.play Waiting %d-%d=%d msec"

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/Object;

    iget v10, p0, Lcom/dof100/morsenotifier/l;->d:I

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v5, v2

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    aput-object v8, v5, v3

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    aput-object v8, v5, v1

    invoke-static {v0, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v4, 0x0

    cmp-long p1, v6, v4

    if-lez p1, :cond_4

    const-wide/16 v4, 0x2710

    cmp-long p1, v6, v4

    if-gez p1, :cond_4

    :try_start_1
    invoke-static {v6, v7}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_2
    invoke-virtual {p1}, Ljava/lang/InterruptedException;->printStackTrace()V

    :cond_4
    :goto_0
    const-string p1, "MyPlayerTTS.play Waiting finished"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    :cond_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v0, "MyPlayerTTS.play TTS after initialdelay dt=%d"

    new-array v6, v3, [Ljava/lang/Object;

    iget-wide v7, p0, Lcom/dof100/morsenotifier/l;->j:J

    const/4 v9, 0x0

    sub-long v9, v4, v7

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v6, v2

    invoke-static {p1, v0, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v0, "id_%d_%d"

    new-array v4, v1, [Ljava/lang/Object;

    iget v5, p0, Lcom/dof100/morsenotifier/l;->c:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v3

    invoke-static {p1, v0, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/dof100/morsenotifier/l;->m:Ljava/lang/String;

    iget-object p1, p0, Lcom/dof100/morsenotifier/l;->h:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    iput p1, p0, Lcom/dof100/morsenotifier/l;->n:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/dof100/morsenotifier/l;->l:J

    iget p1, p0, Lcom/dof100/morsenotifier/l;->e:I

    const/16 v0, 0xa

    if-le p1, v0, :cond_6

    iput v0, p0, Lcom/dof100/morsenotifier/l;->e:I

    :cond_6
    iget p1, p0, Lcom/dof100/morsenotifier/l;->e:I

    if-le p1, v0, :cond_7

    const/16 p1, 0xa

    :cond_7
    const/4 v0, 0x0

    :goto_1
    if-ge v0, p1, :cond_9

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "id_%d_%d"

    new-array v6, v1, [Ljava/lang/Object;

    iget v7, p0, Lcom/dof100/morsenotifier/l;->c:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v3

    invoke-static {v4, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x15

    const/high16 v7, 0x42c80000    # 100.0f

    if-lt v5, v6, :cond_8

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    const-string v6, "volume"

    iget v8, p0, Lcom/dof100/morsenotifier/l;->f:I

    int-to-float v8, v8

    div-float/2addr v8, v7

    invoke-virtual {v5, v6, v8}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    const-string v6, "streamType"

    iget v7, p0, Lcom/dof100/morsenotifier/l;->g:I

    invoke-virtual {v5, v6, v7}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v6, "utteranceId"

    invoke-virtual {v5, v6, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v6, p0, Lcom/dof100/morsenotifier/l;->b:Landroid/speech/tts/TextToSpeech;

    iget-object v7, p0, Lcom/dof100/morsenotifier/l;->h:Ljava/lang/String;

    invoke-virtual {v6, v7, v3, v5, v4}, Landroid/speech/tts/TextToSpeech;->speak(Ljava/lang/CharSequence;ILandroid/os/Bundle;Ljava/lang/String;)I

    goto :goto_2

    :cond_8
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    const-string v6, "volume"

    iget v8, p0, Lcom/dof100/morsenotifier/l;->f:I

    int-to-float v8, v8

    div-float/2addr v8, v7

    invoke-static {v8}, Ljava/lang/Float;->toHexString(F)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "streamType"

    iget v7, p0, Lcom/dof100/morsenotifier/l;->g:I

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "utteranceId"

    invoke-virtual {v5, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, p0, Lcom/dof100/morsenotifier/l;->b:Landroid/speech/tts/TextToSpeech;

    iget-object v6, p0, Lcom/dof100/morsenotifier/l;->h:Ljava/lang/String;

    invoke-virtual {v4, v6, v3, v5}, Landroid/speech/tts/TextToSpeech;->speak(Ljava/lang/String;ILjava/util/HashMap;)I

    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_9
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public onInit(I)V
    .locals 1

    iput p1, p0, Lcom/dof100/morsenotifier/l;->a:I

    monitor-enter p0

    :try_start_0
    iget-object p1, p0, Lcom/dof100/morsenotifier/l;->b:Landroid/speech/tts/TextToSpeech;

    if-nez p1, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    iget p1, p0, Lcom/dof100/morsenotifier/l;->a:I

    if-eqz p1, :cond_1

    const-string p1, "MyPlayerTTS.constructor.onInit. ERROR mTTSStatus!=SUCESS"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    monitor-exit p0

    return-void

    :cond_1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0xf

    if-lt p1, v0, :cond_2

    const-string p1, "MyPlayerTTS.onInit Set setOnUtteranceProgressListener"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object p1, p0, Lcom/dof100/morsenotifier/l;->b:Landroid/speech/tts/TextToSpeech;

    new-instance v0, Lcom/dof100/morsenotifier/l$1;

    invoke-direct {v0, p0}, Lcom/dof100/morsenotifier/l$1;-><init>(Lcom/dof100/morsenotifier/l;)V

    invoke-virtual {p1, v0}, Landroid/speech/tts/TextToSpeech;->setOnUtteranceProgressListener(Landroid/speech/tts/UtteranceProgressListener;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    :cond_2
    const-string p1, "MyPlayerTTS.onInit Set OnUtteranceCompletedListener"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/l;->b:Landroid/speech/tts/TextToSpeech;

    new-instance v0, Lcom/dof100/morsenotifier/l$2;

    invoke-direct {v0, p0}, Lcom/dof100/morsenotifier/l$2;-><init>(Lcom/dof100/morsenotifier/l;)V

    invoke-virtual {p1, v0}, Landroid/speech/tts/TextToSpeech;->setOnUtteranceCompletedListener(Landroid/speech/tts/TextToSpeech$OnUtteranceCompletedListener;)I

    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method
