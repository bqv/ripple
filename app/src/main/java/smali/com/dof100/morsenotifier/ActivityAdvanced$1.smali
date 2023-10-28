.class Lcom/dof100/morsenotifier/ActivityAdvanced$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/dof100/morsenotifier/ActivityAdvanced;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/dof100/morsenotifier/ActivityAdvanced;


# direct methods
.method constructor <init>(Lcom/dof100/morsenotifier/ActivityAdvanced;)V
    .locals 0

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityAdvanced$1;->a:Lcom/dof100/morsenotifier/ActivityAdvanced;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced$1;->a:Lcom/dof100/morsenotifier/ActivityAdvanced;

    invoke-static {v0}, Lcom/dof100/morsenotifier/ActivityAdvanced;->a(Lcom/dof100/morsenotifier/ActivityAdvanced;)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced$1;->a:Lcom/dof100/morsenotifier/ActivityAdvanced;

    invoke-static {v0}, Lcom/dof100/morsenotifier/ActivityAdvanced;->b(Lcom/dof100/morsenotifier/ActivityAdvanced;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v1, 0xbb8

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
