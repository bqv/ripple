.class Lcom/dof100/morsenotifier/ActivityMain$7;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/dof100/morsenotifier/ActivityMain;->e()V
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

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityMain$7;->a:Lcom/dof100/morsenotifier/ActivityMain;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    new-instance p1, Landroid/content/Intent;

    const-string p2, "android.intent.action.VIEW"

    invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string p2, "market://search?q=pdf"

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object p1

    :try_start_0
    iget-object p2, p0, Lcom/dof100/morsenotifier/ActivityMain$7;->a:Lcom/dof100/morsenotifier/ActivityMain;

    invoke-virtual {p2, p1}, Lcom/dof100/morsenotifier/ActivityMain;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityMain$7;->a:Lcom/dof100/morsenotifier/ActivityMain;

    const-string p2, "Could not open Google Play"

    invoke-static {p1, p2}, Lcom/dof100/morsenotifier/i;->b(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method
