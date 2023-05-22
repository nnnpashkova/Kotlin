package lesson6

fun main() {
    val maxNumberOfAttempts = 5
    var numberOfAttempts = 0
    val correctNumber = 5
    var userEntered = 0

    while (numberOfAttempts < maxNumberOfAttempts && correctNumber != userEntered) {
        numberOfAttempts++
        println("Введите число от 1 до 9:")
        val userEntered = readln().toInt()
        if (correctNumber == userEntered) {
            println("Это была великолепная игра!")
            return
        } else {
            println("Неверно, осталось количество ${maxNumberOfAttempts - numberOfAttempts}")
        }
        if (numberOfAttempts == maxNumberOfAttempts) {
            println("Было загадано число $correctNumber")
        }
    }
    println("Было загадано $correctNumber")
}