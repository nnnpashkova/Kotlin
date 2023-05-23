package lesson7

fun main() {1
    println("Введите число:")
    val userNumber = readln().toInt()
    for(i in 0.. userNumber){
       if (i % 2 == 0) {
           println(i)
        }
    }
}