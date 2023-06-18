package lesson18

fun main() {
    val dot = Dot(3, 4)
    val dotF = DotF(2.2F, 2.2F)
    val screen = Screen()
    screen.draw(dot, Circle())
    screen.draw(dotF, Circle())
    screen.draw(dot, Square())
    screen.draw(dotF, Square())
}

class Dot(
    val x: Int,
    val y: Int
)

class DotF(
    val x: Float,
    val y: Float
)

class Circle() : Figure {
    override fun draw(dot: Dot) {
        println("Нарисован круг по координатам: ${dot.x}, ${dot.y}")
    }

    override fun draw(dotF: DotF) {
        println("Нарисован круг по координатам: ${dotF.x}, ${dotF.y}")
    }
}

class Square() : Figure {
    override fun draw(dot: Dot) {
        println("Нарисован квадрат по координатам: ${dot.x}, ${dot.y}")
    }

    override fun draw(dotF: DotF) {
        println("Нарисован квадрат по координатам: ${dotF.x}, ${dotF.y}")
    }
}

class Screen() {
    fun draw(dot: Dot, figure: Figure) {
        figure.draw(dot)
    }

    fun draw(dotF: DotF, figure: Figure) {
        figure.draw(dotF)
    }
}

interface Figure {
    fun draw(dot: Dot)
    fun draw(dotF: DotF)
}


