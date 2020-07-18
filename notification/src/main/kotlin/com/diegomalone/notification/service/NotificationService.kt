package com.diegomalone.notification.service

import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification
import android.widget.Toast

class NotificationService : NotificationListenerService() {

    override fun onNotificationPosted(sbn: StatusBarNotification?) {
        super.onNotificationPosted(sbn)

        val title: String? = sbn?.notification?.extras?.getString("android.title")
        val text: String? = sbn?.notification?.extras?.getString("android.text")
        val packageName: String? = sbn?.packageName

        Toast.makeText(this, "Notification received: $title", Toast.LENGTH_LONG).show()
    }
}