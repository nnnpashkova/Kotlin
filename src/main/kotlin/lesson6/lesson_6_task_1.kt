package lesson6

fun main() {
    println("Придумайте логин")
    val registrationLogin = readln()
    println("Придумайте пароль")
    val registrationPassword = readln()
    var authorizationLogin = ""
    var authorizationPassword = ""

    do {
        println("Введите логин:")
        authorizationLogin = readln()
        println("Введите пароль:")
        authorizationPassword = readln()
        if (registrationLogin != authorizationLogin || registrationPassword != authorizationPassword) {
            println("Неправильный логин или пароль. Введите заново")
        }
} while (registrationLogin != authorizationLogin || registrationPassword != authorizationPassword)
}
