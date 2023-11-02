package com.dof100.morsenotifier

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.media.AudioAttributes
import android.media.AudioFormat
import android.media.AudioTrack
import android.os.AsyncTask
import android.os.Build
import android.os.Build.VERSION
import android.os.VibrationEffect
import android.os.Vibrator
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.dof100.morsenotifier.MyLog.log
import java.lang.ref.WeakReference
import java.util.Locale
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit

internal class MyPlayerMorse(context: Context, private val inst: Int) : AsyncTask<Void?, Void?, Void?>() {
  private var wr_context: WeakReference<Context>?
  private var mEnableSound = false
  private var vibrate = false
  private var playPunctuation = false
  private var mRepeat1 = 0
  private var mRepeat2 = 1
  private var mStream = 0
  private var pref_call_freq = 0
  private var j = 0
  private var k = 0
  private var text = ""
  private var mPlayInitOK = false
  private var mSpacesAfterChar = 3
  private var mdur = 100
  private var samplerate = 0
  private var nelements = 0
  private var bufferSize = 0
  private var initTimestamp = 0L
  private var nSamplesDur = 0
  private var commandStop = false
  private var audioTrack: AudioTrack? = null
  private var vibrator: Vibrator? = null
  private val mList = mutableListOf<Int>()
  private val mDoneLatch = CountDownLatch(1)

