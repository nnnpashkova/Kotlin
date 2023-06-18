package lesson4

fun main(){
    val reservedTablesForToday = 13
    val reservedTablesForTomorrow = 9
    val tableAvailabilityToday = reservedTablesForToday > SEATS_IN_THE_RESTAURANT
    val tableAvailabilityTomorrow = reservedTablesForTomorrow < SEATS_IN_THE_RESTAURANT
    println("Доступноость столиков на сегодня: $tableAvailabilityToday \nДоступноость столиков на завтра: $tableAvailabilityTomorrow")
}
 const val SEATS_IN_THE_RESTAURANT = 13