package lesson1

fun main() {
    val seconds = 6480
    val secondsInMinute = 60
    val minute = seconds / secondsInMinute
    val secondsRemain = seconds % secondsInMinute
    println(String.format("%02d:%02d", minute, secondsRemain))
}