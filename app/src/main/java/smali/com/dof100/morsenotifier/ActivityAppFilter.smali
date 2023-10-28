.class public Lcom/dof100/morsenotifier/ActivityAppFilter;
.super Landroid/app/Activity;


# instance fields
.field private a:Lcom/dof100/morsenotifier/f;

.field private b:Lcom/dof100/morsenotifier/b;

.field private c:Lcom/dof100/morsenotifier/a;

.field private d:Landroid/widget/Spinner;

.field private e:Landroid/widget/EditText;

.field private f:Landroid/widget/EditText;

.field private g:Landroid/widget/EditText;

.field private h:Landroid/widget/EditText;

.field private i:Landroid/widget/CheckBox;

.field private j:Landroid/widget/CheckBox;

.field private k:Landroid/widget/CheckBox;

.field private l:Landroid/widget/EditText;

.field private m:Landroid/widget/EditText;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->a:Lcom/dof100/morsenotifier/f;

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->b:Lcom/dof100/morsenotifier/b;

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->c:Lcom/dof100/morsenotifier/a;

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->d:Landroid/widget/Spinner;

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->e:Landroid/widget/EditText;

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->f:Landroid/widget/EditText;

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->g:Landroid/widget/EditText;

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->h:Landroid/widget/EditText;

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->i:Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->j:Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->k:Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->l:Landroid/widget/EditText;

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->m:Landroid/widget/EditText;

    return-void
.end method

.method static synthetic a(Lcom/dof100/morsenotifier/ActivityAppFilter;)Landroid/widget/Spinner;
    .locals 0

    iget-object p0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->d:Landroid/widget/Spinner;

    return-object p0
.end method

