.class Landroid/support/v4/c/b$a;
.super Landroid/support/v4/c/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/c/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v4/c/b;


# direct methods
.method constructor <init>(Landroid/support/v4/c/b;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v4/c/b$a;->a:Landroid/support/v4/c/b;

    invoke-direct {p0}, Landroid/support/v4/c/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILandroid/os/Bundle;)V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/c/b$a;->a:Landroid/support/v4/c/b;

    iget-object v0, v0, Landroid/support/v4/c/b;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/c/b$a;->a:Landroid/support/v4/c/b;

    iget-object v0, v0, Landroid/support/v4/c/b;->b:Landroid/os/Handler;

    new-instance v1, Landroid/support/v4/c/b$b;

    iget-object v2, p0, Landroid/support/v4/c/b$a;->a:Landroid/support/v4/c/b;

    invoke-direct {v1, v2, p1, p2}, Landroid/support/v4/c/b$b;-><init>(Landroid/support/v4/c/b;ILandroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_0
    iget-object v0, p0, Landroid/support/v4/c/b$a;->a:Landroid/support/v4/c/b;

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/c/b;->a(ILandroid/os/Bundle;)V

    return-void
.end method
