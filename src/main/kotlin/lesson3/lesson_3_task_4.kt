package lesson3

fun main(){
    var whenceMove = "E2"
    var whereMove = "E4"
    var moveNumber = "1"
    var moveResult = ("$whenceMove; $whereMove; $moveNumber")
    println(moveResult)
    whenceMove = "D2"
    whereMove = "D3"
    moveNumber = "2"
    moveResult = ("$whenceMove; $whereMove; $moveNumber")
    println(moveResult)
}
