.class Lcom/dof100/morsenotifier/ActivityReminders$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/dof100/morsenotifier/ActivityReminders;->a(Lcom/dof100/morsenotifier/p;ILandroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/dof100/morsenotifier/p;

.field final synthetic b:Lcom/dof100/morsenotifier/ActivityReminders;


# direct methods
.method constructor <init>(Lcom/dof100/morsenotifier/ActivityReminders;Lcom/dof100/morsenotifier/p;)V
    .locals 0

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityReminders$2;->b:Lcom/dof100/morsenotifier/ActivityReminders;

    iput-object p2, p0, Lcom/dof100/morsenotifier/ActivityReminders$2;->a:Lcom/dof100/morsenotifier/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget-object p2, p0, Lcom/dof100/morsenotifier/ActivityReminders$2;->b:Lcom/dof100/morsenotifier/ActivityReminders;

    invoke-static {p2}, Lcom/dof100/morsenotifier/ActivityReminders;->a(Lcom/dof100/morsenotifier/ActivityReminders;)Lcom/dof100/morsenotifier/r;

    move-result-object p2

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityReminders$2;->a:Lcom/dof100/morsenotifier/p;

    invoke-virtual {p2, v0}, Lcom/dof100/morsenotifier/r;->remove(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/dof100/morsenotifier/ActivityReminders$2;->b:Lcom/dof100/morsenotifier/ActivityReminders;

    invoke-static {p2}, Lcom/dof100/morsenotifier/ActivityReminders;->b(Lcom/dof100/morsenotifier/ActivityReminders;)Lcom/dof100/morsenotifier/q;

    move-result-object p2

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityReminders$2;->b:Lcom/dof100/morsenotifier/ActivityReminders;

    invoke-virtual {p2, v0}, Lcom/dof100/morsenotifier/q;->b(Landroid/content/Context;)V

    iget-object p2, p0, Lcom/dof100/morsenotifier/ActivityReminders$2;->b:Lcom/dof100/morsenotifier/ActivityReminders;

    invoke-static {p2}, Lcom/dof100/morsenotifier/ActivityReminders;->a(Lcom/dof100/morsenotifier/ActivityReminders;)Lcom/dof100/morsenotifier/r;

    move-result-object p2

    invoke-virtual {p2}, Lcom/dof100/morsenotifier/r;->notifyDataSetChanged()V

    iget-object p2, p0, Lcom/dof100/morsenotifier/ActivityReminders$2;->b:Lcom/dof100/morsenotifier/ActivityReminders;

    invoke-static {p2}, Lcom/dof100/morsenotifier/g;->a(Landroid/content/Context;)V

    iget-object p2, p0, Lcom/dof100/morsenotifier/ActivityReminders$2;->b:Lcom/dof100/morsenotifier/ActivityReminders;

    invoke-static {p2}, Lcom/dof100/morsenotifier/ActivityReminders;->c(Lcom/dof100/morsenotifier/ActivityReminders;)Landroid/widget/ListView;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/ListView;->invalidate()V

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method
