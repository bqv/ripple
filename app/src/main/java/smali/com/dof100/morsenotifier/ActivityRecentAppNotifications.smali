.class public Lcom/dof100/morsenotifier/ActivityRecentAppNotifications;
.super Landroid/app/Activity;

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/dof100/morsenotifier/o$a;


# instance fields
.field private a:Lcom/dof100/morsenotifier/n;

.field private b:Lcom/dof100/morsenotifier/b;

.field private c:Lcom/dof100/morsenotifier/o;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityRecentAppNotifications;->a:Lcom/dof100/morsenotifier/n;

    return-void
.end method


# virtual methods
.method public a(ILandroid/view/View;)V
    .locals 1

    const-string v0, "ActivityRecentAppNotifications.onRowButtonClick"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result p2

    const v0, 0x7f070074

    if-ne p2, v0, :cond_0

    const-string p2, "ActivityAppFilters.onRowButtonClick tv_recentnotification_announcedcriteria"

    invoke-static {p2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    new-instance p2, Landroid/content/Intent;

    const-class v0, Lcom/dof100/morsenotifier/ActivityAppFilter;

    invoke-direct {p2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "FILTERINDEX"

    invoke-virtual {p2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const/4 p1, 0x1

    invoke-virtual {p0, p2, p1}, Lcom/dof100/morsenotifier/ActivityRecentAppNotifications;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    const-string v0, "ActivityRecentNotifications.onClick"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f07000d

    if-ne v0, v1, :cond_1

    const-string p1, "ActivityRecentNotifications.onClick b_Clear"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityRecentAppNotifications;->a:Lcom/dof100/morsenotifier/n;

    invoke-virtual {p1, p0}, Lcom/dof100/morsenotifier/n;->a(Landroid/content/Context;)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityRecentAppNotifications;->c:Lcom/dof100/morsenotifier/o;

    invoke-virtual {p1}, Lcom/dof100/morsenotifier/o;->clear()V

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityRecentAppNotifications;->c:Lcom/dof100/morsenotifier/o;

    invoke-virtual {p1}, Lcom/dof100/morsenotifier/o;->notifyDataSetChanged()V

    invoke-static {p0}, Lcom/dof100/morsenotifier/App;->d(Landroid/content/Context;)V

    return-void

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f07000e

    if-ne p1, v0, :cond_2

    const-string p1, "ActivityRecentAppNotifications.onClick b_Criteria"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/dof100/morsenotifier/ActivityAppFilters;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityRecentAppNotifications;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0c0024

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityRecentAppNotifications;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c000d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityRecentAppNotifications;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0c000b

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityRecentAppNotifications;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0c000c

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityRecentAppNotifications;->startActivity(Landroid/content/Intent;)V

    :cond_2
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    const-string p1, "ActivityRecentAppNotifications.onCreate"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    new-instance p1, Lcom/dof100/morsenotifier/b;

    invoke-direct {p1, p0}, Lcom/dof100/morsenotifier/b;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityRecentAppNotifications;->b:Lcom/dof100/morsenotifier/b;

    const-string p1, "ActivityRecentAppNotifications.onCreate loadfilters"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityRecentAppNotifications;->b:Lcom/dof100/morsenotifier/b;

    invoke-virtual {p1, p0}, Lcom/dof100/morsenotifier/b;->a(Landroid/content/Context;)V

    new-instance p1, Lcom/dof100/morsenotifier/n;

    invoke-direct {p1, p0}, Lcom/dof100/morsenotifier/n;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityRecentAppNotifications;->a:Lcom/dof100/morsenotifier/n;

    new-instance p1, Lcom/dof100/morsenotifier/o;

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityRecentAppNotifications;->a:Lcom/dof100/morsenotifier/n;

    iget-object v0, v0, Lcom/dof100/morsenotifier/n;->a:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityRecentAppNotifications;->b:Lcom/dof100/morsenotifier/b;

    invoke-direct {p1, p0, v0, v1, p0}, Lcom/dof100/morsenotifier/o;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Lcom/dof100/morsenotifier/b;Lcom/dof100/morsenotifier/o$a;)V

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityRecentAppNotifications;->c:Lcom/dof100/morsenotifier/o;

    const p1, 0x7f090006

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityRecentAppNotifications;->setContentView(I)V

    const p1, 0x7f070048

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityRecentAppNotifications;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ListView;

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityRecentAppNotifications;->c:Lcom/dof100/morsenotifier/o;

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    const p1, 0x7f07000d

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityRecentAppNotifications;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    invoke-virtual {p1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f07000e

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityRecentAppNotifications;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    invoke-virtual {p1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    const-string v0, "ActivityRecentAppNotifications.onResume loadfilters"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityRecentAppNotifications;->b:Lcom/dof100/morsenotifier/b;

    invoke-virtual {v0, p0}, Lcom/dof100/morsenotifier/b;->a(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityRecentAppNotifications;->c:Lcom/dof100/morsenotifier/o;

    invoke-virtual {v0}, Lcom/dof100/morsenotifier/o;->notifyDataSetChanged()V

    return-void
.end method
