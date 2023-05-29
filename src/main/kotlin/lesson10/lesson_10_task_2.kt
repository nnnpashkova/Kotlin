package lesson10

fun main() {
    println("Введите логин:")
    val personLogin = readln()
    println("Введите пароль:")
    val personPassword = readln()
    if (!comparePasswordLength(text = personLogin) || !comparePasswordLength(text = personPassword)) {
        println("Логин или пароль недостаточно длинные")
    }
}

fun comparePasswordLength(text: String): Boolean = text.length > 4

