package com.sixyears.onestory.customviews

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import kotlin.random.Random

class FloatingHeartsView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : View(context, attrs) {

    private val paint = Paint().apply {
        color = Color.parseColor("#FF4D6D")
        textSize = 60f
    }

    private val hearts = MutableList(20) {
        Heart(
            Random.nextFloat() * 1000f,
            Random.nextFloat() * 2000f
        )
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        hearts.forEach {
            canvas.drawText("❤️", it.x, it.y, paint)

            it.y -= 2f

            if (it.y < -50f) {
                it.y = height.toFloat()
            }
        }

        invalidate()
    }

    data class Heart(
        var x: Float,
        var y: Float
    )
}
