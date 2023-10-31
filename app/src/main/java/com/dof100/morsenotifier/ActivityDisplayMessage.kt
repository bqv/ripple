package com.dof100.morsenotifier

import android.app.Activity
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.graphics.Point
import android.opengl.GLSurfaceView
import android.os.Bundle
import android.os.Handler
import android.view.Display
import android.view.KeyEvent
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.LinearLayout
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.dof100.morsenotifier.MyLog.log

class ActivityDisplayMessage constructor() : Activity(), View.OnClickListener {
  private var a: Int = 0
  private var b: Boolean = true
  private var c: Int = 1
  private var d: Int = 0
  private var e: Boolean = true
  private var f: Boolean = false
  private var g: Int = 16777215
  private var h: Int = 16776960
  private var i: Int = 16711680
  private var j: Int = 0
  private var k: Int = 1
  private var l: GLSurfaceView? = null
  private var m: MyMorseRenderer? = null
  private var n: ArrayList<*>? = ArrayList<Any?>()
  private var o: Long = System.currentTimeMillis()
  private var p: Long = 0L
  private var q: Long = 0L
  private val r: BroadcastReceiver = object : BroadcastReceiver() {
    public override fun onReceive(var1: Context, var2: Intent) {
      if (("LBR_ACTION_SETPOS" == var2.getAction())) {
        val var3: Int = var2.getIntExtra("LBR_ACTION_DATA_POS", 0)
        if (var3 >= 0) {
          val var4: Int = var3 * 2
          if (var4 < n!!.size && n!!.get(var4) as Int == -8) {
            log("ActivityDisplayMessage.BroadcastReceiver  got LBR_ACTION_SETPOS -> MORSE_ELEMENT_STOP")
            a()
          }
        }
        if (m != null) {
          l!!.queueEvent(object : Runnable {
            public override fun run() {
              m!!.a(var3)
            }
          })
          l!!.invalidate()
        }
        o = System.currentTimeMillis()
      } else {
        if (("LBR_ACTION_FINISH" == var2.getAction())) {
          var var5: StringBuilder = StringBuilder()
          var5.append("ActivityDisplayMessage.BroadcastReceiver LBR_ACTION_FINISH instance=")
          var5.append(a)
          log(var5.toString())
          var5 = StringBuilder()
          var5.append("ActivityDisplayMessage.BroadcastReceiver  got LBR_ACTION_FINISH  (stopping) instance=")
          var5.append(a)
          log(var5.toString())
          a()
        }
      }
    }
  }
  private val s: Handler = Handler()
  private val t: Runnable = object : Runnable {
    public override fun run() {
      if (System.currentTimeMillis() - o > 9000L && !isFinishing()) {
        log("ActivityDisplayMessage mLastTime) > DELAY_MSEC")
        a()
      }
      s.postDelayed(this, 1000L)
    }
  }

  private fun a() {
    log("ActivityDisplayMessage.action_finish")
    l!!.setVisibility(4)
    finish()
  }

  private fun b() {
    val var1: String = "ActivityDisplayMessage.action_hide  instance=" +
        a
    log(var1)
    l!!.setVisibility(4)
    finish()
  }

  private fun c() {
    val var1: String = "ActivityDisplayMessage.action_configure  instance=" +
        a
    log(var1)
    App.Companion.b(getApplicationContext())
    this.startActivity(Intent(this, ActivityMain::class.java))
    l!!.setVisibility(View.INVISIBLE)
    finish()
  }

  public override fun onClick(var1: View) {
    log("ActivityDisplayMessage.onClick")
    if (var1 != null) {
      when (var1.getId()) {
        R.id.btn_configure -> {
          log("ActivityDisplayMessage.onClick btn_configure")
          c()
          return
        }

        R.id.btn_hide -> {
          log("ActivityDisplayMessage.onClick btn_hide")
          b()
          return
        }

        R.id.btn_stop -> {
          log("ActivityDisplayMessage.onClick btn_stop")
          App.Companion.b(getApplicationContext())
          a()
          return
        }

        else -> log("ActivityDisplayMessage.onClick  other")
      }
    }
  }

