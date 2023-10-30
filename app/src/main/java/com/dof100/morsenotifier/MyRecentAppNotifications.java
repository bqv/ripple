package com.dof100.morsenotifier;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

class MyRecentAppNotifications {
   public final ArrayList<MyRecentAppNotification> notifications = new ArrayList<MyRecentAppNotification>();
   private boolean enabled = true;

   public MyRecentAppNotifications(Context var1) {
      MyLog.log("MyRecentAppNotifications.constructor");
      this.load(var1);
   }

   private void arrange() {
      StringBuilder var1 = new StringBuilder();
      var1.append("MyRecentAppNotifications.arrange - in (");
      var1.append(this.notifications.size());
      var1.append(") entries");
      MyLog.log(var1.toString());
      if (!this.enabled) {
         this.notifications.clear();
      } else {
         long var2 = System.currentTimeMillis();
         Iterator<MyRecentAppNotification> var4 = this.notifications.iterator();

         while(var4.hasNext()) {
            if (Math.abs(var2 - (var4.next()).timestamp) > 86400000L) {
               var4.remove();
            }
         }

         while(this.notifications.size() > 10) {
            this.notifications.remove(0);
         }
      }

      var1 = new StringBuilder();
      var1.append("MyRecentAppNotifications.arrange - out (");
      var1.append(this.notifications.size());
      var1.append(") entries");
      MyLog.log(var1.toString());
   }

   public static int n(Context var0) {
      return PreferenceManager.getDefaultSharedPreferences(var0).getInt("MyRecentAppNotifications_n", 0);
   }

   private void save(Context var1) {
      String var2 = "MyRecentAppNotifications.save (" +
              this.notifications.size() +
              ") entries";
      MyLog.log(var2);
      this.arrange();
      Editor var4 = PreferenceManager.getDefaultSharedPreferences(var1).edit();
      var4.putInt("MyRecentAppNotifications_enable", this.enabled ? 1 : 0);
      var4.putInt("MyRecentAppNotifications_n", this.notifications.size());
      int var3 = 0;

      for(Iterator<MyRecentAppNotification> var6 = this.notifications.iterator(); var6.hasNext(); ++var3) {
         (var6.next()).save(var4, var3);
      }

      var4.apply();
      String var5 = "MyRecentAppNotifications.save saved " +
              this.notifications.size() +
              " entries";
      MyLog.log(var5);
   }

   public MyRecentAppNotification addNotification(Context context, String var2, int var3, String var4, String var5, String var6, String var7) {
      MyLog.log("MyRecentAppNotifications.addNotification");
      long now = System.currentTimeMillis();
      Iterator<MyRecentAppNotification> notifications = this.notifications.iterator();
      boolean var11 = false;

      while(true) {
         MyRecentAppNotification notification;
         do {
            do {
               do {
                  do {
                     do {
                        do {
                           do {
                              if (!notifications.hasNext()) {
                                 notification = null;
                                 if (!var11) {
                                    notification = new MyRecentAppNotification();
                                    notification.timestamp = now;
                                    if (var2 == null) {
                                       var2 = "";
                                    }

                                    notification.b = var2;
                                    notification.c = Objects.requireNonNullElse(var6, "");
                                    notification.d = Objects.requireNonNullElse(var7, "");
                                    notification.e = Objects.requireNonNullElse(var5, "");
                                    notification.f = Objects.requireNonNullElse(var4, "");

                                    notification.g = var3;
                                    notification.h = -2;
                                    notification.i = -1;
                                    notification.j = "";
                                    this.notifications.add(notification);
                                 }

                                 this.save(context);
                                 return notification;
                              }

                              notification = notifications.next();
                           } while(Math.abs(now - notification.timestamp) > 100L);
                        } while(!var2.equals(notification.b));
                     } while(var3 != notification.g);
                  } while(var4 != null && !var4.equals(notification.f));
               } while(var6 != null && !var6.equals(notification.c));
            } while(var7 != null && !var7.equals(notification.d));
         } while(var5 != null && !var5.equals(notification.e));

         var11 = true;
      }
   }

   public void clear(Context var1) {
      MyLog.log("MyRecentAppNotifications.clear");
      this.notifications.clear();
      this.save(var1);
   }

   public void setEnable(Context var1, boolean var2) {
      String var3 = "MyRecentAppNotifications.setEnable " +
              var2;
      MyLog.log(var3);
      this.enabled = var2;
      if (!this.enabled) {
         this.notifications.clear();
      }

      this.save(var1);
   }

   public void load(Context var1) {
      MyLog.log("MyRecentAppNotifications.load");
      this.notifications.clear();
      SharedPreferences var2 = PreferenceManager.getDefaultSharedPreferences(var1);
      int var3 = var2.getInt("MyRecentAppNotifications_enable", 1);
      int var4 = 0;
      boolean var5;
      var5 = var3 == 1;

      this.enabled = var5;

      for(var3 = var2.getInt("MyRecentAppNotifications_n", 1); var4 < var3; ++var4) {
         MyRecentAppNotification var6 = new MyRecentAppNotification();
         var6.load(var2, var4);
         this.notifications.add(var6);
      }

      this.arrange();
      String var7 = "MyRecentAppNotifications.load loaded " + this.notifications.size() + " entries";
      MyLog.log(var7);
   }
}
