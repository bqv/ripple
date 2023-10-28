.class public Lcom/dof100/morsenotifier/App;
.super Landroid/app/Application;


# static fields
.field public static a:Z = false

.field public static b:Z = true

.field public static c:Z = true

.field public static d:Z = false

.field public static e:Ljava/lang/String; = ""

.field public static f:Ljava/lang/String; = ""

.field public static g:Ljava/lang/String; = ""

.field public static h:Z = false

.field public static i:Z = false

.field public static j:Z = false

.field public static k:Z = false

.field public static l:Ljava/lang/String; = ""

.field public static m:Ljava/lang/String; = ""

.field private static n:Z = true

.field private static o:Z = false

.field private static p:Z = false

.field private static q:Lcom/dof100/morsenotifier/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/dof100/morsenotifier/l;
    .locals 2

    sget-object v0, Lcom/dof100/morsenotifier/App;->q:Lcom/dof100/morsenotifier/l;

    if-nez v0, :cond_0

    new-instance v0, Lcom/dof100/morsenotifier/l;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/dof100/morsenotifier/l;-><init>(Landroid/content/Context;I)V

    sput-object v0, Lcom/dof100/morsenotifier/App;->q:Lcom/dof100/morsenotifier/l;

    :cond_0
    sget-object p0, Lcom/dof100/morsenotifier/App;->q:Lcom/dof100/morsenotifier/l;

    return-object p0
.end method

.method public static a(Landroid/content/Context;I)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "LBR_ACTION_SETPOS"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "LBR_ACTION_DATA_POS"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-static {p0}, Landroid/support/v4/a/b;->a(Landroid/content/Context;)Landroid/support/v4/a/b;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/support/v4/a/b;->a(Landroid/content/Intent;)Z

    return-void
.end method

.method public static a(Landroid/app/Activity;Ljava/lang/String;)Z
    .locals 2

    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "question_asked_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p0, p1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method public static b(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 2

    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "question_asked_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    invoke-interface {p0, p1, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public static b(Landroid/content/Context;)V
    .locals 2

    const-string v0, "App.broadcastFinish sending LBR_ACTION_FINISH"

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "LBR_ACTION_FINISH"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {p0}, Landroid/support/v4/a/b;->a(Landroid/content/Context;)Landroid/support/v4/a/b;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/support/v4/a/b;->a(Landroid/content/Intent;)Z

    return-void
.end method

.method public static c(Landroid/content/Context;)V
    .locals 2

    const-string v0, "App.broadcastSettingsChanged sending LBR_ACTION_SETTINGSCHANGED"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "LBR_ACTION_SETTINGSCHANGED"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Landroid/support/v4/a/b;->a(Landroid/content/Context;)Landroid/support/v4/a/b;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/support/v4/a/b;->a(Landroid/content/Intent;)Z

    return-void
.end method

