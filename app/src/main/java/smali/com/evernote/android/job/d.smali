.class public final enum Lcom/evernote/android/job/d;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/evernote/android/job/d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/evernote/android/job/d;

.field public static final enum b:Lcom/evernote/android/job/d;

.field public static final enum c:Lcom/evernote/android/job/d;

.field public static final enum d:Lcom/evernote/android/job/d;

.field public static final enum e:Lcom/evernote/android/job/d;

.field public static final enum f:Lcom/evernote/android/job/d;

.field private static final synthetic k:[Lcom/evernote/android/job/d;


# instance fields
.field private volatile g:Lcom/evernote/android/job/k;

.field private final h:Z

.field private final i:Z

.field private final j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v6, Lcom/evernote/android/job/d;

    const-string v1, "V_26"

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/evernote/android/job/d;-><init>(Ljava/lang/String;IZZZ)V

    sput-object v6, Lcom/evernote/android/job/d;->a:Lcom/evernote/android/job/d;

    new-instance v0, Lcom/evernote/android/job/d;

    const-string v8, "V_24"

    const/4 v9, 0x1

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/evernote/android/job/d;-><init>(Ljava/lang/String;IZZZ)V

    sput-object v0, Lcom/evernote/android/job/d;->b:Lcom/evernote/android/job/d;

    new-instance v0, Lcom/evernote/android/job/d;

    const-string v2, "V_21"

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/evernote/android/job/d;-><init>(Ljava/lang/String;IZZZ)V

    sput-object v0, Lcom/evernote/android/job/d;->c:Lcom/evernote/android/job/d;

    new-instance v0, Lcom/evernote/android/job/d;

    const-string v8, "V_19"

    const/4 v9, 0x3

    const/4 v11, 0x1

    const/4 v12, 0x1

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/evernote/android/job/d;-><init>(Ljava/lang/String;IZZZ)V

    sput-object v0, Lcom/evernote/android/job/d;->d:Lcom/evernote/android/job/d;

    new-instance v0, Lcom/evernote/android/job/d;

    const-string v2, "V_14"

    const/4 v3, 0x4

    const/4 v4, 0x0

    const/4 v6, 0x1

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/evernote/android/job/d;-><init>(Ljava/lang/String;IZZZ)V

    sput-object v0, Lcom/evernote/android/job/d;->e:Lcom/evernote/android/job/d;

    new-instance v0, Lcom/evernote/android/job/d;

    const-string v8, "GCM"

    const/4 v9, 0x5

    const/4 v11, 0x0

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/evernote/android/job/d;-><init>(Ljava/lang/String;IZZZ)V

    sput-object v0, Lcom/evernote/android/job/d;->f:Lcom/evernote/android/job/d;

    const/4 v0, 0x6

    new-array v0, v0, [Lcom/evernote/android/job/d;

    sget-object v1, Lcom/evernote/android/job/d;->a:Lcom/evernote/android/job/d;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/evernote/android/job/d;->b:Lcom/evernote/android/job/d;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/evernote/android/job/d;->c:Lcom/evernote/android/job/d;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/evernote/android/job/d;->d:Lcom/evernote/android/job/d;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/evernote/android/job/d;->e:Lcom/evernote/android/job/d;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/evernote/android/job/d;->f:Lcom/evernote/android/job/d;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sput-object v0, Lcom/evernote/android/job/d;->k:[Lcom/evernote/android/job/d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZZ)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, Lcom/evernote/android/job/d;->h:Z

    iput-boolean p4, p0, Lcom/evernote/android/job/d;->i:Z

    iput-boolean p5, p0, Lcom/evernote/android/job/d;->j:Z

    return-void
.end method

.method private a(Landroid/content/Context;Ljava/lang/Class;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Service;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, p1, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    invoke-virtual {p1, v1, v0}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_0

    const/4 v0, 0x1

    :catch_0
    :cond_0
    return v0
.end method

.method private static a(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Service;",
            ">;",
            "Ljava/lang/String;",
            ")Z"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, p0, p1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    invoke-virtual {p0, v1, v0}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    return v0

    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/pm/ResolveInfo;

    iget-object v1, p1, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    if-eqz v1, :cond_1

    iget-object p1, p1, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object p1, p1, Landroid/content/pm/ServiceInfo;->permission:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_1

    const/4 p0, 0x1

    return p0

    :catch_0
    :cond_2
    return v0
.end method

.method private b(Landroid/content/Context;Ljava/lang/Class;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class<",
            "+",
            "Landroid/content/BroadcastReceiver;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, p1, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    invoke-virtual {p1, v1, v0}, Landroid/content/pm/PackageManager;->queryBroadcastReceivers(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_0

    const/4 v0, 0x1

    :catch_0
    :cond_0
    return v0
.end method

.method public static c(Landroid/content/Context;)Lcom/evernote/android/job/d;
    .locals 1

    sget-object v0, Lcom/evernote/android/job/d;->a:Lcom/evernote/android/job/d;

    invoke-virtual {v0, p0}, Lcom/evernote/android/job/d;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/evernote/android/job/d;->a:Lcom/evernote/android/job/d;

    invoke-static {v0}, Lcom/evernote/android/job/e;->a(Lcom/evernote/android/job/d;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lcom/evernote/android/job/d;->a:Lcom/evernote/android/job/d;

    return-object p0

    :cond_0
    sget-object v0, Lcom/evernote/android/job/d;->b:Lcom/evernote/android/job/d;

    invoke-virtual {v0, p0}, Lcom/evernote/android/job/d;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/evernote/android/job/d;->b:Lcom/evernote/android/job/d;

    invoke-static {v0}, Lcom/evernote/android/job/e;->a(Lcom/evernote/android/job/d;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lcom/evernote/android/job/d;->b:Lcom/evernote/android/job/d;

    return-object p0

    :cond_1
    sget-object v0, Lcom/evernote/android/job/d;->c:Lcom/evernote/android/job/d;

    invoke-virtual {v0, p0}, Lcom/evernote/android/job/d;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/evernote/android/job/d;->c:Lcom/evernote/android/job/d;

    invoke-static {v0}, Lcom/evernote/android/job/e;->a(Lcom/evernote/android/job/d;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Lcom/evernote/android/job/d;->c:Lcom/evernote/android/job/d;

    return-object p0

    :cond_2
    sget-object v0, Lcom/evernote/android/job/d;->f:Lcom/evernote/android/job/d;

    invoke-virtual {v0, p0}, Lcom/evernote/android/job/d;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lcom/evernote/android/job/d;->f:Lcom/evernote/android/job/d;

    invoke-static {v0}, Lcom/evernote/android/job/e;->a(Lcom/evernote/android/job/d;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, Lcom/evernote/android/job/d;->f:Lcom/evernote/android/job/d;

    return-object p0

    :cond_3
    sget-object v0, Lcom/evernote/android/job/d;->d:Lcom/evernote/android/job/d;

    invoke-virtual {v0, p0}, Lcom/evernote/android/job/d;->a(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_4

    sget-object p0, Lcom/evernote/android/job/d;->d:Lcom/evernote/android/job/d;

    invoke-static {p0}, Lcom/evernote/android/job/e;->a(Lcom/evernote/android/job/d;)Z

    move-result p0

    if-eqz p0, :cond_4

    sget-object p0, Lcom/evernote/android/job/d;->d:Lcom/evernote/android/job/d;

    return-object p0

    :cond_4
    sget-object p0, Lcom/evernote/android/job/d;->e:Lcom/evernote/android/job/d;

    invoke-static {p0}, Lcom/evernote/android/job/e;->a(Lcom/evernote/android/job/d;)Z

    move-result p0

    if-eqz p0, :cond_5

    sget-object p0, Lcom/evernote/android/job/d;->e:Lcom/evernote/android/job/d;

    return-object p0

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "All supported APIs are disabled"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private d(Landroid/content/Context;)Lcom/evernote/android/job/k;
    .locals 2

    sget-object v0, Lcom/evernote/android/job/d$1;->a:[I

    invoke-virtual {p0}, Lcom/evernote/android/job/d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "not implemented"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    new-instance v0, Lcom/evernote/android/job/gcm/a;

    invoke-direct {v0, p1}, Lcom/evernote/android/job/gcm/a;-><init>(Landroid/content/Context;)V

    return-object v0

    :pswitch_1
    new-instance v0, Lcom/evernote/android/job/v14/a;

    invoke-direct {v0, p1}, Lcom/evernote/android/job/v14/a;-><init>(Landroid/content/Context;)V

    return-object v0

    :pswitch_2
    new-instance v0, Lcom/evernote/android/job/b/a;

    invoke-direct {v0, p1}, Lcom/evernote/android/job/b/a;-><init>(Landroid/content/Context;)V

    return-object v0

    :pswitch_3
    new-instance v0, Lcom/evernote/android/job/v21/a;

    invoke-direct {v0, p1}, Lcom/evernote/android/job/v21/a;-><init>(Landroid/content/Context;)V

    return-object v0

    :pswitch_4
    new-instance v0, Lcom/evernote/android/job/c/a;

    invoke-direct {v0, p1}, Lcom/evernote/android/job/c/a;-><init>(Landroid/content/Context;)V

    return-object v0

    :pswitch_5
    new-instance v0, Lcom/evernote/android/job/d/a;

    invoke-direct {v0, p1}, Lcom/evernote/android/job/d/a;-><init>(Landroid/content/Context;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/evernote/android/job/d;
    .locals 1

    const-class v0, Lcom/evernote/android/job/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/evernote/android/job/d;

    return-object p0
.end method

.method public static values()[Lcom/evernote/android/job/d;
    .locals 1

    sget-object v0, Lcom/evernote/android/job/d;->k:[Lcom/evernote/android/job/d;

    invoke-virtual {v0}, [Lcom/evernote/android/job/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/evernote/android/job/d;

    return-object v0
.end method


# virtual methods
.method a()Z
    .locals 1

    iget-boolean v0, p0, Lcom/evernote/android/job/d;->h:Z

    return v0
.end method

.method public a(Landroid/content/Context;)Z
    .locals 4

    sget-object v0, Lcom/evernote/android/job/d$1;->a:[I

    invoke-virtual {p0}, Lcom/evernote/android/job/d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "not implemented"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-static {p1}, Lcom/evernote/android/job/b;->a(Landroid/content/Context;)Z

    move-result p1

    return p1

    :pswitch_1
    invoke-static {}, Lcom/evernote/android/job/e;->b()Z

    move-result v0

    if-nez v0, :cond_1

    const-class v0, Lcom/evernote/android/job/v14/PlatformAlarmService;

    invoke-direct {p0, p1, v0}, Lcom/evernote/android/job/d;->a(Landroid/content/Context;Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-class v0, Lcom/evernote/android/job/v14/PlatformAlarmServiceExact;

    invoke-direct {p0, p1, v0}, Lcom/evernote/android/job/d;->a(Landroid/content/Context;Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-class v0, Lcom/evernote/android/job/v14/PlatformAlarmReceiver;

    invoke-direct {p0, p1, v0}, Lcom/evernote/android/job/d;->b(Landroid/content/Context;Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    return v1

    :cond_0
    const/4 v1, 0x0

    :cond_1
    return v1

    :pswitch_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x13

    if-lt v0, v3, :cond_2

    const-class v0, Lcom/evernote/android/job/v14/PlatformAlarmService;

    invoke-direct {p0, p1, v0}, Lcom/evernote/android/job/d;->a(Landroid/content/Context;Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-class v0, Lcom/evernote/android/job/v14/PlatformAlarmReceiver;

    invoke-direct {p0, p1, v0}, Lcom/evernote/android/job/d;->b(Landroid/content/Context;Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v1

    :cond_2
    const/4 v1, 0x0

    return v1

    :pswitch_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x15

    if-lt v0, v3, :cond_3

    const-class v0, Lcom/evernote/android/job/v21/PlatformJobService;

    const-string v3, "android.permission.BIND_JOB_SERVICE"

    invoke-static {p1, v0, v3}, Lcom/evernote/android/job/d;->a(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v1

    :cond_3
    const/4 v1, 0x0

    return v1

    :pswitch_4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x18

    if-lt v0, v3, :cond_4

    const-class v0, Lcom/evernote/android/job/v21/PlatformJobService;

    const-string v3, "android.permission.BIND_JOB_SERVICE"

    invoke-static {p1, v0, v3}, Lcom/evernote/android/job/d;->a(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    return v1

    :cond_4
    const/4 v1, 0x0

    return v1

    :pswitch_5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1a

    if-lt v0, v3, :cond_5

    const-class v0, Lcom/evernote/android/job/v21/PlatformJobService;

    invoke-direct {p0, p1, v0}, Lcom/evernote/android/job/d;->a(Landroid/content/Context;Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_5

    return v1

    :cond_5
    const/4 v1, 0x0

    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method declared-synchronized b(Landroid/content/Context;)Lcom/evernote/android/job/k;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/evernote/android/job/d;->g:Lcom/evernote/android/job/k;

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lcom/evernote/android/job/d;->d(Landroid/content/Context;)Lcom/evernote/android/job/k;

    move-result-object p1

    iput-object p1, p0, Lcom/evernote/android/job/d;->g:Lcom/evernote/android/job/k;

    :cond_0
    iget-object p1, p0, Lcom/evernote/android/job/d;->g:Lcom/evernote/android/job/k;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method b()Z
    .locals 1

    iget-boolean v0, p0, Lcom/evernote/android/job/d;->i:Z

    return v0
.end method

.method public declared-synchronized c()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lcom/evernote/android/job/d;->g:Lcom/evernote/android/job/k;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
