package com.diegomalone.morsenotifier.service

import android.content.Context
import android.os.VibrationEffect
import android.os.Vibrator
import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification
import android.widget.Toast
import com.diegomalone.morsenotifier.actuator.domain.EncodedChar
import com.diegomalone.morsenotifier.actuator.domain.SignalType
import com.diegomalone.morsenotifier.extensions.toMorseCode
import timber.log.Timber

class NotificationService : NotificationListenerService() {

    override fun onNotificationPosted(sbn: StatusBarNotification?) {
        super.onNotificationPosted(sbn)

        val title: String? = sbn?.notification?.extras?.getString("android.title")
        val text: String? = sbn?.notification?.extras?.getString("android.text")
        val packageName: String? = sbn?.packageName

        Timber.e("Malone")
        Timber.e(title)
        Timber.i(text)
        Timber.i(packageName)

        vibrate(text?.toMorseCode())
    }

    private fun vibrate(encodedCharList: List<EncodedChar>?) {
        val v = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator

        encodedCharList?.forEach {
            it.code.forEach {
                if (it == SignalType.SHORT) {
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