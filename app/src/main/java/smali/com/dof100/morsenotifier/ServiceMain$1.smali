.class Lcom/dof100/morsenotifier/ServiceMain$1;
.super Landroid/content/BroadcastReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/dof100/morsenotifier/ServiceMain;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/dof100/morsenotifier/ServiceMain;


# direct methods
.method constructor <init>(Lcom/dof100/morsenotifier/ServiceMain;)V
    .locals 0

    iput-object p1, p0, Lcom/dof100/morsenotifier/ServiceMain$1;->a:Lcom/dof100/morsenotifier/ServiceMain;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    const-string p1, "LBR_ACTION_SETTINGSCHANGED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "ServiceMain.BroadcastReceiver got LBR_ACTION_SETTINGSCHANGED"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const-string p1, "ServiceMain.BroadcastReceiver pref_init"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/ServiceMain$1;->a:Lcom/dof100/morsenotifier/ServiceMain;

    invoke-static {p1}, Lcom/dof100/morsenotifier/ServiceMain;->a(Lcom/dof100/morsenotifier/ServiceMain;)V

    invoke-static {}, Lcom/dof100/morsenotifier/g;->a()V

    iget-object p1, p0, Lcom/dof100/morsenotifier/ServiceMain$1;->a:Lcom/dof100/morsenotifier/ServiceMain;

    invoke-static {p1}, Lcom/dof100/morsenotifier/g;->a(Landroid/content/Context;)V

    :cond_0
    return-void
.end method
