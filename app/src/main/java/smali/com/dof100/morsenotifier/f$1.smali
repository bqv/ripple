.class Lcom/dof100/morsenotifier/f$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/dof100/morsenotifier/f;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/dof100/morsenotifier/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/dof100/morsenotifier/f;


# direct methods
.method constructor <init>(Lcom/dof100/morsenotifier/f;)V
    .locals 0

    iput-object p1, p0, Lcom/dof100/morsenotifier/f$1;->a:Lcom/dof100/morsenotifier/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/dof100/morsenotifier/e;Lcom/dof100/morsenotifier/e;)I
    .locals 0

    iget-object p1, p1, Lcom/dof100/morsenotifier/e;->b:Ljava/lang/String;

    iget-object p2, p2, Lcom/dof100/morsenotifier/e;->b:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/dof100/morsenotifier/e;

    check-cast p2, Lcom/dof100/morsenotifier/e;

    invoke-virtual {p0, p1, p2}, Lcom/dof100/morsenotifier/f$1;->a(Lcom/dof100/morsenotifier/e;Lcom/dof100/morsenotifier/e;)I

    move-result p1

    return p1
.end method
