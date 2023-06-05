package lesson16

fun main() {
    val circle = Сircle(4)
    circle.calculateArea()
    circle.calculateLength()
}

class Сircle(
    private val radius: Int
) {
    fun calculateArea() {
        println("Площадь круга: ${NUMBER_PI * radius * radius}")
    }

    fun calculateLength() {
        println("Длина окружности: ${2 * NUMBER_PI * radius}")
    }
}

const val NUMBER_PI = 3.14