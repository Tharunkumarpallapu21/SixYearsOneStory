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

        if (calendar.get(Calendar.MONTH) + 1 == 6 &&
            calendar.get(Calendar.DAY_OF_MONTH) == 25) {

            startActivity(
                Intent(this, BirthdayActivity::class.java)
            )

            finish()
            return
        }

        findViewById<TextView>(
            R.id.txtCountdown
        ).text =
            "${CountdownManager.getDaysUntilBirthday(6,25)} Days Left ❤️"

        findViewById<Button>(
            R.id.btnLoveLetter
        ).setOnClickListener {
            startActivity(
                Intent(this, LoveLetterActivity::class.java)
            )
        }

        findViewById<Button>(
            R.id.btnGallery
        ).setOnClickListener {
            startActivity(
                Intent(this, GalleryActivity::class.java)
            )
        }

        findViewById<Button>(
            R.id.btnReasons
        ).setOnClickListener {
            startActivity(
                Intent(this, ReasonsActivity::class.java)
            )
        }
    }
}
