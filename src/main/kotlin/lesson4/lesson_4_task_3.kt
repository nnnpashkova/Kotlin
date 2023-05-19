package lesson4

fun main(){
    val isSunny = true
    val isAwningOpen = true
    val humidityToday = 20
    val seasonToday = "winter"
    val conditionsWeatherToday = isSunny == SUNNY_WEATHER && isAwningOpen == AWNING_OPEN && humidityToday == HUMIDITY && seasonToday != SEASON
    println("Благоприятные ли условия сейчас для роста бобовых? $conditionsWeatherToday")
}
const val SUNNY_WEATHER = true
const val AWNING_OPEN = true
const val HUMIDITY = 20
const val SEASON = "winter"
