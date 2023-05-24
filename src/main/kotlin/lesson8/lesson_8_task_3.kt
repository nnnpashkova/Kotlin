package lesson8

fun main() {
    val recipe = arrayOf("молоко", "яйца", "мука", "масло", "сахар", "соль")
    println("Введите название ингридиента:")
    val ingredientName = readln()
    if (recipe.contains(ingredientName)) {
        println("Ингредиент $ingredientName в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}