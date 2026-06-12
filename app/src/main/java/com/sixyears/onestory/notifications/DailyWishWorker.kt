package com.sixyears.onestory.notifications

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class DailyWishWorker(
    context: Context,
    params: WorkerParameters
) : Worker(context, params) {

    override fun doWork(): Result {

        NotificationHelper.showNotification(
            applicationContext,
            "Good Morning ❤️",
            "Wishing you a beautiful day ❤️"
        )

        return Result.success()
    }
}
