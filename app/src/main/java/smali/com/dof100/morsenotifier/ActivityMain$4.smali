.class Lcom/dof100/morsenotifier/ActivityMain$4;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/dof100/morsenotifier/ActivityMain;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/dof100/morsenotifier/ActivityMain;


# direct methods
.method constructor <init>(Lcom/dof100/morsenotifier/ActivityMain;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityMain$4;->b:Lcom/dof100/morsenotifier/ActivityMain;

    iput-object p2, p0, Lcom/dof100/morsenotifier/ActivityMain$4;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityMain$4;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/dof100/morsenotifier/ActivityAdvanced;->c(Landroid/content/Context;)V

    return-void
.end method
