.class final Landroid/support/v4/app/c$a;
.super Landroid/os/AsyncTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v4/app/c;


# direct methods
.method constructor <init>(Landroid/support/v4/app/c;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v4/app/c$a;->a:Landroid/support/v4/app/c;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 2

    :goto_0
    iget-object p1, p0, Landroid/support/v4/app/c$a;->a:Landroid/support/v4/app/c;

    invoke-virtual {p1}, Landroid/support/v4/app/c;->d()Landroid/support/v4/app/c$e;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Landroid/support/v4/app/c$a;->a:Landroid/support/v4/app/c;

    invoke-interface {p1}, Landroid/support/v4/app/c$e;->a()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/app/c;->a(Landroid/content/Intent;)V

    invoke-interface {p1}, Landroid/support/v4/app/c$e;->b()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method protected a(Ljava/lang/Void;)V
    .locals 0

    iget-object p1, p0, Landroid/support/v4/app/c$a;->a:Landroid/support/v4/app/c;

    invoke-virtual {p1}, Landroid/support/v4/app/c;->c()V

    return-void
.end method

.method protected b(Ljava/lang/Void;)V
    .locals 0

    iget-object p1, p0, Landroid/support/v4/app/c$a;->a:Landroid/support/v4/app/c;

    invoke-virtual {p1}, Landroid/support/v4/app/c;->c()V

    return-void
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Landroid/support/v4/app/c$a;->a([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method protected synthetic onCancelled(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Landroid/support/v4/app/c$a;->a(Ljava/lang/Void;)V

    return-void
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Landroid/support/v4/app/c$a;->b(Ljava/lang/Void;)V

    return-void
.end method
