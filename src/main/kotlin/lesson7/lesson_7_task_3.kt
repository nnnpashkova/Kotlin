package lesson7

fun main() {
    println ("Введите число:")
    val userNumber = readln().toInt()

    for (number in 0.. userNumber){
       if (number % 2 == 0) {
           println(number)
        }
    }
}