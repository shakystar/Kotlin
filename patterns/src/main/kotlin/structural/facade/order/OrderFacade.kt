package structural.facade.order

import structural.facade.inventory.InventoryService
import structural.facade.payment.PaymentService
import structural.facade.shipping.ShippingService

class OrderFacade(
  private val inventory: InventoryService,
  private val payment: PaymentService,
  private val shipping: ShippingService
) {
  fun placeOrder(
    productId: String,
    quantity: Int,
    amount: Int,
    address: String
  ) {
    inventory.checkStock(productId, quantity)
    payment.pay(amount)
    shipping.requestDelivery(address)
  }
}