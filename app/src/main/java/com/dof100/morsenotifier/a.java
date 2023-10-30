package com.dof100.morsenotifier;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import java.util.Locale;

class a {
   String a = "All non-system apps";
   String b = "";
   String c = "";
   String d = "";
   String e = "";
   boolean f = true;
   boolean g = false;
   boolean h = false;
   String i = "";
   String j = "";

   public a() {
      this.a();
   }

   private void a() {
      this.a = "All non-system apps";
      this.b = "";
      this.c = "";
      this.d = "";
      this.e = "";
      this.f = true;
      this.g = false;
      this.h = false;
      this.i = "";
      this.j = "";
   }

   private String b(Context var1) {
      byte var8;
      label47: {
         String var2 = this.a;
         int var3 = var2.hashCode();
         if (var3 != 1354875300) {
            if (var3 != 1655429668) {
               if (var3 == 1804173745 && var2.equals("All apps")) {
                  var8 = 0;
                  break label47;
               }
            } else if (var2.equals("All non-system apps")) {
               var8 = 2;
               break label47;
            }
         } else if (var2.equals("All system apps")) {
            var8 = 1;
            break label47;
         }

         var8 = -1;
      }

      switch(var8) {
      case 0:
         return "All apps";
      case 1:
         return "All system apps";
      case 2:
         return "All non-system apps";
      default:
         MyLog.log(String.format("MyAppNotificationFilter.getAppName mPackage=%s", this.a));
         PackageManager var6 = var1.getPackageManager();
         if (var6 == null) {
            MyLog.log("MyAppNotificationFilter.getAppName ERROR PackageManager=null");
            return this.a;
         } else {
            ApplicationInfo var5;
            try {
               var5 = var6.getApplicationInfo(this.a, 0);
            } catch (NameNotFoundException var4) {
               var4.printStackTrace();
               var5 = null;
            }

            if (var5 == null) {
               return "-";
            } else {
               String var7 = (String)var6.getApplicationLabel(var5);
               if (var7 == null) {
                  return this.a;
               } else {
                  MyLog.log(String.format("MyAppNotificationFilter.getAppName appname=%s", var7));
                  return var7;
               }
            }
         }
      }
   }

   public String a(Context var1) {
      String var2;
      byte var9;
      label43: {
         var2 = this.a;
         int var3 = var2.hashCode();
         if (var3 != 1354875300) {
            if (var3 != 1655429668) {
               if (var3 == 1804173745 && var2.equals("All apps")) {
                  var9 = 0;
                  break label43;
               }
            } else if (var2.equals("All non-system apps")) {
               var9 = 2;
               break label43;
            }
         } else if (var2.equals("All system apps")) {
            var9 = 1;
            break label43;
         }

         var9 = -1;
      }

      String var7;
      StringBuilder var8;
      switch(var9) {
      case 0:
         var7 = "Notifications from all apps";
         break;
      case 1:
         var7 = "Notifications from all android system apps";
         break;
      case 2:
         var7 = "Notifications from all non-android system apps";
         break;
      default:
         var7 = this.b(var1);
         var8 = new StringBuilder();
         var8.append("Notifications from ");
         var8.append(var7.replace(".", ".\u200b"));
         var7 = var8.toString();
      }

      String var5;
      Object[] var10;
      StringBuilder var11;
      Locale var12;
      label33: {
         if (!this.b.isEmpty()) {
            var8 = new StringBuilder();
            var8.append(var7);
            var8.append(String.format(Locale.US, " that contain '%s'", this.b));
            String var4 = var8.toString();
            var2 = var4;
            if (!this.c.isEmpty()) {
               var11 = new StringBuilder();
               var11.append(var4);
               var12 = Locale.US;
               var5 = " and do not contain '%s'";
               var10 = new Object[]{this.c};
               break label33;
            }
         } else {
            var2 = var7;
            if (!this.c.isEmpty()) {
               StringBuilder var6 = new StringBuilder();
               var6.append(var7);
               var12 = Locale.US;
               var5 = " that do not contain '%s'";
               var10 = new Object[]{this.c};
               var11 = var6;
               break label33;
            }
         }

         return var2;
      }

      var11.append(String.format(var12, var5, var10));
      return var11.toString();
   }

