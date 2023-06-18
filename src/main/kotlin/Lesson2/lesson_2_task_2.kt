package Lesson2

fun main(){
    val worker = 50
    val salaryWorker = 30000
    val probationer = 30
    val salaryProbationer = 20000

    val expensesWorker = worker*salaryWorker
    println(expensesWorker)

    val generalExpenses = expensesWorker+(probationer*salaryProbationer)
    println(generalExpenses)

    val averageSalary = generalExpenses/(worker+probationer)
    println(averageSalary)
}