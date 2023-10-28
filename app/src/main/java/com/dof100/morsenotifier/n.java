package com.dof100.morsenotifier;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.Iterator;

class n {
   public final ArrayList a = new ArrayList();
   private boolean b = true;

   public n(Context var1) {
      i.a("MyRecentAppNotifications.constructor");
      this.b(var1);
   }

   private void a() {
      StringBuilder var1 = new StringBuilder();
      var1.append("MyRecentAppNotifications.arrange - in (");
      var1.append(this.a.size());
      var1.append(") entries");
      i.a(var1.toString());
      if (!this.b) {
         this.a.clear();
      } else {
         long var2 = System.currentTimeMillis();
         Iterator var4 = this.a.iterator();

         while(var4.hasNext()) {
            if (Math.abs(var2 - ((m)var4.next()).a) > 86400000L) {
               var4.remove();
            }
         }

         while(this.a.size() > 10) {
            this.a.remove(0);
         }
      }

      var1 = new StringBuilder();
      var1.append("MyRecentAppNotifications.arrange - out (");
      var1.append(this.a.size());
      var1.append(") entries");
      i.a(var1.toString());
   }

   public static int c(Context var0) {
      return PreferenceManager.getDefaultSharedPreferences(var0).getInt("MyRecentAppNotifications_n", 0);
   }

   private void d(Context var1) {
      StringBuilder var2 = new StringBuilder();
      var2.append("MyRecentAppNotifications.save (");
      var2.append(this.a.size());
      var2.append(") entries");
      i.a(var2.toString());
      this.a();
      Editor var4 = PreferenceManager.getDefaultSharedPreferences(var1).edit();
      var4.putInt("MyRecentAppNotifications_enable", this.b);
      var4.putInt("MyRecentAppNotifications_n", this.a.size());
      int var3 = 0;

      for(Iterator var6 = this.a.iterator(); var6.hasNext(); ++var3) {
         ((m)var6.next()).a(var4, var3);
      }

      var4.apply();
      StringBuilder var5 = new StringBuilder();
      var5.append("MyRecentAppNotifications.save saved ");
      var5.append(this.a.size());
      var5.append(" entries");
      i.a(var5.toString());
   }

   public m a(Context var1, String var2, int var3, String var4, String var5, String var6, String var7) {
      i.a("MyRecentAppNotifications.addNotification");
      long var8 = System.currentTimeMillis();
      Iterator var10 = this.a.iterator();
      boolean var11 = false;

      while(true) {
         m var12;
         do {
            do {
               do {
                  do {
                     do {
                        do {
                           do {
                              if (!var10.hasNext()) {
                                 var12 = null;
                                 if (!var11) {
                                    var12 = new m();
                                    var12.a = var8;
                                    if (var2 == null) {
                                       var2 = "";
                                    }

                                    var12.b = var2;
                                    if (var6 != null) {
                                       var12.c = var6;
                                    } else {
                                       var12.c = "";
                                    }

                                    if (var7 != null) {
                                       var12.d = var7;
                                    } else {
                                       var12.d = "";
                                    }

                                    if (var5 != null) {
                                       var12.e = var5;
                                    } else {
                                       var12.e = "";
                                    }

                                    if (var4 != null) {
                                       var12.f = var4;
                                    } else {
                                       var12.f = "";
                                    }

                                    var12.g = var3;
                                    var12.h = -2;
                                    var12.i = -1;
                                    var12.j = "";
                                    this.a.add(var12);
                                 }

                                 this.d(var1);
                                 return var12;
                              }

                              var12 = (m)var10.next();
                           } while(Math.abs(var8 - var12.a) > 100L);
                        } while(!var2.equals(var12.b));
                     } while(var3 != var12.g);
                  } while(var4 != null && !var4.equals(var12.f));
               } while(var6 != null && !var6.equals(var12.c));
            } while(var7 != null && !var7.equals(var12.d));
         } while(var5 != null && !var5.equals(var12.e));

         var11 = true;
      }
   }

   public void a(Context var1) {
      i.a("MyRecentAppNotifications.clear");
      this.a.clear();
      this.d(var1);
   }

   public void a(Context var1, boolean var2) {
      StringBuilder var3 = new StringBuilder();
      var3.append("MyRecentAppNotifications.setEnable ");
      var3.append(var2);
      i.a(var3.toString());
      this.b = var2;
      if (!this.b) {
         this.a.clear();
      }

      this.d(var1);
   }

   public void b(Context var1) {
      i.a("MyRecentAppNotifications.load");
      this.a.clear();
      SharedPreferences var2 = PreferenceManager.getDefaultSharedPreferences(var1);
      int var3 = var2.getInt("MyRecentAppNotifications_enable", 1);
      int var4 = 0;
      boolean var5;
      if (var3 == 1) {
         var5 = true;
      } else {
         var5 = false;
      }

      this.b = var5;

      for(var3 = var2.getInt("MyRecentAppNotifications_n", 1); var4 < var3; ++var4) {
         m var6 = new m();
         var6.a(var2, var4);
         this.a.add(var6);
      }

      this.a();
      StringBuilder var7 = new StringBuilder();
      var7.append("MyRecentAppNotifications.load loaded ");
      var7.append(this.a.size());
      var7.append(" entries");
      i.a(var7.toString());
   }
}
