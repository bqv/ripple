.class Lcom/dof100/morsenotifier/ActivityDisplayMessage$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


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

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage$2;->a:Lcom/dof100/morsenotifier/ActivityDisplayMessage;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage$2;->a:Lcom/dof100/morsenotifier/ActivityDisplayMessage;

    invoke-static {v2}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->f(Lcom/dof100/morsenotifier/ActivityDisplayMessage;)J

    move-result-wide v2

    sub-long v4, v0, v2

    const-wide/16 v0, 0x2328

    cmp-long v2, v4, v0

    if-lez v2, :cond_0

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage$2;->a:Lcom/dof100/morsenotifier/ActivityDisplayMessage;

    invoke-virtual {v0}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "ActivityDisplayMessage mLastTime) > DELAY_MSEC"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage$2;->a:Lcom/dof100/morsenotifier/ActivityDisplayMessage;

    invoke-static {v0}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->b(Lcom/dof100/morsenotifier/ActivityDisplayMessage;)V

    :cond_0
    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage$2;->a:Lcom/dof100/morsenotifier/ActivityDisplayMessage;

    invoke-static {v0}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->g(Lcom/dof100/morsenotifier/ActivityDisplayMessage;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v1, 0x3e8

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
