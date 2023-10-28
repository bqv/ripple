.class Lcom/dof100/morsenotifier/u;
.super Ljava/lang/Object;


# instance fields
.field public a:I

.field b:[B

.field private c:I


# direct methods
.method constructor <init>(II)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/dof100/morsenotifier/u;->c:I

    int-to-long v0, p1

    iget p2, p0, Lcom/dof100/morsenotifier/u;->c:I

    int-to-long v2, p2

    mul-long v0, v0, v2

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int p2, v0

    iput p2, p0, Lcom/dof100/morsenotifier/u;->a:I

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p2

    const-string v0, "MyTone constructor Element Dur=%d msec  Sample Rate=%d s/sec   NSamples=%d"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    iget p1, p0, Lcom/dof100/morsenotifier/u;->c:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v3, 0x1

    aput-object p1, v1, v3

    iget p1, p0, Lcom/dof100/morsenotifier/u;->a:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v3, 0x2

    aput-object p1, v1, v3

    invoke-static {p2, v0, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    :try_start_0
    iget p1, p0, Lcom/dof100/morsenotifier/u;->a:I

    mul-int/lit8 p1, p1, 0x2

    new-array p1, p1, [B

    iput-object p1, p0, Lcom/dof100/morsenotifier/u;->b:[B

    const/4 p1, 0x0

    :goto_0
    iget p2, p0, Lcom/dof100/morsenotifier/u;->a:I

    mul-int/lit8 p2, p2, 0x2

    if-ge p1, p2, :cond_0

    iget-object p2, p0, Lcom/dof100/morsenotifier/u;->b:[B

    aput-byte v2, p2, p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :catch_0
    const-string p1, "MyTone constructor ERROR creating/initializing byte array"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method a(IIFFF)V
    .locals 9

    int-to-long v0, p1

    iget p1, p0, Lcom/dof100/morsenotifier/u;->c:I

    int-to-long v2, p1

    mul-long v2, v2, v0

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    long-to-int p1, v2

    iget v2, p0, Lcom/dof100/morsenotifier/u;->a:I

    add-int/lit8 v2, v2, -0x1

    if-le p1, v2, :cond_0

    return-void

    :cond_0
    int-to-long v2, p2

    add-long v6, v0, v2

    iget p2, p0, Lcom/dof100/morsenotifier/u;->c:I

    int-to-long v0, p2

    mul-long v6, v6, v0

    div-long/2addr v6, v4

    long-to-int p2, v6

    iget v0, p0, Lcom/dof100/morsenotifier/u;->a:I

    add-int/lit8 v0, v0, -0x1

    if-le p2, v0, :cond_1

    iget p2, p0, Lcom/dof100/morsenotifier/u;->a:I

    add-int/lit8 p2, p2, -0x1

    :cond_1
    if-ge p2, p1, :cond_2

    return-void

    :cond_2
    sub-int/2addr p2, p1

    add-int/lit8 p2, p2, 0x1

    float-to-long v0, p5

    iget p5, p0, Lcom/dof100/morsenotifier/u;->c:I

    int-to-long v2, p5

    mul-long v0, v0, v2

    div-long/2addr v0, v4

    long-to-int p5, v0

    int-to-double v0, p5

    div-int/lit8 p5, p2, 0x2

    int-to-double v2, p5

    cmpl-double p5, v0, v2

    if-lez p5, :cond_3

    move-wide v0, v2

    :cond_3
    const/4 p5, 0x0

    cmpl-float v2, p3, p5

    if-nez v2, :cond_4

    const/high16 p3, 0x3f800000    # 1.0f

    const/4 p4, 0x0

    :cond_4
    const/4 p5, 0x0

    :goto_0
    if-ge p5, p2, :cond_7

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    int-to-double v4, p5

    cmpg-double v6, v4, v0

    if-gez v6, :cond_5

    div-double v2, v4, v0

    goto :goto_1

    :cond_5
    int-to-double v6, p2

    sub-double/2addr v6, v0

    cmpl-double v8, v4, v6

    if-lez v8, :cond_6

    sub-int v2, p2, p5

    int-to-double v2, v2

    div-double/2addr v2, v0

    :cond_6
    :goto_1
    float-to-double v6, p4

    mul-double v2, v2, v6

    const-wide/high16 v6, 0x4059000000000000L    # 100.0

    div-double/2addr v2, v6

    const-wide v6, 0x401921fb54442d18L    # 6.283185307179586

    mul-double v4, v4, v6

    iget v6, p0, Lcom/dof100/morsenotifier/u;->c:I

    int-to-float v6, v6

    div-float/2addr v6, p3

    float-to-double v6, v6

    div-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    mul-double v2, v2, v4

    const-wide v4, 0x40dfffc000000000L    # 32767.0

    mul-double v2, v2, v4

    double-to-int v2, v2

    int-to-short v2, v2

    add-int v3, p1, p5

    mul-int/lit8 v3, v3, 0x2

    iget-object v4, p0, Lcom/dof100/morsenotifier/u;->b:[B

    and-int/lit16 v5, v2, 0xff

    int-to-byte v5, v5

    aput-byte v5, v4, v3

    iget-object v4, p0, Lcom/dof100/morsenotifier/u;->b:[B

    add-int/lit8 v3, v3, 0x1

    const v5, 0xff00

    and-int/2addr v2, v5

    ushr-int/lit8 v2, v2, 0x8

    int-to-byte v2, v2

    aput-byte v2, v4, v3

    add-int/lit8 p5, p5, 0x1

    goto :goto_0

    :cond_7
    return-void
.end method
