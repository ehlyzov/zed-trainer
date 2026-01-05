package drills.refactor

object Pricing {
    fun calculateDiscount(subtotal: Double, memberLevel: Int): Double {
        return if (memberLevel >= 2) subtotal * 0.1 else 0.0
    }

    fun totalWithDiscount(subtotal: Double, discount: Double): Double {
        return subtotal - discount
    }
}
