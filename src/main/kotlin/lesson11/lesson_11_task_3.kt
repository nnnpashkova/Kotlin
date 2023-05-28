package lesson11

fun main() {
    val participantsRoom1 = ParticipantsRoom(
        cover = "футбольныйМяч.png",
        title = "Футболисты",
        users = listOf(
            User("cмайлУыбка.png", "Андрей", SpeakerStatus.MICROPHONE_ON),
            User("cмайлЗвезда.png", "Артем", SpeakerStatus.MUTED),
            User("cмайлТучка.png", "Данила", SpeakerStatus.TALKING),
        ),
    )

    val participantsRoom2 = ParticipantsRoom(
        cover = "волейбольныйМяч.png",
        title = "Волейболисты",
        users = listOf(
            User("смайлПанда.png", "Саша", SpeakerStatus.TALKING),
            User("cмайлУлыбка.png", "Артем", SpeakerStatus.MUTED),
            User("cмайлГоры.png", "Юра", SpeakerStatus.MICROPHONE_ON),
            User("cмайлСкалалаз.png", "Андей", SpeakerStatus.MICROPHONE_ON),
        ),
    )
}



