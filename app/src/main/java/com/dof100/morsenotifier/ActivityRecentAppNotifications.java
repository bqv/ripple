package com.dof100.morsenotifier;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;

public class ActivityRecentAppNotifications extends Activity implements OnClickListener, MyRecentNotificationsArrayAdapter.a {
   private MyRecentAppNotifications a = null;
   private MyAppNotificationFilters b;
   private MyRecentNotificationsArrayAdapter c;

   public void a(int var1, View var2) {
      MyLog.log("ActivityRecentAppNotifications.onRowButtonClick");
      if (var2.getId() == R.id.tv_recentnotification_matchingfilternum) {
         MyLog.log("ActivityAppFilters.onRowButtonClick tv_recentnotification_announcedcriteria");
         Intent var3 = new Intent(this, ActivityAppFilter.class);
         var3.putExtra("FILTERINDEX", var1);
         this.startActivityForResult(var3, 1);
      }

   }

   public void onClick(View var1) {
      MyLog.log("ActivityRecentNotifications.onClick");
      if (var1 != null) {
         if (var1.getId() == R.id.b_recentnotifications_clear) {
            MyLog.log("ActivityRecentNotifications.onClick b_Clear");
            this.a.clear(this);
            this.c.clear();
            this.c.notifyDataSetChanged();
            App.d(this);
         } else {
            if (var1.getId() == R.id.b_recentnotifications_criteria) {
               MyLog.log("ActivityRecentAppNotifications.onClick b_Criteria");
               Intent var2 = new Intent(this, ActivityAppFilters.class);
               var2.putExtra(this.getResources().getString(R.string.MSG_WHAT), this.getResources().getString(R.string.MSG_MN_ACTIVITYAPPFILTERS_START));
               var2.putExtra(this.getResources().getString(R.string.MSG_EXTRATEXT1), "");
               var2.putExtra(this.getResources().getString(R.string.MSG_EXTRATEXT2), "");
               this.startActivity(var2);
            }

         }
      }
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      MyLog.log("ActivityRecentAppNotifications.onCreate");
      this.b = new MyAppNotificationFilters(this);
      MyLog.log("ActivityRecentAppNotifications.onCreate loadfilters");
      this.b.a(this);
      this.a = new MyRecentAppNotifications(this);
      this.c = new MyRecentNotificationsArrayAdapter(this, this.a.notifications, this.b, this);
      this.setContentView(R.layout.activity_recent_notifications);
      ((ListView)this.findViewById(R.id.lv_recent_notifications)).setAdapter(this.c);
      ((Button)this.findViewById(R.id.b_recentnotifications_clear)).setOnClickListener(this);
      ((Button)this.findViewById(R.id.b_recentnotifications_criteria)).setOnClickListener(this);
   }

   public void onResume() {
      super.onResume();
      MyLog.log("ActivityRecentAppNotifications.onResume loadfilters");
      this.b.a(this);
      this.c.notifyDataSetChanged();
   }
}