  private val broadcastReceiver: BroadcastReceiver = object : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
      if ("LBR_ACTION_FINISH" == intent.action) {
        log(context, "MyPlayerMorse.BroadcastReceiver  got ACTION_FINISH ")
        commandStop = true
        mDoneLatch.countDown()
      }
    }
  }

  init {
    wr_context = WeakReference(context)
    log(context, "MyPlayerMorse constructor instance=$inst")
  }

  private fun pushChar(char: Char, leaveGap: Boolean) {
    val character =
      if (!playPunctuation && ((char in '!'..'/') || (char in ':'..'@'))) ' '
      else char
    when(character) {
      'a', 'ά', 'α' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
      }
      'b', 'β' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      'c', 'θ' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      'd', 'δ' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      'e', 'έ', 'ε' -> {
        this.push(1, character.code)
      }
      'f', 'φ' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      'g', 'γ' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      'h', 'ή', 'η' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      'i', 'ί', 'ι' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(1, -1)
      }
      'j' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
      }
      'k', 'κ' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
      }
      'l', 'λ' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      'm', 'μ' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
      }
      'n', 'ν' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      'o', 'ο', 'ό' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
      }
      'p', 'π' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      'q', 'ψ' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
      }
      'r', 'ρ' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      's', 'ς', 'σ' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      't', 'τ' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
      }
      'u' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
      }
      'v' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
      }
      'w', 'ω', 'ώ' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
      }
      'x', 'χ' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
      }
      'y', 'υ', 'ύ' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
      }
      'z', 'ζ' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }

      '0' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
      }
      '1' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
      }
      '2' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
      }
      '3' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
      }
      '4' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
      }
      '5' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      '6' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      '7' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      '8' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      '9' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }

      '!' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
      }
      '"' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      '&' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      '\'' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      '(' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      ')' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
      }
      '+' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      ',' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
      }
      '-' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
      }
      '.' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
      }
      '/' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      ':' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      ';' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      '?' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      '@' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      'ä', 'æ' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
      }
      'ç' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      'è' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
      }
      'é' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      'å' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
      }
      'ð' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      'ñ' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
      }
      '$' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
      }
      '=' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
      }
      '_' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
      }
      'à' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
      }
      'ó', 'ö', 'ø' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      'ü', 'ŭ' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
      }
      'þ' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      'ą' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
      }
      'ć', 'ĉ' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      'đ', 'ę' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      'ĝ' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      'ĥ', 'š' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
      }
      'ĵ' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      'ł' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
      }
      'ń' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
      }
      'ś' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      'ŝ' -> {
        this.push(1, character.code)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      'ź' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
      }
      'ż' -> {
        this.push(2, character.code)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(1, -1)
        this.push(-2, -1)
        this.push(2, -1)
        this.push(-1, -1)
        this.push(-1, -1)
      }

      '|' -> {
        this.push(-2, -1)
        return
      }

      else -> {
        this.push(-3, -3)
      }
    }
    if (leaveGap) {
      var number: Int = 0
      while (number++ < mSpacesAfterChar) {
        this.push(-3, -3)
      }
    }
  }

  private fun push(signedState: Int, character: Int) {
    mList.add(signedState)
    mList.add(character) // char.code, or -1, or -3
  }

  private fun mute() {
    if (audioTrack != null) {
      try {
        if (VERSION.SDK_INT >= 21) {
          audioTrack!!.setVolume(0.0f)
          return
        }
        audioTrack!!.setStereoVolume(0.0f, 0.0f)
      } catch (e: Exception) {
      }
    }
  }

  private fun seqCreate() {
    log("MyPlayerMorse.seqCreate ")
    mList.clear()
    this.push(-6, -3)
    log(String.format(Locale.US, "MyPlayerMorse.seqCreate repeat=%d text=%s", mRepeat2, text))
    var flag = false
    var lastIter = 0
    while (!flag) {
      val message = text.lowercase()
      var i: Int = 0
      while (i < message.length) {
        val character: Char = message[i++]
        val isEOF: Boolean = i >= message.length || message[i] == '|'
        this.pushChar(character, !isEOF)
      }
      val iter = lastIter + 1
      val Dur = mdur * mList.size / 2
      log(String.format(Locale.US,
        "MyPlayerMorse.seqCreate   iter=%d   mList.size=%d   Dur=%d msec",
        iter, mList.size, Dur
      ))
      if (mRepeat2 > 0) {
        if (iter < mRepeat2) {
          //pass
        } else {
          flag = true
        }
      } else if (Dur <= -mRepeat2 * 1000) {
        //pass
      } else {
        flag = true
      }
      if (iter > 100) {
        log("MyPlayerMorse.seqCreate  ERROR niters>100")
        flag = true
      }
      lastIter = iter
      if (!flag) {
        repeat(15) {
          this.push(-3, -3)
        }
        lastIter = iter
      }
    }
    log("MyPlayerMorse.seqCreate after message mList.size=${mList.size} Nelements=$nelements")
    repeat(5) {
      this.push(-7, -3)
    }
    this.push(-8, -3)
    log("MyPlayerMorse.seqCreate after mDelayAfter mList.size=${mList.size}")
  }

  override fun doInBackground(vararg args: Void?): Void? {
    return try {
      return if (wr_context == null) {
        log("MyMorsePlayer.doInBackground ERROR wr_context=null instance=$inst")
        mDoneLatch.countDown()
        null
      } else {
        val tmpContext = wr_context?.get()
        if (tmpContext == null) {
          log("MyMorsePlayer.doInBackground ERROR tmpContext=null instance=$inst")
          mDoneLatch.countDown()
          null
        } else if (nelements <= 0) {
          log("MyMorsePlayer.doInBackground Exiting...  mNElements=$nelements")
          mDoneLatch.countDown()
          null
        } else {
          log("MyPlayerMorse.doInBackground. Creating tone instance=$inst")
          var bufferSizeInBytes: Int
          var nTries: Int
          var tmpTone: MyTone
          run label161@{
            run label170@{
              try {
                tmpTone = MyTone(nelements * mdur, samplerate)
              } catch (e: Exception) {
                return@label170
              }
              bufferSizeInBytes = 0
              while (true) {
                try {
                  if (bufferSizeInBytes >= nelements) {
                    return@label161
                  }
                  nTries = mList[bufferSizeInBytes * 2]
                } catch (e: Exception) {
                  break
                }
                if (nTries == 1) {
                  try {
                    tmpTone.act(
                      bufferSizeInBytes * mdur,
                      mdur,
                      pref_call_freq.toFloat(),
                      j.toFloat(),
                      (k * mdur).toFloat() / 100.0f
                    )
                  } catch (e: Exception) {
                    break
                  }
                } else if (nTries == 2) {
                  try {
                    tmpTone.act(
                      bufferSizeInBytes * mdur,
                      mdur * 3,
                      pref_call_freq.toFloat(),
                      j.toFloat(),
                      (k * mdur).toFloat() / 100.0f
                    )
                  } catch (e: Exception) {
                    break
                  }
                }
                ++bufferSizeInBytes
              }
            } // goto@label170
            log("MyPlayerMorse.doInBackground ERROR Creating tone")
            mDoneLatch.countDown()
            return null
          } // goto@label161
          log("MyPlayerMorse.doInBackground registering broadcast receiver instance=$inst")
          LocalBroadcastManager.getInstance(tmpContext).registerReceiver(broadcastReceiver, IntentFilter().apply {
            addAction("LBR_ACTION_FINISH")
          })
          nSamplesDur = tmpTone.nSamples / nelements
          log("MyPlayerMorse.doInBackground AudioTrack play nElements=$nelements")
          log("MyPlayerMorse.doInBackground AudioTrack play nSamples=${tmpTone.nSamples}")
          log("MyPlayerMorse.doInBackground AudioTrack play nSamplesDur=$nSamplesDur")
          if (tmpTone.nSamples <= 0) {
            log("MyMorsePlayer.doInBackground Exiting...  tmpTone.mNSamples=${tmpTone.nSamples}")
            mDoneLatch.countDown()
            null
          } else if (tmpTone.mGeneratedSnd.size <= 0) {
            log("MyMorsePlayer.doInBackground Exiting...  tmpTone.mGeneratedSnd.length=${tmpTone.mGeneratedSnd.size}")
            mDoneLatch.countDown()
            null
          } else {
            log("MyPlayerMorse.doInBackground. Creating audiotrack. Buffersize=$bufferSize")
            bufferSizeInBytes = try {
              AudioTrack.getMinBufferSize(samplerate, 4, 2)
            } catch (e: Exception) {
              log("MyPlayerMorse.doInBackground. ERROR getMinBufferSize")
              samplerate * 4
            }
            run label139@{
              run label138@{
                run label137@{
                  try {
                    if (VERSION.SDK_INT >= 26) {
                      audioTrack = AudioTrack.Builder()
                        .setAudioAttributes(
                          AudioAttributes.Builder()
                            .setLegacyStreamType(mStream)
                            .build()
                        )
                        .setAudioFormat(
                          AudioFormat.Builder()
                            .setEncoding(AudioFormat.ENCODING_PCM_16BIT)
                            .setSampleRate(samplerate)
                            .setChannelMask(4)
                            .build()
                        )
                        .setBufferSizeInBytes(bufferSizeInBytes)
                        .setTransferMode(AudioTrack.MODE_STREAM)
                        .build()
                      return@label139
                    }
                  } catch (e: IllegalArgumentException) {
                    return@label138
                  } catch (e: Exception) {
                    return@label137
                  }
                  try {
                    audioTrack = AudioTrack(mStream, samplerate, 4, 2, bufferSizeInBytes, 1)
                    return@label139
                  } catch (e: IllegalArgumentException) {
                    return@label138
                  } catch (e: Exception) {
                  }
                } // goto@label137
                log(String.format(Locale.US,
                    "MyPlayerMorse.doInBackground. ERROR Creating audiotrack. Exception mstream=%d sr=%d channels=%d encoding=%d length=%d",
                    mStream, samplerate, 4, 2, tmpTone.mGeneratedSnd.size))
                mDoneLatch.countDown()
                return null
              } // goto@label138
              log(String.format(Locale.US,
                  "MyPlayerMorse.doInBackground. ERROR Creating audiotrack. IllegalArgumentException mstream=%d sr=%d channels=%d encoding=%d length=%d",
                  mStream, samplerate, 4, 2, tmpTone.mGeneratedSnd.size))
              mDoneLatch.countDown()
              return null
            } // goto@label139
            if (!mEnableSound) {
              log("MyPlayerMorse doInBackground mEnableSound=false. Muting...")
              mute()
            }
            log("MyPlayerMorse.doInBackground. Audiotrack created. checking mAudioTrack state =${audioTrack!!.state}")
            bufferSizeInBytes = 0
            while (audioTrack!!.state != 1) {
              nTries = bufferSizeInBytes + 1
              try {
                Thread.sleep(100L)
              } catch (var17: InterruptedException) {
                var17.printStackTrace()
              }
              log("MyPlayerMorse.doInBackground. Audiotrack created. mAudioTrack.getstate=${audioTrack!!.state}")
              bufferSizeInBytes = nTries
              if (nTries >= 20) {
                log("MyPlayerMorse.doInBackground ERROR mAudioTrack.state!=STATE_INITIALIZED after 20 tries. Stopping... instance=$inst")
                mDoneLatch.countDown()
                return null
              }
            }
            if (commandStop) {
              log("MyPlayerMorse.doInBackground commandstop=true... instance=$inst")
              mDoneLatch.countDown()
              null
            } else if (mDoneLatch.count != 1L) {
              log("MyPlayerMorse.doInBackground mDoneLatch.getCount() != 1 instance=$inst")
              null
            } else {
              if (mRepeat1 > 0) {
                val var7 = System.currentTimeMillis() - initTimestamp
                val var9 = mRepeat1.toLong() - var7
                log(String.format(Locale.US,
                    "MyPlayerMorse.doInBackground Waiting %d-%d=%d msec",
                    mRepeat1, var7, var9))
                if (var9 in 1..9999) {
                  try {
                    Thread.sleep(var9)
                  } catch (e: InterruptedException) {
                    log("MyPlayerMorse.doInBackground ERROR sleep in delay before instance=$inst")
                  }
                }
                log("MyPlayerMorse.doInBackground Waiting finished instance=$inst")
              }
              log("MyPlayerMorse.doInBackground Start Playing instance=$inst")
              log("MyPlayerMorse.doInBackground AudioTrack play nElements=$nelements")
              log("MyPlayerMorse.doInBackground AudioTrack play nSamples=${tmpTone.nSamples}")
              log("MyPlayerMorse.doInBackground AudioTrack play nSamplesDur=$nSamplesDur")
              try {
                audioTrack!!.play()
              } catch (var14: IllegalStateException) {
                log("MyPlayerMorse.doInBackground AudioTrack.Play->IllegalStateException")
                mDoneLatch.countDown()
                return null
              } catch (var15: Exception) {
                log("MyPlayerMorse.doInBackground AudioTrack.Play->Exception")
                mDoneLatch.countDown()
                return null
              }
              log("MyPlayerMorse.doInBackground Setting notifications instance=$inst")
              try {
                audioTrack!!.notificationMarkerPosition = tmpTone.nSamples - 1
                audioTrack!!.positionNotificationPeriod = nSamplesDur
                val audioTrack1 = audioTrack
                val playbackPositionUpdateListener: AudioTrack.OnPlaybackPositionUpdateListener =
                  object : AudioTrack.OnPlaybackPositionUpdateListener {
                    override fun onMarkerReached(audioTrack: AudioTrack?) {
                      if (audioTrack == null) {
                        log("MyPlayerMorse.doInBackground onMarkerReached audiotrack=null instance=$inst")
                      } else {
                        try {
                          audioTrack.stop()
                        } catch (var2x: IllegalStateException) {
                          log("MyPlayerMorse.doInBackground ERROR IllegalStateException")
                        }
                        log("MyPlayerMorse.doInBackground onMarkerReached instance=$inst")
                        mDoneLatch.countDown()
                      }
                    }

                    override fun onPeriodicNotification(audioTrack: AudioTrack?) {
                      if (audioTrack == null) {
                        log("MyPlayerMorse.doInBackground onPeriodicNotification audiotrack=null instance=$inst")
                      } else {
                        var messageToLog: String
                        run label224@{
                          run label223@{
                            run label241@{
                              var var10001: Boolean
                              try {
                                if (audioTrack.state != 1) {
                                  return@onPeriodicNotification
                                }
                              } catch (e: IllegalStateException) {
                                var10001 = false
                                return@label223
                              } catch (e: Exception) {
                                var10001 = false
                                return@label241
                              }
                              try {
                                if (audioTrack.playState != 3) {
                                  return@onPeriodicNotification
                                }
                              } catch (e: IllegalStateException) {
                                var10001 = false
                                return@label223
                              } catch (e: Exception) {
                                var10001 = false
                                return@label241
                              }
                              var var2x: Int
                              var var3: Int
                              run label230@{
                                run label231@{
                                  try {
                                    var2x =
                                      audioTrack.playbackHeadPosition / nSamplesDur
                                    if (var2x >= nelements) {
                                      return@label231
                                    }
                                  } catch (e: IllegalStateException) {
                                    var10001 = false
                                    return@label223
                                  } catch (e: Exception) {
                                    var10001 = false
                                    return@label241
                                  }
                                  var3 = var2x * 2
                                  try {
                                    if (var3 < mList.size) {
                                      return@label230
                                    }
                                  } catch (e: IllegalStateException) {
                                    var10001 = false
                                    return@label223
                                  } catch (e: Exception) {
                                    var10001 = false
                                    return@label241
                                  }
                                } // goto@label231
                                run label238@{
                                  try {
                                    if (VERSION.SDK_INT >= 21) {
                                      audioTrack.setVolume(0.0f)
                                      return@label238
                                    }
                                  } catch (e: IllegalStateException) {
                                    var10001 = false
                                    return@label223
                                  } catch (e: Exception) {
                                    var10001 = false
                                    return@label241
                                  }
                                  try {
                                    audioTrack.setStereoVolume(0.0f, 0.0f)
                                  } catch (e: IllegalStateException) {
                                    var10001 = false
                                    return@label223
                                  } catch (e: Exception) {
                                    var10001 = false
                                    return@label241
                                  }
                                } // goto@label238
                                try {
                                  audioTrack.stop()
                                  log("MyPlayerMorse.doInBackground onPeriodicNotification i>=nElements instance=$inst")
                                  mDoneLatch.countDown()
                                  return@onPeriodicNotification
                                } catch (e: IllegalStateException) {
                                  var10001 = false
                                  return@label223
                                } catch (e: Exception) {
                                  var10001 = false
                                  return@label241
                                }
                              } // goto@label230
                              try {
                                var3 = mList[var3]
                              } catch (e: IllegalStateException) {
                                var10001 = false
                                return@label223
                              } catch (e: Exception) {
                                var10001 = false
                                return@label241
                              }
                              if (var3 == -7) {
                                run label239@{
                                  try {
                                    log("MyPlayerMorse.doInBackground onPeriodicNotification STOP detected at $var2x...  Muting... instance=$inst")
                                    if (VERSION.SDK_INT >= 21) {
                                      audioTrack.setVolume(0.0f)
                                      return@label239
                                    }
                                  } catch (e: IllegalStateException) {
                                    var10001 = false
                                    return@label223
                                  } catch (e: Exception) {
                                    var10001 = false
                                    return@label241
                                  }
                                  try {
                                    audioTrack.setStereoVolume(0.0f, 0.0f)
                                  } catch (e: IllegalStateException) {
                                    var10001 = false
                                    return@label223
                                  } catch (e: Exception) {
                                    var10001 = false
                                    return@label241
                                  }
                                } // goto@label239
                              }
                              val timings: LongArray
                              try {
                                App.broadcastSetPos(tmpContext, var2x)
                                if (!vibrate || vibrator == null) {
                                  return@onPeriodicNotification
                                }
                                timings = longArrayOf(0L, 0L, 0L)
                              } catch (e: IllegalStateException) {
                                var10001 = false
                                return@label223
                              } catch (e: Exception) {
                                var10001 = false
                                return@label241
                              }
                              if (var3 == -1) {
                                return@onPeriodicNotification
                              }
                              var vibrator1: Vibrator?
                              run label172@{
                                var myPlayerMorse: MyPlayerMorse
                                when (var3) {
                                  1 -> run lwhen@{
                                    timings[0] = 0L
                                    try {
                                      timings[1] = mdur.toLong()
                                      timings[2] = mdur.toLong()
                                      if (VERSION.SDK_INT >= 26) {
                                        vibrator1 = vibrator
                                        return@label172
                                      }
                                    } catch (e: IllegalStateException) {
                                      var10001 = false
                                      return@label223
                                    } catch (e: Exception) {
                                      var10001 = false
                                      return@label241
                                    }
                                    try {
                                      myPlayerMorse = this@MyPlayerMorse
                                      //return@lwhen
                                    } catch (e: IllegalStateException) {
                                      var10001 = false
                                      return@label223
                                    } catch (e: Exception) {
                                      var10001 = false
                                      return@label241
                                    }
                                    timings[0] = 0L
                                    try {
                                      timings[1] = (mdur * 3).toLong()
                                      timings[2] = mdur.toLong()
                                      if (VERSION.SDK_INT >= 26) {
                                        vibrator1 = vibrator
                                        return@label172
                                      }
                                    } catch (e: IllegalStateException) {
                                      var10001 = false
                                      return@label223
                                    } catch (e: Exception) {
                                      var10001 = false
                                      return@label241
                                    }
                                    try {
                                      myPlayerMorse = this@MyPlayerMorse
                                      //return@lwhen
                                    } catch (e: IllegalStateException) {
                                      var10001 = false
                                      return@label223
                                    } catch (e: Exception) {
                                      var10001 = false
                                      return@label241
                                    }
                                    timings[0] = 0L
                                    timings[1] = 0L
                                    try {
                                      timings[2] = mdur.toLong()
                                      return@onPeriodicNotification
                                    } catch (e: IllegalStateException) {
                                      var10001 = false
                                      return@label223
                                    } catch (e: Exception) {
                                      var10001 = false
                                      return@label241
                                    }
                                  }

                                  2 -> run lwhen@{
                                    timings[0] = 0L
                                    try {
                                      timings[1] = (mdur * 3).toLong()
                                      timings[2] = mdur.toLong()
                                      if (VERSION.SDK_INT >= 26) {
                                        vibrator1 = vibrator
                                        return@label172
                                      }
                                    } catch (e: IllegalStateException) {
                                      var10001 = false
                                      return@label223
                                    } catch (e: Exception) {
                                      var10001 = false
                                      return@label241
                                    }
                                    try {
                                      myPlayerMorse = this@MyPlayerMorse
                                      //return@lwhen
                                    } catch (e: IllegalStateException) {
                                      var10001 = false
                                      return@label223
                                    } catch (e: Exception) {
                                      var10001 = false
                                      return@label241
                                    }
                                    timings[0] = 0L
                                    timings[1] = 0L
                                    try {
                                      timings[2] = mdur.toLong()
                                      return@onPeriodicNotification
                                    } catch (e: IllegalStateException) {
                                      var10001 = false
                                      return@label223
                                    } catch (e: Exception) {
                                      var10001 = false
                                      return@label241
                                    }
                                  }

                                  else -> {
                                    timings[0] = 0L
                                    timings[1] = 0L
                                    try {
                                      timings[2] = mdur.toLong()
                                      return@onPeriodicNotification
                                    } catch (e: IllegalStateException) {
                                      var10001 = false
                                      return@label223
                                    } catch (e: Exception) {
                                      var10001 = false
                                      return@label241
                                    }
                                  }
                                }
                                try {
                                  myPlayerMorse.vibrator!!.vibrate(timings, -1)
                                  return@onPeriodicNotification
                                } catch (e: IllegalStateException) {
                                  var10001 = false
                                  return@label223
                                } catch (e: Exception) {
                                  var10001 = false
                                  return@label241
                                }
                              } // goto@label172
                              try {
                                if (VERSION.SDK_INT < Build.VERSION_CODES.O) TODO()
                                vibrator1!!.vibrate(
                                  VibrationEffect.createWaveform(timings, -1)
                                )
                                return@onPeriodicNotification
                              } catch (e: IllegalStateException) {
                                var10001 = false
                                return@label223
                              } catch (e: Exception) {
                                var10001 = false
                              }
                            } // goto@label241
                            messageToLog = "MyPlayerMorse.doInBackground onPeriodicNotification->Exception"
                            return@label224
                          } // goto@label223
                          messageToLog = "MyPlayerMorse.doInBackground onPeriodicNotification->IllegalStateException"
                        } // goto@label224
                        log(messageToLog)
                        mDoneLatch.countDown()
                      }
                    }
                  }
                audioTrack1!!.setPlaybackPositionUpdateListener(playbackPositionUpdateListener)
              } catch (e: IllegalStateException) {
                log("MyPlayerMorse.doInBackground AudioTrack.setPlaybackPositionUpdateListener->IllegalStateException")
                mDoneLatch.countDown()
                return null
              } catch (e: Exception) {
                log("MyPlayerMorse.doInBackground AudioTrack.setPlaybackPositionUpdateListener->Exception")
                mDoneLatch.countDown()
                return null
              }
              log("MyPlayerMorse.doInBackground mAudioTrack.write")
              try {
                audioTrack!!.write(tmpTone.mGeneratedSnd, 0, tmpTone.mGeneratedSnd.size)
                null
              } catch (e: Exception) {
                log("MyPlayerMorse.doInBackground ERROR mAudioTrack.write")
                mDoneLatch.countDown()
                null
              }
            }
          }
        }
      }
    } catch (e: Exception) {
      null
    }
  }

  fun getList(): ArrayList<Int> {
    return ArrayList(mList)
  }

  fun playDone(context: Context?) {
    log(context, "MyPlayerMorse.playDone instance=$inst")
    val messageToLog: String
    if (!mPlayInitOK) {
      messageToLog = "MyPlayerMorse.playDone ERROR mPlayInitOK = false"
    } else {
      var var3 = (mdur * nelements + 5000).toLong()
      var var5 = var3
      if (var3 < 1000L) {
        var5 = 1000L
      }
      var3 = var5
      if (var5 > 120000L) {
        var3 = 120000L
      }
      log(
        context,
        String.format(
          Locale.US,
          "MyPlayerMorse.playDone Waiting to finish (max %d msec)",
          var3
        )
      )
      try {
        mDoneLatch.await(var3, TimeUnit.MILLISECONDS)
      } catch (var14: InterruptedException) {
        log(context, "MyPlayerMorse.playDone ERROR ")
      }
      log(context, "MyPlayerMorse.playDone Waiting OK")
      try {
        log(context,"MyPlayerMorse.playDone unregistering broadcast receiver  instance=$inst")
        LocalBroadcastManager.getInstance(context!!).unregisterReceiver(
          broadcastReceiver
        )
      } catch (var13: Exception) {
        var13.printStackTrace()
      }
      log(context,"MyPlayerMorse.playDone broadcasting finish  instance=$inst")
      if (!commandStop) {
        App.broadcastFinish(context)
      }
      log(context,"MyPlayerMorse.playDone deleting audiotrack  instance=$inst")
      if (audioTrack != null) {
        try {
          mute()
          audioTrack!!.stop()
          audioTrack!!.release()
          audioTrack = null
        } catch (var11: IllegalStateException) {
          // empty
        } finally {
          audioTrack = null
        }
      }
      log(context, "MyPlayerMorse.playDone deleting context reference  instance=$inst")
      if (wr_context != null) {
        wr_context?.clear()
        wr_context = null
      }
      messageToLog = "MyPlayerMorse.playDone OUT instance=$inst"
    }
    log(context, messageToLog)
  }

  fun playInit(context: Context,
               pEnableSound: Boolean, pVibrate: Boolean, pPlayPunctuation: Boolean,
               pArepeat1: Int, pArepeat2: Int, var7: Int, var8: Int, pStream: Int,
               pCallFreq: Int, var11: Int, var12: Int, pText: String
  ) {
    var arepeat1 = pArepeat1
    var arepeat2 = pArepeat2
    log(String.format(Locale.US, "MyPlayerMorse.playInit inst=%d arepeat=%d", inst, arepeat2))
    mEnableSound = pEnableSound
    vibrate = pVibrate
    playPunctuation = pPlayPunctuation
    mRepeat1 = arepeat1
    mRepeat2 = arepeat2
    mStream = pStream
    if (mStream !in 1..5) mStream = 3
    pref_call_freq = pCallFreq.coerceIn(100, 20000)
    j = var11.coerceIn(1, 100) // wpm
    k = var12.coerceIn(0, 49) // fwpm
    text = pText
    mPlayInitOK = false
    mdur = (60000 / (var7 * 50)).coerceIn(30, 1200)
    samplerate = AudioTrack.getNativeOutputSampleRate(mStream)
    if (samplerate <= 0) samplerate = 8000
    arepeat2 = 60000 / (var8 * 50)
    arepeat1 = arepeat2
    if (arepeat2 < 30) arepeat1 = 30
    arepeat2 = arepeat1
    if (arepeat1 > 1200) arepeat2 = 1200
    mSpacesAfterChar = arepeat2 * 3 / mdur
    initTimestamp = System.currentTimeMillis()
    log(context, "MyPlayerMorse.playInit text=$text")
    log(context, "MyPlayerMorse.playInit pref_call_freq=$pref_call_freq")
    log(context, "MyPlayerMorse.playInit samplerate=$samplerate")
    log(context, "MyPlayerMorse.playInit mdur=$mdur")
    log(context, "MyPlayerMorse.playInit mSpacesAfterChar=$mSpacesAfterChar")
    log(context, "MyPlayerMorse.playInit Creating sequence")
    seqCreate()
    nelements = mList.size / 2
    bufferSize = samplerate * mdur * nelements / 1000
    log(context, "MyPlayerMorse.playInit nelements $nelements")
    if (vibrate) {
      log(context, "MyPlayerMorse.playInit Initializing vibration")
      vibrator = context.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
    }
    mPlayInitOK = true
    log(context, "MyPlayerMorse.playInit OUT instance=$inst")
  }
}
