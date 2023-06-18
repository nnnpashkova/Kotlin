package lesson14

fun main() {
    val standardShip1 = StandardShip(
        shipType = "Стандартный",
        name = "Титан",
        speed = 50,
        loadСapacity = 100,
        isIcebreaker = false,
    )

    val standardShip2 = StandardShip(
        shipType = "Грузовой",
        name = "Алмаз",
        speed = 20,
        loadСapacity = 500,
        isIcebreaker = false,
    )

    val standardShip3 = StandardShip(
        shipType = "Ледокол",
        name = "Арктика",
        speed = 80,
        loadСapacity = 90,
        isIcebreaker = true,
    )
    standardShip1.printSpeed()
    standardShip2.printSpeed()
    standardShip3.printSpeed()
    standardShip1.printLoadCapacity()
    standardShip2.printLoadCapacity()
    standardShip3.printLoadCapacity()

    standardShip1.printShipProperties()
    standardShip2.printShipProperties()
    standardShip3.printShipProperties()
}

class StandardShip(
    val shipType: String,
    val name: String,
    val speed: Int,
    val loadСapacity: Int,
    val isIcebreaker: Boolean,
) {
    fun printSpeed() {
        println("$speed узлов")
    }

    fun printLoadCapacity() {
        println(loadСapacity)
    }

    fun printShipProperties() {
        println("Тип коробля: $shipType")
        println("Название: $name")
        println("Скорость: $speed")
        println("Грузоподъемность: $loadСapacity")
        println("Ледокол: $isIcebreaker")
        println()
    }

}