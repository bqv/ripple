.class Lcom/dof100/morsenotifier/ActivityAppFilters$3;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/dof100/morsenotifier/ActivityAppFilters;->a(Lcom/dof100/morsenotifier/a;ILandroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/dof100/morsenotifier/ActivityAppFilters;


# direct methods
.method constructor <init>(Lcom/dof100/morsenotifier/ActivityAppFilters;)V
    .locals 0

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityAppFilters$3;->a:Lcom/dof100/morsenotifier/ActivityAppFilters;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method
