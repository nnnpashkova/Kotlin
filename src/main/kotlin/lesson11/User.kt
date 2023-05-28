package lesson11

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

    fun changePassword () {
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
