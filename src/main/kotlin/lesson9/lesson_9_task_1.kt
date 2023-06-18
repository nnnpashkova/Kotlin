package lesson9

fun main(){
    val ingredients = listOf("молоко", "яйца", "мука", "масло", "сахар", "соль")
    println("В рецепте есть следующие ингредиенты: $ingredients")
    ingredients.forEach {
        println(it)
    }
}