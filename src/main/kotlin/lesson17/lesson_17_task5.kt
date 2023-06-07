package lesson17

fun main() {
    val user = User("list@mail.ru", "listlist")

    println(user.login)
    println(user.password)
}

class User(login: String, password: String) {
    var login = login
        set(value) {
            println("Логин успешно изменен")
            field
        }
    var password = password
        get():String {
            val length = field.length
            var result = ""
            for (i in 0 ..length) {
                result += "*"
            }
            return result
        }
        set(value) {
            println("Вы не можете изменить пароль")
            field
        }
}






