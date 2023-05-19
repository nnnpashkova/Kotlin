package lesson5

fun main() {
    val firstNumber = 8
    val secondNumber = 12

    println("Какого числа отмечается междунородный женский день? ")
    val userFirstNumber = readln().toInt()
    val firstAnswerCorrect = firstNumber == userFirstNumber
    if (firstAnswerCorrect) {
        println("Вы молодец")
    }

    println("Какого числа отмечается День космонавтики? ")
    val userSecondNumber = readln().toInt()
    val secondAnswerCorrect = secondNumber == userSecondNumber
    if (secondAnswerCorrect) {
        println("Супер")
    }
    if (firstAnswerCorrect && secondAnswerCorrect) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (firstAnswerCorrect || secondAnswerCorrect) {
        println("Вы выиграли утешительный приз!")
    } else {
       println("Неудача! Крутите барабан!")
    }
    println("Правильный ответ: $firstNumber, $secondNumber")
}
