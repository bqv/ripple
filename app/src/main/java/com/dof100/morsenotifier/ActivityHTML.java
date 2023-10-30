package com.dof100.morsenotifier;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ActivityHTML extends Activity implements OnClickListener {
   private Button a;

   public void onClick(View var1) {
      MyLog.log("ActivityDisplayMessage.onClick");
      if (var1 != null) {
         if (var1.equals(this.a)) {
            this.finish();
         }

      }
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      Intent var2 = this.getIntent();

      String var3;
      String var4;
      String var15;
      String var16;
      label91: {
         label95: {
            label89: {
               label88: {
                  try {
                     var3 = var2.getExtras().getString("TITLE");
                  } catch (Exception var14) {
                     var3 = null;
                     break label88;
                  }

                  try {
                     var4 = var2.getExtras().getString("FILENAME");
                     break label89;
                  } catch (Exception var13) {
                  }
               }

               var4 = null;
               var15 = null;
               break label95;
            }

            try {
               var15 = var2.getExtras().getString("VERTICALALIGN");
            } catch (Exception var12) {
               var15 = null;
               break label95;
            }

            try {
               var16 = var2.getExtras().getString("BUTTONOKCAPTION");
               break label91;
            } catch (Exception var11) {
            }
         }

         var16 = null;
      }

      String var5 = var3;
      if (var3 == null) {
         var5 = "";
      }

      String var6 = var4;
      if (var4 == null) {
         var6 = "";
      }

      var3 = var15;
      if (var15 == null) {
         var3 = "top";
      }

      this.setTitle(var5);
      LinearLayout var21 = new LinearLayout(this);
      var21.setLayoutParams(new LayoutParams(-1, -1));
      var21.setOrientation(1);
      WebView var22 = new WebView(this);
      LayoutParams var17 = new LayoutParams(-1, 0);
      var17.weight = 1.0F;
      var22.setLayoutParams(var17);
      var22.setBackgroundColor(Color.parseColor("#000000"));
      var21.addView(var22);
      if (var16 != null) {
         this.a = new Button(this);
         this.a.setText(2131492912);
         var17 = new LayoutParams(-2, -2);
         this.a.setLayoutParams(var17);
         var17.gravity = 17;
         var21.addView(this.a);
         this.a.setOnClickListener(this);
      }

      if (var6.toLowerCase().endsWith(".html")) {
         StringBuilder var18 = new StringBuilder();

         label65: {
            IOException var10000;
            label64: {
               boolean var10001;
               BufferedReader var19;
               try {
                  InputStream var7 = this.getAssets().open(var6);
                  InputStreamReader var23 = new InputStreamReader(var7, "UTF-8");
                  var19 = new BufferedReader(var23);
               } catch (IOException var10) {
                  var10000 = var10;
                  var10001 = false;
                  break label64;
               }

               while(true) {
                  try {
                     var6 = var19.readLine();
                  } catch (IOException var9) {
                     var10000 = var9;
                     var10001 = false;
                     break;
                  }

                  if (var6 == null) {
                     break label65;
                  }

                  try {
                     var18.append(var6);
                  } catch (IOException var8) {
                     var10000 = var8;
                     var10001 = false;
                     break;
                  }
               }
            }

            IOException var20 = var10000;
            var20.printStackTrace();
         }

         var15 = var18.toString().replace("[APPNAME]", App.e).replace("[APPVERSION]", App.f).replace("[VERTICALALIGN]", var3).replace("[APPPLAYSTORE]", App.l).replace("[APPPLAYSTOREPRO]", App.m);
         if (App.b) {
            var15 = Utils.XMLDo(Utils.XMLDo(var15, "FREE", 1), "PRO", 2);
         } else {
            var15 = Utils.XMLDo(Utils.XMLDo(var15, "FREE", 2), "PRO", 1);
         }

         var22.loadDataWithBaseURL("", var15, "text/html", "UTF-8", "");
      }

      this.setContentView(var21);
   }
}
