package lesson19

fun main() {
    for (i in Fish.values()) informUser(i)
}

enum class Fish(val fishName: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Cкалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок"),
}

fun informUser(fish: Fish) {
    println(fish.fishName)
}



