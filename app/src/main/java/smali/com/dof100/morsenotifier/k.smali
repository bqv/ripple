.class Lcom/dof100/morsenotifier/k;
.super Ljava/lang/Object;


# instance fields
.field a:I

.field b:I

.field private c:Lcom/dof100/morsenotifier/d;


# direct methods
.method constructor <init>(II)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/dof100/morsenotifier/k;->a:I

    iput p2, p0, Lcom/dof100/morsenotifier/k;->b:I

    iget p1, p0, Lcom/dof100/morsenotifier/k;->a:I

    const/high16 p2, 0x3e800000    # 0.25f

    const/high16 v0, -0x41800000    # -0.25f

    const/4 v1, 0x0

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lcom/dof100/morsenotifier/k;->c:Lcom/dof100/morsenotifier/d;

    return-void

    :pswitch_0
    new-instance p1, Lcom/dof100/morsenotifier/d;

    const/high16 v2, 0x3fc00000    # 1.5f

    invoke-direct {p1, v1, v0, v2, p2}, Lcom/dof100/morsenotifier/d;-><init>(FFFF)V

    goto :goto_0

    :pswitch_1
    new-instance p1, Lcom/dof100/morsenotifier/d;

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-direct {p1, v1, v0, v2, p2}, Lcom/dof100/morsenotifier/d;-><init>(FFFF)V

    goto :goto_0

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method a(Ljavax/microedition/khronos/opengles/GL10;)V
    .locals 1

    iget-object v0, p0, Lcom/dof100/morsenotifier/k;->c:Lcom/dof100/morsenotifier/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/dof100/morsenotifier/k;->c:Lcom/dof100/morsenotifier/d;

    invoke-virtual {v0, p1}, Lcom/dof100/morsenotifier/d;->a(Ljavax/microedition/khronos/opengles/GL10;)V

    :cond_0
    return-void
.end method
