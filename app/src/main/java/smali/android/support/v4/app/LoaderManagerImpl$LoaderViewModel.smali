.class Landroid/support/v4/app/LoaderManagerImpl$LoaderViewModel;
.super Landroid/arch/lifecycle/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/LoaderManagerImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "LoaderViewModel"
.end annotation


# static fields
.field private static final a:Landroid/arch/lifecycle/j$a;


# instance fields
.field private b:Landroid/support/v4/d/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/d/f<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/support/v4/app/LoaderManagerImpl$LoaderViewModel$1;

    invoke-direct {v0}, Landroid/support/v4/app/LoaderManagerImpl$LoaderViewModel$1;-><init>()V

    sput-object v0, Landroid/support/v4/app/LoaderManagerImpl$LoaderViewModel;->a:Landroid/arch/lifecycle/j$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/arch/lifecycle/i;-><init>()V

    new-instance v0, Landroid/support/v4/d/f;

    invoke-direct {v0}, Landroid/support/v4/d/f;-><init>()V

    iput-object v0, p0, Landroid/support/v4/app/LoaderManagerImpl$LoaderViewModel;->b:Landroid/support/v4/d/f;

    return-void
.end method
