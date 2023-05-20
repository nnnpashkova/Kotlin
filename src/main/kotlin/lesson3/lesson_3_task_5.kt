package lesson3

fun main() {
    val moveResult = "D2-D4;0"
    val delim = "-"
    val delimTwo = ";"
    val list = moveResult.split(delim, delimTwo)

    val whenceMove = list[0]
    val whereMove = list[1]
    val moveNumber = list[2]

    println("$whenceMove \n$whereMove \n$moveNumber" )
}