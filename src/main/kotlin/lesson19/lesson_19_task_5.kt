package lesson19


fun main() {
    val filingData = mutableListOf<Human>()
    println("Введите имя с большой буквы, укажите пол: мужской или женский")
    for (i in 0 until 5) {
        val userName = readln()
        val userGender = when (readln()) {
            "женский" -> {
                Gender.FEMALE
            }

            "мужской" -> {
                Gender.MALE
            }

            else -> {
                println("Пол введен неверно")
                null
            }
        }

        if (userGender != null) {
            filingData.add(
                Human(
                    name = userName,
                    gender = userGender
                )
            )
        }
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