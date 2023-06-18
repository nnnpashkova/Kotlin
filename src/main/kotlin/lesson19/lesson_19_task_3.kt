package lesson19

fun main() {
    val spaceship = Spaceship(true, true, true)
    println(spaceship.takeOffTheShip())
    println(spaceship.landTheShip())
}

class Spaceship(
    val canTakeOff: Boolean,
    val canLand: Boolean,
    val canShootBack: Boolean,
) {
    fun takeOffTheShip() {
        //TODO здесь нужна информация о дополнительной логике
    }

    fun landTheShip() {
        TODO("NotImplementedError")
    }
}
