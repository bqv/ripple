.class Lcom/dof100/morsenotifier/t;
.super Ljava/lang/Object;


# instance fields
.field a:F

.field private b:Ljavax/microedition/khronos/opengles/GL10;

.field private final c:[Ljava/lang/String;

.field private d:I

.field private final e:[I

.field private f:Ljava/nio/FloatBuffer;

.field private g:Ljava/nio/FloatBuffer;


# direct methods
.method constructor <init>(Ljavax/microedition/khronos/opengles/GL10;IF)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/dof100/morsenotifier/t;->e:[I

    iput-object p1, p0, Lcom/dof100/morsenotifier/t;->b:Ljavax/microedition/khronos/opengles/GL10;

    iput p2, p0, Lcom/dof100/morsenotifier/t;->d:I

    iput p3, p0, Lcom/dof100/morsenotifier/t;->a:F

    const/16 p1, 0x7f

    new-array p1, p1, [Ljava/lang/String;

    iput-object p1, p0, Lcom/dof100/morsenotifier/t;->c:[Ljava/lang/String;

    const/4 p1, 0x0

    :goto_0
    const/16 p2, 0x1f

    if-gt p1, p2, :cond_0

    iget-object p2, p0, Lcom/dof100/morsenotifier/t;->c:[Ljava/lang/String;

    const-string p3, " "

    aput-object p3, p2, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    const/16 p1, 0x20

    :goto_1
    const/16 p2, 0x7e

    if-gt p1, p2, :cond_1

    iget-object p2, p0, Lcom/dof100/morsenotifier/t;->c:[Ljava/lang/String;

    int-to-char p3, p1

    invoke-static {p3}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    move-result-object p3

    aput-object p3, p2, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Lcom/dof100/morsenotifier/t;->a()V

    return-void
.end method

.method private a()V
    .locals 18

    move-object/from16 v0, p0

    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iget v2, v0, Lcom/dof100/morsenotifier/t;->d:I

    int-to-float v2, v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const/16 v3, 0xff

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4, v3, v4}, Landroid/graphics/Paint;->setARGB(IIII)V

    iget v5, v0, Lcom/dof100/morsenotifier/t;->d:I

    int-to-float v5, v5

    invoke-virtual {v1, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    sget-object v5, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v1, v5}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    sget-object v5, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget v5, v0, Lcom/dof100/morsenotifier/t;->d:I

    iget-object v6, v0, Lcom/dof100/morsenotifier/t;->c:[Ljava/lang/String;

    array-length v7, v6

    move v8, v5

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v7, :cond_1

    aget-object v9, v6, v5

    invoke-virtual {v1, v9}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v9

    int-to-float v10, v8

    cmpl-float v10, v9, v10

    if-lez v10, :cond_0

    float-to-double v8, v9

    const-wide v10, 0x3fefae147ae147aeL    # 0.99

    add-double/2addr v8, v10

    double-to-int v8, v8

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, 0x1

    :goto_1
    iget-object v6, v0, Lcom/dof100/morsenotifier/t;->c:[Ljava/lang/String;

    array-length v6, v6

    mul-int v7, v5, v5

    if-le v6, v7, :cond_2

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    const/4 v6, 0x1

    :goto_2
    mul-int v7, v8, v5

    if-ge v6, v7, :cond_3

    mul-int/lit8 v6, v6, 0x2

    goto :goto_2

    :cond_3
    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v6, v6, v7}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v7

    new-instance v9, Landroid/graphics/Canvas;

    invoke-direct {v9, v7}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {v7, v4}, Landroid/graphics/Bitmap;->eraseColor(I)V

    const/4 v10, 0x0

    :goto_3
    iget-object v11, v0, Lcom/dof100/morsenotifier/t;->c:[Ljava/lang/String;

    array-length v11, v11

    const/high16 v12, 0x40000000    # 2.0f

    if-ge v10, v11, :cond_4

    iget-object v11, v0, Lcom/dof100/morsenotifier/t;->c:[Ljava/lang/String;

    aget-object v11, v11, v10

    rem-int v13, v10, v5

    div-int v14, v10, v5

    mul-int v13, v13, v8

    div-int/lit8 v15, v8, 0x2

    add-int/2addr v13, v15

    int-to-float v13, v13

    mul-int v14, v14, v8

    add-int/2addr v14, v15

    int-to-float v14, v14

    invoke-virtual {v1}, Landroid/graphics/Paint;->descent()F

    move-result v15

    invoke-virtual {v1}, Landroid/graphics/Paint;->ascent()F

    move-result v16

    add-float v15, v15, v16

    div-float/2addr v15, v12

    sub-float/2addr v14, v15

    invoke-virtual {v1, v3, v3, v3, v3}, Landroid/graphics/Paint;->setARGB(IIII)V

    invoke-virtual {v9, v11, v13, v14, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    :cond_4
    const/16 v1, 0xc

    new-array v1, v1, [F

    iget v3, v0, Lcom/dof100/morsenotifier/t;->a:F

    neg-float v3, v3

    div-float/2addr v3, v12

    aput v3, v1, v4

    iget v3, v0, Lcom/dof100/morsenotifier/t;->a:F

    neg-float v3, v3

    div-float/2addr v3, v12

    aput v3, v1, v2

    const/4 v3, 0x0

    const/4 v9, 0x2

    aput v3, v1, v9

    iget v9, v0, Lcom/dof100/morsenotifier/t;->a:F

    div-float/2addr v9, v12

    const/4 v10, 0x3

    aput v9, v1, v10

    iget v9, v0, Lcom/dof100/morsenotifier/t;->a:F

    neg-float v9, v9

    div-float/2addr v9, v12

    const/4 v10, 0x4

    aput v9, v1, v10

    const/4 v9, 0x5

    aput v3, v1, v9

    iget v9, v0, Lcom/dof100/morsenotifier/t;->a:F

    neg-float v9, v9

    div-float/2addr v9, v12

    const/4 v11, 0x6

    aput v9, v1, v11

    iget v9, v0, Lcom/dof100/morsenotifier/t;->a:F

    div-float/2addr v9, v12

    const/4 v11, 0x7

    aput v9, v1, v11

    const/16 v9, 0x8

    aput v3, v1, v9

    const/16 v13, 0x9

    iget v14, v0, Lcom/dof100/morsenotifier/t;->a:F

    div-float/2addr v14, v12

    aput v14, v1, v13

    const/16 v13, 0xa

    iget v14, v0, Lcom/dof100/morsenotifier/t;->a:F

    div-float/2addr v14, v12

    aput v14, v1, v13

    const/16 v12, 0xb

    aput v3, v1, v12

    const/16 v3, 0x30

    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v12

    invoke-virtual {v3, v12}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v3

    iput-object v3, v0, Lcom/dof100/morsenotifier/t;->f:Ljava/nio/FloatBuffer;

    iget-object v3, v0, Lcom/dof100/morsenotifier/t;->f:Ljava/nio/FloatBuffer;

    invoke-virtual {v3, v1}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    iget-object v1, v0, Lcom/dof100/morsenotifier/t;->f:Ljava/nio/FloatBuffer;

    invoke-virtual {v1, v4}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v1, v0, Lcom/dof100/morsenotifier/t;->c:[Ljava/lang/String;

    array-length v1, v1

    mul-int/lit8 v1, v1, 0x8

    new-array v1, v1, [F

    const/4 v3, 0x0

    :goto_4
    iget-object v9, v0, Lcom/dof100/morsenotifier/t;->c:[Ljava/lang/String;

    array-length v9, v9

    if-ge v3, v9, :cond_5

    rem-int v9, v3, v5

    div-int v12, v3, v5

    mul-int v9, v9, v8

    int-to-float v13, v9

    add-int/2addr v9, v8

    sub-int/2addr v9, v2

    int-to-float v9, v9

    mul-int v12, v12, v8

    add-int/lit8 v14, v12, 0x2

    int-to-float v14, v14

    add-int/2addr v12, v8

    add-int/2addr v12, v2

    int-to-float v12, v12

    mul-int/lit8 v15, v3, 0x8

    int-to-float v2, v6

    div-float/2addr v13, v2

    aput v13, v1, v15

    add-int/lit8 v16, v15, 0x1

    div-float/2addr v12, v2

    aput v12, v1, v16

    add-int/lit8 v16, v15, 0x2

    div-float/2addr v9, v2

    aput v9, v1, v16

    add-int/lit8 v16, v15, 0x3

    aput v12, v1, v16

    add-int/lit8 v12, v15, 0x4

    aput v13, v1, v12

    add-int/lit8 v12, v15, 0x5

    div-float/2addr v14, v2

    aput v14, v1, v12

    add-int/lit8 v2, v15, 0x6

    aput v9, v1, v2

    add-int/2addr v15, v11

    aput v14, v1, v15

    add-int/lit8 v3, v3, 0x1

    const/4 v2, 0x1

    goto :goto_4

    :cond_5
    array-length v2, v1

    mul-int/lit8 v2, v2, 0x4

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v2

    iput-object v2, v0, Lcom/dof100/morsenotifier/t;->g:Ljava/nio/FloatBuffer;

    iget-object v2, v0, Lcom/dof100/morsenotifier/t;->g:Ljava/nio/FloatBuffer;

    invoke-virtual {v2, v1}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    iget-object v1, v0, Lcom/dof100/morsenotifier/t;->g:Ljava/nio/FloatBuffer;

    invoke-virtual {v1, v4}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v1, v0, Lcom/dof100/morsenotifier/t;->b:Ljavax/microedition/khronos/opengles/GL10;

    const/16 v2, 0xde1

    invoke-interface {v1, v2}, Ljavax/microedition/khronos/opengles/GL10;->glEnable(I)V

    iget-object v1, v0, Lcom/dof100/morsenotifier/t;->b:Ljavax/microedition/khronos/opengles/GL10;

    iget-object v3, v0, Lcom/dof100/morsenotifier/t;->e:[I

    const/4 v5, 0x1

    invoke-interface {v1, v5, v3, v4}, Ljavax/microedition/khronos/opengles/GL10;->glGenTextures(I[II)V

    iget-object v1, v0, Lcom/dof100/morsenotifier/t;->b:Ljavax/microedition/khronos/opengles/GL10;

    iget-object v3, v0, Lcom/dof100/morsenotifier/t;->e:[I

    aget v3, v3, v4

    invoke-interface {v1, v2, v3}, Ljavax/microedition/khronos/opengles/GL10;->glBindTexture(II)V

    iget-object v1, v0, Lcom/dof100/morsenotifier/t;->b:Ljavax/microedition/khronos/opengles/GL10;

    const/16 v3, 0x2801

    const/high16 v5, 0x46180000    # 9728.0f

    invoke-interface {v1, v2, v3, v5}, Ljavax/microedition/khronos/opengles/GL10;->glTexParameterf(IIF)V

    iget-object v1, v0, Lcom/dof100/morsenotifier/t;->b:Ljavax/microedition/khronos/opengles/GL10;

    const/16 v3, 0x2800

    const v5, 0x46180400    # 9729.0f

    invoke-interface {v1, v2, v3, v5}, Ljavax/microedition/khronos/opengles/GL10;->glTexParameterf(IIF)V

    iget-object v1, v0, Lcom/dof100/morsenotifier/t;->b:Ljavax/microedition/khronos/opengles/GL10;

    const/16 v3, 0x2802

    const v5, 0x47012f00    # 33071.0f

    invoke-interface {v1, v2, v3, v5}, Ljavax/microedition/khronos/opengles/GL10;->glTexParameterf(IIF)V

    iget-object v1, v0, Lcom/dof100/morsenotifier/t;->b:Ljavax/microedition/khronos/opengles/GL10;

    const/16 v3, 0x2803

    invoke-interface {v1, v2, v3, v5}, Ljavax/microedition/khronos/opengles/GL10;->glTexParameterf(IIF)V

    const/16 v1, 0x1908

    invoke-static {v2, v4, v1, v7, v4}, Landroid/opengl/GLUtils;->texImage2D(IIILandroid/graphics/Bitmap;I)V

    iget-object v1, v0, Lcom/dof100/morsenotifier/t;->b:Ljavax/microedition/khronos/opengles/GL10;

    invoke-interface {v1, v2}, Ljavax/microedition/khronos/opengles/GL10;->glDisable(I)V

    return-void
.end method


# virtual methods
.method a(Ljavax/microedition/khronos/opengles/GL10;Ljava/lang/String;FFFFFF)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p6

    move/from16 v3, p7

    move/from16 v4, p8

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v5

    iget v6, v0, Lcom/dof100/morsenotifier/t;->a:F

    const/high16 v7, 0x40000000    # 2.0f

    mul-float v6, v6, v7

    const/high16 v8, 0x40400000    # 3.0f

    div-float/2addr v6, v8

    div-float v7, v6, v7

    add-float v7, p3, v7

    const/16 v8, 0x901

    invoke-interface {v1, v8}, Ljavax/microedition/khronos/opengles/GL10;->glFrontFace(I)V

    invoke-interface/range {p1 .. p1}, Ljavax/microedition/khronos/opengles/GL10;->glPushMatrix()V

    move/from16 v8, p4

    move/from16 v9, p5

    invoke-interface {v1, v7, v8, v9}, Ljavax/microedition/khronos/opengles/GL10;->glTranslatef(FFF)V

    const/16 v7, 0xde1

    invoke-interface {v1, v7}, Ljavax/microedition/khronos/opengles/GL10;->glEnable(I)V

    const/4 v8, 0x1

    const/16 v9, 0x303

    invoke-interface {v1, v8, v9}, Ljavax/microedition/khronos/opengles/GL10;->glBlendFunc(II)V

    const/16 v8, 0xbe2

    invoke-interface {v1, v8}, Ljavax/microedition/khronos/opengles/GL10;->glEnable(I)V

    const v9, 0x8074

    invoke-interface {v1, v9}, Ljavax/microedition/khronos/opengles/GL10;->glEnableClientState(I)V

    const v10, 0x8078

    invoke-interface {v1, v10}, Ljavax/microedition/khronos/opengles/GL10;->glEnableClientState(I)V

    float-to-double v11, v2

    const-wide v13, -0x407b851eb851eb85L    # -0.01

    cmpl-double v15, v11, v13

    if-lez v15, :cond_0

    float-to-double v11, v3

    cmpl-double v15, v11, v13

    if-lez v15, :cond_0

    float-to-double v11, v4

    cmpl-double v15, v11, v13

    if-lez v15, :cond_0

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-interface {v1, v2, v3, v4, v11}, Ljavax/microedition/khronos/opengles/GL10;->glColor4f(FFFF)V

    :cond_0
    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v5, :cond_3

    move-object/from16 v4, p2

    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-ltz v11, :cond_1

    iget-object v12, v0, Lcom/dof100/morsenotifier/t;->c:[Ljava/lang/String;

    array-length v12, v12

    if-lt v11, v12, :cond_2

    :cond_1
    const/16 v11, 0x3f

    :cond_2
    const/4 v12, 0x3

    iget-object v13, v0, Lcom/dof100/morsenotifier/t;->f:Ljava/nio/FloatBuffer;

    invoke-virtual {v13, v2}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v13

    const/16 v14, 0x1406

    invoke-interface {v1, v12, v14, v2, v13}, Ljavax/microedition/khronos/opengles/GL10;->glVertexPointer(IIILjava/nio/Buffer;)V

    const/4 v12, 0x2

    iget-object v13, v0, Lcom/dof100/morsenotifier/t;->g:Ljava/nio/FloatBuffer;

    mul-int/lit8 v11, v11, 0x8

    invoke-virtual {v13, v11}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    move-result-object v11

    invoke-interface {v1, v12, v14, v2, v11}, Ljavax/microedition/khronos/opengles/GL10;->glTexCoordPointer(IIILjava/nio/Buffer;)V

    iget-object v11, v0, Lcom/dof100/morsenotifier/t;->e:[I

    aget v11, v11, v2

    invoke-interface {v1, v7, v11}, Ljavax/microedition/khronos/opengles/GL10;->glBindTexture(II)V

    const/4 v11, 0x5

    const/4 v12, 0x4

    invoke-interface {v1, v11, v2, v12}, Ljavax/microedition/khronos/opengles/GL10;->glDrawArrays(III)V

    const/4 v11, 0x0

    invoke-interface {v1, v6, v11, v11}, Ljavax/microedition/khronos/opengles/GL10;->glTranslatef(FFF)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    invoke-interface {v1, v9}, Ljavax/microedition/khronos/opengles/GL10;->glDisableClientState(I)V

    invoke-interface {v1, v10}, Ljavax/microedition/khronos/opengles/GL10;->glDisableClientState(I)V

    invoke-interface {v1, v8}, Ljavax/microedition/khronos/opengles/GL10;->glDisable(I)V

    invoke-interface {v1, v7}, Ljavax/microedition/khronos/opengles/GL10;->glDisable(I)V

    invoke-interface/range {p1 .. p1}, Ljavax/microedition/khronos/opengles/GL10;->glPopMatrix()V

    return-void
.end method

.method b(Ljavax/microedition/khronos/opengles/GL10;Ljava/lang/String;FFFFFF)V
    .locals 11

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    move-object v10, p0

    iget v1, v10, Lcom/dof100/morsenotifier/t;->a:F

    const/high16 v2, 0x40000000    # 2.0f

    mul-float v1, v1, v2

    const/high16 v3, 0x40400000    # 3.0f

    div-float/2addr v1, v3

    int-to-float v0, v0

    div-float/2addr v0, v2

    mul-float v1, v1, v0

    sub-float v4, p3, v1

    move-object v1, v10

    move-object v2, p1

    move-object v3, p2

    move v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    invoke-virtual/range {v1 .. v9}, Lcom/dof100/morsenotifier/t;->a(Ljavax/microedition/khronos/opengles/GL10;Ljava/lang/String;FFFFFF)V

    return-void
.end method
