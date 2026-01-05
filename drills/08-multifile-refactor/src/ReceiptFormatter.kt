package drills.refactor

object ReceiptFormatter {
    fun format(order: Order, total: Double): String {
        val itemCount = order.items.sumOf { it.quantity }
        return "Order ${'$'}{order.id}: ${'$'}itemCount items, total ${'$'}${'$'}total"
    }
}
