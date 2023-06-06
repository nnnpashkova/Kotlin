package lesson17

fun main() {
    val package1 = Package()
    package1.location = "Кисловодск"
    println("Местоположение поссылки: ${package1.location}")
    println("${package1.displacementCounter}")
}

class Package() {
    private val number: Int = 2356
    var displacementCounter = 0
    var location: String = "Калининград"
        set(value) {
           displacementCounter++
            field = value
        }
}