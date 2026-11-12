class Order(
  val productName: String,
  val quantity: Int,
  val address: String,
  val giftWrap: Boolean = false,
  val request: String = ""
) {
  init {
    require(productName.isNotBlank()) {
      "상품명은 비어 있을 수 없어요."
    }

    require(quantity > 0) {
      "수량은 1개 이상이어야 해요."
    }

    require(address.isNotBlank()) {
      "배송지는 비어 있을 수 없어요."
    }
  }
}