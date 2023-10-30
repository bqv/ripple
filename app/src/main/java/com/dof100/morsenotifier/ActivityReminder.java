package com.dof100.morsenotifier;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.ToggleButton;

public class ActivityReminder extends Activity implements OnClickListener {
   private MyReminders a = null;
   private MyReminder b = null;
   private final ToggleButton[] c = new ToggleButton[]{null, null, null, null, null, null, null};
   private TimePicker d = null;
   private EditText e = null;
   private EditText f = null;
   private Spinner g = null;

   private void a() {
      MyLog.log("ActivityReminder.onActionTest");
      this.c();
      Intent var1 = new Intent(this, ServiceMain.class);
      var1.putExtra(this.getResources().getString(R.string.MSG_WHAT), this.getResources().getString(R.string.MSG_REMINDERS_ONE_TEST));
      var1.putExtra(this.getResources().getString(R.string.MSG_EXTRATEXT1), this.b.a());
      var1.putExtra(this.getResources().getString(R.string.MSG_EXTRATEXT2), "0");
      this.startService(var1);
   }

   private void b() {
      MyLog.log("ActivityReminder.object2view");

      for(int var1 = 0; var1 < 7; ++var1) {
         this.c[var1].setChecked(this.b.c[var1]);
      }

      if (VERSION.SDK_INT < 23) {
         this.d.setCurrentHour(this.b.a);
         this.d.setCurrentMinute(this.b.b);
      } else {
         this.d.setHour(this.b.a);
         this.d.setMinute(this.b.b);
      }

      this.e.setText(this.b.e);
      this.f.setText(this.b.f);
      this.g.setSelection(this.b.d);
   }

   private void c() {
      MyLog.log("ActivityReminder.view2object");

      int var1;
      for(var1 = 0; var1 < 7; ++var1) {
         this.b.c[var1] = this.c[var1].isChecked();
      }

      MyReminder var2;
      if (VERSION.SDK_INT < 23) {
         this.b.a = this.d.getCurrentHour();
         var2 = this.b;
         var1 = this.d.getCurrentMinute();
      } else {
         this.b.a = this.d.getHour();
         var2 = this.b;
         var1 = this.d.getMinute();
      }

      var2.b = var1;
      this.b.e = this.e.getText().toString();
      this.b.f = this.f.getText().toString();
      this.b.d = this.g.getSelectedItemPosition();
      this.a.b(this);
      MyJob.scheduleNextReminder((Context)this);
   }

   public void onClick(View var1) {
      MyLog.log("ActivityReminder.onClick");
      if (var1 != null) {
         if (var1.getId() == R.id.button_test) {
            this.a();
         }

      }
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      MyLog.log("ActivityReminder.onCreate");
      this.setContentView(R.layout.activity_reminder);
      ((Button)this.findViewById(R.id.button_test)).setOnClickListener(this);
      this.a = new MyReminders(this);
      var1 = this.getIntent().getExtras();
      int var2;
      StringBuilder var3;
      if (var1 != null) {
         var2 = var1.getInt("OBJECTINDEX");
         this.b = (MyReminder)this.a.a.get(var2);
         var3 = new StringBuilder();
         var3.append("ActivityReminder.onCreate loaded entry at position = ");
         var3.append(var2);
         MyLog.log(var3.toString());
         var2 = R.string.title_activity_reminders;
      } else {
         this.b = new MyReminder();
         this.a.a.add(this.b);
         var2 = this.a.a.size();
         var3 = new StringBuilder();
         var3.append("ActivityReminder.onCreate created new entry at position = ");
         var3.append(var2 - 1);
         MyLog.log(var3.toString());
         var2 = R.string.title_activity_settings;
      }

      this.setTitle(var2);
      this.c[0] = (ToggleButton)this.findViewById(R.id.tb_dow0);
      this.c[1] = (ToggleButton)this.findViewById(R.id.tb_dow1);
      this.c[2] = (ToggleButton)this.findViewById(R.id.tb_dow2);
      this.c[3] = (ToggleButton)this.findViewById(R.id.tb_dow3);
      this.c[4] = (ToggleButton)this.findViewById(R.id.tb_dow4);
      this.c[5] = (ToggleButton)this.findViewById(R.id.tb_dow5);
      this.c[6] = (ToggleButton)this.findViewById(R.id.tb_dow6);
      this.d = (TimePicker)this.findViewById(R.id.tp_hourmin);
      this.e = (EditText)this.findViewById(R.id.et_SayBefore);
      this.f = (EditText)this.findViewById(R.id.et_SayAfter);
      this.g = (Spinner)this.findViewById(R.id.sp_SayTime);
      this.d.setIs24HourView(true);
      this.b();
   }

   protected void onDestroy() {
      MyLog.log("ActivityReminder.onDestroy");
      super.onDestroy();
   }

   protected void onPause() {
      MyLog.log("ActivityReminder.onPause");
      this.c();
      super.onPause();
   }

   protected void onStop() {
      MyLog.log("ActivityReminder.onStop");
      super.onStop();
   }
}
