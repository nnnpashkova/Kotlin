package lesson14

fun main() {
    val forum = ForumComments(
        messageText = "",
        authorNamePost = "Ирина",
        authorNameComments = "Иван",
        comments = "",
    )
    forum.publishesPost()
    forum.postingCommentPost()

}

open class Forum(
    var messageText: String,
    val authorNamePost: String,
    val authorNameComments: String,
)

class ForumComments(
    messageText: String,
    authorNamePost: String,
    authorNameComments: String,
    var comments: String,
) : Forum(messageText, authorNamePost, authorNameComments) {

    fun publishesPost() {
        println("Введите сообщение:")
        val messageText = readln()
        println("Автор:$authorNamePost \n$messageText")
    }

    fun postingCommentPost() {
        println("Комментарий к посту:")
        val comments = readln()
        println("Автор: $authorNameComments \n$comments")
    }
}