package lesson19

fun main() {
    for (i in Fish.values()) informUser(i)
}

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}

fun informUser(fish: Fish) {
    when (fish) {
        Fish.GUPPY -> println("Гуппи")
        Fish.ANGELFISH -> println("Cкалярия")
        Fish.GOLDFISH -> println("Золотая рыбка")
        Fish.SIAMESE_FIGHTING_FISH -> println("Петушок")
    }
}



