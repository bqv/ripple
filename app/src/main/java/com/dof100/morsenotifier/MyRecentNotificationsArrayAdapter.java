package com.dof100.morsenotifier;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

class MyRecentNotificationsArrayAdapter extends ArrayAdapter implements OnClickListener {
   private final Context a;
   private final MyAppNotificationFilters b;
   private final LayoutInflater c;
   private final MyRecentNotificationsArrayAdapter.a d;

   public MyRecentNotificationsArrayAdapter(Context var1, ArrayList var2, MyAppNotificationFilters var3, MyRecentNotificationsArrayAdapter.a var4) {
      super(var1, 2131296263, var2);
      this.b = var3;
      this.d = var4;
      MyLog.log("MyRecentNotificationsArrayAdapter.constructor");
      this.a = var1;
      this.c = (LayoutInflater)this.a.getSystemService("layout_inflater");
   }

   public View getView(int var1, View var2, ViewGroup var3) {
      StringBuilder var4 = new StringBuilder();
      var4.append("MyAppFiltersArrayAdapter.getView position=");
      var4.append(var1);
      var4.append("  v=");
      var4.append(var2);
      MyLog.log(var4.toString());
      MyRecentAppNotification var5 = (MyRecentAppNotification)this.getItem(var1);
      MyRecentAppNotification var12 = var5;
      if (var5 == null) {
         var12 = new MyRecentAppNotification();
      }

      var12.i = -1;
      var12.j = "";

      for(var1 = 0; var1 < this.b.a.size(); ++var1) {
         String var13 = ((MyAppNotificationFilter)this.b.a.get(var1)).a(var12);
         if (!var13.isEmpty()) {
            var12.i = var1;
            var12.j = var13;
            break;
         }
      }

      View var14 = var2;
      if (var2 == null) {
         var14 = this.c.inflate(2131296263, var3, false);
      }

      var14.setTag(var12);
      TextView var6 = (TextView)var14.findViewById(2131165304);
      var6.setTag(var12);
      SimpleDateFormat var9 = new SimpleDateFormat("dd MMM yyyy, hh:mm:ss:ssss", Locale.US);
      Calendar var7 = Calendar.getInstance();
      var7.setTimeInMillis(var12.timestamp);
      var6.setText(var9.format(var7.getTime()));
      TextView var8 = (TextView)var14.findViewById(2131165296);
      var8.setTag(var12);
      var8.setText(Utils.a(this.a, var12.b));
      var8 = (TextView)var14.findViewById(2131165301);
      var8.setTag(var12);
      var8.setText(String.format("(%s)", var12.b));
      TextView var11 = (TextView)var14.findViewById(2131165305);
      var11.setTag(var12);
      String var10;
      if (var12.c != null && !var12.c.isEmpty()) {
         var10 = var12.c;
      } else {
         var10 = "-";
      }

      var11.setText(var10);
      var11 = (TextView)var14.findViewById(2131165302);
      var11.setTag(var12);
      if (var12.d != null && !var12.d.isEmpty()) {
         var10 = var12.d;
      } else {
         var10 = "-";
      }

      var11.setText(var10);
      var11 = (TextView)var14.findViewById(2131165303);
      var11.setTag(var12);
      if (var12.e != null && !var12.e.isEmpty()) {
         var10 = var12.e;
      } else {
         var10 = "-";
      }

      var11.setText(var10);
      var11 = (TextView)var14.findViewById(2131165297);
      var11.setTag(var12);
      if (var12.f != null && !var12.f.isEmpty()) {
         var10 = var12.f;
      } else {
         var10 = "-";
      }

      Context var15;
      label74: {
         label73: {
            var11.setText(var10);
            var8 = (TextView)var14.findViewById(2131165298);
            var8.setTag(var12);
            var8.setText(String.format(Locale.US, "%d", var12.g));
            var11 = (TextView)var14.findViewById(2131165294);
            var11.setTag(var12);
            switch(var12.h) {
            case -4:
               var11.setTextColor(-256);
               var15 = this.a;
               var1 = 2131493247;
               break;
            case -3:
               var11.setTextColor(-256);
               var15 = this.a;
               var1 = 2131493246;
               break;
            case -2:
               var11.setTextColor(-65536);
               var15 = this.a;
               var1 = 2131493245;
               break;
            case -1:
               var11.setTextColor(-65536);
               var10 = "Not announced (options)";
               break label73;
            case 0:
               var11.setTextColor(-7829368);
               var15 = this.a;
               var1 = 2131493248;
               break;
            case 1:
               var11.setTextColor(-16711936);
               var15 = this.a;
               var1 = 2131493244;
               break;
            default:
               break label74;
            }

            var10 = var15.getString(var1);
         }

         var11.setText(var10);
      }

      var11 = (TextView)var14.findViewById(2131165299);
      var11.setTag(var12);
      if (var12.i < 0) {
         var11.setTextColor(-16711681);
         var15 = this.a;
         var1 = 2131493251;
      } else {
         var11.setTextColor(-16711681);
         var15 = this.a;
         var1 = 2131493250;
      }

      var11.setText(var15.getString(var1));
      var8 = (TextView)var14.findViewById(2131165300);
      var8.setTag(var12);
      if (var12.i < 0) {
         var8.setText("");
         var8.setOnClickListener((OnClickListener)null);
      } else {
         var8.setTextColor(-16711681);
         var8.setPaintFlags(var8.getPaintFlags() | 8);
         var8.setText(String.format(Locale.US, this.a.getString(2131493249), var12.i + 1));
         var8.setOnClickListener(this);
      }

      var11 = (TextView)var14.findViewById(2131165295);
      var11.setTag(var12);
      if (var12.i < 0) {
         var11.setTextColor(-65536);
         var10 = "";
      } else {
         var11.setTextColor(-16711681);
         var10 = var12.j;
      }

      var11.setText(var10);
      Button var16 = (Button)var14.findViewById(2131165200);
      var16.setTag(var12);
      if (var12.i >= 0) {
         var16.setOnClickListener(this);
         var16.setEnabled(true);
         return var14;
      } else {
         var16.setOnClickListener((OnClickListener)null);
         var16.setEnabled(false);
         return var14;
      }
   }

   public void onClick(View var1) {
      if (var1 != null) {
         MyLog.log("MyRecentNotificationsArrayAdapter.onClick");
         MyRecentAppNotification var2 = (MyRecentAppNotification)var1.getTag();
         String var3;
         if (var2 == null) {
            var3 = "MyRecentNotificationsArrayAdapter.onClick n=null";
         } else if (var2.i < 0) {
            var3 = "MyRecentNotificationsArrayAdapter.onClick tmpfilter<0";
         } else {
            if (var1.getId() != 2131165200) {
               if (var1.getId() == 2131165300) {
                  MyLog.log("MyAppFiltersArrayAdapter.onClick tv_recentnotification_announcedcriteria");
                  this.d.a(var2.i, var1);
               }

               return;
            }

            MyLog.log("MyRecentNotificationsArrayAdapter.onClick b_test");
            if (!var2.j.isEmpty()) {
               Intent var4 = new Intent(this.a, ServiceMain.class);
               var4.putExtra(this.a.getResources().getString(2131492900), this.a.getResources().getString(2131492865));
               var4.putExtra(this.a.getResources().getString(2131492876), var2.j);
               this.a.startService(var4);
               return;
            }

            var3 = "MyRecentNotificationsArrayAdapter.onClick tmpAnnouncement.isEmpty";
         }

         MyLog.log(var3);
      }
   }

   public interface a {
      void a(int var1, View var2);
   }
}
