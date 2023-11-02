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

class ActivityDisplayMessage : Activity(), View.OnClickListener {
  private var paramInstance: Int = 0
  private var paramEnableDialogSettings: Boolean = true
  private var paramDisplayHow: Int = 1
  private var paramDisplayPos: Int = 0
  private var paramDisplayText: Boolean = true
  private var paramDisplayFlash: Boolean = false
  private var paramDisplayColor: Int = 16777215
  private var paramDisplayColorMeHilight: Int = 16776960
  private var paramDisplayColorTextHilight: Int = 16711680
  private var paramDisplayInitialDelay: Int = 0
  private var paramStopMethod: Int = 1
  private var surfaceView: GLSurfaceView? = null
  private var morseRenderer: MyMorseRenderer? = null
  private var paramList: ArrayList<Int>? = ArrayList()
  private var timestamp1: Long = System.currentTimeMillis()
  private var timestamp3: Long = 0L
  private var timestamp2: Long = 0L
  private val broadcastReceiver: BroadcastReceiver = object : BroadcastReceiver() {
    override fun onReceive(var1: Context, intent: Intent) {
      if (("LBR_ACTION_SETPOS" == intent.action)) {
        val actionDataPos: Int = intent.getIntExtra("LBR_ACTION_DATA_POS", 0)
        if (actionDataPos >= 0) {
          val index: Int = actionDataPos * 2
          if (index < paramList!!.size && paramList!![index] == -8) {
            log("ActivityDisplayMessage.BroadcastReceiver  got LBR_ACTION_SETPOS -> MORSE_ELEMENT_STOP")
            action_finish()
          }
        }
        if (morseRenderer != null) {
          surfaceView!!.queueEvent { morseRenderer!!.a(actionDataPos) }
          surfaceView!!.invalidate()
        }
        timestamp1 = System.currentTimeMillis()
      } else {
        if (("LBR_ACTION_FINISH" == intent.action)) {
          log("ActivityDisplayMessage.BroadcastReceiver LBR_ACTION_FINISH instance=$paramInstance")
          log("ActivityDisplayMessage.BroadcastReceiver  got LBR_ACTION_FINISH  (stopping) instance=$paramInstance")
          action_finish()
        }
      }
    }
  }
  private val handler: Handler = Handler()
  private val runnable: Runnable = object : Runnable {
    override fun run() {
      if (System.currentTimeMillis() - timestamp1 > 9000L && !isFinishing) {
        log("ActivityDisplayMessage mLastTime) > DELAY_MSEC")
        action_finish()
      }
      handler.postDelayed(this, 1000L)
    }
  }

  private fun action_finish() {
    log("ActivityDisplayMessage.action_finish")
    surfaceView!!.visibility = View.INVISIBLE
    finish()
  }

  private fun action_hide() {
    log("ActivityDisplayMessage.action_hide  instance=$paramInstance")
    surfaceView!!.visibility = View.INVISIBLE
    finish()
  }

  private fun action_configure() {
    log("ActivityDisplayMessage.action_configure  instance=$paramInstance")
    App.broadcastFinish(applicationContext)
    this.startActivity(Intent(this, ActivityMain::class.java))
    surfaceView!!.visibility = View.INVISIBLE
    finish()
  }

  override fun onClick(var1: View) {
    log("ActivityDisplayMessage.onClick")
    if (var1 != null) {
      when (var1.id) {
        R.id.btn_configure -> {
          log("ActivityDisplayMessage.onClick btn_configure")
          action_configure()
          return
        }

        R.id.btn_hide -> {
          log("ActivityDisplayMessage.onClick btn_hide")
          action_hide()
          return
        }

        R.id.btn_stop -> {
          log("ActivityDisplayMessage.onClick btn_stop")
          App.broadcastFinish(applicationContext)
          action_finish()
          return
        }

        else -> log("ActivityDisplayMessage.onClick  other")
      }
    }
  }

