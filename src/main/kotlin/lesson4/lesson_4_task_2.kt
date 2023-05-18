package lesson4

fun main() {
    val weightFirstCargo = 20
    val volumeFirstCargo = 80
    val weightSecondCargo = 50
    val volumeSecondCargo = 100
    println("Average для груза с весом 20 кг и объемом 80 л: ${weightFirstCargo >= WEIGHT_FROM && volumeFirstCargo <= VOLUME_UP_TO} " +
            "\nAverage для груза с весом 50 кг и объемом 100 л: ${weightSecondCargo <= WEIGHT_UP_TO && volumeSecondCargo < VOLUME_UP_TO}")
}

const val WEIGHT_FROM = 35
const val WEIGHT_UP_TO = 100
const val VOLUME_UP_TO = 100

