package lesson6

fun main(){
    var timeEnteredUser = readln().toInt()

    while (timeEnteredUser > 0) {
        println("Прошло ${--timeEnteredUser} секунд")
        Thread.sleep(1000)
    }
}