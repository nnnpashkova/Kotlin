package lesson16

fun main() {
    var game = Gamer("Александр", 100, 30)
    game.damage(100)
    game.discern(10)
}

class Gamer(
    val name: String,
    private var health: Int,
    var impactForce: Int
) {

    fun damage(damage: Int) {
        health -= damage
        if (health <= 0) {
            death()
            impactForce = 0
        } else {
            println("Вы получили удар, ваше здоровье стало $health")
        }
    }

    fun discern(treatment: Int) {
        if (health <= 0) {
            println("Вас вылечить невозможно!")
        } else {
            health += treatment
            println("Ваше здоровье после лечения $health")
        }
    }

    private fun death() {
        println("Ваше здоровье: $health, Вы умерли")
    }
}