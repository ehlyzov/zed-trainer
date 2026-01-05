package drills.refactor

fun main() {
    val order = Order(
        id = "A-100",
        items = listOf(
            LineItem("Cable", 9.5, 2),
            LineItem("Adapter", 12.0, 1)
        ),
        memberLevel = 2
    )

    val service = OrderService()
    val total = service.finalTotal(order)
    println(ReceiptFormatter.format(order, total))
}
