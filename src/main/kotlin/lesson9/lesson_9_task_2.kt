package lesson9

import java.util.Arrays.equals


fun main() {
    val recipe = mutableListOf("творог", "яйца", "сахар")
    recipe.forEach {
        println(it)
    }
    println("В рецепте есть базовые ингредиенты: $recipe")
    println("Желаете добавить еще да/нет?")
    val userResponse = readln()

    if (userResponse.equals("ДА", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        val ingredientUser = readln()
        recipe.add(ingredientUser)
        println("Теперь в рецепте есть следующие ингредиенты: $recipe")
    }
}
