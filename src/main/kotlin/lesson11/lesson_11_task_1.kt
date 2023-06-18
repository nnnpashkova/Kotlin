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
    println("User information: ${user1.id}, ${user1.login}, ${user1.password}, ${user1.mail}")
    println()
    println("User information: ${user2.id}, ${user2.login}, ${user2.password}, ${user2.mail}")

}

class User(
    val id: Int,
    val login: String,
    val password: String,
    val mail: String,
)