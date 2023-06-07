package lesson16

fun main() {
    val circle = Circle(4, 3.14)
    circle.calculateArea()
    circle.calculateLength()
}

class Circle(
    private val radius: Int,
    private val numberPi: Double,
) {
    fun calculateArea() {
        println("Площадь круга: ${numberPi * radius * radius}")
    }

    fun calculateLength() {
        println("Длина окружности: ${2 * numberPi * radius}")
    }
}

