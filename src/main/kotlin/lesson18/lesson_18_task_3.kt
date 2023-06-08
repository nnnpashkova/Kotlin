package lesson18

fun main() {
    val fox: Tamagotchi = Fox("Вероника", "ягоды")
    val dog: Tamagotchi = Dog("Лаки", "кости")
    val cat: Tamagotchi = Cat("Ярик", "рыбу")

    val arrayOffTamagotchi = arrayOf<Tamagotchi>(fox, dog, cat)
    showAllTamagotchi(arrayOffTamagotchi)
}

fun showAllTamagotchi(tamagotchi: Array<Tamagotchi>) {
    tamagotchi.forEach { println(it.printWhatЕheAnimalEats()) }
}

open class Tamagotchi(
    val name: String,
    val food: String,
) {
    open fun printWhatЕheAnimalEats() = ""
}

class Fox(
    name: String,
    food: String
) : Tamagotchi(name, food) {
    override fun printWhatЕheAnimalEats(): String {
        return "Лиса, имя: $name, кушает: $food"
    }
}

class Dog(
    name: String,
    food: String
) : Tamagotchi(name, food) {
    override fun printWhatЕheAnimalEats(): String {
        return "Собака, имя: $name, кушает: $food"
    }
}

class Cat(
    name: String,
    food: String
) : Tamagotchi(name, food) {
    override fun printWhatЕheAnimalEats(): String {
        return "Кот, имя: $name, кушает: $food"
    }
}