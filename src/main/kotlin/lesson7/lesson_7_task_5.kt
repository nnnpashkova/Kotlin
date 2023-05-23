package lesson7

fun main() {
    println("Введите количество символов:")
    val length = readln().toInt()
    val randomString = getRandomString(length)
    println(randomString)
}

fun getRandomString(length: Int): String {
    val charset = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    return (1..length)
        .map { charset.random() }
        .joinToString("")
}