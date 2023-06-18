package lesson19

fun main() {
    val productDescription = ProductDescription("сарафан", 1232,ProductCategories.CLOTH)
    val productDescription1 = ProductDescription("ножницы", 2252,ProductCategories.STATIONERY)
    val productDescription2 = ProductDescription("тарелки", 3239,ProductCategories.MISCELLANEOUS)
    productDescription.displayProductInformation()
    println()
    productDescription1.displayProductInformation()
    println()
    productDescription2.displayProductInformation()
}

enum class ProductCategories {
    CLOTH,
    STATIONERY,
    MISCELLANEOUS,
}

fun printProductCategories(productCategories: ProductCategories) {
    when (productCategories) {
        ProductCategories.CLOTH -> println("Одежда")
        ProductCategories.STATIONERY -> println("Канцтовары")
        ProductCategories.MISCELLANEOUS -> println("Другое")
    }
}

class ProductDescription(
    val name: String,
    val id: Int,
    val category: ProductCategories,
) {
    fun displayProductInformation() {
        println(name)
        println(id)
        printProductCategories(category)
    }

}