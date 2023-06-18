package lesson20

fun main() {
    val phrase = listOf("Привет", "Как прошел твой день?", "Сегодня солнечный день", "Хорошего дня!", "Улыбайся!")
    val robot = Robot()
    phrase.forEach { robot.say(it) }
    println("Сейчас слова будут наоборот:")
    robot.setModifier { it.reversed() }
    phrase.forEach { robot.say(it) }
}

class Robot {
    private var modifier = { phrase: String -> phrase }

    fun say(phrase: String) {
        println(modifier(phrase))
    }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }
}