package lesson4

fun main(){
    println("Повреждение на коробле да/нет:")
    val damage = readln().toBoolean()
    println("Количество человек в команде:")
    val numberTeam = readln().toInt()
    println("Количество провизии:")
    val provisions = readln().toInt()
    println("Погодные условия благоприятные/ не благоприятные:")
    val weather = readln()

    val condition1 = damage == DAMAGE_ON_THE_SHIP &&
            numberTeam in MINIMUM_NUMBER_OF_TEAM until MAXIMUM_NUMBER_OF_TEAM &&
            provisions >= QUANTITY_PROVISIONS
    val condition2 = damage != DAMAGE_ON_THE_SHIP &&
            numberTeam == MAXIMUM_NUMBER_OF_TEAM &&
            provisions >= QUANTITY_PROVISIONS && weather == WEATHER_CONDITIONS

    val commandData = condition1 || condition2
    println("Может ли команда отправляться в длительное плавание: $commandData")
}
const val DAMAGE_ON_THE_SHIP = false
const val MINIMUM_NUMBER_OF_TEAM = 55
const val MAXIMUM_NUMBER_OF_TEAM = 70
const val QUANTITY_PROVISIONS = 50
const val WEATHER_CONDITIONS = "благоприятные"