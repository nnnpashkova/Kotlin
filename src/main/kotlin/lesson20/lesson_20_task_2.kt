package lesson20

fun main() {
    val player = Player("Ярик", 50, 100)
    val healingPotion: (Player) -> String = { "Игрок ${player.name}, здоровье: ${player.currentHealth}%" }
    println(healingPotion.invoke(player))
}

class Player(
    val name: String,
    val currentHealth: Int,
    val maximumHealth: Int,
)
