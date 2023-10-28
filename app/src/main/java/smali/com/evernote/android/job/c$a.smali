.class public final Lcom/evernote/android/job/c$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/evernote/android/job/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/evernote/android/job/m;

.field private b:Lcom/evernote/android/job/a/a/b;

.field private c:Landroid/os/Bundle;


# direct methods
.method private constructor <init>(Lcom/evernote/android/job/m;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/evernote/android/job/c$a;->a:Lcom/evernote/android/job/m;

    iput-object p2, p0, Lcom/evernote/android/job/c$a;->c:Landroid/os/Bundle;

    return-void
.end method

.method synthetic constructor <init>(Lcom/evernote/android/job/m;Landroid/os/Bundle;Lcom/evernote/android/job/c$1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/evernote/android/job/c$a;-><init>(Lcom/evernote/android/job/m;Landroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lcom/evernote/android/job/c$a;->a:Lcom/evernote/android/job/m;

    invoke-virtual {v0}, Lcom/evernote/android/job/m;->c()I

    move-result v0

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/evernote/android/job/c$a;->a:Lcom/evernote/android/job/m;

    invoke-virtual {v0}, Lcom/evernote/android/job/m;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Lcom/evernote/android/job/c$a;->a:Lcom/evernote/android/job/m;

    invoke-virtual {v0}, Lcom/evernote/android/job/m;->i()Z

    move-result v0

    return v0
.end method

.method public d()Lcom/evernote/android/job/a/a/b;
    .locals 1

    iget-object v0, p0, Lcom/evernote/android/job/c$a;->b:Lcom/evernote/android/job/a/a/b;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/evernote/android/job/c$a;->a:Lcom/evernote/android/job/m;

    invoke-virtual {v0}, Lcom/evernote/android/job/m;->s()Lcom/evernote/android/job/a/a/b;

    move-result-object v0

    iput-object v0, p0, Lcom/evernote/android/job/c$a;->b:Lcom/evernote/android/job/a/a/b;

    iget-object v0, p0, Lcom/evernote/android/job/c$a;->b:Lcom/evernote/android/job/a/a/b;

    if-nez v0, :cond_0

    new-instance v0, Lcom/evernote/android/job/a/a/b;

    invoke-direct {v0}, Lcom/evernote/android/job/a/a/b;-><init>()V

    iput-object v0, p0, Lcom/evernote/android/job/c$a;->b:Lcom/evernote/android/job/a/a/b;

    :cond_0
    iget-object v0, p0, Lcom/evernote/android/job/c$a;->b:Lcom/evernote/android/job/a/a/b;

    return-object v0
.end method

.method e()Lcom/evernote/android/job/m;
    .locals 1

    iget-object v0, p0, Lcom/evernote/android/job/c$a;->a:Lcom/evernote/android/job/m;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/evernote/android/job/c$a;

    iget-object v0, p0, Lcom/evernote/android/job/c$a;->a:Lcom/evernote/android/job/m;

    iget-object p1, p1, Lcom/evernote/android/job/c$a;->a:Lcom/evernote/android/job/m;

    invoke-virtual {v0, p1}, Lcom/evernote/android/job/m;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/evernote/android/job/c$a;->a:Lcom/evernote/android/job/m;

    invoke-virtual {v0}, Lcom/evernote/android/job/m;->hashCode()I

    move-result v0

    return v0
.end method
