.class public Lcom/dof100/morsenotifier/MyPreferenceText;
.super Landroid/preference/Preference;


# static fields
.field private static final a:Landroid/content/res/ColorStateList;

.field private static final b:Landroid/content/res/ColorStateList;


# instance fields
.field private final c:Landroid/content/Context;

.field private d:Z

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/String;

.field private final h:Ljava/lang/String;

.field private i:Ljava/lang/Boolean;

.field private j:Ljava/lang/Boolean;

.field private k:Landroid/widget/TextView;

.field private l:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Landroid/content/res/ColorStateList;

    const/4 v1, 0x2

    new-array v2, v1, [[I

    const/4 v3, 0x1

    new-array v4, v3, [I

    const v5, 0x101009e

    const/4 v6, 0x0

    aput v5, v4, v6

    aput-object v4, v2, v6

    new-array v4, v3, [I

    const v7, -0x101009e

    aput v7, v4, v6

    aput-object v4, v2, v3

    new-array v4, v1, [I

    const/16 v8, 0xf0

    const/16 v9, 0xa0

    invoke-static {v8, v8, v9}, Landroid/graphics/Color;->rgb(III)I

    move-result v8

    aput v8, v4, v6

    const v8, -0x777778

    aput v8, v4, v3

    invoke-direct {v0, v2, v4}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    sput-object v0, Lcom/dof100/morsenotifier/MyPreferenceText;->a:Landroid/content/res/ColorStateList;

    new-instance v0, Landroid/content/res/ColorStateList;

    new-array v2, v1, [[I

    new-array v4, v3, [I

    aput v5, v4, v6

    aput-object v4, v2, v6

    new-array v4, v3, [I

    aput v7, v4, v6

    aput-object v4, v2, v3

    new-array v1, v1, [I

    const/16 v4, 0xb

    const/16 v5, 0x8d

    const/16 v7, 0xbd

    invoke-static {v4, v5, v7}, Landroid/graphics/Color;->rgb(III)I

    move-result v4

    aput v4, v1, v6

    aput v8, v1, v3

    invoke-direct {v0, v2, v1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    sput-object v0, Lcom/dof100/morsenotifier/MyPreferenceText;->b:Landroid/content/res/ColorStateList;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    invoke-direct {p0, p1, p2}, Landroid/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->d:Z

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->i:Ljava/lang/Boolean;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->j:Ljava/lang/Boolean;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->k:Landroid/widget/TextView;

    const-string v0, ""

    iput-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->l:Ljava/lang/String;

    iput-object p1, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->c:Landroid/content/Context;

    invoke-virtual {p0, v1}, Lcom/dof100/morsenotifier/MyPreferenceText;->setSelectable(Z)V

    const-string v0, "http://mypreferencenamespace.100dof.com"

    const-string v2, "buttonIntentClass"

    const-string v3, ""

    invoke-static {p1, p2, v0, v2, v3}, Lcom/dof100/morsenotifier/v;->a(Landroid/content/Context;Landroid/util/AttributeSet;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->e:Ljava/lang/String;

    const-string v0, "http://mypreferencenamespace.100dof.com"

    const-string v2, "buttonMsgWhat"

    const-string v3, "0"

    invoke-static {p1, p2, v0, v2, v3}, Lcom/dof100/morsenotifier/v;->a(Landroid/content/Context;Landroid/util/AttributeSet;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->f:Ljava/lang/String;

    const-string v0, "http://mypreferencenamespace.100dof.com"

    const-string v2, "buttonMsgExtraText1"

    const-string v3, "0"

    invoke-static {p1, p2, v0, v2, v3}, Lcom/dof100/morsenotifier/v;->a(Landroid/content/Context;Landroid/util/AttributeSet;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->g:Ljava/lang/String;

    const-string v0, "http://mypreferencenamespace.100dof.com"

    const-string v2, "buttonMsgExtraText2"

    const-string v3, "0"

    invoke-static {p1, p2, v0, v2, v3}, Lcom/dof100/morsenotifier/v;->a(Landroid/content/Context;Landroid/util/AttributeSet;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->h:Ljava/lang/String;

    :goto_0
    invoke-interface {p2}, Landroid/util/AttributeSet;->getAttributeCount()I

    move-result v0

    if-ge v1, v0, :cond_2

    invoke-interface {p2, v1}, Landroid/util/AttributeSet;->getAttributeName(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v1}, Landroid/util/AttributeSet;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "valueShow"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v2, "true"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->j:Ljava/lang/Boolean;

    goto :goto_1

    :cond_0
    const-string v3, "titleYellow"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v2, "true"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->i:Ljava/lang/Boolean;

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
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

    move-result-object v1

    const-string v2, "true"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    const-string v2, "http://mypreferencenamespace.100dof.com"

    const-string v3, "visibleFree"

    const-string v4, "true"

    invoke-static {p1, p2, v2, v3, v4}, Lcom/dof100/morsenotifier/v;->a(Landroid/content/Context;Landroid/util/AttributeSet;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "true"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    const-string v3, "http://mypreferencenamespace.100dof.com"

    const-string v4, "visiblePro"

    const-string v5, "true"

    invoke-static {p1, p2, v3, v4, v5}, Lcom/dof100/morsenotifier/v;->a(Landroid/content/Context;Landroid/util/AttributeSet;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "true"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    sget-boolean p2, Lcom/dof100/morsenotifier/App;->a:Z

    if-eqz p2, :cond_3

    invoke-virtual {p0, v0}, Lcom/dof100/morsenotifier/MyPreferenceText;->setEnabled(Z)V

    iput-boolean v2, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->d:Z

    :cond_3
    sget-boolean p2, Lcom/dof100/morsenotifier/App;->b:Z

    if-eqz p2, :cond_4

    invoke-virtual {p0, v1}, Lcom/dof100/morsenotifier/MyPreferenceText;->setEnabled(Z)V

    iput-boolean p1, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->d:Z

    :cond_4
    return-void
.end method

.method private a()V
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->c:Landroid/content/Context;

    iget-object v3, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->e:Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    iget-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0c0024

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->f:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0c000b

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->g:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0c000c

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->h:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v1

    move-object v4, v1

    move-object v1, v0

    move-object v0, v4

    :goto_0
    invoke-virtual {v0}, Ljava/lang/ClassNotFoundException;->printStackTrace()V

    :goto_1
    :try_start_2
    iget-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->e:Ljava/lang/String;

    const-string v2, "PLAYSTORE"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->c:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    sget-object v3, Lcom/dof100/morsenotifier/App;->l:Ljava/lang/String;

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    :goto_2
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->e:Ljava/lang/String;

    const-string v2, "PLAYSTOREPRO"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->c:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    sget-object v3, Lcom/dof100/morsenotifier/App;->m:Ljava/lang/String;

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    goto :goto_2

    :cond_1
    iget-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->e:Ljava/lang/String;

    const-string v2, "Service"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->c:Landroid/content/Context;

    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void

    :cond_2
    iget-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->c:Landroid/content/Context;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    return-void
.end method

.method static synthetic a(Lcom/dof100/morsenotifier/MyPreferenceText;)V
    .locals 0

    invoke-direct {p0}, Lcom/dof100/morsenotifier/MyPreferenceText;->a()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->l:Ljava/lang/String;

    iget-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->k:Landroid/widget/TextView;

    if-nez v0, :cond_0

    const-string p1, "MyPreferenceText.setValue ERROR  mValueTV == null"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->k:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method protected onBindView(Landroid/view/View;)V
    .locals 6

    const-string v0, "MyPreferenceText.onBindView"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const v0, 0x1020016

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->i:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    sget-object v1, Lcom/dof100/morsenotifier/MyPreferenceText;->a:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_0
    const v1, 0x1020010

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/widget/TextView;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout;

    new-instance v3, Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v3, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->k:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->k:Landroid/widget/TextView;

    const-string v4, ""

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x17

    const v5, 0x1030046

    if-ge v3, v4, :cond_1

    iget-object v3, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->k:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v3, v4, v5}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    goto :goto_0

    :cond_1
    iget-object v3, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->k:Landroid/widget/TextView;

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTextAppearance(I)V

    :goto_0
    iget-object v3, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->k:Landroid/widget/TextView;

    sget-object v4, Lcom/dof100/morsenotifier/MyPreferenceText;->b:Landroid/content/res/ColorStateList;

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v4, -0x1

    const/4 v5, -0x2

    invoke-direct {v3, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/4 v4, 0x5

    invoke-virtual {v1}, Landroid/widget/TextView;->getId()I

    move-result v5

    invoke-virtual {v3, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/4 v4, 0x3

    invoke-virtual {v1}, Landroid/widget/TextView;->getId()I

    move-result v5

    invoke-virtual {v3, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    iget-object v4, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->k:Landroid/widget/TextView;

    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v3, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->k:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->j:Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_2

    const/4 v4, 0x0

    goto :goto_1

    :cond_2
    const/16 v4, 0x8

    :goto_1
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v3, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->k:Landroid/widget/TextView;

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    iput-object v2, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->k:Landroid/widget/TextView;

    :goto_2
    iget-object v2, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->e:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_6

    if-eqz v0, :cond_4

    new-instance v2, Lcom/dof100/morsenotifier/MyPreferenceText$1;

    invoke-direct {v2, p0}, Lcom/dof100/morsenotifier/MyPreferenceText$1;-><init>(Lcom/dof100/morsenotifier/MyPreferenceText;)V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_4
    if-eqz v1, :cond_5

    new-instance v0, Lcom/dof100/morsenotifier/MyPreferenceText$2;

    invoke-direct {v0, p0}, Lcom/dof100/morsenotifier/MyPreferenceText$2;-><init>(Lcom/dof100/morsenotifier/MyPreferenceText;)V

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_5
    iget-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->k:Landroid/widget/TextView;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->k:Landroid/widget/TextView;

    new-instance v1, Lcom/dof100/morsenotifier/MyPreferenceText$3;

    invoke-direct {v1, p0}, Lcom/dof100/morsenotifier/MyPreferenceText$3;-><init>(Lcom/dof100/morsenotifier/MyPreferenceText;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_6
    iget-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->l:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/dof100/morsenotifier/MyPreferenceText;->a(Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/preference/Preference;->onBindView(Landroid/view/View;)V

    return-void
.end method

.method protected onCreateView(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    const-string v0, "MyPreferenceText.onBindView"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/preference/Preference;->onCreateView(Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iget-boolean v1, p0, Lcom/dof100/morsenotifier/MyPreferenceText;->d:Z

    if-nez v1, :cond_0

    new-instance v0, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/16 p1, 0x8

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    new-instance v1, Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const v2, 0x1020010

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setId(I)V

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setVisibility(I)V

    new-instance v1, Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const v2, 0x1020016

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setId(I)V

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setVisibility(I)V

    new-instance v1, Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const v2, 0x1020018

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setId(I)V

    invoke-virtual {v1, p1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_0
    return-object v0
.end method
