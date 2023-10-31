package com.dof100.morsenotifier;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.AudioTrack.Builder;
import android.media.AudioTrack.OnPlaybackPositionUpdateListener;
import android.os.AsyncTask;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

class MyPlayerMorse extends AsyncTask {
   private WeakReference a;
   private int b;
   private boolean c = false;
   private boolean d = false;
   private boolean e = false;
   private int f = 0;
   private int g = 1;
   private int h = 0;
   private int i = 0;
   private int j = 0;
   private int k = 0;
   private String l = "";
   private boolean m = false;
   private int n = 3;
   private int o = 100;
   private int p = 0;
   private int q = 0;
   private int r = 0;
   private long s = 0L;
   private int t = 0;
   private boolean u = false;
   private AudioTrack v = null;
   private Vibrator w = null;
   private final ArrayList x = new ArrayList();
   private final CountDownLatch y = new CountDownLatch(1);
   private final BroadcastReceiver z = new BroadcastReceiver() {
      public void onReceive(Context var1, Intent var2) {
         if ("LBR_ACTION_FINISH".equals(var2.getAction())) {
            MyLog.log(var1, "MyPlayerMorse.BroadcastReceiver  got ACTION_FINISH ");
            MyPlayerMorse.this.u = true;
            MyPlayerMorse.this.y.countDown();
         }

      }
   };

   MyPlayerMorse(Context var1, int var2) {
      this.a = new WeakReference(var1);
      this.b = var2;
      StringBuilder var3 = new StringBuilder();
      var3.append("MyPlayerMorse constructor instance=");
      var3.append(var2);
      MyLog.log(var1, var3.toString());
   }

