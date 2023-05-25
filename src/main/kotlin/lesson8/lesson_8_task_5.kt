package lesson8

fun main() {
    println("Введите количество ингредиентов:")
    val quantityIngredients = readln().toInt()
    val ingredientsArray = arrayOfNulls<String>(quantityIngredients)
    for (i in 0..quantityIngredients) {
       println("Введите ингредиент:")
        val ingredient = readln()
        ingredientsArray[i] = ingredient
    }
}