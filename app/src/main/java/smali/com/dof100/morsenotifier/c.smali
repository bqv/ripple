.class Lcom/dof100/morsenotifier/c;
.super Landroid/widget/ArrayAdapter;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/dof100/morsenotifier/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter<",
        "Lcom/dof100/morsenotifier/a;",
        ">;",
        "Landroid/view/View$OnClickListener;"
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private b:Lcom/dof100/morsenotifier/b;

.field private final c:Landroid/view/LayoutInflater;

.field private final d:Lcom/dof100/morsenotifier/c$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/dof100/morsenotifier/b;Lcom/dof100/morsenotifier/c$a;)V
    .locals 2

    iget-object v0, p2, Lcom/dof100/morsenotifier/b;->a:Ljava/util/ArrayList;

    const v1, 0x7f090003

    invoke-direct {p0, p1, v1, v0}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    const-string v0, "MyAppFiltersArrayAdapter.constructor"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/dof100/morsenotifier/c;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/dof100/morsenotifier/c;->b:Lcom/dof100/morsenotifier/b;

    iput-object p3, p0, Lcom/dof100/morsenotifier/c;->d:Lcom/dof100/morsenotifier/c$a;

    iget-object p1, p0, Lcom/dof100/morsenotifier/c;->a:Landroid/content/Context;

    const-string p2, "layout_inflater"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/LayoutInflater;

    iput-object p1, p0, Lcom/dof100/morsenotifier/c;->c:Landroid/view/LayoutInflater;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    new-instance v0, Lcom/dof100/morsenotifier/a;

    invoke-direct {v0}, Lcom/dof100/morsenotifier/a;-><init>()V

    iget-object v1, p0, Lcom/dof100/morsenotifier/c;->b:Lcom/dof100/morsenotifier/b;

    iget-object v1, v1, Lcom/dof100/morsenotifier/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/dof100/morsenotifier/c;->insert(Ljava/lang/Object;I)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/c;->b:Lcom/dof100/morsenotifier/b;

    iget-object v1, p0, Lcom/dof100/morsenotifier/c;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/dof100/morsenotifier/b;->b(Landroid/content/Context;)V

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/c;->notifyDataSetChanged()V

    return-void
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MyAppFiltersArrayAdapter.getView position="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "  v="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/c;->b:Lcom/dof100/morsenotifier/b;

    iget-object v0, v0, Lcom/dof100/morsenotifier/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/dof100/morsenotifier/a;

    const/4 v1, 0x0

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/dof100/morsenotifier/c;->c:Landroid/view/LayoutInflater;

    const v2, 0x7f090003

    invoke-virtual {p2, v2, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    :cond_0
    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const p3, 0x7f07006d

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "%d. %s"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x1

    add-int/2addr p1, v5

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v4, v1

    iget-object p1, p0, Lcom/dof100/morsenotifier/c;->a:Landroid/content/Context;

    invoke-virtual {v0, p1}, Lcom/dof100/morsenotifier/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v4, v5

    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p1, 0x7f07000c

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setTag(Ljava/lang/Object;)V

    invoke-virtual {p1, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f07000b

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setTag(Ljava/lang/Object;)V

    invoke-virtual {p1, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p2
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v0, "MyAppFiltersArrayAdapter.onClick"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/dof100/morsenotifier/a;

    if-nez v0, :cond_1

    iget-object p1, p0, Lcom/dof100/morsenotifier/c;->a:Landroid/content/Context;

    const-string v0, "MyAppFiltersArrayAdapter.onClick ERROR f=null"

    invoke-static {p1, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MyAppFiltersArrayAdapter.onClick f.package="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, Lcom/dof100/morsenotifier/a;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/dof100/morsenotifier/c;->b:Lcom/dof100/morsenotifier/b;

    iget-object v1, v1, Lcom/dof100/morsenotifier/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MyAppFiltersArrayAdapter.onClick index="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    const v3, 0x7f07000b

    if-ne v2, v3, :cond_2

    const-string v2, "MyAppFiltersArrayAdapter.onClick b_delete"

    :goto_0
    invoke-static {v2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/dof100/morsenotifier/c;->d:Lcom/dof100/morsenotifier/c$a;

    invoke-interface {v2, v0, v1, p1}, Lcom/dof100/morsenotifier/c$a;->a(Lcom/dof100/morsenotifier/a;ILandroid/view/View;)V

    return-void

    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    const v3, 0x7f07000c

    if-ne v2, v3, :cond_3

    const-string v2, "MyAppFiltersArrayAdapter.onClick b_edit"

    goto :goto_0

    :cond_3
    return-void
.end method
