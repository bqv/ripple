.class Lcom/dof100/morsenotifier/j;
.super Landroid/os/AsyncTask;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private b:I

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:I

.field private l:Ljava/lang/String;

.field private m:Z

.field private n:I

.field private o:I

.field private p:I

.field private q:I

.field private r:I

.field private s:J

.field private t:I

.field private u:Z

.field private v:Landroid/media/AudioTrack;

.field private w:Landroid/os/Vibrator;

.field private final x:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final y:Ljava/util/concurrent/CountDownLatch;

.field private final z:Landroid/content/BroadcastReceiver;


# direct methods
.method constructor <init>(Landroid/content/Context;I)V
    .locals 4

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/j;->c:Z

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/j;->d:Z

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/j;->e:Z

    iput v0, p0, Lcom/dof100/morsenotifier/j;->f:I

    const/4 v1, 0x1

    iput v1, p0, Lcom/dof100/morsenotifier/j;->g:I

    iput v0, p0, Lcom/dof100/morsenotifier/j;->h:I

    iput v0, p0, Lcom/dof100/morsenotifier/j;->i:I

    iput v0, p0, Lcom/dof100/morsenotifier/j;->j:I

    iput v0, p0, Lcom/dof100/morsenotifier/j;->k:I

    const-string v2, ""

    iput-object v2, p0, Lcom/dof100/morsenotifier/j;->l:Ljava/lang/String;

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/j;->m:Z

    const/4 v2, 0x3

    iput v2, p0, Lcom/dof100/morsenotifier/j;->n:I

    const/16 v2, 0x64

    iput v2, p0, Lcom/dof100/morsenotifier/j;->o:I

    iput v0, p0, Lcom/dof100/morsenotifier/j;->p:I

    iput v0, p0, Lcom/dof100/morsenotifier/j;->q:I

    iput v0, p0, Lcom/dof100/morsenotifier/j;->r:I

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/dof100/morsenotifier/j;->s:J

    iput v0, p0, Lcom/dof100/morsenotifier/j;->t:I

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/j;->u:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/dof100/morsenotifier/j;->v:Landroid/media/AudioTrack;

    iput-object v0, p0, Lcom/dof100/morsenotifier/j;->w:Landroid/os/Vibrator;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/dof100/morsenotifier/j;->x:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Lcom/dof100/morsenotifier/j;->y:Ljava/util/concurrent/CountDownLatch;

    new-instance v0, Lcom/dof100/morsenotifier/j$1;

    invoke-direct {v0, p0}, Lcom/dof100/morsenotifier/j$1;-><init>(Lcom/dof100/morsenotifier/j;)V

    iput-object v0, p0, Lcom/dof100/morsenotifier/j;->z:Landroid/content/BroadcastReceiver;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/dof100/morsenotifier/j;->a:Ljava/lang/ref/WeakReference;

    iput p2, p0, Lcom/dof100/morsenotifier/j;->b:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MyPlayerMorse constructor instance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/dof100/morsenotifier/j;)Ljava/util/concurrent/CountDownLatch;
    .locals 0

    iget-object p0, p0, Lcom/dof100/morsenotifier/j;->y:Ljava/util/concurrent/CountDownLatch;

    return-object p0
.end method

