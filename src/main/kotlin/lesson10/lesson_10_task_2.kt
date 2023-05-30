package lesson10

fun main() {
    println("Введите логин:")
    val personLogin = readln()
    println("Введите пароль:")
    val personPassword = readln()

    if (!checkMinLength(text = personLogin) || !checkMinLength(text = personPassword)) {
        println("Логин или пароль недостаточно длинные")
    }
}

fun checkMinLength (text: String): Boolean = text.length > 4

