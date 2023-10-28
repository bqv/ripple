.class public final Lcom/evernote/android/job/m;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/evernote/android/job/m$c;,
        Lcom/evernote/android/job/m$d;,
        Lcom/evernote/android/job/m$a;,
        Lcom/evernote/android/job/m$b;
    }
.end annotation


# static fields
.field public static final a:Lcom/evernote/android/job/m$a;

.field public static final b:Lcom/evernote/android/job/m$d;

.field public static final c:Lcom/evernote/android/job/m$c;

.field public static final d:J

.field public static final e:J

.field private static final f:Lcom/evernote/android/job/a/d;


# instance fields
.field private final g:Lcom/evernote/android/job/m$b;

.field private h:I

.field private i:J

.field private j:Z

.field private k:Z

.field private l:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Lcom/evernote/android/job/m$a;->b:Lcom/evernote/android/job/m$a;

    sput-object v0, Lcom/evernote/android/job/m;->a:Lcom/evernote/android/job/m$a;

    sget-object v0, Lcom/evernote/android/job/m$d;->a:Lcom/evernote/android/job/m$d;

    sput-object v0, Lcom/evernote/android/job/m;->b:Lcom/evernote/android/job/m$d;

    new-instance v0, Lcom/evernote/android/job/m$1;

    invoke-direct {v0}, Lcom/evernote/android/job/m$1;-><init>()V

    sput-object v0, Lcom/evernote/android/job/m;->c:Lcom/evernote/android/job/m$c;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xf

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/evernote/android/job/m;->d:J

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x5

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/evernote/android/job/m;->e:J

    new-instance v0, Lcom/evernote/android/job/a/d;

    const-string v1, "JobRequest"

    invoke-direct {v0, v1}, Lcom/evernote/android/job/a/d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/evernote/android/job/m;->f:Lcom/evernote/android/job/a/d;

    return-void
.end method

