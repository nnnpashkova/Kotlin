package lesson11

fun main() {
val user1 = User (
    id = 1,
    login = "andrey1990@gmail.ru",
    password = "123andrey",
    mail = "andrey1990@gmail.ru",
    bio = "",
)
 user1.displayingUserInformation()
    println("Введите инфомацию о себе:")
    user1.readingInformationAboutUsers()
    user1.changePassword()
    user1.sendAMessage(text = user1.mail )

}
