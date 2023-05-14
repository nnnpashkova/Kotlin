package lesson1

fun main(){
    val seconds = 6480
    val secondsInMinute= 60
    val minute = seconds/secondsInMinute
    val secondsRemain = seconds % secondsInMinute
    if(secondsRemain >= 10) {
        println("$minute:$secondsRemain")
    } else {
        println("$minute:0$secondsRemain")
    }
}