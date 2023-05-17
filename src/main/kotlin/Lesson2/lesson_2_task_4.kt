package Lesson2

fun main(){
    val buffPercent = 0.2
    val crystalline = 7
    val iron = 11
    val crystallineBuff = (crystalline * buffPercent).toInt()
    val crystallineWithBuff = crystallineBuff + crystalline
    println(crystallineWithBuff)
    val ironBuff = (iron * buffPercent).toInt()
    val ironWithBuff = ironBuff + iron
    println(ironWithBuff)
}
