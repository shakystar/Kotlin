package structural.facade

import structural.facade.inventory.InventoryService
import structural.facade.order.OrderFacade
import structural.facade.payment.PaymentService
import structural.facade.shipping.ShippingService

fun main() {
  val orderFacade = OrderFacade (
    inventory = InventoryService(),
    payment = PaymentService(),
    shipping = ShippingService()
  )

  try {
    orderFacade.placeOrder(
      productId = "KEYBOARD-001",
      quantity = 2,
      amount = 100000,
      address = "서울"
    )

    println("주문 처리가 완료되었습니다.")
  } catch (e: IllegalArgumentException) {
    println("주문 요청 실패: ${e.message}")
  }
}