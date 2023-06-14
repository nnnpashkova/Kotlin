package lesson20

fun main() {
    val list = listOf("один", "два", "три")
    list.map {
        println("Нажат элемент: $it")
    }
}
