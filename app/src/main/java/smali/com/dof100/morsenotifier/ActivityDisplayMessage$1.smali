.class Lcom/dof100/morsenotifier/ActivityDisplayMessage$1;
.super Landroid/content/BroadcastReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/dof100/morsenotifier/ActivityDisplayMessage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/dof100/morsenotifier/ActivityDisplayMessage;


# direct methods
.method constructor <init>(Lcom/dof100/morsenotifier/ActivityDisplayMessage;)V
    .locals 0

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage$1;->a:Lcom/dof100/morsenotifier/ActivityDisplayMessage;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    const-string p1, "LBR_ACTION_SETPOS"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "LBR_ACTION_DATA_POS"

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    if-ltz p1, :cond_0

    mul-int/lit8 p2, p1, 0x2

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage$1;->a:Lcom/dof100/morsenotifier/ActivityDisplayMessage;

    invoke-static {v0}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->a(Lcom/dof100/morsenotifier/ActivityDisplayMessage;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p2, v0, :cond_0

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage$1;->a:Lcom/dof100/morsenotifier/ActivityDisplayMessage;

    invoke-static {v0}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->a(Lcom/dof100/morsenotifier/ActivityDisplayMessage;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/4 v0, -0x8

    if-ne p2, v0, :cond_0

    const-string p2, "ActivityDisplayMessage.BroadcastReceiver  got LBR_ACTION_SETPOS -> MORSE_ELEMENT_STOP"

    invoke-static {p2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage$1;->a:Lcom/dof100/morsenotifier/ActivityDisplayMessage;

    invoke-static {p2}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->b(Lcom/dof100/morsenotifier/ActivityDisplayMessage;)V

    :cond_0
    iget-object p2, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage$1;->a:Lcom/dof100/morsenotifier/ActivityDisplayMessage;

    invoke-static {p2}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->c(Lcom/dof100/morsenotifier/ActivityDisplayMessage;)Lcom/dof100/morsenotifier/s;

    move-result-object p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage$1;->a:Lcom/dof100/morsenotifier/ActivityDisplayMessage;

    invoke-static {p2}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->d(Lcom/dof100/morsenotifier/ActivityDisplayMessage;)Landroid/opengl/GLSurfaceView;

    move-result-object p2

    new-instance v0, Lcom/dof100/morsenotifier/ActivityDisplayMessage$1$1;

    invoke-direct {v0, p0, p1}, Lcom/dof100/morsenotifier/ActivityDisplayMessage$1$1;-><init>(Lcom/dof100/morsenotifier/ActivityDisplayMessage$1;I)V

    invoke-virtual {p2, v0}, Landroid/opengl/GLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage$1;->a:Lcom/dof100/morsenotifier/ActivityDisplayMessage;

    invoke-static {p1}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->d(Lcom/dof100/morsenotifier/ActivityDisplayMessage;)Landroid/opengl/GLSurfaceView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/opengl/GLSurfaceView;->invalidate()V

    :cond_1
    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage$1;->a:Lcom/dof100/morsenotifier/ActivityDisplayMessage;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->a(Lcom/dof100/morsenotifier/ActivityDisplayMessage;J)J

    return-void

    :cond_2
    const-string p1, "LBR_ACTION_FINISH"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "ActivityDisplayMessage.BroadcastReceiver LBR_ACTION_FINISH instance="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage$1;->a:Lcom/dof100/morsenotifier/ActivityDisplayMessage;

    invoke-static {p2}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->e(Lcom/dof100/morsenotifier/ActivityDisplayMessage;)I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "ActivityDisplayMessage.BroadcastReceiver  got LBR_ACTION_FINISH  (stopping) instance="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage$1;->a:Lcom/dof100/morsenotifier/ActivityDisplayMessage;

    invoke-static {p2}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->e(Lcom/dof100/morsenotifier/ActivityDisplayMessage;)I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage$1;->a:Lcom/dof100/morsenotifier/ActivityDisplayMessage;

    invoke-static {p1}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->b(Lcom/dof100/morsenotifier/ActivityDisplayMessage;)V

    :cond_3
    return-void
.end method