  override fun onCreate(var1: Bundle?) {
    var var1: Bundle? = var1
    super.onCreate(var1)
    var1 = getIntent().getExtras()
    if (var1 != null) {
      a = var1.getInt("PARAM_INSTANCE", 0)
      n = var1.getIntegerArrayList("PARAM_LIST")
      b = var1.getBoolean("PARAM_ENABLEDIALOGSETTINGS")
      c = var1.getInt("PARAM_DISPLAY_HOW", 1)
      d = var1.getInt("PARAM_DISPLAY_POS", 0)
      e = var1.getBoolean("PARAM_DISPLAY_TEXT", true)
      f = var1.getBoolean("PARAM_DISPLAY_FLASH", false)
      g = var1.getInt("PARAM_DISPLAY_COLOR", 16777215)
      h = var1.getInt("PARAM_DISPLAY_COLOR_ME_HILIGHT", 16776960)
      i = var1.getInt("PARAM_DISPLAY_COLOR_TEXT_HILIGHT", 16711680)
      j = var1.getInt("PARAM_DISPLAY_INITIALDELAY", 0)
      k = var1.getInt("PARAM_STOPMETHOD", 1)
    }
    var var2: Point
    var var20: StringBuilder
    run label158@{
      var20 = StringBuilder()
      var20.append("ActivityDisplayMessage.onCreate instance=")
      var20.append(a)
      log(var20.toString())
      var2 = Point()
      val var21: WindowManager? = getWindowManager()
      val var24: String
      if (var21 != null) {
        val var22: Display = var21.getDefaultDisplay()
        try {
          var22.getSize(var2)
          return@label158
        } catch (var19: Exception) {
          var24 = "ActivityDisplayMessage.onCreate ERROR try tmpDisplay.getSize"
        }
      } else {
        var24 = "ActivityDisplayMessage.onCreate ERROR getWindowManager=null"
      }
      log(this, var24 as String?)
      var2.set(320, 100)
    }
    var var10001: Boolean
    run label151@{
      run label150@{
        val var27: Window?
        try {
          var27 = getWindow()
        } catch (var18: Exception) {
          var10001 = false
          return@label150
        }
        if (var27 != null) {
          run label162@{
            run label143@{
              run label163@{
                run label167@{
                  try {
                    when (d) {
                      1 -> return@label163
                      2 -> return@label167
                      3 -> {}
                      else -> return@label143
                    }
                  } catch (var16: Exception) {
                    var10001 = false
                    return@label162
                  }
                  try {
                    log("ActivityDisplayMessage.onCreate setGravity(BOTTOM)")
                    var27.setGravity(80)
                    return@label143
                  } catch (var15: Exception) {
                    var10001 = false
                    return@label162
                  }
                }
                try {
                  log("ActivityDisplayMessage.onCreate setGravity(CENTER)")
                  var27.setGravity(17)
                  return@label143
                } catch (var14: Exception) {
                  var10001 = false
                  return@label162
                }
              }
              try {
                log("ActivityDisplayMessage.onCreate setGravity(TOP)")
                var27.setGravity(48)
              } catch (var13: Exception) {
                var10001 = false
                return@label162
              }
            }
            run label117@{
              try {
                when (c) {
                  1 -> {}
                  2, 3 -> return@label117
                  else -> return@label151
                }
              } catch (var12: Exception) {
                var10001 = false
                return@label162
              }
              try {
                log("ActivityDisplayMessage.onCreate (window)")
                var27.setType(256)
                return@label151
              } catch (var11: Exception) {
                var10001 = false
                return@label162
              }
            }
            try {
              requestWindowFeature(1)
              var27.setBackgroundDrawableResource(17170445)
              var27.setFormat(-3)
              var27.addFlags(262192)
              val var3: WindowManager.LayoutParams = var27.getAttributes()
              var3.width = var2.x
              val var23: String =
                "ActivityDisplayMessage.onCreate (scroll) params.width =" +
                    var3.width
              log(var23)
              var27.setAttributes(var3)
              return@label151
            } catch (var10: Exception) {
              var10001 = false
            }
          }
        } else {
          try {
            log(this, "ActivityDisplayMessage.onCreate ERROR getWindow=null" as String?)
            return@label151
          } catch (var17: Exception) {
            var10001 = false
          }
        }
      }
      log(this, "ActivityDisplayMessage.onCreate ERROR try getwindow" as String?)
    }
    setFinishOnTouchOutside(false)
    this.setContentView(R.layout.activity_info)
    val var4: LinearLayout = findViewById<View>(R.id.ll_btn) as LinearLayout
    val var26: Button = findViewById<View>(R.id.btn_configure) as Button
    val var28: Button = findViewById<View>(R.id.btn_stop) as Button
    val var25: Button = findViewById<View>(R.id.btn_hide) as Button
    l = findViewById<View>(R.id.glsurfaceview) as GLSurfaceView?
    run label98@{
      run label97@{
        run label96@{
          run label166@{
            try {
              if (c != 1) {
                return@label166
              }
              if (!b) {
                var26.setVisibility(8)
                return@label96
              }
            } catch (var9: Exception) {
              var10001 = false
              return@label97
            }
            try {
              var26.setOnClickListener(this)
              return@label96
            } catch (var8: Exception) {
              var10001 = false
              return@label97
            }
          }
          try {
            var4.setVisibility(8)
            var26.setVisibility(8)
            var28.setVisibility(8)
            var25.setVisibility(8)
            return@label98
          } catch (var7: Exception) {
            var10001 = false
            return@label97
          }
        }
        try {
          var28.setOnClickListener(this)
          var25.setOnClickListener(this)
          return@label98
        } catch (var6: Exception) {
          var10001 = false
        }
      }
      log(
        this,
        "ActivityDisplayMessage.onCreate ERROR try setVisibility, setOnClickListener" as String?
      )
    }
    try {
      val var29: MyMorseRenderer = MyMorseRenderer(n, c, e, f, g, h, i, j)
      m = var29
      l!!.setZOrderOnTop(true)
      l!!.setEGLConfigChooser(8, 8, 8, 8, 16, 0)
      l!!.getHolder().setFormat(1)
      l!!.setRenderer(m)
    } catch (var5: Exception) {
      log(this, "ActivityDisplayMessage.onCreate ERROR try setRenderer" as String?)
    }
    o = System.currentTimeMillis()
    var20 = StringBuilder()
    var20.append("ActivityDisplayMessage.onCreate OUT instance=")
    var20.append(a)
    log(var20.toString())
  }

