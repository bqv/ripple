.class public Lcom/dof100/morsenotifier/ServiceMain;
.super Landroid/app/IntentService;


# static fields
.field private static final a:[I


# instance fields
.field private A:Z

.field private B:I

.field private C:I

.field private D:I

.field private E:Z

.field private F:I

.field private G:Ljava/lang/String;

.field private H:I

.field private I:Z

.field private J:Z

.field private K:Z

.field private L:Z

.field private M:Z

.field private N:Ljava/lang/String;

.field private O:Ljava/lang/String;

.field private P:Ljava/lang/String;

.field private Q:I

.field private R:Z

.field private S:I

.field private T:Ljava/lang/String;

.field private U:I

.field private V:Z

.field private W:Z

.field private X:Z

.field private Y:Z

.field private Z:Z

.field private aA:Ljava/lang/String;

.field private aB:Ljava/lang/String;

.field private aC:Ljava/lang/String;

.field private aD:Ljava/lang/String;

.field private final aE:Ljava/util/Random;

.field private final aF:I

.field private final aG:Landroid/content/BroadcastReceiver;

.field private aa:Z

.field private ab:Ljava/lang/String;

.field private ac:Ljava/lang/String;

.field private ad:Ljava/lang/String;

.field private ae:I

.field private af:Z

.field private ag:I

.field private ah:Ljava/lang/String;

.field private ai:Ljava/lang/String;

.field private aj:Ljava/lang/String;

.field private ak:Ljava/lang/String;

.field private al:Ljava/lang/String;

.field private am:Ljava/lang/String;

.field private an:Z

.field private ao:Z

.field private ap:I

.field private final aq:[Z

.field private ar:Ljava/lang/String;

.field private as:Ljava/lang/String;

.field private at:I

.field private au:Z

.field private av:I

.field private aw:Z

.field private ax:I

.field private ay:Ljava/lang/String;

.field private az:Ljava/lang/String;

.field private b:Z

.field private c:Z

.field private d:I

.field private e:I

.field private f:Z

.field private g:Z

.field private h:I

.field private i:I

.field private j:Z

.field private k:I

.field private l:Z

.field private m:Ljava/lang/String;

.field private n:I

.field private o:I

.field private p:I

.field private q:Z

.field private r:Z

.field private s:I

.field private t:I

.field private u:I

.field private v:Z

.field private w:I

.field private x:I

.field private y:Z

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x5

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/dof100/morsenotifier/ServiceMain;->a:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x4
        0x3
        0x5
        0x2
        0x1
    .end array-data
.end method

.method public constructor <init>()V
    .locals 4

    const-string v0, "com.dof100.morsenotifier.ServiceMain"

    invoke-direct {p0, v0}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->b:Z

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->c:Z

    const/4 v1, 0x0

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->d:I

    iput v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->e:I

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->f:Z

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->g:Z

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->h:I

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->i:I

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->j:Z

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->k:I

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->l:Z

    const-string v2, "en_US"

    iput-object v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->m:Ljava/lang/String;

    const/16 v2, 0x64

    iput v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->n:I

    iput v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->o:I

    iput v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->p:I

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->q:Z

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->r:Z

    const/16 v3, 0x320

    iput v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->s:I

    iput v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->t:I

    const/16 v2, 0xa

    iput v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->u:I

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->v:Z

    iput v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->w:I

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->x:I

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->y:Z

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->z:Z

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->A:Z

    const v2, 0xffffff

    iput v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->B:I

    const v2, 0xffff00

    iput v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->C:I

    iput v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->D:I

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->E:Z

    const/4 v2, 0x4

    iput v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->F:I

    const-string v2, ""

    iput-object v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->G:Ljava/lang/String;

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->H:I

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->I:Z

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->J:Z

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->K:Z

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->L:Z

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->M:Z

    const-string v2, ""

    iput-object v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->N:Ljava/lang/String;

    const-string v2, ""

    iput-object v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->O:Ljava/lang/String;

    const-string v2, ""

    iput-object v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->P:Ljava/lang/String;

    iput v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->Q:I

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->R:Z

    const/4 v2, 0x3

    iput v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->S:I

    const-string v3, ""

    iput-object v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->T:Ljava/lang/String;

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->U:I

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->V:Z

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->W:Z

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->X:Z

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->Y:Z

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->Z:Z

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->aa:Z

    const-string v3, ""

    iput-object v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->ab:Ljava/lang/String;

    const-string v3, ""

    iput-object v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->ac:Ljava/lang/String;

    const-string v3, ""

    iput-object v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->ad:Ljava/lang/String;

    iput v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->ae:I

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->af:Z

    iput v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->ag:I

    const-string v3, ""

    iput-object v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->ah:Ljava/lang/String;

    const-string v3, ""

    iput-object v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->ai:Ljava/lang/String;

    const-string v3, ""

    iput-object v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->aj:Ljava/lang/String;

    const-string v3, ""

    iput-object v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->ak:Ljava/lang/String;

    const-string v3, ""

    iput-object v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->al:Ljava/lang/String;

    const-string v3, ""

    iput-object v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->am:Ljava/lang/String;

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->an:Z

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->ao:Z

    iput v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->ap:I

    const/16 v3, 0x18

    new-array v3, v3, [Z

    fill-array-data v3, :array_0

    iput-object v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->aq:[Z

    const-string v3, ""

    iput-object v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->ar:Ljava/lang/String;

    const-string v3, ""

    iput-object v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->as:Ljava/lang/String;

    iput v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->at:I

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->au:Z

    iput v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->av:I

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->aw:Z

    iput v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->ax:I

    const-string v0, ""

    iput-object v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->ay:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->az:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->aA:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->aB:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->aC:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->aD:Ljava/lang/String;

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->aE:Ljava/util/Random;

    iget-object v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->aE:Ljava/util/Random;

    const/16 v1, 0x2710

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    iput v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->aF:I

    new-instance v0, Lcom/dof100/morsenotifier/ServiceMain$1;

    invoke-direct {v0, p0}, Lcom/dof100/morsenotifier/ServiceMain$1;-><init>(Lcom/dof100/morsenotifier/ServiceMain;)V

    iput-object v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->aG:Landroid/content/BroadcastReceiver;

    return-void

    nop

    :array_0
    .array-data 1
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0, p1}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->b:Z

    iput-boolean p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->c:Z

    const/4 v0, 0x0

    iput v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->d:I

    iput p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->e:I

    iput-boolean p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->f:Z

    iput-boolean p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->g:Z

    iput v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->h:I

    iput v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->i:I

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->j:Z

    iput v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->k:I

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->l:Z

    const-string v1, "en_US"

    iput-object v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->m:Ljava/lang/String;

    const/16 v1, 0x64

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->n:I

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->o:I

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->p:I

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->q:Z

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->r:Z

    const/16 v2, 0x320

    iput v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->s:I

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->t:I

    const/16 v1, 0xa

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->u:I

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->v:Z

    iput p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->w:I

    iput v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->x:I

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->y:Z

    iput-boolean p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->z:Z

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->A:Z

    const v1, 0xffffff

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->B:I

    const v1, 0xffff00

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->C:I

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->D:I

    iput-boolean p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->E:Z

    const/4 v1, 0x4

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->F:I

    const-string v1, ""

    iput-object v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->G:Ljava/lang/String;

    iput v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->H:I

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->I:Z

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->J:Z

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->K:Z

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->L:Z

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->M:Z

    const-string v1, ""

    iput-object v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->N:Ljava/lang/String;

    const-string v1, ""

    iput-object v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->O:Ljava/lang/String;

    const-string v1, ""

    iput-object v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->P:Ljava/lang/String;

    iput p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->Q:I

    iput-boolean p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->R:Z

    const/4 v1, 0x3

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->S:I

    const-string v2, ""

    iput-object v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->T:Ljava/lang/String;

    iput v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->U:I

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->V:Z

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->W:Z

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->X:Z

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->Y:Z

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->Z:Z

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->aa:Z

    const-string v2, ""

    iput-object v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->ab:Ljava/lang/String;

    const-string v2, ""

    iput-object v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->ac:Ljava/lang/String;

    const-string v2, ""

    iput-object v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->ad:Ljava/lang/String;

    iput p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->ae:I

    iput-boolean p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->af:Z

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->ag:I

    const-string v2, ""

    iput-object v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->ah:Ljava/lang/String;

    const-string v2, ""

    iput-object v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->ai:Ljava/lang/String;

    const-string v2, ""

    iput-object v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->aj:Ljava/lang/String;

    const-string v2, ""

    iput-object v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->ak:Ljava/lang/String;

    const-string v2, ""

    iput-object v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->al:Ljava/lang/String;

    const-string v2, ""

    iput-object v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->am:Ljava/lang/String;

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->an:Z

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->ao:Z

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->ap:I

    const/16 v2, 0x18

    new-array v2, v2, [Z

    fill-array-data v2, :array_0

    iput-object v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->aq:[Z

    const-string v2, ""

    iput-object v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->ar:Ljava/lang/String;

    const-string v2, ""

    iput-object v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->as:Ljava/lang/String;

    iput p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->at:I

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->au:Z

    iput p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->av:I

    iput-boolean p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->aw:Z

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->ax:I

    const-string p1, ""

    iput-object p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->ay:Ljava/lang/String;

    const-string p1, ""

    iput-object p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->az:Ljava/lang/String;

    const-string p1, ""

    iput-object p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->aA:Ljava/lang/String;

    const-string p1, ""

    iput-object p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->aB:Ljava/lang/String;

    const-string p1, ""

    iput-object p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->aC:Ljava/lang/String;

    const-string p1, ""

    iput-object p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->aD:Ljava/lang/String;

    new-instance p1, Ljava/util/Random;

    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    iput-object p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->aE:Ljava/util/Random;

    iget-object p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->aE:Ljava/util/Random;

    const/16 v0, 0x2710

    invoke-virtual {p1, v0}, Ljava/util/Random;->nextInt(I)I

    move-result p1

    iput p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->aF:I

    new-instance p1, Lcom/dof100/morsenotifier/ServiceMain$1;

    invoke-direct {p1, p0}, Lcom/dof100/morsenotifier/ServiceMain$1;-><init>(Lcom/dof100/morsenotifier/ServiceMain;)V

    iput-object p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->aG:Landroid/content/BroadcastReceiver;

    return-void

    nop

    :array_0
    .array-data 1
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
    .end array-data
.end method

.method private a()V
    .locals 1

    const-string v0, "ServiceMain.alarm_init"

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {}, Lcom/dof100/morsenotifier/g;->b()V

    invoke-static {}, Lcom/dof100/morsenotifier/g;->a()V

    invoke-static {p0}, Lcom/dof100/morsenotifier/g;->a(Landroid/content/Context;)V

    sget-boolean v0, Lcom/dof100/morsenotifier/App;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ServiceMain;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/dof100/morsenotifier/App;->a(Landroid/content/Context;)Lcom/dof100/morsenotifier/l;

    :cond_0
    return-void
.end method

.method private a(IIZ)V
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p3

    iget-boolean v3, v0, Lcom/dof100/morsenotifier/ServiceMain;->ao:Z

    if-nez v3, :cond_0

    return-void

    :cond_0
    const-string v3, "ServiceMain.handleChime"

    invoke-static {v0, v3}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    const/16 v4, 0xb

    invoke-virtual {v3, v4}, Ljava/util/Calendar;->get(I)I

    move-result v5

    const/16 v6, 0xc

    invoke-virtual {v3, v6}, Ljava/util/Calendar;->get(I)I

    move-result v7

    invoke-virtual {v3}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v8

    if-gtz v1, :cond_1

    invoke-virtual {v3, v4}, Ljava/util/Calendar;->get(I)I

    move-result v3

    rem-int/lit8 v3, v3, 0x18

    goto :goto_0

    :cond_1
    move v3, v1

    :goto_0
    const/4 v4, 0x0

    const/4 v10, 0x1

    if-nez v2, :cond_2

    iget-object v11, v0, Lcom/dof100/morsenotifier/ServiceMain;->aq:[Z

    aget-boolean v11, v11, v3

    if-nez v11, :cond_2

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "ServiceMain.onHandleIntent (MSG_CHIME) Chime disabled for \"%02d:00\""

    new-array v5, v10, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v5, v4

    invoke-static {v1, v2, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_2
    const/4 v11, 0x4

    const/4 v12, 0x3

    const/4 v13, 0x2

    if-nez v2, :cond_3

    move/from16 v14, p2

    invoke-static {v5, v7, v1, v14}, Lcom/dof100/morsenotifier/v;->a(IIII)I

    move-result v15

    if-lt v15, v13, :cond_4

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "ServiceMain.onHandleIntent (MSG_CHIME) ERROR now=%02d:%02d reminder=%02d:%02d  dif=%d"

    const/4 v6, 0x5

    new-array v6, v6, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v6, v4

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v6, v10

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v6, v13

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v6, v12

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v6, v11

    invoke-static {v2, v3, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_3
    move/from16 v14, p2

    :cond_4
    if-nez v2, :cond_6

    invoke-static/range {p0 .. p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v15

    const-string v6, "chime_lasttime"

    const-wide/16 v12, 0x0

    invoke-interface {v15, v6, v12, v13}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v12

    sub-long v16, v8, v12

    const-wide/32 v12, 0x493e0

    cmp-long v6, v16, v12

    if-gez v6, :cond_5

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "ServiceMain.onHandleIntent (MSG_CHIME) ERROR Last time was less that 5 min ego. now=%02d:%02d reminder=%02d:%02d"

    new-array v6, v11, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v6, v4

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v6, v10

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v4, 0x2

    aput-object v1, v6, v4

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v4, 0x3

    aput-object v1, v6, v4

    invoke-static {v2, v3, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_5
    invoke-interface {v15}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v5, "chime_lasttime"

    invoke-interface {v1, v5, v8, v9}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_6
    const-string v1, ""

    iget v5, v0, Lcom/dof100/morsenotifier/ServiceMain;->at:I

    packed-switch v5, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "%d"

    new-array v6, v10, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v4

    invoke-static {v1, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :pswitch_1
    rem-int/lit8 v6, v3, 0xc

    if-nez v6, :cond_7

    const/16 v6, 0xc

    :cond_7
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "%d"

    new-array v7, v10, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v7, v4

    invoke-static {v1, v5, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :pswitch_2
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "%02d00"

    new-array v6, v10, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v4

    invoke-static {v1, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    sget-boolean v4, Lcom/dof100/morsenotifier/App;->d:Z

    if-eqz v4, :cond_8

    const/16 v4, 0x20

    invoke-static {v1, v4}, Lcom/dof100/morsenotifier/v;->a(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v1

    :cond_8
    :goto_1
    iget-object v4, v0, Lcom/dof100/morsenotifier/ServiceMain;->ar:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_9

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, v0, Lcom/dof100/morsenotifier/ServiceMain;->ar:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_9
    iget-object v4, v0, Lcom/dof100/morsenotifier/ServiceMain;->as:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_a

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v0, Lcom/dof100/morsenotifier/ServiceMain;->as:Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_a
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "ServiceMain.onHandleIntent (MSG_CHIME) hour="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "  format="

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v0, Lcom/dof100/morsenotifier/ServiceMain;->at:I

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " message:"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v3, Lcom/dof100/morsenotifier/ServiceMain;->a:[I

    iget v4, v0, Lcom/dof100/morsenotifier/ServiceMain;->ap:I

    aget v3, v3, v4

    invoke-direct {v0, v1, v3, v10, v2}, Lcom/dof100/morsenotifier/ServiceMain;->a(Ljava/lang/String;IIZ)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic a(Lcom/dof100/morsenotifier/ServiceMain;)V
    .locals 0

    invoke-direct {p0}, Lcom/dof100/morsenotifier/ServiceMain;->c()V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 11

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ServiceMain.contactInfoRetrieve Number="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/dof100/morsenotifier/ServiceMain;->b()V

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    :try_start_0
    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ServiceMain;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v10
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    sget-object v4, Landroid/provider/ContactsContract$PhoneLookup;->CONTENT_FILTER_URI:Landroid/net/Uri;

    invoke-static {p1}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    new-array v6, v0, [Ljava/lang/String;

    const-string p1, "display_name"

    aput-object p1, v6, v2

    const-string p1, "_id"

    aput-object p1, v6, v3

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v4, v10

    invoke-virtual/range {v4 .. v9}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    move-object v10, v1

    :goto_0
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    move-object p1, v1

    :goto_1
    if-nez p1, :cond_2

    const-string p1, "ServiceMain.contactInfoRetrieve c1=null"

    :goto_2
    invoke-static {p0, p1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_2
    :try_start_2
    const-string v4, "contactInfoRetrieve c1 try"

    invoke-static {p0, v4}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v4

    :goto_3
    if-eqz v4, :cond_7

    const-string v4, "contactInfoRetrieve c1.while inside"

    invoke-static {v4}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const-string v4, "_id"

    invoke-interface {p1, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    if-ltz v4, :cond_4

    invoke-interface {p1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    iput-object v4, p0, Lcom/dof100/morsenotifier/ServiceMain;->ay:Ljava/lang/String;

    :cond_3
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "ServiceMain.contactInfoRetrieve found curContactID = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/dof100/morsenotifier/ServiceMain;->ay:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {p0, v4}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_4

    :cond_4
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "contactInfoRetrieve curContactID not found c1.getColumnIndex(_ID) = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    :goto_4
    const-string v4, "display_name"

    invoke-interface {p1, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    if-ltz v4, :cond_6

    invoke-interface {p1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/dof100/morsenotifier/ServiceMain;->az:Ljava/lang/String;

    :cond_5
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "ServiceMain.contactInfoRetrieve found curContactDisplayName = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/dof100/morsenotifier/ServiceMain;->az:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {p0, v4}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_5

    :cond_6
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "contactInfoRetrieve c1.indexDisplayName="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    :goto_5
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_13

    :catch_2
    :try_start_3
    const-string v4, "ServiceMain.contactInfoRetrieve. c1 Exception"

    invoke-static {p0, v4}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_7
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    iget-object p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->ay:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_8

    const-string p1, "ServiceMain.contactInfoRetrieve curContactID.length() == 0"

    goto/16 :goto_2

    :cond_8
    const-string p1, "ServiceMain.contactInfoRetrieve. Now looking for FirstName, LastName"

    invoke-static {p0, p1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    :try_start_4
    sget-object v5, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    const-string v7, "mimetype = ? AND contact_id = ?"

    new-array v8, v0, [Ljava/lang/String;

    const-string p1, "vnd.android.cursor.item/name"

    aput-object p1, v8, v2

    iget-object p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->ay:Ljava/lang/String;

    aput-object p1, v8, v3

    const-string v9, "data2"

    const/4 v6, 0x0

    move-object v4, v10

    invoke-virtual/range {v4 .. v9}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_6

    :catch_3
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    move-object p1, v1

    :goto_6
    if-eqz p1, :cond_c

    :try_start_5
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v4

    :goto_7
    if-eqz v4, :cond_b

    const-string v4, "contactRetrieve c2.while"

    invoke-static {v4}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const-string v4, "data2"

    invoke-interface {p1, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {p1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_9

    iput-object v4, p0, Lcom/dof100/morsenotifier/ServiceMain;->aA:Ljava/lang/String;

    :cond_9
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "ServiceMain.contactInfoRetrieve. First name = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/dof100/morsenotifier/ServiceMain;->aA:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {p0, v4}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    const-string v4, "data3"

    invoke-interface {p1, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {p1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_a

    iput-object v4, p0, Lcom/dof100/morsenotifier/ServiceMain;->aB:Ljava/lang/String;

    :cond_a
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "ServiceMain.contactInfoRetrieve. Last name = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/dof100/morsenotifier/ServiceMain;->aB:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {p0, v4}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_7

    :cond_b
    :goto_8
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    goto :goto_a

    :catchall_1
    move-exception v0

    goto :goto_9

    :catch_4
    :try_start_6
    const-string v4, "ServiceMain.contactInfoRetrieve. c2 Exception"

    invoke-static {p0, v4}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_8

    :goto_9
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    throw v0

    :cond_c
    :goto_a
    const-string p1, "ServiceMain.contactInfoRetrieve. Now looking for NickName, Initials"

    invoke-static {p0, p1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    :try_start_7
    sget-object v5, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    const-string v7, "mimetype = ? AND contact_id = ?"

    new-array v8, v0, [Ljava/lang/String;

    const-string p1, "vnd.android.cursor.item/nickname"

    aput-object p1, v8, v2

    iget-object p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->ay:Ljava/lang/String;

    aput-object p1, v8, v3

    const/4 v6, 0x0

    const/4 v9, 0x0

    move-object v4, v10

    invoke-virtual/range {v4 .. v9}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5

    goto :goto_b

    :catch_5
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    move-object p1, v1

    :goto_b
    if-eqz p1, :cond_12

    :try_start_8
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    :goto_c
    if-eqz v0, :cond_11

    const-string v0, "contactRetrieve c3.while"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const-string v0, "data1"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    const-string v1, "data2"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "contactRetrieve tmpNickname  indexName="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "  indexType="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "contactRetrieve tmpNickname  Name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  Type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    if-nez v4, :cond_d

    const-string v4, ""

    :cond_d
    if-nez v5, :cond_e

    const-string v5, "1"

    :cond_e
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_10

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    if-lez v0, :cond_10

    :try_start_9
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0
    :try_end_9
    .catch Ljava/lang/NumberFormatException; {:try_start_9 .. :try_end_9} :catch_6
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_7
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    goto :goto_d

    :catch_6
    const/4 v0, 0x1

    :goto_d
    packed-switch v0, :pswitch_data_0

    goto :goto_f

    :pswitch_0
    :try_start_a
    iput-object v4, p0, Lcom/dof100/morsenotifier/ServiceMain;->aC:Ljava/lang/String;

    goto :goto_f

    :pswitch_1
    iget-object v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->aD:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_f

    :goto_e
    :pswitch_2
    iput-object v4, p0, Lcom/dof100/morsenotifier/ServiceMain;->aD:Ljava/lang/String;

    goto :goto_f

    :pswitch_3
    iget-object v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->aD:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_f

    goto :goto_e

    :cond_f
    :goto_f
    :pswitch_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ServiceMain.contactInfoRetrieve. curContactNickname = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->aD:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    :cond_10
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_7
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    goto/16 :goto_c

    :cond_11
    :goto_10
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    goto :goto_12

    :catchall_2
    move-exception v0

    goto :goto_11

    :catch_7
    :try_start_b
    const-string v0, "ServiceMain.contactInfoRetrieve. c3 Exception"

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    goto :goto_10

    :goto_11
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    throw v0

    :cond_12
    :goto_12
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "contactRetrieve curContactNickname="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->aD:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->aC:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_14

    const-string p1, "contactRetrieve Computing initials from firstname,lastname"

    invoke-static {p0, p1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->aA:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_13

    const-string p1, "contactRetrieve curContactFirstNameOK"

    invoke-static {p0, p1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->aA:Ljava/lang/String;

    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->aC:Ljava/lang/String;

    :cond_13
    iget-object p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->aB:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_14

    const-string p1, "contactRetrieve curContactLastNameOK"

    invoke-static {p0, p1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->aC:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->aB:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->aC:Ljava/lang/String;

    :cond_14
    iget-object p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->aC:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->aC:Ljava/lang/String;

    iget-object p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->aC:Ljava/lang/String;

    const-string v0, "."

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->aC:Ljava/lang/String;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "ServiceMain.contactInfoRetrieve. curContactInitials = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->aC:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_2

    :goto_13
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private a(Ljava/lang/String;IIIII)V
    .locals 12

    move-object v0, p0

    invoke-virtual {v0}, Lcom/dof100/morsenotifier/ServiceMain;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/dof100/morsenotifier/App;->a(Landroid/content/Context;)Lcom/dof100/morsenotifier/l;

    move-result-object v1

    invoke-virtual {v0}, Lcom/dof100/morsenotifier/ServiceMain;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    iget v4, v0, Lcom/dof100/morsenotifier/ServiceMain;->h:I

    iget-object v6, v0, Lcom/dof100/morsenotifier/ServiceMain;->m:Ljava/lang/String;

    move-object v2, v1

    move v5, p3

    move/from16 v7, p4

    move/from16 v8, p5

    move/from16 v9, p6

    move v10, p2

    move-object v11, p1

    invoke-virtual/range {v2 .. v11}, Lcom/dof100/morsenotifier/l;->a(Landroid/content/Context;IILjava/lang/String;IIIILjava/lang/String;)V

    invoke-virtual {v0}, Lcom/dof100/morsenotifier/ServiceMain;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/dof100/morsenotifier/l;->b(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/dof100/morsenotifier/ServiceMain;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/dof100/morsenotifier/l;->a(Landroid/content/Context;)V

    return-void
.end method

.method private a(Ljava/lang/String;IIIIIZZZZ)V
    .locals 16

    move-object/from16 v0, p0

    new-instance v15, Lcom/dof100/morsenotifier/j;

    invoke-virtual/range {p0 .. p0}, Lcom/dof100/morsenotifier/ServiceMain;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget v2, v0, Lcom/dof100/morsenotifier/ServiceMain;->aF:I

    invoke-direct {v15, v1, v2}, Lcom/dof100/morsenotifier/j;-><init>(Landroid/content/Context;I)V

    invoke-virtual/range {p0 .. p0}, Lcom/dof100/morsenotifier/ServiceMain;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    iget-boolean v5, v0, Lcom/dof100/morsenotifier/ServiceMain;->l:Z

    iget v6, v0, Lcom/dof100/morsenotifier/ServiceMain;->d:I

    iget-boolean v1, v0, Lcom/dof100/morsenotifier/ServiceMain;->j:Z

    if-eqz v1, :cond_0

    iget v1, v0, Lcom/dof100/morsenotifier/ServiceMain;->k:I

    move v9, v1

    goto :goto_0

    :cond_0
    move/from16 v9, p4

    :goto_0
    iget v13, v0, Lcom/dof100/morsenotifier/ServiceMain;->u:I

    move-object v1, v15

    move/from16 v3, p7

    move/from16 v4, p8

    move/from16 v7, p3

    move/from16 v8, p4

    move/from16 v10, p2

    move/from16 v11, p5

    move/from16 v12, p6

    move-object/from16 v14, p1

    invoke-virtual/range {v1 .. v14}, Lcom/dof100/morsenotifier/j;->a(Landroid/content/Context;ZZZIIIIIIIILjava/lang/String;)V

    if-eqz p9, :cond_1

    iget v1, v0, Lcom/dof100/morsenotifier/ServiceMain;->w:I

    packed-switch v1, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/dof100/morsenotifier/ActivityDisplayMessage;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const v2, 0x8000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/high16 v2, 0x10000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const-string v2, "PARAM_INSTANCE"

    iget v3, v0, Lcom/dof100/morsenotifier/ServiceMain;->aF:I

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v2, "PARAM_LIST"

    invoke-virtual {v15}, Lcom/dof100/morsenotifier/j;->a()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    const-string v2, "PARAM_DISPLAY_HOW"

    iget v3, v0, Lcom/dof100/morsenotifier/ServiceMain;->w:I

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v2, "PARAM_DISPLAY_POS"

    iget v3, v0, Lcom/dof100/morsenotifier/ServiceMain;->x:I

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v2, "PARAM_DISPLAY_STAYONTOP"

    iget-boolean v3, v0, Lcom/dof100/morsenotifier/ServiceMain;->y:Z

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v2, "PARAM_DISPLAY_TEXT"

    iget-boolean v3, v0, Lcom/dof100/morsenotifier/ServiceMain;->z:Z

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v2, "PARAM_DISPLAY_FLASH"

    iget-boolean v3, v0, Lcom/dof100/morsenotifier/ServiceMain;->A:Z

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v2, "PARAM_DISPLAY_COLOR"

    iget v3, v0, Lcom/dof100/morsenotifier/ServiceMain;->B:I

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v2, "PARAM_DISPLAY_COLOR_ME_HILIGHT"

    iget v3, v0, Lcom/dof100/morsenotifier/ServiceMain;->C:I

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v2, "PARAM_DISPLAY_COLOR_TEXT_HILIGHT"

    iget v3, v0, Lcom/dof100/morsenotifier/ServiceMain;->D:I

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v2, "PARAM_DISPLAY_INITIALDELAY"

    iget v3, v0, Lcom/dof100/morsenotifier/ServiceMain;->d:I

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v2, "PARAM_ENABLEDIALOGSETTINGS"

    xor-int/lit8 v3, p10, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v2, "PARAM_STOPMETHOD"

    iget v3, v0, Lcom/dof100/morsenotifier/ServiceMain;->e:I

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    :try_start_0
    invoke-virtual {v0, v1}, Lcom/dof100/morsenotifier/ServiceMain;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-string v1, "ServiceMain.play_message ERROR startActivity (ActivityDisplayMessage)"

    invoke-static {v0, v1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    :cond_1
    :goto_1
    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v15, v1}, Lcom/dof100/morsenotifier/j;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    invoke-virtual/range {p0 .. p0}, Lcom/dof100/morsenotifier/ServiceMain;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v15, v1}, Lcom/dof100/morsenotifier/j;->a(Landroid/content/Context;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private a(Ljava/lang/String;IIZ)V
    .locals 20

    move-object/from16 v11, p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ServiceMain.play_message: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " instance="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v11, Lcom/dof100/morsenotifier/ServiceMain;->aF:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v11, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v2, "s"

    sget-boolean v3, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v3, :cond_0

    iget v3, v11, Lcom/dof100/morsenotifier/ServiceMain;->i:I

    goto :goto_0

    :cond_0
    iget v3, v11, Lcom/dof100/morsenotifier/ServiceMain;->n:I

    :goto_0
    const/16 v4, 0xc8

    const/4 v5, 0x1

    invoke-static {v0, v2, v3, v5, v4}, Lcom/dof100/morsenotifier/v;->a(Ljava/lang/String;Ljava/lang/String;III)I

    move-result v4

    const-string v2, "v"

    sget-boolean v3, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v3, :cond_1

    iget v3, v11, Lcom/dof100/morsenotifier/ServiceMain;->t:I

    goto :goto_1

    :cond_1
    iget v3, v11, Lcom/dof100/morsenotifier/ServiceMain;->p:I

    :goto_1
    const/16 v6, 0x64

    const/4 v7, 0x0

    invoke-static {v0, v2, v3, v7, v6}, Lcom/dof100/morsenotifier/v;->a(Ljava/lang/String;Ljava/lang/String;III)I

    move-result v6

    const-string v2, "f"

    iget v3, v11, Lcom/dof100/morsenotifier/ServiceMain;->s:I

    const/16 v8, 0x61a8

    const/16 v9, 0xa

    invoke-static {v0, v2, v3, v9, v8}, Lcom/dof100/morsenotifier/v;->a(Ljava/lang/String;Ljava/lang/String;III)I

    move-result v8

    const-string v2, "r"

    move/from16 v3, p3

    invoke-static {v0, v2, v3, v5, v9}, Lcom/dof100/morsenotifier/v;->a(Ljava/lang/String;Ljava/lang/String;III)I

    move-result v3

    const-string v2, "p"

    iget v9, v11, Lcom/dof100/morsenotifier/ServiceMain;->o:I

    const/16 v12, 0x1e

    const/16 v13, 0x12c

    invoke-static {v0, v2, v9, v12, v13}, Lcom/dof100/morsenotifier/v;->a(Ljava/lang/String;Ljava/lang/String;III)I

    move-result v9

    const-string v2, "a"

    iget-boolean v12, v11, Lcom/dof100/morsenotifier/ServiceMain;->q:Z

    invoke-static {v0, v2, v12}, Lcom/dof100/morsenotifier/v;->a(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v12

    const-string v2, "b"

    iget-boolean v13, v11, Lcom/dof100/morsenotifier/ServiceMain;->r:Z

    invoke-static {v0, v2, v13}, Lcom/dof100/morsenotifier/v;->a(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v13

    const-string v2, "d"

    iget-boolean v14, v11, Lcom/dof100/morsenotifier/ServiceMain;->v:Z

    invoke-static {v0, v2, v14}, Lcom/dof100/morsenotifier/v;->a(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v14

    invoke-static/range {p1 .. p1}, Lcom/dof100/morsenotifier/v;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "ServiceMain.play_message message=%s stream=%d istest=%b "

    const/4 v15, 0x3

    new-array v5, v15, [Ljava/lang/Object;

    aput-object v1, v5, v7

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v17

    const/16 v16, 0x1

    aput-object v17, v5, v16

    invoke-static/range {p4 .. p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v17

    const/4 v15, 0x2

    aput-object v17, v5, v15

    invoke-static {v0, v2, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "ServiceMain.play_message speed=%d vol=%d freq=%d repeat=%d pitch=%d"

    const/4 v5, 0x5

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v17

    aput-object v17, v5, v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v17

    const/16 v16, 0x1

    aput-object v17, v5, v16

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v17

    aput-object v17, v5, v15

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v17

    const/4 v15, 0x3

    aput-object v17, v5, v15

    const/16 v17, 0x4

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v18

    aput-object v18, v5, v17

    invoke-static {v0, v2, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "ServiceMain.play_message Audio=%b Vibration=%b Display=%b"

    new-array v5, v15, [Ljava/lang/Object;

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    aput-object v15, v5, v7

    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    const/16 v16, 0x1

    aput-object v15, v5, v16

    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    const/16 v17, 0x2

    aput-object v15, v5, v17

    invoke-static {v0, v2, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    if-eqz p4, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x7f0c01be

    invoke-virtual {v11, v2}, Lcom/dof100/morsenotifier/ServiceMain;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v11, v0}, Lcom/dof100/morsenotifier/i;->b(Landroid/content/Context;Ljava/lang/String;)V

    :cond_2
    if-nez v12, :cond_3

    if-nez v13, :cond_3

    if-nez v14, :cond_3

    return-void

    :cond_3
    const-string v0, "phone"

    invoke-virtual {v11, v0}, Lcom/dof100/morsenotifier/ServiceMain;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getCallState()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_4

    const/4 v0, 0x1

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    :goto_2
    sget-boolean v2, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v2, :cond_5

    iget-boolean v2, v11, Lcom/dof100/morsenotifier/ServiceMain;->c:Z

    if-eqz v2, :cond_5

    if-nez p4, :cond_5

    if-eqz v0, :cond_5

    const-string v0, "ServiceMain.play_message: muted (in call)"

    invoke-static {v11, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Morse Notifier: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v11, v0}, Lcom/dof100/morsenotifier/i;->b(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_5
    sget-boolean v2, Lcom/dof100/morsenotifier/App;->d:Z

    if-eqz v2, :cond_6

    iget-boolean v2, v11, Lcom/dof100/morsenotifier/ServiceMain;->g:Z

    if-eqz v2, :cond_6

    if-nez p4, :cond_6

    if-eqz v0, :cond_6

    const-string v0, "ServiceMain.play_message: muted (in call)"

    invoke-static {v11, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Voice Notifier: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v11, v0}, Lcom/dof100/morsenotifier/i;->b(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    if-lt v0, v2, :cond_8

    const-string v0, "notification"

    invoke-virtual {v11, v0}, Lcom/dof100/morsenotifier/ServiceMain;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Landroid/app/NotificationManager;->getCurrentInterruptionFilter()I

    move-result v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "ServiceMain.play_message dnd state = "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    move v5, v0

    goto :goto_3

    :cond_7
    const-string v0, "ServiceMain.play_message dnd state = (cannot get)"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const/4 v5, 0x1

    :goto_3
    const/4 v0, 0x1

    goto :goto_4

    :cond_8
    const-string v0, "ServiceMain.play_message dnd state = (cannot get) Android ver<6.0"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v5, 0x1

    :goto_4
    if-eq v5, v0, :cond_9

    goto :goto_5

    :cond_9
    const/4 v0, 0x0

    :goto_5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "ServiceMain.play_message flagdnd = "

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    sget-boolean v2, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v2, :cond_a

    iget-boolean v2, v11, Lcom/dof100/morsenotifier/ServiceMain;->b:Z

    if-eqz v2, :cond_a

    if-nez p4, :cond_a

    if-eqz v0, :cond_a

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ServiceMain.play_message: muted (do not disturb) state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v11, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_a
    sget-boolean v2, Lcom/dof100/morsenotifier/App;->d:Z

    if-eqz v2, :cond_b

    iget-boolean v2, v11, Lcom/dof100/morsenotifier/ServiceMain;->f:Z

    if-eqz v2, :cond_b

    if-nez p4, :cond_b

    if-eqz v0, :cond_b

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ServiceMain.play_message: muted (do not disturb) state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v11, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_b
    sget-boolean v0, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v0, :cond_c

    move-object v0, v11

    move/from16 v2, p2

    move v5, v8

    move v7, v12

    move v8, v13

    move v9, v14

    move/from16 v10, p4

    invoke-direct/range {v0 .. v10}, Lcom/dof100/morsenotifier/ServiceMain;->a(Ljava/lang/String;IIIIIZZZZ)V

    goto :goto_6

    :cond_c
    move-object v0, v11

    move/from16 v2, p2

    move v5, v9

    invoke-direct/range {v0 .. v6}, Lcom/dof100/morsenotifier/ServiceMain;->a(Ljava/lang/String;IIIII)V

    :goto_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ServiceMain.play_message OUT instance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, v11, Lcom/dof100/morsenotifier/ServiceMain;->aF:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v11, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;IIZ)V
    .locals 6

    iget-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->au:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "ServiceMain.handleReminders"

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    const/16 v2, 0xc

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v0

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ServiceMain;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0c0016

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    const-string p1, "ServiceMain.onHandleIntent (MSG_REMINDERS_TESTONE)"

    invoke-static {p0, p1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    sget-object p1, Lcom/dof100/morsenotifier/ServiceMain;->a:[I

    iget p3, p0, Lcom/dof100/morsenotifier/ServiceMain;->av:I

    aget p1, p1, p3

    invoke-direct {p0, p2, p1, v3, p5}, Lcom/dof100/morsenotifier/ServiceMain;->a(Ljava/lang/String;IIZ)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ServiceMain;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f0c0014

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "ServiceMain.onHandleIntent (MSG_REMINDERS_TESTALL)"

    invoke-static {p0, p1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    new-instance p1, Lcom/dof100/morsenotifier/q;

    invoke-direct {p1, p0}, Lcom/dof100/morsenotifier/q;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Lcom/dof100/morsenotifier/q;->a()Lcom/dof100/morsenotifier/p;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/dof100/morsenotifier/p;->a()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lcom/dof100/morsenotifier/ServiceMain;->a:[I

    iget p3, p0, Lcom/dof100/morsenotifier/ServiceMain;->av:I

    aget p2, p2, p3

    :goto_0
    invoke-direct {p0, p1, p2, v3, p5}, Lcom/dof100/morsenotifier/ServiceMain;->a(Ljava/lang/String;IIZ)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ServiceMain;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f0c01bd

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lcom/dof100/morsenotifier/ServiceMain;->a:[I

    iget p3, p0, Lcom/dof100/morsenotifier/ServiceMain;->av:I

    aget p2, p2, p3

    goto :goto_0

    return-void

    :cond_3
    const-string p1, "ServiceMain.onHandleIntent (MSG_REMINDERS_FIRE)"

    invoke-static {p0, p1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {v1, v0, p3, p4}, Lcom/dof100/morsenotifier/v;->a(IIII)I

    move-result p1

    const/4 v2, 0x2

    if-lt p1, v2, :cond_4

    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string p5, "ServiceMain.onHandleIntent (MSG_REMINDERS) ERROR now=%02d:%02d reminder=%02d:%02d  dif=%d"

    const/4 v4, 0x5

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v4, v5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v4, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, v4, v2

    const/4 p3, 0x3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    aput-object p4, v4, p3

    const/4 p3, 0x4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v4, p3

    invoke-static {p2, p5, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_4
    sget-object p1, Lcom/dof100/morsenotifier/ServiceMain;->a:[I

    iget p3, p0, Lcom/dof100/morsenotifier/ServiceMain;->av:I

    aget p1, p1, p3

    invoke-direct {p0, p2, p1, v3, p5}, Lcom/dof100/morsenotifier/ServiceMain;->a(Ljava/lang/String;IIZ)V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 5

    iget-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->R:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "ServiceMain.handleSMS"

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/dof100/morsenotifier/ServiceMain;->b()V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-direct {p0, p1}, Lcom/dof100/morsenotifier/ServiceMain;->a(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->ay:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->T:Ljava/lang/String;

    const-string v2, ""

    iget-boolean v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->V:Z

    if-nez v3, :cond_3

    iget-boolean v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->W:Z

    if-nez v3, :cond_3

    iget-boolean v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->X:Z

    if-nez v3, :cond_3

    iget-boolean v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->Y:Z

    if-nez v3, :cond_3

    iget-boolean v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->Z:Z

    if-eqz v3, :cond_a

    :cond_3
    iget-boolean v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->V:Z

    if-eqz v3, :cond_4

    iget-object v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->az:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->az:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_4
    iget-boolean v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->W:Z

    if-eqz v3, :cond_5

    iget-object v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->aA:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_5

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->aA:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_5
    iget-boolean v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->X:Z

    if-eqz v3, :cond_6

    iget-object v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->aB:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_6

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->aB:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_6
    iget-boolean v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->Y:Z

    if-eqz v3, :cond_7

    iget-object v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->aC:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_7

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->aC:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_7
    iget-boolean v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->Z:Z

    if-eqz v3, :cond_8

    iget-object v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->aD:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_8

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->aD:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_8
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    if-eqz v0, :cond_9

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_9
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->ac:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_a
    :goto_1
    const-string v2, ""

    iget v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->U:I

    const/4 v4, 0x3

    sparse-switch v3, :sswitch_data_0

    goto :goto_4

    :sswitch_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-lt v3, v4, :cond_b

    if-nez v0, :cond_b

    goto :goto_2

    :sswitch_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lt v0, v4, :cond_b

    :goto_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v4

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    :sswitch_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-ltz v3, :cond_b

    if-nez v0, :cond_b

    goto :goto_3

    :sswitch_3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-ltz v0, :cond_b

    :goto_3
    move-object v0, p1

    goto :goto_5

    :cond_b
    :goto_4
    move-object v0, v2

    :goto_5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_d

    sget-boolean p1, Lcom/dof100/morsenotifier/App;->d:Z

    if-eqz p1, :cond_c

    const/16 p1, 0x20

    invoke-static {v0, p1}, Lcom/dof100/morsenotifier/v;->a(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    :cond_c
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_6
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_7

    :cond_d
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_e

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->ad:Ljava/lang/String;

    goto :goto_6

    :cond_e
    :goto_7
    iget-boolean p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->aa:Z

    if-eqz p1, :cond_f

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_f

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_f
    iget-object p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->ab:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_10

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lcom/dof100/morsenotifier/ServiceMain;->ab:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_10
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    if-nez p2, :cond_11

    const-string p1, "sms"

    :cond_11
    sget-object p2, Lcom/dof100/morsenotifier/ServiceMain;->a:[I

    iget v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->S:I

    aget p2, p2, v0

    iget v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->ae:I

    invoke-direct {p0, p1, p2, v0, p3}, Lcom/dof100/morsenotifier/ServiceMain;->a(Ljava/lang/String;IIZ)V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_3
        0x2 -> :sswitch_2
        0xb -> :sswitch_1
        0xc -> :sswitch_0
    .end sparse-switch
.end method

.method private a(Ljava/lang/String;Z)V
    .locals 5

    iget-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->E:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "ServiceMain.handleCall"

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/dof100/morsenotifier/ServiceMain;->b()V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-direct {p0, p1}, Lcom/dof100/morsenotifier/ServiceMain;->a(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->ay:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->G:Ljava/lang/String;

    const-string v2, ""

    iget-boolean v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->I:Z

    if-nez v3, :cond_3

    iget-boolean v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->J:Z

    if-nez v3, :cond_3

    iget-boolean v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->K:Z

    if-nez v3, :cond_3

    iget-boolean v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->L:Z

    if-nez v3, :cond_3

    iget-boolean v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->M:Z

    if-eqz v3, :cond_a

    :cond_3
    iget-boolean v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->I:Z

    if-eqz v3, :cond_4

    iget-object v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->az:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->az:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_4
    iget-boolean v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->J:Z

    if-eqz v3, :cond_5

    iget-object v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->aA:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_5

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->aA:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_5
    iget-boolean v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->K:Z

    if-eqz v3, :cond_6

    iget-object v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->aB:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_6

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->aB:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_6
    iget-boolean v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->L:Z

    if-eqz v3, :cond_7

    iget-object v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->aC:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_7

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->aC:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_7
    iget-boolean v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->M:Z

    if-eqz v3, :cond_8

    iget-object v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->aD:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_8

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->aD:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_8
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    if-eqz v0, :cond_9

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_9
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->O:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_a
    :goto_1
    const-string v2, ""

    iget v3, p0, Lcom/dof100/morsenotifier/ServiceMain;->H:I

    const/4 v4, 0x3

    sparse-switch v3, :sswitch_data_0

    goto :goto_4

    :sswitch_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-lt v3, v4, :cond_b

    if-nez v0, :cond_b

    goto :goto_2

    :sswitch_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lt v0, v4, :cond_b

    :goto_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v4

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    :sswitch_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-ltz v3, :cond_b

    if-nez v0, :cond_b

    goto :goto_3

    :sswitch_3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-ltz v0, :cond_b

    :goto_3
    move-object v0, p1

    goto :goto_5

    :cond_b
    :goto_4
    move-object v0, v2

    :goto_5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_d

    sget-boolean p1, Lcom/dof100/morsenotifier/App;->d:Z

    if-eqz p1, :cond_c

    const/16 p1, 0x20

    invoke-static {v0, p1}, Lcom/dof100/morsenotifier/v;->a(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    :cond_c
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_6
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_7

    :cond_d
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_e

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->P:Ljava/lang/String;

    goto :goto_6

    :cond_e
    :goto_7
    iget-object p1, p0, Lcom/dof100/morsenotifier/ServiceMain;->N:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_f

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->N:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_f
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_10

    const-string p1, "Call"

    :cond_10
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ServiceMain.onHandleIntent (MSG_CALL_RINGING) curText = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v0, Lcom/dof100/morsenotifier/ServiceMain;->a:[I

    iget v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->F:I

    aget v0, v0, v1

    iget v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->Q:I

    invoke-direct {p0, p1, v0, v1, p2}, Lcom/dof100/morsenotifier/ServiceMain;->a(Ljava/lang/String;IIZ)V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_3
        0x2 -> :sswitch_2
        0xb -> :sswitch_1
        0xc -> :sswitch_0
    .end sparse-switch
.end method

.method private b()V
    .locals 1

    const-string v0, ""

    iput-object v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->ay:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->az:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->aA:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->aB:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->aC:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->aD:Ljava/lang/String;

    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 3

    iget-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->af:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "ServiceMain.handleSystem"

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    const-string v0, ""

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ServiceMain;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c001e

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-direct {p0}, Lcom/dof100/morsenotifier/ServiceMain;->a()V

    goto/16 :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ServiceMain;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c0021

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ServiceMain;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f0c01bd

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ServiceMain;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c001f

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->ah:Ljava/lang/String;

    goto/16 :goto_1

    :cond_3
    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ServiceMain;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c0020

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->ai:Ljava/lang/String;

    goto/16 :goto_1

    :cond_4
    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ServiceMain;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c001c

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->aj:Ljava/lang/String;

    goto :goto_1

    :cond_5
    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ServiceMain;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c001d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->ak:Ljava/lang/String;

    goto :goto_1

    :cond_6
    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ServiceMain;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c0022

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->am:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->an:Z

    if-eqz v0, :cond_7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_7
    const-string p2, ""

    :goto_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_8
    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ServiceMain;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v1, 0x7f0c0023

    invoke-virtual {p2, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    iget-object v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->al:Ljava/lang/String;

    :cond_9
    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_a

    return-void

    :cond_a
    sget-object p1, Lcom/dof100/morsenotifier/ServiceMain;->a:[I

    iget p2, p0, Lcom/dof100/morsenotifier/ServiceMain;->ag:I

    aget p1, p1, p2

    const/4 p2, 0x1

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/dof100/morsenotifier/ServiceMain;->a(Ljava/lang/String;IIZ)V

    return-void
.end method

.method private b(Ljava/lang/String;Z)V
    .locals 2

    iget-boolean v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->aw:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "ServiceMain.handleApps"

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    const p1, 0x7f0c01bd

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ServiceMain;->getString(I)Ljava/lang/String;

    move-result-object p1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_2

    return-void

    :cond_2
    sget-object p2, Lcom/dof100/morsenotifier/ServiceMain;->a:[I

    iget v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->ax:I

    aget p2, p2, v0

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/dof100/morsenotifier/ServiceMain;->a(Ljava/lang/String;IIZ)V

    return-void
.end method

.method private c()V
    .locals 10

    const-string v0, "ServiceMain.pref_init"

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v3, "pref_morse_general_dnd"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_0

    const-string v1, "_morsedef"

    :goto_0
    move-object v5, v1

    goto :goto_1

    :cond_0
    const-string v1, "_voicedef"

    goto :goto_0

    :goto_1
    const-string v6, "_def"

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->b:Z

    const-string v3, "pref_morse_general_muteincalls"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_1

    const-string v1, "_morsedef"

    :goto_2
    move-object v5, v1

    goto :goto_3

    :cond_1
    const-string v1, "_voicedef"

    goto :goto_2

    :goto_3
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->c:Z

    const-string v3, "pref_morse_general_initialdelay"

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_2

    const-string v1, "_morsedef"

    :goto_4
    move-object v5, v1

    goto :goto_5

    :cond_2
    const-string v1, "_voicedef"

    goto :goto_4

    :goto_5
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->c(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->d:I

    const-string v3, "pref_morse_general_volumedownstop"

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_3

    const-string v1, "_morsedef"

    :goto_6
    move-object v5, v1

    goto :goto_7

    :cond_3
    const-string v1, "_voicedef"

    goto :goto_6

    :goto_7
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->c(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->e:I

    const-string v3, "pref_voice_general_dnd"

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_4

    const-string v1, "_morsedef"

    :goto_8
    move-object v5, v1

    goto :goto_9

    :cond_4
    const-string v1, "_voicedef"

    goto :goto_8

    :goto_9
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->f:Z

    const-string v3, "pref_voice_general_muteincalls"

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_5

    const-string v1, "_morsedef"

    :goto_a
    move-object v5, v1

    goto :goto_b

    :cond_5
    const-string v1, "_voicedef"

    goto :goto_a

    :goto_b
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->g:Z

    const-string v3, "pref_voice_general_initialdelay"

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_6

    const-string v1, "_morsedef"

    :goto_c
    move-object v5, v1

    goto :goto_d

    :cond_6
    const-string v1, "_voicedef"

    goto :goto_c

    :goto_d
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->c(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->h:I

    const-string v3, "pref_morse_wpm"

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_7

    const-string v1, "_morsedef"

    :goto_e
    move-object v5, v1

    goto :goto_f

    :cond_7
    const-string v1, "_voicedef"

    goto :goto_e

    :goto_f
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->c(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->i:I

    const-string v3, "pref_morse_farnsworth_enable"

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_8

    const-string v1, "_morsedef"

    :goto_10
    move-object v5, v1

    goto :goto_11

    :cond_8
    const-string v1, "_voicedef"

    goto :goto_10

    :goto_11
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->j:Z

    const-string v3, "pref_morse_farnsworth_wpm"

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_9

    const-string v1, "_morsedef"

    :goto_12
    move-object v5, v1

    goto :goto_13

    :cond_9
    const-string v1, "_voicedef"

    goto :goto_12

    :goto_13
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->c(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->k:I

    const-string v3, "pref_morse_punctuation"

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_a

    const-string v1, "_morsedef"

    :goto_14
    move-object v5, v1

    goto :goto_15

    :cond_a
    const-string v1, "_voicedef"

    goto :goto_14

    :goto_15
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->l:Z

    const-string v3, "pref_voice_locale"

    const-string v4, "pref_general_locale"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_b

    const-string v1, "_morsedef"

    :goto_16
    move-object v5, v1

    goto :goto_17

    :cond_b
    const-string v1, "_voicedef"

    goto :goto_16

    :goto_17
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->b(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->m:Ljava/lang/String;

    const-string v3, "pref_voice_speed"

    const-string v4, "pref_general_speechrate"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_c

    const-string v1, "_morsedef"

    :goto_18
    move-object v5, v1

    goto :goto_19

    :cond_c
    const-string v1, "_voicedef"

    goto :goto_18

    :goto_19
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->c(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->n:I

    const-string v3, "pref_voice_pitch"

    const-string v4, "pref_general_pitch"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_d

    const-string v1, "_morsedef"

    :goto_1a
    move-object v5, v1

    goto :goto_1b

    :cond_d
    const-string v1, "_voicedef"

    goto :goto_1a

    :goto_1b
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->c(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->o:I

    const-string v3, "pref_voice_vol"

    const-string v4, "pref_general_volume"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_e

    const-string v1, "_morsedef"

    :goto_1c
    move-object v5, v1

    goto :goto_1d

    :cond_e
    const-string v1, "_voicedef"

    goto :goto_1c

    :goto_1d
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->c(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->p:I

    const-string v3, "pref_audio_enable"

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_f

    const-string v1, "_morsedef"

    :goto_1e
    move-object v5, v1

    goto :goto_1f

    :cond_f
    const-string v1, "_voicedef"

    goto :goto_1e

    :goto_1f
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->q:Z

    const-string v3, "pref_audio_vibration_enable"

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_10

    const-string v1, "_morsedef"

    :goto_20
    move-object v5, v1

    goto :goto_21

    :cond_10
    const-string v1, "_voicedef"

    goto :goto_20

    :goto_21
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->r:Z

    const-string v3, "pref_audio_freq"

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_11

    const-string v1, "_morsedef"

    :goto_22
    move-object v5, v1

    goto :goto_23

    :cond_11
    const-string v1, "_voicedef"

    goto :goto_22

    :goto_23
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->c(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->s:I

    const-string v3, "pref_audio_vol"

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_12

    const-string v1, "_morsedef"

    :goto_24
    move-object v5, v1

    goto :goto_25

    :cond_12
    const-string v1, "_voicedef"

    goto :goto_24

    :goto_25
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->c(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->t:I

    const-string v3, "pref_audio_ramp"

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_13

    const-string v1, "_morsedef"

    :goto_26
    move-object v5, v1

    goto :goto_27

    :cond_13
    const-string v1, "_voicedef"

    goto :goto_26

    :goto_27
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->c(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->u:I

    const-string v3, "pref_display_enable"

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_14

    const-string v1, "_morsedef"

    :goto_28
    move-object v5, v1

    goto :goto_29

    :cond_14
    const-string v1, "_voicedef"

    goto :goto_28

    :goto_29
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->v:Z

    const-string v3, "pref_display_how"

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_15

    const-string v1, "_morsedef"

    :goto_2a
    move-object v5, v1

    goto :goto_2b

    :cond_15
    const-string v1, "_voicedef"

    goto :goto_2a

    :goto_2b
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->c(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->w:I

    const-string v3, "pref_display_pos"

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_16

    const-string v1, "_morsedef"

    :goto_2c
    move-object v5, v1

    goto :goto_2d

    :cond_16
    const-string v1, "_voicedef"

    goto :goto_2c

    :goto_2d
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->c(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->x:I

    const-string v3, "pref_display_stayontop"

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_17

    const-string v1, "_morsedef"

    :goto_2e
    move-object v5, v1

    goto :goto_2f

    :cond_17
    const-string v1, "_voicedef"

    goto :goto_2e

    :goto_2f
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->y:Z

    const-string v3, "pref_display_text"

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_18

    const-string v1, "_morsedef"

    :goto_30
    move-object v5, v1

    goto :goto_31

    :cond_18
    const-string v1, "_voicedef"

    goto :goto_30

    :goto_31
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->z:Z

    const-string v3, "pref_display_flash"

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_19

    const-string v1, "_morsedef"

    :goto_32
    move-object v5, v1

    goto :goto_33

    :cond_19
    const-string v1, "_voicedef"

    goto :goto_32

    :goto_33
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->A:Z

    const-string v3, "pref_display_color"

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_1a

    const-string v1, "_morsedef"

    :goto_34
    move-object v5, v1

    goto :goto_35

    :cond_1a
    const-string v1, "_voicedef"

    goto :goto_34

    :goto_35
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->e(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->B:I

    const-string v3, "pref_display_color_me_highlight"

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_1b

    const-string v1, "_morsedef"

    :goto_36
    move-object v5, v1

    goto :goto_37

    :cond_1b
    const-string v1, "_voicedef"

    goto :goto_36

    :goto_37
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->e(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->C:I

    const-string v3, "pref_display_color_text_highlight"

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_1c

    const-string v1, "_morsedef"

    :goto_38
    move-object v5, v1

    goto :goto_39

    :cond_1c
    const-string v1, "_voicedef"

    goto :goto_38

    :goto_39
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->e(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->D:I

    const-string v3, "pref_call_enable"

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_1d

    const-string v1, "_morsedef"

    :goto_3a
    move-object v5, v1

    goto :goto_3b

    :cond_1d
    const-string v1, "_voicedef"

    goto :goto_3a

    :goto_3b
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->E:Z

    const-string v3, "pref_call_stream"

    const-string v4, "pref_call_e1pro_stream"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_1e

    const-string v1, "_morsedef"

    :goto_3c
    move-object v5, v1

    goto :goto_3d

    :cond_1e
    const-string v1, "_voicedef"

    goto :goto_3c

    :goto_3d
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->c(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->F:I

    const-string v3, "pref_call_string1"

    const-string v4, "pref_call_e1pro_string1"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_1f

    const-string v1, "_morsedef"

    :goto_3e
    move-object v5, v1

    goto :goto_3f

    :cond_1f
    const-string v1, "_voicedef"

    goto :goto_3e

    :goto_3f
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->b(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->G:Ljava/lang/String;

    const-string v3, "pref_call_num"

    const-string v4, "pref_call_e1pro_num"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_20

    const-string v1, "_morsedef"

    :goto_40
    move-object v5, v1

    goto :goto_41

    :cond_20
    const-string v1, "_voicedef"

    goto :goto_40

    :goto_41
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->c(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->H:I

    const-string v3, "pref_call_contactdisplayname"

    const-string v4, "pref_call_e1pro_contactdisplayname"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_21

    const-string v1, "_morsedef"

    :goto_42
    move-object v5, v1

    goto :goto_43

    :cond_21
    const-string v1, "_voicedef"

    goto :goto_42

    :goto_43
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->I:Z

    const-string v3, "pref_call_contactfirstname"

    const-string v4, "pref_call_e1pro_contactfirstname"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_22

    const-string v1, "_morsedef"

    :goto_44
    move-object v5, v1

    goto :goto_45

    :cond_22
    const-string v1, "_voicedef"

    goto :goto_44

    :goto_45
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->J:Z

    const-string v3, "pref_call_contactlastname"

    const-string v4, "pref_call_e1pro_contactlastname"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_23

    const-string v1, "_morsedef"

    :goto_46
    move-object v5, v1

    goto :goto_47

    :cond_23
    const-string v1, "_voicedef"

    goto :goto_46

    :goto_47
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->K:Z

    const-string v3, "pref_call_contactinitials"

    const-string v4, "pref_call_e1pro_contactinitials"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_24

    const-string v1, "_morsedef"

    :goto_48
    move-object v5, v1

    goto :goto_49

    :cond_24
    const-string v1, "_voicedef"

    goto :goto_48

    :goto_49
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->L:Z

    const-string v3, "pref_call_contactnickname"

    const-string v4, "pref_call_e1pro_contactnickname"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_25

    const-string v1, "_morsedef"

    :goto_4a
    move-object v5, v1

    goto :goto_4b

    :cond_25
    const-string v1, "_voicedef"

    goto :goto_4a

    :goto_4b
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->M:Z

    const-string v3, "pref_call_string2"

    const-string v4, "pref_call_e1pro_string2"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_26

    const-string v1, "_morsedef"

    :goto_4c
    move-object v5, v1

    goto :goto_4d

    :cond_26
    const-string v1, "_voicedef"

    goto :goto_4c

    :goto_4d
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->b(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->N:Ljava/lang/String;

    const-string v3, "pref_call_contactname_none"

    const-string v4, "pref_call_e1pro_contactname_none"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_27

    const-string v1, "_morsedef"

    :goto_4e
    move-object v5, v1

    goto :goto_4f

    :cond_27
    const-string v1, "_voicedef"

    goto :goto_4e

    :goto_4f
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->b(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->O:Ljava/lang/String;

    const-string v3, "pref_call_num_none"

    const-string v4, "pref_call_e1pro_num_none"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_28

    const-string v1, "_morsedef"

    :goto_50
    move-object v5, v1

    goto :goto_51

    :cond_28
    const-string v1, "_voicedef"

    goto :goto_50

    :goto_51
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->b(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->P:Ljava/lang/String;

    const-string v3, "pref_call_repeat"

    const-string v4, "pref_call_e1pro_repeat"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_29

    const-string v1, "_morsedef"

    :goto_52
    move-object v5, v1

    goto :goto_53

    :cond_29
    const-string v1, "_voicedef"

    goto :goto_52

    :goto_53
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->c(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->Q:I

    const-string v3, "pref_sms_enable"

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_2a

    const-string v1, "_morsedef"

    :goto_54
    move-object v5, v1

    goto :goto_55

    :cond_2a
    const-string v1, "_voicedef"

    goto :goto_54

    :goto_55
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->R:Z

    const-string v3, "pref_sms_stream"

    const-string v4, "pref_sms_e1pro_stream"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_2b

    const-string v1, "_morsedef"

    :goto_56
    move-object v5, v1

    goto :goto_57

    :cond_2b
    const-string v1, "_voicedef"

    goto :goto_56

    :goto_57
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->c(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->S:I

    const-string v3, "pref_sms_string1"

    const-string v4, "pref_sms_e1pro_string1"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_2c

    const-string v1, "_morsedef"

    :goto_58
    move-object v5, v1

    goto :goto_59

    :cond_2c
    const-string v1, "_voicedef"

    goto :goto_58

    :goto_59
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->b(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->T:Ljava/lang/String;

    const-string v3, "pref_sms_num"

    const-string v4, "pref_sms_e1pro_num"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_2d

    const-string v1, "_morsedef"

    :goto_5a
    move-object v5, v1

    goto :goto_5b

    :cond_2d
    const-string v1, "_voicedef"

    goto :goto_5a

    :goto_5b
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->c(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->U:I

    const-string v3, "pref_sms_contactdisplayname"

    const-string v4, "pref_sms_e1pro_contactdisplayname"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_2e

    const-string v1, "_morsedef"

    :goto_5c
    move-object v5, v1

    goto :goto_5d

    :cond_2e
    const-string v1, "_voicedef"

    goto :goto_5c

    :goto_5d
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->V:Z

    const-string v3, "pref_sms_contactfirstname"

    const-string v4, "pref_sms_e1pro_contactfirstname"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_2f

    const-string v1, "_morsedef"

    :goto_5e
    move-object v5, v1

    goto :goto_5f

    :cond_2f
    const-string v1, "_voicedef"

    goto :goto_5e

    :goto_5f
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->W:Z

    const-string v3, "pref_sms_contactlastname"

    const-string v4, "pref_sms_e1pro_contactlastname"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_30

    const-string v1, "_morsedef"

    :goto_60
    move-object v5, v1

    goto :goto_61

    :cond_30
    const-string v1, "_voicedef"

    goto :goto_60

    :goto_61
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->X:Z

    const-string v3, "pref_sms_contactinitials"

    const-string v4, "pref_sms_e1pro_contactinitials"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_31

    const-string v1, "_morsedef"

    :goto_62
    move-object v5, v1

    goto :goto_63

    :cond_31
    const-string v1, "_voicedef"

    goto :goto_62

    :goto_63
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->Y:Z

    const-string v3, "pref_sms_contactnickname"

    const-string v4, "pref_sms_e1pro_contactnickname"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_32

    const-string v1, "_morsedef"

    :goto_64
    move-object v5, v1

    goto :goto_65

    :cond_32
    const-string v1, "_voicedef"

    goto :goto_64

    :goto_65
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->Z:Z

    const-string v3, "pref_sms_text"

    const-string v4, "pref_sms_e1pro_text"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_33

    const-string v1, "_morsedef"

    :goto_66
    move-object v5, v1

    goto :goto_67

    :cond_33
    const-string v1, "_voicedef"

    goto :goto_66

    :goto_67
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->aa:Z

    const-string v3, "pref_sms_string2"

    const-string v4, "pref_sms_e1pro_string2"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_34

    const-string v1, "_morsedef"

    :goto_68
    move-object v5, v1

    goto :goto_69

    :cond_34
    const-string v1, "_voicedef"

    goto :goto_68

    :goto_69
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->b(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->ab:Ljava/lang/String;

    const-string v3, "pref_sms_contactname_none"

    const-string v4, "pref_sms_e1pro_contactname_none"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_35

    const-string v1, "_morsedef"

    :goto_6a
    move-object v5, v1

    goto :goto_6b

    :cond_35
    const-string v1, "_voicedef"

    goto :goto_6a

    :goto_6b
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->b(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->ac:Ljava/lang/String;

    const-string v3, "pref_sms_num_none"

    const-string v4, "pref_sms_e1pro_num_none"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_36

    const-string v1, "_morsedef"

    :goto_6c
    move-object v5, v1

    goto :goto_6d

    :cond_36
    const-string v1, "_voicedef"

    goto :goto_6c

    :goto_6d
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->b(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->ad:Ljava/lang/String;

    const-string v3, "pref_sms_repeat"

    const-string v4, "pref_sms_e1pro_repeat"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_37

    const-string v1, "_morsedef"

    :goto_6e
    move-object v5, v1

    goto :goto_6f

    :cond_37
    const-string v1, "_voicedef"

    goto :goto_6e

    :goto_6f
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->c(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->ae:I

    const-string v3, "pref_system_enable"

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_38

    const-string v1, "_morsedef"

    :goto_70
    move-object v5, v1

    goto :goto_71

    :cond_38
    const-string v1, "_voicedef"

    goto :goto_70

    :goto_71
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->af:Z

    const-string v3, "pref_system_stream"

    const-string v4, "pref_system_e1pro_stream"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_39

    const-string v1, "_morsedef"

    :goto_72
    move-object v5, v1

    goto :goto_73

    :cond_39
    const-string v1, "_voicedef"

    goto :goto_72

    :goto_73
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->c(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->ag:I

    const-string v3, "pref_system_powerconectedstring"

    const-string v4, "pref_system_e1pro_powerconectedstring"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_3a

    const-string v1, "_morsedef"

    :goto_74
    move-object v5, v1

    goto :goto_75

    :cond_3a
    const-string v1, "_voicedef"

    goto :goto_74

    :goto_75
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->b(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->ah:Ljava/lang/String;

    const-string v3, "pref_system_powerdisconectedstring"

    const-string v4, "pref_system_e1pro_powerdisconectedstring"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_3b

    const-string v1, "_morsedef"

    :goto_76
    move-object v5, v1

    goto :goto_77

    :cond_3b
    const-string v1, "_voicedef"

    goto :goto_76

    :goto_77
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->b(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->ai:Ljava/lang/String;

    const-string v3, "pref_system_batterylowstring"

    const-string v4, "pref_system_e1pro_batterylowstring"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_3c

    const-string v1, "_morsedef"

    :goto_78
    move-object v5, v1

    goto :goto_79

    :cond_3c
    const-string v1, "_voicedef"

    goto :goto_78

    :goto_79
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->b(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->aj:Ljava/lang/String;

    const-string v3, "pref_system_batteryokstring"

    const-string v4, "pref_system_e1pro_batteryokstring"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_3d

    const-string v1, "_morsedef"

    :goto_7a
    move-object v5, v1

    goto :goto_7b

    :cond_3d
    const-string v1, "_voicedef"

    goto :goto_7a

    :goto_7b
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->b(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->ak:Ljava/lang/String;

    const-string v3, "pref_system_wifi_disconnectedstring"

    const-string v4, "pref_system_e1pro_wifi_disconnectedstring"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_3e

    const-string v1, "_morsedef"

    :goto_7c
    move-object v5, v1

    goto :goto_7d

    :cond_3e
    const-string v1, "_voicedef"

    goto :goto_7c

    :goto_7d
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->b(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->al:Ljava/lang/String;

    const-string v3, "pref_system_wifi_connectedstring"

    const-string v4, "pref_system_e1pro_wifi_connectedstring"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_3f

    const-string v1, "_morsedef"

    :goto_7e
    move-object v5, v1

    goto :goto_7f

    :cond_3f
    const-string v1, "_voicedef"

    goto :goto_7e

    :goto_7f
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->b(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->am:Ljava/lang/String;

    const-string v3, "pref_system_wifi_connectedssid"

    const-string v4, "pref_system_e1pro_wifi_connectedssid"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_40

    const-string v1, "_morsedef"

    :goto_80
    move-object v5, v1

    goto :goto_81

    :cond_40
    const-string v1, "_voicedef"

    goto :goto_80

    :goto_81
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->an:Z

    const-string v3, "pref_apps_enable"

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_41

    const-string v1, "_morsedef"

    :goto_82
    move-object v5, v1

    goto :goto_83

    :cond_41
    const-string v1, "_voicedef"

    goto :goto_82

    :goto_83
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->aw:Z

    const-string v3, "pref_apps_stream"

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_42

    const-string v1, "_morsedef"

    :goto_84
    move-object v5, v1

    goto :goto_85

    :cond_42
    const-string v1, "_voicedef"

    goto :goto_84

    :goto_85
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->c(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->ax:I

    const-string v3, "pref_chime_enable"

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_43

    const-string v1, "_morsedef"

    :goto_86
    move-object v5, v1

    goto :goto_87

    :cond_43
    const-string v1, "_voicedef"

    goto :goto_86

    :goto_87
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->ao:Z

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_88
    const/16 v1, 0x18

    if-ge v8, v1, :cond_45

    iget-object v9, p0, Lcom/dof100/morsenotifier/ServiceMain;->aq:[Z

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "pref_chime_hourenable_%02d"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v7

    invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_44

    const-string v1, "_morsedef"

    :goto_89
    move-object v5, v1

    goto :goto_8a

    :cond_44
    const-string v1, "_voicedef"

    goto :goto_89

    :goto_8a
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    aput-boolean v1, v9, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_88

    :cond_45
    const-string v3, "pref_chime_stream"

    const-string v4, "pref_chime_e1pro_stream"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_46

    const-string v1, "_morsedef"

    :goto_8b
    move-object v5, v1

    goto :goto_8c

    :cond_46
    const-string v1, "_voicedef"

    goto :goto_8b

    :goto_8c
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->c(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->ap:I

    const-string v3, "pref_chime_string1"

    const-string v4, "pref_chime_e1pro_string1"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_47

    const-string v1, "_morsedef"

    :goto_8d
    move-object v5, v1

    goto :goto_8e

    :cond_47
    const-string v1, "_voicedef"

    goto :goto_8d

    :goto_8e
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->b(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->ar:Ljava/lang/String;

    const-string v3, "pref_chime_string2"

    const-string v4, "pref_chime_e1pro_string2"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_48

    const-string v1, "_morsedef"

    :goto_8f
    move-object v5, v1

    goto :goto_90

    :cond_48
    const-string v1, "_voicedef"

    goto :goto_8f

    :goto_90
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->b(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->as:Ljava/lang/String;

    const-string v3, "pref_chime_timehow"

    const-string v4, "pref_chime_e1pro_timehow"

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_49

    const-string v1, "_morsedef"

    :goto_91
    move-object v5, v1

    goto :goto_92

    :cond_49
    const-string v1, "_voicedef"

    goto :goto_91

    :goto_92
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->c(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->at:I

    const-string v3, "pref_reminders_enable"

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_4a

    const-string v1, "_morsedef"

    :goto_93
    move-object v5, v1

    goto :goto_94

    :cond_4a
    const-string v1, "_voicedef"

    goto :goto_93

    :goto_94
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->d(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ServiceMain;->au:Z

    const-string v3, "pref_reminders_stream"

    const/4 v4, 0x0

    sget-boolean v1, Lcom/dof100/morsenotifier/App;->c:Z

    if-eqz v1, :cond_4b

    const-string v1, "_morsedef"

    :goto_95
    move-object v5, v1

    goto :goto_96

    :cond_4b
    const-string v1, "_voicedef"

    goto :goto_95

    :goto_96
    const-string v6, "_def"

    move-object v1, p0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lcom/dof100/morsenotifier/v;->c(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->av:I

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const-string p1, "ServiceMain.onBind"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public onCreate()V
    .locals 1

    invoke-super {p0}, Landroid/app/IntentService;->onCreate()V

    const-string v0, "ServiceMain.OnCreate"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    const-string v0, "ServiceMain.OnDestroy"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/IntentService;->onDestroy()V

    return-void
.end method

.method protected onHandleIntent(Landroid/content/Intent;)V
    .locals 11

    const-string v0, "-----------------------------------------------------------------------------------------"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const-string v0, "ServiceMain.onHandleIntent"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const-string v0, "ServiceMain.onCreate registering broadcast receiver"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-static {p0}, Landroid/support/v4/a/b;->a(Landroid/content/Context;)Landroid/support/v4/a/b;

    move-result-object v0

    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    const-string v2, "LBR_ACTION_SETTINGSCHANGED"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/dof100/morsenotifier/ServiceMain;->aG:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v2, v1}, Landroid/support/v4/a/b;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    invoke-direct {p0}, Lcom/dof100/morsenotifier/ServiceMain;->c()V

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ServiceMain;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0c0024

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    move-object v2, v0

    goto :goto_1

    :cond_0
    const-string v0, ""

    goto :goto_0

    :goto_1
    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ServiceMain;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0c000b

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_1
    const-string v0, ""

    :goto_2
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ServiceMain;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f0c000c

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :cond_2
    const-string v1, ""

    :goto_3
    const/4 v3, -0x1

    const/4 v4, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ServiceMain;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f0c0009

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    goto :goto_4

    :cond_3
    const/4 v5, 0x0

    :goto_4
    if-eqz p1, :cond_4

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ServiceMain;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f0c000a

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v6, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    goto :goto_5

    :cond_4
    const/4 p1, 0x0

    :goto_5
    if-nez v0, :cond_5

    const-string v0, ""

    :cond_5
    move-object v3, v0

    if-nez v1, :cond_6

    const-string v1, ""

    :cond_6
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "ServiceMain.onHandleIntent What=%s extraT1=%s extraT2=%s extraI1=%d extraI2=%d"

    const/4 v7, 0x5

    new-array v8, v7, [Ljava/lang/Object;

    aput-object v2, v8, v4

    const/4 v4, 0x1

    aput-object v3, v8, v4

    const/4 v9, 0x2

    aput-object v1, v8, v9

    const/4 v9, 0x3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v8, v9

    const/4 v9, 0x4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v8, v9

    invoke-static {v0, v6, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    const-string v0, "_TEST"

    invoke-virtual {v2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_7

    const-string v0, "ServiceMain.onHandleIntent isTest=true"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    :cond_7
    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ServiceMain;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v8, 0x7f0c0012

    invoke-virtual {v0, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    const p1, 0x7f0c01bd

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ServiceMain;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, v7, v4, v4}, Lcom/dof100/morsenotifier/ServiceMain;->a(Ljava/lang/String;IIZ)V

    goto/16 :goto_6

    :cond_8
    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ServiceMain;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f0c000e

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-direct {p0}, Lcom/dof100/morsenotifier/ServiceMain;->a()V

    goto/16 :goto_6

    :cond_9
    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ServiceMain;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f0c0011

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    const-string p1, "ServiceMain.onHandleIntent MSG_MN_STOP"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    goto/16 :goto_6

    :cond_a
    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ServiceMain;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f0c0003

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-direct {p0, v3, v6}, Lcom/dof100/morsenotifier/ServiceMain;->a(Ljava/lang/String;Z)V

    goto/16 :goto_6

    :cond_b
    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ServiceMain;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f0c0017

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-direct {p0, v3, v1, v6}, Lcom/dof100/morsenotifier/ServiceMain;->a(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_6

    :cond_c
    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ServiceMain;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f0c001b

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-direct {p0, v2, v1, v6}, Lcom/dof100/morsenotifier/ServiceMain;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_6

    :cond_d
    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ServiceMain;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f0c0006

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-direct {p0, v5, p1, v6}, Lcom/dof100/morsenotifier/ServiceMain;->a(IIZ)V

    goto :goto_6

    :cond_e
    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ServiceMain;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f0c0013

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    move-object v1, p0

    move v4, v5

    move v5, p1

    invoke-direct/range {v1 .. v6}, Lcom/dof100/morsenotifier/ServiceMain;->a(Ljava/lang/String;Ljava/lang/String;IIZ)V

    goto :goto_6

    :cond_f
    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ServiceMain;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const/high16 v0, 0x7f0c0000

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_10

    invoke-direct {p0, v1, v6}, Lcom/dof100/morsenotifier/ServiceMain;->b(Ljava/lang/String;Z)V

    :cond_10
    :goto_6
    const-string p1, "ServiceMain.onHandleIntent unregistering local BroadcastReceiver"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-static {p0}, Landroid/support/v4/a/b;->a(Landroid/content/Context;)Landroid/support/v4/a/b;

    move-result-object p1

    iget-object v0, p0, Lcom/dof100/morsenotifier/ServiceMain;->aG:Landroid/content/BroadcastReceiver;

    invoke-virtual {p1, v0}, Landroid/support/v4/a/b;->a(Landroid/content/BroadcastReceiver;)V

    const-string p1, "ServiceMain.onHandleIntent OUT"

    invoke-static {p0, p1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    const-string p1, "-----------------------------------------------------------------------------------------"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-void
.end method
