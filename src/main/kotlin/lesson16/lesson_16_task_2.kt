package lesson16

fun main() {
    val circle = Circle(4)
    circle.calculateArea()
    circle.calculateLength()
}

class Circle(
    private val radius: Int,
) {
    fun calculateArea() {
        println("Площадь круга: ${NUMBER_PI * radius * radius}")
    }

    fun calculateLength() {
        println("Длина окружности: ${2 * NUMBER_PI * radius}")
    }
}

private const val NUMBER_PI = 3.14