.method private a()V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ActivityAppFilter.filter2view package="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->c:Lcom/dof100/morsenotifier/a;

    iget-object v1, v1, Lcom/dof100/morsenotifier/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->a:Lcom/dof100/morsenotifier/f;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->c:Lcom/dof100/morsenotifier/a;

    iget-object v1, v1, Lcom/dof100/morsenotifier/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/dof100/morsenotifier/f;->a(Ljava/lang/String;)I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ActivityAppFilter.filter2view package idx="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->d:Landroid/widget/Spinner;

    new-instance v2, Lcom/dof100/morsenotifier/ActivityAppFilter$1;

    invoke-direct {v2, p0, v0}, Lcom/dof100/morsenotifier/ActivityAppFilter$1;-><init>(Lcom/dof100/morsenotifier/ActivityAppFilter;I)V

    invoke-virtual {v1, v2}, Landroid/widget/Spinner;->post(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->e:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->c:Lcom/dof100/morsenotifier/a;

    iget-object v1, v1, Lcom/dof100/morsenotifier/a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->f:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->c:Lcom/dof100/morsenotifier/a;

    iget-object v1, v1, Lcom/dof100/morsenotifier/a;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->g:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->c:Lcom/dof100/morsenotifier/a;

    iget-object v1, v1, Lcom/dof100/morsenotifier/a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->h:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->c:Lcom/dof100/morsenotifier/a;

    iget-object v1, v1, Lcom/dof100/morsenotifier/a;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->i:Landroid/widget/CheckBox;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->c:Lcom/dof100/morsenotifier/a;

    iget-boolean v1, v1, Lcom/dof100/morsenotifier/a;->f:Z

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->j:Landroid/widget/CheckBox;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->c:Lcom/dof100/morsenotifier/a;

    iget-boolean v1, v1, Lcom/dof100/morsenotifier/a;->g:Z

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->k:Landroid/widget/CheckBox;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->c:Lcom/dof100/morsenotifier/a;

    iget-boolean v1, v1, Lcom/dof100/morsenotifier/a;->h:Z

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->l:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->c:Lcom/dof100/morsenotifier/a;

    iget-object v1, v1, Lcom/dof100/morsenotifier/a;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->m:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->c:Lcom/dof100/morsenotifier/a;

    iget-object v1, v1, Lcom/dof100/morsenotifier/a;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private b()V
    .locals 3

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->d:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v0

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->c:Lcom/dof100/morsenotifier/a;

    iget-object v2, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->a:Lcom/dof100/morsenotifier/f;

    iget-object v2, v2, Lcom/dof100/morsenotifier/f;->a:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/dof100/morsenotifier/e;

    iget-object v2, v2, Lcom/dof100/morsenotifier/e;->a:Ljava/lang/String;

    iput-object v2, v1, Lcom/dof100/morsenotifier/a;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ActivityAppFilter.view2filter idx="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " package="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->c:Lcom/dof100/morsenotifier/a;

    iget-object v0, v0, Lcom/dof100/morsenotifier/a;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->c:Lcom/dof100/morsenotifier/a;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->e:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/dof100/morsenotifier/a;->b:Ljava/lang/String;

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->c:Lcom/dof100/morsenotifier/a;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->f:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/dof100/morsenotifier/a;->c:Ljava/lang/String;

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->c:Lcom/dof100/morsenotifier/a;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->g:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/dof100/morsenotifier/a;->d:Ljava/lang/String;

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->c:Lcom/dof100/morsenotifier/a;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->h:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/dof100/morsenotifier/a;->e:Ljava/lang/String;

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->c:Lcom/dof100/morsenotifier/a;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->i:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    iput-boolean v1, v0, Lcom/dof100/morsenotifier/a;->f:Z

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->c:Lcom/dof100/morsenotifier/a;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->j:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    iput-boolean v1, v0, Lcom/dof100/morsenotifier/a;->g:Z

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->c:Lcom/dof100/morsenotifier/a;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->k:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    iput-boolean v1, v0, Lcom/dof100/morsenotifier/a;->h:Z

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->c:Lcom/dof100/morsenotifier/a;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->l:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/dof100/morsenotifier/a;->i:Ljava/lang/String;

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->c:Lcom/dof100/morsenotifier/a;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->m:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/dof100/morsenotifier/a;->j:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 7

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    const-string p1, "ActivityAppFilter.onCreate"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const p1, 0x7f090001

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityAppFilter;->setContentView(I)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->c:Lcom/dof100/morsenotifier/a;

    new-instance p1, Lcom/dof100/morsenotifier/b;

    invoke-direct {p1, p0}, Lcom/dof100/morsenotifier/b;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->b:Lcom/dof100/morsenotifier/b;

    new-instance p1, Lcom/dof100/morsenotifier/f;

    invoke-direct {p1, p0}, Lcom/dof100/morsenotifier/f;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->a:Lcom/dof100/morsenotifier/f;

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityAppFilter;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_1

    const-string v2, "FILTERINDEX"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    if-ltz p1, :cond_0

    iget-object v2, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->b:Lcom/dof100/morsenotifier/b;

    iget-object v2, v2, Lcom/dof100/morsenotifier/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge p1, v2, :cond_0

    iget-object v2, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->b:Lcom/dof100/morsenotifier/b;

    iget-object v2, v2, Lcom/dof100/morsenotifier/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/dof100/morsenotifier/a;

    iput-object v2, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->c:Lcom/dof100/morsenotifier/a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ActivityAppFilter.onCreate loaded filter at position = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "Filter %d not found"

    new-array v4, v1, [Ljava/lang/Object;

    add-int/lit8 v5, p1, 0x1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v0

    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0, v2}, Lcom/dof100/morsenotifier/i;->b(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "Filter %d not found"

    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v0

    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0, v2}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityAppFilter;->finish()V

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->c:Lcom/dof100/morsenotifier/a;

    if-nez v2, :cond_2

    new-instance p1, Lcom/dof100/morsenotifier/a;

    invoke-direct {p1}, Lcom/dof100/morsenotifier/a;-><init>()V

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->c:Lcom/dof100/morsenotifier/a;

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->b:Lcom/dof100/morsenotifier/b;

    iget-object p1, p1, Lcom/dof100/morsenotifier/b;->a:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->c:Lcom/dof100/morsenotifier/a;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->b:Lcom/dof100/morsenotifier/b;

    iget-object p1, p1, Lcom/dof100/morsenotifier/b;->a:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    sub-int/2addr p1, v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ActivityAppFilter.onCreate created new filter at position = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    :cond_2
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "%s %d"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityAppFilter;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f0c003d

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v0

    add-int/2addr p1, v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v4, v1

    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityAppFilter;->setTitle(Ljava/lang/CharSequence;)V

    const p1, 0x7f070055

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityAppFilter;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Spinner;

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->d:Landroid/widget/Spinner;

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->a:Lcom/dof100/morsenotifier/f;

    invoke-virtual {p1}, Lcom/dof100/morsenotifier/f;->a()Ljava/util/ArrayList;

    move-result-object p1

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->b:Lcom/dof100/morsenotifier/b;

    iget-object v0, v0, Lcom/dof100/morsenotifier/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    new-instance v0, Landroid/widget/ArrayAdapter;

    const v1, 0x1090008

    invoke-direct {v0, p0, v1, p1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    const p1, 0x1090009

    invoke-virtual {v0, p1}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->d:Landroid/widget/Spinner;

    invoke-virtual {p1, v0}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    const p1, 0x7f070031

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityAppFilter;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->e:Landroid/widget/EditText;

    const p1, 0x7f070032

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityAppFilter;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->f:Landroid/widget/EditText;

    const p1, 0x7f070033

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityAppFilter;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->g:Landroid/widget/EditText;

    const p1, 0x7f070034

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityAppFilter;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->h:Landroid/widget/EditText;

    const p1, 0x7f070025

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityAppFilter;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->i:Landroid/widget/CheckBox;

    const p1, 0x7f070023

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityAppFilter;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->j:Landroid/widget/CheckBox;

    const p1, 0x7f070024

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityAppFilter;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->k:Landroid/widget/CheckBox;

    const p1, 0x7f070030

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityAppFilter;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->l:Landroid/widget/EditText;

    const p1, 0x7f07002f

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityAppFilter;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->m:Landroid/widget/EditText;

    invoke-direct {p0}, Lcom/dof100/morsenotifier/ActivityAppFilter;->a()V

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    const-string v0, "ActivityAppFilter.onDestroy"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    return-void
.end method

.method protected onPause()V
    .locals 1

    const-string v0, "ActivityAppFilter.onPause"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/dof100/morsenotifier/ActivityAppFilter;->b()V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAppFilter;->b:Lcom/dof100/morsenotifier/b;

    invoke-virtual {v0, p0}, Lcom/dof100/morsenotifier/b;->b(Landroid/content/Context;)V

    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    return-void
.end method

.method protected onStop()V
    .locals 1

    const-string v0, "ActivityAppFilter.onStop"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    return-void
.end method
