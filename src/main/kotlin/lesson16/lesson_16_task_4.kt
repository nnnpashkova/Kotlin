package lesson16

fun main() {
    val internetOrder = InternetOrder(
        2323,
        "Готов"
    )
    internetOrder.сhangeOrderStatus(newStatus = "готово")
    sendRequestManager(internetOrder)
}

class InternetOrder(
    private val orderNumber: Int,
    var orderStatus: String,
) {
    fun сhangeOrderStatus(newStatus: String) {
        orderStatus = newStatus

    }
}

fun sendRequestManager(internetOrder: InternetOrder) {
    println("Отправить заявку менеджеру на изменение статуса заказа, да или нет?")
    val userAnswer = readln()
    if (userAnswer.equals("да")) {
        println("На какой статус изменить зака?")
        val userStarus = readln()
        internetOrder.сhangeOrderStatus(userStarus)
        println("Статус вашего заказа изменен на: $userStarus")
    } else {
        println("Ваш статус заказа без изменений")
    }
}