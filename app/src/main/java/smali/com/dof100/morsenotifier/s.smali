.class Lcom/dof100/morsenotifier/s;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/opengl/GLSurfaceView$Renderer;


# instance fields
.field private a:I

.field private b:Z

.field private c:Z

.field private d:Lcom/dof100/morsenotifier/t;

.field private final e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/dof100/morsenotifier/k;",
            ">;"
        }
    .end annotation
.end field

.field private f:I

.field private g:I

.field private h:I

.field private i:F

.field private j:F

.field private k:F

.field private l:F

.field private m:F

.field private n:F

.field private o:F

.field private p:F

.field private q:F

.field private r:I

.field private s:J

.field private t:F

.field private u:F

.field private v:F

.field private w:F

.field private x:F

.field private y:F

.field private z:F


# direct methods
.method constructor <init>(Ljava/util/ArrayList;IZZIIII)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;IZZIIII)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/dof100/morsenotifier/s;->d:Lcom/dof100/morsenotifier/t;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/dof100/morsenotifier/s;->e:Ljava/util/ArrayList;

    const/4 v0, -0x1

    iput v0, p0, Lcom/dof100/morsenotifier/s;->f:I

    iput v0, p0, Lcom/dof100/morsenotifier/s;->g:I

    iput v0, p0, Lcom/dof100/morsenotifier/s;->h:I

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/dof100/morsenotifier/s;->t:F

    iput v0, p0, Lcom/dof100/morsenotifier/s;->u:F

    iput v0, p0, Lcom/dof100/morsenotifier/s;->v:F

    iput v0, p0, Lcom/dof100/morsenotifier/s;->w:F

    const/4 v0, 0x0

    iput v0, p0, Lcom/dof100/morsenotifier/s;->x:F

    iput v0, p0, Lcom/dof100/morsenotifier/s;->y:F

    iput v0, p0, Lcom/dof100/morsenotifier/s;->z:F

    const-string v0, "MyMorseRenderer constructor"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iput p2, p0, Lcom/dof100/morsenotifier/s;->a:I

    iput-boolean p3, p0, Lcom/dof100/morsenotifier/s;->b:Z

    iput-boolean p4, p0, Lcom/dof100/morsenotifier/s;->c:Z

    shr-int/lit8 p2, p5, 0x10

    and-int/lit16 p2, p2, 0xff

    int-to-float p2, p2

    const/high16 p3, 0x437f0000    # 255.0f

    div-float/2addr p2, p3

    iput p2, p0, Lcom/dof100/morsenotifier/s;->i:F

    shr-int/lit8 p2, p5, 0x8

    and-int/lit16 p2, p2, 0xff

    int-to-float p2, p2

    div-float/2addr p2, p3

    iput p2, p0, Lcom/dof100/morsenotifier/s;->j:F

    and-int/lit16 p2, p5, 0xff

    int-to-float p2, p2

    div-float/2addr p2, p3

    iput p2, p0, Lcom/dof100/morsenotifier/s;->k:F

    shr-int/lit8 p2, p6, 0x10

    and-int/lit16 p2, p2, 0xff

    int-to-float p2, p2

    div-float/2addr p2, p3

    iput p2, p0, Lcom/dof100/morsenotifier/s;->l:F

    shr-int/lit8 p2, p6, 0x8

    and-int/lit16 p2, p2, 0xff

    int-to-float p2, p2

    div-float/2addr p2, p3

    iput p2, p0, Lcom/dof100/morsenotifier/s;->m:F

    and-int/lit16 p2, p6, 0xff

    int-to-float p2, p2

    div-float/2addr p2, p3

    iput p2, p0, Lcom/dof100/morsenotifier/s;->n:F

    shr-int/lit8 p2, p7, 0x10

    and-int/lit16 p2, p2, 0xff

    int-to-float p2, p2

    div-float/2addr p2, p3

    iput p2, p0, Lcom/dof100/morsenotifier/s;->o:F

    shr-int/lit8 p2, p7, 0x8

    and-int/lit16 p2, p2, 0xff

    int-to-float p2, p2

    div-float/2addr p2, p3

    iput p2, p0, Lcom/dof100/morsenotifier/s;->p:F

    and-int/lit16 p2, p7, 0xff

    int-to-float p2, p2

    div-float/2addr p2, p3

    iput p2, p0, Lcom/dof100/morsenotifier/s;->q:F

    iput p8, p0, Lcom/dof100/morsenotifier/s;->r:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    iput-wide p2, p0, Lcom/dof100/morsenotifier/s;->s:J

    iget-object p2, p0, Lcom/dof100/morsenotifier/s;->e:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->clear()V

    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p3

    if-ge p2, p3, :cond_0

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    add-int/lit8 p4, p2, 0x1

    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p4

    iget-object p5, p0, Lcom/dof100/morsenotifier/s;->e:Ljava/util/ArrayList;

    new-instance p6, Lcom/dof100/morsenotifier/k;

    invoke-direct {p6, p3, p4}, Lcom/dof100/morsenotifier/k;-><init>(II)V

    invoke-virtual {p5, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p2, p2, 0x2

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method a(I)V
    .locals 3

    iput p1, p0, Lcom/dof100/morsenotifier/s;->f:I

    iget v0, p0, Lcom/dof100/morsenotifier/s;->f:I

    const/4 v1, -0x1

    if-ltz v0, :cond_3

    iget v0, p0, Lcom/dof100/morsenotifier/s;->f:I

    iget-object v2, p0, Lcom/dof100/morsenotifier/s;->e:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_3

    iget-object v0, p0, Lcom/dof100/morsenotifier/s;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/dof100/morsenotifier/k;

    iget v0, p1, Lcom/dof100/morsenotifier/k;->a:I

    if-ltz v0, :cond_0

    iget v0, p0, Lcom/dof100/morsenotifier/s;->f:I

    iput v0, p0, Lcom/dof100/morsenotifier/s;->g:I

    goto :goto_0

    :cond_0
    iget v0, p1, Lcom/dof100/morsenotifier/k;->a:I

    if-eq v0, v1, :cond_1

    iput v1, p0, Lcom/dof100/morsenotifier/s;->g:I

    :cond_1
    :goto_0
    iget v0, p1, Lcom/dof100/morsenotifier/k;->b:I

    if-ltz v0, :cond_2

    iget p1, p0, Lcom/dof100/morsenotifier/s;->f:I

    iput p1, p0, Lcom/dof100/morsenotifier/s;->h:I

    return-void

    :cond_2
    iget p1, p1, Lcom/dof100/morsenotifier/k;->b:I

    if-eq p1, v1, :cond_4

    goto :goto_1

    :cond_3
    iput v1, p0, Lcom/dof100/morsenotifier/s;->g:I

    :goto_1
    iput v1, p0, Lcom/dof100/morsenotifier/s;->h:I

    :cond_4
    return-void
.end method

.method public onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v11, p1

    iget-boolean v1, v0, Lcom/dof100/morsenotifier/s;->b:Z

    const/4 v2, 0x0

    const/high16 v12, 0x3f800000    # 1.0f

    if-eqz v1, :cond_0

    iget-object v1, v0, Lcom/dof100/morsenotifier/s;->d:Lcom/dof100/morsenotifier/t;

    if-nez v1, :cond_1

    new-instance v1, Lcom/dof100/morsenotifier/t;

    const/16 v3, 0x30

    invoke-direct {v1, v11, v3, v12}, Lcom/dof100/morsenotifier/t;-><init>(Ljavax/microedition/khronos/opengles/GL10;IF)V

    iput-object v1, v0, Lcom/dof100/morsenotifier/s;->d:Lcom/dof100/morsenotifier/t;

    goto :goto_0

    :cond_0
    iput-object v2, v0, Lcom/dof100/morsenotifier/s;->d:Lcom/dof100/morsenotifier/t;

    :cond_1
    :goto_0
    const/4 v13, 0x0

    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-boolean v3, v0, Lcom/dof100/morsenotifier/s;->c:Z

    const/4 v14, -0x1

    if-eqz v3, :cond_4

    iget v3, v0, Lcom/dof100/morsenotifier/s;->f:I

    if-ltz v3, :cond_2

    iget-object v2, v0, Lcom/dof100/morsenotifier/s;->e:Ljava/util/ArrayList;

    iget v3, v0, Lcom/dof100/morsenotifier/s;->f:I

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/dof100/morsenotifier/k;

    :cond_2
    if-eqz v2, :cond_4

    iget v3, v2, Lcom/dof100/morsenotifier/k;->a:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eq v3, v4, :cond_3

    iget v3, v2, Lcom/dof100/morsenotifier/k;->a:I

    if-eq v3, v5, :cond_3

    iget v2, v2, Lcom/dof100/morsenotifier/k;->a:I

    if-ne v2, v14, :cond_4

    :cond_3
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_5

    iget v1, v0, Lcom/dof100/morsenotifier/s;->i:F

    sub-float v1, v12, v1

    iget v2, v0, Lcom/dof100/morsenotifier/s;->j:F

    sub-float v2, v12, v2

    iget v3, v0, Lcom/dof100/morsenotifier/s;->k:F

    sub-float v3, v12, v3

    iget v4, v0, Lcom/dof100/morsenotifier/s;->l:F

    sub-float v4, v12, v4

    iget v5, v0, Lcom/dof100/morsenotifier/s;->m:F

    sub-float v5, v12, v5

    iget v6, v0, Lcom/dof100/morsenotifier/s;->n:F

    sub-float v6, v12, v6

    iget v7, v0, Lcom/dof100/morsenotifier/s;->o:F

    sub-float v7, v12, v7

    iget v8, v0, Lcom/dof100/morsenotifier/s;->p:F

    sub-float v8, v12, v8

    iget v9, v0, Lcom/dof100/morsenotifier/s;->q:F

    sub-float v9, v12, v9

    iget v10, v0, Lcom/dof100/morsenotifier/s;->t:F

    sub-float v10, v12, v10

    iget v15, v0, Lcom/dof100/morsenotifier/s;->u:F

    sub-float v15, v12, v15

    iget v13, v0, Lcom/dof100/morsenotifier/s;->v:F

    sub-float v13, v12, v13

    iget v14, v0, Lcom/dof100/morsenotifier/s;->t:F

    sub-float v14, v12, v14

    move/from16 v18, v1

    iget v1, v0, Lcom/dof100/morsenotifier/s;->u:F

    sub-float v1, v12, v1

    move/from16 v19, v2

    iget v2, v0, Lcom/dof100/morsenotifier/s;->v:F

    sub-float v2, v12, v2

    invoke-interface {v11, v14, v1, v2, v12}, Ljavax/microedition/khronos/opengles/GL10;->glClearColor(FFFF)V

    move/from16 v24, v4

    move/from16 v25, v5

    move/from16 v26, v6

    move/from16 v21, v7

    move/from16 v22, v8

    move/from16 v23, v9

    move/from16 v20, v18

    const/high16 v14, 0x3f800000    # 1.0f

    move/from16 v18, v3

    goto :goto_1

    :cond_5
    iget v1, v0, Lcom/dof100/morsenotifier/s;->i:F

    iget v2, v0, Lcom/dof100/morsenotifier/s;->j:F

    iget v3, v0, Lcom/dof100/morsenotifier/s;->k:F

    iget v4, v0, Lcom/dof100/morsenotifier/s;->l:F

    iget v5, v0, Lcom/dof100/morsenotifier/s;->m:F

    iget v6, v0, Lcom/dof100/morsenotifier/s;->n:F

    iget v7, v0, Lcom/dof100/morsenotifier/s;->o:F

    iget v8, v0, Lcom/dof100/morsenotifier/s;->p:F

    iget v9, v0, Lcom/dof100/morsenotifier/s;->q:F

    iget v10, v0, Lcom/dof100/morsenotifier/s;->t:F

    iget v15, v0, Lcom/dof100/morsenotifier/s;->u:F

    iget v13, v0, Lcom/dof100/morsenotifier/s;->v:F

    iget v14, v0, Lcom/dof100/morsenotifier/s;->w:F

    move/from16 v20, v1

    move/from16 v19, v2

    move/from16 v18, v3

    move/from16 v24, v4

    move/from16 v25, v5

    move/from16 v26, v6

    move/from16 v21, v7

    move/from16 v22, v8

    move/from16 v23, v9

    :goto_1
    invoke-interface {v11, v10, v15, v13, v14}, Ljavax/microedition/khronos/opengles/GL10;->glClearColor(FFFF)V

    const/16 v1, 0x4100

    invoke-interface {v11, v1}, Ljavax/microedition/khronos/opengles/GL10;->glClear(I)V

    const/16 v1, 0x1700

    invoke-interface {v11, v1}, Ljavax/microedition/khronos/opengles/GL10;->glMatrixMode(I)V

    invoke-interface/range {p1 .. p1}, Ljavax/microedition/khronos/opengles/GL10;->glLoadIdentity()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/high16 v4, 0x41c80000    # 25.0f

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/high16 v7, 0x40800000    # 4.0f

    const/4 v8, 0x0

    const/high16 v9, 0x3f800000    # 1.0f

    const/4 v10, 0x0

    move-object v1, v11

    invoke-static/range {v1 .. v10}, Landroid/opengl/GLU;->gluLookAt(Ljavax/microedition/khronos/opengles/GL10;FFFFFFFFF)V

    const/16 v1, 0xb50

    invoke-interface {v11, v1}, Ljavax/microedition/khronos/opengles/GL10;->glDisable(I)V

    const/16 v1, 0x901

    invoke-interface {v11, v1}, Ljavax/microedition/khronos/opengles/GL10;->glFrontFace(I)V

    invoke-interface {v11, v12, v12, v10, v12}, Ljavax/microedition/khronos/opengles/GL10;->glColor4f(FFFF)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-wide v3, v0, Lcom/dof100/morsenotifier/s;->s:J

    sub-long v5, v1, v3

    iget v1, v0, Lcom/dof100/morsenotifier/s;->r:I

    int-to-long v1, v1

    cmp-long v3, v5, v1

    if-gez v3, :cond_6

    iget v1, v0, Lcom/dof100/morsenotifier/s;->x:F

    iget v2, v0, Lcom/dof100/morsenotifier/s;->x:F

    long-to-float v3, v5

    mul-float v2, v2, v3

    iget v3, v0, Lcom/dof100/morsenotifier/s;->r:I

    int-to-float v3, v3

    div-float/2addr v2, v3

    sub-float/2addr v1, v2

    invoke-static {v1, v10, v10}, Landroid/opengl/GLES10;->glTranslatef(FFF)V

    :cond_6
    iget v1, v0, Lcom/dof100/morsenotifier/s;->f:I

    neg-int v1, v1

    int-to-float v1, v1

    const/high16 v13, 0x3f000000    # 0.5f

    mul-float v1, v1, v13

    invoke-static {v1, v10, v10}, Landroid/opengl/GLES10;->glTranslatef(FFF)V

    const/4 v1, -0x1

    const/4 v2, -0x1

    const/4 v14, 0x0

    :goto_2
    iget-object v3, v0, Lcom/dof100/morsenotifier/s;->e:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v14, v3, :cond_f

    invoke-interface {v11, v12, v10, v10, v12}, Ljavax/microedition/khronos/opengles/GL10;->glColor4f(FFFF)V

    iget-object v3, v0, Lcom/dof100/morsenotifier/s;->e:Ljava/util/ArrayList;

    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v15, v3

    check-cast v15, Lcom/dof100/morsenotifier/k;

    iget v3, v15, Lcom/dof100/morsenotifier/k;->a:I

    if-ltz v3, :cond_7

    move v8, v14

    const/4 v9, -0x1

    goto :goto_3

    :cond_7
    iget v3, v15, Lcom/dof100/morsenotifier/k;->a:I

    const/4 v9, -0x1

    if-eq v3, v9, :cond_8

    const/4 v8, -0x1

    goto :goto_3

    :cond_8
    move v8, v2

    :goto_3
    iget v2, v15, Lcom/dof100/morsenotifier/k;->b:I

    if-ltz v2, :cond_9

    move v7, v14

    goto :goto_4

    :cond_9
    iget v2, v15, Lcom/dof100/morsenotifier/k;->b:I

    if-eq v2, v9, :cond_a

    const/4 v7, -0x1

    goto :goto_4

    :cond_a
    move v7, v1

    :goto_4
    iget-object v1, v0, Lcom/dof100/morsenotifier/s;->d:Lcom/dof100/morsenotifier/t;

    if-eqz v1, :cond_c

    iget v1, v15, Lcom/dof100/morsenotifier/k;->b:I

    if-ltz v1, :cond_c

    iget v1, v0, Lcom/dof100/morsenotifier/s;->h:I

    if-ne v7, v1, :cond_b

    move/from16 v16, v21

    move/from16 v17, v22

    move/from16 v27, v23

    goto :goto_5

    :cond_b
    move/from16 v17, v19

    move/from16 v27, v17

    move/from16 v16, v20

    :goto_5
    iget-object v1, v0, Lcom/dof100/morsenotifier/s;->d:Lcom/dof100/morsenotifier/t;

    iget v2, v15, Lcom/dof100/morsenotifier/k;->b:I

    int-to-char v2, v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v3

    const/high16 v4, 0x3e800000    # 0.25f

    iget-object v2, v0, Lcom/dof100/morsenotifier/s;->d:Lcom/dof100/morsenotifier/t;

    iget v2, v2, Lcom/dof100/morsenotifier/t;->a:F

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v2, v5

    add-float v5, v2, v13

    const/4 v6, 0x0

    move-object v2, v11

    move/from16 v28, v7

    move/from16 v7, v16

    move v10, v8

    move/from16 v8, v17

    const/16 v16, -0x1

    move/from16 v9, v27

    invoke-virtual/range {v1 .. v9}, Lcom/dof100/morsenotifier/t;->b(Ljavax/microedition/khronos/opengles/GL10;Ljava/lang/String;FFFFFF)V

    goto :goto_6

    :cond_c
    move/from16 v28, v7

    move v10, v8

    const/16 v16, -0x1

    :goto_6
    iget v1, v15, Lcom/dof100/morsenotifier/k;->a:I

    if-ltz v1, :cond_e

    iget v1, v0, Lcom/dof100/morsenotifier/s;->g:I

    if-ne v10, v1, :cond_d

    move/from16 v1, v24

    move/from16 v2, v25

    move/from16 v3, v26

    goto :goto_7

    :cond_d
    move/from16 v3, v18

    move/from16 v2, v19

    move/from16 v1, v20

    :goto_7
    invoke-interface {v11, v1, v2, v3, v12}, Ljavax/microedition/khronos/opengles/GL10;->glColor4f(FFFF)V

    invoke-virtual {v15, v11}, Lcom/dof100/morsenotifier/k;->a(Ljavax/microedition/khronos/opengles/GL10;)V

    :cond_e
    const/4 v1, 0x0

    invoke-static {v13, v1, v1}, Landroid/opengl/GLES10;->glTranslatef(FFF)V

    add-int/lit8 v14, v14, 0x1

    move v2, v10

    move/from16 v1, v28

    const/4 v10, 0x0

    goto/16 :goto_2

    :cond_f
    invoke-interface/range {p1 .. p1}, Ljavax/microedition/khronos/opengles/GL10;->glFlush()V

    return-void
.end method

.method public onSurfaceChanged(Ljavax/microedition/khronos/opengles/GL10;II)V
    .locals 12

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "MyMorseRenderer.onSurfaceChanged width=%d  height=%d "

    const/4 v2, 0x2

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v6, 0x1

    aput-object v4, v3, v6

    invoke-static {v0, v1, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    if-nez p3, :cond_0

    const/4 p3, 0x1

    :cond_0
    int-to-float v0, p2

    int-to-float v1, p3

    div-float/2addr v0, v1

    const/high16 v1, 0x40800000    # 4.0f

    if-le p3, p2, :cond_1

    iput v1, p0, Lcom/dof100/morsenotifier/s;->x:F

    iget v3, p0, Lcom/dof100/morsenotifier/s;->x:F

    div-float/2addr v3, v0

    iput v3, p0, Lcom/dof100/morsenotifier/s;->y:F

    :goto_0
    iput v1, p0, Lcom/dof100/morsenotifier/s;->z:F

    goto :goto_1

    :cond_1
    iput v1, p0, Lcom/dof100/morsenotifier/s;->y:F

    iget v3, p0, Lcom/dof100/morsenotifier/s;->y:F

    mul-float v3, v3, v0

    iput v3, p0, Lcom/dof100/morsenotifier/s;->x:F

    goto :goto_0

    :goto_1
    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    iget v1, p0, Lcom/dof100/morsenotifier/s;->y:F

    float-to-double v7, v1

    iget v1, p0, Lcom/dof100/morsenotifier/s;->z:F

    const/high16 v9, 0x41c80000    # 25.0f

    add-float/2addr v1, v9

    float-to-double v10, v1

    invoke-static {v7, v8, v10, v11}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v7

    mul-double v7, v7, v3

    double-to-float v1, v7

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "MyMorseRenderer.onSurfaceChanged width,height = %d,%d"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v2, v5

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v2, v6

    invoke-static {v3, v4, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MyMorseRenderer.onSurfaceChanged aspect="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-interface {p1, v5, v5, p2, p3}, Ljavax/microedition/khronos/opengles/GL10;->glViewport(IIII)V

    const/16 p2, 0x1701

    invoke-interface {p1, p2}, Ljavax/microedition/khronos/opengles/GL10;->glMatrixMode(I)V

    invoke-interface {p1}, Ljavax/microedition/khronos/opengles/GL10;->glLoadIdentity()V

    const p2, 0x3dcccccd    # 0.1f

    const/high16 p3, 0x40000000    # 2.0f

    iget v2, p0, Lcom/dof100/morsenotifier/s;->z:F

    add-float/2addr v2, v9

    mul-float v2, v2, p3

    invoke-static {p1, v1, v0, p2, v2}, Landroid/opengl/GLU;->gluPerspective(Ljavax/microedition/khronos/opengles/GL10;FFFF)V

    return-void
.end method

.method public onSurfaceCreated(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V
    .locals 3

    const-string p2, "MyMorseRenderer.onSurfacecreated"

    invoke-static {p2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget p2, p0, Lcom/dof100/morsenotifier/s;->a:I

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne p2, v2, :cond_0

    iput v1, p0, Lcom/dof100/morsenotifier/s;->t:F

    iput v1, p0, Lcom/dof100/morsenotifier/s;->u:F

    iput v1, p0, Lcom/dof100/morsenotifier/s;->v:F

    iput v0, p0, Lcom/dof100/morsenotifier/s;->w:F

    goto :goto_0

    :cond_0
    iput v1, p0, Lcom/dof100/morsenotifier/s;->t:F

    iput v1, p0, Lcom/dof100/morsenotifier/s;->u:F

    iput v1, p0, Lcom/dof100/morsenotifier/s;->v:F

    iput v1, p0, Lcom/dof100/morsenotifier/s;->w:F

    :goto_0
    invoke-interface {p1, v0}, Ljavax/microedition/khronos/opengles/GL10;->glClearDepthf(F)V

    const/16 p2, 0xb71

    invoke-interface {p1, p2}, Ljavax/microedition/khronos/opengles/GL10;->glEnable(I)V

    const/16 p2, 0x203

    invoke-interface {p1, p2}, Ljavax/microedition/khronos/opengles/GL10;->glDepthFunc(I)V

    const/16 p2, 0xc50

    const/16 v0, 0x1102

    invoke-interface {p1, p2, v0}, Ljavax/microedition/khronos/opengles/GL10;->glHint(II)V

    const/16 p2, 0x1d01

    invoke-interface {p1, p2}, Ljavax/microedition/khronos/opengles/GL10;->glShadeModel(I)V

    const/16 p2, 0xbd0

    invoke-interface {p1, p2}, Ljavax/microedition/khronos/opengles/GL10;->glDisable(I)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/dof100/morsenotifier/s;->d:Lcom/dof100/morsenotifier/t;

    return-void
.end method
