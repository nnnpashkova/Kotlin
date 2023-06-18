package lesson17

fun main() {
    val package1 = Package(2356, "Краснодар")
    package1.location = "Кисловодск"
    println("Местоположение поссылки: ${package1.location}")
    println("${package1.displacementCounter}")
}

class Package(number: Int, location: String,) {
    private val number = number
    var displacementCounter = 0
    var location: String = location
        set(value) {
           displacementCounter++
            field = value
        }
}