.method private constructor <init>(Lcom/evernote/android/job/m$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/evernote/android/job/m;->g:Lcom/evernote/android/job/m$b;

    return-void
.end method

.method synthetic constructor <init>(Lcom/evernote/android/job/m$b;Lcom/evernote/android/job/m$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/evernote/android/job/m;-><init>(Lcom/evernote/android/job/m$b;)V

    return-void
.end method

.method static synthetic G()Lcom/evernote/android/job/a/d;
    .locals 1

    sget-object v0, Lcom/evernote/android/job/m;->f:Lcom/evernote/android/job/a/d;

    return-object v0
.end method

.method private static H()Landroid/content/Context;
    .locals 1

    invoke-static {}, Lcom/evernote/android/job/i;->a()Lcom/evernote/android/job/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/evernote/android/job/i;->h()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method static a()J
    .locals 3

    invoke-static {}, Lcom/evernote/android/job/e;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    return-wide v0

    :cond_0
    sget-wide v0, Lcom/evernote/android/job/m;->d:J

    return-wide v0
.end method

.method static a(Landroid/database/Cursor;)Lcom/evernote/android/job/m;
    .locals 4

    new-instance v0, Lcom/evernote/android/job/m$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/evernote/android/job/m$b;-><init>(Landroid/database/Cursor;Lcom/evernote/android/job/m$1;)V

    invoke-virtual {v0}, Lcom/evernote/android/job/m$b;->a()Lcom/evernote/android/job/m;

    move-result-object v0

    const-string v1, "numFailures"

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    iput v1, v0, Lcom/evernote/android/job/m;->h:I

    const-string v1, "scheduledAt"

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    iput-wide v1, v0, Lcom/evernote/android/job/m;->i:J

    const-string v1, "started"

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, v0, Lcom/evernote/android/job/m;->j:Z

    const-string v1, "flexSupport"

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    if-lez v1, :cond_1

    const/4 v2, 0x1

    :cond_1
    iput-boolean v2, v0, Lcom/evernote/android/job/m;->k:Z

    const-string v1, "lastRun"

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    iput-wide v1, v0, Lcom/evernote/android/job/m;->l:J

    iget p0, v0, Lcom/evernote/android/job/m;->h:I

    const-string v1, "failure count can\'t be negative"

    invoke-static {p0, v1}, Lcom/evernote/android/job/a/f;->a(ILjava/lang/String;)I

    iget-wide v1, v0, Lcom/evernote/android/job/m;->i:J

    const-string p0, "scheduled at can\'t be negative"

    invoke-static {v1, v2, p0}, Lcom/evernote/android/job/a/f;->a(JLjava/lang/String;)J

    return-object v0
.end method

.method static b()J
    .locals 3

    invoke-static {}, Lcom/evernote/android/job/e;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1e

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    return-wide v0

    :cond_0
    sget-wide v0, Lcom/evernote/android/job/m;->e:J

    return-wide v0
.end method


# virtual methods
.method A()Z
    .locals 1

    iget-boolean v0, p0, Lcom/evernote/android/job/m;->k:Z

    return v0
.end method

.method public B()Z
    .locals 1

    iget-object v0, p0, Lcom/evernote/android/job/m;->g:Lcom/evernote/android/job/m$b;

    invoke-static {v0}, Lcom/evernote/android/job/m$b;->r(Lcom/evernote/android/job/m$b;)Z

    move-result v0

    return v0
.end method

.method public C()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/evernote/android/job/m;->g:Lcom/evernote/android/job/m$b;

    invoke-static {v0}, Lcom/evernote/android/job/m$b;->s(Lcom/evernote/android/job/m$b;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public D()I
    .locals 1

    invoke-static {}, Lcom/evernote/android/job/i;->a()Lcom/evernote/android/job/i;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/evernote/android/job/i;->a(Lcom/evernote/android/job/m;)V

    invoke-virtual {p0}, Lcom/evernote/android/job/m;->c()I

    move-result v0

    return v0
.end method

.method public E()Lcom/evernote/android/job/m$b;
    .locals 11

    iget-wide v0, p0, Lcom/evernote/android/job/m;->i:J

    invoke-static {}, Lcom/evernote/android/job/i;->a()Lcom/evernote/android/job/i;

    move-result-object v2

    invoke-virtual {p0}, Lcom/evernote/android/job/m;->c()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/evernote/android/job/i;->b(I)Z

    new-instance v2, Lcom/evernote/android/job/m$b;

    iget-object v3, p0, Lcom/evernote/android/job/m;->g:Lcom/evernote/android/job/m$b;

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Lcom/evernote/android/job/m$b;-><init>(Lcom/evernote/android/job/m$b;Lcom/evernote/android/job/m$1;)V

    const/4 v3, 0x0

    iput-boolean v3, p0, Lcom/evernote/android/job/m;->j:Z

    invoke-virtual {p0}, Lcom/evernote/android/job/m;->i()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {}, Lcom/evernote/android/job/e;->g()Lcom/evernote/android/job/a/b;

    move-result-object v3

    invoke-interface {v3}, Lcom/evernote/android/job/a/b;->a()J

    move-result-wide v3

    sub-long v5, v3, v0

    const-wide/16 v0, 0x1

    invoke-virtual {p0}, Lcom/evernote/android/job/m;->e()J

    move-result-wide v3

    sub-long v7, v3, v5

    invoke-static {v0, v1, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    invoke-virtual {p0}, Lcom/evernote/android/job/m;->f()J

    move-result-wide v7

    sub-long v9, v7, v5

    invoke-static {v0, v1, v9, v10}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    invoke-virtual {v2, v3, v4, v0, v1}, Lcom/evernote/android/job/m$b;->a(JJ)Lcom/evernote/android/job/m$b;

    :cond_0
    return-object v2
.end method

.method F()Landroid/content/ContentValues;
    .locals 4

    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    iget-object v1, p0, Lcom/evernote/android/job/m;->g:Lcom/evernote/android/job/m$b;

    invoke-static {v1, v0}, Lcom/evernote/android/job/m$b;->a(Lcom/evernote/android/job/m$b;Landroid/content/ContentValues;)V

    const-string v1, "numFailures"

    iget v2, p0, Lcom/evernote/android/job/m;->h:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v1, "scheduledAt"

    iget-wide v2, p0, Lcom/evernote/android/job/m;->i:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v1, "started"

    iget-boolean v2, p0, Lcom/evernote/android/job/m;->j:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    const-string v1, "flexSupport"

    iget-boolean v2, p0, Lcom/evernote/android/job/m;->k:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    const-string v1, "lastRun"

    iget-wide v2, p0, Lcom/evernote/android/job/m;->l:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    return-object v0
.end method

.method a(ZZ)Lcom/evernote/android/job/m;
    .locals 3

    new-instance v0, Lcom/evernote/android/job/m$b;

    iget-object v1, p0, Lcom/evernote/android/job/m;->g:Lcom/evernote/android/job/m$b;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p2, v2}, Lcom/evernote/android/job/m$b;-><init>(Lcom/evernote/android/job/m$b;ZLcom/evernote/android/job/m$1;)V

    invoke-virtual {v0}, Lcom/evernote/android/job/m$b;->a()Lcom/evernote/android/job/m;

    move-result-object p2

    if-eqz p1, :cond_0

    iget p1, p0, Lcom/evernote/android/job/m;->h:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p2, Lcom/evernote/android/job/m;->h:I

    :cond_0
    :try_start_0
    invoke-virtual {p2}, Lcom/evernote/android/job/m;->D()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    sget-object v0, Lcom/evernote/android/job/m;->f:Lcom/evernote/android/job/a/d;

    invoke-virtual {v0, p1}, Lcom/evernote/android/job/a/d;->a(Ljava/lang/Throwable;)V

    return-object p2
.end method

.method a(J)V
    .locals 0

    iput-wide p1, p0, Lcom/evernote/android/job/m;->i:J

    return-void
.end method

.method a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/evernote/android/job/m;->k:Z

    return-void
.end method

.method b(Z)V
    .locals 2

    iput-boolean p1, p0, Lcom/evernote/android/job/m;->j:Z

    new-instance p1, Landroid/content/ContentValues;

    invoke-direct {p1}, Landroid/content/ContentValues;-><init>()V

    const-string v0, "started"

    iget-boolean v1, p0, Lcom/evernote/android/job/m;->j:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    invoke-static {}, Lcom/evernote/android/job/i;->a()Lcom/evernote/android/job/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/evernote/android/job/i;->e()Lcom/evernote/android/job/n;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/evernote/android/job/n;->a(Lcom/evernote/android/job/m;Landroid/content/ContentValues;)V

    return-void
.end method

.method b(ZZ)V
    .locals 3

    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    if-eqz p1, :cond_0

    iget p1, p0, Lcom/evernote/android/job/m;->h:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/evernote/android/job/m;->h:I

    const-string p1, "numFailures"

    iget v1, p0, Lcom/evernote/android/job/m;->h:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    :cond_0
    if-eqz p2, :cond_1

    invoke-static {}, Lcom/evernote/android/job/e;->g()Lcom/evernote/android/job/a/b;

    move-result-object p1

    invoke-interface {p1}, Lcom/evernote/android/job/a/b;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/evernote/android/job/m;->l:J

    const-string p1, "lastRun"

    iget-wide v1, p0, Lcom/evernote/android/job/m;->l:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    :cond_1
    invoke-static {}, Lcom/evernote/android/job/i;->a()Lcom/evernote/android/job/i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/evernote/android/job/i;->e()Lcom/evernote/android/job/n;

    move-result-object p1

    invoke-virtual {p1, p0, v0}, Lcom/evernote/android/job/n;->a(Lcom/evernote/android/job/m;Landroid/content/ContentValues;)V

    return-void
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lcom/evernote/android/job/m;->g:Lcom/evernote/android/job/m$b;

    invoke-static {v0}, Lcom/evernote/android/job/m$b;->a(Lcom/evernote/android/job/m$b;)I

    move-result v0

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/evernote/android/job/m;->g:Lcom/evernote/android/job/m$b;

    iget-object v0, v0, Lcom/evernote/android/job/m$b;->a:Ljava/lang/String;

    return-object v0
.end method

.method public e()J
    .locals 2

    iget-object v0, p0, Lcom/evernote/android/job/m;->g:Lcom/evernote/android/job/m$b;

    invoke-static {v0}, Lcom/evernote/android/job/m$b;->b(Lcom/evernote/android/job/m$b;)J

    move-result-wide v0

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/evernote/android/job/m;

    iget-object v0, p0, Lcom/evernote/android/job/m;->g:Lcom/evernote/android/job/m$b;

    iget-object p1, p1, Lcom/evernote/android/job/m;->g:Lcom/evernote/android/job/m$b;

    invoke-virtual {v0, p1}, Lcom/evernote/android/job/m$b;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public f()J
    .locals 2

    iget-object v0, p0, Lcom/evernote/android/job/m;->g:Lcom/evernote/android/job/m$b;

    invoke-static {v0}, Lcom/evernote/android/job/m$b;->c(Lcom/evernote/android/job/m$b;)J

    move-result-wide v0

    return-wide v0
.end method

.method public g()Lcom/evernote/android/job/m$a;
    .locals 1

    iget-object v0, p0, Lcom/evernote/android/job/m;->g:Lcom/evernote/android/job/m$b;

    invoke-static {v0}, Lcom/evernote/android/job/m$b;->d(Lcom/evernote/android/job/m$b;)Lcom/evernote/android/job/m$a;

    move-result-object v0

    return-object v0
.end method

.method public h()J
    .locals 2

    iget-object v0, p0, Lcom/evernote/android/job/m;->g:Lcom/evernote/android/job/m$b;

    invoke-static {v0}, Lcom/evernote/android/job/m$b;->e(Lcom/evernote/android/job/m$b;)J

    move-result-wide v0

    return-wide v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/evernote/android/job/m;->g:Lcom/evernote/android/job/m$b;

    invoke-virtual {v0}, Lcom/evernote/android/job/m$b;->hashCode()I

    move-result v0

    return v0
.end method

.method public i()Z
    .locals 5

    invoke-virtual {p0}, Lcom/evernote/android/job/m;->j()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public j()J
    .locals 2

    iget-object v0, p0, Lcom/evernote/android/job/m;->g:Lcom/evernote/android/job/m$b;

    invoke-static {v0}, Lcom/evernote/android/job/m$b;->f(Lcom/evernote/android/job/m$b;)J

    move-result-wide v0

    return-wide v0
.end method

.method public k()J
    .locals 2

    iget-object v0, p0, Lcom/evernote/android/job/m;->g:Lcom/evernote/android/job/m$b;

    invoke-static {v0}, Lcom/evernote/android/job/m$b;->g(Lcom/evernote/android/job/m$b;)J

    move-result-wide v0

    return-wide v0
.end method

.method public l()Z
    .locals 1

    iget-object v0, p0, Lcom/evernote/android/job/m;->g:Lcom/evernote/android/job/m$b;

    invoke-static {v0}, Lcom/evernote/android/job/m$b;->h(Lcom/evernote/android/job/m$b;)Z

    move-result v0

    return v0
.end method

.method public m()Z
    .locals 1

    iget-object v0, p0, Lcom/evernote/android/job/m;->g:Lcom/evernote/android/job/m$b;

    invoke-static {v0}, Lcom/evernote/android/job/m$b;->i(Lcom/evernote/android/job/m$b;)Z

    move-result v0

    return v0
.end method

.method public n()Z
    .locals 1

    iget-object v0, p0, Lcom/evernote/android/job/m;->g:Lcom/evernote/android/job/m$b;

    invoke-static {v0}, Lcom/evernote/android/job/m$b;->j(Lcom/evernote/android/job/m$b;)Z

    move-result v0

    return v0
.end method

.method public o()Z
    .locals 1

    iget-object v0, p0, Lcom/evernote/android/job/m;->g:Lcom/evernote/android/job/m$b;

    invoke-static {v0}, Lcom/evernote/android/job/m$b;->k(Lcom/evernote/android/job/m$b;)Z

    move-result v0

    return v0
.end method

.method public p()Z
    .locals 1

    iget-object v0, p0, Lcom/evernote/android/job/m;->g:Lcom/evernote/android/job/m$b;

    invoke-static {v0}, Lcom/evernote/android/job/m$b;->l(Lcom/evernote/android/job/m$b;)Z

    move-result v0

    return v0
.end method

.method public q()Lcom/evernote/android/job/m$d;
    .locals 1

    iget-object v0, p0, Lcom/evernote/android/job/m;->g:Lcom/evernote/android/job/m$b;

    invoke-static {v0}, Lcom/evernote/android/job/m$b;->m(Lcom/evernote/android/job/m$b;)Lcom/evernote/android/job/m$d;

    move-result-object v0

    return-object v0
.end method

.method public r()Z
    .locals 2

    invoke-virtual {p0}, Lcom/evernote/android/job/m;->m()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/evernote/android/job/m;->n()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/evernote/android/job/m;->o()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/evernote/android/job/m;->p()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/evernote/android/job/m;->q()Lcom/evernote/android/job/m$d;

    move-result-object v0

    sget-object v1, Lcom/evernote/android/job/m;->b:Lcom/evernote/android/job/m$d;

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public s()Lcom/evernote/android/job/a/a/b;
    .locals 2

    iget-object v0, p0, Lcom/evernote/android/job/m;->g:Lcom/evernote/android/job/m$b;

    invoke-static {v0}, Lcom/evernote/android/job/m$b;->n(Lcom/evernote/android/job/m$b;)Lcom/evernote/android/job/a/a/b;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/evernote/android/job/m;->g:Lcom/evernote/android/job/m$b;

    invoke-static {v0}, Lcom/evernote/android/job/m$b;->o(Lcom/evernote/android/job/m$b;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/evernote/android/job/m;->g:Lcom/evernote/android/job/m$b;

    iget-object v1, p0, Lcom/evernote/android/job/m;->g:Lcom/evernote/android/job/m$b;

    invoke-static {v1}, Lcom/evernote/android/job/m$b;->o(Lcom/evernote/android/job/m$b;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/evernote/android/job/a/a/b;->a(Ljava/lang/String;)Lcom/evernote/android/job/a/a/b;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/evernote/android/job/m$b;->a(Lcom/evernote/android/job/m$b;Lcom/evernote/android/job/a/a/b;)Lcom/evernote/android/job/a/a/b;

    :cond_0
    iget-object v0, p0, Lcom/evernote/android/job/m;->g:Lcom/evernote/android/job/m$b;

    invoke-static {v0}, Lcom/evernote/android/job/m$b;->n(Lcom/evernote/android/job/m$b;)Lcom/evernote/android/job/a/a/b;

    move-result-object v0

    return-object v0
.end method

.method public t()Z
    .locals 1

    iget-object v0, p0, Lcom/evernote/android/job/m;->g:Lcom/evernote/android/job/m$b;

    invoke-static {v0}, Lcom/evernote/android/job/m$b;->p(Lcom/evernote/android/job/m$b;)Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "request{id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/evernote/android/job/m;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", tag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/evernote/android/job/m;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", transient="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/evernote/android/job/m;->B()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Z
    .locals 1

    iget-object v0, p0, Lcom/evernote/android/job/m;->g:Lcom/evernote/android/job/m$b;

    invoke-static {v0}, Lcom/evernote/android/job/m$b;->q(Lcom/evernote/android/job/m$b;)Z

    move-result v0

    return v0
.end method

.method v()J
    .locals 6

    invoke-virtual {p0}, Lcom/evernote/android/job/m;->i()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    return-wide v1

    :cond_0
    sget-object v0, Lcom/evernote/android/job/m$2;->a:[I

    invoke-virtual {p0}, Lcom/evernote/android/job/m;->g()Lcom/evernote/android/job/m$a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/evernote/android/job/m$a;->ordinal()I

    move-result v3

    aget v0, v0, v3

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "not implemented"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget v0, p0, Lcom/evernote/android/job/m;->h:I

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/evernote/android/job/m;->h()J

    move-result-wide v0

    long-to-double v0, v0

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    iget v4, p0, Lcom/evernote/android/job/m;->h:I

    add-int/lit8 v4, v4, -0x1

    int-to-double v4, v4

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    mul-double v0, v0, v2

    double-to-long v1, v0

    goto :goto_0

    :pswitch_1
    iget v0, p0, Lcom/evernote/android/job/m;->h:I

    int-to-long v0, v0

    invoke-virtual {p0}, Lcom/evernote/android/job/m;->h()J

    move-result-wide v2

    mul-long v1, v0, v2

    :goto_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x5

    invoke-virtual {v0, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    return-wide v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method w()Lcom/evernote/android/job/d;
    .locals 1

    iget-object v0, p0, Lcom/evernote/android/job/m;->g:Lcom/evernote/android/job/m$b;

    invoke-static {v0}, Lcom/evernote/android/job/m$b;->q(Lcom/evernote/android/job/m$b;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/evernote/android/job/d;->e:Lcom/evernote/android/job/d;

    return-object v0

    :cond_0
    invoke-static {}, Lcom/evernote/android/job/m;->H()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/evernote/android/job/d;->c(Landroid/content/Context;)Lcom/evernote/android/job/d;

    move-result-object v0

    return-object v0
.end method

.method public x()J
    .locals 2

    iget-wide v0, p0, Lcom/evernote/android/job/m;->i:J

    return-wide v0
.end method

.method public y()I
    .locals 1

    iget v0, p0, Lcom/evernote/android/job/m;->h:I

    return v0
.end method

.method z()Z
    .locals 1

    iget-boolean v0, p0, Lcom/evernote/android/job/m;->j:Z

    return v0
.end method
