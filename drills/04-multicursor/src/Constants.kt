package drills.multicursor

/**
 * A file containing repeated constants for multi‑cursor practice.
 */
object Constants {
    const val PI_VALUE = 3.14159
    const val PI_VALUE_SQUARED = PI_VALUE * PI_VALUE
    val numbers = listOf(1, 2, 3, 4, 5)
    fun circumference(radius: Double): Double {
        return 2 * PI_VALUE * radius
    }
    fun area(radius: Double): Double {
        return PI_VALUE * radius * radius
    }
}