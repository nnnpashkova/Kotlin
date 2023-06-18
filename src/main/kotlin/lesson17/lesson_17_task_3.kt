package lesson17

fun main() {
    val folders = Folders( true, 20)
    println("Папка: ${folders.name}, количество файлов: ${folders.numberFiles}")
}

class Folders(
    flag: Boolean,
    numberFiles: Int,
) {
    var flag = flag
    var numberFiles = numberFiles
        get() = if (flag) {
            0
        } else {
            field
        }
    var name = "фотографии"
        get() = if (flag) {
            "скрытая папка"
        } else {
            field
        }
}




