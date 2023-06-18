package lesson9

import java.util.*

fun main() {
    val recipes = mutableSetOf<String>()
    while (recipes.size != 5) {
        println("Введите ингридиент ${recipes.size + 1}:")
        val userIngredient = readln()
        recipes.add(userIngredient)
    }
    val sortedRecipes = recipes.sorted().toMutableList()
    val lastElement = sortedRecipes.last()
    sortedRecipes[sortedRecipes.lastIndex] = "$lastElement."

    val sortingString = sortedRecipes.joinToString()
    val capitalizedOutput = sortingString.
    replaceFirstChar{ if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }

    println(capitalizedOutput)
}


