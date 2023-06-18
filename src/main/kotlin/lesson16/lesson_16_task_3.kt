package lesson16

import sun.security.util.Password

fun main() {
   val userInterface = UserInterface(
        "list@mail.ru",
        "123456List"
    )
    println("Введите пароль:")
    val userPassword = readln()
    userInterface.checkPassword(userPassword)
}

class UserInterface(
    val login: String,
    private val password: String
) {
    fun checkPassword(userPassword:String) {
        if (password == userPassword) {
            println("Пароль введен верно")
        } else {
            println("Пароль введен неверно")
        }
    }
}




