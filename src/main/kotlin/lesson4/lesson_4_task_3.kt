package lesson4

fun main(){
    val weatherToday = "sunny"
    val awningToday = "open"
    val humidityToday = 20
    val seasonToday = "winter"
    val conditionsWeatherToday = weatherToday == WEATHER && awningToday == AWNING && humidityToday == HUMIDITY && seasonToday != SEASON
    println("Благоприятные ли условия сейчас для роста бобовых? $conditionsWeatherToday")
}
const val WEATHER = "sunny"
const val AWNING = "open"
const val HUMIDITY = 20
const val SEASON = "winter"
