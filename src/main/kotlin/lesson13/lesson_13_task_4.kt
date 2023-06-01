package lesson13

fun main() {
    createPhonebook().forEach {
        println(it.name)
        println(it.company)
        println(it.phoneNumber)
    }
}

private class Phonebook(
    val name: String?,
    val phoneNumber: Long?,
    val company: String?,
)

private fun createPhonebook(): List<Phonebook> {
    val phonebookList = mutableListOf<Phonebook>()
    do {
        println("Введите имя:")
        val nameUser: String = readln()
        val nameUserNull = if (nameUser.isEmpty()) {
            null
        } else {
            nameUser
        }
        println("Введите номер телефона:")
        val phoneUser: Long? = try {
            readln().toLong()
        } catch (n: NumberFormatException) {
            null
        }
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
            name = nameUserNull,
            phoneNumber = phoneUser,
            company = companyUserNull,
        )

        if (phoneUser != null) {
            phonebookList.add(phonebook)
        }
    } while (addingNumber.equals("да"))
    return phonebookList
}
