package lesson19

fun main() {
    val productDescription = ProductDescription("сарафан", 1232,ProductCategories.CLOTH,)
    productDescription.displayProductInformation()
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