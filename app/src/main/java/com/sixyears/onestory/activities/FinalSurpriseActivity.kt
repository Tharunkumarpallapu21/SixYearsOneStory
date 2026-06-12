package com.sixyears.onestory.activities

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.sixyears.onestory.R

class FinalSurpriseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_final_surprise)

        findViewById<TextView>(
            R.id.txtFinalMessage
        ).text = """
🎁 Secret Surprise 🎁

6 Years...

Countless memories.
Countless smiles.
Countless conversations.

Through every happy moment and every difficult moment,
you were always special.

Thank you for being part of this beautiful journey ❤️

No gift can truly express how grateful I am.

Happy Birthday My Love ❤️

Forever & Always ❤️
        """.trimIndent()
    }
}
