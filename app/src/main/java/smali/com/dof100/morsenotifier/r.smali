.class Lcom/dof100/morsenotifier/r;
.super Landroid/widget/ArrayAdapter;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/dof100/morsenotifier/r$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter<",
        "Lcom/dof100/morsenotifier/p;",
        ">;",
        "Landroid/view/View$OnClickListener;"
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private b:Lcom/dof100/morsenotifier/q;

.field private final c:Landroid/view/LayoutInflater;

.field private final d:Lcom/dof100/morsenotifier/r$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/dof100/morsenotifier/q;Lcom/dof100/morsenotifier/r$a;)V
    .locals 2

    iget-object v0, p2, Lcom/dof100/morsenotifier/q;->a:Ljava/util/ArrayList;

    const v1, 0x7f09000a

    invoke-direct {p0, p1, v1, v0}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    const-string v0, "MyRemindersArrayAdapter.constructor"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/dof100/morsenotifier/r;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/dof100/morsenotifier/r;->b:Lcom/dof100/morsenotifier/q;

    iput-object p3, p0, Lcom/dof100/morsenotifier/r;->d:Lcom/dof100/morsenotifier/r$a;

    iget-object p1, p0, Lcom/dof100/morsenotifier/r;->a:Landroid/content/Context;

    const-string p2, "layout_inflater"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/LayoutInflater;

    iput-object p1, p0, Lcom/dof100/morsenotifier/r;->c:Landroid/view/LayoutInflater;

    return-void
.end method


# virtual methods
.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MyRemindersArrayAdapter.getView position="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "  v="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/r;->b:Lcom/dof100/morsenotifier/q;

    iget-object v0, v0, Lcom/dof100/morsenotifier/q;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/dof100/morsenotifier/p;

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/dof100/morsenotifier/r;->c:Landroid/view/LayoutInflater;

    const v0, 0x7f09000a

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    :cond_0
    invoke-virtual {p2, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const p3, 0x7f07006d

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/r;->a:Landroid/content/Context;

    invoke-virtual {p1, v0}, Lcom/dof100/morsenotifier/p;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p3, 0x7f07000c

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/ImageButton;

    invoke-virtual {p3, p1}, Landroid/widget/ImageButton;->setTag(Ljava/lang/Object;)V

    invoke-virtual {p3, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p3, 0x7f07000b

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/ImageButton;

    invoke-virtual {p3, p1}, Landroid/widget/ImageButton;->setTag(Ljava/lang/Object;)V

    invoke-virtual {p3, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p2
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v0, "MyRemindersArrayAdapter.onClick"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/dof100/morsenotifier/p;

    if-nez v0, :cond_1

    iget-object p1, p0, Lcom/dof100/morsenotifier/r;->a:Landroid/content/Context;

    const-string v0, "MyRemindersArrayAdapter.onClick ERROR f=null"

    invoke-static {p1, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object v1, p0, Lcom/dof100/morsenotifier/r;->b:Lcom/dof100/morsenotifier/q;

    iget-object v1, v1, Lcom/dof100/morsenotifier/q;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MyRemindersArrayAdapter.onClick index="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    const v3, 0x7f07000b

    if-ne v2, v3, :cond_2

    const-string v2, "MyRemindersArrayAdapter.onClick b_delete"

    :goto_0
    invoke-static {v2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/dof100/morsenotifier/r;->d:Lcom/dof100/morsenotifier/r$a;

    invoke-interface {v2, v0, v1, p1}, Lcom/dof100/morsenotifier/r$a;->a(Lcom/dof100/morsenotifier/p;ILandroid/view/View;)V

    return-void

    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    const v3, 0x7f07000c

    if-ne v2, v3, :cond_3

    const-string v2, "MyRemindersArrayAdapter.onClick b_edit"

    goto :goto_0

    :cond_3
    return-void
.end method
