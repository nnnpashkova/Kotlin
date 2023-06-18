package lesson14

fun main() {
    val listOfSatellites = listOf(
        Satellite(
            "Ариэль",
            false,
            false,
            false
        ),
        Satellite(
            "Титан",
            false,
            false,
            false,
        )
    )

    val planet = Planet(
        name = "Уран",
        haveAnAtmosphere = false,
        hasWater = false,
        suitableForLanding = false,
        satellites = listOfSatellites
    )
    planet.printInfo()
}

open class СelestialBodies(
    val name: String,
    val haveAnAtmosphere: Boolean,
    val hasWater: Boolean,
    val suitableForLanding: Boolean
) {
    open fun printInfo() {
        println("$name, $haveAnAtmosphere, $hasWater, $suitableForLanding")
    }
}

class Satellite(
    name: String,
    haveAnAtmosphere: Boolean,
    hasWater: Boolean,
    suitableForLanding: Boolean,
) : СelestialBodies(name, haveAnAtmosphere, hasWater, suitableForLanding) {
    override fun printInfo() {
        println("Спутник:")
        super.printInfo()
    }
}

class Planet(
    name: String,
    haveAnAtmosphere: Boolean,
    hasWater: Boolean,
    suitableForLanding: Boolean,
    val satellites: List<Satellite>,
) : СelestialBodies(name, haveAnAtmosphere, hasWater, suitableForLanding) {

    override fun printInfo() {
        super.printInfo()
        satellites.forEach {
            it.printInfo()
        }

    }

}