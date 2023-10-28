.class public final Lcom/evernote/android/job/k$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/evernote/android/job/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field private static final a:Ljava/lang/Object;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:I

.field private final d:Lcom/evernote/android/job/a/d;

.field private final e:Lcom/evernote/android/job/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/evernote/android/job/k$a;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/app/Service;Lcom/evernote/android/job/a/d;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/evernote/android/job/k$a;-><init>(Landroid/content/Context;Lcom/evernote/android/job/a/d;I)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/evernote/android/job/a/d;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/evernote/android/job/k$a;->b:Landroid/content/Context;

    iput p3, p0, Lcom/evernote/android/job/k$a;->c:I

    iput-object p2, p0, Lcom/evernote/android/job/k$a;->d:Lcom/evernote/android/job/a/d;

    :try_start_0
    invoke-static {p1}, Lcom/evernote/android/job/i;->a(Landroid/content/Context;)Lcom/evernote/android/job/i;

    move-result-object p1
    :try_end_0
    .catch Lcom/evernote/android/job/j; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lcom/evernote/android/job/k$a;->d:Lcom/evernote/android/job/a/d;

    invoke-virtual {p2, p1}, Lcom/evernote/android/job/a/d;->a(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lcom/evernote/android/job/k$a;->e:Lcom/evernote/android/job/i;

    return-void
.end method

.method private static a(JJ)J
    .locals 7

    add-long v0, p0, p2

    xor-long v2, p0, p2

    const-wide/16 p2, 0x0

    cmp-long v4, v2, p2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-gez v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    xor-long v5, p0, v0

    cmp-long p0, v5, p2

    if-ltz p0, :cond_1

    const/4 v2, 0x1

    :cond_1
    or-int p0, v4, v2

    invoke-static {v0, v1, p0}, Lcom/evernote/android/job/k$a;->a(JZ)J

    move-result-wide p0

    return-wide p0
.end method

.method private static a(JZ)J
    .locals 0

    if-eqz p2, :cond_0

    return-wide p0

    :cond_0
    const-wide p0, 0x7fffffffffffffffL

    return-wide p0
.end method

.method public static a(Lcom/evernote/android/job/m;)J
    .locals 2

    invoke-virtual {p0}, Lcom/evernote/android/job/m;->y()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lcom/evernote/android/job/m;->v()J

    move-result-wide v0

    return-wide v0

    :cond_0
    invoke-virtual {p0}, Lcom/evernote/android/job/m;->e()J

    move-result-wide v0

    return-wide v0
.end method

.method public static a(Lcom/evernote/android/job/m;Z)J
    .locals 2

    invoke-virtual {p0}, Lcom/evernote/android/job/m;->y()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lcom/evernote/android/job/m;->v()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/evernote/android/job/m;->f()J

    move-result-wide v0

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/evernote/android/job/m;->l()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/evernote/android/job/m;->r()Z

    move-result p0

    if-eqz p0, :cond_1

    const-wide/16 p0, 0x64

    invoke-static {v0, v1, p0, p1}, Lcom/evernote/android/job/k$a;->b(JJ)J

    move-result-wide v0

    :cond_1
    return-wide v0
.end method

.method public static a(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;
    .locals 0

    invoke-static {p0, p1}, Lcom/evernote/android/job/p;->a(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;

    move-result-object p0

    return-object p0
.end method

.method static a(Landroid/content/Context;I)V
    .locals 5

    invoke-static {}, Lcom/evernote/android/job/d;->values()[Lcom/evernote/android/job/d;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3, p0}, Lcom/evernote/android/job/d;->a(Landroid/content/Context;)Z

    move-result v4

    if-eqz v4, :cond_0

    :try_start_0
    invoke-virtual {v3, p0}, Lcom/evernote/android/job/d;->b(Landroid/content/Context;)Lcom/evernote/android/job/k;

    move-result-object v3

    invoke-interface {v3, p1}, Lcom/evernote/android/job/k;->a(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private a(Z)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/evernote/android/job/k$a;->b:Landroid/content/Context;

    iget v0, p0, Lcom/evernote/android/job/k$a;->c:I

    invoke-static {p1, v0}, Lcom/evernote/android/job/k$a;->a(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method

.method public static a(Landroid/content/Intent;)Z
    .locals 0

    invoke-static {p0}, Lcom/evernote/android/job/p;->a(Landroid/content/Intent;)Z

    move-result p0

    return p0
.end method

.method private static b(JJ)J
    .locals 10

    invoke-static {p0, p1}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v0

    const-wide/16 v1, -0x1

    xor-long v3, p0, v1

    invoke-static {v3, v4}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v3

    add-int/2addr v0, v3

    invoke-static {p2, p3}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v3

    add-int/2addr v0, v3

    xor-long v3, p2, v1

    invoke-static {v3, v4}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v1

    add-int/2addr v0, v1

    const/16 v1, 0x41

    if-le v0, v1, :cond_0

    mul-long p0, p0, p2

    return-wide p0

    :cond_0
    mul-long v1, p0, p2

    const/16 v3, 0x40

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-lt v0, v3, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-static {v1, v2, v0}, Lcom/evernote/android/job/k$a;->a(JZ)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v6, p0, v2

    if-ltz v6, :cond_2

    const/4 v6, 0x1

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    :goto_1
    const-wide/high16 v7, -0x8000000000000000L

    cmp-long v9, p2, v7

    if-eqz v9, :cond_3

    const/4 v7, 0x1

    goto :goto_2

    :cond_3
    const/4 v7, 0x0

    :goto_2
    or-int/2addr v6, v7

    invoke-static {v0, v1, v6}, Lcom/evernote/android/job/k$a;->a(JZ)J

    move-result-wide v0

    cmp-long v6, p0, v2

    if-eqz v6, :cond_4

    div-long p0, v0, p0

    cmp-long v2, p0, p2

    if-nez v2, :cond_5

    :cond_4
    const/4 v4, 0x1

    :cond_5
    invoke-static {v0, v1, v4}, Lcom/evernote/android/job/k$a;->a(JZ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static b(Lcom/evernote/android/job/m;)J
    .locals 2

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/evernote/android/job/k$a;->a(Lcom/evernote/android/job/m;Z)J

    move-result-wide v0

    return-wide v0
.end method

.method public static c(Lcom/evernote/android/job/m;)J
    .locals 8

    invoke-static {p0}, Lcom/evernote/android/job/k$a;->a(Lcom/evernote/android/job/m;)J

    move-result-wide v0

    invoke-static {p0}, Lcom/evernote/android/job/k$a;->b(Lcom/evernote/android/job/m;)J

    move-result-wide v2

    invoke-static {p0}, Lcom/evernote/android/job/k$a;->a(Lcom/evernote/android/job/m;)J

    move-result-wide v4

    sub-long v6, v2, v4

    const-wide/16 v2, 0x2

    div-long/2addr v6, v2

    invoke-static {v0, v1, v6, v7}, Lcom/evernote/android/job/k$a;->a(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public static d(Lcom/evernote/android/job/m;)J
    .locals 6

    invoke-virtual {p0}, Lcom/evernote/android/job/m;->j()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/evernote/android/job/m;->k()J

    move-result-wide v2

    sub-long v4, v0, v2

    const-wide/16 v0, 0x1

    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public static e(Lcom/evernote/android/job/m;)J
    .locals 2

    invoke-virtual {p0}, Lcom/evernote/android/job/m;->j()J

    move-result-wide v0

    return-wide v0
.end method

.method public static f(Lcom/evernote/android/job/m;)J
    .locals 8

    invoke-static {p0}, Lcom/evernote/android/job/k$a;->d(Lcom/evernote/android/job/m;)J

    move-result-wide v0

    invoke-static {p0}, Lcom/evernote/android/job/k$a;->e(Lcom/evernote/android/job/m;)J

    move-result-wide v2

    invoke-static {p0}, Lcom/evernote/android/job/k$a;->d(Lcom/evernote/android/job/m;)J

    move-result-wide v4

    sub-long v6, v2, v4

    const-wide/16 v2, 0x2

    div-long/2addr v6, v2

    invoke-static {v0, v1, v6, v7}, Lcom/evernote/android/job/k$a;->a(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public static g(Lcom/evernote/android/job/m;)I
    .locals 0

    invoke-virtual {p0}, Lcom/evernote/android/job/m;->y()I

    move-result p0

    return p0
.end method


# virtual methods
.method public a(Lcom/evernote/android/job/m;Landroid/os/Bundle;)Lcom/evernote/android/job/c$b;
    .locals 10

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/evernote/android/job/m;->x()J

    move-result-wide v2

    sub-long v4, v0, v2

    invoke-virtual {p1}, Lcom/evernote/android/job/m;->i()Z

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "interval %s, flex %s"

    new-array v7, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/evernote/android/job/m;->j()J

    move-result-wide v8

    invoke-static {v8, v9}, Lcom/evernote/android/job/a/g;->a(J)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v3

    invoke-virtual {p1}, Lcom/evernote/android/job/m;->k()J

    move-result-wide v8

    invoke-static {v8, v9}, Lcom/evernote/android/job/a/g;->a(J)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v2

    :goto_0
    invoke-static {v0, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lcom/evernote/android/job/m;->w()Lcom/evernote/android/job/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/evernote/android/job/d;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "start %s, end %s"

    new-array v7, v1, [Ljava/lang/Object;

    invoke-static {p1}, Lcom/evernote/android/job/k$a;->a(Lcom/evernote/android/job/m;)J

    move-result-wide v8

    invoke-static {v8, v9}, Lcom/evernote/android/job/a/g;->a(J)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v3

    invoke-static {p1}, Lcom/evernote/android/job/k$a;->b(Lcom/evernote/android/job/m;)J

    move-result-wide v8

    invoke-static {v8, v9}, Lcom/evernote/android/job/a/g;->a(J)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v2

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "delay "

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/evernote/android/job/k$a;->c(Lcom/evernote/android/job/m;)J

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/evernote/android/job/a/g;->a(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v6

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v7

    if-ne v6, v7, :cond_2

    iget-object v6, p0, Lcom/evernote/android/job/k$a;->d:Lcom/evernote/android/job/a/d;

    const-string v7, "Running JobRequest on a main thread, this could cause stutter or ANR in your app."

    invoke-virtual {v6, v7}, Lcom/evernote/android/job/a/d;->c(Ljava/lang/String;)V

    :cond_2
    iget-object v6, p0, Lcom/evernote/android/job/k$a;->d:Lcom/evernote/android/job/a/d;

    const-string v7, "Run job, %s, waited %s, %s"

    const/4 v8, 0x3

    new-array v8, v8, [Ljava/lang/Object;

    aput-object p1, v8, v3

    invoke-static {v4, v5}, Lcom/evernote/android/job/a/g;->a(J)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v8, v2

    aput-object v0, v8, v1

    invoke-virtual {v6, v7, v8}, Lcom/evernote/android/job/a/d;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/evernote/android/job/k$a;->e:Lcom/evernote/android/job/i;

    invoke-virtual {v0}, Lcom/evernote/android/job/i;->f()Lcom/evernote/android/job/h;

    move-result-object v0

    const/4 v4, 0x0

    :try_start_0
    iget-object v5, p0, Lcom/evernote/android/job/k$a;->e:Lcom/evernote/android/job/i;

    invoke-virtual {v5}, Lcom/evernote/android/job/i;->g()Lcom/evernote/android/job/g;

    move-result-object v5

    invoke-virtual {p1}, Lcom/evernote/android/job/m;->d()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/evernote/android/job/g;->a(Ljava/lang/String;)Lcom/evernote/android/job/c;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p1}, Lcom/evernote/android/job/m;->i()Z

    move-result v4

    if-nez v4, :cond_3

    invoke-virtual {p1, v2}, Lcom/evernote/android/job/m;->b(Z)V

    :cond_3
    if-nez p2, :cond_4

    sget-object p2, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    :cond_4
    iget-object v4, p0, Lcom/evernote/android/job/k$a;->b:Landroid/content/Context;

    invoke-virtual {v0, v4, p1, v5, p2}, Lcom/evernote/android/job/h;->a(Landroid/content/Context;Lcom/evernote/android/job/m;Lcom/evernote/android/job/c;Landroid/os/Bundle;)Ljava/util/concurrent/Future;

    move-result-object p2

    if-nez p2, :cond_8

    sget-object p2, Lcom/evernote/android/job/c$b;->b:Lcom/evernote/android/job/c$b;
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v5, :cond_5

    :goto_2
    iget-object v0, p0, Lcom/evernote/android/job/k$a;->e:Lcom/evernote/android/job/i;

    invoke-virtual {v0}, Lcom/evernote/android/job/i;->e()Lcom/evernote/android/job/n;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/evernote/android/job/n;->b(Lcom/evernote/android/job/m;)V

    return-object p2

    :cond_5
    invoke-virtual {p1}, Lcom/evernote/android/job/m;->i()Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_2

    :cond_6
    invoke-virtual {p1}, Lcom/evernote/android/job/m;->A()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v5}, Lcom/evernote/android/job/c;->p()Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Lcom/evernote/android/job/k$a;->e:Lcom/evernote/android/job/i;

    invoke-virtual {v0}, Lcom/evernote/android/job/i;->e()Lcom/evernote/android/job/n;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/evernote/android/job/n;->b(Lcom/evernote/android/job/m;)V

    invoke-virtual {p1, v3, v3}, Lcom/evernote/android/job/m;->a(ZZ)Lcom/evernote/android/job/m;

    :cond_7
    return-object p2

    :cond_8
    :try_start_2
    invoke-interface {p2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/evernote/android/job/c$b;

    iget-object v0, p0, Lcom/evernote/android/job/k$a;->d:Lcom/evernote/android/job/a/d;

    const-string v4, "Finished job, %s %s"

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v3

    aput-object p2, v1, v2

    invoke-virtual {v0, v4, v1}, Lcom/evernote/android/job/a/d;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v5, :cond_9

    :goto_3
    iget-object v0, p0, Lcom/evernote/android/job/k$a;->e:Lcom/evernote/android/job/i;

    invoke-virtual {v0}, Lcom/evernote/android/job/i;->e()Lcom/evernote/android/job/n;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/evernote/android/job/n;->b(Lcom/evernote/android/job/m;)V

    return-object p2

    :cond_9
    invoke-virtual {p1}, Lcom/evernote/android/job/m;->i()Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_3

    :cond_a
    invoke-virtual {p1}, Lcom/evernote/android/job/m;->A()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {v5}, Lcom/evernote/android/job/c;->p()Z

    move-result v0

    if-nez v0, :cond_b

    iget-object v0, p0, Lcom/evernote/android/job/k$a;->e:Lcom/evernote/android/job/i;

    invoke-virtual {v0}, Lcom/evernote/android/job/i;->e()Lcom/evernote/android/job/n;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/evernote/android/job/n;->b(Lcom/evernote/android/job/m;)V

    invoke-virtual {p1, v3, v3}, Lcom/evernote/android/job/m;->a(ZZ)Lcom/evernote/android/job/m;

    :cond_b
    return-object p2

    :catchall_0
    move-exception p2

    goto :goto_6

    :catch_0
    move-exception p2

    move-object v4, v5

    goto :goto_4

    :catchall_1
    move-exception p2

    move-object v5, v4

    goto :goto_6

    :catch_1
    move-exception p2

    :goto_4
    :try_start_3
    iget-object v0, p0, Lcom/evernote/android/job/k$a;->d:Lcom/evernote/android/job/a/d;

    invoke-virtual {v0, p2}, Lcom/evernote/android/job/a/d;->a(Ljava/lang/Throwable;)V

    if-eqz v4, :cond_c

    invoke-virtual {v4}, Lcom/evernote/android/job/c;->l()V

    iget-object p2, p0, Lcom/evernote/android/job/k$a;->d:Lcom/evernote/android/job/a/d;

    const-string v0, "Canceled %s"

    new-array v1, v2, [Ljava/lang/Object;

    aput-object p1, v1, v3

    invoke-virtual {p2, v0, v1}, Lcom/evernote/android/job/a/d;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_c
    sget-object p2, Lcom/evernote/android/job/c$b;->b:Lcom/evernote/android/job/c$b;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-nez v4, :cond_d

    :goto_5
    iget-object v0, p0, Lcom/evernote/android/job/k$a;->e:Lcom/evernote/android/job/i;

    invoke-virtual {v0}, Lcom/evernote/android/job/i;->e()Lcom/evernote/android/job/n;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/evernote/android/job/n;->b(Lcom/evernote/android/job/m;)V

    return-object p2

    :cond_d
    invoke-virtual {p1}, Lcom/evernote/android/job/m;->i()Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_5

    :cond_e
    invoke-virtual {p1}, Lcom/evernote/android/job/m;->A()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-virtual {v4}, Lcom/evernote/android/job/c;->p()Z

    move-result v0

    if-nez v0, :cond_f

    iget-object v0, p0, Lcom/evernote/android/job/k$a;->e:Lcom/evernote/android/job/i;

    invoke-virtual {v0}, Lcom/evernote/android/job/i;->e()Lcom/evernote/android/job/n;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/evernote/android/job/n;->b(Lcom/evernote/android/job/m;)V

    invoke-virtual {p1, v3, v3}, Lcom/evernote/android/job/m;->a(ZZ)Lcom/evernote/android/job/m;

    :cond_f
    return-object p2

    :goto_6
    if-nez v5, :cond_10

    :goto_7
    iget-object v0, p0, Lcom/evernote/android/job/k$a;->e:Lcom/evernote/android/job/i;

    invoke-virtual {v0}, Lcom/evernote/android/job/i;->e()Lcom/evernote/android/job/n;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/evernote/android/job/n;->b(Lcom/evernote/android/job/m;)V

    goto :goto_8

    :cond_10
    invoke-virtual {p1}, Lcom/evernote/android/job/m;->i()Z

    move-result v0

    if-nez v0, :cond_11

    goto :goto_7

    :cond_11
    invoke-virtual {p1}, Lcom/evernote/android/job/m;->A()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-virtual {v5}, Lcom/evernote/android/job/c;->p()Z

    move-result v0

    if-nez v0, :cond_12

    iget-object v0, p0, Lcom/evernote/android/job/k$a;->e:Lcom/evernote/android/job/i;

    invoke-virtual {v0}, Lcom/evernote/android/job/i;->e()Lcom/evernote/android/job/n;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/evernote/android/job/n;->b(Lcom/evernote/android/job/m;)V

    invoke-virtual {p1, v3, v3}, Lcom/evernote/android/job/m;->a(ZZ)Lcom/evernote/android/job/m;

    :cond_12
    :goto_8
    throw p2
.end method

.method public a(ZZ)Lcom/evernote/android/job/m;
    .locals 16

    move-object/from16 v1, p0

    sget-object v2, Lcom/evernote/android/job/k$a;->a:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v3, v1, Lcom/evernote/android/job/k$a;->e:Lcom/evernote/android/job/i;

    const/4 v4, 0x0

    if-nez v3, :cond_0

    monitor-exit v2

    return-object v4

    :cond_0
    iget-object v3, v1, Lcom/evernote/android/job/k$a;->e:Lcom/evernote/android/job/i;

    iget v5, v1, Lcom/evernote/android/job/k$a;->c:I

    const/4 v6, 0x1

    invoke-virtual {v3, v5, v6}, Lcom/evernote/android/job/i;->a(IZ)Lcom/evernote/android/job/m;

    move-result-object v3

    iget-object v5, v1, Lcom/evernote/android/job/k$a;->e:Lcom/evernote/android/job/i;

    iget v7, v1, Lcom/evernote/android/job/k$a;->c:I

    invoke-virtual {v5, v7}, Lcom/evernote/android/job/i;->a(I)Lcom/evernote/android/job/c;

    move-result-object v5

    const/4 v7, 0x0

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/evernote/android/job/m;->i()Z

    move-result v8

    if-eqz v8, :cond_1

    const/4 v8, 0x1

    goto :goto_0

    :cond_1
    const/4 v8, 0x0

    :goto_0
    const/4 v9, 0x2

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lcom/evernote/android/job/c;->m()Z

    move-result v10

    if-nez v10, :cond_2

    iget-object v5, v1, Lcom/evernote/android/job/k$a;->d:Lcom/evernote/android/job/a/d;

    const-string v8, "Job %d is already running, %s"

    new-array v9, v9, [Ljava/lang/Object;

    iget v10, v1, Lcom/evernote/android/job/k$a;->c:I

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v9, v7

    aput-object v3, v9, v6

    invoke-virtual {v5, v8, v9}, Lcom/evernote/android/job/a/d;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    monitor-exit v2

    return-object v4

    :cond_2
    if-eqz v5, :cond_3

    if-nez v8, :cond_3

    iget-object v5, v1, Lcom/evernote/android/job/k$a;->d:Lcom/evernote/android/job/a/d;

    const-string v8, "Job %d already finished, %s"

    new-array v9, v9, [Ljava/lang/Object;

    iget v10, v1, Lcom/evernote/android/job/k$a;->c:I

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v9, v7

    aput-object v3, v9, v6

    invoke-virtual {v5, v8, v9}, Lcom/evernote/android/job/a/d;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct/range {p0 .. p1}, Lcom/evernote/android/job/k$a;->a(Z)V

    monitor-exit v2

    return-object v4

    :cond_3
    if-eqz v5, :cond_4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    invoke-virtual {v5}, Lcom/evernote/android/job/c;->n()J

    move-result-wide v12

    const/4 v5, 0x0

    sub-long v14, v10, v12

    const-wide/16 v10, 0x7d0

    cmp-long v5, v14, v10

    if-gez v5, :cond_4

    iget-object v5, v1, Lcom/evernote/android/job/k$a;->d:Lcom/evernote/android/job/a/d;

    const-string v8, "Job %d is periodic and just finished, %s"

    new-array v9, v9, [Ljava/lang/Object;

    iget v10, v1, Lcom/evernote/android/job/k$a;->c:I

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v9, v7

    aput-object v3, v9, v6

    invoke-virtual {v5, v8, v9}, Lcom/evernote/android/job/a/d;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    monitor-exit v2

    return-object v4

    :cond_4
    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lcom/evernote/android/job/m;->z()Z

    move-result v5

    if-eqz v5, :cond_5

    iget-object v5, v1, Lcom/evernote/android/job/k$a;->d:Lcom/evernote/android/job/a/d;

    const-string v8, "Request %d already started, %s"

    new-array v9, v9, [Ljava/lang/Object;

    iget v10, v1, Lcom/evernote/android/job/k$a;->c:I

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v9, v7

    aput-object v3, v9, v6

    invoke-virtual {v5, v8, v9}, Lcom/evernote/android/job/a/d;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    monitor-exit v2

    return-object v4

    :cond_5
    if-eqz v3, :cond_6

    iget-object v5, v1, Lcom/evernote/android/job/k$a;->e:Lcom/evernote/android/job/i;

    invoke-virtual {v5}, Lcom/evernote/android/job/i;->f()Lcom/evernote/android/job/h;

    move-result-object v5

    invoke-virtual {v5, v3}, Lcom/evernote/android/job/h;->b(Lcom/evernote/android/job/m;)Z

    move-result v5

    if-eqz v5, :cond_6

    iget-object v5, v1, Lcom/evernote/android/job/k$a;->d:Lcom/evernote/android/job/a/d;

    const-string v8, "Request %d is in the queue to start, %s"

    new-array v9, v9, [Ljava/lang/Object;

    iget v10, v1, Lcom/evernote/android/job/k$a;->c:I

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v9, v7

    aput-object v3, v9, v6

    invoke-virtual {v5, v8, v9}, Lcom/evernote/android/job/a/d;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    monitor-exit v2

    return-object v4

    :cond_6
    if-nez v3, :cond_7

    iget-object v3, v1, Lcom/evernote/android/job/k$a;->d:Lcom/evernote/android/job/a/d;

    const-string v5, "Request for ID %d was null"

    new-array v6, v6, [Ljava/lang/Object;

    iget v8, v1, Lcom/evernote/android/job/k$a;->c:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v6, v7

    invoke-virtual {v3, v5, v6}, Lcom/evernote/android/job/a/d;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct/range {p0 .. p1}, Lcom/evernote/android/job/k$a;->a(Z)V

    monitor-exit v2

    return-object v4

    :cond_7
    if-eqz p2, :cond_8

    invoke-virtual {v1, v3}, Lcom/evernote/android/job/k$a;->h(Lcom/evernote/android/job/m;)V

    :cond_8
    monitor-exit v2

    return-object v3

    :catchall_0
    move-exception v0

    move-object v3, v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v3
.end method

.method public h(Lcom/evernote/android/job/m;)V
    .locals 1

    iget-object v0, p0, Lcom/evernote/android/job/k$a;->e:Lcom/evernote/android/job/i;

    invoke-virtual {v0}, Lcom/evernote/android/job/i;->f()Lcom/evernote/android/job/h;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/evernote/android/job/h;->a(Lcom/evernote/android/job/m;)V

    return-void
.end method
