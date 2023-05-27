package lesson10

fun main() {
    println("Введите количество символов:")
    val passwordLength = readln().toInt()
    val randomString = steamGeneration(passwordLength)
    println(randomString)

}

fun steamGeneration(length: Int): String {
    val charset = "0123456789 !\"#\$%&'()*+,-./"
    return (1..length)
        .map { charset.random() }
        .joinToString("")

}