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
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import java.util.ArrayList;

public class ActivityDisplayMessage extends Activity implements OnClickListener {
   private int a = 0;
   private boolean b = true;
   private int c = 1;
   private int d = 0;
   private boolean e = true;
   private boolean f = false;
   private int g = 16777215;
   private int h = 16776960;
   private int i = 16711680;
   private int j = 0;
   private int k = 1;
   private GLSurfaceView l = null;
   private MyMorseRenderer m = null;
   private ArrayList n = new ArrayList();
   private long o = System.currentTimeMillis();
   private long p = 0L;
   private long q = 0L;
   private final BroadcastReceiver r = new BroadcastReceiver() {
      public void onReceive(Context var1, Intent var2) {
         if ("LBR_ACTION_SETPOS".equals(var2.getAction())) {
            final int var3 = var2.getIntExtra("LBR_ACTION_DATA_POS", 0);
            if (var3 >= 0) {
               int var4 = var3 * 2;
               if (var4 < ActivityDisplayMessage.this.n.size() && (Integer)ActivityDisplayMessage.this.n.get(var4) == -8) {
                  MyLog.log("ActivityDisplayMessage.BroadcastReceiver  got LBR_ACTION_SETPOS -> MORSE_ELEMENT_STOP");
                  ActivityDisplayMessage.this.a();
               }
            }

            if (ActivityDisplayMessage.this.m != null) {
               ActivityDisplayMessage.this.l.queueEvent(new Runnable() {
                  public void run() {
                     ActivityDisplayMessage.this.m.a(var3);
                  }
               });
               ActivityDisplayMessage.this.l.invalidate();
            }

            ActivityDisplayMessage.this.o = System.currentTimeMillis();
         } else {
            if ("LBR_ACTION_FINISH".equals(var2.getAction())) {
               StringBuilder var5 = new StringBuilder();
               var5.append("ActivityDisplayMessage.BroadcastReceiver LBR_ACTION_FINISH instance=");
               var5.append(ActivityDisplayMessage.this.a);
               MyLog.log(var5.toString());
               var5 = new StringBuilder();
               var5.append("ActivityDisplayMessage.BroadcastReceiver  got LBR_ACTION_FINISH  (stopping) instance=");
               var5.append(ActivityDisplayMessage.this.a);
               MyLog.log(var5.toString());
               ActivityDisplayMessage.this.a();
            }

         }
      }
   };
   private final Handler s = new Handler();
   private final Runnable t = new Runnable() {
      public void run() {
         if (System.currentTimeMillis() - ActivityDisplayMessage.this.o > 9000L && !ActivityDisplayMessage.this.isFinishing()) {
            MyLog.log("ActivityDisplayMessage mLastTime) > DELAY_MSEC");
            ActivityDisplayMessage.this.a();
         }

         ActivityDisplayMessage.this.s.postDelayed(this, 1000L);
      }
   };

   private void a() {
      MyLog.log("ActivityDisplayMessage.action_finish");
      this.l.setVisibility(4);
      this.finish();
   }

   private void b() {
      String var1 = "ActivityDisplayMessage.action_hide  instance=" +
              this.a;
      MyLog.log(var1);
      this.l.setVisibility(4);
      this.finish();
   }

   private void c() {
      String var1 = "ActivityDisplayMessage.action_configure  instance=" +
              this.a;
      MyLog.log(var1);
      App.b(this.getApplicationContext());
      this.startActivity(new Intent(this, ActivityMain.class));
      this.l.setVisibility(4);
      this.finish();
   }

