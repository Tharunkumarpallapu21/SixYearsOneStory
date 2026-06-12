package com.sixyears.onestory.activities

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.sixyears.onestory.R

class ReasonsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_reasons)

        findViewById<TextView>(R.id.txtReasons).text = """
❤️ 100 Reasons I Love You ❤️

1. Your smile
2. Your kindness
3. Your support
4. Your honesty
5. Your laughter
6. Your patience
7. Your confidence
8. Your caring nature
9. Your beautiful heart
10. Because you are YOU ❤️

...continue up to 100 reasons...
        """.trimIndent()
    }
}
