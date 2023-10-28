.class Lcom/dof100/morsenotifier/ActivityAppFilter$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/dof100/morsenotifier/ActivityAppFilter;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/dof100/morsenotifier/ActivityAppFilter;


# direct methods
.method constructor <init>(Lcom/dof100/morsenotifier/ActivityAppFilter;I)V
    .locals 0

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter$1;->b:Lcom/dof100/morsenotifier/ActivityAppFilter;

    iput p2, p0, Lcom/dof100/morsenotifier/ActivityAppFilter$1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter$1;->a:I

    if-ltz v0, :cond_0

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter$1;->b:Lcom/dof100/morsenotifier/ActivityAppFilter;

    invoke-static {v0}, Lcom/dof100/morsenotifier/ActivityAppFilter;->a(Lcom/dof100/morsenotifier/ActivityAppFilter;)Landroid/widget/Spinner;

    move-result-object v0

    iget v1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter$1;->a:I

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setSelection(I)V

    :cond_0
    return-void
.end method
