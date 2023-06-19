package lesson11

fun main() {
    val forum = Forum()
    val user1 = forum.newUser("sofa12345", "ghgh9090", "sofa@mail.ru")
    val user2 = forum.newUser("sofa12345", "ghgh9090", "sofa@mail.ru")
    val id1 = user1.id
    val id2 = user2.id
    forum.newMessage(id1, "Привет, пользователь приложения!")
    forum.newMessage(id2, "Привет")
    forum.printThread()
}

class Forum(
    private val userList: MutableList<User> = mutableListOf(),
    private var lastUserId: Int = 0,
) {
    private val userMessages: MutableMap<Int, MutableList<String>> = mutableMapOf()
    fun newUser(login: String, password: String, mail: String): User {
        lastUserId++
        val user = User(lastUserId, login, password, mail)
        userList.add(user)
        return user
    }

    fun newMessage(id: Int, message: String) {
        val messages = userMessages[id]
        if (messages != null) {
            messages.add(message)
        } else {
            userMessages[id] = mutableListOf(message)
        }
    }

    fun printThread() {
        userMessages.forEach { println("Пользоватль ${it.key}, сообщение: ${it.value}") }
    }
}

class User(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
)