package lesson10

fun main() {
    println("Введите количество символов:")
    val passwordLength = readln().toInt()
    val randomString = generatePassword(passwordLength)
    println(randomString)

}

fun generatePassword(length: Int): String {
    val charset = (' '..'9')
    return (1..length)
        .map { charset.random() }
        .joinToString("")
}