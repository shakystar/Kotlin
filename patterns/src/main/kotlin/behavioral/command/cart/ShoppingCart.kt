package behavioral.command.cart

class ShoppingCart {
  private val quantities = mutableMapOf<String, Int>()

  fun quantityOf(product: String): Int {
    return quantities[product] ?: 0
  }

  fun addOne(product: String) {
    quantities[product] = quantityOf(product) + 1
  }

  fun removeOne(product: String) {
    val quantity = quantityOf(product)
    check(quantity > 0) { "장바구니에 ${product} 상품이 없습니다."}

    if (quantity == 1) {
      quantities.remove(product)
    } else {
      quantities[product] = quantity - 1
    }
  }
}