package lesson15

fun main() {
    val truck = Truck(
        1,
        2
    )
    val passengerCar1 = PassengerCar(3)
    val passengerCar2 = PassengerCar(2)
    truck.drive()
    truck.carryPassenger()
    truck.carryCargo()
    println()
    passengerCar1.drive()
    passengerCar1.carryPassenger()
    println()
    passengerCar2.drive()
    passengerCar2.carryPassenger()
}

interface MovementCars {
    fun drive()
}

interface PassengersTransportation {
    fun carryPassenger()
}

interface CargoTransportation {
    fun carryCargo()
}

abstract class Car(
    val numberPassengers: Int,
)

class Truck(
    numberPassengers: Int,
    val amountСargo: Int
) : Car(numberPassengers), MovementCars, PassengersTransportation, CargoTransportation {

    init {
        check(numberPassengers in 0..1) { "Количество пассажиров должно быть не более 1, а было передано $numberPassengers" }
    }

    override fun drive() = println("Грузовая машина движется")
    override fun carryPassenger() = println("В машине пассажиров: $numberPassengers человек")
    override fun carryCargo() = println("Машина везет: $amountСargo тонны")
}

class PassengerCar(
    numberPassengers: Int
) : Car(numberPassengers), MovementCars, PassengersTransportation {

    init {
        check(numberPassengers in 0..3) { "Количество пассажиров должно быть не более 3, а было передано $numberPassengers" }
    }

    override fun drive() = println("Легковая машина движется")
    override fun carryPassenger() = println("В машине пассажиров:$numberPassengers человек")
}