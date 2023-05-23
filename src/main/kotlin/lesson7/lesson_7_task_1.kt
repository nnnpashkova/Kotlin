package lesson7

fun main() {
    for (index in 0..6) {
        val firstCharacter = (0..10).random()
        val secondCharacter = ('a'..'z').random()
        val charResult = if (index % 2 == 0) {
            firstCharacter
        } else {
            secondCharacter
        }
        print("$charResult")
    }

}


