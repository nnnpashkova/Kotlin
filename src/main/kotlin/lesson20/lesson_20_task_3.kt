package lesson20

fun main() {
    val player = Player(haveKey = true)
    val checkForKey: (Player) -> String = {
        if (it.haveKey) {
            "Игрок дверь открыл"
        } else {
            "Дверь закрыта"
        }
    }
    println(checkForKey(player))
}

class Player(val haveKey: Boolean)