  override fun onCreate(var1: Bundle?) {
    var bundle: Bundle? = var1
    super.onCreate(bundle)
    bundle = intent.extras
    if (bundle != null) {
      paramInstance = bundle.getInt("PARAM_INSTANCE", 0)
      paramList = bundle.getIntegerArrayList("PARAM_LIST")
      paramEnableDialogSettings = bundle.getBoolean("PARAM_ENABLEDIALOGSETTINGS")
      paramDisplayHow = bundle.getInt("PARAM_DISPLAY_HOW", 1)
      paramDisplayPos = bundle.getInt("PARAM_DISPLAY_POS", 0)
      paramDisplayText = bundle.getBoolean("PARAM_DISPLAY_TEXT", true)
      paramDisplayFlash = bundle.getBoolean("PARAM_DISPLAY_FLASH", false)
      paramDisplayColor = bundle.getInt("PARAM_DISPLAY_COLOR", 16777215)
      paramDisplayColorMeHilight = bundle.getInt("PARAM_DISPLAY_COLOR_ME_HILIGHT", 16776960)
      paramDisplayColorTextHilight = bundle.getInt("PARAM_DISPLAY_COLOR_TEXT_HILIGHT", 16711680)
      paramDisplayInitialDelay = bundle.getInt("PARAM_DISPLAY_INITIALDELAY", 0)
      paramStopMethod = bundle.getInt("PARAM_STOPMETHOD", 1)
    }
    var point: Point
    run label158@{
      log("ActivityDisplayMessage.onCreate instance=$paramInstance")
      point = Point()
      val messageToLog: String = if (windowManager != null) {
          val tmpDisplay: Display = windowManager.defaultDisplay
          try {
            tmpDisplay.getSize(point)
            return@label158
          } catch (var19: Exception) {
            "ActivityDisplayMessage.onCreate ERROR try tmpDisplay.getSize"
          }
      } else {
        "ActivityDisplayMessage.onCreate ERROR getWindowManager=null"
      }
      log(this, messageToLog)
      point.set(320, 100)
    }
    var var10001: Boolean
    run label151@{
      run label150@{
        val getWindow: Window?
        try {
          getWindow = window
        } catch (e: Exception) {
          var10001 = false
          return@label150
        }
        if (getWindow != null) {
          run label162@{
            run label143@{
              run label163@{
                run label167@{
                  try {
                    when (paramDisplayPos) {
                      1 -> return@label163
                      2 -> return@label167
                      3 -> {}
                      else -> return@label143
                    }
                  } catch (e: Exception) {
                    var10001 = false
                    return@label162
                  }
                  try {
                    log("ActivityDisplayMessage.onCreate setGravity(BOTTOM)")
                    getWindow.setGravity(80)
                    return@label143
                  } catch (e: Exception) {
                    var10001 = false
                    return@label162
                  }
                }
                try {
                  log("ActivityDisplayMessage.onCreate setGravity(CENTER)")
                  getWindow.setGravity(17)
                  return@label143
                } catch (e: Exception) {
                  var10001 = false
                  return@label162
                }
              }
              try {
                log("ActivityDisplayMessage.onCreate setGravity(TOP)")
                getWindow.setGravity(48)
              } catch (e: Exception) {
                var10001 = false
                return@label162
              }
            }
            run label117@{
              try {
                when (paramDisplayHow) {
                  1 -> {}
                  2, 3 -> return@label117
                  else -> return@label151
                }
              } catch (e: Exception) {
                var10001 = false
                return@label162
              }
              try {
                log("ActivityDisplayMessage.onCreate (window)")
                getWindow.setType(256)
                return@label151
              } catch (e: Exception) {
                var10001 = false
                return@label162
              }
            }
            try {
              requestWindowFeature(1)
              getWindow.setBackgroundDrawableResource(17170445)
              getWindow.setFormat(-3)
              getWindow.addFlags(262192)
              val params: WindowManager.LayoutParams = getWindow.attributes
              params.width = point.x
              val messageToLog = "ActivityDisplayMessage.onCreate (scroll) params.width =${params.width}"
              log(messageToLog)
              getWindow.attributes = params
              return@label151
            } catch (e: Exception) {
              var10001 = false
            }
          }
        } else {
          try {
            log(this, "ActivityDisplayMessage.onCreate ERROR getWindow=null")
            return@label151
          } catch (e: Exception) {
            var10001 = false
          }
        }
      }
      log(this, "ActivityDisplayMessage.onCreate ERROR try getwindow")
    }
    setFinishOnTouchOutside(false)
    this.setContentView(R.layout.activity_info)
    val llBtn: LinearLayout = findViewById(R.id.ll_btn)
    val btnConfigure: Button = findViewById(R.id.btn_configure)
    val btnStop: Button = findViewById(R.id.btn_stop)
    val btnHide: Button = findViewById(R.id.btn_hide)
    surfaceView = findViewById(R.id.glsurfaceview)
    run label98@{
      run label97@{
        run label96@{
          run label166@{
            try {
              if (paramDisplayHow != 1) {
                return@label166
              }
              if (!paramEnableDialogSettings) {
                btnConfigure.visibility = View.GONE
                return@label96
              }
            } catch (e: Exception) {
              var10001 = false
              return@label97
            }
            try {
              btnConfigure.setOnClickListener(this)
              return@label96
            } catch (e: Exception) {
              var10001 = false
              return@label97
            }
          }
          try {
            llBtn.visibility = View.GONE
            btnConfigure.visibility = View.GONE
            btnStop.visibility = View.GONE
            btnHide.visibility = View.GONE
            return@label98
          } catch (e: Exception) {
            var10001 = false
            return@label97
          }
        }
        try {
          btnStop.setOnClickListener(this)
          btnHide.setOnClickListener(this)
          return@label98
        } catch (e: Exception) {
          var10001 = false
        }
      }
      log(this, "ActivityDisplayMessage.onCreate ERROR try setVisibility, setOnClickListener")
    }
    try {
      morseRenderer = MyMorseRenderer(paramList, paramDisplayHow, paramDisplayText, paramDisplayFlash, paramDisplayColor, paramDisplayColorMeHilight, paramDisplayColorTextHilight, paramDisplayInitialDelay)
      surfaceView!!.setZOrderOnTop(true)
      surfaceView!!.setEGLConfigChooser(8, 8, 8, 8, 16, 0)
      surfaceView!!.holder.setFormat(1)
      surfaceView!!.setRenderer(morseRenderer)
    } catch (e: Exception) {
      log(this, "ActivityDisplayMessage.onCreate ERROR try setRenderer")
    }
    timestamp1 = System.currentTimeMillis()
    log("ActivityDisplayMessage.onCreate OUT instance=$paramInstance")
  }

