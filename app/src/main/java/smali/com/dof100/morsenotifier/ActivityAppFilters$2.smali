.class Lcom/dof100/morsenotifier/ActivityAppFilters$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/dof100/morsenotifier/ActivityAppFilters;->a(Lcom/dof100/morsenotifier/a;ILandroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/dof100/morsenotifier/a;

.field final synthetic b:Lcom/dof100/morsenotifier/ActivityAppFilters;


# direct methods
.method constructor <init>(Lcom/dof100/morsenotifier/ActivityAppFilters;Lcom/dof100/morsenotifier/a;)V
    .locals 0

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityAppFilters$2;->b:Lcom/dof100/morsenotifier/ActivityAppFilters;

    iput-object p2, p0, Lcom/dof100/morsenotifier/ActivityAppFilters$2;->a:Lcom/dof100/morsenotifier/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget-object p2, p0, Lcom/dof100/morsenotifier/ActivityAppFilters$2;->b:Lcom/dof100/morsenotifier/ActivityAppFilters;

    invoke-static {p2}, Lcom/dof100/morsenotifier/ActivityAppFilters;->a(Lcom/dof100/morsenotifier/ActivityAppFilters;)Lcom/dof100/morsenotifier/c;

    move-result-object p2

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilters$2;->a:Lcom/dof100/morsenotifier/a;

    invoke-virtual {p2, v0}, Lcom/dof100/morsenotifier/c;->remove(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/dof100/morsenotifier/ActivityAppFilters$2;->b:Lcom/dof100/morsenotifier/ActivityAppFilters;

    invoke-static {p2}, Lcom/dof100/morsenotifier/ActivityAppFilters;->b(Lcom/dof100/morsenotifier/ActivityAppFilters;)Lcom/dof100/morsenotifier/b;

    move-result-object p2

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilters$2;->b:Lcom/dof100/morsenotifier/ActivityAppFilters;

    invoke-virtual {p2, v0}, Lcom/dof100/morsenotifier/b;->b(Landroid/content/Context;)V

    iget-object p2, p0, Lcom/dof100/morsenotifier/ActivityAppFilters$2;->b:Lcom/dof100/morsenotifier/ActivityAppFilters;

    invoke-static {p2}, Lcom/dof100/morsenotifier/ActivityAppFilters;->a(Lcom/dof100/morsenotifier/ActivityAppFilters;)Lcom/dof100/morsenotifier/c;

    move-result-object p2

    invoke-virtual {p2}, Lcom/dof100/morsenotifier/c;->notifyDataSetChanged()V

    iget-object p2, p0, Lcom/dof100/morsenotifier/ActivityAppFilters$2;->b:Lcom/dof100/morsenotifier/ActivityAppFilters;

    invoke-static {p2}, Lcom/dof100/morsenotifier/ActivityAppFilters;->c(Lcom/dof100/morsenotifier/ActivityAppFilters;)Landroid/widget/ListView;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/ListView;->invalidate()V

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method
