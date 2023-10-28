.class Lcom/dof100/morsenotifier/ActivityDisplayMessage$1$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/dof100/morsenotifier/ActivityDisplayMessage$1;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/dof100/morsenotifier/ActivityDisplayMessage$1;


# direct methods
.method constructor <init>(Lcom/dof100/morsenotifier/ActivityDisplayMessage$1;I)V
    .locals 0

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage$1$1;->b:Lcom/dof100/morsenotifier/ActivityDisplayMessage$1;

    iput p2, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage$1$1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage$1$1;->b:Lcom/dof100/morsenotifier/ActivityDisplayMessage$1;

    iget-object v0, v0, Lcom/dof100/morsenotifier/ActivityDisplayMessage$1;->a:Lcom/dof100/morsenotifier/ActivityDisplayMessage;

    invoke-static {v0}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->c(Lcom/dof100/morsenotifier/ActivityDisplayMessage;)Lcom/dof100/morsenotifier/s;

    move-result-object v0

    iget v1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage$1$1;->a:I

    invoke-virtual {v0, v1}, Lcom/dof100/morsenotifier/s;->a(I)V

    return-void
.end method
