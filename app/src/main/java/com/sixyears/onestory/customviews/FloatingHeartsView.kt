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

    data class Heart(
        var x: Float,
        var y: Float,
        var speed: Float,
        var size: Float
    )

    private val hearts = MutableList(50) {
        Heart(
            Random.nextFloat() * 1200f,
            Random.nextFloat() * 2200f,
            Random.nextFloat() * 4f + 1f,
            Random.nextFloat() * 40f + 40f
        )
    }

    private val paint = Paint().apply {
        color = Color.parseColor("#FF4D6D")
        textAlign = Paint.Align.CENTER
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        hearts.forEach {

            paint.textSize = it.size

            canvas.drawText(
                "❤️",
                it.x,
                it.y,
                paint
            )

            it.y -= it.speed

            if (it.y < -100) {
                it.y = height.toFloat()
                it.x = Random.nextFloat() * width
            }
        }

        invalidate()
    }
}
