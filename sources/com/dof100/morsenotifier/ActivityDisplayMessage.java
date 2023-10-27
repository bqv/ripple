package com.dof100.morsenotifier;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Point;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.os.Handler;
import android.support.p000v4.p001a.C0014b;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import java.util.ArrayList;

public class ActivityDisplayMessage extends Activity implements View.OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f223a = 0;

    /* renamed from: b */
    private boolean f224b = true;

    /* renamed from: c */
    private int f225c = 1;

    /* renamed from: d */
    private int f226d = 0;

    /* renamed from: e */
    private boolean f227e = true;

    /* renamed from: f */
    private boolean f228f = false;

    /* renamed from: g */
    private int f229g = 16777215;

    /* renamed from: h */
    private int f230h = 16776960;

    /* renamed from: i */
    private int f231i = 16711680;

    /* renamed from: j */
    private int f232j = 0;

    /* renamed from: k */
    private int f233k = 1;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public GLSurfaceView f234l = null;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C0160s f235m = null;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public ArrayList<Integer> f236n = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public long f237o = System.currentTimeMillis();

    /* renamed from: p */
    private long f238p = 0;

    /* renamed from: q */
    private long f239q = 0;

    /* renamed from: r */
    private final BroadcastReceiver f240r = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            int i;
            if ("LBR_ACTION_SETPOS".equals(intent.getAction())) {
                final int intExtra = intent.getIntExtra("LBR_ACTION_DATA_POS", 0);
                if (intExtra >= 0 && (i = intExtra * 2) < ActivityDisplayMessage.this.f236n.size() && ((Integer) ActivityDisplayMessage.this.f236n.get(i)).intValue() == -8) {
                    C0140i.m501a("ActivityDisplayMessage.BroadcastReceiver  got LBR_ACTION_SETPOS -> MORSE_ELEMENT_STOP");
                    ActivityDisplayMessage.this.m396a();
                }
                if (ActivityDisplayMessage.this.f235m != null) {
                    ActivityDisplayMessage.this.f234l.queueEvent(new Runnable() {
                        public void run() {
                            ActivityDisplayMessage.this.f235m.mo521a(intExtra);
                        }
                    });
                    ActivityDisplayMessage.this.f234l.invalidate();
                }
                long unused = ActivityDisplayMessage.this.f237o = System.currentTimeMillis();
            } else if ("LBR_ACTION_FINISH".equals(intent.getAction())) {
                C0140i.m501a("ActivityDisplayMessage.BroadcastReceiver LBR_ACTION_FINISH instance=" + ActivityDisplayMessage.this.f223a);
                C0140i.m501a("ActivityDisplayMessage.BroadcastReceiver  got LBR_ACTION_FINISH  (stopping) instance=" + ActivityDisplayMessage.this.f223a);
                ActivityDisplayMessage.this.m396a();
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final Handler f241s = new Handler();

    /* renamed from: t */
    private final Runnable f242t = new Runnable() {
        public void run() {
            if (System.currentTimeMillis() - ActivityDisplayMessage.this.f237o > 9000 && !ActivityDisplayMessage.this.isFinishing()) {
                C0140i.m501a("ActivityDisplayMessage mLastTime) > DELAY_MSEC");
                ActivityDisplayMessage.this.m396a();
            }
            ActivityDisplayMessage.this.f241s.postDelayed(this, 1000);
        }
    };

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m396a() {
        C0140i.m501a("ActivityDisplayMessage.action_finish");
        this.f234l.setVisibility(4);
        finish();
    }

    /* renamed from: b */
    private void m397b() {
        C0140i.m501a("ActivityDisplayMessage.action_hide  instance=" + this.f223a);
        this.f234l.setVisibility(4);
        finish();
    }

    /* renamed from: c */
    private void m400c() {
        C0140i.m501a("ActivityDisplayMessage.action_configure  instance=" + this.f223a);
        App.m430b(getApplicationContext());
        startActivity(new Intent(this, ActivityMain.class));
        this.f234l.setVisibility(4);
        finish();
    }

    public void onClick(View view) {
        C0140i.m501a("ActivityDisplayMessage.onClick");
        if (view != null) {
            switch (view.getId()) {
                case R.id.btn_configure /*2131165203*/:
                    C0140i.m501a("ActivityDisplayMessage.onClick btn_configure");
                    m400c();
                    return;
                case R.id.btn_hide /*2131165204*/:
                    C0140i.m501a("ActivityDisplayMessage.onClick btn_hide");
                    m397b();
                    return;
                case R.id.btn_stop /*2131165205*/:
                    C0140i.m501a("ActivityDisplayMessage.onClick btn_stop");
                    App.m430b(getApplicationContext());
                    m396a();
                    return;
                default:
                    C0140i.m501a("ActivityDisplayMessage.onClick  other");
                    return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f223a = extras.getInt("PARAM_INSTANCE", 0);
            this.f236n = extras.getIntegerArrayList("PARAM_LIST");
            this.f224b = extras.getBoolean("PARAM_ENABLEDIALOGSETTINGS");
            this.f225c = extras.getInt("PARAM_DISPLAY_HOW", 1);
            this.f226d = extras.getInt("PARAM_DISPLAY_POS", 0);
            this.f227e = extras.getBoolean("PARAM_DISPLAY_TEXT", true);
            this.f228f = extras.getBoolean("PARAM_DISPLAY_FLASH", false);
            this.f229g = extras.getInt("PARAM_DISPLAY_COLOR", 16777215);
            this.f230h = extras.getInt("PARAM_DISPLAY_COLOR_ME_HILIGHT", 16776960);
            this.f231i = extras.getInt("PARAM_DISPLAY_COLOR_TEXT_HILIGHT", 16711680);
            this.f232j = extras.getInt("PARAM_DISPLAY_INITIALDELAY", 0);
            this.f233k = extras.getInt("PARAM_STOPMETHOD", 1);
        }
        C0140i.m501a("ActivityDisplayMessage.onCreate instance=" + this.f223a);
        Point point = new Point();
        WindowManager windowManager = getWindowManager();
        if (windowManager != null) {
            try {
                windowManager.getDefaultDisplay().getSize(point);
            } catch (Exception unused) {
                str = "ActivityDisplayMessage.onCreate ERROR try tmpDisplay.getSize";
            }
        } else {
            str = "ActivityDisplayMessage.onCreate ERROR getWindowManager=null";
            C0140i.m500a((Context) this, str);
            point.set(320, 100);
        }
        try {
            Window window = getWindow();
            if (window != null) {
                switch (this.f226d) {
                    case 1:
                        C0140i.m501a("ActivityDisplayMessage.onCreate setGravity(TOP)");
                        window.setGravity(48);
                        break;
                    case 2:
                        C0140i.m501a("ActivityDisplayMessage.onCreate setGravity(CENTER)");
                        window.setGravity(17);
                        break;
                    case 3:
                        C0140i.m501a("ActivityDisplayMessage.onCreate setGravity(BOTTOM)");
                        window.setGravity(80);
                        break;
                }
                switch (this.f225c) {
                    case 1:
                        C0140i.m501a("ActivityDisplayMessage.onCreate (window)");
                        window.setType(256);
                        break;
                    case 2:
                    case 3:
                        requestWindowFeature(1);
                        window.setBackgroundDrawableResource(17170445);
                        window.setFormat(-3);
                        window.addFlags(262192);
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.width = point.x;
                        C0140i.m501a("ActivityDisplayMessage.onCreate (scroll) params.width =" + attributes.width);
                        window.setAttributes(attributes);
                        break;
                }
            } else {
                C0140i.m500a((Context) this, "ActivityDisplayMessage.onCreate ERROR getWindow=null");
            }
        } catch (Exception unused2) {
            C0140i.m500a((Context) this, "ActivityDisplayMessage.onCreate ERROR try getwindow");
        }
        setFinishOnTouchOutside(false);
        setContentView(R.layout.activity_info);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll_btn);
        Button button = (Button) findViewById(R.id.btn_configure);
        Button button2 = (Button) findViewById(R.id.btn_stop);
        Button button3 = (Button) findViewById(R.id.btn_hide);
        this.f234l = (GLSurfaceView) findViewById(R.id.glsurfaceview);
        try {
            if (this.f225c == 1) {
                if (!this.f224b) {
                    button.setVisibility(8);
                } else {
                    button.setOnClickListener(this);
                }
                button2.setOnClickListener(this);
                button3.setOnClickListener(this);
            } else {
                linearLayout.setVisibility(8);
                button.setVisibility(8);
                button2.setVisibility(8);
                button3.setVisibility(8);
            }
        } catch (Exception unused3) {
            C0140i.m500a((Context) this, "ActivityDisplayMessage.onCreate ERROR try setVisibility, setOnClickListener");
        }
        try {
            this.f235m = new C0160s(this.f236n, this.f225c, this.f227e, this.f228f, this.f229g, this.f230h, this.f231i, this.f232j);
            this.f234l.setZOrderOnTop(true);
            this.f234l.setEGLConfigChooser(8, 8, 8, 8, 16, 0);
            this.f234l.getHolder().setFormat(1);
            this.f234l.setRenderer(this.f235m);
        } catch (Exception unused4) {
            C0140i.m500a((Context) this, "ActivityDisplayMessage.onCreate ERROR try setRenderer");
        }
        this.f237o = System.currentTimeMillis();
        C0140i.m501a("ActivityDisplayMessage.onCreate OUT instance=" + this.f223a);
    }

    public void onDestroy() {
        C0140i.m501a("ActivityDisplayMessage.onDestroy  instance=" + this.f223a);
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C0140i.m501a("ActivityDisplayMessage.onKeyDown");
        long currentTimeMillis = System.currentTimeMillis();
        if (i == 25) {
            this.f239q = currentTimeMillis;
            if (this.f233k == 1 || this.f233k == 2 || this.f233k == 3 || (this.f233k == 4 && currentTimeMillis - this.f238p < 2000)) {
                C0140i.m501a("ActivityDisplayMessage.onKeyDown (no BRVolume) KEYCODE_VOLUME_DOWN Broadcasting Finish");
                App.m430b(getApplicationContext());
                m396a();
                return false;
            }
            C0140i.m501a("ActivityDisplayMessage.onKeyDown (no BRVolume) KEYCODE_VOLUME_DOWN");
            return false;
        } else if (i == 24) {
            this.f238p = currentTimeMillis;
            if (this.f233k == 3 || (this.f233k == 4 && currentTimeMillis - this.f239q < 2000)) {
                C0140i.m501a("ActivityDisplayMessage.onKeyDown (no BRVolume) KEYCODE_VOLUME_UP   Broadcasting Finish");
                App.m430b(getApplicationContext());
                m396a();
                return false;
            }
            C0140i.m501a("ActivityDisplayMessage.onKeyDown (no BRVolume) KEYCODE_VOLUME_UP");
            return false;
        } else if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        } else {
            C0140i.m501a("ActivityDisplayMessage.onKeyDown KEYCODE_BACK");
            App.m430b(getApplicationContext());
            m396a();
            return false;
        }
    }

    public void onPause() {
        C0140i.m501a("ActivityDisplayMessage.onPause  instance=" + this.f223a);
        C0014b.m1a(getApplicationContext()).mo1a(this.f240r);
        this.f241s.removeCallbacks(this.f242t);
        super.onPause();
    }

    public void onResume() {
        C0140i.m501a("ActivityDisplayMessage.onResume  instance=" + this.f223a);
        super.onResume();
        this.f242t.run();
        C0014b a = C0014b.m1a(getApplicationContext());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("LBR_ACTION_SETPOS");
        intentFilter.addAction("LBR_ACTION_FINISH");
        a.mo2a(this.f240r, intentFilter);
        this.f237o = System.currentTimeMillis();
        this.f241s.postDelayed(this.f242t, 1000);
        C0140i.m501a("ActivityDisplayMessage.onResume  OUT instance=" + this.f223a);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        C0140i.m501a("ActivityDisplayMessage.onStop   instance=" + this.f223a);
        super.onStop();
    }
}
