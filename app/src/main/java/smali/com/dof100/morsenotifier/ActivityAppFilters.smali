.class public Lcom/dof100/morsenotifier/ActivityAppFilters;
.super Landroid/app/Activity;

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/dof100/morsenotifier/c$a;


# instance fields
.field private a:Lcom/dof100/morsenotifier/b;

.field private b:Lcom/dof100/morsenotifier/c;

.field private c:Landroid/widget/ListView;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/dof100/morsenotifier/ActivityAppFilters;)Lcom/dof100/morsenotifier/c;
    .locals 0

    iget-object p0, p0, Lcom/dof100/morsenotifier/ActivityAppFilters;->b:Lcom/dof100/morsenotifier/c;

    return-object p0
.end method

.method static synthetic b(Lcom/dof100/morsenotifier/ActivityAppFilters;)Lcom/dof100/morsenotifier/b;
    .locals 0

    iget-object p0, p0, Lcom/dof100/morsenotifier/ActivityAppFilters;->a:Lcom/dof100/morsenotifier/b;

    return-object p0
.end method

.method static synthetic c(Lcom/dof100/morsenotifier/ActivityAppFilters;)Landroid/widget/ListView;
    .locals 0

    iget-object p0, p0, Lcom/dof100/morsenotifier/ActivityAppFilters;->c:Landroid/widget/ListView;

    return-object p0
.end method


# virtual methods
.method public a(Lcom/dof100/morsenotifier/a;ILandroid/view/View;)V
    .locals 2

    const-string v0, "ActivityAppFilters.onRowButtonClick"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f07000b

    if-ne v0, v1, :cond_0

    const-string p2, "ActivityAppFilters.onRowButtonClick b_delete"

    invoke-static {p2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    new-instance p2, Landroid/app/AlertDialog$Builder;

    invoke-direct {p2, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const p3, 0x7f0c01c9

    invoke-virtual {p2, p3}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    const p3, 0x7f0c01bf

    invoke-virtual {p2, p3}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    const p3, 0x7f0c0034

    new-instance v0, Lcom/dof100/morsenotifier/ActivityAppFilters$2;

    invoke-direct {v0, p0, p1}, Lcom/dof100/morsenotifier/ActivityAppFilters$2;-><init>(Lcom/dof100/morsenotifier/ActivityAppFilters;Lcom/dof100/morsenotifier/a;)V

    invoke-virtual {p2, p3, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    const p1, 0x7f0c002f

    new-instance p3, Lcom/dof100/morsenotifier/ActivityAppFilters$3;

    invoke-direct {p3, p0}, Lcom/dof100/morsenotifier/ActivityAppFilters$3;-><init>(Lcom/dof100/morsenotifier/ActivityAppFilters;)V

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

    const-string p1, "ActivityAppFilters.onRowButtonClick b_edit"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    new-instance p1, Landroid/content/Intent;

    const-class p3, Lcom/dof100/morsenotifier/ActivityAppFilter;

    invoke-direct {p1, p0, p3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p3, "FILTERINDEX"

    invoke-virtual {p1, p3, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const/4 p2, 0x1

    invoke-virtual {p0, p1, p2}, Lcom/dof100/morsenotifier/ActivityAppFilters;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_1
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    const-string p3, "ActivityAppFilters.onActivityResult"

    invoke-static {p3}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const/4 p3, 0x1

    if-ne p1, p3, :cond_2

    const/4 p1, -0x1

    if-ne p2, p1, :cond_0

    const-string p1, "ActivityAppFilters.onActivityResult OK"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    :cond_0
    if-nez p2, :cond_1

    const-string p1, "ActivityAppFilters.onActivityResult CANCEL"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    :cond_1
    const-string p1, "ActivityAppFilters.onActivityResult loadFilters"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityAppFilters;->a:Lcom/dof100/morsenotifier/b;

    invoke-virtual {p1, p0}, Lcom/dof100/morsenotifier/b;->a(Landroid/content/Context;)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityAppFilters;->b:Lcom/dof100/morsenotifier/c;

    invoke-virtual {p1}, Lcom/dof100/morsenotifier/c;->notifyDataSetChanged()V

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityAppFilters;->c:Landroid/widget/ListView;

    invoke-virtual {p1}, Landroid/widget/ListView;->invalidate()V

    :cond_2
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    const-string v0, "ActivityAppFilters.onClick"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f070009

    if-ne v0, v1, :cond_1

    const-string p1, "ActivityAppFilters.onClick b_apps_select_add"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityAppFilters;->b:Lcom/dof100/morsenotifier/c;

    invoke-virtual {p1}, Lcom/dof100/morsenotifier/c;->a()V

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/dof100/morsenotifier/ActivityAppFilter;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "FILTERINDEX"

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityAppFilters;->a:Lcom/dof100/morsenotifier/b;

    iget-object v1, v1, Lcom/dof100/morsenotifier/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {p0, p1, v2}, Lcom/dof100/morsenotifier/ActivityAppFilters;->startActivityForResult(Landroid/content/Intent;I)V

    return-void

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f07000a

    if-ne p1, v0, :cond_2

    const-string p1, "ActivityRecentNotifications.onClick b_apps_select_checkrecent"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/dof100/morsenotifier/ActivityRecentAppNotifications;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityAppFilters;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0c0024

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityAppFilters;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c000f

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityAppFilters;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0c000b

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityAppFilters;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0c000c

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityAppFilters;->startActivity(Landroid/content/Intent;)V

    :cond_2
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    const-string p1, "ActivityAppFilters.onCreate"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    new-instance p1, Lcom/dof100/morsenotifier/b;

    invoke-direct {p1, p0}, Lcom/dof100/morsenotifier/b;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityAppFilters;->a:Lcom/dof100/morsenotifier/b;

    const-string p1, "ActivityAppFilters.onCreate loadFilters"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityAppFilters;->a:Lcom/dof100/morsenotifier/b;

    invoke-virtual {p1, p0}, Lcom/dof100/morsenotifier/b;->a(Landroid/content/Context;)V

    new-instance p1, Lcom/dof100/morsenotifier/c;

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilters;->a:Lcom/dof100/morsenotifier/b;

    invoke-direct {p1, p0, v0, p0}, Lcom/dof100/morsenotifier/c;-><init>(Landroid/content/Context;Lcom/dof100/morsenotifier/b;Lcom/dof100/morsenotifier/c$a;)V

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityAppFilters;->b:Lcom/dof100/morsenotifier/c;

    const p1, 0x7f090002

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityAppFilters;->setContentView(I)V

    const p1, 0x7f070047

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityAppFilters;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ListView;

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityAppFilters;->c:Landroid/widget/ListView;

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityAppFilters;->c:Landroid/widget/ListView;

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilters;->b:Lcom/dof100/morsenotifier/c;

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityAppFilters;->c:Landroid/widget/ListView;

    new-instance v0, Lcom/dof100/morsenotifier/ActivityAppFilters$1;

    invoke-direct {v0, p0}, Lcom/dof100/morsenotifier/ActivityAppFilters$1;-><init>(Lcom/dof100/morsenotifier/ActivityAppFilters;)V

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    const p1, 0x7f070009

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityAppFilters;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    invoke-virtual {p1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f07000a

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityAppFilters;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    invoke-virtual {p1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
