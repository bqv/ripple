package com.dof100.morsenotifier;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.Locale;

class MyAppFiltersArrayAdapter extends ArrayAdapter<MyAppNotificationFilter> implements OnClickListener {
   private final Context context;
   private final MyAppNotificationFilters appNotificationFilters;
   private final LayoutInflater layoutInflater;
   private final Handler d;

   public MyAppFiltersArrayAdapter(Context context, MyAppNotificationFilters var2, Handler var3) {
      super(context, R.layout.activity_appfilters_listitem, var2.list);
      MyLog.log("MyAppFiltersArrayAdapter.constructor");
      this.context = context;
      this.appNotificationFilters = var2;
      this.d = var3;
      this.layoutInflater = (LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
   }

   public void a() {
      this.insert(new MyAppNotificationFilter(), this.appNotificationFilters.list.size());
      //TODO: this.appNotificationFilters.MyAppFilters(this.context);
      this.notifyDataSetChanged();
   }

   public View getView(int var1, View var2, ViewGroup var3) {
      MyLog.log("MyAppFiltersArrayAdapter.getView position=" + var1 + "  v=" + var2);
      MyAppNotificationFilter var5 = (MyAppNotificationFilter)this.appNotificationFilters.list.get(var1);
      View var8 = var2;
      if (var2 == null) {
         var8 = this.layoutInflater.inflate(R.layout.activity_appfilters_listitem, var3, false);
      }

      var8.setTag(var5);
      TextView var6 = (TextView)var8.findViewById(R.id.tv_info);
      var6.setTag(var5);
      var6.setText(String.format(Locale.US, "%d. %s", var1 + 1, var5.a(this.context)));
      ImageButton var7 = (ImageButton)var8.findViewById(R.id.b_edit);
      var7.setTag(var5);
      var7.setOnClickListener(this);
      var7 = (ImageButton)var8.findViewById(R.id.b_delete);
      var7.setTag(var5);
      var7.setOnClickListener(this);
      return var8;
   }

   public void onClick(View var1) {
      if (var1 != null) {
         MyLog.log("MyAppFiltersArrayAdapter.onClick");
         MyAppNotificationFilter var2 = (MyAppNotificationFilter)var1.getTag();
         if (var2 == null) {
            MyLog.log(this.context, "MyAppFiltersArrayAdapter.onClick ERROR f=null");
         } else {
            StringBuilder var3 = new StringBuilder();
            var3.append("MyAppFiltersArrayAdapter.onClick f.package=");
            var3.append(var2.a);
            MyLog.log(var3.toString());
            int var4 = this.appNotificationFilters.list.indexOf(var2);
            var3 = new StringBuilder();
            var3.append("MyAppFiltersArrayAdapter.onClick index=");
            var3.append(var4);
            MyLog.log(var3.toString());
            String var5;
            if (var1.getId() == R.id.b_delete) {
               var5 = "MyAppFiltersArrayAdapter.onClick b_delete";
            } else {
               if (var1.getId() != R.id.b_edit) {
                  return;
               }

               var5 = "MyAppFiltersArrayAdapter.onClick b_edit";
            }

            MyLog.log(var5);
            this.d.handle(var2, var4, var1);
         }
      }
   }

   public interface Handler {
      void handle(MyAppNotificationFilter var1, int var2, View var3);
   }
}
