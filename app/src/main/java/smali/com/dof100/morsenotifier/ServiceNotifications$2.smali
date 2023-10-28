.class Lcom/dof100/morsenotifier/ServiceNotifications$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/dof100/morsenotifier/ServiceNotifications;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/dof100/morsenotifier/ServiceNotifications;


# direct methods
.method constructor <init>(Lcom/dof100/morsenotifier/ServiceNotifications;)V
    .locals 0

    iput-object p1, p0, Lcom/dof100/morsenotifier/ServiceNotifications$2;->a:Lcom/dof100/morsenotifier/ServiceNotifications;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    const-string v0, "ServiceNotifications.rSendNotification handler"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ServiceNotifications$2;->a:Lcom/dof100/morsenotifier/ServiceNotifications;

    invoke-static {v0}, Lcom/dof100/morsenotifier/ServiceNotifications;->b(Lcom/dof100/morsenotifier/ServiceNotifications;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/dof100/morsenotifier/ServiceNotifications$2;->a:Lcom/dof100/morsenotifier/ServiceNotifications;

    invoke-static {v0}, Lcom/dof100/morsenotifier/ServiceNotifications;->c(Lcom/dof100/morsenotifier/ServiceNotifications;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v1, 0xbb8

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method
