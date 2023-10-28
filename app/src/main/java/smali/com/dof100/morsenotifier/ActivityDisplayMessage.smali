.class public Lcom/dof100/morsenotifier/ActivityDisplayMessage;
.super Landroid/app/Activity;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:I

.field private b:Z

.field private c:I

.field private d:I

.field private e:Z

.field private f:Z

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:I

.field private l:Landroid/opengl/GLSurfaceView;

.field private m:Lcom/dof100/morsenotifier/s;

.field private n:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private o:J

.field private p:J

.field private q:J

.field private final r:Landroid/content/BroadcastReceiver;

.field private final s:Landroid/os/Handler;

.field private final t:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->a:I

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->b:Z

    iput v1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->c:I

    iput v0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->d:I

    iput-boolean v1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->e:Z

    iput-boolean v0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->f:Z

    const v2, 0xffffff

    iput v2, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->g:I

    const v2, 0xffff00

    iput v2, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->h:I

    const/high16 v2, 0xff0000

    iput v2, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->i:I

    iput v0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->j:I

    iput v1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->k:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->l:Landroid/opengl/GLSurfaceView;

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->m:Lcom/dof100/morsenotifier/s;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->n:Ljava/util/ArrayList;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->o:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->p:J

    iput-wide v0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->q:J

    new-instance v0, Lcom/dof100/morsenotifier/ActivityDisplayMessage$1;

    invoke-direct {v0, p0}, Lcom/dof100/morsenotifier/ActivityDisplayMessage$1;-><init>(Lcom/dof100/morsenotifier/ActivityDisplayMessage;)V

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->r:Landroid/content/BroadcastReceiver;

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->s:Landroid/os/Handler;

    new-instance v0, Lcom/dof100/morsenotifier/ActivityDisplayMessage$2;

    invoke-direct {v0, p0}, Lcom/dof100/morsenotifier/ActivityDisplayMessage$2;-><init>(Lcom/dof100/morsenotifier/ActivityDisplayMessage;)V

    iput-object v0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->t:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic a(Lcom/dof100/morsenotifier/ActivityDisplayMessage;J)J
    .locals 0

    iput-wide p1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->o:J

    return-wide p1
.end method

