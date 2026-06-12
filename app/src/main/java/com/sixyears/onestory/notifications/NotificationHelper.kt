package com.sixyears.onestory.notifications

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import androidx.core.app.NotificationCompat
import com.sixyears.onestory.R

object NotificationHelper {

    private const val CHANNEL_ID = "love_channel"

    fun showNotification(
        context: Context,
        title: String,
        message: String
    ) {

        val manager =
            context.getSystemService(
                Context.NOTIFICATION_SERVICE
            ) as NotificationManager

        val channel = NotificationChannel(
            CHANNEL_ID,
            "Love Notifications",
            NotificationManager.IMPORTANCE_HIGH
        )

        manager.createNotificationChannel(channel)

        val notification =
            NotificationCompat.Builder(
                context,
                CHANNEL_ID
            )
                .setSmallIcon(
                    android.R.drawable.star_big_on
                )
                .setContentTitle(title)
                .setContentText(message)
                .setAutoCancel(true)
                .build()

        manager.notify(
            System.currentTimeMillis().toInt(),
            notification
        )
    }
}
