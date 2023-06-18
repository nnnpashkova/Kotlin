package lesson19

fun main() {
    val tank = Tank(Сartridges.FIVE)
    tank.fireShot()
    tank.equipWithNewTypeOfAmmo(Сartridges.TEN)
    tank.fireShot()
    tank.equipWithNewTypeOfAmmo(Сartridges.TWENTY)
    tank.fireShot()
}

enum class Сartridges(val damage: Int) {
    FIVE(5),
    TEN(10),
    TWENTY(20)
}

class Tank(var impactForce: Сartridges) {
    fun equipWithNewTypeOfAmmo(cartridges: Сartridges) {
        impactForce = cartridges
    }

    fun fireShot() {
        println("Танк наносит ударов: ${impactForce.damage}")
    }
}