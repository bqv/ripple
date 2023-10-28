.class public Lcom/dof100/morsenotifier/MyPreferencesActivity;
.super Landroid/preference/PreferenceActivity;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/preference/PreferenceActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected isValidFragment(Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public onBuildHeaders(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/preference/PreferenceActivity$Header;",
            ">;)V"
        }
    .end annotation

    sget-boolean v0, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v0, :cond_0

    const v0, 0x7f0f000d

    :goto_0
    invoke-virtual {p0, v0, p1}, Lcom/dof100/morsenotifier/MyPreferencesActivity;->loadHeadersFromResource(ILjava/util/List;)V

    return-void

    :cond_0
    const v0, 0x7f0f000e

    goto :goto_0

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/preference/PreferenceActivity;->onCreate(Landroid/os/Bundle;)V

    const-string p1, "MyPreferencesActivity.onCreate "

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/MyPreferencesActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    :cond_0
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-eq v0, v1, :cond_0

    invoke-super {p0, p1}, Landroid/preference/PreferenceActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_0
    invoke-static {p0}, Landroid/support/v4/app/e;->a(Landroid/app/Activity;)V

    const/4 p1, 0x1

    return p1
.end method
