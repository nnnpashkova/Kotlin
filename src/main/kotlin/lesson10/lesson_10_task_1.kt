package lesson10

fun main() {
    println("Бросает кубики игрок:")
    val numberPerson = sumOfRandomNumbers()
    println(numberPerson)

    println("Бросает кубики компьютер:")
    val numberСomputer = sumOfRandomNumbers()
    println(numberСomputer)

    if (numberPerson > numberСomputer) {
        println("Победил человек")
    } else if (numberPerson == numberСomputer) {
        println("Ничья")
    } else {
        println("Победила машина")
    }

}

fun sumOfRandomNumbers(): Int {
    val numberOne = (0..6).random()
    val numberTwo = (0..6).random()
    return numberOne + numberTwo
}