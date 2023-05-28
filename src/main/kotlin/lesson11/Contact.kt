package lesson11

import com.sun.org.apache.bcel.internal.generic.ICONST

class Contact(
    val avatar: String,
    val name: String,
    val phoneNumbers: List<PhoneNumber>,
    val iCloud: String,
    val closePeople: List<Contact>
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