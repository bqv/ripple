.class Lcom/dof100/morsenotifier/l$1;
.super Landroid/speech/tts/UtteranceProgressListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/dof100/morsenotifier/l;->onInit(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/dof100/morsenotifier/l;


# direct methods
.method constructor <init>(Lcom/dof100/morsenotifier/l;)V
    .locals 0

    iput-object p1, p0, Lcom/dof100/morsenotifier/l$1;->a:Lcom/dof100/morsenotifier/l;

    invoke-direct {p0}, Landroid/speech/tts/UtteranceProgressListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onDone(Ljava/lang/String;)V
    .locals 1

    const-string v0, "MyPlayerTTS UtteranceProgressListener.onDone"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/l$1;->a:Lcom/dof100/morsenotifier/l;

    invoke-static {v0, p1}, Lcom/dof100/morsenotifier/l;->a(Lcom/dof100/morsenotifier/l;Ljava/lang/String;)V

    return-void
.end method

.method public onError(Ljava/lang/String;)V
    .locals 0

    const-string p1, "MyPlayerTTS UtteranceProgressListener.onError"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-void
.end method

.method public onStart(Ljava/lang/String;)V
    .locals 8

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "MyPlayerTTS UtteranceProgressListener.onStart dt=%d"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/dof100/morsenotifier/l$1;->a:Lcom/dof100/morsenotifier/l;

    invoke-static {v4}, Lcom/dof100/morsenotifier/l;->a(Lcom/dof100/morsenotifier/l;)J

    move-result-wide v4

    sub-long v6, v0, v4

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v3, v1

    invoke-static {p1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-void
.end method
