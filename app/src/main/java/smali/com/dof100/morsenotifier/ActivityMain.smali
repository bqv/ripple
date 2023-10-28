.class public Lcom/dof100/morsenotifier/ActivityMain;
.super Landroid/app/Activity;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private final a:Landroid/os/Handler;

.field private final b:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityMain;->a:Landroid/os/Handler;

    new-instance v0, Lcom/dof100/morsenotifier/ActivityMain$1;

    invoke-direct {v0, p0}, Lcom/dof100/morsenotifier/ActivityMain$1;-><init>(Lcom/dof100/morsenotifier/ActivityMain;)V

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityMain;->b:Ljava/lang/Runnable;

    return-void
.end method

.method private a()V
    .locals 2

    const-string v0, "ActivityMain.onActionSettings"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/dof100/morsenotifier/MyPreferencesActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "ActivityMain.onActionSettings before startActivityForResult"

    invoke-static {v1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/dof100/morsenotifier/ActivityMain;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method static synthetic a(Lcom/dof100/morsenotifier/ActivityMain;)V
    .locals 0

    invoke-direct {p0}, Lcom/dof100/morsenotifier/ActivityMain;->g()V

    return-void
.end method

.method private a(Ljava/lang/String;)Z
    .locals 3

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityMain;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    invoke-virtual {v0, p1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    iget-boolean p1, p1, Landroid/content/pm/ApplicationInfo;->enabled:Z
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    return v2
.end method

.method private b()V
    .locals 3

    const-string v0, "onActionAbout"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/dof100/morsenotifier/ActivityHTML;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "TITLE"

    const-string v2, "About"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "FILENAME"

    const-string v2, "about.html"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "VERTICALALIGN"

    const-string v2, "top"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "BUTTONOKCAPTION"

    const-string v2, "OK"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/dof100/morsenotifier/ActivityMain;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method static synthetic b(Lcom/dof100/morsenotifier/ActivityMain;)V
    .locals 0

    invoke-direct {p0}, Lcom/dof100/morsenotifier/ActivityMain;->h()V

    return-void
.end method

.method private c()V
    .locals 3

    const-string v0, "onActionRate"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "market://details?id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityMain;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :try_start_0
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, v1}, Lcom/dof100/morsenotifier/ActivityMain;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    return-void
.end method

.method static synthetic c(Lcom/dof100/morsenotifier/ActivityMain;)V
    .locals 0

    invoke-direct {p0}, Lcom/dof100/morsenotifier/ActivityMain;->i()V

    return-void
.end method

.method private d()V
    .locals 4

    const-string v0, "onActionTest"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/dof100/morsenotifier/ServiceMain;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityMain;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c0024

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityMain;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0c0012

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityMain;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c000b

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "0"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityMain;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c000c

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "0"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/dof100/morsenotifier/ActivityMain;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void
.end method

.method private e()V
    .locals 3

    const-string v0, "onActionTips"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    sget-boolean v0, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v0, :cond_0

    const-string v0, "http://www.100dof.com/software/morsenotifier/manual_morse_notifier.pdf"

    goto :goto_0

    :cond_0
    const-string v0, "http://www.100dof.com/software/voicenotifier/manual_voice_notifier.pdf"

    :goto_0
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "application/pdf"

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    :try_start_0
    invoke-virtual {p0, v1}, Lcom/dof100/morsenotifier/ActivityMain;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    new-instance v0, Landroid/app/AlertDialog$Builder;

    const v1, 0x1030226

    invoke-direct {v0, p0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    goto :goto_1

    :cond_1
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    :goto_1
    const-string v1, "Open pdf failed"

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "You will need a pdf viewer to open the user guide. Would you like to find one in Google Play?"

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x1040013

    new-instance v2, Lcom/dof100/morsenotifier/ActivityMain$7;

    invoke-direct {v2, p0}, Lcom/dof100/morsenotifier/ActivityMain$7;-><init>(Lcom/dof100/morsenotifier/ActivityMain;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x1040009

    new-instance v2, Lcom/dof100/morsenotifier/ActivityMain$6;

    invoke-direct {v2, p0}, Lcom/dof100/morsenotifier/ActivityMain$6;-><init>(Lcom/dof100/morsenotifier/ActivityMain;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x1080027

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    return-void
.end method

.method private f()V
    .locals 2

    const-string v0, "onActionServiceCommand"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/dof100/morsenotifier/ActivityAdvanced;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/dof100/morsenotifier/ActivityMain;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private g()V
    .locals 3

    const-string v0, "ActivityMain.checkPermissions"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const-string v0, "android.permission.READ_PHONE_STATE"

    invoke-static {p0, v0}, Landroid/support/v4/app/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "android.permission.READ_SMS"

    invoke-static {p0, v0}, Landroid/support/v4/app/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "android.permission.READ_CONTACTS"

    invoke-static {p0, v0}, Landroid/support/v4/app/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "android.permission.READ_CALL_LOG"

    invoke-static {p0, v0}, Landroid/support/v4/app/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "ActivityMain.checkPermissions all permissions granted"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "PERMISSIONS"

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/App;->a(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "ActivityMain.checkPermissions question_AlreadyAsked"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const-string v0, "Permissions needed!"

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->b(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_1
    const-string v0, "PERMISSIONS"

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/App;->b(Landroid/app/Activity;Ljava/lang/String;)V

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "android.permission.READ_PHONE_STATE"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "android.permission.READ_SMS"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "android.permission.READ_CONTACTS"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "android.permission.READ_CALL_LOG"

    aput-object v2, v0, v1

    const/16 v1, 0x64

    invoke-static {p0, v0, v1}, Landroid/support/v4/app/a;->a(Landroid/app/Activity;[Ljava/lang/String;I)V

    return-void
.end method

.method private h()V
    .locals 4

    const-string v0, "ActivityMain.checkNotificationAccess"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityMain;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f030001

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "ActivityMain.checkNotificationAccess api18=false"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    sget-boolean v0, Lcom/dof100/morsenotifier/App;->a:Z

    if-eqz v0, :cond_1

    const-string v0, "ActivityMain.checkNotificationAccess Free version"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-static {p0}, Lcom/dof100/morsenotifier/ActivityAdvanced;->a(Landroid/app/Activity;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "ActivityMain.checkNotificationAccess collector is running"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-void

    :cond_2
    const-string v0, "NOTIFICATIONACCESS"

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/App;->a(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "ActivityMain.checkNotificationAccess question_AlreadyAsked"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const-string v0, "No notification access!"

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->b(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_3
    const-string v0, "NOTIFICATIONACCESS"

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/App;->b(Landroid/app/Activity;Ljava/lang/String;)V

    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0c0189

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityMain;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c01b4

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

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x1040013

    new-instance v2, Lcom/dof100/morsenotifier/ActivityMain$9;

    invoke-direct {v2, p0}, Lcom/dof100/morsenotifier/ActivityMain$9;-><init>(Lcom/dof100/morsenotifier/ActivityMain;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x1040009

    new-instance v2, Lcom/dof100/morsenotifier/ActivityMain$8;

    invoke-direct {v2, p0}, Lcom/dof100/morsenotifier/ActivityMain$8;-><init>(Lcom/dof100/morsenotifier/ActivityMain;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x1080027

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    return-void
.end method

.method private i()V
    .locals 7

    sget-boolean v0, Lcom/dof100/morsenotifier/App;->h:Z

    const v1, 0x1080027

    const v2, 0x1040009

    const v3, 0x104000a

    if-nez v0, :cond_0

    sget-boolean v0, Lcom/dof100/morsenotifier/App;->i:Z

    if-nez v0, :cond_0

    sget-boolean v0, Lcom/dof100/morsenotifier/App;->j:Z

    if-eqz v0, :cond_2

    :cond_0
    const-string v0, "AUTOSTART"

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/App;->a(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    const-string v0, "ActivityMain.checkAutostart question_AlreadyAsked"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-void

    :cond_1
    const-string v0, "AUTOSTART"

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/App;->b(Landroid/app/Activity;Ljava/lang/String;)V

    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v4, 0x7f0c0185

    invoke-virtual {v0, v4}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityMain;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0c01b3

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "$BRAND$"

    sget-object v6, Lcom/dof100/morsenotifier/App;->g:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "$APPNAME$"

    sget-object v6, Lcom/dof100/morsenotifier/App;->e:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v4, Lcom/dof100/morsenotifier/ActivityMain$11;

    invoke-direct {v4, p0, p0}, Lcom/dof100/morsenotifier/ActivityMain$11;-><init>(Lcom/dof100/morsenotifier/ActivityMain;Landroid/content/Context;)V

    invoke-virtual {v0, v3, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v4, Lcom/dof100/morsenotifier/ActivityMain$10;

    invoke-direct {v4, p0}, Lcom/dof100/morsenotifier/ActivityMain$10;-><init>(Lcom/dof100/morsenotifier/ActivityMain;)V

    invoke-virtual {v0, v2, v4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    :cond_2
    sget-boolean v0, Lcom/dof100/morsenotifier/App;->h:Z

    if-nez v0, :cond_3

    sget-boolean v0, Lcom/dof100/morsenotifier/App;->i:Z

    if-eqz v0, :cond_5

    :cond_3
    const-string v0, "POWERSAVE"

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/App;->a(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_0

    :cond_4
    const-string v0, "POWERSAVE"

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/App;->b(Landroid/app/Activity;Ljava/lang/String;)V

    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v4, 0x7f0c019b

    invoke-virtual {v0, v4}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityMain;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0c01b5

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "$BRAND$"

    sget-object v6, Lcom/dof100/morsenotifier/App;->g:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "$APPNAME$"

    sget-object v6, Lcom/dof100/morsenotifier/App;->e:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v4, Lcom/dof100/morsenotifier/ActivityMain$2;

    invoke-direct {v4, p0, p0}, Lcom/dof100/morsenotifier/ActivityMain$2;-><init>(Lcom/dof100/morsenotifier/ActivityMain;Landroid/content/Context;)V

    invoke-virtual {v0, v3, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v4, Lcom/dof100/morsenotifier/ActivityMain$12;

    invoke-direct {v4, p0}, Lcom/dof100/morsenotifier/ActivityMain$12;-><init>(Lcom/dof100/morsenotifier/ActivityMain;)V

    invoke-virtual {v0, v2, v4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    :cond_5
    sget-boolean v0, Lcom/dof100/morsenotifier/App;->k:Z

    if-eqz v0, :cond_7

    const-string v0, "PROTECTEDAPPS"

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/App;->a(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    goto/16 :goto_0

    :cond_6
    const-string v0, "PROTECTEDAPPS"

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/App;->b(Landroid/app/Activity;Ljava/lang/String;)V

    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v4, 0x7f0c019f

    invoke-virtual {v0, v4}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityMain;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0c01b6

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "$BRAND$"

    sget-object v6, Lcom/dof100/morsenotifier/App;->g:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "$APPNAME$"

    sget-object v6, Lcom/dof100/morsenotifier/App;->e:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v4, Lcom/dof100/morsenotifier/ActivityMain$4;

    invoke-direct {v4, p0, p0}, Lcom/dof100/morsenotifier/ActivityMain$4;-><init>(Lcom/dof100/morsenotifier/ActivityMain;Landroid/content/Context;)V

    invoke-virtual {v0, v3, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v3, Lcom/dof100/morsenotifier/ActivityMain$3;

    invoke-direct {v3, p0}, Lcom/dof100/morsenotifier/ActivityMain$3;-><init>(Lcom/dof100/morsenotifier/ActivityMain;)V

    invoke-virtual {v0, v2, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    :cond_7
    return-void
.end method


# virtual methods
.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    const-string p2, "ActivityMain.onActivityResult"

    invoke-static {p2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityMain;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/dof100/morsenotifier/App;->c(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    sparse-switch p1, :sswitch_data_0

    return-void

    :sswitch_0
    invoke-direct {p0}, Lcom/dof100/morsenotifier/ActivityMain;->d()V

    return-void

    :sswitch_1
    invoke-direct {p0}, Lcom/dof100/morsenotifier/ActivityMain;->a()V

    return-void

    :sswitch_2
    invoke-direct {p0}, Lcom/dof100/morsenotifier/ActivityMain;->f()V

    return-void

    :sswitch_3
    invoke-direct {p0}, Lcom/dof100/morsenotifier/ActivityMain;->c()V

    return-void

    :sswitch_4
    invoke-direct {p0}, Lcom/dof100/morsenotifier/ActivityMain;->e()V

    return-void

    :sswitch_5
    invoke-direct {p0}, Lcom/dof100/morsenotifier/ActivityMain;->b()V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x7f070016 -> :sswitch_5
        0x7f07001a -> :sswitch_4
        0x7f07001c -> :sswitch_3
        0x7f07001d -> :sswitch_2
        0x7f070020 -> :sswitch_1
        0x7f070021 -> :sswitch_0
    .end sparse-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f090005

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityMain;->setContentView(I)V

    const p1, 0x7f070020

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityMain;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    invoke-virtual {p1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f070016

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityMain;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    invoke-virtual {p1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f07001c

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityMain;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    invoke-virtual {p1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f070021

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityMain;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    invoke-virtual {p1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f07001a

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityMain;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    invoke-virtual {p1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f07001d

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityMain;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    invoke-virtual {p1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/dof100/morsenotifier/ServiceMain;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityMain;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0c0024

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityMain;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c000e

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityMain;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    const-string p1, "ActivityMain.oncreate"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const-string p1, "MorseNotifierPro"

    const-string v0, "pro"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "ActivityMain.oncreate ispro"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const/4 p1, 0x0

    sget-boolean v0, Lcom/dof100/morsenotifier/App;->c:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const-string v0, "com.dof100.morsenotifier.free"

    invoke-direct {p0, v0}, Lcom/dof100/morsenotifier/ActivityMain;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    :cond_0
    sget-boolean v0, Lcom/dof100/morsenotifier/App;->d:Z

    if-eqz v0, :cond_1

    const-string v0, "com.dof100.voicenotifier.free"

    invoke-direct {p0, v0}, Lcom/dof100/morsenotifier/ActivityMain;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    :cond_1
    if-eqz p1, :cond_3

    new-instance p1, Landroid/app/AlertDialog$Builder;

    invoke-direct {p1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v0, 0x7f0c01cb

    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    const v0, 0x7f0c01ca

    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    const v0, 0x104000a

    new-instance v1, Lcom/dof100/morsenotifier/ActivityMain$5;

    invoke-direct {v1, p0}, Lcom/dof100/morsenotifier/ActivityMain$5;-><init>(Lcom/dof100/morsenotifier/ActivityMain;)V

    invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    const v0, 0x1080027

    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    return-void

    :cond_2
    const-string p1, "ActivityMain.oncreate isfree"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityMain;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const/high16 v1, 0x7f0a0000

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f070004

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lcom/dof100/morsenotifier/ActivityMain;->a()V

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method protected onPause()V
    .locals 2

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityMain;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityMain;->b:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 0

    const-string p1, "ActivityMain.onRequestPermissionsResult"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-void
.end method

.method protected onResume()V
    .locals 4

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityMain;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityMain;->b:Ljava/lang/Runnable;

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
