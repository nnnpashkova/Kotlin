package lesson15

fun main() {
    val temperature = Temperature("Cегодня средняя температура +", 20)
    val precipitation = Precipitation("Сегодня вероятность осадков", 0)

    temperature.connectServer()
    temperature.sendData()
    println()
    precipitation.connectServer()
    precipitation.sendData()

}

abstract class Message(
    val message: String,
) {
    abstract fun connectServer()
    abstract fun sendData()
}

class Temperature(
    message: String,
    val temperature: Int,
) : Message(message) {
    override fun connectServer() {
        println("Сервер, данные температуры: \n$message$temperature")
    }

    override fun sendData() {
        println("Данные температуры: \n$message$temperature")
    }
}

class Precipitation(
    message: String,
    val precipitation: Int,
) : Message(message) {
    override fun connectServer() {
        println("Сервер, данные осадков: \n$message $precipitation%")
    }

    override fun sendData() {
        println("Данные осадков: \n$message $precipitation%")
    }
}


