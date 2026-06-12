package com.sixyears.onestory.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import com.sixyears.onestory.R

class BirthdayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_birthday)

        onBackPressedDispatcher.addCallback(
            this,
            object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    // Disabled
                }
            }
        )

        Handler(Looper.getMainLooper()).postDelayed({

            startActivity(
                Intent(
                    this,
                    FinalSurpriseActivity::class.java
                )
            )

            finish()

        }, 5000)
    }
}
