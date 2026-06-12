package com.sixyears.onestory.activities

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.sixyears.onestory.R

class LoveLetterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_love_letter)

        val letter =
            findViewById<TextView>(R.id.txtLetter)

        letter.text = """
My Love ❤️

These six years have been the most beautiful chapter of my life.

Every smile, every memory, every conversation and every moment with you has made my journey special.

Thank you for standing beside me through happiness and challenges.

You have brought happiness, strength and meaning into my life.

No matter where life takes us, you will always have a special place in my heart.

Today, I just want to say...

Thank you for being you ❤️

Happy Birthday My Love ❤️

Forever Yours ❤️
        """.trimIndent()
    }
}
