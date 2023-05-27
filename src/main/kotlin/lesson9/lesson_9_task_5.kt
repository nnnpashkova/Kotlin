package lesson9

import java.util.*

fun main() {
    val recipes = mutableSetOf<String>()
    while (recipes.size != 5){
        println("Введите ингридиент ${recipes.size + 1}:")
        val userIngredient = readln()
        recipes.add(userIngredient)
    }
    val result = "${recipes.sorted().joinToString()
        .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }}."
    println(result)
}


