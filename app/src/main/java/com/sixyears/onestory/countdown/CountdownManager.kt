package com.sixyears.onestory.countdown

import java.util.Calendar
import java.util.concurrent.TimeUnit

object CountdownManager {

    fun getDaysUntilBirthday(
        month: Int,
        day: Int
    ): Long {

        val today = Calendar.getInstance()

        val birthday = Calendar.getInstance()

        birthday.set(
            today.get(Calendar.YEAR),
            month - 1,
            day,
            0,
            0,
            0
        )

        if (birthday.before(today)) {
            birthday.add(Calendar.YEAR, 1)
        }

        val diff =
            birthday.timeInMillis -
            today.timeInMillis

        return TimeUnit.MILLISECONDS.toDays(diff)
    }
}
