.class Lcom/dof100/morsenotifier/n;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/dof100/morsenotifier/m;",
            ">;"
        }
    .end annotation
.end field

.field private b:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/n;->b:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/dof100/morsenotifier/n;->a:Ljava/util/ArrayList;

    const-string v0, "MyRecentAppNotifications.constructor"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/n;->b(Landroid/content/Context;)V

    return-void
.end method

.method private a()V
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MyRecentAppNotifications.arrange - in ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/dof100/morsenotifier/n;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") entries"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/dof100/morsenotifier/n;->b:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/dof100/morsenotifier/n;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    goto :goto_2

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/dof100/morsenotifier/n;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/dof100/morsenotifier/m;

    iget-wide v3, v3, Lcom/dof100/morsenotifier/m;->a:J

    sub-long v5, v0, v3

    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    move-result-wide v3

    const-wide/32 v5, 0x5265c00

    cmp-long v7, v3, v5

    if-lez v7, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/dof100/morsenotifier/n;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0xa

    if-le v0, v1, :cond_3

    iget-object v0, p0, Lcom/dof100/morsenotifier/n;->a:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MyRecentAppNotifications.arrange - out ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/dof100/morsenotifier/n;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") entries"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-void
.end method

.method public static c(Landroid/content/Context;)I
    .locals 2

    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    const-string v0, "MyRecentAppNotifications_n"

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p0

    return p0
.end method

