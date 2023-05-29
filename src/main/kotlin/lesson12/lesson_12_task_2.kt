package lesson12

fun main() {
    val weather1 = WeatherForecast(
        daytimeWeather = "+25",
        weatherNight = "+15",
        rain = false,
        atmospherePressure = "757мм"
    )


    val weather2 = WeatherForecast(
        daytimeWeather = "-10",
        weatherNight = "-20",
        rain = true,
        atmospherePressure = "770мм"
    )

    weather1.print()
    println()
    weather2.print()
}

class WeatherForecast(
    val daytimeWeather: String,
    val weatherNight: String,
    val rain: Boolean,
    val atmospherePressure: String,
) {
    fun print() {
        println(daytimeWeather)
        println(weatherNight)
        println(rain)
        println(atmospherePressure)
    }
}