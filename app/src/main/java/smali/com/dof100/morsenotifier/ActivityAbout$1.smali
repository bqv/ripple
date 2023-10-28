.class Lcom/dof100/morsenotifier/ActivityAbout$1;
.super Landroid/webkit/WebViewClient;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/dof100/morsenotifier/ActivityAbout;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/dof100/morsenotifier/ActivityAbout;


# direct methods
.method constructor <init>(Lcom/dof100/morsenotifier/ActivityAbout;)V
    .locals 0

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityAbout$1;->a:Lcom/dof100/morsenotifier/ActivityAbout;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z
    .locals 1

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object p1

    new-instance p2, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {p2, v0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityAbout$1;->a:Lcom/dof100/morsenotifier/ActivityAbout;

    invoke-virtual {p1, p2}, Lcom/dof100/morsenotifier/ActivityAbout;->startActivity(Landroid/content/Intent;)V

    const/4 p1, 0x1

    return p1
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 1

    new-instance p1, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-direct {p1, v0, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    iget-object p2, p0, Lcom/dof100/morsenotifier/ActivityAbout$1;->a:Lcom/dof100/morsenotifier/ActivityAbout;

    invoke-virtual {p2, p1}, Lcom/dof100/morsenotifier/ActivityAbout;->startActivity(Landroid/content/Intent;)V

    const/4 p1, 0x1

    return p1
.end method
