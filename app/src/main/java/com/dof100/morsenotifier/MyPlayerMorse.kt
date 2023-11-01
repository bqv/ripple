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

  private fun boop(character: Char, flag: Boolean) {
    var pipe = flag
    var character = character
    if (!playPunctuation && ((character in '!'..'/') || (character in ':'..'@'))) {
      character = ' '
    }
    var number: Int
    // its a switch statement
    run label598@{
      run label597@{
        run label654@{
          run label594@{
            run label593@{
              run label592@{
                run label591@{
                  run label590@{
                    run label589@{
                      run label588@{
                        run label587@{
                          run label586@{
                            run label585@{
                              run label584@{
                                run label583@{
                                  run label582@{
                                    run label581@{
                                      run label580@{
                                        run label579@{
                                          run label578@{
                                            run label577@{
                                              run label576@{
                                                run label655@{
                                                  run label573@{
                                                    run label572@{
                                                      run label571@{
                                                        run label570@{
                                                          run label569@{
                                                            run label568@{
                                                              run label567@{
                                                                run label566@{
                                                                  run label565@{
                                                                    run label564@{
                                                                      run label563@{
                                                                        run label562@{
                                                                          run label561@{
                                                                            run label560@{
                                                                              run label559@{
                                                                                run label558@{
                                                                                  run label557@{
                                                                                    run label656@{
                                                                                      run label552@{
                                                                                        run label551@{
                                                                                          run label550@{
                                                                                            run label549@{
                                                                                              run label548@{
                                                                                                run label547@{
                                                                                                  run label546@{
                                                                                                    run label657@{
                                                                                                      run label658@{
                                                                                                        run label659@{
                                                                                                          run label535@{
                                                                                                            run label534@{
                                                                                                              run label533@{
                                                                                                                run label532@{
                                                                                                                  run label531@{
                                                                                                                    run label530@{
                                                                                                                      run label529@{
                                                                                                                        run label528@{
                                                                                                                          run label527@{
                                                                                                                            run label526@{
                                                                                                                              run label660@{
                                                                                                                                run label523@{
                                                                                                                                  run label522@{
                                                                                                                                    run label521@{
                                                                                                                                      run label661@{
                                                                                                                                        run label662@{
                                                                                                                                          run label504@{
                                                                                                                                            run label503@{
                                                                                                                                              run label663@{
                                                                                                                                                run label500@{
                                                                                                                                                  run label499@{
                                                                                                                                                    run label670@{
                                                                                                                                                      number = 0
                                                                                                                                                      when (character) {
                                                                                                                                                        '!' -> {
                                                                                                                                                          this.beep(2, character.code)
                                                                                                                                                          this.beep(-1, -1)
                                                                                                                                                          this.beep(-1, -1)
                                                                                                                                                          this.beep(-2, -1)
                                                                                                                                                          this.beep(1, -1)
                                                                                                                                                          return@label661
                                                                                                                                                        }

                                                                                                                                                        '"' -> this.beep(1, character.code)

                                                                                                                                                        else -> run label669@ {
                                                                                                                                                          run label665@{
                                                                                                                                                            run label490@{
                                                                                                                                                              when (character) {
                                                                                                                                                                '&' -> {
                                                                                                                                                                  this.beep(1, character.code)
                                                                                                                                                                  return@label550
                                                                                                                                                                }

                                                                                                                                                                '\'' -> {
                                                                                                                                                                  this.beep(1, character.code)
                                                                                                                                                                  this.beep(-2, -1)
                                                                                                                                                                  this.beep(2, -1)
                                                                                                                                                                  return@label665
                                                                                                                                                                }

                                                                                                                                                                '(' -> {
                                                                                                                                                                  this.beep(2, character.code)
                                                                                                                                                                  this.beep(-1, -1)
                                                                                                                                                                  this.beep(-1, -1)
                                                                                                                                                                  return@label526
                                                                                                                                                                }

                                                                                                                                                                ')' -> {
                                                                                                                                                                  this.beep(2, character.code)
                                                                                                                                                                  this.beep(-1, -1)
                                                                                                                                                                  this.beep(-1, -1)
                                                                                                                                                                }

                                                                                                                                                                else -> run label484@ {
                                                                                                                                                                  when (character) {
                                                                                                                                                                    '+' -> {
                                                                                                                                                                      this.beep(1, character.code)
                                                                                                                                                                      return@label533
                                                                                                                                                                    }

                                                                                                                                                                    ',' -> {
                                                                                                                                                                      this.beep(2, character.code)
                                                                                                                                                                      this.beep(-1, -1)
                                                                                                                                                                      this.beep(-1, -1)
                                                                                                                                                                      this.beep(-2, -1)
                                                                                                                                                                      this.beep(2, -1)
                                                                                                                                                                      this.beep(-1, -1)
                                                                                                                                                                      this.beep(-1, -1)
                                                                                                                                                                      return@label534
                                                                                                                                                                    }

                                                                                                                                                                    '-' -> {
                                                                                                                                                                      this.beep(2, character.code)
                                                                                                                                                                      this.beep(-1, -1)
                                                                                                                                                                      this.beep(-1, -1)
                                                                                                                                                                      this.beep(-2, -1)
                                                                                                                                                                      this.beep(1, -1)
                                                                                                                                                                      return@label562
                                                                                                                                                                    }

                                                                                                                                                                    '.' -> {
                                                                                                                                                                      this.beep(1, character.code)
                                                                                                                                                                      this.beep(-2, -1)
                                                                                                                                                                      this.beep(2, -1)
                                                                                                                                                                      this.beep(-1, -1)
                                                                                                                                                                      this.beep(-1, -1)
                                                                                                                                                                      this.beep(-2, -1)
                                                                                                                                                                      this.beep(1, -1)
                                                                                                                                                                      return@label557
                                                                                                                                                                    }

                                                                                                                                                                    '/' -> {
                                                                                                                                                                      this.beep(2, character.code)
                                                                                                                                                                      return@label521
                                                                                                                                                                    }

                                                                                                                                                                    '0' -> {
                                                                                                                                                                      this.beep(2, character.code)
                                                                                                                                                                      this.beep(-1, -1)
                                                                                                                                                                      this.beep(-1, -1)
                                                                                                                                                                    }

                                                                                                                                                                    '1' -> this.beep(1, character.code)

                                                                                                                                                                    '2' -> {
                                                                                                                                                                      this.beep(1, character.code)
                                                                                                                                                                      this.beep(-2, -1)
                                                                                                                                                                      this.beep(1, -1)
                                                                                                                                                                      return@label659
                                                                                                                                                                    }

                                                                                                                                                                    '3' -> {
                                                                                                                                                                      this.beep(1, character.code)
                                                                                                                                                                      return@label534
                                                                                                                                                                    }

                                                                                                                                                                    '4' -> {
                                                                                                                                                                      this.beep(1, character.code)
                                                                                                                                                                      return@label562
                                                                                                                                                                    }

                                                                                                                                                                    '5' -> {
                                                                                                                                                                      this.beep(1, character.code)
                                                                                                                                                                      return@label571
                                                                                                                                                                    }

                                                                                                                                                                    '6' -> {
                                                                                                                                                                      this.beep(2, character.code)
                                                                                                                                                                      this.beep(-1, -1)
                                                                                                                                                                      this.beep(-1, -1)
                                                                                                                                                                      return@label571
                                                                                                                                                                    }

                                                                                                                                                                    '7' -> {
                                                                                                                                                                      this.beep(2, character.code)
                                                                                                                                                                      return@label658
                                                                                                                                                                    }

                                                                                                                                                                    '8' -> {
                                                                                                                                                                      this.beep(2, character.code)
                                                                                                                                                                      this.beep(-1, -1)
                                                                                                                                                                      this.beep(-1, -1)
                                                                                                                                                                      return@label657
                                                                                                                                                                    }

                                                                                                                                                                    '9' -> {
                                                                                                                                                                      this.beep(2, character.code)
                                                                                                                                                                      return@label665
                                                                                                                                                                    }

                                                                                                                                                                    ':' -> {
                                                                                                                                                                      this.beep(2, character.code)
                                                                                                                                                                      this.beep(-1, -1)
                                                                                                                                                                      this.beep(-1, -1)
                                                                                                                                                                      this.beep(-2, -1)
                                                                                                                                                                      this.beep(2, -1)
                                                                                                                                                                      return@label658
                                                                                                                                                                    }

                                                                                                                                                                    ';' -> {
                                                                                                                                                                      this.beep(2, character.code)
                                                                                                                                                                      this.beep(-1, -1)
                                                                                                                                                                      this.beep(-1, -1)
                                                                                                                                                                      this.beep(-2, -1)
                                                                                                                                                                      this.beep(1, -1)
                                                                                                                                                                      return@label533
                                                                                                                                                                    }

                                                                                                                                                                    else -> when (character) {
                                                                                                                                                                      '?' -> {
                                                                                                                                                                        this.beep(1, character.code)
                                                                                                                                                                        this.beep(-2, -1)
                                                                                                                                                                        this.beep(1, -1)
                                                                                                                                                                        return@label657
                                                                                                                                                                      }

                                                                                                                                                                      '@' -> {
                                                                                                                                                                        this.beep(1, character.code)
                                                                                                                                                                        this.beep(-2, -1)
                                                                                                                                                                        this.beep(2, -1)
                                                                                                                                                                        return@label662
                                                                                                                                                                      }

                                                                                                                                                                      else -> when (character) {
                                                                                                                                                                        'a' -> return@label584
                                                                                                                                                                        'b' -> return@label561
                                                                                                                                                                        'c' -> return@label547
                                                                                                                                                                        'd' -> return@label578
                                                                                                                                                                        'e' -> return@label597
                                                                                                                                                                        'f' -> return@label564
                                                                                                                                                                        'g' -> return@label565
                                                                                                                                                                        'h' -> return@label580
                                                                                                                                                                        'i' -> return@label589
                                                                                                                                                                        'j' -> {
                                                                                                                                                                          this.beep(1, character.code)
                                                                                                                                                                          return@label659
                                                                                                                                                                        }

                                                                                                                                                                        'k' -> return@label548
                                                                                                                                                                        'l' -> return@label549
                                                                                                                                                                        'm' -> return@label568
                                                                                                                                                                        'n' -> return@label583
                                                                                                                                                                        'o' -> return@label522
                                                                                                                                                                        'p' -> return@label523
                                                                                                                                                                        'q' -> return@label670
                                                                                                                                                                        'r' -> return@label572
                                                                                                                                                                        's' -> return@label586
                                                                                                                                                                        't' -> return@label592
                                                                                                                                                                        'u' -> {
                                                                                                                                                                          this.beep(1, character.code)
                                                                                                                                                                          return@label585
                                                                                                                                                                        }

                                                                                                                                                                        'v' -> {
                                                                                                                                                                          this.beep(1, character.code)
                                                                                                                                                                          return@label577
                                                                                                                                                                        }

                                                                                                                                                                        'w' -> return@label552
                                                                                                                                                                        'x' -> return@label527
                                                                                                                                                                        'y' -> return@label500
                                                                                                                                                                        'z' -> return@label528
                                                                                                                                                                        else -> when (character) {
                                                                                                                                                                          'ä', 'æ' -> return@label530
                                                                                                                                                                          'ç' -> return@label531
                                                                                                                                                                          'è' -> return@label503
                                                                                                                                                                          'é' -> return@label532
                                                                                                                                                                          'å' -> {
                                                                                                                                                                            this.beep(1, character.code)
                                                                                                                                                                            return@label663
                                                                                                                                                                          }

                                                                                                                                                                          else -> {
                                                                                                                                                                            when (character) {
                                                                                                                                                                              'ð' -> {
                                                                                                                                                                                this.beep(1, character.code)
                                                                                                                                                                                return@label526
                                                                                                                                                                              }

                                                                                                                                                                              'ñ' -> return@label490
                                                                                                                                                                              else -> when (character) {
                                                                                                                                                                                'ά' -> return@label584
                                                                                                                                                                                'έ' -> return@label597
                                                                                                                                                                                'ή' -> return@label580
                                                                                                                                                                                'ί' -> return@label589
                                                                                                                                                                                else -> when (character) {
                                                                                                                                                                                  'α' -> return@label584
                                                                                                                                                                                  'β' -> return@label561
                                                                                                                                                                                  'γ' -> return@label565
                                                                                                                                                                                  'δ' -> return@label578
                                                                                                                                                                                  'ε' -> return@label597
                                                                                                                                                                                  'ζ' -> return@label528
                                                                                                                                                                                  'η' -> return@label580
                                                                                                                                                                                  'θ' -> return@label547
                                                                                                                                                                                  'ι' -> return@label589
                                                                                                                                                                                  'κ' -> return@label548
                                                                                                                                                                                  'λ' -> return@label549
                                                                                                                                                                                  'μ' -> return@label568
                                                                                                                                                                                  'ν' -> return@label583
                                                                                                                                                                                  else -> when (character) {
                                                                                                                                                                                    'ο' -> return@label522
                                                                                                                                                                                    'π' -> return@label523
                                                                                                                                                                                    'ρ' -> return@label572
                                                                                                                                                                                    'ς', 'σ' -> return@label586
                                                                                                                                                                                    'τ' -> return@label592
                                                                                                                                                                                    'υ' -> return@label500
                                                                                                                                                                                    'φ' -> return@label564
                                                                                                                                                                                    'χ' -> return@label527
                                                                                                                                                                                    'ψ' -> return@label670
                                                                                                                                                                                    'ω' -> return@label552
                                                                                                                                                                                    else -> when (character) {
                                                                                                                                                                                      'ό' -> return@label522
                                                                                                                                                                                      'ύ' -> return@label500
                                                                                                                                                                                      'ώ' -> return@label552
                                                                                                                                                                                      else -> when (character) {
                                                                                                                                                                                        '$' -> {
                                                                                                                                                                                          this.beep(1, character.code)
                                                                                                                                                                                          this.beep(-2, -1)
                                                                                                                                                                                          this.beep(1, -1)
                                                                                                                                                                                          this.beep(-2, -1)
                                                                                                                                                                                          this.beep(1, -1)
                                                                                                                                                                                          return@label535
                                                                                                                                                                                        }

                                                                                                                                                                                        '=' -> {
                                                                                                                                                                                          this.beep(2, character.code)
                                                                                                                                                                                          this.beep(-1, -1)
                                                                                                                                                                                          this.beep(-1, -1)
                                                                                                                                                                                          return@label562
                                                                                                                                                                                        }

                                                                                                                                                                                        '_' -> {
                                                                                                                                                                                          this.beep(1, character.code)
                                                                                                                                                                                          return@label484
                                                                                                                                                                                        }

                                                                                                                                                                                        '|' -> {
                                                                                                                                                                                          this.beep(-2, -1)
                                                                                                                                                                                          pipe = false
                                                                                                                                                                                          return@label598
                                                                                                                                                                                        }

                                                                                                                                                                                        'à' -> {}
                                                                                                                                                                                        'ó', 'ö', 'ø' -> {
                                                                                                                                                                                          this.beep(2, character.code)
                                                                                                                                                                                          return@label660
                                                                                                                                                                                        }

                                                                                                                                                                                        'ü', 'ŭ' -> {
                                                                                                                                                                                          this.beep(1, character.code)
                                                                                                                                                                                          return@label560
                                                                                                                                                                                        }

                                                                                                                                                                                        'þ' -> {
                                                                                                                                                                                          this.beep(1, character.code)
                                                                                                                                                                                          return@label657
                                                                                                                                                                                        }

                                                                                                                                                                                        'ą' -> return@label530
                                                                                                                                                                                        'ć', 'ĉ' -> return@label531
                                                                                                                                                                                        'đ', 'ę' -> return@label532
                                                                                                                                                                                        'ĝ' -> {
                                                                                                                                                                                          this.beep(2, character.code)
                                                                                                                                                                                          return@label662
                                                                                                                                                                                        }

                                                                                                                                                                                        'ĥ', 'š' -> {
                                                                                                                                                                                          this.beep(2, character.code)
                                                                                                                                                                                          return@label504
                                                                                                                                                                                        }

                                                                                                                                                                                        'ĵ' -> {
                                                                                                                                                                                          this.beep(1, character.code)
                                                                                                                                                                                          return@label499
                                                                                                                                                                                        }

                                                                                                                                                                                        'ł' -> return@label503
                                                                                                                                                                                        'ń' -> return@label490
                                                                                                                                                                                        'ś' -> {
                                                                                                                                                                                          this.beep(1, character.code)
                                                                                                                                                                                          this.beep(-2, -1)
                                                                                                                                                                                          this.beep(1, -1)
                                                                                                                                                                                          this.beep(-2, -1)
                                                                                                                                                                                          this.beep(1, -1)
                                                                                                                                                                                          return@label550
                                                                                                                                                                                        }

                                                                                                                                                                                        'ŝ' -> {
                                                                                                                                                                                          this.beep(1, character.code)
                                                                                                                                                                                          return@label566
                                                                                                                                                                                        }

                                                                                                                                                                                        'ź' -> {
                                                                                                                                                                                          this.beep(2, character.code)
                                                                                                                                                                                          this.beep(-1, -1)
                                                                                                                                                                                          this.beep(-1, -1)
                                                                                                                                                                                          return@label669
                                                                                                                                                                                        }

                                                                                                                                                                                        'ż' -> {
                                                                                                                                                                                          this.beep(2, character.code)
                                                                                                                                                                                          this.beep(-1, -1)
                                                                                                                                                                                          this.beep(-1, -1)
                                                                                                                                                                                          return@label535
                                                                                                                                                                                        }

                                                                                                                                                                                        else -> {
                                                                                                                                                                                          this.beep(-3, -3)
                                                                                                                                                                                          return@label598
                                                                                                                                                                                        }
                                                                                                                                                                                      }
                                                                                                                                                                                    }
                                                                                                                                                                                  }
                                                                                                                                                                                }
                                                                                                                                                                              }
                                                                                                                                                                            }
                                                                                                                                                                            this.beep(1, character.code)
                                                                                                                                                                            return@label663
                                                                                                                                                                          }
                                                                                                                                                                        }
                                                                                                                                                                      }
                                                                                                                                                                    }
                                                                                                                                                                  }
                                                                                                                                                                  this.beep(-2, -1)
                                                                                                                                                                  this.beep(2, -1)
                                                                                                                                                                  return@label504
                                                                                                                                                                } // goto@label484
                                                                                                                                                              }
                                                                                                                                                              this.beep(-2, -1)
                                                                                                                                                              this.beep(1, -1)
                                                                                                                                                              return@label663
                                                                                                                                                            } // goto@label490
                                                                                                                                                            this.beep(2, character.code)
                                                                                                                                                            this.beep(-1, -1)
                                                                                                                                                            this.beep(-1, -1)
                                                                                                                                                            return@label661
                                                                                                                                                          } // goto@label665
                                                                                                                                                          this.beep(-1, -1)
                                                                                                                                                          this.beep(-1, -1)
                                                                                                                                                          return@label499
                                                                                                                                                        } // goto@label669
                                                                                                                                                      }
                                                                                                                                                      this.beep(-2, -1)
                                                                                                                                                      this.beep(2, -1)
                                                                                                                                                      return@label521
                                                                                                                                                    } // goto@label670
                                                                                                                                                    this.beep(2, character.code)
                                                                                                                                                    return@label529
                                                                                                                                                  } // goto@label499
                                                                                                                                                  this.beep(-2, -1)
                                                                                                                                                  this.beep(2, -1)
                                                                                                                                                  return@label660
                                                                                                                                                } // goto@label500
                                                                                                                                                this.beep(2, character.code)
                                                                                                                                                return@label546
                                                                                                                                              } // goto@label663
                                                                                                                                              this.beep(-2, -1)
                                                                                                                                              this.beep(2, -1)
                                                                                                                                              return@label529
                                                                                                                                            } // goto@label503
                                                                                                                                            this.beep(1, character.code)
                                                                                                                                            return@label535
                                                                                                                                          } // goto@label504
                                                                                                                                          this.beep(-1, -1)
                                                                                                                                          this.beep(-1, -1)
                                                                                                                                          return@label659
                                                                                                                                        } // goto@label662
                                                                                                                                        this.beep(-1, -1)
                                                                                                                                        this.beep(-1, -1)
                                                                                                                                        return@label533
                                                                                                                                      } // goto@label661
                                                                                                                                      this.beep(-2, -1)
                                                                                                                                      this.beep(2, -1)
                                                                                                                                      return@label546
                                                                                                                                    } // goto@label521
                                                                                                                                    this.beep(-1, -1)
                                                                                                                                    this.beep(-1, -1)
                                                                                                                                    return@label566
                                                                                                                                  } // goto@label522
                                                                                                                                  this.beep(2, character.code)
                                                                                                                                  return@label567
                                                                                                                                } // goto@label523
                                                                                                                                this.beep(1, character.code)
                                                                                                                                return@label551
                                                                                                                              } // goto@label660
                                                                                                                              this.beep(-1, -1)
                                                                                                                              this.beep(-1, -1)
                                                                                                                              return@label551
                                                                                                                            } // goto@label526
                                                                                                                            this.beep(-2, -1)
                                                                                                                            this.beep(1, -1)
                                                                                                                            return@label551
                                                                                                                          } // goto@label527
                                                                                                                          this.beep(2, character.code)
                                                                                                                          return@label563
                                                                                                                        } // goto@label528
                                                                                                                        this.beep(2, character.code)
                                                                                                                        return@label656
                                                                                                                      } // goto@label529
                                                                                                                      this.beep(-1, -1)
                                                                                                                      this.beep(-1, -1)
                                                                                                                      return@label557
                                                                                                                    } // goto@label530
                                                                                                                    this.beep(1, character.code)
                                                                                                                    return@label557
                                                                                                                  } // goto@label531
                                                                                                                  this.beep(2, character.code)
                                                                                                                  this.beep(-1, -1)
                                                                                                                  this.beep(-1, -1)
                                                                                                                  return@label558
                                                                                                                } // goto@label532
                                                                                                                this.beep(1, character.code)
                                                                                                                return@label558
                                                                                                              } // goto@label533
                                                                                                              this.beep(-2, -1)
                                                                                                              this.beep(2, -1)
                                                                                                              return@label559
                                                                                                            } // goto@label534
                                                                                                            this.beep(-2, -1)
                                                                                                            this.beep(1, -1)
                                                                                                            return@label560
                                                                                                          } // goto@label535
                                                                                                          this.beep(-2, -1)
                                                                                                          this.beep(2, -1)
                                                                                                          return@label563
                                                                                                        } // goto@label659
                                                                                                        this.beep(-2, -1)
                                                                                                        this.beep(2, -1)
                                                                                                        return@label567
                                                                                                      } // goto@label658
                                                                                                      this.beep(-1, -1)
                                                                                                      this.beep(-1, -1)
                                                                                                      return@label550
                                                                                                    } // goto@label657
                                                                                                    this.beep(-2, -1)
                                                                                                    this.beep(2, -1)
                                                                                                    return@label656
                                                                                                  } // goto@label546
                                                                                                  this.beep(-1, -1)
                                                                                                  this.beep(-1, -1)
                                                                                                  return@label560
                                                                                                } // goto@label547
                                                                                                this.beep(2, character.code)
                                                                                                return@label559
                                                                                              } // goto@label548
                                                                                              this.beep(2, character.code)
                                                                                              return@label655
                                                                                            } // goto@label549
                                                                                            this.beep(1, character.code)
                                                                                            return@label573
                                                                                          } // goto@label550
                                                                                          this.beep(-2, -1)
                                                                                          this.beep(2, -1)
                                                                                          return@label569
                                                                                        } // goto@label551
                                                                                        this.beep(-2, -1)
                                                                                        this.beep(2, -1)
                                                                                        return@label570
                                                                                      } // goto@label552
                                                                                      this.beep(1, character.code)
                                                                                      return@label576
                                                                                    } // goto@label656
                                                                                    this.beep(-1, -1)
                                                                                    this.beep(-1, -1)
                                                                                    return@label573
                                                                                  } // goto@label557
                                                                                  this.beep(-2, -1)
                                                                                  this.beep(2, -1)
                                                                                  return@label655
                                                                                } // goto@label558
                                                                                this.beep(-2, -1)
                                                                                this.beep(1, -1)
                                                                                return@label573
                                                                              } // goto@label559
                                                                              this.beep(-1, -1)
                                                                              this.beep(-1, -1)
                                                                              return@label579
                                                                            } // goto@label560
                                                                            this.beep(-2, -1)
                                                                            this.beep(1, -1)
                                                                            return@label576
                                                                          } // goto@label561
                                                                          this.beep(2, character.code)
                                                                          return@label569
                                                                        } // goto@label562
                                                                        this.beep(-2, -1)
                                                                        this.beep(1, -1)
                                                                        return@label577
                                                                      } // goto@label563
                                                                      this.beep(-1, -1)
                                                                      this.beep(-1, -1)
                                                                      return@label577
                                                                    } // goto@label564
                                                                    this.beep(1, character.code)
                                                                    return@label579
                                                                  } // goto@label565
                                                                  this.beep(2, character.code)
                                                                  return@label570
                                                                } // goto@label566
                                                                this.beep(-2, -1)
                                                                this.beep(1, -1)
                                                                return@label579
                                                              } // goto@label567
                                                              this.beep(-1, -1)
                                                              this.beep(-1, -1)
                                                              return@label576
                                                            } // goto@label568
                                                            this.beep(2, character.code)
                                                            return@label582
                                                          } // goto@label569
                                                          this.beep(-1, -1)
                                                          this.beep(-1, -1)
                                                          return@label581
                                                        } // goto@label570
                                                        this.beep(-1, -1)
                                                        this.beep(-1, -1)
                                                        return@label587
                                                      } // goto@label571
                                                      this.beep(-2, -1)
                                                      this.beep(1, -1)
                                                      return@label581
                                                    } // goto@label572
                                                    this.beep(1, character.code)
                                                    return@label587
                                                  } // goto@label573
                                                  this.beep(-2, -1)
                                                  this.beep(2, -1)
                                                  return@label588
                                                } // goto@label655
                                                this.beep(-1, -1)
                                                this.beep(-1, -1)
                                                return@label585
                                              } // goto@label576
                                              this.beep(-2, -1)
                                              this.beep(2, -1)
                                              return@label582
                                            } // goto@label577
                                            this.beep(-2, -1)
                                            this.beep(1, -1)
                                            return@label585
                                          } // goto@label578
                                          this.beep(2, character.code)
                                          return@label588
                                        } // goto@label579
                                        this.beep(-2, -1)
                                        this.beep(1, -1)
                                        return@label587
                                      } // goto@label580
                                      this.beep(1, character.code)
                                    } // goto@label581
                                    this.beep(-2, -1)
                                    this.beep(1, -1)
                                    return@label590
                                  } // goto@label582
                                  this.beep(-1, -1)
                                  this.beep(-1, -1)
                                  return@label591
                                } // goto@label583
                                this.beep(2, character.code)
                                return@label593
                              } // goto@label584
                              this.beep(1, character.code)
                              return@label591
                            } // goto@label585
                            this.beep(-2, -1)
                            this.beep(1, -1)
                            return@label591
                          } // goto@label586
                          this.beep(1, character.code)
                          return@label590
                        } // goto@label587
                        this.beep(-2, -1)
                        this.beep(2, -1)
                        return@label593
                      } // goto@label588
                      this.beep(-1, -1)
                      this.beep(-1, -1)
                      return@label590
                    } // goto@label589
                    this.beep(1, character.code)
                    return@label654
                  } // goto@label590
                  this.beep(-2, -1)
                  this.beep(1, -1)
                  return@label654
                } // goto@label591
                this.beep(-2, -1)
                this.beep(2, -1)
                return@label594
              } // goto@label592
              this.beep(2, character.code)
              return@label594
            } // goto@label593
            this.beep(-1, -1)
            this.beep(-1, -1)
            return@label654
          } // goto@label594
          this.beep(-1, -1)
          this.beep(-1, -1)
          return@label598
        } // goto@label654
        this.beep(-2, -1)
        this.beep(1, -1)
        return@label598
      } // goto@label597
      this.beep(1, character.code)
    } // goto@label598
    if (pipe) {
      while (number++ < mSpacesAfterChar) {
        this.beep(-3, -3)
      }
    }
  }

  private fun beep(int1: Int, int2: Int) {
    mList.add(int1)
    mList.add(int2)
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
    this.beep(-6, -3)
    log(String.format(Locale.US, "MyPlayerMorse.seqCreate repeat=%d text=%s", mRepeat2, text))
    var var1 = false
    var var2 = 0
    while (!var1) {
      val var3 = text.lowercase()
      var iter = var3.length
      var Dur: Int
      var var6: Char
      var var7: Boolean
      Dur = 0
      while (Dur < iter) {
        var6 = var3[Dur]
        ++Dur
        var7 = !(Dur >= iter || var3[Dur] != '|')
        this.boop(var6, var7)
      }
      run {
        iter = var2 + 1
        Dur = mdur * mList.size / 2
        log(String.format(Locale.US,
          "MyPlayerMorse.seqCreate   iter=%d   mList.size=%d   Dur=%d msec",
          iter, mList.size, Dur
        ))
        if (mRepeat2 > 0) {
          if (iter < mRepeat2) {
            //pass
          } else {
            var1 = true
          }
        } else if (Dur <= -mRepeat2 * 1000) {
          //pass
        } else {
          var1 = true
        }
      }
      var var9 = var1
      if (iter > 100) {
        log("MyPlayerMorse.seqCreate  ERROR niters>100")
        var9 = true
      }
      var1 = var9
      var2 = iter
      if (!var9) {
        this.beep(-3, -3)
        this.beep(-3, -3)
        this.beep(-3, -3)
        this.beep(-3, -3)
        this.beep(-3, -3)
        this.beep(-3, -3)
        this.beep(-3, -3)
        this.beep(-3, -3)
        this.beep(-3, -3)
        this.beep(-3, -3)
        this.beep(-3, -3)
        this.beep(-3, -3)
        this.beep(-3, -3)
        this.beep(-3, -3)
        this.beep(-3, -3)
        var1 = var9
        var2 = iter
      }
    }
    log("MyPlayerMorse.seqCreate after message mList.size=${mList.size} Nelements=$nelements")
    this.beep(-7, -3)
    this.beep(-7, -3)
    this.beep(-7, -3)
    this.beep(-7, -3)
    this.beep(-7, -3)
    this.beep(-8, -3)
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
          var var10001: Boolean
          var tmpTone: MyTone
          run label161@{
            run label170@{
              try {
                tmpTone = MyTone(nelements * mdur, samplerate)
              } catch (var26: Exception) {
                var10001 = false
                return@label170
              }
              bufferSizeInBytes = 0
              while (true) {
                try {
                  if (bufferSizeInBytes >= nelements) {
                    return@label161
                  }
                  nTries = mList[bufferSizeInBytes * 2]
                } catch (var25: Exception) {
                  var10001 = false
                  break
                }
                if (nTries == 1) {
                  try {
                    tmpTone.a(
                      bufferSizeInBytes * mdur,
                      mdur,
                      pref_call_freq.toFloat(),
                      j.toFloat(),
                      (k * mdur).toFloat() / 100.0f
                    )
                  } catch (var24: Exception) {
                    var10001 = false
                    break
                  }
                } else if (nTries == 2) {
                  try {
                    tmpTone.a(
                      bufferSizeInBytes * mdur,
                      mdur * 3,
                      pref_call_freq.toFloat(),
                      j.toFloat(),
                      (k * mdur).toFloat() / 100.0f
                    )
                  } catch (var23: Exception) {
                    var10001 = false
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
          val var6 = LocalBroadcastManager.getInstance(tmpContext)
          val var30 = IntentFilter()
          var30.addAction("LBR_ACTION_FINISH")
          var6.registerReceiver(broadcastReceiver, var30)
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
            } catch (var18: Exception) {
              log("MyPlayerMorse.doInBackground. ERROR getMinBufferSize")
              samplerate * 4
            }
            run label139@{
              run label138@{
                run label137@{
                  try {
                    if (VERSION.SDK_INT >= 26) {
                      val var35 = AudioTrack.Builder()
                      val var31 = AudioAttributes.Builder()
                      val var32 = var35.setAudioAttributes(
                        var31.setLegacyStreamType(
                          mStream
                        ).build()
                      )
                      val var36 = AudioFormat.Builder()
                      audioTrack = var32.setAudioFormat(
                        var36.setEncoding(AudioFormat.ENCODING_PCM_16BIT)
                          .setSampleRate(
                            samplerate
                          ).setChannelMask(4).build()
                      ).setBufferSizeInBytes(bufferSizeInBytes).setTransferMode(AudioTrack.MODE_STREAM).build()
                      return@label139
                    }
                  } catch (var21: IllegalArgumentException) {
                    var10001 = false
                    return@label138
                  } catch (var22: Exception) {
                    var10001 = false
                    return@label137
                  }
                  try {
                    val var33 = AudioTrack(mStream, samplerate, 4, 2, bufferSizeInBytes, 1)
                    audioTrack = var33
                    return@label139
                  } catch (var19: IllegalArgumentException) {
                    var10001 = false
                    return@label138
                  } catch (var20: Exception) {
                    var10001 = false
                  }
                } // goto@label137
                log(
                  String.format(
                    Locale.US,
                    "MyPlayerMorse.doInBackground. ERROR Creating audiotrack. Exception mstream=%d sr=%d channels=%d encoding=%d length=%d",
                    mStream, samplerate, 4, 2, tmpTone.mGeneratedSnd.size
                  )
                )
                mDoneLatch.countDown()
                return null
              } // goto@label138
              log(
                String.format(
                  Locale.US,
                  "MyPlayerMorse.doInBackground. ERROR Creating audiotrack. IllegalArgumentException mstream=%d sr=%d channels=%d encoding=%d length=%d",
                  mStream, samplerate, 4, 2, tmpTone.mGeneratedSnd.size
                )
              )
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
                log(
                  String.format(
                    Locale.US,
                    "MyPlayerMorse.doInBackground Waiting %d-%d=%d msec",
                    mRepeat1, var7, var9
                  )
                )
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
                val var34 = audioTrack
                val var37: AudioTrack.OnPlaybackPositionUpdateListener =
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
                        var var43: String
                        run label224@{
                          run label223@{
                            run label241@{
                              var var10001: Boolean
                              try {
                                if (audioTrack.state != 1) {
                                  return@onPeriodicNotification
                                }
                              } catch (var39: IllegalStateException) {
                                var10001 = false
                                return@label223
                              } catch (var40: Exception) {
                                var10001 = false
                                return@label241
                              }
                              try {
                                if (audioTrack.playState != 3) {
                                  return@onPeriodicNotification
                                }
                              } catch (var37: IllegalStateException) {
                                var10001 = false
                                return@label223
                              } catch (var38: Exception) {
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
                                  } catch (var35: IllegalStateException) {
                                    var10001 = false
                                    return@label223
                                  } catch (var36: Exception) {
                                    var10001 = false
                                    return@label241
                                  }
                                  var3 = var2x * 2
                                  try {
                                    if (var3 < mList.size) {
                                      return@label230
                                    }
                                  } catch (var33: IllegalStateException) {
                                    var10001 = false
                                    return@label223
                                  } catch (var34: Exception) {
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
                                  } catch (var31: IllegalStateException) {
                                    var10001 = false
                                    return@label223
                                  } catch (var32: Exception) {
                                    var10001 = false
                                    return@label241
                                  }
                                  try {
                                    audioTrack.setStereoVolume(0.0f, 0.0f)
                                  } catch (var29: IllegalStateException) {
                                    var10001 = false
                                    return@label223
                                  } catch (var30: Exception) {
                                    var10001 = false
                                    return@label241
                                  }
                                } // goto@label238
                                try {
                                  audioTrack.stop()
                                  log("MyPlayerMorse.doInBackground onPeriodicNotification i>=nElements instance=$inst")
                                  mDoneLatch.countDown()
                                  return@onPeriodicNotification
                                } catch (var27: IllegalStateException) {
                                  var10001 = false
                                  return@label223
                                } catch (var28: Exception) {
                                  var10001 = false
                                  return@label241
                                }
                              } // goto@label230
                              try {
                                var3 = mList[var3]
                              } catch (var25: IllegalStateException) {
                                var10001 = false
                                return@label223
                              } catch (var26: Exception) {
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
                                  } catch (var23: IllegalStateException) {
                                    var10001 = false
                                    return@label223
                                  } catch (var24: Exception) {
                                    var10001 = false
                                    return@label241
                                  }
                                  try {
                                    audioTrack.setStereoVolume(0.0f, 0.0f)
                                  } catch (var21: IllegalStateException) {
                                    var10001 = false
                                    return@label223
                                  } catch (var22: Exception) {
                                    var10001 = false
                                    return@label241
                                  }
                                } // goto@label239
                              }
                              val var45: LongArray
                              try {
                                App.a(tmpContext, var2x)
                                if (!vibrate || vibrator == null) {
                                  return@onPeriodicNotification
                                }
                                var45 = longArrayOf(0L, 0L, 0L)
                              } catch (var19: IllegalStateException) {
                                var10001 = false
                                return@label223
                              } catch (var20: Exception) {
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
                                    var45[0] = 0L
                                    try {
                                      var45[1] = mdur.toLong()
                                      var45[2] = mdur.toLong()
                                      if (VERSION.SDK_INT >= 26) {
                                        vibrator1 = vibrator
                                        return@label172
                                      }
                                    } catch (var17: IllegalStateException) {
                                      var10001 = false
                                      return@label223
                                    } catch (var18: Exception) {
                                      var10001 = false
                                      return@label241
                                    }
                                    try {
                                      myPlayerMorse = this@MyPlayerMorse
                                      return@lwhen
                                    } catch (var11: IllegalStateException) {
                                      var10001 = false
                                      return@label223
                                    } catch (var12: Exception) {
                                      var10001 = false
                                      return@label241
                                    }
                                    var45[0] = 0L
                                    try {
                                      var45[1] = (mdur * 3).toLong()
                                      var45[2] = mdur.toLong()
                                      if (VERSION.SDK_INT >= 26) {
                                        vibrator1 = vibrator
                                        return@label172
                                      }
                                    } catch (var15: IllegalStateException) {
                                      var10001 = false
                                      return@label223
                                    } catch (var16: Exception) {
                                      var10001 = false
                                      return@label241
                                    }
                                    try {
                                      myPlayerMorse = this@MyPlayerMorse
                                      return@lwhen
                                    } catch (var13: IllegalStateException) {
                                      var10001 = false
                                      return@label223
                                    } catch (var14: Exception) {
                                      var10001 = false
                                      return@label241
                                    }
                                    var45[0] = 0L
                                    var45[1] = 0L
                                    try {
                                      var45[2] = mdur.toLong()
                                      return@onPeriodicNotification
                                    } catch (var9: IllegalStateException) {
                                      var10001 = false
                                      return@label223
                                    } catch (var10: Exception) {
                                      var10001 = false
                                      return@label241
                                    }
                                  }

                                  2 -> run lwhen@{
                                    var45[0] = 0L
                                    try {
                                      var45[1] = (mdur * 3).toLong()
                                      var45[2] = mdur.toLong()
                                      if (VERSION.SDK_INT >= 26) {
                                        vibrator1 = vibrator
                                        return@label172
                                      }
                                    } catch (var15: IllegalStateException) {
                                      var10001 = false
                                      return@label223
                                    } catch (var16: Exception) {
                                      var10001 = false
                                      return@label241
                                    }
                                    try {
                                      myPlayerMorse = this@MyPlayerMorse
                                      return@lwhen
                                    } catch (var13: IllegalStateException) {
                                      var10001 = false
                                      return@label223
                                    } catch (var14: Exception) {
                                      var10001 = false
                                      return@label241
                                    }
                                    var45[0] = 0L
                                    var45[1] = 0L
                                    try {
                                      var45[2] = mdur.toLong()
                                      return@onPeriodicNotification
                                    } catch (var9: IllegalStateException) {
                                      var10001 = false
                                      return@label223
                                    } catch (var10: Exception) {
                                      var10001 = false
                                      return@label241
                                    }
                                  }

                                  else -> {
                                    var45[0] = 0L
                                    var45[1] = 0L
                                    try {
                                      var45[2] = mdur.toLong()
                                      return@onPeriodicNotification
                                    } catch (var9: IllegalStateException) {
                                      var10001 = false
                                      return@label223
                                    } catch (var10: Exception) {
                                      var10001 = false
                                      return@label241
                                    }
                                  }
                                }
                                try {
                                  myPlayerMorse.vibrator!!.vibrate(var45, -1)
                                  return@onPeriodicNotification
                                } catch (var7: IllegalStateException) {
                                  var10001 = false
                                  return@label223
                                } catch (var8: Exception) {
                                  var10001 = false
                                  return@label241
                                }
                              } // goto@label172
                              try {
                                if (VERSION.SDK_INT < Build.VERSION_CODES.O) TODO()
                                vibrator1!!.vibrate(
                                  VibrationEffect.createWaveform(
                                    var45,
                                    -1
                                  )
                                )
                                return@onPeriodicNotification
                              } catch (var5: IllegalStateException) {
                                var10001 = false
                                return@label223
                              } catch (var6: Exception) {
                                var10001 = false
                              }
                            } // goto@label241
                            var43 = "MyPlayerMorse.doInBackground onPeriodicNotification->Exception"
                            return@label224
                          } // goto@label223
                          var43 = "MyPlayerMorse.doInBackground onPeriodicNotification->IllegalStateException"
                        } // goto@label224
                        log(var43)
                        mDoneLatch.countDown()
                      }
                    }
                  }
                var34!!.setPlaybackPositionUpdateListener(var37)
              } catch (var12: IllegalStateException) {
                log("MyPlayerMorse.doInBackground AudioTrack.setPlaybackPositionUpdateListener->IllegalStateException")
                mDoneLatch.countDown()
                return null
              } catch (var13: Exception) {
                log("MyPlayerMorse.doInBackground AudioTrack.setPlaybackPositionUpdateListener->Exception")
                mDoneLatch.countDown()
                return null
              }
              log("MyPlayerMorse.doInBackground mAudioTrack.write")
              try {
                audioTrack!!.write(tmpTone.mGeneratedSnd, 0, tmpTone.mGeneratedSnd.size)
                null
              } catch (var11: Exception) {
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
        App.b(context)
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
