package com.diegomalone.morsenotifier.service

import android.content.Context
import android.os.VibrationEffect
import android.os.Vibrator
import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification
import android.widget.Toast
import com.diegomalone.morsenotifier.domain.EncodedChar
import com.diegomalone.morsenotifier.domain.SignalLength
import com.diegomalone.morsenotifier.toMorseCode

class NotificationService : NotificationListenerService() {

    override fun onNotificationPosted(sbn: StatusBarNotification?) {
        super.onNotificationPosted(sbn)

        vibrate(sbn?.notification?.tickerText.toString().toMorseCode())
    }

    private fun vibrate(encodedCharList: List<EncodedChar>?) {
        val v = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator

        encodedCharList?.forEach {
            it.code.forEach {
                if (it == SignalLength.SHORT) {
                    v.vibrate(VibrationEffect.createOneShot(300, VibrationEffect.DEFAULT_AMPLITUDE))
                    Thread.sleep(350)
                } else {
                    v.vibrate(VibrationEffect.createOneShot(100, VibrationEffect.DEFAULT_AMPLITUDE))
                    Thread.sleep(150)
                }
            }
            Thread.sleep(150)
        }

        Toast.makeText(this@NotificationService, "Vibrated", Toast.LENGTH_LONG).show()
    }
}