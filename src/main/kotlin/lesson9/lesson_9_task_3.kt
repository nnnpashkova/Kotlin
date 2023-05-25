package lesson9

fun main() {
    val recipe = listOf(2, 50, 15)
    println("Сколько порций омлета Вы хотите приготовить?")
    val userResponse = readln().toInt()
    val quantityIngredients = recipe.map {
        it * userResponse
    }
    println(
        "На $userResponse порций вам понадобится: Яиц - ${quantityIngredients[0]}, " +
                "молока - ${quantityIngredients[1]}, сливочного масла - ${quantityIngredients[2]}"
    )
}
