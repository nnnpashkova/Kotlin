package lesson14

fun main() {
    val circle1 = Circle(10, "красный")
    val circle2 = Circle(4, "черный")
    val rectangle1 = Rectangle(12, 6, "зеленый")
    val rectangle2 = Rectangle(8, 4, "красный")
    val triangle1 = Triangle(5, 7, 6, 10, "красный")
    val triangle2 = Triangle(10, 7, 6, 8, "черный")
    val figureList = listOf(circle1, circle2, rectangle1, rectangle2, triangle1, triangle2)
    perimeterFigures(figureList)
    squareFigures(figureList)
}

abstract class Figure(
    val color: String,
) {
    abstract fun calculateArea(): Int

    abstract fun calculatePerimeter(): Int
}

class Circle(
    val radius: Int,
    color: String,
) : Figure(color) {
    override fun calculateArea(): Int {
        val squareCircle = radius * 2
        return squareCircle
    }

    override fun calculatePerimeter(): Int {
        val perimeterCircle = radius * radius
        return perimeterCircle
    }
}

class Rectangle(
    val width: Int,
    val height: Int,
    color: String,
) : Figure(color) {
    override fun calculateArea(): Int {
        val squareRectangle = width * height
        return squareRectangle
    }

    override fun calculatePerimeter(): Int {
        val perimeterRectangle = 2 * (width + height)
        return perimeterRectangle
    }

}

class Triangle(
    val baseTriangle: Int,
    val side1: Int,
    val side2: Int,
    val height: Int,
    color: String,
) : Figure(color) {
    override fun calculateArea(): Int {
        val squareTriangle = 1 / 2 * height * baseTriangle
        return calculateArea()
    }
    override fun calculatePerimeter(): Int {
        val perimeterTriangle = baseTriangle + side1 + side2
        return perimeterTriangle
    }
}

fun perimeterFigures(figure: List<Figure>) {
    val sumRedFigure = figure.filter { it.color.equals(RED_COLOR)}
        .sumOf { it.calculatePerimeter() }
    println("Периметр красных фигур = $sumRedFigure")
}

fun squareFigures(figure: List<Figure>) {
    val sumRedFigure = figure.filter { it.color.equals(RED_COLOR) }
        .sumOf { it.calculateArea() }
    println("Площадь красных фигур = $sumRedFigure")
}

const val RED_COLOR = "красный"