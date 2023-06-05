package lesson15

fun main() {
    val user = User("Пользователь","Ирина")
    val administrator = Administrator("Администратор", "Женя")

        user.readMessage()
        user.writeMessage(message = "Всем привет!")
        println()
        administrator.readMessage()
        administrator.writeMessage(message = "Привет")
        administrator.deleteMessage(message = "Привет")
        administrator.deleteUser(user = "Ирина")

}

abstract class BaseUser(
    val userType: String,
    val name: String,
) {
    abstract fun readMessage(): String
    abstract fun writeMessage(message: String)
}

class User(
    userType: String,
    name: String
) : BaseUser(userType, name) {
    override fun readMessage(): String {
        println("$userType $name: читает форум")
        return name
    }


    override fun writeMessage(message: String) {
        println("$userType $name: пишет сообщение")
    }
}

class Administrator(userType: String,
    name: String) : BaseUser(userType, name) {
    override fun readMessage(): String {
        println("$userType $name: читает форум")
        return name
    }

    override fun writeMessage(message: String) {
        println("$userType $name: пишет сообщение")
    }

    fun deleteUser(user: String) {
        println("$userType $name: удалил пользователя")
    }

    fun deleteMessage(message: String) {
        println("$userType $name: удалил сообщение")
    }
}