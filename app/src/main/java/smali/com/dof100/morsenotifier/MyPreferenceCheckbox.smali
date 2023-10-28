.class public Lcom/dof100/morsenotifier/MyPreferenceCheckbox;
.super Landroid/preference/CheckBoxPreference;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    invoke-direct {p0, p1, p2}, Landroid/preference/CheckBoxPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const-string v0, "http://mypreferencenamespace.100dof.com"

    const-string v1, "enableFree"

    const-string v2, "true"

    invoke-static {p1, p2, v0, v1, v2}, Lcom/dof100/morsenotifier/v;->a(Landroid/content/Context;Landroid/util/AttributeSet;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "true"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->a:Z

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, Lcom/dof100/morsenotifier/MyPreferenceCheckbox;->setEnabled(Z)V

    :cond_0
    const-string v0, "http://mypreferencenamespace.100dof.com"

    const-string v1, "enablePro"

    const-string v2, "true"

    invoke-static {p1, p2, v0, v1, v2}, Lcom/dof100/morsenotifier/v;->a(Landroid/content/Context;Landroid/util/AttributeSet;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "true"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    sget-boolean p2, Lcom/dof100/morsenotifier/App;->b:Z

    if-eqz p2, :cond_1

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/MyPreferenceCheckbox;->setEnabled(Z)V

    :cond_1
    return-void
.end method


# virtual methods
.method protected onBindView(Landroid/view/View;)V
    .locals 4

    const v0, 0x1020010

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    const v0, 0x1020001

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    iget v3, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    div-int/lit8 v3, v3, 0x2

    iput v3, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    check-cast v0, Landroid/widget/CheckBox;

    const v1, 0x7f060011

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setButtonDrawable(I)V

    invoke-super {p0, p1}, Landroid/preference/CheckBoxPreference;->onBindView(Landroid/view/View;)V

    return-void
.end method
