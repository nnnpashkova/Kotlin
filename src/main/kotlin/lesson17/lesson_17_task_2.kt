package lesson17

fun main() {
    val ship = Ship()
    ship.name = "Якорь"
    println("Название: ${ship.name} \nСкорость: ${ship.averageSpeed} узлов, \nПорт приписки: ${ship.port}")

}

class Ship {
    var name = "Алмаз"
        set(value) {
            println("Фаил перезаписать нельзя")
        }

    val averageSpeed = 40
    val port: String = "Алания"
}

