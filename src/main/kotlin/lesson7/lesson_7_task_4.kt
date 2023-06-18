package lesson7

fun main() {
    println("Введите количество секунд: ")
    val userNumber = readln().toInt()

    for (i in 0..userNumber) {
        if (0 < userNumber) {
            println(i)
            Thread.sleep(1000)
        }
    }
    println("Время вышло")
}
