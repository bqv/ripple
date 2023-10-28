.class Lcom/dof100/morsenotifier/q;
.super Ljava/lang/Object;


# instance fields
.field public a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/dof100/morsenotifier/p;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "MyReminders.constructor"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/dof100/morsenotifier/q;->a:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/q;->a(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/dof100/morsenotifier/p;
    .locals 10

    const/4 v0, 0x0

    const-wide v1, 0x7fffffffffffffffL

    const/4 v3, 0x0

    :goto_0
    iget-object v4, p0, Lcom/dof100/morsenotifier/q;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_1

    iget-object v4, p0, Lcom/dof100/morsenotifier/q;->a:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/dof100/morsenotifier/p;

    invoke-virtual {v4}, Lcom/dof100/morsenotifier/p;->b()V

    iget-wide v5, v4, Lcom/dof100/morsenotifier/p;->g:J

    const-wide/16 v7, 0x0

    cmp-long v9, v5, v7

    if-ltz v9, :cond_0

    iget-wide v5, v4, Lcom/dof100/morsenotifier/p;->g:J

    cmp-long v7, v1, v5

    if-lez v7, :cond_0

    iget-wide v0, v4, Lcom/dof100/morsenotifier/p;->g:J

    move-wide v1, v0

    move-object v0, v4

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public a(Landroid/content/Context;)V
    .locals 6

    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    const-string v0, "reminders_n"

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "MyReminders.load - loading %d entries"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v1

    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/dof100/morsenotifier/q;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    :goto_0
    if-ge v1, v0, :cond_0

    new-instance v2, Lcom/dof100/morsenotifier/p;

    invoke-direct {v2}, Lcom/dof100/morsenotifier/p;-><init>()V

    invoke-virtual {v2, p1, v1}, Lcom/dof100/morsenotifier/p;->a(Landroid/content/SharedPreferences;I)V

    iget-object v3, p0, Lcom/dof100/morsenotifier/q;->a:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b(Landroid/content/Context;)V
    .locals 6

    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    iget-object v0, p0, Lcom/dof100/morsenotifier/q;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "MyReminders.save - saving %d entries"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const-string v1, "reminders_n"

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    :goto_0
    if-ge v5, v0, :cond_0

    iget-object v1, p0, Lcom/dof100/morsenotifier/q;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/dof100/morsenotifier/p;

    invoke-virtual {v1, p1, v5}, Lcom/dof100/morsenotifier/p;->a(Landroid/content/SharedPreferences$Editor;I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
