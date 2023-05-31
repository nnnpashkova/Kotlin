package lesson13

fun main() {
    val number: Long
    try {
        val strNumber = readLine().toString()
        number = strNumber.toLong()
        println(number)
    } catch (n: NumberFormatException) {
        println("Hомер может содержать только  цифры. Нельзя использовать операторы ветвления и элвис оператор.")
    }

}
