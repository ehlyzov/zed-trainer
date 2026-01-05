package drills.refactor

class OrderService {
    fun subtotal(order: Order): Double {
        var sum = 0.0
        for (item in order.items) {
            sum += item.price * item.quantity
        }
        return sum
    }

    fun finalTotal(order: Order): Double {
        val subtotal = subtotal(order)
        val discount = Pricing.calculateDiscount(subtotal, order.memberLevel)
        return Pricing.totalWithDiscount(subtotal, discount)
    }
}
