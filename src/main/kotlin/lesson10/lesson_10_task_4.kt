package lesson10

fun main() {
    var numberRoundsHumanWin = 0
    do {
        if (doRound()) {
            numberRoundsHumanWin++
        }
    } while (hasNextRound())
    println("Игра окончена, человек победил $numberRoundsHumanWin раза")
}


fun doRound(): Boolean {
    println("Ходит человек:")
    val numberPerson = sumOfRandomNumbers()
    println(numberPerson)
    println("Ходит машина:")
    val numberComputer = sumOfRandomNumbers()
    println(numberComputer)

    if (numberPerson > numberComputer) {
        println("Победил человек")
    } else if (numberPerson == numberComputer) {
        println("Ничья")
    } else {
        println("Победила машина")
    }
    return numberPerson > numberComputer
}

fun sumOfRandomNumbers(): Int {
    val numberOne = (0..6).random()
    val numberTwo = (0..6).random()
    return numberOne + numberTwo
}

fun hasNextRound(): Boolean {
    println("Хотите бросить кости еще да или нет?")
    val userResponseContinuesGame = readln()
    return userResponseContinuesGame.equals("ДА", ignoreCase = true)
}