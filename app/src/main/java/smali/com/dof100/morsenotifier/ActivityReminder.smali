.class public Lcom/dof100/morsenotifier/ActivityReminder;
.super Landroid/app/Activity;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Lcom/dof100/morsenotifier/q;

.field private b:Lcom/dof100/morsenotifier/p;

.field private final c:[Landroid/widget/ToggleButton;

.field private d:Landroid/widget/TimePicker;

.field private e:Landroid/widget/EditText;

.field private f:Landroid/widget/EditText;

.field private g:Landroid/widget/Spinner;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityReminder;->a:Lcom/dof100/morsenotifier/q;

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityReminder;->b:Lcom/dof100/morsenotifier/p;

    const/4 v1, 0x7

    new-array v1, v1, [Landroid/widget/ToggleButton;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const/4 v2, 0x1

    aput-object v0, v1, v2

    const/4 v2, 0x2

    aput-object v0, v1, v2

    const/4 v2, 0x3

    aput-object v0, v1, v2

    const/4 v2, 0x4

    aput-object v0, v1, v2

    const/4 v2, 0x5

    aput-object v0, v1, v2

    const/4 v2, 0x6

    aput-object v0, v1, v2

    iput-object v1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->c:[Landroid/widget/ToggleButton;

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityReminder;->d:Landroid/widget/TimePicker;

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityReminder;->e:Landroid/widget/EditText;

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityReminder;->f:Landroid/widget/EditText;

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityReminder;->g:Landroid/widget/Spinner;

    return-void
.end method

.method private a()V
    .locals 4

    const-string v0, "ActivityReminder.onActionTest"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/dof100/morsenotifier/ActivityReminder;->c()V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/dof100/morsenotifier/ServiceMain;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityReminder;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c0024

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityReminder;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0c0016

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityReminder;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c000b

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/dof100/morsenotifier/ActivityReminder;->b:Lcom/dof100/morsenotifier/p;

    invoke-virtual {v2}, Lcom/dof100/morsenotifier/p;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityReminder;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c000c

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "0"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/dof100/morsenotifier/ActivityReminder;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void
.end method

.method private b()V
    .locals 3

    const-string v0, "ActivityReminder.object2view"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x7

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->c:[Landroid/widget/ToggleButton;

    aget-object v1, v1, v0

    iget-object v2, p0, Lcom/dof100/morsenotifier/ActivityReminder;->b:Lcom/dof100/morsenotifier/p;

    iget-object v2, v2, Lcom/dof100/morsenotifier/p;->c:[Z

    aget-boolean v2, v2, v0

    invoke-virtual {v1, v2}, Landroid/widget/ToggleButton;->setChecked(Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_1

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityReminder;->d:Landroid/widget/TimePicker;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->b:Lcom/dof100/morsenotifier/p;

    iget v1, v1, Lcom/dof100/morsenotifier/p;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TimePicker;->setCurrentHour(Ljava/lang/Integer;)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityReminder;->d:Landroid/widget/TimePicker;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->b:Lcom/dof100/morsenotifier/p;

    iget v1, v1, Lcom/dof100/morsenotifier/p;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TimePicker;->setCurrentMinute(Ljava/lang/Integer;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityReminder;->d:Landroid/widget/TimePicker;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->b:Lcom/dof100/morsenotifier/p;

    iget v1, v1, Lcom/dof100/morsenotifier/p;->a:I

    invoke-virtual {v0, v1}, Landroid/widget/TimePicker;->setHour(I)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityReminder;->d:Landroid/widget/TimePicker;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->b:Lcom/dof100/morsenotifier/p;

    iget v1, v1, Lcom/dof100/morsenotifier/p;->b:I

    invoke-virtual {v0, v1}, Landroid/widget/TimePicker;->setMinute(I)V

    :goto_1
    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityReminder;->e:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->b:Lcom/dof100/morsenotifier/p;

    iget-object v1, v1, Lcom/dof100/morsenotifier/p;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityReminder;->f:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->b:Lcom/dof100/morsenotifier/p;

    iget-object v1, v1, Lcom/dof100/morsenotifier/p;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityReminder;->g:Landroid/widget/Spinner;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->b:Lcom/dof100/morsenotifier/p;

    iget v1, v1, Lcom/dof100/morsenotifier/p;->d:I

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setSelection(I)V

    return-void
.end method

.method private c()V
    .locals 3

    const-string v0, "ActivityReminder.view2object"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x7

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->b:Lcom/dof100/morsenotifier/p;

    iget-object v1, v1, Lcom/dof100/morsenotifier/p;->c:[Z

    iget-object v2, p0, Lcom/dof100/morsenotifier/ActivityReminder;->c:[Landroid/widget/ToggleButton;

    aget-object v2, v2, v0

    invoke-virtual {v2}, Landroid/widget/ToggleButton;->isChecked()Z

    move-result v2

    aput-boolean v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_1

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityReminder;->b:Lcom/dof100/morsenotifier/p;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->d:Landroid/widget/TimePicker;

    invoke-virtual {v1}, Landroid/widget/TimePicker;->getCurrentHour()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, v0, Lcom/dof100/morsenotifier/p;->a:I

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityReminder;->b:Lcom/dof100/morsenotifier/p;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->d:Landroid/widget/TimePicker;

    invoke-virtual {v1}, Landroid/widget/TimePicker;->getCurrentMinute()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :goto_1
    iput v1, v0, Lcom/dof100/morsenotifier/p;->b:I

    goto :goto_2

    :cond_1
    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityReminder;->b:Lcom/dof100/morsenotifier/p;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->d:Landroid/widget/TimePicker;

    invoke-virtual {v1}, Landroid/widget/TimePicker;->getHour()I

    move-result v1

    iput v1, v0, Lcom/dof100/morsenotifier/p;->a:I

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityReminder;->b:Lcom/dof100/morsenotifier/p;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->d:Landroid/widget/TimePicker;

    invoke-virtual {v1}, Landroid/widget/TimePicker;->getMinute()I

    move-result v1

    goto :goto_1

    :goto_2
    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityReminder;->b:Lcom/dof100/morsenotifier/p;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->e:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/dof100/morsenotifier/p;->e:Ljava/lang/String;

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityReminder;->b:Lcom/dof100/morsenotifier/p;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->f:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/dof100/morsenotifier/p;->f:Ljava/lang/String;

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityReminder;->b:Lcom/dof100/morsenotifier/p;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->g:Landroid/widget/Spinner;

    invoke-virtual {v1}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v1

    iput v1, v0, Lcom/dof100/morsenotifier/p;->d:I

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityReminder;->a:Lcom/dof100/morsenotifier/q;

    invoke-virtual {v0, p0}, Lcom/dof100/morsenotifier/q;->b(Landroid/content/Context;)V

    invoke-static {p0}, Lcom/dof100/morsenotifier/g;->a(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    const-string v0, "ActivityReminder.onClick"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f070021

    if-ne p1, v0, :cond_1

    invoke-direct {p0}, Lcom/dof100/morsenotifier/ActivityReminder;->a()V

    :cond_1
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    const-string p1, "ActivityReminder.onCreate"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const p1, 0x7f090008

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityReminder;->setContentView(I)V

    const p1, 0x7f070021

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityReminder;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    invoke-virtual {p1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance p1, Lcom/dof100/morsenotifier/q;

    invoke-direct {p1, p0}, Lcom/dof100/morsenotifier/q;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->a:Lcom/dof100/morsenotifier/q;

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityReminder;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    const-string v1, "OBJECTINDEX"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->a:Lcom/dof100/morsenotifier/q;

    iget-object v1, v1, Lcom/dof100/morsenotifier/q;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/dof100/morsenotifier/p;

    iput-object v1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->b:Lcom/dof100/morsenotifier/p;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ActivityReminder.onCreate loaded entry at position = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const p1, 0x7f0c01c5

    :goto_0
    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityReminder;->setTitle(I)V

    goto :goto_1

    :cond_0
    new-instance p1, Lcom/dof100/morsenotifier/p;

    invoke-direct {p1}, Lcom/dof100/morsenotifier/p;-><init>()V

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->b:Lcom/dof100/morsenotifier/p;

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->a:Lcom/dof100/morsenotifier/q;

    iget-object p1, p1, Lcom/dof100/morsenotifier/q;->a:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->b:Lcom/dof100/morsenotifier/p;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->a:Lcom/dof100/morsenotifier/q;

    iget-object p1, p1, Lcom/dof100/morsenotifier/q;->a:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    sub-int/2addr p1, v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ActivityReminder.onCreate created new entry at position = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const p1, 0x7f0c01c6

    goto :goto_0

    :goto_1
    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->c:[Landroid/widget/ToggleButton;

    const/4 v1, 0x0

    const v2, 0x7f07005a

    invoke-virtual {p0, v2}, Lcom/dof100/morsenotifier/ActivityReminder;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ToggleButton;

    aput-object v2, p1, v1

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->c:[Landroid/widget/ToggleButton;

    const v1, 0x7f07005b

    invoke-virtual {p0, v1}, Lcom/dof100/morsenotifier/ActivityReminder;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ToggleButton;

    aput-object v1, p1, v0

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->c:[Landroid/widget/ToggleButton;

    const/4 v1, 0x2

    const v2, 0x7f07005c

    invoke-virtual {p0, v2}, Lcom/dof100/morsenotifier/ActivityReminder;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ToggleButton;

    aput-object v2, p1, v1

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->c:[Landroid/widget/ToggleButton;

    const/4 v1, 0x3

    const v2, 0x7f07005d

    invoke-virtual {p0, v2}, Lcom/dof100/morsenotifier/ActivityReminder;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ToggleButton;

    aput-object v2, p1, v1

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->c:[Landroid/widget/ToggleButton;

    const/4 v1, 0x4

    const v2, 0x7f07005e

    invoke-virtual {p0, v2}, Lcom/dof100/morsenotifier/ActivityReminder;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ToggleButton;

    aput-object v2, p1, v1

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->c:[Landroid/widget/ToggleButton;

    const/4 v1, 0x5

    const v2, 0x7f07005f

    invoke-virtual {p0, v2}, Lcom/dof100/morsenotifier/ActivityReminder;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ToggleButton;

    aput-object v2, p1, v1

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->c:[Landroid/widget/ToggleButton;

    const/4 v1, 0x6

    const v2, 0x7f070060

    invoke-virtual {p0, v2}, Lcom/dof100/morsenotifier/ActivityReminder;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ToggleButton;

    aput-object v2, p1, v1

    const p1, 0x7f070066

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityReminder;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TimePicker;

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->d:Landroid/widget/TimePicker;

    const p1, 0x7f070030

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityReminder;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->e:Landroid/widget/EditText;

    const p1, 0x7f07002f

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityReminder;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->f:Landroid/widget/EditText;

    const p1, 0x7f070056

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityReminder;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Spinner;

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->g:Landroid/widget/Spinner;

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityReminder;->d:Landroid/widget/TimePicker;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TimePicker;->setIs24HourView(Ljava/lang/Boolean;)V

    invoke-direct {p0}, Lcom/dof100/morsenotifier/ActivityReminder;->b()V

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    const-string v0, "ActivityReminder.onDestroy"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    return-void
.end method

.method protected onPause()V
    .locals 1

    const-string v0, "ActivityReminder.onPause"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/dof100/morsenotifier/ActivityReminder;->c()V

    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    return-void
.end method

.method protected onStop()V
    .locals 1

    const-string v0, "ActivityReminder.onStop"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    return-void
.end method
