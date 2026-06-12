package com.sixyears.onestory.notifications

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class BirthdayWorker(
    context: Context,
    params: WorkerParameters
) : Worker(context, params) {

    override fun doWork(): Result {

        NotificationHelper.showNotification(
            applicationContext,
            "🎂 Happy Birthday ❤️",
            "Today is your special day ❤️"
        )

        return Result.success()
    }
}
