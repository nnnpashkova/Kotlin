package lesson2
fun main(){
    val depositAmount = 70000
    val interestRate = 16.7
    val depositPeriod = 20
    val finalDepositAmount = depositAmount * (1 + interestRate / 100) * depositPeriod
    println(String.format("%.3f",finalDepositAmount))
}

