package lesson10

fun main() {
    println("Ходит человек:")
    val numberPerson= sumOfRandomNumbers()
    println("Ходит машина:")
    val numberComputer = sumOfRandomNumbers()
    println("Хотите бросить кости еще?")
}

fun sumOfRandomNumbers(): Int {
    val numberOne = (0..6).random()
    val numberTwo = (0..6).random()
    return numberOne + numberTwo
}