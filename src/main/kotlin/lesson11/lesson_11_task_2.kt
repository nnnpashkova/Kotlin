package lesson11

fun main() {
    val user1 = User(
        id = 1,
        login = "andrey1990@gmail.ru",
        password = "123andrey",
        mail = "andrey1990@gmail.ru",
        bio = "",
    )
    user1.displayingUserInformation()
    println("Введите инфомацию о себе:")
    user1.readingInformationAboutUsers()
    user1.changePassword()
    user1.sendAMessage(text = user1.mail)


}


class User(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String?,
) {
    fun displayingUserInformation() {
        println(id)
        println(login)
        println(password)
        println(mail)
        println(bio)
    }

    fun readingInformationAboutUsers() {
        bio = readln()
    }

    fun changePassword() {
        println("Введите пароль:")
        val userPassword = readln()
        if (password == userPassword) {
            println("Введите новый пароль:")
            val userPasswordChanged = readln()
            password = userPasswordChanged
            println("Пароль изменен, Ваш новый пароль: $password")
        }
    }

    fun sendAMessage(text: String) {
        println(text)

    }
}
