package lesson11

fun main() {
    val forum = Forum()
}

class Forum private constructor(private val users: MutableList<User>) {

    fun newUser() {
        val user = User(1, "andrey1990", "123andrey", "andrey1990@gmail.ru", "футболист")
        users.add(user)
    }

    fun newMassage() {

    }
    companion object {
        fun newForum(vararg desires: String): Forum {
            val user = User(1, "andrey1990", "123andrey", "andrey1990@gmail.ru", "футболист")
            return Forum(listOf(user))
        }

    }
}
class User(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String?,
){

    //
}