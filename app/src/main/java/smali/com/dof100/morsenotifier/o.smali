.class Lcom/dof100/morsenotifier/o;
.super Landroid/widget/ArrayAdapter;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/dof100/morsenotifier/o$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter<",
        "Lcom/dof100/morsenotifier/m;",
        ">;",
        "Landroid/view/View$OnClickListener;"
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/dof100/morsenotifier/b;

.field private final c:Landroid/view/LayoutInflater;

.field private final d:Lcom/dof100/morsenotifier/o$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;Lcom/dof100/morsenotifier/b;Lcom/dof100/morsenotifier/o$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/ArrayList<",
            "Lcom/dof100/morsenotifier/m;",
            ">;",
            "Lcom/dof100/morsenotifier/b;",
            "Lcom/dof100/morsenotifier/o$a;",
            ")V"
        }
    .end annotation

    const v0, 0x7f090007

    invoke-direct {p0, p1, v0, p2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    iput-object p3, p0, Lcom/dof100/morsenotifier/o;->b:Lcom/dof100/morsenotifier/b;

    iput-object p4, p0, Lcom/dof100/morsenotifier/o;->d:Lcom/dof100/morsenotifier/o$a;

    const-string p2, "MyRecentNotificationsArrayAdapter.constructor"

    invoke-static {p2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/dof100/morsenotifier/o;->a:Landroid/content/Context;

    iget-object p1, p0, Lcom/dof100/morsenotifier/o;->a:Landroid/content/Context;

    const-string p2, "layout_inflater"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/LayoutInflater;

    iput-object p1, p0, Lcom/dof100/morsenotifier/o;->c:Landroid/view/LayoutInflater;

    return-void
.end method


# virtual methods
.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 9

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

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/o;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/dof100/morsenotifier/m;

    if-nez p1, :cond_0

    new-instance p1, Lcom/dof100/morsenotifier/m;

    invoke-direct {p1}, Lcom/dof100/morsenotifier/m;-><init>()V

    :cond_0
    const/4 v0, -0x1

    iput v0, p1, Lcom/dof100/morsenotifier/m;->i:I

    const-string v0, ""

    iput-object v0, p1, Lcom/dof100/morsenotifier/m;->j:Ljava/lang/String;

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/dof100/morsenotifier/o;->b:Lcom/dof100/morsenotifier/b;

    iget-object v2, v2, Lcom/dof100/morsenotifier/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    iget-object v2, p0, Lcom/dof100/morsenotifier/o;->b:Lcom/dof100/morsenotifier/b;

    iget-object v2, v2, Lcom/dof100/morsenotifier/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/dof100/morsenotifier/a;

    invoke-virtual {v2, p1}, Lcom/dof100/morsenotifier/a;->a(Lcom/dof100/morsenotifier/m;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    iput v1, p1, Lcom/dof100/morsenotifier/m;->i:I

    iput-object v2, p1, Lcom/dof100/morsenotifier/m;->j:Ljava/lang/String;

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    if-nez p2, :cond_3

    iget-object p2, p0, Lcom/dof100/morsenotifier/o;->c:Landroid/view/LayoutInflater;

    const v1, 0x7f090007

    invoke-virtual {p2, v1, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    :cond_3
    invoke-virtual {p2, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const p3, 0x7f070078

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v2, "dd MMM yyyy, hh:mm:ss:ssss"

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v1, v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    iget-wide v3, p1, Lcom/dof100/morsenotifier/m;->a:J

    invoke-virtual {v2, v3, v4}, Ljava/util/Calendar;->setTimeInMillis(J)V

    invoke-virtual {v2}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p3, 0x7f070070

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/dof100/morsenotifier/o;->a:Landroid/content/Context;

    iget-object v2, p1, Lcom/dof100/morsenotifier/m;->b:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/dof100/morsenotifier/v;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p3, 0x7f070075

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    const-string v1, "(%s)"

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    iget-object v4, p1, Lcom/dof100/morsenotifier/m;->b:Ljava/lang/String;

    aput-object v4, v3, v0

    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p3, 0x7f070079

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    iget-object v1, p1, Lcom/dof100/morsenotifier/m;->c:Ljava/lang/String;

    if-eqz v1, :cond_5

    iget-object v1, p1, Lcom/dof100/morsenotifier/m;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p1, Lcom/dof100/morsenotifier/m;->c:Ljava/lang/String;

    goto :goto_3

    :cond_5
    :goto_2
    const-string v1, "-"

    :goto_3
    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p3, 0x7f070076

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    iget-object v1, p1, Lcom/dof100/morsenotifier/m;->d:Ljava/lang/String;

    if-eqz v1, :cond_7

    iget-object v1, p1, Lcom/dof100/morsenotifier/m;->d:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_4

    :cond_6
    iget-object v1, p1, Lcom/dof100/morsenotifier/m;->d:Ljava/lang/String;

    goto :goto_5

    :cond_7
    :goto_4
    const-string v1, "-"

    :goto_5
    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p3, 0x7f070077

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    iget-object v1, p1, Lcom/dof100/morsenotifier/m;->e:Ljava/lang/String;

    if-eqz v1, :cond_9

    iget-object v1, p1, Lcom/dof100/morsenotifier/m;->e:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_6

    :cond_8
    iget-object v1, p1, Lcom/dof100/morsenotifier/m;->e:Ljava/lang/String;

    goto :goto_7

    :cond_9
    :goto_6
    const-string v1, "-"

    :goto_7
    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p3, 0x7f070071

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    iget-object v1, p1, Lcom/dof100/morsenotifier/m;->f:Ljava/lang/String;

    if-eqz v1, :cond_b

    iget-object v1, p1, Lcom/dof100/morsenotifier/m;->f:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_8

    :cond_a
    iget-object v1, p1, Lcom/dof100/morsenotifier/m;->f:Ljava/lang/String;

    goto :goto_9

    :cond_b
    :goto_8
    const-string v1, "-"

    :goto_9
    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p3, 0x7f070072

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "%d"

    new-array v4, v2, [Ljava/lang/Object;

    iget v5, p1, Lcom/dof100/morsenotifier/m;->g:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v0

    invoke-static {v1, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p3, 0x7f07006e

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    iget v1, p1, Lcom/dof100/morsenotifier/m;->h:I

    const/16 v3, -0x100

    const/high16 v4, -0x10000

    packed-switch v1, :pswitch_data_0

    goto :goto_c

    :pswitch_0
    const v1, -0xff0100

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v1, p0, Lcom/dof100/morsenotifier/o;->a:Landroid/content/Context;

    const v3, 0x7f0c017c

    goto :goto_a

    :pswitch_1
    const v1, -0x777778

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v1, p0, Lcom/dof100/morsenotifier/o;->a:Landroid/content/Context;

    const v3, 0x7f0c0180

    goto :goto_a

    :pswitch_2
    invoke-virtual {p3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    const-string v1, "Not announced (options)"

    goto :goto_b

    :pswitch_3
    invoke-virtual {p3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v1, p0, Lcom/dof100/morsenotifier/o;->a:Landroid/content/Context;

    const v3, 0x7f0c017d

    goto :goto_a

    :pswitch_4
    invoke-virtual {p3, v3}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v1, p0, Lcom/dof100/morsenotifier/o;->a:Landroid/content/Context;

    const v3, 0x7f0c017e

    goto :goto_a

    :pswitch_5
    invoke-virtual {p3, v3}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v1, p0, Lcom/dof100/morsenotifier/o;->a:Landroid/content/Context;

    const v3, 0x7f0c017f

    :goto_a
    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_b
    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_c
    const p3, 0x7f070073

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    iget v1, p1, Lcom/dof100/morsenotifier/m;->i:I

    const v3, -0xff0001

    if-gez v1, :cond_c

    invoke-virtual {p3, v3}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v1, p0, Lcom/dof100/morsenotifier/o;->a:Landroid/content/Context;

    const v5, 0x7f0c0183

    :goto_d
    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_e

    :cond_c
    invoke-virtual {p3, v3}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v1, p0, Lcom/dof100/morsenotifier/o;->a:Landroid/content/Context;

    const v5, 0x7f0c0182

    goto :goto_d

    :goto_e
    const p3, 0x7f070074

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    iget v1, p1, Lcom/dof100/morsenotifier/m;->i:I

    const/4 v5, 0x0

    if-gez v1, :cond_d

    const-string v1, ""

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p3, v5}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_f

    :cond_d
    invoke-virtual {p3, v3}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {p3}, Landroid/widget/TextView;->getPaintFlags()I

    move-result v1

    or-int/lit8 v1, v1, 0x8

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setPaintFlags(I)V

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    iget-object v6, p0, Lcom/dof100/morsenotifier/o;->a:Landroid/content/Context;

    const v7, 0x7f0c0181

    invoke-virtual {v6, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    new-array v7, v2, [Ljava/lang/Object;

    iget v8, p1, Lcom/dof100/morsenotifier/m;->i:I

    add-int/2addr v8, v2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v7, v0

    invoke-static {v1, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p3, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_f
    const p3, 0x7f07006f

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    iget v1, p1, Lcom/dof100/morsenotifier/m;->i:I

    if-gez v1, :cond_e

    invoke-virtual {p3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    const-string v1, ""

    :goto_10
    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_11

    :cond_e
    invoke-virtual {p3, v3}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v1, p1, Lcom/dof100/morsenotifier/m;->j:Ljava/lang/String;

    goto :goto_10

    :goto_11
    const p3, 0x7f070010

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/Button;

    invoke-virtual {p3, p1}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    iget p1, p1, Lcom/dof100/morsenotifier/m;->i:I

    if-ltz p1, :cond_f

    invoke-virtual {p3, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p3, v2}, Landroid/widget/Button;->setEnabled(Z)V

    return-object p2

    :cond_f
    invoke-virtual {p3, v5}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p3, v0}, Landroid/widget/Button;->setEnabled(Z)V

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch -0x4
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v0, "MyRecentNotificationsArrayAdapter.onClick"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/dof100/morsenotifier/m;

    if-nez v0, :cond_1

    const-string p1, "MyRecentNotificationsArrayAdapter.onClick n=null"

    :goto_0
    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-void

    :cond_1
    iget v1, v0, Lcom/dof100/morsenotifier/m;->i:I

    if-gez v1, :cond_2

    const-string p1, "MyRecentNotificationsArrayAdapter.onClick tmpfilter<0"

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    const v2, 0x7f070010

    if-ne v1, v2, :cond_4

    const-string p1, "MyRecentNotificationsArrayAdapter.onClick b_test"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object p1, v0, Lcom/dof100/morsenotifier/m;->j:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "MyRecentNotificationsArrayAdapter.onClick tmpAnnouncement.isEmpty"

    goto :goto_0

    :cond_3
    new-instance p1, Landroid/content/Intent;

    iget-object v1, p0, Lcom/dof100/morsenotifier/o;->a:Landroid/content/Context;

    const-class v2, Lcom/dof100/morsenotifier/ServiceMain;

    invoke-direct {p1, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v1, p0, Lcom/dof100/morsenotifier/o;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c0024

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/dof100/morsenotifier/o;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0c0001

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/dof100/morsenotifier/o;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c000c

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v0, v0, Lcom/dof100/morsenotifier/m;->j:Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/dof100/morsenotifier/o;->a:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void

    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    const v2, 0x7f070074

    if-ne v1, v2, :cond_5

    const-string v1, "MyAppFiltersArrayAdapter.onClick tv_recentnotification_announcedcriteria"

    invoke-static {v1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/dof100/morsenotifier/o;->d:Lcom/dof100/morsenotifier/o$a;

    iget v0, v0, Lcom/dof100/morsenotifier/m;->i:I

    invoke-interface {v1, v0, p1}, Lcom/dof100/morsenotifier/o$a;->a(ILandroid/view/View;)V

    :cond_5
    return-void
.end method
