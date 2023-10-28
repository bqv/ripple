.class public Landroid/support/v4/d/f;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Cloneable;"
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/Object;


# instance fields
.field private b:Z

.field private c:[I

.field private d:[Ljava/lang/Object;

.field private e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroid/support/v4/d/f;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/16 v0, 0xa

    invoke-direct {p0, v0}, Landroid/support/v4/d/f;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/d/f;->b:Z

    if-nez p1, :cond_0

    sget-object p1, Landroid/support/v4/d/b;->a:[I

    iput-object p1, p0, Landroid/support/v4/d/f;->c:[I

    sget-object p1, Landroid/support/v4/d/b;->c:[Ljava/lang/Object;

    :goto_0
    iput-object p1, p0, Landroid/support/v4/d/f;->d:[Ljava/lang/Object;

    goto :goto_1

    :cond_0
    invoke-static {p1}, Landroid/support/v4/d/b;->a(I)I

    move-result p1

    new-array v1, p1, [I

    iput-object v1, p0, Landroid/support/v4/d/f;->c:[I

    new-array p1, p1, [Ljava/lang/Object;

    goto :goto_0

    :goto_1
    iput v0, p0, Landroid/support/v4/d/f;->e:I

    return-void
.end method

.method private c()V
    .locals 8

    iget v0, p0, Landroid/support/v4/d/f;->e:I

    iget-object v1, p0, Landroid/support/v4/d/f;->c:[I

    iget-object v2, p0, Landroid/support/v4/d/f;->d:[Ljava/lang/Object;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v4, v0, :cond_2

    aget-object v6, v2, v4

    sget-object v7, Landroid/support/v4/d/f;->a:Ljava/lang/Object;

    if-eq v6, v7, :cond_1

    if-eq v4, v5, :cond_0

    aget v7, v1, v4

    aput v7, v1, v5

    aput-object v6, v2, v5

    const/4 v6, 0x0

    aput-object v6, v2, v4

    :cond_0
    add-int/lit8 v5, v5, 0x1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    iput-boolean v3, p0, Landroid/support/v4/d/f;->b:Z

    iput v5, p0, Landroid/support/v4/d/f;->e:I

    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 1

    iget-boolean v0, p0, Landroid/support/v4/d/f;->b:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Landroid/support/v4/d/f;->c()V

    :cond_0
    iget-object v0, p0, Landroid/support/v4/d/f;->c:[I

    aget p1, v0, p1

    return p1
.end method

.method public a()Landroid/support/v4/d/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/support/v4/d/f<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/d/f;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v0, p0, Landroid/support/v4/d/f;->c:[I

    invoke-virtual {v0}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    iput-object v0, v1, Landroid/support/v4/d/f;->c:[I

    iget-object v0, p0, Landroid/support/v4/d/f;->d:[Ljava/lang/Object;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    iput-object v0, v1, Landroid/support/v4/d/f;->d:[Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v1

    :catch_0
    move-object v1, v0

    :catch_1
    return-object v1
.end method

.method public b()I
    .locals 1

    iget-boolean v0, p0, Landroid/support/v4/d/f;->b:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Landroid/support/v4/d/f;->c()V

    :cond_0
    iget v0, p0, Landroid/support/v4/d/f;->e:I

    return v0
.end method

.method public b(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    iget-boolean v0, p0, Landroid/support/v4/d/f;->b:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Landroid/support/v4/d/f;->c()V

    :cond_0
    iget-object v0, p0, Landroid/support/v4/d/f;->d:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroid/support/v4/d/f;->a()Landroid/support/v4/d/f;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Landroid/support/v4/d/f;->b()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "{}"

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    iget v1, p0, Landroid/support/v4/d/f;->e:I

    mul-int/lit8 v1, v1, 0x1c

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Landroid/support/v4/d/f;->e:I

    if-ge v1, v2, :cond_3

    if-lez v1, :cond_1

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {p0, v1}, Landroid/support/v4/d/f;->a(I)I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v2, 0x3d

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Landroid/support/v4/d/f;->b(I)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p0, :cond_2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    const-string v2, "(this Map)"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
