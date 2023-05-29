package lesson10

fun main() {
    println("Введите количество символов:")
    val passwordLength = readln().toInt()
    val randomString = generatePassword(passwordLength)
    println(randomString)

}

fun generatePassword(length: Int): String {
    val charset = (0x20..0x39).asSequence().toList()
    return (1..length)
        .map { charset.random() }
        .joinToString("")
}