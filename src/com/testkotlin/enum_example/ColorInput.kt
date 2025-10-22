package com.testkotlin.enum_example

enum class ColorInput(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    fun rgb() = (r*256 + g)*256+b;
    companion object {
        @JvmStatic
        fun getMnemonic(color: ColorInput) =
            when (color) {
                ColorInput.RED -> "Richard"
                ColorInput.ORANGE -> "Of"
                ColorInput.YELLOW -> "York"
                ColorInput.GREEN -> "Gave"
                ColorInput.BLUE -> "Battle"
                ColorInput.INDIGO -> "In"
                ColorInput.VIOLET -> "Vain"
            }
    }
}

fun getWarmth(color: ColorInput) = when(color) {
    ColorInput.ORANGE, ColorInput.RED, ColorInput.YELLOW -> "warm"
    ColorInput.GREEN -> "neutral"
    ColorInput.BLUE, ColorInput.INDIGO, ColorInput.VIOLET -> "cold";
}

fun mix(c1: ColorInput, c2: ColorInput) = when(setOf(c1, c2)) {
    setOf(ColorInput.RED, ColorInput.YELLOW) -> ColorInput.ORANGE
    setOf(ColorInput.YELLOW, ColorInput.BLUE) -> ColorInput.GREEN
    setOf(ColorInput.BLUE, ColorInput.VIOLET) -> ColorInput.INDIGO
    else -> throw Exception("invalid input")
}


fun mixOptimized(c1: ColorInput, c2: ColorInput) = when {
    (c1 == ColorInput.RED && c2 == ColorInput.YELLOW) ||
    (c1 == ColorInput.YELLOW && c2 == ColorInput.RED) -> ColorInput.ORANGE

    (c1 == ColorInput.YELLOW && c2 == ColorInput.BLUE) ||
    (c1 == ColorInput.BLUE && c2 == ColorInput.YELLOW) -> ColorInput.GREEN

    (c1 == ColorInput.BLUE && c2 == ColorInput.VIOLET) ||
    (c1 == ColorInput.VIOLET && c2 == ColorInput.BLUE) -> {
       ColorInput.INDIGO
    }
    else -> {
        ColorInput.RED
    }
}