  public override fun onDestroy() {
    log("ActivityDisplayMessage.onDestroy  instance=$paramInstance")
    super.onDestroy()
  }

  override fun onKeyDown(keyCode: Int, event: KeyEvent): Boolean {
    log("ActivityDisplayMessage.onKeyDown")
    val now: Long = System.currentTimeMillis()
    if (keyCode == 25) {
      timestamp2 = now
      return if ((paramStopMethod in 1..3) || (paramStopMethod == 4 && now - timestamp3 < 2000L)) {
          log("ActivityDisplayMessage.onKeyDown (no BRVolume) KEYCODE_VOLUME_DOWN Broadcasting Finish")
          App.broadcastFinish(applicationContext)
          action_finish()
        false
      } else {
          log("ActivityDisplayMessage.onKeyDown (no BRVolume) KEYCODE_VOLUME_DOWN")
        false
      }
    } else if (keyCode != 24) {
      return if (keyCode == 4) {
          log("ActivityDisplayMessage.onKeyDown KEYCODE_BACK")
          App.broadcastFinish(applicationContext)
          action_finish()
        false
      } else {
        super.onKeyDown(keyCode, event)
      }
    } else {
      timestamp3 = now
      return if (paramStopMethod != 3 && (paramStopMethod != 4 || now - timestamp2 >= 2000L)) {
          log("ActivityDisplayMessage.onKeyDown (no BRVolume) KEYCODE_VOLUME_UP")
        false
      } else {
          log("ActivityDisplayMessage.onKeyDown (no BRVolume) KEYCODE_VOLUME_UP Broadcasting Finish")
          App.broadcastFinish(applicationContext)
          action_finish()
        false
      }
    }
  }

  public override fun onPause() {
    log("ActivityDisplayMessage.onPause  instance=$paramInstance")
    LocalBroadcastManager.getInstance(applicationContext).unregisterReceiver(broadcastReceiver)
    handler.removeCallbacks(runnable)
    super.onPause()
  }

  public override fun onResume() {
    log("ActivityDisplayMessage.onResume  instance=$paramInstance")
    super.onResume()
    runnable.run()
    val var2: LocalBroadcastManager = LocalBroadcastManager.getInstance(applicationContext)
    val var3 = IntentFilter()
    var3.addAction("LBR_ACTION_SETPOS")
    var3.addAction("LBR_ACTION_FINISH")
    var2.registerReceiver(broadcastReceiver, var3)
    timestamp1 = System.currentTimeMillis()
    handler.postDelayed(runnable, 1000L)
    log("ActivityDisplayMessage.onResume  OUT instance=$paramInstance")
  }

  override fun onStop() {
    log("ActivityDisplayMessage.onStop instance=$paramInstance")
    super.onStop()
  }
}
