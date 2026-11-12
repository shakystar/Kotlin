fun main() {
  try {
    val order = OrderBuilder(
      productName = "키보드",
      quantity = 2,
      address = "서울"
    )
      .giftWrap(true)
      .request("문 앞에 놓아주세요")
      .build()

    println(order.productName)
    println(order.giftWrap)
    println(order.request)
  } catch (e: IllegalArgumentException) {
    println("주문 실패 : ${e.message}")
  }
}