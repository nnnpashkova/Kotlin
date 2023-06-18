package lesson9

fun main() {
    println("Введите пять ингредиентов блюда:")
    val userInput = readln()
    val delim = ","
    val splitList = userInput.split(delim)
    println(splitList.sorted())
}

