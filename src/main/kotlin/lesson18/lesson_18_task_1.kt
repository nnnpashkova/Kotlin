package lesson18

fun main() {
    val order = Order()
    order.printTheOrderedItem(23, "сумка")
    order.printTheOrderedItem(26, listOf("рюкзак", "ремень", "заколка"))
}

class Order {
    fun printTheOrderedItem(
        number: Int,
        goods: String,
    ) {
        println("Заказан товар: $goods")
    }

    fun printTheOrderedItem(
        number: Int,
        goods: List<String>,
    ) {
        println("Заказаны следующие товары: $goods")

    }
}