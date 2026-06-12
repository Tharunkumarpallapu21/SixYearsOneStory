package com.sixyears.onestory.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.sixyears.onestory.R

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_welcome)

        Handler(Looper.getMainLooper()).postDelayed({

            startActivity(
                Intent(
                    this,
                    MainActivity::class.java
                )
            )

            overridePendingTransition(
                R.anim.slide_up,
                R.anim.fade_out
            )

            finish()

        }, 5000)
    }
}
