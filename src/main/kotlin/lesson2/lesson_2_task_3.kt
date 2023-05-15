package lesson2
fun main(){
    val theTrainLeftInHours = 9
    val theTrainLeftInMinutes = 39
    val travelTimeMinute = 457
    val hourOfMinutes= 60
    val theTrainHasLeft = (9*60)+39
    val travelTimeInMinutesTotal = travelTimeMinute+theTrainHasLeft
    val travelTimeInHours = travelTimeInMinutesTotal/hourOfMinutes
    val travelTimeInMinutes = travelTimeInMinutesTotal%hourOfMinutes
    println("$travelTimeInHours:$travelTimeInMinutes")
}
