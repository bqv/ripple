.class Lcom/dof100/morsenotifier/h;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/evernote/android/job/f;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/evernote/android/job/c;
    .locals 5

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0x29dbe797

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_1

    const v1, 0x5869a017

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "TAG_CHIME"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    const-string v0, "TAG_REMINDER"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, -0x1

    :goto_1
    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return-object v0

    :pswitch_0
    new-instance v0, Lcom/dof100/morsenotifier/g;

    invoke-direct {v0}, Lcom/dof100/morsenotifier/g;-><init>()V

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "MyChimeJobCreator.create Creating job with tag=%s"

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v3

    goto :goto_2

    :pswitch_1
    new-instance v0, Lcom/dof100/morsenotifier/g;

    invoke-direct {v0}, Lcom/dof100/morsenotifier/g;-><init>()V

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "MyChimeJobCreator.create Creating job with tag=%s"

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v3

    :goto_2
    invoke-static {v1, v4, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
