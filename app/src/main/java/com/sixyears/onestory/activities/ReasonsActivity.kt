package com.sixyears.onestory.activities

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.sixyears.onestory.R

class ReasonsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_reasons)

        val reasonsText =
            findViewById<TextView>(R.id.txtReasons)

        val builder = StringBuilder()

        builder.append("❤️ 100 Reasons I Love You ❤️\n\n")

        for (i in 1..100) {
            builder.append("$i. Because you make my life beautiful ❤️\n\n")
        }

        reasonsText.text = builder.toString()
    }
}
