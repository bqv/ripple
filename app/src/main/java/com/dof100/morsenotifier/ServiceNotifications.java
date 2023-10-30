package com.dof100.morsenotifier;

import android.annotation.TargetApi;
import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Build.VERSION;
import android.preference.PreferenceManager;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;

import java.util.Iterator;
import java.util.Locale;

@TargetApi(21)
public class ServiceNotifications extends NotificationListenerService {
   private boolean a = false;
   private int b = 0;
   private boolean c = false;
   private boolean d = false;
   private boolean e = false;
   private MyRecentAppNotifications f = null;
   private MyAppNotificationFilters g = null;
   private final BroadcastReceiver h = new BroadcastReceiver() {
      public void onReceive(Context var1, Intent var2) {
         if ("LBR_ACTION_RECENTNOTIFICATIONSCHANGED".equals(var2.getAction())) {
            MyLog.log("ServiceNotifications.BroadcastReceiver got LBR_ACTION_RECENTNOTIFICATIONSCHANGED");
            ServiceNotifications.this.f.load(ServiceNotifications.this);
         }

      }
   };
   private final Handler i = new Handler();
   private final Runnable j = new Runnable() {
      public void run() {
         MyLog.log("ServiceNotifications.rSendNotification handler");
         if (ServiceNotifications.this.b()) {
            ServiceNotifications.this.i.postDelayed(this, 3000L);
         }

      }
   };

