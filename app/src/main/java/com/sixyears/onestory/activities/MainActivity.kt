package com.sixyears.onestory.activities

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.sixyears.onestory.R
import com.sixyears.onestory.countdown.CountdownManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val countdown =
            findViewById<TextView>(
                R.id.txtCountdown
            )

        val days =
            CountdownManager.getDaysUntilBirthday(
                8,
                15
            )

        countdown.text =
            "$days Days Left ❤️"
    }
}
