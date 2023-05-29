package lesson10

fun main() {
    val userRegistrationLogin = userRegistrationLogin()
    val userRegistrationPassword = userRegistrationPassword()
    var userAuthorizationLogin = ""
    var userAuthorizationPassword = ""

    do {
        userAuthorizationLogin = userAuthorizationLogin()
        userAuthorizationPassword = userAuthorizationPassword()
        if (userAuthorizationLogin != userRegistrationLogin || userAuthorizationPassword != userRegistrationPassword) {
            println("Ошибка, авторизуйтесь заново")
        }
    } while (userAuthorizationLogin != userRegistrationLogin || userAuthorizationPassword != userRegistrationPassword)

    var isVerificationCodeCorrect = false
    while (!isVerificationCodeCorrect) {
        val generatesCode = generatesAuthorizationCode()
        println("Ваш код для авторизации: $generatesCode \nВведите код:")

        val userCode = readln().toInt()
        if (userCode != generatesCode) {
            println("Неверно. Попробуйте заново")
        } else {
            println("Добро пожаловать")
            isVerificationCodeCorrect = true
        }
    }

}

fun userRegistrationLogin(): String {
    var userLogin = ""
    println("Придумайте логин:")
    while (!isLoginValid(userLogin)) {
        userLogin = readln()
        if (!isLoginValid(userLogin)) {
            println("Логин должен состоять минимум из 4 символов. Ввведите еще раз:")
        }
    }
    return userLogin
}

fun isLoginValid(login: String): Boolean = login.length >= 4

fun userRegistrationPassword(): String {
    val length = 10
    val randomPassword = getRandomString(length)
    println("Ваш пароль: $randomPassword ")
    return randomPassword
}

fun getRandomString(length: Int): String {
    val charset = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    return (1..length)
        .map { charset.random() }
        .joinToString("")
}

fun userAuthorizationLogin(): String {
    println("Введите логин:")
    return readln()
}

fun userAuthorizationPassword(): String {
    println("Введите пароль:")
    return readln()
}

fun generatesAuthorizationCode(): Int {
    val randomСode = (1000..9999).random()
    return randomСode
}
