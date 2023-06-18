package lesson5

fun main() {
    val firstNumber = 8
    val secondNumber = 12

    println("Введите первое число от 0 до 100:")
    val userFirstNumber = readln().toInt()
    val firstAnswerCorrect = (firstNumber == userFirstNumber) ||(secondNumber == userFirstNumber)
    if (firstAnswerCorrect) {
        println("Вы молодец")
    }

    println("Введите второе число от 0 до 100:")
    val userSecondNumber = readln().toInt()
    val secondAnswerCorrect = (secondNumber == userSecondNumber) ||(firstNumber == userSecondNumber)
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
