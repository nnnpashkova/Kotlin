package lesson12

fun main() {

    val weatherForecast1 = Day(
        daytimeWeather = 25,
        weatherNight = 15,
        rain = false,
        atmospherePressure = 757,
        airTemperature = "+",
        measure = "мм",
    )

    val weatherForecast2 = Day(
        daytimeWeather = 2,
        weatherNight = 10,
        rain = true,
        atmospherePressure = 700,
        airTemperature = "-",
        measure = "мм",
    )

    val weatherForecast3 = Day(
        daytimeWeather = 33,
        weatherNight = 29,
        rain = false,
        atmospherePressure = 770,
        airTemperature = "+",
        measure = "мм",
    )

}

class Day(
    var daytimeWeather: Int = 25,
    var weatherNight: Int = 15,
    var rain: Boolean = false,
    var atmospherePressure: Int = 757,
    var airTemperature: String = "+",
    var measure: String = "мм",
) {
    init {
        println("Температура днем: $airTemperature$daytimeWeather")
        println("Температура ночью: $airTemperature$weatherNight")
        println("Есть ли дождь: $rain")
        println("Атмосферное давление: $atmospherePressure$measure")
        println()
    }

}
