package com.dof100.morsenotifier

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.media.AudioAttributes
import android.media.AudioFormat
import android.media.AudioTrack
import android.os.AsyncTask
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
  private var c = false
  private var d = false
  private var e = false
  private var f = 0
  private var repeat = 1
  private var mStream = 0
  private var pref_call_freq = 0
  private var j = 0
  private var k = 0
  private var text = ""
  private var m = false
  private var mSpacesAfterChar = 3
  private var mdur = 100
  private var samplerate = 0
  private var nelements = 0
  private var bufferSize = 0
  private var s = 0L
  private var nSamplesDur = 0
  private var commandStop = false
  private var audioTrack: AudioTrack? = null
  private var vibrator: Vibrator? = null
  private val mList: ArrayList<Int> = ArrayList()
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
    wr_context = WeakReference<Context>(context)
    log(context, "MyPlayerMorse constructor instance=$inst")
  }

  private fun unknown1(character: Char, flag: Boolean) {
    var flag = flag
    var character = character
    if (!e) {
      run label619@{
        if (character < '!' || character > '/') {
          character = character
          if (character < ':') {
            return@label619
          }
          character = character
          if (character > '@') {
            return@label619
          }
        }
        character = ' '
      }
    }
    var number: Int
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
                                                                                                                                                          this.unknown2(2, character.code)
                                                                                                                                                          this.unknown2(-1, -1)
                                                                                                                                                          this.unknown2(-1, -1)
                                                                                                                                                          this.unknown2(-2, -1)
                                                                                                                                                          this.unknown2(1, -1)
                                                                                                                                                          return@label661
                                                                                                                                                        }

                                                                                                                                                        '"' -> this.unknown2(1, character.code)

                                                                                                                                                        else -> run label669@ {
                                                                                                                                                          run label665@{
                                                                                                                                                            run label490@{
                                                                                                                                                              when (character) {
                                                                                                                                                                '&' -> {
                                                                                                                                                                  this.unknown2(1, character.code)
                                                                                                                                                                  return@label550
                                                                                                                                                                }

                                                                                                                                                                '\'' -> {
                                                                                                                                                                  this.unknown2(1, character.code)
                                                                                                                                                                  this.unknown2(-2, -1)
                                                                                                                                                                  this.unknown2(2, -1)
                                                                                                                                                                  return@label665
                                                                                                                                                                }

                                                                                                                                                                '(' -> {
                                                                                                                                                                  this.unknown2(2, character.code)
                                                                                                                                                                  this.unknown2(-1, -1)
                                                                                                                                                                  this.unknown2(-1, -1)
                                                                                                                                                                  return@label526
                                                                                                                                                                }

                                                                                                                                                                ')' -> {
                                                                                                                                                                  this.unknown2(2, character.code)
                                                                                                                                                                  this.unknown2(-1, -1)
                                                                                                                                                                  this.unknown2(-1, -1)
                                                                                                                                                                }

                                                                                                                                                                else -> run label484@ {
                                                                                                                                                                  when (character) {
                                                                                                                                                                    '+' -> {
                                                                                                                                                                      this.unknown2(1, character.code)
                                                                                                                                                                      return@label533
                                                                                                                                                                    }

                                                                                                                                                                    ',' -> {
                                                                                                                                                                      this.unknown2(2, character.code)
                                                                                                                                                                      this.unknown2(-1, -1)
                                                                                                                                                                      this.unknown2(-1, -1)
                                                                                                                                                                      this.unknown2(-2, -1)
                                                                                                                                                                      this.unknown2(2, -1)
                                                                                                                                                                      this.unknown2(-1, -1)
                                                                                                                                                                      this.unknown2(-1, -1)
                                                                                                                                                                      return@label534
                                                                                                                                                                    }

                                                                                                                                                                    '-' -> {
                                                                                                                                                                      this.unknown2(2, character.code)
                                                                                                                                                                      this.unknown2(-1, -1)
                                                                                                                                                                      this.unknown2(-1, -1)
                                                                                                                                                                      this.unknown2(-2, -1)
                                                                                                                                                                      this.unknown2(1, -1)
                                                                                                                                                                      return@label562
                                                                                                                                                                    }

                                                                                                                                                                    '.' -> {
                                                                                                                                                                      this.unknown2(1, character.code)
                                                                                                                                                                      this.unknown2(-2, -1)
                                                                                                                                                                      this.unknown2(2, -1)
                                                                                                                                                                      this.unknown2(-1, -1)
                                                                                                                                                                      this.unknown2(-1, -1)
                                                                                                                                                                      this.unknown2(-2, -1)
                                                                                                                                                                      this.unknown2(1, -1)
                                                                                                                                                                      return@label557
                                                                                                                                                                    }

                                                                                                                                                                    '/' -> {
                                                                                                                                                                      this.unknown2(2, character.code)
                                                                                                                                                                      return@label521
                                                                                                                                                                    }

                                                                                                                                                                    '0' -> {
                                                                                                                                                                      this.unknown2(2, character.code)
                                                                                                                                                                      this.unknown2(-1, -1)
                                                                                                                                                                      this.unknown2(-1, -1)
                                                                                                                                                                    }

                                                                                                                                                                    '1' -> this.unknown2(1, character.code)

                                                                                                                                                                    '2' -> {
                                                                                                                                                                      this.unknown2(1, character.code)
                                                                                                                                                                      this.unknown2(-2, -1)
                                                                                                                                                                      this.unknown2(1, -1)
                                                                                                                                                                      return@label659
                                                                                                                                                                    }

                                                                                                                                                                    '3' -> {
                                                                                                                                                                      this.unknown2(1, character.code)
                                                                                                                                                                      return@label534
                                                                                                                                                                    }

                                                                                                                                                                    '4' -> {
                                                                                                                                                                      this.unknown2(1, character.code)
                                                                                                                                                                      return@label562
                                                                                                                                                                    }

                                                                                                                                                                    '5' -> {
                                                                                                                                                                      this.unknown2(1, character.code)
                                                                                                                                                                      return@label571
                                                                                                                                                                    }

                                                                                                                                                                    '6' -> {
                                                                                                                                                                      this.unknown2(2, character.code)
                                                                                                                                                                      this.unknown2(-1, -1)
                                                                                                                                                                      this.unknown2(-1, -1)
                                                                                                                                                                      return@label571
                                                                                                                                                                    }

                                                                                                                                                                    '7' -> {
                                                                                                                                                                      this.unknown2(2, character.code)
                                                                                                                                                                      return@label658
                                                                                                                                                                    }

                                                                                                                                                                    '8' -> {
                                                                                                                                                                      this.unknown2(2, character.code)
                                                                                                                                                                      this.unknown2(-1, -1)
                                                                                                                                                                      this.unknown2(-1, -1)
                                                                                                                                                                      return@label657
                                                                                                                                                                    }

                                                                                                                                                                    '9' -> {
                                                                                                                                                                      this.unknown2(2, character.code)
                                                                                                                                                                      return@label665
                                                                                                                                                                    }

                                                                                                                                                                    ':' -> {
                                                                                                                                                                      this.unknown2(2, character.code)
                                                                                                                                                                      this.unknown2(-1, -1)
                                                                                                                                                                      this.unknown2(-1, -1)
                                                                                                                                                                      this.unknown2(-2, -1)
                                                                                                                                                                      this.unknown2(2, -1)
                                                                                                                                                                      return@label658
                                                                                                                                                                    }

                                                                                                                                                                    ';' -> {
                                                                                                                                                                      this.unknown2(2, character.code)
                                                                                                                                                                      this.unknown2(-1, -1)
                                                                                                                                                                      this.unknown2(-1, -1)
                                                                                                                                                                      this.unknown2(-2, -1)
                                                                                                                                                                      this.unknown2(1, -1)
                                                                                                                                                                      return@label533
                                                                                                                                                                    }

                                                                                                                                                                    else -> when (character) {
                                                                                                                                                                      '?' -> {
                                                                                                                                                                        this.unknown2(1, character.code)
                                                                                                                                                                        this.unknown2(-2, -1)
                                                                                                                                                                        this.unknown2(1, -1)
                                                                                                                                                                        return@label657
                                                                                                                                                                      }

                                                                                                                                                                      '@' -> {
                                                                                                                                                                        this.unknown2(1, character.code)
                                                                                                                                                                        this.unknown2(-2, -1)
                                                                                                                                                                        this.unknown2(2, -1)
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
                                                                                                                                                                          this.unknown2(1, character.code)
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
                                                                                                                                                                          this.unknown2(1, character.code)
                                                                                                                                                                          return@label585
                                                                                                                                                                        }

                                                                                                                                                                        'v' -> {
                                                                                                                                                                          this.unknown2(1, character.code)
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
                                                                                                                                                                            this.unknown2(1, character.code)
                                                                                                                                                                            return@label663
                                                                                                                                                                          }

                                                                                                                                                                          else -> {
                                                                                                                                                                            when (character) {
                                                                                                                                                                              'ð' -> {
                                                                                                                                                                                this.unknown2(1, character.code)
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
                                                                                                                                                                                          this.unknown2(1, character.code)
                                                                                                                                                                                          this.unknown2(-2, -1)
                                                                                                                                                                                          this.unknown2(1, -1)
                                                                                                                                                                                          this.unknown2(-2, -1)
                                                                                                                                                                                          this.unknown2(1, -1)
                                                                                                                                                                                          return@label535
                                                                                                                                                                                        }

                                                                                                                                                                                        '=' -> {
                                                                                                                                                                                          this.unknown2(2, character.code)
                                                                                                                                                                                          this.unknown2(-1, -1)
                                                                                                                                                                                          this.unknown2(-1, -1)
                                                                                                                                                                                          return@label562
                                                                                                                                                                                        }

                                                                                                                                                                                        '_' -> {
                                                                                                                                                                                          this.unknown2(1, character.code)
                                                                                                                                                                                          return@label484
                                                                                                                                                                                        }

                                                                                                                                                                                        '|' -> {
                                                                                                                                                                                          this.unknown2(-2, -1)
                                                                                                                                                                                          flag =
                                                                                                                                                                                            false
                                                                                                                                                                                          return@label598
                                                                                                                                                                                        }

                                                                                                                                                                                        'à' -> {}
                                                                                                                                                                                        'ó', 'ö', 'ø' -> {
                                                                                                                                                                                          this.unknown2(2, character.code)
                                                                                                                                                                                          return@label660
                                                                                                                                                                                        }

                                                                                                                                                                                        'ü', 'ŭ' -> {
                                                                                                                                                                                          this.unknown2(1, character.code)
                                                                                                                                                                                          return@label560
                                                                                                                                                                                        }

                                                                                                                                                                                        'þ' -> {
                                                                                                                                                                                          this.unknown2(1, character.code)
                                                                                                                                                                                          return@label657
                                                                                                                                                                                        }

                                                                                                                                                                                        'ą' -> return@label530
                                                                                                                                                                                        'ć', 'ĉ' -> return@label531
                                                                                                                                                                                        'đ', 'ę' -> return@label532
                                                                                                                                                                                        'ĝ' -> {
                                                                                                                                                                                          this.unknown2(2, character.code)
                                                                                                                                                                                          return@label662
                                                                                                                                                                                        }

                                                                                                                                                                                        'ĥ', 'š' -> {
                                                                                                                                                                                          this.unknown2(2, character.code)
                                                                                                                                                                                          return@label504
                                                                                                                                                                                        }

                                                                                                                                                                                        'ĵ' -> {
                                                                                                                                                                                          this.unknown2(1, character.code)
                                                                                                                                                                                          return@label499
                                                                                                                                                                                        }

                                                                                                                                                                                        'ł' -> return@label503
                                                                                                                                                                                        'ń' -> return@label490
                                                                                                                                                                                        'ś' -> {
                                                                                                                                                                                          this.unknown2(1, character.code)
                                                                                                                                                                                          this.unknown2(-2, -1)
                                                                                                                                                                                          this.unknown2(1, -1)
                                                                                                                                                                                          this.unknown2(-2, -1)
                                                                                                                                                                                          this.unknown2(1, -1)
                                                                                                                                                                                          return@label550
                                                                                                                                                                                        }

                                                                                                                                                                                        'ŝ' -> {
                                                                                                                                                                                          this.unknown2(1, character.code)
                                                                                                                                                                                          return@label566
                                                                                                                                                                                        }

                                                                                                                                                                                        'ź' -> {
                                                                                                                                                                                          this.unknown2(2, character.code)
                                                                                                                                                                                          this.unknown2(-1, -1)
                                                                                                                                                                                          this.unknown2(-1, -1)
                                                                                                                                                                                          return@label669
                                                                                                                                                                                        }

                                                                                                                                                                                        'ż' -> {
                                                                                                                                                                                          this.unknown2(2, character.code)
                                                                                                                                                                                          this.unknown2(-1, -1)
                                                                                                                                                                                          this.unknown2(-1, -1)
                                                                                                                                                                                          return@label535
                                                                                                                                                                                        }

                                                                                                                                                                                        else -> {
                                                                                                                                                                                          this.unknown2(-3, -3)
                                                                                                                                                                                          return@label598
                                                                                                                                                                                        }
                                                                                                                                                                                      }
                                                                                                                                                                                    }
                                                                                                                                                                                  }
                                                                                                                                                                                }
                                                                                                                                                                              }
                                                                                                                                                                            }
                                                                                                                                                                            this.unknown2(1, character.code)
                                                                                                                                                                            return@label663
                                                                                                                                                                          }
                                                                                                                                                                        }
                                                                                                                                                                      }
                                                                                                                                                                    }
                                                                                                                                                                  }
                                                                                                                                                                  this.unknown2(-2, -1)
                                                                                                                                                                  this.unknown2(2, -1)
                                                                                                                                                                  return@label504
                                                                                                                                                                }
                                                                                                                                                              }
                                                                                                                                                              this.unknown2(-2, -1)
                                                                                                                                                              this.unknown2(1, -1)
                                                                                                                                                              return@label663
                                                                                                                                                            }
                                                                                                                                                            this.unknown2(2, character.code)
                                                                                                                                                            this.unknown2(-1, -1)
                                                                                                                                                            this.unknown2(-1, -1)
                                                                                                                                                            return@label661
                                                                                                                                                          }
                                                                                                                                                          this.unknown2(-1, -1)
                                                                                                                                                          this.unknown2(-1, -1)
                                                                                                                                                          return@label499
                                                                                                                                                        }
                                                                                                                                                      }
                                                                                                                                                      this.unknown2(-2, -1)
                                                                                                                                                      this.unknown2(2, -1)
                                                                                                                                                      return@label521
                                                                                                                                                    }
                                                                                                                                                    this.unknown2(2, character.code)
                                                                                                                                                    return@label529
                                                                                                                                                  }
                                                                                                                                                  this.unknown2(-2, -1)
                                                                                                                                                  this.unknown2(2, -1)
                                                                                                                                                  return@label660
                                                                                                                                                }
                                                                                                                                                this.unknown2(2, character.code)
                                                                                                                                                return@label546
                                                                                                                                              }
                                                                                                                                              this.unknown2(-2, -1)
                                                                                                                                              this.unknown2(2, -1)
                                                                                                                                              return@label529
                                                                                                                                            }
                                                                                                                                            this.unknown2(1, character.code)
                                                                                                                                            return@label535
                                                                                                                                          }
                                                                                                                                          this.unknown2(-1, -1)
                                                                                                                                          this.unknown2(-1, -1)
                                                                                                                                          return@label659
                                                                                                                                        }
                                                                                                                                        this.unknown2(-1, -1)
                                                                                                                                        this.unknown2(-1, -1)
                                                                                                                                        return@label533
                                                                                                                                      }
                                                                                                                                      this.unknown2(-2, -1)
                                                                                                                                      this.unknown2(2, -1)
                                                                                                                                      return@label546
                                                                                                                                    }
                                                                                                                                    this.unknown2(-1, -1)
                                                                                                                                    this.unknown2(-1, -1)
                                                                                                                                    return@label566
                                                                                                                                  }
                                                                                                                                  this.unknown2(2, character.code)
                                                                                                                                  return@label567
                                                                                                                                }
                                                                                                                                this.unknown2(1, character.code)
                                                                                                                                return@label551
                                                                                                                              }
                                                                                                                              this.unknown2(-1, -1)
                                                                                                                              this.unknown2(-1, -1)
                                                                                                                              return@label551
                                                                                                                            }
                                                                                                                            this.unknown2(-2, -1)
                                                                                                                            this.unknown2(1, -1)
                                                                                                                            return@label551
                                                                                                                          }
                                                                                                                          this.unknown2(2, character.code)
                                                                                                                          return@label563
                                                                                                                        }
                                                                                                                        this.unknown2(2, character.code)
                                                                                                                        return@label656
                                                                                                                      }
                                                                                                                      this.unknown2(-1, -1)
                                                                                                                      this.unknown2(-1, -1)
                                                                                                                      return@label557
                                                                                                                    }
                                                                                                                    this.unknown2(1, character.code)
                                                                                                                    return@label557
                                                                                                                  }
                                                                                                                  this.unknown2(2, character.code)
                                                                                                                  this.unknown2(-1, -1)
                                                                                                                  this.unknown2(-1, -1)
                                                                                                                  return@label558
                                                                                                                }
                                                                                                                this.unknown2(1, character.code)
                                                                                                                return@label558
                                                                                                              }
                                                                                                              this.unknown2(-2, -1)
                                                                                                              this.unknown2(2, -1)
                                                                                                              return@label559
                                                                                                            }
                                                                                                            this.unknown2(-2, -1)
                                                                                                            this.unknown2(1, -1)
                                                                                                            return@label560
                                                                                                          }
                                                                                                          this.unknown2(-2, -1)
                                                                                                          this.unknown2(2, -1)
                                                                                                          return@label563
                                                                                                        }
                                                                                                        this.unknown2(-2, -1)
                                                                                                        this.unknown2(2, -1)
                                                                                                        return@label567
                                                                                                      }
                                                                                                      this.unknown2(-1, -1)
                                                                                                      this.unknown2(-1, -1)
                                                                                                      return@label550
                                                                                                    }
                                                                                                    this.unknown2(-2, -1)
                                                                                                    this.unknown2(2, -1)
                                                                                                    return@label656
                                                                                                  }
                                                                                                  this.unknown2(-1, -1)
                                                                                                  this.unknown2(-1, -1)
                                                                                                  return@label560
                                                                                                }
                                                                                                this.unknown2(2, character.code)
                                                                                                return@label559
                                                                                              }
                                                                                              this.unknown2(2, character.code)
                                                                                              return@label655
                                                                                            }
                                                                                            this.unknown2(1, character.code)
                                                                                            return@label573
                                                                                          }
                                                                                          this.unknown2(-2, -1)
                                                                                          this.unknown2(2, -1)
                                                                                          return@label569
                                                                                        }
                                                                                        this.unknown2(-2, -1)
                                                                                        this.unknown2(2, -1)
                                                                                        return@label570
                                                                                      }
                                                                                      this.unknown2(1, character.code)
                                                                                      return@label576
                                                                                    }
                                                                                    this.unknown2(-1, -1)
                                                                                    this.unknown2(-1, -1)
                                                                                    return@label573
                                                                                  }
                                                                                  this.unknown2(-2, -1)
                                                                                  this.unknown2(2, -1)
                                                                                  return@label655
                                                                                }
                                                                                this.unknown2(-2, -1)
                                                                                this.unknown2(1, -1)
                                                                                return@label573
                                                                              }
                                                                              this.unknown2(-1, -1)
                                                                              this.unknown2(-1, -1)
                                                                              return@label579
                                                                            }
                                                                            this.unknown2(-2, -1)
                                                                            this.unknown2(1, -1)
                                                                            return@label576
                                                                          }
                                                                          this.unknown2(2, character.code)
                                                                          return@label569
                                                                        }
                                                                        this.unknown2(-2, -1)
                                                                        this.unknown2(1, -1)
                                                                        return@label577
                                                                      }
                                                                      this.unknown2(-1, -1)
                                                                      this.unknown2(-1, -1)
                                                                      return@label577
                                                                    }
                                                                    this.unknown2(1, character.code)
                                                                    return@label579
                                                                  }
                                                                  this.unknown2(2, character.code)
                                                                  return@label570
                                                                }
                                                                this.unknown2(-2, -1)
                                                                this.unknown2(1, -1)
                                                                return@label579
                                                              }
                                                              this.unknown2(-1, -1)
                                                              this.unknown2(-1, -1)
                                                              return@label576
                                                            }
                                                            this.unknown2(2, character.code)
                                                            return@label582
                                                          }
                                                          this.unknown2(-1, -1)
                                                          this.unknown2(-1, -1)
                                                          return@label581
                                                        }
                                                        this.unknown2(-1, -1)
                                                        this.unknown2(-1, -1)
                                                        return@label587
                                                      }
                                                      this.unknown2(-2, -1)
                                                      this.unknown2(1, -1)
                                                      return@label581
                                                    }
                                                    this.unknown2(1, character.code)
                                                    return@label587
                                                  }
                                                  this.unknown2(-2, -1)
                                                  this.unknown2(2, -1)
                                                  return@label588
                                                }
                                                this.unknown2(-1, -1)
                                                this.unknown2(-1, -1)
                                                return@label585
                                              }
                                              this.unknown2(-2, -1)
                                              this.unknown2(2, -1)
                                              return@label582
                                            }
                                            this.unknown2(-2, -1)
                                            this.unknown2(1, -1)
                                            return@label585
                                          }
                                          this.unknown2(2, character.code)
                                          return@label588
                                        }
                                        this.unknown2(-2, -1)
                                        this.unknown2(1, -1)
                                        return@label587
                                      }
                                      this.unknown2(1, character.code)
                                    }
                                    this.unknown2(-2, -1)
                                    this.unknown2(1, -1)
                                    return@label590
                                  }
                                  this.unknown2(-1, -1)
                                  this.unknown2(-1, -1)
                                  return@label591
                                }
                                this.unknown2(2, character.code)
                                return@label593
                              }
                              this.unknown2(1, character.code)
                              return@label591
                            }
                            this.unknown2(-2, -1)
                            this.unknown2(1, -1)
                            return@label591
                          }
                          this.unknown2(1, character.code)
                          return@label590
                        }
                        this.unknown2(-2, -1)
                        this.unknown2(2, -1)
                        return@label593
                      }
                      this.unknown2(-1, -1)
                      this.unknown2(-1, -1)
                      return@label590
                    }
                    this.unknown2(1, character.code)
                    return@label654
                  }
                  this.unknown2(-2, -1)
                  this.unknown2(1, -1)
                  return@label654
                }
                this.unknown2(-2, -1)
                this.unknown2(2, -1)
                return@label594
              }
              this.unknown2(2, character.code)
              return@label594
            }
            this.unknown2(-1, -1)
            this.unknown2(-1, -1)
            return@label654
          }
          this.unknown2(-1, -1)
          this.unknown2(-1, -1)
          return@label598
        }
        this.unknown2(-2, -1)
        this.unknown2(1, -1)
        return@label598
      }
      this.unknown2(1, character.code)
    }
    if (flag) {
      while (number < mSpacesAfterChar) {
        this.unknown2(-3, -3)
        ++number
      }
    }
  }

  private fun unknown2(int1: Int, int2: Int) {
    mList.add(int1)
    mList.add(int2)
  }

  private fun unknown3() {
    if (audioTrack != null) {
      try {
        if (VERSION.SDK_INT >= 21) {
          audioTrack!!.setVolume(0.0f)
          return
        }
        audioTrack!!.setStereoVolume(0.0f, 0.0f)
      } catch (var2: Exception) {
      }
    }
  }

  private fun seqCreate() {
    log("MyPlayerMorse.seqCreate ")
    mList.clear()
    this.unknown2(-6, -3)
    log(String.format(Locale.US, "MyPlayerMorse.seqCreate repeat=%d text=%s", repeat, text))
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
        this.unknown1(var6, var7)
      }
      run label42@{
        iter = var2 + 1
        Dur = mdur * mList.size / 2
        log(String.format(Locale.US,
          "MyPlayerMorse.seqCreate   iter=%d   mList.size=%d   Dur=%d msec",
          iter, mList.size, Dur
        ))
        if (repeat > 0) {
          if (iter < repeat) {
            return@label42
          }
        } else if (Dur <= -repeat * 1000) {
          return@label42
        }
        var1 = true
      }
      var var9 = var1
      if (iter > 100) {
        log("MyPlayerMorse.seqCreate  ERROR niters>100")
        var9 = true
      }
      var1 = var9
      var2 = iter
      if (!var9) {
        this.unknown2(-3, -3)
        this.unknown2(-3, -3)
        this.unknown2(-3, -3)
        this.unknown2(-3, -3)
        this.unknown2(-3, -3)
        this.unknown2(-3, -3)
        this.unknown2(-3, -3)
        this.unknown2(-3, -3)
        this.unknown2(-3, -3)
        this.unknown2(-3, -3)
        this.unknown2(-3, -3)
        this.unknown2(-3, -3)
        this.unknown2(-3, -3)
        this.unknown2(-3, -3)
        this.unknown2(-3, -3)
        var1 = var9
        var2 = iter
      }
    }
    var var8 = StringBuilder()
    var8.append("MyPlayerMorse.seqCreate after message mList.size=")
    var8.append(mList.size)
    var8.append(" Nelements=")
    var8.append(nelements)
    log(var8.toString())
    this.unknown2(-7, -3)
    this.unknown2(-7, -3)
    this.unknown2(-7, -3)
    this.unknown2(-7, -3)
    this.unknown2(-7, -3)
    this.unknown2(-8, -3)
    var8 = StringBuilder()
    var8.append("MyPlayerMorse.seqCreate after mDelayAfter mList.size=")
    var8.append(mList.size)
    log(var8.toString())
  }

  override fun doInBackground(vararg args: Void?): Void? {
    return try {
      var var27: StringBuilder
      return if (wr_context == null) {
        var27 = StringBuilder()
        var27.append("MyMorsePlayer.doInBackground ERROR wr_context=null instance=")
        var27.append(inst)
        log(var27.toString())
        mDoneLatch.countDown()
        null
      } else {
        val tmpContext = wr_context?.get()
        if (tmpContext == null) {
          var27 = StringBuilder()
          var27.append("MyMorsePlayer.doInBackground ERROR tmpContext=null instance=")
          var27.append(inst)
          log(var27.toString())
          mDoneLatch.countDown()
          null
        } else if (nelements <= 0) {
          var27 = StringBuilder()
          var27.append("MyMorsePlayer.doInBackground Exiting...  mNElements=")
          var27.append(nelements)
          log(var27.toString())
          mDoneLatch.countDown()
          null
        } else {
          var27 = StringBuilder()
          var27.append("MyPlayerMorse.doInBackground. Creating tone instance=")
          var27.append(inst)
          log(var27.toString())
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
            }
            log("MyPlayerMorse.doInBackground ERROR Creating tone")
            mDoneLatch.countDown()
            return null
          }
          var var5 = StringBuilder()
          var5.append("MyPlayerMorse.doInBackground registering broadcast receiver instance=")
          var5.append(inst)
          log(var5.toString())
          val var6 = LocalBroadcastManager.getInstance(tmpContext)
          val var30 = IntentFilter()
          var30.addAction("LBR_ACTION_FINISH")
          var6.registerReceiver(broadcastReceiver, var30)
          nSamplesDur = tmpTone.nSamples / nelements
          var5 = StringBuilder()
          var5.append("MyPlayerMorse.doInBackground AudioTrack play nElements=")
          var5.append(nelements)
          log(var5.toString())
          var5 = StringBuilder()
          var5.append("MyPlayerMorse.doInBackground AudioTrack play nSamples=")
          var5.append(tmpTone.nSamples)
          log(var5.toString())
          var5 = StringBuilder()
          var5.append("MyPlayerMorse.doInBackground AudioTrack play nSamplesDur=")
          var5.append(nSamplesDur)
          log(var5.toString())
          val var29: StringBuilder
          if (tmpTone.nSamples <= 0) {
            var29 = StringBuilder()
            var29.append("MyMorsePlayer.doInBackground Exiting...  tmpTone.mNSamples=")
            var29.append(tmpTone.nSamples)
            log(var29.toString())
            mDoneLatch.countDown()
            null
          } else if (tmpTone.mGeneratedSnd.size <= 0) {
            var29 = StringBuilder()
            var29.append("MyMorsePlayer.doInBackground Exiting...  tmpTone.mGeneratedSnd.length=")
            var29.append(tmpTone.mGeneratedSnd.size)
            log(var29.toString())
            mDoneLatch.countDown()
            null
          } else {
            var5 = StringBuilder()
            var5.append("MyPlayerMorse.doInBackground. Creating audiotrack. Buffersize=")
            var5.append(bufferSize)
            log(var5.toString())
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
                }
                log(
                  String.format(
                    Locale.US,
                    "MyPlayerMorse.doInBackground. ERROR Creating audiotrack. Exception mstream=%d sr=%d channels=%d encoding=%d length=%d",
                    mStream, samplerate, 4, 2, tmpTone.mGeneratedSnd.size
                  )
                )
                mDoneLatch.countDown()
                return null
              }
              log(
                String.format(
                  Locale.US,
                  "MyPlayerMorse.doInBackground. ERROR Creating audiotrack. IllegalArgumentException mstream=%d sr=%d channels=%d encoding=%d length=%d",
                  mStream, samplerate, 4, 2, tmpTone.mGeneratedSnd.size
                )
              )
              mDoneLatch.countDown()
              return null
            }
            if (!c) {
              log("MyPlayerMorse doInBackground mEnableSound=false. Muting...")
              unknown3()
            }
            var5 = StringBuilder()
            var5.append("MyPlayerMorse.doInBackground. Audiotrack created. checking mAudioTrack state =")
            var5.append(audioTrack!!.state)
            log(var5.toString())
            bufferSizeInBytes = 0
            while (audioTrack!!.state != 1) {
              nTries = bufferSizeInBytes + 1
              try {
                Thread.sleep(100L)
              } catch (var17: InterruptedException) {
                var17.printStackTrace()
              }
              var5 = StringBuilder()
              var5.append("MyPlayerMorse.doInBackground. Audiotrack created. mAudioTrack.getstate=")
              var5.append(audioTrack!!.state)
              log(var5.toString())
              bufferSizeInBytes = nTries
              if (nTries >= 20) {
                var27 = StringBuilder()
                var27.append("MyPlayerMorse.doInBackground ERROR mAudioTrack.state!=STATE_INITIALIZED after 20 tries. Stopping... instance=")
                var27.append(inst)
                log(var27.toString())
                mDoneLatch.countDown()
                return null
              }
            }
            if (commandStop) {
              var27 = StringBuilder()
              var27.append("MyPlayerMorse.doInBackground commandstop=true... instance=")
              var27.append(inst)
              log(var27.toString())
              mDoneLatch.countDown()
              null
            } else if (mDoneLatch.count != 1L) {
              var27 = StringBuilder()
              var27.append("MyPlayerMorse.doInBackground mDoneLatch.getCount() != 1 instance=")
              var27.append(inst)
              log(var27.toString())
              null
            } else {
              if (f > 0) {
                val var7 = System.currentTimeMillis() - s
                val var9 = f.toLong() - var7
                log(
                  String.format(
                    Locale.US,
                    "MyPlayerMorse.doInBackground Waiting %d-%d=%d msec",
                    f, var7, var9
                  )
                )
                if (var9 > 0L && var9 < 10000L) {
                  try {
                    Thread.sleep(var9)
                  } catch (e: InterruptedException) {
                    var5 = StringBuilder()
                    var5.append("MyPlayerMorse.doInBackground ERROR sleep in delay before instance=")
                    var5.append(inst)
                    log(var5.toString())
                  }
                }
                var5 = StringBuilder()
                var5.append("MyPlayerMorse.doInBackground Waiting finished instance=")
                var5.append(inst)
                log(var5.toString())
              }
              var5 = StringBuilder()
              var5.append("MyPlayerMorse.doInBackground Start Playing instance=")
              var5.append(inst)
              log(var5.toString())
              var5 = StringBuilder()
              var5.append("MyPlayerMorse.doInBackground AudioTrack play nElements=")
              var5.append(nelements)
              log(var5.toString())
              var5 = StringBuilder()
              var5.append("MyPlayerMorse.doInBackground AudioTrack play nSamples=")
              var5.append(tmpTone.nSamples)
              log(var5.toString())
              var5 = StringBuilder()
              var5.append("MyPlayerMorse.doInBackground AudioTrack play nSamplesDur=")
              var5.append(nSamplesDur)
              log(var5.toString())
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
              var5 = StringBuilder()
              var5.append("MyPlayerMorse.doInBackground Setting notifications instance=")
              var5.append(inst)
              log(var5.toString())
              try {
                audioTrack!!.notificationMarkerPosition = tmpTone.nSamples - 1
                audioTrack!!.positionNotificationPeriod = nSamplesDur
                val var34 = audioTrack
                val var37: AudioTrack.OnPlaybackPositionUpdateListener =
                  object : AudioTrack.OnPlaybackPositionUpdateListener {
                    override fun onMarkerReached(audioTrack: AudioTrack) {
                      val var3: StringBuilder
                      if (audioTrack == null) {
                        var3 = StringBuilder()
                        var3.append("MyPlayerMorse.doInBackground onMarkerReached audiotrack=null instance=")
                        var3.append(inst)
                        log(var3.toString())
                      } else {
                        try {
                          audioTrack.stop()
                        } catch (var2x: IllegalStateException) {
                          log("MyPlayerMorse.doInBackground ERROR IllegalStateException")
                        }
                        var3 = StringBuilder()
                        var3.append("MyPlayerMorse.doInBackground onMarkerReached instance=")
                        var3.append(inst)
                        log(var3.toString())
                        mDoneLatch.countDown()
                      }
                    }

                    override fun onPeriodicNotification(audioTrack: AudioTrack) {
                      var var44: StringBuilder
                      if (audioTrack == null) {
                        var44 = StringBuilder()
                        var44.append("MyPlayerMorse.doInBackground onPeriodicNotification audiotrack=null instance=")
                        var44.append(inst)
                        log(var44.toString())
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
                                }
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
                                }
                                try {
                                  audioTrack.stop()
                                  var44 = StringBuilder()
                                  var44.append("MyPlayerMorse.doInBackground onPeriodicNotification i>=nElements instance=")
                                  var44.append(inst)
                                  log(var44.toString())
                                  mDoneLatch.countDown()
                                  return@onPeriodicNotification
                                } catch (var27: IllegalStateException) {
                                  var10001 = false
                                  return@label223
                                } catch (var28: Exception) {
                                  var10001 = false
                                  return@label241
                                }
                              }
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
                                    val var4 = StringBuilder()
                                    var4.append("MyPlayerMorse.doInBackground onPeriodicNotification STOP detected at ")
                                    var4.append(var2x)
                                    var4.append("...  Muting... instance=")
                                    var4.append(inst)
                                    log(var4.toString())
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
                                }
                              }
                              val var45: LongArray
                              try {
                                App.a(tmpContext, var2x)
                                if (!d || vibrator == null) {
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
                              }
                              try {
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
                            }
                            var43 = "MyPlayerMorse.doInBackground onPeriodicNotification->Exception"
                            return@label224
                          }
                          var43 = "MyPlayerMorse.doInBackground onPeriodicNotification->IllegalStateException"
                        }
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
    return mList
  }

  fun playDone(context: Context?) {
    var var2 = StringBuilder()
    var2.append("MyPlayerMorse.playDone instance=")
    var2.append(inst)
    log(context, var2.toString())
    val var15: String
    if (!m) {
      var15 = "MyPlayerMorse.playDone ERROR mPlayInitOK = false"
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
        var2 = StringBuilder()
        var2.append("MyPlayerMorse.playDone unregistering broadcast receiver  instance=")
        var2.append(inst)
        log(context, var2.toString())
        LocalBroadcastManager.getInstance(context!!).unregisterReceiver(
          broadcastReceiver
        )
      } catch (var13: Exception) {
        var13.printStackTrace()
      }
      var2 = StringBuilder()
      var2.append("MyPlayerMorse.playDone broadcasting finish  instance=")
      var2.append(inst)
      log(context, var2.toString())
      if (!commandStop) {
        App.b(context)
      }
      var2 = StringBuilder()
      var2.append("MyPlayerMorse.playDone deleting audiotrack  instance=")
      var2.append(inst)
      log(context, var2.toString())
      if (audioTrack != null) {
        try {
          unknown3()
          audioTrack!!.stop()
          audioTrack!!.release()
          audioTrack = null
        } catch (var11: IllegalStateException) {
        } finally {
          audioTrack = null
        }
      }
      var2 = StringBuilder()
      var2.append("MyPlayerMorse.playDone deleting context reference  instance=")
      var2.append(inst)
      log(context, var2.toString())
      if (wr_context != null) {
        wr_context?.clear()
        wr_context = null
      }
      var2 = StringBuilder()
      var2.append("MyPlayerMorse.playDone OUT instance=")
      var2.append(inst)
      var15 = var2.toString()
    }
    log(context, var15)
  }

  fun playInit(
    context: Context,
    var2: Boolean,
    var3: Boolean,
    var4: Boolean,
    var5: Int,
    var6: Int,
    var7: Int,
    var8: Int,
    var9: Int,
    var10: Int,
    var11: Int,
    var12: Int,
    var13: String
  ) {
    var var5 = var5
    var arepeat = var6
    log(String.format(Locale.US, "MyPlayerMorse.playInit inst=%d arepeat=%d", inst, arepeat))
    c = var2
    d = var3
    e = var4
    f = var5
    repeat = arepeat
    mStream = var9
    if (mStream != 4 && mStream != 3 && mStream != 5 && mStream != 2 && mStream != 1) {
      mStream = 3
    }
    pref_call_freq = var10
    if (pref_call_freq < 100) {
      pref_call_freq = 100
    }
    if (pref_call_freq > 20000) {
      pref_call_freq = 20000
    }
    j = var11
    if (j < 1) {
      j = 1
    }
    if (j > 100) {
      j = 100
    }
    k = var12
    if (k > 49) {
      k = 49
    }
    if (k < 0) {
      k = 0
    }
    text = var13
    m = false
    mdur = '\uea60'.code / (var7 * 50)
    if (mdur < 30) {
      mdur = 30
    }
    if (mdur > 1200) {
      mdur = 1200
    }
    samplerate = AudioTrack.getNativeOutputSampleRate(mStream)
    if (samplerate <= 0) {
      samplerate = 8000
    }
    arepeat = '\uea60'.code / (var8 * 50)
    var5 = arepeat
    if (arepeat < 30) {
      var5 = 30
    }
    arepeat = var5
    if (var5 > 1200) {
      arepeat = 1200
    }
    mSpacesAfterChar = arepeat * 3 / mdur
    s = System.currentTimeMillis()
    var var14 = StringBuilder()
    var14.append("MyPlayerMorse.playInit text=")
    var14.append(text)
    log(context, var14.toString())
    var14 = StringBuilder()
    var14.append("MyPlayerMorse.playInit pref_call_freq=")
    var14.append(pref_call_freq)
    log(context, var14.toString())
    var14 = StringBuilder()
    var14.append("MyPlayerMorse.playInit samplerate=")
    var14.append(samplerate)
    log(context, var14.toString())
    var14 = StringBuilder()
    var14.append("MyPlayerMorse.playInit mdur=")
    var14.append(mdur)
    log(context, var14.toString())
    var14 = StringBuilder()
    var14.append("MyPlayerMorse.playInit mSpacesAfterChar=")
    var14.append(mSpacesAfterChar)
    log(context, var14.toString())
    log(context, "MyPlayerMorse.playInit Creating sequence")
    seqCreate()
    nelements = mList.size / 2
    bufferSize = samplerate * mdur * nelements / 1000
    var14 = StringBuilder()
    var14.append("MyPlayerMorse.playInit nelements ")
    var14.append(nelements)
    log(context, var14.toString())
    if (d) {
      log(context, "MyPlayerMorse.playInit Initializing vibration")
      vibrator = context.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
    }
    m = true
    var14 = StringBuilder()
    var14.append("MyPlayerMorse.playInit OUT instance=")
    var14.append(inst)
    log(context, var14.toString())
  }
}
