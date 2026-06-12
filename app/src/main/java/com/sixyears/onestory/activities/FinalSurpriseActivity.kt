package com.sixyears.onestory.activities

import android.os.Bundle
import android.widget.TextView
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import com.sixyears.onestory.R

class FinalSurpriseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_final_surprise)

        onBackPressedDispatcher.addCallback(
            this,
            object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    // Disabled
                }
            }
        )

        findViewById<TextView>(
            R.id.txtFinalMessage
        ).text = """
🎁 Secret Surprise 🎁

6 Years...
Countless Memories...
Countless Smiles...

Thank You For Everything ❤️

Happy Birthday My Love ❤️

Forever & Always ❤️
        """.trimIndent()
    }
}
