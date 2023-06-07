package lesson17

fun main() {
    val ship = Ship()
    ship.rewriteError = "Фаил перезаписать нельзя"
    ship.name = "Якорь"
    println("Название: ${ship.name} \nСкорость: ${ship.averageSpeed} узлов, \nПорт приписки: ${ship.port}")

}

class Ship {
    var rewriteError = ""
    var name = "Алмаз"
     get() = field
    set(value) {
      field = rewriteError
    }

    val averageSpeed = 40
    val port: String = "Алания"
}

