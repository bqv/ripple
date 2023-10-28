.class Lcom/dof100/morsenotifier/l$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/speech/tts/TextToSpeech$OnUtteranceCompletedListener;


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

    iput-object p1, p0, Lcom/dof100/morsenotifier/l$2;->a:Lcom/dof100/morsenotifier/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onUtteranceCompleted(Ljava/lang/String;)V
    .locals 1

    const-string v0, "MyPlayerTTS OnUtteranceCompletedListener.onUtteranceCompleted"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/l$2;->a:Lcom/dof100/morsenotifier/l;

    invoke-static {v0, p1}, Lcom/dof100/morsenotifier/l;->a(Lcom/dof100/morsenotifier/l;Ljava/lang/String;)V

    return-void
.end method
