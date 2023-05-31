package lesson13

fun main() {
    addingAnEntryToThePhonebook()
}

private class Phonebook(
    val name: String?,
    val phoneNumber: Long?,
    val company: String?,
) {
    fun printPhonebook() {
        println("Имя: $name")
        println("Номер телефона: $phoneNumber")
        println("Компания: $company")
    }
}

fun addingAnEntryToThePhonebook() {
    do {
        println("Введите имя:")
        val nameUser: String = readln()
        val nameUserNull = if (nameUser.isEmpty()) {
            null
        } else {
            nameUser
        }
        val phoneNumber: Long = addingPhoneNumber()
        println("Введите компанию:")
        val companyUser: String = readln()
        val companyUserNull = if (companyUser.isEmpty()) {
            null
        } else {
            companyUser
        }

        println("Если хотите добавить новую запись, введите \\“да\\””")
        val addingNumber: String = readln()

        val phonebook = Phonebook(
            name = nameUser,
            phoneNumber = phoneNumber,
            company = companyUserNull,
        )
        phonebook.printPhonebook()

    } while (addingNumber == "да")
}

fun addingPhoneNumber(): Long {
    while (true) {
        println("Введите номер телефона:")
        val phoneUser: Long? = readln().toLong()
        if (phoneUser != null) {
            return phoneUser
        }
    }
}