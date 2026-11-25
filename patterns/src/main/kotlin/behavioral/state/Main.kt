package behavioral.state

import behavioral.state.order.Order
import behavioral.state.state.ShippingState

fun main() {
  val order = Order()
  val shippingOrder = Order(ShippingState)

  println("=== 결제 대기 주문을 두 번 취소 ===")
  order.cancel()
  order.cancel()

  println()
  println("=== 배송 중인 주문을 취소 ===")
  shippingOrder.cancel()
}