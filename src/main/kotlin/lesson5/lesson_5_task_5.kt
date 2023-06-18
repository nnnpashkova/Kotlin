package lesson5

import kotlin.random.Random

fun main() {
    val firstRandomNumbers = (0..100).random()
    val secondRandomNumbers = (0..100).random()

    println("Введите первое число от 0 до 100")
    val userFirstNumber = readln().toInt()
    val firstAnswerCorrect = (firstRandomNumbers == userFirstNumber) || (secondRandomNumbers == userFirstNumber)
    if (firstAnswerCorrect) {
        println("Вы молодец!")
    }

    println("Введите второе число от 0 до 100")
    val userSecondNumber = readln().toInt()
    val secondAnswerCorrect = (secondRandomNumbers == userSecondNumber) || (firstRandomNumbers == userSecondNumber)
    if (secondAnswerCorrect) {
        println("Cупер!")
    }

    if (firstAnswerCorrect && secondAnswerCorrect) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (firstAnswerCorrect || secondAnswerCorrect) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача! Крутите барабан!")
    }
    println("Правильный ответ: $firstRandomNumbers, $secondRandomNumbers")
}
