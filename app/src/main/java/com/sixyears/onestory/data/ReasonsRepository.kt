package com.sixyears.onestory.data

import com.sixyears.onestory.models.ReasonItem

object ReasonsRepository {

    fun getReasons(): List<ReasonItem> {
        return listOf(
            ReasonItem("Your smile brightens my day ❤️"),
            ReasonItem("You always support me ❤️"),
            ReasonItem("You understand me ❤️"),
            ReasonItem("You make me happy ❤️"),
            ReasonItem("You are my best friend ❤️"),
            ReasonItem("You are my favorite person ❤️"),
            ReasonItem("You inspire me ❤️"),
            ReasonItem("You believe in me ❤️"),
            ReasonItem("You make every moment special ❤️"),
            ReasonItem("You are my forever ❤️")
        )
    }
}