.method static synthetic a(Lcom/dof100/morsenotifier/ActivityDisplayMessage;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->n:Ljava/util/ArrayList;

    return-object p0
.end method

.method private a()V
    .locals 2

    const-string v0, "ActivityDisplayMessage.action_finish"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->l:Landroid/opengl/GLSurfaceView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/opengl/GLSurfaceView;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->finish()V

    return-void
.end method

.method private b()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ActivityDisplayMessage.action_hide  instance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->l:Landroid/opengl/GLSurfaceView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/opengl/GLSurfaceView;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->finish()V

    return-void
.end method

.method static synthetic b(Lcom/dof100/morsenotifier/ActivityDisplayMessage;)V
    .locals 0

    invoke-direct {p0}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->a()V

    return-void
.end method

.method static synthetic c(Lcom/dof100/morsenotifier/ActivityDisplayMessage;)Lcom/dof100/morsenotifier/s;
    .locals 0

    iget-object p0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->m:Lcom/dof100/morsenotifier/s;

    return-object p0
.end method

.method private c()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ActivityDisplayMessage.action_configure  instance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/dof100/morsenotifier/App;->b(Landroid/content/Context;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/dof100/morsenotifier/ActivityMain;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->startActivity(Landroid/content/Intent;)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->l:Landroid/opengl/GLSurfaceView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/opengl/GLSurfaceView;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->finish()V

    return-void
.end method

.method static synthetic d(Lcom/dof100/morsenotifier/ActivityDisplayMessage;)Landroid/opengl/GLSurfaceView;
    .locals 0

    iget-object p0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->l:Landroid/opengl/GLSurfaceView;

    return-object p0
.end method

.method static synthetic e(Lcom/dof100/morsenotifier/ActivityDisplayMessage;)I
    .locals 0

    iget p0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->a:I

    return p0
.end method

.method static synthetic f(Lcom/dof100/morsenotifier/ActivityDisplayMessage;)J
    .locals 2

    iget-wide v0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->o:J

    return-wide v0
.end method

.method static synthetic g(Lcom/dof100/morsenotifier/ActivityDisplayMessage;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->s:Landroid/os/Handler;

    return-object p0
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    const-string v0, "ActivityDisplayMessage.onClick"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    const-string p1, "ActivityDisplayMessage.onClick  other"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-void

    :pswitch_0
    const-string p1, "ActivityDisplayMessage.onClick btn_stop"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/dof100/morsenotifier/App;->b(Landroid/content/Context;)V

    invoke-direct {p0}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->a()V

    return-void

    :pswitch_1
    const-string p1, "ActivityDisplayMessage.onClick btn_hide"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->b()V

    return-void

    :pswitch_2
    const-string p1, "ActivityDisplayMessage.onClick btn_configure"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->c()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x7f070013
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 11

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    const-string v2, "PARAM_INSTANCE"

    invoke-virtual {p1, v2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->a:I

    const-string v2, "PARAM_LIST"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getIntegerArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    iput-object v2, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->n:Ljava/util/ArrayList;

    const-string v2, "PARAM_ENABLEDIALOGSETTINGS"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->b:Z

    const-string v2, "PARAM_DISPLAY_HOW"

    invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->c:I

    const-string v2, "PARAM_DISPLAY_POS"

    invoke-virtual {p1, v2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->d:I

    const-string v2, "PARAM_DISPLAY_TEXT"

    invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->e:Z

    const-string v2, "PARAM_DISPLAY_FLASH"

    invoke-virtual {p1, v2, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->f:Z

    const-string v2, "PARAM_DISPLAY_COLOR"

    const v3, 0xffffff

    invoke-virtual {p1, v2, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->g:I

    const-string v2, "PARAM_DISPLAY_COLOR_ME_HILIGHT"

    const v3, 0xffff00

    invoke-virtual {p1, v2, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->h:I

    const-string v2, "PARAM_DISPLAY_COLOR_TEXT_HILIGHT"

    const/high16 v3, 0xff0000

    invoke-virtual {p1, v2, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->i:I

    const-string v2, "PARAM_DISPLAY_INITIALDELAY"

    invoke-virtual {p1, v2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->j:I

    const-string v2, "PARAM_STOPMETHOD"

    invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->k:I

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ActivityDisplayMessage.onCreate instance="

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->a:I

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    new-instance p1, Landroid/graphics/Point;

    invoke-direct {p1}, Landroid/graphics/Point;-><init>()V

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v2

    const/16 v3, 0x64

    const/16 v4, 0x140

    if-eqz v2, :cond_1

    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    :try_start_0
    invoke-virtual {v2, p1}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-string v2, "ActivityDisplayMessage.onCreate ERROR try tmpDisplay.getSize"

    goto :goto_0

    :cond_1
    const-string v2, "ActivityDisplayMessage.onCreate ERROR getWindowManager=null"

    :goto_0
    invoke-static {p0, v2}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {p1, v4, v3}, Landroid/graphics/Point;->set(II)V

    :goto_1
    :try_start_1
    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->getWindow()Landroid/view/Window;

    move-result-object v2

    if-eqz v2, :cond_2

    iget v3, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->d:I

    packed-switch v3, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    const-string v3, "ActivityDisplayMessage.onCreate setGravity(BOTTOM)"

    invoke-static {v3}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const/16 v3, 0x50

    invoke-virtual {v2, v3}, Landroid/view/Window;->setGravity(I)V

    goto :goto_2

    :pswitch_1
    const-string v3, "ActivityDisplayMessage.onCreate setGravity(CENTER)"

    invoke-static {v3}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const/16 v3, 0x11

    invoke-virtual {v2, v3}, Landroid/view/Window;->setGravity(I)V

    goto :goto_2

    :pswitch_2
    const-string v3, "ActivityDisplayMessage.onCreate setGravity(TOP)"

    invoke-static {v3}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const/16 v3, 0x30

    invoke-virtual {v2, v3}, Landroid/view/Window;->setGravity(I)V

    :goto_2
    iget v3, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->c:I

    packed-switch v3, :pswitch_data_1

    goto :goto_3

    :pswitch_3
    invoke-virtual {p0, v1}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->requestWindowFeature(I)Z

    const v3, 0x106000d

    invoke-virtual {v2, v3}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    const/4 v3, -0x3

    invoke-virtual {v2, v3}, Landroid/view/Window;->setFormat(I)V

    const v3, 0x40030

    invoke-virtual {v2, v3}, Landroid/view/Window;->addFlags(I)V

    invoke-virtual {v2}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v3

    iget p1, p1, Landroid/graphics/Point;->x:I

    iput p1, v3, Landroid/view/WindowManager$LayoutParams;->width:I

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ActivityDisplayMessage.onCreate (scroll) params.width ="

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v3, Landroid/view/WindowManager$LayoutParams;->width:I

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    goto :goto_3

    :pswitch_4
    const-string p1, "ActivityDisplayMessage.onCreate (window)"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    const/16 p1, 0x100

    invoke-virtual {v2, p1}, Landroid/view/Window;->setType(I)V

    goto :goto_3

    :cond_2
    const-string p1, "ActivityDisplayMessage.onCreate ERROR getWindow=null"

    invoke-static {p0, p1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    const-string p1, "ActivityDisplayMessage.onCreate ERROR try getwindow"

    invoke-static {p0, p1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    :goto_3
    invoke-virtual {p0, v0}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->setFinishOnTouchOutside(Z)V

    const p1, 0x7f090004

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->setContentView(I)V

    const p1, 0x7f070045

    invoke-virtual {p0, p1}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    const v0, 0x7f070013

    invoke-virtual {p0, v0}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    const v2, 0x7f070015

    invoke-virtual {p0, v2}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    const v3, 0x7f070014

    invoke-virtual {p0, v3}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    const v4, 0x7f070039

    invoke-virtual {p0, v4}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/opengl/GLSurfaceView;

    iput-object v4, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->l:Landroid/opengl/GLSurfaceView;

    :try_start_2
    iget v4, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->c:I

    const/16 v5, 0x8

    if-ne v4, v1, :cond_4

    iget-boolean p1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->b:Z

    if-nez p1, :cond_3

    invoke-virtual {v0, v5}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_4

    :cond_3
    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_4
    invoke-virtual {v2, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v3, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_5

    :cond_4
    invoke-virtual {p1, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    invoke-virtual {v0, v5}, Landroid/widget/Button;->setVisibility(I)V

    invoke-virtual {v2, v5}, Landroid/widget/Button;->setVisibility(I)V

    invoke-virtual {v3, v5}, Landroid/widget/Button;->setVisibility(I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_5

    :catch_2
    const-string p1, "ActivityDisplayMessage.onCreate ERROR try setVisibility, setOnClickListener"

    invoke-static {p0, p1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    :goto_5
    :try_start_3
    new-instance p1, Lcom/dof100/morsenotifier/s;

    iget-object v3, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->n:Ljava/util/ArrayList;

    iget v4, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->c:I

    iget-boolean v5, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->e:Z

    iget-boolean v6, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->f:Z

    iget v7, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->g:I

    iget v8, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->h:I

    iget v9, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->i:I

    iget v10, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->j:I

    move-object v2, p1

    invoke-direct/range {v2 .. v10}, Lcom/dof100/morsenotifier/s;-><init>(Ljava/util/ArrayList;IZZIIII)V

    iput-object p1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->m:Lcom/dof100/morsenotifier/s;

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->l:Landroid/opengl/GLSurfaceView;

    invoke-virtual {p1, v1}, Landroid/opengl/GLSurfaceView;->setZOrderOnTop(Z)V

    iget-object v2, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->l:Landroid/opengl/GLSurfaceView;

    const/16 v3, 0x8

    const/16 v4, 0x8

    const/16 v5, 0x8

    const/16 v6, 0x8

    const/16 v7, 0x10

    const/4 v8, 0x0

    invoke-virtual/range {v2 .. v8}, Landroid/opengl/GLSurfaceView;->setEGLConfigChooser(IIIIII)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->l:Landroid/opengl/GLSurfaceView;

    invoke-virtual {p1}, Landroid/opengl/GLSurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    invoke-interface {p1, v1}, Landroid/view/SurfaceHolder;->setFormat(I)V

    iget-object p1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->l:Landroid/opengl/GLSurfaceView;

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->m:Lcom/dof100/morsenotifier/s;

    invoke-virtual {p1, v0}, Landroid/opengl/GLSurfaceView;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_6

    :catch_3
    const-string p1, "ActivityDisplayMessage.onCreate ERROR try setRenderer"

    invoke-static {p0, p1}, Lcom/dof100/morsenotifier/i;->a(Landroid/content/Context;Ljava/lang/String;)V

    :goto_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->o:J

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "ActivityDisplayMessage.onCreate OUT instance="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->a:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_3
    .end packed-switch
.end method

.method public onDestroy()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ActivityDisplayMessage.onDestroy  instance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 8

    const-string v0, "ActivityDisplayMessage.onKeyDown"

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x7d0

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/16 v7, 0x19

    if-ne p1, v7, :cond_2

    iput-wide v0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->q:J

    iget p1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->k:I

    const/4 p2, 0x1

    if-eq p1, p2, :cond_1

    iget p1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->k:I

    const/4 p2, 0x2

    if-eq p1, p2, :cond_1

    iget p1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->k:I

    if-eq p1, v4, :cond_1

    iget p1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->k:I

    if-ne p1, v6, :cond_0

    iget-wide p1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->p:J

    sub-long v6, v0, p1

    cmp-long p1, v6, v2

    if-gez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "ActivityDisplayMessage.onKeyDown (no BRVolume) KEYCODE_VOLUME_DOWN"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return v5

    :cond_1
    :goto_0
    const-string p1, "ActivityDisplayMessage.onKeyDown (no BRVolume) KEYCODE_VOLUME_DOWN Broadcasting Finish"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/dof100/morsenotifier/App;->b(Landroid/content/Context;)V

    invoke-direct {p0}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->a()V

    return v5

    :cond_2
    const/16 v7, 0x18

    if-ne p1, v7, :cond_5

    iput-wide v0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->p:J

    iget p1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->k:I

    if-eq p1, v4, :cond_4

    iget p1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->k:I

    if-ne p1, v6, :cond_3

    iget-wide p1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->q:J

    sub-long v6, v0, p1

    cmp-long p1, v6, v2

    if-gez p1, :cond_3

    goto :goto_1

    :cond_3
    const-string p1, "ActivityDisplayMessage.onKeyDown (no BRVolume) KEYCODE_VOLUME_UP"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return v5

    :cond_4
    :goto_1
    const-string p1, "ActivityDisplayMessage.onKeyDown (no BRVolume) KEYCODE_VOLUME_UP   Broadcasting Finish"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/dof100/morsenotifier/App;->b(Landroid/content/Context;)V

    invoke-direct {p0}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->a()V

    return v5

    :cond_5
    if-ne p1, v6, :cond_6

    const-string p1, "ActivityDisplayMessage.onKeyDown KEYCODE_BACK"

    invoke-static {p1}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/dof100/morsenotifier/App;->b(Landroid/content/Context;)V

    invoke-direct {p0}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->a()V

    return v5

    :cond_6
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public onPause()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ActivityDisplayMessage.onPause  instance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/a/b;->a(Landroid/content/Context;)Landroid/support/v4/a/b;

    move-result-object v0

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->r:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/a/b;->a(Landroid/content/BroadcastReceiver;)V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->s:Landroid/os/Handler;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->t:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    return-void
.end method

.method public onResume()V
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ActivityDisplayMessage.onResume  instance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->t:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    invoke-virtual {p0}, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/a/b;->a(Landroid/content/Context;)Landroid/support/v4/a/b;

    move-result-object v0

    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    const-string v2, "LBR_ACTION_SETPOS"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v2, "LBR_ACTION_FINISH"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->r:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v2, v1}, Landroid/support/v4/a/b;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->o:J

    iget-object v0, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->s:Landroid/os/Handler;

    iget-object v1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->t:Ljava/lang/Runnable;

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ActivityDisplayMessage.onResume  OUT instance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    return-void
.end method

.method protected onStop()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ActivityDisplayMessage.onStop   instance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/dof100/morsenotifier/ActivityDisplayMessage;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/dof100/morsenotifier/i;->a(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    return-void
.end method
