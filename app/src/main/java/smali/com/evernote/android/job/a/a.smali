.class public final Lcom/evernote/android/job/a/a;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lcom/evernote/android/job/a/a;


# instance fields
.field private final b:Z

.field private final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/evernote/android/job/a/a;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2}, Lcom/evernote/android/job/a/a;-><init>(ZF)V

    sput-object v0, Lcom/evernote/android/job/a/a;->a:Lcom/evernote/android/job/a/a;

    return-void
.end method

.method constructor <init>(ZF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/evernote/android/job/a/a;->b:Z

    iput p2, p0, Lcom/evernote/android/job/a/a;->c:F

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lcom/evernote/android/job/a/a;->b:Z

    return v0
.end method

.method public b()Z
    .locals 2

    iget v0, p0, Lcom/evernote/android/job/a/a;->c:F

    const v1, 0x3e19999a    # 0.15f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    iget-boolean v0, p0, Lcom/evernote/android/job/a/a;->b:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
