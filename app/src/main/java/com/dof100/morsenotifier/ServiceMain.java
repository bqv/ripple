package com.dof100.morsenotifier;

import android.app.IntentService;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.os.Build.VERSION;
import android.preference.PreferenceManager;
import android.telephony.TelephonyManager;
import java.util.Calendar;
import java.util.Locale;
import java.util.Random;

public class ServiceMain extends IntentService {
   private static final int[] a = new int[]{4, 3, 5, 2, 1};
   private boolean A = false;
   private int B = 16777215;
   private int C = 16776960;
   private int D = 16776960;
   private boolean E = true;
   private int F = 4;
   private String G = "";
   private int H = 0;
   private boolean I = false;
   private boolean J = false;
   private boolean K = false;
   private boolean L = false;
   private boolean M = false;
   private String N = "";
   private String O = "";
   private String P = "";
   private int Q = 1;
   private boolean R = true;
   private int S = 3;
   private String T = "";
   private int U = 0;
   private boolean V = false;
   private boolean W = false;
   private boolean X = false;
   private boolean Y = false;
   private boolean Z = false;
   private String aA = "";
   private String aB = "";
   private String aC = "";
   private String aD = "";
   private final Random aE = new Random();
   private final int aF;
   private final BroadcastReceiver aG;
   private boolean aa = false;
   private String ab = "";
   private String ac = "";
   private String ad = "";
   private int ae = 1;
   private boolean af = true;
   private int ag = 3;
   private String ah = "";
   private String ai = "";
   private String aj = "";
   private String ak = "";
   private String al = "";
   private String am = "";
   private boolean an = false;
   private boolean ao = false;
   private int ap = 3;
   private final boolean[] aq = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true};
   private String ar = "";
   private String as = "";
   private int at = 1;
   private boolean au = false;
   private int av = 1;
   private boolean aw = true;
   private int ax = 3;
   private String ay = "";
   private String az = "";
   private boolean b = true;
   private boolean c = true;
   private int d = 0;
   private int e = 1;
   private boolean f = true;
   private boolean g = true;
   private int h = 0;
   private int i = 0;
   private boolean j = false;
   private int k = 0;
   private boolean l = false;
   private String m = "en_US";
   private int n = 100;
   private int o = 100;
   private int p = 100;
   private boolean q = false;
   private boolean r = false;
   private int s = 800;
   private int t = 100;
   private int u = 10;
   private boolean v = false;
   private int w = 1;
   private int x = 0;
   private boolean y = false;
   private boolean z = true;

   public ServiceMain() {
      super("com.dof100.morsenotifier.ServiceMain");
      this.aF = this.aE.nextInt(10000);
      this.aG = new BroadcastReceiver() {
         public void onReceive(Context var1, Intent var2) {
            if ("LBR_ACTION_SETTINGSCHANGED".equals(var2.getAction())) {
               MyLog.log("ServiceMain.BroadcastReceiver got LBR_ACTION_SETTINGSCHANGED");
               MyLog.log("ServiceMain.BroadcastReceiver pref_init");
               ServiceMain.this.c();
               MyJob.a();
               MyJob.a((Context)ServiceMain.this);
            }

         }
      };
   }

   public ServiceMain(String var1) {
      super(var1);
      this.aF = this.aE.nextInt(10000);
      this.aG = new BroadcastReceiver() {
         public void onReceive(Context var1, Intent var2) {
            if ("LBR_ACTION_SETTINGSCHANGED".equals(var2.getAction())) {
               MyLog.log("ServiceMain.BroadcastReceiver got LBR_ACTION_SETTINGSCHANGED");
               MyLog.log("ServiceMain.BroadcastReceiver pref_init");
               ServiceMain.this.c();
               MyJob.a();
               MyJob.a((Context)ServiceMain.this);
            }

         }
      };
   }

   private void a() {
      MyLog.log(this, (String)"ServiceMain.alarm_init");
      MyJob.b();
      MyJob.a();
      MyJob.a((Context)this);
      if (App.d) {
         App.a(this.getApplicationContext());
      }

   }

   private void a(int var1, int var2, boolean var3) {
      if (this.ao) {
         MyLog.log(this, (String)"ServiceMain.handleChime");
         Calendar var4 = Calendar.getInstance();
         int var5 = var4.get(11);
         int var6 = var4.get(12);
         long var7 = var4.getTimeInMillis();
         int var9;
         if (var1 <= 0) {
            var9 = var4.get(11) % 24;
         } else {
            var9 = var1;
         }

         if (!var3 && !this.aq[var9]) {
            MyLog.log(this, (String)String.format(Locale.US, "ServiceMain.onHandleIntent (MSG_CHIME) Chime disabled for \"%02d:00\"", var9));
         } else {
            if (!var3) {
               int var10 = Utils.a(var5, var6, var1, var2);
               if (var10 >= 2) {
                  MyLog.log(this, (String)String.format(Locale.US, "ServiceMain.onHandleIntent (MSG_CHIME) ERROR now=%02d:%02d reminder=%02d:%02d  dif=%d", var5, var6, var1, var2, var10));
                  return;
               }
            }

            if (!var3) {
               SharedPreferences var12 = PreferenceManager.getDefaultSharedPreferences(this);
               if (var7 - var12.getLong("chime_lasttime", 0L) < 300000L) {
                  MyLog.log(this, (String)String.format(Locale.US, "ServiceMain.onHandleIntent (MSG_CHIME) ERROR Last time was less that 5 min ego. now=%02d:%02d reminder=%02d:%02d", var5, var6, var1, var2));
                  return;
               }

               var12.edit().putLong("chime_lasttime", var7).apply();
            }

            String var13 = "";
            String var11;
            switch(this.at) {
            case 1:
               var11 = String.format(Locale.US, "%02d00", var9);
               var13 = var11;
               if (App.d) {
                  var13 = Utils.a(var11, ' ');
               }
               break;
            case 2:
               var2 = var9 % 12;
               var1 = var2;
               if (var2 == 0) {
                  var1 = 12;
               }

               var13 = String.format(Locale.US, "%d", var1);
               break;
            case 3:
               var13 = String.format(Locale.US, "%d", var9);
            }

            var11 = var13;
            StringBuilder var15;
            if (!this.ar.isEmpty()) {
               var15 = new StringBuilder();
               var15.append(this.ar);
               var15.append(" ");
               var15.append(var13);
               var11 = var15.toString();
            }

            var13 = var11;
            if (!this.as.isEmpty()) {
               StringBuilder var14 = new StringBuilder();
               var14.append(var11);
               var14.append(" ");
               var14.append(this.as);
               var13 = var14.toString();
            }

            var15 = new StringBuilder();
            var15.append("ServiceMain.onHandleIntent (MSG_CHIME) hour=");
            var15.append(var9);
            var15.append("  format=");
            var15.append(this.at);
            var15.append(" message:");
            var15.append(var13);
            MyLog.log(this, (String)var15.toString());
            this.a(var13, a[this.ap], 1, var3);
         }
      }
   }

   private void a(String param1) {
      // $FF: Couldn't be decompiled
   }

   private void a(String var1, int var2, int var3, int var4, int var5, int var6) {
      l var7 = App.a(this.getApplicationContext());
      var7.a(this.getApplicationContext(), this.h, var3, this.m, var4, var5, var6, var2, var1);
      var7.b(this.getApplicationContext());
      var7.a(this.getApplicationContext());
   }

   private void a(String var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8, boolean var9, boolean var10) {
      MyPlayerMorse var11 = new MyPlayerMorse(this.getApplicationContext(), this.aF);
      Context var12 = this.getApplicationContext();
      boolean var13 = this.l;
      int var14 = this.d;
      int var15;
      if (this.j) {
         var15 = this.k;
      } else {
         var15 = var4;
      }

      var11.a(var12, var7, var8, var13, var14, var3, var4, var15, var2, var5, var6, this.u, var1);
      if (var9) {
         switch(this.w) {
         case 1:
         case 2:
         case 3:
            Intent var17 = new Intent(this, ActivityDisplayMessage.class);
            var17.addFlags(32768);
            var17.addFlags(268435456);
            var17.putExtra("PARAM_INSTANCE", this.aF);
            var17.putExtra("PARAM_LIST", var11.a());
            var17.putExtra("PARAM_DISPLAY_HOW", this.w);
            var17.putExtra("PARAM_DISPLAY_POS", this.x);
            var17.putExtra("PARAM_DISPLAY_STAYONTOP", this.y);
            var17.putExtra("PARAM_DISPLAY_TEXT", this.z);
            var17.putExtra("PARAM_DISPLAY_FLASH", this.A);
            var17.putExtra("PARAM_DISPLAY_COLOR", this.B);
            var17.putExtra("PARAM_DISPLAY_COLOR_ME_HILIGHT", this.C);
            var17.putExtra("PARAM_DISPLAY_COLOR_TEXT_HILIGHT", this.D);
            var17.putExtra("PARAM_DISPLAY_INITIALDELAY", this.d);
            var17.putExtra("PARAM_ENABLEDIALOGSETTINGS", var10 ^ true);
            var17.putExtra("PARAM_STOPMETHOD", this.e);

            try {
               this.startActivity(var17);
            } catch (Exception var16) {
               MyLog.log(this, (String)"ServiceMain.play_message ERROR startActivity (ActivityDisplayMessage)");
            }
         }
      }

      var11.execute();
      var11.a(this.getApplicationContext());
   }

   private void a(String var1, int var2, int var3, boolean var4) {
      StringBuilder var5 = new StringBuilder();
      var5.append("ServiceMain.play_message: ");
      var5.append(var1);
      var5.append(" instance=");
      var5.append(this.aF);
      MyLog.log(this, (String)var5.toString());
      String var17 = var1.toLowerCase();
      int var6;
      if (App.c) {
         var6 = this.i;
      } else {
         var6 = this.n;
      }

      int var7 = Utils.a(var17, "s", var6, 1, 200);
      if (App.c) {
         var6 = this.t;
      } else {
         var6 = this.p;
      }

      var6 = Utils.a(var17, "v", var6, 0, 100);
      int var8 = Utils.a(var17, "f", this.s, 10, 25000);
      int var9 = Utils.a(var17, "r", var3, 1, 10);
      int var10 = Utils.a(var17, "p", this.o, 30, 300);
      boolean var11 = Utils.a(var17, "a", this.q);
      boolean var12 = Utils.a(var17, "b", this.r);
      boolean var13 = Utils.a(var17, "d", this.v);
      var1 = Utils.a(var1);
      MyLog.log(String.format(Locale.US, "ServiceMain.play_message message=%s stream=%d istest=%b ", var1, var2, var4));
      MyLog.log(String.format(Locale.US, "ServiceMain.play_message speed=%d vol=%d freq=%d repeat=%d pitch=%d", var7, var6, var8, var9, var10));
      MyLog.log(String.format(Locale.US, "ServiceMain.play_message Audio=%b Vibration=%b Display=%b", var11, var12, var13));
      if (var4) {
         var5 = new StringBuilder();
         var5.append(this.getString(2131493310));
         var5.append(" ");
         var5.append(var1);
         MyLog.toast(this, var5.toString());
      }

      if (var11 || var12 || var13) {
         TelephonyManager var18 = (TelephonyManager)this.getSystemService("phone");
         boolean var16;
         if (var18 != null && var18.getCallState() == 2) {
            var16 = true;
         } else {
            var16 = false;
         }

         if (App.c && this.c && !var4 && var16) {
            MyLog.log(this, (String)"ServiceMain.play_message: muted (in call)");
            var5 = new StringBuilder();
            var5.append("Morse Notifier: ");
            var5.append(var1);
            MyLog.toast(this, var5.toString());
         } else if (App.d && this.g && !var4 && var16) {
            MyLog.log(this, (String)"ServiceMain.play_message: muted (in call)");
            var5 = new StringBuilder();
            var5.append("Voice Notifier: ");
            var5.append(var1);
            MyLog.toast(this, var5.toString());
         } else {
            if (VERSION.SDK_INT >= 23) {
               NotificationManager var19 = (NotificationManager)this.getSystemService("notification");
               if (var19 != null) {
                  var3 = var19.getCurrentInterruptionFilter();
                  var5 = new StringBuilder();
                  var5.append("ServiceMain.play_message dnd state = ");
                  var5.append(var3);
                  MyLog.log(var5.toString());
               } else {
                  MyLog.log("ServiceMain.play_message dnd state = (cannot get)");
                  var3 = 1;
               }
            } else {
               MyLog.log("ServiceMain.play_message dnd state = (cannot get) Android ver<6.0");
               var3 = 1;
            }

            boolean var14 = true;
            if (var3 == 1) {
               var14 = false;
            }

            var5 = new StringBuilder();
            var5.append("ServiceMain.play_message flagdnd = ");
            var5.append(var14);
            MyLog.log(var5.toString());
            StringBuilder var15;
            if (App.c && this.b && !var4 && var14) {
               var15 = new StringBuilder();
               var15.append("ServiceMain.play_message: muted (do not disturb) state=");
               var15.append(var3);
               MyLog.log(this, (String)var15.toString());
            } else if (App.d && this.f && !var4 && var14) {
               var15 = new StringBuilder();
               var15.append("ServiceMain.play_message: muted (do not disturb) state=");
               var15.append(var3);
               MyLog.log(this, (String)var15.toString());
            } else {
               if (App.c) {
                  this.a(var1, var2, var9, var7, var8, var6, var11, var12, var13, var4);
               } else {
                  this.a(var1, var2, var9, var7, var10, var6);
               }

               var15 = new StringBuilder();
               var15.append("ServiceMain.play_message OUT instance=");
               var15.append(this.aF);
               MyLog.log(this, (String)var15.toString());
            }
         }
      }
   }

   private void a(String var1, String var2, int var3, int var4, boolean var5) {
      if (this.au) {
         MyLog.log(this, (String)"ServiceMain.handleReminders");
         Calendar var6 = Calendar.getInstance();
         int var7 = var6.get(11);
         int var8 = var6.get(12);
         if (var1.equals(this.getResources().getString(2131492886))) {
            MyLog.log(this, (String)"ServiceMain.onHandleIntent (MSG_REMINDERS_TESTONE)");
            this.a(var2, a[this.av], 1, var5);
         } else if (var1.equals(this.getResources().getString(2131492884))) {
            MyLog.log(this, (String)"ServiceMain.onHandleIntent (MSG_REMINDERS_TESTALL)");
            MyReminder var10 = (new MyReminders(this)).a();
            if (var10 != null) {
               var1 = var10.a();
               var3 = a[this.av];
            } else {
               var1 = this.getResources().getString(2131493309);
               var3 = a[this.av];
            }

            this.a(var1, var3, 1, var5);
         } else {
            MyLog.log(this, (String)"ServiceMain.onHandleIntent (MSG_REMINDERS_FIRE)");
            int var9 = Utils.a(var7, var8, var3, var4);
            if (var9 >= 2) {
               MyLog.log(this, (String)String.format(Locale.US, "ServiceMain.onHandleIntent (MSG_REMINDERS) ERROR now=%02d:%02d reminder=%02d:%02d  dif=%d", var7, var8, var3, var4, var9));
            } else {
               this.a(var2, a[this.av], 1, var5);
            }
         }
      }
   }

   private void a(String var1, String var2, boolean var3) {
      if (this.R) {
         MyLog.log(this, (String)"ServiceMain.handleSMS");
         this.b();
         if (var1.length() > 0) {
            this.a(var1);
         }

         boolean var4;
         if (this.ay.length() != 0) {
            var4 = true;
         } else {
            var4 = false;
         }

         String var7;
         String var8;
         StringBuilder var11;
         StringBuilder var12;
         label124: {
            String var5 = this.T;
            String var6 = "";
            if (!this.V && !this.W && !this.X && !this.Y) {
               var7 = var5;
               if (!this.Z) {
                  break label124;
               }
            }

            var8 = var6;
            if (this.V) {
               var8 = var6;
               if (this.az.length() > 0) {
                  var11 = new StringBuilder();
                  var11.append("".trim());
                  var11.append(" ");
                  var11.append(this.az);
                  var8 = var11.toString();
               }
            }

            var7 = var8;
            if (this.W) {
               var7 = var8;
               if (this.aA.length() > 0) {
                  var11 = new StringBuilder();
                  var11.append(var8.trim());
                  var11.append(" ");
                  var11.append(this.aA);
                  var7 = var11.toString();
               }
            }

            var8 = var7;
            if (this.X) {
               var8 = var7;
               if (this.aB.length() > 0) {
                  var12 = new StringBuilder();
                  var12.append(var7.trim());
                  var12.append(" ");
                  var12.append(this.aB);
                  var8 = var12.toString();
               }
            }

            var7 = var8;
            if (this.Y) {
               var7 = var8;
               if (this.aC.length() > 0) {
                  var11 = new StringBuilder();
                  var11.append(var8.trim());
                  var11.append(" ");
                  var11.append(this.aC);
                  var7 = var11.toString();
               }
            }

            var8 = var7;
            if (this.Z) {
               var8 = var7;
               if (this.aD.length() > 0) {
                  var12 = new StringBuilder();
                  var12.append(var7.trim());
                  var12.append(" ");
                  var12.append(this.aD);
                  var8 = var12.toString();
               }
            }

            var8 = var8.trim();
            if (var4) {
               var11 = new StringBuilder();
               var11.append(var5.trim());
               var11.append(" ");
               var11.append(var8);
               var7 = var11.toString();
            } else {
               var11 = new StringBuilder();
               var11.append(var5.trim());
               var11.append(" ");
               var11.append(this.ac);
               var7 = var11.toString();
            }
         }

         label109: {
            label108: {
               label107: {
                  switch(this.U) {
                  case 1:
                     if (var1.length() >= 0) {
                        break label107;
                     }
                     break;
                  case 2:
                     if (var1.length() >= 0 && !var4) {
                        break label107;
                     }
                     break;
                  case 11:
                     if (var1.length() >= 3) {
                        break label108;
                     }
                     break;
                  case 12:
                     if (var1.length() >= 3 && !var4) {
                        break label108;
                     }
                  }

                  var8 = "";
                  break label109;
               }

               var8 = var1;
               break label109;
            }

            var8 = var1.substring(var1.length() - 3);
         }

         label93: {
            if (var8.length() != 0) {
               var1 = var8;
               if (App.d) {
                  var1 = Utils.a(var8, ' ');
               }

               var12 = new StringBuilder();
               var12.append(var7.trim());
               var12.append(" ");
               var11 = var12;
            } else {
               var8 = var7;
               if (var1.length() != 0) {
                  break label93;
               }

               var12 = new StringBuilder();
               var12.append(var7.trim());
               var12.append(" ");
               var1 = this.ad;
               var11 = var12;
            }

            var11.append(var1);
            var8 = var11.toString();
         }

         var1 = var8;
         if (this.aa) {
            var1 = var8;
            if (var2.length() > 0) {
               StringBuilder var10 = new StringBuilder();
               var10.append(var8.trim());
               var10.append(" ");
               var10.append(var2);
               var1 = var10.toString();
            }
         }

         var2 = var1;
         if (this.ab.length() > 0) {
            StringBuilder var9 = new StringBuilder();
            var9.append(var1.trim());
            var9.append(" ");
            var9.append(this.ab);
            var2 = var9.toString();
         }

         var2 = var2.trim();
         var1 = var2;
         if (var2.length() == 0) {
            var1 = "sms";
         }

         this.a(var1, a[this.S], this.ae, var3);
      }
   }

   private void a(String var1, boolean var2) {
      if (this.E) {
         MyLog.log(this, (String)"ServiceMain.handleCall");
         this.b();
         if (var1.length() > 0) {
            this.a(var1);
         }

         boolean var3;
         if (this.ay.length() != 0) {
            var3 = true;
         } else {
            var3 = false;
         }

         String var5;
         String var6;
         StringBuilder var8;
         StringBuilder var9;
         label118: {
            String var4 = this.G;
            var5 = "";
            if (!this.I && !this.J && !this.K && !this.L) {
               var6 = var4;
               if (!this.M) {
                  break label118;
               }
            }

            var6 = var5;
            if (this.I) {
               var6 = var5;
               if (this.az.length() > 0) {
                  var9 = new StringBuilder();
                  var9.append("".trim());
                  var9.append(" ");
                  var9.append(this.az);
                  var6 = var9.toString();
               }
            }

            var5 = var6;
            if (this.J) {
               var5 = var6;
               if (this.aA.length() > 0) {
                  var8 = new StringBuilder();
                  var8.append(var6.trim());
                  var8.append(" ");
                  var8.append(this.aA);
                  var5 = var8.toString();
               }
            }

            var6 = var5;
            if (this.K) {
               var6 = var5;
               if (this.aB.length() > 0) {
                  var9 = new StringBuilder();
                  var9.append(var5.trim());
                  var9.append(" ");
                  var9.append(this.aB);
                  var6 = var9.toString();
               }
            }

            var5 = var6;
            if (this.L) {
               var5 = var6;
               if (this.aC.length() > 0) {
                  var8 = new StringBuilder();
                  var8.append(var6.trim());
                  var8.append(" ");
                  var8.append(this.aC);
                  var5 = var8.toString();
               }
            }

            var6 = var5;
            if (this.M) {
               var6 = var5;
               if (this.aD.length() > 0) {
                  var9 = new StringBuilder();
                  var9.append(var5.trim());
                  var9.append(" ");
                  var9.append(this.aD);
                  var6 = var9.toString();
               }
            }

            var5 = var6.trim();
            if (var3) {
               var9 = new StringBuilder();
               var9.append(var4.trim());
               var9.append(" ");
               var9.append(var5);
               var6 = var9.toString();
            } else {
               var9 = new StringBuilder();
               var9.append(var4.trim());
               var9.append(" ");
               var9.append(this.O);
               var6 = var9.toString();
            }
         }

         label103: {
            label102: {
               label101: {
                  switch(this.H) {
                  case 1:
                     if (var1.length() >= 0) {
                        break label101;
                     }
                     break;
                  case 2:
                     if (var1.length() >= 0 && !var3) {
                        break label101;
                     }
                     break;
                  case 11:
                     if (var1.length() >= 3) {
                        break label102;
                     }
                     break;
                  case 12:
                     if (var1.length() >= 3 && !var3) {
                        break label102;
                     }
                  }

                  var5 = "";
                  break label103;
               }

               var5 = var1;
               break label103;
            }

            var5 = var1.substring(var1.length() - 3);
         }

         label87: {
            if (var5.length() != 0) {
               var1 = var5;
               if (App.d) {
                  var1 = Utils.a(var5, ' ');
               }

               var8 = new StringBuilder();
               var8.append(var6.trim());
               var8.append(" ");
               var9 = var8;
            } else {
               var5 = var6;
               if (var1.length() != 0) {
                  break label87;
               }

               var8 = new StringBuilder();
               var8.append(var6.trim());
               var8.append(" ");
               var1 = this.P;
               var9 = var8;
            }

            var9.append(var1);
            var5 = var9.toString();
         }

         var1 = var5;
         if (this.N.length() > 0) {
            StringBuilder var7 = new StringBuilder();
            var7.append(var5.trim());
            var7.append(" ");
            var7.append(this.N);
            var1 = var7.toString();
         }

         var6 = var1.trim();
         var1 = var6;
         if (var6.length() == 0) {
            var1 = "Call";
         }

         var9 = new StringBuilder();
         var9.append("ServiceMain.onHandleIntent (MSG_CALL_RINGING) curText = ");
         var9.append(var1);
         MyLog.log(this, (String)var9.toString());
         this.a(var1, a[this.F], this.Q, var2);
      }
   }

   private void b() {
      this.ay = "";
      this.az = "";
      this.aA = "";
      this.aB = "";
      this.aC = "";
      this.aD = "";
   }

   private void b(String var1, String var2, boolean var3) {
      if (this.af) {
         MyLog.log(this, (String)"ServiceMain.handleSystem");
         String var4 = "";
         if (var1.equals(this.getResources().getString(2131492894))) {
            this.a();
            var2 = var4;
         } else if (var1.equals(this.getResources().getString(2131492897))) {
            var2 = this.getResources().getString(2131493309);
         } else if (var1.equals(this.getResources().getString(2131492895))) {
            var2 = this.ah;
         } else if (var1.equals(this.getResources().getString(2131492896))) {
            var2 = this.ai;
         } else if (var1.equals(this.getResources().getString(2131492892))) {
            var2 = this.aj;
         } else if (var1.equals(this.getResources().getString(2131492893))) {
            var2 = this.ak;
         } else if (var1.equals(this.getResources().getString(2131492898))) {
            StringBuilder var6 = new StringBuilder();
            var6.append(this.am);
            if (this.an) {
               StringBuilder var5 = new StringBuilder();
               var5.append(" ");
               var5.append(var2);
               var1 = var5.toString();
            } else {
               var1 = "";
            }

            var6.append(var1);
            var2 = var6.toString();
         } else {
            var2 = var4;
            if (var1.equals(this.getResources().getString(2131492899))) {
               var2 = this.al;
            }
         }

         if (!var2.isEmpty()) {
            this.a(var2, a[this.ag], 1, var3);
         }
      }
   }

   private void b(String var1, boolean var2) {
      if (this.aw) {
         MyLog.log(this, (String)"ServiceMain.handleApps");
         if (var2) {
            var1 = this.getString(2131493309);
         }

         if (!var1.isEmpty()) {
            this.a(var1, a[this.ax], 1, false);
         }
      }
   }

   private void c() {
      MyLog.log(this, (String)"ServiceMain.pref_init");
      SharedPreferences var1 = PreferenceManager.getDefaultSharedPreferences(this);
      String var2;
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.b = Utils.prefGetBoolean(this, var1, "pref_morse_general_dnd", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.c = Utils.prefGetBoolean(this, var1, "pref_morse_general_muteincalls", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.d = Utils.prefGetInt(this, var1, "pref_morse_general_initialdelay", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.e = Utils.prefGetInt(this, var1, "pref_morse_general_volumedownstop", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.f = Utils.prefGetBoolean(this, var1, "pref_voice_general_dnd", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.g = Utils.prefGetBoolean(this, var1, "pref_voice_general_muteincalls", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.h = Utils.prefGetInt(this, var1, "pref_voice_general_initialdelay", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.i = Utils.prefGetInt(this, var1, "pref_morse_wpm", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.j = Utils.prefGetBoolean(this, var1, "pref_morse_farnsworth_enable", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.k = Utils.prefGetInt(this, var1, "pref_morse_farnsworth_wpm", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.l = Utils.prefGetBoolean(this, var1, "pref_morse_punctuation", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.m = Utils.prefGetString(this, var1, "pref_voice_locale", "pref_general_locale", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.n = Utils.prefGetInt(this, var1, "pref_voice_speed", "pref_general_speechrate", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.o = Utils.prefGetInt(this, var1, "pref_voice_pitch", "pref_general_pitch", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.p = Utils.prefGetInt(this, var1, "pref_voice_vol", "pref_general_volume", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.q = Utils.prefGetBoolean(this, var1, "pref_audio_enable", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.r = Utils.prefGetBoolean(this, var1, "pref_audio_vibration_enable", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.s = Utils.prefGetInt(this, var1, "pref_audio_freq", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.t = Utils.prefGetInt(this, var1, "pref_audio_vol", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.u = Utils.prefGetInt(this, var1, "pref_audio_ramp", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.v = Utils.prefGetBoolean(this, var1, "pref_display_enable", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.w = Utils.prefGetInt(this, var1, "pref_display_how", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.x = Utils.prefGetInt(this, var1, "pref_display_pos", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.y = Utils.prefGetBoolean(this, var1, "pref_display_stayontop", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.z = Utils.prefGetBoolean(this, var1, "pref_display_text", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.A = Utils.prefGetBoolean(this, var1, "pref_display_flash", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.B = Utils.prefGetColor(this, var1, "pref_display_color", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.C = Utils.prefGetColor(this, var1, "pref_display_color_me_highlight", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.D = Utils.prefGetColor(this, var1, "pref_display_color_text_highlight", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.E = Utils.prefGetBoolean(this, var1, "pref_call_enable", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.F = Utils.prefGetInt(this, var1, "pref_call_stream", "pref_call_e1pro_stream", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.G = Utils.prefGetString(this, var1, "pref_call_string1", "pref_call_e1pro_string1", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.H = Utils.prefGetInt(this, var1, "pref_call_num", "pref_call_e1pro_num", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.I = Utils.prefGetBoolean(this, var1, "pref_call_contactdisplayname", "pref_call_e1pro_contactdisplayname", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.J = Utils.prefGetBoolean(this, var1, "pref_call_contactfirstname", "pref_call_e1pro_contactfirstname", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.K = Utils.prefGetBoolean(this, var1, "pref_call_contactlastname", "pref_call_e1pro_contactlastname", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.L = Utils.prefGetBoolean(this, var1, "pref_call_contactinitials", "pref_call_e1pro_contactinitials", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.M = Utils.prefGetBoolean(this, var1, "pref_call_contactnickname", "pref_call_e1pro_contactnickname", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.N = Utils.prefGetString(this, var1, "pref_call_string2", "pref_call_e1pro_string2", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.O = Utils.prefGetString(this, var1, "pref_call_contactname_none", "pref_call_e1pro_contactname_none", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.P = Utils.prefGetString(this, var1, "pref_call_num_none", "pref_call_e1pro_num_none", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.Q = Utils.prefGetInt(this, var1, "pref_call_repeat", "pref_call_e1pro_repeat", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.R = Utils.prefGetBoolean(this, var1, "pref_sms_enable", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.S = Utils.prefGetInt(this, var1, "pref_sms_stream", "pref_sms_e1pro_stream", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.T = Utils.prefGetString(this, var1, "pref_sms_string1", "pref_sms_e1pro_string1", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.U = Utils.prefGetInt(this, var1, "pref_sms_num", "pref_sms_e1pro_num", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.V = Utils.prefGetBoolean(this, var1, "pref_sms_contactdisplayname", "pref_sms_e1pro_contactdisplayname", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.W = Utils.prefGetBoolean(this, var1, "pref_sms_contactfirstname", "pref_sms_e1pro_contactfirstname", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.X = Utils.prefGetBoolean(this, var1, "pref_sms_contactlastname", "pref_sms_e1pro_contactlastname", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.Y = Utils.prefGetBoolean(this, var1, "pref_sms_contactinitials", "pref_sms_e1pro_contactinitials", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.Z = Utils.prefGetBoolean(this, var1, "pref_sms_contactnickname", "pref_sms_e1pro_contactnickname", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.aa = Utils.prefGetBoolean(this, var1, "pref_sms_text", "pref_sms_e1pro_text", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.ab = Utils.prefGetString(this, var1, "pref_sms_string2", "pref_sms_e1pro_string2", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.ac = Utils.prefGetString(this, var1, "pref_sms_contactname_none", "pref_sms_e1pro_contactname_none", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.ad = Utils.prefGetString(this, var1, "pref_sms_num_none", "pref_sms_e1pro_num_none", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.ae = Utils.prefGetInt(this, var1, "pref_sms_repeat", "pref_sms_e1pro_repeat", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.af = Utils.prefGetBoolean(this, var1, "pref_system_enable", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.ag = Utils.prefGetInt(this, var1, "pref_system_stream", "pref_system_e1pro_stream", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.ah = Utils.prefGetString(this, var1, "pref_system_powerconectedstring", "pref_system_e1pro_powerconectedstring", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.ai = Utils.prefGetString(this, var1, "pref_system_powerdisconectedstring", "pref_system_e1pro_powerdisconectedstring", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.aj = Utils.prefGetString(this, var1, "pref_system_batterylowstring", "pref_system_e1pro_batterylowstring", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.ak = Utils.prefGetString(this, var1, "pref_system_batteryokstring", "pref_system_e1pro_batteryokstring", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.al = Utils.prefGetString(this, var1, "pref_system_wifi_disconnectedstring", "pref_system_e1pro_wifi_disconnectedstring", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.am = Utils.prefGetString(this, var1, "pref_system_wifi_connectedstring", "pref_system_e1pro_wifi_connectedstring", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.an = Utils.prefGetBoolean(this, var1, "pref_system_wifi_connectedssid", "pref_system_e1pro_wifi_connectedssid", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.aw = Utils.prefGetBoolean(this, var1, "pref_apps_enable", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.ax = Utils.prefGetInt(this, var1, "pref_apps_stream", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.ao = Utils.prefGetBoolean(this, var1, "pref_chime_enable", (String)null, var2, "_def");

      for(int var3 = 0; var3 < 24; ++var3) {
         boolean[] var4 = this.aq;
         String var5 = String.format(Locale.US, "pref_chime_hourenable_%02d", var3);
         if (App.c) {
            var2 = "_morsedef";
         } else {
            var2 = "_voicedef";
         }

         var4[var3] = Utils.prefGetBoolean(this, var1, var5, (String)null, var2, "_def");
      }

      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.ap = Utils.prefGetInt(this, var1, "pref_chime_stream", "pref_chime_e1pro_stream", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.ar = Utils.prefGetString(this, var1, "pref_chime_string1", "pref_chime_e1pro_string1", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.as = Utils.prefGetString(this, var1, "pref_chime_string2", "pref_chime_e1pro_string2", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.at = Utils.prefGetInt(this, var1, "pref_chime_timehow", "pref_chime_e1pro_timehow", var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.au = Utils.prefGetBoolean(this, var1, "pref_reminders_enable", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.av = Utils.prefGetInt(this, var1, "pref_reminders_stream", (String)null, var2, "_def");
   }

   public IBinder onBind(Intent var1) {
      MyLog.log("ServiceMain.onBind");
      return null;
   }

   public void onCreate() {
      super.onCreate();
      MyLog.log("ServiceMain.OnCreate");
   }

   public void onDestroy() {
      MyLog.log("ServiceMain.OnDestroy");
      super.onDestroy();
   }

   protected void onHandleIntent(Intent var1) {
      MyLog.log("-----------------------------------------------------------------------------------------");
      MyLog.log("ServiceMain.onHandleIntent");
      MyLog.log("ServiceMain.onCreate registering broadcast receiver");
      android.support.v4.a.b var2 = android.support.v4.a.b.a((Context)this);
      IntentFilter var3 = new IntentFilter();
      var3.addAction("LBR_ACTION_SETTINGSCHANGED");
      var2.a(this.aG, var3);
      this.c();
      String var4;
      if (var1 != null) {
         var4 = var1.getStringExtra(this.getResources().getString(2131492900));
      } else {
         var4 = "";
      }

      String var10;
      if (var1 != null) {
         var10 = var1.getStringExtra(this.getResources().getString(2131492875));
      } else {
         var10 = "";
      }

      String var9;
      if (var1 != null) {
         var9 = var1.getStringExtra(this.getResources().getString(2131492876));
      } else {
         var9 = "";
      }

      int var5;
      if (var1 != null) {
         var5 = var1.getIntExtra(this.getResources().getString(2131492873), -1);
      } else {
         var5 = 0;
      }

      int var6;
      if (var1 != null) {
         var6 = var1.getIntExtra(this.getResources().getString(2131492874), -1);
      } else {
         var6 = 0;
      }

      String var8 = var10;
      if (var10 == null) {
         var8 = "";
      }

      var10 = var9;
      if (var9 == null) {
         var10 = "";
      }

      MyLog.log(this, (String)String.format(Locale.US, "ServiceMain.onHandleIntent What=%s extraT1=%s extraT2=%s extraI1=%d extraI2=%d", var4, var8, var10, var5, var6));
      boolean var7 = var4.endsWith("_TEST");
      if (var7) {
         MyLog.log("ServiceMain.onHandleIntent isTest=true");
      }

      if (var4.equals(this.getResources().getString(2131492882))) {
         this.a(this.getString(2131493309), 5, 1, true);
      } else if (var4.equals(this.getResources().getString(2131492878))) {
         this.a();
      } else if (var4.equals(this.getResources().getString(2131492881))) {
         MyLog.log("ServiceMain.onHandleIntent MSG_MN_STOP");
      } else if (var4.startsWith(this.getResources().getString(2131492867))) {
         this.a(var8, var7);
      } else if (var4.startsWith(this.getResources().getString(2131492887))) {
         this.a(var8, var10, var7);
      } else if (var4.startsWith(this.getResources().getString(2131492891))) {
         this.b(var4, var10, var7);
      } else if (var4.startsWith(this.getResources().getString(2131492870))) {
         this.a(var5, var6, var7);
      } else if (var4.startsWith(this.getResources().getString(2131492883))) {
         this.a(var4, var8, var5, var6, var7);
      } else if (var4.startsWith(this.getResources().getString(2131492864))) {
         this.b(var10, var7);
      }

      MyLog.log("ServiceMain.onHandleIntent unregistering local BroadcastReceiver");
      android.support.v4.a.b.a((Context)this).a(this.aG);
      MyLog.log(this, (String)"ServiceMain.onHandleIntent OUT");
      MyLog.log("-----------------------------------------------------------------------------------------");
   }
}
