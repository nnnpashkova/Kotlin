package lesson10

fun main() {
    println("Введите логин:")
    val personLogin = readln()
    println("Введите пароль:")
    val personPassword = readln()
    if (!passwordLengthComparison(text = personLogin) || !passwordLengthComparison(text = personPassword)) {
        println("Логин или пароль недостаточно длинные")
    }
}

fun passwordLengthComparison(text: String): Boolean = text.length > 4

