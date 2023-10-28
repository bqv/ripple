.class public final Lcom/evernote/android/job/m$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/evernote/android/job/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field final a:Ljava/lang/String;

.field private b:I

.field private c:J

.field private d:J

.field private e:J

.field private f:Lcom/evernote/android/job/m$a;

.field private g:J

.field private h:J

.field private i:Z

.field private j:Z

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:Lcom/evernote/android/job/m$d;

.field private p:Lcom/evernote/android/job/a/a/b;

.field private q:Ljava/lang/String;

.field private r:Z

.field private s:Z

.field private t:Landroid/os/Bundle;


# direct methods
.method private constructor <init>(Landroid/database/Cursor;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    iput-object v0, p0, Lcom/evernote/android/job/m$b;->t:Landroid/os/Bundle;

    const-string v0, "_id"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, p0, Lcom/evernote/android/job/m$b;->b:I

    const-string v0, "tag"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/evernote/android/job/m$b;->a:Ljava/lang/String;

    const-string v0, "startMs"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/evernote/android/job/m$b;->c:J

    const-string v0, "endMs"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/evernote/android/job/m$b;->d:J

    const-string v0, "backoffMs"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/evernote/android/job/m$b;->e:J

    :try_start_0
    const-string v0, "backoffPolicy"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/evernote/android/job/m$a;->valueOf(Ljava/lang/String;)Lcom/evernote/android/job/m$a;

    move-result-object v0

    iput-object v0, p0, Lcom/evernote/android/job/m$b;->f:Lcom/evernote/android/job/m$a;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/evernote/android/job/m;->G()Lcom/evernote/android/job/a/d;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/evernote/android/job/a/d;->a(Ljava/lang/Throwable;)V

    sget-object v0, Lcom/evernote/android/job/m;->a:Lcom/evernote/android/job/m$a;

    iput-object v0, p0, Lcom/evernote/android/job/m$b;->f:Lcom/evernote/android/job/m$a;

    :goto_0
    const-string v0, "intervalMs"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/evernote/android/job/m$b;->g:J

    const-string v0, "flexMs"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/evernote/android/job/m$b;->h:J

    const-string v0, "requirementsEnforced"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lcom/evernote/android/job/m$b;->i:Z

    const-string v0, "requiresCharging"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-lez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    :goto_2
    iput-boolean v0, p0, Lcom/evernote/android/job/m$b;->j:Z

    const-string v0, "requiresDeviceIdle"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-lez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_3

    :cond_2
    const/4 v0, 0x0

    :goto_3
    iput-boolean v0, p0, Lcom/evernote/android/job/m$b;->k:Z

    const-string v0, "requiresBatteryNotLow"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-lez v0, :cond_3

    const/4 v0, 0x1

    goto :goto_4

    :cond_3
    const/4 v0, 0x0

    :goto_4
    iput-boolean v0, p0, Lcom/evernote/android/job/m$b;->l:Z

    const-string v0, "requiresStorageNotLow"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-lez v0, :cond_4

    const/4 v0, 0x1

    goto :goto_5

    :cond_4
    const/4 v0, 0x0

    :goto_5
    iput-boolean v0, p0, Lcom/evernote/android/job/m$b;->m:Z

    const-string v0, "exact"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-lez v0, :cond_5

    const/4 v0, 0x1

    goto :goto_6

    :cond_5
    const/4 v0, 0x0

    :goto_6
    iput-boolean v0, p0, Lcom/evernote/android/job/m$b;->n:Z

    :try_start_1
    const-string v0, "networkType"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/evernote/android/job/m$d;->valueOf(Ljava/lang/String;)Lcom/evernote/android/job/m$d;

    move-result-object v0

    iput-object v0, p0, Lcom/evernote/android/job/m$b;->o:Lcom/evernote/android/job/m$d;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_7

    :catch_1
    move-exception v0

    invoke-static {}, Lcom/evernote/android/job/m;->G()Lcom/evernote/android/job/a/d;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/evernote/android/job/a/d;->a(Ljava/lang/Throwable;)V

    sget-object v0, Lcom/evernote/android/job/m;->b:Lcom/evernote/android/job/m$d;

    iput-object v0, p0, Lcom/evernote/android/job/m$b;->o:Lcom/evernote/android/job/m$d;

    :goto_7
    const-string v0, "extras"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/evernote/android/job/m$b;->q:Ljava/lang/String;

    const-string v0, "transient"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result p1

    if-lez p1, :cond_6

    const/4 v1, 0x1

    :cond_6
    iput-boolean v1, p0, Lcom/evernote/android/job/m$b;->s:Z

    return-void
.end method

.method synthetic constructor <init>(Landroid/database/Cursor;Lcom/evernote/android/job/m$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/evernote/android/job/m$b;-><init>(Landroid/database/Cursor;)V

    return-void
.end method

.method private constructor <init>(Lcom/evernote/android/job/m$b;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/evernote/android/job/m$b;-><init>(Lcom/evernote/android/job/m$b;Z)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/evernote/android/job/m$b;Lcom/evernote/android/job/m$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/evernote/android/job/m$b;-><init>(Lcom/evernote/android/job/m$b;)V

    return-void
.end method

.method private constructor <init>(Lcom/evernote/android/job/m$b;Z)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    iput-object v0, p0, Lcom/evernote/android/job/m$b;->t:Landroid/os/Bundle;

    if-eqz p2, :cond_0

    const/16 p2, -0x223d

    goto :goto_0

    :cond_0
    iget p2, p1, Lcom/evernote/android/job/m$b;->b:I

    :goto_0
    iput p2, p0, Lcom/evernote/android/job/m$b;->b:I

    iget-object p2, p1, Lcom/evernote/android/job/m$b;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/evernote/android/job/m$b;->a:Ljava/lang/String;

    iget-wide v0, p1, Lcom/evernote/android/job/m$b;->c:J

    iput-wide v0, p0, Lcom/evernote/android/job/m$b;->c:J

    iget-wide v0, p1, Lcom/evernote/android/job/m$b;->d:J

    iput-wide v0, p0, Lcom/evernote/android/job/m$b;->d:J

    iget-wide v0, p1, Lcom/evernote/android/job/m$b;->e:J

    iput-wide v0, p0, Lcom/evernote/android/job/m$b;->e:J

    iget-object p2, p1, Lcom/evernote/android/job/m$b;->f:Lcom/evernote/android/job/m$a;

    iput-object p2, p0, Lcom/evernote/android/job/m$b;->f:Lcom/evernote/android/job/m$a;

    iget-wide v0, p1, Lcom/evernote/android/job/m$b;->g:J

    iput-wide v0, p0, Lcom/evernote/android/job/m$b;->g:J

    iget-wide v0, p1, Lcom/evernote/android/job/m$b;->h:J

    iput-wide v0, p0, Lcom/evernote/android/job/m$b;->h:J

    iget-boolean p2, p1, Lcom/evernote/android/job/m$b;->i:Z

    iput-boolean p2, p0, Lcom/evernote/android/job/m$b;->i:Z

    iget-boolean p2, p1, Lcom/evernote/android/job/m$b;->j:Z

    iput-boolean p2, p0, Lcom/evernote/android/job/m$b;->j:Z

    iget-boolean p2, p1, Lcom/evernote/android/job/m$b;->k:Z

    iput-boolean p2, p0, Lcom/evernote/android/job/m$b;->k:Z

    iget-boolean p2, p1, Lcom/evernote/android/job/m$b;->l:Z

    iput-boolean p2, p0, Lcom/evernote/android/job/m$b;->l:Z

    iget-boolean p2, p1, Lcom/evernote/android/job/m$b;->m:Z

    iput-boolean p2, p0, Lcom/evernote/android/job/m$b;->m:Z

    iget-boolean p2, p1, Lcom/evernote/android/job/m$b;->n:Z

    iput-boolean p2, p0, Lcom/evernote/android/job/m$b;->n:Z

    iget-object p2, p1, Lcom/evernote/android/job/m$b;->o:Lcom/evernote/android/job/m$d;

    iput-object p2, p0, Lcom/evernote/android/job/m$b;->o:Lcom/evernote/android/job/m$d;

    iget-object p2, p1, Lcom/evernote/android/job/m$b;->p:Lcom/evernote/android/job/a/a/b;

    iput-object p2, p0, Lcom/evernote/android/job/m$b;->p:Lcom/evernote/android/job/a/a/b;

    iget-object p2, p1, Lcom/evernote/android/job/m$b;->q:Ljava/lang/String;

    iput-object p2, p0, Lcom/evernote/android/job/m$b;->q:Ljava/lang/String;

    iget-boolean p2, p1, Lcom/evernote/android/job/m$b;->r:Z

    iput-boolean p2, p0, Lcom/evernote/android/job/m$b;->r:Z

    iget-boolean p2, p1, Lcom/evernote/android/job/m$b;->s:Z

    iput-boolean p2, p0, Lcom/evernote/android/job/m$b;->s:Z

    iget-object p1, p1, Lcom/evernote/android/job/m$b;->t:Landroid/os/Bundle;

    iput-object p1, p0, Lcom/evernote/android/job/m$b;->t:Landroid/os/Bundle;

    return-void
.end method

.method synthetic constructor <init>(Lcom/evernote/android/job/m$b;ZLcom/evernote/android/job/m$1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/evernote/android/job/m$b;-><init>(Lcom/evernote/android/job/m$b;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    iput-object v0, p0, Lcom/evernote/android/job/m$b;->t:Landroid/os/Bundle;

    invoke-static {p1}, Lcom/evernote/android/job/a/f;->a(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/evernote/android/job/m$b;->a:Ljava/lang/String;

    const/16 p1, -0x223d

    iput p1, p0, Lcom/evernote/android/job/m$b;->b:I

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/evernote/android/job/m$b;->c:J

    iput-wide v0, p0, Lcom/evernote/android/job/m$b;->d:J

    const-wide/16 v0, 0x7530

    iput-wide v0, p0, Lcom/evernote/android/job/m$b;->e:J

    sget-object p1, Lcom/evernote/android/job/m;->a:Lcom/evernote/android/job/m$a;

    iput-object p1, p0, Lcom/evernote/android/job/m$b;->f:Lcom/evernote/android/job/m$a;

    sget-object p1, Lcom/evernote/android/job/m;->b:Lcom/evernote/android/job/m$d;

    iput-object p1, p0, Lcom/evernote/android/job/m$b;->o:Lcom/evernote/android/job/m$d;

    return-void
.end method

.method static synthetic a(Lcom/evernote/android/job/m$b;)I
    .locals 0

    iget p0, p0, Lcom/evernote/android/job/m$b;->b:I

    return p0
.end method

.method static synthetic a(Lcom/evernote/android/job/m$b;Lcom/evernote/android/job/a/a/b;)Lcom/evernote/android/job/a/a/b;
    .locals 0

    iput-object p1, p0, Lcom/evernote/android/job/m$b;->p:Lcom/evernote/android/job/a/a/b;

    return-object p1
.end method

.method private a(Landroid/content/ContentValues;)V
    .locals 3

    const-string v0, "_id"

    iget v1, p0, Lcom/evernote/android/job/m$b;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v0, "tag"

    iget-object v1, p0, Lcom/evernote/android/job/m$b;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "startMs"

    iget-wide v1, p0, Lcom/evernote/android/job/m$b;->c:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v0, "endMs"

    iget-wide v1, p0, Lcom/evernote/android/job/m$b;->d:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v0, "backoffMs"

    iget-wide v1, p0, Lcom/evernote/android/job/m$b;->e:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v0, "backoffPolicy"

    iget-object v1, p0, Lcom/evernote/android/job/m$b;->f:Lcom/evernote/android/job/m$a;

    invoke-virtual {v1}, Lcom/evernote/android/job/m$a;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "intervalMs"

    iget-wide v1, p0, Lcom/evernote/android/job/m$b;->g:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v0, "flexMs"

    iget-wide v1, p0, Lcom/evernote/android/job/m$b;->h:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v0, "requirementsEnforced"

    iget-boolean v1, p0, Lcom/evernote/android/job/m$b;->i:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    const-string v0, "requiresCharging"

    iget-boolean v1, p0, Lcom/evernote/android/job/m$b;->j:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    const-string v0, "requiresDeviceIdle"

    iget-boolean v1, p0, Lcom/evernote/android/job/m$b;->k:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    const-string v0, "requiresBatteryNotLow"

    iget-boolean v1, p0, Lcom/evernote/android/job/m$b;->l:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    const-string v0, "requiresStorageNotLow"

    iget-boolean v1, p0, Lcom/evernote/android/job/m$b;->m:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    const-string v0, "exact"

    iget-boolean v1, p0, Lcom/evernote/android/job/m$b;->n:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    const-string v0, "networkType"

    iget-object v1, p0, Lcom/evernote/android/job/m$b;->o:Lcom/evernote/android/job/m$d;

    invoke-virtual {v1}, Lcom/evernote/android/job/m$d;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/evernote/android/job/m$b;->p:Lcom/evernote/android/job/a/a/b;

    if-eqz v0, :cond_0

    const-string v0, "extras"

    iget-object v1, p0, Lcom/evernote/android/job/m$b;->p:Lcom/evernote/android/job/a/a/b;

    invoke-virtual {v1}, Lcom/evernote/android/job/a/a/b;->a()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/evernote/android/job/m$b;->q:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "extras"

    iget-object v1, p0, Lcom/evernote/android/job/m$b;->q:Ljava/lang/String;

    goto :goto_0

    :cond_1
    :goto_1
    const-string v0, "transient"

    iget-boolean v1, p0, Lcom/evernote/android/job/m$b;->s:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method

.method static synthetic a(Lcom/evernote/android/job/m$b;Landroid/content/ContentValues;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/evernote/android/job/m$b;->a(Landroid/content/ContentValues;)V

    return-void
.end method

.method static synthetic b(Lcom/evernote/android/job/m$b;)J
    .locals 2

    iget-wide v0, p0, Lcom/evernote/android/job/m$b;->c:J

    return-wide v0
.end method

.method static synthetic c(Lcom/evernote/android/job/m$b;)J
    .locals 2

    iget-wide v0, p0, Lcom/evernote/android/job/m$b;->d:J

    return-wide v0
.end method

.method static synthetic d(Lcom/evernote/android/job/m$b;)Lcom/evernote/android/job/m$a;
    .locals 0

    iget-object p0, p0, Lcom/evernote/android/job/m$b;->f:Lcom/evernote/android/job/m$a;

    return-object p0
.end method

.method static synthetic e(Lcom/evernote/android/job/m$b;)J
    .locals 2

    iget-wide v0, p0, Lcom/evernote/android/job/m$b;->e:J

    return-wide v0
.end method

.method static synthetic f(Lcom/evernote/android/job/m$b;)J
    .locals 2

    iget-wide v0, p0, Lcom/evernote/android/job/m$b;->g:J

    return-wide v0
.end method

.method static synthetic g(Lcom/evernote/android/job/m$b;)J
    .locals 2

    iget-wide v0, p0, Lcom/evernote/android/job/m$b;->h:J

    return-wide v0
.end method

.method static synthetic h(Lcom/evernote/android/job/m$b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/evernote/android/job/m$b;->i:Z

    return p0
.end method

.method static synthetic i(Lcom/evernote/android/job/m$b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/evernote/android/job/m$b;->j:Z

    return p0
.end method

.method static synthetic j(Lcom/evernote/android/job/m$b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/evernote/android/job/m$b;->k:Z

    return p0
.end method

.method static synthetic k(Lcom/evernote/android/job/m$b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/evernote/android/job/m$b;->l:Z

    return p0
.end method

.method static synthetic l(Lcom/evernote/android/job/m$b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/evernote/android/job/m$b;->m:Z

    return p0
.end method

.method static synthetic m(Lcom/evernote/android/job/m$b;)Lcom/evernote/android/job/m$d;
    .locals 0

    iget-object p0, p0, Lcom/evernote/android/job/m$b;->o:Lcom/evernote/android/job/m$d;

    return-object p0
.end method

.method static synthetic n(Lcom/evernote/android/job/m$b;)Lcom/evernote/android/job/a/a/b;
    .locals 0

    iget-object p0, p0, Lcom/evernote/android/job/m$b;->p:Lcom/evernote/android/job/a/a/b;

    return-object p0
.end method

.method static synthetic o(Lcom/evernote/android/job/m$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/evernote/android/job/m$b;->q:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic p(Lcom/evernote/android/job/m$b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/evernote/android/job/m$b;->r:Z

    return p0
.end method

.method static synthetic q(Lcom/evernote/android/job/m$b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/evernote/android/job/m$b;->n:Z

    return p0
.end method

.method static synthetic r(Lcom/evernote/android/job/m$b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/evernote/android/job/m$b;->s:Z

    return p0
.end method

.method static synthetic s(Lcom/evernote/android/job/m$b;)Landroid/os/Bundle;
    .locals 0

    iget-object p0, p0, Lcom/evernote/android/job/m$b;->t:Landroid/os/Bundle;

    return-object p0
.end method


# virtual methods
.method public a(J)Lcom/evernote/android/job/m$b;
    .locals 8

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/evernote/android/job/m$b;->n:Z

    const-wide v1, 0x5555555555555554L    # 1.1945305291614953E103

    cmp-long v3, p1, v1

    if-lez v3, :cond_0

    invoke-static {}, Lcom/evernote/android/job/m;->G()Lcom/evernote/android/job/a/d;

    move-result-object v3

    const-string v4, "exactInMs clamped from %d days to %d days"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v7, p1, p2}, Ljava/util/concurrent/TimeUnit;->toDays(J)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    aput-object p1, v5, v6

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v1, v2}, Ljava/util/concurrent/TimeUnit;->toDays(J)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    aput-object p1, v5, v0

    invoke-virtual {v3, v4, v5}, Lcom/evernote/android/job/a/d;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    move-wide p1, v1

    :cond_0
    invoke-virtual {p0, p1, p2, p1, p2}, Lcom/evernote/android/job/m$b;->a(JJ)Lcom/evernote/android/job/m$b;

    move-result-object p1

    return-object p1
.end method

.method public a(JJ)Lcom/evernote/android/job/m$b;
    .locals 9

    const-string v0, "startInMs must be greater than 0"

    invoke-static {p1, p2, v0}, Lcom/evernote/android/job/a/f;->b(JLjava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/evernote/android/job/m$b;->c:J

    const-string v8, "endInMs"

    const-wide v6, 0x7fffffffffffffffL

    move-wide v2, p3

    move-wide v4, p1

    invoke-static/range {v2 .. v8}, Lcom/evernote/android/job/a/f;->a(JJJLjava/lang/String;)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/evernote/android/job/m$b;->d:J

    iget-wide p1, p0, Lcom/evernote/android/job/m$b;->c:J

    const-wide p3, 0x5555555555555554L    # 1.1945305291614953E103

    cmp-long v0, p1, p3

    const/4 p1, 0x1

    const/4 p2, 0x0

    const/4 v1, 0x2

    if-lez v0, :cond_0

    invoke-static {}, Lcom/evernote/android/job/m;->G()Lcom/evernote/android/job/a/d;

    move-result-object v0

    const-string v2, "startInMs reduced from %d days to %d days"

    new-array v3, v1, [Ljava/lang/Object;

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v5, p0, Lcom/evernote/android/job/m$b;->c:J

    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/TimeUnit;->toDays(J)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v3, p2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v4, p3, p4}, Ljava/util/concurrent/TimeUnit;->toDays(J)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v3, p1

    invoke-virtual {v0, v2, v3}, Lcom/evernote/android/job/a/d;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iput-wide p3, p0, Lcom/evernote/android/job/m$b;->c:J

    :cond_0
    iget-wide v2, p0, Lcom/evernote/android/job/m$b;->d:J

    cmp-long v0, v2, p3

    if-lez v0, :cond_1

    invoke-static {}, Lcom/evernote/android/job/m;->G()Lcom/evernote/android/job/a/d;

    move-result-object v0

    const-string v2, "endInMs reduced from %d days to %d days"

    new-array v1, v1, [Ljava/lang/Object;

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v4, p0, Lcom/evernote/android/job/m$b;->d:J

    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/TimeUnit;->toDays(J)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v1, p2

    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p2, p3, p4}, Ljava/util/concurrent/TimeUnit;->toDays(J)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    aput-object p2, v1, p1

    invoke-virtual {v0, v2, v1}, Lcom/evernote/android/job/a/d;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iput-wide p3, p0, Lcom/evernote/android/job/m$b;->d:J

    :cond_1
    return-object p0
.end method

.method public a(Lcom/evernote/android/job/a/a/b;)Lcom/evernote/android/job/m$b;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/evernote/android/job/m$b;->p:Lcom/evernote/android/job/a/a/b;

    iput-object p1, p0, Lcom/evernote/android/job/m$b;->q:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance v0, Lcom/evernote/android/job/a/a/b;

    invoke-direct {v0, p1}, Lcom/evernote/android/job/a/a/b;-><init>(Lcom/evernote/android/job/a/a/b;)V

    iput-object v0, p0, Lcom/evernote/android/job/m$b;->p:Lcom/evernote/android/job/a/a/b;

    return-object p0
.end method

.method public a(Z)Lcom/evernote/android/job/m$b;
    .locals 0

    iput-boolean p1, p0, Lcom/evernote/android/job/m$b;->i:Z

    return-object p0
.end method

.method public a()Lcom/evernote/android/job/m;
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/evernote/android/job/m$b;->a:Ljava/lang/String;

    invoke-static {v1}, Lcom/evernote/android/job/a/f;->a(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    iget-wide v1, v0, Lcom/evernote/android/job/m$b;->e:J

    const-string v3, "backoffMs must be > 0"

    invoke-static {v1, v2, v3}, Lcom/evernote/android/job/a/f;->b(JLjava/lang/String;)J

    iget-object v1, v0, Lcom/evernote/android/job/m$b;->f:Lcom/evernote/android/job/m$a;

    invoke-static {v1}, Lcom/evernote/android/job/a/f;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v0, Lcom/evernote/android/job/m$b;->o:Lcom/evernote/android/job/m$d;

    invoke-static {v1}, Lcom/evernote/android/job/a/f;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v1, v0, Lcom/evernote/android/job/m$b;->g:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-lez v5, :cond_1

    iget-wide v6, v0, Lcom/evernote/android/job/m$b;->g:J

    invoke-static {}, Lcom/evernote/android/job/m;->a()J

    move-result-wide v8

    const-wide v10, 0x7fffffffffffffffL

    const-string v12, "intervalMs"

    invoke-static/range {v6 .. v12}, Lcom/evernote/android/job/a/f;->a(JJJLjava/lang/String;)J

    iget-wide v13, v0, Lcom/evernote/android/job/m$b;->h:J

    invoke-static {}, Lcom/evernote/android/job/m;->b()J

    move-result-wide v15

    iget-wide v5, v0, Lcom/evernote/android/job/m$b;->g:J

    const-string v19, "flexMs"

    move-wide/from16 v17, v5

    invoke-static/range {v13 .. v19}, Lcom/evernote/android/job/a/f;->a(JJJLjava/lang/String;)J

    iget-wide v5, v0, Lcom/evernote/android/job/m$b;->g:J

    sget-wide v7, Lcom/evernote/android/job/m;->d:J

    cmp-long v9, v5, v7

    if-ltz v9, :cond_0

    iget-wide v5, v0, Lcom/evernote/android/job/m$b;->h:J

    sget-wide v7, Lcom/evernote/android/job/m;->e:J

    cmp-long v9, v5, v7

    if-gez v9, :cond_1

    :cond_0
    invoke-static {}, Lcom/evernote/android/job/m;->G()Lcom/evernote/android/job/a/d;

    move-result-object v5

    const-string v6, "AllowSmallerIntervals enabled, this will crash on Android N and later, interval %d (minimum is %d), flex %d (minimum is %d)"

    const/4 v7, 0x4

    new-array v7, v7, [Ljava/lang/Object;

    iget-wide v8, v0, Lcom/evernote/android/job/m$b;->g:J

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    aput-object v8, v7, v2

    sget-wide v8, Lcom/evernote/android/job/m;->d:J

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    aput-object v8, v7, v1

    const/4 v8, 0x2

    iget-wide v9, v0, Lcom/evernote/android/job/m$b;->h:J

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    aput-object v9, v7, v8

    const/4 v8, 0x3

    sget-wide v9, Lcom/evernote/android/job/m;->e:J

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    aput-object v9, v7, v8

    invoke-virtual {v5, v6, v7}, Lcom/evernote/android/job/a/d;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    iget-boolean v5, v0, Lcom/evernote/android/job/m$b;->n:Z

    if-eqz v5, :cond_2

    iget-wide v5, v0, Lcom/evernote/android/job/m$b;->g:J

    cmp-long v7, v5, v3

    if-lez v7, :cond_2

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Can\'t call setExact() on a periodic job."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-boolean v5, v0, Lcom/evernote/android/job/m$b;->n:Z

    if-eqz v5, :cond_3

    iget-wide v5, v0, Lcom/evernote/android/job/m$b;->c:J

    iget-wide v7, v0, Lcom/evernote/android/job/m$b;->d:J

    cmp-long v9, v5, v7

    if-eqz v9, :cond_3

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Can\'t call setExecutionWindow() for an exact job."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    iget-boolean v5, v0, Lcom/evernote/android/job/m$b;->n:Z

    if-eqz v5, :cond_5

    iget-boolean v5, v0, Lcom/evernote/android/job/m$b;->i:Z

    if-nez v5, :cond_4

    iget-boolean v5, v0, Lcom/evernote/android/job/m$b;->k:Z

    if-nez v5, :cond_4

    iget-boolean v5, v0, Lcom/evernote/android/job/m$b;->j:Z

    if-nez v5, :cond_4

    sget-object v5, Lcom/evernote/android/job/m;->b:Lcom/evernote/android/job/m$d;

    iget-object v6, v0, Lcom/evernote/android/job/m$b;->o:Lcom/evernote/android/job/m$d;

    invoke-virtual {v5, v6}, Lcom/evernote/android/job/m$d;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    iget-boolean v5, v0, Lcom/evernote/android/job/m$b;->l:Z

    if-nez v5, :cond_4

    iget-boolean v5, v0, Lcom/evernote/android/job/m$b;->m:Z

    if-eqz v5, :cond_5

    :cond_4
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Can\'t require any condition for an exact job."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    iget-wide v5, v0, Lcom/evernote/android/job/m$b;->g:J

    cmp-long v7, v5, v3

    const-wide/16 v5, -0x1

    if-gtz v7, :cond_7

    iget-wide v7, v0, Lcom/evernote/android/job/m$b;->c:J

    cmp-long v9, v7, v5

    if-eqz v9, :cond_6

    iget-wide v7, v0, Lcom/evernote/android/job/m$b;->d:J

    cmp-long v9, v7, v5

    if-nez v9, :cond_7

    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "You\'re trying to build a job with no constraints, this is not allowed."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    iget-wide v7, v0, Lcom/evernote/android/job/m$b;->g:J

    cmp-long v9, v7, v3

    if-lez v9, :cond_9

    iget-wide v7, v0, Lcom/evernote/android/job/m$b;->c:J

    cmp-long v9, v7, v5

    if-nez v9, :cond_8

    iget-wide v7, v0, Lcom/evernote/android/job/m$b;->d:J

    cmp-long v9, v7, v5

    if-eqz v9, :cond_9

    :cond_8
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Can\'t call setExecutionWindow() on a periodic job."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_9
    iget-wide v5, v0, Lcom/evernote/android/job/m$b;->g:J

    cmp-long v7, v5, v3

    if-lez v7, :cond_b

    iget-wide v5, v0, Lcom/evernote/android/job/m$b;->e:J

    const-wide/16 v7, 0x7530

    cmp-long v9, v5, v7

    if-nez v9, :cond_a

    sget-object v5, Lcom/evernote/android/job/m;->a:Lcom/evernote/android/job/m$a;

    iget-object v6, v0, Lcom/evernote/android/job/m$b;->f:Lcom/evernote/android/job/m$a;

    invoke-virtual {v5, v6}, Lcom/evernote/android/job/m$a;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_b

    :cond_a
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "A periodic job will not respect any back-off policy, so calling setBackoffCriteria() with setPeriodic() is an error."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_b
    iget-wide v5, v0, Lcom/evernote/android/job/m$b;->g:J

    cmp-long v7, v5, v3

    if-gtz v7, :cond_d

    iget-wide v5, v0, Lcom/evernote/android/job/m$b;->c:J

    const-wide v7, 0x2aaaaaaaaaaaaaaaL

    cmp-long v9, v5, v7

    if-gtz v9, :cond_c

    iget-wide v5, v0, Lcom/evernote/android/job/m$b;->d:J

    cmp-long v9, v5, v7

    if-lez v9, :cond_d

    :cond_c
    invoke-static {}, Lcom/evernote/android/job/m;->G()Lcom/evernote/android/job/a/d;

    move-result-object v5

    const-string v6, "Attention: your execution window is too large. This could result in undesired behavior, see https://github.com/evernote/android-job/wiki/FAQ"

    invoke-virtual {v5, v6}, Lcom/evernote/android/job/a/d;->c(Ljava/lang/String;)V

    :cond_d
    iget-wide v5, v0, Lcom/evernote/android/job/m$b;->g:J

    cmp-long v7, v5, v3

    if-gtz v7, :cond_e

    iget-wide v3, v0, Lcom/evernote/android/job/m$b;->c:J

    sget-object v5, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v6, 0x16d

    invoke-virtual {v5, v6, v7}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-lez v7, :cond_e

    invoke-static {}, Lcom/evernote/android/job/m;->G()Lcom/evernote/android/job/a/d;

    move-result-object v3

    const-string v4, "Warning: job with tag %s scheduled over a year in the future"

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v5, v0, Lcom/evernote/android/job/m$b;->a:Ljava/lang/String;

    aput-object v5, v1, v2

    invoke-virtual {v3, v4, v1}, Lcom/evernote/android/job/a/d;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_e
    iget v1, v0, Lcom/evernote/android/job/m$b;->b:I

    const/16 v2, -0x223d

    if-eq v1, v2, :cond_f

    iget v1, v0, Lcom/evernote/android/job/m$b;->b:I

    const-string v3, "id can\'t be negative"

    invoke-static {v1, v3}, Lcom/evernote/android/job/a/f;->a(ILjava/lang/String;)I

    :cond_f
    new-instance v1, Lcom/evernote/android/job/m$b;

    invoke-direct {v1, v0}, Lcom/evernote/android/job/m$b;-><init>(Lcom/evernote/android/job/m$b;)V

    iget v3, v0, Lcom/evernote/android/job/m$b;->b:I

    if-ne v3, v2, :cond_10

    invoke-static {}, Lcom/evernote/android/job/i;->a()Lcom/evernote/android/job/i;

    move-result-object v2

    invoke-virtual {v2}, Lcom/evernote/android/job/i;->e()Lcom/evernote/android/job/n;

    move-result-object v2

    invoke-virtual {v2}, Lcom/evernote/android/job/n;->a()I

    move-result v2

    iput v2, v1, Lcom/evernote/android/job/m$b;->b:I

    iget v2, v1, Lcom/evernote/android/job/m$b;->b:I

    const-string v3, "id can\'t be negative"

    invoke-static {v2, v3}, Lcom/evernote/android/job/a/f;->a(ILjava/lang/String;)I

    :cond_10
    new-instance v2, Lcom/evernote/android/job/m;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Lcom/evernote/android/job/m;-><init>(Lcom/evernote/android/job/m$b;Lcom/evernote/android/job/m$1;)V

    return-object v2
.end method

.method public b(Z)Lcom/evernote/android/job/m$b;
    .locals 0

    iput-boolean p1, p0, Lcom/evernote/android/job/m$b;->r:Z

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    return v1

    :cond_1
    check-cast p1, Lcom/evernote/android/job/m$b;

    iget v2, p0, Lcom/evernote/android/job/m$b;->b:I

    iget p1, p1, Lcom/evernote/android/job/m$b;->b:I

    if-ne v2, p1, :cond_2

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0

    :cond_3
    return v1
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lcom/evernote/android/job/m$b;->b:I

    return v0
.end method
