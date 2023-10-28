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

public class ActivityAppFilters extends Activity implements OnClickListener, c.a {
   private b a;
   private c b;
   private ListView c;

   public void a(final a var1, int var2, View var3) {
      i.a("ActivityAppFilters.onRowButtonClick");
      if (var3.getId() == 2131165195) {
         i.a("ActivityAppFilters.onRowButtonClick b_delete");
         Builder var5 = new Builder(this);
         var5.setTitle(2131493321);
         var5.setMessage(2131493311);
         var5.setPositiveButton(2131492916, new android.content.DialogInterface.OnClickListener() {
            public void onClick(DialogInterface var1x, int var2) {
               ActivityAppFilters.this.b.remove(var1);
               ActivityAppFilters.this.a.b(ActivityAppFilters.this);
               ActivityAppFilters.this.b.notifyDataSetChanged();
               ActivityAppFilters.this.c.invalidate();
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
            i.a("ActivityAppFilters.onRowButtonClick b_edit");
            Intent var4 = new Intent(this, ActivityAppFilter.class);
            var4.putExtra("FILTERINDEX", var2);
            this.startActivityForResult(var4, 1);
         }

      }
   }

   protected void onActivityResult(int var1, int var2, Intent var3) {
      i.a("ActivityAppFilters.onActivityResult");
      if (var1 == 1) {
         if (var2 == -1) {
            i.a("ActivityAppFilters.onActivityResult OK");
         }

         if (var2 == 0) {
            i.a("ActivityAppFilters.onActivityResult CANCEL");
         }

         i.a("ActivityAppFilters.onActivityResult loadFilters");
         this.a.a(this);
         this.b.notifyDataSetChanged();
         this.c.invalidate();
      }

   }

   public void onClick(View var1) {
      i.a("ActivityAppFilters.onClick");
      if (var1 != null) {
         Intent var2;
         if (var1.getId() == 2131165193) {
            i.a("ActivityAppFilters.onClick b_apps_select_add");
            this.b.a();
            var2 = new Intent(this, ActivityAppFilter.class);
            var2.putExtra("FILTERINDEX", this.a.a.size() - 1);
            this.startActivityForResult(var2, 1);
         } else {
            if (var1.getId() == 2131165194) {
               i.a("ActivityRecentNotifications.onClick b_apps_select_checkrecent");
               var2 = new Intent(this, ActivityRecentAppNotifications.class);
               var2.putExtra(this.getResources().getString(2131492900), this.getResources().getString(2131492879));
               var2.putExtra(this.getResources().getString(2131492875), "");
               var2.putExtra(this.getResources().getString(2131492876), "");
               this.startActivity(var2);
            }

         }
      }
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      i.a("ActivityAppFilters.onCreate");
      this.a = new b(this);
      i.a("ActivityAppFilters.onCreate loadFilters");
      this.a.a(this);
      this.b = new c(this, this.a, this);
      this.setContentView(2131296258);
      this.c = (ListView)this.findViewById(2131165255);
      this.c.setAdapter(this.b);
      this.c.setOnItemClickListener(new OnItemClickListener() {
         public void onItemClick(AdapterView var1, View var2, int var3, long var4) {
            StringBuilder var6 = new StringBuilder();
            var6.append("ActivityAppFilters.onItemClick ");
            var6.append(var2);
            i.a(var6.toString());
         }
      });
      ((Button)this.findViewById(2131165193)).setOnClickListener(this);
      ((Button)this.findViewById(2131165194)).setOnClickListener(this);
   }
}
