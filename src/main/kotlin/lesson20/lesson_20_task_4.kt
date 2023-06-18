package lesson20

fun main() {
    val list = listOf("один", "два", "три")
    val mapList = list.map { { "Нажат элемент: $it" } }
    mapList.forEach {
        println(it.invoke())
    }
}
