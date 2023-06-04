package lesson15

fun main() {
    val temperature = Temperature("Cегодня средняя температура +", 20)
    val precipitation = Precipitation("Сегодня вероятность осадков", 0)

    temperature.serverConnection()
    temperature.sendingData()
    println()
    precipitation.serverConnection()
    precipitation.sendingData()

}

abstract class Message(
    val message: String,
) {
    abstract fun serverConnection()
    abstract fun sendingData()
}

class Temperature(
    message: String,
    val temperature: Int,
) : Message(message) {
    override fun serverConnection() {
        println("Сервер, данные температуры: \n$message$temperature")
    }

    override fun sendingData() {
        println("Данные температуры: \n$message$temperature")
    }
}

class Precipitation(
    message: String,
    val precipitation: Int,
) : Message(message) {
    override fun serverConnection() {
        println("Сервер, данные осадков: \n$message $precipitation%")
    }

    override fun sendingData() {
        println("Данные осадков: \n$message $precipitation%")
    }
}


