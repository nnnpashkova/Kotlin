package lesson13

fun main() {
    addingAnEntryToThePhonebook()
}

fun addingAnEntryToThePhonebook() {
    do {
        println("Введите имя:")
        val nameUser: String? = readln()
        val phoneNumber = addingPhoneNumber()
        println("Введите компанию:")
        val companyUser: String? = readln()
        println("Если хотите добавить новую запись, введите \\“да\\””")
        val addingNumber: String? = readln()
    } while (addingNumber == "да")
}

fun addingPhoneNumber(): Int {
    while (true) {
        println("Введите номер телефона:")
        val phoneUser: Int? = readln().toInt()
        if (phoneUser != null) {
            return phoneUser
        }
    }
}