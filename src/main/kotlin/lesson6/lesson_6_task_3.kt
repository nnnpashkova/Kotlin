package lesson6

fun main() {
    var timeEnteredUser = readln().toInt()

    while (timeEnteredUser > 0) {
        println("Осталось ${--timeEnteredUser} секунд")
        if (timeEnteredUser == 0) {
            println("Время вышло")
        }
        Thread.sleep(1000)
    }
}