.class public final enum Lcom/evernote/android/job/c$b;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/evernote/android/job/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/evernote/android/job/c$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/evernote/android/job/c$b;

.field public static final enum b:Lcom/evernote/android/job/c$b;

.field public static final enum c:Lcom/evernote/android/job/c$b;

.field private static final synthetic d:[Lcom/evernote/android/job/c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/evernote/android/job/c$b;

    const-string v1, "SUCCESS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/evernote/android/job/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/evernote/android/job/c$b;->a:Lcom/evernote/android/job/c$b;

    new-instance v0, Lcom/evernote/android/job/c$b;

    const-string v1, "FAILURE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/evernote/android/job/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/evernote/android/job/c$b;->b:Lcom/evernote/android/job/c$b;

    new-instance v0, Lcom/evernote/android/job/c$b;

    const-string v1, "RESCHEDULE"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/evernote/android/job/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/evernote/android/job/c$b;->c:Lcom/evernote/android/job/c$b;

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/evernote/android/job/c$b;

    sget-object v1, Lcom/evernote/android/job/c$b;->a:Lcom/evernote/android/job/c$b;

    aput-object v1, v0, v2

    sget-object v1, Lcom/evernote/android/job/c$b;->b:Lcom/evernote/android/job/c$b;

    aput-object v1, v0, v3

    sget-object v1, Lcom/evernote/android/job/c$b;->c:Lcom/evernote/android/job/c$b;

    aput-object v1, v0, v4

    sput-object v0, Lcom/evernote/android/job/c$b;->d:[Lcom/evernote/android/job/c$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/evernote/android/job/c$b;
    .locals 1

    const-class v0, Lcom/evernote/android/job/c$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/evernote/android/job/c$b;

    return-object p0
.end method

.method public static values()[Lcom/evernote/android/job/c$b;
    .locals 1

    sget-object v0, Lcom/evernote/android/job/c$b;->d:[Lcom/evernote/android/job/c$b;

    invoke-virtual {v0}, [Lcom/evernote/android/job/c$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/evernote/android/job/c$b;

    return-object v0
.end method
