package com.dof100.morsenotifier;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class ActivityReminders extends Activity implements OnClickListener, MyRemindersArrayAdapter.a {
   private MyReminders a;
   private MyRemindersArrayAdapter b;
   private ListView c;

   public void a(final MyReminder var1, int var2, View var3) {
      MyLog.log("ActivityReminders.onRowButtonClick");
      if (var3.getId() == R.id.b_delete) {
         MyLog.log("ActivityReminders.onRowButtonClick b_delete");
         Builder var5 = new Builder(this);
         var5.setTitle(R.string.uninstall_free_title);
         var5.setMessage(R.string.title_activity_advanced);
         var5.setPositiveButton(R.string.action_yes, new android.content.DialogInterface.OnClickListener() {
            public void onClick(DialogInterface var1x, int var2) {
               ActivityReminders.this.b.remove(var1);
               ActivityReminders.this.a.b(ActivityReminders.this);
               ActivityReminders.this.b.notifyDataSetChanged();
               MyJob.scheduleNextReminder((Context)ActivityReminders.this);
               ActivityReminders.this.c.invalidate();
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
            MyLog.log("ActivityReminders.onRowButtonClick b_edit");
            Intent var4 = new Intent(this, ActivityReminder.class);
            var4.putExtra("OBJECTINDEX", var2);
            this.startActivityForResult(var4, 1);
         }

      }
   }

   protected void onActivityResult(int var1, int var2, Intent var3) {
      MyLog.log("ActivityReminders.onActivityResult");
      if (var1 == 1) {
         if (var2 == -1) {
            MyLog.log("ActivityReminders.onActivityResult OK");
         }

         if (var2 == 0) {
            MyLog.log("ActivityReminders.onActivityResult CANCEL");
         }

         MyLog.log("ActivityReminders.onActivityResult loadFilters");
         this.a.a(this);
         this.b.notifyDataSetChanged();
         this.c.invalidate();
      }

   }

   public void onClick(View var1) {
      MyLog.log("ActivityReminders.onClick");
      if (var1 != null) {
         if (var1.getId() == R.id.b_reminders_select_add) {
            MyLog.log("ActivityReminders.onClick b_Add");
            this.startActivityForResult(new Intent(this, ActivityReminder.class), 1);
         }

      }
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      MyLog.log("ActivityReminders.onCreate");
      this.a = new MyReminders(this);
      MyLog.log("ActivityReminders.onCreate load");
      this.a.a(this);
      this.b = new MyRemindersArrayAdapter(this, this.a, this);
      this.setContentView(R.layout.activity_reminders);
      this.c = (ListView)this.findViewById(R.id.lv_reminders_select);
      this.c.setAdapter(this.b);
      this.c.setOnItemClickListener(new OnItemClickListener() {
         public void onItemClick(AdapterView var1, View var2, int var3, long var4) {
            StringBuilder var6 = new StringBuilder();
            var6.append("ActivityReminders.onItemClick ");
            var6.append(var2);
            MyLog.log(var6.toString());
         }
      });
      ((Button)this.findViewById(R.id.b_reminders_select_add)).setOnClickListener(this);
   }
}
