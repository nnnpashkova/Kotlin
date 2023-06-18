package lesson5

fun main(){
    println("Bведите логин:")
    val loginInput = readln()
    val loginAnswerCorrect = loginInput == LOGIN

    if (loginAnswerCorrect){
        println("Введите введите пароль:")
    } else {
        println("Такой аккаунт не зарегистрирован. Зарегистрироваться?")
    }
    val passwordInput = readln()
    if (passwordInput == PASSWORD){
        println("Авторизация прошла успешно. Добро пожаловать!")
    } else {
        println("Ошибка авторизации")
    }
}
const val LOGIN = "Batman"
const val PASSWORD = "password"

