package lesson20

fun main() {
    val outputText: (String) -> String = { "C наступающим новым годом, $it" }
    println(outputText.invoke(("Ирина")))
}



