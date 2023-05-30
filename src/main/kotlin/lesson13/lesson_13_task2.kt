package lesson13

fun main() {
    val phonebook = Phonebook(
        name = "Сергей",
        phoneNumber = 89185140494,
        company = null,
    )
    phonebook.printPhonebook()
}

private class Phonebook(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {
    fun printPhonebook() {
        val companyNull: String = company ?: "не указано"
        println("Имя: $name")
        println("Номер телефона: $phoneNumber")
        println("Компания: $companyNull")
    }
}