package lesson18

fun main() {
    val fox: Tamagotchi = Fox("Вероника", "ягоды", "играет", "спит")
    val dog: Tamagotchi = Dog("Лаки", "кости", "играет", "спит")
    val cat: Tamagotchi = Cat("Ярик", "рыбу", "играет", "спит")

    val arrayOffTamagotchi = arrayOf<Tamagotchi>(fox, dog, cat)
    showAllTamagotchi(arrayOffTamagotchi)
}

fun showAllTamagotchi(tamagotchi: Array<Tamagotchi>) {
    tamagotchi.forEach {
        println(it.printWhatEheAnimalEats())
        println(it.printAnimalPlaying())
        println(it.printAnimalSleeping())
        println()
    }
}

abstract class Tamagotchi(
    val name: String,
    val food: String,
    val play: String,
    val sleep: String,
) {
    abstract fun printWhatEheAnimalEats(): String
    abstract fun printAnimalPlaying(): String
    abstract fun printAnimalSleeping(): String
}

class Fox(
    name: String,
    food: String,
    play: String,
    sleep: String,
) : Tamagotchi(name, food, play, sleep) {
    override fun printWhatEheAnimalEats(): String {
        return "Лиса, имя: $name, кушает: $food"
    }

    override fun printAnimalPlaying(): String {
        return "Лиса, имя: $name, хобби: $play"
    }

    override fun printAnimalSleeping(): String {
        return "Лиса, имя: $name, $sleep"
    }

}

class Dog(
    name: String,
    food: String,
    play: String,
    sleep: String,
) : Tamagotchi(name, food, play, sleep) {
    override fun printWhatEheAnimalEats(): String {
        return "Собака, имя: $name, кушает: $food"
    }

    override fun printAnimalPlaying(): String {
        return "Собака, имя: $name, хобби: $play"
    }

    override fun printAnimalSleeping(): String {
        return "Собака, имя: $name, $sleep"
    }
}

class Cat(
    name: String,
    food: String,
    play: String,
    sleep: String,
) : Tamagotchi(name, food, play, sleep) {
    override fun printWhatEheAnimalEats(): String {
        return "Кот, имя: $name, кушает: $food"
    }

    override fun printAnimalPlaying(): String {
        return "Кот, имя: $name, хобби: $play"
    }

    override fun printAnimalSleeping(): String {
        return "Кот, имя: $name, $sleep"
    }
}