   public void onClick(View var1) {
      MyLog.log("ActivityDisplayMessage.onClick");
      if (var1 != null) {
         switch(var1.getId()) {
         case R.id.btn_configure:
            MyLog.log("ActivityDisplayMessage.onClick btn_configure");
            this.c();
            return;
         case R.id.btn_hide:
            MyLog.log("ActivityDisplayMessage.onClick btn_hide");
            this.b();
            return;
         case R.id.btn_stop:
            MyLog.log("ActivityDisplayMessage.onClick btn_stop");
            App.b(this.getApplicationContext());
            this.a();
            return;
         default:
            MyLog.log("ActivityDisplayMessage.onClick  other");
         }
      }
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      var1 = this.getIntent().getExtras();
      if (var1 != null) {
         this.a = var1.getInt("PARAM_INSTANCE", 0);
         this.n = var1.getIntegerArrayList("PARAM_LIST");
         this.b = var1.getBoolean("PARAM_ENABLEDIALOGSETTINGS");
         this.c = var1.getInt("PARAM_DISPLAY_HOW", 1);
         this.d = var1.getInt("PARAM_DISPLAY_POS", 0);
         this.e = var1.getBoolean("PARAM_DISPLAY_TEXT", true);
         this.f = var1.getBoolean("PARAM_DISPLAY_FLASH", false);
         this.g = var1.getInt("PARAM_DISPLAY_COLOR", 16777215);
         this.h = var1.getInt("PARAM_DISPLAY_COLOR_ME_HILIGHT", 16776960);
         this.i = var1.getInt("PARAM_DISPLAY_COLOR_TEXT_HILIGHT", 16711680);
         this.j = var1.getInt("PARAM_DISPLAY_INITIALDELAY", 0);
         this.k = var1.getInt("PARAM_STOPMETHOD", 1);
      }

      Point var2;
      StringBuilder var20;
      label158: {
         var20 = new StringBuilder();
         var20.append("ActivityDisplayMessage.onCreate instance=");
         var20.append(this.a);
         MyLog.log(var20.toString());
         var2 = new Point();
         WindowManager var21 = this.getWindowManager();
         String var24;
         if (var21 != null) {
            Display var22 = var21.getDefaultDisplay();

            try {
               var22.getSize(var2);
               break label158;
            } catch (Exception var19) {
               var24 = "ActivityDisplayMessage.onCreate ERROR try tmpDisplay.getSize";
            }
         } else {
            var24 = "ActivityDisplayMessage.onCreate ERROR getWindowManager=null";
         }

         MyLog.log(this, (String)var24);
         var2.set(320, 100);
      }

      boolean var10001;
      label151: {
         label150: {
            Window var27;
            try {
               var27 = this.getWindow();
            } catch (Exception var18) {
               var10001 = false;
               break label150;
            }

            if (var27 != null) {
               label162: {
                  label143: {
                     label163: {
                        label167: {
                           try {
                              switch(this.d) {
                              case 1:
                                 break label163;
                              case 2:
                                 break label167;
                              case 3:
                                 break;
                              default:
                                 break label143;
                              }
                           } catch (Exception var16) {
                              var10001 = false;
                              break label162;
                           }

                           try {
                              MyLog.log("ActivityDisplayMessage.onCreate setGravity(BOTTOM)");
                              var27.setGravity(80);
                              break label143;
                           } catch (Exception var15) {
                              var10001 = false;
                              break label162;
                           }
                        }

                        try {
                           MyLog.log("ActivityDisplayMessage.onCreate setGravity(CENTER)");
                           var27.setGravity(17);
                           break label143;
                        } catch (Exception var14) {
                           var10001 = false;
                           break label162;
                        }
                     }

                     try {
                        MyLog.log("ActivityDisplayMessage.onCreate setGravity(TOP)");
                        var27.setGravity(48);
                     } catch (Exception var13) {
                        var10001 = false;
                        break label162;
                     }
                  }

                  label117: {
                     try {
                        switch(this.c) {
                        case 1:
                           break;
                        case 2:
                        case 3:
                           break label117;
                        default:
                           break label151;
                        }
                     } catch (Exception var12) {
                        var10001 = false;
                        break label162;
                     }

                     try {
                        MyLog.log("ActivityDisplayMessage.onCreate (window)");
                        var27.setType(256);
                        break label151;
                     } catch (Exception var11) {
                        var10001 = false;
                        break label162;
                     }
                  }

                  try {
                     this.requestWindowFeature(1);
                     var27.setBackgroundDrawableResource(17170445);
                     var27.setFormat(-3);
                     var27.addFlags(262192);
                     LayoutParams var3 = var27.getAttributes();
                     var3.width = var2.x;
                     String var23 = "ActivityDisplayMessage.onCreate (scroll) params.width =" +
                             var3.width;
                     MyLog.log(var23);
                     var27.setAttributes(var3);
                     break label151;
                  } catch (Exception var10) {
                     var10001 = false;
                  }
               }
            } else {
               try {
                  MyLog.log(this, (String)"ActivityDisplayMessage.onCreate ERROR getWindow=null");
                  break label151;
               } catch (Exception var17) {
                  var10001 = false;
               }
            }
         }

         MyLog.log(this, (String)"ActivityDisplayMessage.onCreate ERROR try getwindow");
      }

      this.setFinishOnTouchOutside(false);
      this.setContentView(R.layout.activity_info);
      LinearLayout var4 = (LinearLayout)this.findViewById(R.id.ll_btn);
      Button var26 = (Button)this.findViewById(R.id.btn_configure);
      Button var28 = (Button)this.findViewById(R.id.btn_stop);
      Button var25 = (Button)this.findViewById(R.id.btn_hide);
      this.l = (GLSurfaceView)this.findViewById(R.id.glsurfaceview);

      label98: {
         label97: {
            label96: {
               label166: {
                  try {
                     if (this.c != 1) {
                        break label166;
                     }

                     if (!this.b) {
                        var26.setVisibility(8);
                        break label96;
                     }
                  } catch (Exception var9) {
                     var10001 = false;
                     break label97;
                  }

                  try {
                     var26.setOnClickListener(this);
                     break label96;
                  } catch (Exception var8) {
                     var10001 = false;
                     break label97;
                  }
               }

               try {
                  var4.setVisibility(8);
                  var26.setVisibility(8);
                  var28.setVisibility(8);
                  var25.setVisibility(8);
                  break label98;
               } catch (Exception var7) {
                  var10001 = false;
                  break label97;
               }
            }

            try {
               var28.setOnClickListener(this);
               var25.setOnClickListener(this);
               break label98;
            } catch (Exception var6) {
               var10001 = false;
            }
         }

         MyLog.log(this, (String)"ActivityDisplayMessage.onCreate ERROR try setVisibility, setOnClickListener");
      }

      try {
         MyMorseRenderer var29 = new MyMorseRenderer(this.n, this.c, this.e, this.f, this.g, this.h, this.i, this.j);
         this.m = var29;
         this.l.setZOrderOnTop(true);
         this.l.setEGLConfigChooser(8, 8, 8, 8, 16, 0);
         this.l.getHolder().setFormat(1);
         this.l.setRenderer(this.m);
      } catch (Exception var5) {
         MyLog.log(this, (String)"ActivityDisplayMessage.onCreate ERROR try setRenderer");
      }

      this.o = System.currentTimeMillis();
      var20 = new StringBuilder();
      var20.append("ActivityDisplayMessage.onCreate OUT instance=");
      var20.append(this.a);
      MyLog.log(var20.toString());
   }

