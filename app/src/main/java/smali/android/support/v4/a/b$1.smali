.class Landroid/support/v4/a/b$1;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v4/a/b;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v4/a/b;


# direct methods
.method constructor <init>(Landroid/support/v4/a/b;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v4/a/b$1;->a:Landroid/support/v4/a/b;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    return-void

    :cond_0
    iget-object p1, p0, Landroid/support/v4/a/b$1;->a:Landroid/support/v4/a/b;

    invoke-static {p1}, Landroid/support/v4/a/b;->a(Landroid/support/v4/a/b;)V

    return-void
.end method
