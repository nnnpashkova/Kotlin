package lesson20

fun main() {
    val player = Player("Ярик", 50, 100)
    val healingPotion: (Player) -> Unit = { println("Игрок ${player.name}, здоровье: ${player.currentHealth}%") }
    healingPotion(player)
}

class Player(
    val name: String,
    val currentHealth: Int,
    val maximumHealth: Int,
)
