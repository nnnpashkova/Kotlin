package lesson15

fun main() {
    val user = User("Пользователь")
    val administrator = Administrator("Администратор")

    user.reaForum()
    user.writeMessage()
    println()
    administrator.reaForum()
    administrator.writeMessage()
    administrator.deleteMessage()
    administrator.deleteUser()


}

abstract class Forum(
    val userType: String,
) {
    abstract fun reaForum()
    abstract fun writeMessage()
}

class User(userType: String) : Forum(userType) {
    override fun reaForum() {
        println("$userType: читает форум")
    }

    override fun writeMessage() {
        println("$userType: пишет сообщение")
    }
}

class Administrator(userType: String) : Forum(userType) {
    override fun reaForum() {
        println("$userType: читает форум")
    }

    override fun writeMessage() {
        println("$userType: пишет сообщение")
    }

    fun deleteUser() {
        println("$userType: удалил пользователя")
    }

    fun deleteMessage() {
        println("$userType: удалил сообщение")
    }
}