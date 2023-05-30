package lesson12

fun main() {
val weather1 = Weather()
    weather1.daytimeWeather = 25
    weather1.weatherNight = 15
    weather1.isRaining = false
    weather1.atmospherePressure = 757

    val weather2 = Weather()
    weather2.daytimeWeather = 10
    weather2.weatherNight = 20
    weather2.isRaining = true
    weather2.atmospherePressure = 770

    weather1.print()
    println()
    weather2.print()
}

class Weather {
    var daytimeWeather = 20
    var weatherNight = 0
    var isRaining = false
    var atmospherePressure = 759


    fun print() {
        println("Погода днем: $daytimeWeather")
        println("Погода ночью: $weatherNight")
        println("Есть ли сегодня дождь: $isRaining")
        println("Атмосферное давление: $atmospherePressure")
    }
}