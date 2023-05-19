package lesson4

fun main() {
     val day = 5
     val training = (day % 2) == 0

    println("Упражнения для рук: ${!training} \nУпражнения для ног: $training \nУпражнения для спины: $training \nУпражнения для пресса: ${!training}")
}