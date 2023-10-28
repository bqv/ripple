.class Lcom/dof100/morsenotifier/ActivityMain$9;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/dof100/morsenotifier/ActivityMain;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/dof100/morsenotifier/ActivityMain;


# direct methods
.method constructor <init>(Lcom/dof100/morsenotifier/ActivityMain;)V
    .locals 0

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityMain$9;->a:Lcom/dof100/morsenotifier/ActivityMain;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    const-string p1, "ActivityMain.checkNotificationAccess: collector is not running. Opening settings..."

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x16

    const-string p1, "android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"

    iget-object p2, p0, Lcom/dof100/morsenotifier/ActivityMain$9;->a:Lcom/dof100/morsenotifier/ActivityMain;

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lcom/dof100/morsenotifier/ActivityMain;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
