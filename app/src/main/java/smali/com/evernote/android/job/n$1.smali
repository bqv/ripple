.class Lcom/evernote/android/job/n$1;
.super Ljava/lang/Thread;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/evernote/android/job/n;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/evernote/android/job/n;


# direct methods
.method constructor <init>(Lcom/evernote/android/job/n;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/evernote/android/job/n$1;->a:Lcom/evernote/android/job/n;

    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    iget-object v0, p0, Lcom/evernote/android/job/n$1;->a:Lcom/evernote/android/job/n;

    invoke-static {v0}, Lcom/evernote/android/job/n;->a(Lcom/evernote/android/job/n;)Ljava/util/Set;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/HashSet;

    iget-object v2, p0, Lcom/evernote/android/job/n$1;->a:Lcom/evernote/android/job/n;

    invoke-static {v2}, Lcom/evernote/android/job/n;->a(Lcom/evernote/android/job/n;)Ljava/util/Set;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    :try_start_1
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    iget-object v4, p0, Lcom/evernote/android/job/n$1;->a:Lcom/evernote/android/job/n;

    const/4 v5, 0x0

    invoke-static {v4, v5, v2}, Lcom/evernote/android/job/n;->a(Lcom/evernote/android/job/n;Lcom/evernote/android/job/m;I)Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    invoke-static {}, Lcom/evernote/android/job/n;->d()Lcom/evernote/android/job/a/d;

    move-result-object v4

    const-string v6, "Deleted job %d which failed to delete earlier"

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v5, v3

    invoke-virtual {v4, v6, v5}, Lcom/evernote/android/job/a/d;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/evernote/android/job/n;->d()Lcom/evernote/android/job/a/d;

    move-result-object v4

    const-string v6, "Couldn\'t delete job %d which failed to delete earlier"

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v5, v3

    invoke-virtual {v4, v6, v5}, Lcom/evernote/android/job/a/d;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/evernote/android/job/n$1;->a:Lcom/evernote/android/job/n;

    invoke-static {v0}, Lcom/evernote/android/job/n;->a(Lcom/evernote/android/job/n;)Ljava/util/Set;

    move-result-object v2

    monitor-enter v2

    :try_start_2
    iget-object v0, p0, Lcom/evernote/android/job/n$1;->a:Lcom/evernote/android/job/n;

    invoke-static {v0}, Lcom/evernote/android/job/n;->a(Lcom/evernote/android/job/n;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v0

    const/16 v4, 0x32

    if-le v0, v4, :cond_3

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    add-int/lit8 v5, v3, 0x1

    if-le v3, v4, :cond_2

    goto :goto_2

    :cond_2
    iget-object v3, p0, Lcom/evernote/android/job/n$1;->a:Lcom/evernote/android/job/n;

    invoke-static {v3}, Lcom/evernote/android/job/n;->a(Lcom/evernote/android/job/n;)Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move v3, v5

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/evernote/android/job/n$1;->a:Lcom/evernote/android/job/n;

    invoke-static {v0}, Lcom/evernote/android/job/n;->a(Lcom/evernote/android/job/n;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_4
    :goto_2
    monitor-exit v2

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catchall_1
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1
.end method
