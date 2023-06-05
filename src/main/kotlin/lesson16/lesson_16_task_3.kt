package lesson16

import sun.security.util.Password

fun main() {
   val userInterface = UserInterface(
        "list@mail.ru",
        "123456List"
    )
    userInterface.checkPassword()

}

class UserInterface(
    val login: String,
    private val password: String
) {
    fun checkPassword() {
        println("Введите логин:")
        val userLogin = readln()
        println("Введите пароль:")
        do {
            val userPassword = readln()
            if (password == userPassword) {
                println("Пароль введен верно")
            } else {
                println("Введите пароль заново:")
            }
        } while (password != userPassword)
    }
}




