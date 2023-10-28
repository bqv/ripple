.class Lcom/dof100/morsenotifier/f;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/dof100/morsenotifier/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/dof100/morsenotifier/f;->a:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    if-eqz p1, :cond_0

    const/16 v0, 0x80

    invoke-virtual {p1, v0}, Landroid/content/pm/PackageManager;->getInstalledApplications(I)Ljava/util/List;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/ApplicationInfo;

    new-instance v2, Lcom/dof100/morsenotifier/e;

    invoke-direct {v2, p1, v1}, Lcom/dof100/morsenotifier/e;-><init>(Landroid/content/pm/PackageManager;Landroid/content/pm/ApplicationInfo;)V

    iget-object v1, p0, Lcom/dof100/morsenotifier/f;->a:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/dof100/morsenotifier/f;->a:Ljava/util/List;

    new-instance v0, Lcom/dof100/morsenotifier/f$1;

    invoke-direct {v0, p0}, Lcom/dof100/morsenotifier/f$1;-><init>(Lcom/dof100/morsenotifier/f;)V

    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/f;->a:Ljava/util/List;

    const/4 v0, 0x0

    new-instance v1, Lcom/dof100/morsenotifier/e;

    const-string v2, "All apps"

    const-string v3, "All apps"

    invoke-direct {v1, v2, v3}, Lcom/dof100/morsenotifier/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v0, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/f;->a:Ljava/util/List;

    const/4 v0, 0x1

    new-instance v1, Lcom/dof100/morsenotifier/e;

    const-string v2, "All system apps"

    const-string v3, "All system apps"

    invoke-direct {v1, v2, v3}, Lcom/dof100/morsenotifier/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v0, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/f;->a:Ljava/util/List;

    const/4 v0, 0x2

    new-instance v1, Lcom/dof100/morsenotifier/e;

    const-string v2, "All non-system apps"

    const-string v3, "All non-system apps"

    invoke-direct {v1, v2, v3}, Lcom/dof100/morsenotifier/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v0, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)I
    .locals 6

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0x50c1c1a4

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, -0x1

    const/4 v5, 0x1

    if-eq v0, v1, :cond_2

    const v1, 0x62abda24

    if-eq v0, v1, :cond_1

    const v1, 0x6b8981b1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "All apps"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    const-string v0, "All non-system apps"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x2

    goto :goto_1

    :cond_2
    const-string v0, "All system apps"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v0, -0x1

    :goto_1
    packed-switch v0, :pswitch_data_0

    const-string v0, "MyAppFilters.getApplicationInfoIndex"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const/4 v0, 0x3

    goto :goto_2

    :pswitch_0
    return v2

    :pswitch_1
    return v5

    :pswitch_2
    return v3

    :goto_2
    iget-object v1, p0, Lcom/dof100/morsenotifier/f;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_6

    iget-object v1, p0, Lcom/dof100/morsenotifier/f;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/dof100/morsenotifier/e;

    if-nez v1, :cond_4

    goto :goto_3

    :cond_4
    iget-object v1, v1, Lcom/dof100/morsenotifier/e;->a:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    return v0

    :cond_5
    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_6
    return v4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public a()Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/dof100/morsenotifier/f;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/dof100/morsenotifier/e;

    iget-object v2, v2, Lcom/dof100/morsenotifier/e;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method
