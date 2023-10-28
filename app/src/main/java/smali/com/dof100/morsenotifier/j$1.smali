.class Lcom/dof100/morsenotifier/j$1;
.super Landroid/content/BroadcastReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/dof100/morsenotifier/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/dof100/morsenotifier/j;


# direct methods
.method constructor <init>(Lcom/dof100/morsenotifier/j;)V
    .locals 0

    iput-object p1, p0, Lcom/dof100/morsenotifier/j$1;->a:Lcom/dof100/morsenotifier/j;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    const-string v0, "LBR_ACTION_FINISH"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p2, "MyPlayerMorse.BroadcastReceiver  got ACTION_FINISH "

    invoke-static {p1, p2}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/j$1;->a:Lcom/dof100/morsenotifier/j;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/dof100/morsenotifier/j;->a(Lcom/dof100/morsenotifier/j;Z)Z

    iget-object p1, p0, Lcom/dof100/morsenotifier/j$1;->a:Lcom/dof100/morsenotifier/j;

    invoke-static {p1}, Lcom/dof100/morsenotifier/j;->a(Lcom/dof100/morsenotifier/j;)Ljava/util/concurrent/CountDownLatch;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    :cond_0
    return-void
.end method
