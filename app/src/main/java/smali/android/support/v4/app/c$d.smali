.class final Landroid/support/v4/app/c$d;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/support/v4/app/c$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "d"
.end annotation


# instance fields
.field final a:Landroid/content/Intent;

.field final b:I

.field final synthetic c:Landroid/support/v4/app/c;


# direct methods
.method constructor <init>(Landroid/support/v4/app/c;Landroid/content/Intent;I)V
    .locals 0

    iput-object p1, p0, Landroid/support/v4/app/c$d;->c:Landroid/support/v4/app/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroid/support/v4/app/c$d;->a:Landroid/content/Intent;

    iput p3, p0, Landroid/support/v4/app/c$d;->b:I

    return-void
.end method


# virtual methods
.method public a()Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/app/c$d;->a:Landroid/content/Intent;

    return-object v0
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Landroid/support/v4/app/c$d;->c:Landroid/support/v4/app/c;

    iget v1, p0, Landroid/support/v4/app/c$d;->b:I

    invoke-virtual {v0, v1}, Landroid/support/v4/app/c;->stopSelf(I)V

    return-void
.end method
