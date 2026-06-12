package com.sixyears.onestory.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.sixyears.onestory.R
import com.sixyears.onestory.countdown.CountdownManager
import java.util.Calendar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val calendar = Calendar.getInstance()

        val month = calendar.get(Calendar.MONTH) + 1
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        if (month == 6 && day == 25) {
            startActivity(
                Intent(
                    this,
                    BirthdayActivity::class.java
                )
            )
            finish()
            return
        }

        val countdown =
            findViewById<TextView>(
                R.id.txtCountdown
            )

        val days =
            CountdownManager.getDaysUntilBirthday(
                6,
                25
            )

        countdown.text =
            "$days Days Left ❤️"

        val loveLetter =
            findViewById<Button>(
                R.id.btnLoveLetter
            )

        loveLetter.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    LoveLetterActivity::class.java
                )
            )
        }
    }
}
