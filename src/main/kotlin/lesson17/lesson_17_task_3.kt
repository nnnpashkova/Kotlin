package lesson17

fun main() {
    val folders = Folders()
    folders.flag = true
    println("Папка: ${folders.name}, количество файлов: ${folders.numberFiles}")
}

class Folders() {
    var flag = true
    var numberFiles = 20
        get():Int {
            return if (flag) {
                0
            } else {
                field
            }
        }
    var name = "фотографии"
        get():String {
            return if (flag) {
                "скрытая папка"
            } else {
                field
            }
        }
}

