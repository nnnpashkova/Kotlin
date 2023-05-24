package lesson8

fun main() {
    val recipe = arrayOf("молоко", "яйца", "мука", "масло", "сахар", "соль")
    println("Введите название ингридиента:")
    val ingredientName = readln()

    for (ingredient in recipe) {
        if (ingredientName == ingredient) {
            println("Ингредиент $ingredient в рецепте есть")
        } else {
            println("Такого ингредиента в рецепте нет")
        }
        break
    }
}