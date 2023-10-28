.class public Lcom/dof100/morsenotifier/ActivityReminders;
.super Landroid/app/Activity;

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/dof100/morsenotifier/r$a;


# instance fields
.field private a:Lcom/dof100/morsenotifier/q;

.field private b:Lcom/dof100/morsenotifier/r;

.field private c:Landroid/widget/ListView;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/dof100/morsenotifier/ActivityReminders;)Lcom/dof100/morsenotifier/r;
    .locals 0

    iget-object p0, p0, Lcom/dof100/morsenotifier/ActivityReminders;->b:Lcom/dof100/morsenotifier/r;

    return-object p0
.end method

.method static synthetic b(Lcom/dof100/morsenotifier/ActivityReminders;)Lcom/dof100/morsenotifier/q;
    .locals 0

    iget-object p0, p0, Lcom/dof100/morsenotifier/ActivityReminders;->a:Lcom/dof100/morsenotifier/q;

    return-object p0
.end method

.method static synthetic c(Lcom/dof100/morsenotifier/ActivityReminders;)Landroid/widget/ListView;
    .locals 0

    iget-object p0, p0, Lcom/dof100/morsenotifier/ActivityReminders;->c:Landroid/widget/ListView;

    return-object p0
.end method


# virtual methods
.method public a(Lcom/dof100/morsenotifier/p;ILandroid/view/View;)V
    .locals 2

    const-string v0, "ActivityReminders.onRowButtonClick"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f07000b

    if-ne v0, v1, :cond_0

    const-string p2, "ActivityReminders.onRowButtonClick b_delete"

    invoke-static {p2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    new-instance p2, Landroid/app/AlertDialog$Builder;

    invoke-direct {p2, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const p3, 0x7f0c01c9

    invoke-virtual {p2, p3}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    const p3, 0x7f0c01bf

    invoke-virtual {p2, p3}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    const p3, 0x7f0c0034

    new-instance v0, Lcom/dof100/morsenotifier/ActivityReminders$2;

    invoke-direct {v0, p0, p1}, Lcom/dof100/morsenotifier/ActivityReminders$2;-><init>(Lcom/dof100/morsenotifier/ActivityReminders;Lcom/dof100/morsenotifier/p;)V

    invoke-virtual {p2, p3, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    const p1, 0x7f0c002f

    new-instance p3, Lcom/dof100/morsenotifier/ActivityReminders$3;

    invoke-direct {p3, p0}, Lcom/dof100/morsenotifier/ActivityReminders$3;-><init>(Lcom/dof100/morsenotifier/ActivityReminders;)V

    invoke-virtual {p2, p1, p3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    invoke-virtual {p2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V

    return-void

    :cond_0
    invoke-virtual {p3}, Landroid/view/View;->getId()I

    move-result p1

    const p3, 0x7f07000c

    if-ne p1, p3, :cond_1

    const-string p1, "ActivityReminders.onRowButtonClick b_edit"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    new-instance p1, Landroid/content/Intent;

    const-class p3, Lcom/dof100/morsenotifier/ActivityReminder;

    invoke-direct {p1, p0, p3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p3, "OBJECTINDEX"

    invoke-virtual {p1, p3, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const/4 p2, 0x1

    invoke-virtual {p0, p1, p2}, Lcom/dof100/morsenotifier/ActivityReminders;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_1
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    const-string p3, "ActivityReminders.onActivityResult"

    invoke-static {p3}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const/4 p3, 0x1

    if-ne p1, p3, :cond_2

    const/4 p1, -0x1

    if-ne p2, p1, :cond_0

    const-string p1, "ActivityReminders.onActivityResult OK"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    :cond_0
    if-nez p2, :cond_1

    const-string p1, "ActivityReminders.onActivityResult CANCEL"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    :cond_1
    const-string p1, "ActivityReminders.onActivityResult loadFilters"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityReminders;->a:Lcom/dof100/morsenotifier/q;

    invoke-virtual {p1, p0}, Lcom/dof100/morsenotifier/q;->a(Landroid/content/Context;)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityReminders;->b:Lcom/dof100/morsenotifier/r;

    invoke-virtual {p1}, Lcom/dof100/morsenotifier/r;->notifyDataSetChanged()V

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityReminders;->c:Landroid/widget/ListView;

    invoke-virtual {p1}, Landroid/widget/ListView;->invalidate()V

    :cond_2
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    const-string v0, "ActivityReminders.onClick"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f07000f

    if-ne p1, v0, :cond_1

    const-string p1, "ActivityReminders.onClick b_Add"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/dof100/morsenotifier/ActivityReminder;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/dof100/morsenotifier/ActivityReminders;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_1
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    const-string p1, "ActivityReminders.onCreate"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    new-instance p1, Lcom/dof100/morsenotifier/q;

    invoke-direct {p1, p0}, Lcom/dof100/morsenotifier/q;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityReminders;->a:Lcom/dof100/morsenotifier/q;

    const-string p1, "ActivityReminders.onCreate load"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityReminders;->a:Lcom/dof100/morsenotifier/q;

    invoke-virtual {p1, p0}, Lcom/dof100/morsenotifier/q;->a(Landroid/content/Context;)V

    new-instance p1, Lcom/dof100/morsenotifier/r;

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityReminders;->a:Lcom/dof100/morsenotifier/q;

    invoke-direct {p1, p0, v0, p0}, Lcom/dof100/morsenotifier/r;-><init>(Landroid/content/Context;Lcom/dof100/morsenotifier/q;Lcom/dof100/morsenotifier/r$a;)V

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityReminders;->b:Lcom/dof100/morsenotifier/r;

    const p1, 0x7f090009

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityReminders;->setContentView(I)V

    const p1, 0x7f070049

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityReminders;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ListView;

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityReminders;->c:Landroid/widget/ListView;

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityReminders;->c:Landroid/widget/ListView;

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityReminders;->b:Lcom/dof100/morsenotifier/r;

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityReminders;->c:Landroid/widget/ListView;

    new-instance v0, Lcom/dof100/morsenotifier/ActivityReminders$1;

    invoke-direct {v0, p0}, Lcom/dof100/morsenotifier/ActivityReminders$1;-><init>(Lcom/dof100/morsenotifier/ActivityReminders;)V

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    const p1, 0x7f07000f

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityReminders;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    invoke-virtual {p1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
