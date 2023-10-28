.class Lcom/dof100/morsenotifier/d;
.super Ljava/lang/Object;


# instance fields
.field private final a:[S

.field private final b:[F

.field private c:Ljava/nio/FloatBuffer;

.field private d:Ljava/nio/ShortBuffer;


# direct methods
.method constructor <init>(FFFF)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x6

    new-array v1, v0, [S

    fill-array-data v1, :array_0

    iput-object v1, p0, Lcom/dof100/morsenotifier/d;->a:[S

    const/16 v1, 0xc

    new-array v1, v1, [F

    iput-object v1, p0, Lcom/dof100/morsenotifier/d;->b:[F

    iget-object v1, p0, Lcom/dof100/morsenotifier/d;->b:[F

    const/4 v2, 0x0

    aput p1, v1, v2

    iget-object v1, p0, Lcom/dof100/morsenotifier/d;->b:[F

    const/4 v2, 0x1

    aput p4, v1, v2

    iget-object v1, p0, Lcom/dof100/morsenotifier/d;->b:[F

    const/4 v2, 0x0

    const/4 v3, 0x2

    aput v2, v1, v3

    iget-object v1, p0, Lcom/dof100/morsenotifier/d;->b:[F

    const/4 v3, 0x3

    aput p1, v1, v3

    iget-object p1, p0, Lcom/dof100/morsenotifier/d;->b:[F

    const/4 v1, 0x4

    aput p2, p1, v1

    iget-object p1, p0, Lcom/dof100/morsenotifier/d;->b:[F

    const/4 v1, 0x5

    aput v2, p1, v1

    iget-object p1, p0, Lcom/dof100/morsenotifier/d;->b:[F

    aput p3, p1, v0

    iget-object p1, p0, Lcom/dof100/morsenotifier/d;->b:[F

    const/4 v0, 0x7

    aput p2, p1, v0

    iget-object p1, p0, Lcom/dof100/morsenotifier/d;->b:[F

    const/16 p2, 0x8

    aput v2, p1, p2

    iget-object p1, p0, Lcom/dof100/morsenotifier/d;->b:[F

    const/16 p2, 0x9

    aput p3, p1, p2

    iget-object p1, p0, Lcom/dof100/morsenotifier/d;->b:[F

    const/16 p2, 0xa

    aput p4, p1, p2

    iget-object p1, p0, Lcom/dof100/morsenotifier/d;->b:[F

    const/16 p2, 0xb

    aput v2, p1, p2

    invoke-direct {p0}, Lcom/dof100/morsenotifier/d;->a()V

    return-void

    nop

    :array_0
    .array-data 2
        0x0s
        0x1s
        0x2s
        0x0s
        0x2s
        0x3s
    .end array-data
.end method

.method private a()V
    .locals 3

    iget-object v0, p0, Lcom/dof100/morsenotifier/d;->b:[F

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/dof100/morsenotifier/d;->c:Ljava/nio/FloatBuffer;

    iget-object v0, p0, Lcom/dof100/morsenotifier/d;->c:Ljava/nio/FloatBuffer;

    iget-object v1, p0, Lcom/dof100/morsenotifier/d;->b:[F

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    iget-object v0, p0, Lcom/dof100/morsenotifier/d;->c:Ljava/nio/FloatBuffer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v0, p0, Lcom/dof100/morsenotifier/d;->a:[S

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/dof100/morsenotifier/d;->d:Ljava/nio/ShortBuffer;

    iget-object v0, p0, Lcom/dof100/morsenotifier/d;->d:Ljava/nio/ShortBuffer;

    iget-object v2, p0, Lcom/dof100/morsenotifier/d;->a:[S

    invoke-virtual {v0, v2}, Ljava/nio/ShortBuffer;->put([S)Ljava/nio/ShortBuffer;

    iget-object v0, p0, Lcom/dof100/morsenotifier/d;->d:Ljava/nio/ShortBuffer;

    invoke-virtual {v0, v1}, Ljava/nio/ShortBuffer;->position(I)Ljava/nio/Buffer;

    return-void
.end method


# virtual methods
.method a(Ljavax/microedition/khronos/opengles/GL10;)V
    .locals 6

    const/16 v0, 0x901

    invoke-interface {p1, v0}, Ljavax/microedition/khronos/opengles/GL10;->glFrontFace(I)V

    const/16 v0, 0xb44

    invoke-interface {p1, v0}, Ljavax/microedition/khronos/opengles/GL10;->glEnable(I)V

    const/16 v1, 0x405

    invoke-interface {p1, v1}, Ljavax/microedition/khronos/opengles/GL10;->glCullFace(I)V

    const v1, 0x8074

    invoke-interface {p1, v1}, Ljavax/microedition/khronos/opengles/GL10;->glEnableClientState(I)V

    iget-object v2, p0, Lcom/dof100/morsenotifier/d;->c:Ljava/nio/FloatBuffer;

    const/4 v3, 0x3

    const/16 v4, 0x1406

    const/4 v5, 0x0

    invoke-interface {p1, v3, v4, v5, v2}, Ljavax/microedition/khronos/opengles/GL10;->glVertexPointer(IIILjava/nio/Buffer;)V

    iget-object v2, p0, Lcom/dof100/morsenotifier/d;->a:[S

    array-length v2, v2

    iget-object v3, p0, Lcom/dof100/morsenotifier/d;->d:Ljava/nio/ShortBuffer;

    const/4 v4, 0x4

    const/16 v5, 0x1403

    invoke-interface {p1, v4, v2, v5, v3}, Ljavax/microedition/khronos/opengles/GL10;->glDrawElements(IIILjava/nio/Buffer;)V

    invoke-interface {p1, v1}, Ljavax/microedition/khronos/opengles/GL10;->glDisableClientState(I)V

    invoke-interface {p1, v0}, Ljavax/microedition/khronos/opengles/GL10;->glDisable(I)V

    return-void
.end method