.method public static d(Landroid/content/Context;)V
    .locals 2

    const-string v0, "App.broadcastSettingsChanged sending LBR_ACTION_RECENTNOTIFICATIONSCHANGED"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "LBR_ACTION_RECENTNOTIFICATIONSCHANGED"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Landroid/support/v4/a/b;->a(Landroid/content/Context;)Landroid/support/v4/a/b;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/support/v4/a/b;->a(Landroid/content/Intent;)Z

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 4

    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    invoke-static {p0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;)V

    const-string v0, "App.onCreate"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const/4 v0, 0x0

    sput-boolean v0, Lcom/dof100/morsenotifier/App;->n:Z

    const/4 v1, 0x1

    sput-boolean v1, Lcom/dof100/morsenotifier/App;->o:Z

    const-string v2, "MorseNotifierPro"

    const-string v3, "Free"

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    sput-boolean v2, Lcom/dof100/morsenotifier/App;->a:Z

    const-string v2, "MorseNotifierPro"

    const-string v3, "Pro"

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    sput-boolean v2, Lcom/dof100/morsenotifier/App;->b:Z

    const-string v2, "MorseNotifierPro"

    const-string v3, "Morse"

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    sput-boolean v2, Lcom/dof100/morsenotifier/App;->c:Z

    const-string v2, "MorseNotifierPro"

    const-string v3, "Voice"

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    sput-boolean v2, Lcom/dof100/morsenotifier/App;->d:Z

    :try_start_0
    const-string v2, "uimode"

    invoke-virtual {p0, v2}, Lcom/dof100/morsenotifier/App;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/UiModeManager;

    invoke-virtual {v2}, Landroid/app/UiModeManager;->getCurrentModeType()I

    move-result v2

    const/4 v3, 0x4

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    sput-boolean v1, Lcom/dof100/morsenotifier/App;->p:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    sput-boolean v0, Lcom/dof100/morsenotifier/App;->p:Z

    :goto_1
    sget-boolean v1, Lcom/dof100/morsenotifier/App;->n:Z

    if-eqz v1, :cond_1

    const-string v1, "App.onCreate debug build"

    invoke-static {v1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    :cond_1
    sget-boolean v1, Lcom/dof100/morsenotifier/App;->o:Z

    if-eqz v1, :cond_2

    const-string v1, "App.onCreate release build"

    invoke-static {v1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    :cond_2
    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_3

    const-string v1, "App.onCreate flavor=MorseNotifier"

    invoke-static {v1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    :cond_3
    sget-boolean v1, Lcom/dof100/morsenotifier/App;->d:Z

    if-eqz v1, :cond_4

    const-string v1, "App.onCreate flavor=VoiceNotifier"

    invoke-static {v1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    :cond_4
    sget-boolean v1, Lcom/dof100/morsenotifier/App;->a:Z

    if-eqz v1, :cond_5

    const-string v1, "App.onCreate flavor=free"

    invoke-static {v1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    :cond_5
    sget-boolean v1, Lcom/dof100/morsenotifier/App;->b:Z

    if-eqz v1, :cond_6

    const-string v1, "App.onCreate flavor=pro"

    invoke-static {v1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    :cond_6
    sget-boolean v1, Lcom/dof100/morsenotifier/App;->p:Z

    if-eqz v1, :cond_7

    const-string v1, "App.onCreate Running on TV"

    invoke-static {v1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    :cond_7
    invoke-virtual {p0}, Lcom/dof100/morsenotifier/App;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget v1, v1, Landroid/content/pm/ApplicationInfo;->labelRes:I

    invoke-virtual {p0, v1}, Lcom/dof100/morsenotifier/App;->getString(I)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/dof100/morsenotifier/App;->e:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/App;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/App;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    :try_start_1
    invoke-virtual {v2, v1, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    sput-object v0, Lcom/dof100/morsenotifier/App;->f:Ljava/lang/String;
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    :goto_2
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sput-object v0, Lcom/dof100/morsenotifier/App;->g:Ljava/lang/String;

    const-string v0, "xiaomi"

    sget-object v1, Lcom/dof100/morsenotifier/App;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    sput-boolean v0, Lcom/dof100/morsenotifier/App;->h:Z

    const-string v0, "oppo"

    sget-object v1, Lcom/dof100/morsenotifier/App;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    sput-boolean v0, Lcom/dof100/morsenotifier/App;->i:Z

    const-string v0, "vivo"

    sget-object v1, Lcom/dof100/morsenotifier/App;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    sput-boolean v0, Lcom/dof100/morsenotifier/App;->j:Z

    const-string v0, "huawei"

    sget-object v1, Lcom/dof100/morsenotifier/App;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    sput-boolean v0, Lcom/dof100/morsenotifier/App;->k:Z

    sget-boolean v0, Lcom/dof100/morsenotifier/App;->n:Z

    if-eqz v0, :cond_8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "App.onCreate brand="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lcom/dof100/morsenotifier/App;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "market://details?id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/App;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/dof100/morsenotifier/App;->l:Ljava/lang/String;

    sget-object v0, Lcom/dof100/morsenotifier/App;->l:Ljava/lang/String;

    const-string v1, ".free"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/dof100/morsenotifier/App;->m:Ljava/lang/String;

    const/4 v0, 0x0

    sput-object v0, Lcom/dof100/morsenotifier/App;->q:Lcom/dof100/morsenotifier/l;

    const-string v0, "App.onCreate Initializing job manager..."

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-static {p0}, Lcom/evernote/android/job/i;->a(Landroid/content/Context;)Lcom/evernote/android/job/i;

    move-result-object v0

    new-instance v1, Lcom/dof100/morsenotifier/h;

    invoke-direct {v1}, Lcom/dof100/morsenotifier/h;-><init>()V

    invoke-virtual {v0, v1}, Lcom/evernote/android/job/i;->a(Lcom/evernote/android/job/f;)V

    return-void
.end method
