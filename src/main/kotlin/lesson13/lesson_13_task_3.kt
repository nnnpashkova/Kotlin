package lesson13

    fun main() {
        val phonebook = Phonebook(
           name = "Сергей",
            phoneNumber = 89185140494,
            company = null
        )

        val phonebook1 = Phonebook(
            name = "Игорь",
            phoneNumber = null,
            company = "ОАО РЖД"
        )

        val phonebook2 = Phonebook(
            name = null,
            phoneNumber = 89885041846,
            company = "ОАО ЮГ СТРОЙ"
        )

        //val contactList= listOf<Phonebook>( phonebook, phonebook1, phonebook2)

        phonebook.printPhonebook()
        println()
        phonebook1.printPhonebook()
        println()
        phonebook2.printPhonebook()
    }

    private class Phonebook(
        val name: String?,
        val phoneNumber: Long?,
        val company: String?,
    ) {
        fun printPhonebook() {
            val companyNull: String = company?: "не указано"
            val phoneNumberNull: Comparable<*> = phoneNumber?: "не указано"
            val nameNull: String = name?: "не указано"
            println("Имя: $nameNull")
            println("Номер телефона: $phoneNumberNull")
            println("Компания: $companyNull")
        }
    }



