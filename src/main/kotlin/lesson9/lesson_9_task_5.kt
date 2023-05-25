package lesson9

fun main() {
    val recipes = mutableSetOf<String>()
    while (recipes.size != 5){
        println("Введите ингридиент ${recipes.size + 1}:")
        val userIngredient = readln()
        recipes.add(userIngredient)
    }
    val result = "${recipes.sorted().joinToString().capitalize()}."
    println(result)
}


