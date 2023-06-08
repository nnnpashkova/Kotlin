package lesson18

fun main() {
    val gameDiceFourSides: GameDice = GameDiceFourSides(number = (1..4).random())
    val gameDiceSixSides: GameDice = GameDiceSixSides(number = (1..6).random())
    val gameDiceNineSides: GameDice = GameDiceNineSides(number = (1..6).random())

    val arrayOffGameDice = arrayOf<GameDice>(gameDiceFourSides, gameDiceSixSides, gameDiceNineSides)
    showAllGameDice(arrayOffGameDice)
}

fun showAllGameDice(printNumber: Array<GameDice>) {
    printNumber.forEach {
        println(it.printNumber())
    }
}

open class GameDice(val number: Int) {
    open fun printNumber() = ""
}

class GameDiceFourSides(
    number: Int,
) : GameDice(number) {
    override fun printNumber(): String {
        return "Вам выпало число от 1 - 4: $number"
    }
}

class GameDiceSixSides(
    number: Int,
) : GameDice(number) {
    override fun printNumber(): String {
        return "Вам выпало число от 1 - 6: $number"
    }
}

class GameDiceNineSides(
    number: Int,
) : GameDice(number) {
    override fun printNumber(): String {
        return "Вам выпало число от 1 - 9: $number"
    }
}