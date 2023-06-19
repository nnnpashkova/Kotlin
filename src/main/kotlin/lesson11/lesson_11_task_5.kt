package lesson11

fun main() {
    val forum = Forum()

}

class Forum(
    private val user: MutableList<User>
) {
    fun newUser() {
        val user =
       User.newUser()
    }

    fun newMessage(id: Int, messages: String) {

    }
}

class User private constructor(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    // var bio: String?,
) {
    companion object {
        fun newUser(): User {
            val user = User(334, "andrey1990", "123andrey", "andrey1990@gmail.ru")
            return user
        }
    }

}