.method private a(CZ)V
    .locals 6

    iget-boolean v0, p0, Lcom/dof100/morsenotifier/j;->e:Z

    if-nez v0, :cond_2

    const/16 v0, 0x21

    if-lt p1, v0, :cond_0

    const/16 v0, 0x2f

    if-le p1, v0, :cond_1

    :cond_0
    const/16 v0, 0x3a

    if-lt p1, v0, :cond_2

    const/16 v0, 0x40

    if-gt p1, v0, :cond_2

    :cond_1
    const/16 p1, 0x20

    :cond_2
    const/4 v0, 0x0

    const/4 v1, -0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, -0x2

    const/4 v5, -0x1

    packed-switch p1, :pswitch_data_0

    packed-switch p1, :pswitch_data_1

    packed-switch p1, :pswitch_data_2

    packed-switch p1, :pswitch_data_3

    packed-switch p1, :pswitch_data_4

    packed-switch p1, :pswitch_data_5

    packed-switch p1, :pswitch_data_6

    packed-switch p1, :pswitch_data_7

    packed-switch p1, :pswitch_data_8

    packed-switch p1, :pswitch_data_9

    packed-switch p1, :pswitch_data_a

    sparse-switch p1, :sswitch_data_0

    invoke-direct {p0, v1, v1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_31

    :sswitch_0
    invoke-direct {p0, v2, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto :goto_0

    :sswitch_1
    invoke-direct {p0, v2, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_23

    :sswitch_2
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_25

    :sswitch_3
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v3, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v3, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_1f

    :sswitch_4
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_1b

    :sswitch_5
    invoke-direct {p0, v2, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_d

    :sswitch_6
    invoke-direct {p0, v2, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_5

    :sswitch_7
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_6

    :sswitch_8
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_2c

    :sswitch_9
    invoke-direct {p0, v2, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_1c

    :pswitch_0
    :sswitch_a
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_15

    :sswitch_b
    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    const/4 p2, 0x0

    goto/16 :goto_31

    :sswitch_c
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_14

    :sswitch_d
    invoke-direct {p0, v2, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_10

    :sswitch_e
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v3, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v3, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_0
    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v2, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_1
    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_2
    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v3, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_3
    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v3, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_2f

    :pswitch_1
    :sswitch_f
    invoke-direct {p0, v2, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_2a

    :pswitch_2
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_19

    :pswitch_3
    :sswitch_10
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto :goto_4

    :pswitch_4
    :sswitch_11
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto :goto_0

    :pswitch_5
    :sswitch_12
    invoke-direct {p0, v2, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_4
    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v3, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_8

    :pswitch_6
    :sswitch_13
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_17

    :pswitch_7
    invoke-direct {p0, v2, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_7

    :pswitch_8
    invoke-direct {p0, v2, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_2b

    :pswitch_9
    invoke-direct {p0, v2, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto :goto_1

    :pswitch_a
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_2d

    :pswitch_b
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto :goto_2

    :pswitch_c
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto :goto_3

    :pswitch_d
    invoke-direct {p0, v2, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_30

    :pswitch_e
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_22

    :pswitch_f
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_27

    :pswitch_10
    invoke-direct {p0, v2, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_16

    :pswitch_11
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_1d

    :pswitch_12
    invoke-direct {p0, v2, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_f

    :pswitch_13
    invoke-direct {p0, v2, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_28

    :pswitch_14
    invoke-direct {p0, v2, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_2e

    :pswitch_15
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_8

    :pswitch_16
    invoke-direct {p0, v2, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_18

    :pswitch_17
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_e

    :pswitch_18
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_29

    :pswitch_19
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_21

    :pswitch_1a
    invoke-direct {p0, v2, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_1e

    :pswitch_1b
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_26

    :pswitch_1c
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_31

    :pswitch_1d
    invoke-direct {p0, v2, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto :goto_9

    :pswitch_1e
    invoke-direct {p0, v2, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_13

    :pswitch_1f
    invoke-direct {p0, v2, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_20

    :pswitch_20
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_2f

    :pswitch_21
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v2, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_5
    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_12

    :pswitch_22
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v3, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto :goto_6

    :pswitch_23
    invoke-direct {p0, v2, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v3, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_12

    :pswitch_24
    invoke-direct {p0, v2, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v2, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto :goto_a

    :pswitch_25
    invoke-direct {p0, v2, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_1a

    :pswitch_26
    invoke-direct {p0, v2, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_6
    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v2, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_7
    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_8
    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v2, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_9
    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_22

    :pswitch_27
    invoke-direct {p0, v2, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_a
    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_1f

    :pswitch_28
    invoke-direct {p0, v2, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto :goto_b

    :pswitch_29
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_b
    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v3, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_21

    :pswitch_2a
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto :goto_10

    :pswitch_2b
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_11

    :pswitch_2c
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v3, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto :goto_e

    :pswitch_2d
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto :goto_c

    :pswitch_2e
    invoke-direct {p0, v2, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_c
    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v2, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_d
    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_e
    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v2, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_f
    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_2d

    :pswitch_2f
    invoke-direct {p0, v2, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_24

    :pswitch_30
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v2, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v3, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto :goto_17

    :pswitch_31
    invoke-direct {p0, v2, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v3, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_10
    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v3, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_2

    :pswitch_32
    invoke-direct {p0, v2, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v2, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_11
    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v3, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_2c

    :pswitch_33
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_12
    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v2, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_13
    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_26

    :pswitch_34
    invoke-direct {p0, v2, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_14
    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v3, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_15
    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v2, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_16
    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_17
    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v2, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_18
    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_3

    :pswitch_35
    invoke-direct {p0, v2, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_19
    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v3, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto :goto_1d

    :pswitch_36
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v2, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_1a
    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_1b
    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v2, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_1c
    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_1d
    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v2, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_1e
    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto :goto_27

    :pswitch_37
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_1f
    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v2, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_20
    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_21
    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v3, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_22
    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v3, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto :goto_29

    :pswitch_38
    invoke-direct {p0, v3, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_23
    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v2, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_24
    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_25
    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v3, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_26
    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v3, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_27
    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v2, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_28
    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_29
    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v3, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto :goto_31

    :pswitch_39
    invoke-direct {p0, v2, p1}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v3, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_2a
    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v2, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_2b
    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_2c
    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v3, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_2d
    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v2, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_2e
    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_2f
    invoke-direct {p0, v4, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v2, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_30
    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v5, v5}, Lcom/dof100/morsenotifier/j;->a(II)V

    :goto_31
    if-eqz p2, :cond_3

    :goto_32
    iget p1, p0, Lcom/dof100/morsenotifier/j;->n:I

    if-ge v0, p1, :cond_3

    invoke-direct {p0, v1, v1}, Lcom/dof100/morsenotifier/j;->a(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_32

    :cond_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x21
        :pswitch_39
        :pswitch_38
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x26
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x2b
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x3f
        :pswitch_22
        :pswitch_21
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x61
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0xe4
        :pswitch_6
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :pswitch_data_6
    .packed-switch 0xf0
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_7
    .packed-switch 0x3ac
        :pswitch_20
        :pswitch_1c
        :pswitch_19
        :pswitch_18
    .end packed-switch

    :pswitch_data_8
    .packed-switch 0x3b1
        :pswitch_20
        :pswitch_1f
        :pswitch_1a
        :pswitch_1d
        :pswitch_1c
        :pswitch_7
        :pswitch_19
        :pswitch_1e
        :pswitch_18
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
    .end packed-switch

    :pswitch_data_9
    .packed-switch 0x3bf
        :pswitch_12
        :pswitch_11
        :pswitch_f
        :pswitch_e
        :pswitch_e
        :pswitch_d
        :pswitch_8
        :pswitch_1b
        :pswitch_9
        :pswitch_10
        :pswitch_a
    .end packed-switch

    :pswitch_data_a
    .packed-switch 0x3cc
        :pswitch_12
        :pswitch_8
        :pswitch_a
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x24 -> :sswitch_e
        0x3d -> :sswitch_d
        0x5f -> :sswitch_c
        0x7c -> :sswitch_b
        0xe0 -> :sswitch_a
        0xf3 -> :sswitch_9
        0xf6 -> :sswitch_9
        0xf8 -> :sswitch_9
        0xfc -> :sswitch_8
        0xfe -> :sswitch_7
        0x105 -> :sswitch_13
        0x107 -> :sswitch_12
        0x109 -> :sswitch_12
        0x111 -> :sswitch_10
        0x119 -> :sswitch_10
        0x11d -> :sswitch_6
        0x125 -> :sswitch_5
        0x135 -> :sswitch_4
        0x142 -> :sswitch_11
        0x144 -> :sswitch_f
        0x15b -> :sswitch_3
        0x15d -> :sswitch_2
        0x161 -> :sswitch_5
        0x16d -> :sswitch_8
        0x17a -> :sswitch_1
        0x17c -> :sswitch_0
    .end sparse-switch
.end method

.method private a(II)V
    .locals 1

    iget-object v0, p0, Lcom/dof100/morsenotifier/j;->x:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/dof100/morsenotifier/j;->x:Ljava/util/ArrayList;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method static synthetic a(Lcom/dof100/morsenotifier/j;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/dof100/morsenotifier/j;->u:Z

    return p1
.end method

.method static synthetic b(Lcom/dof100/morsenotifier/j;)I
    .locals 0

    iget p0, p0, Lcom/dof100/morsenotifier/j;->b:I

    return p0
.end method

.method private b()V
    .locals 3

    iget-object v0, p0, Lcom/dof100/morsenotifier/j;->v:Landroid/media/AudioTrack;

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    const/4 v2, 0x0

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lcom/dof100/morsenotifier/j;->v:Landroid/media/AudioTrack;

    invoke-virtual {v0, v2}, Landroid/media/AudioTrack;->setVolume(F)I

    return-void

    :cond_1
    iget-object v0, p0, Lcom/dof100/morsenotifier/j;->v:Landroid/media/AudioTrack;

    invoke-virtual {v0, v2, v2}, Landroid/media/AudioTrack;->setStereoVolume(FF)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method static synthetic c(Lcom/dof100/morsenotifier/j;)I
    .locals 0

    iget p0, p0, Lcom/dof100/morsenotifier/j;->t:I

    return p0
.end method

.method private c()V
    .locals 12

    const-string v0, "MyPlayerMorse.seqCreate "

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/j;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, -0x3

    const/4 v1, -0x6

    invoke-direct {p0, v1, v0}, Lcom/dof100/morsenotifier/j;->a(II)V

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "MyPlayerMorse.seqCreate repeat=%d text=%s"

    const/4 v3, 0x2

    new-array v4, v3, [Ljava/lang/Object;

    iget v5, p0, Lcom/dof100/morsenotifier/j;->g:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    iget-object v5, p0, Lcom/dof100/morsenotifier/j;->l:Ljava/lang/String;

    const/4 v7, 0x1

    aput-object v5, v4, v7

    invoke-static {v1, v2, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_0
    :goto_0
    if-nez v1, :cond_6

    iget-object v4, p0, Lcom/dof100/morsenotifier/j;->l:Ljava/lang/String;

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v5, :cond_2

    invoke-virtual {v4, v8}, Ljava/lang/String;->charAt(I)C

    move-result v9

    add-int/lit8 v8, v8, 0x1

    if-ge v8, v5, :cond_1

    invoke-virtual {v4, v8}, Ljava/lang/String;->charAt(I)C

    move-result v10

    const/16 v11, 0x7c

    if-ne v10, v11, :cond_1

    const/4 v10, 0x0

    goto :goto_2

    :cond_1
    const/4 v10, 0x1

    :goto_2
    invoke-direct {p0, v9, v10}, Lcom/dof100/morsenotifier/j;->a(CZ)V

    goto :goto_1

    :cond_2
    add-int/2addr v2, v7

    iget v4, p0, Lcom/dof100/morsenotifier/j;->o:I

    iget-object v5, p0, Lcom/dof100/morsenotifier/j;->x:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    mul-int v4, v4, v5

    div-int/2addr v4, v3

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v8, "MyPlayerMorse.seqCreate   iter=%d   mList.size=%d   Dur=%d msec"

    const/4 v9, 0x3

    new-array v9, v9, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v9, v6

    iget-object v10, p0, Lcom/dof100/morsenotifier/j;->x:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v9, v7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v9, v3

    invoke-static {v5, v8, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget v5, p0, Lcom/dof100/morsenotifier/j;->g:I

    if-lez v5, :cond_3

    iget v4, p0, Lcom/dof100/morsenotifier/j;->g:I

    if-lt v2, v4, :cond_4

    :goto_3
    const/4 v1, 0x1

    goto :goto_4

    :cond_3
    iget v5, p0, Lcom/dof100/morsenotifier/j;->g:I

    neg-int v5, v5

    mul-int/lit16 v5, v5, 0x3e8

    if-le v4, v5, :cond_4

    goto :goto_3

    :cond_4
    :goto_4
    const/16 v4, 0x64

    if-le v2, v4, :cond_5

    const-string v1, "MyPlayerMorse.seqCreate  ERROR niters>100"

    invoke-static {v1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const/4 v1, 0x1

    :cond_5
    if-nez v1, :cond_0

    invoke-direct {p0, v0, v0}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v0, v0}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v0, v0}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v0, v0}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v0, v0}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v0, v0}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v0, v0}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v0, v0}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v0, v0}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v0, v0}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v0, v0}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v0, v0}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v0, v0}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v0, v0}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v0, v0}, Lcom/dof100/morsenotifier/j;->a(II)V

    goto/16 :goto_0

    :cond_6
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MyPlayerMorse.seqCreate after message mList.size="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/dof100/morsenotifier/j;->x:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "   Nelements="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/dof100/morsenotifier/j;->q:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const/4 v1, -0x7

    invoke-direct {p0, v1, v0}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v1, v0}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v1, v0}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v1, v0}, Lcom/dof100/morsenotifier/j;->a(II)V

    invoke-direct {p0, v1, v0}, Lcom/dof100/morsenotifier/j;->a(II)V

    const/4 v1, -0x8

    invoke-direct {p0, v1, v0}, Lcom/dof100/morsenotifier/j;->a(II)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MyPlayerMorse.seqCreate after mDelayAfter mList.size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/dof100/morsenotifier/j;->x:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d(Lcom/dof100/morsenotifier/j;)I
    .locals 0

    iget p0, p0, Lcom/dof100/morsenotifier/j;->q:I

    return p0
.end method

.method static synthetic e(Lcom/dof100/morsenotifier/j;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lcom/dof100/morsenotifier/j;->x:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic f(Lcom/dof100/morsenotifier/j;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/dof100/morsenotifier/j;->d:Z

    return p0
.end method

.method static synthetic g(Lcom/dof100/morsenotifier/j;)Landroid/os/Vibrator;
    .locals 0

    iget-object p0, p0, Lcom/dof100/morsenotifier/j;->w:Landroid/os/Vibrator;

    return-object p0
.end method

.method static synthetic h(Lcom/dof100/morsenotifier/j;)I
    .locals 0

    iget p0, p0, Lcom/dof100/morsenotifier/j;->o:I

    return p0
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 20

    move-object/from16 v1, p0

    iget-object v2, v1, Lcom/dof100/morsenotifier/j;->a:Ljava/lang/ref/WeakReference;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "MyMorsePlayer.doInBackground ERROR wr_context=null instance="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v1, Lcom/dof100/morsenotifier/j;->b:I

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v2, v1, Lcom/dof100/morsenotifier/j;->y:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-object v3

    :cond_0
    iget-object v2, v1, Lcom/dof100/morsenotifier/j;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    if-nez v2, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "MyMorsePlayer.doInBackground ERROR tmpContext=null instance="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v1, Lcom/dof100/morsenotifier/j;->b:I

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v2, v1, Lcom/dof100/morsenotifier/j;->y:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-object v3

    :cond_1
    iget v4, v1, Lcom/dof100/morsenotifier/j;->q:I

    if-gtz v4, :cond_2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "MyMorsePlayer.doInBackground Exiting...  mNElements="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v1, Lcom/dof100/morsenotifier/j;->q:I

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v2, v1, Lcom/dof100/morsenotifier/j;->y:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-object v3

    :cond_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "MyPlayerMorse.doInBackground. Creating tone instance="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, v1, Lcom/dof100/morsenotifier/j;->b:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    :try_start_0
    new-instance v4, Lcom/dof100/morsenotifier/u;

    iget v5, v1, Lcom/dof100/morsenotifier/j;->q:I

    iget v6, v1, Lcom/dof100/morsenotifier/j;->o:I

    mul-int v5, v5, v6

    iget v6, v1, Lcom/dof100/morsenotifier/j;->p:I

    invoke-direct {v4, v5, v6}, Lcom/dof100/morsenotifier/u;-><init>(II)V

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_0
    iget v5, v1, Lcom/dof100/morsenotifier/j;->q:I

    const/4 v6, 0x3

    const/4 v7, 0x1

    const/4 v8, 0x2

    if-ge v12, v5, :cond_5

    iget-object v5, v1, Lcom/dof100/morsenotifier/j;->x:Ljava/util/ArrayList;

    mul-int/lit8 v9, v12, 0x2

    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/high16 v9, 0x42c80000    # 100.0f

    if-ne v5, v7, :cond_3

    iget v5, v1, Lcom/dof100/morsenotifier/j;->o:I

    mul-int v6, v12, v5

    iget v7, v1, Lcom/dof100/morsenotifier/j;->o:I

    iget v5, v1, Lcom/dof100/morsenotifier/j;->i:I

    int-to-float v8, v5

    iget v5, v1, Lcom/dof100/morsenotifier/j;->j:I

    int-to-float v10, v5

    iget v5, v1, Lcom/dof100/morsenotifier/j;->k:I

    iget v13, v1, Lcom/dof100/morsenotifier/j;->o:I

    mul-int v5, v5, v13

    int-to-float v5, v5

    div-float v13, v5, v9

    move-object v5, v4

    move v9, v10

    move v10, v13

    invoke-virtual/range {v5 .. v10}, Lcom/dof100/morsenotifier/u;->a(IIFFF)V

    goto :goto_1

    :cond_3
    if-ne v5, v8, :cond_4

    iget v5, v1, Lcom/dof100/morsenotifier/j;->o:I

    mul-int v7, v12, v5

    iget v5, v1, Lcom/dof100/morsenotifier/j;->o:I

    mul-int/lit8 v8, v5, 0x3

    iget v5, v1, Lcom/dof100/morsenotifier/j;->i:I

    int-to-float v10, v5

    iget v5, v1, Lcom/dof100/morsenotifier/j;->j:I

    int-to-float v13, v5

    iget v5, v1, Lcom/dof100/morsenotifier/j;->k:I

    iget v6, v1, Lcom/dof100/morsenotifier/j;->o:I

    mul-int v5, v5, v6

    int-to-float v5, v5

    div-float v14, v5, v9

    move-object v5, v4

    move v6, v7

    move v7, v8

    move v8, v10

    move v9, v13

    move v10, v14

    invoke-virtual/range {v5 .. v10}, Lcom/dof100/morsenotifier/u;->a(IIFFF)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_a

    :cond_4
    :goto_1
    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    :cond_5
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "MyPlayerMorse.doInBackground registering broadcast receiver instance="

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v9, v1, Lcom/dof100/morsenotifier/j;->b:I

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-static {v2}, Landroid/support/v4/a/b;->a(Landroid/content/Context;)Landroid/support/v4/a/b;

    move-result-object v5

    new-instance v9, Landroid/content/IntentFilter;

    invoke-direct {v9}, Landroid/content/IntentFilter;-><init>()V

    const-string v10, "LBR_ACTION_FINISH"

    invoke-virtual {v9, v10}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v10, v1, Lcom/dof100/morsenotifier/j;->z:Landroid/content/BroadcastReceiver;

    invoke-virtual {v5, v10, v9}, Landroid/support/v4/a/b;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    iget v5, v4, Lcom/dof100/morsenotifier/u;->a:I

    iget v9, v1, Lcom/dof100/morsenotifier/j;->q:I

    div-int/2addr v5, v9

    iput v5, v1, Lcom/dof100/morsenotifier/j;->t:I

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "MyPlayerMorse.doInBackground AudioTrack play nElements="

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v9, v1, Lcom/dof100/morsenotifier/j;->q:I

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "MyPlayerMorse.doInBackground AudioTrack play nSamples="

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v9, v4, Lcom/dof100/morsenotifier/u;->a:I

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "MyPlayerMorse.doInBackground AudioTrack play nSamplesDur="

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v9, v1, Lcom/dof100/morsenotifier/j;->t:I

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget v5, v4, Lcom/dof100/morsenotifier/u;->a:I

    if-gtz v5, :cond_6

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "MyMorsePlayer.doInBackground Exiting...  tmpTone.mNSamples="

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v4, Lcom/dof100/morsenotifier/u;->a:I

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v2, v1, Lcom/dof100/morsenotifier/j;->y:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-object v3

    :cond_6
    iget-object v5, v4, Lcom/dof100/morsenotifier/u;->b:[B

    array-length v5, v5

    if-gtz v5, :cond_7

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "MyMorsePlayer.doInBackground Exiting...  tmpTone.mGeneratedSnd.length="

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v4, Lcom/dof100/morsenotifier/u;->b:[B

    array-length v4, v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v2, v1, Lcom/dof100/morsenotifier/j;->y:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-object v3

    :cond_7
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "MyPlayerMorse.doInBackground. Creating audiotrack. Buffersize="

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v9, v1, Lcom/dof100/morsenotifier/j;->r:I

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const/4 v5, 0x4

    :try_start_1
    iget v9, v1, Lcom/dof100/morsenotifier/j;->p:I

    invoke-static {v9, v5, v8}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    move-result v9
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    const-string v9, "MyPlayerMorse.doInBackground. ERROR getMinBufferSize"

    invoke-static {v9}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget v9, v1, Lcom/dof100/morsenotifier/j;->p:I

    mul-int/lit8 v9, v9, 0x4

    :goto_2
    const/4 v10, 0x5

    :try_start_2
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v13, 0x1a

    if-lt v12, v13, :cond_8

    new-instance v12, Landroid/media/AudioTrack$Builder;

    invoke-direct {v12}, Landroid/media/AudioTrack$Builder;-><init>()V

    new-instance v13, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v13}, Landroid/media/AudioAttributes$Builder;-><init>()V

    iget v14, v1, Lcom/dof100/morsenotifier/j;->h:I

    invoke-virtual {v13, v14}, Landroid/media/AudioAttributes$Builder;->setLegacyStreamType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v13

    invoke-virtual {v13}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object v13

    invoke-virtual {v12, v13}, Landroid/media/AudioTrack$Builder;->setAudioAttributes(Landroid/media/AudioAttributes;)Landroid/media/AudioTrack$Builder;

    move-result-object v12

    new-instance v13, Landroid/media/AudioFormat$Builder;

    invoke-direct {v13}, Landroid/media/AudioFormat$Builder;-><init>()V

    invoke-virtual {v13, v8}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    move-result-object v13

    iget v14, v1, Lcom/dof100/morsenotifier/j;->p:I

    invoke-virtual {v13, v14}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    move-result-object v13

    invoke-virtual {v13, v5}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    move-result-object v13

    invoke-virtual {v13}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    move-result-object v13

    invoke-virtual {v12, v13}, Landroid/media/AudioTrack$Builder;->setAudioFormat(Landroid/media/AudioFormat;)Landroid/media/AudioTrack$Builder;

    move-result-object v12

    invoke-virtual {v12, v9}, Landroid/media/AudioTrack$Builder;->setBufferSizeInBytes(I)Landroid/media/AudioTrack$Builder;

    move-result-object v9

    invoke-virtual {v9, v7}, Landroid/media/AudioTrack$Builder;->setTransferMode(I)Landroid/media/AudioTrack$Builder;

    move-result-object v9

    invoke-virtual {v9}, Landroid/media/AudioTrack$Builder;->build()Landroid/media/AudioTrack;

    move-result-object v9

    iput-object v9, v1, Lcom/dof100/morsenotifier/j;->v:Landroid/media/AudioTrack;

    goto :goto_3

    :cond_8
    new-instance v15, Landroid/media/AudioTrack;

    iget v13, v1, Lcom/dof100/morsenotifier/j;->h:I

    iget v14, v1, Lcom/dof100/morsenotifier/j;->p:I

    const/16 v16, 0x4

    const/16 v17, 0x2

    const/16 v18, 0x1

    move-object v12, v15

    move-object v5, v15

    move/from16 v15, v16

    move/from16 v16, v17

    move/from16 v17, v9

    invoke-direct/range {v12 .. v18}, Landroid/media/AudioTrack;-><init>(IIIIII)V

    iput-object v5, v1, Lcom/dof100/morsenotifier/j;->v:Landroid/media/AudioTrack;
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_9
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_8

    :goto_3
    iget-boolean v5, v1, Lcom/dof100/morsenotifier/j;->c:Z

    if-nez v5, :cond_9

    const-string v5, "MyPlayerMorse doInBackground mEnableSound=false. Muting..."

    invoke-static {v5}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Lcom/dof100/morsenotifier/j;->b()V

    :cond_9
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "MyPlayerMorse.doInBackground. Audiotrack created. checking mAudioTrack state ="

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, v1, Lcom/dof100/morsenotifier/j;->v:Landroid/media/AudioTrack;

    invoke-virtual {v9}, Landroid/media/AudioTrack;->getState()I

    move-result v9

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const/4 v5, 0x0

    :cond_a
    iget-object v9, v1, Lcom/dof100/morsenotifier/j;->v:Landroid/media/AudioTrack;

    invoke-virtual {v9}, Landroid/media/AudioTrack;->getState()I

    move-result v9

    if-eq v9, v7, :cond_b

    add-int/2addr v5, v7

    const-wide/16 v9, 0x64

    :try_start_3
    invoke-static {v9, v10}, Ljava/lang/Thread;->sleep(J)V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_4

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    :goto_4
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "MyPlayerMorse.doInBackground. Audiotrack created. mAudioTrack.getstate="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v10, v1, Lcom/dof100/morsenotifier/j;->v:Landroid/media/AudioTrack;

    invoke-virtual {v10}, Landroid/media/AudioTrack;->getState()I

    move-result v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const/16 v9, 0x14

    if-lt v5, v9, :cond_a

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "MyPlayerMorse.doInBackground ERROR mAudioTrack.state!=STATE_INITIALIZED after 20 tries. Stopping... instance="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v1, Lcom/dof100/morsenotifier/j;->b:I

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v2, v1, Lcom/dof100/morsenotifier/j;->y:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-object v3

    :cond_b
    iget-boolean v5, v1, Lcom/dof100/morsenotifier/j;->u:Z

    if-eqz v5, :cond_c

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "MyPlayerMorse.doInBackground commandstop=true... instance="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v1, Lcom/dof100/morsenotifier/j;->b:I

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v2, v1, Lcom/dof100/morsenotifier/j;->y:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-object v3

    :cond_c
    iget-object v5, v1, Lcom/dof100/morsenotifier/j;->y:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v5}, Ljava/util/concurrent/CountDownLatch;->getCount()J

    move-result-wide v9

    const-wide/16 v12, 0x1

    cmp-long v5, v9, v12

    if-eqz v5, :cond_d

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "MyPlayerMorse.doInBackground mDoneLatch.getCount() != 1 instance="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v1, Lcom/dof100/morsenotifier/j;->b:I

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-object v3

    :cond_d
    iget v5, v1, Lcom/dof100/morsenotifier/j;->f:I

    if-lez v5, :cond_f

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    iget-wide v12, v1, Lcom/dof100/morsenotifier/j;->s:J

    sub-long v14, v9, v12

    iget v5, v1, Lcom/dof100/morsenotifier/j;->f:I

    int-to-long v9, v5

    sub-long v12, v9, v14

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v9, "MyPlayerMorse.doInBackground Waiting %d-%d=%d msec"

    new-array v6, v6, [Ljava/lang/Object;

    iget v10, v1, Lcom/dof100/morsenotifier/j;->f:I

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v6, v11

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    aput-object v10, v6, v7

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    aput-object v10, v6, v8

    invoke-static {v5, v9, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const-wide/16 v5, 0x0

    cmp-long v8, v12, v5

    if-lez v8, :cond_e

    const-wide/16 v5, 0x2710

    cmp-long v8, v12, v5

    if-gez v8, :cond_e

    :try_start_4
    invoke-static {v12, v13}, Ljava/lang/Thread;->sleep(J)V
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_5

    :catch_2
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "MyPlayerMorse.doInBackground ERROR sleep in delay before instance="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, v1, Lcom/dof100/morsenotifier/j;->b:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    :cond_e
    :goto_5
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "MyPlayerMorse.doInBackground Waiting finished instance="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, v1, Lcom/dof100/morsenotifier/j;->b:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    :cond_f
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "MyPlayerMorse.doInBackground Start Playing instance="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, v1, Lcom/dof100/morsenotifier/j;->b:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "MyPlayerMorse.doInBackground AudioTrack play nElements="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, v1, Lcom/dof100/morsenotifier/j;->q:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "MyPlayerMorse.doInBackground AudioTrack play nSamples="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, v4, Lcom/dof100/morsenotifier/u;->a:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "MyPlayerMorse.doInBackground AudioTrack play nSamplesDur="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, v1, Lcom/dof100/morsenotifier/j;->t:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    :try_start_5
    iget-object v5, v1, Lcom/dof100/morsenotifier/j;->v:Landroid/media/AudioTrack;

    invoke-virtual {v5}, Landroid/media/AudioTrack;->play()V
    :try_end_5
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_7
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_6

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "MyPlayerMorse.doInBackground Setting notifications instance="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, v1, Lcom/dof100/morsenotifier/j;->b:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    :try_start_6
    iget-object v5, v1, Lcom/dof100/morsenotifier/j;->v:Landroid/media/AudioTrack;

    iget v6, v4, Lcom/dof100/morsenotifier/u;->a:I

    sub-int/2addr v6, v7

    invoke-virtual {v5, v6}, Landroid/media/AudioTrack;->setNotificationMarkerPosition(I)I

    iget-object v5, v1, Lcom/dof100/morsenotifier/j;->v:Landroid/media/AudioTrack;

    iget v6, v1, Lcom/dof100/morsenotifier/j;->t:I

    invoke-virtual {v5, v6}, Landroid/media/AudioTrack;->setPositionNotificationPeriod(I)I

    iget-object v5, v1, Lcom/dof100/morsenotifier/j;->v:Landroid/media/AudioTrack;

    new-instance v6, Lcom/dof100/morsenotifier/j$2;

    invoke-direct {v6, v1, v2}, Lcom/dof100/morsenotifier/j$2;-><init>(Lcom/dof100/morsenotifier/j;Landroid/content/Context;)V

    invoke-virtual {v5, v6}, Landroid/media/AudioTrack;->setPlaybackPositionUpdateListener(Landroid/media/AudioTrack$OnPlaybackPositionUpdateListener;)V
    :try_end_6
    .catch Ljava/lang/IllegalStateException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    const-string v2, "MyPlayerMorse.doInBackground mAudioTrack.write"

    invoke-static {v2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    :try_start_7
    iget-object v2, v1, Lcom/dof100/morsenotifier/j;->v:Landroid/media/AudioTrack;

    iget-object v5, v4, Lcom/dof100/morsenotifier/u;->b:[B

    iget-object v4, v4, Lcom/dof100/morsenotifier/u;->b:[B

    array-length v4, v4

    invoke-virtual {v2, v5, v11, v4}, Landroid/media/AudioTrack;->write([BII)I
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    return-object v3

    :catch_3
    const-string v2, "MyPlayerMorse.doInBackground ERROR mAudioTrack.write"

    invoke-static {v2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v2, v1, Lcom/dof100/morsenotifier/j;->y:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-object v3

    :catch_4
    const-string v2, "MyPlayerMorse.doInBackground AudioTrack.setPlaybackPositionUpdateListener->Exception"

    invoke-static {v2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v2, v1, Lcom/dof100/morsenotifier/j;->y:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-object v3

    :catch_5
    const-string v2, "MyPlayerMorse.doInBackground AudioTrack.setPlaybackPositionUpdateListener->IllegalStateException"

    invoke-static {v2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v2, v1, Lcom/dof100/morsenotifier/j;->y:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-object v3

    :catch_6
    const-string v2, "MyPlayerMorse.doInBackground AudioTrack.Play->Exception"

    invoke-static {v2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v2, v1, Lcom/dof100/morsenotifier/j;->y:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-object v3

    :catch_7
    const-string v2, "MyPlayerMorse.doInBackground AudioTrack.Play->IllegalStateException"

    invoke-static {v2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v2, v1, Lcom/dof100/morsenotifier/j;->y:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-object v3

    :catch_8
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "MyPlayerMorse.doInBackground. ERROR Creating audiotrack. Exception mstream=%d sr=%d channels=%d encoding=%d length=%d"

    new-array v9, v10, [Ljava/lang/Object;

    iget v10, v1, Lcom/dof100/morsenotifier/j;->h:I

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v9, v11

    iget v10, v1, Lcom/dof100/morsenotifier/j;->p:I

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v9, v7

    const/4 v7, 0x4

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v9, v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v9, v6

    iget-object v4, v4, Lcom/dof100/morsenotifier/u;->b:[B

    array-length v4, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v9, v7

    invoke-static {v2, v5, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v2, v1, Lcom/dof100/morsenotifier/j;->y:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-object v3

    :catch_9
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "MyPlayerMorse.doInBackground. ERROR Creating audiotrack. IllegalArgumentException mstream=%d sr=%d channels=%d encoding=%d length=%d"

    new-array v9, v10, [Ljava/lang/Object;

    iget v10, v1, Lcom/dof100/morsenotifier/j;->h:I

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v9, v11

    iget v10, v1, Lcom/dof100/morsenotifier/j;->p:I

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v9, v7

    const/4 v7, 0x4

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v9, v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v9, v6

    iget-object v4, v4, Lcom/dof100/morsenotifier/u;->b:[B

    array-length v4, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v9, v7

    invoke-static {v2, v5, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v2, v1, Lcom/dof100/morsenotifier/j;->y:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-object v3

    :catch_a
    const-string v2, "MyPlayerMorse.doInBackground ERROR Creating tone"

    invoke-static {v2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v2, v1, Lcom/dof100/morsenotifier/j;->y:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-object v3
.end method

.method a()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/dof100/morsenotifier/j;->x:Ljava/util/ArrayList;

    return-object v0
.end method

.method public a(Landroid/content/Context;)V
    .locals 7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MyPlayerMorse.playDone instance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/dof100/morsenotifier/j;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/dof100/morsenotifier/j;->m:Z

    if-nez v0, :cond_0

    const-string v0, "MyPlayerMorse.playDone ERROR mPlayInitOK = false"

    :goto_0
    invoke-static {p1, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_0
    iget v0, p0, Lcom/dof100/morsenotifier/j;->o:I

    iget v1, p0, Lcom/dof100/morsenotifier/j;->q:I

    mul-int v0, v0, v1

    add-int/lit16 v0, v0, 0x1388

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    cmp-long v4, v0, v2

    if-gez v4, :cond_1

    move-wide v0, v2

    :cond_1
    const-wide/32 v2, 0x1d4c0

    cmp-long v4, v0, v2

    if-lez v4, :cond_2

    move-wide v0, v2

    :cond_2
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "MyPlayerMorse.playDone Waiting to finish (max %d msec)"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    :try_start_0
    iget-object v2, p0, Lcom/dof100/morsenotifier/j;->y:Ljava/util/concurrent/CountDownLatch;

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v0, v1, v3}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-string v0, "MyPlayerMorse.playDone ERROR "

    invoke-static {p1, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    :goto_1
    const-string v0, "MyPlayerMorse.playDone Waiting OK"

    invoke-static {p1, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MyPlayerMorse.playDone unregistering broadcast receiver  instance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/dof100/morsenotifier/j;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {p1}, Landroid/support/v4/a/b;->a(Landroid/content/Context;)Landroid/support/v4/a/b;

    move-result-object v0

    iget-object v1, p0, Lcom/dof100/morsenotifier/j;->z:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/a/b;->a(Landroid/content/BroadcastReceiver;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MyPlayerMorse.playDone broadcasting finish  instance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/dof100/morsenotifier/j;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/dof100/morsenotifier/j;->u:Z

    if-nez v0, :cond_3

    invoke-static {p1}, Lcom/dof100/morsenotifier/App;->b(Landroid/content/Context;)V

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MyPlayerMorse.playDone deleting audiotrack  instance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/dof100/morsenotifier/j;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/j;->v:Landroid/media/AudioTrack;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    :try_start_2
    invoke-direct {p0}, Lcom/dof100/morsenotifier/j;->b()V

    iget-object v0, p0, Lcom/dof100/morsenotifier/j;->v:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V

    iget-object v0, p0, Lcom/dof100/morsenotifier/j;->v:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V

    iput-object v1, p0, Lcom/dof100/morsenotifier/j;->v:Landroid/media/AudioTrack;
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    iput-object v1, p0, Lcom/dof100/morsenotifier/j;->v:Landroid/media/AudioTrack;

    throw p1

    :catch_2
    :goto_3
    iput-object v1, p0, Lcom/dof100/morsenotifier/j;->v:Landroid/media/AudioTrack;

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MyPlayerMorse.playDone deleting context reference  instance="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/dof100/morsenotifier/j;->b:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/j;->a:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/dof100/morsenotifier/j;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->clear()V

    iput-object v1, p0, Lcom/dof100/morsenotifier/j;->a:Ljava/lang/ref/WeakReference;

    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MyPlayerMorse.playDone OUT instance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/dof100/morsenotifier/j;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0
.end method

.method public a(Landroid/content/Context;ZZZIIIIIIIILjava/lang/String;)V
    .locals 9

    move-object v0, p0

    move-object v1, p1

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "MyPlayerMorse.playInit inst=%d arepeat=%d"

    const/4 v4, 0x2

    new-array v5, v4, [Ljava/lang/Object;

    iget v6, v0, Lcom/dof100/morsenotifier/j;->b:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v7, 0x0

    aput-object v6, v5, v7

    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v8, 0x1

    aput-object v6, v5, v8

    invoke-static {v2, v3, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    move v2, p2

    iput-boolean v2, v0, Lcom/dof100/morsenotifier/j;->c:Z

    move v2, p3

    iput-boolean v2, v0, Lcom/dof100/morsenotifier/j;->d:Z

    move v2, p4

    iput-boolean v2, v0, Lcom/dof100/morsenotifier/j;->e:Z

    move v2, p5

    iput v2, v0, Lcom/dof100/morsenotifier/j;->f:I

    move v2, p6

    iput v2, v0, Lcom/dof100/morsenotifier/j;->g:I

    move/from16 v2, p9

    iput v2, v0, Lcom/dof100/morsenotifier/j;->h:I

    iget v2, v0, Lcom/dof100/morsenotifier/j;->h:I

    const/4 v3, 0x3

    const/4 v5, 0x4

    if-eq v2, v5, :cond_0

    iget v2, v0, Lcom/dof100/morsenotifier/j;->h:I

    if-eq v2, v3, :cond_0

    iget v2, v0, Lcom/dof100/morsenotifier/j;->h:I

    const/4 v5, 0x5

    if-eq v2, v5, :cond_0

    iget v2, v0, Lcom/dof100/morsenotifier/j;->h:I

    if-eq v2, v4, :cond_0

    iget v2, v0, Lcom/dof100/morsenotifier/j;->h:I

    if-eq v2, v8, :cond_0

    iput v3, v0, Lcom/dof100/morsenotifier/j;->h:I

    :cond_0
    move/from16 v2, p10

    iput v2, v0, Lcom/dof100/morsenotifier/j;->i:I

    iget v2, v0, Lcom/dof100/morsenotifier/j;->i:I

    const/16 v5, 0x64

    if-ge v2, v5, :cond_1

    iput v5, v0, Lcom/dof100/morsenotifier/j;->i:I

    :cond_1
    iget v2, v0, Lcom/dof100/morsenotifier/j;->i:I

    const/16 v6, 0x4e20

    if-le v2, v6, :cond_2

    iput v6, v0, Lcom/dof100/morsenotifier/j;->i:I

    :cond_2
    move/from16 v2, p11

    iput v2, v0, Lcom/dof100/morsenotifier/j;->j:I

    iget v2, v0, Lcom/dof100/morsenotifier/j;->j:I

    if-ge v2, v8, :cond_3

    iput v8, v0, Lcom/dof100/morsenotifier/j;->j:I

    :cond_3
    iget v2, v0, Lcom/dof100/morsenotifier/j;->j:I

    if-le v2, v5, :cond_4

    iput v5, v0, Lcom/dof100/morsenotifier/j;->j:I

    :cond_4
    move/from16 v2, p12

    iput v2, v0, Lcom/dof100/morsenotifier/j;->k:I

    iget v2, v0, Lcom/dof100/morsenotifier/j;->k:I

    const/16 v5, 0x31

    if-le v2, v5, :cond_5

    iput v5, v0, Lcom/dof100/morsenotifier/j;->k:I

    :cond_5
    iget v2, v0, Lcom/dof100/morsenotifier/j;->k:I

    if-gez v2, :cond_6

    iput v7, v0, Lcom/dof100/morsenotifier/j;->k:I

    :cond_6
    move-object/from16 v2, p13

    iput-object v2, v0, Lcom/dof100/morsenotifier/j;->l:Ljava/lang/String;

    iput-boolean v7, v0, Lcom/dof100/morsenotifier/j;->m:Z

    mul-int/lit8 v2, p7, 0x32

    const v5, 0xea60

    div-int v2, v5, v2

    iput v2, v0, Lcom/dof100/morsenotifier/j;->o:I

    iget v2, v0, Lcom/dof100/morsenotifier/j;->o:I

    const/16 v6, 0x1e

    if-ge v2, v6, :cond_7

    iput v6, v0, Lcom/dof100/morsenotifier/j;->o:I

    :cond_7
    iget v2, v0, Lcom/dof100/morsenotifier/j;->o:I

    const/16 v7, 0x4b0

    if-le v2, v7, :cond_8

    iput v7, v0, Lcom/dof100/morsenotifier/j;->o:I

    :cond_8
    iget v2, v0, Lcom/dof100/morsenotifier/j;->h:I

    invoke-static {v2}, Landroid/media/AudioTrack;->getNativeOutputSampleRate(I)I

    move-result v2

    iput v2, v0, Lcom/dof100/morsenotifier/j;->p:I

    iget v2, v0, Lcom/dof100/morsenotifier/j;->p:I

    if-gtz v2, :cond_9

    const/16 v2, 0x1f40

    iput v2, v0, Lcom/dof100/morsenotifier/j;->p:I

    :cond_9
    mul-int/lit8 v2, p8, 0x32

    div-int v2, v5, v2

    if-ge v2, v6, :cond_a

    const/16 v2, 0x1e

    :cond_a
    if-le v2, v7, :cond_b

    const/16 v2, 0x4b0

    :cond_b
    mul-int/lit8 v2, v2, 0x3

    iget v3, v0, Lcom/dof100/morsenotifier/j;->o:I

    div-int/2addr v2, v3

    iput v2, v0, Lcom/dof100/morsenotifier/j;->n:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/dof100/morsenotifier/j;->s:J

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MyPlayerMorse.playInit text="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lcom/dof100/morsenotifier/j;->l:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MyPlayerMorse.playInit pref_call_freq="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v0, Lcom/dof100/morsenotifier/j;->i:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MyPlayerMorse.playInit samplerate="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v0, Lcom/dof100/morsenotifier/j;->p:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MyPlayerMorse.playInit mdur="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v0, Lcom/dof100/morsenotifier/j;->o:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MyPlayerMorse.playInit mSpacesAfterChar="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v0, Lcom/dof100/morsenotifier/j;->n:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    const-string v2, "MyPlayerMorse.playInit Creating sequence"

    invoke-static {v1, v2}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    invoke-direct {v0}, Lcom/dof100/morsenotifier/j;->c()V

    iget-object v2, v0, Lcom/dof100/morsenotifier/j;->x:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    div-int/2addr v2, v4

    iput v2, v0, Lcom/dof100/morsenotifier/j;->q:I

    iget v2, v0, Lcom/dof100/morsenotifier/j;->p:I

    iget v3, v0, Lcom/dof100/morsenotifier/j;->o:I

    mul-int v2, v2, v3

    iget v3, v0, Lcom/dof100/morsenotifier/j;->q:I

    mul-int v2, v2, v3

    div-int/lit16 v2, v2, 0x3e8

    iput v2, v0, Lcom/dof100/morsenotifier/j;->r:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MyPlayerMorse.playInit nelements "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v0, Lcom/dof100/morsenotifier/j;->q:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    iget-boolean v2, v0, Lcom/dof100/morsenotifier/j;->d:Z

    if-eqz v2, :cond_c

    const-string v2, "MyPlayerMorse.playInit Initializing vibration"

    invoke-static {v1, v2}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    const-string v2, "vibrator"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Vibrator;

    iput-object v2, v0, Lcom/dof100/morsenotifier/j;->w:Landroid/os/Vibrator;

    :cond_c
    iput-boolean v8, v0, Lcom/dof100/morsenotifier/j;->m:Z

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MyPlayerMorse.playInit OUT instance="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v0, Lcom/dof100/morsenotifier/j;->b:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/j;->a([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method
