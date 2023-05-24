package lesson8

fun main() {
    val recipe = arrayOf("молоко", "яйца", "мука", "масло", "сахар", "соль")
    println("Ингредиенты для приготовления блинов: ${recipe.joinToString()}")

    println("Введите ингредиент:")
    val userIngredient = readln()

    if (recipe.contains(userIngredient)) {
        println("Ингредиент $userIngredient в рецепте есть \nНа какой ингредиент хотите заменить:")
        val userIngredientReplacement = readln()

        val indexIngredient = recipe.indexOf(userIngredient)
        recipe[indexIngredient] = userIngredientReplacement
        print("Готово! Вы сохранили следующий список: ${recipe.joinToString()}")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}
