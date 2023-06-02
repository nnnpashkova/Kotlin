package lesson14


fun main() {
    val cargoShip1 = CargoShip(
        shipType = "Грузовой",
        name = "Алмаз",
        speed = 20,
        loadCapacity = 500,
        cargoType = " скоропортящиеся"

    )

    val shipIcebreaker1 = ShipIcebreaker(
        shipType = "Ледокол",
        name = "Арктика",
        speed = 80,
        loadСapacity = 90,
        isIcebreaker = true,
        caseThickness = 48
    )

    cargoShip1.printCargoShip()
    println()
    shipIcebreaker1.printShipIcebreaker()
    shipIcebreaker1.printIsIcebreaker()
}

open class Ship(
    val shipType: String,
    val name: String,
    val speed: Int,
    val loadCapacity: Int,
    val isIcebreaker: Boolean = false,
)

private class CargoShip(
    shipType: String,
    name: String,
    speed: Int,
    loadCapacity: Int,
    val cargoType: String,
) : Ship(shipType, name, speed, loadCapacity) {

    fun printCargoShip() {
        println("Тип коробля: $shipType")
        println("Название: $name")
        println("Скорость: $speed")
        println("Грузоподъемность: $loadCapacity")
        println("Тип груза: $cargoType")
    }

}

private class ShipIcebreaker(
    shipType: String,
    name: String,
    speed: Int,
    loadСapacity: Int,
    isIcebreaker: Boolean,
    val caseThickness: Int,
) : Ship(shipType, name, speed, loadСapacity, isIcebreaker) {

    fun printIsIcebreaker() {
        println("Ледокол может колоть лед: $isIcebreaker")
    }

    fun printShipIcebreaker() {
        println("Тип коробля: $shipType")
        println("Название: $name")
        println("Скорость: $speed")
        println("Грузоподъемность: $loadCapacity")
        println("Толщина корпуса в местах ломки льда: $caseThickness мм")
    }

}