package lesson7

fun main() {
    var randomNumber = 0
    var userСode = -1

    while (randomNumber != userСode) {
        randomNumber = (1000..9999).random()
        println("Ваш код для авторизации: $randomNumber")
        println("Введите код авторизации:")
        userСode = readln().toInt()
        if (randomNumber == userСode) {
            println("Добро пожаловать!")
        }
    }
}


