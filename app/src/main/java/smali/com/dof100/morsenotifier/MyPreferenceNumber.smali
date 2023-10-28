.class public Lcom/dof100/morsenotifier/MyPreferenceNumber;
.super Landroid/preference/DialogPreference;


# static fields
.field private static final a:Landroid/content/res/ColorStateList;


# instance fields
.field private b:Landroid/widget/NumberPicker;

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/Boolean;

.field private i:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Landroid/content/res/ColorStateList;

    const/4 v1, 0x2

    new-array v2, v1, [[I

    const/4 v3, 0x1

    new-array v4, v3, [I

    const/4 v5, 0x0

    const v6, 0x101009e

    aput v6, v4, v5

    aput-object v4, v2, v5

    new-array v4, v3, [I

    const v6, -0x101009e

    aput v6, v4, v5

    aput-object v4, v2, v3

    new-array v1, v1, [I

    const/16 v4, 0xb

    const/16 v6, 0x8d

    const/16 v7, 0xbd

    invoke-static {v4, v6, v7}, Landroid/graphics/Color;->rgb(III)I

    move-result v4

    aput v4, v1, v5

    const v4, -0x777778

    aput v4, v1, v3

    invoke-direct {v0, v2, v1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    sput-object v0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->a:Landroid/content/res/ColorStateList;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    invoke-direct {p0, p1, p2}, Landroid/preference/DialogPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->b:Landroid/widget/NumberPicker;

    const/4 v1, 0x0

    iput v1, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->c:I

    iput v1, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->d:I

    const/16 v2, 0xa

    iput v2, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->e:I

    const/4 v2, 0x1

    iput v2, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->f:I

    const-string v3, ""

    iput-object v3, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->g:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->h:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->i:Landroid/widget/TextView;

    const-string v0, "Set"

    invoke-virtual {p0, v0}, Lcom/dof100/morsenotifier/MyPreferenceNumber;->setPositiveButtonText(Ljava/lang/CharSequence;)V

    const-string v0, "Cancel"

    invoke-virtual {p0, v0}, Lcom/dof100/morsenotifier/MyPreferenceNumber;->setNegativeButtonText(Ljava/lang/CharSequence;)V

    :goto_0
    invoke-interface {p2}, Landroid/util/AttributeSet;->getAttributeCount()I

    move-result v0

    if-ge v1, v0, :cond_9

    invoke-interface {p2, v1}, Landroid/util/AttributeSet;->getAttributeName(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v1}, Landroid/util/AttributeSet;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "vmin"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_7

    const-string v3, "valueMin"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_4

    :cond_0
    const-string v3, "vmax"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_6

    const-string v3, "valueMax"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_3

    :cond_1
    const-string v3, "vstep"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_5

    const-string v3, "valueStep"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    const-string v3, "vunits"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_4

    const-string v3, "valueUnits"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_1

    :cond_3
    const-string v3, "valueShow"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v2, "true"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->h:Ljava/lang/Boolean;

    goto :goto_5

    :cond_4
    :goto_1
    iput-object v2, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->g:Ljava/lang/String;

    goto :goto_5

    :cond_5
    :goto_2
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->f:I

    goto :goto_5

    :cond_6
    :goto_3
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->e:I

    goto :goto_5

    :cond_7
    :goto_4
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->d:I

    :cond_8
    :goto_5
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_9
    const-string v0, "http://mypreferencenamespace.100dof.com"

    const-string v1, "enableFree"

    const-string v2, "true"

    invoke-static {p1, p2, v0, v1, v2}, Lcom/dof100/morsenotifier/v;->a(Landroid/content/Context;Landroid/util/AttributeSet;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "true"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->a:Z

    if-eqz v1, :cond_a

    invoke-virtual {p0, v0}, Lcom/dof100/morsenotifier/MyPreferenceNumber;->setEnabled(Z)V

    :cond_a
    const-string v0, "http://mypreferencenamespace.100dof.com"

    const-string v1, "enablePro"

    const-string v2, "true"

    invoke-static {p1, p2, v0, v1, v2}, Lcom/dof100/morsenotifier/v;->a(Landroid/content/Context;Landroid/util/AttributeSet;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "true"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    sget-boolean p2, Lcom/dof100/morsenotifier/App;->b:Z

    if-eqz p2, :cond_b

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/MyPreferenceNumber;->setEnabled(Z)V

    :cond_b
    return-void
.end method

.method private a()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->c:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->g:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->g:Ljava/lang/String;

    const-string v2, "%"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->g:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    goto :goto_0

    :cond_1
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MyNumberPreference.getValueStr ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method protected a(Landroid/view/View;)V
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MyNumberPreference "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/MyPreferenceNumber;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " myCreateView"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const v0, 0x1020010

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->i:Landroid/widget/TextView;

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MyNumberPreference "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/MyPreferenceNumber;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " myCreateView mValueTV!=null"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->i:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->i:Landroid/widget/TextView;

    :cond_0
    new-instance v2, Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->i:Landroid/widget/TextView;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    const v4, 0x1030046

    if-ge v2, v3, :cond_1

    iget-object v2, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->i:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {v2, p1, v4}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->i:Landroid/widget/TextView;

    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setTextAppearance(I)V

    :goto_0
    iget-object p1, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->i:Landroid/widget/TextView;

    sget-object v2, Lcom/dof100/morsenotifier/MyPreferenceNumber;->a:Landroid/content/res/ColorStateList;

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    new-instance p1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {p1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/4 v2, 0x5

    invoke-virtual {p1, v2, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/4 v2, 0x3

    invoke-virtual {p1, v2, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->i:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->i:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->h:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    const/16 v0, 0x8

    :goto_1
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->i:Landroid/widget/TextView;

    invoke-virtual {v1, p1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    return-void
.end method

.method protected onBindDialogView(Landroid/view/View;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/preference/DialogPreference;->onBindDialogView(Landroid/view/View;)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->b:Landroid/widget/NumberPicker;

    iget v0, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->c:I

    iget v1, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->d:I

    sub-int/2addr v0, v1

    iget v1, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->f:I

    div-int/2addr v0, v1

    invoke-virtual {p1, v0}, Landroid/widget/NumberPicker;->setValue(I)V

    return-void
.end method

.method protected onBindView(Landroid/view/View;)V
    .locals 7

    const v0, 0x1020010

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout;

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->i:Landroid/widget/TextView;

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getChildCount()I

    move-result v4

    if-ge v3, v4, :cond_1

    invoke-virtual {v1, v3}, Landroid/widget/RelativeLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    instance-of v5, v4, Landroid/widget/TextView;

    if-eqz v5, :cond_0

    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v5

    const v6, 0x1020016

    if-eq v5, v6, :cond_0

    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v5

    if-eq v5, v0, :cond_0

    check-cast v4, Landroid/widget/TextView;

    iput-object v4, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->i:Landroid/widget/TextView;

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->i:Landroid/widget/TextView;

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lcom/dof100/morsenotifier/MyPreferenceNumber;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->i:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->i:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->i:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_3
    :goto_1
    invoke-super {p0, p1}, Landroid/preference/DialogPreference;->onBindView(Landroid/view/View;)V

    return-void
.end method

.method protected onCreateDialogView()Landroid/view/View;
    .locals 10

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/MyPreferenceNumber;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/widget/LinearLayout;

    invoke-direct {v1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v3, 0x11

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/4 v4, 0x6

    invoke-virtual {v1, v4, v4, v4, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    new-instance v4, Landroid/widget/NumberPicker;

    invoke-direct {v4, v0}, Landroid/widget/NumberPicker;-><init>(Landroid/content/Context;)V

    iput-object v4, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->b:Landroid/widget/NumberPicker;

    iget-object v4, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->b:Landroid/widget/NumberPicker;

    invoke-virtual {v4, v3}, Landroid/widget/NumberPicker;->setGravity(I)V

    iget v4, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->e:I

    iget v5, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->d:I

    sub-int/2addr v4, v5

    iget v5, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->f:I

    div-int/2addr v4, v5

    add-int/lit8 v5, v4, 0x0

    const/4 v6, 0x1

    add-int/2addr v5, v6

    new-array v5, v5, [Ljava/lang/String;

    const/4 v7, 0x0

    :goto_0
    if-gt v7, v4, :cond_0

    iget v8, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->d:I

    iget v9, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->f:I

    mul-int v9, v9, v7

    add-int/2addr v8, v9

    invoke-static {v8}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v5, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_0
    iget-object v7, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->b:Landroid/widget/NumberPicker;

    invoke-virtual {v7, v2}, Landroid/widget/NumberPicker;->setMinValue(I)V

    iget-object v7, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->b:Landroid/widget/NumberPicker;

    invoke-virtual {v7, v4}, Landroid/widget/NumberPicker;->setMaxValue(I)V

    iget-object v4, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->b:Landroid/widget/NumberPicker;

    invoke-virtual {v4, v5}, Landroid/widget/NumberPicker;->setDisplayedValues([Ljava/lang/String;)V

    iget-object v4, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->b:Landroid/widget/NumberPicker;

    const/high16 v5, 0x60000

    invoke-virtual {v4, v5}, Landroid/widget/NumberPicker;->setDescendantFocusability(I)V

    iget-object v4, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->b:Landroid/widget/NumberPicker;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    iget-object v4, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->g:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    new-instance v4, Landroid/widget/TextView;

    invoke-direct {v4, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, " %s"

    new-array v6, v6, [Ljava/lang/Object;

    iget-object v7, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->g:Ljava/lang/String;

    aput-object v7, v6, v2

    invoke-static {v0, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setGravity(I)V

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    :cond_1
    return-object v1
.end method

.method protected onCreateView(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MyNumberPreference "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/MyPreferenceNumber;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " onCreateView"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/preference/DialogPreference;->onCreateView(Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/MyPreferenceNumber;->a(Landroid/view/View;)V

    return-object p1
.end method

.method protected onDialogClosed(Z)V
    .locals 2

    invoke-super {p0, p1}, Landroid/preference/DialogPreference;->onDialogClosed(Z)V

    const-string v0, "MyNumberPreference.onDialogClosed"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    iget p1, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->d:I

    iget-object v0, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->b:Landroid/widget/NumberPicker;

    invoke-virtual {v0}, Landroid/widget/NumberPicker;->getValue()I

    move-result v0

    iget v1, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->f:I

    mul-int v0, v0, v1

    add-int/2addr p1, v0

    iput p1, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->c:I

    iget p1, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->c:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/MyPreferenceNumber;->callChangeListener(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget p1, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->c:I

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/MyPreferenceNumber;->persistString(Ljava/lang/String;)Z

    :cond_0
    iget-object p1, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->i:Landroid/widget/TextView;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->i:Landroid/widget/TextView;

    invoke-direct {p0}, Lcom/dof100/morsenotifier/MyPreferenceNumber;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    invoke-virtual {p0}, Lcom/dof100/morsenotifier/MyPreferenceNumber;->notifyChanged()V

    return-void
.end method

.method protected onGetDefaultValue(Landroid/content/res/TypedArray;I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected onSetInitialValue(ZLjava/lang/Object;)V
    .locals 0

    if-eqz p1, :cond_0

    const-string p1, "0"

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/MyPreferenceNumber;->getPersistedString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/dof100/morsenotifier/MyPreferenceNumber;->persistString(Ljava/lang/String;)Z

    :goto_0
    iput p1, p0, Lcom/dof100/morsenotifier/MyPreferenceNumber;->c:I

    return-void
.end method