   private void a(char var1, boolean var2) {
      char var3 = var1;
      if (!this.e) {
         label619: {
            if (var1 < '!' || var1 > '/') {
               var3 = var1;
               if (var1 < ':') {
                  break label619;
               }

               var3 = var1;
               if (var1 > '@') {
                  break label619;
               }
            }

            var3 = ' ';
         }
      }

      int var4;
      label598: {
         label597: {
            label654: {
               label594: {
                  label593: {
                     label592: {
                        label591: {
                           label590: {
                              label589: {
                                 label588: {
                                    label587: {
                                       label586: {
                                          label585: {
                                             label584: {
                                                label583: {
                                                   label582: {
                                                      label581: {
                                                         label580: {
                                                            label579: {
                                                               label578: {
                                                                  label577: {
                                                                     label576: {
                                                                        label655: {
                                                                           label573: {
                                                                              label572: {
                                                                                 label571: {
                                                                                    label570: {
                                                                                       label569: {
                                                                                          label568: {
                                                                                             label567: {
                                                                                                label566: {
                                                                                                   label565: {
                                                                                                      label564: {
                                                                                                         label563: {
                                                                                                            label562: {
                                                                                                               label561: {
                                                                                                                  label560: {
                                                                                                                     label559: {
                                                                                                                        label558: {
                                                                                                                           label557: {
                                                                                                                              label656: {
                                                                                                                                 label552: {
                                                                                                                                    label551: {
                                                                                                                                       label550: {
                                                                                                                                          label549: {
                                                                                                                                             label548: {
                                                                                                                                                label547: {
                                                                                                                                                   label546: {
                                                                                                                                                      label657: {
                                                                                                                                                         label658: {
                                                                                                                                                            label659: {
                                                                                                                                                               label535: {
                                                                                                                                                                  label534: {
                                                                                                                                                                     label533: {
                                                                                                                                                                        label532: {
                                                                                                                                                                           label531: {
                                                                                                                                                                              label530: {
                                                                                                                                                                                 label529: {
                                                                                                                                                                                    label528: {
                                                                                                                                                                                       label527: {
                                                                                                                                                                                          label526: {
                                                                                                                                                                                             label660: {
                                                                                                                                                                                                label523: {
                                                                                                                                                                                                   label522: {
                                                                                                                                                                                                      label521: {
                                                                                                                                                                                                         label661: {
                                                                                                                                                                                                            label662: {
                                                                                                                                                                                                               label504: {
                                                                                                                                                                                                                  label503: {
                                                                                                                                                                                                                     label663: {
                                                                                                                                                                                                                        label500: {
                                                                                                                                                                                                                           label499: {
                                                                                                                                                                                                                              label670: {
                                                                                                                                                                                                                                 var4 = 0;
                                                                                                                                                                                                                                 switch(var3) {
                                                                                                                                                                                                                                 case '!':
                                                                                                                                                                                                                                    this.a(2, var3);
                                                                                                                                                                                                                                    this.a(-1, -1);
                                                                                                                                                                                                                                    this.a(-1, -1);
                                                                                                                                                                                                                                    this.a(-2, -1);
                                                                                                                                                                                                                                    this.a(1, -1);
                                                                                                                                                                                                                                    break label661;
                                                                                                                                                                                                                                 case '"':
                                                                                                                                                                                                                                    this.a(1, var3);
                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                 default:
                                                                                                                                                                                                                                    label669: {
                                                                                                                                                                                                                                       label665: {
                                                                                                                                                                                                                                          label490: {
                                                                                                                                                                                                                                             switch(var3) {
                                                                                                                                                                                                                                             case '&':
                                                                                                                                                                                                                                                this.a(1, var3);
                                                                                                                                                                                                                                                break label550;
                                                                                                                                                                                                                                             case '\'':
                                                                                                                                                                                                                                                this.a(1, var3);
                                                                                                                                                                                                                                                this.a(-2, -1);
                                                                                                                                                                                                                                                this.a(2, -1);
                                                                                                                                                                                                                                                break label665;
                                                                                                                                                                                                                                             case '(':
                                                                                                                                                                                                                                                this.a(2, var3);
                                                                                                                                                                                                                                                this.a(-1, -1);
                                                                                                                                                                                                                                                this.a(-1, -1);
                                                                                                                                                                                                                                                break label526;
                                                                                                                                                                                                                                             case ')':
                                                                                                                                                                                                                                                this.a(2, var3);
                                                                                                                                                                                                                                                this.a(-1, -1);
                                                                                                                                                                                                                                                this.a(-1, -1);
                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                             default:
                                                                                                                                                                                                                                                label484: {
                                                                                                                                                                                                                                                   switch(var3) {
                                                                                                                                                                                                                                                   case '+':
                                                                                                                                                                                                                                                      this.a(1, var3);
                                                                                                                                                                                                                                                      break label533;
                                                                                                                                                                                                                                                   case ',':
                                                                                                                                                                                                                                                      this.a(2, var3);
                                                                                                                                                                                                                                                      this.a(-1, -1);
                                                                                                                                                                                                                                                      this.a(-1, -1);
                                                                                                                                                                                                                                                      this.a(-2, -1);
                                                                                                                                                                                                                                                      this.a(2, -1);
                                                                                                                                                                                                                                                      this.a(-1, -1);
                                                                                                                                                                                                                                                      this.a(-1, -1);
                                                                                                                                                                                                                                                      break label534;
                                                                                                                                                                                                                                                   case '-':
                                                                                                                                                                                                                                                      this.a(2, var3);
                                                                                                                                                                                                                                                      this.a(-1, -1);
                                                                                                                                                                                                                                                      this.a(-1, -1);
                                                                                                                                                                                                                                                      this.a(-2, -1);
                                                                                                                                                                                                                                                      this.a(1, -1);
                                                                                                                                                                                                                                                      break label562;
                                                                                                                                                                                                                                                   case '.':
                                                                                                                                                                                                                                                      this.a(1, var3);
                                                                                                                                                                                                                                                      this.a(-2, -1);
                                                                                                                                                                                                                                                      this.a(2, -1);
                                                                                                                                                                                                                                                      this.a(-1, -1);
                                                                                                                                                                                                                                                      this.a(-1, -1);
                                                                                                                                                                                                                                                      this.a(-2, -1);
                                                                                                                                                                                                                                                      this.a(1, -1);
                                                                                                                                                                                                                                                      break label557;
                                                                                                                                                                                                                                                   case '/':
                                                                                                                                                                                                                                                      this.a(2, var3);
                                                                                                                                                                                                                                                      break label521;
                                                                                                                                                                                                                                                   case '0':
                                                                                                                                                                                                                                                      this.a(2, var3);
                                                                                                                                                                                                                                                      this.a(-1, -1);
                                                                                                                                                                                                                                                      this.a(-1, -1);
                                                                                                                                                                                                                                                      break;
                                                                                                                                                                                                                                                   case '1':
                                                                                                                                                                                                                                                      this.a(1, var3);
                                                                                                                                                                                                                                                      break;
                                                                                                                                                                                                                                                   case '2':
                                                                                                                                                                                                                                                      this.a(1, var3);
                                                                                                                                                                                                                                                      this.a(-2, -1);
                                                                                                                                                                                                                                                      this.a(1, -1);
                                                                                                                                                                                                                                                      break label659;
                                                                                                                                                                                                                                                   case '3':
                                                                                                                                                                                                                                                      this.a(1, var3);
                                                                                                                                                                                                                                                      break label534;
                                                                                                                                                                                                                                                   case '4':
                                                                                                                                                                                                                                                      this.a(1, var3);
                                                                                                                                                                                                                                                      break label562;
                                                                                                                                                                                                                                                   case '5':
                                                                                                                                                                                                                                                      this.a(1, var3);
                                                                                                                                                                                                                                                      break label571;
                                                                                                                                                                                                                                                   case '6':
                                                                                                                                                                                                                                                      this.a(2, var3);
                                                                                                                                                                                                                                                      this.a(-1, -1);
                                                                                                                                                                                                                                                      this.a(-1, -1);
                                                                                                                                                                                                                                                      break label571;
                                                                                                                                                                                                                                                   case '7':
                                                                                                                                                                                                                                                      this.a(2, var3);
                                                                                                                                                                                                                                                      break label658;
                                                                                                                                                                                                                                                   case '8':
                                                                                                                                                                                                                                                      this.a(2, var3);
                                                                                                                                                                                                                                                      this.a(-1, -1);
                                                                                                                                                                                                                                                      this.a(-1, -1);
                                                                                                                                                                                                                                                      break label657;
                                                                                                                                                                                                                                                   case '9':
                                                                                                                                                                                                                                                      this.a(2, var3);
                                                                                                                                                                                                                                                      break label665;
                                                                                                                                                                                                                                                   case ':':
                                                                                                                                                                                                                                                      this.a(2, var3);
                                                                                                                                                                                                                                                      this.a(-1, -1);
                                                                                                                                                                                                                                                      this.a(-1, -1);
                                                                                                                                                                                                                                                      this.a(-2, -1);
                                                                                                                                                                                                                                                      this.a(2, -1);
                                                                                                                                                                                                                                                      break label658;
                                                                                                                                                                                                                                                   case ';':
                                                                                                                                                                                                                                                      this.a(2, var3);
                                                                                                                                                                                                                                                      this.a(-1, -1);
                                                                                                                                                                                                                                                      this.a(-1, -1);
                                                                                                                                                                                                                                                      this.a(-2, -1);
                                                                                                                                                                                                                                                      this.a(1, -1);
                                                                                                                                                                                                                                                      break label533;
                                                                                                                                                                                                                                                   default:
                                                                                                                                                                                                                                                      switch(var3) {
                                                                                                                                                                                                                                                      case '?':
                                                                                                                                                                                                                                                         this.a(1, var3);
                                                                                                                                                                                                                                                         this.a(-2, -1);
                                                                                                                                                                                                                                                         this.a(1, -1);
                                                                                                                                                                                                                                                         break label657;
                                                                                                                                                                                                                                                      case '@':
                                                                                                                                                                                                                                                         this.a(1, var3);
                                                                                                                                                                                                                                                         this.a(-2, -1);
                                                                                                                                                                                                                                                         this.a(2, -1);
                                                                                                                                                                                                                                                         break label662;
                                                                                                                                                                                                                                                      default:
                                                                                                                                                                                                                                                         switch(var3) {
                                                                                                                                                                                                                                                         case 'a':
                                                                                                                                                                                                                                                            break label584;
                                                                                                                                                                                                                                                         case 'b':
                                                                                                                                                                                                                                                            break label561;
                                                                                                                                                                                                                                                         case 'c':
                                                                                                                                                                                                                                                            break label547;
                                                                                                                                                                                                                                                         case 'd':
                                                                                                                                                                                                                                                            break label578;
                                                                                                                                                                                                                                                         case 'e':
                                                                                                                                                                                                                                                            break label597;
                                                                                                                                                                                                                                                         case 'f':
                                                                                                                                                                                                                                                            break label564;
                                                                                                                                                                                                                                                         case 'g':
                                                                                                                                                                                                                                                            break label565;
                                                                                                                                                                                                                                                         case 'h':
                                                                                                                                                                                                                                                            break label580;
                                                                                                                                                                                                                                                         case 'i':
                                                                                                                                                                                                                                                            break label589;
                                                                                                                                                                                                                                                         case 'j':
                                                                                                                                                                                                                                                            this.a(1, var3);
                                                                                                                                                                                                                                                            break label659;
                                                                                                                                                                                                                                                         case 'k':
                                                                                                                                                                                                                                                            break label548;
                                                                                                                                                                                                                                                         case 'l':
                                                                                                                                                                                                                                                            break label549;
                                                                                                                                                                                                                                                         case 'm':
                                                                                                                                                                                                                                                            break label568;
                                                                                                                                                                                                                                                         case 'n':
                                                                                                                                                                                                                                                            break label583;
                                                                                                                                                                                                                                                         case 'o':
                                                                                                                                                                                                                                                            break label522;
                                                                                                                                                                                                                                                         case 'p':
                                                                                                                                                                                                                                                            break label523;
                                                                                                                                                                                                                                                         case 'q':
                                                                                                                                                                                                                                                            break label670;
                                                                                                                                                                                                                                                         case 'r':
                                                                                                                                                                                                                                                            break label572;
                                                                                                                                                                                                                                                         case 's':
                                                                                                                                                                                                                                                            break label586;
                                                                                                                                                                                                                                                         case 't':
                                                                                                                                                                                                                                                            break label592;
                                                                                                                                                                                                                                                         case 'u':
                                                                                                                                                                                                                                                            this.a(1, var3);
                                                                                                                                                                                                                                                            break label585;
                                                                                                                                                                                                                                                         case 'v':
                                                                                                                                                                                                                                                            this.a(1, var3);
                                                                                                                                                                                                                                                            break label577;
                                                                                                                                                                                                                                                         case 'w':
                                                                                                                                                                                                                                                            break label552;
                                                                                                                                                                                                                                                         case 'x':
                                                                                                                                                                                                                                                            break label527;
                                                                                                                                                                                                                                                         case 'y':
                                                                                                                                                                                                                                                            break label500;
                                                                                                                                                                                                                                                         case 'z':
                                                                                                                                                                                                                                                            break label528;
                                                                                                                                                                                                                                                         default:
                                                                                                                                                                                                                                                            switch(var3) {
                                                                                                                                                                                                                                                            case 'ä':
                                                                                                                                                                                                                                                            case 'æ':
                                                                                                                                                                                                                                                               break label530;
                                                                                                                                                                                                                                                            case 'ç':
                                                                                                                                                                                                                                                               break label531;
                                                                                                                                                                                                                                                            case 'è':
                                                                                                                                                                                                                                                               break label503;
                                                                                                                                                                                                                                                            case 'é':
                                                                                                                                                                                                                                                               break label532;
                                                                                                                                                                                                                                                            default:
                                                                                                                                                                                                                                                               switch(var3) {
                                                                                                                                                                                                                                                               case 'ð':
                                                                                                                                                                                                                                                                  this.a(1, var3);
                                                                                                                                                                                                                                                                  break label526;
                                                                                                                                                                                                                                                               case 'ñ':
                                                                                                                                                                                                                                                                  break label490;
                                                                                                                                                                                                                                                               default:
                                                                                                                                                                                                                                                                  switch(var3) {
                                                                                                                                                                                                                                                                  case 'ά':
                                                                                                                                                                                                                                                                     break label584;
                                                                                                                                                                                                                                                                  case 'έ':
                                                                                                                                                                                                                                                                     break label597;
                                                                                                                                                                                                                                                                  case 'ή':
                                                                                                                                                                                                                                                                     break label580;
                                                                                                                                                                                                                                                                  case 'ί':
                                                                                                                                                                                                                                                                     break label589;
                                                                                                                                                                                                                                                                  default:
                                                                                                                                                                                                                                                                     switch(var3) {
                                                                                                                                                                                                                                                                     case 'α':
                                                                                                                                                                                                                                                                        break label584;
                                                                                                                                                                                                                                                                     case 'β':
                                                                                                                                                                                                                                                                        break label561;
                                                                                                                                                                                                                                                                     case 'γ':
                                                                                                                                                                                                                                                                        break label565;
                                                                                                                                                                                                                                                                     case 'δ':
                                                                                                                                                                                                                                                                        break label578;
                                                                                                                                                                                                                                                                     case 'ε':
                                                                                                                                                                                                                                                                        break label597;
                                                                                                                                                                                                                                                                     case 'ζ':
                                                                                                                                                                                                                                                                        break label528;
                                                                                                                                                                                                                                                                     case 'η':
                                                                                                                                                                                                                                                                        break label580;
                                                                                                                                                                                                                                                                     case 'θ':
                                                                                                                                                                                                                                                                        break label547;
                                                                                                                                                                                                                                                                     case 'ι':
                                                                                                                                                                                                                                                                        break label589;
                                                                                                                                                                                                                                                                     case 'κ':
                                                                                                                                                                                                                                                                        break label548;
                                                                                                                                                                                                                                                                     case 'λ':
                                                                                                                                                                                                                                                                        break label549;
                                                                                                                                                                                                                                                                     case 'μ':
                                                                                                                                                                                                                                                                        break label568;
                                                                                                                                                                                                                                                                     case 'ν':
                                                                                                                                                                                                                                                                        break label583;
                                                                                                                                                                                                                                                                     default:
                                                                                                                                                                                                                                                                        switch(var3) {
                                                                                                                                                                                                                                                                        case 'ο':
                                                                                                                                                                                                                                                                           break label522;
                                                                                                                                                                                                                                                                        case 'π':
                                                                                                                                                                                                                                                                           break label523;
                                                                                                                                                                                                                                                                        case 'ρ':
                                                                                                                                                                                                                                                                           break label572;
                                                                                                                                                                                                                                                                        case 'ς':
                                                                                                                                                                                                                                                                        case 'σ':
                                                                                                                                                                                                                                                                           break label586;
                                                                                                                                                                                                                                                                        case 'τ':
                                                                                                                                                                                                                                                                           break label592;
                                                                                                                                                                                                                                                                        case 'υ':
                                                                                                                                                                                                                                                                           break label500;
                                                                                                                                                                                                                                                                        case 'φ':
                                                                                                                                                                                                                                                                           break label564;
                                                                                                                                                                                                                                                                        case 'χ':
                                                                                                                                                                                                                                                                           break label527;
                                                                                                                                                                                                                                                                        case 'ψ':
                                                                                                                                                                                                                                                                           break label670;
                                                                                                                                                                                                                                                                        case 'ω':
                                                                                                                                                                                                                                                                           break label552;
                                                                                                                                                                                                                                                                        default:
                                                                                                                                                                                                                                                                           switch(var3) {
                                                                                                                                                                                                                                                                           case 'ό':
                                                                                                                                                                                                                                                                              break label522;
                                                                                                                                                                                                                                                                           case 'ύ':
                                                                                                                                                                                                                                                                              break label500;
                                                                                                                                                                                                                                                                           case 'ώ':
                                                                                                                                                                                                                                                                              break label552;
                                                                                                                                                                                                                                                                           default:
                                                                                                                                                                                                                                                                              switch(var3) {
                                                                                                                                                                                                                                                                              case '$':
                                                                                                                                                                                                                                                                                 this.a(1, var3);
                                                                                                                                                                                                                                                                                 this.a(-2, -1);
                                                                                                                                                                                                                                                                                 this.a(1, -1);
                                                                                                                                                                                                                                                                                 this.a(-2, -1);
                                                                                                                                                                                                                                                                                 this.a(1, -1);
                                                                                                                                                                                                                                                                                 break label535;
                                                                                                                                                                                                                                                                              case '=':
                                                                                                                                                                                                                                                                                 this.a(2, var3);
                                                                                                                                                                                                                                                                                 this.a(-1, -1);
                                                                                                                                                                                                                                                                                 this.a(-1, -1);
                                                                                                                                                                                                                                                                                 break label562;
                                                                                                                                                                                                                                                                              case '_':
                                                                                                                                                                                                                                                                                 this.a(1, var3);
                                                                                                                                                                                                                                                                                 break label484;
                                                                                                                                                                                                                                                                              case '|':
                                                                                                                                                                                                                                                                                 this.a(-2, -1);
                                                                                                                                                                                                                                                                                 var2 = false;
                                                                                                                                                                                                                                                                                 break label598;
                                                                                                                                                                                                                                                                              case 'à':
                                                                                                                                                                                                                                                                                 break;
                                                                                                                                                                                                                                                                              case 'ó':
                                                                                                                                                                                                                                                                              case 'ö':
                                                                                                                                                                                                                                                                              case 'ø':
                                                                                                                                                                                                                                                                                 this.a(2, var3);
                                                                                                                                                                                                                                                                                 break label660;
                                                                                                                                                                                                                                                                              case 'ü':
                                                                                                                                                                                                                                                                              case 'ŭ':
                                                                                                                                                                                                                                                                                 this.a(1, var3);
                                                                                                                                                                                                                                                                                 break label560;
                                                                                                                                                                                                                                                                              case 'þ':
                                                                                                                                                                                                                                                                                 this.a(1, var3);
                                                                                                                                                                                                                                                                                 break label657;
                                                                                                                                                                                                                                                                              case 'ą':
                                                                                                                                                                                                                                                                                 break label530;
                                                                                                                                                                                                                                                                              case 'ć':
                                                                                                                                                                                                                                                                              case 'ĉ':
                                                                                                                                                                                                                                                                                 break label531;
                                                                                                                                                                                                                                                                              case 'đ':
                                                                                                                                                                                                                                                                              case 'ę':
                                                                                                                                                                                                                                                                                 break label532;
                                                                                                                                                                                                                                                                              case 'ĝ':
                                                                                                                                                                                                                                                                                 this.a(2, var3);
                                                                                                                                                                                                                                                                                 break label662;
                                                                                                                                                                                                                                                                              case 'ĥ':
                                                                                                                                                                                                                                                                              case 'š':
                                                                                                                                                                                                                                                                                 this.a(2, var3);
                                                                                                                                                                                                                                                                                 break label504;
                                                                                                                                                                                                                                                                              case 'ĵ':
                                                                                                                                                                                                                                                                                 this.a(1, var3);
                                                                                                                                                                                                                                                                                 break label499;
                                                                                                                                                                                                                                                                              case 'ł':
                                                                                                                                                                                                                                                                                 break label503;
                                                                                                                                                                                                                                                                              case 'ń':
                                                                                                                                                                                                                                                                                 break label490;
                                                                                                                                                                                                                                                                              case 'ś':
                                                                                                                                                                                                                                                                                 this.a(1, var3);
                                                                                                                                                                                                                                                                                 this.a(-2, -1);
                                                                                                                                                                                                                                                                                 this.a(1, -1);
                                                                                                                                                                                                                                                                                 this.a(-2, -1);
                                                                                                                                                                                                                                                                                 this.a(1, -1);
                                                                                                                                                                                                                                                                                 break label550;
                                                                                                                                                                                                                                                                              case 'ŝ':
                                                                                                                                                                                                                                                                                 this.a(1, var3);
                                                                                                                                                                                                                                                                                 break label566;
                                                                                                                                                                                                                                                                              case 'ź':
                                                                                                                                                                                                                                                                                 this.a(2, var3);
                                                                                                                                                                                                                                                                                 this.a(-1, -1);
                                                                                                                                                                                                                                                                                 this.a(-1, -1);
                                                                                                                                                                                                                                                                                 break label669;
                                                                                                                                                                                                                                                                              case 'ż':
                                                                                                                                                                                                                                                                                 this.a(2, var3);
                                                                                                                                                                                                                                                                                 this.a(-1, -1);
                                                                                                                                                                                                                                                                                 this.a(-1, -1);
                                                                                                                                                                                                                                                                                 break label535;
                                                                                                                                                                                                                                                                              default:
                                                                                                                                                                                                                                                                                 this.a(-3, -3);
                                                                                                                                                                                                                                                                                 break label598;
                                                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                                                           }
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                     }
                                                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                                               }
                                                                                                                                                                                                                                                            case 'å':
                                                                                                                                                                                                                                                               this.a(1, var3);
                                                                                                                                                                                                                                                               break label663;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                         }
                                                                                                                                                                                                                                                      }
                                                                                                                                                                                                                                                   }

                                                                                                                                                                                                                                                   this.a(-2, -1);
                                                                                                                                                                                                                                                   this.a(2, -1);
                                                                                                                                                                                                                                                   break label504;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                             }

                                                                                                                                                                                                                                             this.a(-2, -1);
                                                                                                                                                                                                                                             this.a(1, -1);
                                                                                                                                                                                                                                             break label663;
                                                                                                                                                                                                                                          }

                                                                                                                                                                                                                                          this.a(2, var3);
                                                                                                                                                                                                                                          this.a(-1, -1);
                                                                                                                                                                                                                                          this.a(-1, -1);
                                                                                                                                                                                                                                          break label661;
                                                                                                                                                                                                                                       }

                                                                                                                                                                                                                                       this.a(-1, -1);
                                                                                                                                                                                                                                       this.a(-1, -1);
                                                                                                                                                                                                                                       break label499;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                 }

                                                                                                                                                                                                                                 this.a(-2, -1);
                                                                                                                                                                                                                                 this.a(2, -1);
                                                                                                                                                                                                                                 break label521;
                                                                                                                                                                                                                              }

                                                                                                                                                                                                                              this.a(2, var3);
                                                                                                                                                                                                                              break label529;
                                                                                                                                                                                                                           }

                                                                                                                                                                                                                           this.a(-2, -1);
                                                                                                                                                                                                                           this.a(2, -1);
                                                                                                                                                                                                                           break label660;
                                                                                                                                                                                                                        }

                                                                                                                                                                                                                        this.a(2, var3);
                                                                                                                                                                                                                        break label546;
                                                                                                                                                                                                                     }

                                                                                                                                                                                                                     this.a(-2, -1);
                                                                                                                                                                                                                     this.a(2, -1);
                                                                                                                                                                                                                     break label529;
                                                                                                                                                                                                                  }

                                                                                                                                                                                                                  this.a(1, var3);
                                                                                                                                                                                                                  break label535;
                                                                                                                                                                                                               }

                                                                                                                                                                                                               this.a(-1, -1);
                                                                                                                                                                                                               this.a(-1, -1);
                                                                                                                                                                                                               break label659;
                                                                                                                                                                                                            }

                                                                                                                                                                                                            this.a(-1, -1);
                                                                                                                                                                                                            this.a(-1, -1);
                                                                                                                                                                                                            break label533;
                                                                                                                                                                                                         }

                                                                                                                                                                                                         this.a(-2, -1);
                                                                                                                                                                                                         this.a(2, -1);
                                                                                                                                                                                                         break label546;
                                                                                                                                                                                                      }

                                                                                                                                                                                                      this.a(-1, -1);
                                                                                                                                                                                                      this.a(-1, -1);
                                                                                                                                                                                                      break label566;
                                                                                                                                                                                                   }

                                                                                                                                                                                                   this.a(2, var3);
                                                                                                                                                                                                   break label567;
                                                                                                                                                                                                }

                                                                                                                                                                                                this.a(1, var3);
                                                                                                                                                                                                break label551;
                                                                                                                                                                                             }

                                                                                                                                                                                             this.a(-1, -1);
                                                                                                                                                                                             this.a(-1, -1);
                                                                                                                                                                                             break label551;
                                                                                                                                                                                          }

                                                                                                                                                                                          this.a(-2, -1);
                                                                                                                                                                                          this.a(1, -1);
                                                                                                                                                                                          break label551;
                                                                                                                                                                                       }

                                                                                                                                                                                       this.a(2, var3);
                                                                                                                                                                                       break label563;
                                                                                                                                                                                    }

                                                                                                                                                                                    this.a(2, var3);
                                                                                                                                                                                    break label656;
                                                                                                                                                                                 }

                                                                                                                                                                                 this.a(-1, -1);
                                                                                                                                                                                 this.a(-1, -1);
                                                                                                                                                                                 break label557;
                                                                                                                                                                              }

                                                                                                                                                                              this.a(1, var3);
                                                                                                                                                                              break label557;
                                                                                                                                                                           }

                                                                                                                                                                           this.a(2, var3);
                                                                                                                                                                           this.a(-1, -1);
                                                                                                                                                                           this.a(-1, -1);
                                                                                                                                                                           break label558;
                                                                                                                                                                        }

                                                                                                                                                                        this.a(1, var3);
                                                                                                                                                                        break label558;
                                                                                                                                                                     }

                                                                                                                                                                     this.a(-2, -1);
                                                                                                                                                                     this.a(2, -1);
                                                                                                                                                                     break label559;
                                                                                                                                                                  }

                                                                                                                                                                  this.a(-2, -1);
                                                                                                                                                                  this.a(1, -1);
                                                                                                                                                                  break label560;
                                                                                                                                                               }

                                                                                                                                                               this.a(-2, -1);
                                                                                                                                                               this.a(2, -1);
                                                                                                                                                               break label563;
                                                                                                                                                            }

                                                                                                                                                            this.a(-2, -1);
                                                                                                                                                            this.a(2, -1);
                                                                                                                                                            break label567;
                                                                                                                                                         }

                                                                                                                                                         this.a(-1, -1);
                                                                                                                                                         this.a(-1, -1);
                                                                                                                                                         break label550;
                                                                                                                                                      }

                                                                                                                                                      this.a(-2, -1);
                                                                                                                                                      this.a(2, -1);
                                                                                                                                                      break label656;
                                                                                                                                                   }

                                                                                                                                                   this.a(-1, -1);
                                                                                                                                                   this.a(-1, -1);
                                                                                                                                                   break label560;
                                                                                                                                                }

                                                                                                                                                this.a(2, var3);
                                                                                                                                                break label559;
                                                                                                                                             }

                                                                                                                                             this.a(2, var3);
                                                                                                                                             break label655;
                                                                                                                                          }

                                                                                                                                          this.a(1, var3);
                                                                                                                                          break label573;
                                                                                                                                       }

                                                                                                                                       this.a(-2, -1);
                                                                                                                                       this.a(2, -1);
                                                                                                                                       break label569;
                                                                                                                                    }

                                                                                                                                    this.a(-2, -1);
                                                                                                                                    this.a(2, -1);
                                                                                                                                    break label570;
                                                                                                                                 }

                                                                                                                                 this.a(1, var3);
                                                                                                                                 break label576;
                                                                                                                              }

                                                                                                                              this.a(-1, -1);
                                                                                                                              this.a(-1, -1);
                                                                                                                              break label573;
                                                                                                                           }

                                                                                                                           this.a(-2, -1);
                                                                                                                           this.a(2, -1);
                                                                                                                           break label655;
                                                                                                                        }

                                                                                                                        this.a(-2, -1);
                                                                                                                        this.a(1, -1);
                                                                                                                        break label573;
                                                                                                                     }

                                                                                                                     this.a(-1, -1);
                                                                                                                     this.a(-1, -1);
                                                                                                                     break label579;
                                                                                                                  }

                                                                                                                  this.a(-2, -1);
                                                                                                                  this.a(1, -1);
                                                                                                                  break label576;
                                                                                                               }

                                                                                                               this.a(2, var3);
                                                                                                               break label569;
                                                                                                            }

                                                                                                            this.a(-2, -1);
                                                                                                            this.a(1, -1);
                                                                                                            break label577;
                                                                                                         }

                                                                                                         this.a(-1, -1);
                                                                                                         this.a(-1, -1);
                                                                                                         break label577;
                                                                                                      }

                                                                                                      this.a(1, var3);
                                                                                                      break label579;
                                                                                                   }

                                                                                                   this.a(2, var3);
                                                                                                   break label570;
                                                                                                }

                                                                                                this.a(-2, -1);
                                                                                                this.a(1, -1);
                                                                                                break label579;
                                                                                             }

                                                                                             this.a(-1, -1);
                                                                                             this.a(-1, -1);
                                                                                             break label576;
                                                                                          }

                                                                                          this.a(2, var3);
                                                                                          break label582;
                                                                                       }

                                                                                       this.a(-1, -1);
                                                                                       this.a(-1, -1);
                                                                                       break label581;
                                                                                    }

                                                                                    this.a(-1, -1);
                                                                                    this.a(-1, -1);
                                                                                    break label587;
                                                                                 }

                                                                                 this.a(-2, -1);
                                                                                 this.a(1, -1);
                                                                                 break label581;
                                                                              }

                                                                              this.a(1, var3);
                                                                              break label587;
                                                                           }

                                                                           this.a(-2, -1);
                                                                           this.a(2, -1);
                                                                           break label588;
                                                                        }

                                                                        this.a(-1, -1);
                                                                        this.a(-1, -1);
                                                                        break label585;
                                                                     }

                                                                     this.a(-2, -1);
                                                                     this.a(2, -1);
                                                                     break label582;
                                                                  }

                                                                  this.a(-2, -1);
                                                                  this.a(1, -1);
                                                                  break label585;
                                                               }

                                                               this.a(2, var3);
                                                               break label588;
                                                            }

                                                            this.a(-2, -1);
                                                            this.a(1, -1);
                                                            break label587;
                                                         }

                                                         this.a(1, var3);
                                                      }

                                                      this.a(-2, -1);
                                                      this.a(1, -1);
                                                      break label590;
                                                   }

                                                   this.a(-1, -1);
                                                   this.a(-1, -1);
                                                   break label591;
                                                }

                                                this.a(2, var3);
                                                break label593;
                                             }

                                             this.a(1, var3);
                                             break label591;
                                          }

                                          this.a(-2, -1);
                                          this.a(1, -1);
                                          break label591;
                                       }

                                       this.a(1, var3);
                                       break label590;
                                    }

                                    this.a(-2, -1);
                                    this.a(2, -1);
                                    break label593;
                                 }

                                 this.a(-1, -1);
                                 this.a(-1, -1);
                                 break label590;
                              }

                              this.a(1, var3);
                              break label654;
                           }

                           this.a(-2, -1);
                           this.a(1, -1);
                           break label654;
                        }

                        this.a(-2, -1);
                        this.a(2, -1);
                        break label594;
                     }

                     this.a(2, var3);
                     break label594;
                  }

                  this.a(-1, -1);
                  this.a(-1, -1);
                  break label654;
               }

               this.a(-1, -1);
               this.a(-1, -1);
               break label598;
            }

            this.a(-2, -1);
            this.a(1, -1);
            break label598;
         }

         this.a(1, var3);
      }

      if (var2) {
         while(var4 < this.n) {
            this.a(-3, -3);
            ++var4;
         }
      }

   }

   private void a(int var1, int var2) {
      this.x.add(var1);
      this.x.add(var2);
   }

   private void b() {
      if (this.v != null) {
         try {
            if (VERSION.SDK_INT >= 21) {
               this.v.setVolume(0.0F);
               return;
            }

            this.v.setStereoVolume(0.0F, 0.0F);
         } catch (Exception var2) {
         }

      }
   }

   private void c() {
      MyLog.log("MyPlayerMorse.seqCreate ");
      this.x.clear();
      this.a(-6, -3);
      MyLog.log(String.format(Locale.US, "MyPlayerMorse.seqCreate repeat=%d text=%s", this.g, this.l));
      boolean var1 = false;
      int var2 = 0;

      while(!var1) {
         String var3 = this.l.toLowerCase(Locale.US);
         int var4 = var3.length();

         int var5;
         char var6;
         boolean var7;
         for(var5 = 0; var5 < var4; this.a(var6, var7)) {
            var6 = var3.charAt(var5);
            ++var5;
            if (var5 < var4 && var3.charAt(var5) == '|') {
               var7 = false;
            } else {
               var7 = true;
            }
         }

         label42: {
            var4 = var2 + 1;
            var5 = this.o * this.x.size() / 2;
            MyLog.log(String.format(Locale.US, "MyPlayerMorse.seqCreate   iter=%d   mList.size=%d   Dur=%d msec", var4, this.x.size(), var5));
            if (this.g > 0) {
               if (var4 < this.g) {
                  break label42;
               }
            } else if (var5 <= -this.g * 1000) {
               break label42;
            }

            var1 = true;
         }

         boolean var9 = var1;
         if (var4 > 100) {
            MyLog.log("MyPlayerMorse.seqCreate  ERROR niters>100");
            var9 = true;
         }

         var1 = var9;
         var2 = var4;
         if (!var9) {
            this.a(-3, -3);
            this.a(-3, -3);
            this.a(-3, -3);
            this.a(-3, -3);
            this.a(-3, -3);
            this.a(-3, -3);
            this.a(-3, -3);
            this.a(-3, -3);
            this.a(-3, -3);
            this.a(-3, -3);
            this.a(-3, -3);
            this.a(-3, -3);
            this.a(-3, -3);
            this.a(-3, -3);
            this.a(-3, -3);
            var1 = var9;
            var2 = var4;
         }
      }

      StringBuilder var8 = new StringBuilder();
      var8.append("MyPlayerMorse.seqCreate after message mList.size=");
      var8.append(this.x.size());
      var8.append("   Nelements=");
      var8.append(this.q);
      MyLog.log(var8.toString());
      this.a(-7, -3);
      this.a(-7, -3);
      this.a(-7, -3);
      this.a(-7, -3);
      this.a(-7, -3);
      this.a(-8, -3);
      var8 = new StringBuilder();
      var8.append("MyPlayerMorse.seqCreate after mDelayAfter mList.size=");
      var8.append(this.x.size());
      MyLog.log(var8.toString());
   }

   protected Void doInBackground(Void... var1) {
      StringBuilder var27;
      if (this.a == null) {
         var27 = new StringBuilder();
         var27.append("MyMorsePlayer.doInBackground ERROR wr_context=null instance=");
         var27.append(this.b);
         MyLog.log(var27.toString());
         this.y.countDown();
         return null;
      } else {
         final Context var2 = (Context)this.a.get();
         if (var2 == null) {
            var27 = new StringBuilder();
            var27.append("MyMorsePlayer.doInBackground ERROR tmpContext=null instance=");
            var27.append(this.b);
            MyLog.log(var27.toString());
            this.y.countDown();
            return null;
         } else if (this.q <= 0) {
            var27 = new StringBuilder();
            var27.append("MyMorsePlayer.doInBackground Exiting...  mNElements=");
            var27.append(this.q);
            MyLog.log(var27.toString());
            this.y.countDown();
            return null;
         } else {
            var27 = new StringBuilder();
            var27.append("MyPlayerMorse.doInBackground. Creating tone instance=");
            var27.append(this.b);
            MyLog.log(var27.toString());

            int var3;
            int var4;
            boolean var10001;
            MyTone var28;
            label161: {
               label170: {
                  try {
                     var28 = new MyTone(this.q * this.o, this.p);
                  } catch (Exception var26) {
                     var10001 = false;
                     break label170;
                  }

                  var3 = 0;

                  while(true) {
                     try {
                        if (var3 >= this.q) {
                           break label161;
                        }

                        var4 = (Integer)this.x.get(var3 * 2);
                     } catch (Exception var25) {
                        var10001 = false;
                        break;
                     }

                     if (var4 == 1) {
                        try {
                           var28.a(var3 * this.o, this.o, (float)this.i, (float)this.j, (float)(this.k * this.o) / 100.0F);
                        } catch (Exception var24) {
                           var10001 = false;
                           break;
                        }
                     } else if (var4 == 2) {
                        try {
                           var28.a(var3 * this.o, this.o * 3, (float)this.i, (float)this.j, (float)(this.k * this.o) / 100.0F);
                        } catch (Exception var23) {
                           var10001 = false;
                           break;
                        }
                     }

                     ++var3;
                  }
               }

               MyLog.log("MyPlayerMorse.doInBackground ERROR Creating tone");
               this.y.countDown();
               return null;
            }

            StringBuilder var5 = new StringBuilder();
            var5.append("MyPlayerMorse.doInBackground registering broadcast receiver instance=");
            var5.append(this.b);
            MyLog.log(var5.toString());
            androidx.localbroadcastmanager.content.LocalBroadcastManager var6 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(var2);
            IntentFilter var30 = new IntentFilter();
            var30.addAction("LBR_ACTION_FINISH");
            var6.registerReceiver(this.z, var30);
            this.t = var28.a / this.q;
            var5 = new StringBuilder();
            var5.append("MyPlayerMorse.doInBackground AudioTrack play nElements=");
            var5.append(this.q);
            MyLog.log(var5.toString());
            var5 = new StringBuilder();
            var5.append("MyPlayerMorse.doInBackground AudioTrack play nSamples=");
            var5.append(var28.a);
            MyLog.log(var5.toString());
            var5 = new StringBuilder();
            var5.append("MyPlayerMorse.doInBackground AudioTrack play nSamplesDur=");
            var5.append(this.t);
            MyLog.log(var5.toString());
            StringBuilder var29;
            if (var28.a <= 0) {
               var29 = new StringBuilder();
               var29.append("MyMorsePlayer.doInBackground Exiting...  tmpTone.mNSamples=");
               var29.append(var28.a);
               MyLog.log(var29.toString());
               this.y.countDown();
               return null;
            } else if (var28.b.length <= 0) {
               var29 = new StringBuilder();
               var29.append("MyMorsePlayer.doInBackground Exiting...  tmpTone.mGeneratedSnd.length=");
               var29.append(var28.b.length);
               MyLog.log(var29.toString());
               this.y.countDown();
               return null;
            } else {
               var5 = new StringBuilder();
               var5.append("MyPlayerMorse.doInBackground. Creating audiotrack. Buffersize=");
               var5.append(this.r);
               MyLog.log(var5.toString());

               try {
                  var3 = AudioTrack.getMinBufferSize(this.p, 4, 2);
               } catch (Exception var18) {
                  MyLog.log("MyPlayerMorse.doInBackground. ERROR getMinBufferSize");
                  var3 = this.p * 4;
               }

               label139: {
                  label138: {
                     label137: {
                        try {
                           if (VERSION.SDK_INT >= 26) {
                              Builder var35 = new Builder();
                              android.media.AudioAttributes.Builder var31 = new android.media.AudioAttributes.Builder();
                              Builder var32 = var35.setAudioAttributes(var31.setLegacyStreamType(this.h).build());
                              android.media.AudioFormat.Builder var36 = new android.media.AudioFormat.Builder();
                              this.v = var32.setAudioFormat(var36.setEncoding(AudioFormat.ENCODING_PCM_16BIT).setSampleRate(this.p).setChannelMask(4).build()).setBufferSizeInBytes(var3).setTransferMode(1).build();
                              break label139;
                           }
                        } catch (IllegalArgumentException var21) {
                           var10001 = false;
                           break label138;
                        } catch (Exception var22) {
                           var10001 = false;
                           break label137;
                        }

                        try {
                           AudioTrack var33 = new AudioTrack(this.h, this.p, 4, 2, var3, 1);
                           this.v = var33;
                           break label139;
                        } catch (IllegalArgumentException var19) {
                           var10001 = false;
                           break label138;
                        } catch (Exception var20) {
                           var10001 = false;
                        }
                     }

                     MyLog.log(String.format(Locale.US, "MyPlayerMorse.doInBackground. ERROR Creating audiotrack. Exception mstream=%d sr=%d channels=%d encoding=%d length=%d", this.h, this.p, 4, 2, var28.b.length));
                     this.y.countDown();
                     return null;
                  }

                  MyLog.log(String.format(Locale.US, "MyPlayerMorse.doInBackground. ERROR Creating audiotrack. IllegalArgumentException mstream=%d sr=%d channels=%d encoding=%d length=%d", this.h, this.p, 4, 2, var28.b.length));
                  this.y.countDown();
                  return null;
               }

               if (!this.c) {
                  MyLog.log("MyPlayerMorse doInBackground mEnableSound=false. Muting...");
                  this.b();
               }

               var5 = new StringBuilder();
               var5.append("MyPlayerMorse.doInBackground. Audiotrack created. checking mAudioTrack state =");
               var5.append(this.v.getState());
               MyLog.log(var5.toString());
               var3 = 0;

               while(this.v.getState() != 1) {
                  var4 = var3 + 1;

                  try {
                     Thread.sleep(100L);
                  } catch (InterruptedException var17) {
                     var17.printStackTrace();
                  }

                  var5 = new StringBuilder();
                  var5.append("MyPlayerMorse.doInBackground. Audiotrack created. mAudioTrack.getstate=");
                  var5.append(this.v.getState());
                  MyLog.log(var5.toString());
                  var3 = var4;
                  if (var4 >= 20) {
                     var27 = new StringBuilder();
                     var27.append("MyPlayerMorse.doInBackground ERROR mAudioTrack.state!=STATE_INITIALIZED after 20 tries. Stopping... instance=");
                     var27.append(this.b);
                     MyLog.log(var27.toString());
                     this.y.countDown();
                     return null;
                  }
               }

               if (this.u) {
                  var27 = new StringBuilder();
                  var27.append("MyPlayerMorse.doInBackground commandstop=true... instance=");
                  var27.append(this.b);
                  MyLog.log(var27.toString());
                  this.y.countDown();
                  return null;
               } else if (this.y.getCount() != 1L) {
                  var27 = new StringBuilder();
                  var27.append("MyPlayerMorse.doInBackground mDoneLatch.getCount() != 1 instance=");
                  var27.append(this.b);
                  MyLog.log(var27.toString());
                  return null;
               } else {
                  if (this.f > 0) {
                     long var7 = System.currentTimeMillis() - this.s;
                     long var9 = (long)this.f - var7;
                     MyLog.log(String.format(Locale.US, "MyPlayerMorse.doInBackground Waiting %d-%d=%d msec", this.f, var7, var9));
                     if (var9 > 0L && var9 < 10000L) {
                        try {
                           Thread.sleep(var9);
                        } catch (InterruptedException var16) {
                           var5 = new StringBuilder();
                           var5.append("MyPlayerMorse.doInBackground ERROR sleep in delay before instance=");
                           var5.append(this.b);
                           MyLog.log(var5.toString());
                        }
                     }

                     var5 = new StringBuilder();
                     var5.append("MyPlayerMorse.doInBackground Waiting finished instance=");
                     var5.append(this.b);
                     MyLog.log(var5.toString());
                  }

                  var5 = new StringBuilder();
                  var5.append("MyPlayerMorse.doInBackground Start Playing instance=");
                  var5.append(this.b);
                  MyLog.log(var5.toString());
                  var5 = new StringBuilder();
                  var5.append("MyPlayerMorse.doInBackground AudioTrack play nElements=");
                  var5.append(this.q);
                  MyLog.log(var5.toString());
                  var5 = new StringBuilder();
                  var5.append("MyPlayerMorse.doInBackground AudioTrack play nSamples=");
                  var5.append(var28.a);
                  MyLog.log(var5.toString());
                  var5 = new StringBuilder();
                  var5.append("MyPlayerMorse.doInBackground AudioTrack play nSamplesDur=");
                  var5.append(this.t);
                  MyLog.log(var5.toString());

                  try {
                     this.v.play();
                  } catch (IllegalStateException var14) {
                     MyLog.log("MyPlayerMorse.doInBackground AudioTrack.Play->IllegalStateException");
                     this.y.countDown();
                     return null;
                  } catch (Exception var15) {
                     MyLog.log("MyPlayerMorse.doInBackground AudioTrack.Play->Exception");
                     this.y.countDown();
                     return null;
                  }

                  var5 = new StringBuilder();
                  var5.append("MyPlayerMorse.doInBackground Setting notifications instance=");
                  var5.append(this.b);
                  MyLog.log(var5.toString());

                  try {
                     this.v.setNotificationMarkerPosition(var28.a - 1);
                     this.v.setPositionNotificationPeriod(this.t);
                     AudioTrack var34 = this.v;
                     OnPlaybackPositionUpdateListener var37 = new OnPlaybackPositionUpdateListener() {
                        public void onMarkerReached(AudioTrack var1) {
                           StringBuilder var3;
                           if (var1 == null) {
                              var3 = new StringBuilder();
                              var3.append("MyPlayerMorse.doInBackground onMarkerReached audiotrack=null instance=");
                              var3.append(MyPlayerMorse.this.b);
                              MyLog.log(var3.toString());
                           } else {
                              try {
                                 var1.stop();
                              } catch (IllegalStateException var2x) {
                                 MyLog.log("MyPlayerMorse.doInBackground ERROR IllegalStateException");
                              }

                              var3 = new StringBuilder();
                              var3.append("MyPlayerMorse.doInBackground onMarkerReached instance=");
                              var3.append(MyPlayerMorse.this.b);
                              MyLog.log(var3.toString());
                              MyPlayerMorse.this.y.countDown();
                           }
                        }

                        public void onPeriodicNotification(AudioTrack var1) {
                           StringBuilder var44;
                           if (var1 == null) {
                              var44 = new StringBuilder();
                              var44.append("MyPlayerMorse.doInBackground onPeriodicNotification audiotrack=null instance=");
                              var44.append(MyPlayerMorse.this.b);
                              MyLog.log(var44.toString());
                           } else {
                              String var43;
                              label224: {
                                 label223: {
                                    label241: {
                                       boolean var10001;
                                       try {
                                          if (var1.getState() != 1) {
                                             return;
                                          }
                                       } catch (IllegalStateException var39) {
                                          var10001 = false;
                                          break label223;
                                       } catch (Exception var40) {
                                          var10001 = false;
                                          break label241;
                                       }

                                       try {
                                          if (var1.getPlayState() != 3) {
                                             return;
                                          }
                                       } catch (IllegalStateException var37) {
                                          var10001 = false;
                                          break label223;
                                       } catch (Exception var38) {
                                          var10001 = false;
                                          break label241;
                                       }

                                       int var2x;
                                       int var3;
                                       label230: {
                                          label231: {
                                             try {
                                                var2x = var1.getPlaybackHeadPosition() / MyPlayerMorse.this.t;
                                                if (var2x >= MyPlayerMorse.this.q) {
                                                   break label231;
                                                }
                                             } catch (IllegalStateException var35) {
                                                var10001 = false;
                                                break label223;
                                             } catch (Exception var36) {
                                                var10001 = false;
                                                break label241;
                                             }

                                             var3 = var2x * 2;

                                             try {
                                                if (var3 < MyPlayerMorse.this.x.size()) {
                                                   break label230;
                                                }
                                             } catch (IllegalStateException var33) {
                                                var10001 = false;
                                                break label223;
                                             } catch (Exception var34) {
                                                var10001 = false;
                                                break label241;
                                             }
                                          }

                                          label238: {
                                             try {
                                                if (VERSION.SDK_INT >= 21) {
                                                   var1.setVolume(0.0F);
                                                   break label238;
                                                }
                                             } catch (IllegalStateException var31) {
                                                var10001 = false;
                                                break label223;
                                             } catch (Exception var32) {
                                                var10001 = false;
                                                break label241;
                                             }

                                             try {
                                                var1.setStereoVolume(0.0F, 0.0F);
                                             } catch (IllegalStateException var29) {
                                                var10001 = false;
                                                break label223;
                                             } catch (Exception var30) {
                                                var10001 = false;
                                                break label241;
                                             }
                                          }

                                          try {
                                             var1.stop();
                                             var44 = new StringBuilder();
                                             var44.append("MyPlayerMorse.doInBackground onPeriodicNotification i>=nElements instance=");
                                             var44.append(MyPlayerMorse.this.b);
                                             MyLog.log(var44.toString());
                                             MyPlayerMorse.this.y.countDown();
                                             return;
                                          } catch (IllegalStateException var27) {
                                             var10001 = false;
                                             break label223;
                                          } catch (Exception var28) {
                                             var10001 = false;
                                             break label241;
                                          }
                                       }

                                       try {
                                          var3 = (Integer) MyPlayerMorse.this.x.get(var3);
                                       } catch (IllegalStateException var25) {
                                          var10001 = false;
                                          break label223;
                                       } catch (Exception var26) {
                                          var10001 = false;
                                          break label241;
                                       }

                                       if (var3 == -7) {
                                          label239: {
                                             try {
                                                StringBuilder var4 = new StringBuilder();
                                                var4.append("MyPlayerMorse.doInBackground onPeriodicNotification STOP detected at ");
                                                var4.append(var2x);
                                                var4.append("...  Muting... instance=");
                                                var4.append(MyPlayerMorse.this.b);
                                                MyLog.log(var4.toString());
                                                if (VERSION.SDK_INT >= 21) {
                                                   var1.setVolume(0.0F);
                                                   break label239;
                                                }
                                             } catch (IllegalStateException var23) {
                                                var10001 = false;
                                                break label223;
                                             } catch (Exception var24) {
                                                var10001 = false;
                                                break label241;
                                             }

                                             try {
                                                var1.setStereoVolume(0.0F, 0.0F);
                                             } catch (IllegalStateException var21) {
                                                var10001 = false;
                                                break label223;
                                             } catch (Exception var22) {
                                                var10001 = false;
                                                break label241;
                                             }
                                          }
                                       }

                                       long[] var45;
                                       try {
                                          App.a(var2, var2x);
                                          if (!MyPlayerMorse.this.d || MyPlayerMorse.this.w == null) {
                                             return;
                                          }

                                          var45 = new long[]{0L, 0L, 0L};
                                       } catch (IllegalStateException var19) {
                                          var10001 = false;
                                          break label223;
                                       } catch (Exception var20) {
                                          var10001 = false;
                                          break label241;
                                       }

                                       if (var3 == -1) {
                                          return;
                                       }

                                       Vibrator var42;
                                       label172: {
                                          MyPlayerMorse var41;
                                          switch(var3) {
                                          case 1:
                                             var45[0] = 0L;

                                             try {
                                                var45[1] = (long) MyPlayerMorse.this.o;
                                                var45[2] = (long) MyPlayerMorse.this.o;
                                                if (VERSION.SDK_INT >= 26) {
                                                   var42 = MyPlayerMorse.this.w;
                                                   break label172;
                                                }
                                             } catch (IllegalStateException var17) {
                                                var10001 = false;
                                                break label223;
                                             } catch (Exception var18) {
                                                var10001 = false;
                                                break label241;
                                             }

                                             try {
                                                var41 = MyPlayerMorse.this;
                                                break;
                                             } catch (IllegalStateException var11) {
                                                var10001 = false;
                                                break label223;
                                             } catch (Exception var12) {
                                                var10001 = false;
                                                break label241;
                                             }
                                          case 2:
                                             var45[0] = 0L;

                                             try {
                                                var45[1] = (long)(MyPlayerMorse.this.o * 3);
                                                var45[2] = (long) MyPlayerMorse.this.o;
                                                if (VERSION.SDK_INT >= 26) {
                                                   var42 = MyPlayerMorse.this.w;
                                                   break label172;
                                                }
                                             } catch (IllegalStateException var15) {
                                                var10001 = false;
                                                break label223;
                                             } catch (Exception var16) {
                                                var10001 = false;
                                                break label241;
                                             }

                                             try {
                                                var41 = MyPlayerMorse.this;
                                                break;
                                             } catch (IllegalStateException var13) {
                                                var10001 = false;
                                                break label223;
                                             } catch (Exception var14) {
                                                var10001 = false;
                                                break label241;
                                             }
                                          default:
                                             var45[0] = 0L;
                                             var45[1] = 0L;

                                             try {
                                                var45[2] = (long) MyPlayerMorse.this.o;
                                                return;
                                             } catch (IllegalStateException var9) {
                                                var10001 = false;
                                                break label223;
                                             } catch (Exception var10) {
                                                var10001 = false;
                                                break label241;
                                             }
                                          }

                                          try {
                                             var41.w.vibrate(var45, -1);
                                             return;
                                          } catch (IllegalStateException var7) {
                                             var10001 = false;
                                             break label223;
                                          } catch (Exception var8) {
                                             var10001 = false;
                                             break label241;
                                          }
                                       }

                                       try {
                                          var42.vibrate(VibrationEffect.createWaveform(var45, -1));
                                          return;
                                       } catch (IllegalStateException var5) {
                                          var10001 = false;
                                          break label223;
                                       } catch (Exception var6) {
                                          var10001 = false;
                                       }
                                    }

                                    var43 = "MyPlayerMorse.doInBackground onPeriodicNotification->Exception";
                                    break label224;
                                 }

                                 var43 = "MyPlayerMorse.doInBackground onPeriodicNotification->IllegalStateException";
                              }

                              MyLog.log(var43);
                              MyPlayerMorse.this.y.countDown();
                           }
                        }
                     };
                     var34.setPlaybackPositionUpdateListener(var37);
                  } catch (IllegalStateException var12) {
                     MyLog.log("MyPlayerMorse.doInBackground AudioTrack.setPlaybackPositionUpdateListener->IllegalStateException");
                     this.y.countDown();
                     return null;
                  } catch (Exception var13) {
                     MyLog.log("MyPlayerMorse.doInBackground AudioTrack.setPlaybackPositionUpdateListener->Exception");
                     this.y.countDown();
                     return null;
                  }

                  MyLog.log("MyPlayerMorse.doInBackground mAudioTrack.write");

                  try {
                     this.v.write(var28.b, 0, var28.b.length);
                     return null;
                  } catch (Exception var11) {
                     MyLog.log("MyPlayerMorse.doInBackground ERROR mAudioTrack.write");
                     this.y.countDown();
                     return null;
                  }
               }
            }
         }
      }
   }

   ArrayList a() {
      return this.x;
   }

   public void a(Context var1) {
      StringBuilder var2 = new StringBuilder();
      var2.append("MyPlayerMorse.playDone instance=");
      var2.append(this.b);
      MyLog.log(var1, var2.toString());
      String var15;
      if (!this.m) {
         var15 = "MyPlayerMorse.playDone ERROR mPlayInitOK = false";
      } else {
         long var3 = (long)(this.o * this.q + 5000);
         long var5 = var3;
         if (var3 < 1000L) {
            var5 = 1000L;
         }

         var3 = var5;
         if (var5 > 120000L) {
            var3 = 120000L;
         }

         MyLog.log(var1, String.format(Locale.US, "MyPlayerMorse.playDone Waiting to finish (max %d msec)", var3));

         try {
            this.y.await(var3, TimeUnit.MILLISECONDS);
         } catch (InterruptedException var14) {
            MyLog.log(var1, "MyPlayerMorse.playDone ERROR ");
         }

         MyLog.log(var1, "MyPlayerMorse.playDone Waiting OK");

         try {
            var2 = new StringBuilder();
            var2.append("MyPlayerMorse.playDone unregistering broadcast receiver  instance=");
            var2.append(this.b);
            MyLog.log(var1, var2.toString());
            androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(var1).unregisterReceiver(this.z);
         } catch (Exception var13) {
            var13.printStackTrace();
         }

         var2 = new StringBuilder();
         var2.append("MyPlayerMorse.playDone broadcasting finish  instance=");
         var2.append(this.b);
         MyLog.log(var1, var2.toString());
         if (!this.u) {
            App.b(var1);
         }

         var2 = new StringBuilder();
         var2.append("MyPlayerMorse.playDone deleting audiotrack  instance=");
         var2.append(this.b);
         MyLog.log(var1, var2.toString());
         if (this.v != null) {
            try {
               this.b();
               this.v.stop();
               this.v.release();
               this.v = null;
            } catch (IllegalStateException var11) {
            } finally {
               this.v = null;
            }
         }

         var2 = new StringBuilder();
         var2.append("MyPlayerMorse.playDone deleting context reference  instance=");
         var2.append(this.b);
         MyLog.log(var1, var2.toString());
         if (this.a != null) {
            this.a.clear();
            this.a = null;
         }

         var2 = new StringBuilder();
         var2.append("MyPlayerMorse.playDone OUT instance=");
         var2.append(this.b);
         var15 = var2.toString();
      }

      MyLog.log(var1, var15);
   }

   public void a(Context var1, boolean var2, boolean var3, boolean var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, String var13) {
      MyLog.log(String.format(Locale.US, "MyPlayerMorse.playInit inst=%d arepeat=%d", this.b, var6));
      this.c = var2;
      this.d = var3;
      this.e = var4;
      this.f = var5;
      this.g = var6;
      this.h = var9;
      if (this.h != 4 && this.h != 3 && this.h != 5 && this.h != 2 && this.h != 1) {
         this.h = 3;
      }

      this.i = var10;
      if (this.i < 100) {
         this.i = 100;
      }

      if (this.i > 20000) {
         this.i = 20000;
      }

      this.j = var11;
      if (this.j < 1) {
         this.j = 1;
      }

      if (this.j > 100) {
         this.j = 100;
      }

      this.k = var12;
      if (this.k > 49) {
         this.k = 49;
      }

      if (this.k < 0) {
         this.k = 0;
      }

      this.l = var13;
      this.m = false;
      this.o = '\uea60' / (var7 * 50);
      if (this.o < 30) {
         this.o = 30;
      }

      if (this.o > 1200) {
         this.o = 1200;
      }

      this.p = AudioTrack.getNativeOutputSampleRate(this.h);
      if (this.p <= 0) {
         this.p = 8000;
      }

      var6 = '\uea60' / (var8 * 50);
      var5 = var6;
      if (var6 < 30) {
         var5 = 30;
      }

      var6 = var5;
      if (var5 > 1200) {
         var6 = 1200;
      }

      this.n = var6 * 3 / this.o;
      this.s = System.currentTimeMillis();
      StringBuilder var14 = new StringBuilder();
      var14.append("MyPlayerMorse.playInit text=");
      var14.append(this.l);
      MyLog.log(var1, var14.toString());
      var14 = new StringBuilder();
      var14.append("MyPlayerMorse.playInit pref_call_freq=");
      var14.append(this.i);
      MyLog.log(var1, var14.toString());
      var14 = new StringBuilder();
      var14.append("MyPlayerMorse.playInit samplerate=");
      var14.append(this.p);
      MyLog.log(var1, var14.toString());
      var14 = new StringBuilder();
      var14.append("MyPlayerMorse.playInit mdur=");
      var14.append(this.o);
      MyLog.log(var1, var14.toString());
      var14 = new StringBuilder();
      var14.append("MyPlayerMorse.playInit mSpacesAfterChar=");
      var14.append(this.n);
      MyLog.log(var1, var14.toString());
      MyLog.log(var1, "MyPlayerMorse.playInit Creating sequence");
      this.c();
      this.q = this.x.size() / 2;
      this.r = this.p * this.o * this.q / 1000;
      var14 = new StringBuilder();
      var14.append("MyPlayerMorse.playInit nelements ");
      var14.append(this.q);
      MyLog.log(var1, var14.toString());
      if (this.d) {
         MyLog.log(var1, "MyPlayerMorse.playInit Initializing vibration");
         this.w = (Vibrator)var1.getSystemService("vibrator");
      }

      this.m = true;
      var14 = new StringBuilder();
      var14.append("MyPlayerMorse.playInit OUT instance=");
      var14.append(this.b);
      MyLog.log(var1, var14.toString());
   }

   // $FF: synthetic method
   protected Object doInBackground(Object[] var1) {
      try {
         return this.doInBackground((Void[]) var1);
      } catch (Exception e) {
         return null;
      }
   }
}
