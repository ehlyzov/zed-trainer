package drills.refactor

data class LineItem(val name: String, val price: Double, val quantity: Int)

data class Order(
    val id: String,
    val items: List<LineItem>,
    val memberLevel: Int
)
