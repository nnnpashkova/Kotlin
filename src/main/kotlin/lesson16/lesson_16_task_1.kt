package lesson16

fun main() {
    var gameCude = GameCube(
        namder = (1..6).random()
    )
    gameCude.showNumber()

}

class GameCube(
    private val namder:Int
){
   fun showNumber() {
       println("Число от 1 до 6: $namder")
   }

}