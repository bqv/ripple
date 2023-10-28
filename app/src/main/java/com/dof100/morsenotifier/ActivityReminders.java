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

public class ActivityReminders extends Activity implements OnClickListener, r.a {
   private q a;
   private r b;
   private ListView c;

   public void a(final p var1, int var2, View var3) {
      i.a("ActivityReminders.onRowButtonClick");
      if (var3.getId() == 2131165195) {
         i.a("ActivityReminders.onRowButtonClick b_delete");
         Builder var5 = new Builder(this);
         var5.setTitle(2131493321);
         var5.setMessage(2131493311);
         var5.setPositiveButton(2131492916, new android.content.DialogInterface.OnClickListener() {
            public void onClick(DialogInterface var1x, int var2) {
               ActivityReminders.this.b.remove(var1);
               ActivityReminders.this.a.b(ActivityReminders.this);
               ActivityReminders.this.b.notifyDataSetChanged();
               g.a((Context)ActivityReminders.this);
               ActivityReminders.this.c.invalidate();
               var1x.dismiss();
            }
         });
         var5.setNegativeButton(2131492911, new android.content.DialogInterface.OnClickListener() {
            public void onClick(DialogInterface var1, int var2) {
               var1.dismiss();
            }
         });
         var5.create().show();
      } else {
         if (var3.getId() == 2131165196) {
            i.a("ActivityReminders.onRowButtonClick b_edit");
            Intent var4 = new Intent(this, ActivityReminder.class);
            var4.putExtra("OBJECTINDEX", var2);
            this.startActivityForResult(var4, 1);
         }

      }
   }

   protected void onActivityResult(int var1, int var2, Intent var3) {
      i.a("ActivityReminders.onActivityResult");
      if (var1 == 1) {
         if (var2 == -1) {
            i.a("ActivityReminders.onActivityResult OK");
         }

         if (var2 == 0) {
            i.a("ActivityReminders.onActivityResult CANCEL");
         }

         i.a("ActivityReminders.onActivityResult loadFilters");
         this.a.a(this);
         this.b.notifyDataSetChanged();
         this.c.invalidate();
      }

   }

   public void onClick(View var1) {
      i.a("ActivityReminders.onClick");
      if (var1 != null) {
         if (var1.getId() == 2131165199) {
            i.a("ActivityReminders.onClick b_Add");
            this.startActivityForResult(new Intent(this, ActivityReminder.class), 1);
         }

      }
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      i.a("ActivityReminders.onCreate");
      this.a = new q(this);
      i.a("ActivityReminders.onCreate load");
      this.a.a(this);
      this.b = new r(this, this.a, this);
      this.setContentView(2131296265);
      this.c = (ListView)this.findViewById(2131165257);
      this.c.setAdapter(this.b);
      this.c.setOnItemClickListener(new OnItemClickListener() {
         public void onItemClick(AdapterView var1, View var2, int var3, long var4) {
            StringBuilder var6 = new StringBuilder();
            var6.append("ActivityReminders.onItemClick ");
            var6.append(var2);
            i.a(var6.toString());
         }
      });
      ((Button)this.findViewById(2131165199)).setOnClickListener(this);
   }
}
