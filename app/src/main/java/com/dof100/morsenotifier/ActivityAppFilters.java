package com.dof100.morsenotifier;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class ActivityAppFilters extends Activity implements OnClickListener, MyAppFiltersArrayAdapter.Handler {
   private MyAppNotificationFilters a;
   private MyAppFiltersArrayAdapter b;
   private ListView c;

   public void handle(final MyAppNotificationFilter var1, int var2, View var3) {
      MyLog.log("ActivityAppFilters.onRowButtonClick");
      if (var3.getId() == R.id.b_delete) {
         MyLog.log("ActivityAppFilters.onRowButtonClick b_delete");
         Builder var5 = new Builder(this);
         var5.setTitle(R.string.uninstall_free_title);
         var5.setMessage(R.string.title_activity_advanced);
         var5.setPositiveButton(R.string.action_yes, new android.content.DialogInterface.OnClickListener() {
            public void onClick(DialogInterface var1x, int var2) {
               ActivityAppFilters.this.b.remove(var1);
               //TODO: ActivityAppFilters.this.a.MyAppFilters(ActivityAppFilters.this);
               ActivityAppFilters.this.b.notifyDataSetChanged();
               ActivityAppFilters.this.c.invalidate();
               var1x.dismiss();
            }
         });
         var5.setNegativeButton(R.string.action_no, new android.content.DialogInterface.OnClickListener() {
            public void onClick(DialogInterface var1, int var2) {
               var1.dismiss();
            }
         });
         var5.create().show();
      } else {
         if (var3.getId() == R.id.b_edit) {
            MyLog.log("ActivityAppFilters.onRowButtonClick b_edit");
            Intent var4 = new Intent(this, ActivityAppFilter.class);
            var4.putExtra("FILTERINDEX", var2);
            this.startActivityForResult(var4, 1);
         }

      }
   }

   protected void onActivityResult(int var1, int var2, Intent var3) {
      MyLog.log("ActivityAppFilters.onActivityResult");
      if (var1 == 1) {
         if (var2 == -1) {
            MyLog.log("ActivityAppFilters.onActivityResult OK");
         }

         if (var2 == 0) {
            MyLog.log("ActivityAppFilters.onActivityResult CANCEL");
         }

         MyLog.log("ActivityAppFilters.onActivityResult loadFilters");
         this.a.a(this);
         this.b.notifyDataSetChanged();
         this.c.invalidate();
      }

   }

   public void onClick(View var1) {
      MyLog.log("ActivityAppFilters.onClick");
      if (var1 != null) {
         Intent var2;
         if (var1.getId() == R.id.b_apps_select_add) {
            MyLog.log("ActivityAppFilters.onClick b_apps_select_add");
            this.b.a();
            var2 = new Intent(this, ActivityAppFilter.class);
            var2.putExtra("FILTERINDEX", this.a.list.size() - 1);
            this.startActivityForResult(var2, 1);
         } else {
            if (var1.getId() == R.id.b_apps_select_checkrecent) {
               MyLog.log("ActivityRecentNotifications.onClick b_apps_select_checkrecent");
               var2 = new Intent(this, ActivityRecentAppNotifications.class);
               var2.putExtra(this.getResources().getString(R.string.MSG_WHAT), this.getResources().getString(R.string.MSG_MN_ACTIVITYRECENTNOTIFICATIONS_START));
               var2.putExtra(this.getResources().getString(R.string.MSG_EXTRATEXT1), "");
               var2.putExtra(this.getResources().getString(R.string.MSG_EXTRATEXT2), "");
               this.startActivity(var2);
            }

         }
      }
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      MyLog.log("ActivityAppFilters.onCreate");
      this.a = new MyAppNotificationFilters(this);
      MyLog.log("ActivityAppFilters.onCreate loadFilters");
      this.a.a(this);
      this.b = new MyAppFiltersArrayAdapter(this, this.a, this);
      this.setContentView(R.layout.activity_appfilters);
      this.c = (ListView)this.findViewById(R.id.lv_apps_select);
      this.c.setAdapter(this.b);
      this.c.setOnItemClickListener(new OnItemClickListener() {
         public void onItemClick(AdapterView var1, View var2, int var3, long var4) {
            StringBuilder var6 = new StringBuilder();
            var6.append("ActivityAppFilters.onItemClick ");
            var6.append(var2);
            MyLog.log(var6.toString());
         }
      });
      ((Button)this.findViewById(R.id.b_apps_select_add)).setOnClickListener(this);
      ((Button)this.findViewById(R.id.b_apps_select_checkrecent)).setOnClickListener(this);
   }
}
