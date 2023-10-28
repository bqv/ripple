.class public final enum Lcom/evernote/android/job/m$a;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/evernote/android/job/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/evernote/android/job/m$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/evernote/android/job/m$a;

.field public static final enum b:Lcom/evernote/android/job/m$a;

.field private static final synthetic c:[Lcom/evernote/android/job/m$a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/evernote/android/job/m$a;

    const-string v1, "LINEAR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/evernote/android/job/m$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/evernote/android/job/m$a;->a:Lcom/evernote/android/job/m$a;

    new-instance v0, Lcom/evernote/android/job/m$a;

    const-string v1, "EXPONENTIAL"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/evernote/android/job/m$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/evernote/android/job/m$a;->b:Lcom/evernote/android/job/m$a;

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/evernote/android/job/m$a;

    sget-object v1, Lcom/evernote/android/job/m$a;->a:Lcom/evernote/android/job/m$a;

    aput-object v1, v0, v2

    sget-object v1, Lcom/evernote/android/job/m$a;->b:Lcom/evernote/android/job/m$a;

    aput-object v1, v0, v3

    sput-object v0, Lcom/evernote/android/job/m$a;->c:[Lcom/evernote/android/job/m$a;

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

.method public static valueOf(Ljava/lang/String;)Lcom/evernote/android/job/m$a;
    .locals 1

    const-class v0, Lcom/evernote/android/job/m$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/evernote/android/job/m$a;

    return-object p0
.end method

.method public static values()[Lcom/evernote/android/job/m$a;
    .locals 1

    sget-object v0, Lcom/evernote/android/job/m$a;->c:[Lcom/evernote/android/job/m$a;

    invoke-virtual {v0}, [Lcom/evernote/android/job/m$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/evernote/android/job/m$a;

    return-object v0
.end method
