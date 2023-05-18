package lesson5

import kotlin.random.Random

fun main(){
    val firstNumber = Random.nextInt(0,10)
    val secondNumber = Random.nextInt(0,10)
    println("$firstNumber + $secondNumber = ")
    var userAge = readLine()!!.toInt()
    if (userAge == firstNumber + secondNumber ){
        println("Добро пожаловать")
    } else {
        println("Доступ запрещен")
    }
        println("$firstNumber + $secondNumber = ")
}
