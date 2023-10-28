.class public Lcom/dof100/morsenotifier/ActivityAdvanced;
.super Landroid/app/Activity;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/widget/EditText;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/LinearLayout;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/LinearLayout;

.field private j:Landroid/widget/TextView;

.field private k:Landroid/widget/LinearLayout;

.field private l:Landroid/widget/TextView;

.field private final m:Landroid/os/Handler;

.field private final n:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->a:Landroid/widget/EditText;

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->b:Landroid/widget/TextView;

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->c:Landroid/widget/TextView;

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->d:Landroid/widget/TextView;

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->e:Landroid/widget/TextView;

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->f:Landroid/widget/TextView;

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->g:Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->h:Landroid/widget/TextView;

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->i:Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->j:Landroid/widget/TextView;

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->k:Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->l:Landroid/widget/TextView;

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->m:Landroid/os/Handler;

    new-instance v0, Lcom/dof100/morsenotifier/ActivityAdvanced$1;

    invoke-direct {v0, p0}, Lcom/dof100/morsenotifier/ActivityAdvanced$1;-><init>(Lcom/dof100/morsenotifier/ActivityAdvanced;)V

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->n:Ljava/lang/Runnable;

    return-void
.end method

.method private a()V
    .locals 6

    const-string v0, "android.permission.READ_PHONE_STATE"

    invoke-static {p0, v0}, Landroid/support/v4/app/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    const/high16 v1, -0x10000

    const v2, -0xff0100

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->b:Landroid/widget/TextView;

    const v3, 0x7f0c0196

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->b:Landroid/widget/TextView;

    const v3, 0x7f0c0195

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :goto_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1c

    const/16 v4, 0x8

    const/4 v5, 0x0

    if-ge v0, v3, :cond_1

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    const-string v0, "android.permission.READ_CALL_LOG"

    invoke-static {p0, v0}, Landroid/support/v4/app/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->c:Landroid/widget/TextView;

    const v3, 0x7f0c0192

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->c:Landroid/widget/TextView;

    const v3, 0x7f0c0191

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :goto_1
    const-string v0, "android.permission.READ_SMS"

    invoke-static {p0, v0}, Landroid/support/v4/app/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->d:Landroid/widget/TextView;

    const v3, 0x7f0c0198

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->d:Landroid/widget/TextView;

    const v3, 0x7f0c0197

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :goto_2
    const-string v0, "android.permission.READ_CONTACTS"

    invoke-static {p0, v0}, Landroid/support/v4/app/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->e:Landroid/widget/TextView;

    const v3, 0x7f0c0194

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_3

    :cond_4
    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->e:Landroid/widget/TextView;

    const v3, 0x7f0c0193

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :goto_3
    sget-boolean v0, Lcom/dof100/morsenotifier/App;->b:Z

    if-eqz v0, :cond_7

    invoke-static {p0}, Lcom/dof100/morsenotifier/ActivityAdvanced;->a(Landroid/app/Activity;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->f:Landroid/widget/TextView;

    const v1, 0x7f0c018d

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_5

    :cond_5
    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {p0}, Lcom/dof100/morsenotifier/ActivityAdvanced;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->f:Landroid/widget/TextView;

    const v1, 0x7f0c018c

    :goto_4
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_5

    :cond_6
    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->f:Landroid/widget/TextView;

    const v1, 0x7f0c018b

    goto :goto_4

    :cond_7
    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->f:Landroid/widget/TextView;

    const v1, 0x7f0c018a

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setEnabled(Z)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->f:Landroid/widget/TextView;

    const v1, -0x777778

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :goto_5
    sget-boolean v0, Lcom/dof100/morsenotifier/App;->h:Z

    if-nez v0, :cond_9

    sget-boolean v0, Lcom/dof100/morsenotifier/App;->i:Z

    if-nez v0, :cond_9

    sget-boolean v0, Lcom/dof100/morsenotifier/App;->j:Z

    if-eqz v0, :cond_8

    goto :goto_6

    :cond_8
    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->g:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_7

    :cond_9
    :goto_6
    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->g:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->h:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityAdvanced;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c0187

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "$BRAND$"

    sget-object v3, Lcom/dof100/morsenotifier/App;->g:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "$APPNAME$"

    sget-object v3, Lcom/dof100/morsenotifier/App;->e:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_7
    sget-boolean v0, Lcom/dof100/morsenotifier/App;->h:Z

    if-nez v0, :cond_b

    sget-boolean v0, Lcom/dof100/morsenotifier/App;->i:Z

    if-eqz v0, :cond_a

    goto :goto_8

    :cond_a
    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->i:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_9

    :cond_b
    :goto_8
    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->i:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->j:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityAdvanced;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c019d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "$BRAND$"

    sget-object v3, Lcom/dof100/morsenotifier/App;->g:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "$APPNAME$"

    sget-object v3, Lcom/dof100/morsenotifier/App;->e:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_9
    sget-boolean v0, Lcom/dof100/morsenotifier/App;->k:Z

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->k:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->l:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityAdvanced;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c01a1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "$BRAND$"

    sget-object v3, Lcom/dof100/morsenotifier/App;->g:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "$APPNAME$"

    sget-object v3, Lcom/dof100/morsenotifier/App;->e:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_c
    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->k:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 5

    sget-boolean v0, Lcom/dof100/morsenotifier/App;->h:Z

    if-nez v0, :cond_0

    sget-boolean v0, Lcom/dof100/morsenotifier/App;->i:Z

    if-nez v0, :cond_0

    sget-boolean v0, Lcom/dof100/morsenotifier/App;->j:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->h:Z

    const/high16 v2, 0x10000

    if-eqz v1, :cond_1

    new-instance v1, Landroid/content/ComponentName;

    const-string v3, "com.miui.securitycenter"

    const-string v4, "com.miui.permcenter.autostart.AutoStartManagementActivity"

    invoke-direct {v1, v3, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    goto :goto_1

    :cond_1
    sget-boolean v1, Lcom/dof100/morsenotifier/App;->i:Z

    if-eqz v1, :cond_2

    new-instance v1, Landroid/content/ComponentName;

    const-string v3, "com.coloros.safecenter"

    const-string v4, "com.coloros.safecenter.permission.startup.StartupAppListActivity"

    invoke-direct {v1, v3, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    sget-boolean v1, Lcom/dof100/morsenotifier/App;->j:Z

    if-eqz v1, :cond_3

    new-instance v1, Landroid/content/ComponentName;

    const-string v3, "com.vivo.permissionmanager"

    const-string v4, "com.vivo.permissionmanager.activity.BgStartUpManagerActivity"

    invoke-direct {v1, v3, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_3

    new-instance v1, Landroid/content/ComponentName;

    const-string v3, "com.iqoo.secure"

    const-string v4, "com.iqoo.secure.MainGuideActivity."

    invoke-direct {v1, v3, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    :goto_1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_4

    :goto_2
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_4
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.settings.SETTINGS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    return-void
.end method

.method static synthetic a(Lcom/dof100/morsenotifier/ActivityAdvanced;)V
    .locals 0

    invoke-direct {p0}, Lcom/dof100/morsenotifier/ActivityAdvanced;->a()V

    return-void
.end method

.method public static a(Landroid/app/Activity;)Z
    .locals 6

    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f030001

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string p0, "ActivityMain.isCollectorRunning. Notifications are disabled"

    invoke-static {p0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return v1

    :cond_0
    new-instance v0, Landroid/content/ComponentName;

    const-class v2, Lcom/dof100/morsenotifier/ServiceNotifications;

    invoke-direct {v0, p0, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v2

    const-string v3, "activity"

    invoke-virtual {p0, v3}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/ActivityManager;

    const v3, 0x7fffffff

    :try_start_0
    invoke-virtual {p0, v3}, Landroid/app/ActivityManager;->getRunningServices(I)Ljava/util/List;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    const/4 v3, 0x1

    if-nez p0, :cond_1

    const-string p0, "ActivityMain.isCollectorRunning. getRunningServices returned NULL"

    invoke-static {p0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return v3

    :cond_1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/app/ActivityManager$RunningServiceInfo;

    iget-object v5, v4, Landroid/app/ActivityManager$RunningServiceInfo;->service:Landroid/content/ComponentName;

    invoke-virtual {v5, v0}, Landroid/content/ComponentName;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    iget v4, v4, Landroid/app/ActivityManager$RunningServiceInfo;->pid:I

    if-ne v4, v2, :cond_2

    const/4 v1, 0x1

    goto :goto_1

    :cond_3
    return v1
.end method

.method static synthetic b(Lcom/dof100/morsenotifier/ActivityAdvanced;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->m:Landroid/os/Handler;

    return-object p0
.end method

.method private b()V
    .locals 6

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->a:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ActivityMain.onActionOK command="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const-string v1, "recent notifications on"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    new-instance v1, Lcom/dof100/morsenotifier/n;

    invoke-direct {v1, p0}, Lcom/dof100/morsenotifier/n;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, p0, v3}, Lcom/dof100/morsenotifier/n;->a(Landroid/content/Context;Z)V

    invoke-static {p0}, Lcom/dof100/morsenotifier/App;->d(Landroid/content/Context;)V

    const-string v1, "Recent notifications enabled."

    :goto_0
    invoke-static {p0, v1}, Lcom/dof100/morsenotifier/i;->b(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_4

    :cond_0
    const-string v1, "recent notifications off"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Lcom/dof100/morsenotifier/n;

    invoke-direct {v1, p0}, Lcom/dof100/morsenotifier/n;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, p0, v2}, Lcom/dof100/morsenotifier/n;->a(Landroid/content/Context;Z)V

    invoke-static {p0}, Lcom/dof100/morsenotifier/App;->d(Landroid/content/Context;)V

    const-string v1, "Recent notifications disabled."

    goto :goto_0

    :cond_1
    const-string v1, "recent notifications clear"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Lcom/dof100/morsenotifier/n;

    invoke-direct {v1, p0}, Lcom/dof100/morsenotifier/n;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, p0}, Lcom/dof100/morsenotifier/n;->a(Landroid/content/Context;)V

    invoke-static {p0}, Lcom/dof100/morsenotifier/App;->d(Landroid/content/Context;)V

    const-string v1, "Recent notifications cleared."

    goto :goto_0

    :cond_2
    const-string v1, "log"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_b

    const-string v1, "ActivityMain.onActionOK command contains log"

    invoke-static {v1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const-string v1, "cl"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_a

    const-string v1, "del"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v1, "cl"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_a

    const-string v1, "del"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_3

    :cond_4
    const-string v1, "sh"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_9

    const-string v1, "display"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_9

    const-string v1, "view"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_2

    :cond_5
    const-string v1, "on"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_8

    const-string v1, "en"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_1

    :cond_6
    const-string v1, "off"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_7

    const-string v1, "dis"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_c

    :cond_7
    const-string v1, "Log file disabled"

    invoke-static {v1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {p0, v1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/Boolean;)V

    const-string v1, "Log file disabled"

    goto/16 :goto_0

    :cond_8
    :goto_1
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {p0, v1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/Boolean;)V

    const-string v1, "Log file enabled"

    invoke-static {v1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-static {p0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;)V

    const-string v1, "Log file enabled"

    goto/16 :goto_0

    :cond_9
    :goto_2
    invoke-static {p0}, Lcom/dof100/morsenotifier/i;->a(Landroid/app/Activity;)V

    goto :goto_4

    :cond_a
    :goto_3
    invoke-static {p0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;)V

    const-string v1, "Log file cleared."

    goto/16 :goto_0

    :cond_b
    const-string v1, "play "

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/dof100/morsenotifier/ServiceMain;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityAdvanced;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f0c0024

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityAdvanced;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0c0001

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityAdvanced;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f0c000c

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x5

    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, v1}, Lcom/dof100/morsenotifier/ActivityAdvanced;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_4

    :cond_c
    const/4 v3, 0x0

    :goto_4
    if-nez v3, :cond_d

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown service command: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->b(Landroid/content/Context;Ljava/lang/String;)V

    :cond_d
    return-void
.end method

.method public static b(Landroid/content/Context;)V
    .locals 4

    sget-boolean v0, Lcom/dof100/morsenotifier/App;->h:Z

    if-nez v0, :cond_0

    sget-boolean v0, Lcom/dof100/morsenotifier/App;->i:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    new-instance v1, Landroid/content/ComponentName;

    const-string v2, "com.miui.securitycenter"

    const-string v3, "com.miui.permcenter.autostart.AutoStartManagementActivity"

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->h:Z

    if-eqz v1, :cond_1

    const-string v1, "com.miui.powerkeeper"

    const-string v2, "com.miui.powerkeeper.ui.HiddenAppsContainerManagementActivity"

    :goto_0
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_1

    :cond_1
    sget-boolean v1, Lcom/dof100/morsenotifier/App;->i:Z

    if-eqz v1, :cond_2

    const-string v1, "com.coloros.oppoguardelf"

    const-string v2, "com.coloros.powermanager.fuelgaue.PowerConsumptionActivity"

    goto :goto_0

    :cond_2
    :goto_1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/high16 v2, 0x10000

    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_3

    :goto_2
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_3
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.settings.SETTINGS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    return-void
.end method

.method public static c(Landroid/content/Context;)V
    .locals 4

    sget-boolean v0, Lcom/dof100/morsenotifier/App;->k:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    new-instance v1, Landroid/content/ComponentName;

    const-string v2, "com.huawei.systemmanager"

    const-string v3, "com.huawei.systemmanager.optimize.process.ProtectActivity"

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/high16 v2, 0x10000

    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    :goto_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_1
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.settings.SETTINGS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    return-void
.end method

.method private static d(Landroid/content/Context;)Z
    .locals 1

    invoke-static {p0}, Landroid/support/v4/app/f;->a(Landroid/content/Context;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static e(Landroid/content/Context;)V
    .locals 4

    :try_start_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "android.settings.APPLICATION_DETAILS_SETTINGS"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "package"

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method private static f(Landroid/content/Context;)V
    .locals 2

    sget-boolean v0, Lcom/dof100/morsenotifier/App;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "App notifications are only available in the pro version"

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->b(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-ge v0, v1, :cond_1

    const-string v0, "ActivityMain.onActionNotificationListenerSettings ERROR Android version<4.3"

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x16

    if-lt v0, v1, :cond_2

    const-string v0, "android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"

    const-string v1, "ActivityMain.onActionNotificationListenerSettings Android version>=5.1"

    :goto_0
    invoke-static {v1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    const-string v0, "android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"

    const-string v1, "ActivityMain.onActionNotificationListenerSettings 4.3<Android version<5.1"

    goto :goto_0

    :goto_1
    :try_start_0
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    return-void

    :pswitch_1
    invoke-static {p0}, Lcom/dof100/morsenotifier/ActivityAdvanced;->e(Landroid/content/Context;)V

    return-void

    :pswitch_2
    invoke-static {p0}, Lcom/dof100/morsenotifier/ActivityAdvanced;->f(Landroid/content/Context;)V

    return-void

    :pswitch_3
    invoke-direct {p0}, Lcom/dof100/morsenotifier/ActivityAdvanced;->b()V

    return-void

    :pswitch_4
    invoke-static {p0}, Lcom/dof100/morsenotifier/ActivityAdvanced;->c(Landroid/content/Context;)V

    return-void

    :pswitch_5
    invoke-static {p0}, Lcom/dof100/morsenotifier/ActivityAdvanced;->b(Landroid/content/Context;)V

    return-void

    :pswitch_6
    invoke-static {p0}, Lcom/dof100/morsenotifier/ActivityAdvanced;->a(Landroid/content/Context;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x7f070017
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 8

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    const-string p1, "ActivityService.oncreate"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const/high16 p1, 0x7f090000

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityAdvanced;->setContentView(I)V

    const p1, 0x7f07002c

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityAdvanced;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->a:Landroid/widget/EditText;

    const p1, 0x7f070082

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityAdvanced;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->b:Landroid/widget/TextView;

    const p1, 0x7f070080

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityAdvanced;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->c:Landroid/widget/TextView;

    const p1, 0x7f070083

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityAdvanced;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->d:Landroid/widget/TextView;

    const p1, 0x7f070081

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityAdvanced;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->e:Landroid/widget/TextView;

    const p1, 0x7f070041

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityAdvanced;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->g:Landroid/widget/LinearLayout;

    const p1, 0x7f070067

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityAdvanced;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->h:Landroid/widget/TextView;

    const p1, 0x7f070042

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityAdvanced;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->i:Landroid/widget/LinearLayout;

    const p1, 0x7f070069

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityAdvanced;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->j:Landroid/widget/TextView;

    const p1, 0x7f070043

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityAdvanced;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->k:Landroid/widget/LinearLayout;

    const p1, 0x7f07006b

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityAdvanced;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->l:Landroid/widget/TextView;

    const p1, 0x7f07007f

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityAdvanced;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const v0, 0x7f07007e

    invoke-virtual {p0, v0}, Lcom/dof100/morsenotifier/ActivityAdvanced;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f07001e

    invoke-virtual {p0, v1}, Lcom/dof100/morsenotifier/ActivityAdvanced;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    const v2, 0x7f07007d

    invoke-virtual {p0, v2}, Lcom/dof100/morsenotifier/ActivityAdvanced;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->f:Landroid/widget/TextView;

    const v2, 0x7f07007b

    invoke-virtual {p0, v2}, Lcom/dof100/morsenotifier/ActivityAdvanced;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f07007c

    invoke-virtual {p0, v3}, Lcom/dof100/morsenotifier/ActivityAdvanced;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const v4, 0x7f07007a

    invoke-virtual {p0, v4}, Lcom/dof100/morsenotifier/ActivityAdvanced;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const v5, 0x7f07001b

    invoke-virtual {p0, v5}, Lcom/dof100/morsenotifier/ActivityAdvanced;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/Button;

    invoke-virtual {v5, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v5, 0x7f07001f

    invoke-virtual {p0, v5}, Lcom/dof100/morsenotifier/ActivityAdvanced;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/Button;

    invoke-virtual {v5, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v5, 0x7f070017

    invoke-virtual {p0, v5}, Lcom/dof100/morsenotifier/ActivityAdvanced;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/Button;

    invoke-virtual {v5, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v5, 0x7f070018

    invoke-virtual {p0, v5}, Lcom/dof100/morsenotifier/ActivityAdvanced;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/Button;

    invoke-virtual {v5, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v5, 0x7f070019

    invoke-virtual {p0, v5}, Lcom/dof100/morsenotifier/ActivityAdvanced;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/Button;

    invoke-virtual {v5, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x12

    const/4 v7, 0x0

    if-lt v5, v6, :cond_0

    sget-boolean v5, Lcom/dof100/morsenotifier/App;->b:Z

    if-eqz v5, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setEnabled(Z)V

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setEnabled(Z)V

    invoke-virtual {v1, v5}, Landroid/widget/Button;->setEnabled(Z)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->f:Landroid/widget/TextView;

    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setEnabled(Z)V

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setEnabled(Z)V

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setEnabled(Z)V

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setEnabled(Z)V

    sget-boolean p1, Lcom/dof100/morsenotifier/App;->a:Z

    const/16 v0, 0x8

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    const/16 p1, 0x8

    :goto_1
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setVisibility(I)V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge p1, v6, :cond_2

    const/4 p1, 0x0

    goto :goto_2

    :cond_2
    const/16 p1, 0x8

    :goto_2
    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setVisibility(I)V

    if-eqz v5, :cond_3

    const/4 v0, 0x0

    :cond_3
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/dof100/morsenotifier/ActivityAdvanced;->a()V

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->m:Landroid/os/Handler;

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->n:Ljava/lang/Runnable;

    const-wide/16 v1, 0xbb8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method protected onDestroy()V
    .locals 2

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->m:Landroid/os/Handler;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityAdvanced;->n:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    return-void
.end method
