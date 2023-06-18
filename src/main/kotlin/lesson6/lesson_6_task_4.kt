package lesson6

fun main() {
    val maxNumberOfAttempts = 5
    var numberOfAttempts = 0
    val correctNumber = (1..9).random()
    var userEntered = 0

    while (numberOfAttempts < maxNumberOfAttempts) {
        numberOfAttempts++
        println("Введите число от 1 до 9:")
        userEntered = readln().toInt()
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
}