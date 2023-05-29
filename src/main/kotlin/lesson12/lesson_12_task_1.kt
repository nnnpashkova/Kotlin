package lesson12

fun main() {
val weather1 = Weather()
    weather1.daytimeWeather = "+25"
    weather1.weatherNight = "+15"
    weather1.rain = false
    weather1.atmospherePressure = "757мм"

    val weather2 = Weather()
    weather2.daytimeWeather = "-10"
    weather2.weatherNight = "-20"
    weather2.rain = true
    weather2.atmospherePressure = "770мм"

    weather1.print()
    println()
    weather2.print()
}



class Weather() {
    var daytimeWeather = "+20"
    var weatherNight = "0"
    var rain = false
    var atmospherePressure = "759мм"

    fun print() {
        println(daytimeWeather)
        println(weatherNight)
        println(rain)
        println(atmospherePressure)
    }
}