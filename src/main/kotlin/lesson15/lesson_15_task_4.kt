package lesson15

fun main() {
    val tools = Tools("гитара", 5)

    val accessories = Accessories("струны", 10)
    tools.search()
    accessories.search()
}

abstract class Product(
    val name: String,
    val quantity: Int
)

interface Searchable {
    fun search()
}

class Tools(
    name: String,
    quantity: Int
) : Product(name, quantity), Searchable {
    override fun search() {
        println("Выполняется поиск, категория: инструменты, название: $name")
    }
}

class Accessories(
    name: String,
    quantity: Int
) : Product(name, quantity), Searchable {
    override fun search() {
        println("Выполняется поиск, категория: комплектующие, название: $name")
    }
}