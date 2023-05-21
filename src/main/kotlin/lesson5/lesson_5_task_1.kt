package lesson5

import kotlin.random.Random

fun main() {
    val firstNumber = (0..100).random()
    val secondNumber = (0..100).random()
    println("$firstNumber + $secondNumber = ")
    var userAge = readln().toInt()

    if (userAge == firstNumber + secondNumber) {
        println("Добро пожаловать")
    } else { println("Доступ запрещен") }
    println("$firstNumber + $secondNumber =")
}