   public String a(MyRecentAppNotification var1) {
      String var2;
      byte var12;
      label157: {
         var2 = this.a;
         int var3 = var2.hashCode();
         if (var3 != 1354875300) {
            if (var3 != 1655429668) {
               if (var3 == 1804173745 && var2.equals("All apps")) {
                  var12 = 0;
                  break label157;
               }
            } else if (var2.equals("All non-system apps")) {
               var12 = 2;
               break label157;
            }
         } else if (var2.equals("All system apps")) {
            var12 = 1;
            break label157;
         }

         var12 = -1;
      }

      boolean var15;
      label148: {
         label147: {
            switch(var12) {
            case 0:
               break label147;
            case 1:
               if (var1.b.startsWith("com.android") || var1.b.equals("android")) {
                  break label147;
               }
               break;
            case 2:
               if (!var1.b.startsWith("com.android") && !var1.b.equals("android")) {
                  break label147;
               }
               break;
            default:
               if (this.a.equals(var1.b)) {
                  break label147;
               }
            }

            var15 = false;
            break label148;
         }

         var15 = true;
      }

      if (!var15) {
         return "";
      } else {
         MyLog.log(String.format(Locale.US, "MyAppNotificationFilter.checkNotification package name OK (%s)", var1.b));
         StringBuilder var11 = new StringBuilder();
         var11.append(var1.c);
         var11.append(var1.d);
         var11.append(var1.e);
         var2 = var11.toString();
         String[] var4;
         int var5;
         int var6;
         boolean var7;
         if (this.b.isEmpty()) {
            MyLog.log("MyAppNotificationFilter.checkNotification mCriteriaContains OK (empty)");
            var15 = true;
         } else {
            var4 = this.b.toLowerCase().split(" or ");
            var5 = var4.length;
            var6 = 0;
            var7 = false;

            while(true) {
               var15 = var7;
               if (var6 >= var5) {
                  break;
               }

               String var8 = var4[var6];
               if (var2.contains(var8.trim())) {
                  MyLog.log(String.format(Locale.US, "MyAppNotificationFilter.checkNotification mCriteriaContains OK (contains %s)", var8));
                  var7 = true;
               }

               ++var6;
            }
         }

         String var10;
         if (!var15) {
            var10 = "MyAppNotificationFilter.checkNotification Filter does not match (contains)";
         } else {
            String var14;
            if (this.c.isEmpty()) {
               MyLog.log("MyAppNotificationFilter.checkNotification mFilterContainsnot OK (empty)");
               var7 = var15;
            } else {
               String[] var18 = this.c.toLowerCase().split(" or ");
               var5 = var18.length;
               var6 = 0;

               while(true) {
                  var7 = var15;
                  if (var6 >= var5) {
                     break;
                  }

                  var14 = var18[var6];
                  if (var2.contains(var14.trim())) {
                     MyLog.log(String.format(Locale.US, "MyAppNotificationFilter.checkNotification mFilterContainsnot found (contasins %s)", var14));
                     var15 = false;
                  }

                  ++var6;
               }
            }

            if (!var7) {
               var10 = "MyAppNotificationFilter.checkNotification Filter does not match (contains not)";
            } else {
               if (this.d.isEmpty()) {
                  MyLog.log("MyAppNotificationFilter.checkNotification mCriteriaAdvCategory OK (empty)");
               } else {
                  var4 = this.d.toLowerCase().split(" or ");
                  var5 = var4.length;
                  var6 = 0;
                  var15 = false;

                  while(true) {
                     var7 = var15;
                     if (var6 >= var5) {
                        break;
                     }

                     var2 = var4[var6];
                     var7 = var15;
                     if (var1.f != null) {
                        var7 = var15;
                        if (var1.f.toLowerCase().equals(var2.trim())) {
                           MyLog.log(String.format(Locale.US, "MyAppNotificationFilter.checkNotification mCriteriaAdvCategory found (cat=%s)", var2));
                           var7 = true;
                        }
                     }

                     ++var6;
                     var15 = var7;
                  }
               }

               if (!var7) {
                  var10 = "MyAppNotificationFilter.checkNotification Filter does not match (category)";
               } else {
                  boolean var17;
                  if (this.e.isEmpty()) {
                     MyLog.log("MyAppNotificationFilter.checkNotification mCriteriaAdvID OK (empty)");
                     var17 = var7;
                  } else {
                     String[] var13 = this.e.toLowerCase().split(" or ");
                     var5 = var13.length;
                     int var19 = 0;
                     var15 = false;

                     while(true) {
                        var17 = var15;
                        if (var19 >= var5) {
                           break;
                        }

                        var14 = var13[var19];

                        label102: {
                           try {
                              var6 = Integer.parseInt(var14.trim());
                           } catch (NumberFormatException var9) {
                              var9.printStackTrace();
                              break label102;
                           }

                           if (var1.g == var6) {
                              MyLog.log(String.format(Locale.US, "MyAppNotificationFilter.checkNotification mCriteriaAdvID found (id=%d)", var6));
                              var15 = true;
                           }
                        }

                        ++var19;
                     }
                  }

                  if (var17) {
                     MyLog.log("MyAppNotificationFilter.checkNotification Filter matches OK");
                     var2 = this.i;
                     var14 = var2;
                     StringBuilder var16;
                     if (this.f) {
                        var16 = new StringBuilder();
                        var16.append(var2.trim());
                        var16.append(" ");
                        var16.append(var1.c);
                        var14 = var16.toString();
                     }

                     var2 = var14;
                     if (this.g) {
                        var11 = new StringBuilder();
                        var11.append(var14.trim());
                        var11.append(" ");
                        var11.append(var1.d);
                        var2 = var11.toString();
                     }

                     var14 = var2;
                     if (this.h) {
                        var16 = new StringBuilder();
                        var16.append(var2.trim());
                        var16.append(" ");
                        var16.append(var1.e);
                        var14 = var16.toString();
                     }

                     return var14.trim();
                  }

                  var10 = "MyAppNotificationFilter.checkNotification Filter does not match (id)";
               }
            }
         }

         MyLog.log(var10);
         return "";
      }
   }

