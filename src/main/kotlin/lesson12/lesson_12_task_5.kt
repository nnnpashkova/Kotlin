package lesson12

fun main() {

    var daySummerList = mutableListOf<Day>()

    var averageDaytimeWeather = 0
    var averageWeatherNight = 0
    var averageAtmospherePressure = 0

    var sumDaytimeWeather = 0
    var sumWeatherNight = 0
    var sumAtmospherePressure = 0
    var sumRainDays = 0

    for (i in 0 until AMOUNT_OF_DAYS) {

        val daySummer = Day(
            daytimeWeather = (10..40).random(),
            weatherNight = (10..40).random(),
            rain = (0..1).random() == 1,
            atmospherePressure = (700..780).random(),
        )
        daySummerList.add(daySummer)
    }

    daySummerList.forEach {
        sumDaytimeWeather += it.daytimeWeather
        sumWeatherNight += it.weatherNight
        sumAtmospherePressure += it.atmospherePressure
        if (it.rain) {
         sumRainDays++
        }
    }

    averageDaytimeWeather = sumDaytimeWeather /AMOUNT_OF_DAYS
    averageWeatherNight = sumWeatherNight /AMOUNT_OF_DAYS
    averageAtmospherePressure = sumAtmospherePressure /AMOUNT_OF_DAYS

    println("Cреднее значение по температуре днем: $averageDaytimeWeather")
    println("Cреднее значение по температуре ночью: $averageWeatherNight")
    println("Cреднее значение атмосферного давления: $averageAtmospherePressure")
    println("Количество дождливых дней: $sumRainDays")

}


class Day(
    var daytimeWeather: Int,
    var weatherNight: Int,
    var rain: Boolean,
    var atmospherePressure: Int,
    var airTemperature: String = "+",
    var measure: String = "мм",
)

const val AMOUNT_OF_DAYS = 10