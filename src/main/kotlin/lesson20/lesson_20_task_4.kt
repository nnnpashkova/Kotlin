package lesson20

fun main() {
    val list = listOf("один", "два", "три")
    val mapLambds = list.map { { "Нажат элемент: $it" } }
    mapLambds.forEach {
        println(it.invoke())
    }
}
