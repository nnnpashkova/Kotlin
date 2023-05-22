package lesson6

fun main() {
    val maxNumberOfAttempts = 5
    var numberOfAttempts = 0
    //val intervalNumbers = (1..9).random()
    val correctNumber = 5
    var userEntered = 0

    while (numberOfAttempts < maxNumberOfAttempts || correctNumber == userEntered) {
        numberOfAttempts++
        println("Введите число от 1 до 9:")
        val userEntered = readln().toInt()
        if (correctNumber == userEntered) {
            println("Это была великолепная игра!")
        } else {
            println("Неверно, осталось количество ${maxNumberOfAttempts - numberOfAttempts}")
        }
    }
    println("Было загадано $correctNumber")
}