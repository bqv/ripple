package com.diegomalone.notification.service

import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification
import com.diegomalone.morsenotifier.actuator.SignalSender
import com.diegomalone.morsenotifier.actuator.ToastActuator

class NotificationService : NotificationListenerService() {

    private val signalSender = SignalSender(listOf(ToastActuator(this)))

    override fun onNotificationPosted(sbn: StatusBarNotification?) {
        super.onNotificationPosted(sbn)

        val title: String? = sbn?.notification?.extras?.getString("android.title")
        val text: String? = sbn?.notification?.extras?.getString("android.text")
        val packageName: String? = sbn?.packageName

        signalSender.sendMessage(title ?: "")
    }
}