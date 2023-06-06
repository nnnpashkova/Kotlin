package lesson17

fun main() {
    val user = User()
    user.login = "list"
    user.password = "12356787654"
}

class User() {
    var login: String = "list1900@mail.ru"
        set(value) {
            println("Логин успешно изменен")
            field
        }
    var password: String = "list900"
        get() = "*******"
        set(value) {
            println("Вы не можете изменить пароль")
            field
        }
}


