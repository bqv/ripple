.class Lcom/evernote/android/job/g;
.super Ljava/lang/Object;


# static fields
.field private static final a:Lcom/evernote/android/job/a/d;


# instance fields
.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/evernote/android/job/f;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/evernote/android/job/a/d;

    const-string v1, "JobCreatorHolder"

    invoke-direct {v0, v1}, Lcom/evernote/android/job/a/d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/evernote/android/job/g;->a:Lcom/evernote/android/job/a/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/evernote/android/job/g;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/evernote/android/job/c;
    .locals 4

    iget-object v0, p0, Lcom/evernote/android/job/g;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/evernote/android/job/f;

    const/4 v2, 0x1

    invoke-interface {v1, p1}, Lcom/evernote/android/job/f;->a(Ljava/lang/String;)Lcom/evernote/android/job/c;

    move-result-object v1

    if-eqz v1, :cond_0

    :cond_1
    if-nez v2, :cond_2

    sget-object p1, Lcom/evernote/android/job/g;->a:Lcom/evernote/android/job/a/d;

    const-string v0, "no JobCreator added"

    invoke-virtual {p1, v0}, Lcom/evernote/android/job/a/d;->c(Ljava/lang/String;)V

    :cond_2
    return-object v1
.end method

.method public a(Lcom/evernote/android/job/f;)V
    .locals 1

    iget-object v0, p0, Lcom/evernote/android/job/g;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public a()Z
    .locals 1

    iget-object v0, p0, Lcom/evernote/android/job/g;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0
.end method