  public override fun onDestroy() {
    val var1: String = "ActivityDisplayMessage.onDestroy  instance=" +
        a
    log(var1)
    super.onDestroy()
  }

  public override fun onKeyDown(var1: Int, var2: KeyEvent): Boolean {
    log("ActivityDisplayMessage.onKeyDown")
    val var3: Long = System.currentTimeMillis()
    if (var1 == 25) {
      q = var3
      if ((k == 1) || (k == 2) || (k == 3) || (k == 4 && var3 - p < 2000L)) {
        log("ActivityDisplayMessage.onKeyDown (no BRVolume) KEYCODE_VOLUME_DOWN Broadcasting Finish")
        App.Companion.b(getApplicationContext())
        a()
        return false
      } else {
        log("ActivityDisplayMessage.onKeyDown (no BRVolume) KEYCODE_VOLUME_DOWN")
        return false
      }
    } else if (var1 != 24) {
      if (var1 == 4) {
        log("ActivityDisplayMessage.onKeyDown KEYCODE_BACK")
        App.Companion.b(getApplicationContext())
        a()
        return false
      } else {
        return super.onKeyDown(var1, var2)
      }
    } else {
      p = var3
      if (k != 3 && (k != 4 || var3 - q >= 2000L)) {
        log("ActivityDisplayMessage.onKeyDown (no BRVolume) KEYCODE_VOLUME_UP")
        return false
      } else {
        log("ActivityDisplayMessage.onKeyDown (no BRVolume) KEYCODE_VOLUME_UP Broadcasting Finish")
        App.Companion.b(getApplicationContext())
        a()
        return false
      }
    }
  }

  public override fun onPause() {
    log("ActivityDisplayMessage.onPause  instance=" + a)
    LocalBroadcastManager.getInstance(
      getApplicationContext()
    ).unregisterReceiver(r)
    s.removeCallbacks(t)
    super.onPause()
  }

  public override fun onResume() {
    var var1: StringBuilder = StringBuilder()
    var1.append("ActivityDisplayMessage.onResume  instance=")
    var1.append(a)
    log(var1.toString())
    super.onResume()
    t.run()
    val var2: LocalBroadcastManager = LocalBroadcastManager.getInstance(
      getApplicationContext()
    )
    val var3: IntentFilter = IntentFilter()
    var3.addAction("LBR_ACTION_SETPOS")
    var3.addAction("LBR_ACTION_FINISH")
    var2.registerReceiver(r, var3)
    o = System.currentTimeMillis()
    s.postDelayed(t, 1000L)
    var1 = StringBuilder()
    var1.append("ActivityDisplayMessage.onResume  OUT instance=")
    var1.append(a)
    log(var1.toString())
  }

  override fun onStop() {
    val var1: String = "ActivityDisplayMessage.onStop instance=" +
        a
    log(var1)
    super.onStop()
  }
}
