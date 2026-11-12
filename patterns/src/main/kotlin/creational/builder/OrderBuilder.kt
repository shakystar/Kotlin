class OrderBuilder(
  private val productName: String,
  private val quantity: Int,
  private val address: String
) {
  private var giftWrap: Boolean = false
  private var request: String = ""

  fun giftWrap(enabled: Boolean): OrderBuilder {
    giftWrap = enabled
    return this
  }

  fun request(message: String): OrderBuilder {
    request = message
    return this
  }

  fun build(): Order {
    return Order(
      productName = productName,
      quantity = quantity,
      address = address,
      giftWrap = giftWrap,
      request = request
    )
  }
}