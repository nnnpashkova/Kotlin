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

    cargoShip1.printShip()
    println()
    shipIcebreaker1.printShip()
    shipIcebreaker1.printIsIcebreaker()
}

open class Ship(
    val shipType: String,
    val name: String,
    val speed: Int,
    val loadCapacity: Int,
    val isIcebreaker: Boolean = false,
) {
    open fun printShip() {
        println("Тип коробля: $shipType")
        println("Название: $name")
        println("Скорость: $speed")
        println("Грузоподъемность: $loadCapacity")
    }
}

private class CargoShip(
    shipType: String,
    name: String,
    speed: Int,
    loadCapacity: Int,
    val cargoType: String,
) : Ship(shipType, name, speed, loadCapacity) {


    override fun printShip() {
        super.printShip()
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

    override fun printShip() {
        super.printShip()
        println("Толщина корпуса в местах ломки льда: $caseThickness мм")
    }

}

