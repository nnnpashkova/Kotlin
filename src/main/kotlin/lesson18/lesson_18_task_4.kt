package lesson18

fun main() {
    val rectangularBox: Box = RectangularBox(12, 8, 10)
    val squareBox: Box = SquareBox(10)
    val arrayOfBox = arrayOf<Box>(rectangularBox, squareBox)
    showAllBox(arrayOfBox)
}

fun showAllBox(box: Array<Box>) {
    box.forEach { println(it.returnTheParcels()) }
}

abstract class Box {
    abstract fun returnTheParcels(): String
}

class RectangularBox(
    val length: Int,
    val width: Int,
    val height: Int
) : Box() {
    override fun returnTheParcels(): String {
        return "Площадь поверхности прямоугольника: ${2 * (length * height + height * width + length * width)}"
    }
}

class SquareBox(val finLength: Int) : Box() {
    override fun returnTheParcels(): String {
        return "Площадь поверхности куба: ${6 * finLength * finLength}"
    }
}


