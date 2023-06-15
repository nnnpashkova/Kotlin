package lesson19

fun main() {
    val filingData = mutableListOf<Human>()
    println("Введите имя с большой буквы, укажите пол: мужской или женский")
    for (i in 0 until 5) {
        val userName = readln()
        val userGender = readln()
        filingData.add(
            Human(
                name = userName,
                gender = if (userGender == "женский") {
                    Gender.FEMALE
                } else if (userGender == "мужской") {
                    Gender.MALE
                } else {
                    println("Пол введен неверно")
                }
            )
        )
    }
    filingData.forEach { println(it) }
}

data class Human(
    val name: String,
    val gender: Gender,
)

enum class Gender {
    MALE,
    FEMALE,
}