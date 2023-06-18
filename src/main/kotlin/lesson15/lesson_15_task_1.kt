package lesson15

fun main() {
    val crucian = Сrucian("Карась")
    val gull = Gull("Чайка")
    val duck = Duck("Утка")

    crucian.floats()
    gull.floats()
    gull.flies()
    duck.floats()
    duck.flies()
}

interface FloatingModeMovement {
    fun floats()
}

interface FlyingModeTransportation {
    fun flies()
}

class Сrucian(val name: String) : FloatingModeMovement {
    override fun floats() {
        println("$name плавает")
    }
}

class Gull(val name: String) : FloatingModeMovement, FlyingModeTransportation {
    override fun floats() {
        println("$name плавает")
    }

    override fun flies() {
        println("$name летает")
    }
}

class Duck(val name: String) : FloatingModeMovement, FlyingModeTransportation {
    override fun floats() {
        println("$name плавает")
    }

    override fun flies() {
        println("$name летает")
    }
}
