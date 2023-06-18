package lesson12

fun main() {
    val weatherForecast1 = WeatherForecast(
        daytimeWeather = 25,
        weatherNight = 15,
        rain = false,
        atmospherePressure = 757,
        airTemperature = "+",
        measure = "мм",
    )


    val weatherForecast2 = WeatherForecast(
        daytimeWeather = 2,
        weatherNight = 10,
        rain = true,
        atmospherePressure = 700,
        airTemperature = "-",
        measure = "мм",
    )


    val weatherForecast3 = WeatherForecast(
        daytimeWeather = 33,
        weatherNight = 29,
        rain = false,
        atmospherePressure = 770,
        airTemperature = "+",
        measure = "мм",
    )


    weatherForecast1.print()
    println()
    weatherForecast2.print()
    println()
    weatherForecast3.print()
}

class WeatherForecast(
    var daytimeWeather: Int = 25,
    var weatherNight: Int = 15,
    var rain: Boolean = false,
    var atmospherePressure: Int = 757,
    var airTemperature: String = "+",
    var measure: String = "мм",
) {

    fun print() {
        println("Температура днем: $airTemperature$daytimeWeather")
        println("Температура ночью: $airTemperature$weatherNight")
        println("Есть ли дождь: $rain")
        println("Атмосферное давление: $atmospherePressure$measure")

    }
}