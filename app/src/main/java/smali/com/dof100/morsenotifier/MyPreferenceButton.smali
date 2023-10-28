.class public Lcom/dof100/morsenotifier/MyPreferenceButton;
.super Landroid/preference/Preference;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    invoke-direct {p0, p1, p2}, Landroid/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-object p1, p0, Lcom/dof100/morsenotifier/MyPreferenceButton;->a:Landroid/content/Context;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/dof100/morsenotifier/MyPreferenceButton;->setSelectable(Z)V

    const-string v0, "http://mypreferencenamespace.100dof.com"

    const-string v1, "buttonCaption"

    const-string v2, ""

    invoke-static {p1, p2, v0, v1, v2}, Lcom/dof100/morsenotifier/v;->a(Landroid/content/Context;Landroid/util/AttributeSet;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceButton;->c:Ljava/lang/String;

    const-string v0, "http://mypreferencenamespace.100dof.com"

    const-string v1, "buttonIntentClass"

    const-string v2, ""

    invoke-static {p1, p2, v0, v1, v2}, Lcom/dof100/morsenotifier/v;->a(Landroid/content/Context;Landroid/util/AttributeSet;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceButton;->b:Ljava/lang/String;

    const-string v0, "http://mypreferencenamespace.100dof.com"

    const-string v1, "buttonMsgWhat"

    const-string v2, "0"

    invoke-static {p1, p2, v0, v1, v2}, Lcom/dof100/morsenotifier/v;->a(Landroid/content/Context;Landroid/util/AttributeSet;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceButton;->d:Ljava/lang/String;

    const-string v0, "http://mypreferencenamespace.100dof.com"

    const-string v1, "buttonMsgExtraText1"

    const-string v2, "0"

    invoke-static {p1, p2, v0, v1, v2}, Lcom/dof100/morsenotifier/v;->a(Landroid/content/Context;Landroid/util/AttributeSet;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceButton;->e:Ljava/lang/String;

    const-string v0, "http://mypreferencenamespace.100dof.com"

    const-string v1, "buttonMsgExtraText2"

    const-string v2, "0"

    invoke-static {p1, p2, v0, v1, v2}, Lcom/dof100/morsenotifier/v;->a(Landroid/content/Context;Landroid/util/AttributeSet;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceButton;->f:Ljava/lang/String;

    const-string v0, "http://mypreferencenamespace.100dof.com"

    const-string v1, "enableFree"

    const-string v2, "true"

    invoke-static {p1, p2, v0, v1, v2}, Lcom/dof100/morsenotifier/v;->a(Landroid/content/Context;Landroid/util/AttributeSet;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "true"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "http://mypreferencenamespace.100dof.com"

    const-string v2, "enablePro"

    const-string v3, "true"

    invoke-static {p1, p2, v1, v2, v3}, Lcom/dof100/morsenotifier/v;->a(Landroid/content/Context;Landroid/util/AttributeSet;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "true"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    sget-boolean p2, Lcom/dof100/morsenotifier/App;->a:Z

    if-eqz p2, :cond_0

    invoke-virtual {p0, v0}, Lcom/dof100/morsenotifier/MyPreferenceButton;->setEnabled(Z)V

    :cond_0
    sget-boolean p2, Lcom/dof100/morsenotifier/App;->b:Z

    if-eqz p2, :cond_1

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/MyPreferenceButton;->setEnabled(Z)V

    :cond_1
    return-void
.end method

.method private a()V
    .locals 3

    :try_start_0
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/dof100/morsenotifier/MyPreferenceButton;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/dof100/morsenotifier/MyPreferenceButton;->b:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v1, p0, Lcom/dof100/morsenotifier/MyPreferenceButton;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c0024

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/dof100/morsenotifier/MyPreferenceButton;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/dof100/morsenotifier/MyPreferenceButton;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c000b

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/dof100/morsenotifier/MyPreferenceButton;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/dof100/morsenotifier/MyPreferenceButton;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c000c

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/dof100/morsenotifier/MyPreferenceButton;->f:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/dof100/morsenotifier/MyPreferenceButton;->b:Ljava/lang/String;

    const-string v2, "ervice"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/dof100/morsenotifier/MyPreferenceButton;->a:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void

    :cond_0
    iget-object v1, p0, Lcom/dof100/morsenotifier/MyPreferenceButton;->a:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/ClassNotFoundException;->printStackTrace()V

    return-void
.end method

.method static synthetic a(Lcom/dof100/morsenotifier/MyPreferenceButton;)V
    .locals 0

    invoke-direct {p0}, Lcom/dof100/morsenotifier/MyPreferenceButton;->a()V

    return-void
.end method


# virtual methods
.method protected onBindView(Landroid/view/View;)V
    .locals 8

    const-string v0, "MyPreferenceButton.onBindView"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const v0, 0x1020016

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x1020010

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Landroid/widget/TextView;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout;

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    new-instance v3, Landroid/widget/Button;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    iget-object v4, p0, Lcom/dof100/morsenotifier/MyPreferenceButton;->c:Ljava/lang/String;

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    new-instance v4, Lcom/dof100/morsenotifier/MyPreferenceButton$1;

    invoke-direct {v4, p0}, Lcom/dof100/morsenotifier/MyPreferenceButton$1;-><init>(Lcom/dof100/morsenotifier/MyPreferenceButton;)V

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v4, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v5, -0x2

    invoke-direct {v4, v5, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0}, Landroid/widget/TextView;->getId()I

    move-result v6

    const/4 v7, 0x3

    invoke-virtual {v4, v7, v6}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    invoke-virtual {v0}, Landroid/widget/TextView;->getId()I

    move-result v0

    const/4 v6, 0x5

    invoke-virtual {v4, v6, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v0, 0x7f07004b

    invoke-virtual {v3, v0}, Landroid/widget/Button;->setId(I)V

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v0, v5, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3}, Landroid/widget/Button;->getId()I

    move-result v2

    invoke-virtual {v0, v7, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    invoke-virtual {v3}, Landroid/widget/Button;->getId()I

    move-result v2

    invoke-virtual {v0, v6, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    :cond_0
    const-string v0, "MyPreferenceButton.onBindView title or summary = null"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    :goto_0
    invoke-super {p0, p1}, Landroid/preference/Preference;->onBindView(Landroid/view/View;)V

    return-void
.end method
