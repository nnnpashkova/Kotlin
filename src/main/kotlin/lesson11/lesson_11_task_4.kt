package lesson11


fun main() {
    val contact1 = Contact(
        avatar = "mouse.png",
        name = "Мария Машкова",
        phoneNumbers = listOf(
            PhoneNumber("8(999)999-42-42", PhoneType.CELLULAR),
            PhoneNumber("8(999)888-42-42", PhoneType.HOME)
        ),
        iCloud = "mariii1990@mail",
        closePeople = listOf(
            Contact(
                avatar = "bride.png",
                name = "жена",
                phoneNumbers = listOf(
                    PhoneNumber("8(788)777-40-18", PhoneType.CELLULAR),
                    PhoneNumber("8(434)222-42-42", PhoneType.HOME),
                ),
                iCloud = "mail@.ru",
                closePeople = emptyList(),
            ),
            Contact(
                avatar = "girlWithCrown.png",
                name = "подруга",
                phoneNumbers = listOf(
                    PhoneNumber("8(234)777-15-58", PhoneType.CELLULAR),
                    PhoneNumber("8(899)111-11-42", PhoneType.HOME),
                ),
                iCloud = "mail@liss.ru",
                closePeople = emptyList(),
            ),
            Contact(
                avatar = "brunetteGirl.png",
                name = "подруга",
                phoneNumbers = listOf(
                    PhoneNumber("8(222)555-15-58", PhoneType.CELLULAR),
                    PhoneNumber("8(899)111-11-42", PhoneType.HOME),
                ),
                iCloud = "mail@girl.ru",
                closePeople = emptyList(),
            )
        )
    )
}

class Contact(
    val avatar: String,
    val name: String,
    val phoneNumbers: List<PhoneNumber>,
    val iCloud: String,
    val closePeople: List<Contact>,
) {
    fun toWriteAMessage() {

    }

    fun call() {
    }

    fun videoСall() {
    }

    fun sendMail() {

    }

}

class PhoneNumber(
    number: String,
    phoneType: PhoneType,
)

enum class PhoneType { HOME, CELLULAR, }