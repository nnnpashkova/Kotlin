package lesson11

fun main() {
    val user1 = User(
        id = 1,
        login = "andrey1990@gmail.ru",
        password = "123andrey",
        mail = "andrey1990@gmail.ru",
    )

    val user2 = User(
        id = 2,
        login = "elena1995@gmail.ru",
        password = "1995name",
        mail = "elena1995@gmail.ru",
    )

    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.mail)
    println()
    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.mail)

}

class User(
    val id: Int,
    val login: String,
    val password: String,
    val mail: String,
)