.class Lcom/dof100/morsenotifier/ActivityReminders$3;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/dof100/morsenotifier/ActivityReminders;->a(Lcom/dof100/morsenotifier/p;ILandroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/dof100/morsenotifier/ActivityReminders;


# direct methods
.method constructor <init>(Lcom/dof100/morsenotifier/ActivityReminders;)V
    .locals 0

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityReminders$3;->a:Lcom/dof100/morsenotifier/ActivityReminders;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method