.method private d(Landroid/content/Context;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MyRecentAppNotifications.save ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/dof100/morsenotifier/n;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") entries"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/dof100/morsenotifier/n;->a()V

    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v0, "MyRecentAppNotifications_enable"

    iget-boolean v1, p0, Lcom/dof100/morsenotifier/n;->b:Z

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    const-string v0, "MyRecentAppNotifications_n"

    iget-object v1, p0, Lcom/dof100/morsenotifier/n;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/dof100/morsenotifier/n;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/dof100/morsenotifier/m;

    invoke-virtual {v2, p1, v0}, Lcom/dof100/morsenotifier/m;->a(Landroid/content/SharedPreferences$Editor;I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "MyRecentAppNotifications.save saved "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/dof100/morsenotifier/n;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " entries"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/dof100/morsenotifier/m;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    const-string v7, "MyRecentAppNotifications.addNotification"

    invoke-static {v7}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    iget-object v9, v0, Lcom/dof100/morsenotifier/n;->a:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    const/4 v10, 0x0

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_7

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/dof100/morsenotifier/m;

    iget-wide v12, v11, Lcom/dof100/morsenotifier/m;->a:J

    sub-long v14, v7, v12

    invoke-static {v14, v15}, Ljava/lang/Math;->abs(J)J

    move-result-wide v12

    const-wide/16 v14, 0x64

    cmp-long v16, v12, v14

    if-lez v16, :cond_0

    goto :goto_0

    :cond_0
    iget-object v12, v11, Lcom/dof100/morsenotifier/m;->b:Ljava/lang/String;

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1

    goto :goto_0

    :cond_1
    iget v12, v11, Lcom/dof100/morsenotifier/m;->g:I

    if-eq v2, v12, :cond_2

    goto :goto_0

    :cond_2
    if-eqz v3, :cond_3

    iget-object v12, v11, Lcom/dof100/morsenotifier/m;->f:Ljava/lang/String;

    invoke-virtual {v3, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_3

    goto :goto_0

    :cond_3
    if-eqz v5, :cond_4

    iget-object v12, v11, Lcom/dof100/morsenotifier/m;->c:Ljava/lang/String;

    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_4

    goto :goto_0

    :cond_4
    if-eqz v6, :cond_5

    iget-object v12, v11, Lcom/dof100/morsenotifier/m;->d:Ljava/lang/String;

    invoke-virtual {v6, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_5

    goto :goto_0

    :cond_5
    if-eqz v4, :cond_6

    iget-object v11, v11, Lcom/dof100/morsenotifier/m;->e:Ljava/lang/String;

    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_6

    goto :goto_0

    :cond_6
    const/4 v10, 0x1

    goto :goto_0

    :cond_7
    const/4 v9, 0x0

    if-nez v10, :cond_d

    new-instance v9, Lcom/dof100/morsenotifier/m;

    invoke-direct {v9}, Lcom/dof100/morsenotifier/m;-><init>()V

    iput-wide v7, v9, Lcom/dof100/morsenotifier/m;->a:J

    if-eqz v1, :cond_8

    :goto_1
    iput-object v1, v9, Lcom/dof100/morsenotifier/m;->b:Ljava/lang/String;

    goto :goto_2

    :cond_8
    const-string v1, ""

    goto :goto_1

    :goto_2
    if-eqz v5, :cond_9

    iput-object v5, v9, Lcom/dof100/morsenotifier/m;->c:Ljava/lang/String;

    goto :goto_3

    :cond_9
    const-string v1, ""

    iput-object v1, v9, Lcom/dof100/morsenotifier/m;->c:Ljava/lang/String;

    :goto_3
    if-eqz v6, :cond_a

    iput-object v6, v9, Lcom/dof100/morsenotifier/m;->d:Ljava/lang/String;

    goto :goto_4

    :cond_a
    const-string v1, ""

    iput-object v1, v9, Lcom/dof100/morsenotifier/m;->d:Ljava/lang/String;

    :goto_4
    if-eqz v4, :cond_b

    iput-object v4, v9, Lcom/dof100/morsenotifier/m;->e:Ljava/lang/String;

    goto :goto_5

    :cond_b
    const-string v1, ""

    iput-object v1, v9, Lcom/dof100/morsenotifier/m;->e:Ljava/lang/String;

    :goto_5
    if-eqz v3, :cond_c

    iput-object v3, v9, Lcom/dof100/morsenotifier/m;->f:Ljava/lang/String;

    goto :goto_6

    :cond_c
    const-string v1, ""

    iput-object v1, v9, Lcom/dof100/morsenotifier/m;->f:Ljava/lang/String;

    :goto_6
    iput v2, v9, Lcom/dof100/morsenotifier/m;->g:I

    const/4 v1, -0x2

    iput v1, v9, Lcom/dof100/morsenotifier/m;->h:I

    const/4 v1, -0x1

    iput v1, v9, Lcom/dof100/morsenotifier/m;->i:I

    const-string v1, ""

    iput-object v1, v9, Lcom/dof100/morsenotifier/m;->j:Ljava/lang/String;

    iget-object v1, v0, Lcom/dof100/morsenotifier/n;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_d
    invoke-direct/range {p0 .. p1}, Lcom/dof100/morsenotifier/n;->d(Landroid/content/Context;)V

    return-object v9
.end method

.method public a(Landroid/content/Context;)V
    .locals 1

    const-string v0, "MyRecentAppNotifications.clear"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/n;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    invoke-direct {p0, p1}, Lcom/dof100/morsenotifier/n;->d(Landroid/content/Context;)V

    return-void
.end method

.method public a(Landroid/content/Context;Z)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MyRecentAppNotifications.setEnable "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iput-boolean p2, p0, Lcom/dof100/morsenotifier/n;->b:Z

    iget-boolean p2, p0, Lcom/dof100/morsenotifier/n;->b:Z

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/dof100/morsenotifier/n;->a:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->clear()V

    :cond_0
    invoke-direct {p0, p1}, Lcom/dof100/morsenotifier/n;->d(Landroid/content/Context;)V

    return-void
.end method

.method public b(Landroid/content/Context;)V
    .locals 4

    const-string v0, "MyRecentAppNotifications.load"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/n;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    const-string v0, "MyRecentAppNotifications_enable"

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/dof100/morsenotifier/n;->b:Z

    const-string v0, "MyRecentAppNotifications_n"

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    :goto_1
    if-ge v2, v0, :cond_1

    new-instance v1, Lcom/dof100/morsenotifier/m;

    invoke-direct {v1}, Lcom/dof100/morsenotifier/m;-><init>()V

    invoke-virtual {v1, p1, v2}, Lcom/dof100/morsenotifier/m;->a(Landroid/content/SharedPreferences;I)V

    iget-object v3, p0, Lcom/dof100/morsenotifier/n;->a:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Lcom/dof100/morsenotifier/n;->a()V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "MyRecentAppNotifications.load loaded "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/dof100/morsenotifier/n;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " entries"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-void
.end method