   private void a() {
      MyLog.log(this, (String)"ServiceNotifications.load_params");
      SharedPreferences var1 = PreferenceManager.getDefaultSharedPreferences(this);
      String var2;
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.c = Utils.prefGetBoolean(this, var1, "pref_audio_enable", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.d = Utils.prefGetBoolean(this, var1, "pref_audio_vibration_enable", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.e = Utils.prefGetBoolean(this, var1, "pref_display_enable", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.a = Utils.prefGetBoolean(this, var1, "pref_apps_enable", (String)null, var2, "_def");
      if (App.c) {
         var2 = "_morsedef";
      } else {
         var2 = "_voicedef";
      }

      this.b = Utils.prefGetInt(this, var1, "pref_apps_multiple", (String)null, var2, "_def");
      this.g.a(this);
   }

   private void a(MyRecentAppNotification var1) {
      MyLog.log(this, (String)"ServiceNotifications.notificationAnnounceNow Starting service");
      var1.h = 1;
      Intent var2 = new Intent(this, ServiceMain.class);
      var2.putExtra(this.getResources().getString(R.string.MSG_WHAT), this.getResources().getString(R.string.MSG_APPS_NOTIFY));
      var2.putExtra(this.getResources().getString(R.string.MSG_EXTRATEXT2), var1.j);
      this.startService(var2);
   }

   private boolean b() {
      long var1 = System.currentTimeMillis();
      StringBuilder var3 = new StringBuilder();
      var3.append("ServiceNotifications.notificationAnnounceCheckCandidates Queue length=");
      var3.append(this.f.notifications.size());
      MyLog.log(this, (String)var3.toString());
      Iterator var4 = this.f.notifications.iterator();
      int var5 = -1;

      while(true) {
         label104:
         while(true) {
            boolean var6 = var4.hasNext();
            boolean var7 = false;
            MyRecentAppNotification var12;
            Iterator var18;
            String var19;
            if (!var6) {
               var18 = this.f.notifications.iterator();
               var5 = 0;

               while(var18.hasNext()) {
                  var12 = (MyRecentAppNotification)var18.next();
                  MyLog.log("ServiceNotifications.notificationAnnounceCheckCandidates for 3");
                  if (var12.h == 0) {
                     ++var5;
                  }
               }

               if (var5 > 0) {
                  var19 = String.format(Locale.US, "ServiceNotifications.notificationAnnounceCheckCandidates Still %d notifications waiting", var5);
               } else {
                  var19 = "ServiceNotifications.notificationAnnounceCheckCandidates No more notifications waiting";
               }

               MyLog.log(this, (String)var19);
               if (var5 > 0) {
                  var7 = true;
               }

               return var7;
            }

            MyRecentAppNotification var8 = (MyRecentAppNotification)var4.next();
            int var9 = var5 + 1;
            MyLog.log(this, (String)String.format(Locale.US, "ServiceNotifications.notificationAnnounceCheckCandidates n%d: checking", var9));
            if (var8.h != 0) {
               var5 = var9;
            } else {
               long var10 = var1 - var8.timestamp;
               if (var10 < 3000L) {
                  var5 = var9;
               } else {
                  MyLog.log(this, (String)String.format(Locale.US, "ServiceNotifications.notificationAnnounceCheckCandidates n%d: waiting expired (dt=%d msec)", var9, var10));
                  var18 = this.f.notifications.iterator();
                  var5 = -1;

                  int var13;
                  boolean var22;
                  while(true) {
                     if (var18.hasNext()) {
                        var12 = (MyRecentAppNotification)var18.next();
                        var13 = var5 + 1;
                        if (!var12.b.equals(var8.b)) {
                           var5 = var13;
                           continue;
                        }

                        if (var12.h != 0) {
                           var5 = var13;
                           continue;
                        }

                        var5 = var13;
                        if (var1 - var12.timestamp >= 3000L) {
                           continue;
                        }

                        MyLog.log(this, (String)String.format(Locale.US, "ServiceNotifications.notificationAnnounceCheckCandidates n%d: found n%d still waiting ", var9, var13));
                        var22 = true;
                        break;
                     }

                     var22 = false;
                     break;
                  }

                  if (var22) {
                     var19 = String.format(Locale.US, "ServiceNotifications.notificationAnnounceCheckCandidates n%d: found other still waiting ", var9);
                  } else {
                     MyLog.log(this, (String)String.format(Locale.US, "ServiceNotifications.notificationAnnounceCheckCandidates n%d: searching for best notification ", var9));
                     Iterator var14 = this.f.notifications.iterator();
                     MyRecentAppNotification var20 = null;
                     var13 = -1;
                     var5 = Integer.MAX_VALUE;

                     while(true) {
                        while(var14.hasNext()) {
                           MyRecentAppNotification var15 = (MyRecentAppNotification)var14.next();
                           MyLog.log(this, (String)"ServiceNotifications.notificationAnnounceCheckCandidates for");
                           int var16 = var13 + 1;
                           if (var15.h != 0) {
                              var13 = var16;
                           } else if (!var15.b.equals(var8.b)) {
                              var13 = var16;
                           } else {
                              var15.h = -4;
                              Object[] var17;
                              Locale var21;
                              String var23;
                              switch(this.b) {
                              case 1:
                                 var13 = var16;
                                 if (var15.i >= var5) {
                                    continue;
                                 }

                                 var5 = var15.i;
                                 var21 = Locale.US;
                                 var23 = "ServiceNotifications.notificationAnnounceCheckCandidates n%d: found best match = n%d, filter=%d";
                                 var17 = new Object[]{var9, var16, var5};
                                 break;
                              case 2:
                                 var13 = var16;
                                 if (var20 != null) {
                                    continue;
                                 }

                                 var5 = var15.i;
                                 var21 = Locale.US;
                                 var23 = "ServiceNotifications.notificationAnnounceCheckCandidates n%d: first = n%d, filter=%d";
                                 var17 = new Object[]{var9, var16, var5};
                                 break;
                              case 3:
                                 var5 = var15.i;
                                 var21 = Locale.US;
                                 var23 = "ServiceNotifications.notificationAnnounceCheckCandidates n%d: last = n%d, filter=%d";
                                 var17 = new Object[]{var9, var16, var5};
                                 break;
                              default:
                                 var13 = var16;
                                 continue;
                              }

                              MyLog.log(this, (String)String.format(var21, var23, var17));
                              var20 = var15;
                              var13 = var16;
                           }
                        }

                        if (var20 == null) {
                           var19 = "ServiceNotifications.notificationAnnounceCheckCandidates ERROR nBest==null";
                        } else {
                           if (var5 >= 0) {
                              this.a(var20);
                              var5 = var9;
                              continue label104;
                           }

                           var19 = "ServiceNotifications.notificationAnnounceCheckCandidates ERROR filterBest<0";
                        }
                        break;
                     }
                  }

                  MyLog.log(this, (String)var19);
                  var5 = var9;
               }
            }
         }
      }
   }

   public IBinder onBind(Intent var1) {
      MyLog.log(this, (String)"ServiceNotifications.onBind");
      return super.onBind(var1);
   }

   public void onCreate() {
      super.onCreate();
      MyLog.log(this, (String)"ServiceNotifications.OnCreate");
      this.f = new MyRecentAppNotifications(this);
      this.g = new MyAppNotificationFilters(this);
      this.a();
      IntentFilter var1 = new IntentFilter();
      var1.addAction("LBR_ACTION_RECENTNOTIFICATIONSCHANGED");
      android.support.v4.a.b.a((Context)this).a(this.h, var1);
   }

   public void onDestroy() {
      MyLog.log(this, (String)"ServiceNotifications.OnDestroy");
      MyLog.log("ServiceMain.OnDestroy unregistering local BroadcastReceiver");
      android.support.v4.a.b.a((Context)this).a(this.h);
      super.onDestroy();
   }

   public void onInterruptionFilterChanged(int var1) {
      MyLog.log(this, (String)"ServiceNotifications.onInterruptionFilterChanged");
   }

   public void onListenerConnected() {
      MyLog.log(this, (String)"ServiceNotifications.onListenerConnected");
   }

   public void onListenerDisconnected() {
      MyLog.log(this, (String)"ServiceNotifications.onListenerDisconnected");
   }

   public void onListenerHintsChanged(int var1) {
      MyLog.log(this, (String)"ServiceNotifications.onListenerHintsChanged");
   }

   @TargetApi(19)
   public void onNotificationPosted(StatusBarNotification var1) {
      MyLog.log(this, (String)"ServiceNotifications.onNotificationPosted");
      String var2 = var1.getPackageName();
      Notification var3 = var1.getNotification();
      CharSequence var4 = var3.tickerText;
      String var5 = null;
      String var6 = null;
      String var12;
      if (var4 != null) {
         var12 = var3.tickerText.toString();
      } else {
         var12 = null;
      }

      label81: {
         if (VERSION.SDK_INT >= 19) {
            Bundle var7 = var3.extras;
            if (var7 != null) {
               var5 = var7.getString("android.title");
               CharSequence var14 = var7.getCharSequence("android.text");
               if (var14 != null) {
                  var6 = var14.toString();
               }
               break label81;
            }

            MyLog.log(this, (String)"ServiceNotifications.onNotificationPosted Extras=null");
         }

         var6 = null;
      }

      String var16 = var2;
      if (var2 == null) {
         var16 = "";
      }

      var2 = var12;
      if (var12 == null) {
         var2 = "";
      }

      var12 = var5;
      if (var5 == null) {
         var12 = "";
      }

      var5 = var6;
      if (var6 == null) {
         var5 = "";
      }

      PackageManager var15 = this.getPackageManager();
      if (var15 != null) {
         try {
            ApplicationInfo var8 = var15.getApplicationInfo(var16, 0);
            MyLog.log(this, (String)String.format(Locale.US, "ServiceNotifications.onNotificationPosted App Name     = %s", var15.getApplicationLabel(var8)));
         } catch (NameNotFoundException var10) {
            MyLog.log("ServiceNotifications.onNotificationPosted ERROR NameNotFoundException");
         }
      }

      MyLog.log(this, (String)String.format(Locale.US, "ServiceNotifications.onNotificationPosted Package      = %s", var16));
      MyLog.log(this, (String)String.format(Locale.US, "ServiceNotifications.onNotificationPosted Ticker       = %s", var2));
      MyLog.log(this, (String)String.format(Locale.US, "ServiceNotifications.onNotificationPosted Title        = %s", var12));
      MyLog.log(this, (String)String.format(Locale.US, "ServiceNotifications.onNotificationPosted Text         = %s", var5));
      MyLog.log(this, (String)String.format(Locale.US, "ServiceNotifications.onNotificationPosted isClearable  = %s", var1.isClearable()));
      MyLog.log(this, (String)String.format(Locale.US, "ServiceNotifications.onNotificationPosted isOngoing    = %s", var1.isOngoing()));
      MyLog.log(this, (String)String.format(Locale.US, "ServiceNotifications.onNotificationPosted flags        = %d", var3.flags));
      MyLog.log(this, (String)String.format(Locale.US, "ServiceNotifications.onNotificationPosted when         = %d", var3.when));
      var6 = "";
      if (VERSION.SDK_INT >= 21) {
         var6 = var3.category;
      }

      MyRecentAppNotification var13 = this.f.addNotification(this.getApplicationContext(), var16, var1.getId(), var6, var2, var12, var5);
      if (var13 == null) {
         MyLog.log(this, (String)"ServiceNotifications.onNotificationPosted duplicate notification found");
      } else {
         this.a();
         if (!this.a) {
            var13.h = -1;
         } else if (!this.c && !this.e && !this.d) {
            var13.h = -1;
         } else {
            var13.h = -2;

            for(int var9 = 0; var9 < this.g.a.size(); ++var9) {
               MyLog.log("ServiceNotifications.onNotificationPosted for 1");
               String var11 = ((MyAppNotificationFilter)this.g.a.get(var9)).a(var13);
               if (!var11.isEmpty()) {
                  var13.i = var9;
                  var13.j = var11;
                  if (this.b == 0) {
                     MyLog.log(this, (String)String.format(Locale.US, "ServiceNotifications.onNotificationPosted match with filter %d. Announcing right now", var9));
                     var13.h = 1;
                     this.a(var13);
                     return;
                  }

                  MyLog.log(this, (String)String.format(Locale.US, "ServiceNotifications.onNotificationPosted match with filter %d. Adding to queue for announcement", var9));
                  var13.h = 0;
                  this.i.removeCallbacks(this.j);
                  this.i.postDelayed(this.j, 3000L);
                  return;
               }
            }

         }
      }
   }

   public void onNotificationRankingUpdate(RankingMap var1) {
      MyLog.log(this, (String)"ServiceNotifications.onNotificationRankingUpdate");
   }

   public void onNotificationRemoved(StatusBarNotification var1) {
      MyLog.log(this, (String)"ServiceNotifications.onNotificationRemoved");
   }
}
