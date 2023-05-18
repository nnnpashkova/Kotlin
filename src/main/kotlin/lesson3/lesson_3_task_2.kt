package lesson3

fun main(){
    val surnameMaiden = "Андреева"
    val name = "Татьяна"
    val middleName = "Сергеевна"
    val age = 20
    var dataOnTheChangeOfSurname = "$surnameMaiden $name $middleName, $age"

    println(dataOnTheChangeOfSurname)

    val surnameModified = "Сидорова"
    val ageChangeOfSurname = 22
    dataOnTheChangeOfSurname = "$surnameModified $name $middleName, $ageChangeOfSurname"
    println(dataOnTheChangeOfSurname)
}