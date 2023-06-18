package lesson16

fun main() {
    var gameCude = GameCube(
        number = (1..6).random()
    )
    gameCude.showNumber()
}

class GameCube(
    private val number: Int
) {
    fun showNumber() {
        println("Число от 1 до 6: $number")
    }

}