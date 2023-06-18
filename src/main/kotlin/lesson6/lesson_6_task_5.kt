package lesson6

fun main(){
    val maxNumberOfAttempts = 3
    var numberOfAttempts = 0
    var correctAnswer = Int.MIN_VALUE
    val userResponse = 0

    while (numberOfAttempts < maxNumberOfAttempts && correctAnswer != userResponse) {
        numberOfAttempts++
        val firstNumber = (0..9).random()
        val secondNumber = (0..9).random()
        correctAnswer = firstNumber + secondNumber
        println("Для входа в приложение, решите пример $firstNumber + $secondNumber = ")
        val userResponse = readln().toInt()
        if (correctAnswer == userResponse) {
            println("Добро пожаловать")
            return
        } else {
            println("Ответ неверный, осталось попыток: ${maxNumberOfAttempts - numberOfAttempts}")
        }
        if (numberOfAttempts == maxNumberOfAttempts) {
            println("Доступ запрещен")
        }
    }
}