   public void onDestroy() {
      String var1 = "ActivityDisplayMessage.onDestroy  instance=" +
              this.a;
      MyLog.log(var1);
      super.onDestroy();
   }

   public boolean onKeyDown(int var1, KeyEvent var2) {
      MyLog.log("ActivityDisplayMessage.onKeyDown");
      long var3 = System.currentTimeMillis();
      if (var1 == 25) {
         this.q = var3;
         if (this.k == 1 || this.k == 2 || this.k == 3 || this.k == 4 && var3 - this.p < 2000L) {
            MyLog.log("ActivityDisplayMessage.onKeyDown (no BRVolume) KEYCODE_VOLUME_DOWN Broadcasting Finish");
            App.b(this.getApplicationContext());
            this.a();
            return false;
         } else {
            MyLog.log("ActivityDisplayMessage.onKeyDown (no BRVolume) KEYCODE_VOLUME_DOWN");
            return false;
         }
      } else if (var1 != 24) {
         if (var1 == 4) {
            MyLog.log("ActivityDisplayMessage.onKeyDown KEYCODE_BACK");
            App.b(this.getApplicationContext());
            this.a();
            return false;
         } else {
            return super.onKeyDown(var1, var2);
         }
      } else {
         this.p = var3;
         if (this.k != 3 && (this.k != 4 || var3 - this.q >= 2000L)) {
            MyLog.log("ActivityDisplayMessage.onKeyDown (no BRVolume) KEYCODE_VOLUME_UP");
            return false;
         } else {
            MyLog.log("ActivityDisplayMessage.onKeyDown (no BRVolume) KEYCODE_VOLUME_UP   Broadcasting Finish");
            App.b(this.getApplicationContext());
            this.a();
            return false;
         }
      }
   }

   public void onPause() {
      MyLog.log("ActivityDisplayMessage.onPause  instance=" + this.a);
      androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(this.getApplicationContext()).unregisterReceiver(this.r);
      this.s.removeCallbacks(this.t);
      super.onPause();
   }

   public void onResume() {
      StringBuilder var1 = new StringBuilder();
      var1.append("ActivityDisplayMessage.onResume  instance=");
      var1.append(this.a);
      MyLog.log(var1.toString());
      super.onResume();
      this.t.run();
      androidx.localbroadcastmanager.content.LocalBroadcastManager var2 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(this.getApplicationContext());
      IntentFilter var3 = new IntentFilter();
      var3.addAction("LBR_ACTION_SETPOS");
      var3.addAction("LBR_ACTION_FINISH");
      var2.registerReceiver(this.r, var3);
      this.o = System.currentTimeMillis();
      this.s.postDelayed(this.t, 1000L);
      var1 = new StringBuilder();
      var1.append("ActivityDisplayMessage.onResume  OUT instance=");
      var1.append(this.a);
      MyLog.log(var1.toString());
   }

   protected void onStop() {
      String var1 = "ActivityDisplayMessage.onStop   instance=" +
              this.a;
      MyLog.log(var1);
      super.onStop();
   }
}
