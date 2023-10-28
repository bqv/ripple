package com.dof100.morsenotifier;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;

public class ActivityRecentAppNotifications extends Activity implements OnClickListener, o.a {
   private n a = null;
   private b b;
   private o c;

   public void a(int var1, View var2) {
      i.a("ActivityRecentAppNotifications.onRowButtonClick");
      if (var2.getId() == 2131165300) {
         i.a("ActivityAppFilters.onRowButtonClick tv_recentnotification_announcedcriteria");
         Intent var3 = new Intent(this, ActivityAppFilter.class);
         var3.putExtra("FILTERINDEX", var1);
         this.startActivityForResult(var3, 1);
      }

   }

   public void onClick(View var1) {
      i.a("ActivityRecentNotifications.onClick");
      if (var1 != null) {
         if (var1.getId() == 2131165197) {
            i.a("ActivityRecentNotifications.onClick b_Clear");
            this.a.a(this);
            this.c.clear();
            this.c.notifyDataSetChanged();
            App.d(this);
         } else {
            if (var1.getId() == 2131165198) {
               i.a("ActivityRecentAppNotifications.onClick b_Criteria");
               Intent var2 = new Intent(this, ActivityAppFilters.class);
               var2.putExtra(this.getResources().getString(2131492900), this.getResources().getString(2131492877));
               var2.putExtra(this.getResources().getString(2131492875), "");
               var2.putExtra(this.getResources().getString(2131492876), "");
               this.startActivity(var2);
            }

         }
      }
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      i.a("ActivityRecentAppNotifications.onCreate");
      this.b = new b(this);
      i.a("ActivityRecentAppNotifications.onCreate loadfilters");
      this.b.a(this);
      this.a = new n(this);
      this.c = new o(this, this.a.a, this.b, this);
      this.setContentView(2131296262);
      ((ListView)this.findViewById(2131165256)).setAdapter(this.c);
      ((Button)this.findViewById(2131165197)).setOnClickListener(this);
      ((Button)this.findViewById(2131165198)).setOnClickListener(this);
   }

   public void onResume() {
      super.onResume();
      i.a("ActivityRecentAppNotifications.onResume loadfilters");
      this.b.a(this);
      this.c.notifyDataSetChanged();
   }
}
