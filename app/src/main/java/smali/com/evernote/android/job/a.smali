.class public abstract Lcom/evernote/android/job/a;
.super Lcom/evernote/android/job/c;


# static fields
.field private static final a:Lcom/evernote/android/job/a/d;

.field private static final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/evernote/android/job/a/d;

    const-string v1, "DailyJob"

    invoke-direct {v0, v1}, Lcom/evernote/android/job/a/d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/evernote/android/job/a;->a:Lcom/evernote/android/job/a/d;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/evernote/android/job/a;->b:J

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/evernote/android/job/c;-><init>()V

    return-void
.end method