   public void a(Editor var1, int var2) {
      MyLog.log(String.format(Locale.US, "MyAppNotificationFilter.save - filter no %d, package    =%s", var2, this.a));
      StringBuilder var3 = new StringBuilder();
      var3.append("app_filter_");
      var3.append(var2);
      var3.append("_Package");
      var1.putString(var3.toString(), this.a);
      var3 = new StringBuilder();
      var3.append("app_filter_");
      var3.append(var2);
      var3.append("_CriteriaContains");
      var1.putString(var3.toString(), this.b);
      var3 = new StringBuilder();
      var3.append("app_filter_");
      var3.append(var2);
      var3.append("_CriteriaContainsNot");
      var1.putString(var3.toString(), this.c);
      var3 = new StringBuilder();
      var3.append("app_filter_");
      var3.append(var2);
      var3.append("_CriteriaCategory");
      var1.putString(var3.toString(), this.d);
      var3 = new StringBuilder();
      var3.append("app_filter_");
      var3.append(var2);
      var3.append("_CriteriaID");
      var1.putString(var3.toString(), this.e);
      var3 = new StringBuilder();
      var3.append("app_filter_");
      var3.append(var2);
      var3.append("_SayTitle");
      var1.putBoolean(var3.toString(), this.f);
      var3 = new StringBuilder();
      var3.append("app_filter_");
      var3.append(var2);
      var3.append("_SayText");
      var1.putBoolean(var3.toString(), this.g);
      var3 = new StringBuilder();
      var3.append("app_filter_");
      var3.append(var2);
      var3.append("_SayTicker");
      var1.putBoolean(var3.toString(), this.h);
      var3 = new StringBuilder();
      var3.append("app_filter_");
      var3.append(var2);
      var3.append("_mSayBefore");
      var1.putString(var3.toString(), this.i);
      var3 = new StringBuilder();
      var3.append("app_filter_");
      var3.append(var2);
      var3.append("_SayAfter");
      var1.putString(var3.toString(), this.j);
      MyLog.log(String.format(Locale.US, "MyAppNotificationFilter.save %d", var2));
      MyLog.log(String.format(Locale.US, "MyAppNotificationFilter.save package    =%s", this.a));
      MyLog.log(String.format(Locale.US, "MyAppNotificationFilter.save contains   =%s contains not=%s", this.b, this.c));
      MyLog.log(String.format(Locale.US, "MyAppNotificationFilter.save Say title  =%b text =%b ticker=%b", this.f, this.g, this.h));
      MyLog.log(String.format(Locale.US, "MyAppNotificationFilter.save Say before =%s after=%s", this.i, this.j));
   }

   public void a(SharedPreferences var1, int var2) {
      this.a();
      StringBuilder var3 = new StringBuilder();
      var3.append("app_filter_");
      var3.append(var2);
      var3.append("_Package");
      this.a = var1.getString(var3.toString(), "All non-system apps");
      var3 = new StringBuilder();
      var3.append("app_filter_");
      var3.append(var2);
      var3.append("_CriteriaContains");
      this.b = var1.getString(var3.toString(), this.b);
      var3 = new StringBuilder();
      var3.append("app_filter_");
      var3.append(var2);
      var3.append("_CriteriaContainsNot");
      this.c = var1.getString(var3.toString(), this.c);
      var3 = new StringBuilder();
      var3.append("app_filter_");
      var3.append(var2);
      var3.append("_CriteriaCategory");
      this.d = var1.getString(var3.toString(), this.d);
      var3 = new StringBuilder();
      var3.append("app_filter_");
      var3.append(var2);
      var3.append("_CriteriaID");
      this.e = var1.getString(var3.toString(), this.e);
      var3 = new StringBuilder();
      var3.append("app_filter_");
      var3.append(var2);
      var3.append("_SayTitle");
      this.f = var1.getBoolean(var3.toString(), this.f);
      var3 = new StringBuilder();
      var3.append("app_filter_");
      var3.append(var2);
      var3.append("_SayText");
      this.g = var1.getBoolean(var3.toString(), this.g);
      var3 = new StringBuilder();
      var3.append("app_filter_");
      var3.append(var2);
      var3.append("_SayTicker");
      this.h = var1.getBoolean(var3.toString(), this.h);
      var3 = new StringBuilder();
      var3.append("app_filter_");
      var3.append(var2);
      var3.append("_mSayBefore");
      this.i = var1.getString(var3.toString(), this.i);
      var3 = new StringBuilder();
      var3.append("app_filter_");
      var3.append(var2);
      var3.append("_SayAfter");
      this.j = var1.getString(var3.toString(), this.j);
      MyLog.log(String.format(Locale.US, "MyAppNotificationFilter.load - filter no %d, package    =%s", var2, this.a));
   }
}
