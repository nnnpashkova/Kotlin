package lesson12

fun main() {
    val weatherForecast1 = WeatherForecast()
    weatherForecast1.daytimeWeather = 25
    weatherForecast1.weatherNight = 15
    weatherForecast1.rain = false
    weatherForecast1.atmospherePressure = 757
    weatherForecast1.airTemperature = "+"
    weatherForecast1.measure = "мм"

    val weatherForecast2 = WeatherForecast()
    weatherForecast2.daytimeWeather = 2
    weatherForecast2.weatherNight = 10
    weatherForecast2.rain = true
    weatherForecast2.atmospherePressure = 700
    weatherForecast2.airTemperature = "-"
    weatherForecast2.measure = "мм"

    val weatherForecast3 = WeatherForecast()
    weatherForecast3.daytimeWeather = 33
    weatherForecast3.weatherNight = 29
    weatherForecast3.rain = false
    weatherForecast3.atmospherePressure = 770
    weatherForecast3.airTemperature = "+"
    weatherForecast3.measure = "мм"

    weatherForecast1.print()
    println()
    weatherForecast2.print()
    println()
    weatherForecast3.print()
}

class WeatherForecast {
    var daytimeWeather = 25
    var weatherNight = 15
    var rain = false
    var atmospherePressure = 757
    var airTemperature = "+"
    var measure = "мм"
    fun print() {
        println("Температура днем: $airTemperature$daytimeWeather")
        println("Температура ночью: $airTemperature$weatherNight")
        println("Есть ли дождь: $rain")
        println("Атмосферное давление: $atmospherePressure$measure")

    }
}