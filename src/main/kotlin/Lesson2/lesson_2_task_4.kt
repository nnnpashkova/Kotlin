package Lesson2

fun main(){
    val buffPercent = 0.2
    val crystalline = 7
    val iron = 11
    val crystallineBuff = (crystalline * buffPercent).toInt()
    println(crystallineBuff)
    val ironBuff = (iron * buffPercent).toInt()
    println(ironBuff)
}
