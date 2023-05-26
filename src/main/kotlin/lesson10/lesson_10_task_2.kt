package lesson10

fun main() {
    println("Введите логин:")
    val personLogin = readln()
    println("Введите пароль:")
    val personPassword = readln()
    if (!verificationTextByLength(text = personLogin) || !verificationTextByLength(text = personPassword)) {
        println("Логин или пароль недостаточно длинные")
    }
}

fun verificationTextByLength(text: String): Boolean {
    return text.length > 4
}
