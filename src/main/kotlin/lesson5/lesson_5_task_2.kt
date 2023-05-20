package lesson5

fun main() {
    val yearOfBirth = readln().toInt()

    val currentYear = 2023
    val userAge = currentYear - yearOfBirth

    if (userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Вернуть на главный экран")
    }
}
const val AGE_OF_MAJORITY = 18