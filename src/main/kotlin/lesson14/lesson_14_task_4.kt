package lesson14

fun main() {
    val satellite = listOf(
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
        haveWater = false,
        suitableForLanding = false,
        satellite = satellite
    )
    planet.printInfo()
}

open class СelestialBodies(
    val name: String,
    val haveAnAtmosphere: Boolean,
    val haveWater: Boolean,
    val suitableForLanding: Boolean
) {
    open fun printInfo() {
        println("$name, $haveAnAtmosphere, $haveWater, $suitableForLanding")
    }
}

class Satellite(
    name: String,
    haveAnAtmosphere: Boolean,
    haveWater: Boolean,
    suitableForLanding: Boolean,
) : СelestialBodies(name, haveAnAtmosphere, haveWater, suitableForLanding) {
    override fun printInfo() {
        println("Спутник:")
        super.printInfo()
    }
}

class Planet(
    name: String,
    haveAnAtmosphere: Boolean,
    haveWater: Boolean,
    suitableForLanding: Boolean,
    val satellite: List<Satellite>,
) : СelestialBodies(name, haveAnAtmosphere, haveWater, suitableForLanding) {

    override fun printInfo() {
        super.printInfo()
        satellite.forEach {
            it.printInfo()
        }

    }

}